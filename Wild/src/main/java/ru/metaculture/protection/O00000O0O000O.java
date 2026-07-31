package ru.metaculture.protection;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.HungerManager;

public final class O00000O0O000O {
   private static final O00000O0O000O O00000000 = new O00000O0O000O();
   private final O0000O00O0OO O000000000 = new O0000O00O0OO();
   private final O0000O00O0OO O0000000000 = new O0000O00O0OO();
   private final O0000O00O0OO O00000000000 = new O0000O00O0OO();
   private final O0000O00O0OO O000000000000 = new O0000O00O0OO();
   private final O0000O00O0OO O0000000000000 = new O0000O00O0OO();
   private final O0000O00O0OO O000000000000O = new O0000O00O0OO();
   private final O0000O00O0OO O00000000000O = new O0000O00O0OO();
   private float O00000000000O0 = -1.0F;
   private long O00000000000OO;
   private boolean O0000000000O;

   public static O00000O0O000O O00000000() {
      return O00000000;
   }

   public void O00000000(RenderManager o0000O00OO0O0, HudElement o00000O00OO00O, float f, float g, float h, float i, float j, float k) {
      MinecraftClient var9 = MinecraftClient.getInstance();
      if (var9 != null && var9.player != null && var9.world != null) {
         ClientPlayerEntity var10 = var9.player;
         boolean var11 = HotbarHud.O000000000().O00000000.O000000000("Здоровье");
         boolean var12 = HotbarHud.O000000000().O00000000.O000000000("Голод");
         boolean var13 = HotbarHud.O000000000().O00000000.O000000000("Броня");
         boolean var14 = HotbarHud.O000000000().O00000000.O000000000("Воздух");
         boolean var15 = HotbarHud.O000000000().O00000000.O000000000("Поглощение");
         if (var11 || var12 || var13 || var14) {
            float var16;
            try {
               var16 = (float)var10.getAttributeValue(EntityAttributes.MAX_HEALTH);
            } catch (Throwable var53) {
               var16 = 20.0F;
            }

            if (var16 <= 0.0F || Float.isNaN(var16) || Float.isInfinite(var16)) {
               var16 = 20.0F;
            }

            float var17 = 0.0F;
            float var18 = 0.0F;

            try {
               var17 = var10.getHealth();
               var18 = var10.getAbsorptionAmount();
            } catch (Throwable var52) {
            }

            float var19 = Math.max(0.0F, Math.min(var16, var17));
            float var20 = Math.max(0.0F, var18);
            float var21 = 20.0F;
            HungerManager var22 = var10.getHungerManager();
            float var23 = var22 == null ? 20.0F : Math.max(0.0F, Math.min(var21, (float)var22.getFoodLevel()));
            int var24 = 0;

            try {
               var24 = var10.getArmor();
            } catch (Throwable var51) {
            }

            float var25 = 20.0F;
            int var26 = 0;
            int var27 = 300;

            try {
               var26 = var10.getAir();
               int var28 = var10.getMaxAir();
               if (var28 > 0) {
                  var27 = var28;
               }
            } catch (Throwable var50) {
            }

            boolean var54 = var26 >= var27;
            float var29 = Math.min(i, j);
            if (!this.O0000000000O) {
               this.O000000000.O0000000000000(var19);
               this.O0000000000.O0000000000000(var23);
               this.O00000000000.O0000000000000(var24);
               this.O000000000000.O0000000000000(var20);
               this.O0000000000000.O0000000000000(var26);
               this.O00000000000O.O0000000000000(var24 > 0 ? 1.0 : 0.0);
               this.O000000000000O.O0000000000000(var54 ? 0.0 : 1.0);
               this.O00000000000O0 = var19;
               this.O0000000000O = true;
            }

            if (this.O00000000000O0 >= 0.0F && var19 < this.O00000000000O0 - 0.05F) {
               this.O00000000000OO = System.currentTimeMillis();
            }

            this.O00000000000O0 = var19;
            this.O000000000.O00000000();
            this.O000000000.O00000000(var19, 0.22, O0000O00O0OO0O.O0000000000O, true);
            this.O0000000000.O00000000();
            this.O0000000000.O00000000(var23, 0.22, O0000O00O0OO0O.O0000000000O, true);
            this.O00000000000.O00000000();
            this.O00000000000.O00000000(var24, 0.22, O0000O00O0OO0O.O0000000000O, true);
            this.O000000000000.O00000000();
            this.O000000000000.O00000000(var20, 0.22, O0000O00O0OO0O.O0000000000O, true);
            this.O0000000000000.O00000000();
            this.O0000000000000.O00000000(var26, 0.18, O0000O00O0OO0O.O0000000000O, true);
            this.O00000000000O.O00000000();
            this.O00000000000O.O00000000(var24 > 0 ? 1.0 : 0.0, 0.3, O0000O00O0OO0O.O0000000000O0O, true);
            this.O000000000000O.O00000000();
            this.O000000000000O.O00000000(var54 ? 0.0 : 1.0, 0.3, O0000O00O0OO0O.O0000000000O0O, true);
            float var30 = 6.0F * var29;
            float var31 = (h - var30) * 0.5F;
            float var32 = 12.0F * var29;
            float var33 = 4.0F * var29;
            float var34 = g - var33 - var32;
            boolean var35 = var13 && this.O00000000000O.O000000000000() > 0.01F || var14 && this.O000000000000O.O000000000000() > 0.01F;
            float var36 = var34 - var33 - var32;
            long var37 = System.currentTimeMillis();
            float var39 = 0.0F;
            if (var11 && var19 / Math.max(1.0F, var16) < 0.2F && var19 > 0.0F && MenuModule.O00000000(MenuModule.O00000000O0O)) {
               var39 = (float)Math.sin(var37 / 90.0) * 1.2F * var29;
            }

            boolean var40 = var10.hasStatusEffect(StatusEffects.REGENERATION);
            float var41 = 0.0F;
            if (var11 && var40 && MenuModule.O00000000(MenuModule.O00000000O00OO)) {
               var41 = 0.5F + 0.5F * (float)Math.sin(var37 / 230.0);
            }

            float var42 = 0.0F;
            if (var11 && MenuModule.O00000000(MenuModule.O00000000O00O0)) {
               long var43 = var37 - this.O00000000000OO;
               if (this.O00000000000OO > 0L && var43 < 180L) {
                  var42 = 1.0F - (float)var43 / 180.0F;
               }
            }

            float var55 = 0.0F;
            if (var12 && var23 / var21 < 0.3F && var23 > 0.0F && MenuModule.O00000000(MenuModule.O00000000O00O)) {
               var55 = 0.4F + 0.6F * (float)Math.sin(var37 / 200.0);
            }

            if (var11) {
               float var44 = this.O000000000.O000000000000() / Math.max(1.0F, var16);
               float var45 = this.O000000000000.O000000000000() / Math.max(1.0F, var16);
               int var46 = O0000O000OO000.O0000000000(255, 90, 96, (int)(255.0F * k));
               int var47 = O0000O000OO000.O0000000000(220, 36, 50, (int)(255.0F * k));
               if (var41 > 0.0F) {
                  int var48 = O0000O000OO000.O0000000000(255, 220, 110, (int)(255.0F * k));
                  var46 = O00000000(var46, var48, var41 * 0.55F);
                  var47 = O00000000(var47, var48, var41 * 0.55F);
               }

               this.O00000000(o0000O00OO0O0, o00000O00OO00O, f + var39, var34, var31, var32, var44, 10, var46, var47, k, var29);
               if (var42 > 0.0F) {
                  int var69 = O0000O000OO000.O0000000000(255, 250, 250, (int)(220.0F * var42 * k));
                  o0000O00OO0O0.O00000000(f + var39, var34, var31, var32, var32 * 0.45F, var69);
               }

               if (var15 && var45 > 0.001F) {
                  int var70 = O0000O000OO000.O0000000000(255, 220, 110, (int)(220.0F * k));
                  int var49 = O0000O000OO000.O0000000000(255, 180, 60, (int)(220.0F * k));
                  this.O0000000000(o0000O00OO0O0, o00000O00OO00O, f + var39, var34, var31, var32, var45, 10, var70, var49, 0.92F, var29);
               }
            }

            if (var12) {
               float var56 = this.O0000000000.O000000000000() / var21;
               int var59 = O0000O000OO000.O0000000000(220, 158, 92, (int)(255.0F * k));
               int var62 = O0000O000OO000.O0000000000(150, 92, 44, (int)(255.0F * k));
               if (var55 > 0.0F) {
                  int var65 = O0000O000OO000.O0000000000(255, 120, 60, (int)(255.0F * k));
                  var59 = O00000000(var59, var65, var55 * 0.6F);
                  var62 = O00000000(var62, var65, var55 * 0.6F);
               }

               float var66 = f + var31 + var30;
               this.O00000000(o0000O00OO0O0, o00000O00OO00O, var66, var34, var31, var32, var56, 10, var59, var62, k, var29);
            }

            if (var35) {
               if (var13 && this.O00000000000O.O000000000000() > 0.01F) {
                  float var57 = this.O00000000000O.O000000000000();
                  float var60 = this.O00000000000.O000000000000() / var25;
                  int var63 = O0000O000OO000.O0000000000(180, 200, 230, (int)(255.0F * k * var57));
                  int var67 = O0000O000OO000.O0000000000(110, 130, 170, (int)(255.0F * k * var57));
                  this.O00000000(
                     o0000O00OO0O0, o00000O00OO00O, f, var36 + (1.0F - var57) * var32 * 0.5F, var31, var32, var60, 10, var63, var67, k * var57, var29
                  );
               }

               if (var14 && this.O000000000000O.O000000000000() > 0.01F) {
                  float var58 = this.O000000000000O.O000000000000();
                  float var61 = this.O0000000000000.O000000000000() / Math.max(1.0F, (float)var27);
                  int var64 = O0000O000OO000.O0000000000(120, 200, 255, (int)(255.0F * k * var58));
                  int var68 = O0000O000OO000.O0000000000(60, 130, 220, (int)(255.0F * k * var58));
                  float var71 = f + var31 + var30;
                  this.O00000000(
                     o0000O00OO0O0, o00000O00OO00O, var71, var36 + (1.0F - var58) * var32 * 0.5F, var31, var32, var61, 10, var64, var68, k * var58, var29
                  );
               }
            }
         }
      }
   }

