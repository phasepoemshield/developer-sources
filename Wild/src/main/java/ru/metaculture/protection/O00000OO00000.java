package ru.metaculture.protection;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import net.minecraft.client.MinecraftClient;
import org.wild.module.api.Module;

public final class O00000OO00000 {
   private static final float O00000000 = 120.0F;
   private static final float O000000000 = 8.0F;
   private static final float O0000000000 = 17.0F;
   private static final float O00000000000 = 8.0F;
   private static final float O000000000000 = 156.0F;
   private static final float O0000000000000 = 22.0F;
   private static final EnumMap<Category, O00000OO000000> O000000000000O = new EnumMap<>(Category.class);
   private static final Map<Module, O0000O00OOOOOO> O00000000000O = new HashMap<>();
   private static final Set<Module> O00000000000O0 = new HashSet<>();
   private static boolean O00000000000OO = false;
   private static boolean O0000000000O = false;
   private static final O0000O00OOOOOO O0000000000O0 = new O0000O00OOOOOO();

   private O00000OO00000() {
   }

   static O0000O00OOOOOO O00000000(Module module) {
      return O00000000000O.computeIfAbsent(module, modulex -> new O0000O00OOOOOO());
   }

   static void O000000000(Module module) {
      O0000O00OOOOOO var1 = O00000000(module);
      if (O00000000000O0.contains(module)) {
         O00000000000O0.remove(module);
         var1.O00000000(0.0, 0.18F, O0000O0O00.O0000000000O0O);
      } else {
         O00000000000O0.add(module);
         var1.O00000000(1.0, 0.18F, O0000O0O00.O0000000000O0O);
      }
   }

   public static boolean O00000000(RenderManager o0000O00OO0O0, double d, double e, int i) {
      float[] var6 = O0000O00OO0OOO.O00000000((float)d, (float)e);
      int var7 = (int)var6[0];
      int var8 = (int)var6[1];
      O00000OO00000.W209 var9 = O00000OO00000.W209.O00000000();
      if (!var9.O00000000) {
         return false;
      } else {
         O00000000(var9.O00000000000OO);
         if (O00000OO000O0O.O0000000000OO != null) {
            float var10 = O00000OO00OO0O.O00000000(O00000OO000O0O.O0000000000OO0);
            if (O0000O00OO0OO0.O00000000(var7, var8, var10, O00000OO000O0O.O0000000000OOO, 160.0F, 119.0F)) {
               O00000OO00O0OO.O00000000(var7, var8, i);
               return true;
            }
         }

         if (O00000000(var7, var8, i, var9)) {
            return true;
         } else if (O000000000(var7, var8, i, var9)) {
            return true;
         } else if (i == 0 && O00000000(var9, var7, var8)) {
            return false;
         } else {
            for (O00000OO000000 var11 : O000000000000O.values()) {
               if (var11.O00000000(o0000O00OO0O0, var7, var8, i)) {
                  return true;
               }
            }

            if (O00000OO000O0O.O000000000O000 != null && i >= 0 && i <= 8) {
               int var14 = -100 - i;
               O00000OO000O0O.O000000000O000.O00000000000 = var14;
               O00000OO000O0O.O000000000O000.O000000000000O = false;
               O00000OO000O0O.O000000000O000 = null;
               return true;
            } else if (O00000OO000O0O.O000000000O0O0 != null && i >= 0 && i <= 8) {
               int var13 = -100 - i;
               O00000OO000O0O.O000000000O0O0.O000000000000 = var13;
               O00000OO000O0O.O000000000O0O0.O0000000000O = false;
               O00000OO000O0O.O000000000O0O0 = null;
               return true;
            } else {
               if (O00000OO000O0O.O000000000O00O != null && i == 0) {
                  O00000OO000O0O.O000000000O00O.O00000000000O = false;
                  O00000OO000O0O.O000000000O00O = null;
               }

               if (O00000OO000O0O.O0000000000OO != null && i == 0) {
                  O00000OO000O0O.O0000000000000.O000000000(O0000O00OOO0OO.BACKWARDS);
                  O00000OO000O0O.O0000000000OO = null;
                  O00000OO000O0O.O0000000000OO0 = 0.0F;
                  O00000OO000O0O.O0000000000OOO = 0.0F;
               }

               return false;
            }
         }
      }
   }

