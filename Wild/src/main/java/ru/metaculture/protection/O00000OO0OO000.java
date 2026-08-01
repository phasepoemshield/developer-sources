package ru.metaculture.protection;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Objects;
import net.minecraft.client.MinecraftClient;
import org.lwjgl.glfw.GLFW;
import org.wild.module.api.Module;

public final class O00000OO0OO000 implements O00000OO0OO00 {
   private static final float O00000000 = 80.0F;
   private static final float O000000000 = 18.0F;
   private static final float O0000000000 = 18.0F;
   private static final float O00000000000 = 17.0F;
   private static final float O000000000000 = 18.0F;
   private static final float O0000000000000 = 20.0F;
   private static final float O000000000000O = 298.0F;
   private static final float O00000000000O = 6.0F;
   private static final float O00000000000O0 = 15.0F;
   private static final float O00000000000OO = 3.0F;
   private static final float O0000000000O = 18.0F;
   private static final float O0000000000O0 = 12.0F;
   private static final float O0000000000O00 = 1.35F;
   private static final int O0000000000O0O = -14606047;
   private static final int O0000000000OO = -2500135;
   private static final int O0000000000OO0 = -7829368;
   private static final int O0000000000OOO = -1;
   private static final O0000O00O0O0O0 O000000000O = O0000O00O0O0O0.O00000000(2.1F, 0.55F);
   private static final O0000O00O0O0O0 O000000000O0 = O0000O00O0O0O0.O00000000(1.4F, 0.7F);
   private static final O0000O00O0O0O0 O000000000O00 = O0000O00O0O0O0.O00000000(8.0F, 0.8F);
   private static final O0000O00O0O0O0 O000000000O000 = O0000O00O0O0O0.O00000000(1.8F, 0.65F);
   private static final float O000000000O00O = 5.0E-4F;
   private static final float O000000000O0O = 5.0E-4F;
   private static final float O000000000O0O0 = 1.0E-4F;
   private static final double O000000000O0OO = 1.0E-4;
   private static final float O000000000OO = 0.001F;
   private final Module O000000000OO0;
   private final NumberSetting O000000000OO00;
   private final O00000OO0O0OOO O000000000OO0O;
   private final O00000OO0OO0<Double> O000000000OOO;
   private final String O000000000OOO0;
   private final O0000O00O0O0OO O000000000OOOO;
   private final O0000O00O0O0OO O00000000O;
   private final O0000O00O0O0OO O00000000O0;
   private final O0000O00O0O0OO O00000000O00;
   private O00000OO0OO000.W238 O00000000O000 = O00000OO0OO000.W238.EMPTY;
   private O00000OO0OO000.W238 O00000000O0000 = O00000OO0OO000.W238.EMPTY;
   private O00000OO0OO000.W238 O00000000O000O = O00000OO0OO000.W238.EMPTY;
   private boolean O00000000O00O = false;
   private double O00000000O00O0;
   private int O00000000O00OO;
   private boolean O00000000O0O = false;

   public O00000OO0OO000(Module module, O00000OO0O0OOO o00000OO0O0OOO, NumberSetting o000000O000, O00000OO0OO0<Double> o00000OO0OO0) {
      this(module, o00000OO0O0OOO, o000000O000, o00000OO0OO0, null);
   }

   public O00000OO0OO000(Module module, O00000OO0O0OOO o00000OO0O0OOO, NumberSetting o000000O000, O00000OO0OO0<Double> o00000OO0OO0, String string) {
      this.O000000000OO0 = Objects.requireNonNull(module, "module");
      this.O000000000OO0O = Objects.requireNonNull(o00000OO0O0OOO, "popupContext");
      this.O000000000OO00 = Objects.requireNonNull(o000000O000, "setting");
      this.O000000000OOO = Objects.requireNonNull(o00000OO0OO0, "valueAccessor");
      this.O000000000OOO0 = O00000000(string);
      this.O000000000OOOO = new O0000O00O0O0OO(O0000O00O0O000.O00000000(), O000000000O, 0.0F, 0.0F, 1.0F, 5.0E-4F, 5.0E-4F);
      this.O000000000OOOO.O00000000(O0000O00O0O0O.O0000000000);
      this.O00000000O = new O0000O00O0O0OO(O0000O00O0O000.O00000000(), O000000000O0, 0.0F, 0.0F, 1.0F, 5.0E-4F, 5.0E-4F);
      this.O00000000O.O00000000(O0000O00O0O0O.O0000000000);
      Double var6 = (Double)o00000OO0OO0.O00000000();
      double var7 = var6 != null ? var6 : o000000O000.O00000000000;
      this.O00000000O00O0 = var7;
      this.O00000000O00OO = O00000000000(o000000O000.O000000000000O);
      float var9 = this.O0000000000(this.O00000000O00O0);
      this.O00000000O0 = new O0000O00O0O0OO(O0000O00O0O000.O00000000(), O000000000O00, var9, 0.0F, 1.0F, 5.0E-4F, 5.0E-4F);
      this.O00000000O00 = new O0000O00O0O0OO(O0000O00O0O000.O00000000(), O000000000O000, 1.0F, 0.0F, 1.0F, 5.0E-4F, 5.0E-4F);
      this.O00000000O00.O00000000(O0000O00O0O0O.O0000000000);
   }

