package Nursultan;

import com.mojang.blaze3d.opengl.GlStateManager;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import minecraft.class01894;
import minecraft.class06202;
import minecraft.class08893;
import minecraft.class08918;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL33;
import org.lwjgl.stb.STBImage;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;

public class class11643 {
   public static Object N_0 = LogManager.getLogger(String.class);
   public static Object N_1;
   public static Object N_2;
   public static Object N_3;
   public static Object N_4;
   public static Object N_5;
   public static Object N_6;
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public Object y_3;
   public Object y_4;
   public Object y_5;
   public boolean y_init;
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;

   private static class11596 M(String var0) {
      if (var0.isEmpty()) {
         return (class11596)class11596.E_0;
      } else {
         class01894 var1 = class01894.L(var0);
         if (var1 == null) {
            var1 = class01894.y(var0);
         }

         class08918 var2 = class06202.Nq().NO().y(var1);
         if (var2 != null && var2.method_68004() instanceof class08893 var3) {
            int var5 = var3.N();
            if (var5 <= 0) {
               return (class11596)class11596.E_0;
            } else {
               y(var5);
               return class11596.N(var5, 0, 0);
            }
         } else {
            return (class11596)class11596.E_0;
         }
      }
   }

   public class11643(class11742 var1) {
      this.u();
      this.L_0 = new ConcurrentLinkedQueue();
      this.L_1 = new Object2ObjectOpenHashMap();
      this.L_2 = new Object2ObjectOpenHashMap();
      this.L_3 = new ArrayDeque();
      this.L_4 = new class11770();
      this.y_0 = new class11735();
      this.y_2 = new class09723(class09940.ALPHA8, 512, 512, 1, 64);
      this.y_1 = var1;
   }

   static {
      z();
   }

   private ByteBuffer Z(int var1) {
      if ((ByteBuffer)this.y_3 == null) {
         this.y_3 = MemoryUtil.memAlloc(var1);
         ((ByteBuffer)this.y_3).clear();
         return (ByteBuffer)this.y_3;
      } else {
         if (((ByteBuffer)this.y_3).capacity() < var1) {
            this.y_3 = MemoryUtil.memRealloc((ByteBuffer)this.y_3, var1);
         }

         ((ByteBuffer)this.y_3).clear();
         return (ByteBuffer)this.y_3;
      }
   }

   private void i(String var1) {
      ((Map)this.L_1).put(var1, class11597.u());
      ((ExecutorService)class11938.L_1).execute(() -> this.R(var1));
   }

   private void i() {
      String var1;
      while ((var1 = (String)((Queue)this.L_3).poll()) != null) {
         ((Logger)N_0).warn(var1);
      }
   }

   private class11596 m(String var1) {
      int var2 = var1.indexOf(47, 5);
      if (var2 > 5 && var2 != var1.length() - 1) {
         String var3 = var1.substring(5, var2);
         String var4 = var1.substring(var2 + 1);
         class11731 var5 = ((class11742)this.y_1).N(var3);
         if (var5 == null) {
            return (class11596)class11596.E_0;
         } else {
            class11773 var6 = var5.N(var4);
            if (var6 == null) {
               return (class11596)class11596.E_0;
            } else {
               float var7 = var6.u() <= 0.0F ? 1.0F : var6.L() / var6.u();
               int var8 = var5.y();
               class11596 var9 = class11596.N(var8, var5.u(), var5.i(), var6.i(), var6.y(), var6.R(), var6.N(), var5.L(), var7);
               ((Map)this.L_2).put(var1, new class11774(var5, var8, var9));
               return var9;
            }
         }
      } else {
         return (class11596)class11596.E_0;
      }
   }

   private class11596 z(String var1) {
      class11774 var2 = (class11774)((Map)this.L_2).get(var1);
      return var2 != null && var2.L().y() == var2.y() ? var2.N() : this.m(var1);
   }

   private static void z() {
      N_0 = null;
      N_1 = 512;
      N_2 = 512;
      N_3 = 1;
      N_4 = 64;
      N_5 = 256;
      N_6 = 0;
   }

   private void u() {
      if (!this.y_init) {
         this.y_init = true;
         this.y_4 = 0;
         this.y_5 = 0;
      }
   }

