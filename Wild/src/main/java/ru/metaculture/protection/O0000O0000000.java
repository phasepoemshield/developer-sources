package ru.metaculture.protection;

import java.util.List;
import lombok.Generated;

public final class O0000O0000000 {
   private final List<O0000O00000000> O00000000;
   private final float O000000000;

   public static O0000O0000000 O00000000() {
      return new O0000O0000000(List.of(), 0.0F);
   }

   @Generated
   public O0000O0000000(List<O0000O00000000> list, float f) {
      this.O00000000 = list;
      this.O000000000 = f;
   }

   @Generated
   public List<O0000O00000000> O000000000() {
      return this.O00000000;
   }

   @Generated
   public float O0000000000() {
      return this.O000000000;
   }

   @Generated
   @Override
   public boolean equals(Object object) {
      if (object == this) {
         return true;
      } else if (!(object instanceof O0000O0000000 var2)) {
         return false;
      } else if (Float.compare(this.O0000000000(), var2.O0000000000()) != 0) {
         return false;
      } else {
         List var3 = this.O000000000();
         List var4 = var2.O000000000();
         return var3 == null ? var4 == null : var3.equals(var4);
      }
   }

   @Generated
   @Override
   public int hashCode() {
      byte var1 = 59;
      int var2 = 1;
      var2 = var2 * 59 + Float.floatToIntBits(this.O0000000000());
      List var3 = this.O000000000();
      return var2 * 59 + (var3 == null ? 43 : var3.hashCode());
   }

   @Generated
   @Override
   public String toString() {
      return "ModuleLayoutResult(placements=" + this.O000000000() + ", maxScroll=" + this.O0000000000() + ")";
   }
}
