package yamahari.ilikewood.plugin.biomesoplenty;

import com.google.common.collect.ImmutableMap;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.client.model.generators.ModelProvider;
import yamahari.ilikewood.plugin.biomesoplenty.util.Constants;
import yamahari.ilikewood.plugin.biomesoplenty.util.Util;
import yamahari.ilikewood.plugin.biomesoplenty.util.resources.WoodenLogResource;
import yamahari.ilikewood.plugin.biomesoplenty.util.resources.WoodenPlanksResource;
import yamahari.ilikewood.plugin.biomesoplenty.util.resources.WoodenSlabResource;
import yamahari.ilikewood.plugin.biomesoplenty.util.resources.WoodenStrippedLogResource;
import yamahari.ilikewood.registry.resource.resources.IWoodenLogResource;
import yamahari.ilikewood.registry.resource.resources.IWoodenPlanksResource;
import yamahari.ilikewood.registry.resource.resources.IWoodenSlabResource;
import yamahari.ilikewood.registry.resource.resources.IWoodenStrippedLogResource;
import yamahari.ilikewood.registry.woodtype.IWoodType;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class BiomesOPlentyWoodenResources {
    public static final Map<IWoodType, IWoodenPlanksResource> PLANKS;
    public static final Map<IWoodType, IWoodenLogResource> LOGS;
    public static final Map<IWoodType, IWoodenStrippedLogResource> STRIPPED_LOGS;
    public static final Map<IWoodType, IWoodenSlabResource> SLABS;

    private static final Map<IWoodType, BlockBehaviour.Properties> PLANKS_PROPERTIES =
        new ImmutableMap.Builder<IWoodType, BlockBehaviour.Properties>()
            .put(BiomesOPlentyWoodTypes.CHERRY,
                BlockBehaviour.Properties
                    .of(Material.WOOD, MaterialColor.COLOR_RED)
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD))
            .put(BiomesOPlentyWoodTypes.DEAD,
                BlockBehaviour.Properties
                    .of(Material.WOOD, MaterialColor.STONE)
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD))
            .put(BiomesOPlentyWoodTypes.FIR,
                BlockBehaviour.Properties
                    .of(Material.WOOD, MaterialColor.TERRACOTTA_WHITE)
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD))
            .put(BiomesOPlentyWoodTypes.HELLBARK,
                BlockBehaviour.Properties
                    .of(Material.WOOD, MaterialColor.TERRACOTTA_GRAY)
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD))
            .put(BiomesOPlentyWoodTypes.JACARANDA,
                BlockBehaviour.Properties
                    .of(Material.WOOD, MaterialColor.TERRACOTTA_WHITE)
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD))
            .put(BiomesOPlentyWoodTypes.MAGIC,
                BlockBehaviour.Properties
                    .of(Material.WOOD, MaterialColor.COLOR_BLUE)
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD))
            .put(BiomesOPlentyWoodTypes.MAHOGANY,
                BlockBehaviour.Properties
                    .of(Material.WOOD, MaterialColor.TERRACOTTA_PINK)
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD))
            .put(BiomesOPlentyWoodTypes.PALM,
                BlockBehaviour.Properties
                    .of(Material.WOOD, MaterialColor.TERRACOTTA_YELLOW)
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD))
            .put(BiomesOPlentyWoodTypes.REDWOOD,
                BlockBehaviour.Properties
                    .of(Material.WOOD, MaterialColor.TERRACOTTA_ORANGE)
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD))
            .put(BiomesOPlentyWoodTypes.UMBRAN,
                BlockBehaviour.Properties
                    .of(Material.WOOD, MaterialColor.TERRACOTTA_BLUE)
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD))
            .put(BiomesOPlentyWoodTypes.WILLOW,
                BlockBehaviour.Properties
                    .of(Material.WOOD, MaterialColor.TERRACOTTA_LIGHT_GREEN)
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD))
            .build();

    static {
        final Map<IWoodType, IWoodenPlanksResource> planks = new HashMap<>();
        final Map<IWoodType, IWoodenLogResource> logs = new HashMap<>();
        final Map<IWoodType, IWoodenStrippedLogResource> strippedLogs = new HashMap<>();
        final Map<IWoodType, IWoodenSlabResource> slabs = new HashMap<>();

        BiomesOPlentyWoodTypes.get().forEach(woodType -> {
            final ResourceLocation planksResource =
                new ResourceLocation(Constants.BOP_MOD_ID, Util.toRegistryName(woodType.getName(), "planks"));
            final ResourceLocation logResource =
                new ResourceLocation(Constants.BOP_MOD_ID, Util.toRegistryName(woodType.getName(), "log"));
            final ResourceLocation strippedLogResource =
                new ResourceLocation(Constants.BOP_MOD_ID, Util.toRegistryName("stripped", woodType.getName(), "log"));
            final ResourceLocation slabResource =
                new ResourceLocation(Constants.BOP_MOD_ID, Util.toRegistryName(woodType.getName(), "slab"));

            final ResourceLocation planksTexture = new ResourceLocation(planksResource.getNamespace(),
                Util.toPath(ModelProvider.BLOCK_FOLDER, planksResource.getPath()));

            planks.put(woodType,
                new WoodenPlanksResource(planksTexture, planksResource, PLANKS_PROPERTIES.get(woodType)));

            logs.put(woodType,
                new WoodenLogResource(new ResourceLocation(logResource.getNamespace(),
                    Util.toPath(ModelProvider.BLOCK_FOLDER, Util.toRegistryName(logResource.getPath(), "top"))),
                    new ResourceLocation(logResource.getNamespace(),
                        Util.toPath(ModelProvider.BLOCK_FOLDER, logResource.getPath())),
                    logResource));

            strippedLogs.put(woodType,
                new WoodenStrippedLogResource(new ResourceLocation(strippedLogResource.getNamespace(),
                    Util.toPath(ModelProvider.BLOCK_FOLDER, Util.toRegistryName(strippedLogResource.getPath(), "top"))),
                    new ResourceLocation(strippedLogResource.getNamespace(),
                        Util.toPath(ModelProvider.BLOCK_FOLDER, strippedLogResource.getPath())),
                    strippedLogResource));

            slabs.put(woodType, new WoodenSlabResource(planksTexture, planksTexture, planksTexture, slabResource));
        });

        PLANKS = Collections.unmodifiableMap(planks);
        LOGS = Collections.unmodifiableMap(logs);
        STRIPPED_LOGS = Collections.unmodifiableMap(strippedLogs);
        SLABS = Collections.unmodifiableMap(slabs);
    }

    private BiomesOPlentyWoodenResources() {
    }
}