   @Override
   public void O00000000() {
      Double var1 = this.O000000000OOO.O00000000();
      double var2 = var1 != null ? var1 : this.O000000000OO00.O00000000000;
      this.O00000000O00O0 = var2;
      this.O000000000OOOO.O0000000000(this.O00000000O00O ? 1.0F : 0.0F);
      this.O00000000O0.O0000000000(this.O00000000000O0());
      this.O0000000000O0();
   }

   @Override
   public void O00000000(boolean bl) {
      float var2 = bl ? 1.0F : 0.0F;
      this.O00000000O00.O0000000000(var2);
      if (!bl) {
         this.O00000000O00O = false;
         this.O00000000O0O = false;
         this.O000000000OOOO.O0000000000(0.0F);
         this.O0000000000O0();
      }
   }

   @Override
   public void O00000000(float f, float g, float h) {
      float var4 = Math.max(0.0F, this.O000000000000O());
      this.O00000000O000 = new O00000OO0OO000.W238(f, g, h, 80.0F);
      this.O00000000O0000 = new O00000OO0OO000.W238(f, g, h, var4);
      float var5 = f + 18.0F;
      float var6 = g + 17.0F + 18.0F + 15.0F;
      this.O00000000O000O = new O00000OO0OO000.W238(var5, var6, 298.0F, 6.0F);
   }

   @Override
   public float O000000000() {
      return 80.0F;
   }

   @Override
   public float O000000000000O() {
      return 80.0F * O00000000(this.O00000000O00.O00000000());
   }

   @Override
   public void O00000000(RenderManager o0000O00OO0O0, float f, float g, float h) {
      float var5 = O00000000(this.O00000000O00.O00000000());
      if (!(var5 <= 0.001F)) {
         float var6 = f * O00000000(g) * var5;
         if (!(var6 <= 1.0E-4F)) {
            o0000O00OO0O0.O0000000000(1.0F, var5, this.O00000000O000.x, this.O00000000O000.y);

            try {
               this.O00000000000O();
               float var7 = O00000000(this.O00000000O.O00000000());
               int var8 = O0000O0O00OO00.O00000000(-7829368, -1, var7);
               int var9 = O00000000(var8, var6);
               float var10 = this.O00000000O000.x + 18.0F;
               float var11 = this.O00000000O000.y + 17.0F + 18.0F;
               o0000O00OO0O0.O00000000(FontRegistry.O00000000000, var10, var11, 18.0F, this.O00000000000OO(), var9, "l");
               float var12 = this.O00000000O000.y + 20.0F + 18.0F;
               float var13 = this.O00000000O000.x + this.O00000000O000.width - 18.0F;
               o0000O00OO0O0.O00000000(FontRegistry.O00000000000, var13, var12, 18.0F, this.O0000000000O(), var9, "r");
               int var14 = O00000000(-14606047, var6);
               o0000O00OO0O0.O00000000(this.O00000000O000O.x, this.O00000000O000O.y, this.O00000000O000O.width, this.O00000000O000O.height, 3.0F, var14);
               float var15 = O00000000(this.O00000000O0.O00000000());
               float var16 = this.O00000000O000O.width * var15;
               if (var16 > 0.0F) {
                  int var17 = O00000000(O00000O0OOOOOO.O00000000(), var6);
                  float var18 = var16 >= this.O00000000O000O.width - 0.01F ? 3.0F : 0.0F;
                  o0000O00OO0O0.O00000000(this.O00000000O000O.x, this.O00000000O000O.y, var16, this.O00000000O000O.height, 3.0F, var18, var18, 3.0F, var17);
               }

               float var26 = this.O00000000O000O.x + var16;
               float var27 = this.O00000000O000O.y + this.O00000000O000O.height * 0.5F;
               float var19 = 1.0F + O00000000(this.O000000000OOOO.O00000000()) * 0.35000002F;
               float var20 = 12.0F * var19;
               float var21 = var20 * 0.5F;
               int var22 = O00000000(-2500135, var6);
               o0000O00OO0O0.O000000000(var26, var27, var21, 0.0F, 1.0F, var22);
            } finally {
               o0000O00OO0O0.O00000000000O0();
            }
         }
      }
   }

