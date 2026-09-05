package ru.metaculture.protection;

import net.minecraft.class_10055;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_4597;
import net.minecraft.class_5498;
import net.minecraft.class_591;
import net.minecraft.class_630;
import net.minecraft.class_4587.class_4665;
import org.joml.Matrix3f;
import org.joml.Matrix4f;
import org.joml.Quaternionf;
import org.joml.Vector3f;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "ChinaHat",
   C00OOC00oO = "Добавляет над головой игроков декоративную шляпу в виде конуса, которая будет повторять цветовую схему выбранной темы.",
   uUnuvNvvNU = oOOOo0.Visuals
)
public final class ChinaHat extends Module {
   private static final float NVNnnvnuunNv = 0.0625F;
   private static final Cc0cOoOcC0o uVunuUNVVUUV = new Cc0cOoOcC0o(0.066F, 0.68F, 0.001F, 0.001F);
   private static final int[] UNnVVNvvnVvU = new int[]{16747247, 16754396, 8648959, 11141102, 16747247};
   private static final int[] uNnUnnuNUnNu = new int[]{6750183, 6014975, 4688895, 11730932, 6750183};
   private static final int[] NnUuNNU = new int[]{16773227, 16751954, 16736157, 9304063, 16773227};
   private static final int[] nNvNUVU = new int[]{11141048, 6485458, 8228095, 16755188, 11141048};
   private static final int[] UnUNuUU = new int[]{8257383, 3405823, 16773210, 16727538, 8257383};
   private static final int[] uUVuVvuNUvnu = new int[]{16754632, 16769167, 11000063, 14067711, 16754632};
   private static final int[] UvUvUNuvNU = new int[]{8033279, 11561983, 5963734, 16736142, 8033279};
   private static final int[] c0oOOCcCoC0 = new int[]{16757594, 16739146, 16732041, 13995263, 16757594};
   private static final int[] VVnVNnunVvu = new int[]{14089215, 9169663, 9149951, 16777215, 14089215};
   private static final int[] unNNVVNnvvV = new int[]{16736109, 16770140, 6160312, 7179519, 16736109};
   private static final int[] NuunnvnN = new int[]{14001919, 16752603, 7733222, 16773260, 14001919};
   private static final int[] NVUunUNUN = new int[]{13172552, 16773466, 3732223, 16735457, 13172552};
   private final UUNnvUVnnnnN UUVNuUNUvUnV = new UUNnvUVnnnnN(0.0F);
   private final Matrix4f vuvnUnVnUNnV = new Matrix4f();
   private final Matrix3f nnuUVNUuvvVU = new Matrix3f();
   private final Matrix4f nVVUuvuNnUN = new Matrix4f();
   private final Matrix3f nNnVnUNVV = new Matrix3f();
   private final Matrix4f nuunNvv = new Matrix4f();
   private final Matrix4f uUVVvVVNvvn = new Matrix4f();
   private final Quaternionf vvUVNVvvNUv = new Quaternionf();
   private final Vector3f UuNnnVnuNNV = new Vector3f();
   private final Vector3f uUVvnUuNvvN = new Vector3f();
   private final Vector3f UUuUnNVNuuv = new Vector3f();
   private final Vector3f NVuNUuVnVUN = new Vector3f();
   private final Vector3f NVuunNnvvvVu = new Vector3f();
   private final Vector3f vNnNuuvVn = new Vector3f();
   private final Vector3f VUuuVUnun = new Vector3f();
   private final Vector3f vVVuuVVv = new Vector3f();
   private final ChinaHat.nvnNNunvv VuunNUUUvu = new ChinaHat.nvnNNunvv();
   private final ChinaHat.VvunVVUvUNnv NNUUNUuVNNVn = new ChinaHat.VvunVVUvUNnv();
   private static final nnUunvvNUNU VvVvnNUnvuvV = new nnUunvvNUNU();
   private static boolean ccOO0COcoco0;
   private boolean NUVvUUVuVNVv;
   private float nNuVunNUVu;
   private float UNvvunVVn;
   private float UnvuVuVnNuvu;
   private float UvNNVUVNVuvV;
   private float NnunUUnU;
   private float nvuVvuNnNUnv;
   private float NnVnNVN;

