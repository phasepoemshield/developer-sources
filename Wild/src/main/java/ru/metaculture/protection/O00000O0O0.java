package ru.metaculture.protection;

import com.mojang.authlib.GameProfile;
import com.mojang.blaze3d.opengl.GlStateManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.Map.Entry;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.client.texture.AbstractTexture;
import net.minecraft.client.texture.GlTexture;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

@O0000000OOO0(
   O00000000 = "PartyListHUD",
   O000000000 = "w"
)
public final class O00000O0O0 extends O0000000OOO00 {
   private static final O00000O0O0 O00000000 = new O00000O0O0();
   private static final MinecraftClient O000000000 = MinecraftClient.getInstance();
   private static final O0000O00O0OO O0000000000 = new O0000O00O0OO();
   private static final O0000O00O0OO O00000000000 = new O0000O00O0OO();
   private static final O0000O00O0OO O000000000000 = new O0000O00O0OO();
   private static final O0000O00O0OO O0000000000000 = new O0000O00O0OO();
   private static final Map<String, O0000O00O0OO> O000000000000O = new HashMap<>();
   private static final Map<String, Identifier> O00000000000O = new HashMap<>();
   private static final Map<String, List<O00000O0O0.W154>> O00000000000O0 = new HashMap<>();
   private static final List<String> O00000000000OO = new ArrayList<>(16);
   private static boolean O0000000000O;
   private static long O0000000000O0;
   private final BooleanSetting O0000000000O00 = new BooleanSetting("Показывать верхушку", true);
   private final NumberSetting O0000000000O0O = new NumberSetting("Прозрачность", 1.0F, 0.1F, 1.0F, 0.05F, true);
   private final NumberSetting O0000000000OO = new NumberSetting("Прозрачность тёмных элементов", 1.0F, 0.0F, 1.0F, 0.05F, true);
   private final ModeSetting O0000000000OO0 = new ModeSetting("Стилистика", "Тёмный", "Тёмный", "Светлый", "Блюр", "Феррофлюид");
   private final GroupSetting O0000000000OOO = new GroupSetting("Визуал", new BooleanSetting("Тень", true), new BooleanSetting("Обводка", true));
   private final BooleanSetting O000000000O = new BooleanSetting("Показывать здоровье", true);

   private O00000O0O0() {
      this.O00000000(this.O0000000000O00);
      this.O00000000(this.O0000000000O0O);
      this.O00000000(this.O0000000000OO);
      this.O00000000(this.O0000000000OO0);
      this.O00000000(this.O0000000000OOO);
      this.O00000000(this.O000000000O);
      O000000000O0O0.O00000000(this);
   }

   public static void O00000000(RenderManager o0000O00OO0O0) {
      O00000000.O000000000(o0000O00OO0O0);
   }

