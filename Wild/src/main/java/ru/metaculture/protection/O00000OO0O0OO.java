package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.wild.module.api.Module;

public final class O00000OO0O0OO implements O00000OO0OO00 {
   private static final float O00000000 = 100.0F;
   private static final float O000000000 = 18.0F;
   private static final float O0000000000 = 18.0F;
   private static final float O00000000000 = 17.0F;
   private static final float O000000000000 = 8.0F;
   private static final float O0000000000000 = 298.0F;
   private static final float O000000000000O = 38.0F;
   private static final float O00000000000O = 6.0F;
   private static final float O00000000000O0 = 18.0F;
   private static final int O00000000000OO = -14408668;
   private static final float O0000000000O = 16.0F;
   private static final float O0000000000O0 = 16.0F;
   private static final float O0000000000O00 = 6.0F;
   private static final int O0000000000O0O = -7829368;
   private static final int O0000000000OO = -1;
   private static final float O0000000000OO0 = 40.0F;
   private static final float O0000000000OOO = 24.0F;
   private static final int O000000000O = 58131;
   private static final O0000O00O0O0O0 O000000000O0 = O0000O00O0O0O0.O00000000(1.4F, 0.7F);
   private static final O0000O00O0O0O0 O000000000O00 = O0000O00O0O0O0.O00000000(2.1F, 0.55F);
   private static final float O000000000O000 = 38.0F;
   private static final int O000000000O00O = -14408668;
   private static final int O000000000O0O = -13750738;
   private static final float O000000000O0O0 = 18.0F;
   private static final float O000000000O0OO = 6.0F;
   private static final int O000000000OO = -1;
   private static final float O000000000OO0 = 1.0E-4F;
   private static final float O000000000OO00 = 0.001F;
   private final Module O000000000OO0O;
   private final ModeSetting O000000000OOO;
   private final O00000OO0O0OOO O000000000OOO0;
   private final O00000OO0OO0<String> O000000000OOOO;
   private final String O00000000O;
   private final List<String> O00000000O0;
   private final O0000O00O0O0OO O00000000O00;
   private final O0000O00O0O0OO O00000000O000;
   private final List<O0000O00O0O0OO> O00000000O0000;
   private static float O00000000O000O = Float.NaN;
   private O00000OO0O0OO.W236 O00000000O00O = O00000OO0O0OO.W236.EMPTY;
   private O00000OO0O0OO.W236 O00000000O00O0 = O00000OO0O0OO.W236.EMPTY;
   private O00000OO0O0OO.W236 O00000000O00OO = O00000OO0O0OO.W236.EMPTY;
   private O00000OO0O0OO.W236 O00000000O0O = O00000OO0O0OO.W236.EMPTY;
   private final List<O00000OO0O0OO.W236> O00000000O0O0 = new ArrayList<>();
   private float O00000000O0O00 = 0.0F;
   private float O00000000O0O0O = 0.0F;
   private boolean O00000000O0OO = false;
   private boolean O00000000O0OO0 = false;
   private int O00000000O0OOO = -1;

   public O00000OO0O0OO(Module module, O00000OO0O0OOO o00000OO0O0OOO, ModeSetting o0000000OOOOO0, O00000OO0OO0<String> o00000OO0OO0) {
      this(module, o00000OO0O0OOO, o0000000OOOOO0, o00000OO0OO0, null);
   }