   private void O00000000(
      RenderManager o0000O00OO0O0, HudElement o00000O00OO00O, float f, float g, float h, float i, float j, int k, int l, int m, float n, float o
   ) {
      j = Math.max(0.0F, Math.min(1.0F, j));
      float var13 = i * 0.45F;
      if (o00000O00OO00O.O0000000000O()) {
         this.O000000000(o0000O00OO0O0, o00000O00OO00O, f, g, h, i, j, k, l, m, n, o);
      } else {
         if (o00000O00OO00O.O0000000000O0() || o00000O00OO00O.O0000000000O00()) {
            o00000O00OO00O.O000000000(o0000O00OO0O0, f, g, h, i, var13, n);
         } else if (o00000O00OO00O.O00000000000()) {
            o0000O00OO0O0.O00000000(f, g, h, i, var13, (o00000O00OO00O.O0000000000O0O() ? 6.0F : 4.0F) * o, 1.0F, o00000O00OO00O.O0000000000O(n));
            int var14 = o00000O00OO00O.O00000000(n);
            o0000O00OO0O0.O00000000(f, g, h, i, var13, var14);
            if (o00000O00OO00O.O000000000000()) {
               o0000O00OO0O0.O00000000(f, g, h, i, var13, o00000O00OO00O.O00000000000(n), o00000O00OO00O.O0000000000());
            }
         } else {
            int var26 = o00000O00OO00O.O00000000(n);
            o0000O00OO0O0.O00000000(f, g, h, i, var13, var26);
            if (o00000O00OO00O.O000000000000()) {
               o0000O00OO0O0.O00000000(f, g, h, i, var13, o00000O00OO00O.O00000000000(n), o00000O00OO00O.O0000000000());
            }
         }

         float var27 = 1.5F * o;
         float var15 = (h - var27 * (k - 1)) / k;
         float var16 = i - 4.0F * o;
         float var17 = g + (i - var16) * 0.5F;
         float var18 = var16 * 0.4F;
         float var19 = j * k;

         for (int var20 = 0; var20 < k; var20++) {
            float var21 = f + var20 * (var15 + var27);
            float var22 = Math.max(0.0F, Math.min(1.0F, var19 - var20));
            int var23 = o00000O00OO00O.O000000000(o00000O00OO00O.O00000000000OO(n));
            o0000O00OO0O0.O00000000(var21, var17, var15, var16, var18, var23);
            if (var22 > 0.01F) {
               float var24 = var15 * var22;
               o0000O00OO0O0.O00000000(var21, var17, var24, var16, var18, m, l);
            }
         }

         o0000O00OO0O0.O0000000000();
      }
   }

