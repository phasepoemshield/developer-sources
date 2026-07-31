package ru.metaculture.protection;

public final class O00000OOOOOOO0 {
   public void O00000000(O0000O000O0O0 o0000O000O0O0, Setting o0000000OOO00O, float f, float g, float h) {
      o0000O000O0O0.O00000000000O(false);
      o0000O000O0O0.O00000000((NumberSetting)null);
      if (o0000000OOO00O instanceof BooleanSetting var6) {
         var6.O000000000(!var6.O00000000000());
         o0000O000O0O0.O00000000O000O();
      } else if (o0000000OOO00O instanceof NumberSetting var7) {
         o0000O000O0O0.O00000000(var7);
         o0000O000O0O0.O00000000O0(g);
         o0000O000O0O0.O00000000O00(h);
         this.O00000000(var7, f, g, h);
         o0000O000O0O0.O00000000O000O();
      } else if (o0000000OOO00O instanceof ColorSetting var8) {
         o0000O000O0O0.O00000000(var8);
      } else if (o0000000OOO00O instanceof ModeSetting var9) {
         o0000O000O0O0.O00000000(var9);
      } else if (o0000000OOO00O instanceof O000000O00 var10) {
         o0000O000O0O0.O00000000(var10);
      } else if (o0000000OOO00O instanceof MultiSelectSetting var11) {
         var11.O0000000000();
         if (!var11.O00000000000.isEmpty()) {
            this.O00000000(var11);
            o0000O000O0O0.O00000000O000O();
         }
      } else if (o0000000OOO00O instanceof KeybindSetting var12) {
         o0000O000O0O0.O00000000(var12);
      } else if (o0000000OOO00O instanceof TextSetting var13) {
         o0000O000O0O0.O00000000(var13);
      } else if (o0000000OOO00O instanceof ButtonSetting var14) {
         var14.O00000000000();
      }
   }

   public void O00000000(O0000O000O0O0 o0000O000O0O0, ColorSetting o0000000OOOO0O, float f, float g) {
      o0000O000O0O0.O000000000O0(true);
      o0000O000O0O0.O000000000O00(false);
      o0000O000O0O0.O000000000O000(false);
      this.O0000000000(o0000O000O0O0, o0000000OOOO0O, f, g);
   }

   public void O000000000(O0000O000O0O0 o0000O000O0O0, ColorSetting o0000000OOOO0O, float f, float g) {
      o0000O000O0O0.O000000000O00(true);
      o0000O000O0O0.O000000000O0(false);
      o0000O000O0O0.O000000000O000(false);
      this.O0000000000(o0000O000O0O0, o0000000OOOO0O, g);
   }

   public void O00000000(O0000O000O0O0 o0000O000O0O0, ColorSetting o0000000OOOO0O, float f) {
      o0000O000O0O0.O000000000O000(true);
      o0000O000O0O0.O000000000O0(false);
      o0000O000O0O0.O000000000O00(false);
      this.O00000000000(o0000O000O0O0, o0000000OOOO0O, f);
   }

   public void O000000000(O0000O000O0O0 o0000O000O0O0, ColorSetting o0000000OOOO0O, float f) {
      float var4 = o0000O000O0O0.O000000O000OO0();
      float var5 = o0000O000O0O0.O000000O00O();
      if (!(var5 < 1.0F)) {
         byte var6 = 5;
         int var7 = Math.max(0, Math.min(var6 - 1, (int)((f - var4) / var5 * var6)));
         float[] var8 = new float[]{0.0F, 180.0F, -30.0F, 30.0F, 120.0F};
         o0000000OOOO0O.O00000000(o0000000OOOO0O.O000000000000() + var8[var7]);
         if (o0000000OOOO0O.O0000000000O00 < 0.05F) {
            o0000000OOOO0O.O0000000000O00 = 0.65F;
         }

         if (o0000000OOOO0O.O0000000000O0O < 0.08F) {
            o0000000OOOO0O.O0000000000O0O = 0.85F;
         }

         o0000O000O0O0.O00000000O000O();
      }
   }

   public void O00000000(O0000O000O0O0 o0000O000O0O0, ColorSetting o0000000OOOO0O, float f, boolean bl) {
      float var5 = o0000O000O0O0.O000000O00O00();
      float var6 = o0000O000O0O0.O000000O00O00O();
      if (!(var6 < 1.0F)) {
         byte var7 = 9;
         int var8 = Math.max(0, Math.min(var7 - 1, (int)((f - var5) / var6 * var7)));
         if (var8 == 8) {
            if (!bl) {
               o0000000OOOO0O.O000000000000O();
               o0000O000O0O0.O00000000O000O();
            }
         } else {
            if (bl) {
               o0000000OOOO0O.O00000000000(var8);
            } else {
               o0000000OOOO0O.O0000000000(var8);
            }

            o0000O000O0O0.O00000000O000O();
         }
      }
   }

