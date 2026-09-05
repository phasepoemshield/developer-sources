/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.voicechat.concentus;

class Arrays {
    Arrays() {
    }

    static void MemSet(byte[] byArray, byte by, int n) {
        java.util.Arrays.fill(byArray, 0, n, by);
    }

    static void MemSet(float[] fArray, float f) {
        java.util.Arrays.fill(fArray, f);
    }

    static void MemSet(int[] nArray, int n) {
        java.util.Arrays.fill(nArray, n);
    }

    static void MemSet(short[] sArray, short s) {
        java.util.Arrays.fill(sArray, s);
    }

    static void MemSet(short[] sArray, short s, int n) {
        java.util.Arrays.fill(sArray, 0, n, s);
    }

    static void MemSet(int[] nArray, int n, int n2) {
        java.util.Arrays.fill(nArray, 0, n2, n);
    }

    static void MemSet(float[] fArray, float f, int n) {
        java.util.Arrays.fill(fArray, 0, n, f);
    }

    static void MemSet(byte[] byArray, byte by) {
        java.util.Arrays.fill(byArray, by);
    }

    static void MemMove(int[] nArray, int n, int n2, int n3) {
        System.arraycopy(nArray, n, nArray, n2, n3);
    }

    static void MemMove(byte[] byArray, int n, int n2, int n3) {
        System.arraycopy(byArray, n, byArray, n2, n3);
    }

    static void MemMove(short[] sArray, int n, int n2, int n3) {
        System.arraycopy(sArray, n, sArray, n2, n3);
    }

    static void MemSetWithOffset(byte[] byArray, byte by, int n, int n2) {
        java.util.Arrays.fill(byArray, n, n + n2, by);
    }

    static void MemSetWithOffset(short[] sArray, short s, int n, int n2) {
        java.util.Arrays.fill(sArray, n, n + n2, s);
    }

    static void MemSetWithOffset(int[] nArray, int n, int n2, int n3) {
        java.util.Arrays.fill(nArray, n2, n2 + n3, n);
    }

    static int[][] InitTwoDimensionalArrayInt(int n, int n2) {
        return new int[n][n2];
    }

    static short[][] InitTwoDimensionalArrayShort(int n, int n2) {
        return new short[n][n2];
    }

    static byte[][][] InitThreeDimensionalArrayByte(int n, int n2, int n3) {
        return new byte[n][n2][n3];
    }

    static float[][] InitTwoDimensionalArrayFloat(int n, int n2) {
        return new float[n][n2];
    }

    static byte[][] InitTwoDimensionalArrayByte(int n, int n2) {
        return new byte[n][n2];
    }
}

