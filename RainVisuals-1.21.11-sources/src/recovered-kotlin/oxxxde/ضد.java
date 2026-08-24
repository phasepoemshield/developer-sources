package oxxxde;

import java.util.function.BiConsumer;
import kotakbaz.rain.client.render.main.vertex.DrawMode;
import kotakbaz.rain.client.render.main.vertex.mesh.IMesh;
import net.minecraft.client.render.BuiltBuffer;
import org.lwjgl.opengl.GL11;

// $VF: Compiled from heavy
public final class ضد {
   public static final BiConsumer<IMesh, Boolean> CUSTOM_BUFFER = (mesh, close) -> {
      int indexCount = mesh.getIndexCount();
      int vertexCount = mesh.getVertexCount();
      DrawMode drawMode = mesh.getDrawMode();
      if (vertexCount > 0) {
         شَ.uploadFormatToBuffer(mesh.getVertexBuffer(), mesh.getVertexFormat());
         if (drawMode.useIndexBuffer()) {
            حً indexBufferGenerator = mesh.getDrawMode().indexBufferGenerator();
            تظ indexBuffer = mesh.getIndexBuffer();
            if (indexBuffer.getTarget() != ظح.ELEMENT_ARRAY_BUFFER) {
               دن.printAndExit(new ثف(indexBuffer.getTarget().glId, ظح.ELEMENT_ARRAY_BUFFER.glId));
            }

            indexBuffer.bind();
            GL11.glDrawElements(drawMode.glId(), indexCount, indexBufferGenerator.getIndexType().glId, 0L);
         } else {
            GL11.glDrawArrays(drawMode.glId(), 0, vertexCount);
         }
      }

      if (close) {
         mesh.close();
      }
   };
   public static final BiConsumer<BuiltBuffer, Boolean> MINECRAFT_BUFFER = (builtBuffer, close) -> {
      if (close) {
         builtBuffer.close();
      }
   };

   private static void drawIndexed(int indexType, int drawMode, int count) {
      GL11.glDrawElements(drawMode, count, indexType, 0L);
   }
}
