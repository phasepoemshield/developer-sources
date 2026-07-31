package ru.metaculture.protection;

import java.util.List;
import lombok.Generated;
import net.minecraft.client.gui.screen.Screen;

public final class O00000OOOOOO0O {
   private final O00000OOOOOO0 O00000000;
   private final O00000OOOOOOO0 O000000000;
   private final O00000OOOOOO00 O0000000000;

   public boolean O00000000(
      O0000O000O0O0 o0000O000O0O0,
      O00000OOOOOOOO o00000OOOOOOOO,
      O0000O0000000 o0000O0000000,
      O0000O00000 o0000O00000,
      O0000O000OO o0000O000OO,
      float f,
      float g,
      int i
   ) {
      o0000O000O0O0.O000000000000O(f);
      o0000O000O0O0.O00000000000O(g);
      if (o0000O000O0O0.O000000000OOO0() && i >= 0 && i <= 8) {
         o0000O000O0O0.O00000000000(i);
         return true;
      } else if (i == 0 && O00000000(o00000OOOOOOOO, o0000O00000, f, g)) {
         o0000O000O0O0.O00000000000O(false);
         o0000O000O0O0.O00000000000O0(false);
         o0000O000O0O0.O00000000((List<Integer>)null);
         o0000O000O0O0.O00000000(f, g, o00000OOOOOOOO, o0000O00000);
         return true;
      } else if (i == 0 && o0000O000O0O0.O000000O0O0O00() && O000000000(o00000OOOOOOOO, o0000O00000, f, g)) {
         o0000O000O0O0.O00000000000O(false);
         o0000O000O0O0.O00000000000O0(false);
         o0000O000O0O0.O00000000((List<Integer>)null);
         o0000O000O0O0.O000000000(f, g, o00000OOOOOOOO, o0000O00000);
         return true;
      } else if (i == 0 && O00000OOOOOOO.O00000000(f, g)) {
         o0000O000O0O0.O00000000000O(false);
         o0000O000O0O0.O00000000000O0(false);
         o0000O000O0O0.O00000000((List<Integer>)null);
         return true;
      } else {
         if (i == 0 && o0000O000O0O0.O00000000OO00()) {
            if (O0000O0000O00.O000000000(o00000OOOOOOOO, o0000O00000, f, g)) {
               o0000O000O0O0.O000000000000(O0000O0000O00.O00000000(o00000OOOOOOOO, o0000O00000, f));
               o0000O000O0O0.O0000000000O00();
               return true;
            }

            if (O0000O0000O00.O0000000000(o00000OOOOOOOO, o0000O00000, f, g)) {
               o0000O000O0O0.O0000000000000(O0000O0000O00.O000000000(o00000OOOOOOOO, o0000O00000, g));
               o0000O000O0O0.O0000000000O0O();
               return true;
            }
         }

         for (O00000OOOOOO var10 : this.O00000000.O00000000(o0000O000O0O0, o00000OOOOOOOO, o0000O0000000, o0000O00000, o0000O000OO, f, g)) {
            if (var10.O00000000(f, g, i)) {
               var10.O00000000(o0000O000O0O0);
               return true;
            }
         }

         if (i == 0) {
            o0000O000O0O0.O00000000000O(false);
            o0000O000O0O0.O00000000000O0(false);
            o0000O000O0O0.O00000000((List<Integer>)null);
            o0000O000O0O0.O000000000OO0();
            if (this.O0000000000(o00000OOOOOOOO, o0000O00000, f, g)) {
               o0000O000O0O0.O00000000(f, g, o00000OOOOOOOO);
               return true;
            }

            if (this.O000000000000(o00000OOOOOOOO, o0000O00000, f, g)) {
               return true;
            }

            if (o0000O000O0O0.O000000O0O0O00() && this.O00000000000(o00000OOOOOOOO, o0000O00000, f, g)) {
               o0000O000O0O0.O000000000(f, g, o00000OOOOOOOO);
               return true;
            }
         }

         return false;
      }
   }

