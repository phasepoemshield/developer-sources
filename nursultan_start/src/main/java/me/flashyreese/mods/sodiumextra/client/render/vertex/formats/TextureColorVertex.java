/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.vertex.VertexFormat
 *  minecraft.class07835
 *  net.caffeinemc.mods.sodium.api.math.MatrixHelper
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.lwjgl.system.MemoryUtil
 */
package me.flashyreese.mods.sodiumextra.client.render.vertex.formats;

import com.mojang.blaze3d.vertex.VertexFormat;
import minecraft.class07835;
import net.caffeinemc.mods.sodium.api.math.MatrixHelper;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.lwjgl.system.MemoryUtil;

public class TextureColorVertex {
    public static final VertexFormat FORMAT = class07835.z;
    public static final int STRIDE = 24;
    private static final int OFFSET_POSITION = 0;
    private static final int OFFSET_TEXTURE = 12;
    private static final int OFFSET_COLOR = 20;

    public static void write(long l, Matrix4f matrix4f, float f, float f2, float f3, int n, float f4, float f5) {
        float f6 = MatrixHelper.transformPositionX((Matrix4fc)matrix4f, (float)f, (float)f2, (float)f3);
        float f7 = MatrixHelper.transformPositionY((Matrix4fc)matrix4f, (float)f, (float)f2, (float)f3);
        float f8 = MatrixHelper.transformPositionZ((Matrix4fc)matrix4f, (float)f, (float)f2, (float)f3);
        TextureColorVertex.write(l, f6, f7, f8, n, f4, f5);
    }

    public static void write(long l, float f, float f2, float f3, int n, float f4, float f5) {
        MemoryUtil.memPutFloat((long)(l + 0L), (float)f);
        MemoryUtil.memPutFloat((long)(l + 0L + 4L), (float)f2);
        MemoryUtil.memPutFloat((long)(l + 0L + 8L), (float)f3);
        MemoryUtil.memPutFloat((long)(l + 12L), (float)f4);
        MemoryUtil.memPutFloat((long)(l + 12L + 4L), (float)f5);
        MemoryUtil.memPutInt((long)(l + 20L), (int)n);
    }
}

