package ru.metaculture.protection;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.stb.STBImage;
import org.lwjgl.system.MemoryStack;

public final class VUUuNNvu {
   private static vnuUvuuNVNUU UuUVuuUu;
   private static final Map<String, Integer> C00OOC00oO = new HashMap<>();
   private static final Set<String> uUnuvNvvNU = ConcurrentHashMap.newKeySet();
   private static int vVvUvVVuuNvV;

   private VUUuNNvu() {
   }

   public static void UuUVuuUu(vnuUvuuNVNUU var0) {
      UuUVuuUu = var0;
   }

   public static int UuUVuuUu(String var0) {
      if (UuUVuuUu == null) {
         throw new IllegalStateException("TextureLoader.initialize() must be called first");
      } else {
         Integer var1 = C00OOC00oO.get(var0);
         if (var1 != null) {
            return var1;
         } else {
            int var2 = C00OOC00oO(var0);
            if (var2 > 0) {
               C00OOC00oO.put(var0, var2);
               return var2;
            } else {
               if (uUnuvNvvNU.add(var0)) {
                  System.err.println("[TextureLoader] Falling back for: " + var0);
               }

               return UuUVuuUu();
            }
         }
      }
   }

   public static synchronized int UuUVuuUu() {
      if (vVvUvVVuuNvV != 0) {
         return vVvUvVVuuNvV;
      } else {
         try {
            ByteBuffer var0 = BufferUtils.createByteBuffer(4);
            var0.put((byte)0).put((byte)0).put((byte)0).put((byte)0).flip();
            int var1 = GL11.glGenTextures();
            if (var1 <= 0) {
               return 0;
            } else {
               int var2 = GL11.glGetInteger(32873);
               GL11.glBindTexture(3553, var1);
               GL11.glTexParameteri(3553, 10241, 9729);
               GL11.glTexParameteri(3553, 10240, 9729);
               GL11.glTexParameteri(3553, 10242, 33071);
               GL11.glTexParameteri(3553, 10243, 33071);
               GL11.glTexImage2D(3553, 0, 32856, 1, 1, 0, 6408, 5121, var0);
               GL11.glBindTexture(3553, var2);
               vVvUvVVuuNvV = var1;
               return var1;
            }
         } catch (Throwable var3) {
            return 0;
         }
      }
   }

   private static int C00OOC00oO(String var0) {
      ByteBuffer var1;
      try {
         var1 = UvnUNnnVnu.C00OOC00oO(var0);
      } catch (Exception var12) {
         System.err.println("Failed to read texture resource: " + var0);
         var12.printStackTrace();
         return 0;
      }

      MemoryStack var2 = MemoryStack.stackPush();

      int var14;
      label49: {
         int var10;
         try {
            IntBuffer var3 = var2.mallocInt(1);
            IntBuffer var4 = var2.mallocInt(1);
            IntBuffer var5 = var2.mallocInt(1);
            ByteBuffer var6 = STBImage.stbi_load_from_memory(var1, var3, var4, var5, 4);
            if (var6 == null) {
               System.err.println("Failed to decode texture: " + var0 + " - " + STBImage.stbi_failure_reason());
               var14 = 0;
               break label49;
            }

            var14 = var3.get(0);
            int var8 = var4.get(0);
            int var9 = UuUVuuUu.UuUVuuUu(var14, var8, var6);
            STBImage.stbi_image_free(var6);
            System.out.println("[TextureLoader] Loaded: " + var0 + " (" + var14 + "x" + var8 + ") -> ID " + var9);
            var10 = var9;
         } catch (Throwable var13) {
            if (var2 != null) {
               try {
                  var2.close();
               } catch (Throwable var11) {
                  var13.addSuppressed(var11);
               }
            }

            throw var13;
         }

         if (var2 != null) {
            var2.close();
         }

         return var10;
      }

      if (var2 != null) {
         var2.close();
      }

      return var14;
   }

   public static void C00OOC00oO() {
      C00OOC00oO.clear();
      uUnuvNvvNU.clear();
   }
}