   public O00000OO0O0OO(Module module, O00000OO0O0OOO o00000OO0O0OOO, ModeSetting o0000000OOOOO0, O00000OO0OO0<String> o00000OO0OO0, String string) {
      this.O000000000OO0O = Objects.requireNonNull(module, "module");
      this.O000000000OOO0 = Objects.requireNonNull(o00000OO0O0OOO, "popupContext");
      this.O000000000OOO = Objects.requireNonNull(o0000000OOOOO0, "setting");
      this.O000000000OOOO = Objects.requireNonNull(o00000OO0OO0, "valueAccessor");
      this.O00000000O = O00000000(string);
      this.O00000000O0 = new ArrayList<>(o0000000OOOOO0.O00000000000 != null ? o0000000OOOOO0.O00000000000 : List.of());
      this.O00000000O00 = new O0000O00O0O0OO(O0000O00O0O000.O00000000(), O000000000O0, 0.0F, 0.0F, 1.0F, 5.0E-4F, 5.0E-4F);
      this.O00000000O00.O00000000(O0000O00O0O0O.O0000000000);
      this.O00000000O000 = new O0000O00O0O0OO(O0000O00O0O000.O00000000(), O000000000O00, 0.0F, 0.0F, 1.0F, 5.0E-4F, 5.0E-4F);
      this.O00000000O000.O00000000(O0000O00O0O0O.O0000000000);
      this.O00000000O0000 = new ArrayList<>();
      this.O0000000000O00();
   }

   @Override
   public void O00000000() {
      List var1 = this.O000000000OOO.O00000000000 != null ? this.O000000000OOO.O00000000000 : List.of();
      if (var1.size() != this.O00000000O0.size() || !this.O00000000O0.equals(var1)) {
         this.O00000000O0.clear();
         this.O00000000O0.addAll(var1);
         this.O0000000000O00();
         this.O0000000000O();
      }

      this.O00000000O00.O0000000000(this.O00000000O0OO0 ? 1.0F : (this.O00000000O0OO0 ? 0.0F : (this.O00000000O0OO ? 0.5F : 0.0F)));
      this.O00000000O000.O0000000000(this.O00000000O0OO0 ? 1.0F : 0.0F);

      for (int var2 = 0; var2 < this.O00000000O0000.size(); var2++) {
         float var3 = this.O00000000O0OO0 && var2 == this.O00000000O0OOO ? 1.0F : 0.0F;
         this.O00000000O0000.get(var2).O0000000000(var3);
      }

      if (!this.O00000000O0OO0) {
         this.O00000000O0OOO = -1;
      }
   }

   @Override
   public void O00000000(float f, float g, float h) {
      this.O00000000O00O = new O00000OO0O0OO.W236(f, g, h, 100.0F);
      this.O00000000O0O00 = f + 18.0F;
      this.O00000000O0O0O = g + 17.0F + 18.0F;
      float var4 = f + 18.0F;
      float var5 = this.O00000000O0O0O + 8.0F;
      this.O00000000O00O0 = new O00000OO0O0OO.W236(var4, var5, 298.0F, 38.0F);
      this.O00000000O00OO = new O00000OO0O0OO.W236(var4 + 298.0F - 40.0F, var5, 40.0F, 38.0F);
      this.O0000000000O();
   }