   public static boolean O00000000(double d, double e, double f) {
      float[] var6 = O0000O00OO0OOO.O00000000((float)d, (float)e);
      float var7 = var6[0];
      float var8 = var6[1];
      O00000000(Category.values());

      for (O00000OO000000 var10 : O000000000000O.values()) {
         if (var10.O00000000(var7, var8, f)) {
            return true;
         }
      }

      return false;
   }

   public static void O00000000(RenderManager o0000O00OO0O0, int i, int j, float f) {
      if (WildClient.O00000000 != null && WildClient.O00000000.O0000000000O != null && WildClient.O00000000.O0000000000O.O000000000 != null) {
         int var4 = WildClient.O00000000.O0000000000O.O000000000.O00000000000O();
         Color var5 = new Color(var4);
         float[] var6 = Color.RGBtoHSB(var5.getRed(), var5.getGreen(), var5.getBlue(), null);
         Color var7 = Color.getHSBColor(var6[0], var6[1] * 0.15F, 0.3F);
         Color var8 = Color.getHSBColor(var6[0], var6[1] * 0.3F, 0.17F);
         Color var9 = Color.getHSBColor(var6[0], var6[1] * 0.3F, 1.0F);
         Color var10 = Color.getHSBColor(var6[0], var6[1] * 0.2F, 1.0F);
         Theme.CUSTOM.O00000000(var5, var7, var8, var9, Color.WHITE, var10);
         if (WildClient.O00000000.O0000000000O.O000000000() == Theme.CUSTOM) {
            O00000OO000O0O.O00000000O0O00 = Theme.CUSTOM;
            O00000OO000O0O.O00000000O0O0 = Theme.CUSTOM;
         }
      }

      O00000OO00000.W209 var11 = O00000OO00000.W209.O00000000();
      if (var11.O00000000) {
         boolean var12 = O00000OO000O0O.O000000000OO0O || O00000OO000O0O.O000000000OO00 != null && !O00000OO000O0O.O000000000OO00.isEmpty();
         O00000OO000O0O.O0000000000O0O.O00000000();
         if (var12 != O00000000000OO) {
            O00000OO000O0O.O0000000000O0O
               .O00000000(var12 ? 1.0 : 0.0, var12 ? 0.32F : 0.16F, var12 ? O0000O0O00.O000000000OOOO : O0000O0O00.O0000000000O00, false);
            O00000000000OO = var12;
         }

         for (int var13 = 0; var13 < var11.O00000000000OO.length; var13++) {
            Category var15 = var11.O00000000000OO[var13];
            O00000OO000000 var17 = O000000000000O.computeIfAbsent(var15, O00000OO000000::new);
            var17.O00000000(
               var11.O00000000000O + var13 * (var11.O00000000000 + var11.O0000000000000), var11.O00000000000O0, var11.O00000000000, var11.O000000000000
            );
            var17.O00000000(o0000O00OO0O0, i, j, f);
         }

         if (O00000OO000O0O.O0000000000OO instanceof ColorSetting) {
            int var14 = RenderManager.W382.O0000000000O(RenderManager.W382.O000000000000(1, 1), (int)(100.0F * f));
            int var16 = RenderManager.W382.O0000000000O(RenderManager.W382.O0000000000(1, 1), (int)(180.0F * f));
            int var18 = RenderManager.W382.O0000000000O(RenderManager.W382.O000000000000O(1, 1), (int)(200.0F * f));
            O00000OO00OO0O.O00000000(o0000O00OO0O0, O00000OO000O0O.O0000000000OO, i, j, var14, var16, var18, f * O00000OO000O0O.O0000000000000.O00000000000O0());
         }

         O00000000(o0000O00OO0O0, var11, f, i, j);
         O00000000(o0000O00OO0O0, i, j, f, var11);
      }
   }

