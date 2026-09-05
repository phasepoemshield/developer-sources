/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04995
 *  net.caffeinemc.mods.sodium.api.util.ColorARGB
 *  net.caffeinemc.mods.sodium.client.gl.attribute.GlVertexFormat
 *  org.lwjgl.system.MemoryUtil
 */
package net.caffeinemc.mods.sodium.client.render.chunk.vertex.format.impl;

import minecraft.class04995;
import net.caffeinemc.mods.sodium.api.util.ColorARGB;
import net.caffeinemc.mods.sodium.client.gl.attribute.GlVertexFormat;
import net.caffeinemc.mods.sodium.client.render.chunk.vertex.format.ChunkVertexEncoder;
import net.caffeinemc.mods.sodium.client.render.chunk.vertex.format.ChunkVertexEncoder$Vertex;
import net.caffeinemc.mods.sodium.client.render.chunk.vertex.format.ChunkVertexType;
import net.caffeinemc.mods.sodium.client.render.chunk.vertex.format.impl.DefaultChunkMeshAttributes;
import org.lwjgl.system.MemoryUtil;

public class CompactChunkVertex
implements ChunkVertexType {
    public static final int STRIDE = 20;
    public static final GlVertexFormat VERTEX_FORMAT = GlVertexFormat.builder((int)20).addElement(DefaultChunkMeshAttributes.POSITION, 0, 0).addElement(DefaultChunkMeshAttributes.COLOR, 1, 8).addElement(DefaultChunkMeshAttributes.TEXTURE, 2, 12).addElement(DefaultChunkMeshAttributes.LIGHT_MATERIAL_INDEX, 3, 16).build();
    public static final int POSITION_MAX_VALUE = 0x100000;
    public static final int TEXTURE_MAX_VALUE = 32768;
    private static final float MODEL_ORIGIN = 8.0f;
    private static final float MODEL_RANGE = 32.0f;

    private static int quantizePosition(float f) {
        return (int)(CompactChunkVertex.normalizePosition(f) * 1048576.0f) & 0xFFFFF;
    }

    private static int packPositionLo(int n, int n2, int n3) {
        return (n & 0x3FF) << 0 | (n2 & 0x3FF) << 10 | (n3 & 0x3FF) << 20;
    }

    private static int packPositionHi(int n, int n2, int n3) {
        return (n >>> 10 & 0x3FF) << 0 | (n2 >>> 10 & 0x3FF) << 10 | (n3 >>> 10 & 0x3FF) << 20;
    }

    private static int packLightAndData(int n, int n2, int n3) {
        return (n & 0xFFFF) << 0 | (n2 & 0xFF) << 16 | (n3 & 0xFF) << 24;
    }

    private static int encodeTexture(float f, float f2) {
        int n = f2 < f ? 1 : -1;
        int n2 = Math.round(f2 * 32768.0f) + n;
        return n2 & Short.MAX_VALUE | CompactChunkVertex.sign(n) << 15;
    }

    private static float normalizePosition(float f) {
        return (8.0f + f) / 32.0f;
    }

    private static int packTexture(int n, int n2) {
        return (n & 0xFFFF) << 0 | (n2 & 0xFFFF) << 16;
    }

    private static int encodeLight(int n) {
        int n2 = class04995.N((int)((n >>> 16 & 0xFF) + 8), (int)8, (int)248);
        int n3 = class04995.N((int)((n >>> 0 & 0xFF) + 8), (int)8, (int)248);
        return n3 << 0 | n2 << 8;
    }

    private static int sign(int n) {
        return n >>> 31;
    }

    @Override
    public GlVertexFormat getVertexFormat() {
        return VERTEX_FORMAT;
    }

    @Override
    public ChunkVertexEncoder getEncoder() {
        return (l, n, chunkVertexEncoder$VertexArray, n2) -> {
            float f = 0.0f;
            float f2 = 0.0f;
            for (ChunkVertexEncoder$Vertex chunkVertexEncoder$Vertex : chunkVertexEncoder$VertexArray) {
                f += chunkVertexEncoder$Vertex.u;
                f2 += chunkVertexEncoder$Vertex.v;
            }
            f *= 0.25f;
            f2 *= 0.25f;
            for (int i = 0; i < 4; ++i) {
                ChunkVertexEncoder$Vertex chunkVertexEncoder$Vertex = chunkVertexEncoder$VertexArray[i];
                int n3 = CompactChunkVertex.quantizePosition(chunkVertexEncoder$Vertex.x);
                int n4 = CompactChunkVertex.quantizePosition(chunkVertexEncoder$Vertex.y);
                int n5 = CompactChunkVertex.quantizePosition(chunkVertexEncoder$Vertex.z);
                int n6 = CompactChunkVertex.encodeTexture(f, chunkVertexEncoder$Vertex.u);
                int n7 = CompactChunkVertex.encodeTexture(f2, chunkVertexEncoder$Vertex.v);
                int n8 = CompactChunkVertex.encodeLight(chunkVertexEncoder$Vertex.light);
                MemoryUtil.memPutInt((long)(l + 0L), (int)CompactChunkVertex.packPositionHi(n3, n4, n5));
                MemoryUtil.memPutInt((long)(l + 4L), (int)CompactChunkVertex.packPositionLo(n3, n4, n5));
                MemoryUtil.memPutInt((long)(l + 8L), (int)ColorARGB.mulRGB((int)chunkVertexEncoder$Vertex.color, (float)chunkVertexEncoder$Vertex.ao));
                MemoryUtil.memPutInt((long)(l + 12L), (int)CompactChunkVertex.packTexture(n6, n7));
                MemoryUtil.memPutInt((long)(l + 16L), (int)CompactChunkVertex.packLightAndData(n8, n, n2));
                l += 20L;
            }
            return l;
        };
    }
}

