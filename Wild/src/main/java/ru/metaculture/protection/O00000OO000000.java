package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.wild.module.api.Module;

final class O00000OO000000 {
   private static final float O00000000 = 20.0F;
   private static final float O000000000 = 8.0F;
   private static final float O0000000000 = 4.0F;
   private static final float O00000000000 = 20.0F;
   private static final float O000000000000 = 4.0F;
   private static final float O0000000000000 = 4.0F;
   private static final float O000000000000O = 4.0F;
   private final Category O00000000000O;
   private final O0000O00OOO0 O00000000000O0 = new O0000O00OOO0();
   private float O00000000000OO;
   private float O0000000000O;
   private float O0000000000O0;
   private float O0000000000O00;

   O00000OO000000(Category o0000000OO0O0O) {
      this.O00000000000O = o0000000OO0O0O;
   }

   void O00000000(float f, float g, float h, float i) {
      this.O00000000000OO = f;
      this.O0000000000O = g;
      this.O0000000000O0 = h;
      this.O0000000000O00 = i;
   }

   void O00000000(RenderManager o0000O00OO0O0, int i, int j, float f) {
      int var5 = RenderManager.W382.O0000000000O(RenderManager.W382.O000000000000(1, 1), (int)(30.0F * f));
      int var6 = RenderManager.W382.O0000000000O(RenderManager.W382.O0000000000(1, 1), (int)(160.0F * f));
      int var7 = RenderManager.W382.O0000000000O(RenderManager.W382.O00000000000(1, 1), (int)(190.0F * f));
      int var8 = RenderManager.W382.O0000000000O(RenderManager.W382.O0000000000000(1, 1), (int)(220.0F * f));
      int var9 = RenderManager.W382.O0000000000O(RenderManager.W382.O0000000000000(1, 1), (int)(90.0F * f));
      int var10 = RenderManager.W382.O0000000000O(RenderManager.W382.O000000000000O(1, 1), (int)(220.0F * f));
      if (O00000OO000O0O.O000000000000O.O0000000000()) {
         o0000O00OO0O0.O00000000(this.O00000000000OO, this.O0000000000O, this.O0000000000O0, this.O0000000000O00, 8.0F, f);
      }

      o0000O00OO0O0.O00000000(this.O00000000000OO, this.O0000000000O, this.O0000000000O0, this.O0000000000O00, 8.0F, var5, 1.0F);
      o0000O00OO0O0.O00000000(this.O00000000000OO, this.O0000000000O, this.O0000000000O0, this.O0000000000O00, 8.0F, var7);
      o0000O00OO0O0.O00000000(
         this.O00000000000OO,
         this.O0000000000O,
         this.O0000000000O0,
         20.0F,
         8.0F,
         8.0F,
         0.0F,
         0.0F,
         RenderManager.W382.O0000000000O(RenderManager.W382.O0000000000000(1, 1), (int)(15.0F * f))
      );
      o0000O00OO0O0.O00000000(
         FontRegistry.O00000000000, this.O00000000000OO + 4.0F + 5.0F, this.O0000000000O + 6.0F + 6.5F, 16.0F, this.O00000000000O.O000000000(), var10
      );
      o0000O00OO0O0.O00000000(
         FontRegistry.O000000000000, this.O00000000000OO + 4.0F + 100.0F, this.O0000000000O + 6.0F + 6.5F, 16.0F, this.O00000000000O.O00000000(), var10
      );
      float var11 = this.O00000000000OO + 4.0F;
      float var12 = this.O0000000000O + 20.0F + 4.0F;
      float var13 = this.O0000000000O0 - 8.0F;
      float var14 = this.O0000000000O00 - 20.0F - 8.0F;
      boolean var15 = O0000O00OO0OO0.O00000000(i, j, var11, var12, var13, var14);
      this.O00000000000O0.O00000000(var15);
      this.O00000000000O0.O00000000000(6.0F);
      List var16 = this.O00000000();
      float var17 = 0.0F;

      for (Module var19 : (List<Module>)var16) {
         O0000O00OOOOOO var20 = O00000OO00000.O00000000(var19);
         var20.O00000000();
         float var21 = O00000OO00000O.O00000000(o0000O00OO0O0, var19.O0000000000000(), var13 - 10.0F);
         float var22 = var21 > 0.0F ? var21 + 4.0F : 0.0F;
         float var23 = var22 * var20.O000000000000();
         var17 += 20.0F + var23 + 4.0F;
      }

      var17 = Math.max(0.0F, var17 - 4.0F);
      this.O00000000000O0.O00000000(var17, var14);
      this.O00000000000O0.O0000000000();
      o0000O00OO0O0.O00000000(var11, var12, var13, var14, 0.0F, 0.0F, 0.0F, 0.0F);
      float var41 = var12 + this.O00000000000O0.O00000000000O();

      for (Module var43 : (List<Module>)var16) {
         O0000O00OOOOOO var44 = O00000OO00000.O00000000(var43);
         float var45 = var44.O000000000000();
         float var46 = O00000OO00000O.O00000000(o0000O00OO0O0, var43.O0000000000000(), var13 - 10.0F);
         float var24 = var46 > 0.0F ? var46 + 4.0F : 0.0F;
         float var25 = var24 * var45;
         float var29 = 20.0F + var25;
         if (!(var41 + var29 < var12 - 20.0F) && !(var41 > var12 + var14 + 20.0F)) {
            int var30 = var43.O0000000000000 ? O0000O000OO000.O000000000000(var6, var8, 0.1F) : var6;
            o0000O00OO0O0.O00000000(var11, var41, var13, var29, 4.0F, var30);
            float var31 = var41 + 5.0F + 6.5F;
            o0000O00OO0O0.O00000000(FontRegistry.O00000000, var11 + 6.0F, var31, 13.0F, var43.O00000000000, var43.O0000000000000 ? var10 : var9);
            if (var43.O0000000000O || var43.O000000000000 != -1) {
               String var32 = var43.O0000000000O ? "..." : O0000O0O00OO0O.O000000000(var43.O000000000000);
               float var33 = RenderManager.O00000000(FontRegistry.O00000000, var32, 10.0F).O00000000 + 6.0F;
               float var34 = var11 + var13 - var33 - 16.0F;
               o0000O00OO0O0.O00000000(var34, var41 + 4.0F, var33, 10.0F, 3.0F, var6);
               o0000O00OO0O0.O00000000(FontRegistry.O00000000000, var34 + 3.0F, var41 + 4.0F + 6.8F, 10.0F, var32, var9);
            }

            if (!var43.O0000000000000().isEmpty()) {
               float var47 = var11 + var13 - 12.0F;
               float var49 = var31 + 1.0F;
               o0000O00OO0O0.O00000000(FontRegistry.O0000000000, var47, var49, 13.0F, "X", O0000O000OO000.O000000000000(var9, 0, var45));
            }

            if (var25 > 0.5F && var46 > 0.0F) {
               float var48 = var11 + 5.0F;
               float var50 = var41 + 20.0F + 2.0F;
               float var51 = var13 - 10.0F;
               o0000O00OO0O0.O00000000(var11, var41 + 20.0F, var13, var25, 0.0F, 0.0F, 4.0F, 4.0F);
               float var36 = 0.0F;

               for (Setting var38 : var43.O0000000000000()) {
                  if (!var38.O000000000.get()) {
                     float var39 = O00000OO00000O.O00000000(o0000O00OO0O0, var38, var48, var50 + var36, var51, i, j, f * var45, var5, var8, var9, var10, var6);
                     var36 += var39 + O00000OO00000O.O00000000();
                  }
               }

               o0000O00OO0O0.O0000000000000();
            }

            var41 += var29 + 4.0F;
         } else {
            var41 += var29 + 4.0F;
         }
      }

      o0000O00OO0O0.O0000000000000();
   }