   public ChinaHat() {
      uvuvNuUnNVuu.UuUVuuUu();
   }

   @Override
   public void UuUVuuUu() {
      this.UUVNuUNUvUnV.UuUVuuUu(0.0F);
      VvVvnNUnvuvV.vVvUvVVuuNvV();
      this.NUVvUUVuVNVv = false;
      super.UuUVuuUu();
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void C00OOC00oO() {
      boolean var58 = false /* VF: Semaphore variable */;

      try {
         var58 = true;
         this.UUVNuUNUvUnV.UuUVuuUu(0.0F);
         var58 = false;
      } finally {
         if (var58) {
            try {
               VvVvnNUnvuvV.vVvUvVVuuNvV();
            } finally {
               try {
                  super.C00OOC00oO();
               } finally {
                  uvuvNuUnNVuu.VVuuUN();
               }
            }
         }
      }

      boolean var30 = false /* VF: Semaphore variable */;

      try {
         var30 = true;
         VvVvnNUnvuvV.vVvUvVVuuNvV();
         var30 = false;
      } finally {
         if (var30) {
            boolean var22 = false /* VF: Semaphore variable */;

            try {
               var22 = true;
               super.C00OOC00oO();
               var22 = false;
            } finally {
               if (var22) {
                  uvuvNuUnNVuu.VVuuUN();
               }
            }

            uvuvNuUnNVuu.VVuuUN();
         }
      }

      try {
         super.C00OOC00oO();
      } finally {
         uvuvNuUnNVuu.VVuuUN();
      }
   }

   public static void UuuNnUvUuv() {
      VvVvnNUnvuvV.UuUVuuUu();
   }

   public static void UuUVuuUu(class_10055 var0, class_591 var1, class_4587 var2, class_4597 var3, int var4) {
      if (ru.metaculture.protection.NVnVnNnN.UuUVuuUu != null && ru.metaculture.protection.NVnVnNnN.UuUVuuUu.C00OOC00oO != null) {
         ChinaHat var5 = ru.metaculture.protection.NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu(ChinaHat.class);
         if (var5 != null) {
            var5.UuUVuuUu(var0, var1, var2, var3);
         }
      }
   }

   private void UuUVuuUu(class_10055 var1, class_591 var2, class_4587 var3, class_4597 var4) {
      if (this.nuUnNvnuUu
         && uUnuvNvvNU != null
         && uUnuvNvvNU.field_1687 != null
         && uUnuvNvvNU.field_1724 != null
         && var1 != null
         && var2 != null
         && var3 != null
         && var4 != null) {
         if (var1.field_53528 == uUnuvNvvNU.field_1724.method_5628()) {
            if (uUnuvNvvNU.field_1690.method_31044() != class_5498.field_26664) {
               if (!var1.field_53542 && !var1.field_53333 && !var1.field_53461) {
                  if (NnuVnuNVV.uNNnnnuuuN()) {
                     float var5 = this.UUVNuUNUvUnV.UuUVuuUu(1.0F, uVunuUNVVUUV);
                     if (!(var5 <= 0.001F)) {
                        this.NNUUNUuVNNVn.UuUVuuUu(var1.field_53328);
                        this.UuUVuuUu(var2.field_3398, var3.method_23760());
                        this.nNuVunNUVu = this.NNUUNUuVNNVn.UuUVuuUu.UuUVuuUu;
                        this.UNvvunVVn = this.NNUUNUuVNNVn.UuUVuuUu.C00OOC00oO;
                        this.UnvuVuVnNuvu = this.NNUUNUuVNNVn.UuUVuuUu.uUnuvNvvNU;
                        this.UvNNVUVNVuvV = this.NNUUNUuVNNVn.C00OOC00oO.UuUVuuUu;
                        this.NnunUUnU = this.NNUUNUuVNNVn.C00OOC00oO.C00OOC00oO;
                        this.nvuVvuNnNUnv = this.NNUUNUuVNNVn.C00OOC00oO.uUnuvNvvNU;
                        this.NnVnNVN = var5;
                        VvVvnNUnvuvV.C00OOC00oO();
                     }
                  }
               }
            }
         }
      }
   }

   public static boolean nUUVuvU() {
      boolean var0 = ccOO0COcoco0;
      ccOO0COcoco0 = false;
      return var0;
   }

   @vuVvUNNvVNV(
      UuUVuuUu = 4
   )
   private void UuUVuuUu(uUnnuUn var1) {
      boolean var2 = VvVvnNUnvuvV.uUnuvNvvNU();
      if (!NnuVnuNVV.uNNnnnuuuN()) {
         if (!this.NUVvUUVuVNVv) {
            this.NUVvUUVuVNVv = uvuvNuUnNVuu.VVuuUN();
         }
      } else {
         this.NUVvUUVuVNVv = false;
         if (var2) {
            if (this.nuUnNvnuUu && var1 != null && uUnuvNvvNU != null && uUnuvNvvNU.field_1687 != null && uUnuvNvvNU.field_1724 != null) {
               class_4665 var3 = var1.nuUnNvnuUu().method_23760();
               this.nVVUuvuNnUN.set(var3.method_23761()).mul(this.vuvnUnVnUNnV);
               this.nNnVnUNVV.set(var3.method_23762()).mul(this.nnuUVNUuvvVU);
               this.NVuNUuVnVUN.set(0.0F, 1.0F, 0.0F).mulDirection(this.nVVUuvuNnUN).normalize();
               this.NVuunNnvvvVu.set(0.0F, -0.515625F, 0.0F).mulPosition(this.nVVUuvuNnUN);
               this.vNnNuuvVn.set(vvNUVuUVvUV.vNVuvnUUnuUn, 0.0F, 0.0F).mulDirection(this.nVVUuvuNnUN);
               this.VUuuVUnun.set(0.0F, 0.0F, vvNUVuUVvUV.vNVuvnUUnuUn).mulDirection(this.nVVUuvuNnUN);
               this.vVVuuVVv.set(0.0F, vvNUVuUVvUV.uVUVnuvnuVuv, 0.0F).mulDirection(this.nVVUuvuNnUN);
               float var4 = this.UnUNVVVNuv();
               this.UuUVuuUu(var3, var1.uVUuuVnNVU());
               var1.uNNnnnuuuN().vNUvnnVnUvu();
               this.nuunNvv.set(var1.vNUvnnVnUvu()).invert();
               if (uvuvNuUnNVuu.UuUVuuUu(
                  this.nNuVunNUVu,
                  this.UNvvunVVn,
                  this.UnvuVuVnNuvu,
                  this.UvNNVUVNVuvV,
                  this.NnunUUnU,
                  this.nvuVvuNnNUnv,
                  this.NnVnNVN,
                  this.UuNnnVnuNNV.x,
                  this.UuNnnVnuNNV.y,
                  this.UuNnnVnuNNV.z,
                  1.0F,
                  this.uUVvnUuNvvN.x,
                  this.uUVvnUuNvvN.y,
                  this.uUVvnUuNvvN.z,
                  0.26F,
                  var4,
                  this.NVuNUuVnVUN.x,
                  this.NVuNUuVnVUN.y,
                  this.NVuNUuVnVUN.z,
                  this.nuunNvv,
                  this.NVuunNnvvvVu.x,
                  this.NVuunNnvvvVu.y,
                  this.NVuunNnvvvVu.z,
                  this.vNnNuuvVn.x,
                  this.vNnNuuvVn.y,
                  this.vNnNuuvVn.z,
                  this.VUuuVUnun.x,
                  this.VUuuVUnun.y,
                  this.VUuuVUnun.z,
                  this.vVVuuVVv.x,
                  this.vVVuuVVv.y,
                  this.vVVuuVVv.z
               )) {
                  ccOO0COcoco0 = true;
                  boolean var5 = false;

                  try {
                     class_4588 var6 = var1.uNNnnnuuuN().UuUVuuUu(uvuvNuUnNVuu.vVvUvVVuuNvV());
                     this.C00OOC00oO(var6, this.nVVUuvuNnUN, this.nNnVnUNVV);
                     var5 = true;
                     var1.uNNnnnuuuN().VVuuUN().method_22994(uvuvNuUnNVuu.vVvUvVVuuNvV());
                     uvuvNuUnNVuu.uNNnnnuuuN();
                     var5 = false;
                     class_4588 var7 = var1.uNNnnnuuuN().UuUVuuUu(uvuvNuUnNVuu.C00OOC00oO());
                     this.UuUVuuUu(var7, this.nVVUuvuNnUN, this.nNnVnUNVV);
                     var5 = true;
                     var1.uNNnnnuuuN().VVuuUN().method_22994(uvuvNuUnNVuu.C00OOC00oO());
                     class_4588 var8 = var1.uNNnnnuuuN().UuUVuuUu(uvuvNuUnNVuu.uUnuvNvvNU());
                     this.UuUVuuUu(var8, this.nVVUuvuNnUN, this.nNnVnUNVV);
                     var1.uNNnnnuuuN().VVuuUN().method_22994(uvuvNuUnNVuu.uUnuvNvvNU());
                  } finally {
                     if (var5) {
                        uvuvNuUnNVuu.uNNnnnuuuN();
                     }
                  }
               }
            }
         }
      }
   }

   private void UuUVuuUu(class_630 var1, class_4665 var2) {
      this.vuvnUnVnUNnV.set(var2.method_23761()).translate(var1.field_3657 * 0.0625F, var1.field_3656 * 0.0625F, var1.field_3655 * 0.0625F);
      this.nnuUVNUuvvVU.set(var2.method_23762());
      if (var1.field_3654 != 0.0F || var1.field_3675 != 0.0F || var1.field_3674 != 0.0F) {
         this.vvUVNVvvNUv.rotationZYX(var1.field_3674, var1.field_3675, var1.field_3654);
         this.vuvnUnVnUNnV.rotate(this.vvUVNVvvNUv);
         this.nnuUVNUuvvVU.rotate(this.vvUVNVvvNUv);
      }

      if (var1.field_37938 != 1.0F || var1.field_37939 != 1.0F || var1.field_37940 != 1.0F) {
         this.vuvnUnVnUNnV.scale(var1.field_37938, var1.field_37939, var1.field_37940);
         this.UuUVuuUu(var1.field_37938, var1.field_37939, var1.field_37940);
      }
   }

   private void UuUVuuUu(float var1, float var2, float var3) {
      if (Math.abs(var1) != Math.abs(var2) || Math.abs(var2) != Math.abs(var3)) {
         this.nnuUVNUuvvVU.scale(1.0F / var1, 1.0F / var2, 1.0F / var3);
      } else if (var1 < 0.0F || var2 < 0.0F || var3 < 0.0F) {
         this.nnuUVNUuvvVU.scale(Math.signum(var1), Math.signum(var2), Math.signum(var3));
      }
   }

   private void UuUVuuUu(class_4588 var1, Matrix4f var2, Matrix3f var3) {
      this.VuunNUUUvu.UuUVuuUu(var1, var2, var3);
      vvNUVuUVvUV.UuUVuuUu(this.VuunNUUUvu);
   }

   private void C00OOC00oO(class_4588 var1, Matrix4f var2, Matrix3f var3) {
      this.VuunNUUUvu.UuUVuuUu(var1, var2, var3);
      vvNUVuUVvUV.C00OOC00oO(this.VuunNUUUvu);
   }

   private void UuUVuuUu(class_4665 var1, float var2) {
      float var3 = uUnuvNvvNU.field_1687.method_8442(var2);
      float var4 = C00OOC00oO((float)Math.cos(var3) * 0.5F + 0.5F, 0.18F, 1.0F);
      this.UuNnnVnuNNV
         .set(-((float)Math.sin(var3)), 0.36F + var4 * 0.64F, (float)Math.cos(var3) * 0.42F)
         .normalize()
         .mulDirection(var1.method_23761())
         .normalize();
      this.uUVvnUuNvvN.set(0.78F + var4 * 0.22F, 0.62F + var4 * 0.27F, 0.52F + var4 * 0.35F);
   }

   private float UnUNVVVNuv() {
      this.uUVVvVVNvvn.set(this.nVVUuvuNnUN).invert();
      this.UUuUnNVNuuv.set(0.0F, 0.0F, 0.0F).mulPosition(this.uUVVvVVNvvn);
      float var1 = (float)Math.sqrt(this.UUuUnNVNuuv.x * this.UUuUnNVNuuv.x + this.UUuUnNVNuuv.z * this.UUuUnNVNuuv.z);
      float var2 = this.UUuUnNVNuuv.y - -0.515625F;
      return vvNUVuUVvUV.UuUVuuUu(var1, var2);
   }

   static void UuUVuuUu(
      class_4588 var0,
      Matrix4f var1,
      Matrix3f var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      int var11,
      int var12,
      int var13,
      float var14
   ) {
      float var15 = var1.m00() * var3 + var1.m10() * var4 + var1.m20() * var5 + var1.m30();
      float var16 = var1.m01() * var3 + var1.m11() * var4 + var1.m21() * var5 + var1.m31();
      float var17 = var1.m02() * var3 + var1.m12() * var4 + var1.m22() * var5 + var1.m32();
      float var18 = var2.m00() * var6 + var2.m10() * var7 + var2.m20() * var8;
      float var19 = var2.m01() * var6 + var2.m11() * var7 + var2.m21() * var8;
      float var20 = var2.m02() * var6 + var2.m12() * var7 + var2.m22() * var8;
      float var21 = UuUVuuUu(var18 * var18 + var19 * var19 + var20 * var20);
      var0.method_22912(var15, var16, var17)
         .method_22913(var9, var10)
         .method_1336(var11, var12, var13, UuUVuuUu(Math.round(C00OOC00oO(var14, 0.0F, 1.0F) * 255.0F)))
         .method_22914(var18 * var21, var19 * var21, var20 * var21);
   }

   private static float UuUVuuUu(float var0) {
      return var0 <= 1.0E-6F ? 1.0F : (float)(1.0 / Math.sqrt(var0));
   }

   private static float C00OOC00oO(float var0, float var1, float var2) {
      if (var0 < var1) {
         return var1;
      } else {
         return var0 > var2 ? var2 : var0;
      }
   }

   private static int UuUVuuUu(int var0) {
      if (var0 < 0) {
         return 0;
      } else {
         return var0 > 255 ? 255 : var0;
      }
   }

   static void UuUVuuUu(int[] var0, float var1, ChinaHat.NVnVnNnN var2) {
      float var3 = var1 - (float)Math.floor(var1);
      float var4 = var3 * (var0.length - 1);
      int var5 = Math.min(var0.length - 2, Math.max(0, (int)Math.floor(var4)));
      UuUVuuUu(var0[var5] & 16777215, var0[var5 + 1] & 16777215, vVvUvVVuuNvV(var4 - var5), var2);
   }

   static void UuUVuuUu(ChinaHat.NVnVnNnN var0, float var1, ChinaHat.NVnVnNnN var2) {
      UuUVuuUu(var0.UuUVuuUu, var0.C00OOC00oO, var0.uUnuvNvvNU, 1.0F, 1.0F, 1.0F, var1, var2);
   }

   private static void UuUVuuUu(int var0, int var1, float var2, ChinaHat.NVnVnNnN var3) {
      UuUVuuUu(
         (var0 >> 16 & 0xFF) * 0.003921569F,
         (var0 >> 8 & 0xFF) * 0.003921569F,
         (var0 & 0xFF) * 0.003921569F,
         (var1 >> 16 & 0xFF) * 0.003921569F,
         (var1 >> 8 & 0xFF) * 0.003921569F,
         (var1 & 0xFF) * 0.003921569F,
         var2,
         var3
      );
   }

   private static void UuUVuuUu(float var0, float var1, float var2, float var3, float var4, float var5, float var6, ChinaHat.NVnVnNnN var7) {
      float var8 = C00OOC00oO(var0);
      float var9 = C00OOC00oO(var1);
      float var10 = C00OOC00oO(var2);
      float var11 = C00OOC00oO(var3);
      float var12 = C00OOC00oO(var4);
      float var13 = C00OOC00oO(var5);
      float var14 = 0.41222146F * var8 + 0.53633255F * var9 + 0.051445995F * var10;
      float var15 = 0.2119035F * var8 + 0.6806995F * var9 + 0.10739696F * var10;
      float var16 = 0.08830246F * var8 + 0.28171885F * var9 + 0.6299787F * var10;
      float var17 = 0.41222146F * var11 + 0.53633255F * var12 + 0.051445995F * var13;
      float var18 = 0.2119035F * var11 + 0.6806995F * var12 + 0.10739696F * var13;
      float var19 = 0.08830246F * var11 + 0.28171885F * var12 + 0.6299787F * var13;
      float var20 = (float)Math.cbrt(var14);
      float var21 = (float)Math.cbrt(var15);
      float var22 = (float)Math.cbrt(var16);
      float var23 = (float)Math.cbrt(var17);
      float var24 = (float)Math.cbrt(var18);
      float var25 = (float)Math.cbrt(var19);
      float var26 = C00OOC00oO(var6, 0.0F, 1.0F);
      float var27 = uUnuvNvvNU(
         0.21045426F * var20 + 0.7936178F * var21 - 0.004072047F * var22, 0.21045426F * var23 + 0.7936178F * var24 - 0.004072047F * var25, var26
      );
      float var28 = uUnuvNvvNU(
         1.9779985F * var20 - 2.4285922F * var21 + 0.4505937F * var22, 1.9779985F * var23 - 2.4285922F * var24 + 0.4505937F * var25, var26
      );
      float var29 = uUnuvNvvNU(
         0.025904037F * var20 + 0.78277177F * var21 - 0.80867577F * var22, 0.025904037F * var23 + 0.78277177F * var24 - 0.80867577F * var25, var26
      );
      if (!UuUVuuUu(var27, var28, var29, 1.0F, var7)) {
         float var30 = 0.0F;
         float var31 = 1.0F;

         for (int var32 = 0; var32 < 6; var32++) {
            float var33 = (var30 + var31) * 0.5F;
            if (UuUVuuUu(var27, var28, var29, var33, var7)) {
               var30 = var33;
            } else {
               var31 = var33;
            }
         }

         UuUVuuUu(var27, var28, var29, var30, var7);
      }

      var7.UuUVuuUu = uUnuvNvvNU(C00OOC00oO(var7.UuUVuuUu, 0.0F, 1.0F));
      var7.C00OOC00oO = uUnuvNvvNU(C00OOC00oO(var7.C00OOC00oO, 0.0F, 1.0F));
      var7.uUnuvNvvNU = uUnuvNvvNU(C00OOC00oO(var7.uUnuvNvvNU, 0.0F, 1.0F));
   }

   private static boolean UuUVuuUu(float var0, float var1, float var2, float var3, ChinaHat.NVnVnNnN var4) {
      float var5 = var0 + 0.39633778F * var1 * var3 + 0.21580376F * var2 * var3;
      float var6 = var0 - 0.105561346F * var1 * var3 - 0.06385417F * var2 * var3;
      float var7 = var0 - 0.08948418F * var1 * var3 - 1.2914855F * var2 * var3;
      float var8 = var5 * var5 * var5;
      float var9 = var6 * var6 * var6;
      float var10 = var7 * var7 * var7;
      var4.UuUVuuUu = 4.0767417F * var8 - 3.3077116F * var9 + 0.23096994F * var10;
      var4.C00OOC00oO = -1.268438F * var8 + 2.6097574F * var9 - 0.34131938F * var10;
      var4.uUnuvNvvNU = -0.0041960864F * var8 - 0.7034186F * var9 + 1.7076147F * var10;
      return var4.UuUVuuUu >= 0.0F
         && var4.UuUVuuUu <= 1.0F
         && var4.C00OOC00oO >= 0.0F
         && var4.C00OOC00oO <= 1.0F
         && var4.uUnuvNvvNU >= 0.0F
         && var4.uUnuvNvvNU <= 1.0F;
   }

   private static float C00OOC00oO(float var0) {
      return var0 <= 0.04045F ? var0 * 0.07739938F : (float)Math.pow((var0 + 0.055F) * 0.94786733F, 2.4F);
   }

   private static float uUnuvNvvNU(float var0) {
      return var0 <= 0.0031308F ? var0 * 12.92F : 1.055F * (float)Math.pow(var0, 0.41666666F) - 0.055F;
   }

   private static float vVvUvVVuuNvV(float var0) {
      float var1 = C00OOC00oO(var0, 0.0F, 1.0F);
      return var1 * var1 * var1 * (var1 * (var1 * 6.0F - 15.0F) + 10.0F);
   }

   private static float uUnuvNvvNU(float var0, float var1, float var2) {
      return var0 + (var1 - var0) * var2;
   }

   static int[] UuUVuuUu(NvVNvUvunNNu var0) {
      return switch (var0) {
         case ASTOLFO_RAINBOW -> UNnVVNvvnVvU;
         case LAGUNE_RAINBOW -> uNnUnnuNUnNu;
         case HALF_RAINBOW -> NnUuNNU;
         case AURORA_RAINBOW -> nNvNUVU;
         case NEON_RAINBOW -> UnUNuUU;
         case BLOSSOM_RAINBOW -> uUVuVvuNUvnu;
         case ABYSS_RAINBOW -> UvUvUNuvNU;
         case SUNSET_RAINBOW -> c0oOOCcCoC0;
         case GLACIER_RAINBOW -> VVnVNnunVvu;
         case CHROMA_RAINBOW -> unNNVVNnvvV;
         case DREAM_RAINBOW -> NuunnvnN;
         case TOXIC_RAINBOW -> NVUunUNUN;
         default -> null;
      };
   }

   static final class NVnVnNnN {
      float UuUVuuUu;
      float C00OOC00oO;
      float uUnuvNvvNU;

      void UuUVuuUu(int var1) {
         this.UuUVuuUu = (var1 >> 16 & 0xFF) * 0.003921569F;
         this.C00OOC00oO = (var1 >> 8 & 0xFF) * 0.003921569F;
         this.uUnuvNvvNU = (var1 & 0xFF) * 0.003921569F;
      }
   }

   static final class VvunVVUvUNnv {
      final ChinaHat.NVnVnNnN UuUVuuUu = new ChinaHat.NVnVnNnN();
      final ChinaHat.NVnVnNnN C00OOC00oO = new ChinaHat.NVnVnNnN();
      final ChinaHat.NVnVnNnN uUnuvNvvNU = new ChinaHat.NVnVnNnN();

      void UuUVuuUu(float var1) {
         NvVNvUvunNNu var2 = ru.metaculture.protection.NVnVnNnN.UuUVuuUu != null && ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nvUVNnuu != null
            ? ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nvUVNnuu.C00OOC00oO()
            : NvVNvUvunNNu.WILD;
         int[] var3 = ChinaHat.UuUVuuUu(var2);
         if (var3 != null) {
            float var4 = var1 * 0.0062F;
            ChinaHat.UuUVuuUu(var3, var4, this.C00OOC00oO);
            ChinaHat.UuUVuuUu(var3, var4 + 0.34F, this.uUnuvNvvNU);
            ChinaHat.UuUVuuUu(this.uUnuvNvvNU, 0.14F, this.UuUVuuUu);
         } else if (var2 == NvVNvUvunNNu.WILD) {
            this.UuUVuuUu.UuUVuuUu(9348607);
            this.C00OOC00oO.UuUVuuUu(6061311);
         } else {
            int var5 = var2.UuUVuuUu().getRGB() & 16777215;
            this.C00OOC00oO.UuUVuuUu(var5);
            ChinaHat.UuUVuuUu(this.C00OOC00oO, 0.18F, this.UuUVuuUu);
         }
      }
   }

   static final class nvnNNunvv implements vvNUVuUVvUV.NVnVnNnN {
      private class_4588 UuUVuuUu;
      private Matrix4f C00OOC00oO;
      private Matrix3f uUnuvNvvNU;

      void UuUVuuUu(class_4588 var1, Matrix4f var2, Matrix3f var3) {
         this.UuUVuuUu = var1;
         this.C00OOC00oO = var2;
         this.uUnuvNvvNU = var3;
      }

      @Override
      public void UuUVuuUu(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9) {
         ChinaHat.UuUVuuUu(this.UuUVuuUu, this.C00OOC00oO, this.uUnuvNvvNU, var1, var2, var3, var4, var5, var6, var7, var8, 255, 255, 255, var9);
      }
   }
}
