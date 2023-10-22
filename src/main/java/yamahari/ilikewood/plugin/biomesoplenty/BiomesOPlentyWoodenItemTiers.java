package yamahari.ilikewood.plugin.biomesoplenty;

import net.minecraft.world.item.crafting.Ingredient;
import yamahari.ilikewood.plugin.biomesoplenty.util.Constants;
import yamahari.ilikewood.registry.objecttype.WoodenBlockType;
import yamahari.ilikewood.registry.woodenitemtier.DefaultWoodenItemTier;
import yamahari.ilikewood.registry.woodenitemtier.IWoodenItemTier;
import yamahari.ilikewood.registry.woodtype.IWoodType;

public final class BiomesOPlentyWoodenItemTiers {
    public static final IWoodenItemTier DEAD = makeItemTier(BiomesOPlentyWoodTypes.DEAD, Constants.DEAD);
    public static final IWoodenItemTier FIR = makeItemTier(BiomesOPlentyWoodTypes.FIR, Constants.FIR);
    public static final IWoodenItemTier HELLBARK = makeItemTier(BiomesOPlentyWoodTypes.HELLBARK, Constants.HELLBARK);
    public static final IWoodenItemTier JACARANDA = makeItemTier(BiomesOPlentyWoodTypes.JACARANDA, Constants.JACARANDA);
    public static final IWoodenItemTier MAGIC = makeItemTier(BiomesOPlentyWoodTypes.MAGIC, Constants.MAGIC);
    public static final IWoodenItemTier MAHOGANY = makeItemTier(BiomesOPlentyWoodTypes.MAHOGANY, Constants.MAHOGANY);
    public static final IWoodenItemTier PALM = makeItemTier(BiomesOPlentyWoodTypes.PALM, Constants.PALM);
    public static final IWoodenItemTier REDWOOD = makeItemTier(BiomesOPlentyWoodTypes.REDWOOD, Constants.REDWOOD);
    public static final IWoodenItemTier UMBRAN = makeItemTier(BiomesOPlentyWoodTypes.UMBRAN, Constants.UMBRAN);
    public static final IWoodenItemTier WILLOW = makeItemTier(BiomesOPlentyWoodTypes.WILLOW, Constants.WILLOW);

    private BiomesOPlentyWoodenItemTiers() {
    }

    private static IWoodenItemTier makeItemTier(final IWoodType woodType, final String name) {
        return new DefaultWoodenItemTier(woodType,
            Constants.BOP_MOD_ID,
            name,
            () -> Ingredient.of(BiomesOPlentyPlugin.BLOCK_REGISTRY.getObject(woodType, WoodenBlockType.PANELS)));
    }
}
