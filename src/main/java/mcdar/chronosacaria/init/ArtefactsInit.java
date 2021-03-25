package mcdar.chronosacaria.init;

import mcdar.chronosacaria.Mcdar;
import mcdar.chronosacaria.artefacts.BootsOfSwiftnessItem;
import mcdar.chronosacaria.artefacts.DeathCapMushroomItem;
import mcdar.chronosacaria.artefacts.GhostCloakItem;
import mcdar.chronosacaria.artefacts.LightFeatherItem;
import net.minecraft.item.Item;

public class ArtefactsInit {
    public static Item BOOTS_OF_SWIFTNESS;
    public static Item DEATH_CAP_MUSHROOM;
    public static Item GHOST_CLOAK;
    public static Item LIGHT_FEATHER;

    public static void init(){
        BOOTS_OF_SWIFTNESS = new BootsOfSwiftnessItem(new Item.Settings().group(Mcdar.ARTEFACTS),"boots_of_swiftness");
        DEATH_CAP_MUSHROOM = new DeathCapMushroomItem(new Item.Settings().group(Mcdar.ARTEFACTS), "death_cap_mushroom");
        GHOST_CLOAK = new GhostCloakItem(new Item.Settings().group(Mcdar.ARTEFACTS), "ghost_cloak");
        LIGHT_FEATHER = new LightFeatherItem(new Item.Settings().group(Mcdar.ARTEFACTS),"light_feather");
    }
}
