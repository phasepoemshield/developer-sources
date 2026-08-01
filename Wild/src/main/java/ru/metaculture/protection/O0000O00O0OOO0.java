package ru.metaculture.protection;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;
import org.lwjgl.system.MemoryStack;

public final class O0000O00O0OOO0 {
   private static final int O00000000 = 32;

   private O0000O00O0OOO0() {
   }

   public static O0000O00O0OOO0.W373 O00000000() {
      O0000O00O0OOO0.W373 var0 = new O0000O00O0OOO0.W373();
      MemoryStack var1 = MemoryStack.stackPush();

      try {
         IntBuffer var2 = var1.mallocInt(16);
         ByteBuffer var3 = var1.malloc(4);
         GL11.glGetIntegerv(36006, var2);
         var0.O00000000 = var2.get(0);
         GL11.glGetIntegerv(36010, var2);
         var0.O000000000 = var2.get(0);
         GL11.glGetIntegerv(3073, var2);
         var0.O0000000000 = var2.get(0);
         GL11.glGetIntegerv(3074, var2);
         var0.O00000000000 = var2.get(0);
         GL11.glGetIntegerv(35725, var2);
         var0.O000000000O000 = var2.get(0);
         GL11.glGetIntegerv(34229, var2);
         var0.O000000000O00O = var2.get(0);
         GL11.glGetIntegerv(34964, var2);
         var0.O000000000O0O = var2.get(0);
         GL11.glGetIntegerv(34965, var2);
         var0.O000000000O0O0 = var2.get(0);
         GL11.glGetIntegerv(34016, var2);
         int var4 = var2.get(0);
         var0.O000000000O0OO = var4 == 0 ? '蓀' : var4;

         for (int var5 = 0; var5 < 32; var5++) {
            GL13.glActiveTexture(33984 + var5);
            GL11.glGetIntegerv(32873, var2);
            var0.O000000000OO0[var5] = var2.get(0);
         }

         GL13.glActiveTexture(var0.O000000000O0OO);
         int var8 = var0.O000000000O0OO - 33984;
         var0.O000000000OO = var8 >= 0 && var8 < 32 ? var0.O000000000OO0[var8] : 0;
         GL11.glGetIntegerv(3317, var2);
         var0.O000000000OO00 = var2.get(0) == 0 ? 4 : var2.get(0);
         GL11.glGetIntegerv(2978, var2);
         var0.O000000000000[0] = var2.get(0);
         var0.O000000000000[1] = var2.get(1);
         var0.O000000000000[2] = var2.get(2);
         var0.O000000000000[3] = var2.get(3);
         GL11.glGetIntegerv(3088, var2);
         var0.O000000000000O[0] = var2.get(0);
         var0.O000000000000O[1] = var2.get(1);
         var0.O000000000000O[2] = var2.get(2);
         var0.O000000000000O[3] = var2.get(3);
         GL11.glGetIntegerv(32969, var2);
         var0.O0000000000O0 = var2.get(0);
         GL11.glGetIntegerv(32968, var2);
         var0.O0000000000O00 = var2.get(0);
         GL11.glGetIntegerv(32971, var2);
         var0.O0000000000O0O = var2.get(0);
         GL11.glGetIntegerv(32970, var2);
         var0.O0000000000OO = var2.get(0);
         GL11.glGetBooleanv(3107, var3);
         var0.O0000000000OO0 = var3.get(0) != 0;
         var0.O0000000000OOO = var3.get(1) != 0;
         var0.O000000000O = var3.get(2) != 0;
         var0.O000000000O0 = var3.get(3) != 0;
         GL11.glGetBooleanv(2930, var3);
         var0.O000000000O00 = var3.get(0) != 0;
         var0.O00000000000OO = GL11.glIsEnabled(3042);
         var0.O00000000000O = GL11.glIsEnabled(2929);
         var0.O00000000000O0 = GL11.glIsEnabled(2884);
         var0.O0000000000000 = GL11.glIsEnabled(3089);
         var0.O0000000000O = GL11.glIsEnabled(36281);
      } catch (Throwable var7) {
         if (var1 != null) {
            try {
               var1.close();
            } catch (Throwable var6) {
               var7.addSuppressed(var6);
            }
         }

         throw var7;
      }

      if (var1 != null) {
         var1.close();
      }

      return var0;
   }

