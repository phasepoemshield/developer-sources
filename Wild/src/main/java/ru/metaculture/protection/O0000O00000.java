package ru.metaculture.protection;

import lombok.Generated;
import net.minecraft.client.MinecraftClient;

public final class O0000O00000 {
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
   private final float O0000000000OO;
   private final float O0000000000OO0;
   private final float O0000000000OOO;
   private final float O000000000O;
   private final float O000000000O0;

   public static O0000O00000 O00000000(MinecraftClient minecraftClient, O0000O0000 o0000O0000) {
      return minecraftClient != null
            && minecraftClient.getWindow() != null
            && minecraftClient.getWindow().getFramebufferWidth() > 0
            && minecraftClient.getWindow().getFramebufferHeight() > 0
         ? O00000000(
            minecraftClient.getWindow().getFramebufferWidth(), minecraftClient.getWindow().getFramebufferHeight(), O00000000(minecraftClient), o0000O0000
         )
         : O00000000(o0000O0000.O000000000O000(), o0000O0000);
   }

   public static O0000O00000 O00000000(float f, float g, O0000O0000 o0000O0000) {
      return O00000000(f, g, 1.0F, o0000O0000);
   }

   public static O0000O00000 O00000000(float f, float g, float h, O0000O0000 o0000O0000) {
      if (!(f <= 0.0F) && !(g <= 0.0F)) {
         float var4 = 16.0F;
         float var5 = (f - var4 * 2.0F) / o0000O0000.O0000000000();
         float var6 = (g - var4 * 2.0F) / o0000O0000.O00000000000();
         float var7 = Math.min(var5, var6);
         float var8 = Math.max(1.0F, h);
         float var9 = 0.68F + Math.min(var8, 2.0F) * 0.28F;
         float var10 = Math.max(o0000O0000.O000000000O00(), Math.min(o0000O0000.O000000000O000(), var9 * O000000000O000()));
         float var11 = Math.min(var10, var7);
         var11 = Math.max(o0000O0000.O000000000O00(), Math.min(o0000O0000.O000000000O000(), var11));
         float var12 = Math.max(o0000O0000.O000000000O00(), Math.min(o0000O0000.O000000000O000(), var9 * O000000000O00O()));
         float var13 = Math.max(o0000O0000.O000000000O00(), Math.min(o0000O0000.O000000000O000(), var12));
         return O000000000(var11, var13, o0000O0000);
      } else {
         return O00000000(o0000O0000.O000000000O000(), o0000O0000);
      }
   }

   public static O0000O00000 O00000000(float f, O0000O0000 o0000O0000) {
      return O000000000(f, f, o0000O0000);
   }

   public static O0000O00000 O000000000(float f, float g, O0000O0000 o0000O0000) {
      return O00000000()
         .O00000000(f)
         .O000000000(g)
         .O0000000000(o0000O0000.O0000000000() * f)
         .O00000000000(o0000O0000.O00000000000() * f)
         .O000000000000(o0000O0000.O000000000000() * f)
         .O0000000000000(o0000O0000.O0000000000000() * f)
         .O000000000000O(o0000O0000.O000000000000O() * f)
         .O00000000000O(o0000O0000.O00000000000O() * f)
         .O00000000000O0(o0000O0000.O00000000000O0() * f)
         .O00000000000OO(o0000O0000.O00000000000OO() * f)
         .O0000000000O(o0000O0000.O0000000000O() * f)
         .O0000000000O0(o0000O0000.O0000000000O0() * f)
         .O0000000000O00(o0000O0000.O0000000000O00() * f)
         .O0000000000O0O(o0000O0000.O0000000000O0O() * f)
         .O0000000000OO(o0000O0000.O0000000000OO() * f)
         .O0000000000OO0(o0000O0000.O0000000000OO0() * f)
         .O0000000000OOO(o0000O0000.O0000000000OOO() * f)
         .O000000000O(o0000O0000.O000000000O() * g)
         .O000000000O0(o0000O0000.O000000000O0() * g)
         .O00000000();
   }

   public float O00000000(float f) {
      return f * this.O00000000;
   }

   public float O000000000(float f) {
      return f * this.O000000000;
   }

