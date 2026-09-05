/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01296
 *  minecraft.class07209
 */
package net.caffeinemc.mods.lithium.common.util;

import minecraft.class01296;
import minecraft.class07209;

public class Distances {
    public static long getMinChunkToBlockDistanceL2Sq(class07209 class072092, int n, int n2) {
        int n3;
        int n4 = class01296.L((int)n);
        int n5 = class01296.L((int)n2);
        int n6 = class072092.method_10263() - n4;
        if (n6 > 0) {
            n6 = Math.max(0, n6 - 15);
        }
        if ((n3 = class072092.method_10260() - n5) > 0) {
            n3 = Math.max(0, n3 - 15);
        }
        return (long)n6 * (long)n6 + (long)n3 * (long)n3;
    }

    public static int getClosestBlockCoordInSection(int n, int n2) {
        int n3 = class01296.L((int)n2);
        return Math.min(Math.max(n, n3), n3 + 15);
    }

    public static long distanceSq(class07209 class072092, class07209 class072093) {
        long l = class072092.method_10263() - class072093.method_10263();
        long l2 = class072092.method_10264() - class072093.method_10264();
        long l3 = class072092.method_10260() - class072093.method_10260();
        return l * l + l2 * l2 + l3 * l3;
    }

    public static int distanceSqInt(class07209 class072092, class07209 class072093) {
        int n = class072092.method_10263() - class072093.method_10263();
        int n2 = class072092.method_10264() - class072093.method_10264();
        int n3 = class072092.method_10260() - class072093.method_10260();
        return Math.addExact(Math.addExact(Math.multiplyExact(n, n), Math.multiplyExact(n2, n2)), Math.multiplyExact(n3, n3));
    }

    public static boolean isWithinCubeRadius(class07209 class072092, int n, class07209 class072093) {
        return Math.abs(class072093.method_10263() - class072092.method_10263()) <= n && Math.abs(class072093.method_10260() - class072092.method_10260()) <= n;
    }

    public static boolean isWithinSphereRadius(class07209 class072092, long l, class07209 class072093) {
        return Distances.distanceSq(class072092, class072093) <= l;
    }

    public static long getMinSectionDistanceSq(class07209 class072092, int n, int n2, int n3) {
        int n4 = class072092.method_10263();
        int n5 = class072092.method_10264();
        int n6 = class072092.method_10260();
        long l = Distances.getClosestBlockCoordInSection(n4, n) - n4;
        long l2 = Distances.getClosestBlockCoordInSection(n5, n2) - n5;
        long l3 = Distances.getClosestBlockCoordInSection(n6, n3) - n6;
        return l * l + l2 * l2 + l3 * l3;
    }

    public static class07209 getClosestPosInChunk(class07209 class072092, int n, int n2) {
        int n3 = Distances.getClosestBlockCoordInSection(class072092.method_10263(), n);
        int n4 = Distances.getClosestBlockCoordInSection(class072092.method_10260(), n2);
        return new class07209(n3, class072092.method_10264(), n4);
    }
}

