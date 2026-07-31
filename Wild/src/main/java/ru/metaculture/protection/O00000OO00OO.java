package ru.metaculture.protection;

import java.util.List;
import java.util.stream.Collectors;
import org.wild.module.api.Module;

public class O00000OO00OO extends O00000OO000O0O {
   public static boolean O00000000(RenderManager o0000O00OO0O0, int i, int j, int k) {
      float var4 = O00000OO000O0O.O00000000O000 + 104.735F;
      float var5 = O00000OO000O0O.O00000000O0000 + 34.025F;
      float var6 = 261.5F;
      float var7 = 209.5F;
      float var8 = var4 + 5.0F;
      float var9 = var5 + 5.0F;
      float var10 = var6 - 10.0F;
      float var11 = var7 - 10.0F;
      if (!O00000OO00OOO.O00000000(i, j, var8, var9, var10, var11)) {
         return false;
      } else {
         List var12 = O00000OO000O0O.O00000000O0OO0;
         if (O00000OO000O0O.O000000000OO0O && !O00000OO000O0O.O000000000OO00.isEmpty()) {
            String var13 = O00000OO000O0O.O000000000OO00.toLowerCase().trim();
            var12 = O00000OO000O0O.O00000000O0OO0.stream().filter(module -> module.O00000000000.toLowerCase().contains(var13)).collect(Collectors.toList());
         }

         int var35 = 1;
         float var14 = O00000OO000O0O.O00000000().O00000000000O();
         float var15 = 0.0F;
         float var16 = 0.0F;

         for (Module var18 : (Iterable<Module>)var12) {
            float var19 = 12.0F;
            if (O00000OO000O0O.O00000000O0OOO.contains(var18)) {
               for (Setting var21 : var18.O0000000000000()) {
                  var19 += O00000OO00OOOO.O00000000(o0000O00OO0O0, var21);
               }

               var19 = Math.max(var19, 20.0F);
            }

            if (var35 % 2 == 0) {
               float var37 = var14 + var16 - 30.0F;
               float var39 = O00000OO000O0O.O00000000O000 + 238.35F;
               float var40 = O00000OO000O0O.O00000000O0000 + 43.365F + var37;
               float var41 = 121.47F;
               float var42 = 21.325F;
               if (O00000OO000O0O.O00000000O0OOO.contains(var18) && k == 0) {
                  float var44 = O00000OO000O0O.O00000000O0000 + 64.69F + var37 + 4.0F;
                  float var47 = O00000OO000O0O.O00000000O000 + 238.35F + 9.0F;
                  float var50 = 105.47F;
                  float var53 = 0.0F;

                  for (Setting var59 : var18.O0000000000000()) {
                     float var62 = var44 + var53;
                     if (O00000OO00OO0.O00000000(o0000O00OO0O0, var59, var47, var62, var50, i, j, k)) {
                        return true;
                     }

                     var53 += O00000OO00OOOO.O00000000(o0000O00OO0O0, var59) + 1.0F;
                  }
               }

               if (O00000OO000O0O.O00000000O0OOO.contains(var18)) {
                  var16 += var19;
               }

               if (O00000OO00OOO.O00000000(i, j, var39, var40, var41, var42) && k == 0) {
                  var18.a_();
               }

               if (O00000OO00OOO.O00000000(i, j, var39, var40, var41, var42) && k == 1 && !var18.O0000000000000().isEmpty()) {
                  if (O00000OO000O0O.O00000000O0OOO.contains(var18)) {
                     O00000OO000O0O.O00000000O0OOO.remove(var18);
                     O00000OO000O0O.O00000000(var18).O00000000(0.0, 0.6F, O0000O0O00.O0000000000O0O);
                     O00000OO000O0O.O000000000(var18).O00000000(0.0, 0.16F, O0000O0O00.O000000000O00);
                     if (O00000OO000O0O.O0000000000OO != null && var18.O0000000000000().contains(O00000OO000O0O.O0000000000OO)) {
                        O00000OO000O0O.O0000000000000.O000000000(O0000O00OOO0OO.BACKWARDS);
                        O00000OO000O0O.O0000000000OO = null;
                        O00000OO000O0O.O0000000000OO0 = 0.0F;
                        O00000OO000O0O.O0000000000OOO = 0.0F;
                     }
                  } else {
                     O00000OO000O0O.O00000000O0OOO.add(var18);
                     O00000OO000O0O.O000000000(var18).O00000000(1.0, 0.16F, O0000O0O00.O000000000O00);
                     O00000OO000O0O.O00000000(var18).O00000000(1.0, 0.6F, O0000O0O00.O0000000000O0O);
                  }
               }

               if (O00000OO00OOO.O00000000(i, j, var39, var40, var41, var42) && k == 2) {
                  if (var18.O0000000000O) {
                     var18.O0000000000O = false;
                     O00000OO000O0O.O000000000O0O0 = null;
                     O00000OO000O0O.O0000000000(var18).O00000000(0.0, 0.2F, O0000O0O00.O000000000O00);
                  } else {
                     if (O00000OO000O0O.O000000000O0O0 != null) {
                        O00000OO000O0O.O000000000O0O0.O0000000000O = false;
                        O00000OO000O0O.O0000000000(O00000OO000O0O.O000000000O0O0).O00000000(0.0, 0.2F, O0000O0O00.O000000000O00);
                     }

                     O00000OO000O0O.O000000000O0O0 = var18;
                     var18.O0000000000O = true;
                     O00000OO000O0O.O0000000000(var18).O00000000(1.0, 0.2F, O0000O0O00.O000000000O00);
                  }

                  return true;
               }

               if (var18.O0000000000O || var18.O000000000000 != -1) {
                  float var45 = O00000OO000O0O.O00000000O000 + 247.895F;
                  float var48 = O00000OO000O0O.O00000000O0000 + 49.555F + var37;
                  float var51 = RenderManager.O00000000(FontRegistry.O00000000, var18.O00000000000, 14.0F).O00000000;
                  float var54 = var45 + var51 + 4.0F;
                  float var57 = var48 - 1.0F;
                  String var60 = var18.O0000000000O ? "..." : O0000O000OO0O0.O00000000(var18.O000000000000);
                  float var63 = RenderManager.O00000000(FontRegistry.O00000000, var60, 12.0F).O00000000;
                  float var64 = 16.0F;
                  float var65 = Math.max(var64, var63 + 8.0F);
                  if (O00000OO00OOO.O00000000(i, j, var54, var57, var65, 16.0F)) {
                     if (k == 2) {
                        if (var18.O0000000000O) {
                           var18.O0000000000O = false;
                           O00000OO000O0O.O000000000O0O0 = null;
                           O00000OO000O0O.O0000000000(var18).O00000000(0.0, 0.2F, O0000O0O00.O000000000O00);
                        } else {
                           if (O00000OO000O0O.O000000000O0O0 != null) {
                              O00000OO000O0O.O000000000O0O0.O0000000000O = false;
                              O00000OO000O0O.O0000000000(O00000OO000O0O.O000000000O0O0).O00000000(0.0, 0.2F, O0000O0O00.O000000000O00);
                           }

                           O00000OO000O0O.O000000000O0O0 = var18;
                           var18.O0000000000O = true;
                           O00000OO000O0O.O0000000000(var18).O00000000(1.0, 0.2F, O0000O0O00.O000000000O00);
                        }

                        return true;
                     }

                     if (var18.O0000000000O && k >= 0 && k <= 8) {
                        int var66 = -100 - k;
                        var18.O000000000000 = var66;
                        var18.O0000000000O = false;
                        O00000OO000O0O.O000000000O0O0 = null;
                        O00000OO000O0O.O0000000000(var18).O00000000(1.0, 0.2F, O0000O0O00.O000000000O00);
                        return true;
                     }
                  }
               }
            } else {
               float var36 = var14 + var15;
               float var38 = O00000OO000O0O.O00000000O000 + 111.885F;
               float var22 = O00000OO000O0O.O00000000O0000 + 43.365F + var36;
               float var23 = 121.47F;
               float var24 = 21.325F;
               if (O00000OO000O0O.O00000000O0OOO.contains(var18) && k == 0) {
                  float var25 = O00000OO000O0O.O00000000O0000 + 64.69F + var36 + 4.0F;
                  float var26 = O00000OO000O0O.O00000000O000 + 111.885F + 9.0F;
                  float var27 = 105.47F;
                  float var28 = 0.0F;

                  for (Setting var30 : var18.O0000000000000()) {
                     float var31 = var25 + var28;
                     if (O00000OO00OO0.O00000000(o0000O00OO0O0, var30, var26, var31, var27, i, j, k)) {
                        return true;
                     }

                     var28 += O00000OO00OOOO.O00000000(o0000O00OO0O0, var30) + 1.0F;
                  }
               }

               if (O00000OO000O0O.O00000000O0OOO.contains(var18)) {
                  var15 += var19;
               }

               if (var18.O0000000000O || var18.O000000000000 != -1) {
                  float var43 = O00000OO000O0O.O00000000O000 + 121.425F;
                  float var46 = O00000OO000O0O.O00000000O0000 + 49.555F + var36;
                  float var49 = RenderManager.O00000000(FontRegistry.O00000000, var18.O00000000000, 14.0F).O00000000;
                  float var52 = var43 + var49 + 4.0F;
                  float var55 = var46 - 1.0F;
                  String var58 = var18.O0000000000O ? "..." : O0000O000OO0O0.O00000000(var18.O000000000000);
                  float var61 = RenderManager.O00000000(FontRegistry.O00000000, var58, 12.0F).O00000000;
                  float var32 = 16.0F;
                  float var33 = Math.max(var32, var61 + 8.0F);
                  if (O00000OO00OOO.O00000000(i, j, var52, var55, var33, 16.0F)) {
                     if (k == 2) {
                        if (var18.O0000000000O) {
                           var18.O0000000000O = false;
                           O00000OO000O0O.O000000000O0O0 = null;
                           O00000OO000O0O.O0000000000(var18).O00000000(0.0, 0.2F, O0000O0O00.O000000000O00);
                        } else {
                           if (O00000OO000O0O.O000000000O0O0 != null) {
                              O00000OO000O0O.O000000000O0O0.O0000000000O = false;
                              O00000OO000O0O.O0000000000(O00000OO000O0O.O000000000O0O0).O00000000(0.0, 0.2F, O0000O0O00.O000000000O00);
                           }

                           O00000OO000O0O.O000000000O0O0 = var18;
                           var18.O0000000000O = true;
                           O00000OO000O0O.O0000000000(var18).O00000000(1.0, 0.2F, O0000O0O00.O000000000O00);
                        }

                        return true;
                     }

                     if (var18.O0000000000O && k >= 0 && k <= 8) {
                        int var34 = -100 - k;
                        var18.O000000000000 = var34;
                        var18.O0000000000O = false;
                        O00000OO000O0O.O000000000O0O0 = null;
                        O00000OO000O0O.O0000000000(var18).O00000000(1.0, 0.2F, O0000O0O00.O000000000O00);
                        return true;
                     }
                  }
               }

               if (O00000OO00OOO.O00000000(i, j, var38, var22, var23, var24) && k == 0) {
                  var18.a_();
               }

               if (O00000OO00OOO.O00000000(i, j, var38, var22, var23, var24) && k == 1 && !var18.O0000000000000().isEmpty()) {
                  if (O00000OO000O0O.O00000000O0OOO.contains(var18)) {
                     O00000OO000O0O.O00000000O0OOO.remove(var18);
                     O00000OO000O0O.O00000000(var18).O00000000(0.0, 0.6F, O0000O0O00.O0000000000O0O);
                     O00000OO000O0O.O000000000(var18).O00000000(0.0, 0.16F, O0000O0O00.O000000000O00);
                     if (O00000OO000O0O.O0000000000OO != null && var18.O0000000000000().contains(O00000OO000O0O.O0000000000OO)) {
                        O00000OO000O0O.O0000000000000.O000000000(O0000O00OOO0OO.BACKWARDS);
                        O00000OO000O0O.O0000000000OO = null;
                        O00000OO000O0O.O0000000000OO0 = 0.0F;
                        O00000OO000O0O.O0000000000OOO = 0.0F;
                     }
                  } else {
                     O00000OO000O0O.O00000000O0OOO.add(var18);
                     O00000OO000O0O.O000000000(var18).O00000000(1.0, 0.16F, O0000O0O00.O000000000O00);
                     O00000OO000O0O.O00000000(var18).O00000000(1.0, 0.6F, O0000O0O00.O0000000000O0O);
                  }
               }

               if (O00000OO00OOO.O00000000(i, j, var38, var22, var23, var24) && k == 2) {
                  if (var18.O0000000000O) {
                     var18.O0000000000O = false;
                     O00000OO000O0O.O000000000O0O0 = null;
                     O00000OO000O0O.O0000000000(var18).O00000000(0.0, 1.0, O0000O0O00.O000000000O00);
                  } else {
                     if (O00000OO000O0O.O000000000O0O0 != null) {
                        O00000OO000O0O.O000000000O0O0.O0000000000O = false;
                        O00000OO000O0O.O0000000000(O00000OO000O0O.O000000000O0O0).O00000000(0.0, 1.0, O0000O0O00.O000000000O00);
                     }

                     O00000OO000O0O.O000000000O0O0 = var18;
                     var18.O0000000000O = true;
                     O00000OO000O0O.O0000000000(var18).O00000000(1.0, 1.0, O0000O0O00.O000000000O00);
                  }

                  return true;
               }

               var14 += 30.325F;
            }

            var35++;
         }

         return false;
      }
   }

