package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.wild.module.api.Module;

public final class nnvvuVUVNuvN implements VvnNUnUu {
   private static final float UuUVuuUu = 100.0F;
   private static final float C00OOC00oO = 18.0F;
   private static final float uUnuvNvvNU = 18.0F;
   private static final float vVvUvVVuuNvV = 17.0F;
   private static final float uNNnnnuuuN = 8.0F;
   private static final float nuUnNvnuUu = 298.0F;
   private static final float VVuuUN = 38.0F;
   private static final float vNUvnnVnUvu = 6.0F;
   private static final float uVUuuVnNVU = 18.0F;
   private static final int vuuuNvNuv = -14408668;
   private static final float nvUVNnuu = 16.0F;
   private static final float UuuNnUvUuv = 16.0F;
   private static final float nUUVuvU = 6.0F;
   private static final int UnUNVVVNuv = -7829368;
   private static final int vNVuvnUUnuUn = -1;
   private static final float UvnvNVnnnnNU = 40.0F;
   private static final float uVUVnuvnuVuv = 24.0F;
   private static final int NVNnnvnuunNv = 58131;
   private static final uNNnVuNunvU uVunuUNVVUUV = uNNnVuNunvU.UuUVuuUu(1.4F, 0.7F);
   private static final uNNnVuNunvU UNnVVNvvnVvU = uNNnVuNunvU.UuUVuuUu(2.1F, 0.55F);
   private static final float uNnUnnuNUnNu = 38.0F;
   private static final int NnUuNNU = -14408668;
   private static final int nNvNUVU = -13750738;
   private static final float UnUNuUU = 18.0F;
   private static final float uUVuVvuNUvnu = 6.0F;
   private static final int UvUvUNuvNU = -1;
   private static final float c0oOOCcCoC0 = 1.0E-4F;
   private static final float VVnVNnunVvu = 0.001F;
   private final Module unNNVVNnvvV;
   private final UvNnUnuNUUU NuunnvnN;
   private final uvNNUnnUvU NVUunUNUN;
   private final nNVnuNVvvv<String> UUVNuUNUvUnV;
   private final String vuvnUnVnUNnV;
   private final List<String> nnuUVNUuvvVU;
   private final uNuuunuNvuN nVVUuvuNnUN;
   private final uNuuunuNvuN nNnVnUNVV;
   private final List<uNuuunuNvuN> nuunNvv;
   private static float uUVVvVVNvvn = Float.NaN;
   private nnvvuVUVNuvN.NVnVnNnN vvUVNVvvNUv = nnvvuVUVNuvN.NVnVnNnN.EMPTY;
   private nnvvuVUVNuvN.NVnVnNnN UuNnnVnuNNV = nnvvuVUVNuvN.NVnVnNnN.EMPTY;
   private nnvvuVUVNuvN.NVnVnNnN uUVvnUuNvvN = nnvvuVUVNuvN.NVnVnNnN.EMPTY;
   private nnvvuVUVNuvN.NVnVnNnN UUuUnNVNuuv = nnvvuVUVNuvN.NVnVnNnN.EMPTY;
   private final List<nnvvuVUVNuvN.NVnVnNnN> NVuNUuVnVUN = new ArrayList<>();
   private float NVuunNnvvvVu = 0.0F;
   private float vNnNuuvVn = 0.0F;
   private boolean VUuuVUnun = false;
   private boolean vVVuuVVv = false;
   private int VuunNUUUvu = -1;

   public nnvvuVUVNuvN(Module var1, uvNNUnnUvU var2, UvNnUnuNUUU var3, nNVnuNVvvv<String> var4) {
      this(var1, var2, var3, var4, null);
   }

