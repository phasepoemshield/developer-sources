package Nursultan;

import com.mojang.blaze3d.opengl.GlStateManager;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL12;
import org.lwjgl.stb.STBImage;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;

public class class11752 {
   public static Object N_0 = LogManager.getLogger(String.class);

   private static void L() {
      N_0 = null;
   }

   private static class11724 M(String var0) {
      byte[] var1;
      try (InputStream var2 = class11911.L(var0).method_14482()) {
         var1 = IOUtils.toByteArray(var2);
      } catch (Exception var24) {
         throw new IllegalStateException("Failed to read icon atlas image: " + var0, var24);
      }

      ByteBuffer var25 = MemoryUtil.memAlloc(var1.length);
      ByteBuffer var3 = null;

      class11724 var11;
      try {
         MemoryStack var4 = MemoryStack.stackPush();

         try {
            var25.put(var1).flip();
            IntBuffer var5 = var4.mallocInt(1);
            IntBuffer var6 = var4.mallocInt(1);
            IntBuffer var7 = var4.mallocInt(1);
            var3 = STBImage.stbi_load_from_memory(var25, var5, var6, var7, 4);
            if (var3 == null) {
               throw new IllegalStateException("Failed to decode icon atlas image '" + var0 + "': " + STBImage.stbi_failure_reason());
            }

            int var8 = var5.get(0);
            int var9 = var6.get(0);
            byte[] var10 = new byte[var8 * var9 * 4];
            var3.get(var10);
            var11 = new class11724(var8, var9, var10);
         } catch (Throwable var22) {
            if (var4 != null) {
               try {
                  var4.close();
               } catch (Throwable var19) {
                  var22.addSuppressed(var19);
               }
            }

            throw var22;
         }

         if (var4 != null) {
            var4.close();
         }
      } finally {
         if (var3 != null) {
            STBImage.stbi_image_free(var3);
         }

         MemoryUtil.memFree(var25);
      }

      return var11;
   }

   private class11752() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }

   static {
      L();
   }

   private static Map<String, Integer> i(String var0) {
      Map var1 = class11911.N(class11911.N(var0), new class11747());
      if (var1 != null && !var1.isEmpty()) {
         return var1;
      } else {
         throw new IllegalStateException("Icon atlas names map invalid or empty: " + var0);
      }
   }

   private static class11729 y(String var0) {
      class11729 var1 = class11911.N(class11911.N(var0), class11729.class);
      if (var1 != null && var1.y != null && var1.N != null) {
         return var1;
      } else {
         throw new IllegalStateException("Icon atlas layout invalid or empty: " + var0);
      }
   }

   private static Map<String, class11773> N(class11729 var0, Map<String, Integer> var1) {
      HashMap var2 = new HashMap(var0.N.size());
      float var3 = (float)var0.y.L;
      float var4 = (float)var0.y.y;

      for (class11755 var6 : var0.N) {
         if (var6.L != null) {
            float var7 = var6.L.L / var3;
            float var8 = var6.L.y / var3;
            float var9 = var6.L.u / var4;
            float var10 = var6.L.N / var4;
            float var11 = var6.N == null ? 1.0F : var6.N.u - var6.N.y;
            float var12 = var6.N == null ? 1.0F : Math.abs(var6.N.L - var6.N.N);
            var2.put(var6.y, new class11773(var7, var9, var8, var10, var11, var12));
         }
      }

      HashMap var13 = new HashMap(var1.size());

      for (Entry var15 : var1.entrySet()) {
         class11773 var16 = (class11773)var2.get(var15.getValue());
         if (var16 == null) {
            ((Logger)N_0).warn("Icon '{}' (codepoint {}) is missing from atlas layout — skipping", var15.getKey(), var15.getValue());
         } else {
            var13.put((String)var15.getKey(), var16);
         }
      }

      return var13;
   }

   private static int N(class11724 var0) {
      int var1 = GL12.glGenTextures();
      if (var1 == 0) {
         throw new IllegalStateException("Failed to allocate GL texture for icon atlas");
      } else {
         ByteBuffer var2 = MemoryUtil.memAlloc(var0.y().length);

         try {
            var2.put(var0.y()).flip();
            int var3 = GL12.glGetInteger(32873);
            GlStateManager._bindTexture(var1);
            GlStateManager._texParameter(3553, 10240, 9729);
            GlStateManager._texParameter(3553, 10241, 9729);
            GlStateManager._texParameter(3553, 10242, 33071);
            GlStateManager._texParameter(3553, 10243, 33071);
            GlStateManager._pixelStore(3314, 0);
            GlStateManager._pixelStore(3316, 0);
            GlStateManager._pixelStore(3315, 0);
            GlStateManager._pixelStore(3317, 1);
            GL12.glTexImage2D(3553, 0, 32856, var0.N(), var0.L(), 0, 6408, 5121, var2);
            GlStateManager._bindTexture(var3);
         } finally {
            MemoryUtil.memFree(var2);
         }

         return var1;
      }
   }

   public static class11731 N(String var0) {
      class11729 var1 = y(var0 + ".json");
      Map<String, Integer> var2 = i(var0 + ".names.json");
      Map<String, class11773> var3 = N(var1, var2);
      class11724 var4 = M(var0 + ".png");
      int var5 = N(var4);
      return new class11731(var5, var4.N(), var4.L(), var1.y.N, var3);
   }
}
