package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.joml.Matrix4f;
import org.joml.Vector3f;

public final class uUuvVvunnNuu {
   private static final float uUnuvNvvNU = 1.0F;
   private static final float vVvUvVVuuNvV = 0.5F;
   private static final float uNNnnnuuuN = 0.82F;
   private static final float nuUnNvnuUu = 0.66F;
   private static final float VVuuUN = 0.86F;
   private static final int vNUvnnVnUvu = 1;
   private final Vector3f uVUuuVnNVU = new Vector3f();
   private final Vector3f vuuuNvNuv = new Vector3f();
   private final Vector3f nvUVNnuu = new Vector3f();
   private final Matrix4f UuuNnUvUuv = new Matrix4f();
   private final float[] nUUVuvU = new float[3];
   private final List<uUuvVvunnNuu.NVnVnNnN> UnUNVVVNuv = new ArrayList<>(256);
   private float vNVuvnUUnuUn;
   private boolean UvnvNVnnnnNU;
   private vvNvVvVUVv uVUVnuvnuVuv;
   private String NVNnnvnuunNv;
   private nvNNvnVvNVU uVunuUNVVUUV;
   private float UNnVVNvvnVvU;
   private float uNnUnnuNUnNu;
   private float NnUuNNU;
   private float nNvNUVU;
   private float UnUNuUU;
   private float uUVuVvuNUvnu;
   public int UuUVuuUu;
   public int C00OOC00oO;

   public void UuUVuuUu(
      UnVNvNnU var1, vvNvVvVUVv var2, String var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, boolean var11
   ) {
      if (var1 != null && var2 != null) {
         this.vNVuvnUUnuUn = var10;
         this.UvnvNVnnnnNU = var11;
         this.uVUVnuvnuVuv = var2;
         this.NVNnnvnuunNv = var3;
         this.uVunuUNVVUUV = nvNNvnVvNVU.UuUVuuUu();
         this.UNnVVNvvnVvU = var4;
         this.uNnUnnuNUnNu = var5;
         this.NnUuNNU = var6;
         this.nNvNUVU = var2.VVuuUN();
         this.UnUNuUU = var2.vNUvnnVnUvu();
         this.uUVuVvuNUvnu = var2.uVUuuVnNVU();
         this.UuuNnUvUuv.identity().rotateX((float)Math.toRadians(var8)).rotateY((float)Math.toRadians(var7));
         this.UnUNVVVNuv.clear();
         Matrix4f var12 = new Matrix4f();

         for (vvNvVvVUVv.NVnVnNnN var14 : var2.vVvUvVVuuNvV()) {
            this.UuUVuuUu(var14, var12);
         }

         this.UnUNVVVNuv.sort(Comparator.comparingDouble(var0 -> var0.uUnuvNvvNU));
         this.UuUVuuUu = this.UnUNVVVNuv.size();
         int var16 = 0;

         for (uUuvVvunnNuu.NVnVnNnN var15 : this.UnUNVVVNuv) {
            if (this.UuUVuuUu(var1, var15, var9)) {
               var16++;
            }
         }

         this.C00OOC00oO = var16;
         this.UnUNVVVNuv.clear();
      }
   }

   private void UuUVuuUu(vvNvVvVUVv.NVnVnNnN var1, Matrix4f var2) {
      Matrix4f var3 = new Matrix4f(var2);
      if (var1.vNUvnnVnUvu()) {
         UuUVuuUu(var3, var1.C00OOC00oO(), var1.uUnuvNvvNU(), var1.vVvUvVVuuNvV(), var1.VVuuUN(), var1.nuUnNvnuUu(), var1.uNNnnnuuuN());
      }

      if (this.UvnvNVnnnnNU && this.UuUVuuUu(var1.UuUVuuUu())) {
         var3.translate(var1.C00OOC00oO(), var1.uUnuvNvvNU(), var1.vVvUvVVuuNvV())
            .rotateZYX(this.nUUVuvU[2], this.nUUVuvU[1], this.nUUVuvU[0])
            .translate(-var1.C00OOC00oO(), -var1.uUnuvNvvNU(), -var1.vVvUvVVuuNvV());
      }

      for (vvNvVvVUVv.nvnNNunvv var5 : var1.vuuuNvNuv()) {
         this.UuUVuuUu(var5, var3);
      }

      for (vvNvVvVUVv.uunvUUVnuNn var8 : var1.nvUVNnuu()) {
         this.UuUVuuUu(var8, var3);
      }

      for (vvNvVvVUVv.NVnVnNnN var9 : var1.uVUuuVnNVU()) {
         this.UuUVuuUu(var9, var3);
      }
   }

