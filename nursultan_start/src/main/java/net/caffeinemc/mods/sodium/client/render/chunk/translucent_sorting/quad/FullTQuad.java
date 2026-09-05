/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.client.model.quad.properties.ModelQuadFacing
 *  net.caffeinemc.mods.sodium.client.render.chunk.terrain.material.DefaultMaterials
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 */
package net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.quad;

import java.nio.ByteBuffer;
import net.caffeinemc.mods.sodium.client.model.quad.properties.ModelQuadFacing;
import net.caffeinemc.mods.sodium.client.render.chunk.terrain.material.DefaultMaterials;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.TranslucentData;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.quad.RegularTQuad;
import net.caffeinemc.mods.sodium.client.render.chunk.vertex.builder.ChunkMeshBufferBuilder;
import net.caffeinemc.mods.sodium.client.render.chunk.vertex.format.ChunkVertexEncoder$Vertex;
import org.joml.Vector3f;
import org.joml.Vector3fc;

public class FullTQuad
extends RegularTQuad {
    private final ChunkVertexEncoder$Vertex[] vertices = ChunkVertexEncoder$Vertex.uninitializedQuad();
    private int sameVertexMap;
    private boolean normalIsVeryAccurate = false;
    private boolean hasUpdatedVertices = false;
    private static final int NO_WRITE = -1;
    private int writeToIndex = -1;

    FullTQuad(ModelQuadFacing modelQuadFacing, int n) {
        super(modelQuadFacing, n);
    }

    public boolean isInvalid() {
        return FullTQuad.isInvalid(this.sameVertexMap);
    }

    public void writeToBuffer(ChunkMeshBufferBuilder chunkMeshBufferBuilder, ByteBuffer byteBuffer) {
        if (this.writeToIndex != -1) {
            chunkMeshBufferBuilder.writeExternal(byteBuffer, TranslucentData.quadCountToVertexCount(this.writeToIndex), this.vertices, DefaultMaterials.TRANSLUCENT);
        }
    }

    public boolean triggerAndSetUpdatedVertices() {
        if (this.hasUpdatedVertices) {
            return false;
        }
        this.hasUpdatedVertices = true;
        return true;
    }

    public void updateSplitQuadAfterVertexModification() {
        this.sameVertexMap = this.initExtentsAndCenter(this.vertices);
        this.vertexPositions = null;
    }

    public static FullTQuad fromVertices(ChunkVertexEncoder$Vertex[] chunkVertexEncoder$VertexArray, ModelQuadFacing modelQuadFacing, int n) {
        FullTQuad fullTQuad = new FullTQuad(modelQuadFacing, n);
        fullTQuad.sameVertexMap = fullTQuad.initExtentsAndCenter(chunkVertexEncoder$VertexArray);
        if (fullTQuad.isInvalid()) {
            return null;
        }
        fullTQuad.initDotProduct();
        fullTQuad.initVertices(chunkVertexEncoder$VertexArray);
        return fullTQuad;
    }

    public void setWriteToIndex(int n) {
        this.writeToIndex = n;
    }

    public static FullTQuad splittingCopy(FullTQuad fullTQuad) {
        FullTQuad fullTQuad2 = new FullTQuad(fullTQuad.facing, fullTQuad.packedNormal);
        fullTQuad2.initVertices(fullTQuad.vertices);
        fullTQuad2.extents = fullTQuad.extents;
        fullTQuad2.accurateDotProduct = fullTQuad.accurateDotProduct;
        fullTQuad2.quantizedDotProduct = fullTQuad.quantizedDotProduct;
        fullTQuad2.center = fullTQuad.center;
        fullTQuad2.quantizedNormal = fullTQuad.quantizedNormal;
        fullTQuad2.accurateNormal = fullTQuad.accurateNormal;
        fullTQuad2.normalIsVeryAccurate = fullTQuad.normalIsVeryAccurate;
        return fullTQuad2;
    }

    public ChunkVertexEncoder$Vertex[] getVertices() {
        return this.vertices;
    }

    public int getSameVertexMap() {
        return this.sameVertexMap;
    }

    public int getUniqueVertexMap() {
        return ~this.sameVertexMap & 0xF;
    }

    private void initVertices(ChunkVertexEncoder$Vertex[] chunkVertexEncoder$VertexArray) {
        for (int i = 0; i < 4; ++i) {
            ChunkVertexEncoder$Vertex chunkVertexEncoder$Vertex = this.vertices[i];
            ChunkVertexEncoder$Vertex chunkVertexEncoder$Vertex2 = chunkVertexEncoder$VertexArray[i];
            ChunkVertexEncoder$Vertex.copyVertexTo(chunkVertexEncoder$Vertex2, chunkVertexEncoder$Vertex);
        }
    }

    @Override
    public float[] getVertexPositions() {
        if (this.vertexPositions == null) {
            this.vertexPositions = new float[12];
            for (int i = 0; i < 4; ++i) {
                this.vertexPositions[i * 3] = this.vertices[i].x;
                this.vertexPositions[i * 3 + 1] = this.vertices[i].y;
                this.vertexPositions[i * 3 + 2] = this.vertices[i].z;
            }
        }
        return this.vertexPositions;
    }

    public void setNoWrite() {
        this.writeToIndex = -1;
    }

    public Vector3fc getVeryAccurateNormal() {
        if (this.facing.isAligned()) {
            return this.facing.getAlignedNormal();
        }
        if (!this.normalIsVeryAccurate) {
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
            this.accurateNormal = new Vector3f(f13, f20, f21);
            this.accurateDotProduct = this.accurateNormal.dot(this.center);
            this.normalIsVeryAccurate = true;
        }
        return this.accurateNormal;
    }
}

