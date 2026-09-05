package ru.metaculture.protection;

import java.util.List;
import lombok.Generated;

public final class CCCo0o0cCCo {
   private final List<VvvVunn> UuUVuuUu;
   private final float C00OOC00oO;

   public static CCCo0o0cCCo UuUVuuUu() {
      return new CCCo0o0cCCo(List.of(), 0.0F);
   }

   @Generated
   public CCCo0o0cCCo(List<VvvVunn> var1, float var2) {
      this.UuUVuuUu = var1;
      this.C00OOC00oO = var2;
   }

   @Generated
   public List<VvvVunn> C00OOC00oO() {
      return this.UuUVuuUu;
   }

   @Generated
   public float uUnuvNvvNU() {
      return this.C00OOC00oO;
   }

   @Generated
   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof CCCo0o0cCCo var2)) {
         return false;
      } else if (Float.compare(this.uUnuvNvvNU(), var2.uUnuvNvvNU()) != 0) {
         return false;
      } else {
         List var3 = this.C00OOC00oO();
         List var4 = var2.C00OOC00oO();
         return var3 == null ? var4 == null : var3.equals(var4);
      }
   }

   @Generated
   @Override
   public int hashCode() {
      byte var1 = 59;
      int var2 = 1;
      var2 = var2 * 59 + Float.floatToIntBits(this.uUnuvNvvNU());
      List var3 = this.C00OOC00oO();
      return var2 * 59 + (var3 == null ? 43 : var3.hashCode());
   }

   @Generated
   @Override
   public String toString() {
      return "ModuleLayoutResult(placements=" + this.C00OOC00oO() + ", maxScroll=" + this.uUnuvNvvNU() + ")";
   }
}
