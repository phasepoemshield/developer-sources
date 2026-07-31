package ru.metaculture.protection;

import java.util.Locale;

public final class O00000OOOOO0O0 {
   private static final long O00000000 = 600L;
   private static final float O000000000 = 2.0F;
   private static final int O0000000000 = 12;
   private static final int O00000000000 = 48;
   private final O00000OOOOO0O0.W324 O000000000000;
   private float O0000000000000;
   private float O000000000000O;
   private float O00000000000O;
   private float O00000000000O0;
   private float O00000000000OO;
   private String O0000000000O = "";
   private boolean O0000000000O0;
   private boolean O0000000000O00;
   private boolean O0000000000O0O;
   private long O0000000000OO;
   private float O0000000000OO0;
   private float O0000000000OOO;
   private float O000000000O;
   private String O000000000O0 = "";
   private long O000000000O00;

   public O00000OOOOO0O0(O00000OOOOO0O0.W324 o00000000, float f, float g, float h, float i) {
      this.O000000000000 = o00000000;
      this.O0000000000000 = f;
      this.O000000000000O = g;
      this.O00000000000O = h;
      this.O00000000000O0 = i;
   }

   public static O00000OOOOO0O0 O00000000(float f, float g) {
      return new O00000OOOOO0O0(O00000OOOOO0O0.W324.NUMERIC, f, g, 0.012F, 0.001F);
   }

   public static O00000OOOOO0O0 O00000000() {
      return new O00000OOOOO0O0(O00000OOOOO0O0.W324.TEXT, 0.0F, 0.0F, 0.0F, 0.0F);
   }

   public O00000OOOOO0O0.W324 O000000000() {
      return this.O000000000000;
   }

   public void O000000000(float f, float g) {
      this.O0000000000000 = f;
      this.O000000000000O = g;
      this.O00000000000OO = this.O000000000(this.O00000000000OO);
   }

   public void O0000000000(float f, float g) {
      this.O00000000000O = f;
      this.O00000000000O0 = g;
   }

   public void O00000000(float f) {
      this.O00000000000OO = this.O000000000(f);
   }

   public void O00000000(String string) {
      this.O0000000000O = string == null ? "" : string;
   }

   public float O0000000000() {
      return this.O00000000000OO;
   }

   public String O00000000000() {
      return this.O0000000000O;
   }

   public boolean O000000000000() {
      return this.O0000000000O0;
   }

   public boolean O0000000000000() {
      return this.O0000000000O0O;
   }

   public boolean O000000000000O() {
      return this.O0000000000O00;
   }

   public boolean O00000000000O() {
      return this.O0000000000O0 || this.O0000000000O0O || this.O0000000000O00;
   }

   public boolean O00000000(float f, float g, int i, O00000OOO000O0 o00000OOO000O0) {
      if (i != 0) {
         return false;
      } else if (o00000OOO000O0 == null || !o00000OOO000O0.contains(f, g)) {
         return false;
      } else if (this.O0000000000O0) {
         return true;
      } else {
         this.O0000000000O00 = true;
         this.O0000000000O0O = false;
         this.O0000000000OO = System.currentTimeMillis();
         this.O0000000000OO0 = f;
         this.O0000000000OOO = f;
         this.O000000000O = this.O00000000000OO;
         return true;
      }
   }

   public boolean O00000000(float f, float g, boolean bl) {
      if (this.O0000000000O0 || this.O000000000000 != O00000OOOOO0O0.W324.NUMERIC) {
         return false;
      } else if (!this.O0000000000O00 && !this.O0000000000O0O) {
         return false;
      } else {
         if (!this.O0000000000O0O && Math.abs(f - this.O0000000000OO0) > 2.0F) {
            this.O0000000000O0O = true;
         }

         if (this.O0000000000O0O) {
            float var4 = bl ? this.O00000000000O0 : this.O00000000000O;
            float var5 = (f - this.O0000000000OOO) * var4;
            this.O00000000000OO = this.O000000000(this.O000000000O + var5);
            return true;
         } else {
            return false;
         }
      }
   }

   public boolean O00000000000(float f, float g) {
      if (this.O0000000000O0) {
         this.O0000000000O00 = false;
         this.O0000000000O0O = false;
         return false;
      } else {
         boolean var3 = this.O0000000000O0O;
         if (this.O0000000000O00 && !this.O0000000000O0O && System.currentTimeMillis() - this.O0000000000OO < 600L) {
            this.O0000000000O0 = true;
            this.O000000000O0 = this.O000000000000 == O00000OOOOO0O0.W324.NUMERIC ? O000000000(O0000000000(this.O00000000000OO)) : this.O0000000000O;
            this.O000000000O00 = System.currentTimeMillis();
         }

         this.O0000000000O00 = false;
         this.O0000000000O0O = false;
         return var3;
      }
   }

   public boolean O00000000(char c) {
      if (!this.O0000000000O0) {
         return false;
      } else if (this.O000000000000 == O00000OOOOO0O0.W324.NUMERIC) {
         if (c >= '0' && c <= '9' || c == '.' || c == ',' || c == '-') {
            if (c == '-' && !this.O000000000O0.isEmpty()) {
               return true;
            }

            if ((c == '.' || c == ',') && this.O000000000O0.contains(".")) {
               return true;
            }

            if (this.O000000000O0.length() < 12) {
               this.O000000000O0 = this.O000000000O0 + (c == ',' ? '.' : c);
               this.O000000000O00 = System.currentTimeMillis();
            }
         }

         return true;
      } else {
         if (this.O000000000O0.length() < 48 && (Character.isLetterOrDigit(c) || c == ' ' || c == '_' || c == '-' || c == '.')) {
            this.O000000000O0 = this.O000000000O0 + c;
            this.O000000000O00 = System.currentTimeMillis();
         }

         return true;
      }
   }

