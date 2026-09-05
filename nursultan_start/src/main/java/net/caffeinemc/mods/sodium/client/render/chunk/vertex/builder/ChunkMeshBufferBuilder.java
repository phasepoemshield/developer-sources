/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.client.render.chunk.terrain.material.Material
 *  org.lwjgl.system.MemoryUtil
 */
package net.caffeinemc.mods.sodium.client.render.chunk.vertex.builder;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import net.caffeinemc.mods.sodium.client.render.chunk.terrain.material.Material;
import net.caffeinemc.mods.sodium.client.render.chunk.vertex.format.ChunkVertexEncoder;
import net.caffeinemc.mods.sodium.client.render.chunk.vertex.format.ChunkVertexEncoder$Vertex;
import net.caffeinemc.mods.sodium.client.render.chunk.vertex.format.ChunkVertexType;
import org.lwjgl.system.MemoryUtil;

public class ChunkMeshBufferBuilder {
    private final ChunkVertexEncoder encoder;
    private final int stride;
    private final int initialCapacity;
    private ByteBuffer buffer;
    private int vertexCount;
    private int vertexCapacity;
    private int sectionIndex;

    public void writeExternal(ByteBuffer byteBuffer, int n, ChunkVertexEncoder$Vertex[] chunkVertexEncoder$VertexArray, Material material) {
        this.encoder.write(MemoryUtil.memAddress((ByteBuffer)byteBuffer, (int)(n * this.stride)), material.bits(), chunkVertexEncoder$VertexArray, this.sectionIndex);
    }

    public ChunkMeshBufferBuilder(ChunkVertexType chunkVertexType, int n) {
        this.encoder = chunkVertexType.getEncoder();
        this.stride = chunkVertexType.getVertexFormat().getStride();
        this.buffer = null;
        this.vertexCapacity = n;
        this.initialCapacity = n;
    }

    public boolean isEmpty() {
        return this.vertexCount == 0;
    }

    public int count() {
        return this.vertexCount;
    }

    public void start(int n) {
        this.vertexCount = 0;
        this.sectionIndex = n;
        this.reallocate(this.initialCapacity);
    }

    public void destroy() {
        if (this.buffer != null) {
            MemoryUtil.memFree((Buffer)this.buffer);
        }
        this.buffer = null;
    }

    private void ensureCapacity(int n) {
        if (this.vertexCount + n >= this.vertexCapacity) {
            this.grow(n);
        }
    }

    public ByteBuffer slice() {
        if (this.isEmpty()) {
            throw new IllegalStateException("No vertex data in buffer");
        }
        return MemoryUtil.memSlice((ByteBuffer)this.buffer, (int)0, (int)(this.stride * this.vertexCount));
    }

    private void grow(int n) {
        this.reallocate(Math.max(this.vertexCapacity * 2, this.vertexCapacity + n));
    }

    public void push(ChunkVertexEncoder$Vertex[] chunkVertexEncoder$VertexArray, Material material) {
        this.push(chunkVertexEncoder$VertexArray, material.bits());
    }

    public void push(ChunkVertexEncoder$Vertex[] chunkVertexEncoder$VertexArray, int n) {
        if (chunkVertexEncoder$VertexArray.length != 4) {
            throw new IllegalArgumentException("Only quad primitives (with 4 vertices) can be pushed");
        }
        this.ensureCapacity(4);
        this.encoder.write(MemoryUtil.memAddress((ByteBuffer)this.buffer, (int)(this.vertexCount * this.stride)), n, chunkVertexEncoder$VertexArray, this.sectionIndex);
        this.vertexCount += 4;
    }

    private void reallocate(int n) {
        this.buffer = MemoryUtil.memRealloc((ByteBuffer)this.buffer, (int)(n * this.stride));
        this.vertexCapacity = n;
    }
}

