/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.world.biome;

public class LevelBiomeSlice$BiasMap {
    private final short[] data = new short[5184];

    public void set(int n, int n2, int n3, int n4) {
        this.data[n * 3 + 0] = (short)n2;
        this.data[n * 3 + 1] = (short)n3;
        this.data[n * 3 + 2] = (short)n4;
    }

    public int getY(int n) {
        return this.data[n * 3 + 1];
    }

    public int getX(int n) {
        return this.data[n * 3 + 0];
    }

    public int getZ(int n) {
        return this.data[n * 3 + 2];
    }
}

