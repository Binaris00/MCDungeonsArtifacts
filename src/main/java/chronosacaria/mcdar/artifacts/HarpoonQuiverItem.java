package chronosacaria.mcdar.artifacts;

import chronosacaria.mcdar.api.CleanlinessHelper;
import chronosacaria.mcdar.enchants.EnchantID;
import chronosacaria.mcdar.enums.QuiverArtifactID;
import chronosacaria.mcdar.registries.EnchantsRegistry;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import java.util.List;

public class HarpoonQuiverItem extends ArtifactQuiverItem{
    public HarpoonQuiverItem() {
        super(QuiverArtifactID.HARPOON_QUIVER);
    }

    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand){
        ItemStack itemStack = user.getStackInHand(hand);

        if (!user.isCreative())
            itemStack.damage(1, user, (entity) -> entity.sendToolBreakStatus(hand));

        int cooldownLevel = EnchantmentHelper.getEquipmentLevel(EnchantsRegistry.enchants.get(EnchantID.COOLDOWN),
                user);
        user.getItemCooldownManager().set(this, 600 * (cooldownLevel + 1));

        return new TypedActionResult<>(ActionResult.SUCCESS, itemStack);
    }

    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext tooltipContext){
        CleanlinessHelper.createLoreTTips(stack, tooltip);
    }
}
