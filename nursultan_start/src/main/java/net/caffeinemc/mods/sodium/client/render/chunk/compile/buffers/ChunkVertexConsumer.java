/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01391
 *  minecraft.class08388
 *  net.caffeinemc.mods.sodium.api.util.ColorABGR
 *  net.caffeinemc.mods.sodium.api.util.ColorARGB
 *  net.caffeinemc.mods.sodium.api.util.NormI8
 *  net.caffeinemc.mods.sodium.client.render.chunk.terrain.material.Material
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.TranslucentGeometryCollector
 *  net.caffeinemc.mods.sodium.client.render.chunk.vertex.format.ChunkVertexEncoder$Vertex
 *  net.caffeinemc.mods.sodium.client.render.texture.SpriteFinderCache
 *  net.irisshaders.iris.vertices.BlockSensitiveBufferBuilder
 *  org.jspecify.annotations.NonNull
 */
package net.caffeinemc.mods.sodium.client.render.chunk.compile.buffers;

import minecraft.class01391;
import minecraft.class08388;
import net.caffeinemc.mods.sodium.api.util.ColorABGR;
import net.caffeinemc.mods.sodium.api.util.ColorARGB;
import net.caffeinemc.mods.sodium.api.util.NormI8;
import net.caffeinemc.mods.sodium.client.model.quad.properties.ModelQuadFacing;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.buffers.ChunkModelBuilder;
import net.caffeinemc.mods.sodium.client.render.chunk.terrain.material.Material;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.TranslucentGeometryCollector;
import net.caffeinemc.mods.sodium.client.render.chunk.vertex.format.ChunkVertexEncoder;
import net.caffeinemc.mods.sodium.client.render.texture.SpriteFinderCache;
import net.irisshaders.iris.vertices.BlockSensitiveBufferBuilder;
import org.jspecify.annotations.NonNull;