   private static void O00000000(RenderManager o0000O00OO0O0, int i, int j, float f, O00000OO00000.W209 o00000000) {
      O0000000000O0.O00000000();
      O0000000000O0.O00000000(O0000000000O ? 1.0 : 0.0, 0.2F, O0000O0O00.O0000000000O0O, false);
      float var5 = O0000000000O0.O000000000000();
      Theme var6 = WildClient.O00000000 != null && WildClient.O00000000.O0000000000O != null ? WildClient.O00000000.O0000000000O.O000000000() : Theme.WILD;
      float var7 = 110.0F;
      float var8 = 22.0F;
      float var9 = o00000000.O000000000 - var7 - 10.0F;
      float var10 = o00000000.O0000000000 - var8 - 10.0F;
      int var11 = RenderManager.W382.O0000000000O(RenderManager.W382.O000000000000(1, 1), (int)(30.0F * f));
      int var12 = RenderManager.W382.O0000000000O(RenderManager.W382.O0000000000(1, 1), (int)(200.0F * f));
      int var13 = RenderManager.W382.O0000000000O(RenderManager.W382.O000000000000O(1, 1), (int)(220.0F * f));
      o0000O00OO0O0.O00000000(var9, var10, var7, var8, 6.0F, var11, 1.0F);
      o0000O00OO0O0.O00000000(var9, var10, var7, var8, 6.0F, var12);
      o0000O00OO0O0.O00000000(var9 + 6.0F, var10 + 7.0F, 8.0F, 8.0F, 4.0F, RenderManager.W382.O0000000000O(var6.O00000000().getRGB(), (int)(255.0F * f)));
      o0000O00OO0O0.O00000000(FontRegistry.O00000000, var9 + 20.0F, var10 + 13.0F, 12.0F, var6.O00000000, var13);
      if (var5 > 0.01F) {
         Theme[] var14 = Theme.values();
         float var15 = 18.0F;
         float var16 = var14.length * var15 + 8.0F;
         float var17 = var9;
         float var18 = var10 - 6.0F - var16 * var5;
         o0000O00OO0O0.O00000000(var9, var10 - 6.0F - var16, var7, var16, 0.0F, 0.0F, 6.0F, 6.0F);
         o0000O00OO0O0.O00000000(var9, var18, var7, var16, 6.0F, var11, 1.0F);
         o0000O00OO0O0.O00000000(var9, var18, var7, var16, 6.0F, var12);
         float var19 = var18 + 4.0F;

         for (Theme var23 : var14) {
            boolean var24 = O0000O00OO0OO0.O00000000(i, j, var17, var19, var7, var15);
            int var25 = var24 ? RenderManager.W382.O0000000000O(RenderManager.W382.O0000000000000(1, 1), (int)(60.0F * f * var5)) : 0;
            if (var24 || var23 == var6) {
               o0000O00OO0O0.O00000000(
                  var17 + 4.0F,
                  var19,
                  var7 - 8.0F,
                  var15,
                  4.0F,
                  var25 != 0 ? var25 : RenderManager.W382.O0000000000O(RenderManager.W382.O0000000000000(1, 1), (int)(30.0F * f * var5))
               );
            }

            o0000O00OO0O0.O00000000(
               var17 + 8.0F, var19 + 5.0F, 8.0F, 8.0F, 4.0F, RenderManager.W382.O0000000000O(var23.O00000000().getRGB(), (int)(255.0F * f * var5))
            );
            o0000O00OO0O0.O00000000(
               FontRegistry.O00000000, var17 + 22.0F, var19 + 10.0F, 11.0F, var23.O00000000, RenderManager.W382.O0000000000O(var13, (int)(255.0F * f * var5))
            );
            if (var23 == Theme.CUSTOM) {
               o0000O00OO0O0.O00000000(
                  FontRegistry.O00000000, var17 + var7 - 30.0F, var19 + 10.0F, 9.0F, "[ПКМ]", RenderManager.W382.O0000000000O(var13, (int)(120.0F * f * var5))
               );
            }

            var19 += var15;
         }

         o0000O00OO0O0.O0000000000000();
      }
   }

