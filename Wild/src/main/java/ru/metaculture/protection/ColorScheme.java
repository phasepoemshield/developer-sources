package ru.metaculture.protection;

import lombok.Generated;

public final class ColorScheme {
   private final int O00000000;
   private final int O000000000;
   private final int O0000000000;
   private final int O00000000000;
   private final int O000000000000;
   private final int O0000000000000;
   private final int O000000000000O;
   private final int O00000000000O;
   private final int O00000000000O0;
   private final int O00000000000OO;
   private final int O0000000000O;
   private final int O0000000000O0;
   private final int O0000000000O00;
   private final int O0000000000O0O;
   private final int O0000000000OO;
   private final boolean O0000000000OO0;

   public int O00000000() {
      return this.O0000000000OO0 ? -14705331 : -12452048;
   }

   public int O000000000() {
      return this.O0000000000OO0 ? -4181953 : -43920;
   }

   public int O0000000000() {
      return this.O0000000000OO0 ? -6200825 : -17847;
   }

   public int O00000000000() {
      return this.O0000000000OO0 ? O00000000(this.O0000000000O0O, this.O0000000000O00, 0.55F) : this.O0000000000O0O;
   }

   public static ColorScheme O00000000(Theme o0000000OOO) {
      return O00000000(o0000000OOO, false);
   }

   public static ColorScheme O00000000(Theme o0000000OOO, boolean bl) {
      if (o0000000OOO == Theme.CUSTOM) {
         MenuModule.O0000000000OO0();
      }

      int var2 = O000000000(o0000000OOO);
      int var3 = O0000000000(o0000000OOO);
      int var4 = bl ? o0000000OOO.O000000000000().getRGB() : o0000000OOO.O00000000000().getRGB();
      int var5 = o0000000OOO.O000000000000().getRGB();
      int var6 = o0000000OOO.O0000000000000().getRGB();
      if (o0000000OOO == Theme.MIDNIGHT_AZURE) {
         return O000000000000()
            .O00000000(O00000000(5, 10, 22, 238))
            .O000000000(O00000000(8, 19, 34, 242))
            .O0000000000(O00000000(189, 234, 255, 8))
            .O00000000000(O00000000(189, 234, 255, 13))
            .O000000000000(O00000000(189, 234, 255, 20))
            .O0000000000000(O00000000(189, 234, 255, 28))
            .O000000000000O(O00000000(189, 234, 255, 38))
            .O00000000000O(O00000000(189, 234, 255, 50))
            .O00000000000O0(O00000000(0, 240, 255, 72))
            .O00000000000OO(O00000000(0, 240, 255, 90))
            .O0000000000O(O00000000(189, 234, 255, 140))
            .O0000000000O0(O00000000(232, 251, 255, 214))
            .O0000000000O00(O00000000(255, 255, 255, 255))
            .O0000000000O0O(-16715521)
            .O0000000000OO(-16759553)
            .O00000000(false)
            .O00000000();
      } else {
         ColorScheme.W348 var7 = O000000000000()
            .O00000000(O00000000(O00000000(o0000000OOO.O000000000().getRGB(), var3, bl ? 0.04F : 0.05F), bl ? 226 : 232))
            .O000000000(O00000000(O00000000(o0000000OOO.O0000000000().getRGB(), var3, bl ? 0.025F : 0.035F), bl ? 240 : 238))
            .O0000000000O00(O00000000(var5, 255))
            .O0000000000O0O(var2)
            .O0000000000OO(var3)
            .O00000000(bl);
         return bl
            ? var7.O0000000000(O00000000(var4, 4))
               .O00000000000(O00000000(var4, 8))
               .O000000000000(O00000000(var4, 12))
               .O0000000000000(O00000000(var4, 16))
               .O000000000000O(O00000000(var4, 24))
               .O00000000000O(O00000000(var4, 31))
               .O00000000000O0(O00000000(var4, 42))
               .O00000000000OO(O00000000(var4, 54))
               .O0000000000O(O00000000(var6, 190))
               .O0000000000O0(O00000000(var6, 255))
               .O00000000()
            : var7.O0000000000(O00000000(var4, 3))
               .O00000000000(O00000000(var4, 5))
               .O000000000000(O00000000(var4, 8))
               .O0000000000000(O00000000(var4, 10))
               .O000000000000O(O00000000(var4, 15))
               .O00000000000O(O00000000(var4, 20))
               .O00000000000O0(O00000000(var4, 31))
               .O00000000000OO(O00000000(var4, 41))
               .O0000000000O(O00000000(var6, 61))
               .O0000000000O0(O00000000(var6, 122))
               .O00000000();
      }
   }

