/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01391
 *  net.caffeinemc.mods.sodium.api.math.MatrixHelper
 *  net.caffeinemc.mods.sodium.api.util.ColorARGB
 *  net.caffeinemc.mods.sodium.api.util.NormI8
 *  net.caffeinemc.mods.sodium.api.vertex.buffer.VertexBufferWriter
 *  net.caffeinemc.mods.sodium.api.vertex.format.common.EntityVertex
 *  org.joml.Math
 *  org.joml.Matrix3f
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.joml.Vector3f
 *  org.lwjgl.system.MemoryStack
 */
package net.caffeinemc.mods.sodium.client.render.model;

import minecraft.class01391;
import net.caffeinemc.mods.sodium.api.math.MatrixHelper;
import net.caffeinemc.mods.sodium.api.util.ColorARGB;
import net.caffeinemc.mods.sodium.api.util.NormI8;
import net.caffeinemc.mods.sodium.api.vertex.buffer.VertexBufferWriter;
import net.caffeinemc.mods.sodium.api.vertex.format.common.EntityVertex;
import net.caffeinemc.mods.sodium.client.render.model.MutableQuadViewImpl;
import net.caffeinemc.mods.sodium.client.render.vertex.VertexConsumerUtils;
import org.joml.Math;
import org.joml.Matrix3f;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Vector3f;
import org.lwjgl.system.MemoryStack;

public class QuadEncoder {
    public static void writeQuadVertices(MutableQuadViewImpl mutableQuadViewImpl, VertexBufferWriter vertexBufferWriter, int n, Matrix4f matrix4f, boolean bl, Matrix3f matrix3f) {
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            long l;
            long l2 = l = memoryStack.nmalloc(144);
            boolean bl2 = mutableQuadViewImpl.hasVertexNormals();
            int n2 = 0;
            if (bl2) {
                mutableQuadViewImpl.populateMissingNormals();
            } else {
                n2 = MatrixHelper.transformNormal((Matrix3f)matrix3f, (boolean)bl, (int)mutableQuadViewImpl.packedFaceNormal());
            }
            for (int i = 0; i < 4; ++i) {
                float f = mutableQuadViewImpl.getX(i);
                float f2 = mutableQuadViewImpl.getY(i);
                float f3 = mutableQuadViewImpl.getZ(i);
                float f4 = MatrixHelper.transformPositionX((Matrix4fc)matrix4f, (float)f, (float)f2, (float)f3);
                float f5 = MatrixHelper.transformPositionY((Matrix4fc)matrix4f, (float)f, (float)f2, (float)f3);
                float f6 = MatrixHelper.transformPositionZ((Matrix4fc)matrix4f, (float)f, (float)f2, (float)f3);
                if (bl2) {
                    n2 = MatrixHelper.transformNormal((Matrix3f)matrix3f, (boolean)bl, (int)mutableQuadViewImpl.packedNormal(i));
                }
                EntityVertex.write((long)l2, (float)f4, (float)f5, (float)f6, (int)ColorARGB.toABGR((int)mutableQuadViewImpl.baseColor(i)), (float)mutableQuadViewImpl.getTexU(i), (float)mutableQuadViewImpl.getTexV(i), (int)n, (int)mutableQuadViewImpl.getLight(i), (int)n2);
                l2 += 36L;
            }
            vertexBufferWriter.push(memoryStack, l, 4, EntityVertex.FORMAT);
        }
    }

    public static void writeQuadVertices(MutableQuadViewImpl mutableQuadViewImpl, class01391 class013912, int n, Matrix4f matrix4f, boolean bl, Matrix3f matrix3f) {
        VertexBufferWriter vertexBufferWriter = VertexConsumerUtils.convertOrLog(class013912);
        if (vertexBufferWriter != null) {
            QuadEncoder.writeQuadVertices(mutableQuadViewImpl, vertexBufferWriter, n, matrix4f, bl, matrix3f);
        } else {
            QuadEncoder.writeQuadVerticesSlow(mutableQuadViewImpl, class013912, n, matrix4f, bl, matrix3f);
        }
    }

    private static void writeQuadVerticesSlow(MutableQuadViewImpl mutableQuadViewImpl, class01391 class013912, int n, Matrix4f matrix4f, boolean bl, Matrix3f matrix3f) {
        float f;
        float f2;
        float f3;
        float f4;
        boolean bl2 = mutableQuadViewImpl.hasVertexNormals();
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        if (bl2) {
            mutableQuadViewImpl.populateMissingNormals();
        } else {
            Vector3f vector3f = mutableQuadViewImpl.faceNormal();
            f4 = vector3f.x;
            f3 = vector3f.y;
            f2 = vector3f.z;
            f5 = MatrixHelper.transformNormalX((Matrix3f)matrix3f, (float)f4, (float)f3, (float)f2);
            f6 = MatrixHelper.transformNormalY((Matrix3f)matrix3f, (float)f4, (float)f3, (float)f2);
            f7 = MatrixHelper.transformNormalZ((Matrix3f)matrix3f, (float)f4, (float)f3, (float)f2);
            if (!bl) {
                f = Math.invsqrt((float)Math.fma((float)f5, (float)f5, (float)Math.fma((float)f6, (float)f6, (float)(f7 * f7))));
                f5 *= f;
                f6 *= f;
                f7 *= f;
            }
        }
        for (int i = 0; i < 4; ++i) {
            f4 = mutableQuadViewImpl.getX(i);
            f3 = mutableQuadViewImpl.getY(i);
            f2 = mutableQuadViewImpl.getZ(i);
            f = MatrixHelper.transformPositionX((Matrix4fc)matrix4f, (float)f4, (float)f3, (float)f2);
            float f8 = MatrixHelper.transformPositionY((Matrix4fc)matrix4f, (float)f4, (float)f3, (float)f2);
            float f9 = MatrixHelper.transformPositionZ((Matrix4fc)matrix4f, (float)f4, (float)f3, (float)f2);
            class013912.method_22912(f, f8, f9);
            class013912.method_39415(mutableQuadViewImpl.baseColor(i));
            class013912.method_22913(mutableQuadViewImpl.getTexU(i), mutableQuadViewImpl.getTexV(i));
            class013912.method_22922(n);
            class013912.method_60803(mutableQuadViewImpl.getLight(i));
            if (bl2) {
                int n2 = mutableQuadViewImpl.packedNormal(i);
                float f10 = NormI8.unpackX((int)n2);
                float f11 = NormI8.unpackY((int)n2);
                float f12 = NormI8.unpackZ((int)n2);
                f5 = MatrixHelper.transformNormalX((Matrix3f)matrix3f, (float)f10, (float)f11, (float)f12);
                f6 = MatrixHelper.transformNormalY((Matrix3f)matrix3f, (float)f10, (float)f11, (float)f12);
                f7 = MatrixHelper.transformNormalZ((Matrix3f)matrix3f, (float)f10, (float)f11, (float)f12);
                if (!bl) {
                    float f13 = Math.invsqrt((float)Math.fma((float)f5, (float)f5, (float)Math.fma((float)f6, (float)f6, (float)(f7 * f7))));
                    f5 *= f13;
                    f6 *= f13;
                    f7 *= f13;
                }
            }
            class013912.method_22914(f5, f6, f7);
        }
    }
}