   public static float[] O00000000(RenderManager o0000O00OO0O0, ColorSetting o0000000OOOO0O) {
      if (o0000000OOOO0O == null) {
         return null;
      } else {
         int var2 = 1;
         float var3 = O00000OO000O0O.O00000000().O00000000000O();
         float var4 = 0.0F;
         float var5 = 0.0F;

         for (Module var7 : O00000OO000O0O.O00000000O0OO0) {
            float var8 = 12.0F;
            if (O00000OO000O0O.O00000000O0OOO.contains(var7)) {
               for (Setting var10 : var7.O0000000000000()) {
                  var8 += O00000OO00OOOO.O00000000(o0000O00OO0O0, var10);
               }

               var8 = Math.max(var8, 20.0F);
            }

            if (var2 % 2 == 0) {
               float var19 = var3 + var5 - 30.0F;
               if (O00000OO000O0O.O00000000O0OOO.contains(var7)) {
                  float var21 = O00000OO000O0O.O00000000O0000 + 64.69F + var19 + 4.0F;
                  float var22 = O00000OO000O0O.O00000000O000 + 238.35F + 9.0F;
                  float var23 = 111.47F;
                  float var24 = 0.0F;

                  for (Setting var26 : var7.O0000000000000()) {
                     if (var26 == o0000000OOOO0O) {
                        float var27 = var22 + var23 - 15.0F;
                        float var28 = var21 + var24 - 5.0F;
                        return new float[]{var27, var28};
                     }

                     var24 += O00000OO00OOOO.O00000000(o0000O00OO0O0, var26) + 3.0F;
                  }

                  var5 += var8;
               }
            } else {
               float var18 = var3 + var4;
               if (O00000OO000O0O.O00000000O0OOO.contains(var7)) {
                  float var20 = O00000OO000O0O.O00000000O0000 + 64.69F + var18 + 4.0F;
                  float var11 = O00000OO000O0O.O00000000O000 + 111.885F + 9.0F;
                  float var12 = 111.47F;
                  float var13 = 0.0F;

                  for (Setting var15 : var7.O0000000000000()) {
                     if (var15 == o0000000OOOO0O) {
                        float var16 = var11 + var12 - 15.0F;
                        float var17 = var20 + var13 - 5.0F;
                        return new float[]{var16, var17};
                     }

                     var13 += O00000OO00OOOO.O00000000(o0000O00OO0O0, var15) + 3.0F;
                  }

                  var4 += var8;
               }

               var3 += 30.325F;
            }

            var2++;
         }

         return null;
      }
   }
}