   public static ColorScheme O00000000(Theme o0000000OOO, ColorScheme o0000O000O0OO, long l) {
      if (o0000O000O0OO == null) {
         o0000O000O0OO = O00000000(o0000000OOO);
      }

      return O0000O000O0OO0.O00000000(o0000000OOO, o0000O000O0OO, l);
   }

   public static int O00000000(int i, int j, int k, int l) {
      return (l & 0xFF) << 24 | (i & 0xFF) << 16 | (j & 0xFF) << 8 | k & 0xFF;
   }

   public static int O00000000(int i, int j) {
      return O00000000(i >> 16 & 0xFF, i >> 8 & 0xFF, i & 0xFF, Math.max(0, Math.min(255, j)));
   }

   public static int O00000000(int i, int j, float f) {
      return O0000O000OO000.O0000000000(i, j, f);
   }

   public static int O000000000(int i, int j, float f) {
      float var3 = Math.max(0.0F, Math.min(1.0F, f));
      int var4 = i >>> 16 & 0xFF;
      int var5 = i >>> 8 & 0xFF;
      int var6 = i & 0xFF;
      int var7 = i >>> 24 & 0xFF;
      int var8 = j >>> 16 & 0xFF;
      int var9 = j >>> 8 & 0xFF;
      int var10 = j & 0xFF;
      int var11 = 255 - (255 - var4) * (255 - var8) / 255;
      int var12 = 255 - (255 - var5) * (255 - var9) / 255;
      int var13 = 255 - (255 - var6) * (255 - var10) / 255;
      return O0000O000OO000.O0000000000(i, O00000000(var11, var12, var13, var7), var3);
   }

   private static int O000000000(Theme o0000000OOO) {
      if (o0000000OOO == Theme.MIDNIGHT_AZURE) {
         return -16715521;
      } else if (o0000000OOO == Theme.VERNAL_SOLSTICE) {
         return -13447886;
      } else if (o0000000OOO == Theme.SAKURA_BREEZE) {
         return -18491;
      } else if (o0000000OOO == Theme.OBSIDIAN_EMBER) {
         return -20119;
      } else if (o0000000OOO == Theme.GLACIER_VEIL) {
         return -5706497;
      } else if (o0000000OOO == Theme.VELVET_DUSK) {
         return -3563265;
      } else if (o0000000OOO == Theme.PORCELAIN_DAWN) {
         return -20342;
      } else if (o0000000OOO == Theme.FRUTIGER_AERO) {
         return -8657678;
      } else {
         return o0000000OOO == Theme.WILD ? -6375937 : O00000000(o0000000OOO.O00000000().getRGB(), 0.22F);
      }
   }

   private static int O0000000000(Theme o0000000OOO) {
      if (o0000000OOO == Theme.MIDNIGHT_AZURE) {
         return -16759553;
      } else if (o0000000OOO == Theme.VERNAL_SOLSTICE) {
         return -10496;
      } else if (o0000000OOO == Theme.SAKURA_BREEZE) {
         return -16181;
      } else if (o0000000OOO == Theme.OBSIDIAN_EMBER) {
         return -42198;
      } else if (o0000000OOO == Theme.GLACIER_VEIL) {
         return -12681729;
      } else if (o0000000OOO == Theme.VELVET_DUSK) {
         return -8635667;
      } else if (o0000000OOO == Theme.PORCELAIN_DAWN) {
         return -30116;
      } else if (o0000000OOO == Theme.FRUTIGER_AERO) {
         return -13722666;
      } else {
         return o0000000OOO == Theme.WILD ? -8216577 : O00000000(o0000000OOO.O00000000().getRGB(), 255);
      }
   }

   static int O00000000(int[] is, float f) {
      if (is != null && is.length != 0) {
         if (is.length == 1) {
            return is[0];
         } else {
            float var2 = f - (float)Math.floor(f);
            float var3 = var2 * (is.length - 1);
            int var4 = Math.min(is.length - 2, Math.max(0, (int)Math.floor(var3)));
            return O00000000(is[var4], is[var4 + 1], var3 - var4);
         }
      } else {
         return -1;
      }
   }

