package ru.metaculture.protection;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;
import org.lwjgl.opengl.GL13;

public final class UUNUvvnnnVVn {
   private static long UuUVuuUu;
   private static long C00OOC00oO;

   private UUNUvvnnnVVn() {
   }

   public static void UuUVuuUu() {
      long var0 = System.nanoTime();
      if (var0 - UuUVuuUu >= 2000000L) {
         UuUVuuUu = var0;
         vVvUvVVuuNvV();
      }
   }

   public static void C00OOC00oO() {
      vVvUvVVuuNvV();
   }

   private static void vVvUvVVuuNvV() {
      try {
         GL13.glActiveTexture(33984);
         GL11.glPixelStorei(3317, 4);
         GL12.glPixelStorei(3314, 0);
      } catch (Throwable var1) {
      }
   }

   public static void uUnuvNvvNU() {
      long var0 = System.nanoTime();
      if (var0 - C00OOC00oO >= 250000000L) {
         C00OOC00oO = var0;

         try {
            GL13.glActiveTexture(33984);
            GL11.glPixelStorei(3317, 4);
            GL12.glPixelStorei(3314, 0);
            vNvnnVvvVUu.C00OOC00oO();
         } catch (Throwable var3) {
         }
      }
   }
}
