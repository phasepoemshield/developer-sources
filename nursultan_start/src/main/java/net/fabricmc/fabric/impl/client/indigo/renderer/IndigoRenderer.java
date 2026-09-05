/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class01407
 *  minecraft.class01421
 *  minecraft.class01423
 *  minecraft.class01999
 *  minecraft.class02020
 *  minecraft.class06898
 *  minecraft.class07209
 *  minecraft.class07295
 *  minecraft.class08887
 *  minecraft.class08931
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.renderer.v1.Renderer
 *  net.fabricmc.fabric.api.renderer.v1.mesh.MutableMesh
 *  net.fabricmc.fabric.api.renderer.v1.mesh.QuadEmitter
 *  net.fabricmc.fabric.api.renderer.v1.render.BlockVertexConsumerProvider
 *  net.fabricmc.fabric.api.renderer.v1.render.FabricBlockModelRenderer
 *  net.fabricmc.fabric.api.renderer.v1.render.ItemRenderTypeGetter
 *  net.fabricmc.fabric.api.renderer.v1.render.RenderLayerHelper
 *  net.fabricmc.fabric.impl.client.indigo.renderer.mesh.MutableMeshImpl
 *  net.fabricmc.fabric.impl.client.indigo.renderer.render.SimpleBlockRenderContext
 *  net.fabricmc.fabric.impl.client.indigo.renderer.render.TerrainLikeRenderContext
 *  net.fabricmc.fabric.mixin.client.indigo.renderer.BlockRenderDispatcherAccessor
 */
package net.fabricmc.fabric.impl.client.indigo.renderer;

import minecraft.class00500;
import minecraft.class01407;
import minecraft.class01421;
import minecraft.class01423;
import minecraft.class01999;
import minecraft.class02020;
import minecraft.class06898;
import minecraft.class07209;
import minecraft.class07295;
import minecraft.class08887;
import minecraft.class08931;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.Renderer;
import net.fabricmc.fabric.api.renderer.v1.mesh.MutableMesh;
import net.fabricmc.fabric.api.renderer.v1.mesh.QuadEmitter;
import net.fabricmc.fabric.api.renderer.v1.render.BlockVertexConsumerProvider;
import net.fabricmc.fabric.api.renderer.v1.render.FabricBlockModelRenderer;
import net.fabricmc.fabric.api.renderer.v1.render.ItemRenderTypeGetter;
import net.fabricmc.fabric.api.renderer.v1.render.RenderLayerHelper;
import net.fabricmc.fabric.impl.client.indigo.renderer.accessor.AccessLayerRenderState;
import net.fabricmc.fabric.impl.client.indigo.renderer.mesh.MutableMeshImpl;
import net.fabricmc.fabric.impl.client.indigo.renderer.render.SimpleBlockRenderContext;
import net.fabricmc.fabric.impl.client.indigo.renderer.render.TerrainLikeRenderContext;
import net.fabricmc.fabric.mixin.client.indigo.renderer.BlockRenderDispatcherAccessor;

@Environment(value=EnvType.CLIENT)
public class IndigoRenderer
implements Renderer {
    public static final IndigoRenderer INSTANCE = new IndigoRenderer();

    private IndigoRenderer() {
    }

    public void render(class02020 class020202, class07295 class072952, class08887 class088872, class00500 class005002, class07209 class072092, class01421 class014212, BlockVertexConsumerProvider blockVertexConsumerProvider, boolean bl, long l, int n) {
        ((TerrainLikeRenderContext)TerrainLikeRenderContext.POOL.get()).bufferModel(class072952, class088872, class005002, class072092, class014212, blockVertexConsumerProvider, bl, l, n);
    }

    public void render(class01423 class014232, BlockVertexConsumerProvider blockVertexConsumerProvider, class08887 class088872, float f, float f2, float f3, int n, int n2, class07295 class072952, class07209 class072092, class00500 class005002) {
        ((SimpleBlockRenderContext)SimpleBlockRenderContext.POOL.get()).bufferModel(class014232, blockVertexConsumerProvider, class088872, f, f2, f3, n, n2, class072952, class072092, class005002);
    }

    public QuadEmitter getLayerRenderStateEmitter(class08931 class089312) {
        return ((AccessLayerRenderState)class089312).fabric_getMutableMesh().emitter();
    }

    public void renderBlockAsEntity(class01999 class019992, class00500 class005002, class01421 class014212, class01407 class014072, int n, int n2, class07295 class072952, class07209 class072092) {
        class06898 class068982 = class005002.b();
        if (class068982 != class06898.field_11455) {
            class08887 class088872 = class019992.N(class005002);
            int n3 = ((BlockRenderDispatcherAccessor)class019992).getBlockColors().N(class005002, null, null, 0);
            float f = (float)(n3 >> 16 & 0xFF) / 255.0f;
            float f2 = (float)(n3 >> 8 & 0xFF) / 255.0f;
            float f3 = (float)(n3 & 0xFF) / 255.0f;
            FabricBlockModelRenderer.render((class01423)class014212.L(), (BlockVertexConsumerProvider)RenderLayerHelper.entityDelegate((class01407)class014072), (class08887)class088872, (float)f, (float)f2, (float)f3, (int)n, (int)n2, (class07295)class072952, (class07209)class072092, (class00500)class005002);
        }
    }

    public void setLayerRenderTypeGetter(class08931 class089312, ItemRenderTypeGetter itemRenderTypeGetter) {
        ((AccessLayerRenderState)class089312).fabric_setRenderTypeGetter(itemRenderTypeGetter);
    }

    public MutableMesh mutableMesh() {
        return new MutableMeshImpl();
    }
}

