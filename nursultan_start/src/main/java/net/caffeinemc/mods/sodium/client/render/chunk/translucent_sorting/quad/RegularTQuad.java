/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.client.model.quad.properties.ModelQuadFacing
 */
package net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.quad;

import net.caffeinemc.mods.sodium.client.model.quad.properties.ModelQuadFacing;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.quad.TQuad;
import net.caffeinemc.mods.sodium.client.render.chunk.vertex.format.ChunkVertexEncoder$Vertex;

public class RegularTQuad
extends TQuad {
    float[] vertexPositions;

    RegularTQuad(ModelQuadFacing modelQuadFacing, int n) {
        super(modelQuadFacing, n);
    }

    public static RegularTQuad fromVertices(ChunkVertexEncoder$Vertex[] chunkVertexEncoder$VertexArray, ModelQuadFacing modelQuadFacing, int n) {
        RegularTQuad regularTQuad = new RegularTQuad(modelQuadFacing, n);
        int n2 = regularTQuad.initExtentsAndCenter(chunkVertexEncoder$VertexArray);
        if (RegularTQuad.isInvalid(n2)) {
            return null;
        }
        regularTQuad.initVertexPositions(chunkVertexEncoder$VertexArray, n2);
        regularTQuad.initDotProduct();
        return regularTQuad;
    }

    @Override
    public float[] getVertexPositions() {
        if (this.vertexPositions == null) {
            this.vertexPositions = new float[12];
            int n = this.facing.getAxis();
            int n2 = n == 0 ? 0 : 3;
            int n3 = n == 1 ? 0 : 3;
            int n4 = n == 2 ? 0 : 3;
            int n5 = 0;
            for (int i = 0; i <= n2; i += 3) {
                for (int j = 0; j <= n3; j += 3) {
                    for (int k = 0; k <= n4; k += 3) {
                        this.vertexPositions[n5++] = this.extents[i];
                        this.vertexPositions[n5++] = this.extents[j + 1];
                        this.vertexPositions[n5++] = this.extents[k + 2];
                    }
                }
            }
        }
        return this.vertexPositions;
    }

    void initVertexPositions(ChunkVertexEncoder$Vertex[] chunkVertexEncoder$VertexArray, int n) {
        boolean bl;
        boolean bl2 = bl = n != 0 || !this.facing.isAligned();
        if (!bl) {
            float f = this.extents[0];
            float f2 = this.extents[1];
            float f3 = this.extents[2];
            float f4 = this.extents[3];
            float f5 = this.extents[4];
            float f6 = this.extents[5];
            for (int i = 0; i < 4; ++i) {
                ChunkVertexEncoder$Vertex chunkVertexEncoder$Vertex = chunkVertexEncoder$VertexArray[i];
                if (!(chunkVertexEncoder$Vertex.x != f2 && chunkVertexEncoder$Vertex.x != f5 || chunkVertexEncoder$Vertex.y != f3 && chunkVertexEncoder$Vertex.y != f6) && (chunkVertexEncoder$Vertex.z == f || chunkVertexEncoder$Vertex.z == f4)) continue;
                bl = true;
                break;
            }
        }
        if (bl) {
            float[] fArray = new float[12];
            this.vertexPositions = fArray;
            int n2 = 0;
            for (int i = 0; i < 4; ++i) {
                ChunkVertexEncoder$Vertex chunkVertexEncoder$Vertex = chunkVertexEncoder$VertexArray[i];
                fArray[n2++] = chunkVertexEncoder$Vertex.x;
                fArray[n2++] = chunkVertexEncoder$Vertex.y;
                fArray[n2++] = chunkVertexEncoder$Vertex.z;
            }
        }
    }
}

