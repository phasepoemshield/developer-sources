/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04995
 *  net.caffeinemc.mods.sodium.api.util.ColorABGR
 *  net.caffeinemc.mods.sodium.api.util.ColorARGB
 *  net.caffeinemc.mods.sodium.client.render.chunk.vertex.format.ChunkVertexEncoder
 *  net.caffeinemc.mods.sodium.client.render.chunk.vertex.format.ChunkVertexEncoder$Vertex
 *  net.irisshaders.iris.shaderpack.materialmap.WorldRenderingSettings
 *  org.joml.Vector3f
 *  org.joml.Vector4f
 *  org.joml.Vector4fc
 *  org.lwjgl.system.MemoryUtil
 */
package net.irisshaders.iris.vertices.sodium.terrain;

import minecraft.class04995;
import net.caffeinemc.mods.sodium.api.util.ColorABGR;
import net.caffeinemc.mods.sodium.api.util.ColorARGB;
import net.caffeinemc.mods.sodium.client.render.chunk.vertex.format.ChunkVertexEncoder;
import net.irisshaders.iris.shaderpack.materialmap.WorldRenderingSettings;
import net.irisshaders.iris.vertices.ExtendedDataHelper;
import net.irisshaders.iris.vertices.NormalHelper;
import net.irisshaders.iris.vertices.sodium.terrain.ChunkVertexExtension;
import net.irisshaders.iris.vertices.sodium.terrain.XHFPModelVertexType;
import org.joml.Vector3f;
import org.joml.Vector4f;
import org.joml.Vector4fc;
import org.lwjgl.system.MemoryUtil;