   public static boolean O00000000(O00000OOOOOOOO o00000OOOOOOOO, O0000O00000 o0000O00000, float f, float g) {
      if (o00000OOOOOOOO != null && o0000O00000 != null) {
         float var4 = Math.max(14.0F, o0000O00000.O00000000(22.0F));
         float var5 = o00000OOOOOOOO.O00000000() + o0000O00000.O00000000000() - var4;
         float var6 = o00000OOOOOOOO.O000000000() + o0000O00000.O000000000000() - var4;
         return f >= var5
            && g >= var6
            && f < o00000OOOOOOOO.O00000000() + o0000O00000.O00000000000()
            && g < o00000OOOOOOOO.O000000000() + o0000O00000.O000000000000();
      } else {
         return false;
      }
   }

   public static boolean O000000000(O00000OOOOOOOO o00000OOOOOOOO, O0000O00000 o0000O00000, float f, float g) {
      if (o00000OOOOOOOO != null && o0000O00000 != null) {
         float var4 = Math.max(12.0F, o0000O00000.O000000000(18.0F));
         float var5 = o00000OOOOOOOO.O000000000O00O() + o0000O00000.O000000000O0() - var4;
         float var6 = o00000OOOOOOOO.O000000000O0O() + o0000O00000.O000000000O00() - var4;
         return f >= var5
            && g >= var6
            && f < o00000OOOOOOOO.O000000000O00O() + o0000O00000.O000000000O0()
            && g < o00000OOOOOOOO.O000000000O0O() + o0000O00000.O000000000O00();
      } else {
         return false;
      }
   }

   public boolean O00000000(O0000O000O0O0 o0000O000O0O0) {
      boolean var2 = O00000OOOOOOO.O000000000();
      boolean var3 = o0000O000O0O0.O0000000OO0O0O() != null;
      boolean var4 = o0000O000O0O0.O000000O0() || o0000O000O0O0.O000000O00() || o0000O000O0O0.O000000O000();
      boolean var5 = var2
         || o0000O000O0O0.O0000000000OO()
         || o0000O000O0O0.O00000000O0()
         || o0000O000O0O0.O00000000O00()
         || o0000O000O0O0.O00000000O()
         || o0000O000O0O0.O00000000O000()
         || var3
         || var4
         || O0000O000O0000.O0000000000(o0000O000O0O0);
      o0000O000O0O0.O00000000((List<Integer>)null);
      o0000O000O0O0.O0000000000((ColorSetting)null);
      if (var3) {
         o0000O000O0O0.O00000000O000O();
      }

      if (var4) {
         this.O000000000.O00000000(o0000O000O0O0);
      }

      return var5;
   }

   public boolean O00000000(O0000O000O0O0 o0000O000O0O0, O00000OOOOOOOO o00000OOOOOOOO, O0000O00000 o0000O00000, float f, float g) {
      o0000O000O0O0.O000000000000O(f);
      o0000O000O0O0.O00000000000O(g);
      if (O00000OOOOOOO.O000000000(f, g)) {
         return true;
      } else if (o0000O000O0O0.O0000000O0O()) {
         o0000O000O0O0.O000000000000(O0000O0000O00.O00000000(o00000OOOOOOOO, o0000O00000, f));
         return true;
      } else if (o0000O000O0O0.O0000000O0O0()) {
         o0000O000O0O0.O0000000000000(O0000O0000O00.O000000000(o00000OOOOOOOO, o0000O00000, g));
         return true;
      } else if (o0000O000O0O0.O0000000O0OOO0()) {
         o0000O000O0O0.O00000000000(f, g);
         return true;
      } else if (o0000O000O0O0.O0000000OO000O()) {
         o0000O000O0O0.O000000000000(f, g);
         return true;
      } else if (o0000O000O0O0.O0000000O0OOO()) {
         o0000O000O0O0.O0000000000000(f, g);
         return true;
      } else if (o0000O000O0O0.O0000000O0OO0O()) {
         o0000O000O0O0.O0000000000(f, g);
         return true;
      } else if (o0000O000O0O0.O000000O0() || o0000O000O0O0.O000000O00() || o0000O000O0O0.O000000O000()) {
         this.O000000000.O00000000(o0000O000O0O0, f, g);
         return true;
      } else if (o0000O000O0O0.O0000000OO0O0O() != null) {
         this.O000000000.O00000000(o0000O000O0O0, f);
         return true;
      } else {
         return O0000O000O0000.O00000000(o0000O000O0O0, f, g);
      }
   }

