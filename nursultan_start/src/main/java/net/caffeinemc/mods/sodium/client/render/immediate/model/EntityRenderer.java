/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01423
 *  minecraft.class07211
 *  net.caffeinemc.mods.sodium.api.math.MatrixHelper
 *  net.caffeinemc.mods.sodium.api.vertex.buffer.VertexBufferWriter
 *  net.caffeinemc.mods.sodium.api.vertex.format.common.EntityVertex
 *  net.caffeinemc.mods.sodium.client.util.Int2
 *  org.joml.Matrix3f
 *  org.joml.Matrix3fc
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.lwjgl.system.MemoryStack
 *  org.lwjgl.system.MemoryUtil
 */
package net.caffeinemc.mods.sodium.client.render.immediate.model;

import minecraft.class01423;
import minecraft.class07211;
import net.caffeinemc.mods.sodium.api.math.MatrixHelper;
import net.caffeinemc.mods.sodium.api.vertex.buffer.VertexBufferWriter;
import net.caffeinemc.mods.sodium.api.vertex.format.common.EntityVertex;
import net.caffeinemc.mods.sodium.client.render.immediate.model.ModelCuboid;
import net.caffeinemc.mods.sodium.client.util.Int2;
import org.joml.Matrix3f;
import org.joml.Matrix3fc;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;

public class EntityRenderer {
    private static final Matrix3f prevNormalMatrix = new Matrix3f();
    private static final int VERTEX_BUFFER_BYTES = 864;
    private static final long[] CUBE_VERTEX_XY = new long[8];
    private static final long[] CUBE_VERTEX_ZW = new long[8];
    private static final int[] CUBE_FACE_NORMAL = new int[6];