   boolean O00000000(RenderManager o0000O00OO0O0, int i, int j, int k) {
      float var5 = this.O00000000000OO + 4.0F;
      float var6 = this.O0000000000O + 20.0F + 4.0F;
      float var7 = this.O0000000000O0 - 8.0F;
      float var8 = this.O0000000000O00 - 20.0F - 8.0F;
      if (!O0000O00OO0OO0.O00000000(i, j, var5, var6, var7, var8)) {
         return false;
      } else {
         List var9 = this.O00000000();
         float var10 = var6 + this.O00000000000O0.O00000000000O();

         for (Module var12 : (List<Module>)var9) {
            O0000O00OOOOOO var13 = O00000OO00000.O00000000(var12);
            float var14 = var13.O000000000000();
            float var15 = O00000OO00000O.O00000000(o0000O00OO0O0, var12.O0000000000000(), var7 - 10.0F);
            float var16 = var15 > 0.0F ? var15 + 4.0F : 0.0F;
            float var17 = var16 * var14;
            float var21 = 20.0F;
            if (O0000O00OO0OO0.O00000000(i, j, var5, var10, var7, var21)) {
               if (k == 1 && !var12.O0000000000000().isEmpty()) {
                  O00000OO00000.O000000000(var12);
                  return true;
               }

               if (k == 2) {
                  if (O00000OO000O0O.O000000000O0O0 != null && O00000OO000O0O.O000000000O0O0 != var12) {
                     O00000OO000O0O.O000000000O0O0.O0000000000O = false;
                  }

                  var12.O0000000000O = !var12.O0000000000O;
                  O00000OO000O0O.O000000000O0O0 = var12.O0000000000O ? var12 : null;
                  return true;
               }

               if (k == 0) {
                  var12.a_();
                  return true;
               }
            }

            if (var17 > 0.5F) {
               float var22 = var5 + 5.0F;
               float var23 = var10 + 20.0F + 2.0F;
               float var24 = var7 - 10.0F;
               float var25 = 0.0F;

               for (Setting var27 : var12.O0000000000000()) {
                  if (!var27.O000000000.get()) {
                     float var28 = O00000OO00000O.O00000000(o0000O00OO0O0, var27, var24);
                     if (O00000OO00000O.O00000000(o0000O00OO0O0, var27, var22, var23 + var25, var24, i, j, k)) {
                        return true;
                     }

                     var25 += var28 + O00000OO00000O.O00000000();
                  }
               }
            }

            float var29 = 20.0F + var17;
            var10 += var29 + 4.0F;
         }

         return false;
      }
   }

   boolean O00000000(float f, float g, double d) {
      float var5 = this.O00000000000OO + 4.0F;
      float var6 = this.O0000000000O + 20.0F + 4.0F;
      float var7 = this.O0000000000O0 - 8.0F;
      float var8 = this.O0000000000O00 - 20.0F - 8.0F;
      if (O0000O00OO0OO0.O00000000(f, g, var5, var6, var7, var8)) {
         this.O00000000000O0.O00000000(d);
         return true;
      } else {
         return false;
      }
   }

   private List<Module> O00000000() {
      if (WildClient.O00000000.O000000000 == null) {
         return Collections.emptyList();
      } else {
         ArrayList var1 = WildClient.O00000000.O000000000.O00000000(this.O00000000000O);
         String var2 = O00000OO000O0O.O000000000OO00 == null ? "" : O00000OO000O0O.O000000000OO00.trim().toLowerCase();
         return (List<Module>)(var2.isEmpty()
            ? var1
            : var1.stream().filter(module -> ((Module)module).O00000000000 != null && ((Module)module).O00000000000.toLowerCase().contains(var2)).toList());
      }
   }
}