public class XHFPTerrainVertex
implements ChunkVertexEncoder {
    private static final int POSITION_MAX_VALUE = 0x100000;
    private static final int TEXTURE_MAX_VALUE = 32768;
    private static final float MODEL_ORIGIN = 8.0f;
    private static final float MODEL_RANGE = 32.0f;
    private static final int DEFAULT_NORMAL = NormalHelper.encodeNormalTangent(new Vector3f(0.0f, 1.0f, 0.0f), new Vector3f(0.0f, 1.0f, 0.0f), new Vector3f(), new Vector3f(), new Vector3f());
    private final Vector3f normal = new Vector3f(0.0f, 1.0f, 0.0f);
    private final Vector4f tangent = new Vector4f(0.0f, 1.0f, 0.0f, 1.0f);
    private final int blockIdOffset;
    private final int normalOffset;
    private final int midBlockOffset;
    private final int midUvOffset;
    private final int stride;
    private final Vector3f[] scratchValues = new Vector3f[3];
    private final Vector3f tangentSet = new Vector3f();
    private static final int TANGENT_W_BIT = 16;

    private static int quantizePosition(float f) {
        return (int)(XHFPTerrainVertex.normalizePosition(f) * 1048576.0f) & 0xFFFFF;
    }

    private static int packPositionLo(int n, int n2, int n3) {
        return (n & 0x3FF) << 0 | (n2 & 0x3FF) << 10 | (n3 & 0x3FF) << 20;
    }

    private static int packPositionHi(int n, int n2, int n3) {
        return (n >>> 10 & 0x3FF) << 0 | (n2 >>> 10 & 0x3FF) << 10 | (n3 >>> 10 & 0x3FF) << 20;
    }

    private static int packLightAndData(int n, boolean bl, int n2) {
        return n & 0xFFFF | ((bl ? 1 : 0) & 1) << 16 | (n2 & 0xFF) << 24;
    }

    private static int encodeTexture(float f, float f2) {
        int n = f2 < f ? 1 : -1;
        int n2 = Math.round(f2 * 32768.0f) + n;
        return n2 & Short.MAX_VALUE | XHFPTerrainVertex.sign(n) << 15;
    }

    private static float normalizePosition(float f) {
        return (8.0f + f) / 32.0f;
    }

    private static int packTexture(int n, int n2) {
        return (n & 0xFFFF) << 0 | (n2 & 0xFFFF) << 16;
    }

    private static int encodeLight(int n) {
        int n2 = class04995.N((int)(n >>> 16 & 0xFF), (int)8, (int)248);
        int n3 = class04995.N((int)(n >>> 0 & 0xFF), (int)8, (int)248);
        return n3 << 0 | n2 << 8;
    }

    public XHFPTerrainVertex(int n, int n2, int n3, int n4, int n5) {
        this.blockIdOffset = n;
        this.normalOffset = n2;
        this.midUvOffset = n3;
        this.midBlockOffset = n4;
        this.stride = n5;
        for (int i = 0; i < this.scratchValues.length; ++i) {
            this.scratchValues[i] = new Vector3f();
        }
    }

    public long write(long l, int n, ChunkVertexEncoder.Vertex[] vertexArray, int n2) {
        int n3;
        int n4;
        float f = 0.0f;
        float f2 = 0.0f;
        for (ChunkVertexEncoder.Vertex vertex : vertexArray) {
            f += vertex.u;
            f2 += vertex.v;
        }
        int n5 = XHFPModelVertexType.encodeOld(f *= 0.25f, f2 *= 0.25f);
        if (this.normalOffset != 0) {
            NormalHelper.computeFaceNormalManual(this.normal, vertexArray[0].x, vertexArray[0].y, vertexArray[0].z, vertexArray[1].x, vertexArray[1].y, vertexArray[1].z, vertexArray[2].x, vertexArray[2].y, vertexArray[2].z, vertexArray[3].x, vertexArray[3].y, vertexArray[3].z);
            n4 = this.computeTangentForQuad(this.normal, vertexArray);
            n3 = NormalHelper.encodeNormalTangent(this.normal, this.tangentSet.set((Vector4fc)this.tangent), this.scratchValues[0], this.scratchValues[1], this.scratchValues[2]);
        } else {
            n3 = DEFAULT_NORMAL;
        }
        for (n4 = 0; n4 < 4; ++n4) {
            ChunkVertexEncoder.Vertex vertex;
            vertex = vertexArray[n4];
            ChunkVertexExtension chunkVertexExtension = (ChunkVertexExtension)vertex;
            int n6 = XHFPTerrainVertex.quantizePosition(vertex.x);
            int n7 = XHFPTerrainVertex.quantizePosition(vertex.y);
            int n8 = XHFPTerrainVertex.quantizePosition(vertex.z);
            int n9 = XHFPTerrainVertex.encodeTexture(f, vertex.u);
            int n10 = XHFPTerrainVertex.encodeTexture(f2, vertex.v);
            int n11 = XHFPTerrainVertex.encodeLight(vertex.light);
            MemoryUtil.memPutInt((long)l, (int)XHFPTerrainVertex.packPositionHi(n6, n7, n8));
            MemoryUtil.memPutInt((long)(l + 4L), (int)XHFPTerrainVertex.packPositionLo(n6, n7, n8));
            MemoryUtil.memPutInt((long)(l + 8L), (int)(WorldRenderingSettings.INSTANCE.shouldUseSeparateAo() ? ColorABGR.withAlpha((int)vertex.color, (float)vertex.ao) : ColorARGB.mulRGB((int)vertex.color, (float)vertex.ao)));
            MemoryUtil.memPutInt((long)(l + 12L), (int)XHFPTerrainVertex.packTexture(n9, n10));
            MemoryUtil.memPutInt((long)(l + 16L), (int)XHFPTerrainVertex.packLightAndData(n11, (double)this.tangent.w >= 0.0, n2));
            if (this.blockIdOffset != 0) {
                MemoryUtil.memPutInt((long)(l + (long)this.blockIdOffset), (int)this.packBlockId(chunkVertexExtension));
            }
            if (this.midBlockOffset != 0) {
                MemoryUtil.memPutInt((long)(l + (long)this.midBlockOffset), (int)(chunkVertexExtension.ignoreMidBlock() ? 0 : ExtendedDataHelper.computeMidBlock(vertex.x, vertex.y, vertex.z, chunkVertexExtension.getLocalPosX(), chunkVertexExtension.getLocalPosY(), chunkVertexExtension.getLocalPosZ())));
                MemoryUtil.memPutByte((long)(l + (long)this.midBlockOffset + 3L), (byte)chunkVertexExtension.getBlockEmission());
            }
            if (this.midUvOffset != 0) {
                MemoryUtil.memPutInt((long)(l + (long)this.midUvOffset), (int)n5);
            }
            if (this.normalOffset != 0) {
                MemoryUtil.memPutInt((long)(l + (long)this.normalOffset), (int)n3);
            }
            l += (long)this.stride;
        }
        return l;
    }

    private static int sign(int n) {
        return n >>> 31;
    }

    private int computeTangentForQuad(Vector3f vector3f, ChunkVertexEncoder.Vertex[] vertexArray) {
        int n = NormalHelper.computeTangent(this.tangent, vector3f.x, vector3f.y, vector3f.z, vertexArray[0].x, vertexArray[0].y, vertexArray[0].z, vertexArray[0].u, vertexArray[0].v, vertexArray[1].x, vertexArray[1].y, vertexArray[1].z, vertexArray[1].u, vertexArray[1].v, vertexArray[2].x, vertexArray[2].y, vertexArray[2].z, vertexArray[2].u, vertexArray[2].v);
        if (n == -1) {
            n = NormalHelper.computeTangent(this.tangent, vector3f.x, vector3f.y, vector3f.z, vertexArray[2].x, vertexArray[2].y, vertexArray[2].z, vertexArray[2].u, vertexArray[2].v, vertexArray[3].x, vertexArray[3].y, vertexArray[3].z, vertexArray[3].u, vertexArray[3].v, vertexArray[0].x, vertexArray[0].y, vertexArray[0].z, vertexArray[0].u, vertexArray[0].v);
        }
        return n;
    }

    private int packBlockId(ChunkVertexExtension chunkVertexExtension) {
        return chunkVertexExtension.getBlockId() + 1 << 1 | chunkVertexExtension.getRenderType() & 1;
    }

    private static int floorInt(float f) {
        return (int)Math.floor(f);
    }
}

