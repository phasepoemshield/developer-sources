/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  minecraft.class01407
 *  minecraft.class05911
 *  minecraft.class06851
 *  minecraft.class07311
 *  minecraft.class08743
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.api.renderer.v1.render;

import minecraft.class01407;
import minecraft.class05911;
import minecraft.class06851;
import minecraft.class07311;
import minecraft.class08743;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.render.BlockVertexConsumerProvider;

@Environment(value=EnvType.CLIENT)
public final class RenderLayerHelper {
    private RenderLayerHelper() {
    }

    public static BlockVertexConsumerProvider movingDelegate(class01407 class014072) {
        return class087432 -> class014072.method_73477(RenderLayerHelper.getMovingBlockLayer(class087432));
    }

    public static class07311 getMovingBlockLayer(class08743 class087432) {
        return switch (class087432) {
            default -> throw new MatchException(null, null);
            case class08743.field_60923 -> class06851.N();
            case class08743.field_60925 -> class06851.y();
            case class08743.field_60926 -> class06851.L();
            case class08743.field_60927 -> class06851.P();
        };
    }

    public static class07311 getEntityBlockLayer(class08743 class087432) {
        return class087432 == class08743.field_60926 ? class05911.U() : class05911.Z();
    }

    public static BlockVertexConsumerProvider entityDelegate(class01407 class014072) {
        return class087432 -> class014072.method_73477(RenderLayerHelper.getEntityBlockLayer(class087432));
    }
}

