/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01391
 *  minecraft.class01407
 *  minecraft.class07311
 *  minecraft.class08743
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.renderer.v1.render.BlockVertexConsumerProvider
 */
package net.fabricmc.fabric.impl.renderer;

import java.util.function.Function;
import minecraft.class01391;
import minecraft.class01407;
import minecraft.class07311;
import minecraft.class08743;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.render.BlockVertexConsumerProvider;

@Environment(value=EnvType.CLIENT)
public class DelegatingBlockVertexConsumerProviderImpl
implements BlockVertexConsumerProvider {
    public class01407 vertexConsumerProvider;
    public Function<class08743, class07311> renderLayerFunction;

    public class01391 getBuffer(class08743 class087432) {
        return this.vertexConsumerProvider.method_73477(this.renderLayerFunction.apply(class087432));
    }
}

