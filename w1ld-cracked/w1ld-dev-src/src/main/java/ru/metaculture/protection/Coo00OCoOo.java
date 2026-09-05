package ru.metaculture.protection;

import java.util.List;
import java.util.UUID;

public final class Coo00OCoOo {
   private final nnunnunvvuv UuUVuuUu = new nnunnunvvuv();
   private UUID C00OOC00oO;
   private UUID uUnuvNvvNU;
   private VvUUVVVNNUN vVvUvVVuuNvV = VvUUVVVNNUN.NONE;
   private UUID uNNnnnuuuN;
   private VvUUVVVNNUN nuUnNvnuUu = VvUUVVVNNUN.NONE;
   private double VVuuUN;
   private double vNUvnnVnUvu;
   private double uVUuuVnNVU;
   private double vuuuNvNuv;
   private double nvUVNnuu;
   private double UuuNnUvUuv;
   private double nUUVuvU;
   private float UnUNVVVNuv;
   private float vNVuvnUUnuUn;
   private float UvnvNVnnnnNU;
   private long uVUVnuvnuVuv;

   public UUID UuUVuuUu() {
      return this.C00OOC00oO;
   }

   public UUID C00OOC00oO() {
      return this.uUnuvNvvNU;
   }

   public VvUUVVVNNUN uUnuvNvvNU() {
      return this.vVvUvVVuuNvV;
   }

   public boolean vVvUvVVuuNvV() {
      return this.uNNnnnuuuN != null;
   }

   public UUID uNNnnnuuuN() {
      return this.uNNnnnuuuN;
   }

   public boolean UuUVuuUu(UUID var1) {
      return this.uNNnnnuuuN != null && this.uNNnnnuuuN.equals(var1);
   }

   public double nuUnNvnuUu() {
      return this.nvUVNnuu;
   }

   public double VVuuUN() {
      return this.UuuNnUvUuv;
   }

   public double vNUvnnVnUvu() {
      return this.nUUVuvU;
   }

   public float uVUuuVnNVU() {
      return this.UnUNVVVNuv;
   }

   public float vuuuNvNuv() {
      return this.vNVuvnUUnuUn;
   }

   public float nvUVNnuu() {
      return this.UvnvNVnnnnNU;
   }

   public void UuUVuuUu(
      List<c0O00CcoCc0c.NVnVnNnN> var1, UUID var2, boolean var3, double var4, double var6, double var8, double var10, double var12, double var14
   ) {
      if (this.uNNnnnuuuN == null) {
         this.C00OOC00oO = null;
         this.uUnuvNvvNU = null;
         this.vVvUvVVuuNvV = VvUUVVVNNUN.NONE;
         double var16 = Double.MAX_VALUE;
         double var18 = Double.MAX_VALUE;

         for (int var20 = 0; var20 < var1.size(); var20++) {
            c0O00CcoCc0c.NVnVnNnN var21 = (c0O00CcoCc0c.NVnVnNnN)var1.get(var20);
            if (UuUVuuUu(var21, var2, var3)) {
               this.UuUVuuUu.UuUVuuUu(var21);
               if (this.UuUVuuUu.UuUVuuUu(var4, var6, var8, var10, var12, var14)) {
                  VvUUVVVNNUN var22 = UuUVuuUu(this.UuUVuuUu);
                  if (var22 != VvUUVVVNNUN.NONE && this.UuUVuuUu.vNUvnnVnUvu() < var16) {
                     var16 = this.UuUVuuUu.vNUvnnVnUvu();
                     this.C00OOC00oO = var21.id();
                     this.vVvUvVVuuNvV = var22;
                  }

                  if ((var22 != VvUUVVVNNUN.NONE || this.UuUVuuUu.UnUNuUU()) && this.UuUVuuUu.vNUvnnVnUvu() < var18) {
                     var18 = this.UuUVuuUu.vNUvnnVnUvu();
                     this.uUnuvNvvNU = var21.id();
                  }
               }
            }
         }
      }
   }

