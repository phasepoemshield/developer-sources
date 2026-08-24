package oxxxde;

import java.util.function.IntUnaryOperator;

// $VF: Compiled from heavy
public record شم(int glId, boolean useIndexBuffer, حً indexBufferGenerator, IntUnaryOperator indexCountFunction) {
   public static final شم QUADS = new شم(4, true, new حً(4, 6, (indexConsumer, firstVertexIndex) -> {
      indexConsumer.accept(firstVertexIndex);
      indexConsumer.accept(firstVertexIndex + 1);
      indexConsumer.accept(firstVertexIndex + 2);
      indexConsumer.accept(firstVertexIndex + 2);
      indexConsumer.accept(firstVertexIndex + 3);
      indexConsumer.accept(firstVertexIndex);
   }), vertices -> vertices / 4 * 6);
   public static final شم LINE_STRIP = new شم(3, false, null, vertices -> 0);
   public static final شم TRIANGLES = new شم(4, false, null, vertices -> 0);
   public static final شم TRIANGLE_FAN = new شم(6, false, null, vertices -> 0);
   public static final شم LINES = new شم(1, false, null, vertices -> 0);
   public static final شم TRIANGLE_STRIP = new شم(5, false, null, vertices -> 0);
}
