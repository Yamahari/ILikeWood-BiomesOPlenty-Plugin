package yamahari.ilikewood.plugin.util;

import com.google.common.collect.ImmutableMap;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import yamahari.ilikewood.registry.woodenitemtier.IWoodenItemTier;
import yamahari.ilikewood.registry.woodtype.IWoodType;
import yamahari.ilikewood.util.WoodenTieredObjectType;

import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public final class WoodenItemTier implements IWoodenItemTier {
    private static final Map<String, Float> DEFAULT_TIERED_ATTACK_SPEED =
        ImmutableMap.of(WoodenTieredObjectType.AXE.toString(),
            -3.2F,
            WoodenTieredObjectType.HOE.toString(),
            -3.0F,
            WoodenTieredObjectType.PICKAXE.toString(),
            -2.8F,
            WoodenTieredObjectType.SHOVEL.toString(),
            -3.0F,
            WoodenTieredObjectType.SWORD.toString(),
            -2.4F);

    private static final Map<String, Float> DEFAULT_TIERED_ATTACK_DAMAGE =
        ImmutableMap.of(WoodenTieredObjectType.AXE.toString(),
            6.0F,
            WoodenTieredObjectType.HOE.toString(),
            0.0F,
            WoodenTieredObjectType.PICKAXE.toString(),
            1.0F,
            WoodenTieredObjectType.SHOVEL.toString(),
            1.5F,
            WoodenTieredObjectType.SWORD.toString(),
            3.0F);

    private final IWoodType woodType;
    private final String name;
    private final LazyValue<Ingredient> repairMaterial;
    private final Map<WoodenTieredObjectType, Properties> properties;

    public WoodenItemTier(final IWoodType woodType, final String name, final Supplier<Ingredient> repairMaterial) {
        this.woodType = woodType;
        this.name = name;
        this.repairMaterial = new LazyValue<>(repairMaterial);

        final Map<WoodenTieredObjectType, Properties> properties = new EnumMap<>(WoodenTieredObjectType.class);
        for (final WoodenTieredObjectType tieredObjectType : WoodenTieredObjectType.values()) {
            final String type = tieredObjectType.toString();
            properties.put(tieredObjectType,
                new WoodenItemTier.Properties(DEFAULT_TIERED_ATTACK_SPEED.get(type),
                    DEFAULT_TIERED_ATTACK_DAMAGE.get(type),
                    200));
        }
        this.properties = Collections.unmodifiableMap(properties);

    }

    @Override
    public IWoodType getWoodType() {
        return this.woodType;
    }

    @Override
    public String getModId() {
        return Constants.BOP_MOD_ID;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public boolean isWood() {
        return true;
    }

    @Override
    public int getHarvestLevel() {
        return 0;
    }

    @Override
    public int getMaxUses() {
        return 59;
    }

    @Override
    public float getEfficiency() {
        return 2.0F;
    }

    @Override
    public float getAttackDamage() {
        return 0.0F;
    }

    @Override
    public int getEnchantability() {
        return 15;
    }

    public Ingredient getRepairMaterial() {
        return repairMaterial.getValue();
    }

    @Override
    public Properties getProperties(final WoodenTieredObjectType woodenTieredObjectType) {
        assert this.properties.containsKey(woodenTieredObjectType);
        return properties.get(woodenTieredObjectType);
    }
}
