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

public final class O0000O0O00OO0 {
   private static RenderEngine O00000000;
   private static final Map<String, Integer> O000000000 = new HashMap<>();
   private static final Set<String> O0000000000 = ConcurrentHashMap.newKeySet();
   private static int O00000000000;

   private O0000O0O00OO0() {
   }

   public static void O00000000(RenderEngine o0000O00O0OOO) {
      O00000000 = o0000O00O0OOO;
   }

   public static int O00000000(String string) {
      if (O00000000 == null) {
         throw new IllegalStateException("TextureLoader.initialize() must be called first");
      } else {
         Integer var1 = O000000000.get(string);
         if (var1 != null) {
            return var1;
         } else {
            int var2 = O000000000(string);
            if (var2 > 0) {
               O000000000.put(string, var2);
               return var2;
            } else {
               if (O0000000000.add(string)) {
                  System.err.println("[TextureLoader] Falling back for: " + string);
               }

               return O00000000();
            }
         }
      }
   }

   public static synchronized int O00000000() {
      if (O00000000000 != 0) {
         return O00000000000;
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
               O00000000000 = var1;
               return var1;
            }
         } catch (Throwable var3) {
            return 0;
         }
      }
   }

   private static int O000000000(String string) {
      ByteBuffer var1;
      try {
         var1 = O0000O00OO.O000000000(string);
      } catch (Exception var12) {
         System.err.println("Failed to read texture resource: " + string);
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
               System.err.println("Failed to decode texture: " + string + " - " + STBImage.stbi_failure_reason());
               var14 = 0;
               break label49;
            }

            var14 = var3.get(0);
            int var8 = var4.get(0);
            int var9 = O00000000.O00000000(var14, var8, var6);
            STBImage.stbi_image_free(var6);
            System.out.println("[TextureLoader] Loaded: " + string + " (" + var14 + "x" + var8 + ") -> ID " + var9);
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

   public static void O000000000() {
      O000000000.clear();
      O0000000000.clear();
   }
}
