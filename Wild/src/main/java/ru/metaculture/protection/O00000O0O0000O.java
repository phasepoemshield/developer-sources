package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.network.PlayerListEntry;

@O0000000OOO0(
   O00000000 = "StaffListHUD",
   O000000000 = "w"
)
public final class O00000O0O0000O extends O0000000OOO00 {
   private static final O00000O0O0000O O00000000 = new O00000O0O0000O();
   private static final MinecraftClient O000000000 = MinecraftClient.getInstance();
   private static final O0000O00O0OO O0000000000 = new O0000O00O0OO();
   private static final O0000O00O0OO O00000000000 = new O0000O00O0OO();
   private static final O0000O00O0OO O000000000000 = new O0000O00O0OO();
   private static final O0000O00O0OO O0000000000000 = new O0000O00O0OO();
   private static final Map<String, O0000O00O0OO> O000000000000O = new HashMap<>();
   private static final List<O00000O0O0000O.W160> O00000000000O = new ArrayList<>(32);
   private static boolean O00000000000O0;
   private static long O00000000000OO;
   private static final List<String> O0000000000O = List.of(
      "helper", "moder", "staff", "admin", "curator", "stager", "sotrudnik", "pomoshnik", "стаж", "сотруд", "модер", "админ", "куратор", "хелпер"
   );
   private final BooleanSetting O0000000000O0 = new BooleanSetting("Показывать верхушку", true);
   private final NumberSetting O0000000000O00 = new NumberSetting("Прозрачность", 1.0F, 0.1F, 1.0F, 0.05F, true);
   private final NumberSetting O0000000000O0O = new NumberSetting("Прозрачность тёмных элементов", 1.0F, 0.0F, 1.0F, 0.05F, true);
   private final ModeSetting O0000000000OO = new ModeSetting("Стилистика", "Тёмный", "Тёмный", "Светлый", "Блюр", "Феррофлюид");
   private final GroupSetting O0000000000OO0 = new GroupSetting("Визуал", new BooleanSetting("Тень", true), new BooleanSetting("Обводка", true));
   private final BooleanSetting O0000000000OOO = new BooleanSetting("Показывать головы", true);
   private static final Map<Character, Integer> O000000000O = new HashMap<>();

   private O00000O0O0000O() {
      this.O00000000(this.O0000000000O0);
      this.O00000000(this.O0000000000O00);
      this.O00000000(this.O0000000000O0O);
      this.O00000000(this.O0000000000OO);
      this.O00000000(this.O0000000000OO0);
      this.O00000000(this.O0000000000OOO);
      O000000000O0O0.O00000000(this);
   }

   public static void O00000000(RenderManager o0000O00OO0O0) {
      O00000000.O000000000(o0000O00OO0O0);
   }

