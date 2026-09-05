package ru.metaculture.protection;

import net.minecraft.class_10185;
import net.minecraft.class_299;
import net.minecraft.class_310;
import net.minecraft.class_3469;
import net.minecraft.class_3532;
import net.minecraft.class_634;
import net.minecraft.class_746;
import net.minecraft.class_8791;
import net.minecraft.class_2828.class_2829;
import net.minecraft.class_2828.class_2830;
import net.minecraft.class_2828.class_2831;
import net.minecraft.class_2828.class_5911;

public final class VNNVunUvvnn extends class_746 {
   private final vUNVNUnuv UuUVuuUu;
   private double C00OOC00oO;
   private double uUnuvNvvNU;
   private double vVvUvVVuuNvV;
   private float uNNnnnuuuN;
   private float nuUnNvnuUu;
   private boolean VVuuUN;
   private boolean vNUvnnVnUvu;
   private int uVUuuVnNVU;

   public VNNVunUvvnn(vUNVNUnuv var1, class_310 var2, VnUvNVNVNUUn var3, class_634 var4, class_3469 var5, class_299 var6) {
      this(var1, var2, var3, var4, var5, var6, class_10185.field_54098, false);
   }

   public VNNVunUvvnn(vUNVNUnuv var1, class_310 var2, VnUvNVNVNUUn var3, class_634 var4, class_3469 var5, class_299 var6, class_10185 var7, boolean var8) {
      super(var2, var3, var4, var5, var6, var7, var8);
      this.UuUVuuUu = var1;
      class_8791 var9 = var2.field_1690.method_53842();
      this.method_5841().method_12778(field_7518, (byte)var9.comp_1955());
      this.method_7283(var9.comp_1956());
      this.C00OOC00oO();
   }

   public vUNVNUnuv UuUVuuUu() {
      return this.UuUVuuUu;
   }

   public void method_5773() {
      super.method_5773();
      if (nnVNNuuVUVn.UuUVuuUu() != this.UuUVuuUu) {
         NUNnuuNUvuVU var1 = new NUNnuuNUvuVU(
            this.method_23317(), this.method_23318(), this.method_23321(), this.method_36454(), this.method_36455(), this.method_24828()
         );
         NVnnUnnuVVvU.UuUVuuUu(this.UuUVuuUu, var1);
         if (!var1.UuUVuuUu()) {
            this.UuUVuuUu(var1);
         }
      }
   }

   public void C00OOC00oO() {
      this.C00OOC00oO = this.method_23317();
      this.uUnuvNvvNU = this.method_23318();
      this.vVvUvVVuuNvV = this.method_23321();
      this.uNNnnnuuuN = this.method_36454();
      this.nuUnNvnuUu = this.method_36455();
      this.VVuuUN = this.method_24828();
      this.vNUvnnVnUvu = this.field_5976;
      this.uVUuuVnNVU = 0;
   }

   private void UuUVuuUu(NUNnuuNUvuVU var1) {
      double var2 = var1.uUnuvNvvNU();
      double var4 = var1.vVvUvVVuuNvV();
      double var6 = var1.uNNnnnuuuN();
      float var8 = (float)var1.nuUnNvnuUu();
      float var9 = (float)var1.VVuuUN();
      boolean var10 = var1.vNUvnnVnUvu();
      double var11 = var2 - this.C00OOC00oO;
      double var13 = var4 - this.uUnuvNvvNU;
      double var15 = var6 - this.vVvUvVVuuNvV;
      double var17 = var8 - this.uNNnnnuuuN;
      double var19 = var9 - this.nuUnNvnuUu;
      this.uVUuuVnNVU++;
      boolean var21 = class_3532.method_41190(var11, var13, var15) > class_3532.method_33723(2.0E-4) || this.uVUuuVnNVU >= 20;
      boolean var22 = var17 != 0.0 || var19 != 0.0;
      if (var21 && var22) {
         this.field_3944.method_52787(new class_2830(var2, var4, var6, var8, var9, var10, this.field_5976));
      } else if (var21) {
         this.field_3944.method_52787(new class_2829(var2, var4, var6, var10, this.field_5976));
      } else if (var22) {
         this.field_3944.method_52787(new class_2831(var8, var9, var10, this.field_5976));
      } else if (this.VVuuUN != var10 || this.vNUvnnVnUvu != this.field_5976) {
         this.field_3944.method_52787(new class_5911(var10, this.field_5976));
      }

      if (var21) {
         this.C00OOC00oO = var2;
         this.uUnuvNvvNU = var4;
         this.vVvUvVVuuNvV = var6;
         this.uVUuuVnNVU = 0;
      }

      if (var22) {
         this.uNNnnnuuuN = var8;
         this.nuUnNvnuUu = var9;
      }

      this.VVuuUN = var10;
      this.vNUvnnVnUvu = this.field_5976;
   }
}
