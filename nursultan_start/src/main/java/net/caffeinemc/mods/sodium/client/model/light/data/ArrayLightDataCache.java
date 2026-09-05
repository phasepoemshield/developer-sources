/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01296
 *  minecraft.class07295
 */
package net.caffeinemc.mods.sodium.client.model.light.data;

import java.util.Arrays;
import minecraft.class01296;
import minecraft.class07295;
import net.caffeinemc.mods.sodium.client.model.light.data.LightDataAccess;

public class ArrayLightDataCache
extends LightDataAccess {
    private static final int NEIGHBOR_BLOCK_RADIUS = 2;
    private static final int BLOCK_LENGTH = 20;
    private final int[] light;
    private int xOffset;
    private int yOffset;
    private int zOffset;

    private int index(int n, int n2, int n3) {
        int n4 = n - this.xOffset;
        int n5 = n2 - this.yOffset;
        int n6 = n3 - this.zOffset;
        return n6 * 20 * 20 + n5 * 20 + n4;
    }

    public ArrayLightDataCache(class07295 class072952) {
        this.level = class072952;
        this.light = new int[8000];
    }

    public void reset(class01296 class012962) {
        this.xOffset = class012962.u() - 2;
        this.yOffset = class012962.i() - 2;
        this.zOffset = class012962.R() - 2;
        Arrays.fill(this.light, 0);
    }

    @Override
    public int get(int n, int n2, int n3) {
        int n4 = this.index(n, n2, n3);
        int n5 = this.light[n4];
        if (n5 != 0) {
            return n5;
        }
        this.light[n4] = this.compute(n, n2, n3);
        return this.light[n4];
    }
}