   public static void O00000000(O0000O00O0OOO0.W373 o00000000) {
      if (o00000000 != null) {
         int var1 = O00000000(o00000000.O00000000);
         int var2 = o00000000.O000000000 == o00000000.O00000000 ? var1 : O00000000(o00000000.O000000000);
         GL30.glBindFramebuffer(36009, var1);
         GL30.glBindFramebuffer(36008, var2);
         GL11.glDrawBuffer(O000000000(var1, o00000000.O0000000000));
         GL11.glReadBuffer(O0000000000(var2, o00000000.O00000000000));
         GL20.glUseProgram(o00000000.O000000000O000);
         GL30.glBindVertexArray(o00000000.O000000000O00O);
         GL15.glBindBuffer(34962, o00000000.O000000000O0O);
         GL15.glBindBuffer(34963, o00000000.O000000000O0O0);

         for (int var3 = 0; var3 < 32; var3++) {
            GL13.glActiveTexture(33984 + var3);
            GL11.glBindTexture(3553, o00000000.O000000000OO0[var3]);
         }

         GL13.glActiveTexture(o00000000.O000000000O0OO);
         GL11.glPixelStorei(3317, o00000000.O000000000OO00);
         O00000000(3042, o00000000.O00000000000OO);
         O00000000(2929, o00000000.O00000000000O);
         O00000000(2884, o00000000.O00000000000O0);
         O00000000(3089, o00000000.O0000000000000);
         O00000000(36281, o00000000.O0000000000O);
         GL14.glBlendFuncSeparate(o00000000.O0000000000O0, o00000000.O0000000000O00, o00000000.O0000000000O0O, o00000000.O0000000000OO);
         GL11.glColorMask(o00000000.O0000000000OO0, o00000000.O0000000000OOO, o00000000.O000000000O, o00000000.O000000000O0);
         GL11.glDepthMask(o00000000.O000000000O00);
         GL11.glViewport(o00000000.O000000000000[0], o00000000.O000000000000[1], o00000000.O000000000000[2], o00000000.O000000000000[3]);
         GL11.glScissor(o00000000.O000000000000O[0], o00000000.O000000000000O[1], o00000000.O000000000000O[2], o00000000.O000000000000O[3]);
      }
   }

   public static boolean O00000000(int i, int j) {
      int var2 = O00000000(j);
      GL30.glBindFramebuffer(i, var2);
      return var2 == j;
   }

   public static int O00000000(int i) {
      if (i <= 0) {
         return 0;
      } else {
         try {
            return GL30.glIsFramebuffer(i) ? i : 0;
         } catch (Throwable var2) {
            return 0;
         }
      }
   }

   private static int O000000000(int i, int j) {
      return i == 0 && j != 1029 && j != 1028 && j != 1032 ? 1029 : j;
   }

   private static int O0000000000(int i, int j) {
      return i == 0 && j != 1029 && j != 1028 && j != 1032 ? 1029 : j;
   }

   private static void O00000000(int i, boolean bl) {
      if (bl) {
         GL11.glEnable(i);
      } else {
         GL11.glDisable(i);
      }
   }

   public static final class W373 {
      public int O00000000;
      public int O000000000;
      public int O0000000000;
      public int O00000000000;
      public final int[] O000000000000 = new int[4];
      public boolean O0000000000000;
      public final int[] O000000000000O = new int[4];
      public boolean O00000000000O;
      public boolean O00000000000O0;
      public boolean O00000000000OO;
      public boolean O0000000000O;
      public int O0000000000O0;
      public int O0000000000O00;
      public int O0000000000O0O;
      public int O0000000000OO;
      public boolean O0000000000OO0;
      public boolean O0000000000OOO;
      public boolean O000000000O;
      public boolean O000000000O0;
      public boolean O000000000O00;
      public int O000000000O000;
      public int O000000000O00O;
      public int O000000000O0O;
      public int O000000000O0O0;
      public int O000000000O0OO;
      public int O000000000OO;
      public final int[] O000000000OO0 = new int[32];
      public int O000000000OO00;
   }
}
