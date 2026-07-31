package ru.metaculture.protection;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.util.Window;
import org.lwjgl.opengl.GL11;

public class O0000O00OOO0 {
   private static final float O0000000000 = 0.35F;
   public static MinecraftClient O00000000 = MinecraftClient.getInstance();
   private static O0000O00OOO O00000000000;
   private static Window O000000000000;
   private float O0000000000000;
   private float O000000000000O;
   private float O00000000000O;
   private float O00000000000O0 = 8.0F;
   private boolean O00000000000OO;
   float O000000000;

   public static O0000O00OOO O00000000() {
      if (O00000000000 == null) {
         MinecraftClient var0 = MinecraftClient.getInstance();
         if (var0 != null && var0.getWindow() != null) {
            O00000000000 = new O0000O00OOO(var0);
         }
      }

      return O00000000000;
   }

   public static Window O000000000() {
      if (O000000000000 == null) {
         MinecraftClient var0 = MinecraftClient.getInstance();
         if (var0 != null) {
            O000000000000 = var0.getWindow();
         }
      }

      return O000000000000;
   }

   public O0000O00OOO0() {
      this.O00000000(true);
   }

   public void O0000000000() {
      this.O000000000000O = this.O00000000(this.O000000000000O, this.O0000000000000, O0000O00OO0OO0.O0000000000000((double)(this.O00000000000O0 / 100.0F)));
      if (Math.abs(this.O0000000000000 - this.O000000000000O) <= 0.35F) {
         this.O000000000000O = this.O0000000000000;
      }
   }

   public void O00000000(double d) {
      if (this.O00000000000OO) {
         float var3 = (float)d * (this.O00000000000O0 * 10.0F);
         float var4 = 0.0F;
         this.O0000000000000 = Math.min(Math.max(this.O0000000000000 + var3 / 2.0F, this.O00000000000O - var4), var4);
      }
   }

   public <T extends Number> T O00000000(T number, T number2, double d) {
      double var5 = number.doubleValue();
      double var7 = number2.doubleValue();
      double var9 = var5 + d * (var7 - var5);
      if (number instanceof Integer) {
         return (T)(Object)(int)Math.round(var9);
      } else if (number instanceof Double) {
         return (T)(Object)var9;
      } else if (number instanceof Float) {
         return (T)(Object)(float)var9;
      } else if (number instanceof Long) {
         return (T)(Object)Math.round(var9);
      } else if (number instanceof Short) {
         return (T)(Object)(short)Math.round(var9);
      } else if (number instanceof Byte) {
         return (T)(Object)(byte)Math.round(var9);
      } else {
         throw new IllegalArgumentException("Unsupported type: " + number.getClass().getSimpleName());
      }
   }

   public static void O00000000000() {
      GL11.glEnable(3089);
   }

   public static void O000000000000() {
      GL11.glDisable(3089);
   }

   public static void O00000000(Window window, double d, double e, double f, double g) {
      if (d + f != d && e + g != e && !(d < 0.0) && !(e + g < 0.0)) {
         double var9 = window.getScaleFactor();
         GL11.glScissor(
            (int)Math.round(d * var9), (int)Math.round((window.getScaledHeight() - (e + g)) * var9), (int)Math.round(f * var9), (int)Math.round(g * var9)
         );
      }
   }

   public void O0000000000000() {
      this.O000000000000O = 0.0F;
      this.O0000000000000 = 0.0F;
   }

   public void O00000000(float f, float g) {
      this.O00000000000O = -f + g;
   }

   public void O00000000(RenderManager o0000O00OO0O0, float f, float g, float h, float i, float j) {
      if (!(this.O00000000000O0() >= 0.0F)) {
         float var7 = this.O00000000000O0() != 0.0F ? this.O00000000000O() / this.O00000000000O0() : 0.0F;
         float var8 = i - this.O00000000000O0() / (this.O00000000000O0() - i) * i;
         this.O000000000 = O0000O00OO0OO0.O00000000(var8, this.O000000000, O0000O00OO0OO0.O0000000000000(0.9F));
         boolean var9 = this.O000000000 < i && this.O000000000 > 0.0F;
         if (var9) {
            float var11 = g + i * var7 - this.O000000000 * var7;
            int var12 = RenderManager.W382.O0000000000O(RenderManager.W382.O0000000000000(1, 1), (int)O0000O00OO0OO0.O00000000000OO(255.0F * j, 0.0F, 255.0F));
            int var13 = RenderManager.W382.O0000000000O(RenderManager.W382.O0000000000000(1, 1), (int)O0000O00OO0OO0.O00000000000OO(20.0F * j, 0.0F, 20.0F));
            o0000O00OO0O0.O00000000(f, g, h, i, var13);
            o0000O00OO0O0.O00000000(f, var11, h, this.O000000000, 1.0F, var12);
         }
      }
   }

   public float O000000000000O() {
      return this.O0000000000000;
   }

   public void O00000000(float f) {
      this.O0000000000000 = f;
   }

   public float O00000000000O() {
      return Math.abs(this.O0000000000000 - this.O000000000000O) <= 0.35F ? Math.round(this.O000000000000O) : this.O000000000000O;
   }

   public void O000000000(float f) {
      this.O000000000000O = f;
   }

   public float O00000000000O0() {
      return this.O00000000000O;
   }

   public void O0000000000(float f) {
      this.O00000000000O = f;
   }

   public float O00000000000OO() {
      return this.O00000000000O0;
   }

   public void O00000000000(float f) {
      this.O00000000000O0 = f;
   }

   public boolean O0000000000O() {
      return this.O00000000000OO;
   }

   public void O00000000(boolean bl) {
      this.O00000000000OO = bl;
   }
}
