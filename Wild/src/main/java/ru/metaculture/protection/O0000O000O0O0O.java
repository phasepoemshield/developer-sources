package ru.metaculture.protection;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;

public final class O0000O000O0O0O {
   private O0000O00000 O00000000;
   private float O000000000;
   private float O0000000000;
   private float O00000000000;
   private float O000000000000;
   private O00000O0OOOO O0000000000000 = O00000O0OOOO.MODELS;
   private float O000000000000O;
   private float O00000000000O;
   private float O00000000000O0 = 200.0F;
   private float O00000000000OO = -8.0F;
   private float O0000000000O = 1.0F;
   private boolean O0000000000O0;
   private float O0000000000O00;
   private float O0000000000O0O;
   private String O0000000000OO = "";
   private boolean O0000000000OO0;
   private boolean O0000000000OOO;
   private final ArrayList<Long> O000000000O = new ArrayList<>();
   private final ArrayList<O0000O000O0O0O.W346> O000000000O0 = new ArrayList<>();
   private static final float O000000000O00 = 170.0F;
   private boolean O000000000O000;
   private String O000000000O00O = "";
   private boolean O000000000O0O;
   private String O000000000O0O0 = "";
   private boolean O000000000O0OO;
   private long O000000000OO;
   private String O000000000OO0 = "";
   private float O000000000OO00;
   private float O000000000OO0O = 1.0F;
   private int O000000000OOO = 1;
   private float O000000000OOO0;
   private float O000000000OOOO;
   private boolean O00000000O;
   private long O00000000O0;
   private long O00000000O00;
   private final HashMap<String, Long> O00000000O000 = new HashMap<>();
   private static final String[] O00000000O0000 = new String[]{"chip0", "chip1", "chip2", "chip3"};
   private String O00000000O000O = "";
   private long O00000000O00O;

   public boolean O00000000(O0000O000O0O0 o0000O000O0O0) {
      return o0000O000O0O0 != null && o0000O000O0O0.O00000000OO000();
   }

   public boolean O000000000(O0000O000O0O0 o0000O000O0O0) {
      return o0000O000O0O0 != null && o0000O000O0O0.O00000000OO000();
   }

   public boolean O00000000() {
      return this.O0000000000OO0 || this.O000000000O000 || this.O000000000O0O;
   }

   public void O000000000() {
      this.O0000000000O0 = false;
      this.O0000000000OO0 = false;
      this.O0000000000OOO = false;
      this.O000000000O000 = false;
      this.O000000000O0O = false;
      this.O000000000O0OO = false;
   }

   public void O00000000(RenderManager o0000O00OO0O0, O0000O000O0O0 o0000O000O0O0, O0000O000O0OOO o0000O000O0OOO, float f, float g, float h, float i) {
      if (o0000O00OO0O0 != null && o0000O000O0O0 != null && o0000O000O0OOO != null && !(h <= 0.0F) && !(i <= 0.0F)) {
         O0000O00000 var8 = o0000O000O0OOO.O000000000000();
         ColorScheme var9 = o0000O000O0OOO.O0000000000000();
         this.O00000000 = var8;
         this.O000000000 = f;
         this.O0000000000 = g;
         this.O00000000000 = h;
         this.O000000000000 = i;
         this.O000000000000O = this.O000000000000O + (this.O00000000000O - this.O000000000000O) * 0.32F;
         this.O000000000OO00 = this.O000000000OO00 + ((this.O000000000OO0.isEmpty() ? 0.0F : 1.0F) - this.O000000000OO00) * 0.3F;
         this.O000000000OO0O = this.O000000000OO0O + (1.0F - this.O000000000OO0O) * 0.18F;
         if (this.O000000000OO0O > 0.999F) {
            this.O000000000OO0O = 1.0F;
         }

         long var10 = System.currentTimeMillis();
         if (var10 - this.O00000000O00 > 240L) {
            this.O00000000O0 = var10;
         }

         this.O00000000O00 = var10;
         float var12 = Math.min(1.0F, (float)(var10 - this.O00000000O0) / 360.0F);
         float var13 = 1.0F - (1.0F - var12) * (1.0F - var12) * (1.0F - var12);
         O0000O000O0O0O.W347 var14 = new O0000O000O0O0O.W347(f, g, h, i);
         boolean var15 = var13 < 0.999F;
         if (var15) {
            o0000O00OO0O0.O000000000000(Math.max(0.0F, var13));
         }

         try {
            this.O00000000(o0000O00OO0O0, o0000O000O0O0, var8, var9, var14, 1.0F);
            this.O000000000(o0000O00OO0O0, o0000O000O0O0, var8, var9, var14, 1.0F);
            this.O00000000(o0000O00OO0O0, o0000O000O0O0, o0000O000O0OOO, var8, var9, var14, 1.0F);
            this.O000000000(o0000O00OO0O0, o0000O000O0O0, o0000O000O0OOO, var8, var9, var14, 1.0F);
         } finally {
            if (var15) {
               o0000O00OO0O0.O00000000000OO();
            }
         }
      }
   }

