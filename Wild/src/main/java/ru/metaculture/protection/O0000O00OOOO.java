package ru.metaculture.protection;

public final class O0000O00OOOO {
   private float O00000000;
   private float O000000000;

   public O0000O00OOOO(float f, float g) {
      this.O00000000 = f;
      this.O000000000 = g;
   }

   public void O00000000(float f, float g, float h) {
      this.O00000000 = this.O000000000(f, this.O00000000, h);
      this.O000000000 = this.O000000000(g, this.O000000000, h);
   }

   public void O00000000(float f, float g) {
      this.O00000000 = this.O000000000(this.O00000000, f, 1.0F);
      this.O000000000 = this.O000000000(this.O000000000, g, 1.0F);
   }

   public float O000000000(float f, float g, float h) {
      if (h < 0.0F) {
         h = 0.0F;
      }

      if (h > 1.0F) {
         h = 1.0F;
      }

      float var4 = f - g;
      float var5 = Math.abs(var4) * h;
      return var5 < 0.1F ? f : g + (var4 > 0.0F ? var5 : -var5);
   }

   public float O00000000() {
      return this.O00000000;
   }

   public void O00000000(float f) {
      this.O00000000 = f;
   }

   public float O000000000() {
      return this.O000000000;
   }

   public void O000000000(float f) {
      this.O000000000 = f;
   }
}
