package kotakbaz.rain.client.render.main.vertex;

import java.util.function.IntUnaryOperator;
import oxxxde.حً;

// $VF: Compiled from heavy
public record DrawMode(int glId, boolean useIndexBuffer, حً indexBufferGenerator, IntUnaryOperator indexCountFunction) {
   public static final DrawMode QUADS = new DrawMode(4, true, new حً(4, 6, (indexConsumer, firstVertexIndex) -> {
      indexConsumer.accept(firstVertexIndex);
      indexConsumer.accept(firstVertexIndex + 1);
      indexConsumer.accept(firstVertexIndex + 2);
      indexConsumer.accept(firstVertexIndex + 2);
      indexConsumer.accept(firstVertexIndex + 3);
      indexConsumer.accept(firstVertexIndex);
   }), vertices -> vertices / 4 * 6);
   public static final DrawMode LINE_STRIP = new DrawMode(3, false, null, vertices -> 0);
   public static final DrawMode TRIANGLES = new DrawMode(4, false, null, vertices -> 0);
   public static final DrawMode TRIANGLE_FAN = new DrawMode(6, false, null, vertices -> 0);
   public static final DrawMode LINES = new DrawMode(1, false, null, vertices -> 0);
   public static final DrawMode TRIANGLE_STRIP = new DrawMode(5, false, null, vertices -> 0);
}
