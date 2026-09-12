package Nursultan;

import com.mojang.blaze3d.opengl.GlStateManager;
import java.nio.ByteBuffer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;
import org.lwjgl.system.MemoryStack;

public class class12039 implements class12037 {
   public Object N_0;
   public boolean N_init;
   public static Object y_0 = LogManager.getLogger(String.class);

   private static void M() {
      y_0 = null;
   }

   public class12039() {
      this.u();
      int var1 = 0;
      int var2 = 0;

      try {
         MemoryStack var3 = MemoryStack.stackPush();

         try {
            ByteBuffer var4 = var3.malloc(4);
            var4.put((byte)-1).put((byte)-1).put((byte)-1).put((byte)-1).flip();
            var1 = GL11.glGenTextures();
            var2 = GL11.glGetInteger(32873);
            GlStateManager._bindTexture(var1);
            GlStateManager._texParameter(3553, 10240, 9729);
            GlStateManager._texParameter(3553, 10241, 9729);
            GlStateManager._texParameter(3553, 10242, 33071);
            GlStateManager._texParameter(3553, 10243, 33071);
            GlStateManager._pixelStore(3314, 0);
            GlStateManager._pixelStore(3316, 0);
            GlStateManager._pixelStore(3315, 0);
            GlStateManager._pixelStore(3317, 1);
            GL11.glTexImage2D(3553, 0, 32856, 1, 1, 0, 6408, 5121, var4);
         } catch (Throwable var12) {
            if (var3 != null) {
               try {
                  var3.close();
               } catch (Throwable var11) {
                  var12.addSuppressed(var11);
               }
            }

            throw var12;
         }

         if (var3 != null) {
            var3.close();
         }
      } catch (Exception var13) {
         ((Logger)y_0).error("Failed to create blank texture", var13);
         if (var1 != 0) {
            GL11.glDeleteTextures(var1);
            var1 = 0;
         }

         throw new RuntimeException(var13);
      } finally {
         if (var1 != 0) {
            GlStateManager._bindTexture(var2);
         }
      }

      this.N_0 = var1;
   }

   static {
      M();
   }

   private void u() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0;
      }
   }

   @Override
   public int N() {
      return (Integer)this.N_0;
   }
}
