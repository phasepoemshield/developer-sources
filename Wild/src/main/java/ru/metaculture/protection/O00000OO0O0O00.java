package ru.metaculture.protection;

import java.util.Objects;
import org.wild.module.api.Module;

public final class O00000OO0O0O00 implements O00000OO0OO00 {
   private static final float O00000000 = 62.0F;
   private static final float O000000000 = 18.0F;
   private static final float O0000000000 = 18.0F;
   private static final float O00000000000 = 5.0F;
   private static final float O000000000000 = 22.0F;
   private static final float O0000000000000 = 4.0F;
   private static final float O000000000000O = 18.0F;
   private static final float O00000000000O = 16.0F;
   private static final float O00000000000O0 = 5.0F;
   private static final O0000O00O0O0O0 O00000000000OO = O0000O00O0O0O0.O00000000(2.1F, 0.55F);
   private static final float O0000000000O = 0.001F;
   private static final O0000O00O0O0O0 O0000000000O0 = O0000O00O0O0O0.O00000000(1.4F, 0.7F);
   private final Module O0000000000O00;
   private final BooleanSetting O0000000000O0O;
   private final O00000OO0O0OOO O0000000000OO;
   private final O00000OO0OO0<Boolean> O0000000000OO0;
   private final String O0000000000OOO;
   private final O0000O00O0O0OO O000000000O;
   private final O0000O00O0O0OO O000000000O0;
   private O00000OO0O0O00.W235 O000000000O00 = O00000OO0O0O00.W235.EMPTY;
   private O00000OO0O0O00.W235 O000000000O000 = O00000OO0O0O00.W235.EMPTY;
   private float O000000000O00O = 0.0F;
   private float O000000000O0O = 0.0F;
   private boolean O000000000O0O0 = false;

   public O00000OO0O0O00(Module module, O00000OO0O0OOO o00000OO0O0OOO, BooleanSetting o0000000OOO0O0, O00000OO0OO0<?> o00000OO0OO0) {
      this(module, o00000OO0O0OOO, o0000000OOO0O0, o00000OO0OO0, null);
   }

   public O00000OO0O0O00(Module module, O00000OO0O0OOO o00000OO0O0OOO, BooleanSetting o0000000OOO0O0, O00000OO0OO0<?> o00000OO0OO0, String string) {
      this.O0000000000O00 = Objects.requireNonNull(module, "module");
      this.O0000000000OO = Objects.requireNonNull(o00000OO0O0OOO, "popupContext");
      this.O0000000000O0O = Objects.requireNonNull(o0000000OOO0O0, "setting");
      this.O0000000000OO0 = (O00000OO0OO0<Boolean>)Objects.requireNonNull(o00000OO0OO0, "valueAccessor");
      this.O0000000000OOO = O00000000(string);
      Object var6 = o00000OO0OO0.O00000000();
      boolean var7 = var6 instanceof Boolean ? (Boolean)var6 : false;
      float var8 = var7 ? 1.0F : 0.0F;
      this.O000000000O = new O0000O00O0O0OO(O0000O00O0O000.O00000000(), O00000000000OO, var8, 0.0F, 1.0F, 5.0E-4F, 5.0E-4F);
      this.O000000000O.O00000000(O0000O00O0O0O.O00000000);
      this.O000000000O0 = new O0000O00O0O0OO(O0000O00O0O000.O00000000(), O0000000000O0, var8, 0.0F, 1.0F, 5.0E-4F, 5.0E-4F);
      this.O000000000O0.O00000000(O0000O00O0O0O.O0000000000);
   }

   @Override
   public void O00000000() {
      Object var1 = this.O0000000000OO0.O00000000();
      boolean var2 = var1 instanceof Boolean ? (Boolean)var1 : false;
      this.O000000000O.O0000000000(var2 ? 1.0F : 0.0F);
      this.O00000000000O();
   }

   @Override
   public void O00000000(float f, float g, float h) {
      this.O000000000O00 = new O00000OO0O0O00.W235(f, g, h, 62.0F);
      float var4 = f + h - 18.0F - 22.0F;
      float var5 = g + 20.0F;
      this.O000000000O000 = new O00000OO0O0O00.W235(var4, var5, 22.0F, 22.0F);
      this.O000000000O00O = f + 18.0F;
      this.O000000000O0O = g + 31.0F + 5.0F;
   }

   @Override
   public float O000000000() {
      return 62.0F;
   }