   private void O000000000(
      RenderManager o0000O00OO0O0, HudElement o00000O00OO00O, float f, float g, float h, float i, float j, int k, int l, int m, float n, float o
   ) {
      float var13 = i * 0.5F;
      o00000O00OO00O.O000000000(o0000O00OO0O0, f, g, h, i, var13, n);
      float var14 = Math.max(1.5F * o, 1.0F);
      float var15 = f + var14;
      float var16 = g + var14;
      float var17 = Math.max(1.0F, h - var14 * 2.0F);
      float var18 = Math.max(1.0F, i - var14 * 2.0F);
      float var19 = var17 * j;
      float var20 = var18 * 0.5F;
      if (var19 > 0.5F) {
         o0000O00OO0O0.O00000000(var15, var16, var17, var18, var20, var20, var20, var20);
         o0000O00OO0O0.O00000000(var15, var16, var19, var18, var20, m, l);
         o0000O00OO0O0.O00000000(
            var15 + var20 * 0.6F,
            var16 + var18 * 0.16F,
            Math.max(0.0F, var19 - var20),
            Math.max(1.0F, var18 * 0.22F),
            var18 * 0.11F,
            O0000O000OO000.O0000000000(255, 255, 255, (int)(48.0F * n))
         );
         o0000O00OO0O0.O0000000000000();
      }

      float var21 = var17 / Math.max(1, k);
      int var22 = O0000O000OO000.O00000000(o00000O00OO00O.O00000000000O(1.0F), (int)(36.0F * n));

      for (int var23 = 1; var23 < k; var23++) {
         float var24 = var15 + var21 * var23;
         o0000O00OO0O0.O00000000(var24 - 0.35F * o, var16 + var18 * 0.18F, 0.7F * o, var18 * 0.64F, 0.35F * o, var22);
      }

      o0000O00OO0O0.O0000000000();
   }

