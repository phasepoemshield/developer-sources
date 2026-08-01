package ru.metaculture.protection;

import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.ByteBuffer;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import org.lwjgl.BufferUtils;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.opengl.GL11;

public final class O00000OOOO0O0 {
   private static final O00000OOOO0O0 O00000000 = new O00000OOOO0O0();
   private static final String O000000000 = "assets/wild/shaders/mainmenu/menu_quad.vert";
   private final Map<O00000OOOO00O, O00000OOOO0O0.W311> O0000000000 = new EnumMap<>(O00000OOOO00O.class);
   private final Map<String, O00000OOOO0O0.W311> O00000000000 = new HashMap<>();
   private O00000OOO O000000000000;
   private String O0000000000000;
   private long O000000000000O;
   private int O00000000000O;

   private O00000OOOO0O0() {
   }

   public static O00000OOOO0O0 O00000000() {
      return O00000000;
   }

   public O00000OOO O000000000() {
      if (this.O000000000000 == null) {
         this.O000000000000 = new O00000OOO();
      }

      return this.O000000000000;
   }

   public float O0000000000() {
      if (this.O000000000000O == 0L) {
         this.O000000000000O = System.nanoTime();
         return 0.0F;
      } else {
         return (float)(System.nanoTime() - this.O000000000000O) / 1.0E9F % 720.0F;
      }
   }

   public synchronized O0000O00OO0 O00000000(O00000OOOO00O o00000OOOO00O, O00000OOO00OO0 o00000OOO00OO0) {
      if (o00000OOOO00O != null && o00000OOO00OO0 != null && o00000OOO00OO0.fragmentSource() != null) {
         O00000OOOO0O0.W311 var3 = this.O0000000000.get(o00000OOOO00O);
         String var4 = o00000OOO00OO0.hash();
         if (var3 != null && var3.O00000000 != null && var3.O000000000.equals(var4)) {
            return var3.O00000000;
         } else {
            if (var3 != null && var3.O00000000 != null) {
               var3.O00000000.O000000000();
               var3.O00000000 = null;
            }

            if (var3 == null) {
               var3 = new O00000OOOO0O0.W311();
               this.O0000000000.put(o00000OOOO00O, var3);
            }

            try {
               String var5 = this.O0000000000000();
               var3.O00000000 = new O0000O00OO0(var5, o00000OOO00OO0.fragmentSource());
               var3.O000000000 = var4;
               var3.O0000000000 = o00000OOO00OO0.error();
               return var3.O00000000;
            } catch (Throwable var6) {
               var3.O0000000000 = var6.getMessage() == null ? var6.getClass().getSimpleName() : var6.getMessage();
               var3.O00000000 = null;
               var3.O000000000 = "";
               O00000000OO0OO.O00000000().O000000000("ThemeShaderProgramCache.acquire:" + o00000OOOO00O.O00000000(), var6);
               throw new IllegalStateException("unreachable shader failure", var6);
            }
         }
      } else {
         return null;
      }
   }

   public synchronized O0000O00OO0 O00000000(String string, O00000OOO00OO0 o00000OOO00OO0) {
      String var3 = O00000OOOO0O00.O00000000000OO(string);
      if (!var3.isBlank() && o00000OOO00OO0 != null && o00000OOO00OO0.fragmentSource() != null) {
         O00000OOOO0O0.W311 var4 = this.O00000000000.get(var3);
         String var5 = o00000OOO00OO0.hash();
         if (var4 != null && var4.O00000000 != null && var4.O000000000.equals(var5)) {
            return var4.O00000000;
         } else {
            if (var4 != null && var4.O00000000 != null) {
               var4.O00000000.O000000000();
               var4.O00000000 = null;
            }

            if (var4 == null) {
               var4 = new O00000OOOO0O0.W311();
               this.O00000000000.put(var3, var4);
            }

            try {
               String var6 = this.O0000000000000();
               var4.O00000000 = new O0000O00OO0(var6, o00000OOO00OO0.fragmentSource());
               var4.O000000000 = var5;
               var4.O0000000000 = o00000OOO00OO0.error();
               return var4.O00000000;
            } catch (Throwable var7) {
               var4.O0000000000 = var7.getMessage() == null ? var7.getClass().getSimpleName() : var7.getMessage();
               var4.O00000000 = null;
               var4.O000000000 = "";
               O00000000OO0OO.O00000000().O000000000("ThemeShaderProgramCache.acquire:" + var3, var7);
               throw new IllegalStateException("unreachable shader failure", var7);
            }
         }
      } else {
         return null;
      }
   }