   private static void y(int var0) {
      if (var0 != (Integer)N_6) {
         int var1 = GL33.glGetInteger(32873);
         GlStateManager._bindTexture(var0);
         GlStateManager._texParameter(3553, 10240, 9728);
         GlStateManager._texParameter(3553, 10241, 9728);
         GlStateManager._bindTexture(var1);
         N_6 = var0;
      }
   }

   public void y() {
      this.E();
      this.i();
   }

   private void E() {
      boolean var1 = false;

      class11637 var2;
      while ((var2 = (class11637)((Queue)this.L_0).poll()) != null) {
         class11597 var3 = (class11597)((Map)this.L_1).get(var2.N());
         if (var3 != null && (class11737)var3.N_0 == class11737.LOADING) {
            if (var2.y() != null) {
               var3.N_0 = class11737.FAILED;
               ((Queue)this.L_3).add("Failed to decode UI texture '" + var2.N() + "': " + var2.y());
            } else {
               if (var2.L() != null) {
                  class09946 var4 = this.N(var2);
                  if (var4 != null) {
                     var3.N_0 = class11737.READY;
                     var3.N_1 = var4;
                     var3.N_3 = var2.R();
                     var3.N_4 = var2.i();
                     var1 = true;
                     continue;
                  }

                  ((Queue)this.L_3).add("Atlas is full, using direct fallback for UI texture '" + var2.N() + "'");
               }

               int var5 = this.N(var2.R(), var2.i(), var2.u());
               if (var5 <= 0) {
                  var3.N_0 = class11737.FAILED;
                  ((Queue)this.L_3).add("Failed to upload UI texture '" + var2.N() + "'");
               } else {
                  var3.N_0 = class11737.READY;
                  var3.N_2 = var5;
                  var3.N_3 = var2.R();
                  var3.N_4 = var2.i();
                  var3.N_7 = class11596.N(var5, var2.R(), var2.i());
               }
            }
         }
      }

      if (var1) {
         this.R();
      }
   }

   public class11596 N(String var1) {
      if (var1.isEmpty()) {
         return (class11596)class11596.E_0;
      } else if (var1.startsWith("icon:")) {
         return this.z(var1);
      } else if (var1.startsWith("glidfy:")) {
         return N(var1, 7, true);
      } else if (var1.startsWith("glid:")) {
         return N(var1, 5, false);
      } else if (var1.startsWith("mcatlas:")) {
         return M(var1.substring(8));
      } else {
         class11597 var2 = (class11597)((Map)this.L_1).get(var1);
         if (var2 == null) {
            this.i(var1);
            return (class11596)class11596.E_0;
         } else {
            return (class11737)var2.N_0 != class11737.LOADING && (class11737)var2.N_0 != class11737.FAILED
               ? var2.N((Integer)this.y_4, ((class09723)this.y_2).L())
               : (class11596)class11596.E_0;
         }
      }
   }

   private class09946 N(class11637 var1) {
      try {
         return ((class09723)this.y_2).N(var1.L(), var1.R(), var1.i());
      } catch (IllegalStateException var3) {
         return null;
      }
   }

   public int N() {
      return (Integer)this.y_4;
   }

   private int N(int var1, int var2, byte[] var3) {
      ByteBuffer var4 = this.Z(var3.length);
      var4.put(var3);
      var4.flip();
      return ((class11741)this.y_0).N(var1, var2, var4);
   }

   private static byte[] N(class11627 var0) {
      byte[] var1 = var0.y();
      byte[] var2 = new byte[var0.L() * var0.N()];
      byte var3 = 0;

      for (int var4 = 0; var3 < var1.length; var4++) {
         int var5 = var1[var3] & 255;
         int var6 = var1[var3 + 1] & 255;
         int var7 = var1[var3 + 2] & 255;
         int var8 = var1[var3 + 3] & 255;
         if (var8 == 0) {
            var2[var4] = 0;
         } else {
            if (var5 != var6 || var6 != var7) {
               return null;
            }

            int var9 = (var8 * var5 + 127) / 255;
            var2[var4] = (byte)var9;
         }

         var3 += 4;
      }

      return var2;
   }

   private ByteBuffer N(int var1, int var2, int var3, int var4) {
      int var5 = var3 * var4;
      ByteBuffer var6 = this.Z(var5);
      byte[] var7 = ((class09723)this.y_2).M();
      int var8 = ((class09723)this.y_2).y();

      for (int var9 = 0; var9 < var4; var9++) {
         int var10 = (var2 + var9) * var8 + var1;
         var6.put(var7, var10, var3);
      }

      var6.flip();
      return var6;
   }

