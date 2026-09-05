package ru.metaculture.protection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;
import net.minecraft.class_243;
import net.minecraft.class_4184;
import net.minecraft.class_4588;
import net.minecraft.class_4587.class_4665;
import org.joml.Matrix3f;
import org.joml.Matrix4f;
import org.joml.Vector3f;

public final class nvNUnuU {
   private static final float UuUVuuUu = 1.0E-6F;
   private final class_4184 C00OOC00oO;
   private final Matrix4f uUnuvNvvNU;
   private final Matrix3f vVvUvVVuuNvV;
   private final class_4588 uNNnnnuuuN;
   private final class_243 nuUnNvnuUu;

   public nvNUnuU(VUVnuvunnvuV var1, class_4665 var2, class_4588 var3) {
      this(Objects.requireNonNull(var1, "renderer").UuUVuuUu(), var2, var3);
   }

   public nvNUnuU(class_4184 var1, class_4665 var2, class_4588 var3) {
      this.C00OOC00oO = Objects.requireNonNull(var1, "camera");
      Objects.requireNonNull(var2, "entry");
      this.uNNnnnuuuN = Objects.requireNonNull(var3, "consumer");
      this.nuUnNvnuUu = this.C00OOC00oO.method_19326();
      this.uUnuvNvvNU = new Matrix4f(var2.method_23761());
      this.vVvUvVVuuNvV = new Matrix3f(var2.method_23762());
   }

   public void UuUVuuUu(class_243 var1, class_243 var2, class_243 var3, class_243 var4, int var5) {
      this.UuUVuuUu(var1, var2, var3, var4, var5, var5, var5, var5);
   }

   public void UuUVuuUu(class_243 var1, class_243 var2, class_243 var3, class_243 var4, int var5, int var6, int var7, int var8) {
      Objects.requireNonNull(var1, "v0");
      Objects.requireNonNull(var2, "v1");
      Objects.requireNonNull(var3, "v2");
      Objects.requireNonNull(var4, "v3");
      this.UuUVuuUu(var1, var5);
      this.UuUVuuUu(var2, var6);
      this.UuUVuuUu(var3, var7);
      this.UuUVuuUu(var4, var8);
   }

   public void UuUVuuUu(
      double var1,
      double var3,
      double var5,
      double var7,
      double var9,
      double var11,
      double var13,
      double var15,
      double var17,
      double var19,
      double var21,
      double var23,
      int var25
   ) {
      this.UuUVuuUu(
         new class_243(var1, var3, var5), new class_243(var7, var9, var11), new class_243(var13, var15, var17), new class_243(var19, var21, var23), var25
      );
   }

   public void UuUVuuUu(
      double var1,
      double var3,
      double var5,
      double var7,
      double var9,
      double var11,
      double var13,
      double var15,
      double var17,
      double var19,
      double var21,
      double var23,
      float var25,
      float var26,
      float var27,
      float var28,
      float var29,
      float var30,
      float var31,
      float var32,
      int var33
   ) {
      this.UuUVuuUu(
         new class_243(var1, var3, var5),
         new class_243(var7, var9, var11),
         new class_243(var13, var15, var17),
         new class_243(var19, var21, var23),
         var25,
         var26,
         var27,
         var28,
         var29,
         var30,
         var31,
         var32,
         var33
      );
   }

   public void UuUVuuUu(class_243 var1, class_243 var2, int var3) {
      Objects.requireNonNull(var1, "min");
      Objects.requireNonNull(var2, "max");
      if (!(var1.field_1352 > var2.field_1352) && !(var1.field_1351 > var2.field_1351) && !(var1.field_1350 > var2.field_1350)) {
         class_243 var4 = new class_243(var1.field_1352, var1.field_1351, var1.field_1350);
         class_243 var5 = new class_243(var1.field_1352, var1.field_1351, var2.field_1350);
         class_243 var6 = new class_243(var1.field_1352, var2.field_1351, var1.field_1350);
         class_243 var7 = new class_243(var1.field_1352, var2.field_1351, var2.field_1350);
         class_243 var8 = new class_243(var2.field_1352, var1.field_1351, var1.field_1350);
         class_243 var9 = new class_243(var2.field_1352, var1.field_1351, var2.field_1350);
         class_243 var10 = new class_243(var2.field_1352, var2.field_1351, var1.field_1350);
         class_243 var11 = new class_243(var2.field_1352, var2.field_1351, var2.field_1350);
         this.UuUVuuUu(var4, var8, var10, var6, var3);
         this.UuUVuuUu(var5, var7, var11, var9, var3);
         this.UuUVuuUu(var4, var5, var9, var8, var3);
         this.UuUVuuUu(var6, var10, var11, var7, var3);
         this.UuUVuuUu(var4, var6, var7, var5, var3);
         this.UuUVuuUu(var8, var9, var11, var10, var3);
      } else {
         throw new IllegalArgumentException("Minimum corner must be less than or equal to maximum corner.");
      }
   }