   private static void UuUVuuUu(Matrix4f var0, float var1, float var2, float var3, float var4, float var5, float var6) {
      var0.translate(var1, var2, var3)
         .rotateZYX((float)Math.toRadians(var4), (float)Math.toRadians(var5), (float)Math.toRadians(var6))
         .translate(-var1, -var2, -var3);
   }

   private boolean UuUVuuUu(String var1) {
      if (var1 != null && !var1.isEmpty()) {
         String var2 = var1.toLowerCase();
         float var3 = Math.abs(var1.hashCode()) % 1000 * 0.0123F;
         this.nUUVuvU[0] = this.nUUVuvU[1] = this.nUUVuvU[2] = 0.0F;
         if (var2.contains("tail") || var2.startsWith("seg")) {
            this.nUUVuvU[0] = (float)Math.sin(this.vNVuvnUUnuUn * 1.9F + var3) * 0.16F;
            this.nUUVuvU[1] = (float)Math.sin(this.vNVuvnUUnuUn * 1.3F + var3) * 0.1F;
            return true;
         } else if (var2.contains("ear")) {
            float var4 = var2.contains("left") ? 1.0F : -1.0F;
            this.nUUVuvU[2] = var4 * (0.05F + (float)Math.sin(this.vNVuvnUUnuUn * 2.4F + var3) * 0.08F);
            return true;
         } else if (var2.contains("cape") || var2.contains("wing")) {
            this.nUUVuvU[0] = -0.08F + (float)Math.sin(this.vNVuvnUUnuUn * 1.6F + var3) * 0.13F;
            return true;
         } else if (var2.equals("head")) {
            this.nUUVuvU[1] = (float)Math.sin(this.vNVuvnUUnuUn * 0.5F) * 0.1F;
            this.nUUVuvU[0] = (float)Math.sin(this.vNVuvnUUnuUn * 0.4F) * 0.04F;
            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private void UuUVuuUu(vvNvVvVUVv.nvnNNunvv var1, Matrix4f var2) {
      Matrix4f var3 = new Matrix4f(var2);
      if (var1.UnUNVVVNuv()) {
         UuUVuuUu(var3, var1.VVuuUN(), var1.vNUvnnVnUvu(), var1.uVUuuVnNVU(), var1.UuuNnUvUuv(), var1.nvUVNnuu(), var1.vuuuNvNuv());
      }

      float var4 = var1.nUUVuvU();
      float var5 = var1.UuUVuuUu() - var4;
      float var6 = var1.C00OOC00oO() - var4;
      float var7 = var1.uUnuvNvvNU() - var4;
      float var8 = var1.vVvUvVVuuNvV() + var4;
      float var9 = var1.uNNnnnuuuN() + var4;
      float var10 = var1.nuUnNvnuUu() + var4;
      this.UuUVuuUu(var1.UuUVuuUu(0), var3, 0.82F, 0.0F, 0.0F, -1.0F, var8, var9, var7, var5, var9, var7, var5, var6, var7, var8, var6, var7);
      this.UuUVuuUu(var1.UuUVuuUu(2), var3, 0.82F, 0.0F, 0.0F, 1.0F, var5, var9, var10, var8, var9, var10, var8, var6, var10, var5, var6, var10);
      this.UuUVuuUu(var1.UuUVuuUu(1), var3, 0.66F, 1.0F, 0.0F, 0.0F, var8, var9, var10, var8, var9, var7, var8, var6, var7, var8, var6, var10);
      this.UuUVuuUu(var1.UuUVuuUu(3), var3, 0.66F, -1.0F, 0.0F, 0.0F, var5, var9, var7, var5, var9, var10, var5, var6, var10, var5, var6, var7);
      this.UuUVuuUu(var1.UuUVuuUu(4), var3, 1.0F, 0.0F, 1.0F, 0.0F, var5, var9, var7, var8, var9, var7, var8, var9, var10, var5, var9, var10);
      this.UuUVuuUu(var1.UuUVuuUu(5), var3, 0.5F, 0.0F, -1.0F, 0.0F, var5, var6, var10, var8, var6, var10, var8, var6, var7, var5, var6, var7);
   }

   private void UuUVuuUu(
      vvNvVvVUVv.VvunVVUvUNnv var1,
      Matrix4f var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      float var13,
      float var14,
      float var15,
      float var16,
      float var17,
      float var18
   ) {
      if (var1 != null) {
         this.UuUVuuUu(
            var2,
            var1.UuUVuuUu(),
            var3,
            var4,
            var5,
            var6,
            var1.C00OOC00oO(),
            var1.uUnuvNvvNU(),
            var1.vVvUvVVuuNvV(),
            var1.uUnuvNvvNU(),
            var1.vVvUvVVuuNvV(),
            var1.uNNnnnuuuN(),
            var1.C00OOC00oO(),
            var1.uNNnnnuuuN(),
            var7,
            var8,
            var9,
            var10,
            var11,
            var12,
            var13,
            var14,
            var15,
            var16,
            var17,
            var18,
            false
         );
      }
   }

   private void UuUVuuUu(vvNvVvVUVv.uunvUUVnuNn var1, Matrix4f var2) {
      Matrix4f var3 = new Matrix4f(var2);
      var3.translate(var1.UuUVuuUu(), var1.C00OOC00oO(), var1.uUnuvNvvNU());
      if (var1.uVUuuVnNVU()) {
         var3.rotateZYX((float)Math.toRadians(var1.nuUnNvnuUu()), (float)Math.toRadians(var1.uNNnnnuuuN()), (float)Math.toRadians(var1.vVvUvVVuuNvV()));
      }

      for (vvNvVvVUVv.nvUnvV var7 : var1.vNUvnnVnUvu()) {
         int var8 = var7.UuUVuuUu(0);
         int var9 = var7.UuUVuuUu(1);
         int var10 = var7.UuUVuuUu(2);
         int var11 = var7.UuUVuuUu() >= 4 ? var7.UuUVuuUu(3) : var10;
         float var12 = var1.UuUVuuUu(var8);
         float var13 = var1.C00OOC00oO(var8);
         float var14 = var1.uUnuvNvvNU(var8);
         float var15 = var1.UuUVuuUu(var9);
         float var16 = var1.C00OOC00oO(var9);
         float var17 = var1.uUnuvNvvNU(var9);
         float var18 = var1.UuUVuuUu(var10);
         float var19 = var1.C00OOC00oO(var10);
         float var20 = var1.uUnuvNvvNU(var10);
         float var21 = var1.UuUVuuUu(var11);
         float var22 = var1.C00OOC00oO(var11);
         float var23 = var1.uUnuvNvvNU(var11);
         this.vuuuNvNuv.set(var15 - var12, var16 - var13, var17 - var14);
         this.nvUVNnuu.set(var18 - var12, var19 - var13, var20 - var14);
         this.vuuuNvNuv.cross(this.nvUVNnuu);
         float var24 = var7.UuUVuuUu() >= 4 ? 3.0F : 2.0F;
         this.UuUVuuUu(
            var3,
            var7.C00OOC00oO(),
            0.86F,
            this.vuuuNvNuv.x,
            this.vuuuNvNuv.y,
            this.vuuuNvNuv.z,
            var7.C00OOC00oO(0),
            var7.uUnuvNvvNU(0),
            var7.C00OOC00oO(1),
            var7.uUnuvNvvNU(1),
            var7.C00OOC00oO((int)var24),
            var7.uUnuvNvvNU((int)var24),
            var7.C00OOC00oO(var7.UuUVuuUu() >= 4 ? 3 : 2),
            var7.uUnuvNvvNU(var7.UuUVuuUu() >= 4 ? 3 : 2),
            var12,
            var13,
            var14,
            var15,
            var16,
            var17,
            var18,
            var19,
            var20,
            var21,
            var22,
            var23,
            true
         );
      }
   }

   private void UuUVuuUu(
      Matrix4f var1,
      int var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      float var13,
      float var14,
      float var15,
      float var16,
      float var17,
      float var18,
      float var19,
      float var20,
      float var21,
      float var22,
      float var23,
      float var24,
      float var25,
      float var26,
      boolean var27
   ) {
      this.uVUuuVnNVU.set(var4, var5, var6);
      var1.transformDirection(this.uVUuuVnNVU);
      this.UuuNnUvUuv.transformDirection(this.uVUuuVnNVU);
      boolean var28 = this.uVUuuVnNVU.z * 1.0F > 0.02F;
      if (var28 || var27) {
         if (!var28 && var27) {
            var3 *= 0.78F;
         }

         uUuvVvunnNuu.NVnVnNnN var29 = new uUuvVvunnNuu.NVnVnNnN();
         float var30 = 0.0F;
         var30 += this.UuUVuuUu(var1, var15, var16, var17, var29, 0);
         var30 += this.UuUVuuUu(var1, var18, var19, var20, var29, 1);
         var30 += this.UuUVuuUu(var1, var21, var22, var23, var29, 2);
         var30 += this.UuUVuuUu(var1, var24, var25, var26, var29, 3);
         var29.uUnuvNvvNU = var30 * 0.25F * 1.0F;
         var29.vVvUvVVuuNvV = var3;
         vvNvVvVUVv.VUnuUnnuNvVu var31 = this.uVUVnuvnuVuv.UuUVuuUu(var2);
         float var32 = var31 == null ? this.uVUVnuvnuVuv.UuUVuuUu() : var31.uUnuvNvvNU();
         float var33 = var31 == null ? this.uVUVnuvnuVuv.C00OOC00oO() : var31.vVvUvVVuuNvV();
         var29.nuUnNvnuUu = var7 / var32;
         var29.VVuuUN = var8 / var33;
         var29.vNUvnnVnUvu = var11 / var32;
         var29.uVUuuVnNVU = var12 / var33;
         var29.uNNnnnuuuN = this.uVunuUNVVUUV.UuUVuuUu(this.NVNnnvnuunNv, var2, this.uVUVnuvnuVuv);
         this.UnUNVVVNuv.add(var29);
      }
   }

   private float UuUVuuUu(Matrix4f var1, float var2, float var3, float var4, uUuvVvunnNuu.NVnVnNnN var5, int var6) {
      this.uVUuuVnNVU.set(var2, var3, var4);
      var1.transformPosition(this.uVUuuVnNVU);
      this.uVUuuVnNVU.sub(this.nNvNUVU, this.UnUNuUU, this.uUVuVvuNUvnu);
      this.UuuNnUvUuv.transformPosition(this.uVUuuVnNVU);
      var5.UuUVuuUu[var6] = this.UNnVVNvvnVvU + this.uVUuuVnNVU.x * this.NnUuNNU;
      var5.C00OOC00oO[var6] = this.uNnUnnuNUnNu - this.uVUuuVnNVU.y * this.NnUuNNU;
      return this.uVUuuVnNVU.z;
   }

   private boolean UuUVuuUu(UnVNvNnU var1, uUuvVvunnNuu.NVnVnNnN var2, float var3) {
      float var4 = var2.UuUVuuUu[0];
      float var5 = var2.C00OOC00oO[0];
      float var6 = var2.UuUVuuUu[1] - var4;
      float var7 = var2.C00OOC00oO[1] - var5;
      float var8 = var2.UuUVuuUu[3] - var4;
      float var9 = var2.C00OOC00oO[3] - var5;
      if (Math.abs(var6 * var9 - var7 * var8) < 0.05F) {
         return false;
      } else {
         float[] var10 = new float[]{var6, var8, var4, var7, var9, var5, 0.0F, 0.0F, 1.0F};
         var1.C00OOC00oO(var10);

         try {
            if (var2.uNNnnnuuuN > 0) {
               var1.UuUVuuUu(var2.uNNnnnuuuN, 0.0F, 0.0F, 1.0F, 1.0F, var2.nuUnNvnuUu, var2.VVuuUN, var2.vNUvnnVnUvu, var2.uVUuuVnNVU);
               float var11 = (1.0F - var2.vVvUvVVuuNvV) * 0.55F;
               if (var11 > 0.01F) {
                  var1.UuUVuuUu(0.0F, 0.0F, 1.0F, 1.0F, 0.0F, UuUVuuUu(0, 0, 0, Math.round(var11 * 255.0F)));
               }
            } else {
               int var15 = Math.round(205.0F * var2.vVvUvVVuuNvV);
               var1.UuUVuuUu(0.0F, 0.0F, 1.0F, 1.0F, 0.0F, UuUVuuUu(var15, var15, Math.min(255, var15 + 12), 255));
            }
         } finally {
            var1.vNUvnnVnUvu();
         }

         return true;
      }
   }

   private static int UuUVuuUu(int var0, int var1, int var2, int var3) {
      return var3 << 24 | var0 << 16 | var1 << 8 | var2;
   }

   static final class NVnVnNnN {
      final float[] UuUVuuUu = new float[4];
      final float[] C00OOC00oO = new float[4];
      float uUnuvNvvNU;
      float vVvUvVVuuNvV;
      int uNNnnnuuuN;
      float nuUnNvnuUu;
      float VVuuUN;
      float vNUvnnVnUvu;
      float uVUuuVnNVU;
   }
}
