package Nursultan;

import com.mojang.blaze3d.opengl.GlStateManager;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import minecraft.class01079;
import minecraft.class06202;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;
import org.lwjgl.stb.STBImage;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;

public class class12031 implements class12037 {
   public Object N_0;
   public Object N_1;
   public boolean N_init;
   public static Object y_0 = LogManager.getLogger(String.class);

   public class12031(String var1) {
      this(var1, 9729);
   }

   public class12031(String var1, int var2) {
      this.i();
      this.N_1 = var1;
      ByteBuffer var3 = null;
      ByteBuffer var4 = null;
      int var5 = 0;
      int var6 = 0;

      try {
         MemoryStack var7 = MemoryStack.stackPush();

         try (InputStream var8 = this.y()) {
            byte[] var9 = IOUtils.toByteArray(var8);
            var3 = MemoryUtil.memAlloc(var9.length);
            var3.put(var9).flip();
            IntBuffer var10 = var7.mallocInt(1);
            IntBuffer var11 = var7.mallocInt(1);
            IntBuffer var12 = var7.mallocInt(1);
            var4 = STBImage.stbi_load_from_memory(var3, var10, var11, var12, 4);
            if (var4 == null) {
               throw new IllegalStateException("Failed to decode image " + var1 + ": " + STBImage.stbi_failure_reason());
            }

            var5 = GL11.glGenTextures();
            var6 = GL11.glGetInteger(32873);
            GlStateManager._bindTexture(var5);
            GlStateManager._texParameter(3553, 10240, var2);
            GlStateManager._texParameter(3553, 10241, var2);
            GlStateManager._texParameter(3553, 10242, 33071);
            GlStateManager._texParameter(3553, 10243, 33071);
            GlStateManager._pixelStore(3314, 0);
            GlStateManager._pixelStore(3316, 0);
            GlStateManager._pixelStore(3315, 0);
            GlStateManager._pixelStore(3317, 1);
            GL11.glTexImage2D(3553, 0, 32856, var10.get(0), var11.get(0), 0, 6408, 5121, var4);
         } catch (Throwable var23) {
            if (var7 != null) {
               try {
                  var7.close();
               } catch (Throwable var20) {
                  var23.addSuppressed(var20);
               }
            }

            throw var23;
         }

         if (var7 != null) {
            var7.close();
         }
      } catch (RuntimeException | IOException var24) {
         ((Logger)y_0).error("Failed to load texture: {}", var1, var24);
         if (var5 != 0) {
            GL11.glDeleteTextures(var5);
            var5 = 0;
         }
      } finally {
         if (var4 != null) {
            STBImage.stbi_image_free(var4);
         }

         if (var3 != null) {
            MemoryUtil.memFree(var3);
         }

         if (var5 != 0) {
            GlStateManager._bindTexture(var6);
         }
      }

      this.N_0 = var5;
   }

   static {
      Z();
   }

   private static void Z() {
      y_0 = null;
   }

   private void i() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0;
      }
   }

   public InputStream y() throws IOException {
      return ((class01079)class06202.Nq().Nm().method_14486(class11911.N((String)this.N_1)).orElseThrow()).method_14482();
   }

   @Override
   public int N() {
      return (Integer)this.N_0;
   }
}
