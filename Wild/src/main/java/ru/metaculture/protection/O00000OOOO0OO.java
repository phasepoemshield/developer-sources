package ru.metaculture.protection;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public final class O00000OOOO0OO {
   private static final SimpleDateFormat O00000000 = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.ROOT);
   private final O0000O00O0O0OO O000000000 = new O0000O00O0O0OO(
      O0000O00O0O000.O00000000(), O0000O00O0O0O0.O00000000(2.5F, 0.82F), 0.0F, 0.0F, 1.0F, 0.001F, 0.001F
   );
   private final O0000O00O0O0OO O0000000000 = new O0000O00O0O0OO(
      O0000O00O0O000.O00000000(), O0000O00O0O0O0.O00000000(2.2F, 0.86F), 0.0F, 0.0F, 100000.0F, 0.01F, 0.01F
   );
   private final List<File> O00000000000 = new ArrayList<>();
   private boolean O000000000000;
   private String O0000000000000 = "";
   private int O000000000000O = -1;
   private int O00000000000O = -1;
   private float O00000000000O0;
   private File O00000000000OO;

   public void O00000000(List<File> list) {
      this.O00000000000.clear();
      if (list != null) {
         this.O00000000000.addAll(list);
      }

      this.O000000000000 = true;
      this.O0000000000000 = "";
      this.O000000000000O = -1;
      this.O00000000000O = this.O00000000000.isEmpty() ? -1 : 0;
      this.O00000000000OO = null;
      this.O00000000000O0 = 0.0F;
      this.O0000000000.O000000000(0.0F);
      this.O000000000.O0000000000(1.0F);
   }

   public void O00000000() {
      this.O000000000000 = false;
      this.O000000000.O0000000000(0.0F);
   }

   public boolean O000000000() {
      return this.O000000000000;
   }

   public File O0000000000() {
      File var1 = this.O00000000000OO;
      this.O00000000000OO = null;
      return var1;
   }

   public boolean O00000000(float f, float g, int i, O0000O00000 o0000O00000, int j, int k) {
      if (!this.O000000000000) {
         return false;
      } else if (i != 0) {
         return true;
      } else {
         O00000OOO000O0 var7 = this.O00000000(o0000O00000, j, k);
         O00000OOO000O0 var8 = this.O0000000000(var7, o0000O00000);
         O00000OOO000O0 var9 = this.O00000000000(var7, o0000O00000);
         if (!var9.contains(f, g) && var7.contains(f, g)) {
            List var10 = this.O00000000000();
            if (var8.contains(f, g)) {
               if (this.O00000000000O >= 0 && this.O00000000000O < var10.size()) {
                  this.O00000000000OO = (File)var10.get(this.O00000000000O);
                  this.O00000000();
               }

               return true;
            } else {
               O00000OOO000O0 var11 = this.O000000000(var7, o0000O00000);
               if (var11.contains(f, g)) {
                  float var12 = o0000O00000.O00000000(42.0F);
                  int var13 = (int)Math.floor((g - var11.y() + this.O0000000000.O00000000()) / var12);
                  if (var13 >= 0 && var13 < var10.size()) {
                     this.O00000000000O = var13;
                  }

                  return true;
               } else {
                  return true;
               }
            }
         } else {
            this.O00000000();
            return true;
         }
      }
   }

   public boolean O00000000(double d, O0000O00000 o0000O00000, int i, int j) {
      if (!this.O000000000000) {
         return false;
      } else {
         O00000OOO000O0 var6 = this.O000000000(this.O00000000(o0000O00000, i, j), o0000O00000);
         float var7 = this.O00000000000().size() * o0000O00000.O00000000(42.0F);
         float var8 = Math.max(0.0F, var7 - var6.h());
         this.O00000000000O0 = Math.max(0.0F, Math.min(var8, this.O00000000000O0 - (float)d * o0000O00000.O00000000(42.0F)));
         this.O0000000000.O0000000000(this.O00000000000O0);
         return true;
      }
   }

   public boolean O00000000(char c) {
      if (!this.O000000000000) {
         return false;
      } else {
         if ((Character.isLetterOrDigit(c) || c == ' ' || c == '_' || c == '-' || c == '.') && this.O0000000000000.length() < 64) {
            this.O0000000000000 = this.O0000000000000 + c;
            this.O00000000000O = this.O00000000000().isEmpty() ? -1 : 0;
            this.O00000000000O0 = 0.0F;
            this.O0000000000.O000000000(0.0F);
         }

         return true;
      }
   }

   public boolean O00000000(int i) {
      if (!this.O000000000000) {
         return false;
      } else {
         List var2 = this.O00000000000();
         if (i == 256) {
            this.O00000000();
            return true;
         } else if (i == 259) {
            if (!this.O0000000000000.isEmpty()) {
               this.O0000000000000 = this.O0000000000000.substring(0, this.O0000000000000.length() - 1);
               this.O00000000000O = this.O00000000000().isEmpty() ? -1 : 0;
               this.O00000000000O0 = 0.0F;
               this.O0000000000.O000000000(0.0F);
            }

            return true;
         } else if (i == 264) {
            if (!var2.isEmpty()) {
               this.O00000000000O = Math.min(var2.size() - 1, Math.max(0, this.O00000000000O + 1));
            }

            return true;
         } else if (i == 265) {
            if (!var2.isEmpty()) {
               this.O00000000000O = Math.max(0, this.O00000000000O - 1);
            }

            return true;
         } else if (i != 257 && i != 335) {
            return true;
         } else {
            if (this.O00000000000O >= 0 && this.O00000000000O < var2.size()) {
               this.O00000000000OO = (File)var2.get(this.O00000000000O);
               this.O00000000();
            }

            return true;
         }
      }
   }

   public void O00000000(RenderManager o0000O00OO0O0, O0000O00000 o0000O00000, ColorScheme o0000O000O0OO, float f, float g, int i, int j) {
      float var8 = this.O000000000.O00000000();
      if (!(var8 <= 0.001F) && o0000O00OO0O0 != null && o0000O00000 != null && o0000O000O0OO != null) {
         O00000OOO000O0 var9 = this.O00000000(o0000O00000, i, j);
         float var10 = o0000O00000.O00000000(14.0F) * (1.0F - var8);
         var9 = new O00000OOO000O0(var9.x(), var9.y() + var10, var9.w(), var9.h());
         o0000O00OO0O0.O000000000000(var8);

         try {
            o0000O00OO0O0.O00000000(0.0F, 0.0F, (float)i, (float)j, 0.0F, ColorScheme.O00000000(0, 0, 0, o0000O000O0OO.O000000000O000() ? 72 : 116));
            float var11 = o0000O00000.O00000000(14.0F);
            o0000O00OO0O0.O00000000(
               var9.x(), var9.y(), var9.w(), var9.h(), var11, o0000O00000.O00000000(26.0F), o0000O00000.O00000000(2.0F), ColorScheme.O00000000(0, 0, 0, 164)
            );
            o0000O00OO0O0.O00000000(var9.x(), var9.y(), var9.w(), var9.h(), var11, this.O00000000(o0000O000O0OO, 238));
            o0000O00OO0O0.O00000000(var9.x(), var9.y(), var9.w(), var9.h(), var11, ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 92), 0.8F);
            O0000O00000OO.O00000000(
               o0000O00OO0O0,
               o0000O00000,
               FontRegistry.O00000000000,
               var9.x() + o0000O00000.O00000000(20.0F),
               var9.y() + o0000O00000.O00000000(18.0F),
               13.0F,
               "Import Foundry Shader",
               o0000O000O0OO.O000000000O()
            );
            this.O00000000(o0000O00OO0O0, o0000O00000, o0000O000O0OO, var9);
            this.O00000000(o0000O00OO0O0, o0000O00000, o0000O000O0OO, var9, f, g);
            this.O000000000(o0000O00OO0O0, o0000O00000, o0000O000O0OO, var9, f, g);
         } finally {
            o0000O00OO0O0.O00000000000OO();
         }
      }
   }

   private void O00000000(RenderManager o0000O00OO0O0, O0000O00000 o0000O00000, ColorScheme o0000O000O0OO, O00000OOO000O0 o00000OOO000O0) {
      O00000OOO000O0 var5 = this.O00000000(o00000OOO000O0, o0000O00000);
      o0000O00OO0O0.O00000000(
         var5.x(), var5.y(), var5.w(), var5.h(), o0000O00000.O00000000(8.0F), ColorScheme.O00000000(255, 255, 255, o0000O000O0OO.O000000000O000() ? 126 : 16)
      );
      o0000O00OO0O0.O00000000(
         var5.x(), var5.y(), var5.w(), var5.h(), o0000O00000.O00000000(8.0F), ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 82), 0.7F
      );
      String var6 = this.O0000000000000.isBlank() ? "Search" : this.O0000000000000;
      int var7 = this.O0000000000000.isBlank() ? o0000O000O0OO.O0000000000OOO() : o0000O000O0OO.O000000000O();
      O0000O00000OO.O00000000(
         o0000O00OO0O0, o0000O00000, FontRegistry.O00000000, var5.x() + o0000O00000.O00000000(12.0F), var5.y(), var5.h(), 10.0F, var6, var7
      );
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void O00000000(RenderManager o0000O00OO0O0, O0000O00000 o0000O00000, ColorScheme o0000O000O0OO, O00000OOO000O0 o00000OOO000O0, float f, float g) {
      O00000OOO000O0 var7 = this.O000000000(o00000OOO000O0, o0000O00000);
      List var8 = this.O00000000000();
      float var9 = o0000O00000.O00000000(42.0F);
      this.O000000000000O = -1;
      o0000O00OO0O0.O0000000000();
      o0000O00OO0O0.O00000000(
         var7.x(),
         var7.y(),
         var7.w(),
         var7.h(),
         o0000O00000.O00000000(8.0F),
         o0000O00000.O00000000(8.0F),
         o0000O00000.O00000000(8.0F),
         o0000O00000.O00000000(8.0F)
      );
      boolean var21 = false /* VF: Semaphore variable */;

      try {
         var21 = true;
         o0000O00OO0O0.O00000000(
            var7.x(), var7.y(), var7.w(), var7.h(), o0000O00000.O00000000(8.0F), ColorScheme.O00000000(255, 255, 255, o0000O000O0OO.O000000000O000() ? 82 : 10)
         );
         float var10 = this.O0000000000.O00000000();
         if (var8.isEmpty()) {
            String var11 = this.O00000000000.isEmpty() ? "No shared shaders" : "No matches";
            float var12 = O0000O00000OO.O00000000(o0000O00000, FontRegistry.O00000000, var11, 10.0F);
            O0000O00000OO.O00000000(
               o0000O00OO0O0,
               o0000O00000,
               FontRegistry.O00000000,
               var7.x() + (var7.w() - var12) * 0.5F,
               var7.y(),
               var7.h(),
               10.0F,
               var11,
               o0000O000O0OO.O0000000000OOO()
            );
         }

         for (int var23 = 0; var23 < var8.size(); var23++) {
            float var24 = var7.y() + var23 * var9 - var10;
            if (!(var24 > var7.y() + var7.h()) && !(var24 + var9 < var7.y())) {
               boolean var13 = f >= var7.x() && f < var7.x() + var7.w() && g >= var24 && g < var24 + var9;
               if (var13) {
                  this.O000000000000O = var23;
               }

               boolean var14 = var23 == this.O00000000000O;
               float var15 = var14 ? 1.0F : (var13 ? 0.62F : 0.0F);
               o0000O00OO0O0.O00000000(
                  var7.x() + o0000O00000.O00000000(6.0F),
                  var24 + o0000O00000.O00000000(4.0F),
                  var7.w() - o0000O00000.O00000000(12.0F),
                  var9 - o0000O00000.O00000000(8.0F),
                  o0000O00000.O00000000(7.0F),
                  ColorScheme.O00000000(
                     ColorScheme.O00000000(255, 255, 255, o0000O000O0OO.O000000000O000() ? 86 : 10),
                     ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 76),
                     var15
                  )
               );
               File var16 = (File)var8.get(var23);
               String var17 = this.O00000000(o0000O00000, var16.getName(), var7.w() - o0000O00000.O00000000(132.0F), 10.0F);
               String var18 = O00000000.format(new Date(var16.lastModified()));
               O0000O00000OO.O00000000(
                  o0000O00OO0O0,
                  o0000O00000,
                  FontRegistry.O00000000000,
                  var7.x() + o0000O00000.O00000000(18.0F),
                  var24 + o0000O00000.O00000000(10.0F),
                  10.0F,
                  var17,
                  o0000O000O0OO.O000000000O()
               );
               O0000O00000OO.O00000000(
                  o0000O00OO0O0,
                  o0000O00000,
                  FontRegistry.O00000000,
                  var7.x() + o0000O00000.O00000000(18.0F),
                  var24 + o0000O00000.O00000000(24.0F),
                  8.0F,
                  var18,
                  o0000O000O0OO.O0000000000OOO()
               );
            }
         }

         var21 = false;
      } finally {
         if (var21) {
            o0000O00OO0O0.O0000000000();
            o0000O00OO0O0.O0000000000000();
         }
      }

      o0000O00OO0O0.O0000000000();
      o0000O00OO0O0.O0000000000000();
   }

   private void O000000000(RenderManager o0000O00OO0O0, O0000O00000 o0000O00000, ColorScheme o0000O000O0OO, O00000OOO000O0 o00000OOO000O0, float f, float g) {
      this.O00000000(o0000O00OO0O0, o0000O00000, o0000O000O0OO, this.O00000000000(o00000OOO000O0, o0000O00000), "Cancel", f, g, false);
      this.O00000000(o0000O00OO0O0, o0000O00000, o0000O000O0OO, this.O0000000000(o00000OOO000O0, o0000O00000), "Open", f, g, true);
   }

   private void O00000000(
      RenderManager o0000O00OO0O0,
      O0000O00000 o0000O00000,
      ColorScheme o0000O000O0OO,
      O00000OOO000O0 o00000OOO000O0,
      String string,
      float f,
      float g,
      boolean bl
   ) {
      boolean var9 = o00000OOO000O0.contains(f, g);
      int var10 = ColorScheme.O00000000(
         ColorScheme.O00000000(255, 255, 255, o0000O000O0OO.O000000000O000() ? 92 : 18),
         ColorScheme.O00000000(bl ? o0000O000O0OO.O000000000O0() : o0000O000O0OO.O000000000O00(), 94),
         var9 ? 1.0F : 0.0F
      );
      o0000O00OO0O0.O00000000(o00000OOO000O0.x(), o00000OOO000O0.y(), o00000OOO000O0.w(), o00000OOO000O0.h(), o0000O00000.O00000000(8.0F), var10);
      o0000O00OO0O0.O00000000(
         o00000OOO000O0.x(),
         o00000OOO000O0.y(),
         o00000OOO000O0.w(),
         o00000OOO000O0.h(),
         o0000O00000.O00000000(8.0F),
         ColorScheme.O00000000(bl ? o0000O000O0OO.O000000000O0() : o0000O000O0OO.O000000000O00(), var9 ? 148 : 78),
         0.7F
      );
      float var11 = O0000O00000OO.O00000000(o0000O00000, FontRegistry.O00000000000, string, 10.0F);
      O0000O00000OO.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         FontRegistry.O00000000000,
         o00000OOO000O0.x() + (o00000OOO000O0.w() - var11) * 0.5F,
         o00000OOO000O0.y(),
         o00000OOO000O0.h(),
         10.0F,
         string,
         o0000O000O0OO.O000000000O()
      );
   }

   private List<File> O00000000000() {
      if (this.O0000000000000 != null && !this.O0000000000000.isBlank()) {
         String var1 = this.O0000000000000.toLowerCase(Locale.ROOT);
         ArrayList var2 = new ArrayList();

         for (File var4 : this.O00000000000) {
            if (var4.getName().toLowerCase(Locale.ROOT).contains(var1)) {
               var2.add(var4);
            }
         }

         if (this.O00000000000O >= var2.size()) {
            this.O00000000000O = var2.isEmpty() ? -1 : var2.size() - 1;
         }

         return var2;
      } else {
         return new ArrayList<>(this.O00000000000);
      }
   }

   private O00000OOO000O0 O00000000(O0000O00000 o0000O00000, int i, int j) {
      float var4 = Math.min(o0000O00000.O00000000(480.0F), i - o0000O00000.O00000000(48.0F));
      float var5 = Math.min(o0000O00000.O00000000(360.0F), j - o0000O00000.O00000000(64.0F));
      return new O00000OOO000O0((i - var4) * 0.5F, (j - var5) * 0.5F, var4, var5);
   }

   private O00000OOO000O0 O00000000(O00000OOO000O0 o00000OOO000O0, O0000O00000 o0000O00000) {
      return new O00000OOO000O0(
         o00000OOO000O0.x() + o0000O00000.O00000000(20.0F),
         o00000OOO000O0.y() + o0000O00000.O00000000(52.0F),
         o00000OOO000O0.w() - o0000O00000.O00000000(40.0F),
         o0000O00000.O00000000(34.0F)
      );
   }

   private O00000OOO000O0 O000000000(O00000OOO000O0 o00000OOO000O0, O0000O00000 o0000O00000) {
      return new O00000OOO000O0(
         o00000OOO000O0.x() + o0000O00000.O00000000(20.0F),
         o00000OOO000O0.y() + o0000O00000.O00000000(98.0F),
         o00000OOO000O0.w() - o0000O00000.O00000000(40.0F),
         o00000OOO000O0.h() - o0000O00000.O00000000(158.0F)
      );
   }

   private O00000OOO000O0 O0000000000(O00000OOO000O0 o00000OOO000O0, O0000O00000 o0000O00000) {
      return new O00000OOO000O0(
         o00000OOO000O0.x() + o00000OOO000O0.w() - o0000O00000.O00000000(112.0F),
         o00000OOO000O0.y() + o00000OOO000O0.h() - o0000O00000.O00000000(48.0F),
         o0000O00000.O00000000(92.0F),
         o0000O00000.O00000000(30.0F)
      );
   }

   private O00000OOO000O0 O00000000000(O00000OOO000O0 o00000OOO000O0, O0000O00000 o0000O00000) {
      return new O00000OOO000O0(
         o00000OOO000O0.x() + o00000OOO000O0.w() - o0000O00000.O00000000(214.0F),
         o00000OOO000O0.y() + o00000OOO000O0.h() - o0000O00000.O00000000(48.0F),
         o0000O00000.O00000000(92.0F),
         o0000O00000.O00000000(30.0F)
      );
   }

   private String O00000000(O0000O00000 o0000O00000, String string, float f, float g) {
      if (string == null) {
         return "";
      } else if (O0000O00000OO.O00000000(o0000O00000, FontRegistry.O00000000000, string, g) <= f) {
         return string;
      } else {
         String var5 = "...";
         String var6 = string;

         while (!var6.isEmpty() && O0000O00000OO.O00000000(o0000O00000, FontRegistry.O00000000000, var6 + var5, g) > f) {
            var6 = var6.substring(0, var6.length() - 1);
         }

         return var6.isEmpty() ? var5 : var6 + var5;
      }
   }

   private int O00000000(ColorScheme o0000O000O0OO, int i) {
      return o0000O000O0OO.O000000000O000() ? ColorScheme.O00000000(255, 255, 255, Math.min(255, i + 8)) : ColorScheme.O00000000(10, 12, 18, i);
   }
}