   public O0000O00000 O0000000000(float f) {
      return O00000000()
         .O00000000(f)
         .O000000000(this.O000000000)
         .O0000000000(this.O0000000000)
         .O00000000000(this.O00000000000)
         .O000000000000(this.O000000000000)
         .O0000000000000(this.O0000000000000)
         .O000000000000O(this.O000000000000O)
         .O00000000000O(this.O00000000000O)
         .O00000000000O0(this.O00000000000O0)
         .O00000000000OO(this.O00000000000OO)
         .O0000000000O(this.O0000000000O)
         .O0000000000O0(this.O0000000000O0)
         .O0000000000O00(this.O0000000000O00)
         .O0000000000O0O(this.O0000000000O0O)
         .O0000000000OO(this.O0000000000OO)
         .O0000000000OO0(this.O0000000000OO0)
         .O0000000000OOO(this.O0000000000OOO)
         .O000000000O(this.O000000000O)
         .O000000000O0(this.O000000000O0)
         .O00000000();
   }

   private static float O00000000(MinecraftClient minecraftClient) {
      if (minecraftClient != null && minecraftClient.getWindow() != null) {
         try {
            return Math.max(1.0F, (float)minecraftClient.getWindow().getScaleFactor());
         } catch (Exception var3) {
            int var2 = Math.max(1, minecraftClient.getWindow().getScaledWidth());
            return Math.max(1.0F, (float)minecraftClient.getWindow().getFramebufferWidth() / var2);
         }
      } else {
         return 1.0F;
      }
   }

   private static float O000000000O000() {
      try {
         return MenuModule.O000000000OO0 == null ? 0.86F : Math.max(0.72F, Math.min(1.7F, MenuModule.O000000000OO0.O0000000000()));
      } catch (Throwable var1) {
         return 0.86F;
      }
   }

   private static float O000000000O00O() {
      try {
         return MenuModule.O000000000OO00 == null ? 0.86F : Math.max(0.72F, Math.min(1.7F, MenuModule.O000000000OO00.O0000000000()));
      } catch (Throwable var1) {
         return 0.86F;
      }
   }

   @Generated
   O0000O00000(
      float f,
      float g,
      float h,
      float i,
      float j,
      float k,
      float l,
      float m,
      float n,
      float o,
      float p,
      float q,
      float r,
      float s,
      float t,
      float u,
      float v,
      float w,
      float x
   ) {
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
      this.O0000000000OO = t;
      this.O0000000000OO0 = u;
      this.O0000000000OOO = v;
      this.O000000000O = w;
      this.O000000000O0 = x;
   }

   @Generated
   public static O0000O00000.W329 O00000000() {
      return new O0000O00000.W329();
   }

   @Generated
   public float O000000000() {
      return this.O00000000;
   }

   @Generated
   public float O0000000000() {
      return this.O000000000;
   }

   @Generated
   public float O00000000000() {
      return this.O0000000000;
   }

   @Generated
   public float O000000000000() {
      return this.O00000000000;
   }

   @Generated
   public float O0000000000000() {
      return this.O000000000000;
   }

   @Generated
   public float O000000000000O() {
      return this.O0000000000000;
   }

   @Generated
   public float O00000000000O() {
      return this.O000000000000O;
   }

   @Generated
   public float O00000000000O0() {
      return this.O00000000000O;
   }

   @Generated
   public float O00000000000OO() {
      return this.O00000000000O0;
   }

   @Generated
   public float O0000000000O() {
      return this.O00000000000OO;
   }

   @Generated
   public float O0000000000O0() {
      return this.O0000000000O;
   }

   @Generated
   public float O0000000000O00() {
      return this.O0000000000O0;
   }

   @Generated
   public float O0000000000O0O() {
      return this.O0000000000O00;
   }

   @Generated
   public float O0000000000OO() {
      return this.O0000000000O0O;
   }

   @Generated
   public float O0000000000OO0() {
      return this.O0000000000OO;
   }

   @Generated
   public float O0000000000OOO() {
      return this.O0000000000OO0;
   }

   @Generated
   public float O000000000O() {
      return this.O0000000000OOO;
   }

   @Generated
   public float O000000000O0() {
      return this.O000000000O;
   }

   @Generated
   public float O000000000O00() {
      return this.O000000000O0;
   }

