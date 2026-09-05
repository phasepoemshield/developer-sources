package ru.metaculture.protection;

import lombok.Generated;
import org.wild.module.api.Module;

public final class VvvVunn {
   private final Module UuUVuuUu;
   private final float C00OOC00oO;
   private final float uUnuvNvvNU;
   private final float vVvUvVVuuNvV;
   private final float uNNnnnuuuN;
   private final float nuUnNvnuUu;

   @Generated
   public VvvVunn(Module var1, float var2, float var3, float var4, float var5, float var6) {
      this.UuUVuuUu = var1;
      this.C00OOC00oO = var2;
      this.uUnuvNvvNU = var3;
      this.vVvUvVVuuNvV = var4;
      this.uNNnnnuuuN = var5;
      this.nuUnNvnuUu = var6;
   }

   @Generated
   public Module UuUVuuUu() {
      return this.UuUVuuUu;
   }

   @Generated
   public float C00OOC00oO() {
      return this.C00OOC00oO;
   }

   @Generated
   public float uUnuvNvvNU() {
      return this.uUnuvNvvNU;
   }

   @Generated
   public float vVvUvVVuuNvV() {
      return this.vVvUvVVuuNvV;
   }

   @Generated
   public float uNNnnnuuuN() {
      return this.uNNnnnuuuN;
   }

   @Generated
   public float nuUnNvnuUu() {
      return this.nuUnNvnuUu;
   }

   @Generated
   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof VvvVunn var2)) {
         return false;
      } else if (Float.compare(this.C00OOC00oO(), var2.C00OOC00oO()) != 0) {
         return false;
      } else if (Float.compare(this.uUnuvNvvNU(), var2.uUnuvNvvNU()) != 0) {
         return false;
      } else if (Float.compare(this.vVvUvVVuuNvV(), var2.vVvUvVVuuNvV()) != 0) {
         return false;
      } else if (Float.compare(this.uNNnnnuuuN(), var2.uNNnnnuuuN()) != 0) {
         return false;
      } else if (Float.compare(this.nuUnNvnuUu(), var2.nuUnNvnuUu()) != 0) {
         return false;
      } else {
         Module var3 = this.UuUVuuUu();
         Module var4 = var2.UuUVuuUu();
         return var3 == null ? var4 == null : var3.equals(var4);
      }
   }

   @Generated
   @Override
   public int hashCode() {
      byte var1 = 59;
      int var2 = 1;
      var2 = var2 * 59 + Float.floatToIntBits(this.C00OOC00oO());
      var2 = var2 * 59 + Float.floatToIntBits(this.uUnuvNvvNU());
      var2 = var2 * 59 + Float.floatToIntBits(this.vVvUvVVuuNvV());
      var2 = var2 * 59 + Float.floatToIntBits(this.uNNnnnuuuN());
      var2 = var2 * 59 + Float.floatToIntBits(this.nuUnNvnuUu());
      Module var3 = this.UuUVuuUu();
      return var2 * 59 + (var3 == null ? 43 : var3.hashCode());
   }

   @Generated
   @Override
   public String toString() {
      return "ModulePlacement(module="
         + this.UuUVuuUu()
         + ", x="
         + this.C00OOC00oO()
         + ", y="
         + this.uUnuvNvvNU()
         + ", width="
         + this.vVvUvVVuuNvV()
         + ", height="
         + this.uNNnnnuuuN()
         + ", settingsHeight="
         + this.nuUnNvnuUu()
         + ")";
   }
}
