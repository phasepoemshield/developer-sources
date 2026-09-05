package ru.metaculture.protection;

import net.minecraft.class_2561;
import net.minecraft.class_332;
import net.minecraft.class_437;

public final class nuUnNNVUUnU extends class_437 {
   private final UnUvnuVNNN UuUVuuUu = new UnUvnuVNNN();

   public nuUnNNVUUnU() {
      super(class_2561.method_43470("Wild Modern ClickGUI"));
   }

   public UnUvnuVNNN UuUVuuUu() {
      return this.UuUVuuUu;
   }

   protected void method_25426() {
      super.method_25426();
      this.UuUVuuUu.UuUVuuUu(this.field_22787);
      VvNUnuUUuN.uUnuvNvvNU();
   }

   public void method_25394(class_332 var1, int var2, int var3, float var4) {
      if (!this.uUnuvNvvNU()) {
         this.UuUVuuUu.VVuuUN();
      } else {
         this.UuUVuuUu.UuUVuuUu(this.UuUVuuUu(var2), this.C00OOC00oO(var3));
      }
   }

   public void method_25420(class_332 var1, int var2, int var3, float var4) {
   }

   public void method_52752(class_332 var1) {
   }

   public void UuUVuuUu(UnVNvNnU var1, class_332 var2, int var3, int var4, float var5) {
      if (!this.C00OOC00oO(var3, var4)) {
         this.UuUVuuUu.VVuuUN();
      } else {
         this.UuUVuuUu.UuUVuuUu(this.field_22787, var2, var1, var3, var4, var5);
         if (this.UuUVuuUu.uUnuvNvvNU()) {
            this.uNNnnnuuuN();
         }
      }
   }

   public boolean method_25402(double var1, double var3, int var5) {
      if (!this.uUnuvNvvNU()) {
         this.UuUVuuUu.VVuuUN();
         return true;
      } else if (this.UuUVuuUu.vVvUvVVuuNvV()) {
         return true;
      } else {
         this.UuUVuuUu.UuUVuuUu(this.UuUVuuUu(var1), this.C00OOC00oO(var3), var5);
         return true;
      }
   }

   public boolean method_25406(double var1, double var3, int var5) {
      if (!this.uUnuvNvvNU()) {
         this.UuUVuuUu.VVuuUN();
         return true;
      } else if (this.UuUVuuUu.vVvUvVVuuNvV()) {
         return true;
      } else {
         this.UuUVuuUu.C00OOC00oO(this.UuUVuuUu(var1), this.C00OOC00oO(var3), var5);
         return true;
      }
   }

   public boolean method_25403(double var1, double var3, int var5, double var6, double var8) {
      if (!this.uUnuvNvvNU()) {
         this.UuUVuuUu.VVuuUN();
         return true;
      } else if (this.UuUVuuUu.vVvUvVVuuNvV()) {
         return true;
      } else {
         this.UuUVuuUu.UuUVuuUu(this.UuUVuuUu(var1), this.C00OOC00oO(var3), var5, this.uUnuvNvvNU(var6), this.vVvUvVVuuNvV(var8));
         return true;
      }
   }

   public boolean method_25401(double var1, double var3, double var5, double var7) {
      if (!this.uUnuvNvvNU()) {
         this.UuUVuuUu.VVuuUN();
         return true;
      } else if (this.UuUVuuUu.vVvUvVVuuNvV()) {
         return true;
      } else {
         double var9 = var5;
         double var11 = var7;
         if (var5 == 0.0 && (method_25442() || method_25441())) {
            var9 = var7;
            var11 = 0.0;
         }

         this.UuUVuuUu.UuUVuuUu(this.UuUVuuUu(var1), this.C00OOC00oO(var3), var9, var11);
         return true;
      }
   }

   public boolean method_25404(int var1, int var2, int var3) {
      if (var1 == 300) {
         return super.method_25404(var1, var2, var3);
      } else if (!this.uUnuvNvvNU()) {
         this.UuUVuuUu.VVuuUN();
         return true;
      } else if (var1 == 256 && this.UuUVuuUu.vVvUvVVuuNvV()) {
         this.uNNnnnuuuN();
         return true;
      } else if (var1 == this.vVvUvVVuuNvV() && !this.UuUVuuUu.uNNnnnuuuN()) {
         this.method_25419();
         return true;
      } else if (this.UuUVuuUu.vVvUvVVuuNvV()) {
         return true;
      } else {
         return this.UuUVuuUu.UuUVuuUu(var1) ? true : super.method_25404(var1, var2, var3);
      }
   }

