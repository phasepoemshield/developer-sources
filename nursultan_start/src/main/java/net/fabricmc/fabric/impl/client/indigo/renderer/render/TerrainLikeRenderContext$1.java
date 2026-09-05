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
class TerrainLikeRenderContext$1
implements LightDataProvider {
    final /* synthetic */ BlockRenderInfo val$blockInfo;

    @Override
    public int light(class07209 class072092, class00500 class005002) {
        return class03063.N((class03082)class03082.N, (class07295)this.val$blockInfo.blockView, (class00500)class005002, (class07209)class072092);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    TerrainLikeRenderContext$1() {
        void var2_-1;
        this.val$blockInfo = var2_-1;
    }

    @Override
    public float ao(class07209 class072092, class00500 class005002) {
        return AoLuminanceFix.INSTANCE.apply((class07290)this.val$blockInfo.blockView, class072092, class005002);
    }
}