   @Override
   public boolean O00000000(double d, double e, int i) {
      if (!this.O0000000000O00() || !this.O00000000O0000.contains(d, e)) {
         return false;
      } else if (i == 2) {
         Double var6 = this.O000000000OOO.O00000000();
         Double var7 = var6 != null ? var6 : this.O000000000OO00.O00000000000;
         this.O000000000OO0O.openForSetting(this.O000000000OO0, this.O000000000OO00, d, e, var7);
         return true;
      } else if (i != 0) {
         return false;
      } else {
         this.O00000000O00O = true;
         this.O000000000OOOO.O0000000000(1.0F);
         this.O0000000000O0();
         return true;
      }
   }

   @Override
   public Setting O0000000000() {
      return this.O000000000OO00;
   }

   @Override
   public boolean O00000000000() {
      return true;
   }

   @Override
   public boolean O000000000(double d, double e, double f, double g) {
      if (this.O0000000000O00() && this.O00000000O0000.contains(d, e)) {
         if (Math.abs(g) <= 1.0E-4) {
            return false;
         } else {
            MinecraftClient var9 = MinecraftClient.getInstance();
            if (var9 != null && var9.getWindow() != null) {
               long var10 = var9.getWindow().getHandle();
               if (GLFW.glfwGetKey(var10, 341) != 1) {
                  return false;
               } else if (!this.O000000000(g)) {
                  return false;
               } else {
                  this.O000000000OOOO.O0000000000(1.0F);
                  this.O0000000000O0();
                  return true;
               }
            } else {
               return false;
            }
         }
      } else {
         return false;
      }
   }

   @Override
   public void O00000000(double d, double e) {
      if (!this.O0000000000O00()) {
         this.O00000000O0O = false;
         this.O0000000000O0();
      } else {
         this.O00000000O0O = this.O00000000O0000.contains(d, e);
         this.O0000000000O0();
      }
   }

   private void O00000000000O() {
      if (this.O00000000O00O) {
         if (!this.O0000000000O00()) {
            this.O00000000O00O = false;
            this.O000000000OOOO.O0000000000(0.0F);
            this.O0000000000O0();
         } else {
            MinecraftClient var1 = MinecraftClient.getInstance();
            if (var1 != null && var1.getWindow() != null) {
               long var2 = var1.getWindow().getHandle();
               if (GLFW.glfwGetMouseButton(var2, 0) != 1) {
                  this.O00000000O00O = false;
                  this.O000000000OOOO.O0000000000(0.0F);
                  this.O0000000000O0();
               } else {
                  double[] var4 = new double[1];
                  double[] var5 = new double[1];
                  GLFW.glfwGetCursorPos(var2, var4, var5);
                  this.O00000000(O00000000(var4[0], var1));
               }
            } else {
               this.O00000000O00O = false;
               this.O000000000OOOO.O0000000000(0.0F);
               this.O0000000000O0();
            }
         }
      }
   }

   private void O00000000(double d) {
      if (!(this.O00000000O000O.width <= 0.0F) && this.O0000000000O00()) {
         double var3 = Math.min(Math.max(d, (double)this.O00000000O000O.x), (double)(this.O00000000O000O.x + this.O00000000O000O.width));
         double var5 = (var3 - this.O00000000O000O.x) / this.O00000000O000O.width;
         double var7 = this.O000000000OO00.O000000000000;
         double var9 = this.O000000000OO00.O0000000000000;
         if (!(var9 <= var7)) {
            double var11 = var7 + (var9 - var7) * var5;
            if (!(Math.abs(var11 - this.O00000000O00O0) <= 1.0E-4F)) {
               this.O000000000OOO.O00000000(var11);
               Double var13 = this.O000000000OOO.O00000000();
               this.O00000000O00O0 = var13 != null ? var13 : this.O000000000OO00.O00000000000;
               this.O00000000O0.O0000000000(this.O00000000000O0());
            }
         }
      }
   }

