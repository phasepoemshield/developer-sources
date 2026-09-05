/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.vertex.VertexFormat
 *  minecraft.class07835
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 */
package net.caffeinemc.mods.sodium.api.vertex.format.common;

import com.mojang.blaze3d.vertex.VertexFormat;
import minecraft.class07835;
import net.caffeinemc.mods.sodium.api.math.MatrixHelper;
import net.caffeinemc.mods.sodium.api.vertex.attributes.common.ColorAttribute;
import net.caffeinemc.mods.sodium.api.vertex.attributes.common.PositionAttribute;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;

public final class ColorVertex {
    public static final VertexFormat FORMAT = class07835.R;
    public static final int STRIDE = 16;
    private static final int OFFSET_POSITION = 0;
    private static final int OFFSET_COLOR = 12;

    public static void put(long l, Matrix4f matrix4f, float f, float f2, float f3, int n) {
        float f4 = MatrixHelper.transformPositionX((Matrix4fc)matrix4f, f, f2, f3);
        float f5 = MatrixHelper.transformPositionY((Matrix4fc)matrix4f, f, f2, f3);
        float f6 = MatrixHelper.transformPositionZ((Matrix4fc)matrix4f, f, f2, f3);
        ColorVertex.put(l, f4, f5, f6, n);
    }

    public static void put(long l, float f, float f2, float f3, int n) {
        PositionAttribute.put(l + 0L, f, f2, f3);
        ColorAttribute.set(l + 12L, n);
    }
}