public class ChunkVertexConsumer
implements class01391,
BlockSensitiveBufferBuilder {
    private static final int ATTRIBUTE_POSITION_BIT = 1;
    private static final int ATTRIBUTE_COLOR_BIT = 2;
    private static final int ATTRIBUTE_TEXTURE_BIT = 4;
    private static final int ATTRIBUTE_LIGHT_BIT = 8;
    private static final int ATTRIBUTE_NORMAL_BIT = 16;
    private static final int REQUIRED_ATTRIBUTES = 31;
    private final ChunkModelBuilder modelBuilder;
    private final ChunkVertexEncoder.Vertex[] vertices = ChunkVertexEncoder.Vertex.uninitializedQuad();
    private Material material;
    private int vertexIndex;
    private int writtenAttributes;
    private TranslucentGeometryCollector collector;

    public void setData(Material material, TranslucentGeometryCollector translucentGeometryCollector) {
        this.material = material;
        this.collector = translucentGeometryCollector;
    }

    public ChunkVertexConsumer(ChunkModelBuilder chunkModelBuilder) {
        this.modelBuilder = chunkModelBuilder;
    }

    public @NonNull class01391 method_1336(int n, int n2, int n3, int n4) {
        ChunkVertexEncoder.Vertex vertex = this.vertices[this.vertexIndex];
        vertex.color = ColorABGR.pack((int)n, (int)n2, (int)n3, (int)n4);
        this.writtenAttributes |= 2;
        return this.potentiallyEndVertex();
    }

    public void overrideBlock(int n) {
        ((BlockSensitiveBufferBuilder)this.modelBuilder).overrideBlock(n);
    }

    public void restoreBlock() {
        ((BlockSensitiveBufferBuilder)this.modelBuilder).restoreBlock();
    }

    public void ignoreMidBlock(boolean bl) {
        ((BlockSensitiveBufferBuilder)this.modelBuilder).ignoreMidBlock(bl);
    }

    public @NonNull class01391 method_22915(float f, float f2, float f3, float f4) {
        ChunkVertexEncoder.Vertex vertex = this.vertices[this.vertexIndex];
        vertex.color = ColorABGR.pack((float)f, (float)f2, (float)f3, (float)f4);
        this.writtenAttributes |= 2;
        return this.potentiallyEndVertex();
    }

    public @NonNull class01391 method_22922(int n) {
        return this.potentiallyEndVertex();
    }

    public @NonNull class01391 method_60803(int n) {
        ChunkVertexEncoder.Vertex vertex = this.vertices[this.vertexIndex];
        vertex.light = n;
        this.writtenAttributes |= 8;
        return this.potentiallyEndVertex();
    }

    public @NonNull class01391 method_22913(float f, float f2) {
        ChunkVertexEncoder.Vertex vertex = this.vertices[this.vertexIndex];
        vertex.u = f;
        vertex.v = f2;
        this.writtenAttributes |= 4;
        return this.potentiallyEndVertex();
    }

    public void beginBlock(int n, byte by, byte by2, int n2, int n3, int n4) {
        ((BlockSensitiveBufferBuilder)this.modelBuilder).beginBlock(n, by, by2, n2, n3, n4);
    }

    public void endBlock() {
        ((BlockSensitiveBufferBuilder)this.modelBuilder).endBlock();
    }

    public @NonNull class01391 method_22912(float f, float f2, float f3) {
        ChunkVertexEncoder.Vertex vertex = this.vertices[this.vertexIndex];
        vertex.x = f;
        vertex.y = f2;
        vertex.z = f3;
        vertex.ao = 1.0f;
        this.writtenAttributes |= 1;
        return this.potentiallyEndVertex();
    }

    public @NonNull class01391 method_39415(int n) {
        ChunkVertexEncoder.Vertex vertex = this.vertices[this.vertexIndex];
        vertex.color = ColorARGB.toABGR((int)n);
        this.writtenAttributes |= 2;
        return this.potentiallyEndVertex();
    }

    public @NonNull class01391 method_22914(float f, float f2, float f3) {
        this.writtenAttributes |= 0x10;
        return this.potentiallyEndVertex();
    }

    public @NonNull class01391 method_60796(int n, int n2) {
        return this.potentiallyEndVertex();
    }

    public @NonNull class01391 method_22921(int n, int n2) {
        ChunkVertexEncoder.Vertex vertex = this.vertices[this.vertexIndex];
        vertex.light = (n2 & 0xFFFF) << 16 | n & 0xFFFF;
        this.writtenAttributes |= 8;
        return this.potentiallyEndVertex();
    }

    public class01391 method_75298(float f) {
        return this.potentiallyEndVertex();
    }

    private int calculateNormal() {
        float f = this.vertices[2].y;
        float f2 = this.vertices[0].y;
        float f3 = f - f2;
        float f4 = this.vertices[3].z;
        float f5 = this.vertices[1].z;
        float f6 = f4 - f5;
        float f7 = this.vertices[2].z;
        float f8 = this.vertices[0].z;
        float f9 = f7 - f8;
        float f10 = this.vertices[3].y;
        float f11 = this.vertices[1].y;
        float f12 = f10 - f11;
        float f13 = f3 * f6 - f9 * f12;
        float f14 = this.vertices[3].x;
        float f15 = this.vertices[1].x;
        float f16 = f14 - f15;
        float f17 = this.vertices[2].x;
        float f18 = this.vertices[0].x;
        float f19 = f17 - f18;
        float f20 = f9 * f16 - f19 * f6;
        float f21 = f19 * f12 - f3 * f16;
        float f22 = (float)Math.sqrt(f13 * f13 + f20 * f20 + f21 * f21);
        if ((double)f22 != 0.0 && (double)f22 != 1.0) {
            f13 /= f22;
            f20 /= f22;
            f21 /= f22;
        }
        return NormI8.pack((float)f13, (float)f20, (float)f21);
    }

    public class01391 potentiallyEndVertex() {
        if (this.writtenAttributes != 31) {
            return this;
        }
        ++this.vertexIndex;
        this.writtenAttributes = 0;
        if (this.vertexIndex == 4) {
            int n = this.calculateNormal();
            ModelQuadFacing modelQuadFacing = ModelQuadFacing.fromPackedNormal(n);
            if (this.material.isTranslucent() && this.collector != null && this.collector.appendQuad(this.vertices, modelQuadFacing, n)) {
                return this;
            }
            this.modelBuilder.getVertexBuffer(modelQuadFacing).push(this.vertices, this.material);
            float f = 0.0f;
            float f2 = 0.0f;
            for (ChunkVertexEncoder.Vertex vertex : this.vertices) {
                f += vertex.u;
                f2 += vertex.v;
            }
            class08388 class083882 = SpriteFinderCache.forBlockAtlas().find(f * 0.25f, f2 * 0.25f);
            if (class083882 != null) {
                this.modelBuilder.addSprite(class083882);
            }
            this.vertexIndex = 0;
        }
        return this;
    }
}