   private static boolean O00000000(int i, int j, int k, O00000OO00000.W209 o00000000) {
      float var4 = 110.0F;
      float var5 = 22.0F;
      float var6 = o00000000.O000000000 - var4 - 10.0F;
      float var7 = o00000000.O0000000000 - var5 - 10.0F;
      if (k == 0 && O0000O00OO0OO0.O00000000(i, j, var6, var7, var4, var5)) {
         O0000000000O = !O0000000000O;
         return true;
      } else if (O00000000(i, j, o00000000)) {
         return false;
      } else {
         if (O0000000000O) {
            Theme[] var8 = Theme.values();
            float var9 = var8.length * 18.0F + 8.0F;
            float var10 = var7 - 6.0F - var9;
            if (O0000O00OO0OO0.O00000000(i, j, var6, var10, var4, var9)) {
               float var11 = j - (var10 + 4.0F);
               int var12 = (int)(var11 / 18.0F);
               if (var12 >= 0 && var12 < var8.length) {
                  Theme var13 = var8[var12];
                  Theme var14 = WildClient.O00000000.O0000000000O.O000000000();
                  if (k == 0) {
                     if (var14 != var13) {
                        O00000OO000O0O.O000000000000.O0000000000();
                        O0000O0O00O0.O00000000().O00000000((double)i, (double)j, var13.O00000000().getRGB(), var13.O00000000000().getRGB());
                        O00000OO000O0O.O00000000O0O0 = var13;
                        O00000OO000O0O.O00000000O0O00 = var13;
                        WildClient.O00000000.O0000000000O.O00000000(var13);
                     }
                  } else if (k == 1 && var13 == Theme.CUSTOM) {
                     if (var14 != Theme.CUSTOM) {
                        O00000OO000O0O.O000000000000.O0000000000();
                        O0000O0O00O0.O00000000().O00000000((double)i, (double)j, Theme.CUSTOM.O00000000().getRGB(), Theme.CUSTOM.O00000000000().getRGB());
                        O00000OO000O0O.O00000000O0O0 = Theme.CUSTOM;
                        O00000OO000O0O.O00000000O0O00 = Theme.CUSTOM;
                        WildClient.O00000000.O0000000000O.O00000000(Theme.CUSTOM);
                     }

                     ColorSetting var15 = WildClient.O00000000.O0000000000O.O000000000;
                     if (O00000OO000O0O.O0000000000OO == var15) {
                        O00000OO000O0O.O0000000000000.O000000000(O0000O00OOO0OO.BACKWARDS);
                        O00000OO000O0O.O0000000000OO = null;
                     } else {
                        O00000OO000O0O.O0000000000OO = var15;
                        O00000OO000O0O.O0000000000000.O000000000(O0000O00OOO0OO.FORWARDS);
                        O00000OO000O0O.O0000000000OO0 = var6 - 160.0F - 6.0F;
                        O00000OO000O0O.O0000000000OOO = var10;
                     }
                  }
               }

               return true;
            }

            if (k == 0 || k == 1) {
               O0000000000O = false;
               if (O00000OO000O0O.O0000000000OO == WildClient.O00000000.O0000000000O.O000000000) {
                  O00000OO000O0O.O0000000000000.O000000000(O0000O00OOO0OO.BACKWARDS);
                  O00000OO000O0O.O0000000000OO = null;
               }
            }
         }

         return false;
      }
   }

