/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class01296
 *  minecraft.class01384
 *  minecraft.class01391
 *  minecraft.class01421
 *  minecraft.class05474
 *  minecraft.class06069
 *  minecraft.class06889
 *  minecraft.class07074
 *  minecraft.class07080
 *  minecraft.class07209
 *  minecraft.class07295
 *  minecraft.class07331
 *  minecraft.class07878
 *  minecraft.class08743
 *  minecraft.class08887
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.impl.client.indigo.renderer.render;

import java.util.function.Function;
import minecraft.class00500;
import minecraft.class01296;
import minecraft.class01384;
import minecraft.class01391;
import minecraft.class01421;
import minecraft.class05474;
import minecraft.class06069;
import minecraft.class06889;
import minecraft.class07074;
import minecraft.class07080;
import minecraft.class07209;
import minecraft.class07295;
import minecraft.class07331;
import minecraft.class07878;
import minecraft.class08743;
import minecraft.class08887;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.client.indigo.renderer.render.AbstractTerrainRenderContext;
import net.fabricmc.fabric.impl.client.indigo.renderer.render.BlockRenderInfo;
import net.fabricmc.fabric.impl.client.indigo.renderer.render.LightDataProvider;
import net.fabricmc.fabric.impl.client.indigo.renderer.render.TerrainRenderContext$LightDataCache;

@Environment(value=EnvType.CLIENT)
public class TerrainRenderContext
extends AbstractTerrainRenderContext {
    public static final ThreadLocal<TerrainRenderContext> POOL = ThreadLocal.withInitial(TerrainRenderContext::new);
    private class01421 matrixStack;
    private class06069 random;
    private Function<class08743, class07331> bufferFunc;

    public void prepare(class07295 class072952, class07209 class072092, class01421 class014212, class06069 class060692, Function<class08743, class07331> function) {
        this.blockInfo.prepareForWorld(class072952, true);
        ((TerrainRenderContext$LightDataCache)this.lightDataProvider).prepare(class072092);
        this.matrixStack = class014212;
        this.random = class060692;
        this.bufferFunc = function;
    }

    public TerrainRenderContext() {
        this.overlay = class01384.u;
    }

    public void release() {
        this.matrices = null;
        this.matrixStack = null;
        this.random = null;
        this.bufferFunc = null;
        this.blockInfo.release();
    }

    @Override
    protected LightDataProvider createLightDataProvider(BlockRenderInfo blockRenderInfo) {
        return new TerrainRenderContext$LightDataCache(blockRenderInfo);
    }

    @Override
    protected class01391 getVertexConsumer(class08743 class087432) {
        return (class01391)this.bufferFunc.apply(class087432);
    }

    public void bufferModel(class08887 class088872, class00500 class005002, class07209 class072092) {
        this.matrixStack.N();
        try {
            this.matrixStack.N((float)class01296.y((int)class072092.method_10263()), (float)class01296.y((int)class072092.method_10264()), (float)class01296.y((int)class072092.method_10260()));
            class06889 class068892 = class005002.N(class072092);
            this.matrixStack.N(class068892.M, class068892.B, class068892.Z);
            this.matrices = this.matrixStack.L();
            this.random.N(class005002.y(class072092));
            this.prepare(class072092, class005002);
            class088872.emitQuads(this.getEmitter(), this.blockInfo.blockView, class072092, class005002, this.random, this.blockInfo::shouldCullSide);
        }
        catch (Throwable throwable) {
            class07080 class070802 = class07080.N((Throwable)throwable, (String)"Tessellating block in world - Indigo Renderer");
            class07074 class070742 = class070802.N("Block being tessellated");
            class07074.N((class07074)class070742, (class05474)this.blockInfo.blockView, (class07209)class072092, (class00500)class005002);
            throw new class07878(class070802);
        }
        finally {
            this.matrixStack.y();
        }
    }
}

