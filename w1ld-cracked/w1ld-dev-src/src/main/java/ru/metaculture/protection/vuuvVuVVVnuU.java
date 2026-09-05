package ru.metaculture.protection;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.class_2561;
import net.minecraft.class_332;
import net.minecraft.class_3532;
import net.minecraft.class_437;

public final class vuuvVuVVVnuU extends class_437 {
   private static final int UuUVuuUu = -234156525;
   private static final int C00OOC00oO = -1441326300;
   private static final int uUnuvNvvNU = -1446152;
   private static final int vVvUvVVuuNvV = -7366230;
   private static final int uNNnnnuuuN = -45462;
   private static final int nuUnNvnuUu = -1;
   private static final int VVuuUN = -2142256137;
   private final RotationLab vNUvnnVnUvu;
   private final List<NUnUuVuNv.NVnVnNnN> uVUuuVnNVU = new ArrayList<>();
   private final List<NUnUuVuNv.nvnNNunvv> vuuuNvNuv = new ArrayList<>();
   private vuuvVuVVVnuU.NVnVnNnN nvUVNnuu;
   private long UuuNnUvUuv;
   private int nUUVuvU = -1;
   private double UnUNVVVNuv;
   private double vNVuvnUUnuUn;
   private float UvnvNVnnnnNU;
   private float uVUVnuvnuVuv;
   private boolean NVNnnvnuunNv;

   public vuuvVuVVVnuU(RotationLab var1) {
      super(class_2561.method_43470("RotationLab"));
      this.vNUvnnVnUvu = var1;
   }

   public boolean method_25421() {
      return false;
   }

   public void method_25394(class_332 var1, int var2, int var3, float var4) {
      var1.method_25294(0, 0, this.field_22789, this.field_22790, -234156525);
      if (this.nvUVNnuu == null) {
         this.UuUVuuUu(var2, var3);
      }

      this.UuUVuuUu(var4);
      this.C00OOC00oO(var2, var3);
      if (this.vNUvnnVnUvu.UnUNVVVNuv() && this.nvUVNnuu != null && this.vVvUvVVuuNvV(var2, var3)) {
         this.uUnuvNvvNU(var2, var3);
         this.UuUVuuUu(var2, var3);
      }

      this.C00OOC00oO(var1);
      this.uUnuvNvvNU(var1);
      this.UuUVuuUu(var1);
      super.method_25394(var1, var2, var3, var4);
   }

   public boolean method_25402(double var1, double var3, int var5) {
      if (var5 == 0 && this.nvUVNnuu != null && this.vVvUvVVuuNvV(var1, var3)) {
         this.uUnuvNvvNU(var1, var3);
         this.UuUVuuUu(var1, var3);
         return true;
      } else {
         return super.method_25402(var1, var3, var5);
      }
   }

   public boolean method_25404(int var1, int var2, int var3) {
      if (var1 == 82) {
         this.C00OOC00oO();
         return true;
      } else if (var1 != 68 && var1 != 261) {
         return super.method_25404(var1, var2, var3);
      } else {
         this.vNUvnnVnUvu.NVNnnvnuunNv();
         return true;
      }
   }

   public void method_25419() {
      if (!this.NVNnnvnuunNv) {
         this.UuUVuuUu();
         this.vNUvnnVnUvu.UuUVuuUu(this);
      }

      super.method_25419();
   }

   public void UuUVuuUu() {
      if (!this.NVNnnvnuunNv) {
         this.NVNnnvnuunNv = true;
         this.uUnuvNvvNU();
      }
   }

   public void C00OOC00oO() {
      this.uVUuuVnNVU.clear();
      this.vuuuNvNuv.clear();
      this.nvUVNnuu = null;
      this.nUUVuvU = -1;
   }

