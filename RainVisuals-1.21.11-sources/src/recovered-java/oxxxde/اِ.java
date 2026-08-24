/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.util.BufferAllocator
 */
package oxxxde;

import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import kotakbaz.rain.client.render.main.vertex.DrawMode;
import kotakbaz.rain.client.render.main.vertex.format.VertexFormat;
import kotakbaz.rain.client.render.main.vertex.mesh.IMesh;
import kotakbaz.rain.client.render.main.vertex.mesh.MeshBuilder;
import net.minecraft.client.util.BufferAllocator;
import oxxxde.\u0627\u064b;
import oxxxde.\u062a\u0638;
import oxxxde.\u062d\u064b;
import oxxxde.\u0638\u062d;

public class \u0627\u0650
implements IMesh {
    private final VertexFormat vertexFormat;
    private \u062a\u0638 indexBuffer;
    private boolean closed = false;
    private static final int MAX_POOLED_VERTEX_BUFFERS = 16;
    private final \u062a\u0638 vertexBuffer;
    private final int indexCount;
    private DrawMode drawMode;
    private final int vertexCount;
    private boolean standalone = false;
    private static final ArrayDeque<\u062a\u0638> VERTEX_BUFFER_POOL = new ArrayDeque();

    private void recreateIndexBuffer() {
        \u062d\u064b indexBufferGenerator;
        if (this.indexBuffer != null) {
            this.indexBuffer.close();
        }
        if ((indexBufferGenerator = this.drawMode.indexBufferGenerator()) != null) {
            this.indexBuffer = indexBufferGenerator.getIndexBuffer(this.indexCount, true);
        }
    }

    private static \u062a\u0638 borrowVertexBuffer(ByteBuffer data) {
        \u062a\u0638 buffer = VERTEX_BUFFER_POOL.pollLast();
        if (buffer == null) {
            return new \u062a\u0638(data, \u0627\u064b.STATIC_DRAW, \u0638\u062d.ARRAY_BUFFER);
        }
        buffer.upload(data);
        return buffer;
    }

    @Override
    public VertexFormat getVertexFormat() {
        return this.vertexFormat;
    }

    @Override
    public int getIndexCount() {
        return this.indexCount;
    }

    private static void returnVertexBuffer(\u062a\u0638 buffer) {
        if (VERTEX_BUFFER_POOL.size() < 16) {
            VERTEX_BUFFER_POOL.addLast(buffer);
        } else {
            buffer.close();
        }
    }

    @Override
    public void close() {
        if (this.closed) {
            return;
        }
        this.closed = true;
        \u0627\u0650.returnVertexBuffer(this.vertexBuffer);
        if (this.indexBuffer != null) {
            this.indexBuffer.close();
        }
    }

    @Override
    public DrawMode getDrawMode() {
        return this.drawMode;
    }

    public static void clearVertexBufferPool() {
        \u062a\u0638 buffer;
        while ((buffer = VERTEX_BUFFER_POOL.pollLast()) != null) {
            buffer.close();
        }
    }

    @Override
    public \u062a\u0638 getVertexBuffer() {
        return this.vertexBuffer;
    }

    public \u0627\u0650 makeStandalone() {
        if (!this.standalone) {
            this.standalone = true;
            this.recreateIndexBuffer();
        }
        return this;
    }

    public \u0627\u0650(ByteBuffer byteBuffer, VertexFormat vertexFormat, int vertexCount, int indexCount, DrawMode drawMode) {
        this.vertexFormat = vertexFormat;
        this.vertexCount = vertexCount;
        this.indexCount = indexCount;
        this.drawMode = drawMode;
        this.vertexBuffer = \u0627\u0650.borrowVertexBuffer(byteBuffer);
    }

    @Override
    public int getVertexCount() {
        return this.vertexCount;
    }

    public void changeDrawMode(DrawMode drawMode) {
        this.drawMode = drawMode;
        if (this.standalone) {
            this.recreateIndexBuffer();
        }
    }

    @Override
    public \u062a\u0638 getIndexBuffer() {
        return this.standalone ? this.indexBuffer : this.drawMode.indexBufferGenerator().getIndexBuffer(this.indexCount, false);
    }

    public static MeshBuilder builder(BufferAllocator bufferAllocator, DrawMode drawMode, VertexFormat vertexFormat, boolean closeAllocatorAfterBuild) {
        return new MeshBuilder(bufferAllocator, drawMode, vertexFormat, closeAllocatorAfterBuild);
    }

    public static MeshBuilder builder(int size, DrawMode drawMode, VertexFormat vertexFormat) {
        return \u0627\u0650.builder(new BufferAllocator(size), drawMode, vertexFormat, true);
    }

    public static MeshBuilder builder(DrawMode drawMode, VertexFormat vertexFormat) {
        return \u0627\u0650.builder(786432, drawMode, vertexFormat);
    }
}

