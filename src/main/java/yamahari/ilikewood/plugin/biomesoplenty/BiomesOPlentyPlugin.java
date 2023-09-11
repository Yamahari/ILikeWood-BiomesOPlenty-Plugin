package yamahari.ilikewood.plugin.biomesoplenty;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import yamahari.ilikewood.ILikeWoodPlugin;
import yamahari.ilikewood.IModPlugin;
import yamahari.ilikewood.plugin.biomesoplenty.util.Constants;
import yamahari.ilikewood.registry.IWoodenObjectRegistry;
import yamahari.ilikewood.registry.IWoodenTieredItemRegistry;
import yamahari.ilikewood.registry.objecttype.WoodenBlockType;
import yamahari.ilikewood.registry.objecttype.WoodenEntityType;
import yamahari.ilikewood.registry.objecttype.WoodenItemType;
import yamahari.ilikewood.registry.resource.IWoodenResourceRegistry;
import yamahari.ilikewood.registry.woodenitemtier.IWoodenItemTierRegistry;
import yamahari.ilikewood.registry.woodtype.IWoodTypeRegistry;

@ILikeWoodPlugin
public final class BiomesOPlentyPlugin implements IModPlugin {
    public static IWoodenObjectRegistry<Block, WoodenBlockType> BLOCK_REGISTRY;
    public static IWoodenObjectRegistry<Item, WoodenItemType> ITEM_REGISTRY;
    public static IWoodenObjectRegistry<Item, WoodenBlockType> BLOCK_ITEM_REGISTRY;
    public static IWoodenTieredItemRegistry TIERED_ITEM_REGISTRY;
    public static IWoodenObjectRegistry<EntityType<?>, WoodenEntityType> ENTITY_TYPES;

    @Override
    public String getModId() {
        return Constants.BOP_MOD_ID;
    }

    @Override
    public String getPluginModId() {
        return Constants.MOD_ID;
    }

    @Override
    public void registerWoodTypes(final IWoodTypeRegistry registry) {
        BiomesOPlentyWoodTypes.get().forEach(registry::register);
    }

    @Override
    public void registerWoodenItemTiers(final IWoodenItemTierRegistry registry) {
        BiomesOPlentyWoodenItemTiers.get().forEach(registry::register);
    }

    @Override
    public void registerWoodenResources(final IWoodenResourceRegistry registry) {
        BiomesOPlentyWoodTypes.get().forEach(woodType -> {
            registry.registerPlanksResource(woodType, BiomesOPlentyWoodenResources.PLANKS.get(woodType));
            registry.registerLogResource(woodType, BiomesOPlentyWoodenResources.LOGS.get(woodType));
            registry.registerStrippedLogResource(woodType, BiomesOPlentyWoodenResources.STRIPPED_LOGS.get(woodType));
            registry.registerSlabResource(woodType, BiomesOPlentyWoodenResources.SLABS.get(woodType));
        });
    }

    @Override
    public void acceptBlockRegistry(final IWoodenObjectRegistry<Block, WoodenBlockType> registry) {
        BLOCK_REGISTRY = registry;
    }

    @Override
    public void acceptItemRegistry(final IWoodenObjectRegistry<Item, WoodenItemType> registry) {
        ITEM_REGISTRY = registry;
    }

    @Override
    public void acceptBlockItemRegistry(final IWoodenObjectRegistry<Item, WoodenBlockType> registry) {
        BLOCK_ITEM_REGISTRY = registry;
    }

    @Override
    public void acceptEntityTypeRegistry(final IWoodenObjectRegistry<EntityType<?>, WoodenEntityType> registry) {
        ENTITY_TYPES = registry;
    }

    @Override
    public void acceptTieredItemRegistry(final IWoodenTieredItemRegistry registry) {
        TIERED_ITEM_REGISTRY = registry;
    }
}