   private static boolean O00000000(float f, float g, O00000OO00000.W209 o00000000) {
      for (int var3 = 0; var3 < o00000000.O00000000000OO.length; var3++) {
         float var4 = o00000000.O00000000000O + var3 * (o00000000.O00000000000 + o00000000.O0000000000000);
         if (O0000O00OO0OO0.O00000000(f, g, var4, o00000000.O00000000000O0, o00000000.O00000000000, o00000000.O000000000000)) {
            return true;
         }
      }

      return false;
   }

   private static boolean O00000000(O00000OO00000.W209 o00000000, int i, int j) {
      return false;
   }

   private static void O00000000(RenderManager o0000O00OO0O0, O00000OO00000.W209 o00000000, float f, int i, int j) {
      float var5 = O00000OO000O0O.O0000000000O0O.O000000000000();
      if (!(var5 <= 0.01F)) {
         float var6 = O00000000(o00000000);
         float var7 = o00000000.O00000000000O + (o00000000.O000000000000O - var6) * 0.5F;
         float var8 = O00000000(o00000000, var5);
         float var9 = 17.0F;
         int var10 = RenderManager.W382.O0000000000O(RenderManager.W382.O000000000000(1, 1), (int)(30.0F * f * var5));
         int var11 = RenderManager.W382.O0000000000O(RenderManager.W382.O00000000000(1, 1), (int)(205.0F * f * var5));
         int var12 = RenderManager.W382.O0000000000O(RenderManager.W382.O000000000000O(1, 1), (int)(220.0F * f * var5));
         int var13 = RenderManager.W382.O0000000000O(RenderManager.W382.O0000000000000(1, 1), (int)(120.0F * f * var5));
         o0000O00OO0O0.O00000000(var7, var8, var6, var9, 6.0F, var10, 0.6F);
         o0000O00OO0O0.O00000000(var7, var8, var6, var9, 6.0F, var11);
         String var14 = O00000OO000O0O.O000000000OO00 == null ? "" : O00000OO000O0O.O000000000OO00;
         String var15 = var14.isEmpty() ? "" : O00000000(var14);
         String var16 = O00000000(var14, var15);
         float var17 = var7 + 6.0F;
         float var18 = var8 + 5.5F + 6.2F;
         if (!var14.isEmpty()) {
            o0000O00OO0O0.O00000000(FontRegistry.O00000000, var17, var18, 11.0F, var14, var12);
            if (!var16.isEmpty()) {
               float var19 = RenderManager.O00000000(FontRegistry.O00000000, var14, 11.0F).O00000000;
               float var20 = var17 + Math.min(var19 + 1.0F, var6 - 14.0F);
               o0000O00OO0O0.O00000000(FontRegistry.O00000000, var20, var18, 11.0F, var16, var13);
            }
         }

         if (O00000OO000O0O.O000000000OO0O) {
            float var21 = RenderManager.O00000000(FontRegistry.O00000000, var14, 11.0F).O00000000;
            float var23 = var17 + Math.min(var21 + 1.0F, var6 - 14.0F);
            o0000O00OO0O0.O00000000(var23, var8 + 4.0F, 1.0F, var9 - 8.0F, RenderManager.W382.O0000000000O(var12, (int)(200.0F * var5)));
         }

         boolean var22 = O0000O00OO0OO0.O00000000(i, j, var7, var8, var6, var9);
         if (var22) {
            o0000O00OO0O0.O00000000(var7, var8, var6, var9, 6.0F, RenderManager.W382.O0000000000O(var13, (int)(80.0F * var5)), 0.5F);
         }
      }
   }

   private static boolean O000000000(int i, int j, int k, O00000OO00000.W209 o00000000) {
      float var4 = O00000000(o00000000);
      float var5 = o00000000.O00000000000O + (o00000000.O000000000000O - var4) * 0.5F;
      float var6 = O00000000(o00000000, O00000OO000O0O.O0000000000O0O.O000000000000());
      boolean var7 = O0000O00OO0OO0.O00000000(i, j, var5, var6, var4, 17.0F);
      if (k == 0 && var7) {
         O00000OO000O0O.O000000000OO0O = true;
         return true;
      } else {
         if (k == 0 && O00000OO000O0O.O000000000OO0O && !var7) {
            O00000OO000O0O.O000000000OO0O = false;
         }

         return false;
      }
   }