   public static ColorScheme O00000000(ColorScheme o0000O000O0OO, ColorScheme o0000O000O0OO2, float f) {
      if (f <= 0.0F) {
         return o0000O000O0OO;
      } else {
         return f >= 1.0F
            ? o0000O000O0OO2
            : O000000000000()
               .O00000000(O00000000(o0000O000O0OO.O00000000, o0000O000O0OO2.O00000000, f))
               .O000000000(O00000000(o0000O000O0OO.O000000000, o0000O000O0OO2.O000000000, f))
               .O0000000000(O00000000(o0000O000O0OO.O0000000000, o0000O000O0OO2.O0000000000, f))
               .O00000000000(O00000000(o0000O000O0OO.O00000000000, o0000O000O0OO2.O00000000000, f))
               .O000000000000(O00000000(o0000O000O0OO.O000000000000, o0000O000O0OO2.O000000000000, f))
               .O0000000000000(O00000000(o0000O000O0OO.O0000000000000, o0000O000O0OO2.O0000000000000, f))
               .O000000000000O(O00000000(o0000O000O0OO.O000000000000O, o0000O000O0OO2.O000000000000O, f))
               .O00000000000O(O00000000(o0000O000O0OO.O00000000000O, o0000O000O0OO2.O00000000000O, f))
               .O00000000000O0(O00000000(o0000O000O0OO.O00000000000O0, o0000O000O0OO2.O00000000000O0, f))
               .O00000000000OO(O00000000(o0000O000O0OO.O00000000000OO, o0000O000O0OO2.O00000000000OO, f))
               .O0000000000O(O00000000(o0000O000O0OO.O0000000000O, o0000O000O0OO2.O0000000000O, f))
               .O0000000000O0(O00000000(o0000O000O0OO.O0000000000O0, o0000O000O0OO2.O0000000000O0, f))
               .O0000000000O00(O00000000(o0000O000O0OO.O0000000000O00, o0000O000O0OO2.O0000000000O00, f))
               .O0000000000O0O(O00000000(o0000O000O0OO.O0000000000O0O, o0000O000O0OO2.O0000000000O0O, f))
               .O0000000000OO(O00000000(o0000O000O0OO.O0000000000OO, o0000O000O0OO2.O0000000000OO, f))
               .O00000000(f >= 0.5F ? o0000O000O0OO2.O0000000000OO0 : o0000O000O0OO.O0000000000OO0)
               .O00000000();
      }
   }

   static int O00000000(int i, float f) {
      return O0000O000OO000.O0000000000(O00000000(i, 255), -1, f);
   }

   @Generated
   ColorScheme(int i, int j, int k, int l, int m, int n, int o, int p, int q, int r, int s, int t, int u, int v, int w, boolean bl) {
      this.O00000000 = i;
      this.O000000000 = j;
      this.O0000000000 = k;
      this.O00000000000 = l;
      this.O000000000000 = m;
      this.O0000000000000 = n;
      this.O000000000000O = o;
      this.O00000000000O = p;
      this.O00000000000O0 = q;
      this.O00000000000OO = r;
      this.O0000000000O = s;
      this.O0000000000O0 = t;
      this.O0000000000O00 = u;
      this.O0000000000O0O = v;
      this.O0000000000OO = w;
      this.O0000000000OO0 = bl;
   }

   @Generated
   public static ColorScheme.W348 O000000000000() {
      return new ColorScheme.W348();
   }

   @Generated
   public int O0000000000000() {
      return this.O00000000;
   }

   @Generated
   public int O000000000000O() {
      return this.O000000000;
   }

   @Generated
   public int O00000000000O() {
      return this.O0000000000;
   }

   @Generated
   public int O00000000000O0() {
      return this.O00000000000;
   }

   @Generated
   public int O00000000000OO() {
      return this.O000000000000;
   }

   @Generated
   public int O0000000000O() {
      return this.O0000000000000;
   }

   @Generated
   public int O0000000000O0() {
      return this.O000000000000O;
   }

   @Generated
   public int O0000000000O00() {
      return this.O00000000000O;
   }

