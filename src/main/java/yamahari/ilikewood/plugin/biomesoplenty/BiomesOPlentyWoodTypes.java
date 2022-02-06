package yamahari.ilikewood.plugin.biomesoplenty;

import yamahari.ilikewood.plugin.biomesoplenty.util.Constants;
import yamahari.ilikewood.registry.woodtype.DefaultWoodType;
import yamahari.ilikewood.registry.woodtype.IWoodType;

import java.util.stream.Stream;

public final class BiomesOPlentyWoodTypes {
    public static final IWoodType CHERRY = makeWoodType(Constants.CHERRY, new int[]{
        color(79, 18, 17),
        color(96, 22, 21),
        color(115, 26, 24),
        color(119, 41, 32),
        color(125, 42, 34),
        color(132, 42, 37),
        color(139, 46, 44),
        color(146, 48, 44)});

    public static final IWoodType DEAD = makeWoodType(Constants.DEAD, new int[]{
        color(77, 72, 67),
        color(93, 88, 83),
        color(111, 105, 98),
        color(123, 117, 109),
        color(128, 122, 114),
        color(134, 128, 120),
        color(141, 134, 126),
        color(149, 142, 133)});

    public static final IWoodType FIR = makeWoodType(Constants.FIR, new int[]{
        color(99, 92, 75),
        color(119, 110, 90),
        color(139, 127, 104),
        color(150, 141, 116),
        color(157, 147, 121),
        color(163, 153, 127),
        color(170, 159, 134),
        color(179, 167, 140)});

    public static final IWoodType HELLBARK = makeWoodType(Constants.HELLBARK, new int[]{
        color(32, 25, 26),
        color(40, 30, 31),
        color(47, 36, 37),
        color(51, 41, 41),
        color(54, 43, 43),
        color(56, 45, 45),
        color(59, 48, 49),
        color(62, 50, 51)});

    public static final IWoodType JACARANDA = makeWoodType(Constants.JACARANDA, new int[]{
        color(112, 95, 89),
        color(138, 117, 110),
        color(164, 138, 130),
        color(179, 158, 147),
        color(188, 166, 155),
        color(197, 173, 162),
        color(207, 181, 172),
        color(219, 191, 181)});

    public static final IWoodType MAGIC = makeWoodType(Constants.MAGIC, new int[]{
        color(36, 60, 108),
        color(45, 75, 131),
        color(53, 89, 156),
        color(66, 94, 165),
        color(70, 101, 172),
        color(73, 107, 182),
        color(83, 122, 191),
        color(85, 124, 201)});

    public static final IWoodType MAHOGANY = makeWoodType(Constants.MAHOGANY, new int[]{
        color(108, 65, 64),
        color(133, 81, 79),
        color(157, 95, 94),
        color(169, 113, 107),
        color(178, 118, 113),
        color(186, 122, 118),
        color(195, 129, 128),
        color(207, 137, 135)});

    public static final IWoodType PALM = makeWoodType(Constants.PALM, new int[]{
        color(113, 75, 27),
        color(137, 92, 34),
        color(163, 108, 40),
        color(171, 126, 52),
        color(180, 131, 55),
        color(189, 136, 58),
        color(199, 140, 70),
        color(209, 148, 69)});

    public static final IWoodType REDWOOD = makeWoodType(Constants.REDWOOD, new int[]{
        color(94, 42, 22),
        color(114, 52, 28),
        color(135, 61, 33),
        color(142, 76, 43),
        color(150, 79, 46),
        color(157, 82, 48),
        color(165, 85, 58),
        color(173, 90, 57)});

    public static final IWoodType UMBRAN = makeWoodType(Constants.UMBRAN, new int[]{
        color(63, 52, 75),
        color(79, 64, 92),
        color(92, 75, 109),
        color(104, 86, 118),
        color(109, 91, 124),
        color(113, 95, 130),
        color(118, 101, 136),
        color(125, 106, 143)});

    public static final IWoodType WILLOW = makeWoodType(Constants.WILLOW, new int[]{
        color(84, 92, 65),
        color(102, 112, 80),
        color(121, 133, 95),
        color(131, 145, 108),
        color(138, 152, 113),
        color(144, 159, 118),
        color(156, 167, 127),
        color(162, 176, 132)});

    private BiomesOPlentyWoodTypes() {
    }

    private static int color(int r, int g, int b) {
        return 255 << 24 | (b & 255) << 16 | (g & 255) << 8 | (r & 255);
    }

    private static IWoodType makeWoodType(final String name, final int[] colors) {
        return new DefaultWoodType(Constants.BOP_MOD_ID, name, new IWoodType.Colors(colors));
    }

    public static Stream<IWoodType> get() {
        return Stream.of(BiomesOPlentyWoodTypes.CHERRY, BiomesOPlentyWoodTypes.DEAD, BiomesOPlentyWoodTypes.FIR,
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