   public boolean O00000000(int i) {
      if (!this.O0000000000O0) {
         return false;
      } else if (i == 256) {
         this.O0000000000O0 = false;
         this.O000000000O0 = "";
         return true;
      } else if (i == 257 || i == 335 || i == 258) {
         this.O00000000000O0();
         return true;
      } else if (i == 259) {
         if (!this.O000000000O0.isEmpty()) {
            this.O000000000O0 = this.O000000000O0.substring(0, this.O000000000O0.length() - 1);
            this.O000000000O00 = System.currentTimeMillis();
         }

         return true;
      } else {
         return true;
      }
   }

   public void O00000000000O0() {
      if (this.O0000000000O0) {
         if (this.O000000000000 == O00000OOOOO0O0.W324.NUMERIC) {
            try {
               float var1 = Float.parseFloat(this.O000000000O0.replace(',', '.'));
               if (Float.isFinite(var1)) {
                  this.O00000000000OO = this.O000000000(var1);
               }
            } catch (NumberFormatException var2) {
            }
         } else {
            this.O0000000000O = this.O000000000O0;
         }

         this.O0000000000O0 = false;
         this.O000000000O0 = "";
      }
   }

   public void O00000000000OO() {
      this.O0000000000O0 = false;
      this.O000000000O0 = "";
      this.O0000000000O00 = false;
      this.O0000000000O0O = false;
   }

   public void O00000000(RenderManager o0000O00OO0O0, O0000O00000 o0000O00000, ColorScheme o0000O000O0OO, O00000OOO000O0 o00000OOO000O0, float f, float g) {
      boolean var7 = o00000OOO000O0.contains(f, g);
      boolean var8 = var7 || this.O0000000000O0O || this.O0000000000O00;
      int var9 = this.O0000000000O0
         ? ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 132)
         : ColorScheme.O00000000(o0000O000O0OO.O00000000000O0(), ColorScheme.O00000000(o0000O000O0OO.O000000000O00(), 56), var8 ? 1.0F : 0.0F);
      o0000O00OO0O0.O00000000(o00000OOO000O0.x(), o00000OOO000O0.y(), o00000OOO000O0.w(), o00000OOO000O0.h(), o0000O00000.O00000000(6.0F), var9);
      if (!this.O0000000000O0 && this.O000000000000 == O00000OOOOO0O0.W324.NUMERIC) {
         float var10 = Math.max(1.0E-4F, this.O000000000000O - this.O0000000000000);
         float var11 = Math.max(0.0F, Math.min(1.0F, (this.O00000000000OO - this.O0000000000000) / var10));
         o0000O00OO0O0.O00000000(
            o00000OOO000O0.x(),
            o00000OOO000O0.y(),
            o00000OOO000O0.w() * var11,
            o00000OOO000O0.h(),
            o0000O00000.O00000000(6.0F),
            ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), var8 ? 80 : 48)
         );
      }

      o0000O00OO0O0.O00000000(
         o00000OOO000O0.x(),
         o00000OOO000O0.y(),
         o00000OOO000O0.w(),
         o00000OOO000O0.h(),
         o0000O00000.O00000000(6.0F),
         this.O0000000000O0
            ? ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 230)
            : ColorScheme.O00000000(o0000O000O0OO.O0000000000O(), ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 122), var8 ? 1.0F : 0.0F),
         this.O0000000000O0 ? 1.0F : 0.6F
      );
      String var14 = this.O0000000000O0
         ? this.O000000000O0
         : (this.O000000000000 == O00000OOOOO0O0.W324.NUMERIC ? O000000000(O0000000000(this.O00000000000OO)) : this.O0000000000O);
      float var15 = O0000O00000OO.O00000000(o0000O00000, FontRegistry.O00000000, var14, 9.0F);
      int var12 = o0000O000O0OO.O000000000O000() ? ColorScheme.O00000000(10, 10, 10, 255) : o0000O000O0OO.O000000000O();
      O0000O00000OO.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         FontRegistry.O00000000,
         o00000OOO000O0.x() + (o00000OOO000O0.w() - var15) * 0.5F,
         o00000OOO000O0.y(),
         o00000OOO000O0.h(),
         9.0F,
         var14,
         var12
      );
      if (this.O0000000000O0 && (System.currentTimeMillis() - this.O000000000O00) / 500L % 2L == 0L) {
         float var13 = o00000OOO000O0.x() + (o00000OOO000O0.w() - var15) * 0.5F + var15 + o0000O00000.O00000000(1.5F);
         o0000O00OO0O0.O00000000(
            var13,
            o00000OOO000O0.y() + o0000O00000.O00000000(3.0F),
            1.0F,
            o00000OOO000O0.h() - o0000O00000.O00000000(6.0F),
            0.0F,
            ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 240)
         );
      }
   }

   private float O000000000(float f) {
      return !Float.isFinite(f) ? this.O00000000000OO : Math.max(this.O0000000000000, Math.min(this.O000000000000O, f));
   }

   private static String O0000000000(float f) {
      return String.format(Locale.ROOT, "%.3f", f);
   }

   private static String O000000000(String string) {
      if (string != null && string.contains(".")) {
         int var1 = string.length();

         while (var1 > 0 && string.charAt(var1 - 1) == '0') {
            var1--;
         }

         if (var1 > 0 && string.charAt(var1 - 1) == '.') {
            var1--;
         }

         return string.substring(0, var1);
      } else {
         return string;
      }
   }

   public static enum W324 {
      NUMERIC,
      TEXT;
   }
}