    public static void renderCuboid(class01423 class014232, VertexBufferWriter vertexBufferWriter, ModelCuboid modelCuboid, int n, int n2, int n3) {
        EntityRenderer.prepareVertices(class014232, modelCuboid, n3);
        EntityRenderer.prepareNormalsIfChanged(class014232);
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            long l = memoryStack.nmalloc(64, 864);
            int n4 = EntityRenderer.emitQuads(l, modelCuboid, n2, n);
            if (n4 > 0) {
                vertexBufferWriter.push(memoryStack, l, n4, EntityVertex.FORMAT);
            }
        }
    }

    private static long writeVertex(long l, int n, long l2, long l3, int n2) {
        MemoryUtil.memPutLong((long)(l + 0L), (long)CUBE_VERTEX_XY[n]);
        MemoryUtil.memPutLong((long)(l + 8L), (long)CUBE_VERTEX_ZW[n]);
        MemoryUtil.memPutLong((long)(l + 16L), (long)l2);
        MemoryUtil.memPutLong((long)(l + 24L), (long)l3);
        MemoryUtil.memPutInt((long)(l + 32L), (int)n2);
        return l + 36L;
    }

    private static void prepareVertices(class01423 class014232, ModelCuboid modelCuboid, int n) {
        Matrix4f matrix4f = class014232.N();
        float f = matrix4f.m00() * modelCuboid.sizeX;
        float f2 = matrix4f.m01() * modelCuboid.sizeX;
        float f3 = matrix4f.m02() * modelCuboid.sizeX;
        float f4 = matrix4f.m10() * modelCuboid.sizeY;
        float f5 = matrix4f.m11() * modelCuboid.sizeY;
        float f6 = matrix4f.m12() * modelCuboid.sizeY;
        float f7 = matrix4f.m20() * modelCuboid.sizeZ;
        float f8 = matrix4f.m21() * modelCuboid.sizeZ;
        float f9 = matrix4f.m22() * modelCuboid.sizeZ;
        float f10 = MatrixHelper.transformPositionX((Matrix4fc)matrix4f, (float)modelCuboid.originX, (float)modelCuboid.originY, (float)modelCuboid.originZ);
        float f11 = MatrixHelper.transformPositionY((Matrix4fc)matrix4f, (float)modelCuboid.originX, (float)modelCuboid.originY, (float)modelCuboid.originZ);
        float f12 = MatrixHelper.transformPositionZ((Matrix4fc)matrix4f, (float)modelCuboid.originX, (float)modelCuboid.originY, (float)modelCuboid.originZ);
        EntityRenderer.setVertex(0, f10, f11, f12, n);
        float f13 = f10 + f;
        float f14 = f11 + f2;
        float f15 = f12 + f3;
        EntityRenderer.setVertex(1, f13, f14, f15, n);
        float f16 = f13 + f4;
        float f17 = f14 + f5;
        float f18 = f15 + f6;
        EntityRenderer.setVertex(2, f16, f17, f18, n);
        float f19 = f10 + f4;
        float f20 = f11 + f5;
        float f21 = f12 + f6;
        EntityRenderer.setVertex(3, f19, f20, f21, n);
        float f22 = f10 + f7;
        float f23 = f11 + f8;
        float f24 = f12 + f9;
        EntityRenderer.setVertex(4, f22, f23, f24, n);
        float f25 = f13 + f7;
        float f26 = f14 + f8;
        float f27 = f15 + f9;
        EntityRenderer.setVertex(5, f25, f26, f27, n);
        float f28 = f16 + f7;
        float f29 = f17 + f8;
        float f30 = f18 + f9;
        EntityRenderer.setVertex(6, f28, f29, f30, n);
        float f31 = f19 + f7;
        float f32 = f20 + f8;
        float f33 = f21 + f9;
        EntityRenderer.setVertex(7, f31, f32, f33, n);
    }

    private static void setVertex(int n, float f, float f2, float f3, int n2) {
        EntityRenderer.CUBE_VERTEX_XY[n] = Int2.pack((int)Float.floatToRawIntBits(f), (int)Float.floatToRawIntBits(f2));
        EntityRenderer.CUBE_VERTEX_ZW[n] = Int2.pack((int)Float.floatToRawIntBits(f3), (int)n2);
    }

    private static void prepareNormalsIfChanged(class01423 class014232) {
        if (class014232.y().equals((Object)prevNormalMatrix)) {
            return;
        }
        EntityRenderer.CUBE_FACE_NORMAL[0] = MatrixHelper.transformNormal((Matrix3f)class014232.y(), (boolean)class014232.N, (class07211)class07211.field_11033);
        EntityRenderer.CUBE_FACE_NORMAL[1] = MatrixHelper.transformNormal((Matrix3f)class014232.y(), (boolean)class014232.N, (class07211)class07211.field_11036);
        EntityRenderer.CUBE_FACE_NORMAL[3] = MatrixHelper.transformNormal((Matrix3f)class014232.y(), (boolean)class014232.N, (class07211)class07211.field_11043);
        EntityRenderer.CUBE_FACE_NORMAL[5] = MatrixHelper.transformNormal((Matrix3f)class014232.y(), (boolean)class014232.N, (class07211)class07211.field_11035);
        EntityRenderer.CUBE_FACE_NORMAL[4] = MatrixHelper.transformNormal((Matrix3f)class014232.y(), (boolean)class014232.N, (class07211)class07211.field_11039);
        EntityRenderer.CUBE_FACE_NORMAL[2] = MatrixHelper.transformNormal((Matrix3f)class014232.y(), (boolean)class014232.N, (class07211)class07211.field_11034);
        prevNormalMatrix.set((Matrix3fc)class014232.y());
    }

    private static int emitQuads(long l, ModelCuboid modelCuboid, int n, int n2) {
        long l2 = Int2.pack((int)n, (int)n2);
        long l3 = l;
        int[] nArray = modelCuboid.normals;
        int[] nArray2 = modelCuboid.positions;
        long[] lArray = modelCuboid.textures;
        int n3 = 0;
        for (int i = 0; i < 6; ++i) {
            if (!modelCuboid.shouldDrawFace(i)) continue;
            int n4 = i * 4;
            int n5 = CUBE_FACE_NORMAL[nArray[i]];
            l3 = EntityRenderer.writeVertex(l3, nArray2[n4 + 0], lArray[n4 + 0], l2, n5);
            l3 = EntityRenderer.writeVertex(l3, nArray2[n4 + 1], lArray[n4 + 1], l2, n5);
            l3 = EntityRenderer.writeVertex(l3, nArray2[n4 + 2], lArray[n4 + 2], l2, n5);
            l3 = EntityRenderer.writeVertex(l3, nArray2[n4 + 3], lArray[n4 + 3], l2, n5);
            n3 += 4;
        }
        return n3;
    }
}