   private void O000000000(RenderManager o0000O00OO0O0) {
      if (O000000000.player != null && O000000000.getNetworkHandler() != null) {
         long var2 = System.currentTimeMillis();
         if (var2 - O00000000000OO > 500L) {
            O00000000000OO = var2;
            O000000000();
         }

         for (O00000O0O0000O.W160 var5 : O00000000000O) {
            O000000000000O.computeIfAbsent(var5.O00000000, string -> new O0000O00O0OO()).O00000000(1.0, 0.2F, O0000O00O0OO0O.O0000000000O0O, false);
         }

         for (Entry var63 : O000000000000O.entrySet()) {
            ((O0000O00O0OO)var63.getValue()).O00000000();
            boolean var6 = false;

            for (O00000O0O0000O.W160 var8 : O00000000000O) {
               if (var8.O00000000.equals(var63.getKey())) {
                  var6 = true;
                  break;
               }
            }

            if (!var6) {
               ((O0000O00O0OO)var63.getValue()).O00000000(0.0, 0.2F, O0000O00O0OO0O.O0000000000O0O, false);
            }
         }

         boolean var62 = O00000000000O.isEmpty() && !(O000000000.currentScreen instanceof ChatScreen);
         boolean var64 = !var62;
         O0000000000.O00000000();
         O00000000000.O00000000();
         O0000000000.O00000000(var62 ? 0.0 : 1.0, 0.18F, O0000O00O0OO0O.O0000000000O0O, false);
         if (var64) {
            if (!O00000000000O0) {
               O00000000000.O0000000000000(-10.0);
            }

            O00000000000.O00000000(0.0, 0.2F, O0000O00O0OO0O.O0000000000O0O, false);
         } else {
            if (O00000000000O0) {
               O00000000000.O0000000000000(0.0);
            }

            O00000000000.O00000000(10.0, 0.2F, O0000O00O0OO0O.O0000000000O0O, false);
         }

         O00000000000O0 = var64;
         float var65 = O0000000000.O000000000000();
         if (!(var65 <= 0.01F)) {
            float var66 = 24.0F;
            boolean var67 = this.O0000000000O0.O0000000000();
            float var9 = var67 ? 7.0F : 0.0F;
            float var10 = var67 ? 29.48F : 0.0F;
            float var11 = 22.0F;
            float var12 = 19.37F;
            float var13 = 10.0F;
            String var14 = "Staff";
            float var15 = TextMeasureCache.O00000000(FontRegistry.O00000000000, var14, 30.0F).O00000000;
            float var16 = var13 * 2.0F + 30.0F;
            if (var67) {
               var16 = Math.max(var16, var15 + var11 + var13 * 2.0F + 24.0F);
            }

            var16 = Math.max(var16, 228.379F);

            for (Entry var18 : O000000000000O.entrySet()) {
               if (((O0000O00O0OO)var18.getValue()).O000000000000() > 0.01F) {
                  float var19 = TextMeasureCache.O00000000(FontRegistry.O00000000, (String)var18.getKey(), var66).O00000000 + var13 * 2.0F + 20.0F;
                  if (this.O0000000000OOO.O0000000000()) {
                     var19 += 22.0F;
                  }

                  var16 = Math.max(var16, var19);
               }
            }

            float var69 = 0.0F;

            for (O0000O00O0OO var72 : O000000000000O.values()) {
               var69 += var12 * Math.max(0.0F, Math.min(1.0F, var72.O000000000000()));
            }

            if (var69 > 0.01F) {
               var69 += var67 ? 5.0F : 7.0F;
            }

            float var71 = (var67 ? var9 + var10 + var9 : 12.0F) + var69;
            O000000000000.O00000000();
            O0000000000000.O00000000();
            O000000000000.O00000000(var16, 0.18F, O0000O00O0OO0O.O0000000000O0O, false);
            O0000000000000.O00000000(var71, 0.18F, O0000O00O0OO0O.O0000000000O0O, false);
            float var73 = O000000000000.O000000000000();
            float var20 = O0000000000000.O000000000000();
            float var21 = O000000000.getWindow().getFramebufferWidth();
            float var22 = Math.max(10.0F, var21 - var73 - 10.0F);
            float var23 = 100.0F;
            O00000OO000O.W219 var24 = O00000OO000O.O00000000().O00000000("HUD_StaffList", var22, var23, var73, var20);
            float var25 = var24.O000000000 + O00000000000.O000000000000();
            float var26 = var24.O0000000000;
            float var27 = var24.O00000000000;
            float var28 = var24.O000000000000;
            float var29 = var27 / Math.max(1.0F, var73);
            float var30 = var28 / Math.max(1.0F, var20);
            float var31 = Math.min(var29, var30);
            float var32 = var9 * var29;
            float var33 = var67 ? var9 * var30 : 0.0F;
            float var34 = var67 ? var10 * var30 : 0.0F;
            float var35 = var12 * var30;
            float var36 = var13 * var29;
            float var37 = var66 * var31;
            int var38 = (int)(255.0F * var65 * this.O0000000000O00.O0000000000());
            float var39 = var65 * this.O0000000000O00.O0000000000() * this.O0000000000O0O.O0000000000();
            int var40 = (int)(255.0F * var39);
            int var41 = O0000O000OO000.O0000000000(24, 24, 24, var38);
            int var42 = O0000O000OO000.O0000000000(40, 37, 40, var40);
            int var43 = O0000O000OO000.O0000000000(45, 45, 45, var38);
            int var44 = O0000O000OO000.O0000000000(255, 255, 255, var38);
            int var45 = O0000O000OO000.O0000000000(255, 255, 255, var38);
            int var46 = O0000O000OO000.O0000000000(22, 22, 22, var40);
            if (this.O0000000000OO.O0000000000().equals("Светлый")) {
               var41 = O0000O000OO000.O0000000000(240, 240, 245, var38);
               var42 = O0000O000OO000.O0000000000(220, 220, 225, var40);
               var43 = O0000O000OO000.O0000000000(200, 200, 200, var38);
               var44 = O0000O000OO000.O0000000000(20, 20, 20, var38);
               int var47 = RenderManager.W382.O0000000000000(255, 255);
               var45 = O0000O000OO000.O000000000000(var47, (int)(255.0F * var65 * this.O0000000000O00.O0000000000()));
               var46 = O0000O000OO000.O0000000000(200, 200, 200, var40);
            } else if (this.O0000000000OO.O0000000000().equals("Блюр")) {
               var41 = O0000O000OO000.O0000000000(21, 22, 26, (int)(122.0F * var65 * this.O0000000000O00.O0000000000()));
               var42 = O0000O000OO000.O0000000000(21, 22, 26, (int)(184.0F * var39));
               var43 = O0000O000OO000.O0000000000(255, 255, 255, (int)(10.0F * var65 * this.O0000000000O00.O0000000000()));
               var46 = O0000O000OO000.O0000000000(255, 255, 255, (int)(10.0F * var39));
            }

            float var74 = 14.0F;
            float var48 = 10.0F;
            if (this.O0000000000OO0.O000000000("Тень")) {
               o0000O00OO0O0.O00000000(
                  var25, var26, var27, var28, var74, 4.0F, 1.0F, O0000O000OO000.O0000000000(0, 0, 0, (int)(80.0F * var65 * this.O0000000000O00.O0000000000()))
               );
            }

            if (this.O0000000000OO.O0000000000().equals("Блюр")) {
               o0000O00OO0O0.O00000000(23.0F);
               o0000O00OO0O0.O00000000(var25, var26, var27, var28, var74, var65 * this.O0000000000O00.O0000000000());
            }

            o0000O00OO0O0.O00000000(var25, var26, var27, var28, var74, var41);
            if (this.O0000000000OO0.O000000000("Обводка")) {
               o0000O00OO0O0.O00000000(var25, var26, var27, var28, var74, var43, this.O0000000000OO.O0000000000().equals("Блюр") ? 1.0F : 1.5F);
            }

            if (var67) {
               float var49 = var27 - var32 * 2.0F;
               if (this.O0000000000OO.O0000000000().equals("Блюр")) {
                  o0000O00OO0O0.O00000000(23.0F);
                  o0000O00OO0O0.O00000000(var25 + var32, var26 + var33, var49, var34, var48, var39);
               }

               o0000O00OO0O0.O00000000(var25 + var32, var26 + var33, var49, var34, 10.0F * var31, 10.0F * var31, 4.0F * var31, 4.0F * var31, var42);
               o0000O00OO0O0.O00000000(
                  FontRegistry.O00000000000, var25 + var32 + 12.4F * var29, var26 + var33 + var34 / 2.0F + 6.0F * var30, 30.0F * var31, var14, var44
               );
               float var50 = var11 * var30;
               float var51 = var25 + var32 + var49 - 6.0F * var29 - var50;
               float var52 = var26 + var33 + (var34 - var50) / 2.0F;
               o0000O00OO0O0.O00000000(var51, var52, var50, var50, 6.0F, var46);
               float var53 = (var66 + 4.0F) * var31;
               float var54 = TextMeasureCache.O00000000(FontRegistry.O000000000000, "f", var53).O00000000;
               o0000O00OO0O0.O00000000(FontRegistry.O000000000000, var51 + (var50 - var54) / 2.0F, var52 + var50 / 2.0F + 7.0F * var30, var53, "f", var45);
            }

            o0000O00OO0O0.O00000000(var25, var26, var27, var28, var74, var74, var74, var74);
            float var75 = var26 + (var67 ? var33 + var34 + 5.0F * var30 : 7.0F * var30);

            for (Entry var77 : O000000000000O.entrySet()) {
               float var78 = Math.max(0.0F, Math.min(1.0F, ((O0000O00O0OO)var77.getValue()).O000000000000()));
               if (!(var78 <= 0.01F)) {
                  O00000O0O0000O.W160 var79 = null;

                  for (O00000O0O0000O.W160 var55 : O00000000000O) {
                     if (var55.O00000000.equals(var77.getKey())) {
                        var79 = var55;
                        break;
                     }
                  }

                  float var81 = (1.0F - var78) * 8.0F * var29;
                  float var82 = var25 + var36 - var81;
                  if (this.O0000000000OOO.O0000000000() && var79 != null) {
                     float var56 = 16.0F * var31;
                     o0000O00OO0O0.O00000000(
                        var82,
                        var75 + (var35 - var56) / 2.0F,
                        var56,
                        var56,
                        4.0F,
                        O0000O000OO000.O0000000000(150, 150, 150, (int)(255.0F * var65 * this.O0000000000O00.O0000000000()))
                     );
                     var82 += var56 + 6.0F * var29;
                  }

                  if (var79 != null) {
                     float var83 = var82;

                     for (O00000O0O0000O.W161 var58 : var79.O000000000) {
                        int var59 = (int)(255.0F * var65 * var78 * this.O0000000000O00.O0000000000());
                        int var60 = O0000O000OO000.O000000000000(var58.O000000000, var59);
                        o0000O00OO0O0.O00000000(FontRegistry.O00000000, var83, var75 + var35 / 2.0F + 3.0F * var30, var37, var58.O00000000, var60);
                        var83 += TextMeasureCache.O00000000(FontRegistry.O00000000, var58.O00000000, var37).O00000000;
                     }
                  } else {
                     o0000O00OO0O0.O00000000(
                        FontRegistry.O00000000,
                        var82,
                        var75 + var35 / 2.0F + 3.0F * var30,
                        var37,
                        (String)var77.getKey(),
                        O0000O000OO000.O0000000000(200, 200, 200, (int)(255.0F * var65 * this.O0000000000O00.O0000000000()))
                     );
                  }

                  var75 += var35 * var78;
               }
            }

            o0000O00OO0O0.O0000000000000();
            O00000OO000O.O00000000().O00000000(var24);
            O00000O0O00O.O00000000(
               o0000O00OO0O0, this, var24, O00000OO000O.O00000000(), O000000000.getWindow().getScaledWidth(), O000000000.getWindow().getScaledHeight()
            );
         }
      }
   }

