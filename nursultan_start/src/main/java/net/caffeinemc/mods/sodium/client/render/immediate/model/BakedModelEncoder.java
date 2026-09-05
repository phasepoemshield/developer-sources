/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01423
 *  net.caffeinemc.mods.sodium.api.math.MatrixHelper
 *  net.caffeinemc.mods.sodium.api.util.ColorABGR
 *  net.caffeinemc.mods.sodium.api.util.ColorMixer
 *  net.caffeinemc.mods.sodium.api.vertex.buffer.VertexBufferWriter
 *  net.caffeinemc.mods.sodium.api.vertex.format.common.EntityVertex
 *  net.caffeinemc.mods.sodium.client.model.quad.ModelQuadView
 *  net.caffeinemc.mods.sodium.client.services.PlatformRuntimeInformation
 *  org.joml.Matrix3f
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.lwjgl.system.MemoryStack
 */
package net.caffeinemc.mods.sodium.client.render.immediate.model;

import minecraft.class01423;
import net.caffeinemc.mods.sodium.api.math.MatrixHelper;
import net.caffeinemc.mods.sodium.api.util.ColorABGR;
import net.caffeinemc.mods.sodium.api.util.ColorMixer;
import net.caffeinemc.mods.sodium.api.vertex.buffer.VertexBufferWriter;
import net.caffeinemc.mods.sodium.api.vertex.format.common.EntityVertex;
import net.caffeinemc.mods.sodium.client.model.quad.ModelQuadView;
import net.caffeinemc.mods.sodium.client.services.PlatformRuntimeInformation;
import org.joml.Matrix3f;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.lwjgl.system.MemoryStack;

public class BakedModelEncoder {
    private static final boolean MULTIPLY_ALPHA = PlatformRuntimeInformation.getInstance().usesAlphaMultiplication();

    public static void writeQuadVertices(VertexBufferWriter vertexBufferWriter, class01423 class014232, ModelQuadView modelQuadView, float f, float f2, float f3, float f4, float[] fArray, int[] nArray, int n) {
        Matrix3f matrix3f = class014232.y();
        Matrix4f matrix4f = class014232.N();
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            long l;
            long l2 = l = memoryStack.nmalloc(144);
            for (int i = 0; i < 4; ++i) {
                float f5 = modelQuadView.getX(i);
                float f6 = modelQuadView.getY(i);
                float f7 = modelQuadView.getZ(i);
                float f8 = MatrixHelper.transformPositionX((Matrix4fc)matrix4f, (float)f5, (float)f6, (float)f7);
                float f9 = MatrixHelper.transformPositionY((Matrix4fc)matrix4f, (float)f5, (float)f6, (float)f7);
                float f10 = MatrixHelper.transformPositionZ((Matrix4fc)matrix4f, (float)f5, (float)f6, (float)f7);
                int n2 = MatrixHelper.transformNormal((Matrix3f)matrix3f, (boolean)class014232.N, (int)modelQuadView.getAccurateNormal(i));
                float f11 = fArray[i];
                float f12 = f11 * f;
                float f13 = f11 * f2;
                float f14 = f11 * f3;
                float f15 = f4;
                int n3 = ColorABGR.pack((float)f12, (float)f13, (float)f14, (float)f15);
                int n4 = BakedModelEncoder.mergeLighting(modelQuadView.getMaxLightQuad(i), nArray[i]);
                EntityVertex.write((long)l2, (float)f8, (float)f9, (float)f10, (int)n3, (float)modelQuadView.getTexU(i), (float)modelQuadView.getTexV(i), (int)n, (int)n4, (int)n2);
                l2 += 36L;
            }
            vertexBufferWriter.push(memoryStack, l, 4, EntityVertex.FORMAT);
        }
    }

    public static void writeQuadVertices(VertexBufferWriter vertexBufferWriter, class01423 class014232, ModelQuadView modelQuadView, int n, int n2, int n3, boolean bl) {
        Matrix3f matrix3f = class014232.y();
        Matrix4f matrix4f = class014232.N();
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            long l;
            long l2 = l = memoryStack.nmalloc(144);
            for (int i = 0; i < 4; ++i) {
                float f = modelQuadView.getX(i);
                float f2 = modelQuadView.getY(i);
                float f3 = modelQuadView.getZ(i);
                int n4 = BakedModelEncoder.mergeLighting(modelQuadView.getMaxLightQuad(i), n2);
                int n5 = n;
                if (bl) {
                    n5 = ColorMixer.mulComponentWise((int)n5, (int)modelQuadView.getColor(i));
                }
                int n6 = MatrixHelper.transformNormal((Matrix3f)matrix3f, (boolean)class014232.N, (int)modelQuadView.getAccurateNormal(i));
                float f4 = MatrixHelper.transformPositionX((Matrix4fc)matrix4f, (float)f, (float)f2, (float)f3);
                float f5 = MatrixHelper.transformPositionY((Matrix4fc)matrix4f, (float)f, (float)f2, (float)f3);
                float f6 = MatrixHelper.transformPositionZ((Matrix4fc)matrix4f, (float)f, (float)f2, (float)f3);
                EntityVertex.write((long)l2, (float)f4, (float)f5, (float)f6, (int)n5, (float)modelQuadView.getTexU(i), (float)modelQuadView.getTexV(i), (int)n3, (int)n4, (int)n6);
                l2 += 36L;
            }
            vertexBufferWriter.push(memoryStack, l, 4, EntityVertex.FORMAT);
        }
    }

    private static int mergeLighting(int n, int n2) {
        if (n == 0) {
            return n2;
        }
        int n3 = Math.max(n & 0xFFFF, n2 & 0xFFFF);
        int n4 = Math.max(n >> 16 & 0xFFFF, n2 >> 16 & 0xFFFF);
        return n3 | n4 << 16;
    }

    public static boolean shouldMultiplyAlpha() {
        return MULTIPLY_ALPHA;
    }
}