   private static class11627 N(byte[] var0, String var1) {
      ByteBuffer var2 = null;
      ByteBuffer var3 = null;

      try {
         MemoryStack var4 = MemoryStack.stackPush();

         Object var19;
         label136: {
            class11627 var11;
            try {
               var2 = MemoryUtil.memAlloc(var0.length);
               var2.put(var0).flip();
               IntBuffer var5 = var4.mallocInt(1);
               IntBuffer var6 = var4.mallocInt(1);
               IntBuffer var7 = var4.mallocInt(1);
               var3 = STBImage.stbi_load_from_memory(var2, var5, var6, var7, 4);
               if (var3 == null) {
                  ((Logger)N_0).warn("Failed to decode texture '{}': {}", var1, STBImage.stbi_failure_reason());
                  var19 = null;
                  break label136;
               }

               int var8 = var5.get(0);
               int var9 = var6.get(0);
               byte[] var10 = new byte[var8 * var9 * 4];
               var3.get(var10);
               var11 = new class11627(var8, var9, var10);
            } catch (Throwable var17) {
               if (var4 != null) {
                  try {
                     var4.close();
                  } catch (Throwable var16) {
                     var17.addSuppressed(var16);
                  }
               }

               throw var17;
            }

            if (var4 != null) {
               var4.close();
            }

            return var11;
         }

         if (var4 != null) {
            var4.close();
         }

         return (class11627)var19;
      } finally {
         if (var3 != null) {
            STBImage.stbi_image_free(var3);
         }

         if (var2 != null) {
            MemoryUtil.memFree(var2);
         }
      }
   }

   private static class11596 N(String var0, int var1, boolean var2) {
      try {
         int var3 = Integer.parseInt(var0, var1, var0.length(), 10);
         if (var3 <= 0) {
            return (class11596)class11596.E_0;
         } else {
            return var2 ? class11596.y(var3, 0, 0) : class11596.N(var3, 0, 0);
         }
      } catch (NumberFormatException var4) {
         return (class11596)class11596.E_0;
      }
   }

   private void R(String var1) {
      try {
         byte[] var2 = ((class11758)this.L_4).N(var1);
         if (var2 == null || var2.length == 0) {
            ((Queue)this.L_0).add(class11637.N(var1, "Resource not found"));
            return;
         }

         class11627 var3 = N(var2, var1);
         if (var3 == null) {
            ((Queue)this.L_0).add(class11637.N(var1, "Image decode failed"));
            return;
         }

         byte[] var4 = N(var3);
         boolean var5 = var4 != null && var3.L() <= 256 && var3.N() <= 256;
         ((Queue)this.L_0).add(class11637.N(var1, var3.L(), var3.N(), var3.y(), var5 ? var4 : null));
      } catch (Exception var6) {
         ((Queue)this.L_0).add(class11637.N(var1, var6.getMessage()));
      }
   }

   private void R() {
      class09960[] var1 = ((class09723)this.y_2).z();
      if (var1.length != 0 || (Integer)this.y_4 == 0) {
         int var2 = ((class09723)this.y_2).L();
         boolean var3 = (Integer)this.y_4 == 0 || (Integer)this.y_5 != var2;
         if ((Integer)this.y_4 == 0) {
            this.y_4 = ((class11741)this.y_0).N();
         }

         if ((Integer)this.y_4 == 0) {
            ((Queue)this.L_3).add("Failed to create UI atlas texture");
         } else if (var3) {
            ByteBuffer var9 = this.N(0, 0, ((class09723)this.y_2).y(), var2);
            ((class11741)this.y_0).N((Integer)this.y_4, 0, 0, ((class09723)this.y_2).y(), var2, ((class09723)this.y_2).y(), var2, true, var9);
            this.y_5 = var2;
         } else {
            for (class09960 var7 : var1) {
               ByteBuffer var8 = this.N(var7.L(), var7.u(), var7.i(), var7.R());
               ((class11741)this.y_0).N((Integer)this.y_4, var7.L(), var7.u(), var7.i(), var7.R(), ((class09723)this.y_2).y(), var2, false, var8);
            }
         }
      }
   }
}