   public nnvvuVUVNuvN(Module var1, uvNNUnnUvU var2, UvNnUnuNUUU var3, nNVnuNVvvv<String> var4, String var5) {
      this.unNNVVNnvvV = Objects.requireNonNull(var1, "module");
      this.NVUunUNUN = Objects.requireNonNull(var2, "popupContext");
      this.NuunnvnN = Objects.requireNonNull(var3, "setting");
      this.UUVNuUNUvUnV = Objects.requireNonNull(var4, "valueAccessor");
      this.vuvnUnVnUNnV = UuUVuuUu(var5);
      this.nnuUVNUuvvVU = new ArrayList<>(var3.vVvUvVVuuNvV != null ? var3.vVvUvVVuuNvV : List.of());
      this.nVVUuvuNnUN = new uNuuunuNvuN(vvUnNVVnV.UuUVuuUu(), uVunuUNVVUUV, 0.0F, 0.0F, 1.0F, 5.0E-4F, 5.0E-4F);
      this.nVVUuvuNnUN.UuUVuuUu(unnvUnnn.uUnuvNvvNU);
      this.nNnVnUNVV = new uNuuunuNvuN(vvUnNVVnV.UuUVuuUu(), UNnVVNvvnVvU, 0.0F, 0.0F, 1.0F, 5.0E-4F, 5.0E-4F);
      this.nNnVnUNVV.UuUVuuUu(unnvUnnn.uUnuvNvvNU);
      this.nuunNvv = new ArrayList<>();
      this.nUUVuvU();
   }

   @Override
   public void UuUVuuUu() {
      List var1 = this.NuunnvnN.vVvUvVVuuNvV != null ? this.NuunnvnN.vVvUvVVuuNvV : List.of();
      if (var1.size() != this.nnuUVNUuvvVU.size() || !this.nnuUVNUuvvVU.equals(var1)) {
         this.nnuUVNUuvvVU.clear();
         this.nnuUVNUuvvVU.addAll(var1);
         this.nUUVuvU();
         this.nvUVNnuu();
      }

      this.nVVUuvuNnUN.uUnuvNvvNU(this.vVVuuVVv ? 1.0F : (this.vVVuuVVv ? 0.0F : (this.VUuuVUnun ? 0.5F : 0.0F)));
      this.nNnVnUNVV.uUnuvNvvNU(this.vVVuuVVv ? 1.0F : 0.0F);

      for (int var2 = 0; var2 < this.nuunNvv.size(); var2++) {
         float var3 = this.vVVuuVVv && var2 == this.VuunNUUUvu ? 1.0F : 0.0F;
         this.nuunNvv.get(var2).uUnuvNvvNU(var3);
      }

      if (!this.vVVuuVVv) {
         this.VuunNUUUvu = -1;
      }
   }

   @Override
   public void UuUVuuUu(float var1, float var2, float var3) {
      this.vvUVNVvvNUv = new nnvvuVUVNuvN.NVnVnNnN(var1, var2, var3, 100.0F);
      this.NVuunNnvvvVu = var1 + 18.0F;
      this.vNnNuuvVn = var2 + 17.0F + 18.0F;
      float var4 = var1 + 18.0F;
      float var5 = this.vNnNuuvVn + 8.0F;
      this.UuNnnVnuNNV = new nnvvuVUVNuvN.NVnVnNnN(var4, var5, 298.0F, 38.0F);
      this.uUVvnUuNvvN = new nnvvuVUVNuvN.NVnVnNnN(var4 + 298.0F - 40.0F, var5, 40.0F, 38.0F);
      this.nvUVNnuu();
   }