   @Generated
   public int O0000000000O0O() {
      return this.O00000000000O0;
   }

   @Generated
   public int O0000000000OO() {
      return this.O00000000000OO;
   }

   @Generated
   public int O0000000000OO0() {
      return this.O0000000000O;
   }

   @Generated
   public int O0000000000OOO() {
      return this.O0000000000O0;
   }

   @Generated
   public int O000000000O() {
      return this.O0000000000O00;
   }

   @Generated
   public int O000000000O0() {
      return this.O0000000000O0O;
   }

   @Generated
   public int O000000000O00() {
      return this.O0000000000OO;
   }

   @Generated
   public boolean O000000000O000() {
      return this.O0000000000OO0;
   }

   @Generated
   @Override
   public boolean equals(Object object) {
      if (object == this) {
         return true;
      } else if (!(object instanceof ColorScheme var2)) {
         return false;
      } else if (this.O0000000000000() != var2.O0000000000000()) {
         return false;
      } else if (this.O000000000000O() != var2.O000000000000O()) {
         return false;
      } else if (this.O00000000000O() != var2.O00000000000O()) {
         return false;
      } else if (this.O00000000000O0() != var2.O00000000000O0()) {
         return false;
      } else if (this.O00000000000OO() != var2.O00000000000OO()) {
         return false;
      } else if (this.O0000000000O() != var2.O0000000000O()) {
         return false;
      } else if (this.O0000000000O0() != var2.O0000000000O0()) {
         return false;
      } else if (this.O0000000000O00() != var2.O0000000000O00()) {
         return false;
      } else if (this.O0000000000O0O() != var2.O0000000000O0O()) {
         return false;
      } else if (this.O0000000000OO() != var2.O0000000000OO()) {
         return false;
      } else if (this.O0000000000OO0() != var2.O0000000000OO0()) {
         return false;
      } else if (this.O0000000000OOO() != var2.O0000000000OOO()) {
         return false;
      } else if (this.O000000000O() != var2.O000000000O()) {
         return false;
      } else if (this.O000000000O0() != var2.O000000000O0()) {
         return false;
      } else {
         return this.O000000000O00() != var2.O000000000O00() ? false : this.O000000000O000() == var2.O000000000O000();
      }
   }

   @Generated
   @Override
   public int hashCode() {
      byte var1 = 59;
      int var2 = 1;
      var2 = var2 * 59 + this.O0000000000000();
      var2 = var2 * 59 + this.O000000000000O();
      var2 = var2 * 59 + this.O00000000000O();
      var2 = var2 * 59 + this.O00000000000O0();
      var2 = var2 * 59 + this.O00000000000OO();
      var2 = var2 * 59 + this.O0000000000O();
      var2 = var2 * 59 + this.O0000000000O0();
      var2 = var2 * 59 + this.O0000000000O00();
      var2 = var2 * 59 + this.O0000000000O0O();
      var2 = var2 * 59 + this.O0000000000OO();
      var2 = var2 * 59 + this.O0000000000OO0();
      var2 = var2 * 59 + this.O0000000000OOO();
      var2 = var2 * 59 + this.O000000000O();
      var2 = var2 * 59 + this.O000000000O0();
      var2 = var2 * 59 + this.O000000000O00();
      return var2 * 59 + (this.O000000000O000() ? 79 : 97);
   }

   @Generated
   @Override
   public String toString() {
      return "Colors(panel="
         + this.O0000000000000()
         + ", surface="
         + this.O000000000000O()
         + ", white01="
         + this.O00000000000O()
         + ", white02="
         + this.O00000000000O0()
         + ", white03="
         + this.O00000000000OO()
         + ", white04="
         + this.O0000000000O()
         + ", white06="
         + this.O0000000000O0()
         + ", white08="
         + this.O0000000000O00()
         + ", white12="
         + this.O0000000000O0O()
         + ", white16="
         + this.O0000000000OO()
         + ", white24="
         + this.O0000000000OO0()
         + ", white48="
         + this.O0000000000OOO()
         + ", white="
         + this.O000000000O()
         + ", accentTop="
         + this.O000000000O0()
         + ", accentBottom="
         + this.O000000000O00()
         + ", lightMode="
         + this.O000000000O000()
         + ")";
   }

