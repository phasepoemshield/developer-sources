package l;

import net.minecraft.client.gl.Framebuffer;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.GL11;

public final class Helper74 implements Helper160 {
   public static void method783() {
      Framebuffer var0 = mc.getFramebuffer();
      if (var0.depthAttachment > -1) {
         mc.getFramebuffer().beginWrite(false);
         EXTFramebufferObject.glDeleteRenderbuffersEXT(var0.depthAttachment);
         int var1 = EXTFramebufferObject.glGenRenderbuffersEXT();
         EXTFramebufferObject.glBindRenderbufferEXT(36161, var1);
         EXTFramebufferObject.glRenderbufferStorageEXT(36161, 34041, window.getWidth(), window.getHeight());
         EXTFramebufferObject.glFramebufferRenderbufferEXT(36160, 36128, 36161, var1);
         EXTFramebufferObject.glFramebufferRenderbufferEXT(36160, 36096, 36161, var1);
         var0.depthAttachment = -1;
      }

      GL11.glStencilMask(255);
      GL11.glClear(1024);
      GL11.glEnable(2960);
      GL11.glStencilFunc(519, 1, 1);
      GL11.glStencilOp(7681, 7681, 7681);
      GL11.glDisable(2929);
      GL11.glColorMask(false, false, false, false);
   }

   public static void method784(int var0) {
      GL11.glColorMask(true, true, true, true);
      GL11.glStencilFunc(514, var0, 1);
      GL11.glStencilOp(7680, 7680, 7680);
   }

   public static void method785() {
      GL11.glDisable(2960);
      GL11.glEnable(2929);
   }

   private Helper74() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