   public synchronized String O00000000(O00000OOOO00O o00000OOOO00O) {
      O00000OOOO0O0.W311 var2 = this.O0000000000.get(o00000OOOO00O);
      return var2 != null && var2.O0000000000 != null ? var2.O0000000000 : "";
   }

   public synchronized String O00000000(String string) {
      O00000OOOO0O0.W311 var2 = this.O00000000000.get(O00000OOOO0O00.O00000000000OO(string));
      return var2 != null && var2.O0000000000 != null ? var2.O0000000000 : "";
   }

   public synchronized String O000000000(O00000OOOO00O o00000OOOO00O) {
      O00000OOOO0O0.W311 var2 = this.O0000000000.get(o00000OOOO00O);
      return var2 == null ? "" : var2.O000000000;
   }

   public synchronized String O000000000(String string) {
      O00000OOOO0O0.W311 var2 = this.O00000000000.get(O00000OOOO0O00.O00000000000OO(string));
      return var2 == null ? "" : var2.O000000000;
   }

   public synchronized void O0000000000(O00000OOOO00O o00000OOOO00O) {
      O00000OOOO0O0.W311 var2 = this.O0000000000.remove(o00000OOOO00O);
      if (var2 != null && var2.O00000000 != null && O000000000000O()) {
         var2.O00000000.O000000000();
         var2.O00000000 = null;
      }
   }

   public synchronized void O0000000000(String string) {
      O00000OOOO0O0.W311 var2 = this.O00000000000.remove(O00000OOOO0O00.O00000000000OO(string));
      if (var2 != null && var2.O00000000 != null && O000000000000O()) {
         var2.O00000000.O000000000();
         var2.O00000000 = null;
      }
   }

   public synchronized void O00000000000() {
      boolean var1 = O000000000000O();

      for (O00000OOOO0O0.W311 var3 : this.O0000000000.values()) {
         if (var3.O00000000 != null && var1) {
            var3.O00000000.O000000000();
         }

         var3.O00000000 = null;
      }

      for (O00000OOOO0O0.W311 var5 : this.O00000000000.values()) {
         if (var5.O00000000 != null && var1) {
            var5.O00000000.O000000000();
         }

         var5.O00000000 = null;
      }

      this.O0000000000.clear();
      this.O00000000000.clear();
      if (this.O000000000000 != null && var1) {
         this.O000000000000.close();
      }

      this.O000000000000 = null;
      if (this.O00000000000O > 0 && var1) {
         GL11.glDeleteTextures(this.O00000000000O);
      }

      this.O00000000000O = 0;
      this.O000000000000O = 0L;
      this.O0000000000000 = null;
   }

   public synchronized int O000000000000() {
      if (this.O00000000000O > 0) {
         return this.O00000000000O;
      } else {
         ByteBuffer var1 = BufferUtils.createByteBuffer(4);
         var1.put((byte)-1).put((byte)-1).put((byte)-1).put((byte)-1).flip();
         this.O00000000000O = GL11.glGenTextures();
         GL11.glBindTexture(3553, this.O00000000000O);
         GL11.glTexParameteri(3553, 10241, 9729);
         GL11.glTexParameteri(3553, 10240, 9729);
         GL11.glTexParameteri(3553, 10242, 33071);
         GL11.glTexParameteri(3553, 10243, 33071);
         GL11.glTexImage2D(3553, 0, 32856, 1, 1, 0, 6408, 5121, var1);
         GL11.glBindTexture(3553, 0);
         return this.O00000000000O;
      }
   }

   private String O0000000000000() {
      if (this.O0000000000000 == null) {
         this.O0000000000000 = O0000O00OO.O00000000("assets/wild/shaders/mainmenu/menu_quad.vert");
      }

      return this.O0000000000000;
   }

   private static boolean O000000000000O() {
      return RenderSystem.isOnRenderThread() && GLFW.glfwGetCurrentContext() != 0L;
   }

   static final class W311 {
      O0000O00OO0 O00000000;
      String O000000000 = "";
      String O0000000000 = "";
   }
}