   private void UuUVuuUu(double var1, double var3) {
      if (this.uVUuuVnNVU.size() >= this.vNUvnnVnUvu.uVUVnuvnuVuv()) {
         this.method_25419();
      } else {
         String var5 = this.vVvUvVVuuNvV();
         double var6 = Math.max(80.0, (double)(this.field_22789 * this.vNUvnnVnUvu.UvnvNVnnnnNU()));
         double var8 = Math.max(60.0, (double)(this.field_22790 * this.vNUvnnVnUvu.UvnvNVnnnnNU()));
         double var10 = (this.field_22789 - var6) * 0.5;
         double var12 = (this.field_22790 - var8) * 0.5;
         double var14 = this.field_22789 * 0.5;
         double var16 = this.field_22790 * 0.5;

         double var22 = switch (var5) {
            case "Micro", "Idle" -> 22.0;
            case "Vertical" -> 70.0;
            case "Attack" -> 120.0;
            default -> 95.0;
         };
         int var24 = 0;

         double var18;
         double var20;
         do {
            if ("Vertical".equals(var5)) {
               var18 = ThreadLocalRandom.current().nextDouble(-24.0, 24.0);
               var20 = this.uNNnnnuuuN(var22, var8 * 0.42);
            } else if ("Diagonal".equals(var5)) {
               var18 = this.uNNnnnuuuN(var22 * 0.65, var6 * 0.45);
               var20 = this.uNNnnnuuuN(var22 * 0.45, var8 * 0.4);
            } else if (!"Micro".equals(var5) && !"Idle".equals(var5)) {
               var18 = this.uNNnnnuuuN(var22, var6 * 0.48);
               var20 = this.uNNnnnuuuN(12.0, var8 * 0.36);
            } else {
               var18 = this.uNNnnnuuuN(12.0, 58.0);
               var20 = this.uNNnnnuuuN(8.0, 42.0);
            }

            this.nvUVNnuu = new vuuvVuVVVnuU.NVnVnNnN(
               class_3532.method_15350(var1 + var18, var10, var10 + var6),
               class_3532.method_15350(var3 + var20, var12, var12 + var8),
               this.vNUvnnVnUvu.vNVuvnUUnuUn(),
               var5
            );
         } while (this.UuUVuuUu(var1, var3, this.nvUVNnuu.UuUVuuUu, this.nvUVNnuu.C00OOC00oO) < var22 && ++var24 < 12);

         if (var24 >= 12) {
            this.nvUVNnuu.UuUVuuUu = class_3532.method_15350(var14 + var18, var10, var10 + var6);
            this.nvUVNnuu.C00OOC00oO = class_3532.method_15350(var16 + var20, var12, var12 + var8);
         }

         if ("Tracking".equals(var5)) {
            this.nvUVNnuu.uUnuvNvvNU = ThreadLocalRandom.current().nextDouble(-1.15, 1.15);
            this.nvUVNnuu.vVvUvVVuuNvV = ThreadLocalRandom.current().nextDouble(-0.85, 0.85);
         }

         this.UnUNVVVNuv = var1;
         this.vNVuvnUUnuUn = var3;
         this.UuuNnUvUuv = System.currentTimeMillis();
         this.nUUVuvU = -1;
         this.UvnvNVnnnnNU = 0.0F;
         this.uVUVnuvnuVuv = 0.0F;
         this.vuuuNvNuv.clear();
      }
   }

   private void UuUVuuUu(float var1) {
      if (this.nvUVNnuu != null && "Tracking".equals(this.nvUVNnuu.nuUnNvnuUu)) {
         double var2 = Math.max(0.35, (double)var1);
         this.nvUVNnuu.UuUVuuUu = this.nvUVNnuu.UuUVuuUu + this.nvUVNnuu.uUnuvNvvNU * var2;
         this.nvUVNnuu.C00OOC00oO = this.nvUVNnuu.C00OOC00oO + this.nvUVNnuu.vVvUvVVuuNvV * var2;
         double var4 = this.nvUVNnuu.uNNnnnuuuN + 18.0;
         if (this.nvUVNnuu.UuUVuuUu < var4 || this.nvUVNnuu.UuUVuuUu > this.field_22789 - var4) {
            this.nvUVNnuu.uUnuvNvvNU = -this.nvUVNnuu.uUnuvNvvNU;
         }

         if (this.nvUVNnuu.C00OOC00oO < var4 || this.nvUVNnuu.C00OOC00oO > this.field_22790 - var4) {
            this.nvUVNnuu.vVvUvVVuuNvV = -this.nvUVNnuu.vVvUvVVuuNvV;
         }

         this.nvUVNnuu.UuUVuuUu = class_3532.method_15350(this.nvUVNnuu.UuUVuuUu, var4, this.field_22789 - var4);
         this.nvUVNnuu.C00OOC00oO = class_3532.method_15350(this.nvUVNnuu.C00OOC00oO, var4, this.field_22790 - var4);
      }
   }

