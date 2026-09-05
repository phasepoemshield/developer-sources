/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07211
 */
package net.caffeinemc.mods.sodium.client.render.chunk.occlusion;

import minecraft.class07211;

public class GraphDirection {
    public static final int DOWN = 0;
    public static final int UP = 1;
    public static final int NORTH = 2;
    public static final int SOUTH = 3;
    public static final int WEST = 4;
    public static final int EAST = 5;
    public static final int COUNT = 6;
    private static final class07211[] ENUMS;
    private static final int[] OPPOSITE;
    private static final int[] X;
    private static final int[] Y;
    private static final int[] Z;

    static {
        OPPOSITE = new int[6];
        GraphDirection.OPPOSITE[0] = 1;
        GraphDirection.OPPOSITE[1] = 0;
        GraphDirection.OPPOSITE[2] = 3;
        GraphDirection.OPPOSITE[3] = 2;
        GraphDirection.OPPOSITE[4] = 5;
        GraphDirection.OPPOSITE[5] = 4;
        X = new int[6];
        GraphDirection.X[4] = -1;
        GraphDirection.X[5] = 1;
        Y = new int[6];
        GraphDirection.Y[0] = -1;
        GraphDirection.Y[1] = 1;
        Z = new int[6];
        GraphDirection.Z[2] = -1;
        GraphDirection.Z[3] = 1;
        ENUMS = new class07211[6];
        GraphDirection.ENUMS[0] = class07211.field_11033;
        GraphDirection.ENUMS[1] = class07211.field_11036;
        GraphDirection.ENUMS[2] = class07211.field_11043;
        GraphDirection.ENUMS[3] = class07211.field_11035;
        GraphDirection.ENUMS[4] = class07211.field_11039;
        GraphDirection.ENUMS[5] = class07211.field_11034;
    }

    public static int x(int n) {
        return X[n];
    }

    public static int z(int n) {
        return Z[n];
    }

    public static int y(int n) {
        return Y[n];
    }

    public static int opposite(int n) {
        return OPPOSITE[n];
    }

    public static class07211 toEnum(int n) {
        return ENUMS[n];
    }
}

