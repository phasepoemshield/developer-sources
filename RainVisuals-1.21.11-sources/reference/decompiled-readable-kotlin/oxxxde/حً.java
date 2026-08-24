package oxxxde;

import it.unimi.dsi.fastutil.ints.IntConsumer;
import java.nio.ByteBuffer;
import lombok.Generated;
import net.minecraft.util.math.MathHelper;
import org.lwjgl.system.MemoryUtil;

// $VF: Compiled from heavy
public final class حً {
   private final int vertexCountInShape;
   private final int vertexCountInTriangulated;
   private تظ indexBuffer;
   private int size;
   private سغ indexType = سغ.SHORT;
   private final سج triangulator;

   @Generated
   public سغ getIndexType() {
      return this.indexType;
   }

   private تظ generateIndexBuffer(int requiredSize) {
      requiredSize = MathHelper.roundUpToMultiple(requiredSize * 2, this.vertexCountInTriangulated);
      int i = requiredSize / this.vertexCountInTriangulated;
      سغ indexType = سغ.smallestFor(i * this.vertexCountInShape);
      ByteBuffer byteBuffer = MemoryUtil.memAlloc(MathHelper.roundUpToMultiple(requiredSize * indexType.bytes, 4));

      try {
         this.indexType = indexType;
         IntConsumer intConsumer = this.getIndexConsumer(byteBuffer);

         for (int l = 0; l < requiredSize; l += this.vertexCountInTriangulated) {
            this.triangulator.accept(intConsumer, l * this.vertexCountInShape / this.vertexCountInTriangulated);
         }

         byteBuffer.flip();
         return new تظ(byteBuffer, اً.STATIC_DRAW, ظح.ELEMENT_ARRAY_BUFFER);
      } finally {
         MemoryUtil.memFree(byteBuffer);
      }
   }

   @Generated
   public حً(int triangulator, int vertexCountInTriangulated, سج vertexCountInShape) {
      this.vertexCountInShape = vertexCountInShape;
      this.vertexCountInTriangulated = vertexCountInTriangulated;
      this.triangulator = triangulator;
   }

   public تظ getIndexBuffer(int standalone, boolean requiredSize) {
      if (standalone) {
         return this.generateIndexBuffer(requiredSize);
      }

      if (!this.isLargeEnough(requiredSize)) {
         if (this.indexBuffer != null) {
            this.indexBuffer.close();
         }

         this.indexBuffer = this.generateIndexBuffer(requiredSize);
         this.size = requiredSize;
      }

      return this.indexBuffer;
   }

   private IntConsumer getIndexConsumer(ByteBuffer indexBuffer) {
      return this.indexType == سغ.SHORT ? index -> indexBuffer.putShort((short)index) : indexBuffer::putInt;
   }

   public boolean isLargeEnough(int requiredSize) {
      return requiredSize <= this.size;
   }
}
