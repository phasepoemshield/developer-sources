package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class O00000OOO00O {
   private static final float O00000000 = 16.0F;
   private static final int O000000000 = 40;
   private static final float O0000000000 = 22.0F;
   private static final float O00000000000 = 34.0F;
   private final O00000OOO0OOO O000000000000;
   private final O0000O00O0O0OO O0000000000000 = new O0000O00O0O0OO(
      O0000O00O0O000.O00000000(), O0000O00O0O0O0.O00000000(3.4F, 0.82F), 0.0F, 0.0F, 1.0F, 0.001F, 0.001F
   );
   private final O0000O000O00O O000000000000O = new O0000O000O00O(0.0F);
   private final Map<String, O0000O000O00O> O00000000000O = new HashMap<>();
   private final Map<String, Boolean> O00000000000O0 = new LinkedHashMap<>();
   private boolean O00000000000OO;
   private float O0000000000O;
   private float O0000000000O0;
   private String O0000000000O00 = "";
   private int O0000000000O0O;
   private float O0000000000OO;
   private float O0000000000OO0;
   private boolean O0000000000OOO;
   private long O000000000O;
   private O00000OOO0OO O000000000O0;
   private List<O00000OOO00O0.W300> O000000000O00 = new ArrayList<>();
   private List<O00000OOO0O00O> O000000000O000 = new ArrayList<>();

   public O00000OOO00O(O00000OOO0OOO o00000OOO0OOO) {
      this.O000000000000 = o00000OOO0OOO;
   }

   public boolean O00000000() {
      return this.O00000000000OO;
   }

   public O00000OOO0OO O000000000() {
      return this.O000000000O0;
   }

   public float O0000000000() {
      return this.O0000000000O;
   }

   public float O00000000000() {
      return this.O0000000000O0;
   }

   public void O00000000(float f, float g, O00000OOO0OO o00000OOO0OO) {
      this.O00000000000OO = true;
      this.O0000000000O = f;
      this.O0000000000O0 = g;
      this.O0000000000O00 = "";
      this.O0000000000O0O = 0;
      this.O0000000000OO = 0.0F;
      this.O000000000000O.O00000000(0.0F);
      this.O000000000O = System.currentTimeMillis();
      this.O000000000O0 = o00000OOO0OO;
      this.O0000000000000.O0000000000(1.0F);
      this.O00000000000OO();
   }

   public void O000000000000() {
      this.O00000000000OO = false;
      this.O000000000O0 = null;
      this.O0000000000000.O0000000000(0.0F);
   }

   public void O00000000(char c) {
      if (this.O00000000000OO) {
         if ((c >= '0' && c <= '9' || c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c == ' ' || c == '_' || c == '.' || c == '-')
            && this.O0000000000O00.length() < 40) {
            this.O0000000000O00 = this.O0000000000O00 + c;
            this.O0000000000O0O = 0;
            this.O0000000000OO = 0.0F;
            this.O000000000O = System.currentTimeMillis();
            this.O00000000000OO();
         }
      }
   }

   public void O0000000000000() {
      if (this.O00000000000OO && !this.O0000000000O00.isEmpty()) {
         this.O0000000000O00 = this.O0000000000O00.substring(0, this.O0000000000O00.length() - 1);
         this.O0000000000O0O = 0;
         this.O0000000000OO = 0.0F;
         this.O000000000O = System.currentTimeMillis();
         this.O00000000000OO();
      }
   }

   public void O000000000000O() {
      if (this.O00000000000OO) {
         this.O0000000000O00 = "";
         this.O0000000000O0O = 0;
         this.O0000000000OO = 0.0F;
         this.O000000000O = System.currentTimeMillis();
         this.O00000000000OO();
      }
   }

   public void O00000000(int i) {
      if (this.O00000000000OO && !this.O000000000O000.isEmpty() && i != 0) {
         int var2 = i < 0 ? -1 : 1;
         int var3 = Math.floorMod(this.O0000000000O0O + i, this.O000000000O000.size());
         if (this.O0000000000O00.isBlank()) {
            for (int var4 = 0; var4 < this.O000000000O000.size() && this.O000000000(this.O000000000O000.get(var3).O0000000000()); var4++) {
               var3 = Math.floorMod(var3 + var2, this.O000000000O000.size());
            }

            if (this.O000000000(this.O000000000O000.get(var3).O0000000000())) {
               return;
            }
         }

         this.O0000000000O0O = var3;
         this.O0000000000OOO = true;
      }
   }

   public O00000OOO0O00O O00000000000O() {
      return this.O000000000O000.isEmpty() ? null : this.O000000000O000.get(Math.min(this.O0000000000O0O, this.O000000000O000.size() - 1));
   }

   public List<O00000OOO0O00O> O00000000000O0() {
      return this.O000000000O000;
   }

   public void O00000000(double d) {
      if (this.O00000000000OO) {
         this.O0000000000OO = Math.max(0.0F, Math.min(this.O0000000000OO - (float)d * 28.0F, Math.max(0.0F, this.O0000000000OO0)));
      }
   }

   public void O00000000(String string) {
      if (string != null) {
         boolean var2 = !this.O00000000000O0.getOrDefault(string, false);
         this.O00000000000O0.put(string, var2);
         if (var2 && this.O0000000000O00.isBlank() && !this.O000000000O000.isEmpty()) {
            O00000OOO0O00O var3 = this.O000000000O000.get(Math.min(this.O0000000000O0O, this.O000000000O000.size() - 1));
            if (string.equals(var3.O0000000000())) {
               this.O00000000(1);
            }
         }
      }
   }

   public boolean O000000000(String string) {
      return this.O00000000000O0.getOrDefault(string, false);
   }

   public O00000OOO000O0 O00000000(O0000O00000 o0000O00000, int i, int j) {
      float var4 = Math.min(o0000O00000.O00000000(520.0F), i - o0000O00000.O00000000(64.0F));
      float var5 = Math.max(o0000O00000.O00000000(28.0F), j * 0.14F);
      float var6 = Math.min(o0000O00000.O00000000(500.0F), j - var5 - o0000O00000.O00000000(28.0F));
      float var7 = (i - var4) * 0.5F;
      return new O00000OOO000O0(var7, var5, var4, var6);
   }

   public O00000OOO000O0 O000000000(O0000O00000 o0000O00000, int i, int j) {
      O00000OOO000O0 var4 = this.O00000000(o0000O00000, i, j);
      return new O00000OOO000O0(
         var4.x() + o0000O00000.O00000000(16.0F),
         var4.y() + o0000O00000.O00000000(16.0F),
         var4.w() - o0000O00000.O00000000(32.0F),
         o0000O00000.O00000000(46.0F)
      );
   }

   public O00000OOO0O00O O00000000(O0000O00000 o0000O00000, int i, int j, float f, float g) {
      O00000OOO00O.W299 var6 = this.O0000000000(o0000O00000, i, j, f, g);
      return var6 == null ? null : var6.definition;
   }

   public String O000000000(O0000O00000 o0000O00000, int i, int j, float f, float g) {
      if (this.O00000000000OO && this.O0000000000O00.isBlank()) {
         O00000OOO00O.W299 var6 = this.O0000000000(o0000O00000, i, j, f, g);
         return var6 == null ? null : var6.category;
      } else {
         return null;
      }
   }

   private O00000OOO00O.W299 O0000000000(O0000O00000 o0000O00000, int i, int j, float f, float g) {
      if (!this.O00000000000OO) {
         return null;
      } else {
         O00000OOO000O0 var6 = this.O00000000(o0000O00000, i, j);
         float var7 = this.O00000000(o0000O00000, var6);
         float var8 = this.O000000000(o0000O00000, var6);
         if (!(f < var6.x()) && !(f > var6.x() + var6.w()) && !(g < var7) && !(g > var8)) {
            float var9 = var7 - this.O000000000000O.O000000000();
            String var10 = "";
            boolean var11 = !this.O0000000000O00.isBlank();

            for (O00000OOO00O0.W300 var13 : this.O000000000O00) {
               O00000OOO0O00O var14 = var13.def();
               if (!var11 && !var14.O0000000000().equals(var10)) {
                  var10 = var14.O0000000000();
                  if (g >= var9 && g < var9 + o0000O00000.O00000000(22.0F)) {
                     return new O00000OOO00O.W299(null, var10);
                  }

                  var9 += o0000O00000.O00000000(22.0F);
                  if (this.O000000000(var10)) {
                     continue;
                  }
               } else if (!var11 && this.O000000000(var14.O0000000000())) {
                  continue;
               }

               float var15 = o0000O00000.O00000000(34.0F);
               if (g >= var9 && g < var9 + var15) {
                  return new O00000OOO00O.W299(var14, null);
               }

               var9 += var15;
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

   private float O00000000(O0000O00000 o0000O00000, O00000OOO000O0 o00000OOO000O0) {
      return o00000OOO000O0.y() + o0000O00000.O00000000(76.0F);
   }

   private float O000000000(O0000O00000 o0000O00000, O00000OOO000O0 o00000OOO000O0) {
      return o00000OOO000O0.y() + o00000OOO000O0.h() - o0000O00000.O00000000(34.0F);
   }

   private void O00000000000OO() {
      String var1 = this.O0000000000O00 == null ? "" : this.O0000000000O00.toLowerCase(Locale.ROOT).trim();
      ArrayList var2 = new ArrayList<>(this.O000000000000.O00000000());
      if (this.O000000000O0 != null) {
         ArrayList var3 = new ArrayList();

         for (O00000OOO0O00O var5 : (List<O00000OOO0O00O>)var2) {
            for (O00000OOO0O0OO var7 : var5.O000000000000()) {
               if (var7.type() == this.O000000000O0) {
                  var3.add(var5);
                  break;
               }
            }
         }

         var2 = var3;
      }

      ArrayList var8 = new ArrayList();
      if (var1.isEmpty()) {
         ((List<O00000OOO0O00O>)var2).sort(Comparator.comparing(O00000OOO0O00O::O0000000000).thenComparing(Comparator.comparing(O00000OOO0O00O::O000000000)));

         for (O00000OOO0O00O var12 : (List<O00000OOO0O00O>)var2) {
            var8.add(new O00000OOO00O0.W300(var12, 0, new int[0]));
         }
      } else {
         for (O00000OOO0O00O var13 : (List<O00000OOO0O00O>)var2) {
            O00000OOO00O0.W300 var15 = O00000OOO00O0.O00000000(var13, var1);
            if (var15 != null) {
               var8.add(var15);
            }
         }

         var8.sort(Comparator.<O00000OOO00O0.W300>comparingInt(o00000000 -> -o00000000.score()).thenComparing(o00000000 -> o00000000.def().O000000000()));
      }

      this.O000000000O00 = var8;
      ArrayList var11 = new ArrayList(var8.size());

      for (O00000OOO00O0.W300 var16 : (List<O00000OOO00O0.W300>)var8) {
         var11.add(var16.def());
      }

      this.O000000000O000 = var11;
      if (this.O0000000000O0O >= this.O000000000O000.size()) {
         this.O0000000000O0O = Math.max(0, this.O000000000O000.size() - 1);
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void O00000000(RenderManager o0000O00OO0O0, O0000O000O0OOO o0000O000O0OOO, O0000O000O0O0 o0000O000O0O0, int i, int j) {
      float var6 = this.O0000000000000.O00000000();
      if (!(var6 <= 0.004F)) {
         O0000O00000 var7 = o0000O000O0OOO.O000000000000();
         ColorScheme var8 = o0000O000O0OOO.O0000000000000();
         boolean var9 = var8.O000000000O000();
         O00000OOO000O0 var10 = this.O00000000(var7, i, j);
         float var11 = this.O000000000000O
            .O00000000(Math.max(0.0F, Math.min(this.O0000000000OO, Math.max(0.0F, this.O0000000000OO0))), O0000O000O0O00.O000000000000O());
         o0000O00OO0O0.O00000000(16.0F);
         o0000O00OO0O0.O00000000(0.0F, 0.0F, (float)i, (float)j, 0.0F, var6);
         o0000O00OO0O0.O00000000(
            0.0F,
            0.0F,
            (float)i,
            (float)j,
            0.0F,
            var9 ? ColorScheme.O00000000(236, 239, 246, Math.round(96.0F * var6)) : ColorScheme.O00000000(3, 5, 9, Math.round(150.0F * var6))
         );
         float var12 = var10.x() + var10.w() * 0.5F;
         float var13 = var10.y() + var10.h() * 0.42F;
         o0000O00OO0O0.O00000000(0.92F + 0.08F * var6, var12, var13);
         o0000O00OO0O0.O000000000000(var6);
         boolean var17 = false /* VF: Semaphore variable */;

         try {
            var17 = true;
            float var14 = var7.O00000000(18.0F);
            o0000O00OO0O0.O00000000(
               var10.x(),
               var10.y(),
               var10.w(),
               var10.h(),
               var14,
               var7.O00000000(36.0F),
               var7.O00000000(2.0F),
               var9 ? ColorScheme.O00000000(24, 32, 48, 44) : ColorScheme.O00000000(0, 0, 0, 196)
            );
            o0000O00OO0O0.O00000000(
               var10.x(), var10.y(), var10.w(), var10.h(), var14, var9 ? ColorScheme.O00000000(250, 251, 254, 246) : ColorScheme.O00000000(9, 11, 17, 244)
            );
            o0000O00OO0O0.O00000000(var10.x(), var10.y(), var10.w(), var10.h(), var14, ColorScheme.O00000000(var8.O000000000O0(), 96), 0.9F);
            o0000O00OO0O0.O00000000(
               var10.x() + var14,
               var10.y(),
               var10.w() - var14 * 2.0F,
               1.2F,
               ColorScheme.O00000000(var8.O000000000O0(), 0),
               ColorScheme.O00000000(var8.O000000000O0(), 170)
            );
            this.O00000000(o0000O00OO0O0, var7, var8, var9, var10);
            this.O00000000(o0000O00OO0O0, var7, var8, o0000O000O0O0, var10, var11, var9);
            this.O00000000(o0000O00OO0O0, var7, var8, var10);
            var17 = false;
         } finally {
            if (var17) {
               o0000O00OO0O0.O00000000000OO();
               o0000O00OO0O0.O00000000000O0();
            }
         }

         o0000O00OO0O0.O00000000000OO();
         o0000O00OO0O0.O00000000000O0();
      }
   }

   private void O00000000(RenderManager o0000O00OO0O0, O0000O00000 o0000O00000, ColorScheme o0000O000O0OO, boolean bl, O00000OOO000O0 o00000OOO000O0) {
      O00000OOO000O0 var6 = new O00000OOO000O0(
         o00000OOO000O0.x() + o0000O00000.O00000000(16.0F),
         o00000OOO000O0.y() + o0000O00000.O00000000(16.0F),
         o00000OOO000O0.w() - o0000O00000.O00000000(32.0F),
         o0000O00000.O00000000(46.0F)
      );
      float var7 = o0000O00000.O00000000(11.0F);
      o0000O00OO0O0.O00000000(
         var6.x(), var6.y(), var6.w(), var6.h(), var7, o0000O00000.O00000000(18.0F), 0.0F, ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 64)
      );
      o0000O00OO0O0.O00000000(
         var6.x(), var6.y(), var6.w(), var6.h(), var7, bl ? ColorScheme.O00000000(255, 255, 255, 244) : ColorScheme.O00000000(14, 16, 24, 240)
      );
      o0000O00OO0O0.O00000000(var6.x(), var6.y(), var6.w(), var6.h(), var7, ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 188), 1.1F);
      float var8 = var6.x() + o0000O00000.O00000000(19.0F);
      float var9 = var6.y() + var6.h() * 0.5F - o0000O00000.O00000000(1.0F);
      o0000O00OO0O0.O00000000(var8, var9, o0000O00000.O00000000(4.4F), 0.0F, 1.0F, 1.4F, ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 230));
      o0000O00OO0O0.O00000000(
         var8 + o0000O00000.O00000000(3.2F),
         var9 + o0000O00000.O00000000(3.2F),
         o0000O00000.O00000000(5.4F),
         1.4F,
         0.7F,
         ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 230)
      );
      float var10 = var6.x() + o0000O00000.O00000000(34.0F);
      float var11 = var6.y() + (var6.h() - o0000O00000.O00000000(15.0F)) * 0.5F;
      String var12 = this.O0000000000O00.isBlank() ? "Search nodes…" : this.O0000000000O00;
      int var13 = this.O0000000000O00.isBlank() ? o0000O000O0OO.O0000000000OOO() : o0000O000O0OO.O000000000O();
      O0000O00000OO.O00000000(o0000O00OO0O0, o0000O00000, FontRegistry.O00000000, var10, var11, 12.0F, var12, var13);
      boolean var14 = (System.currentTimeMillis() - this.O000000000O) / 500L % 2L == 0L;
      if (var14) {
         float var15 = var10
            + (this.O0000000000O00.isBlank() ? 0.0F : O0000O00000OO.O00000000(o0000O00000, FontRegistry.O00000000, this.O0000000000O00, 12.0F) + 1.5F);
         o0000O00OO0O0.O00000000(
            var15,
            var6.y() + o0000O00000.O00000000(11.0F),
            1.2F,
            var6.h() - o0000O00000.O00000000(22.0F),
            0.0F,
            ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 240)
         );
      }

      if (this.O000000000O0 != null) {
         int var20 = ShaderEffectManager.W320.O000000000(this.O000000000O0);
         String var16 = "Connect → " + this.O000000000O0.O00000000();
         float var17 = O0000O00000OO.O00000000(o0000O00000, FontRegistry.O00000000, var16, 9.0F) + o0000O00000.O00000000(22.0F);
         float var18 = var6.x() + var6.w() - var17 - o0000O00000.O00000000(10.0F);
         float var19 = var6.y() + (var6.h() - o0000O00000.O00000000(20.0F)) * 0.5F;
         o0000O00OO0O0.O00000000(var18, var19, var17, o0000O00000.O00000000(20.0F), o0000O00000.O00000000(10.0F), ColorScheme.O00000000(var20, 46));
         o0000O00OO0O0.O000000000(var18 + o0000O00000.O00000000(9.0F), var19 + o0000O00000.O00000000(10.0F), o0000O00000.O00000000(2.6F), 0.0F, 1.0F, var20);
         O0000O00000OO.O00000000(
            o0000O00OO0O0,
            o0000O00000,
            FontRegistry.O00000000,
            var18 + o0000O00000.O00000000(16.0F),
            var19 + o0000O00000.O00000000(5.5F),
            9.0F,
            var16,
            ColorScheme.O00000000(var20, 245)
         );
      }
   }

   private void O00000000(
      RenderManager o0000O00OO0O0,
      O0000O00000 o0000O00000,
      ColorScheme o0000O000O0OO,
      O0000O000O0O0 o0000O000O0O0,
      O00000OOO000O0 o00000OOO000O0,
      float f,
      boolean bl
   ) {
      float var8 = this.O00000000(o0000O00000, o00000OOO000O0);
      float var9 = this.O000000000(o0000O00000, o00000OOO000O0);
      float var10 = o00000OOO000O0.x() + o0000O00000.O00000000(10.0F);
      float var11 = o00000OOO000O0.w() - o0000O00000.O00000000(20.0F);
      o0000O00OO0O0.O0000000000();
      o0000O00OO0O0.O00000000(
         var10, var8, var11, var9 - var8, o0000O00000.O00000000(8.0F), o0000O00000.O00000000(8.0F), o0000O00000.O00000000(8.0F), o0000O00000.O00000000(8.0F)
      );

      try {
         float var12 = var8 - f;
         float var13 = 0.0F;
         float var14 = -1.0F;
         String var15 = "";
         int var16 = 0;
         boolean var17 = !this.O0000000000O00.isBlank();
         String var18 = this.O0000000000O00.toLowerCase(Locale.ROOT).trim();

         for (O00000OOO00O0.W300 var20 : this.O000000000O00) {
            O00000OOO0O00O var21 = var20.def();
            if (!var17 && !var21.O0000000000().equals(var15)) {
               var15 = var21.O0000000000();
               boolean var22 = this.O000000000(var15);
               if (var12 + o0000O00000.O00000000(22.0F) > var8 && var12 < var9) {
                  O0000O00000OO.O00000000(
                     o0000O00OO0O0,
                     o0000O00000,
                     FontRegistry.O00000000000,
                     var10 + o0000O00000.O00000000(12.0F),
                     var12 + o0000O00000.O00000000(7.0F),
                     9.0F,
                     (var22 ? "▸ " : "▾ ") + var15.toUpperCase(Locale.ROOT),
                     ColorScheme.O00000000(o0000O000O0OO.O000000000O00(), 215)
                  );
               }

               var12 += o0000O00000.O00000000(22.0F);
               var13 += o0000O00000.O00000000(22.0F);
               if (var22) {
                  var16++;
                  continue;
               }
            } else if (!var17 && this.O000000000(var21.O0000000000())) {
               var16++;
               continue;
            }

            float var31 = o0000O00000.O00000000(34.0F);
            if (var16 == this.O0000000000O0O) {
               var14 = var13;
            }

            if (var12 + var31 > var8 && var12 < var9) {
               this.O00000000(
                  o0000O00OO0O0, o0000O00000, o0000O000O0OO, o0000O000O0O0, var21, var20, var18, var10, var12, var11, var31, var16 == this.O0000000000O0O, bl
               );
            }

            var12 += var31;
            var13 += var31;
            var16++;
         }

         this.O0000000000OO0 = Math.max(0.0F, var13 - (var9 - var8));
         if (this.O0000000000OOO && var14 >= 0.0F) {
            float var29 = var9 - var8;
            float var30 = o0000O00000.O00000000(34.0F);
            if (var14 < this.O0000000000OO) {
               this.O0000000000OO = Math.max(0.0F, var14 - o0000O00000.O00000000(22.0F));
            } else if (var14 + var30 > this.O0000000000OO + var29) {
               this.O0000000000OO = Math.min(this.O0000000000OO0, var14 + var30 - var29 + o0000O00000.O00000000(6.0F));
            }

            this.O0000000000OOO = false;
         }

         if (this.O000000000O00.isEmpty()) {
            O0000O00000OO.O00000000(
               o0000O00OO0O0,
               o0000O00000,
               FontRegistry.O00000000,
               var10 + o0000O00000.O00000000(14.0F),
               var8 + o0000O00000.O00000000(18.0F),
               11.0F,
               "no matching nodes",
               o0000O000O0OO.O0000000000OOO()
            );
         }
      } finally {
         o0000O00OO0O0.O0000000000();
         o0000O00OO0O0.O0000000000000();
      }

      if (this.O0000000000OO0 > 0.0F) {
         float var26 = var9 - var8;
         float var27 = Math.max(o0000O00000.O00000000(26.0F), var26 * var26 / (var26 + this.O0000000000OO0));
         float var28 = var8 + (var26 - var27) * (this.O0000000000OO0 <= 0.0F ? 0.0F : Math.min(1.0F, f / this.O0000000000OO0));
         o0000O00OO0O0.O00000000(
            o00000OOO000O0.x() + o00000OOO000O0.w() - o0000O00000.O00000000(6.0F),
            var28,
            o0000O00000.O00000000(2.4F),
            var27,
            o0000O00000.O00000000(1.2F),
            ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 130)
         );
      }
   }

   private void O00000000(
      RenderManager o0000O00OO0O0,
      O0000O00000 o0000O00000,
      ColorScheme o0000O000O0OO,
      O0000O000O0O0 o0000O000O0O0,
      O00000OOO0O00O o00000OOO0O00O,
      O00000OOO00O0.W300 o00000000,
      String string,
      float f,
      float g,
      float h,
      float i,
      boolean bl,
      boolean bl2
   ) {
      boolean var14 = o0000O000O0O0 != null
         && o0000O000O0O0.O0000000O() >= f
         && o0000O000O0O0.O0000000O() <= f + h
         && o0000O000O0O0.O0000000O0() >= g
         && o0000O000O0O0.O0000000O0() < g + i;
      O0000O000O00O var15 = this.O00000000000O.computeIfAbsent(o00000OOO0O00O.O00000000(), stringx -> new O0000O000O00O(0.0F));
      float var16 = var15.O00000000(Math.max(var14 ? 0.72F : 0.0F, bl ? 1.0F : 0.0F), O0000O000O0O00.O0000000000O());
      o0000O00OO0O0.O00000000(
         f + o0000O00000.O00000000(4.0F),
         g + o0000O00000.O00000000(1.5F),
         h - o0000O00000.O00000000(8.0F),
         i - o0000O00000.O00000000(3.0F),
         o0000O00000.O00000000(8.0F),
         ColorScheme.O00000000(
            bl2 ? ColorScheme.O00000000(10, 14, 22, 5) : ColorScheme.O00000000(255, 255, 255, 5),
            ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 62),
            var16
         )
      );
      if (bl) {
         o0000O00OO0O0.O00000000(
            f + o0000O00000.O00000000(4.0F),
            g + o0000O00000.O00000000(7.0F),
            o0000O00000.O00000000(2.4F),
            i - o0000O00000.O00000000(14.0F),
            o0000O00000.O00000000(1.2F),
            ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 235)
         );
      }

      int var17 = o00000OOO0O00O.O0000000000000().isEmpty()
         ? o0000O000O0OO.O0000000000OO0()
         : ShaderEffectManager.W320.O000000000(o00000OOO0O00O.O0000000000000().get(0).type());
      float var18 = f + o0000O00000.O00000000(18.0F);
      float var19 = g + i * 0.5F;
      o0000O00OO0O0.O000000000(var18, var19, o0000O00000.O00000000(3.4F) + var16 * o0000O00000.O00000000(0.8F), 0.0F, 1.0F, ColorScheme.O00000000(var17, 235));
      o0000O00OO0O0.O000000000(
         var18, var19, o0000O00000.O00000000(1.4F), 0.0F, 1.0F, bl2 ? ColorScheme.O00000000(255, 255, 255, 235) : ColorScheme.O00000000(9, 11, 17, 235)
      );
      int var20 = ColorScheme.O00000000(o0000O000O0OO.O0000000000OOO(), o0000O000O0OO.O000000000O(), 0.62F + var16 * 0.38F);
      this.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         o0000O000O0OO,
         o00000OOO0O00O.O000000000(),
         o00000000.titlePositions(),
         string,
         f + o0000O00000.O00000000(32.0F),
         g + o0000O00000.O00000000(7.0F),
         11.0F,
         var20
      );
      O0000O00000OO.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         FontRegistry.O00000000,
         f + o0000O00000.O00000000(32.0F),
         g + o0000O00000.O00000000(20.0F),
         7.5F,
         o00000OOO0O00O.O0000000000(),
         ColorScheme.O00000000(o0000O000O0OO.O0000000000OOO(), 200)
      );
      float var21 = f + h - o0000O00000.O00000000(14.0F);
      int var22 = Math.min(o00000OOO0O00O.O000000000000().size(), 4);

      for (int var23 = var22 - 1; var23 >= 0; var23--) {
         int var24 = ShaderEffectManager.W320.O000000000(o00000OOO0O00O.O000000000000().get(var23).type());
         o0000O00OO0O0.O000000000(var21, var19, o0000O00000.O00000000(2.2F), 0.0F, 1.0F, ColorScheme.O00000000(var24, 225));
         var21 -= o0000O00000.O00000000(7.0F);
      }

      String var25 = o00000OOO0O00O.O0000000000000().isEmpty() ? "sink" : o00000OOO0O00O.O0000000000000().get(0).type().O00000000();
      float var26 = O0000O00000OO.O00000000(o0000O00000, FontRegistry.O00000000, var25, 8.0F);
      O0000O00000OO.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         FontRegistry.O00000000,
         var21 - var26 - o0000O00000.O00000000(8.0F),
         g + o0000O00000.O00000000(11.0F),
         8.0F,
         var25,
         ColorScheme.O00000000(var17, 240)
      );
   }

   private void O00000000(
      RenderManager o0000O00OO0O0,
      O0000O00000 o0000O00000,
      ColorScheme o0000O000O0OO,
      String string,
      int[] is,
      String string2,
      float f,
      float g,
      float h,
      int i
   ) {
      if (is != null && is.length != 0 && !string2.isEmpty()) {
         int var11 = ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 250);
         float var12 = f;
         int var13 = 0;
         int var14 = 0;

         while (var13 < string.length()) {
            boolean var15 = var14 < is.length && is[var14] == var13;
            int var16 = var13;
            if (var15) {
               while (var14 < is.length && is[var14] == var16) {
                  var14++;
                  var16++;
               }
            } else {
               int var17 = var14 < is.length ? is[var14] : string.length();
               var16 = Math.max(var13 + 1, var17);
            }

            var16 = Math.min(var16, string.length());
            String var19 = string.substring(var13, var16);
            O0000O00000OO.O00000000(o0000O00OO0O0, o0000O00000, FontRegistry.O00000000000, var12, g, h, var19, var15 ? var11 : i);
            var12 += O0000O00000OO.O00000000(o0000O00000, FontRegistry.O00000000000, var19, h);
            var13 = var16;
         }
      } else {
         O0000O00000OO.O00000000(o0000O00OO0O0, o0000O00000, FontRegistry.O00000000000, f, g, h, string, i);
      }
   }

   private void O00000000(RenderManager o0000O00OO0O0, O0000O00000 o0000O00000, ColorScheme o0000O000O0OO, O00000OOO000O0 o00000OOO000O0) {
      O0000O00000OO.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         FontRegistry.O00000000,
         o00000OOO000O0.x() + o0000O00000.O00000000(16.0F),
         o00000OOO000O0.y() + o00000OOO000O0.h() - o0000O00000.O00000000(24.0F),
         8.0F,
         "↑↓ navigate • Enter spawn • LMB on category to toggle • Esc close",
         ColorScheme.O00000000(o0000O000O0OO.O000000000O(), 150)
      );
      String var5 = this.O000000000O000.size() + (this.O000000000O000.size() == 1 ? " node" : " nodes");
      float var6 = O0000O00000OO.O00000000(o0000O00000, FontRegistry.O00000000, var5, 8.0F);
      O0000O00000OO.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         FontRegistry.O00000000,
         o00000OOO000O0.x() + o00000OOO000O0.w() - var6 - o0000O00000.O00000000(16.0F),
         o00000OOO000O0.y() + o00000OOO000O0.h() - o0000O00000.O00000000(24.0F),
         8.0F,
         var5,
         ColorScheme.O00000000(o0000O000O0OO.O000000000O00(), 210)
      );
   }

   record W299(O00000OOO0O00O definition, String category) {
   }
}
