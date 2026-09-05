/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.client.gl.attribute.GlVertexFormat
 *  net.caffeinemc.mods.sodium.client.render.chunk.vertex.format.ChunkVertexEncoder
 *  net.caffeinemc.mods.sodium.client.render.chunk.vertex.format.ChunkVertexType
 */
package net.irisshaders.iris.vertices.sodium.terrain;

import net.caffeinemc.mods.sodium.client.gl.attribute.GlVertexFormat;
import net.caffeinemc.mods.sodium.client.render.chunk.vertex.format.ChunkVertexEncoder;
import net.caffeinemc.mods.sodium.client.render.chunk.vertex.format.ChunkVertexType;
import net.irisshaders.iris.vertices.sodium.terrain.XHFPTerrainVertex;

public class XHFPModelVertexType
implements ChunkVertexType {
    private static final int POSITION_MAX_VALUE = 65536;
    private static final int TEXTURE_MAX_VALUE = 32768;
    private static final float MODEL_ORIGIN = 8.0f;
    private static final float MODEL_RANGE = 32.0f;
    private static final float MODEL_SCALE = 4.8828125E-4f;
    private static final float MODEL_SCALE_INV = 2048.0f;
    private static final float TEXTURE_SCALE = 3.0517578E-5f;
    private final GlVertexFormat format;
    private final int normalOffset;
    private final int blockIdOffset;
    private final int midBlockOffset;
    private final int midUvOffset;

    public XHFPModelVertexType(GlVertexFormat glVertexFormat, int n, int n2, int n3, int n4) {
        this.format = glVertexFormat;
        this.blockIdOffset = n;
        this.normalOffset = n2;
        this.midUvOffset = n3;
        this.midBlockOffset = n4;
    }

    public GlVertexFormat getVertexFormat() {
        return this.format;
    }

    public ChunkVertexEncoder getEncoder() {
        return new XHFPTerrainVertex(this.blockIdOffset, this.normalOffset, this.midUvOffset, this.midBlockOffset, this.format.getStride());
    }

    public static int encodeOld(float f, float f2) {
        return (Math.round(f * 32768.0f) & 0xFFFF) << 0 | (Math.round(f2 * 32768.0f) & 0xFFFF) << 16;
    }
}