   private void C00OOC00oO(double var1, double var3) {
      if (this.nvUVNnuu != null) {
         int var5 = (int)((System.currentTimeMillis() - this.UuuNnUvUuv) / 50L);
         if (var5 != this.nUUVuvU) {
            this.nUUVuvU = var5;
            float var6 = this.UuUVuuUu(var1 - this.UnUNVVVNuv);
            float var7 = this.C00OOC00oO(var3 - this.vNVuvnUUnuUn);
            float var8 = this.UuUVuuUu(this.nvUVNnuu.UuUVuuUu - this.UnUNVVVNuv);
            float var9 = this.C00OOC00oO(this.nvUVNnuu.C00OOC00oO - this.vNVuvnUUnuUn);
            float var10 = (float)Math.max(0.001, Math.hypot(var8, var9));
            NUnUuVuNv.nvnNNunvv var11 = new NUnUuVuNv.nvnNNunvv();
            var11.UuUVuuUu = var5;
            var11.C00OOC00oO = var6;
            var11.uUnuvNvvNU = var7;
            var11.vVvUvVVuuNvV = var6 - this.UvnvNVnnnnNU;
            var11.uNNnnnuuuN = var7 - this.uVUVnuvnuVuv;
            var11.nuUnNvnuUu = Math.abs(var11.vVvUvVVuuNvV);
            var11.VVuuUN = Math.abs(var11.uNNnnnuuuN);
            var11.vNUvnnVnUvu = (float)class_3532.method_15350(Math.hypot(var6, var7) / var10, 0.0, 1.35);
            this.vuuuNvNuv.add(var11);
            this.UvnvNVnnnnNU = var6;
            this.uVUVnuvnuVuv = var7;
            if (var5 > 120) {
               this.UuUVuuUu(var1, var3);
            }
         }
      }
   }

   private void uUnuvNvvNU(double var1, double var3) {
      if (this.nvUVNnuu != null && this.vuuuNvNuv.size() >= 2) {
         NUnUuVuNv.NVnVnNnN var5 = new NUnUuVuNv.NVnVnNnN();
         var5.UuUVuuUu = this.nvUVNnuu.nuUnNvnuUu;
         var5.C00OOC00oO = System.currentTimeMillis();
         var5.uUnuvNvvNU = this.UuUVuuUu(this.nvUVNnuu.UuUVuuUu - this.UnUNVVVNuv);
         var5.vVvUvVVuuNvV = this.C00OOC00oO(this.nvUVNnuu.C00OOC00oO - this.vNVuvnUUnuUn);
         NUnUuVuNv.nvnNNunvv var6 = this.vuuuNvNuv.get(this.vuuuNvNuv.size() - 1);
         var5.uNNnnnuuuN = var6.C00OOC00oO;
         var5.nuUnNvnuUu = var6.uUnuvNvvNU;
         var5.uVUuuVnNVU = var6.UuUVuuUu + 1;
         var5.UuuNnUvUuv = new ArrayList<>(this.vuuuNvNuv);
         var5.VVuuUN = this.UuUVuuUu(var5);
         var5.vNUvnnVnUvu = this.C00OOC00oO(var5);
         var5.vuuuNvNuv = this.uUnuvNvvNU(var5);
         double var7 = this.UuUVuuUu(var1, var3, this.nvUVNnuu.UuUVuuUu, this.nvUVNnuu.C00OOC00oO);
         float var9 = 1.0F - (float)class_3532.method_15350(var7 / Math.max(1.0, this.nvUVNnuu.uNNnnnuuuN * 1.8), 0.0, 1.0);
         float var10 = class_3532.method_15363(this.vuuuNvNuv.size() / 6.0F, 0.0F, 1.0F);
         var5.nvUVNnuu = class_3532.method_15363(var9 * 0.75F + var10 * 0.25F, 0.0F, 1.0F);
         this.uVUuuVnNVU.add(var5);
      }
   }

   private float UuUVuuUu(NUnUuVuNv.NVnVnNnN var1) {
      float var2 = var1.uUnuvNvvNU;
      float var3 = 0.0F;

      for (NUnUuVuNv.nvnNNunvv var5 : var1.UuuNnUvUuv) {
         var3 = Math.max(var3, Math.abs(var5.C00OOC00oO) - Math.abs(var2));
      }

      return Math.max(0.0F, var3);
   }

