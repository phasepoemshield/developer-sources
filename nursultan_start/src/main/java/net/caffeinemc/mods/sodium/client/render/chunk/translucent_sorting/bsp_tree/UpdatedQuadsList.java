/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectListIterator
 *  it.unimi.dsi.fastutil.objects.ReferenceArrayList
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.quad.FullTQuad
 *  net.caffeinemc.mods.sodium.client.render.chunk.vertex.builder.ChunkMeshBufferBuilder
 */
package net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.bsp_tree;

import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import it.unimi.dsi.fastutil.objects.ReferenceArrayList;
import java.nio.ByteBuffer;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.quad.FullTQuad;
import net.caffeinemc.mods.sodium.client.render.chunk.vertex.builder.ChunkMeshBufferBuilder;

public class UpdatedQuadsList
extends ReferenceArrayList<FullTQuad> {
    private int meshQuadCount;
    private int indexQuadCount;

    public void applyBufferUpdates(ChunkMeshBufferBuilder chunkMeshBufferBuilder, ByteBuffer byteBuffer) {
        ObjectListIterator objectListIterator = this.iterator();
        while (objectListIterator.hasNext()) {
            FullTQuad fullTQuad = (FullTQuad)objectListIterator.next();
            fullTQuad.writeToBuffer(chunkMeshBufferBuilder, byteBuffer);
        }
    }

    public int getMeshQuadCount() {
        return this.meshQuadCount;
    }

    public void setQuadCounts(int n, int n2) {
        this.meshQuadCount = n;
        this.indexQuadCount = n2;
    }

    public int getIndexQuadCount() {
        return this.indexQuadCount;
    }
}