   public void O00000000(O0000O000O0O0 o0000O000O0O0, float f) {
      if (o0000O000O0O0.O0000000OO0O0O() != null) {
         this.O00000000(o0000O000O0O0.O0000000OO0O0O(), f, o0000O000O0O0.O0000000OO0OO0(), o0000O000O0O0.O0000000OO0OOO());
      }
   }

   public void O00000000(O0000O000O0O0 o0000O000O0O0, float f, float g) {
      if (o0000O000O0O0.O000000O0() && o0000O000O0O0.O0000000OOOOOO() != null) {
         this.O0000000000(o0000O000O0O0, o0000O000O0O0.O0000000OOOOOO(), f, g);
      }

      if (o0000O000O0O0.O000000O00() && o0000O000O0O0.O0000000OOOOOO() != null) {
         this.O0000000000(o0000O000O0O0, o0000O000O0O0.O0000000OOOOOO(), g);
      }

      if (o0000O000O0O0.O000000O000() && o0000O000O0O0.O0000000OOOOOO() != null) {
         this.O00000000000(o0000O000O0O0, o0000O000O0O0.O0000000OOOOOO(), f);
      }
   }

   public void O00000000(O0000O000O0O0 o0000O000O0O0) {
      if (o0000O000O0O0.O000000O0() || o0000O000O0O0.O000000O00() || o0000O000O0O0.O000000O000()) {
         o0000O000O0O0.O000000000O0(false);
         o0000O000O0O0.O000000000O00(false);
         o0000O000O0O0.O000000000O000(false);
         o0000O000O0O0.O00000000O000O();
      }
   }

   private void O0000000000(O0000O000O0O0 o0000O000O0O0, ColorSetting o0000000OOOO0O, float f, float g) {
      float var5 = o0000O000O0O0.O000000O0000();
      float var6 = o0000O000O0O0.O000000O00000();
      float var7 = o0000O000O0O0.O000000O000000();
      float var8 = o0000O000O0O0.O000000O00000O();
      if (!(var7 < 1.0F) && !(var8 < 1.0F)) {
         float var9 = Math.max(0.0F, Math.min(1.0F, (f - var5) / var7));
         float var10 = Math.max(0.0F, Math.min(1.0F, (g - var6) / var8));
         o0000000OOOO0O.O0000000000O00 = var9;
         o0000000OOOO0O.O0000000000O0O = 1.0F - var10;
      }
   }

   private void O0000000000(O0000O000O0O0 o0000O000O0O0, ColorSetting o0000000OOOO0O, float f) {
      float var4 = o0000O000O0O0.O000000O0000O0();
      float var5 = o0000O000O0O0.O000000O000O();
      if (!(var5 < 1.0F)) {
         float var6 = Math.max(0.0F, Math.min(1.0F, (f - var4) / var5));
         o0000000OOOO0O.O00000000(var6 * 360.0F);
      }
   }

   private void O00000000000(O0000O000O0O0 o0000O000O0O0, ColorSetting o0000000OOOO0O, float f) {
      float var4 = o0000O000O0O0.O000000O000O0();
      float var5 = o0000O000O0O0.O000000O000O0O();
      if (!(var5 < 1.0F)) {
         o0000000OOOO0O.O000000000((f - var4) / var5);
      }
   }

   private void O00000000(NumberSetting o000000O000, float f, float g, float h) {
      float var5 = Math.max(0.0F, Math.min(1.0F, (f - g) / Math.max(1.0F, h)));
      float var6 = o000000O000.O000000000000 + (o000000O000.O0000000000000 - o000000O000.O000000000000) * var5;
      if (o000000O000.O000000000000O > 0.0F) {
         var6 = Math.round(var6 / o000000O000.O000000000000O) * o000000O000.O000000000000O;
      }

      o000000O000.O00000000000 = Math.max(o000000O000.O000000000000, Math.min(o000000O000.O0000000000000, var6));
   }

   private void O00000000(MultiSelectSetting o0000000OOOOO) {
      o0000000OOOOO.O0000000000();
      if (!o0000000OOOOO.O00000000000.isEmpty()) {
         String var2 = o0000000OOOOO.O00000000000.get(0);
         if (!o0000000OOOOO.O000000000000O.isEmpty()) {
            int var3 = o0000000OOOOO.O00000000000.indexOf(o0000000OOOOO.O000000000000O.get(o0000000OOOOO.O000000000000O.size() - 1));
            var2 = o0000000OOOOO.O00000000000.get((var3 + 1 + o0000000OOOOO.O00000000000.size()) % o0000000OOOOO.O00000000000.size());
         }

         o0000000OOOOO.O000000000000O.clear();
         o0000000OOOOO.O000000000000O.add(var2);
      }
   }
}
