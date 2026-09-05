/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class01391
 *  minecraft.class01421
 *  minecraft.class05474
 *  minecraft.class06069
 *  minecraft.class06889
 *  minecraft.class07074
 *  minecraft.class07080
 *  minecraft.class07209
 *  minecraft.class07295
 *  minecraft.class07878
 *  minecraft.class08743
 *  minecraft.class08887
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.renderer.v1.render.BlockVertexConsumerProvider
 */
package net.fabricmc.fabric.impl.client.indigo.renderer.render;

import minecraft.class00500;
import minecraft.class01391;
import minecraft.class01421;
import minecraft.class05474;
import minecraft.class06069;
import minecraft.class06889;
import minecraft.class07074;
import minecraft.class07080;
import minecraft.class07209;
import minecraft.class07295;
import minecraft.class07878;
import minecraft.class08743;
import minecraft.class08887;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.render.BlockVertexConsumerProvider;
import net.fabricmc.fabric.impl.client.indigo.renderer.render.AbstractTerrainRenderContext;
import net.fabricmc.fabric.impl.client.indigo.renderer.render.BlockRenderInfo;
import net.fabricmc.fabric.impl.client.indigo.renderer.render.LightDataProvider;
import net.fabricmc.fabric.impl.client.indigo.renderer.render.TerrainLikeRenderContext$1;

@Environment(value=EnvType.CLIENT)
public class TerrainLikeRenderContext
extends AbstractTerrainRenderContext {
    public static final ThreadLocal<TerrainLikeRenderContext> POOL = ThreadLocal.withInitial(TerrainLikeRenderContext::new);
    private final class06069 random = class06069.R();
    private BlockVertexConsumerProvider vertexConsumers;

    @Override
    protected LightDataProvider createLightDataProvider(BlockRenderInfo blockRenderInfo) {
        return new TerrainLikeRenderContext$1(this, blockRenderInfo);
    }

    @Override
    protected class01391 getVertexConsumer(class08743 class087432) {
        return this.vertexConsumers.getBuffer(class087432);
    }

    public void bufferModel(class07295 class072952, class08887 class088872, class00500 class005002, class07209 class072092, class01421 class014212, BlockVertexConsumerProvider blockVertexConsumerProvider, boolean bl, long l, int n) {
        try {
            class06889 class068892 = class005002.N(class072092);
            class014212.N(class068892.M, class068892.B, class068892.Z);
            this.matrices = class014212.L();
            this.overlay = n;
            this.vertexConsumers = blockVertexConsumerProvider;
            this.blockInfo.prepareForWorld(class072952, bl);
            this.random.N(l);
            this.prepare(class072092, class005002);
            class088872.emitQuads(this.getEmitter(), class072952, class072092, class005002, this.random, this.blockInfo::shouldCullSide);
        }
        catch (Throwable throwable) {
            class07080 class070802 = class07080.N((Throwable)throwable, (String)"Tessellating block model - Indigo Renderer");
            class07074 class070742 = class070802.N("Block model being tessellated");
            class07074.N((class07074)class070742, (class05474)class072952, (class07209)class072092, (class00500)class005002);
            throw new class07878(class070802);
        }
        finally {
            this.blockInfo.release();
            this.matrices = null;
            this.vertexConsumers = null;
        }
    }
}

