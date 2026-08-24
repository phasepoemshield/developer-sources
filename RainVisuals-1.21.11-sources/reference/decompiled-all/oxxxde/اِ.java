package oxxxde;

import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import net.minecraft.client.util.BufferAllocator;

// $VF: Compiled from heavy
public class اِ implements طأ {
   private final سا vertexFormat;
   private تظ indexBuffer;
   private boolean closed;
   private static final int MAX_POOLED_VERTEX_BUFFERS = 16;
   private final تظ vertexBuffer;
   private final int indexCount;
   private شم drawMode;
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
   public سا getVertexFormat() {
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
   public شم getDrawMode() {
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

   public اِ(ByteBuffer vertexCount, سا drawMode, int vertexFormat, int indexCount, شم byteBuffer) {
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

   public void changeDrawMode(شم drawMode) {
      this.drawMode = drawMode;
      if (this.standalone) {
         this.recreateIndexBuffer();
      }
   }

   @Override
   public تظ getIndexBuffer() {
      return this.standalone ? this.indexBuffer : this.drawMode.indexBufferGenerator().getIndexBuffer(this.indexCount, false);
   }

   public static ان builder(BufferAllocator bufferAllocator, شم vertexFormat, سا closeAllocatorAfterBuild, boolean drawMode) {
      return new ان(bufferAllocator, drawMode, vertexFormat, closeAllocatorAfterBuild);
   }

   public static ان builder(int size, شم drawMode, سا vertexFormat) {
      return builder(new BufferAllocator(size), drawMode, vertexFormat, true);
   }

   public static ان builder(شم vertexFormat, سا drawMode) {
      return builder(786432, drawMode, vertexFormat);
   }
}
