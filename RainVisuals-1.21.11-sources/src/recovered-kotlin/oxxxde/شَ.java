package oxxxde;

import java.util.Locale;
import kotakbaz.rain.client.render.main.ChromaRenderer;
import kotakbaz.rain.client.render.main.vertex.format.VertexFormat;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL11;

// $VF: Compiled from heavy
public class شَ {
   private static final ك formatUploader = createFormatUploader();

   private static ك createFormatUploader() {
      String vendor = String.valueOf(GL11.glGetString(7936));
      String renderer = String.valueOf(GL11.glGetString(7937));
      boolean amd = containsAmdMarker(vendor) || containsAmdMarker(renderer);
      if (!amd && GL.getCapabilities().GL_ARB_vertex_attrib_binding) {
         ChromaRenderer.getLogger().info("Using ARB vertex format uploader. vendor={}, renderer={}", vendor, renderer);
         return new دج();
      } else {
         ChromaRenderer.getLogger()
            .info(
               "Using default vertex format uploader. vendor={}, renderer={}, arbAttribBinding={}",
               vendor,
               renderer,
               GL.getCapabilities().GL_ARB_vertex_attrib_binding
            );
         return new بك();
      }
   }

   private static boolean containsAmdMarker(String value) {
      if (value == null) {
         return false;
      }

      String lower = value.toLowerCase(Locale.ROOT);
      return lower.contains("advanced micro devices") || containsToken(lower, "amd") || containsToken(lower, "ati") || lower.contains("radeon");
   }

   private static boolean containsToken(String token, String value) {
      for (int index = value.indexOf(token); index >= 0; index = value.indexOf(token, index + 1)) {
         int end = index + token.length();
         boolean before = index == 0 || !Character.isLetterOrDigit(value.charAt(index + -1));
         boolean after = end >= value.length() || !Character.isLetterOrDigit(value.charAt(end));
         if (before && after) {
            return true;
         }
      }

      return false;
   }

   public static void uploadFormatToBuffer(تظ vertexBuffer, VertexFormat vertexFormat) {
      if (vertexBuffer.getTarget() != ظح.ARRAY_BUFFER) {
         دن.printAndExit(new ثف(vertexBuffer.getTarget().glId, ظح.ARRAY_BUFFER.glId));
      }

      formatUploader.applyFormatToBuffer(vertexBuffer, vertexFormat);
   }
}