   public boolean UuUVuuUu(c0O00CcoCc0c.NVnVnNnN var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      if (var1 != null && this.vVvUvVVuuNvV != VvUUVVVNNUN.NONE) {
         this.UuUVuuUu.UuUVuuUu(var1);
         if (!this.UuUVuuUu.UuUVuuUu(var2, var4, var6, var8, var10, var12)) {
            return false;
         } else {
            this.uNNnnnuuuN = var1.id();
            this.nuUnNvnuUu = this.vVvUvVVuuNvV;
            this.VVuuUN = this.UuUVuuUu.vNUvnnVnUvu();
            this.vNUvnnVnUvu = var1.x() - (var2 + var8 * this.VVuuUN);
            this.uVUuuVnNVU = var1.y() - (var4 + var10 * this.VVuuUN);
            this.vuuuNvNuv = var1.z() - (var6 + var12 * this.VVuuUN);
            this.nvUVNnuu = var1.x();
            this.UuuNnUvUuv = var1.y();
            this.nUUVuvU = var1.z();
            this.UnUNVVVNuv = var1.yaw();
            this.vNVuvnUUnuUn = var1.width();
            this.UvnvNVnnnnNU = var1.height();
            this.uVUVnuvnuVuv = 0L;
            return true;
         }
      } else {
         return false;
      }
   }

   public double UuuNnUvUuv() {
      return this.VVuuUN;
   }

   public void UuUVuuUu(double var1) {
      if (this.nuUnNvnuUu == VvUUVVVNNUN.MOVE && var1 < this.VVuuUN) {
         this.VVuuUN = var1;
      }
   }

   public void UuUVuuUu(double var1, double var3, double var5, double var7, double var9, double var11) {
      if (this.uNNnnnuuuN != null) {
         if (this.nuUnNvnuUu == VvUUVVVNNUN.MOVE) {
            this.nvUVNnuu = var1 + var7 * this.VVuuUN + this.vNUvnnVnUvu;
            this.UuuNnUvUuv = var3 + var9 * this.VVuuUN + this.uVUuuVnNVU;
            this.nUUVuvU = var5 + var11 * this.VVuuUN + this.vuuuNvNuv;
         } else {
            this.UuUVuuUu.UuUVuuUu(this.nvUVNnuu, this.UuuNnUvUuv, this.nUUVuvU, this.UnUNVVVNuv, this.vNVuvnUUnuUn, this.UvnvNVnnnnNU);
            if (this.UuUVuuUu.UuUVuuUu(var1, var3, var5, var7, var9, var11)) {
               double var13 = Math.abs(this.UuUVuuUu.nuUnNvnuUu());
               double var15 = Math.abs(this.UuUVuuUu.VVuuUN()) * 1.7777777777777777;
               double var17 = Math.clamp(Math.max(var13, var15), 0.45, 24.0);
               this.vNVuvnUUnuUn = (float)(var17 * 2.0);
               this.UvnvNVnnnnNU = this.vNVuvnUUnuUn * 9.0F / 16.0F;
            }
         }
      }
   }

   public boolean UuUVuuUu(long var1) {
      if (this.uNNnnnuuuN != null && var1 - this.uVUVnuvnuVuv >= 100L) {
         this.uVUVnuvnuVuv = var1;
         return true;
      } else {
         return false;
      }
   }

   public UUID nUUVuvU() {
      UUID var1 = this.uNNnnnuuuN;
      this.uNNnnnuuuN = null;
      this.nuUnNvnuUu = VvUUVVVNNUN.NONE;
      return var1;
   }

   public void UnUNVVVNuv() {
      this.C00OOC00oO = null;
      this.uUnuvNvvNU = null;
      this.vVvUvVVuuNvV = VvUUVVVNNUN.NONE;
      this.uNNnnnuuuN = null;
      this.nuUnNvnuUu = VvUUVVVNNUN.NONE;
   }

   public static boolean UuUVuuUu(c0O00CcoCc0c.NVnVnNnN var0, UUID var1, boolean var2) {
      return var1 != null && (var2 || var1.equals(var0.owner()));
   }

   private static VvUUVVVNNUN UuUVuuUu(nnunnunvvuv var0) {
      if (var0.UvUvUNuvNU()) {
         return VvUUVVVNNUN.RESIZE;
      } else {
         return var0.uUVuVvuNUvnu() ? VvUUVVVNNUN.MOVE : VvUUVVVNNUN.NONE;
      }
   }
}
