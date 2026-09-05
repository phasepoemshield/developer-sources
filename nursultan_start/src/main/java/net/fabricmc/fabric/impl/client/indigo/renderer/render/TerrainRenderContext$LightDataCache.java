/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class03063
 *  minecraft.class03082
 *  minecraft.class07209
 *  minecraft.class07290
 *  minecraft.class07295
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.impl.client.indigo.renderer.aocalc.AoLuminanceFix
 */
package net.fabricmc.fabric.impl.client.indigo.renderer.render;

import java.util.Arrays;
import minecraft.class00500;
import minecraft.class03063;
import minecraft.class03082;
import minecraft.class07209;
import minecraft.class07290;
import minecraft.class07295;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.client.indigo.renderer.aocalc.AoLuminanceFix;
import net.fabricmc.fabric.impl.client.indigo.renderer.render.BlockRenderInfo;
import net.fabricmc.fabric.impl.client.indigo.renderer.render.LightDataProvider;

@Environment(value=EnvType.CLIENT)
class TerrainRenderContext$LightDataCache
implements LightDataProvider {
    private final int[] lightCache = new int[5832];
    private final float[] aoCache = new float[5832];
    private final BlockRenderInfo blockInfo;
    private class07209 sectionOrigin;
    private final class03082 lightGetter = (class072952, class072092) -> {
        int n = this.cacheIndex(class072092);
        if (n == -1) {
            return class03082.N.packedBrightness(class072952, class072092);
        }
        int n2 = this.lightCache[n];
        if (n2 == Integer.MAX_VALUE) {
            this.lightCache[n] = n2 = class03082.N.packedBrightness(class072952, class072092);
        }
        return n2;
    };

    public void prepare(class07209 class072092) {
        this.sectionOrigin = class072092;
        Arrays.fill(this.lightCache, Integer.MAX_VALUE);
        Arrays.fill(this.aoCache, Float.NaN);
    }

    private int cacheIndex(class07209 class072092) {
        int n = class072092.method_10263() - (this.sectionOrigin.method_10263() - 1);
        if (n < 0 || n >= 18) {
            return -1;
        }
        int n2 = class072092.method_10264() - (this.sectionOrigin.method_10264() - 1);
        if (n2 < 0 || n2 >= 18) {
            return -1;
        }
        int n3 = class072092.method_10260() - (this.sectionOrigin.method_10260() - 1);
        if (n3 < 0 || n3 >= 18) {
            return -1;
        }
        return n3 * 18 * 18 + n2 * 18 + n;
    }

    @Override
    public int light(class07209 class072092, class00500 class005002) {
        return class03063.N((class03082)this.lightGetter, (class07295)this.blockInfo.blockView, (class00500)class005002, (class07209)class072092);
    }

    TerrainRenderContext$LightDataCache(BlockRenderInfo blockRenderInfo) {
        this.blockInfo = blockRenderInfo;
    }

    @Override
    public float ao(class07209 class072092, class00500 class005002) {
        int n = this.cacheIndex(class072092);
        if (n == -1) {
            return AoLuminanceFix.INSTANCE.apply((class07290)this.blockInfo.blockView, class072092, class005002);
        }
        float f = this.aoCache[n];
        if (Float.isNaN(f)) {
            this.aoCache[n] = f = AoLuminanceFix.INSTANCE.apply((class07290)this.blockInfo.blockView, class072092, class005002);
        }
        return f;
    }
}