   @Generated
   @Override
   public boolean equals(Object object) {
      if (object == this) {
         return true;
      } else if (!(object instanceof O0000O00000 var2)) {
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
      } else if (Float.compare(this.O000000000000O(), var2.O000000000000O()) != 0) {
         return false;
      } else if (Float.compare(this.O00000000000O(), var2.O00000000000O()) != 0) {
         return false;
      } else if (Float.compare(this.O00000000000O0(), var2.O00000000000O0()) != 0) {
         return false;
      } else if (Float.compare(this.O00000000000OO(), var2.O00000000000OO()) != 0) {
         return false;
      } else if (Float.compare(this.O0000000000O(), var2.O0000000000O()) != 0) {
         return false;
      } else if (Float.compare(this.O0000000000O0(), var2.O0000000000O0()) != 0) {
         return false;
      } else if (Float.compare(this.O0000000000O00(), var2.O0000000000O00()) != 0) {
         return false;
      } else if (Float.compare(this.O0000000000O0O(), var2.O0000000000O0O()) != 0) {
         return false;
      } else if (Float.compare(this.O0000000000OO(), var2.O0000000000OO()) != 0) {
         return false;
      } else if (Float.compare(this.O0000000000OO0(), var2.O0000000000OO0()) != 0) {
         return false;
      } else if (Float.compare(this.O0000000000OOO(), var2.O0000000000OOO()) != 0) {
         return false;
      } else if (Float.compare(this.O000000000O(), var2.O000000000O()) != 0) {
         return false;
      } else {
         return Float.compare(this.O000000000O0(), var2.O000000000O0()) != 0 ? false : Float.compare(this.O000000000O00(), var2.O000000000O00()) == 0;
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
      var2 = var2 * 59 + Float.floatToIntBits(this.O000000000000O());
      var2 = var2 * 59 + Float.floatToIntBits(this.O00000000000O());
      var2 = var2 * 59 + Float.floatToIntBits(this.O00000000000O0());
      var2 = var2 * 59 + Float.floatToIntBits(this.O00000000000OO());
      var2 = var2 * 59 + Float.floatToIntBits(this.O0000000000O());
      var2 = var2 * 59 + Float.floatToIntBits(this.O0000000000O0());
      var2 = var2 * 59 + Float.floatToIntBits(this.O0000000000O00());
      var2 = var2 * 59 + Float.floatToIntBits(this.O0000000000O0O());
      var2 = var2 * 59 + Float.floatToIntBits(this.O0000000000OO());
      var2 = var2 * 59 + Float.floatToIntBits(this.O0000000000OO0());
      var2 = var2 * 59 + Float.floatToIntBits(this.O0000000000OOO());
      var2 = var2 * 59 + Float.floatToIntBits(this.O000000000O());
      var2 = var2 * 59 + Float.floatToIntBits(this.O000000000O0());
      return var2 * 59 + Float.floatToIntBits(this.O000000000O00());
   }

   @Generated
   @Override
   public String toString() {
      return "Metrics(scale="
         + this.O000000000()
         + ", themeScale="
         + this.O0000000000()
         + ", guiW="
         + this.O00000000000()
         + ", guiH="
         + this.O000000000000()
         + ", padding="
         + this.O0000000000000()
         + ", gap="
         + this.O000000000000O()
         + ", sidebarW="
         + this.O00000000000O()
         + ", bodyW="
         + this.O00000000000O0()
         + ", bodyH="
         + this.O00000000000OO()
         + ", headerH="
         + this.O0000000000O()
         + ", searchW="
         + this.O0000000000O0()
         + ", contentH="
         + this.O0000000000O00()
         + ", contentPadding="
         + this.O0000000000O0O()
         + ", columnW="
         + this.O0000000000OO()
         + ", moduleHeaderH="
         + this.O0000000000OO0()
         + ", moduleGap="
         + this.O0000000000OOO()
         + ", scrollbarW="
         + this.O000000000O()
         + ", themeW="
         + this.O000000000O0()
         + ", themeH="
         + this.O000000000O00()
         + ")";
   }

   @Generated
   public static class W329 {
      @Generated
      private float O00000000;
      @Generated
      private float O000000000;
      @Generated
      private float O0000000000;
      @Generated
      private float O00000000000;
      @Generated
      private float O000000000000;
      @Generated
      private float O0000000000000;
      @Generated
      private float O000000000000O;
      @Generated
      private float O00000000000O;
      @Generated
      private float O00000000000O0;
      @Generated
      private float O00000000000OO;
      @Generated
      private float O0000000000O;
      @Generated
      private float O0000000000O0;
      @Generated
      private float O0000000000O00;
      @Generated
      private float O0000000000O0O;
      @Generated
      private float O0000000000OO;
      @Generated
      private float O0000000000OO0;
      @Generated
      private float O0000000000OOO;
      @Generated
      private float O000000000O;
      @Generated
      private float O000000000O0;

      @Generated
      W329() {
      }

      @Generated
      public O0000O00000.W329 O00000000(float f) {
         this.O00000000 = f;
         return this;
      }

      @Generated
      public O0000O00000.W329 O000000000(float f) {
         this.O000000000 = f;
         return this;
      }

      @Generated
      public O0000O00000.W329 O0000000000(float f) {
         this.O0000000000 = f;
         return this;
      }

      @Generated
      public O0000O00000.W329 O00000000000(float f) {
         this.O00000000000 = f;
         return this;
      }

      @Generated
      public O0000O00000.W329 O000000000000(float f) {
         this.O000000000000 = f;
         return this;
      }

      @Generated
      public O0000O00000.W329 O0000000000000(float f) {
         this.O0000000000000 = f;
         return this;
      }

      @Generated
      public O0000O00000.W329 O000000000000O(float f) {
         this.O000000000000O = f;
         return this;
      }

      @Generated
      public O0000O00000.W329 O00000000000O(float f) {
         this.O00000000000O = f;
         return this;
      }

      @Generated
      public O0000O00000.W329 O00000000000O0(float f) {
         this.O00000000000O0 = f;
         return this;
      }

      @Generated
      public O0000O00000.W329 O00000000000OO(float f) {
         this.O00000000000OO = f;
         return this;
      }

      @Generated
      public O0000O00000.W329 O0000000000O(float f) {
         this.O0000000000O = f;
         return this;
      }

      @Generated
      public O0000O00000.W329 O0000000000O0(float f) {
         this.O0000000000O0 = f;
         return this;
      }

      @Generated
      public O0000O00000.W329 O0000000000O00(float f) {
         this.O0000000000O00 = f;
         return this;
      }

      @Generated
      public O0000O00000.W329 O0000000000O0O(float f) {
         this.O0000000000O0O = f;
         return this;
      }

      @Generated
      public O0000O00000.W329 O0000000000OO(float f) {
         this.O0000000000OO = f;
         return this;
      }

      @Generated
      public O0000O00000.W329 O0000000000OO0(float f) {
         this.O0000000000OO0 = f;
         return this;
      }

      @Generated
      public O0000O00000.W329 O0000000000OOO(float f) {
         this.O0000000000OOO = f;
         return this;
      }

      @Generated
      public O0000O00000.W329 O000000000O(float f) {
         this.O000000000O = f;
         return this;
      }

      @Generated
      public O0000O00000.W329 O000000000O0(float f) {
         this.O000000000O0 = f;
         return this;
      }

      @Generated
      public O0000O00000 O00000000() {
         return new O0000O00000(
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
            this.O0000000000OO0,
            this.O0000000000OOO,
            this.O000000000O,
            this.O000000000O0
         );
      }

      @Generated
      @Override
      public String toString() {
         return "Metrics.MetricsBuilder(scale="
            + this.O00000000
            + ", themeScale="
            + this.O000000000
            + ", guiW="
            + this.O0000000000
            + ", guiH="
            + this.O00000000000
            + ", padding="
            + this.O000000000000
            + ", gap="
            + this.O0000000000000
            + ", sidebarW="
            + this.O000000000000O
            + ", bodyW="
            + this.O00000000000O
            + ", bodyH="
            + this.O00000000000O0
            + ", headerH="
            + this.O00000000000OO
            + ", searchW="
            + this.O0000000000O
            + ", contentH="
            + this.O0000000000O0
            + ", contentPadding="
            + this.O0000000000O00
            + ", columnW="
            + this.O0000000000O0O
            + ", moduleHeaderH="
            + this.O0000000000OO
            + ", moduleGap="
            + this.O0000000000OO0
            + ", scrollbarW="
            + this.O0000000000OOO
            + ", themeW="
            + this.O000000000O
            + ", themeH="
            + this.O000000000O0
            + ")";
      }
   }
}