   public boolean O00000000(
      O0000O000O0O0 o0000O000O0O0, O00000OOOOOOOO o00000OOOOOOOO, O0000O0000000 o0000O0000000, O0000O00000 o0000O00000, float f, float g, double d, double e
   ) {
      if (o0000O000O0O0.O000000000OOO0() && Math.abs(e) > 1.0E-4) {
         o0000O000O0O0.O000000OO0OO(e > 0.0 ? KeybindSetting.WHEEL_UP : KeybindSetting.WHEEL_DOWN);
         return true;
      } else if (!O0000O00000OO.O00000000(
         f, g, o00000OOOOOOOO.O0000000000O(), o00000OOOOOOOO.O0000000000O0(), o00000OOOOOOOO.O0000000000O00(), o00000OOOOOOOO.O0000000000O0O()
      )) {
         if (this.O000000000000(o00000OOOOOOOO, o0000O00000, f, g)) {
            return true;
         } else if (o0000O000O0O0.O000000O0O0O00()
            && O0000O00000OO.O00000000(
               f, g, o00000OOOOOOOO.O000000000O00O(), o00000OOOOOOOO.O000000000O0O(), o0000O00000.O000000000O0(), o0000O00000.O000000000O00()
            )) {
            o0000O000O0O0.O00000000((float)e * o0000O00000.O00000000(36.0F), o0000O00000);
            return true;
         } else {
            return false;
         }
      } else if (o0000O000O0O0.O000000O0O0O0()) {
         O0000O0000OO00.O00000000(o00000OOOOOOOO, o0000O00000, f, g, e);
         return true;
      } else if (!o0000O000O0O0.O00000000OO00()) {
         if (o0000O000O0O0.O00000000OO0() && this.O00000000(o0000O000O0O0, o00000OOOOOOOO, o0000O00000, f, g, e)) {
            return true;
         } else if (O0000O000O0000.O00000000(o0000O000O0O0, o0000O0000000, o0000O00000, f, g, e)) {
            return true;
         } else {
            o0000O000O0O0.O000000000((float)e * o0000O00000.O00000000(36.0F), o0000O00000);
            return true;
         }
      } else {
         if (O0000O0000O00.O00000000(o00000OOOOOOOO, o0000O00000, f, g)) {
            float var11 = (float)e * o0000O00000.O00000000(36.0F);
            float var12 = (float)d * o0000O00000.O00000000(64.0F);
            if (Math.abs(var12) <= 0.001F && (Screen.hasShiftDown() || Screen.hasControlDown())) {
               var12 = (float)e * o0000O00000.O00000000(96.0F);
               var11 = 0.0F;
            }

            o0000O000O0O0.O000000000(var11, var12);
         }

         return true;
      }
   }

   private boolean O00000000(O0000O000O0O0 o0000O000O0O0, O00000OOOOOOOO o00000OOOOOOOO, O0000O00000 o0000O00000, float f, float g, double d) {
      if (WildClient.O00000000 != null && WildClient.O00000000.O000000000 != null) {
         AutoBuy var8 = WildClient.O00000000.O000000000.O00000000(AutoBuy.class);
         return var8 != null && O0000O000O0000.O000000000(var8)
            ? O0000O000O0000.O00000000(
               o0000O000O0O0, new O0000O0000000(List.of(O0000O000O0000.O00000000(var8, o00000OOOOOOOO, o0000O00000)), 0.0F), o0000O00000, f, g, d
            )
            : false;
      } else {
         return false;
      }
   }

   public boolean O00000000(O0000O000O0O0 o0000O000O0O0, int i) {
      return O0000O000O0000.O00000000(o0000O000O0O0, i) ? true : this.O0000000000.O00000000(o0000O000O0O0, i);
   }

