/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class01421
 *  minecraft.class01423
 *  minecraft.class02020
 *  minecraft.class07209
 *  minecraft.class07295
 *  minecraft.class08887
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.renderer.v1.Renderer
 */
package net.fabricmc.fabric.api.renderer.v1.render;

import minecraft.class00500;
import minecraft.class01421;
import minecraft.class01423;
import minecraft.class02020;
import minecraft.class07209;
import minecraft.class07295;
import minecraft.class08887;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.Renderer;
import net.fabricmc.fabric.api.renderer.v1.render.BlockVertexConsumerProvider;

@Environment(value=EnvType.CLIENT)
public interface FabricBlockModelRenderer {
    default public void render(class07295 class072952, class08887 class088872, class00500 class005002, class07209 class072092, class01421 class014212, BlockVertexConsumerProvider blockVertexConsumerProvider, boolean bl, long l, int n) {
        Renderer.get().render((class02020)this, class072952, class088872, class005002, class072092, class014212, blockVertexConsumerProvider, bl, l, n);
    }

    public static void render(class01423 class014232, BlockVertexConsumerProvider blockVertexConsumerProvider, class08887 class088872, float f, float f2, float f3, int n, int n2, class07295 class072952, class07209 class072092, class00500 class005002) {
        Renderer.get().render(class014232, blockVertexConsumerProvider, class088872, f, f2, f3, n, n2, class072952, class072092, class005002);
    }
}