   private void O0000000000(
      RenderManager o0000O00OO0O0, HudElement o00000O00OO00O, float f, float g, float h, float i, float j, int k, int l, int m, float n, float o
   ) {
      j = Math.max(0.0F, Math.min(1.0F, j));
      if (o00000O00OO00O.O0000000000O()) {
         float var25 = Math.max(2.6F * o, 1.5F);
         float var26 = f + var25;
         float var27 = g + var25;
         float var28 = Math.max(1.0F, h - var25 * 2.0F);
         float var29 = Math.max(1.0F, i - var25 * 2.0F);
         float var30 = var28 * j;
         if (var30 > 0.5F) {
            o0000O00OO0O0.O00000000(var26, var27, var28, var29, var29 * 0.5F, var29 * 0.5F, var29 * 0.5F, var29 * 0.5F);
            int var31 = O0000O000OO000.O00000000(l, (int)(O0000O000OO000.O00000000(l) * n));
            int var32 = O0000O000OO000.O00000000(m, (int)(O0000O000OO000.O00000000(m) * n));
            o0000O00OO0O0.O00000000(var26, var27, var30, var29, var29 * 0.5F, var32, var31);
            o0000O00OO0O0.O0000000000000();
         }

         o0000O00OO0O0.O0000000000();
      } else {
         float var13 = 1.5F * o;
         float var14 = (h - var13 * (k - 1)) / k;
         float var15 = i - 4.0F * o;
         float var16 = g + (i - var15) * 0.5F;
         float var17 = var15 * 0.4F;
         float var18 = j * k;

         for (int var19 = 0; var19 < k; var19++) {
            float var20 = Math.max(0.0F, Math.min(1.0F, var18 - var19));
            if (!(var20 <= 0.01F)) {
               float var21 = f + var19 * (var14 + var13);
               int var22 = O0000O000OO000.O00000000(l, (int)(O0000O000OO000.O00000000(l) * n));
               int var23 = O0000O000OO000.O00000000(m, (int)(O0000O000OO000.O00000000(m) * n));
               o0000O00OO0O0.O00000000(var21, var16, var14 * var20, var15, var17, var23, var22);
            }
         }

         o0000O00OO0O0.O0000000000();
      }
   }

   private static int O00000000(int i, int j, float f) {
      f = Math.max(0.0F, Math.min(1.0F, f));
      int var3 = i >>> 24 & 0xFF;
      int var4 = i >>> 16 & 0xFF;
      int var5 = i >>> 8 & 0xFF;
      int var6 = i & 0xFF;
      int var7 = j >>> 24 & 0xFF;
      int var8 = j >>> 16 & 0xFF;
      int var9 = j >>> 8 & 0xFF;
      int var10 = j & 0xFF;
      int var11 = Math.round(var3 + (var7 - var3) * f);
      int var12 = Math.round(var4 + (var8 - var4) * f);
      int var13 = Math.round(var5 + (var9 - var5) * f);
      int var14 = Math.round(var6 + (var10 - var6) * f);
      return (var11 & 0xFF) << 24 | (var12 & 0xFF) << 16 | (var13 & 0xFF) << 8 | var14 & 0xFF;
   }
}