   private void O00000000(
      RenderManager o0000O00OO0O0, O0000O000O0O0 o0000O000O0O0, O0000O00000 o0000O00000, ColorScheme o0000O000O0OO, O0000O000O0O0O.W347 o000000000, float f
   ) {
      float var7 = o0000O00000.O00000000(18.0F);
      float var8 = o0000O00000.O00000000(44.0F);
      float var9 = o0000O00000.O00000000(18.0F);
      O0000O00000OO.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         FontRegistry.O00000000000O,
         o000000000.x + var7,
         o000000000.y,
         var8,
         13.0F,
         "a",
         ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), Math.round(255.0F * f))
      );
      O0000O00000OO.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         FontRegistry.O00000000000,
         o000000000.x + var7 + var9,
         o000000000.y,
         var8,
         15.0F,
         "Studio",
         ColorScheme.O00000000(O0000O00000OO.O00000000(o0000O000O0OO), Math.round(255.0F * f))
      );
      O0000O000O0O0O.W347 var10 = this.O00000000(o0000O00000, o000000000);
      boolean var11 = O0000O00000OO.O00000000(o0000O000O0O0, var10.x, var10.y, var10.w, var10.h);
      o0000O00OO0O0.O00000000(
         var10.x,
         var10.y,
         var10.w,
         var10.h,
         var10.h * 0.5F,
         ColorScheme.O00000000(this.O0000000000OO0 ? o0000O000O0OO.O0000000000O() : o0000O000O0OO.O00000000000O0(), Math.round(255.0F * f))
      );
      if (this.O0000000000OO0 || var11) {
         o0000O00OO0O0.O00000000(
            var10.x,
            var10.y,
            var10.w,
            var10.h,
            var10.h * 0.5F,
            ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), Math.round((this.O0000000000OO0 ? 150 : 80) * f)),
            0.7F
         );
      }

      O0000O00000OO.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         FontRegistry.O000000000000,
         var10.x + o0000O00000.O00000000(10.0F),
         var10.y,
         var10.h,
         10.0F,
         "m",
         ColorScheme.O00000000(O0000O00000OO.O000000000(o0000O000O0OO), Math.round(200.0F * f))
      );
      float var12 = this.O0000000000OO0 ? (float)((Math.sin(System.currentTimeMillis() * 0.006) + 1.0) * 0.5) : 0.0F;
      long var13 = System.currentTimeMillis();
      o0000O00OO0O0.O00000000((int)(var10.x + o0000O00000.O00000000(26.0F)), (int)var10.y, (int)(var10.w - o0000O00000.O00000000(34.0F)), (int)var10.h);
      if (this.O0000000000OO.isEmpty() && !this.O0000000000OO0) {
         O0000O00000OO.O00000000(
            o0000O00OO0O0,
            o0000O00000,
            FontRegistry.O00000000,
            var10.x + o0000O00000.O00000000(26.0F),
            var10.y,
            var10.h,
            10.0F,
            "Поиск...",
            ColorScheme.O00000000(O0000O00000OO.O000000000(o0000O000O0OO), Math.round(255.0F * f))
         );
      } else {
         if (this.O0000000000OOO && !this.O0000000000OO.isEmpty()) {
            float var15 = O0000O00000OO.O00000000(FontRegistry.O00000000, this.O0000000000OO, 10.0F);
            o0000O00OO0O0.O00000000(
               var10.x + o0000O00000.O00000000(24.0F),
               var10.y + (var10.h - o0000O00000.O00000000(16.0F)) * 0.5F,
               var15 + o0000O00000.O00000000(5.0F),
               o0000O00000.O00000000(16.0F),
               o0000O00000.O00000000(3.0F),
               ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), Math.round(70.0F * f))
            );
         }

         float var25 = var10.x + o0000O00000.O00000000(26.0F);

         for (int var16 = 0; var16 < this.O0000000000OO.length(); var16++) {
            String var17 = String.valueOf(this.O0000000000OO.charAt(var16));
            float var18 = O0000O00000OO.O00000000(FontRegistry.O00000000, var17, 10.0F);
            long var19 = var16 < this.O000000000O.size() ? this.O000000000O.get(var16) : 0L;
            float var21 = (float)(var13 - var19) / 170.0F;
            float var22 = 0.0F;
            float var23 = 1.0F;
            if (var21 < 1.0F) {
               float var24 = 1.0F - (1.0F - var21) * (1.0F - var21);
               var22 = (1.0F - var24) * o0000O00000.O00000000(6.0F);
               var23 = var24;
            }

            O0000O00000OO.O00000000(
               o0000O00OO0O0,
               o0000O00000,
               FontRegistry.O00000000,
               var25,
               var10.y + var22,
               var10.h,
               10.0F,
               var17,
               ColorScheme.O00000000(O0000O00000OO.O00000000(o0000O000O0OO), Math.round(255.0F * var23 * f))
            );
            var25 += var18;
         }

         if (this.O0000000000OO0 && !this.O0000000000OOO) {
            O0000O00000OO.O00000000(
               o0000O00OO0O0,
               o0000O00000,
               FontRegistry.O00000000,
               var25,
               var10.y,
               var10.h,
               10.0F,
               "|",
               ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), Math.round(255.0F * var12 * f))
            );
         }
      }

      for (int var26 = this.O000000000O0.size() - 1; var26 >= 0; var26--) {
         O0000O000O0O0O.W346 var28 = this.O000000000O0.get(var26);
         float var29 = (float)(var13 - var28.born()) / 170.0F;
         if (var29 >= 1.0F) {
            this.O000000000O0.remove(var26);
         } else {
            float var30 = 1.0F - (1.0F - var29) * (1.0F - var29);
            O0000O00000OO.O00000000(
               o0000O00OO0O0,
               o0000O00000,
               FontRegistry.O00000000,
               var28.x(),
               var10.y + var30 * o0000O00000.O00000000(7.0F),
               var10.h,
               10.0F,
               var28.ch(),
               ColorScheme.O00000000(O0000O00000OO.O00000000(o0000O000O0OO), Math.round(255.0F * (1.0F - var30) * f))
            );
         }
      }

      o0000O00OO0O0.O0000000000000();
      if (!this.O0000000000OO.isEmpty()) {
         boolean var27 = O0000O00000OO.O00000000(
            o0000O000O0O0, var10.x + var10.w - o0000O00000.O00000000(28.0F), var10.y, o0000O00000.O00000000(28.0F), var10.h
         );
         O0000O00000OO.O00000000(
            o0000O00OO0O0,
            o0000O00000,
            FontRegistry.O000000000000,
            var10.x + var10.w - o0000O00000.O00000000(20.0F),
            var10.y,
            var10.h,
            9.0F,
            "l",
            ColorScheme.O00000000(var27 ? o0000O000O0OO.O000000000O0() : O0000O00000OO.O000000000(o0000O000O0OO), Math.round(220.0F * f))
         );
      }
   }

   private void O000000000(
      RenderManager o0000O00OO0O0, O0000O000O0O0 o0000O000O0O0, O0000O00000 o0000O00000, ColorScheme o0000O000O0OO, O0000O000O0O0O.W347 o000000000, float f
   ) {
      O00000O0OOOO[] var7 = O00000O0OOOO.values();
      float var8 = o000000000.y + o0000O00000.O00000000(44.0F);
      float var9 = o0000O00000.O00000000(34.0F);
      float var10 = o0000O00000.O00000000(18.0F);
      float var11 = o0000O00000.O00000000(26.0F);
      float var12 = var8 + (var9 - var11) * 0.5F;
      float var13 = o000000000.x + var10;
      float var14 = var13;
      float var15 = o0000O00000.O00000000(40.0F);

      for (O00000O0OOOO var19 : var7) {
         float var20 = O0000O00000OO.O00000000(FontRegistry.O00000000000, var19.O000000000(), 11.0F) + o0000O00000.O00000000(20.0F);
         if (var19 == this.O0000000000000) {
            var14 = var13;
            var15 = var20;
         }

         var13 += var20 + o0000O00000.O00000000(6.0F);
      }

      if (!this.O00000000O) {
         this.O000000000OOO0 = var14;
         this.O000000000OOOO = var15;
         this.O00000000O = true;
      } else {
         this.O000000000OOO0 = this.O000000000OOO0 + (var14 - this.O000000000OOO0) * 0.3F;
         this.O000000000OOOO = this.O000000000OOOO + (var15 - this.O000000000OOOO) * 0.3F;
      }

      o0000O00OO0O0.O00000000(
         this.O000000000OOO0,
         var12,
         this.O000000000OOOO,
         var11,
         var11 * 0.5F,
         ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), Math.round((o0000O000O0OO.O000000000O000() ? 60 : 86) * f))
      );
      var13 = o000000000.x + var10;

      for (O00000O0OOOO var46 : var7) {
         float var48 = O0000O00000OO.O00000000(FontRegistry.O00000000000, var46.O000000000(), 11.0F) + o0000O00000.O00000000(20.0F);
         boolean var21 = var46 == this.O0000000000000;
         boolean var22 = O0000O00000OO.O00000000(o0000O000O0O0, var13, var12, var48, var11);
         boolean var23 = this.O00000000(o0000O00OO0O0, var46.name(), var13 + var48 * 0.5F, var12 + var11 * 0.5F);

         try {
            if (!var21 && var22) {
               o0000O00OO0O0.O00000000(var13, var12, var48, var11, var11 * 0.5F, ColorScheme.O00000000(o0000O000O0OO.O0000000000O(), Math.round(255.0F * f)));
            }

            O0000O00000OO.O00000000(
               o0000O00OO0O0,
               o0000O00000,
               FontRegistry.O00000000000,
               var13 + o0000O00000.O00000000(11.0F),
               var12,
               var11,
               11.0F,
               var46.O000000000(),
               ColorScheme.O00000000(var21 ? O0000O00000OO.O00000000(o0000O000O0OO) : O0000O00000OO.O000000000(o0000O000O0OO), Math.round(255.0F * f))
            );
         } finally {
            this.O00000000(o0000O00OO0O0, var23);
         }

         var13 += var48 + o0000O00000.O00000000(6.0F);
      }

      O0000O000O0O0O.W347 var41 = this.O000000000(o0000O00000, o000000000);
      O0000O000O0O0O.W347 var43 = this.O0000000000(o0000O00000, o000000000);
      boolean var45 = O0000O00000OO.O00000000(o0000O000O0O0, var43.x, var43.y, var43.w, var43.h);
      boolean var47 = this.O00000000(o0000O00OO0O0, "import", var43.x + var43.w * 0.5F, var43.y + var43.h * 0.5F);

      try {
         o0000O00OO0O0.O00000000(
            var43.x,
            var43.y,
            var43.w,
            var43.h,
            var43.h * 0.5F,
            ColorScheme.O00000000(var45 ? o0000O000O0OO.O000000000O0() : o0000O000O0OO.O0000000000O(), Math.round((var45 ? 70 : 255) * f))
         );
         o0000O00OO0O0.O00000000(
            var43.x, var43.y, var43.w, var43.h, var43.h * 0.5F, ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), Math.round(110.0F * f)), 0.7F
         );
         String var49 = "Импорт";
         float var51 = O0000O00000OO.O00000000(FontRegistry.O00000000000, var49, 10.0F);
         O0000O00000OO.O00000000(
            o0000O00OO0O0,
            o0000O00000,
            FontRegistry.O00000000000,
            var43.x + (var43.w - var51) * 0.5F,
            var43.y,
            var43.h,
            10.0F,
            var49,
            ColorScheme.O00000000(O0000O00000OO.O00000000(o0000O000O0OO), Math.round(255.0F * f))
         );
      } finally {
         this.O00000000(o0000O00OO0O0, var47);
      }

      boolean var50 = O0000O00000OO.O00000000(o0000O000O0O0, var41.x, var41.y, var41.w, var41.h);
      boolean var52 = this.O00000000(o0000O00OO0O0, "reload", var41.x + var41.w * 0.5F, var41.y + var41.h * 0.5F);

      try {
         o0000O00OO0O0.O00000000(
            var41.x,
            var41.y,
            var41.w,
            var41.h,
            var41.h * 0.5F,
            ColorScheme.O00000000(var50 ? o0000O000O0OO.O0000000000O() : o0000O000O0OO.O00000000000O0(), Math.round(255.0F * f))
         );
         float var53 = O0000O00000OO.O00000000(FontRegistry.O000000000000, "r", 10.0F);
         O0000O00000OO.O00000000(
            o0000O00OO0O0,
            o0000O00000,
            FontRegistry.O000000000000,
            var41.x + (var41.w - var53) * 0.5F,
            var41.y,
            var41.h,
            10.0F,
            "r",
            ColorScheme.O00000000(var50 ? o0000O000O0OO.O000000000O0() : O0000O00000OO.O000000000(o0000O000O0OO), Math.round(255.0F * f))
         );
      } finally {
         this.O00000000(o0000O00OO0O0, var52);
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void O00000000(
      RenderManager o0000O00OO0O0,
      O0000O000O0O0 o0000O000O0O0,
      O0000O000O0OOO o0000O000O0OOO,
      O0000O00000 o0000O00000,
      ColorScheme o0000O000O0OO,
      O0000O000O0O0O.W347 o000000000,
      float f
   ) {
      O0000O000O0O0O.W347 var8 = this.O0000000000000(o0000O00000, o000000000);
      this.O00000000(o0000O00OO0O0, o0000O00000, o0000O000O0OO, var8.x, var8.y, var8.w, var8.h, o0000O00000.O00000000(10.0F), f);
      List var9 = this.O00000000000O();
      int var10 = this.O0000000000O00(o0000O00000, var8);
      float var11 = o0000O00000.O00000000(10.0F);
      float var12 = (var8.w - o0000O00000.O00000000(12.0F) - (var10 - 1) * var11) / var10;
      float var13 = var12;
      float var14 = var12 + o0000O00000.O00000000(20.0F);
      float var15 = o0000O00000.O00000000(10.0F);
      int var16 = (var9.size() + var10 - 1) / var10;
      float var17 = var16 * (var14 + var15) + o0000O00000.O00000000(6.0F);
      float var18 = Math.max(0.0F, var17 - var8.h);
      this.O00000000000O = O00000000(this.O00000000000O, 0.0F, var18);
      this.O000000000000O = O00000000(this.O000000000000O, 0.0F, var18);
      O00000O0OOO00O var19 = O00000O0OOO0O.O00000000().O0000000000000();
      o0000O00OO0O0.O00000000(
         var8.x, var8.y, var8.w, var8.h, o0000O00000.O00000000(10.0F), o0000O00000.O00000000(10.0F), o0000O00000.O00000000(10.0F), o0000O00000.O00000000(10.0F)
      );
      boolean var43 = false /* VF: Semaphore variable */;

      try {
         var43 = true;
         boolean var20 = this.O000000000OO0O < 0.999F;
         if (var20) {
            o0000O00OO0O0.O000000000000(Math.max(0.0F, this.O000000000OO0O));
            o0000O00OO0O0.O00000000((1.0F - this.O000000000OO0O) * this.O000000000OOO * var8.w * 0.16F, 0.0F);
         }

         try {
            float var21 = var8.x + o0000O00000.O00000000(6.0F);
            float var22 = var8.y + o0000O00000.O00000000(6.0F) - this.O000000000000O;
            String var23 = "";

            for (int var24 = 0; var24 < var9.size(); var24++) {
               int var25 = var24 % var10;
               int var26 = var24 / var10;
               float var27 = var21 + var25 * (var12 + var11);
               float var28 = var22 + var26 * (var14 + var15);
               if (!(var28 + var14 < var8.y) && !(var28 > var8.y + var8.h)) {
                  O00000O0OOO00O var29 = (O00000O0OOO00O)var9.get(var24);
                  if (O0000O00000OO.O00000000(o0000O000O0O0, var27, var28, var12, var14)) {
                     var23 = var29.O00000000();
                  }

                  float var30 = var29.O00000000().equals(this.O000000000OO0) ? this.O000000000OO00 : 0.0F;
                  float var31 = 1.0F;
                  float var32 = var28;
                  long var33 = System.currentTimeMillis() - this.O00000000O0 - var24 * 26L;
                  if (var33 < 240L) {
                     float var35 = Math.max(0.0F, (float)var33) / 240.0F;
                     float var36 = 1.0F - (1.0F - var35) * (1.0F - var35);
                     var31 = var36;
                     var32 = var28 + (1.0F - var36) * o0000O00000.O00000000(14.0F);
                  }

                  boolean var56 = this.O00000000(o0000O00OO0O0, var29.O00000000(), var27 + var12 * 0.5F, var32 + var14 * 0.5F);
                  boolean var50 = false /* VF: Semaphore variable */;

                  try {
                     var50 = true;
                     this.O00000000(o0000O00OO0O0, o0000O000O0O0, o0000O00000, o0000O000O0OO, var29, var27, var32, var12, var14, var13, var19, f * var31, var30);
                     var50 = false;
                  } finally {
                     if (var50) {
                        this.O00000000(o0000O00OO0O0, var56);
                     }
                  }

                  this.O00000000(o0000O00OO0O0, var56);
               }
            }

            this.O000000000OO0 = var23;
            if (var9.isEmpty()) {
               String var54 = this.O0000000000OO.isEmpty() ? "Пусто. Нажмите «Импорт»" : "Ничего не найдено";
               float var55 = O0000O00000OO.O00000000(FontRegistry.O00000000, var54, 10.0F);
               O0000O00000OO.O00000000(
                  o0000O00OO0O0,
                  o0000O00000,
                  FontRegistry.O00000000,
                  var8.x + (var8.w - var55) * 0.5F,
                  var8.y + var8.h * 0.42F,
                  o0000O00000.O00000000(14.0F),
                  10.0F,
                  var54,
                  ColorScheme.O00000000(O0000O00000OO.O000000000(o0000O000O0OO), Math.round(190.0F * f))
               );
            }
         } finally {
            if (var20) {
               o0000O00OO0O0.O00000000000O();
               o0000O00OO0O0.O00000000000OO();
            }
         }

         var43 = false;
      } finally {
         if (var43) {
            o0000O00OO0O0.O0000000000();
            o0000O00OO0O0.O0000000000000();
         }
      }

      o0000O00OO0O0.O0000000000();
      o0000O00OO0O0.O0000000000000();
   }

   private void O00000000(
      RenderManager o0000O00OO0O0,
      O0000O000O0O0 o0000O000O0O0,
      O0000O00000 o0000O00000,
      ColorScheme o0000O000O0OO,
      O00000O0OOO00O o00000O0OOO00O,
      float f,
      float g,
      float h,
      float i,
      float j,
      O00000O0OOO00O o00000O0OOO00O2,
      float k,
      float l
   ) {
      boolean var14 = o00000O0OOO00O2 != null && o00000O0OOO00O2.O00000000().equals(o00000O0OOO00O.O00000000());
      boolean var15 = var14 && O00000O0OOO0O.O00000000().O000000000000O();
      float var16 = o0000O00000.O00000000(10.0F);
      if (!var14 && l > 0.01F) {
         o0000O00OO0O0.O00000000(
            f,
            g,
            h,
            i,
            var16,
            o0000O00000.O00000000(12.0F) * l,
            o0000O00000.O00000000(1.0F),
            ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), Math.round(46.0F * l * k))
         );
      }

      int var17 = var14
         ? ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), Math.round((o0000O000O0OO.O000000000O000() ? 40 : 54) * k))
         : ColorScheme.O00000000(ColorScheme.O00000000(o0000O000O0OO.O00000000000O0(), o0000O000O0OO.O0000000000O0(), l), Math.round(255.0F * k));
      o0000O00OO0O0.O00000000(f, g, h, i, var16, var17);
      if (var14) {
         o0000O00OO0O0.O00000000(
            f,
            g,
            h,
            i,
            var16,
            o0000O00000.O00000000(14.0F),
            o0000O00000.O00000000(1.0F),
            ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), Math.round(60.0F * k))
         );
         o0000O00OO0O0.O00000000(f, g, h, i, var16, ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), Math.round(180.0F * k)), 0.9F);
      } else if (l > 0.01F) {
         o0000O00OO0O0.O00000000(f, g, h, i, var16, ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), Math.round(80.0F * l * k)), 0.7F);
      }

      o0000O00OO0O0.O00000000(
         f + o0000O00000.O00000000(4.0F),
         g + o0000O00000.O00000000(4.0F),
         h - o0000O00000.O00000000(8.0F),
         j - o0000O00000.O00000000(2.0F),
         var16 * 0.7F,
         var16 * 0.7F,
         0.0F,
         0.0F
      );

      try {
         o0000O00OO0O0.O00000000(
            f + o0000O00000.O00000000(4.0F),
            g + o0000O00000.O00000000(4.0F),
            h - o0000O00000.O00000000(8.0F),
            j - o0000O00000.O00000000(2.0F),
            0.0F,
            ColorScheme.O00000000(10, 12, 18, Math.round(230.0F * k))
         );
         O00000O0OOOOO0.O00000000(
            o0000O00OO0O0,
            o00000O0OOO00O.O0000000000O00(),
            o00000O0OOO00O.O00000000(),
            f + o0000O00000.O00000000(4.0F),
            g + o0000O00000.O00000000(4.0F),
            h - o0000O00000.O00000000(8.0F),
            j - o0000O00000.O00000000(2.0F),
            k
         );
      } finally {
         o0000O00OO0O0.O0000000000();
         o0000O00OO0O0.O0000000000000();
      }

      String var18 = o00000O0OOO00O.O00000000000O0();
      if (var18 != null && !var18.isEmpty()) {
         String var19 = O00000000(var18, 10);
         float var20 = O0000O00000OO.O00000000(FontRegistry.O00000000, var19, 8.0F) + o0000O00000.O00000000(8.0F);
         o0000O00OO0O0.O00000000(
            f + o0000O00000.O00000000(6.0F),
            g + o0000O00000.O00000000(6.0F),
            var20,
            o0000O00000.O00000000(13.0F),
            o0000O00000.O00000000(6.0F),
            ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), Math.round(210.0F * k))
         );
         O0000O00000OO.O00000000(
            o0000O00OO0O0,
            o0000O00000,
            FontRegistry.O00000000,
            f + o0000O00000.O00000000(10.0F),
            g + o0000O00000.O00000000(6.0F),
            o0000O00000.O00000000(13.0F),
            8.0F,
            var19,
            ColorScheme.O00000000(-1, Math.round(255.0F * k))
         );
      }

      float var23 = g + j;
      O0000O00000OO.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         FontRegistry.O00000000,
         f + o0000O00000.O00000000(8.0F),
         var23,
         o0000O00000.O00000000(20.0F),
         9.0F,
         O00000000(o00000O0OOO00O.O00000000000(), 16),
         ColorScheme.O00000000(O0000O00000OO.O00000000(o0000O000O0OO), Math.round(255.0F * k))
      );
      O0000O000O0O0O.W347 var24 = this.O00000000(o0000O00000, f, g, h, j);
      this.O00000000(o0000O00OO0O0, o0000O00000, o0000O000O0OO, var24, var15, k);
   }

   private void O00000000(RenderManager o0000O00OO0O0, O0000O00000 o0000O00000, ColorScheme o0000O000O0OO, float f, float g, float h, float i, float j, float k) {
      o0000O00OO0O0.O00000000(f, g, h, i, j, o0000O00000.O00000000(9.0F), o0000O00000.O00000000(1.4F), ColorScheme.O00000000(0, 0, 0, Math.round(46.0F * k)));
      o0000O00OO0O0.O00000000(f, g, h, i, j, ColorScheme.O00000000(o0000O000O0OO.O00000000000O0(), Math.round(255.0F * k)));
      o0000O00OO0O0.O00000000(f, g, h, i, j, ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), Math.round(48.0F * k)), 0.8F);
      float var10 = Math.max(0.0F, (h - j * 2.0F) * 0.5F);
      int var11 = ColorScheme.O00000000(ColorScheme.O00000000(-1, o0000O000O0OO.O000000000O0(), 0.35F), Math.round(48.0F * k));
      int var12 = ColorScheme.O00000000(var11, Math.round(8.0F * k));
      o0000O00OO0O0.O00000000(f + j, g + o0000O00000.O00000000(1.0F), var10, Math.max(1.0F, o0000O00000.O00000000(1.0F)), 0.0F, var12, var11);
      o0000O00OO0O0.O00000000(f + j + var10, g + o0000O00000.O00000000(1.0F), var10, Math.max(1.0F, o0000O00000.O00000000(1.0F)), 0.0F, var11, var12);
   }

   private void O00000000(RenderManager o0000O00OO0O0, O0000O00000 o0000O00000, ColorScheme o0000O000O0OO, O0000O000O0O0O.W347 o000000000, boolean bl, float f) {
      o0000O00OO0O0.O00000000(
         o000000000.x,
         o000000000.y,
         o000000000.w,
         o000000000.h,
         o000000000.h * 0.5F,
         ColorScheme.O00000000(bl ? o0000O000O0OO.O000000000O0() : o0000O000O0OO.O0000000000OO0(), Math.round((bl ? 220 : 255) * f))
      );
      float var7 = o000000000.h - o0000O00000.O00000000(3.0F);
      float var8 = bl ? o000000000.x + o000000000.w - var7 - o0000O00000.O00000000(1.5F) : o000000000.x + o0000O00000.O00000000(1.5F);
      o0000O00OO0O0.O000000000(
         var8 + var7 * 0.5F, o000000000.y + o000000000.h * 0.5F, var7 * 0.5F, 0.0F, 1.0F, ColorScheme.O00000000(-1, Math.round(255.0F * f))
      );
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void O000000000(
      RenderManager o0000O00OO0O0,
      O0000O000O0O0 o0000O000O0O0,
      O0000O000O0OOO o0000O000O0OOO,
      O0000O00000 o0000O00000,
      ColorScheme o0000O000O0OO,
      O0000O000O0O0O.W347 o000000000,
      float f
   ) {
      O0000O000O0O0O.W347 var8 = this.O000000000000(o0000O00000, o000000000);
      this.O00000000(o0000O00OO0O0, o0000O00000, o0000O000O0OO, var8.x, var8.y, var8.w, var8.h, o0000O00000.O00000000(12.0F), f);
      O0000O00000OO.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         FontRegistry.O00000000000,
         var8.x + o0000O00000.O00000000(14.0F),
         var8.y,
         o0000O00000.O00000000(34.0F),
         11.0F,
         "Превью",
         ColorScheme.O00000000(O0000O00000OO.O00000000(o0000O000O0OO), Math.round(235.0F * f))
      );
      O00000O0OOO00O var9 = O00000O0OOO0O.O00000000().O0000000000000();
      O0000O000O0O0O.W347 var10 = this.O000000000000O(o0000O00000, o000000000);
      O00000O0OOOOO0.O00000000(
         o0000O00OO0O0, o0000O000O0OOO, var10.x, var10.y, var10.w, var10.h, var9, this.O00000000000O0, this.O00000000000OO, this.O0000000000O, f
      );
      O0000O000O0O0O.W347 var11 = this.O00000000000O(o0000O00000, o000000000);
      if (this.O000000000O000 && var9 != null) {
         O0000O000O0O0O.W347 var43 = this.O0000000000O(o0000O00000, o000000000);
         o0000O00OO0O0.O00000000(
            var43.x, var43.y, var43.w, var43.h, o0000O00000.O00000000(5.0F), ColorScheme.O00000000(o0000O000O0OO.O0000000000O(), Math.round(255.0F * f))
         );
         o0000O00OO0O0.O00000000(
            var43.x, var43.y, var43.w, var43.h, o0000O00000.O00000000(5.0F), ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), Math.round(170.0F * f)), 0.8F
         );
         float var45 = (float)((Math.sin(System.currentTimeMillis() * 0.006) + 1.0) * 0.5);
         float var14 = O0000O00000OO.O00000000(FontRegistry.O00000000000, this.O000000000O00O, 11.0F);
         o0000O00OO0O0.O00000000((int)(var43.x + o0000O00000.O00000000(7.0F)), (int)var43.y, (int)(var43.w - o0000O00000.O00000000(12.0F)), (int)var43.h);
         O0000O00000OO.O00000000(
            o0000O00OO0O0,
            o0000O00000,
            FontRegistry.O00000000000,
            var43.x + o0000O00000.O00000000(7.0F),
            var43.y,
            var43.h,
            11.0F,
            this.O000000000O00O,
            ColorScheme.O00000000(O0000O00000OO.O00000000(o0000O000O0OO), Math.round(255.0F * f))
         );
         O0000O00000OO.O00000000(
            o0000O00OO0O0,
            o0000O00000,
            FontRegistry.O00000000000,
            var43.x + o0000O00000.O00000000(7.0F) + var14,
            var43.y,
            var43.h,
            11.0F,
            "|",
            ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), Math.round(255.0F * var45 * f))
         );
         o0000O00OO0O0.O0000000000000();
      } else {
         String var12 = var9 == null ? "Ничего не выбрано" : var9.O00000000000();
         boolean var13 = var9 != null && O0000O00000OO.O00000000(o0000O000O0O0, var11.x, var11.y, var11.w * 0.7F, o0000O00000.O00000000(16.0F));
         O0000O00000OO.O00000000(
            o0000O00OO0O0,
            o0000O00000,
            FontRegistry.O00000000000,
            var11.x,
            var11.y,
            o0000O00000.O00000000(18.0F),
            12.0F,
            O00000000(var12, 22),
            ColorScheme.O00000000(var13 ? o0000O000O0OO.O000000000O0() : O0000O00000OO.O00000000(o0000O000O0OO), Math.round(255.0F * f))
         );
      }

      String var44 = this.O00000000000(var9);
      O0000O00000OO.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         FontRegistry.O00000000,
         var11.x,
         var11.y + o0000O00000.O00000000(17.0F),
         o0000O00000.O00000000(15.0F),
         9.0F,
         O00000000(var44, 40),
         ColorScheme.O00000000(O0000O00000OO.O000000000(o0000O000O0OO), Math.round(200.0F * f))
      );
      if (var9 != null) {
         O00000O0OOOO[] var46 = O00000O0OOOO.values();
         float var47 = o0000O00000.O00000000(20.0F);
         float var15 = var11.y + o0000O00000.O00000000(34.0F);
         float var16 = var11.x;

         for (O00000O0OOOO var20 : var46) {
            String var21 = var20.O000000000();
            float var22 = O0000O00000OO.O00000000(FontRegistry.O00000000, var21, 9.0F) + o0000O00000.O00000000(12.0F);
            boolean var23 = var9.O00000000000O() == var20;
            boolean var24 = this.O00000000(o0000O00OO0O0, O00000000O0000[var20.ordinal()], var16 + var22 * 0.5F, var15 + var47 * 0.5F);

            try {
               o0000O00OO0O0.O00000000(
                  var16,
                  var15,
                  var22,
                  var47,
                  var47 * 0.5F,
                  ColorScheme.O00000000(var23 ? o0000O000O0OO.O000000000O0() : o0000O000O0OO.O00000000000O0(), Math.round((var23 ? 70 : 255) * f))
               );
               O0000O00000OO.O00000000(
                  o0000O00OO0O0,
                  o0000O00000,
                  FontRegistry.O00000000,
                  var16 + o0000O00000.O00000000(6.0F),
                  var15,
                  var47,
                  9.0F,
                  var21,
                  ColorScheme.O00000000(var23 ? O0000O00000OO.O00000000(o0000O000O0OO) : O0000O00000OO.O000000000(o0000O000O0OO), Math.round(255.0F * f))
               );
            } finally {
               this.O00000000(o0000O00OO0O0, var24);
            }

            var16 += var22 + o0000O00000.O00000000(4.0F);
         }

         O0000O000O0O0O.W347 var48 = this.O0000000000O0(o0000O00000, o000000000);
         if (this.O000000000O0O) {
            o0000O00OO0O0.O00000000(
               var48.x, var48.y, var48.w, var48.h, o0000O00000.O00000000(5.0F), ColorScheme.O00000000(o0000O000O0OO.O0000000000O(), Math.round(255.0F * f))
            );
            o0000O00OO0O0.O00000000(
               var48.x,
               var48.y,
               var48.w,
               var48.h,
               o0000O00000.O00000000(5.0F),
               ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), Math.round(170.0F * f)),
               0.8F
            );
            float var50 = (float)((Math.sin(System.currentTimeMillis() * 0.006) + 1.0) * 0.5);
            float var53 = O0000O00000OO.O00000000(FontRegistry.O00000000, this.O000000000O0O0, 9.0F);
            o0000O00OO0O0.O00000000((int)(var48.x + o0000O00000.O00000000(7.0F)), (int)var48.y, (int)(var48.w - o0000O00000.O00000000(12.0F)), (int)var48.h);
            O0000O00000OO.O00000000(
               o0000O00OO0O0,
               o0000O00000,
               FontRegistry.O00000000,
               var48.x + o0000O00000.O00000000(7.0F),
               var48.y,
               var48.h,
               9.0F,
               this.O000000000O0O0,
               ColorScheme.O00000000(O0000O00000OO.O00000000(o0000O000O0OO), Math.round(255.0F * f))
            );
            O0000O00000OO.O00000000(
               o0000O00OO0O0,
               o0000O00000,
               FontRegistry.O00000000,
               var48.x + o0000O00000.O00000000(7.0F) + var53,
               var48.y,
               var48.h,
               9.0F,
               "|",
               ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), Math.round(255.0F * var50 * f))
            );
            o0000O00OO0O0.O0000000000000();
         } else {
            boolean var49 = O0000O00000OO.O00000000(o0000O000O0O0, var48.x, var48.y, var48.w, var48.h);
            o0000O00OO0O0.O00000000(
               var48.x,
               var48.y,
               var48.w,
               var48.h,
               o0000O00000.O00000000(5.0F),
               ColorScheme.O00000000(var49 ? o0000O000O0OO.O0000000000O() : o0000O000O0OO.O00000000000O0(), Math.round(255.0F * f))
            );
            String var52 = var9.O00000000000O0();
            if (var52 != null && !var52.isEmpty()) {
               float var55 = O0000O00000OO.O00000000(FontRegistry.O00000000, "Префикс: ", 9.0F);
               O0000O00000OO.O00000000(
                  o0000O00OO0O0,
                  o0000O00000,
                  FontRegistry.O00000000,
                  var48.x + o0000O00000.O00000000(7.0F),
                  var48.y,
                  var48.h,
                  9.0F,
                  "Префикс: ",
                  ColorScheme.O00000000(O0000O00000OO.O000000000(o0000O000O0OO), Math.round(200.0F * f))
               );
               O0000O00000OO.O00000000(
                  o0000O00OO0O0,
                  o0000O00000,
                  FontRegistry.O00000000,
                  var48.x + o0000O00000.O00000000(7.0F) + var55,
                  var48.y,
                  var48.h,
                  9.0F,
                  O00000000(var52, 18),
                  ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), Math.round(255.0F * f))
               );
            } else {
               O0000O00000OO.O00000000(
                  o0000O00OO0O0,
                  o0000O00000,
                  FontRegistry.O00000000,
                  var48.x + o0000O00000.O00000000(7.0F),
                  var48.y,
                  var48.h,
                  9.0F,
                  "+ префикс",
                  ColorScheme.O00000000(O0000O00000OO.O000000000(o0000O000O0OO), Math.round(180.0F * f))
               );
            }
         }

         O0000O000O0O0O.W347 var51 = this.O00000000000O0(o0000O00000, o000000000);
         boolean var54 = O00000O0OOO0O.O00000000().O000000000000O();
         boolean var56 = O0000O00000OO.O00000000(o0000O000O0O0, var51.x, var51.y, var51.w, var51.h);
         boolean var57 = this.O00000000(o0000O00OO0O0, "equip", var51.x + var51.w * 0.5F, var51.y + var51.h * 0.5F);

         try {
            int var58 = var54
               ? ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), Math.round((var56 ? 200 : 160) * f))
               : ColorScheme.O00000000(var56 ? o0000O000O0OO.O0000000000O() : o0000O000O0OO.O00000000000O0(), Math.round(255.0F * f));
            o0000O00OO0O0.O00000000(var51.x, var51.y, var51.w, var51.h, o0000O00000.O00000000(8.0F), var58);
            o0000O00OO0O0.O00000000(
               var51.x,
               var51.y,
               var51.w,
               var51.h,
               o0000O00000.O00000000(8.0F),
               ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), Math.round(140.0F * f)),
               0.7F
            );
            String var60 = var54 ? "Снять" : "Надеть";
            float var62 = O0000O00000OO.O00000000(FontRegistry.O00000000000, var60, 11.0F);
            O0000O00000OO.O00000000(
               o0000O00OO0O0,
               o0000O00000,
               FontRegistry.O00000000000,
               var51.x + (var51.w - var62) * 0.5F,
               var51.y,
               var51.h,
               11.0F,
               var60,
               ColorScheme.O00000000(var54 ? O0000O00000OO.O00000000(o0000O000O0OO) : O0000O00000OO.O000000000(o0000O000O0OO), Math.round(255.0F * f))
            );
         } finally {
            this.O00000000(o0000O00OO0O0, var57);
         }

         O0000O000O0O0O.W347 var59 = this.O00000000000OO(o0000O00000, o000000000);
         boolean var61 = O0000O00000OO.O00000000(o0000O000O0O0, var59.x, var59.y, var59.w, var59.h);
         boolean var63 = this.O000000000O0OO && System.currentTimeMillis() - this.O000000000OO < 2600L;
         boolean var25 = this.O00000000(o0000O00OO0O0, "delete", var59.x + var59.w * 0.5F, var59.y + var59.h * 0.5F);
         boolean var33 = false /* VF: Semaphore variable */;

         try {
            var33 = true;
            int var26 = var63
               ? ColorScheme.O00000000(196, 64, 64, Math.round(235.0F * f))
               : ColorScheme.O00000000(var61 ? o0000O000O0OO.O0000000000O0() : o0000O000O0OO.O00000000000O0(), Math.round(255.0F * f));
            o0000O00OO0O0.O00000000(var59.x, var59.y, var59.w, var59.h, o0000O00000.O00000000(8.0F), var26);
            o0000O00OO0O0.O00000000(
               var59.x,
               var59.y,
               var59.w,
               var59.h,
               o0000O00000.O00000000(8.0F),
               var63
                  ? ColorScheme.O00000000(255, 120, 120, Math.round(220.0F * f))
                  : ColorScheme.O00000000(o0000O000O0OO.O0000000000O0O(), Math.round(190.0F * f)),
               0.7F
            );
            String var27 = var63 ? "Точно?" : "Удалить";
            float var28 = O0000O00000OO.O00000000(FontRegistry.O00000000000, var27, 10.0F);
            O0000O00000OO.O00000000(
               o0000O00OO0O0,
               o0000O00000,
               FontRegistry.O00000000000,
               var59.x + (var59.w - var28) * 0.5F,
               var59.y,
               var59.h,
               10.0F,
               var27,
               ColorScheme.O00000000(var63 ? -1 : O0000O00000OO.O000000000(o0000O000O0OO), Math.round(255.0F * f))
            );
            var33 = false;
         } finally {
            if (var33) {
               this.O00000000(o0000O00OO0O0, var25);
            }
         }

         this.O00000000(o0000O00OO0O0, var25);
      }
   }

   public boolean O00000000(O0000O000O0O0 o0000O000O0O0, O0000O000O0OOO o0000O000O0OOO, float f, float g, int i) {
      if (this.O00000000(o0000O000O0O0) && this.O00000000 != null) {
         O0000O00000 var6 = this.O00000000;
         O0000O000O0O0O.W347 var7 = this.O00000000000O0();
         if (!var7.contains(f, g)) {
            return false;
         } else if (i != 0) {
            return true;
         } else {
            this.O0000000000OO0 = false;
            if (this.O000000000O000 && !this.O0000000000O(var6, var7).contains(f, g)) {
               this.O0000000000000();
            }

            if (this.O000000000O0O && !this.O0000000000O0(var6, var7).contains(f, g)) {
               this.O00000000000();
            }

            if (this.O00000000(var6, var7).contains(f, g)) {
               O0000O000O0O0O.W347 var18 = this.O00000000(var6, var7);
               if (!this.O0000000000OO.isEmpty() && f >= var18.x + var18.w - var6.O00000000(28.0F)) {
                  this.O0000000000O();
               }

               this.O0000000000OO0 = true;
               this.O0000000000OOO = false;
               return true;
            } else if (this.O0000000000(var6, var7).contains(f, g)) {
               this.O000000000("import");
               this.O000000000000O();
               return true;
            } else if (this.O000000000(var6, var7).contains(f, g)) {
               this.O000000000("reload");
               O00000O0OOO0O.O00000000().O00000000000();
               this.O00000000("Обновлено");
               return true;
            } else {
               O00000O0OOOO[] var8 = O00000O0OOOO.values();
               float var9 = var7.y + var6.O00000000(44.0F);
               float var10 = var6.O00000000(26.0F);
               float var11 = var9 + (var6.O00000000(34.0F) - var10) * 0.5F;
               float var12 = var7.x + var6.O00000000(18.0F);

               for (O00000O0OOOO var16 : var8) {
                  float var17 = O0000O00000OO.O00000000(FontRegistry.O00000000000, var16.O000000000(), 11.0F) + var6.O00000000(20.0F);
                  if (f >= var12 && f <= var12 + var17 && g >= var11 && g <= var11 + var10) {
                     this.O000000000(var16.name());
                     if (this.O0000000000000 != var16) {
                        this.O000000000OOO = var16.ordinal() > this.O0000000000000.ordinal() ? 1 : -1;
                        this.O000000000OO0O = 0.0F;
                        this.O0000000000000 = var16;
                        this.O000000000000O = this.O00000000000O = 0.0F;
                     }

                     return true;
                  }

                  var12 += var17 + var6.O00000000(6.0F);
               }

               if (this.O0000000000000(var6, var7).contains(f, g)) {
                  this.O00000000(var6, var7, f, g);
                  return true;
               } else if (this.O000000000000O(var6, var7).contains(f, g)) {
                  this.O0000000000O0 = true;
                  this.O0000000000O00 = f;
                  this.O0000000000O0O = g;
                  return true;
               } else {
                  this.O000000000(var6, var7, f, g);
                  return true;
               }
            }
         }
      } else {
         return false;
      }
   }

   private void O00000000(O0000O00000 o0000O00000, O0000O000O0O0O.W347 o000000000, float f, float g) {
      O0000O000O0O0O.W347 var5 = this.O0000000000000(o0000O00000, o000000000);
      List var6 = this.O00000000000O();
      int var7 = this.O0000000000O00(o0000O00000, var5);
      float var8 = o0000O00000.O00000000(10.0F);
      float var9 = (var5.w - o0000O00000.O00000000(12.0F) - (var7 - 1) * var8) / var7;
      float var11 = var9 + o0000O00000.O00000000(20.0F);
      float var12 = o0000O00000.O00000000(10.0F);
      float var13 = var5.x + o0000O00000.O00000000(6.0F);
      float var14 = var5.y + o0000O00000.O00000000(6.0F) - this.O000000000000O;
      int var15 = (int)Math.floor((f - var13) / (var9 + var8));
      int var16 = (int)Math.floor((g - var14) / (var11 + var12));
      if (var15 >= 0 && var15 < var7 && var16 >= 0) {
         int var17 = var16 * var7 + var15;
         if (var17 < var6.size()) {
            float var18 = var13 + var15 * (var9 + var8);
            float var19 = var14 + var16 * (var11 + var12);
            if (!(f > var18 + var9) && !(g > var19 + var11)) {
               O00000O0OOO00O var20 = (O00000O0OOO00O)var6.get(var17);
               O00000O0OOO00O var21 = O00000O0OOO0O.O00000000().O0000000000000();
               this.O000000000(var20.O00000000());
               O0000O000O0O0O.W347 var22 = this.O00000000(o0000O00000, var18, var19, var9, var9);
               if (!var22.contains(f, g)) {
                  this.O00000000(var20);
               } else {
                  if (var21 != null && var21.O00000000().equals(var20.O00000000())) {
                     O00000O0OOO0O.O00000000().O00000000(!O00000O0OOO0O.O00000000().O000000000000O());
                  } else {
                     this.O00000000(var20);
                  }
               }
            }
         }
      }
   }

   private void O00000000(O00000O0OOO00O o00000O0OOO00O) {
      O00000O0OOO0O.O00000000().O00000000(o00000O0OOO00O);
      O00000O0OOOOO.O00000000().O00000000(o00000O0OOO00O.O00000000());
      this.O00000000000O0 = 200.0F;
      this.O00000000000OO = -8.0F;
      this.O0000000000O = 1.0F;
      this.O000000000000();
      this.O0000000000();
      this.O000000000O0OO = false;
   }

   private void O000000000(O00000O0OOO00O o00000O0OOO00O) {
      this.O000000000O0O = true;
      this.O000000000O0O0 = o00000O0OOO00O.O00000000000O0() == null ? "" : o00000O0OOO00O.O00000000000O0();
      this.O000000000O000 = false;
      this.O000000000O0OO = false;
   }

   private void O0000000000() {
      this.O000000000O0O = false;
      this.O000000000O0O0 = "";
   }

   private void O00000000000() {
      if (this.O000000000O0O) {
         O00000O0OOO00O var1 = O00000O0OOO0O.O00000000().O0000000000000();
         if (var1 != null) {
            O00000O0OOO0O.O00000000().O000000000(var1, this.O000000000O0O0);
            this.O00000000("Префикс сохранён");
         }

         this.O000000000O0O = false;
         this.O000000000O0O0 = "";
      }
   }

   private void O0000000000(O00000O0OOO00O o00000O0OOO00O) {
      this.O000000000O000 = true;
      this.O000000000O00O = o00000O0OOO00O.O00000000000() == null ? "" : o00000O0OOO00O.O00000000000();
      this.O000000000O0OO = false;
   }

   private void O000000000000() {
      this.O000000000O000 = false;
      this.O000000000O00O = "";
   }

   private void O0000000000000() {
      if (this.O000000000O000) {
         O00000O0OOO00O var1 = O00000O0OOO0O.O00000000().O0000000000000();
         if (var1 != null) {
            O00000O0OOO0O.O00000000().O00000000(var1, this.O000000000O00O);
            this.O00000000("Переименовано");
         }

         this.O000000000O000 = false;
         this.O000000000O00O = "";
      }
   }

   private void O000000000(O0000O00000 o0000O00000, O0000O000O0O0O.W347 o000000000, float f, float g) {
      O00000O0OOO00O var5 = O00000O0OOO0O.O00000000().O0000000000000();
      if (var5 != null) {
         if (this.O0000000000O(o0000O00000, o000000000).contains(f, g)) {
            this.O0000000000(var5);
         } else if (this.O0000000000O0(o0000O00000, o000000000).contains(f, g)) {
            this.O000000000(var5);
         } else {
            O0000O000O0O0O.W347 var6 = this.O00000000000O(o0000O00000, o000000000);
            O00000O0OOOO[] var7 = O00000O0OOOO.values();
            float var8 = o0000O00000.O00000000(20.0F);
            float var9 = var6.y + o0000O00000.O00000000(34.0F);
            float var10 = var6.x;

            for (O00000O0OOOO var14 : var7) {
               float var15 = O0000O00000OO.O00000000(FontRegistry.O00000000, var14.O000000000(), 9.0F) + o0000O00000.O00000000(12.0F);
               if (f >= var10 && f <= var10 + var15 && g >= var9 && g <= var9 + var8) {
                  this.O000000000(O00000000O0000[var14.ordinal()]);
                  O00000O0OOO0O.O00000000().O00000000(var5, var14);
                  this.O00000000("Категория: " + var14.O000000000());
                  return;
               }

               var10 += var15 + o0000O00000.O00000000(4.0F);
            }

            O0000O000O0O0O.W347 var16 = this.O00000000000O0(o0000O00000, o000000000);
            if (var16.contains(f, g)) {
               this.O000000000("equip");
               O00000O0OOO0O.O00000000().O00000000(!O00000O0OOO0O.O00000000().O000000000000O());
            } else {
               O0000O000O0O0O.W347 var17 = this.O00000000000OO(o0000O00000, o000000000);
               if (var17.contains(f, g)) {
                  this.O000000000("delete");
                  if (this.O000000000O0OO && System.currentTimeMillis() - this.O000000000OO < 2600L) {
                     O00000O0OOO0O.O00000000().O000000000(var5);
                     O00000O0OOOOO.O00000000().O00000000("");
                     this.O000000000O0OO = false;
                     this.O00000000("Удалено");
                  } else {
                     this.O000000000O0OO = true;
                     this.O000000000OO = System.currentTimeMillis();
                  }
               }
            }
         }
      }
   }

   public boolean O00000000(O0000O000O0O0 o0000O000O0O0, float f, float g) {
      this.O0000000000O0 = false;
      return this.O00000000(o0000O000O0O0);
   }

   public boolean O000000000(O0000O000O0O0 o0000O000O0O0, float f, float g) {
      if (!this.O0000000000O0) {
         return false;
      } else {
         this.O00000000000O0 = this.O00000000000O0 + (f - this.O0000000000O00) * 0.55F;
         this.O00000000000OO = O00000000(this.O00000000000OO + (g - this.O0000000000O0O) * 0.55F, -89.0F, 89.0F);
         this.O0000000000O00 = f;
         this.O0000000000O0O = g;
         return true;
      }
   }

   public boolean O00000000(O0000O000O0O0 o0000O000O0O0, float f, float g, double d) {
      if (this.O00000000(o0000O000O0O0) && this.O00000000 != null) {
         O0000O00000 var6 = this.O00000000;
         O0000O000O0O0O.W347 var7 = this.O00000000000O0();
         if (this.O000000000000O(var6, var7).contains(f, g)) {
            this.O0000000000O = O00000000(this.O0000000000O * (float)(1.0 + d * 0.12), 0.35F, 4.0F);
            return true;
         } else if (this.O0000000000000(var6, var7).contains(f, g)) {
            this.O00000000000O = this.O00000000000O - (float)d * var6.O00000000(52.0F);
            return true;
         } else {
            return var7.contains(f, g);
         }
      } else {
         return false;
      }
   }

   public boolean O00000000(O0000O000O0O0 o0000O000O0O0, int i) {
      if (!this.O00000000(o0000O000O0O0)) {
         return false;
      } else if (this.O000000000O000) {
         if (i == 256) {
            this.O000000000000();
            return true;
         } else if (i == 257) {
            this.O0000000000000();
            return true;
         } else if (i == 259) {
            if (!this.O000000000O00O.isEmpty()) {
               this.O000000000O00O = this.O000000000O00O.substring(0, this.O000000000O00O.length() - 1);
            }

            return true;
         } else {
            return true;
         }
      } else if (this.O000000000O0O) {
         if (i == 256) {
            this.O0000000000();
            return true;
         } else if (i == 257) {
            this.O00000000000();
            return true;
         } else if (i == 259) {
            if (!this.O000000000O0O0.isEmpty()) {
               this.O000000000O0O0 = this.O000000000O0O0.substring(0, this.O000000000O0O0.length() - 1);
            }

            return true;
         } else {
            return true;
         }
      } else if (!this.O0000000000OO0) {
         return false;
      } else if (i != 256 && i != 257) {
         if (Screen.hasControlDown()) {
            if (i == 65) {
               this.O0000000000OOO = !this.O0000000000OO.isEmpty();
               return true;
            }

            if (i == 86) {
               if (this.O0000000000OOO) {
                  this.O0000000000O();
                  this.O0000000000OOO = false;
               }

               String var3 = MinecraftClient.getInstance().keyboard.getClipboard();
               if (var3 != null) {
                  for (int var4 = 0; var4 < var3.length(); var4++) {
                     this.O00000000(var3.charAt(var4));
                  }
               }

               return true;
            }

            if (i == 67 && !this.O0000000000OO.isEmpty()) {
               MinecraftClient.getInstance().keyboard.setClipboard(this.O0000000000OO);
               this.O00000000("Скопировано");
               return true;
            }

            if (i == 88) {
               if (!this.O0000000000OO.isEmpty()) {
                  MinecraftClient.getInstance().keyboard.setClipboard(this.O0000000000OO);
                  this.O00000000("Вырезано");
               }

               this.O0000000000O();
               this.O0000000000OOO = false;
               return true;
            }

            if (i == 259) {
               this.O0000000000O();
               this.O0000000000OOO = false;
               return true;
            }
         }

         if (i == 259) {
            if (this.O0000000000OOO) {
               this.O0000000000O();
               this.O0000000000OOO = false;
            } else {
               this.O00000000000OO();
            }

            return true;
         } else if (i != 263 && i != 262) {
            return true;
         } else {
            this.O0000000000OOO = false;
            return true;
         }
      } else {
         this.O0000000000OO0 = false;
         this.O0000000000OOO = false;
         return true;
      }
   }

   public boolean O00000000(O0000O000O0O0 o0000O000O0O0, char c) {
      if (!this.O00000000(o0000O000O0O0)) {
         return false;
      } else if (this.O000000000O000) {
         if (c >= ' ' && c != 127 && this.O000000000O00O.length() < 40) {
            this.O000000000O00O = this.O000000000O00O + c;
         }

         return true;
      } else if (this.O000000000O0O) {
         if (c >= ' ' && c != 127 && this.O000000000O0O0.length() < 24) {
            this.O000000000O0O0 = this.O000000000O0O0 + c;
         }

         return true;
      } else if (!this.O0000000000OO0) {
         return false;
      } else {
         if (this.O0000000000OOO) {
            this.O0000000000O();
            this.O0000000000OOO = false;
         }

         this.O00000000(c);
         return true;
      }
   }

   private void O000000000000O() {
      File var1 = O00000O0OOO0OO.O00000000();
      if (var1 != null) {
         this.O00000000(O00000O0OOO0O.O00000000().O00000000(var1, this.O0000000000000));
      } else {
         O00000O0OOO0OO.O000000000();
         this.O00000000("Бросьте .zip в папку и нажмите обновить");
      }
   }

   private List<O00000O0OOO00O> O00000000000O() {
      List var1 = O00000O0OOO0O.O00000000().O00000000(this.O0000000000000);
      if (this.O0000000000OO.isEmpty()) {
         return var1;
      } else {
         String var2 = this.O0000000000OO.toLowerCase();
         ArrayList var3 = new ArrayList();

         for (O00000O0OOO00O var5 : (Iterable<O00000O0OOO00O>)var1) {
            String var6 = var5.O00000000000() == null ? "" : var5.O00000000000().toLowerCase();
            String var7 = var5.O00000000000O0() == null ? "" : var5.O00000000000O0().toLowerCase();
            String var8 = var5.O0000000000000() == null ? "" : var5.O0000000000000().toLowerCase();
            if (var6.contains(var2) || var7.contains(var2) || var8.contains(var2)) {
               var3.add(var5);
            }
         }

         return var3;
      }
   }

   private void O00000000(String string) {
      this.O00000000O000O = string == null ? "" : string;
      this.O00000000O00O = System.currentTimeMillis();
   }

   private String O00000000000(O00000O0OOO00O o00000O0OOO00O) {
      if (!this.O00000000O000O.isEmpty() && System.currentTimeMillis() - this.O00000000O00O < 4200L) {
         return this.O00000000O000O;
      } else if (o00000O0OOO00O == null) {
         return "Тяните — вращать · колесо — зум";
      } else {
         return o00000O0OOO00O.O0000000000000() != null && !o00000O0OOO00O.O0000000000000().isEmpty() ? "Автор: " + o00000O0OOO00O.O0000000000000() : "";
      }
   }

   private O0000O000O0O0O.W347 O00000000000O0() {
      return new O0000O000O0O0O.W347(this.O000000000, this.O0000000000, this.O00000000000, this.O000000000000);
   }

   private void O000000000(String string) {
      this.O00000000O000.put(string, System.currentTimeMillis());
   }

   private float O0000000000(String string) {
      Long var2 = this.O00000000O000.get(string);
      if (var2 == null) {
         return 1.0F;
      } else {
         float var3 = (float)(System.currentTimeMillis() - var2) / 320.0F;
         if (var3 >= 1.0F) {
            return 1.0F;
         } else {
            float var4 = (float)Math.exp(-var3 * 4.0);
            float var5 = (float)Math.cos(var3 * Math.PI * 2.2);
            return 1.0F - 0.14F * var4 * var5;
         }
      }
   }

   private boolean O00000000(RenderManager o0000O00OO0O0, String string, float f, float g) {
      float var5 = this.O0000000000(string);
      if (var5 > 0.999F && var5 < 1.001F) {
         return false;
      } else {
         o0000O00OO0O0.O00000000(var5, f, g);
         return true;
      }
   }

   private void O00000000(RenderManager o0000O00OO0O0, boolean bl) {
      if (bl) {
         o0000O00OO0O0.O00000000000O0();
      }
   }

   private void O00000000(char c) {
      if (c >= ' ' && c != 127 && this.O0000000000OO.length() < 48) {
         this.O0000000000OO = this.O0000000000OO + c;
         this.O000000000O.add(System.currentTimeMillis());
         this.O00000000000O = 0.0F;
      }
   }

   private void O00000000000OO() {
      if (!this.O0000000000OO.isEmpty()) {
         int var1 = this.O0000000000OO.length() - 1;
         this.O00000000(var1);
         this.O0000000000OO = this.O0000000000OO.substring(0, var1);
         if (var1 < this.O000000000O.size()) {
            this.O000000000O.remove(var1);
         }

         this.O00000000000O = 0.0F;
      }
   }

   private void O0000000000O() {
      for (int var1 = 0; var1 < this.O0000000000OO.length(); var1++) {
         this.O00000000(var1);
      }

      this.O0000000000OO = "";
      this.O000000000O.clear();
      this.O00000000000O = 0.0F;
   }

   private void O00000000(int i) {
      if (this.O00000000 != null && i >= 0 && i < this.O0000000000OO.length()) {
         O0000O000O0O0O.W347 var2 = this.O00000000(this.O00000000, this.O00000000000O0());
         float var3 = var2.x + this.O00000000.O00000000(26.0F) + O0000O00000OO.O00000000(FontRegistry.O00000000, this.O0000000000OO.substring(0, i), 10.0F);
         this.O000000000O0.add(new O0000O000O0O0O.W346(String.valueOf(this.O0000000000OO.charAt(i)), var3, System.currentTimeMillis()));
      }
   }

   private O0000O000O0O0O.W347 O00000000(O0000O00000 o0000O00000, O0000O000O0O0O.W347 o000000000) {
      float var3 = o0000O00000.O00000000(220.0F);
      float var4 = o0000O00000.O00000000(28.0F);
      float var5 = o000000000.x + o000000000.w - o0000O00000.O00000000(18.0F) - var3;
      return new O0000O000O0O0O.W347(var5, o000000000.y + (o0000O00000.O00000000(44.0F) - var4) * 0.5F, var3, var4);
   }

   private O0000O000O0O0O.W347 O000000000(O0000O00000 o0000O00000, O0000O000O0O0O.W347 o000000000) {
      float var3 = o0000O00000.O00000000(28.0F);
      float var4 = o000000000.y + o0000O00000.O00000000(44.0F) + (o0000O00000.O00000000(34.0F) - var3) * 0.5F;
      return new O0000O000O0O0O.W347(o000000000.x + o000000000.w - o0000O00000.O00000000(18.0F) - var3, var4, var3, var3);
   }

   private O0000O000O0O0O.W347 O0000000000(O0000O00000 o0000O00000, O0000O000O0O0O.W347 o000000000) {
      float var3 = o0000O00000.O00000000(28.0F);
      float var4 = o0000O00000.O00000000(86.0F);
      O0000O000O0O0O.W347 var5 = this.O000000000(o0000O00000, o000000000);
      return new O0000O000O0O0O.W347(var5.x - o0000O00000.O00000000(8.0F) - var4, var5.y, var4, var3);
   }

   private O0000O000O0O0O.W347 O00000000000(O0000O00000 o0000O00000, O0000O000O0O0O.W347 o000000000) {
      float var3 = o0000O00000.O00000000(18.0F);
      float var4 = o000000000.y + o0000O00000.O00000000(44.0F) + o0000O00000.O00000000(34.0F) + o0000O00000.O00000000(6.0F);
      return new O0000O000O0O0O.W347(o000000000.x + var3, var4, o000000000.w - var3 * 2.0F, o000000000.y + o000000000.h - var3 - var4);
   }

   private O0000O000O0O0O.W347 O000000000000(O0000O00000 o0000O00000, O0000O000O0O0O.W347 o000000000) {
      O0000O000O0O0O.W347 var3 = this.O00000000000(o0000O00000, o000000000);
      float var4 = O00000000(var3.w * 0.33F, o0000O00000.O00000000(280.0F), o0000O00000.O00000000(420.0F));
      return new O0000O000O0O0O.W347(var3.x + var3.w - var4, var3.y, var4, var3.h);
   }

   private O0000O000O0O0O.W347 O0000000000000(O0000O00000 o0000O00000, O0000O000O0O0O.W347 o000000000) {
      O0000O000O0O0O.W347 var3 = this.O00000000000(o0000O00000, o000000000);
      O0000O000O0O0O.W347 var4 = this.O000000000000(o0000O00000, o000000000);
      float var5 = var4.x - o0000O00000.O00000000(12.0F) - var3.x;
      return new O0000O000O0O0O.W347(var3.x, var3.y, var5, var3.h);
   }

   private O0000O000O0O0O.W347 O000000000000O(O0000O00000 o0000O00000, O0000O000O0O0O.W347 o000000000) {
      O0000O000O0O0O.W347 var3 = this.O000000000000(o0000O00000, o000000000);
      O0000O000O0O0O.W347 var4 = this.O00000000000O(o0000O00000, o000000000);
      float var5 = var3.y + o0000O00000.O00000000(34.0F);
      return new O0000O000O0O0O.W347(
         var3.x + o0000O00000.O00000000(10.0F),
         var5,
         var3.w - o0000O00000.O00000000(20.0F),
         Math.max(o0000O00000.O00000000(40.0F), var4.y - var5 - o0000O00000.O00000000(8.0F))
      );
   }

   private O0000O000O0O0O.W347 O00000000000O(O0000O00000 o0000O00000, O0000O000O0O0O.W347 o000000000) {
      O0000O000O0O0O.W347 var3 = this.O000000000000(o0000O00000, o000000000);
      float var4 = o0000O00000.O00000000(120.0F);
      return new O0000O000O0O0O.W347(
         var3.x + o0000O00000.O00000000(14.0F), var3.y + var3.h - o0000O00000.O00000000(12.0F) - var4, var3.w - o0000O00000.O00000000(28.0F), var4
      );
   }

   private O0000O000O0O0O.W347 O00000000000O0(O0000O00000 o0000O00000, O0000O000O0O0O.W347 o000000000) {
      O0000O000O0O0O.W347 var3 = this.O00000000000O(o0000O00000, o000000000);
      float var4 = o0000O00000.O00000000(28.0F);
      float var5 = var3.w * 0.6F;
      return new O0000O000O0O0O.W347(var3.x, var3.y + var3.h - var4, var5, var4);
   }

   private O0000O000O0O0O.W347 O00000000000OO(O0000O00000 o0000O00000, O0000O000O0O0O.W347 o000000000) {
      O0000O000O0O0O.W347 var3 = this.O00000000000O(o0000O00000, o000000000);
      O0000O000O0O0O.W347 var4 = this.O00000000000O0(o0000O00000, o000000000);
      float var5 = var3.w - var4.w - o0000O00000.O00000000(8.0F);
      return new O0000O000O0O0O.W347(var4.x + var4.w + o0000O00000.O00000000(8.0F), var4.y, var5, var4.h);
   }

   private O0000O000O0O0O.W347 O0000000000O(O0000O00000 o0000O00000, O0000O000O0O0O.W347 o000000000) {
      O0000O000O0O0O.W347 var3 = this.O00000000000O(o0000O00000, o000000000);
      return new O0000O000O0O0O.W347(var3.x, var3.y - o0000O00000.O00000000(2.0F), var3.w, o0000O00000.O00000000(16.0F));
   }

   private O0000O000O0O0O.W347 O0000000000O0(O0000O00000 o0000O00000, O0000O000O0O0O.W347 o000000000) {
      O0000O000O0O0O.W347 var3 = this.O00000000000O(o0000O00000, o000000000);
      return new O0000O000O0O0O.W347(var3.x, var3.y + o0000O00000.O00000000(58.0F), var3.w, o0000O00000.O00000000(16.0F));
   }

   private O0000O000O0O0O.W347 O00000000(O0000O00000 o0000O00000, float f, float g, float h, float i) {
      float var6 = o0000O00000.O00000000(28.0F);
      float var7 = o0000O00000.O00000000(15.0F);
      return new O0000O000O0O0O.W347(f + h - var6 - o0000O00000.O00000000(8.0F), g + i + (o0000O00000.O00000000(20.0F) - var7) * 0.5F, var6, var7);
   }

   private int O0000000000O00(O0000O00000 o0000O00000, O0000O000O0O0O.W347 o000000000) {
      return Math.max(3, Math.min(5, Math.round((o000000000.w - o0000O00000.O00000000(12.0F)) / o0000O00000.O00000000(132.0F))));
   }

   private static String O00000000(String string, int i) {
      if (string == null) {
         return "";
      } else {
         return string.length() <= i ? string : string.substring(0, i - 1) + "…";
      }
   }

   private static float O00000000(float f, float g, float h) {
      return f < g ? g : Math.min(f, h);
   }

   record W346(String ch, float x, long born) {
   }

   record W347(float x, float y, float w, float h) {

      boolean contains(float f, float g) {
         return f >= this.x && g >= this.y && f < this.x + this.w && g < this.y + this.h;
      }
   }
}
