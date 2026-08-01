package ru.metaculture.protection;

import com.mojang.blaze3d.systems.RenderSystem;
import java.io.DataOutputStream;
import java.io.IOException;
import org.joml.Matrix4f;

public final class O00000000OO00 {
   private O00000000OO00() {
   }

   static boolean O00000000(O00000000OO o00000000OO) {
      try {
         Matrix4f var1 = RenderSystem.getModelViewMatrix();
         long var2 = O00000000(var1);
         if (o00000000OO != null) {
            o00000000OO.O000000000(var2);
         }

         return O000000000(var1);
      } catch (Throwable var4) {
         if (o00000000OO != null) {
            o00000000OO.O00000000(-1160725808);
         }

         return false;
      }
   }

   static void O00000000(DataOutputStream dataOutputStream) throws IOException {
      try {
         Matrix4f var1 = RenderSystem.getModelViewMatrix();
         dataOutputStream.writeLong(O00000000(var1));
         dataOutputStream.writeBoolean(O000000000(var1));
         dataOutputStream.writeFloat(var1.m00());
         dataOutputStream.writeFloat(var1.m01());
         dataOutputStream.writeFloat(var1.m02());
         dataOutputStream.writeFloat(var1.m03());
         dataOutputStream.writeFloat(var1.m10());
         dataOutputStream.writeFloat(var1.m11());
         dataOutputStream.writeFloat(var1.m12());
         dataOutputStream.writeFloat(var1.m13());
         dataOutputStream.writeFloat(var1.m20());
         dataOutputStream.writeFloat(var1.m21());
         dataOutputStream.writeFloat(var1.m22());
         dataOutputStream.writeFloat(var1.m23());
         dataOutputStream.writeFloat(var1.m30());
         dataOutputStream.writeFloat(var1.m31());
         dataOutputStream.writeFloat(var1.m32());
         dataOutputStream.writeFloat(var1.m33());
      } catch (Throwable var3) {
         dataOutputStream.writeLong(0L);
         dataOutputStream.writeBoolean(false);

         for (int var2 = 0; var2 < 16; var2++) {
            dataOutputStream.writeFloat(Float.NaN);
         }
      }
   }

   static long O00000000(Matrix4f matrix4f) {
      if (matrix4f == null) {
         return 0L;
      } else {
         long var1 = -3750763034362895579L;
         var1 = O00000000(var1, matrix4f.m00());
         var1 = O00000000(var1, matrix4f.m01());
         var1 = O00000000(var1, matrix4f.m02());
         var1 = O00000000(var1, matrix4f.m03());
         var1 = O00000000(var1, matrix4f.m10());
         var1 = O00000000(var1, matrix4f.m11());
         var1 = O00000000(var1, matrix4f.m12());
         var1 = O00000000(var1, matrix4f.m13());
         var1 = O00000000(var1, matrix4f.m20());
         var1 = O00000000(var1, matrix4f.m21());
         var1 = O00000000(var1, matrix4f.m22());
         var1 = O00000000(var1, matrix4f.m23());
         var1 = O00000000(var1, matrix4f.m30());
         var1 = O00000000(var1, matrix4f.m31());
         var1 = O00000000(var1, matrix4f.m32());
         return O00000000(var1, matrix4f.m33());
      }
   }

   private static long O00000000(long l, float f) {
      l ^= Float.floatToRawIntBits(f);
      return l * 1099511628211L;
   }

   private static boolean O000000000(Matrix4f matrix4f) {
      return matrix4f != null
         && O00000000(matrix4f.m00())
         && O00000000(matrix4f.m01())
         && O00000000(matrix4f.m02())
         && O00000000(matrix4f.m03())
         && O00000000(matrix4f.m10())
         && O00000000(matrix4f.m11())
         && O00000000(matrix4f.m12())
         && O00000000(matrix4f.m13())
         && O00000000(matrix4f.m20())
         && O00000000(matrix4f.m21())
         && O00000000(matrix4f.m22())
         && O00000000(matrix4f.m23())
         && O00000000(matrix4f.m30())
         && O00000000(matrix4f.m31())
         && O00000000(matrix4f.m32())
         && O00000000(matrix4f.m33());
   }

   private static boolean O00000000(float f) {
      return !Float.isNaN(f) && !Float.isInfinite(f);
   }
}