   public boolean method_25400(char var1, int var2) {
      if (!this.uUnuvNvvNU()) {
         this.UuUVuuUu.VVuuUN();
         return true;
      } else if (this.UuUVuuUu.vVvUvVVuuNvV()) {
         return true;
      } else {
         return this.UuUVuuUu.UuUVuuUu(var1) ? true : super.method_25400(var1, var2);
      }
   }

   public void method_25419() {
      if (!this.UuUVuuUu.C00OOC00oO()) {
         this.uNNnnnuuuN();
      }
   }

   public void method_25432() {
      this.UuUVuuUu.vNUvnnVnUvu();
      super.method_25432();
   }

   public boolean method_25421() {
      return false;
   }

   public void UuUVuuUu(int var1, int var2) {
      if (var1 <= 0 || var2 <= 0) {
         this.UuUVuuUu.VVuuUN();
      }
   }

   public void UuUVuuUu(boolean var1) {
      if (!var1) {
         this.UuUVuuUu.VVuuUN();
      }
   }

   private float UuUVuuUu(double var1) {
      if (this.field_22787 != null && this.field_22787.method_22683() != null) {
         int var3 = this.field_22787.method_22683().method_4489();
         int var4 = this.field_22787.method_22683().method_4486();
         return var3 > 0 && var4 > 0 ? (float)(var1 * var3 / Math.max(1.0, (double)var4)) : (float)var1;
      } else {
         return (float)var1;
      }
   }

   private float C00OOC00oO(double var1) {
      if (this.field_22787 != null && this.field_22787.method_22683() != null) {
         int var3 = this.field_22787.method_22683().method_4506();
         int var4 = this.field_22787.method_22683().method_4502();
         return var3 > 0 && var4 > 0 ? (float)(var1 * var3 / Math.max(1.0, (double)var4)) : (float)var1;
      } else {
         return (float)var1;
      }
   }

   private float uUnuvNvvNU(double var1) {
      if (this.field_22787 != null && this.field_22787.method_22683() != null) {
         int var3 = this.field_22787.method_22683().method_4489();
         int var4 = this.field_22787.method_22683().method_4486();
         return var3 > 0 && var4 > 0 ? (float)(var1 * var3 / Math.max(1.0, (double)var4)) : (float)var1;
      } else {
         return (float)var1;
      }
   }

   private float vVvUvVVuuNvV(double var1) {
      if (this.field_22787 != null && this.field_22787.method_22683() != null) {
         int var3 = this.field_22787.method_22683().method_4506();
         int var4 = this.field_22787.method_22683().method_4502();
         return var3 > 0 && var4 > 0 ? (float)(var1 * var3 / Math.max(1.0, (double)var4)) : (float)var1;
      } else {
         return (float)var1;
      }
   }

   private boolean C00OOC00oO() {
      return this.field_22787 != null && this.field_22787.method_22683() != null
         ? this.C00OOC00oO(this.field_22787.method_22683().method_4489(), this.field_22787.method_22683().method_4506())
         : false;
   }

   private boolean C00OOC00oO(int var1, int var2) {
      return this.field_22787 != null && this.field_22787.method_22683() != null
         ? var1 > 0
            && var2 > 0
            && this.field_22787.method_22683().method_4489() > 0
            && this.field_22787.method_22683().method_4506() > 0
            && this.field_22787.method_22683().method_4486() > 0
            && this.field_22787.method_22683().method_4502() > 0
         : false;
   }

   private boolean uUnuvNvvNU() {
      return this.C00OOC00oO() && this.field_22787.method_1569();
   }

   private int vVvUvVVuuNvV() {
      Menu var1 = Menu.vNVuvnUUnuUn();
      return var1 != null && var1.uNNnnnuuuN != -1 ? var1.uNNnnnuuuN : 344;
   }

   private void uNNnnnuuuN() {
      this.UuUVuuUu.vNUvnnVnUvu();
      if (this.field_22787 != null) {
         this.field_22787.method_1507(null);
      }
   }
}