   private void O000000000(RenderManager o0000O00OO0O0) {
      if (O000000000.player != null) {
         long var2 = System.currentTimeMillis();
         if (var2 - O0000000000O0 > 1000L) {
            O0000000000O0 = var2;
            O00000000000O0.clear();
         }

         O00000000000OO.clear();

         for (String var5 : PartyCommand.O00000000000()) {
            O00000000000OO.add(var5.toLowerCase());
         }

         String var65 = O000000000.player.getName().getString().toLowerCase();
         if (!O00000000000OO.contains(var65)) {
            O00000000000OO.add(0, var65);
         }

         for (String var6 : O00000000000OO) {
            O000000000000O.computeIfAbsent(var6, string -> new O0000O00O0OO()).O00000000(1.0, 0.2F, O0000O00O0OO0O.O0000000000O0O, false);
         }

         for (Entry var69 : O000000000000O.entrySet()) {
            ((O0000O00O0OO)var69.getValue()).O00000000();
            if (!O00000000000OO.contains(((String)var69.getKey()).toLowerCase())) {
               ((O0000O00O0OO)var69.getValue()).O00000000(0.0, 0.2F, O0000O00O0OO0O.O0000000000O0O, false);
            }
         }

         boolean var68 = O00000000000OO.isEmpty() && !(O000000000.currentScreen instanceof ChatScreen);
         boolean var70 = !var68;
         O0000000000.O00000000();
         O00000000000.O00000000();
         O0000000000.O00000000(var68 ? 0.0 : 1.0, 0.18F, O0000O00O0OO0O.O0000000000O0O, false);
         if (var70) {
            if (!O0000000000O) {
               O00000000000.O0000000000000(-10.0);
            }

            O00000000000.O00000000(0.0, 0.2F, O0000O00O0OO0O.O0000000000O0O, false);
         } else {
            if (O0000000000O) {
               O00000000000.O0000000000000(0.0);
            }

            O00000000000.O00000000(10.0, 0.2F, O0000O00O0OO0O.O0000000000O0O, false);
         }

         O0000000000O = var70;
         float var7 = O0000000000.O000000000000();
         if (!(var7 <= 0.01F)) {
            float var8 = 24.0F;
            boolean var9 = this.O0000000000O00.O0000000000();
            float var10 = var9 ? 7.0F : 0.0F;
            float var11 = var9 ? 32.0F : 0.0F;
            float var12 = 22.0F;
            float var13 = 28.0F;
            float var14 = 10.0F;
            String var15 = "Party";
            float var16 = TextMeasureCache.O00000000(FontRegistry.O00000000000, var15, 26.0F).O00000000;
            float var17 = var14 * 2.0F + 30.0F;
            if (var9) {
               var17 = Math.max(var17, var16 + var12 + var14 * 2.0F + 24.0F);
            }

            for (Entry var19 : O000000000000O.entrySet()) {
               if (((O0000O00O0OO)var19.getValue()).O000000000000() > 0.01F) {
                  List var20 = this.O00000000((String)var19.getKey(), O0000O000OO000.O0000000000(245, 245, 245, 255));
                  float var21 = 0.0F;

                  for (O00000O0O0.W154 var23 : (List<O00000O0O0.W154>)var20) {
                     var21 += TextMeasureCache.O00000000(FontRegistry.O00000000, var23.O00000000, var8).O00000000;
                  }

                  float var77 = var21 + var14 * 2.0F + 26.0F;
                  if (this.O000000000O.O0000000000()) {
                     var77 += 40.0F;
                  }

                  var17 = Math.max(var17, var77);
               }
            }

            float var71 = 0.0F;

            for (O0000O00O0OO var74 : O000000000000O.values()) {
               var71 += var13 * Math.max(0.0F, Math.min(1.0F, var74.O000000000000()));
            }

            if (var71 > 0.01F) {
               var71 += var9 ? 5.0F : 7.0F;
            }

            float var73 = (var9 ? var10 + var11 + 5.0F : 7.0F) + var71;
            O000000000000.O00000000();
            O0000000000000.O00000000();
            O000000000000.O00000000(var17, 0.18F, O0000O00O0OO0O.O0000000000O0O, false);
            O0000000000000.O00000000(var73, 0.18F, O0000O00O0OO0O.O0000000000O0O, false);
            float var75 = O000000000000.O000000000000();
            float var76 = O0000000000000.O000000000000();
            float var78 = O000000000.getWindow().getFramebufferWidth();
            float var79 = 10.0F;
            float var24 = 100.0F;
            O00000OO000O.W219 var25 = O00000OO000O.O00000000().O00000000("HUD_PartyList", var79, var24, var75, var76);
            float var26 = var25.O000000000 + O00000000000.O000000000000();
            float var27 = var25.O0000000000;
            float var28 = var25.O00000000000;
            float var29 = var25.O000000000000;
            float var30 = var28 / Math.max(1.0F, var75);
            float var31 = var29 / Math.max(1.0F, var76);
            float var32 = Math.min(var30, var31);
            float var33 = var10 * var30;
            float var34 = var9 ? var10 * var31 : 0.0F;
            float var35 = var9 ? var11 * var31 : 0.0F;
            float var36 = var13 * var31;
            float var37 = var14 * var30;
            float var38 = var8 * var32;
            int var39 = (int)(255.0F * var7 * this.O0000000000O0O.O0000000000());
            float var40 = var7 * this.O0000000000O0O.O0000000000() * this.O0000000000OO.O0000000000();
            int var41 = (int)(255.0F * var40);
            int var42 = O0000O000OO000.O0000000000(24, 24, 24, var39);
            int var43 = O0000O000OO000.O0000000000(40, 37, 40, var41);
            int var44 = O0000O000OO000.O0000000000(45, 45, 45, var39);
            int var45 = O0000O000OO000.O0000000000(255, 255, 255, var39);
            int var46 = O0000O000OO000.O0000000000(255, 255, 255, var39);
            int var47 = O0000O000OO000.O0000000000(22, 22, 22, var41);
            if (this.O0000000000OO0.O0000000000().equals("Светлый")) {
               var42 = O0000O000OO000.O0000000000(240, 240, 245, var39);
               var43 = O0000O000OO000.O0000000000(220, 220, 225, var41);
               var44 = O0000O000OO000.O0000000000(200, 200, 200, var39);
               var45 = O0000O000OO000.O0000000000(20, 20, 20, var39);
               int var48 = RenderManager.W382.O0000000000000(255, 255);
               var46 = O0000O000OO000.O000000000000(var48, (int)(255.0F * var7 * this.O0000000000O0O.O0000000000()));
               var47 = O0000O000OO000.O0000000000(200, 200, 200, var41);
            } else if (this.O0000000000OO0.O0000000000().equals("Блюр")) {
               var42 = O0000O000OO000.O0000000000(10, 10, 10, (int)(40.0F * var7 * this.O0000000000O0O.O0000000000()));
               var43 = O0000O000OO000.O0000000000(25, 25, 25, (int)(120.0F * var40));
               var44 = O0000O000OO000.O0000000000(255, 255, 255, (int)(35.0F * var7 * this.O0000000000O0O.O0000000000()));
               var47 = O0000O000OO000.O0000000000(255, 255, 255, (int)(40.0F * var40));
            }

            float var80 = 10.0F;
            float var49 = 6.0F;
            if (this.O0000000000OOO.O000000000("Тень")) {
               o0000O00OO0O0.O00000000(
                  var26, var27, var28, var29, var80, 4.0F, 1.0F, O0000O000OO000.O0000000000(0, 0, 0, (int)(80.0F * var7 * this.O0000000000O0O.O0000000000()))
               );
            }

            if (this.O0000000000OO0.O0000000000().equals("Блюр")) {
               o0000O00OO0O0.O00000000(23.0F);
               o0000O00OO0O0.O00000000(var26, var27, var28, var29, var80, var7 * this.O0000000000O0O.O0000000000());
            }

            o0000O00OO0O0.O00000000(var26, var27, var28, var29, var80, var42);
            if (this.O0000000000OOO.O000000000("Обводка")) {
               o0000O00OO0O0.O00000000(var26, var27, var28, var29, var80, var44, this.O0000000000OO0.O0000000000().equals("Блюр") ? 1.0F : 1.5F);
            }

            if (var9) {
               float var50 = var28 - var33 * 2.0F;
               if (this.O0000000000OO0.O0000000000().equals("Блюр")) {
                  o0000O00OO0O0.O00000000(23.0F);
                  o0000O00OO0O0.O00000000(var26 + var33, var27 + var34, var50, var35, var49, var40);
               }

               o0000O00OO0O0.O00000000(var26 + var33, var27 + var34, var50, var35, var49, var43);
               o0000O00OO0O0.O00000000(
                  FontRegistry.O00000000000, var26 + var33 + 10.0F * var30, var27 + var34 + var35 / 2.0F + 6.0F * var31, 26.0F * var32, var15, var45
               );
               float var51 = var12 * var31;
               float var52 = var26 + var33 + var50 - 6.0F * var30 - var51;
               float var53 = var27 + var34 + (var35 - var51) / 2.0F;
               o0000O00OO0O0.O00000000(var52, var53, var51, var51, 6.0F, var47);
               float var54 = (var8 + 4.0F) * var32;
               float var55 = TextMeasureCache.O00000000(FontRegistry.O000000000000, "p", var54).O00000000;
               o0000O00OO0O0.O00000000(FontRegistry.O000000000000, var52 + (var51 - var55) / 2.0F, var53 + var51 / 2.0F + 7.0F * var31, var54, "p", var46);
            }

            o0000O00OO0O0.O00000000(var26, var27, var28, var29, var80, var80, var80, var80);
            float var81 = var27 + (var9 ? var34 + var35 + 5.0F * var31 : 7.0F * var31);

            for (Entry var83 : O000000000000O.entrySet()) {
               float var84 = Math.max(0.0F, Math.min(1.0F, ((O0000O00O0OO)var83.getValue()).O000000000000()));
               if (!(var84 <= 0.01F)) {
                  float var85 = var84 * var84;
                  int var86 = (int)(255.0F * var7 * var85 * this.O0000000000O0O.O0000000000());
                  if (var86 <= 5) {
                     var81 += var36 * var84;
                  } else {
                     String var56 = (String)var83.getKey();
                     float var57 = (1.0F - var84) * 8.0F * var30;
                     float var58 = var26 + var37 - var57;
                     float var59 = 18.0F * var32;
                     O00000000(o0000O00OO0O0, var56, var58, var81 + (var36 - var59) / 2.0F, var59, var7 * var85 * this.O0000000000O0O.O0000000000());
                     float var60 = var58 + var59 + 6.0F * var30;

                     for (O00000O0O0.W154 var63 : this.O00000000(var56, O0000O000OO000.O0000000000(245, 245, 245, var86))) {
                        int var64 = O0000O000OO000.O000000000000(var63.O000000000, var86);
                        o0000O00OO0O0.O00000000(FontRegistry.O00000000, var60, var81 + var36 / 2.0F + 3.0F * var31, var38, var63.O00000000, var64);
                        var60 += TextMeasureCache.O00000000(FontRegistry.O00000000, var63.O00000000, var38).O00000000;
                     }

                     if (this.O000000000O.O0000000000()) {
                        String var87 = "20.0 HP";
                        float var88 = TextMeasureCache.O00000000(FontRegistry.O00000000, var87, var38).O00000000;
                        o0000O00OO0O0.O00000000(
                           FontRegistry.O00000000,
                           var26 + var28 - var37 - var88 + var57,
                           var81 + var36 / 2.0F + 3.0F * var31,
                           var38,
                           var87,
                           O0000O000OO000.O0000000000(100, 255, 100, var86)
                        );
                     }

                     var81 += var36 * var84;
                  }
               }
            }

            o0000O00OO0O0.O0000000000000();
            O00000OO000O.O00000000().O00000000(var25);
            O00000O0O00O.O00000000(
               o0000O00OO0O0, this, var25, O00000OO000O.O00000000(), O000000000.getWindow().getScaledWidth(), O000000000.getWindow().getScaledHeight()
            );
         }
      }
   }

