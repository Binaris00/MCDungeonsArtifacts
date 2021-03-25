package mcdar.chronosacaria.artefacts;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Rarity;

public class ArtefactItem extends Item {
    public ArtefactItem(Settings settings) {
        super(settings.maxCount(1).maxDamage(64));
    }

    public Rarity getRarity (ItemStack stack){
        return Rarity.RARE;
    }
}
