package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class O00000OOO00O00 {
   private final O00000OOO0OOO O00000000;
   private boolean O000000000;
   private float O0000000000;
   private float O00000000000;
   private String O000000000000 = "";
   private int O0000000000000;
   private float O000000000000O;
   private long O00000000000O;
   private O00000OOO0OO O00000000000O0;
   private List<O00000OOO0O00O> O00000000000OO = new ArrayList<>();
   private final Map<String, Boolean> O0000000000O = new LinkedHashMap<>();

   public O00000OOO00O00(O00000OOO0OOO o00000OOO0OOO) {
      this.O00000000 = o00000OOO0OOO;
   }

   public boolean O00000000() {
      return this.O000000000;
   }

   public O00000OOO0OO O000000000() {
      return this.O00000000000O0;
   }

   public float O0000000000() {
      return this.O0000000000;
   }

   public float O00000000000() {
      return this.O00000000000;
   }

   public void O00000000(float f, float g, O00000OOO0OO o00000OOO0OO) {
      this.O000000000 = true;
      this.O0000000000 = f;
      this.O00000000000 = g;
      this.O000000000000 = "";
      this.O0000000000000 = 0;
      this.O000000000000O = 0.0F;
      this.O00000000000O = System.currentTimeMillis();
      this.O00000000000O0 = o00000OOO0OO;
      this.O00000000000OO();
   }

   public void O000000000000() {
      this.O000000000 = false;
      this.O00000000000O0 = null;
   }

   public void O00000000(char c) {
      if (this.O000000000) {
         if ((c >= '0' && c <= '9' || c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c == ' ' || c == '_' || c == '.') && this.O000000000000.length() < 32) {
            this.O000000000000 = this.O000000000000 + c;
            this.O0000000000000 = 0;
            this.O000000000000O = 0.0F;
            this.O00000000000O = System.currentTimeMillis();
            this.O00000000000OO();
         }
      }
   }

   public void O0000000000000() {
      if (this.O000000000 && !this.O000000000000.isEmpty()) {
         this.O000000000000 = this.O000000000000.substring(0, this.O000000000000.length() - 1);
         this.O0000000000000 = 0;
         this.O000000000000O = 0.0F;
         this.O00000000000O = System.currentTimeMillis();
         this.O00000000000OO();
      }
   }

   public void O000000000000O() {
      if (this.O000000000) {
         this.O000000000000 = "";
         this.O0000000000000 = 0;
         this.O000000000000O = 0.0F;
         this.O00000000000O = System.currentTimeMillis();
         this.O00000000000OO();
      }
   }

   public void O00000000(int i) {
      if (this.O000000000 && !this.O00000000000OO.isEmpty()) {
         this.O0000000000000 = Math.floorMod(this.O0000000000000 + i, this.O00000000000OO.size());
      }
   }

   public O00000OOO0O00O O00000000000O() {
      return this.O00000000000OO.isEmpty() ? null : this.O00000000000OO.get(Math.min(this.O0000000000000, this.O00000000000OO.size() - 1));
   }

   public List<O00000OOO0O00O> O00000000000O0() {
      return this.O00000000000OO;
   }

   public void O00000000(double d) {
      if (this.O000000000) {
         this.O000000000000O = Math.max(0.0F, this.O000000000000O - (float)d * 24.0F);
      }
   }

   public void O00000000(String string) {
      if (string != null) {
         this.O0000000000O.put(string, !this.O0000000000O.getOrDefault(string, false));
      }
   }

   public boolean O000000000(String string) {
      return this.O0000000000O.getOrDefault(string, false);
   }

   public O00000OOO000O0 O00000000(O0000O00000 o0000O00000, int i, int j) {
      float var4 = o0000O00000.O00000000(340.0F);
      float var5 = o0000O00000.O00000000(440.0F);
      float var6 = Math.max(o0000O00000.O00000000(16.0F), Math.min(this.O0000000000 - var4 * 0.18F, i - var4 - o0000O00000.O00000000(16.0F)));
      float var7 = Math.max(o0000O00000.O00000000(16.0F), Math.min(this.O00000000000 - o0000O00000.O00000000(28.0F), j - var5 - o0000O00000.O00000000(16.0F)));
      return new O00000OOO000O0(var6, var7, var4, var5);
   }

   public O00000OOO000O0 O000000000(O0000O00000 o0000O00000, int i, int j) {
      O00000OOO000O0 var4 = this.O00000000(o0000O00000, i, j);
      return new O00000OOO000O0(
         var4.x() + o0000O00000.O00000000(12.0F),
         var4.y() + o0000O00000.O00000000(38.0F),
         var4.w() - o0000O00000.O00000000(24.0F),
         o0000O00000.O00000000(30.0F)
      );
   }

   public O00000OOO0O00O O00000000(O0000O00000 o0000O00000, int i, int j, float f, float g) {
      if (!this.O000000000) {
         return null;
      } else {
         O00000OOO000O0 var6 = this.O00000000(o0000O00000, i, j);
         float var7 = var6.y() + o0000O00000.O00000000(80.0F);
         float var8 = var6.y() + var6.h() - o0000O00000.O00000000(40.0F);
         if (!(f < var6.x()) && !(f > var6.x() + var6.w()) && !(g < var7) && !(g > var8)) {
            float var9 = var7 - this.O000000000000O;
            String var10 = "";

            for (O00000OOO0O00O var12 : this.O00000000000OO) {
               if (!var12.O0000000000().equals(var10)) {
                  var10 = var12.O0000000000();
                  if (g >= var9 && g < var9 + o0000O00000.O00000000(20.0F)) {
                     return null;
                  }

                  var9 += o0000O00000.O00000000(20.0F);
                  if (this.O000000000(var10) && this.O000000000000.isBlank()) {
                     continue;
                  }
               } else if (this.O000000000(var10) && this.O000000000000.isBlank()) {
                  continue;
               }

               float var13 = o0000O00000.O00000000(28.0F);
               if (g >= var9 && g < var9 + var13) {
                  return var12;
               }

               var9 += var13;
               if (var9 > var8) {
                  break;
               }
            }

            return null;
         } else {
            return null;
         }
      }
   }

   public String O000000000(O0000O00000 o0000O00000, int i, int j, float f, float g) {
      if (this.O000000000 && this.O000000000000.isBlank()) {
         O00000OOO000O0 var6 = this.O00000000(o0000O00000, i, j);
         float var7 = var6.y() + o0000O00000.O00000000(80.0F);
         float var8 = var6.y() + var6.h() - o0000O00000.O00000000(40.0F);
         if (!(f < var6.x()) && !(f > var6.x() + var6.w()) && !(g < var7) && !(g > var8)) {
            float var9 = var7 - this.O000000000000O;
            String var10 = "";

            for (O00000OOO0O00O var12 : this.O00000000000OO) {
               if (!var12.O0000000000().equals(var10)) {
                  var10 = var12.O0000000000();
                  if (g >= var9 && g < var9 + o0000O00000.O00000000(20.0F)) {
                     return var10;
                  }

                  var9 += o0000O00000.O00000000(20.0F);
                  if (this.O000000000(var10)) {
                     continue;
                  }
               } else if (this.O000000000(var10)) {
                  continue;
               }

               var9 += o0000O00000.O00000000(28.0F);
               if (var9 > var8) {
                  break;
               }
            }

            return null;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   private void O00000000000OO() {
      String var1 = this.O000000000000 == null ? "" : this.O000000000000.toLowerCase(Locale.ROOT).trim();
      ArrayList var2 = new ArrayList<>(this.O00000000.O00000000());
      if (this.O00000000000O0 != null) {
         ArrayList var3 = new ArrayList();

         for (O00000OOO0O00O var5 : (List<O00000OOO0O00O>)var2) {
            for (O00000OOO0O0OO var7 : var5.O000000000000()) {
               if (var7.type() == this.O00000000000O0) {
                  var3.add(var5);
                  break;
               }
            }
         }

         var2 = var3;
      }

      if (var1.isEmpty()) {
         var2.sort(Comparator.<O00000OOO0O00O, String>comparing(O00000OOO0O00O::O0000000000).thenComparing(Comparator.comparing(O00000OOO0O00O::O000000000)));
         this.O00000000000OO = var2;
      } else {
         ArrayList var8 = new ArrayList();

         for (O00000OOO0O00O var11 : (List<O00000OOO0O00O>)var2) {
            int var13 = O00000000(var11, var1);
            if (var13 > 0) {
               var8.add(new O00000OOO00O00.W301(var11, var13));
            }
         }

         var8.sort(Comparator.<O00000OOO00O00.W301>comparingInt(o00000000 -> -o00000000.score).thenComparing(o00000000 -> o00000000.def.O000000000()));
         ArrayList var10 = new ArrayList();

         for (O00000OOO00O00.W301 var14 : (List<O00000OOO00O00.W301>)var8) {
            var10.add(var14.def);
         }

         this.O00000000000OO = var10;
      }
   }

   private static int O00000000(O00000OOO0O00O o00000OOO0O00O, String string) {
      String var2 = o00000OOO0O00O.O000000000().toLowerCase(Locale.ROOT);
      String var3 = o00000OOO0O00O.O0000000000().toLowerCase(Locale.ROOT);
      String var4 = o00000OOO0O00O.O00000000().toLowerCase(Locale.ROOT);
      byte var5 = 0;
      if (var2.startsWith(string)) {
         var5 += 80;
      }

      if (var2.contains(string)) {
         var5 += 40;
      }

      if (var4.contains(string)) {
         var5 += 30;
      }

      if (var3.contains(string)) {
         var5 += 15;
      }

      int var6 = 0;
      int var7 = 0;

      for (int var8 = 0; var8 < string.length(); var8++) {
         int var9 = var2.indexOf(string.charAt(var8), var7);
         if (var9 < 0) {
            break;
         }

         var6++;
         var7 = var9 + 1;
      }

      if (var6 == string.length()) {
         var5 += 25;
      }

      return var5;
   }

   public void O00000000(RenderManager o0000O00OO0O0, O0000O000O0OOO o0000O000O0OOO, O0000O000O0O0 o0000O000O0O0, int i, int j) {
      if (this.O000000000) {
         O0000O00000 var6 = o0000O000O0OOO.O000000000000();
         ColorScheme var7 = o0000O000O0OOO.O0000000000000();
         O00000OOO000O0 var8 = this.O00000000(var6, i, j);
         float var9 = var6.O00000000(12.0F);
         o0000O00OO0O0.O00000000(
            var8.x(),
            var8.y(),
            var8.w(),
            var8.h(),
            var9,
            var6.O00000000(28.0F),
            var6.O00000000(2.0F),
            var7.O000000000O000() ? ColorScheme.O00000000(10, 31, 10, 30) : ColorScheme.O00000000(0, 0, 0, 168)
         );
         o0000O00OO0O0.O00000000(
            var8.x(),
            var8.y(),
            var8.w(),
            var8.h(),
            var9,
            var7.O000000000O000()
               ? ColorScheme.O00000000(ColorScheme.O00000000(255, 255, 255, 246), ColorScheme.O00000000(var7.O000000000O0(), 246), 0.035F)
               : ColorScheme.O00000000(8, 10, 16, 240)
         );
         o0000O00OO0O0.O00000000(var8.x(), var8.y(), var8.w(), var8.h(), var9, ColorScheme.O00000000(var7.O000000000O0(), 108), 0.9F);
         O0000O00000OO.O00000000(
            o0000O00OO0O0,
            var6,
            FontRegistry.O00000000000,
            var8.x() + var6.O00000000(14.0F),
            var8.y() + var6.O00000000(14.0F),
            12.0F,
            this.O00000000000O0 != null ? "Connect → " + this.O00000000000O0.O00000000() : "Node Browser",
            var7.O000000000O()
         );
         O0000O00000OO.O00000000(
            o0000O00OO0O0,
            var6,
            FontRegistry.O00000000,
            var8.x() + var8.w() - var6.O00000000(70.0F),
            var8.y() + var6.O00000000(16.0F),
            8.0F,
            "Enter • Esc",
            ColorScheme.O00000000(var7.O000000000O0(), 200)
         );
         O00000OOO000O0 var10 = this.O000000000(var6, i, j);
         o0000O00OO0O0.O00000000(
            var10.x(),
            var10.y(),
            var10.w(),
            var10.h(),
            var6.O00000000(7.0F),
            var7.O000000000O000()
               ? ColorScheme.O00000000(ColorScheme.O00000000(255, 255, 255, 242), ColorScheme.O00000000(var7.O000000000O0(), 242), 0.028F)
               : ColorScheme.O00000000(14, 16, 22, 232)
         );
         o0000O00OO0O0.O00000000(var10.x(), var10.y(), var10.w(), var10.h(), var6.O00000000(7.0F), ColorScheme.O00000000(var7.O000000000O0(), 156), 0.8F);
         o0000O00OO0O0.O000000000(
            var10.x() + var6.O00000000(11.0F), var10.y() + var10.h() * 0.5F, var6.O00000000(3.4F), 0.0F, 1.0F, ColorScheme.O00000000(var7.O000000000O0(), 220)
         );
         o0000O00OO0O0.O00000000(
            var10.x() + var6.O00000000(13.5F),
            var10.y() + var10.h() * 0.5F + var6.O00000000(1.4F),
            var6.O00000000(6.0F),
            1.1F,
            0.0F,
            ColorScheme.O00000000(var7.O000000000O0(), 220)
         );
         String var11 = this.O000000000000.isBlank() ? "type to search…" : this.O000000000000;
         int var12 = this.O000000000000.isBlank() ? var7.O0000000000OOO() : var7.O000000000O();
         O0000O00000OO.O00000000(
            o0000O00OO0O0, var6, FontRegistry.O00000000, var10.x() + var6.O00000000(22.0F), var10.y() + var6.O00000000(8.0F), 10.0F, var11, var12
         );
         if (!this.O000000000000.isBlank()) {
            float var13 = O0000O00000OO.O00000000(var6, FontRegistry.O00000000, this.O000000000000, 10.0F);
            boolean var14 = (System.currentTimeMillis() - this.O00000000000O) / 500L % 2L == 0L;
            if (var14) {
               o0000O00OO0O0.O00000000(
                  var10.x() + var6.O00000000(22.0F) + var13 + 1.0F,
                  var10.y() + var6.O00000000(6.0F),
                  1.0F,
                  var10.h() - var6.O00000000(12.0F),
                  0.0F,
                  ColorScheme.O00000000(var7.O000000000O0(), 240)
               );
            }
         }

         float var29 = var8.y() + var6.O00000000(80.0F);
         float var30 = var8.y() + var8.h() - var6.O00000000(40.0F);
         o0000O00OO0O0.O0000000000();
         o0000O00OO0O0.O00000000(
            var8.x() + var6.O00000000(8.0F),
            var29,
            var8.w() - var6.O00000000(16.0F),
            var30 - var29,
            var6.O00000000(6.0F),
            var6.O00000000(6.0F),
            var6.O00000000(6.0F),
            var6.O00000000(6.0F)
         );

         try {
            float var15 = var29 - this.O000000000000O;
            String var16 = "";
            int var17 = 0;
            String var18 = this.O000000000000.toLowerCase(Locale.ROOT);

            for (O00000OOO0O00O var20 : this.O00000000000OO) {
               if (!var20.O0000000000().equals(var16)) {
                  var16 = var20.O0000000000();
                  boolean var21 = this.O000000000000.isBlank() && this.O000000000(var16);
                  O0000O00000OO.O00000000(
                     o0000O00OO0O0,
                     var6,
                     FontRegistry.O00000000000,
                     var8.x() + var6.O00000000(20.0F),
                     var15 + var6.O00000000(6.0F),
                     9.0F,
                     (var21 ? "▸ " : "▾ ") + var16.toUpperCase(Locale.ROOT),
                     ColorScheme.O00000000(var7.O000000000O00(), 220)
                  );
                  var15 += var6.O00000000(20.0F);
                  if (var21) {
                     continue;
                  }
               } else if (this.O000000000000.isBlank() && this.O000000000(var16)) {
                  continue;
               }

               float var31 = var6.O00000000(28.0F);
               boolean var22 = o0000O000O0O0 != null
                  && o0000O000O0O0.O0000000O() >= var8.x() + var6.O00000000(12.0F)
                  && o0000O000O0O0.O0000000O() <= var8.x() + var8.w() - var6.O00000000(12.0F)
                  && o0000O000O0O0.O0000000O0() >= var15
                  && o0000O000O0O0.O0000000O0() < var15 + var31;
               boolean var23 = var17 == this.O0000000000000;
               float var24 = Math.max(var22 ? 0.7F : 0.0F, var23 ? 1.0F : 0.0F);
               o0000O00OO0O0.O00000000(
                  var8.x() + var6.O00000000(12.0F),
                  var15,
                  var8.w() - var6.O00000000(24.0F),
                  var31 - var6.O00000000(2.0F),
                  var6.O00000000(6.0F),
                  ColorScheme.O00000000(ColorScheme.O00000000(255, 255, 255, 6), ColorScheme.O00000000(var7.O000000000O0(), 72), var24)
               );
               o0000O00OO0O0.O000000000(
                  var8.x() + var6.O00000000(22.0F),
                  var15 + var31 * 0.5F - var6.O00000000(1.0F),
                  var6.O00000000(2.6F),
                  0.0F,
                  1.0F,
                  ColorScheme.O00000000(var7.O0000000000OO0(), var7.O000000000O0(), var24)
               );
               this.O00000000(
                  o0000O00OO0O0, var6, var7, var20.O000000000(), var18, var8.x() + var6.O00000000(34.0F), var15 + var6.O00000000(5.0F), 10.0F, var24
               );
               String var25 = var20.O0000000000000().isEmpty() ? "output ✕" : var20.O0000000000000().get(0).type().O00000000();
               O0000O00000OO.O00000000(
                  o0000O00OO0O0,
                  var6,
                  FontRegistry.O00000000,
                  var8.x() + var8.w() - var6.O00000000(60.0F),
                  var15 + var6.O00000000(8.0F),
                  8.0F,
                  var25,
                  ColorScheme.O00000000(var7.O000000000O00(), 220)
               );
               var15 += var31;
               var17++;
               if (var15 > var30 + var31) {
                  break;
               }
            }

            if (this.O00000000000OO.isEmpty()) {
               O0000O00000OO.O00000000(
                  o0000O00OO0O0,
                  var6,
                  FontRegistry.O00000000,
                  var8.x() + var6.O00000000(20.0F),
                  var29 + var6.O00000000(20.0F),
                  10.0F,
                  "no matches",
                  var7.O0000000000OOO()
               );
            }
         } finally {
            o0000O00OO0O0.O0000000000();
            o0000O00OO0O0.O0000000000000();
         }

         O0000O00000OO.O00000000(
            o0000O00OO0O0,
            var6,
            FontRegistry.O00000000,
            var8.x() + var6.O00000000(14.0F),
            var8.y() + var8.h() - var6.O00000000(20.0F),
            8.0F,
            "↑↓ navigate • Enter spawn • LMB on category to toggle • Wheel scroll",
            ColorScheme.O00000000(var7.O000000000O(), 156)
         );
      }
   }

   private void O00000000(
      RenderManager o0000O00OO0O0, O0000O00000 o0000O00000, ColorScheme o0000O000O0OO, String string, String string2, float f, float g, float h, float i
   ) {
      int var10 = ColorScheme.O00000000(o0000O000O0OO.O0000000000OOO(), o0000O000O0OO.O000000000O(), 0.6F + i * 0.4F);
      if (string2 != null && !string2.isEmpty()) {
         String var11 = string.toLowerCase(Locale.ROOT);
         int var12 = var11.indexOf(string2);
         if (var12 < 0) {
            O0000O00000OO.O00000000(o0000O00OO0O0, o0000O00000, FontRegistry.O00000000000, f, g, h, string, var10);
         } else {
            String var13 = string.substring(0, var12);
            String var14 = string.substring(var12, var12 + string2.length());
            String var15 = string.substring(var12 + string2.length());
            float var16 = O0000O00000OO.O00000000(o0000O00000, FontRegistry.O00000000000, var13, h);
            float var17 = O0000O00000OO.O00000000(o0000O00000, FontRegistry.O00000000000, var14, h);
            O0000O00000OO.O00000000(o0000O00OO0O0, o0000O00000, FontRegistry.O00000000000, f, g, h, var13, var10);
            O0000O00000OO.O00000000(
               o0000O00OO0O0, o0000O00000, FontRegistry.O00000000000, f + var16, g, h, var14, ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 245)
            );
            O0000O00000OO.O00000000(o0000O00OO0O0, o0000O00000, FontRegistry.O00000000000, f + var16 + var17, g, h, var15, var10);
         }
      } else {
         O0000O00000OO.O00000000(o0000O00OO0O0, o0000O00000, FontRegistry.O00000000000, f, g, h, string, var10);
      }
   }

   record W301(O00000OOO0O00O def, int score) {
   }
}
