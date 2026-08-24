package oxxxde;

import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import kotakbaz.rain.client.render.main.vertex.DrawMode;
import kotakbaz.rain.client.render.main.vertex.format.VertexFormat;
import kotakbaz.rain.client.render.main.vertex.mesh.IMesh;
import kotakbaz.rain.client.render.main.vertex.mesh.MeshBuilder;
import net.minecraft.client.util.BufferAllocator;

// $VF: Compiled from heavy
public class اِ implements IMesh {
   private final VertexFormat vertexFormat;
   private تظ indexBuffer;
   private boolean closed;
   private static final int MAX_POOLED_VERTEX_BUFFERS = 16;
   private final تظ vertexBuffer;
   private final int indexCount;
   private DrawMode drawMode;
   private final int vertexCount;
   private boolean standalone = false;
   private static final ArrayDeque<تظ> VERTEX_BUFFER_POOL = new ArrayDeque<>();

   private void recreateIndexBuffer() {
      if (this.indexBuffer != null) {
         this.indexBuffer.close();
      }

      حً indexBufferGenerator = this.drawMode.indexBufferGenerator();
      if (indexBufferGenerator != null) {
         this.indexBuffer = indexBufferGenerator.getIndexBuffer(this.indexCount, true);
      }
   }

   private static تظ borrowVertexBuffer(ByteBuffer data) {
      تظ buffer = VERTEX_BUFFER_POOL.pollLast();
      if (buffer == null) {
         return new تظ(data, اً.STATIC_DRAW, ظح.ARRAY_BUFFER);
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

   private static void returnVertexBuffer(تظ buffer) {
      if (VERTEX_BUFFER_POOL.size() < 16) {
         VERTEX_BUFFER_POOL.addLast(buffer);
      } else {
         buffer.close();
      }
   }

   @Override
   public void close() {
      if (!this.closed) {
         this.closed = true;
         returnVertexBuffer(this.vertexBuffer);
         if (this.indexBuffer != null) {
            this.indexBuffer.close();
         }
      }
   }

   @Override
   public DrawMode getDrawMode() {
      return this.drawMode;
   }

   public static void clearVertexBufferPool() {
      تظ buffer;
      while ((buffer = VERTEX_BUFFER_POOL.pollLast()) != null) {
         buffer.close();
      }
   }

   @Override
   public تظ getVertexBuffer() {
      return this.vertexBuffer;
   }

   public اِ makeStandalone() {
      if (!this.standalone) {
         this.standalone = true;
         this.recreateIndexBuffer();
      }

      return this;
   }

   public اِ(ByteBuffer vertexCount, VertexFormat drawMode, int vertexFormat, int indexCount, DrawMode byteBuffer) {
      this.closed = false;
      this.vertexFormat = vertexFormat;
      this.vertexCount = vertexCount;
      this.indexCount = indexCount;
      this.drawMode = drawMode;
      this.vertexBuffer = borrowVertexBuffer(byteBuffer);
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
   public تظ getIndexBuffer() {
      return this.standalone ? this.indexBuffer : this.drawMode.indexBufferGenerator().getIndexBuffer(this.indexCount, false);
   }

   public static MeshBuilder builder(BufferAllocator bufferAllocator, DrawMode vertexFormat, VertexFormat closeAllocatorAfterBuild, boolean drawMode) {
      return new MeshBuilder(bufferAllocator, drawMode, vertexFormat, closeAllocatorAfterBuild);
   }

   public static MeshBuilder builder(int size, DrawMode drawMode, VertexFormat vertexFormat) {
      return builder(new BufferAllocator(size), drawMode, vertexFormat, true);
   }

   public static MeshBuilder builder(DrawMode vertexFormat, VertexFormat drawMode) {
      return builder(786432, drawMode, vertexFormat);
   }
}