   @Override
   public float C00OOC00oO() {
      return 100.0F;
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void UuUVuuUu(UnVNvNnU var1, float var2, float var3, float var4) {
      float var5 = UuUVuuUu(var3);
      float var6 = var2 * var5;
      if (!(var6 <= 1.0E-4F)) {
         float var7 = UuUVuuUu(this.nVVUuvuNnUN.UuUVuuUu());
         int var8 = UuUVuuUu(-7829368, var6);
         int var9 = UuUVuuUu(-1, var6);
         int var10 = VvUNvVNnuUNU.UuUVuuUu(var8, var9, var7);
         var1.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, this.NVuunNnvvvVu, this.vNnNuuvVn - 4.0F, 18.0F, this.UuuNnUvUuv(), var10, "l");
         int var11 = UuUVuuUu(-14408668, var6);
         var1.UuUVuuUu(this.UuNnnVnuNNV.x, this.UuNnnVnuNNV.y, this.UuNnnVnuNNV.width, this.UuNnnVnuNNV.height, 6.0F, var11);
         int var12 = UuUVuuUu(UVvNVuUvNVn.UuUVuuUu(), var6);
         var1.UuUVuuUu(this.uUVvnUuNvvN.x, this.uUVvnUuNvvN.y, this.uUVvnUuNvvN.width, this.uUVvnUuNvvN.height, 0.0F, 6.0F, 6.0F, 0.0F, var12);
         float var13 = this.UuNnnVnuNNV.centerY() + 6.0F;
         float var14 = this.UuNnnVnuNNV.x + 16.0F;
         String var15 = this.UUVNuUNUvUnV.UuUVuuUu();
         if (var15 == null) {
            var15 = "";
         }

         int var16 = UuUVuuUu(-7829368, var6);
         int var17 = UuUVuuUu(-1, var6);
         int var18 = VvUNvVNnuUNU.UuUVuuUu(var16, var17, var7);
         var1.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var14, var13, 16.0F, var15, var18, "l");
         float var19 = UuUVuuUu(this.nNnVnUNVV.UuUVuuUu()) * 180.0F;
         float var20 = this.uUVvnUuNvvN.centerX();
         float var21 = this.uUVvnUuNvvN.centerY();
         float var22 = UnUNVVVNuv();
         float var23 = var21 + var22;
         var1.UuUVuuUu(var20, var23);
         var1.UuUVuuUu(0.0F, -var22);
         var1.C00OOC00oO(var19);
         var1.UuUVuuUu(0.0F, var22);
         var1.UuUVuuUu(-var20, -var23);
         boolean var26 = false /* VF: Semaphore variable */;

         try {
            var26 = true;
            var1.UuUVuuUu(vNvnnVvvVUu.uUnuvNvvNU, var20, var23, 24.0F, "\ue313", UuUVuuUu(-1, var6), "c");
            var26 = false;
         } finally {
            if (var26) {
               var1.vNUvnnVnUvu();
               var1.vNUvnnVnUvu();
               var1.VVuuUN();
               var1.vNUvnnVnUvu();
               var1.vNUvnnVnUvu();
            }
         }

         var1.vNUvnnVnUvu();
         var1.vNUvnnVnUvu();
         var1.VVuuUN();
         var1.vNUvnnVnUvu();
         var1.vNUvnnVnUvu();
      }
   }

   @Override
   public void UuUVuuUu(UnVNvNnU var1, float var2, float var3) {
      float var4 = UuUVuuUu(this.nNnVnUNVV.UuUVuuUu());
      if (!(var4 <= 0.001F)) {
         if (!this.nnuUVNUuvvVU.isEmpty() && !(this.UUuUnNVNuuv.width <= 0.0F) && !(this.UUuUnNVNuuv.height <= 0.0F)) {
            float var5 = UuUVuuUu(var3);
            float var6 = var2 * var5 * var4;
            if (!(var6 <= 1.0E-4F)) {
               int var7 = -14408668;
               var1.uUnuvNvvNU(1.0F, var4, this.UUuUnNVNuuv.x, this.UUuUnNVNuuv.y);

               try {
                  var1.UuUVuuUu(this.UUuUnNVNuuv.x, this.UUuUnNVNuuv.y, this.UUuUnNVNuuv.width, this.UUuUnNVNuuv.height, 6.0F, 6.0F, 6.0F, 6.0F, var7);
                  String var8 = this.UUVNuUNUvUnV.UuUVuuUu();
                  if (var8 == null) {
                     var8 = "";
                  }

                  for (int var9 = 0; var9 < this.NVuNUuVnVUN.size(); var9++) {
                     nnvvuVUVNuvN.NVnVnNnN var10 = this.NVuNUuVnVUN.get(var9);
                     String var11 = this.nnuUVNUuvvVU.get(var9);
                     boolean var12 = Objects.equals(var11, var8);
                     float var13 = var9 < this.nuunNvv.size() ? UuUVuuUu(this.nuunNvv.get(var9).UuUVuuUu()) : 0.0F;
                     if (var13 > 0.001F) {
                        int var14 = UuUVuuUu(-13750738, var13 * var6);
                        float var15 = var9 == 0 ? 6.0F : 0.0F;
                        float var16 = var9 == 0 ? 6.0F : 0.0F;
                        float var17 = var9 == this.NVuNUuVnVUN.size() - 1 ? 6.0F : 0.0F;
                        float var18 = var9 == this.NVuNUuVnVUN.size() - 1 ? 6.0F : 0.0F;
                        var1.UuUVuuUu(var10.x, var10.y, var10.width, var10.height, var15, var16, var17, var18, var14);
                     }

                     float var25 = var10.x + 16.0F;
                     float var26 = var10.centerY() + 6.0F;
                     int var27 = UuUVuuUu(-7829368, var6);
                     int var28 = UuUVuuUu(-1, var6);
                     float var29;
                     if (var12) {
                        var29 = 1.0F;
                     } else {
                        var29 = var13 * 0.7F;
                     }

                     int var19 = VvUNvVNnuUNU.UuUVuuUu(var27, var28, var29);
                     var1.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var25, var26, 16.0F, var11, var19, "l");
                     if (Objects.equals(var11, var8)) {
                        float var20 = var10.x + var10.width - 16.0F + 2.0F;
                        float var21 = var10.centerY() + 6.0F + 3.0F;
                        var1.UuUVuuUu(vNvnnVvvVUu.uUnuvNvvNU, var20, var21, 18.0F, "\ue5ca", UuUVuuUu(-1, var6), "r");
                     }
                  }
               } finally {
                  var1.uVUuuVnNVU();
               }
            }
         }
      }
   }

   @Override
   public boolean uNNnnnuuuN() {
      return (this.vVVuuVVv || this.nNnVnUNVV.UuUVuuUu() > 0.001F) && this.UUuUnNVNuuv.width > 0.0F && this.UUuUnNVNuuv.height > 0.0F;
   }

   @Override
   public boolean C00OOC00oO(double var1, double var3, int var5) {
      if (!this.uNNnnnuuuN()) {
         return false;
      } else if (!this.vVVuuVVv) {
         return false;
      } else if (var5 != 0) {
         this.uVUuuVnNVU();
         return true;
      } else if (this.UUuUnNVNuuv.contains(var1, var3)) {
         int var6 = this.UuUVuuUu(var3);
         if (var6 >= 0 && var6 < this.nnuUVNUuvvVU.size()) {
            this.UuUVuuUu(var6);
         }

         this.uVUuuVnNVU();
         return true;
      } else if (!this.UuNnnVnuNNV.contains(var1, var3) && !this.uUVvnUuNvvN.contains(var1, var3)) {
         this.uVUuuVnNVU();
         return true;
      } else {
         this.uVUuuVnNVU();
         return true;
      }
   }

   @Override
   public boolean UuUVuuUu(double var1, double var3, int var5) {
      boolean var6 = this.UuNnnVnuNNV.contains(var1, var3) || this.uUVvnUuNvvN.contains(var1, var3);
      if (var5 == 2) {
         if (!var6) {
            return false;
         } else {
            this.uVUuuVnNVU();
            String var7 = this.UUVNuUNUvUnV.UuUVuuUu();
            String var8 = var7 != null ? var7.toString() : "";
            this.NVUunUNUN.openForSetting(this.unNNVVNnvvV, this.NuunnvnN, var1, var3, var8);
            return true;
         }
      } else if (var5 != 0) {
         return false;
      } else if (this.vVVuuVVv) {
         return this.C00OOC00oO(var1, var3, var5);
      } else if (var6) {
         this.vNUvnnVnUvu();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean UuUVuuUu(double var1, double var3, double var5, double var7) {
      return this.uNNnnnuuuN();
   }

   @Override
   public void UuUVuuUu(double var1, double var3) {
      boolean var5 = this.UuNnnVnuNNV.contains(var1, var3) || this.uUVvnUuNvvN.contains(var1, var3);
      boolean var6 = this.vVVuuVVv && this.UUuUnNVNuuv.contains(var1, var3);
      this.VUuuVUnun = this.vVVuuVVv ? false : var5;
      if (this.vVVuuVVv) {
         if (var6) {
            this.VuunNUUUvu = this.UuUVuuUu(var3);
         } else {
            this.VuunNUUUvu = -1;
         }
      }
   }

   @Override
   public void nuUnNvnuUu() {
      this.vuuuNvNuv();
   }

   @Override
   public nvUuvVvuuN uUnuvNvvNU() {
      return this.NuunnvnN;
   }

   @Override
   public boolean vVvUvVVuuNvV() {
      return true;
   }

   private void vNUvnnVnUvu() {
      this.vVVuuVVv = true;
      this.nNnVnUNVV.uUnuvNvvNU(1.0F);
      this.nVVUuvuNnUN.uUnuvNvvNU(1.0F);
   }

   private void uVUuuVnNVU() {
      this.vVVuuVVv = false;
      this.nNnVnUNVV.uUnuvNvvNU(0.0F);
      this.VuunNUUUvu = -1;
   }

   private void vuuuNvNuv() {
      this.vVVuuVVv = false;
      this.nNnVnUNVV.C00OOC00oO(0.0F);
      this.VuunNUUUvu = -1;
   }

   private void UuUVuuUu(int var1) {
      if (var1 >= 0 && var1 < this.nnuUVNUuvvVU.size()) {
         String var2 = this.nnuUVNUuvvVU.get(var1);
         String var3 = this.UUVNuUNUvUnV.UuUVuuUu();
         if (!Objects.equals(var2, var3)) {
            this.UUVNuUNUvUnV.UuUVuuUu(var2);
         }
      }
   }

   private void nvUVNnuu() {
      this.NVuNUuVnVUN.clear();
      if (this.nnuUVNUuvvVU.isEmpty()) {
         this.UUuUnNVNuuv = nnvvuVUVNuvN.NVnVnNnN.EMPTY;
      } else {
         float var1 = this.UuNnnVnuNNV.x;
         float var2 = this.UuNnnVnuNNV.y + this.UuNnnVnuNNV.height + 6.0F;
         float var3 = this.UuNnnVnuNNV.width;
         float var4 = 38.0F * this.nnuUVNUuvvVU.size();
         this.UUuUnNVNuuv = new nnvvuVUVNuvN.NVnVnNnN(var1, var2, var3, var4);
         float var5 = var2;

         for (int var6 = 0; var6 < this.nnuUVNUuvvVU.size(); var6++) {
            this.NVuNUuVnVUN.add(new nnvvuVUVNuvN.NVnVnNnN(var1, var5, var3, 38.0F));
            var5 += 38.0F;
         }
      }
   }

   private int UuUVuuUu(double var1) {
      if (!(var1 < this.UUuUnNVNuuv.y) && !(var1 > this.UUuUnNVNuuv.y + this.UUuUnNVNuuv.height)) {
         double var3 = var1 - this.UUuUnNVNuuv.y;
         if (var3 < 0.0) {
            return -1;
         } else {
            int var5 = (int)(var3 / 38.0);
            return var5 >= 0 && var5 < this.nnuUVNUuvvVU.size() ? var5 : -1;
         }
      } else {
         return -1;
      }
   }

   private String UuuNnUvUuv() {
      return this.vuvnUnVnUNnV != null ? this.vuvnUnVnUNnV : this.NuunnvnN.UuUVuuUu;
   }

   private static String UuUVuuUu(String var0) {
      if (var0 == null) {
         return null;
      } else {
         String var1 = var0.trim();
         return var1.isEmpty() ? null : var1;
      }
   }

   private static float UuUVuuUu(float var0) {
      if (var0 <= 0.0F) {
         return 0.0F;
      } else {
         return var0 >= 1.0F ? 1.0F : var0;
      }
   }

   private void nUUVuvU() {
      this.nuunNvv.clear();

      for (int var1 = 0; var1 < this.nnuUVNUuvvVU.size(); var1++) {
         uNuuunuNvuN var2 = new uNuuunuNvuN(vvUnNVVnV.UuUVuuUu(), uVunuUNVVUUV, 0.0F, 0.0F, 1.0F, 5.0E-4F, 5.0E-4F);
         var2.UuUVuuUu(unnvUnnn.uUnuvNvvNU);
         this.nuunNvv.add(var2);
      }
   }

   private static float UnUNVVVNuv() {
      if (Float.isNaN(uUVVvVVNvvn)) {
         float var0 = vNvnnVvvVUu.UuUVuuUu(vNvnnVvvVUu.uUnuvNvvNU, 58131, 24.0F);
         uUVVvVVNvvn = var0;
      }

      return uUVVvVVNvvn;
   }

   private static int UuUVuuUu(int var0, float var1) {
      int var2 = var0 >>> 24 & 0xFF;
      int var3 = Math.round(var2 * var1);
      int var4 = var0 & 16777215;
      return var3 << 24 | var4;
   }

   record NVnVnNnN(float x, float y, float width, float height) {
      static final nnvvuVUVNuvN.NVnVnNnN EMPTY = new nnvvuVUVNuvN.NVnVnNnN(0.0F, 0.0F, 0.0F, 0.0F);

      boolean contains(double var1, double var3) {
         return var1 >= this.x && var1 <= this.x + this.width && var3 >= this.y && var3 <= this.y + this.height;
      }

      float centerX() {
         return this.x + this.width * 0.5F;
      }

      float centerY() {
         return this.y + this.height * 0.5F;
      }
   }
}