   private List<O00000O0O0.W154> O00000000(String string, int i) {
      ArrayList var3 = new ArrayList();
      if (O000000000.getNetworkHandler() != null) {
         for (PlayerListEntry var5 : O000000000.getNetworkHandler().getPlayerList()) {
            if (var5.getProfile().getName().equalsIgnoreCase(string)) {
               Object var6 = var5.getDisplayName() != null ? var5.getDisplayName() : Text.literal(var5.getProfile().getName());
               ((Text)var6).visit((style, stringx) -> {
                  String var4 = stringx.replaceAll("(?i)§.", "").replaceAll("[^A-Za-zА-Яа-яЁё0-9\\s\\[\\]()_\\-.,!<>:|]", "");
                  if (!var4.isEmpty()) {
                     int var5x = i;
                     if (style.getColor() != null) {
                        var5x = style.getColor().getRgb() | 0xFF000000;
                     }

                     var3.add(new O00000O0O0.W154(var4, var5x));
                  }

                  return Optional.empty();
               }, Style.EMPTY);
               if (!var3.isEmpty()) {
                  return var3;
               }
            }
         }
      }

      var3.add(new O00000O0O0.W154(string, i));
      return var3;
   }

   private static void O00000000(RenderManager o0000O00OO0O0, String string, float f, float g, float h, float i) {
      try {
         String var6 = string.toLowerCase(Locale.ROOT);
         Identifier var7 = O00000000000O.computeIfAbsent(var6, string2 -> {
            GameProfile var2 = new GameProfile(UUID.nameUUIDFromBytes(("OfflinePlayer:" + string).getBytes()), string);
            return O000000000.getSkinProvider().getSkinTextures(var2).texture();
         });
         AbstractTexture var8 = O000000000.getTextureManager().getTexture(var7);
         if (!(var8.getGlTexture() instanceof GlTexture var10)) {
            return;
         }

         int var11 = var10.getGlId();
         if (var11 <= 0) {
            return;
         }

         GlStateManager._bindTexture(var11);
         o0000O00OO0O0.O000000000000(i);
         o0000O00OO0O0.O00000000(var11, f, g, h, h, 0.125F, 0.125F, 0.25F, 0.25F, 4.0F);
         o0000O00OO0O0.O00000000(var11, f, g, h, h, 0.625F, 0.125F, 0.75F, 0.25F, 4.0F);
         o0000O00OO0O0.O00000000000OO();
      } catch (Throwable var12) {
         o0000O00OO0O0.O00000000(f, g, h, h, 4.0F, O0000O000OO000.O00000000000(255, (int)(40.0F * i)));
      }
   }

   static class W154 {
      String O00000000;
      int O000000000;

      W154(String string, int i) {
         this.O00000000 = string;
         this.O000000000 = i;
      }
   }
}
