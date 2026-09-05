/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07209
 *  minecraft.class07295
 */
package net.caffeinemc.mods.sodium.client.model.light.data;

import java.util.Arrays;
import minecraft.class07209;
import minecraft.class07295;
import net.caffeinemc.mods.sodium.client.model.light.data.LightDataAccess;

public class SingleBlockLightDataCache
extends LightDataAccess {
    private static final int NEIGHBOR_BLOCK_RADIUS = 2;
    private static final int BLOCK_LENGTH = 5;
    private final int[] light = new int[125];
    private int xOffset;
    private int yOffset;
    private int zOffset;

    private int index(int n, int n2, int n3) {
        int n4 = n - this.xOffset;
        int n5 = n2 - this.yOffset;
        int n6 = n3 - this.zOffset;
        return n6 * 5 * 5 + n5 * 5 + n4;
    }

    public void reset(class07209 class072092, class07295 class072952) {
        this.xOffset = class072092.method_10263() - 2;
        this.yOffset = class072092.method_10264() - 2;
        this.zOffset = class072092.method_10260() - 2;
        Arrays.fill(this.light, 0);
        this.level = class072952;
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

    public void release() {
        this.level = null;
    }
}