   public boolean O00000000(O0000O000O0O0 o0000O000O0O0, char c) {
      return O0000O000O0000.O00000000(o0000O000O0O0, c) ? true : this.O0000000000.O00000000(o0000O000O0O0, c);
   }

   public void O00000000(O0000O000O0O0 o0000O000O0O0, float f) {
      if (!o0000O000O0O0.O0000000O0OO0O() && !o0000O000O0O0.O0000000O0OOO()) {
         if (!o0000O000O0O0.O000000O0() && !o0000O000O0O0.O000000O00() && !o0000O000O0O0.O000000O000()) {
            this.O000000000.O00000000(o0000O000O0O0, f);
         } else {
            this.O000000000.O00000000(o0000O000O0O0, f, o0000O000O0O0.O0000000O0());
         }
      }
   }

   private boolean O0000000000(O00000OOOOOOOO o00000OOOOOOOO, O0000O00000 o0000O00000, float f, float g) {
      return O0000O00000OO.O00000000(
            f, g, o00000OOOOOOOO.O000000000000O(), o00000OOOOOOOO.O00000000000O(), o00000OOOOOOOO.O00000000000O0(), o0000O00000.O0000000000O()
         )
         || this.O0000000000000(o00000OOOOOOOO, o0000O00000, f, g);
   }

   private boolean O00000000000(O00000OOOOOOOO o00000OOOOOOOO, O0000O00000 o0000O00000, float f, float g) {
      return O0000O00000OO.O00000000(
         f, g, o00000OOOOOOOO.O000000000O00O(), o00000OOOOOOOO.O000000000O0O(), o0000O00000.O000000000O0(), o0000O00000.O000000000O00()
      );
   }

   private boolean O000000000000(O00000OOOOOOOO o00000OOOOOOOO, O0000O00000 o0000O00000, float f, float g) {
      return O0000O00000OO.O00000000(f, g, o00000OOOOOOOO.O00000000(), o00000OOOOOOOO.O000000000(), o0000O00000.O00000000000(), o0000O00000.O000000000000());
   }

   private boolean O0000000000000(O00000OOOOOOOO o00000OOOOOOOO, O0000O00000 o0000O00000, float f, float g) {
      if (!O0000O00000OO.O00000000(f, g, o00000OOOOOOOO.O0000000000(), o00000OOOOOOOO.O00000000000(), o0000O00000.O00000000000O(), o0000O00000.O00000000000OO())
         )
       {
         return false;
      } else if (O0000O00000OO.O00000000(
         f,
         g,
         o00000OOOOOOOO.O0000000000() + o0000O00000.O00000000(16.0F),
         o00000OOOOOOOO.O00000000000() + o0000O00000.O00000000(16.0F),
         o0000O00000.O00000000(40.0F),
         o0000O00000.O00000000(40.0F)
      )) {
         return false;
      } else {
         float var5 = O0000O0000OOO0.O0000000000(o00000OOOOOOOO, o0000O00000);
         float var6 = O0000O0000OOO0.O000000000(o0000O00000);
         if (O0000O00000OO.O00000000(f, g, var5, O0000O0000OOO0.O00000000000(o00000OOOOOOOO, o0000O00000), var6, var6)) {
            return false;
         } else {
            float var7 = var5;
            float var8 = o00000OOOOOOOO.O00000000000() + o0000O00000.O00000000(89.0F);

            for (int var9 = 0; var9 < Category.values().length; var9++) {
               if (O0000O00000OO.O00000000(f, g, var7, var8 + var9 * o0000O00000.O00000000(56.0F), var6, var6)) {
                  return false;
               }
            }

            float var10 = O0000O0000OOO0.O000000000000(o00000OOOOOOOO, o0000O00000);
            return !O0000O00000OO.O00000000(f, g, var7, var10, var6, var6);
         }
      }
   }

   @Generated
   public O00000OOOOOO0O(O00000OOOOOO0 o00000OOOOOO0, O00000OOOOOOO0 o00000OOOOOOO0, O00000OOOOOO00 o00000OOOOOO00) {
      this.O00000000 = o00000OOOOOO0;
      this.O000000000 = o00000OOOOOOO0;
      this.O0000000000 = o00000OOOOOO00;
   }
}