   private float C00OOC00oO(NUnUuVuNv.NVnVnNnN var1) {
      float var2 = var1.vVvUvVVuuNvV;
      float var3 = 0.0F;

      for (NUnUuVuNv.nvnNNunvv var5 : var1.UuuNnUvUuv) {
         var3 = Math.max(var3, Math.abs(var5.uUnuvNvvNU) - Math.abs(var2));
      }

      return Math.max(0.0F, var3);
   }

   private int uUnuvNvvNU(NUnUuVuNv.NVnVnNnN var1) {
      int var2 = 0;

      for (int var3 = var1.UuuNnUvUuv.size() - 1; var3 >= 0; var3--) {
         NUnUuVuNv.nvnNNunvv var4 = var1.UuuNnUvUuv.get(var3);
         float var5 = Math.abs(var1.uUnuvNvvNU - var4.C00OOC00oO);
         float var6 = Math.abs(var1.vVvUvVVuuNvV - var4.uUnuvNvvNU);
         if (!(var5 <= 1.5F) || !(var6 <= 1.5F)) {
            break;
         }

         var2++;
      }

      return var2;
   }

   private void uUnuvNvvNU() {
      if (!this.uVUuuVnNVU.isEmpty()) {
         Path var1 = NUNNNUuUNnVv.UuUVuuUu(this.vNUvnnVnUvu.UuuNnUvUuv());
         NUnUuVuNv var2 = NUNNNUuUNnVv.UuUVuuUu(var1);
         if (var2 == null) {
            var2 = new NUnUuVuNv();
            var2.C00OOC00oO = System.currentTimeMillis();
            var2.vVvUvVVuuNvV = NUNNNUuUNnVv.C00OOC00oO(this.vNUvnnVnUvu.UuuNnUvUuv());
         }

         var2.uUnuvNvvNU = System.currentTimeMillis();
         var2.nuUnNvnuUu.addAll(this.uVUuuVnNVU);
         NUNNNUuUNnVv.UuUVuuUu(var1, var2);
         vVnvuVVUunuv.UuUVuuUu("[RotationLab] Saved " + this.uVUuuVnNVU.size() + " patterns to " + var1.getFileName());
      }
   }

   private boolean vVvUvVVuuNvV(double var1, double var3) {
      return this.UuUVuuUu(var1, var3, this.nvUVNnuu.UuUVuuUu, this.nvUVNnuu.C00OOC00oO) <= this.nvUVNnuu.uNNnnnuuuN;
   }

   private String vVvUvVVuuNvV() {
      String var1 = this.vNUvnnVnUvu.nUUVuvU();
      if (!"Mixed".equals(var1)) {
         return var1;
      } else {
         String[] var2 = new String[]{"Flick", "Tracking", "Micro", "Vertical", "Diagonal", "Attack"};
         return var2[ThreadLocalRandom.current().nextInt(var2.length)];
      }
   }

   private double uNNnnnuuuN(double var1, double var3) {
      double var5 = ThreadLocalRandom.current().nextDouble(var1, Math.max(var1 + 1.0, var3));
      return ThreadLocalRandom.current().nextBoolean() ? var5 : -var5;
   }

   private float UuUVuuUu(double var1) {
      return (float)(var1 / Math.max(1.0, (double)this.field_22789) * 95.0);
   }

   private float C00OOC00oO(double var1) {
      return (float)(var1 / Math.max(1.0, (double)this.field_22790) * 70.0);
   }

   private double UuUVuuUu(double var1, double var3, double var5, double var7) {
      return Math.hypot(var1 - var5, var3 - var7);
   }

   private void UuUVuuUu(class_332 var1) {
      byte var2 = 12;
      byte var3 = 12;
      short var4 = 222;
      byte var5 = 74;
      var1.method_25294(var2 - 6, var3 - 6, var2 + var4, var3 + var5, -1441326300);
      var1.method_25303(this.field_22793, "RotationLab", var2, var3, -1446152);
      var1.method_25303(this.field_22793, "asset: " + NUNNNUuUNnVv.C00OOC00oO(this.vNUvnnVnUvu.UuuNnUvUuv()), var2, var3 + 14, -7366230);
      var1.method_25303(this.field_22793, "mode: " + this.vNUvnnVnUvu.nUUVuvU().toLowerCase(Locale.ROOT), var2, var3 + 28, -7366230);
      var1.method_25303(this.field_22793, "patterns: " + this.uVUuuVnNVU.size() + " / " + this.vNUvnnVnUvu.uVUVnuvnuVuv(), var2, var3 + 42, -7366230);
      var1.method_25303(this.field_22793, "R reset  D delete  Esc save", var2, var3 + 56, -7366230);
   }

