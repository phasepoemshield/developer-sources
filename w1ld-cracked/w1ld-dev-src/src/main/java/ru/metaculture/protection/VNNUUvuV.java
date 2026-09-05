package ru.metaculture.protection;

import com.mojang.blaze3d.systems.RenderSystem;
import java.io.DataOutputStream;
import java.io.IOException;
import org.joml.Matrix4f;

public final class VNNUUvuV {
   private VNNUUvuV() {
   }

   static boolean UuUVuuUu(unVnUnVv var0) {
      try {
         Matrix4f var1 = RenderSystem.getModelViewMatrix();
         long var2 = UuUVuuUu(var1);
         if (var0 != null) {
            var0.C00OOC00oO(var2);
         }

         return C00OOC00oO(var1);
      } catch (Throwable var4) {
         if (var0 != null) {
            var0.UuUVuuUu(-1160725808);
         }

         return false;
      }
   }

   static void UuUVuuUu(DataOutputStream var0) throws IOException {
      try {
         Matrix4f var1 = RenderSystem.getModelViewMatrix();
         var0.writeLong(UuUVuuUu(var1));
         var0.writeBoolean(C00OOC00oO(var1));
         var0.writeFloat(var1.m00());
         var0.writeFloat(var1.m01());
         var0.writeFloat(var1.m02());
         var0.writeFloat(var1.m03());
         var0.writeFloat(var1.m10());
         var0.writeFloat(var1.m11());
         var0.writeFloat(var1.m12());
         var0.writeFloat(var1.m13());
         var0.writeFloat(var1.m20());
         var0.writeFloat(var1.m21());
         var0.writeFloat(var1.m22());
         var0.writeFloat(var1.m23());
         var0.writeFloat(var1.m30());
         var0.writeFloat(var1.m31());
         var0.writeFloat(var1.m32());
         var0.writeFloat(var1.m33());
      } catch (Throwable var3) {
         var0.writeLong(0L);
         var0.writeBoolean(false);

         for (int var2 = 0; var2 < 16; var2++) {
            var0.writeFloat(Float.NaN);
         }
      }
   }

   static long UuUVuuUu(Matrix4f var0) {
      if (var0 == null) {
         return 0L;
      } else {
         long var1 = -3750763034362895579L;
         var1 = UuUVuuUu(var1, var0.m00());
         var1 = UuUVuuUu(var1, var0.m01());
         var1 = UuUVuuUu(var1, var0.m02());
         var1 = UuUVuuUu(var1, var0.m03());
         var1 = UuUVuuUu(var1, var0.m10());
         var1 = UuUVuuUu(var1, var0.m11());
         var1 = UuUVuuUu(var1, var0.m12());
         var1 = UuUVuuUu(var1, var0.m13());
         var1 = UuUVuuUu(var1, var0.m20());
         var1 = UuUVuuUu(var1, var0.m21());
         var1 = UuUVuuUu(var1, var0.m22());
         var1 = UuUVuuUu(var1, var0.m23());
         var1 = UuUVuuUu(var1, var0.m30());
         var1 = UuUVuuUu(var1, var0.m31());
         var1 = UuUVuuUu(var1, var0.m32());
         return UuUVuuUu(var1, var0.m33());
      }
   }

   private static long UuUVuuUu(long var0, float var2) {
      var0 ^= Float.floatToRawIntBits(var2);
      return var0 * 1099511628211L;
   }

   private static boolean C00OOC00oO(Matrix4f var0) {
      return var0 != null
         && UuUVuuUu(var0.m00())
         && UuUVuuUu(var0.m01())
         && UuUVuuUu(var0.m02())
         && UuUVuuUu(var0.m03())
         && UuUVuuUu(var0.m10())
         && UuUVuuUu(var0.m11())
         && UuUVuuUu(var0.m12())
         && UuUVuuUu(var0.m13())
         && UuUVuuUu(var0.m20())
         && UuUVuuUu(var0.m21())
         && UuUVuuUu(var0.m22())
         && UuUVuuUu(var0.m23())
         && UuUVuuUu(var0.m30())
         && UuUVuuUu(var0.m31())
         && UuUVuuUu(var0.m32())
         && UuUVuuUu(var0.m33());
   }

   private static boolean UuUVuuUu(float var0) {
      return !Float.isNaN(var0) && !Float.isInfinite(var0);
   }
}
