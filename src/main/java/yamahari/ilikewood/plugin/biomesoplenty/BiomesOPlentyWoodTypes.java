package yamahari.ilikewood.plugin.biomesoplenty;

import yamahari.ilikewood.plugin.util.Constants;
import yamahari.ilikewood.plugin.util.WoodType;
import yamahari.ilikewood.registry.woodtype.IWoodType;

import java.util.stream.Stream;

public final class BiomesOPlentyWoodTypes {
    public static final IWoodType CHERRY = new WoodType(Constants.CHERRY);
    public static final IWoodType DEAD = new WoodType(Constants.DEAD);
    public static final IWoodType FIR = new WoodType(Constants.FIR);
    public static final IWoodType HELLBARK = new WoodType(Constants.HELLBARK);
    public static final IWoodType JACARANDA = new WoodType(Constants.JACARANDA);
    public static final IWoodType MAGIC = new WoodType(Constants.MAGIC);
    public static final IWoodType MAHOGANY = new WoodType(Constants.MAHOGANY);
    public static final IWoodType PALM = new WoodType(Constants.PALM);
    public static final IWoodType REDWOOD = new WoodType(Constants.REDWOOD);
    public static final IWoodType UMBRAN = new WoodType(Constants.UMBRAN);
    public static final IWoodType WILLOW = new WoodType(Constants.WILLOW);

    private BiomesOPlentyWoodTypes() {
    }

    public static Stream<IWoodType> get() {
        return Stream.of(BiomesOPlentyWoodTypes.CHERRY, BiomesOPlentyWoodTypes.DEAD, BiomesOPlentyWoodTypes.FIR,
                BiomesOPlentyWoodTypes.HELLBARK, BiomesOPlentyWoodTypes.JACARANDA, BiomesOPlentyWoodTypes.MAGIC,
                BiomesOPlentyWoodTypes.MAHOGANY, BiomesOPlentyWoodTypes.PALM, BiomesOPlentyWoodTypes.REDWOOD,
                BiomesOPlentyWoodTypes.UMBRAN, BiomesOPlentyWoodTypes.WILLOW);
    }
}