   private void C00OOC00oO(class_332 var1) {
      if (this.vuuuNvNuv.size() >= 2) {
         for (int var2 = Math.max(1, this.vuuuNvNuv.size() - 20); var2 < this.vuuuNvNuv.size(); var2++) {
            NUnUuVuNv.nvnNNunvv var3 = this.vuuuNvNuv.get(var2 - 1);
            NUnUuVuNv.nvnNNunvv var4 = this.vuuuNvNuv.get(var2);
            int var5 = (int)(this.UnUNVVVNuv + var3.C00OOC00oO / 95.0F * this.field_22789);
            int var6 = (int)(this.vNVuvnUUnuUn + var3.uUnuvNvvNU / 70.0F * this.field_22790);
            int var7 = (int)(this.UnUNVVVNuv + var4.C00OOC00oO / 95.0F * this.field_22789);
            int var8 = (int)(this.vNVuvnUUnuUn + var4.uUnuvNvvNU / 70.0F * this.field_22790);
            this.UuUVuuUu(var1, var5, var6, var7, var8, -2142256137);
         }
      }
   }

   private void uUnuvNvvNU(class_332 var1) {
      if (this.nvUVNnuu != null) {
         this.UuUVuuUu(var1, (int)this.nvUVNnuu.UuUVuuUu, (int)this.nvUVNnuu.C00OOC00oO, this.nvUVNnuu.uNNnnnuuuN + 4, 956255850);
         this.UuUVuuUu(var1, (int)this.nvUVNnuu.UuUVuuUu, (int)this.nvUVNnuu.C00OOC00oO, this.nvUVNnuu.uNNnnnuuuN, -45462);
         this.UuUVuuUu(var1, (int)this.nvUVNnuu.UuUVuuUu, (int)this.nvUVNnuu.C00OOC00oO, Math.max(2, this.nvUVNnuu.uNNnnnuuuN / 4), -1);
         var1.method_25303(
            this.field_22793, this.nvUVNnuu.nuUnNvnuUu, (int)this.nvUVNnuu.UuUVuuUu + this.nvUVNnuu.uNNnnnuuuN + 8, (int)this.nvUVNnuu.C00OOC00oO - 4, -1446152
         );
      }
   }

   private void UuUVuuUu(class_332 var1, int var2, int var3, int var4, int var5) {
      int var6 = var4 * var4;

      for (int var7 = -var4; var7 <= var4; var7++) {
         int var8 = (int)Math.sqrt(Math.max(0, var6 - var7 * var7));
         var1.method_25294(var2 - var8, var3 + var7, var2 + var8 + 1, var3 + var7 + 1, var5);
      }
   }

   private void UuUVuuUu(class_332 var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = Math.abs(var4 - var2);
      int var8 = Math.abs(var5 - var3);
      int var9 = var2 < var4 ? 1 : -1;
      int var10 = var3 < var5 ? 1 : -1;
      int var11 = var7 - var8;

      while (true) {
         var1.method_25294(var2 - 1, var3 - 1, var2 + 2, var3 + 2, var6);
         if (var2 == var4 && var3 == var5) {
            return;
         }

         int var12 = var11 * 2;
         if (var12 > -var8) {
            var11 -= var8;
            var2 += var9;
         }

         if (var12 < var7) {
            var11 += var7;
            var3 += var10;
         }
      }
   }

   static final class NVnVnNnN {
      double UuUVuuUu;
      double C00OOC00oO;
      double uUnuvNvvNU;
      double vVvUvVVuuNvV;
      final int uNNnnnuuuN;
      final String nuUnNvnuUu;

      NVnVnNnN(double var1, double var3, int var5, String var6) {
         this.UuUVuuUu = var1;
         this.C00OOC00oO = var3;
         this.uNNnnnuuuN = var5;
         this.nuUnNvnuUu = var6;
      }
   }
}
