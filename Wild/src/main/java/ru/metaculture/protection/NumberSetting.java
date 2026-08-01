package ru.metaculture.protection;

import java.util.function.Supplier;

public class NumberSetting extends Setting {
   public float O00000000000;
   public float O000000000000;
   public float O0000000000000;
   public float O000000000000O;
   public float O00000000000O;
   public boolean O00000000000O0;
   public boolean O00000000000OO;
   public String O0000000000O;
   public String[] O0000000000O0;
   private final float O0000000000O00;

   public NumberSetting(String string, float f, float g, float h, float i, boolean bl) {
      this.O00000000 = string;
      this.O000000000000 = g;
      this.O00000000000 = f;
      this.O0000000000000 = h;
      this.O000000000000O = i;
      this.O0000000000O = this.O0000000000O;
      this.O00000000000OO = bl;
      this.O0000000000O00 = f;
   }

   public float O0000000000() {
      return this.O00000000000;
   }

   public void O00000000(float f) {
      if (!Float.isNaN(f) && !Float.isInfinite(f)) {
         this.O00000000000 = Math.max(this.O000000000000, Math.min(this.O0000000000000, f));
      }
   }

   public NumberSetting O00000000(Supplier<Boolean> supplier) {
      this.O000000000 = supplier;
      return this;
   }

   @Override
   public void O000000000() {
      this.O00000000(this.O0000000000O00);
      this.O00000000000O0 = false;
   }

   public NumberSetting O00000000(String... strings) {
      this.O0000000000O0 = strings;
      return this;
   }

   public boolean O00000000000() {
      return this.O0000000000O0 != null && this.O0000000000O0.length > 0;
   }

   public String O000000000(float f) {
      if (!this.O00000000000()) {
         return null;
      } else {
         int var2 = Math.round(this.O0000000000000 - this.O000000000000);
         int var3 = Math.round(f - this.O000000000000);
         if (var2 > 0 && this.O0000000000O0.length == var2 + 1) {
            var3 = Math.max(0, Math.min(this.O0000000000O0.length - 1, var3));
            return this.O0000000000O0[var3];
         } else {
            float var4 = this.O0000000000000 - this.O000000000000 <= 0.0F ? 0.0F : (f - this.O000000000000) / (this.O0000000000000 - this.O000000000000);
            int var5 = Math.max(0, Math.min(this.O0000000000O0.length - 1, Math.round(var4 * (this.O0000000000O0.length - 1))));
            return this.O0000000000O0[var5];
         }
      }
   }
}