   @Override
   public float O000000000() {
      return 100.0F;
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void O00000000(RenderManager o0000O00OO0O0, float f, float g, float h) {
      float var5 = O00000000(g);
      float var6 = f * var5;
      if (!(var6 <= 1.0E-4F)) {
         float var7 = O00000000(this.O00000000O00.O00000000());
         int var8 = O00000000(-7829368, var6);
         int var9 = O00000000(-1, var6);
         int var10 = O0000O0O00OO00.O00000000(var8, var9, var7);
         o0000O00OO0O0.O00000000(FontRegistry.O00000000000, this.O00000000O0O00, this.O00000000O0O0O - 4.0F, 18.0F, this.O0000000000O0(), var10, "l");
         int var11 = O00000000(-14408668, var6);
         o0000O00OO0O0.O00000000(this.O00000000O00O0.x, this.O00000000O00O0.y, this.O00000000O00O0.width, this.O00000000O00O0.height, 6.0F, var11);
         int var12 = O00000000(O00000O0OOOOOO.O00000000(), var6);
         o0000O00OO0O0.O00000000(
            this.O00000000O00OO.x, this.O00000000O00OO.y, this.O00000000O00OO.width, this.O00000000O00OO.height, 0.0F, 6.0F, 6.0F, 0.0F, var12
         );
         float var13 = this.O00000000O00O0.centerY() + 6.0F;
         float var14 = this.O00000000O00O0.x + 16.0F;
         String var15 = this.O000000000OOOO.O00000000();
         if (var15 == null) {
            var15 = "";
         }

         int var16 = O00000000(-7829368, var6);
         int var17 = O00000000(-1, var6);
         int var18 = O0000O0O00OO00.O00000000(var16, var17, var7);
         o0000O00OO0O0.O00000000(FontRegistry.O00000000000, var14, var13, 16.0F, var15, var18, "l");
         float var19 = O00000000(this.O00000000O000.O00000000()) * 180.0F;
         float var20 = this.O00000000O00OO.centerX();
         float var21 = this.O00000000O00OO.centerY();
         float var22 = O0000000000O0O();
         float var23 = var21 + var22;
         o0000O00OO0O0.O00000000(var20, var23);
         o0000O00OO0O0.O00000000(0.0F, -var22);
         o0000O00OO0O0.O000000000(var19);
         o0000O00OO0O0.O00000000(0.0F, var22);
         o0000O00OO0O0.O00000000(-var20, -var23);
         boolean var26 = false /* VF: Semaphore variable */;

         try {
            var26 = true;
            o0000O00OO0O0.O00000000(FontRegistry.O0000000000, var20, var23, 24.0F, "\ue313", O00000000(-1, var6), "c");
            var26 = false;
         } finally {
            if (var26) {
               o0000O00OO0O0.O00000000000O();
               o0000O00OO0O0.O00000000000O();
               o0000O00OO0O0.O000000000000O();
               o0000O00OO0O0.O00000000000O();
               o0000O00OO0O0.O00000000000O();
            }
         }

         o0000O00OO0O0.O00000000000O();
         o0000O00OO0O0.O00000000000O();
         o0000O00OO0O0.O000000000000O();
         o0000O00OO0O0.O00000000000O();
         o0000O00OO0O0.O00000000000O();
      }
   }

   @Override
   public void O00000000(RenderManager o0000O00OO0O0, float f, float g) {
      float var4 = O00000000(this.O00000000O000.O00000000());
      if (!(var4 <= 0.001F)) {
         if (!this.O00000000O0.isEmpty() && !(this.O00000000O0O.width <= 0.0F) && !(this.O00000000O0O.height <= 0.0F)) {
            float var5 = O00000000(g);
            float var6 = f * var5 * var4;
            if (!(var6 <= 1.0E-4F)) {
               int var7 = -14408668;
               o0000O00OO0O0.O0000000000(1.0F, var4, this.O00000000O0O.x, this.O00000000O0O.y);

               try {
                  o0000O00OO0O0.O00000000(
                     this.O00000000O0O.x, this.O00000000O0O.y, this.O00000000O0O.width, this.O00000000O0O.height, 6.0F, 6.0F, 6.0F, 6.0F, var7
                  );
                  String var8 = this.O000000000OOOO.O00000000();
                  if (var8 == null) {
                     var8 = "";
                  }

                  for (int var9 = 0; var9 < this.O00000000O0O0.size(); var9++) {
                     O00000OO0O0OO.W236 var10 = this.O00000000O0O0.get(var9);
                     String var11 = this.O00000000O0.get(var9);
                     boolean var12 = Objects.equals(var11, var8);
                     float var13 = var9 < this.O00000000O0000.size() ? O00000000(this.O00000000O0000.get(var9).O00000000()) : 0.0F;
                     if (var13 > 0.001F) {
                        int var14 = O00000000(-13750738, var13 * var6);
                        float var15 = var9 == 0 ? 6.0F : 0.0F;
                        float var16 = var9 == 0 ? 6.0F : 0.0F;
                        float var17 = var9 == this.O00000000O0O0.size() - 1 ? 6.0F : 0.0F;
                        float var18 = var9 == this.O00000000O0O0.size() - 1 ? 6.0F : 0.0F;
                        o0000O00OO0O0.O00000000(var10.x, var10.y, var10.width, var10.height, var15, var16, var17, var18, var14);
                     }

                     float var25 = var10.x + 16.0F;
                     float var26 = var10.centerY() + 6.0F;
                     int var27 = O00000000(-7829368, var6);
                     int var28 = O00000000(-1, var6);
                     float var29;
                     if (var12) {
                        var29 = 1.0F;
                     } else {
                        var29 = var13 * 0.7F;
                     }

                     int var19 = O0000O0O00OO00.O00000000(var27, var28, var29);
                     o0000O00OO0O0.O00000000(FontRegistry.O00000000000, var25, var26, 16.0F, var11, var19, "l");
                     if (Objects.equals(var11, var8)) {
                        float var20 = var10.x + var10.width - 16.0F + 2.0F;
                        float var21 = var10.centerY() + 6.0F + 3.0F;
                        o0000O00OO0O0.O00000000(FontRegistry.O0000000000, var20, var21, 18.0F, "\ue5ca", O00000000(-1, var6), "r");
                     }
                  }
               } finally {
                  o0000O00OO0O0.O00000000000O0();
               }
            }
         }
      }
   }

   @Override
   public boolean O000000000000() {
      return (this.O00000000O0OO0 || this.O00000000O000.O00000000() > 0.001F) && this.O00000000O0O.width > 0.0F && this.O00000000O0O.height > 0.0F;
   }

   @Override
   public boolean O000000000(double d, double e, int i) {
      if (!this.O000000000000()) {
         return false;
      } else if (!this.O00000000O0OO0) {
         return false;
      } else if (i != 0) {
         this.O00000000000O0();
         return true;
      } else if (this.O00000000O0O.contains(d, e)) {
         int var6 = this.O00000000(e);
         if (var6 >= 0 && var6 < this.O00000000O0.size()) {
            this.O00000000(var6);
         }

         this.O00000000000O0();
         return true;
      } else if (!this.O00000000O00O0.contains(d, e) && !this.O00000000O00OO.contains(d, e)) {
         this.O00000000000O0();
         return true;
      } else {
         this.O00000000000O0();
         return true;
      }
   }

   @Override
   public boolean O00000000(double d, double e, int i) {
      boolean var6 = this.O00000000O00O0.contains(d, e) || this.O00000000O00OO.contains(d, e);
      if (i == 2) {
         if (!var6) {
            return false;
         } else {
            this.O00000000000O0();
            String var7 = this.O000000000OOOO.O00000000();
            String var8 = var7 != null ? var7.toString() : "";
            this.O000000000OOO0.openForSetting(this.O000000000OO0O, this.O000000000OOO, d, e, var8);
            return true;
         }
      } else if (i != 0) {
         return false;
      } else if (this.O00000000O0OO0) {
         return this.O000000000(d, e, i);
      } else if (var6) {
         this.O00000000000O();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean O00000000(double d, double e, double f, double g) {
      return this.O000000000000();
   }

   @Override
   public void O00000000(double d, double e) {
      boolean var5 = this.O00000000O00O0.contains(d, e) || this.O00000000O00OO.contains(d, e);
      boolean var6 = this.O00000000O0OO0 && this.O00000000O0O.contains(d, e);
      this.O00000000O0OO = this.O00000000O0OO0 ? false : var5;
      if (this.O00000000O0OO0) {
         if (var6) {
            this.O00000000O0OOO = this.O00000000(e);
         } else {
            this.O00000000O0OOO = -1;
         }
      }
   }

   @Override
   public void O0000000000000() {
      this.O00000000000OO();
   }

   @Override
   public Setting O0000000000() {
      return this.O000000000OOO;
   }

   @Override
   public boolean O00000000000() {
      return true;
   }

   private void O00000000000O() {
      this.O00000000O0OO0 = true;
      this.O00000000O000.O0000000000(1.0F);
      this.O00000000O00.O0000000000(1.0F);
   }

   private void O00000000000O0() {
      this.O00000000O0OO0 = false;
      this.O00000000O000.O0000000000(0.0F);
      this.O00000000O0OOO = -1;
   }

   private void O00000000000OO() {
      this.O00000000O0OO0 = false;
      this.O00000000O000.O000000000(0.0F);
      this.O00000000O0OOO = -1;
   }

   private void O00000000(int i) {
      if (i >= 0 && i < this.O00000000O0.size()) {
         String var2 = this.O00000000O0.get(i);
         String var3 = this.O000000000OOOO.O00000000();
         if (!Objects.equals(var2, var3)) {
            this.O000000000OOOO.O00000000(var2);
         }
      }
   }

   private void O0000000000O() {
      this.O00000000O0O0.clear();
      if (this.O00000000O0.isEmpty()) {
         this.O00000000O0O = O00000OO0O0OO.W236.EMPTY;
      } else {
         float var1 = this.O00000000O00O0.x;
         float var2 = this.O00000000O00O0.y + this.O00000000O00O0.height + 6.0F;
         float var3 = this.O00000000O00O0.width;
         float var4 = 38.0F * this.O00000000O0.size();
         this.O00000000O0O = new O00000OO0O0OO.W236(var1, var2, var3, var4);
         float var5 = var2;

         for (int var6 = 0; var6 < this.O00000000O0.size(); var6++) {
            this.O00000000O0O0.add(new O00000OO0O0OO.W236(var1, var5, var3, 38.0F));
            var5 += 38.0F;
         }
      }
   }

   private int O00000000(double d) {
      if (!(d < this.O00000000O0O.y) && !(d > this.O00000000O0O.y + this.O00000000O0O.height)) {
         double var3 = d - this.O00000000O0O.y;
         if (var3 < 0.0) {
            return -1;
         } else {
            int var5 = (int)(var3 / 38.0);
            return var5 >= 0 && var5 < this.O00000000O0.size() ? var5 : -1;
         }
      } else {
         return -1;
      }
   }

   private String O0000000000O0() {
      return this.O00000000O != null ? this.O00000000O : this.O000000000OOO.O00000000;
   }

   private static String O00000000(String string) {
      if (string == null) {
         return null;
      } else {
         String var1 = string.trim();
         return var1.isEmpty() ? null : var1;
      }
   }

   private static float O00000000(float f) {
      if (f <= 0.0F) {
         return 0.0F;
      } else {
         return f >= 1.0F ? 1.0F : f;
      }
   }

   private void O0000000000O00() {
      this.O00000000O0000.clear();

      for (int var1 = 0; var1 < this.O00000000O0.size(); var1++) {
         O0000O00O0O0OO var2 = new O0000O00O0O0OO(O0000O00O0O000.O00000000(), O000000000O0, 0.0F, 0.0F, 1.0F, 5.0E-4F, 5.0E-4F);
         var2.O00000000(O0000O00O0O0O.O0000000000);
         this.O00000000O0000.add(var2);
      }
   }

   private static float O0000000000O0O() {
      if (Float.isNaN(O00000000O000O)) {
         float var0 = FontRegistry.O00000000(FontRegistry.O0000000000, 58131, 24.0F);
         O00000000O000O = var0;
      }

      return O00000000O000O;
   }

   private static int O00000000(int i, float f) {
      int var2 = i >>> 24 & 0xFF;
      int var3 = Math.round(var2 * f);
      int var4 = i & 16777215;
      return var3 << 24 | var4;
   }

   record W236(float x, float y, float width, float height) {
      static final O00000OO0O0OO.W236 EMPTY = new O00000OO0O0OO.W236(0.0F, 0.0F, 0.0F, 0.0F);

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