   private static void O000000000() {
      O00000000000O.clear();
      if (O000000000.getNetworkHandler() != null) {
         for (PlayerListEntry var1 : O000000000.getNetworkHandler().getPlayerList()) {
            String var2 = var1.getProfile().getName();
            String var3 = var1.getDisplayName() != null ? var1.getDisplayName().getString() : var2;
            String var4 = var3.toLowerCase(Locale.ROOT);
            boolean var5 = false;

            for (String var7 : O0000000000O) {
               if (var4.contains(var7)) {
                  var5 = true;
                  break;
               }
            }

            if (var5) {
               O00000000000O.add(O000000000(var3));
            }
         }
      }
   }

   private static String O00000000(String string) {
      return string.replaceAll("(?i)§[0-9A-FK-OR]", "");
   }

   private static O00000O0O0000O.W160 O000000000(String string) {
      ArrayList var1 = new ArrayList();
      StringBuilder var2 = new StringBuilder();
      int var3 = -1;

      for (int var4 = 0; var4 < string.length(); var4++) {
         char var5 = string.charAt(var4);
         if (var5 == 167 && var4 + 1 < string.length()) {
            char var6 = Character.toLowerCase(string.charAt(var4 + 1));
            if (O000000000O.containsKey(var6)) {
               if (!var2.isEmpty()) {
                  var1.add(new O00000O0O0000O.W161(var2.toString(), var3));
                  var2.setLength(0);
               }

               var3 = O000000000O.get(var6);
            }

            var4++;
         } else {
            var2.append(var5);
         }
      }

      if (!var2.isEmpty()) {
         var1.add(new O00000O0O0000O.W161(var2.toString(), var3));
      }

      return new O00000O0O0000O.W160(O00000000(string), var1);
   }

   static {
      O000000000O.put('0', -16777216);
      O000000000O.put('1', -16777046);
      O000000000O.put('2', -16733696);
      O000000000O.put('3', -16733526);
      O000000000O.put('4', -5636096);
      O000000000O.put('5', -5635926);
      O000000000O.put('6', -22016);
      O000000000O.put('7', -5592406);
      O000000000O.put('8', -11184811);
      O000000000O.put('9', -11184641);
      O000000000O.put('a', -11141291);
      O000000000O.put('b', -11141121);
      O000000000O.put('c', -43691);
      O000000000O.put('d', -43521);
      O000000000O.put('e', -171);
      O000000000O.put('f', -1);
   }

   static class W160 {
      final String O00000000;
      final List<O00000O0O0000O.W161> O000000000;

      W160(String string, List<O00000O0O0000O.W161> list) {
         this.O00000000 = string;
         this.O000000000 = list;
      }
   }

   static class W161 {
      final String O00000000;
      final int O000000000;

      W161(String string, int i) {
         this.O00000000 = string;
         this.O000000000 = i;
      }
   }
}
