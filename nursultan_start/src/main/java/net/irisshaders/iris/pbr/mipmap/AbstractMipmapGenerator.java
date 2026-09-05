/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class08280
 */
package net.irisshaders.iris.pbr.mipmap;

import minecraft.class08280;
import net.irisshaders.iris.pbr.mipmap.CustomMipmapGenerator;

public abstract class AbstractMipmapGenerator
implements CustomMipmapGenerator {
    public abstract int blend(int var1, int var2, int var3, int var4);

    @Override
    public class08280[] generateMipLevels(class08280[] class08280Array, int n) {
        if (n + 1 <= class08280Array.length) {
            return class08280Array;
        }
        class08280[] class08280Array2 = new class08280[n + 1];
        if (n > 0) {
            for (int i = 1; i <= n; ++i) {
                class08280 class082802 = i == 1 ? class08280Array[0] : class08280Array2[i - 1];
                class08280 class082803 = new class08280(class082802.N() >> 1, class082802.y() >> 1, false);
                int n2 = class082803.N();
                int n3 = class082803.y();
                for (int j = 0; j < n2; ++j) {
                    for (int k = 0; k < n3; ++k) {
                        class082803.y(j, k, this.blend(class082802.N(j * 2, k * 2), class082802.N(j * 2 + 1, k * 2), class082802.N(j * 2, k * 2 + 1), class082802.N(j * 2 + 1, k * 2 + 1)));
                    }
                }
                class08280Array2[i] = class082803;
            }
        }
        class08280Array2[0] = class08280Array[0];
        return class08280Array2;
    }
}