   @Generated
   public static class W348 {
      @Generated
      private int O00000000;
      @Generated
      private int O000000000;
      @Generated
      private int O0000000000;
      @Generated
      private int O00000000000;
      @Generated
      private int O000000000000;
      @Generated
      private int O0000000000000;
      @Generated
      private int O000000000000O;
      @Generated
      private int O00000000000O;
      @Generated
      private int O00000000000O0;
      @Generated
      private int O00000000000OO;
      @Generated
      private int O0000000000O;
      @Generated
      private int O0000000000O0;
      @Generated
      private int O0000000000O00;
      @Generated
      private int O0000000000O0O;
      @Generated
      private int O0000000000OO;
      @Generated
      private boolean O0000000000OO0;

      @Generated
      W348() {
      }

      @Generated
      public ColorScheme.W348 O00000000(int i) {
         this.O00000000 = i;
         return this;
      }

      @Generated
      public ColorScheme.W348 O000000000(int i) {
         this.O000000000 = i;
         return this;
      }

      @Generated
      public ColorScheme.W348 O0000000000(int i) {
         this.O0000000000 = i;
         return this;
      }

      @Generated
      public ColorScheme.W348 O00000000000(int i) {
         this.O00000000000 = i;
         return this;
      }

      @Generated
      public ColorScheme.W348 O000000000000(int i) {
         this.O000000000000 = i;
         return this;
      }

      @Generated
      public ColorScheme.W348 O0000000000000(int i) {
         this.O0000000000000 = i;
         return this;
      }

      @Generated
      public ColorScheme.W348 O000000000000O(int i) {
         this.O000000000000O = i;
         return this;
      }

      @Generated
      public ColorScheme.W348 O00000000000O(int i) {
         this.O00000000000O = i;
         return this;
      }

      @Generated
      public ColorScheme.W348 O00000000000O0(int i) {
         this.O00000000000O0 = i;
         return this;
      }

      @Generated
      public ColorScheme.W348 O00000000000OO(int i) {
         this.O00000000000OO = i;
         return this;
      }

      @Generated
      public ColorScheme.W348 O0000000000O(int i) {
         this.O0000000000O = i;
         return this;
      }

      @Generated
      public ColorScheme.W348 O0000000000O0(int i) {
         this.O0000000000O0 = i;
         return this;
      }

      @Generated
      public ColorScheme.W348 O0000000000O00(int i) {
         this.O0000000000O00 = i;
         return this;
      }

      @Generated
      public ColorScheme.W348 O0000000000O0O(int i) {
         this.O0000000000O0O = i;
         return this;
      }

      @Generated
      public ColorScheme.W348 O0000000000OO(int i) {
         this.O0000000000OO = i;
         return this;
      }

      @Generated
      public ColorScheme.W348 O00000000(boolean bl) {
         this.O0000000000OO0 = bl;
         return this;
      }

      @Generated
      public ColorScheme O00000000() {
         return new ColorScheme(
            this.O00000000,
            this.O000000000,
            this.O0000000000,
            this.O00000000000,
            this.O000000000000,
            this.O0000000000000,
            this.O000000000000O,
            this.O00000000000O,
            this.O00000000000O0,
            this.O00000000000OO,
            this.O0000000000O,
            this.O0000000000O0,
            this.O0000000000O00,
            this.O0000000000O0O,
            this.O0000000000OO,
            this.O0000000000OO0
         );
      }

      @Generated
      @Override
      public String toString() {
         return "Colors.ColorsBuilder(panel="
            + this.O00000000
            + ", surface="
            + this.O000000000
            + ", white01="
            + this.O0000000000
            + ", white02="
            + this.O00000000000
            + ", white03="
            + this.O000000000000
            + ", white04="
            + this.O0000000000000
            + ", white06="
            + this.O000000000000O
            + ", white08="
            + this.O00000000000O
            + ", white12="
            + this.O00000000000O0
            + ", white16="
            + this.O00000000000OO
            + ", white24="
            + this.O0000000000O
            + ", white48="
            + this.O0000000000O0
            + ", white="
            + this.O0000000000O00
            + ", accentTop="
            + this.O0000000000O0O
            + ", accentBottom="
            + this.O0000000000OO
            + ", lightMode="
            + this.O0000000000OO0
            + ")";
      }
   }
}