   public void C00OOC00oO(class_243 var1, class_243 var2, int var3) {
      this.UuUVuuUu(var1, var2, var3, var3);
   }

   public void UuUVuuUu(class_243 var1, class_243 var2, int var3, int var4) {
      Objects.requireNonNull(var1, "start");
      Objects.requireNonNull(var2, "end");
      Vector3f var5 = this.UuUVuuUu(var1, var2);
      this.UuUVuuUu(var1, var3, var5);
      this.UuUVuuUu(var2, var4, var5);
   }

   public void UuUVuuUu(
      class_243 var1,
      class_243 var2,
      class_243 var3,
      class_243 var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      int var13
   ) {
      this.UuUVuuUu(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var13, var13, var13);
   }

   public void UuUVuuUu(
      class_243 var1,
      class_243 var2,
      class_243 var3,
      class_243 var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      int var13,
      int var14,
      int var15,
      int var16
   ) {
      Objects.requireNonNull(var1, "v0");
      Objects.requireNonNull(var2, "v1");
      Objects.requireNonNull(var3, "v2");
      Objects.requireNonNull(var4, "v3");
      this.UuUVuuUu(var1, var5, var6, var13);
      this.UuUVuuUu(var2, var7, var8, var14);
      this.UuUVuuUu(var3, var9, var10, var15);
      this.UuUVuuUu(var4, var11, var12, var16);
   }

   private void UuUVuuUu(class_243 var1, int var2) {
      class_243 var3 = this.UuUVuuUu(var1);
      class_4588 var4 = this.uNNnnnuuuN.method_22918(this.uUnuvNvvNU, (float)var3.field_1352, (float)var3.field_1351, (float)var3.field_1350);
      var4.method_1336(VvUNvVNnuUNU.C00OOC00oO(var2), VvUNvVNnuUNU.uUnuvNvvNU(var2), VvUNvVNnuUNU.vVvUvVVuuNvV(var2), VvUNvVNnuUNU.UuUVuuUu(var2));
      this.UuUVuuUu(var4);
   }

   private void UuUVuuUu(class_243 var1, float var2, float var3, int var4) {
      class_243 var5 = this.UuUVuuUu(var1);
      class_4588 var6 = this.uNNnnnuuuN.method_22918(this.uUnuvNvvNU, (float)var5.field_1352, (float)var5.field_1351, (float)var5.field_1350);
      var6.method_22913(var2, var3);
      var6.method_1336(VvUNvVNnuUNU.C00OOC00oO(var4), VvUNvVNnuUNU.uUnuvNvvNU(var4), VvUNvVNnuUNU.vVvUvVVuuNvV(var4), VvUNvVNnuUNU.UuUVuuUu(var4));
      this.UuUVuuUu(var6);
   }

   private void UuUVuuUu(class_243 var1, int var2, Vector3f var3) {
      class_243 var4 = this.UuUVuuUu(var1);
      class_4588 var5 = this.uNNnnnuuuN.method_22918(this.uUnuvNvvNU, (float)var4.field_1352, (float)var4.field_1351, (float)var4.field_1350);
      var5.method_1336(VvUNvVNnuUNU.C00OOC00oO(var2), VvUNvVNnuUNU.uUnuvNvvNU(var2), VvUNvVNnuUNU.vVvUvVVuuNvV(var2), VvUNvVNnuUNU.UuUVuuUu(var2));
      var5.method_22914(var3.x, var3.y, var3.z);
      this.UuUVuuUu(var5);
   }

   private void UuUVuuUu(class_4588 var1) {
      Objects.requireNonNull(var1, "vertex");

      try {
         Method var2 = var1.getClass().getMethod("next");
         var2.invoke(var1);
      } catch (NoSuchMethodException var5) {
      } catch (IllegalAccessException var6) {
         throw new IllegalStateException("Unable to access vertex finalization method", var6);
      } catch (InvocationTargetException var7) {
         Throwable var3 = var7.getCause();
         if (var3 instanceof RuntimeException var8) {
            throw var8;
         }

         if (var3 instanceof Error var4) {
            throw var4;
         }

         throw new IllegalStateException("Vertex finalization failed", var3);
      }
   }

   private class_243 UuUVuuUu(class_243 var1) {
      return var1.method_1020(this.nuUnNvnuUu);
   }

   private Vector3f UuUVuuUu(class_243 var1, class_243 var2) {
      class_243 var3 = var2.method_1020(var1);
      Vector3f var4 = new Vector3f((float)var3.field_1352, (float)var3.field_1351, (float)var3.field_1350);
      if (var4.lengthSquared() <= 1.0E-6F) {
         var4.set(0.0F, 1.0F, 0.0F);
      }

      var4.normalize();
      this.vVvUvVVuuNvV.transform(var4);
      if (var4.lengthSquared() <= 1.0E-6F) {
         var4.set(0.0F, 1.0F, 0.0F);
      }

      var4.normalize();
      return var4;
   }
}