   private boolean O000000000(double d) {
      double var3 = this.O000000000OO00.O000000000000O;
      if (var3 <= 0.0) {
         return false;
      } else {
         double var5 = this.O000000000OO00.O000000000000;
         double var7 = this.O000000000OO00.O0000000000000;
         double var9 = Math.signum(d);
         if (var9 == 0.0) {
            return false;
         } else {
            double var11 = Math.ceil(Math.abs(d));
            if (var11 <= 0.0) {
               var11 = 1.0;
            }

            double var13 = this.O00000000O00O0 + var3 * var11 * var9;
            double var15 = Math.min(Math.max(var13, var5), var7);
            if (Math.abs(var15 - this.O00000000O00O0) <= 1.0E-4F) {
               return false;
            } else {
               this.O000000000OOO.O00000000(var15);
               Double var17 = this.O000000000OOO.O00000000();
               double var18 = var17 instanceof Number ? var17.doubleValue() : this.O000000000OO00.O00000000000;
               this.O00000000O00O0 = var18;
               this.O0000000000O0();
               this.O00000000O0.O0000000000(this.O00000000000O0());
               return true;
            }
         }
      }
   }

   private float O00000000000O0() {
      return this.O0000000000(this.O00000000O00O0);
   }

   private float O0000000000(double d) {
      double var3 = this.O000000000OO00.O000000000000;
      double var5 = this.O000000000OO00.O0000000000000;
      if (var5 <= var3) {
         return 0.0F;
      } else {
         double var7 = Math.min(Math.max(d, var3), var5);
         return (float)((var7 - var3) / (var5 - var3));
      }
   }

   private String O00000000000OO() {
      return this.O000000000OOO0 != null ? this.O000000000OOO0 : this.O000000000OO00.O00000000;
   }

   private static String O00000000(String string) {
      if (string == null) {
         return null;
      } else {
         String var1 = string.trim();
         return var1.isEmpty() ? null : var1;
      }
   }

   private String O0000000000O() {
      return this.O00000000O00OO <= 0
         ? String.format(Locale.US, "%.0f", this.O00000000O00O0)
         : String.format(Locale.US, "%1$." + this.O00000000O00OO + "f", this.O00000000O00O0);
   }

   private static int O00000000000(double d) {
      BigDecimal var2 = BigDecimal.valueOf(d);
      int var3 = var2.scale();
      if (var3 <= 0) {
         return 0;
      } else {
         BigDecimal var4 = var2.stripTrailingZeros();
         return Math.max(0, var4.scale());
      }
   }

   private void O0000000000O0() {
      float var1;
      if (this.O00000000O00O) {
         var1 = 1.0F;
      } else if (this.O00000000O0O && this.O0000000000O00()) {
         var1 = 0.5F;
      } else {
         var1 = 0.0F;
      }

      this.O00000000O.O0000000000(var1);
   }

   private boolean O0000000000O00() {
      return O00000000(this.O00000000O00.O00000000()) > 0.001F;
   }

   private static float O00000000(float f) {
      if (f <= 0.0F) {
         return 0.0F;
      } else {
         return f >= 1.0F ? 1.0F : f;
      }
   }

   private static int O00000000(int i, float f) {
      int var2 = i >>> 24 & 0xFF;
      int var3 = Math.round(var2 * f);
      int var4 = i & 16777215;
      return var3 << 24 | var4;
   }

   private static double O00000000(double d, int i, float f) {
      if (i <= 0) {
         return d;
      } else if (Float.isFinite(f) && !(Math.abs(f - 1.0F) <= 0.001F)) {
         double var4 = i * 0.5;
         return var4 + (d - var4) / f;
      } else {
         return d;
      }
   }

   private static double O00000000(double d, MinecraftClient minecraftClient) {
      if (minecraftClient != null && minecraftClient.getWindow() != null) {
         int var3 = minecraftClient.getWindow().getFramebufferWidth();
         if (var3 <= 0) {
            return d;
         } else {
            float var4 = 1.0F;
            return Float.isFinite(var4) && !(Math.abs(var4) <= 1.0E-4F) ? O00000000(d, var3, var4) : d;
         }
      } else {
         return d;
      }
   }

   record W238(float x, float y, float width, float height) {
      static final O00000OO0OO000.W238 EMPTY = new O00000OO0OO000.W238(0.0F, 0.0F, 0.0F, 0.0F);

      boolean contains(double d, double e) {
         return d >= this.x && d <= this.x + this.width && e >= this.y && e <= this.y + this.height;
      }
   }
}