   @Override
   public void O00000000(RenderManager o0000O00OO0O0, float f, float g, float h) {
      float var5 = f * (float)O00000000(g);
      if (!(var5 <= 0.0F)) {
         float var6 = this.O000000000O.O00000000();
         double var7 = O00000000(var5 * var6);
         if (var7 > 0.001F) {
            o0000O00OO0O0.O00000000(
               this.O000000000O000.x + 1.0F,
               this.O000000000O000.y + 1.0F,
               this.O000000000O000.width - 2.0F,
               this.O000000000O000.height - 2.0F,
               4.0F,
               O0000O0O00OO00.O00000000(O00000O0OOOOOO.O00000000(), var7)
            );
         }

         double var9 = O00000000(var5);
         o0000O00OO0O0.O00000000(
            this.O000000000O000.x,
            this.O000000000O000.y,
            this.O000000000O000.width,
            this.O000000000O000.height,
            4.0F,
            O0000O0O00OO00.O00000000(5197646, var9),
            1.0F
         );
         double var11 = O00000000(var6 * var5);
         if (var11 > 0.001F) {
            o0000O00OO0O0.O00000000(
               FontRegistry.O0000000000,
               this.O000000000O000.centerX(),
               this.O000000000O000.centerY() + 5.0F + 3.0F,
               16.0F,
               "\ue5ca",
               O0000O0O00OO00.O00000000(16777215, var11),
               "c"
            );
         }

         double var13 = O00000000(var5);
         float var15 = this.O000000000O0.O00000000();
         int var16 = O0000O0O00OO00.O00000000(8947848, var13);
         int var17 = O0000O0O00OO00.O00000000(16777215, var13);
         int var18 = O0000O0O00OO00.O00000000(var16, var17, var15);
         o0000O00OO0O0.O00000000(FontRegistry.O00000000000, this.O000000000O00O, this.O000000000O0O, 18.0F, this.O00000000000O0(), var18, "l");
      }
   }

   @Override
   public boolean O00000000(double d, double e, int i) {
      if (!this.O000000000O00.contains(d, e)) {
         return false;
      } else if (i == 2) {
         Object var9 = this.O0000000000OO0.O00000000();
         Boolean var10 = var9 instanceof Boolean ? (Boolean)var9 : false;
         this.O0000000000OO.openForSetting(this.O0000000000O00, this.O0000000000O0O, d, e, var10);
         return true;
      } else if (i != 0) {
         return false;
      } else {
         Object var6 = this.O0000000000OO0.O00000000();
         boolean var7 = var6 instanceof Boolean ? (Boolean)var6 : false;
         boolean var8 = !var7;
         this.O0000000000OO0.O00000000(var8);
         this.O000000000O.O0000000000(var8 ? 1.0F : 0.0F);
         return true;
      }
   }

   @Override
   public Setting O0000000000() {
      return this.O0000000000O0O;
   }

   @Override
   public boolean O00000000000() {
      return true;
   }

   @Override
   public void O00000000(double d, double e) {
      this.O000000000O0O0 = this.O000000000O00.contains(d, e);
      this.O00000000000O();
   }

   private void O00000000000O() {
      Object var2 = this.O0000000000OO0.O00000000();
      boolean var3 = var2 instanceof Boolean ? (Boolean)var2 : false;
      float var1;
      if (var3) {
         var1 = 1.0F;
      } else if (this.O000000000O0O0) {
         var1 = 0.5F;
      } else {
         var1 = 0.0F;
      }

      this.O000000000O0.O0000000000(var1);
   }

   private String O00000000000O0() {
      return this.O0000000000OOO != null ? this.O0000000000OOO : this.O0000000000O0O.O00000000;
   }

   private static String O00000000(String string) {
      if (string == null) {
         return null;
      } else {
         String var1 = string.trim();
         return var1.isEmpty() ? null : var1;
      }
   }

   private static double O00000000(double d) {
      if (d <= 0.0) {
         return 0.0;
      } else {
         return d >= 1.0 ? 1.0 : d;
      }
   }

   record W235(float x, float y, float width, float height) {
      static final O00000OO0O0O00.W235 EMPTY = new O00000OO0O0O00.W235(0.0F, 0.0F, 0.0F, 0.0F);

      boolean contains(double d, double e) {
         return d >= this.x && d <= this.x + this.width && e >= this.y && e <= this.y + this.height;
      }

      float centerX() {
         return this.x + this.width * 0.5F;
      }

      float centerY() {
         return this.y + this.height * 0.5F;
      }
   }
}
