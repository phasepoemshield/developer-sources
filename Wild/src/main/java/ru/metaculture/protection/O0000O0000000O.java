package ru.metaculture.protection;

public final class O0000O0000000O {
   private final float O00000000;
   private final float O000000000;
   private final float O0000000000;
   private final float O00000000000;
   private final float O000000000000;
   private final float O0000000000000;
   private final float O000000000000O;
   private final float O00000000000O;
   private final float O00000000000O0;
   private final float O00000000000OO;
   private final float O0000000000O;
   private final float O0000000000O0;
   private final float O0000000000O00;
   private final float O0000000000O0O;

   private O0000O0000000O(float f, float g, float h, float i, float j, float k, float l, float m, float n, float o, float p, float q, float r, float s) {
      this.O00000000 = f;
      this.O000000000 = g;
      this.O0000000000 = h;
      this.O00000000000 = i;
      this.O000000000000 = j;
      this.O0000000000000 = k;
      this.O000000000000O = l;
      this.O00000000000O = m;
      this.O00000000000O0 = n;
      this.O00000000000OO = o;
      this.O0000000000O = p;
      this.O0000000000O0 = q;
      this.O0000000000O00 = r;
      this.O0000000000O0O = s;
   }

   public static O0000O0000000O O00000000(O00000OOOOOOOO o00000OOOOOOOO, O0000O00000 o0000O00000) {
      float var2 = o0000O00000.O000000000(8.0F);
      float var3 = o0000O00000.O000000000(26.0F);
      float var4 = o0000O00000.O000000000(6.0F);
      float var5 = o00000OOOOOOOO.O000000000O0O() + var2 + o0000O00000.O000000000(44.0F) + var4;
      float var6 = var5 + var3 + var4;
      float var7 = o00000OOOOOOOO.O000000000O0O() + o0000O00000.O000000000O00() - var2 - var6;
      float var8 = o0000O00000.O000000000O0() - var2 * 2.0F;
      float var9 = o0000O00000.O000000000(18.0F);
      float var10 = var8 - var9;
      float var11 = o0000O00000.O000000000(8.0F);
      float var12 = (var10 - var11) * 0.5F;
      float var13 = o0000O00000.O000000000(34.0F);
      float var14 = o0000O00000.O000000000(4.0F);
      float var15 = o00000OOOOOOOO.O000000000O0O0() + o0000O00000.O000000000(7.5F);
      return new O0000O0000000O(
         o00000OOOOOOOO.O000000000O00O() + var2,
         var6,
         var8,
         var7,
         o00000OOOOOOOO.O000000000O00O() + var2,
         var5,
         var8,
         var3,
         var15,
         var12,
         var13,
         var11,
         o0000O00000.O000000000(6.0F),
         var14
      );
   }

   public O0000O0000000O.W330 O00000000(int i, float f) {
      int var3 = i % 2;
      int var4 = i / 2;
      float var5 = this.O00000000000O0 + var3 * (this.O00000000000OO + this.O0000000000O0);
      float var6 = this.O000000000 + this.O0000000000O0O + f + var4 * (this.O0000000000O + this.O0000000000O00);
      return new O0000O0000000O.W330(var5, var6, this.O00000000000OO, this.O0000000000O);
   }

   public float O00000000(int i) {
      int var2 = (i + 1) / 2;
      return this.O0000000000O0O * 2.0F + var2 * this.O0000000000O + Math.max(0, var2 - 1) * this.O0000000000O00;
   }

   public boolean O00000000(O0000O0000000O.W330 o00000000, float f) {
      float var3 = this.O000000000 - Math.max(0.0F, f);
      float var4 = this.O000000000 + this.O00000000000 + Math.max(0.0F, f);
      return o00000000.y + o00000000.height >= var3 && o00000000.y <= var4;
   }

   public float O00000000() {
      return this.O00000000;
   }

   public float O000000000() {
      return this.O000000000;
   }

   public float O0000000000() {
      return this.O0000000000;
   }

   public float O00000000000() {
      return this.O00000000000;
   }

   public float O000000000000() {
      return this.O000000000000;
   }

   public float O0000000000000() {
      return this.O0000000000000;
   }

   public float O000000000000O() {
      return this.O000000000000O;
   }

   public float O00000000000O() {
      return this.O00000000000O;
   }

   public float O00000000000O0() {
      return this.O000000000000 + this.O000000000000O - this.O00000000000O;
   }

   public float O00000000000OO() {
      return this.O00000000000O;
   }

   public float O0000000000O() {
      return this.O00000000000OO;
   }

   public float O0000000000O0() {
      return this.O0000000000O;
   }

   public record W330(float x, float y, float width, float height) {
   }
}
