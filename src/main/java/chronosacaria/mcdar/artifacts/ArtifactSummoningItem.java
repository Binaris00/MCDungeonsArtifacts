package chronosacaria.mcdar.artifacts;

import chronosacaria.mcdar.config.McdarConfig;
import chronosacaria.mcdar.enums.SummoningArtifactID;
import chronosacaria.mcdar.registries.ItemGroupRegistry;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Rarity;

public class ArtifactSummoningItem extends Item {

    public final SummoningArtifactID id;

    public ArtifactSummoningItem(SummoningArtifactID id) {
        super(new Settings().maxCount(1).maxDamage(McdarConfig.CONFIG.getSummoningArtifactDurability()));
        this.id = id;
        ItemGroupEvents.modifyEntriesEvent(ItemGroupRegistry.ARTIFACTS).register(entries -> entries.add(this.getDefaultStack()));
    }

    public Rarity getRarity(ItemStack stack) {
        return Rarity.RARE;
    }
}
