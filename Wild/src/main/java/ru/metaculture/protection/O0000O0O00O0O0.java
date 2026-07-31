package ru.metaculture.protection;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;
import org.lwjgl.opengl.GL13;

public final class O0000O0O00O0O0 {
   private static long O00000000;
   private static long O000000000;

   private O0000O0O00O0O0() {
   }

   public static void O00000000() {
      long var0 = System.nanoTime();
      if (var0 - O00000000 >= 2000000L) {
         O00000000 = var0;
         O00000000000();
      }
   }

   public static void O000000000() {
      O00000000000();
   }

   private static void O00000000000() {
      try {
         GL13.glActiveTexture(33984);
         GL11.glPixelStorei(3317, 4);
         GL12.glPixelStorei(3314, 0);
      } catch (Throwable var1) {
      }
   }

   public static void O0000000000() {
      long var0 = System.nanoTime();
      if (var0 - O000000000 >= 250000000L) {
         O000000000 = var0;

         try {
            GL13.glActiveTexture(33984);
            GL11.glPixelStorei(3317, 4);
            GL12.glPixelStorei(3314, 0);
            FontRegistry.O000000000();
         } catch (Throwable var3) {
         }
      }
   }
}
