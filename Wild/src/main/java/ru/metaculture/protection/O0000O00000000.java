package ru.metaculture.protection;

import lombok.Generated;
import org.wild.module.api.Module;

public final class O0000O00000000 {
   private final Module O00000000;
   private final float O000000000;
   private final float O0000000000;
   private final float O00000000000;
   private final float O000000000000;
   private final float O0000000000000;

   @Generated
   public O0000O00000000(Module module, float f, float g, float h, float i, float j) {
      this.O00000000 = module;
      this.O000000000 = f;
      this.O0000000000 = g;
      this.O00000000000 = h;
      this.O000000000000 = i;
      this.O0000000000000 = j;
   }

   @Generated
   public Module O00000000() {
      return this.O00000000;
   }

   @Generated
   public float O000000000() {
      return this.O000000000;
   }

   @Generated
   public float O0000000000() {
      return this.O0000000000;
   }

   @Generated
   public float O00000000000() {
      return this.O00000000000;
   }

   @Generated
   public float O000000000000() {
      return this.O000000000000;
   }

   @Generated
   public float O0000000000000() {
      return this.O0000000000000;
   }

   @Generated
   @Override
   public boolean equals(Object object) {
      if (object == this) {
         return true;
      } else if (!(object instanceof O0000O00000000 var2)) {
         return false;
      } else if (Float.compare(this.O000000000(), var2.O000000000()) != 0) {
         return false;
      } else if (Float.compare(this.O0000000000(), var2.O0000000000()) != 0) {
         return false;
      } else if (Float.compare(this.O00000000000(), var2.O00000000000()) != 0) {
         return false;
      } else if (Float.compare(this.O000000000000(), var2.O000000000000()) != 0) {
         return false;
      } else if (Float.compare(this.O0000000000000(), var2.O0000000000000()) != 0) {
         return false;
      } else {
         Module var3 = this.O00000000();
         Module var4 = var2.O00000000();
         return var3 == null ? var4 == null : var3.equals(var4);
      }
   }

   @Generated
   @Override
   public int hashCode() {
      byte var1 = 59;
      int var2 = 1;
      var2 = var2 * 59 + Float.floatToIntBits(this.O000000000());
      var2 = var2 * 59 + Float.floatToIntBits(this.O0000000000());
      var2 = var2 * 59 + Float.floatToIntBits(this.O00000000000());
      var2 = var2 * 59 + Float.floatToIntBits(this.O000000000000());
      var2 = var2 * 59 + Float.floatToIntBits(this.O0000000000000());
      Module var3 = this.O00000000();
      return var2 * 59 + (var3 == null ? 43 : var3.hashCode());
   }

   @Generated
   @Override
   public String toString() {
      return "ModulePlacement(module="
         + this.O00000000()
         + ", x="
         + this.O000000000()
         + ", y="
         + this.O0000000000()
         + ", width="
         + this.O00000000000()
         + ", height="
         + this.O000000000000()
         + ", settingsHeight="
         + this.O0000000000000()
         + ")";
   }
}
