package yamahari.ilikewood.plugin.biomesoplenty;

import yamahari.ilikewood.plugin.biomesoplenty.util.Constants;
import yamahari.ilikewood.registry.woodtype.DefaultWoodType;
import yamahari.ilikewood.registry.woodtype.IWoodType;

import java.util.stream.Stream;

public final class BiomesOPlentyWoodTypes {
    public static final IWoodType CHERRY = makeWoodType(Constants.CHERRY);
    public static final IWoodType DEAD = makeWoodType(Constants.DEAD);
    public static final IWoodType FIR = makeWoodType(Constants.FIR);
    public static final IWoodType HELLBARK = makeWoodType(Constants.HELLBARK);
    public static final IWoodType JACARANDA = makeWoodType(Constants.JACARANDA);
    public static final IWoodType MAGIC = makeWoodType(Constants.MAGIC);
    public static final IWoodType MAHOGANY = makeWoodType(Constants.MAHOGANY);
    public static final IWoodType PALM = makeWoodType(Constants.PALM);
    public static final IWoodType REDWOOD = makeWoodType(Constants.REDWOOD);
    public static final IWoodType UMBRAN = makeWoodType(Constants.UMBRAN);
    public static final IWoodType WILLOW = makeWoodType(Constants.WILLOW);

    private BiomesOPlentyWoodTypes() {
    }

    private static IWoodType makeWoodType(final String name) {
        return new DefaultWoodType(Constants.BOP_MOD_ID, name);
    }

    public static Stream<IWoodType> get() {
        return Stream.of(BiomesOPlentyWoodTypes.CHERRY,
            BiomesOPlentyWoodTypes.DEAD,
            BiomesOPlentyWoodTypes.FIR,
            BiomesOPlentyWoodTypes.HELLBARK,
            BiomesOPlentyWoodTypes.JACARANDA,
            BiomesOPlentyWoodTypes.MAGIC,
            BiomesOPlentyWoodTypes.MAHOGANY,
            BiomesOPlentyWoodTypes.PALM,
            BiomesOPlentyWoodTypes.REDWOOD,
            BiomesOPlentyWoodTypes.UMBRAN,
            BiomesOPlentyWoodTypes.WILLOW);
    }
}