   private static float O00000000(O00000OO00000.W209 o00000000) {
      return Math.min(156.0F, o00000000.O000000000000O);
   }

   private static float O00000000(O00000OO00000.W209 o00000000, float f) {
      float var2 = o00000000.O00000000000O0 + o00000000.O000000000000 + 8.0F;
      return var2 + (1.0F - f) * 22.0F;
   }

   private static String O00000000(String string) {
      if (WildClient.O00000000 != null && WildClient.O00000000.O000000000 != null) {
         String var1 = string.trim().toLowerCase();
         if (var1.isEmpty()) {
            return "";
         } else {
            ArrayList var2 = WildClient.O00000000.O000000000.O000000000();
            return ((ArrayList<Module>)var2).stream()
               .filter(module -> module != null && module.O00000000000 != null && module.O00000000000.toLowerCase().contains(var1))
               .min(Comparator.<Module>comparingInt(module -> {
                  String var2x = module.O00000000000.toLowerCase();
                  int var3 = var2x.indexOf(var1);
                  return var3 < 0 ? Integer.MAX_VALUE : var3;
               }).thenComparingInt(module -> module.O00000000000.length()))
               .map(module -> module.O00000000000)
               .orElse("");
         }
      } else {
         return "";
      }
   }

   private static String O00000000(String string, String string2) {
      if (string == null || string2 == null || string.isEmpty() || string2.isEmpty()) {
         return "";
      } else {
         return string2.regionMatches(true, 0, string, 0, string.length()) ? string2.substring(Math.min(string.length(), string2.length())) : string2;
      }
   }

   private static void O00000000(Category[] o0000000OO0O0Os) {
      for (Category var4 : o0000000OO0O0Os) {
         O000000000000O.computeIfAbsent(var4, O00000OO000000::new);
      }
   }

   static final class W209 {
      final boolean O00000000;
      final float O000000000;
      final float O0000000000;
      final float O00000000000;
      final float O000000000000;
      final float O0000000000000;
      final float O000000000000O;
      final float O00000000000O;
      final float O00000000000O0;
      final Category[] O00000000000OO;

      private W209(boolean bl, float f, float g, float h, float i, float j, float k, float l, float m, Category[] o0000000OO0O0Os) {
         this.O00000000 = bl;
         this.O000000000 = f;
         this.O0000000000 = g;
         this.O00000000000 = h;
         this.O000000000000 = i;
         this.O0000000000000 = j;
         this.O000000000000O = k;
         this.O00000000000O = l;
         this.O00000000000O0 = m;
         this.O00000000000OO = o0000000OO0O0Os;
      }

      static O00000OO00000.W209 O00000000() {
         MinecraftClient var0 = MinecraftClient.getInstance();
         if (var0 != null && var0.getWindow() != null) {
            float var1 = var0.getWindow().getScaledWidth();
            float var2 = var0.getWindow().getScaledHeight();
            Category[] var3 = new Category[]{Category.Combat, Category.Movement, Category.Visuals, Category.Player, Category.Misc};
            if (var3.length == 0) {
               return new O00000OO00000.W209(false, var1, var2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, var3);
            } else {
               float var4 = 120.0F;
               float var5 = 8.0F;
               float var6 = var3.length * var4 + (var3.length - 1) * var5;
               float var7 = (var1 - var6) / 2.0F;
               float var8 = O0000O00OO0OO0.O00000000000OO(var2 - 80.0F, 190.0F, 320.0F);
               float var9 = (var2 - var8) / 2.0F;
               return new O00000OO00000.W209(true, var1, var2, var4, var8, var5, var6, var7, var9, var3);
            }
         } else {
            return new O00000OO00000.W209(false, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, Category.values());
         }
      }
   }
}
