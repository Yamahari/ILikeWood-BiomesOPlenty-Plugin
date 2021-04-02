package yamahari.ilikewood.plugin.biomesoplenty;

import net.minecraft.item.crafting.Ingredient;
import yamahari.ilikewood.plugin.util.Constants;
import yamahari.ilikewood.plugin.util.WoodenItemTier;
import yamahari.ilikewood.registry.WoodenBlocks;
import yamahari.ilikewood.registry.woodenitemtier.IWoodenItemTier;
import yamahari.ilikewood.util.objecttype.WoodenObjectTypes;

public final class BiomesOPlentyWoodenItemTiers {
    public static final IWoodenItemTier CHERRY = new WoodenItemTier(BiomesOPlentyWoodTypes.CHERRY,
        Constants.CHERRY,
        () -> Ingredient.fromItems(WoodenBlocks.getBlock(WoodenObjectTypes.PANELS, BiomesOPlentyWoodTypes.CHERRY)));
    public static final IWoodenItemTier DEAD = new WoodenItemTier(BiomesOPlentyWoodTypes.DEAD,
        Constants.DEAD,
        () -> Ingredient.fromItems(WoodenBlocks.getBlock(WoodenObjectTypes.PANELS, BiomesOPlentyWoodTypes.DEAD)));
    public static final IWoodenItemTier FIR = new WoodenItemTier(BiomesOPlentyWoodTypes.FIR,
        Constants.FIR,
        () -> Ingredient.fromItems(WoodenBlocks.getBlock(WoodenObjectTypes.PANELS, BiomesOPlentyWoodTypes.FIR)));
    public static final IWoodenItemTier HELLBARK = new WoodenItemTier(BiomesOPlentyWoodTypes.HELLBARK,
        Constants.HELLBARK,
        () -> Ingredient.fromItems(WoodenBlocks.getBlock(WoodenObjectTypes.PANELS, BiomesOPlentyWoodTypes.HELLBARK)));
    public static final IWoodenItemTier JACARANDA = new WoodenItemTier(BiomesOPlentyWoodTypes.JACARANDA,
        Constants.JACARANDA,
        () -> Ingredient.fromItems(WoodenBlocks.getBlock(WoodenObjectTypes.PANELS, BiomesOPlentyWoodTypes.JACARANDA)));
    public static final IWoodenItemTier MAGIC = new WoodenItemTier(BiomesOPlentyWoodTypes.MAGIC,
        Constants.MAGIC,
        () -> Ingredient.fromItems(WoodenBlocks.getBlock(WoodenObjectTypes.PANELS, BiomesOPlentyWoodTypes.MAGIC)));
    public static final IWoodenItemTier MAHOGANY = new WoodenItemTier(BiomesOPlentyWoodTypes.MAHOGANY,
        Constants.MAHOGANY,
        () -> Ingredient.fromItems(WoodenBlocks.getBlock(WoodenObjectTypes.PANELS, BiomesOPlentyWoodTypes.MAHOGANY)));
    public static final IWoodenItemTier PALM = new WoodenItemTier(BiomesOPlentyWoodTypes.PALM,
        Constants.PALM,
        () -> Ingredient.fromItems(WoodenBlocks.getBlock(WoodenObjectTypes.PANELS, BiomesOPlentyWoodTypes.PALM)));
    public static final IWoodenItemTier REDWOOD = new WoodenItemTier(BiomesOPlentyWoodTypes.REDWOOD,
        Constants.REDWOOD,
        () -> Ingredient.fromItems(WoodenBlocks.getBlock(WoodenObjectTypes.PANELS, BiomesOPlentyWoodTypes.REDWOOD)));
    public static final IWoodenItemTier UMBRAN = new WoodenItemTier(BiomesOPlentyWoodTypes.UMBRAN,
        Constants.UMBRAN,
        () -> Ingredient.fromItems(WoodenBlocks.getBlock(WoodenObjectTypes.PANELS, BiomesOPlentyWoodTypes.UMBRAN)));
    public static final IWoodenItemTier WILLOW = new WoodenItemTier(BiomesOPlentyWoodTypes.WILLOW,
        Constants.WILLOW,
        () -> Ingredient.fromItems(WoodenBlocks.getBlock(WoodenObjectTypes.PANELS, BiomesOPlentyWoodTypes.WILLOW)));

    private BiomesOPlentyWoodenItemTiers() {
    }
}
