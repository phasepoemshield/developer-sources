/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.schematic.CompositeSchematic
 *  baritone.api.schematic.ISchematic
 *  baritone.api.schematic.IStaticSchematic
 *  minecraft.class00500
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01894
 *  minecraft.class03529
 *  minecraft.class04206
 *  minecraft.class07001
 *  minecraft.class07741
 *  minecraft.class08092
 */
package baritone.utils.schematic.format.defaults;

import baritone.api.schematic.CompositeSchematic;
import baritone.api.schematic.ISchematic;
import baritone.api.schematic.IStaticSchematic;
import baritone.utils.schematic.StaticSchematic;
import baritone.utils.schematic.format.defaults.LitematicaSchematic$LitematicaBitArray;
import java.util.Collections;
import java.util.Optional;
import minecraft.class00500;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01894;
import minecraft.class03529;
import minecraft.class04206;
import minecraft.class07001;
import minecraft.class07741;
import minecraft.class08092;

public final class LitematicaSchematic
extends CompositeSchematic
implements IStaticSchematic {
    public LitematicaSchematic(class07001 class070012) {
        super(0, 0, 0);
        this.fillInSchematic(class070012);
    }

    public class00500 getDirect(int n, int n2, int n3) {
        return this.desiredState(n, n2, n3, null, Collections.emptyList());
    }

    private static class07001[] getRegions(class07001 class070012) {
        return class070012.W("Regions").map(class07001::B).map(collection -> (class07001[])collection.stream().filter(class077092 -> class077092 instanceof class07001).map(class07001.class::cast).toArray(class07001[]::new)).orElse(new class07001[0]);
    }

    private static long getVolume(class07001 class070012) {
        class07001 class070013 = class070012.W("Size").orElse(new class07001());
        return Math.abs(class070013.i("x").orElse(0) * class070013.i("y").orElse(0) * class070013.i("z").orElse(0));
    }

    private static class00500 getBlockState(class00891 class008912, class07001 class070012) {
        class00500 class005002 = class008912.W();
        for (String string : class070012.i()) {
            class08092 class080922 = class008912.E().N(string);
            String string2 = class070012.Z(string).orElse(null);
            if (class080922 == null) continue;
            class005002 = LitematicaSchematic.setPropertyValue(class005002, class080922, string2);
        }
        return class005002;
    }

    private void writeSubregionIntoSchematic(class07001 class070012, class00753 class007532, class00500[] class00500Array, LitematicaSchematic$LitematicaBitArray litematicaSchematic$LitematicaBitArray) {
        int n = LitematicaSchematic.getMinOfSubregion(class070012, "x") - class007532.method_10263();
        int n2 = LitematicaSchematic.getMinOfSubregion(class070012, "y") - class007532.method_10264();
        int n3 = LitematicaSchematic.getMinOfSubregion(class070012, "z") - class007532.method_10260();
        class07001 class070013 = class070012.W("Size").orElse(new class07001());
        int n4 = Math.abs(class070013.i("x").orElse(0));
        int n5 = Math.abs(class070013.i("y").orElse(0));
        int n6 = Math.abs(class070013.i("z").orElse(0));
        class00500[][][] class00500Array2 = new class00500[n4][n6][n5];
        int n7 = 0;
        for (int i = 0; i < n5; ++i) {
            for (int j = 0; j < n6; ++j) {
                for (int k = 0; k < n4; ++k) {
                    class00500Array2[k][j][i] = class00500Array[litematicaSchematic$LitematicaBitArray.getAt(n7)];
                    ++n7;
                }
            }
        }
        this.put((ISchematic)new StaticSchematic(class00500Array2), n, n2, n3);
    }

    private static int getBitsPerBlock(int n) {
        return (int)Math.max(2.0, Math.ceil(Math.log(n) / Math.log(2.0)));
    }

    private static <T extends Comparable<T>> class00500 setPropertyValue(class00500 class005002, class08092<T> class080922, String string) {
        Optional optional = class080922.y(string);
        if (optional.isPresent()) {
            return (class00500)class005002.y(class080922, (Comparable)optional.get());
        }
        throw new IllegalArgumentException("Invalid value for property " + String.valueOf(class080922));
    }

    private static class00500[] getBlockList(class07741 class077412) {
        class00500[] class00500Array = new class00500[class077412.size()];
        for (int i = 0; i < class077412.size(); ++i) {
            class07001 class070012 = (class07001)class077412.L(i);
            class01894 class018942 = class01894.L((String)class070012.Z("Name").orElse(""));
            class00891 class008912 = class018942 == null ? class00869.N : (class00891)class04206.i.L(class018942).map(class03529::N).orElse(class00869.N);
            class07001 class070013 = class070012.W("Properties").orElse(new class07001());
            class00500Array[i] = LitematicaSchematic.getBlockState(class008912, class070013);
        }
        return class00500Array;
    }

    private static int getMinOfSubregion(class07001 class070013, String string) {
        int n = class070013.W("Position").flatMap(class070012 -> class070012.i(string)).orElse(0);
        int n2 = class070013.W("Size").flatMap(class070012 -> class070012.i(string)).orElse(0);
        return Math.min(n, n + n2 + 1);
    }

    private void fillInSchematic(class07001 class070012) {
        class00753 class007532 = new class00753(LitematicaSchematic.getMinOfSchematic(class070012, "x"), LitematicaSchematic.getMinOfSchematic(class070012, "y"), LitematicaSchematic.getMinOfSchematic(class070012, "z"));
        for (class07001 class070013 : LitematicaSchematic.getRegions(class070012)) {
            class07741 class077412 = class070013.s("BlockStatePalette");
            class00500[] class00500Array = LitematicaSchematic.getBlockList(class077412);
            int n = LitematicaSchematic.getBitsPerBlock(class077412.size());
            long l = LitematicaSchematic.getVolume(class070013);
            long[] lArray = class070013.E("BlockStates").orElse(new long[0]);
            LitematicaSchematic$LitematicaBitArray litematicaSchematic$LitematicaBitArray = new LitematicaSchematic$LitematicaBitArray(n, l, lArray);
            this.writeSubregionIntoSchematic(class070013, class007532, class00500Array, litematicaSchematic$LitematicaBitArray);
        }
    }

    private static int getMinOfSchematic(class07001 class070012, String string) {
        int n = Integer.MAX_VALUE;
        for (class07001 class070013 : LitematicaSchematic.getRegions(class070012)) {
            n = Math.min(n, LitematicaSchematic.getMinOfSubregion(class070013, string));
        }
        return n;
    }
}

