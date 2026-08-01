package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.resource.language.I18n;
import net.minecraft.client.texture.AbstractTexture;
import net.minecraft.client.texture.GlTexture;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffectUtil;
import net.minecraft.item.ItemStack;
import net.minecraft.network.packet.s2c.play.GameJoinS2CPacket;
import net.minecraft.network.packet.s2c.play.PlayerRespawnS2CPacket;
import net.minecraft.util.Identifier;

@O0000000OOO0(
   O00000000 = "PotionsHUD",
   O000000000 = "w"
)
public final class PotionsHud extends HudElement {
   private static final PotionsHud O00000000 = new PotionsHud();
   private static final MinecraftClient O000000000OO0 = MinecraftClient.getInstance();
   private static final List<PotionsHud.W157> O000000000OO00 = new ArrayList<>();
   private static final List<PotionsHud.W157> O000000000OO0O = new ArrayList<>(16);
   private static final StatusEffectInstance[] O000000000OOO = new StatusEffectInstance[8];
   private static final O0000O00O0OO O000000000OOO0 = new O0000O00O0OO();
   private static final O0000O00O0OO O000000000OOOO = new O0000O00O0OO();
   private static final O0000O00O0OO O00000000O = new O0000O00O0OO();
   private static final Set<String> O00000000O0 = new HashSet<>();
   private static final Set<StatusEffectInstance> O00000000O00 = new HashSet<>();
   private static final List<StatusEffectInstance> O00000000O000 = new ArrayList<>();
   private final ModeSetting O00000000O0000 = new ModeSetting("Вид", "Капсулы", "Капсулы", "Список");
   private final BooleanSetting O00000000O000O = new BooleanSetting("Показывать верхушку", true);
   private final BooleanSetting O00000000O00O = new BooleanSetting("Показывать иконку", true);
   private final BooleanSetting O00000000O00O0 = new BooleanSetting("Скрыть бесконечные", false);
   private final BooleanSetting O00000000O00OO = new BooleanSetting("Кастомные зелья", true);
   private final BooleanSetting O00000000O0O = new BooleanSetting("Шкала времени", false);
   private static final List<PotionsHud.W155> O00000000O0O0 = List.of(
      new PotionsHud.W155(
         "custom:hlopushka", "Хлопушка", false, "minecraft:slowness", 9, "minecraft:speed", 4, "minecraft:blindness", 9, "minecraft:glowing", 0
      ),
      new PotionsHud.W155("custom:holy_water", "Святая Вода", false, "minecraft:regeneration", 2, "minecraft:invisibility", 1),
      new PotionsHud.W155("custom:gnev", "Зелье Гнева", false, "minecraft:strength", 4, "minecraft:slowness", 3),
      new PotionsHud.W155(
         "custom:paladin",
         "Зелье Палладина",
         false,
         "minecraft:resistance",
         0,
         "minecraft:fire_resistance",
         0,
         "minecraft:invisibility",
         0,
         "minecraft:health_boost",
         2
      ),
      new PotionsHud.W155("custom:assassin", "Зелье Ассасина", false, "minecraft:strength", 3, "minecraft:speed", 2, "minecraft:haste", 0),
      new PotionsHud.W155(
         "custom:radiation",
         "Зелье Радиации",
         true,
         "minecraft:poison",
         1,
         "minecraft:wither",
         1,
         "minecraft:slowness",
         2,
         "minecraft:hunger",
         4,
         "minecraft:glowing",
         0
      ),
      new PotionsHud.W155(
         "custom:snotvornoye", "Снотворное", true, "minecraft:weakness", 1, "minecraft:mining_fatigue", 1, "minecraft:wither", 2, "minecraft:blindness", 0
      )
   );

   private PotionsHud() {
      this.O00000000(this.O00000000O0000);
      this.O00000000(this.O00000000O000O);
      this.O00000000(this.O00000000O00O);
      this.O00000000(this.O00000000O00O0);
      this.O00000000(this.O00000000O00OO);
      this.O00000000(this.O00000000O0O);
      ru.metaculture.protection.O000000000O0O0.O00000000(this);
   }

   public static void O00000000(O0000000O000OO o0000000O000OO) {
      if (o0000000O000OO != null && !o0000000O000OO.O0000000000() && O000000000OO0.player != null) {
         if (o0000000O000OO.O00000000000() instanceof PlayerRespawnS2CPacket || o0000000O000OO.O00000000000() instanceof GameJoinS2CPacket) {
            O000000000OO00.clear();
         }
      }
   }

   public static void O00000000(RenderManager o0000O00OO0O0, DrawContext drawContext) {
      O00000000.O000000000(o0000O00OO0O0, drawContext);
   }

   public static PotionsHud O000000000() {
      return O00000000;
   }

   public void O000000000(RenderManager o0000O00OO0O0, DrawContext drawContext) {
      if (O000000000OO0.player != null) {
         this.O0000000000OO0();
         O000000000OO0O.clear();
         boolean var3 = this.O00000000O00O0.O0000000000();
         boolean var4 = false;

         for (PotionsHud.W157 var6 : O000000000OO00) {
            if (!var3 || !var6.O000000000()) {
               O000000000OO0O.add(var6);
               if (var6.O00000000000OO.O000000000000() > 0.01F) {
                  var4 = true;
               }
            }
         }

         boolean var29 = !var4 && !(O000000000OO0.currentScreen instanceof ChatScreen);
         boolean var30 = !var29;
         O000000000OOO0.O00000000();
         O000000000OOO0.O00000000(var30 ? 1.0 : 0.0, 0.22F, O0000O00O0OO0O.O0000000000O0O, false);
         float var7 = O000000000OOO0.O000000000000();
         if (!(var7 <= 0.01F)) {
            boolean var8 = this.O00000000O0000.O0000000000().equals("Капсулы");
            boolean var9 = HudModule.O0000000000O00();
            O00000OO0OO0O.W239 var10 = var9 ? O00000OO0OO0O.O0000000000() : null;
            float var11 = 0.0F;
            float var12 = 0.0F;
            if (var8) {
               float var13 = 18.0F;
               float var14 = 14.0F;
               float var15 = var9 ? Math.max(28.0F, var10.O0000000000O + 14.0F) : 36.0F;
               float var16 = var9 ? var10.O00000000000O : 7.0F;
               float var17 = var15 - var16 * 2.0F;
               float var18 = var17 + 4.0F;
               float var19 = var9 ? var10.O00000000000O0 : 5.0F;
               float var20 = var9 ? var10.O00000000000O0 : 5.0F;

               for (PotionsHud.W157 var22 : O000000000OO0O) {
                  float var23 = TextMeasureCache.O00000000(FontRegistry.O00000000, var22.O0000000000(), var13).O00000000;
                  float var24 = TextMeasureCache.O00000000(FontRegistry.O00000000, var22.O00000000000(), var14).O00000000;
                  float var25 = TextMeasureCache.O00000000(FontRegistry.O00000000000, var22.O000000000000(), var13).O00000000;
                  float var26 = var23 + (var24 > 0.0F ? var24 + 8.0F : 0.0F) + 16.0F;
                  float var27 = var25 + 16.0F;
                  float var28 = var16 * 2.0F + var18 + var19 + var26 + var19 + var27;
                  if (var28 > var11) {
                     var11 = var28;
                  }

                  var12 += (var15 + var20) * var22.O00000000000OO.O000000000000();
               }

               if (var12 > 0.0F) {
                  var12 -= var20;
               }
            } else {
               float var31 = 24.0F;
               float var33 = var9 ? var10.O00000000000O : 7.0F;
               float var35 = this.O00000000O000O.O0000000000() ? (var9 ? var10.O00000000000OO : 32.0F) : 0.0F;
               float var37 = var9 ? var10.O0000000000O : 22.0F;
               float var39 = var9 ? var10.O00000000000O0 : 5.0F;
               float var40 = TextMeasureCache.O00000000(FontRegistry.O00000000000, "Potions", var9 ? var10.O0000000000O0 : 28.0F).O00000000;
               float var41 = var40 + 22.0F + (var9 ? var10.O0000000000O00 : 24.0F);
               float var42 = 0.0F;
               float var43 = 0.0F;

               for (PotionsHud.W157 var46 : O000000000OO0O) {
                  String var48 = var46.O0000000000() + (var46.O00000000000().isEmpty() ? "" : " " + var46.O00000000000());
                  var42 = Math.max(var42, TextMeasureCache.O00000000(FontRegistry.O00000000, var48, var31).O00000000);
                  var43 = Math.max(var43, TextMeasureCache.O00000000(FontRegistry.O00000000, var46.O000000000000(), var31).O00000000);
               }

               float var45 = this.O00000000O00O.O0000000000() ? 22.0F : 0.0F;
               float var47 = var42 + var45 + 24.0F;
               float var49 = var43 + 20.0F + (var9 ? var10.O0000000000O0O : 0.0F);
               float var50 = var47 + var39 + var49;
               var11 = var50 + var33 * 2.0F;
               if (this.O00000000O000O.O0000000000()) {
                  var11 = Math.max(var11, var41 + var33 * 2.0F);
               }

               float var51 = 0.0F;

               for (PotionsHud.W157 var53 : O000000000OO0O) {
                  var51 += var37 * var53.O00000000000OO.O000000000000();
               }

               var12 = var33 + var35 + (this.O00000000O000O.O0000000000() && var51 > 0.01F ? var39 : 0.0F) + var51 + var33;
               if (O000000000OO0O.isEmpty() && this.O00000000O000O.O0000000000()) {
                  var12 = var33 + var35 + var33;
               }
            }

            O000000000OOOO.O00000000();
            O00000000O.O00000000();
            O000000000OOOO.O00000000(var11, 0.18F, O0000O00O0OO0O.O0000000000O0O, false);
            O00000000O.O00000000(var12, 0.18F, O0000O00O0OO0O.O0000000000O0O, false);
            float var32 = O000000000OOOO.O000000000000();
            float var34 = O00000000O.O000000000000();
            float var36 = O000000000OO0.getWindow().getFramebufferWidth();
            O00000OO000O.W219 var38 = O00000OO000O.O00000000().O00000000("HUD_Potions", Math.max(10.0F, var36 - var32 - 10.0F), 70.0F, var32, var34);
            if (var8) {
               this.O00000000(o0000O00OO0O0, drawContext, var38, O000000000OO0O, var7, var32);
            } else {
               this.O00000000(o0000O00OO0O0, drawContext, var38, O000000000OO0O, var7, var32, var34);
            }
         }
      }
   }

   private void O00000000(RenderManager o0000O00OO0O0, DrawContext drawContext, O00000OO000O.W219 o000000000, List<PotionsHud.W157> list, float f, float g) {
      float var7 = o000000000.O000000000;
      float var8 = o000000000.O0000000000;
      float var9 = o000000000.O00000000000;
      float var10 = var9 / Math.max(1.0F, g);
      boolean var11 = HudModule.O0000000000O00();
      O00000OO0OO0O.W239 var12 = var11 ? O00000OO0OO0O.O0000000000() : null;
      this.O00000000(var7, var8, var9, Math.max(36.0F * var10, o000000000.O000000000000));
      float var13 = (var11 ? Math.max(28.0F, var12.O0000000000O + 14.0F) : 36.0F) * var10;
      float var14 = (var11 ? var12.O00000000000O : 7.0F) * var10;
      float var15 = var13 - var14 * 2.0F;
      float var16 = var15 + 4.0F * var10;
      float var17 = (var11 ? var12.O00000000000O0 : 5.0F) * var10;
      float var18 = (var11 ? var12.O00000000000O0 : 5.0F) * var10;
      float var19 = 18.0F * var10;
      float var20 = 14.0F * var10;
      float var21 = f * this.O000000000O0.O0000000000();
      int var22 = this.O00000000(var21);
      int var23 = this.O0000000000(var21);
      int var24 = this.O00000000000(var21);
      int var25 = this.O000000000000(var21);
      int var26 = O0000O000OO000.O0000000000(130, 130, 130, (int)(255.0F * var21));
      int var27 = O0000O000OO000.O0000000000(145, 160, 255, (int)(255.0F * var21));
      int var28 = O0000O000OO000.O0000000000(255, 77, 77, (int)(255.0F * var21));
      float var29 = (var11 ? var12.O00000000 : 11.0F) * var10;
      float var30 = (var11 ? var12.O000000000000O : 8.0F) * var10;
      float var31 = (var11 ? var12.O00000000000 : 6.0F) * var10;
      float var32 = (var11 ? var12.O000000000000 : 8.0F) * var10;

      for (PotionsHud.W157 var34 : list) {
         float var35 = Math.max(0.0F, Math.min(1.0F, var34.O00000000000OO.O000000000000()));
         if (!(var35 <= 0.01F)) {
            float var36 = TextMeasureCache.O00000000(FontRegistry.O00000000, var34.O0000000000(), var19).O00000000;
            float var37 = TextMeasureCache.O00000000(FontRegistry.O00000000, var34.O00000000000(), var20).O00000000;
            float var38 = TextMeasureCache.O00000000(FontRegistry.O00000000000, var34.O000000000000(), var19).O00000000;
            float var39 = var36 + (var37 > 0.0F ? var37 + 8.0F * var10 : 0.0F) + 16.0F * var10;
            float var40 = var38 + 16.0F * var10;
            float var41 = var14 * 2.0F + var16 + var17 + var39 + var17 + var40;
            float var42 = var34.O00000000000O0();
            int var43 = (int)(255.0F * var21 * var35 * var42);
            int var44 = O0000O000OO000.O00000000(var22, (int)((var22 >> 24 & 0xFF) * var35));
            int var45 = O0000O000OO000.O00000000(var23, (int)((var23 >> 24 & 0xFF) * var35));
            int var46 = O0000O000OO000.O00000000(var34.O0000000000000() ? var28 : var25, var43);
            int var47 = O0000O000OO000.O00000000(var26, var43);
            int var48 = O0000O000OO000.O00000000(var27, var43);
            float var49 = (1.0F - var35) * 8.0F * var10;
            float var50 = var7 - var49;
            this.O00000000(o0000O00OO0O0, var50, var8, var41, var13, var29, var21 * var35);
            float var51 = var50 + var14;
            float var52 = var8 + var14;
            float var53 = var52 + var15 / 2.0F + 3.5F * var10;
            if (this.O0000000000O()) {
               this.O000000000(o0000O00OO0O0, var51, var52, var16, var15, var30, var21 * var35);
            } else {
               o0000O00OO0O0.O00000000(var51, var52, var16, var15, var30, 4.0F, 4.0F, var30, var45);
            }

            if (var34.O0000000000) {
               this.O00000000(o0000O00OO0O0, var34.O0000000000(), var51, var52, var16, var15, var30, 0.7F);
            } else {
               int var54 = O00000000(var34.O000000000);
               if (var54 > 0) {
                  float var55 = 18.0F * var10;
                  float var56 = var51 + (var16 - var55) / 2.0F;
                  float var57 = var52 + (var15 - var55) / 2.0F;
                  o0000O00OO0O0.O000000000000(var21 * var35 * var42);
                  o0000O00OO0O0.O00000000(var54, var56, var57, var55, var55, 0.0F, 0.0F, 1.0F, 1.0F);
                  o0000O00OO0O0.O00000000000OO();
               } else {
                  float var61 = TextMeasureCache.O00000000(FontRegistry.O000000000000, "j", 18.0F * var10).O00000000;
                  o0000O00OO0O0.O00000000(
                     FontRegistry.O000000000000, var51 + (var16 - var61) / 2.0F, var52 + var15 / 2.0F + 5.0F * var10, 18.0F * var10, "j", var46
                  );
               }
            }

            var51 += var16 + var17;
            if (this.O0000000000O()) {
               this.O000000000(o0000O00OO0O0, var51, var52, var39, var15, var31, var21 * var35);
            } else {
               o0000O00OO0O0.O00000000(var51, var52, var39, var15, var11 ? var31 : 4.0F, var45);
            }

            float var60 = var51 + 10.0F * var10;
            o0000O00OO0O0.O00000000(FontRegistry.O00000000, var60, var53, var19, var34.O0000000000(), var46);
            if (var37 > 0.0F) {
               o0000O00OO0O0.O00000000(FontRegistry.O00000000, var60 + var36 + 8.0F * var10, var53, var20, var34.O00000000000(), var47);
            }

            var51 += var39 + var17;
            if (this.O0000000000O()) {
               this.O000000000(o0000O00OO0O0, var51, var52, var40, var15, var32, var21 * var35);
            } else {
               o0000O00OO0O0.O00000000(var51, var52, var40, var15, 4.0F, var32, var32, 4.0F, var45);
            }

            if (this.O00000000O0O.O0000000000() && !var34.O000000000()) {
               float var62 = var34.O000000000000O();
               if (var62 > 0.001F) {
                  float var63 = Math.max(3.0F * var10, var40 * var62);
                  int var64 = O0000O000OO000.O00000000(var34.O0000000000000() ? var28 : var27, (int)(60.0F * var21 * var35));
                  o0000O00OO0O0.O00000000(var51, var52, var40, var15, 4.0F, var32, var32, 4.0F);
                  o0000O00OO0O0.O00000000(var51, var52, var63, var15, 0.0F, var64);
                  o0000O00OO0O0.O0000000000000();
               }
            }

            var34.O0000000000O0.O00000000(var34.O000000000000(), var34.O00000000000O());
            var34.O0000000000O0
               .O00000000(
                  o0000O00OO0O0,
                  FontRegistry.O00000000000,
                  var51,
                  var52,
                  var40,
                  var15,
                  Math.min(var32, var15 * 0.5F),
                  var51 + var40 * 0.5F,
                  var53,
                  var19,
                  var48
               );
            var8 += (var13 + var18) * var35;
         }
      }

      O00000OO000O.O00000000().O00000000(o000000000);
      O00000O0O00O.O00000000(
         o0000O00OO0O0, this, o000000000, O00000OO000O.O00000000(), O000000000OO0.getWindow().getScaledWidth(), O000000000OO0.getWindow().getScaledHeight()
      );
   }

   private void O00000000(
      RenderManager o0000O00OO0O0, DrawContext drawContext, O00000OO000O.W219 o000000000, List<PotionsHud.W157> list, float f, float g, float h
   ) {
      float var8 = o000000000.O000000000;
      float var9 = o000000000.O0000000000;
      float var10 = o000000000.O00000000000;
      float var11 = o000000000.O000000000000;
      this.O00000000(var8, var9, var10, var11);
      float var12 = var10 / Math.max(1.0F, g);
      float var13 = var11 / Math.max(1.0F, h);
      float var14 = Math.min(var12, var13);
      boolean var15 = HudModule.O0000000000O00();
      O00000OO0OO0O.W239 var16 = var15 ? O00000OO0OO0O.O0000000000() : null;
      float var17 = (var15 ? var16.O00000000000O : 7.0F) * var12;
      float var18 = (var15 ? var16.O00000000000O : 7.0F) * var13;
      float var19 = this.O00000000O000O.O0000000000() ? (var15 ? var16.O00000000000OO : 32.0F) * var13 : 0.0F;
      float var20 = (var15 ? var16.O0000000000O : 22.0F) * var13;
      float var21 = (var15 ? var16.O00000000000O0 : 5.0F) * var12;
      float var22 = (var15 ? var16.O00000000000O0 : 5.0F) * var13;
      float var23 = 24.0F * var14;
      boolean var24 = this.O00000000O00O.O0000000000();
      float var25 = var24 ? 22.0F : 0.0F;
      float var26 = 0.0F;
      float var27 = 0.0F;

      for (PotionsHud.W157 var29 : list) {
         String var30 = var29.O0000000000() + (var29.O00000000000().isEmpty() ? "" : " " + var29.O00000000000());
         var26 = Math.max(var26, TextMeasureCache.O00000000(FontRegistry.O00000000, var30, 24.0F).O00000000);
         var27 = Math.max(var27, TextMeasureCache.O00000000(FontRegistry.O00000000, var29.O000000000000(), 24.0F).O00000000);
      }

      float var68 = (var26 + var25 + 24.0F) * var12;
      float var69 = (var27 + 20.0F + (var15 ? var16.O0000000000O0O : 0.0F)) * var12;
      float var70 = var68 + var21 + var69;
      float var31 = var10 - var17 * 2.0F;
      if (var31 > var70) {
         var68 = var31 - var21 - var69;
      }

      float var32 = f * this.O000000000O0.O0000000000();
      int var33 = this.O000000000(var32);
      int var34 = this.O0000000000(var32);
      int var35 = this.O000000000000(var32);
      int var36 = this.O00000000000O(var32);
      float var37 = var15 ? var16.O00000000 : 14.0F;
      float var38 = var15 ? var16.O000000000 : 11.0F;
      float var39 = var15 ? var16.O0000000000 : 7.0F;
      float var40 = var15 ? var16.O00000000000 : var39;
      float var41 = var15 ? var16.O000000000000 : var39;
      this.O00000000(o0000O00OO0O0, var8, var9, var10, var11, var37, var32);
      if (this.O00000000O000O.O0000000000()) {
         if (this.O0000000000O()) {
            this.O00000000(o0000O00OO0O0, var8 + var17, var9 + var18, var31, var19, var38, var32);
         } else if (var15) {
            o0000O00OO0O0.O00000000(var8 + var17, var9 + var18, var31, var19, var38, var33);
         } else {
            o0000O00OO0O0.O00000000(var8 + var17, var9 + var18, var31, var19, 11.0F, 11.0F, 4.0F, 4.0F, var33);
         }

         float var42 = var15 ? var8 + var16.O0000000000OO0.O00000000 * var12 : var8 + var17 + 10.0F * var12;
         float var43 = var15 ? var9 + var16.O0000000000OO0.O000000000 * var13 : var9 + var18 + var19 / 2.0F + 6.0F * var13;
         o0000O00OO0O0.O00000000(FontRegistry.O00000000000, var42, var43, (var15 ? var16.O0000000000O0 : 28.0F) * var14, "Potions", var35);
         float var44 = 22.0F * var13;
         float var45 = var8 + var17 + var31 - 10.0F * var12 - var44;
         float var46 = var9 + var18 + (var19 - var44) / 2.0F;
         float var47 = (var15 ? var16.O0000000000O00 : 24.0F) * var14;
         float var48 = TextMeasureCache.O00000000(FontRegistry.O000000000000, "t", var47).O00000000;
         float var49 = var15
            ? (var16.O0000000000OOO.O0000000000 ? var8 + var10 : var8) + var16.O0000000000OOO.O00000000 * var12
            : var45 + (var44 - var48) / 2.0F;
         float var50 = var15 ? var9 + var16.O0000000000OOO.O000000000 * var13 : var46 + var44 / 2.0F + 5.5F * var13;
         o0000O00OO0O0.O00000000(FontRegistry.O000000000000, var49, var50, var47, "t", var36);
      }

      float var71 = var9 + var18 + var19 + (this.O00000000O000O.O0000000000() ? var22 : 0.0F);
      float var72 = var8 + var17 + (var15 ? var16.O000000000O.O00000000 * var12 : 0.0F);
      float var73 = var71 + (var15 ? var16.O000000000O.O000000000 * var13 : 0.0F);
      float var74 = var8 + var17 + var68 + var21 + (var15 ? var16.O000000000O0.O00000000 * var12 : 0.0F);
      float var75 = var71 + (var15 ? var16.O000000000O0.O000000000 * var13 : 0.0F);
      float var76 = 0.0F;

      for (PotionsHud.W157 var79 : list) {
         var76 += var20 * var79.O00000000000OO.O000000000000();
      }

      if (var76 > 0.01F && this.O00000000000O()) {
         if (this.O0000000000O()) {
            this.O000000000(o0000O00OO0O0, var72, var73, var68, var76, var40, var32);
            this.O000000000(o0000O00OO0O0, var74, var75, var69, var76, var41, var32);
         } else if (var15) {
            o0000O00OO0O0.O00000000(var72, var73, var68, var76, var40, var34);
            o0000O00OO0O0.O00000000(var74, var75, var69, var76, var41, var34);
         } else {
            o0000O00OO0O0.O00000000(var72, var73, var68, var76, 4.0F, 4.0F, 4.0F, 11.0F, var34);
            o0000O00OO0O0.O00000000(var74, var75, var69, var76, 4.0F, 4.0F, 11.0F, 4.0F, var34);
         }
      }

      o0000O00OO0O0.O00000000(var8, var9, var10, var11, var37, var37, var37, var37);
      float var78 = var73;
      float var80 = var75;

      for (PotionsHud.W157 var51 : list) {
         float var52 = var51.O00000000000OO.O000000000000();
         if (!(var52 <= 0.01F)) {
            float var53 = var51.O00000000000O0();
            int var54 = (int)(255.0F * var32 * var52 * var53);
            int var55 = O0000O000OO000.O00000000(this.O000000000000(1.0F), var54);
            int var56 = O0000O000OO000.O00000000(this.O00000000000O(1.0F), var54);
            if (var51.O0000000000000()) {
               var55 = O0000O000OO000.O0000000000(255, 85, 85, var54);
               var56 = O0000O000OO000.O0000000000(255, 120, 120, var54);
            }

            float var57 = (1.0F - var52) * 8.0F * var12;
            float var58 = var72 + 10.0F * var12 - var57;
            if (!var15 || var16.O0000000000OO > 0.05F) {
               float var59 = var15 ? var16.O0000000000OO * var12 : 1.9F * var12;
               o0000O00OO0O0.O00000000(var58, var78 + (var20 - 8.0F * var13) / 2.0F, var59, 8.0F * var13, Math.max(0.7F, var59 * 0.5F), var56);
            }

            var58 += 8.0F * var12;
            if (var24) {
               float var83 = 14.0F * var14;
               float var60 = var78 + (var20 - var83) * 0.5F;
               this.O00000000(o0000O00OO0O0, var51, var58, var60, var83, var32 * var52 * var53, var55);
               var58 += var83 + 6.0F * var12;
            }

            String var84 = var51.O0000000000() + (var51.O00000000000().isEmpty() ? "" : " " + var51.O00000000000());
            o0000O00OO0O0.O00000000(FontRegistry.O00000000, var58, var78 + var20 / 2.0F + 4.0F * var13, var23, var84, var55);
            if (this.O00000000O0O.O0000000000() && !var51.O000000000()) {
               float var85 = var51.O000000000000O();
               if (var85 > 0.001F) {
                  float var61 = Math.max(2.0F, var20 - 6.0F * var13);
                  float var62 = Math.max(1.0F, var69 - 6.0F * var12);
                  float var63 = Math.max(3.0F * var12, var62 * var85);
                  float var64 = var74 + 3.0F * var12 + var57;
                  float var65 = var80 + (var20 - var61) * 0.5F;
                  float var66 = var61 * 0.4F;
                  int var67 = O0000O000OO000.O00000000(var56, (int)(O0000O000OO000.O00000000(var56) * 0.22F));
                  o0000O00OO0O0.O00000000(var64, var65, var62, var61, var66, var66, var66, var66);
                  o0000O00OO0O0.O00000000(var64, var65, var63, var61, 0.0F, var67);
                  o0000O00OO0O0.O0000000000000();
               }
            }

            var51.O0000000000O0.O00000000(var51.O000000000000(), var51.O00000000000O());
            var51.O0000000000O0
               .O00000000(
                  o0000O00OO0O0,
                  FontRegistry.O00000000,
                  var74,
                  var80,
                  var69,
                  var20,
                  Math.min(var41, var20 * 0.5F),
                  var74 + var69 * 0.5F + var57,
                  var80 + var20 / 2.0F + 4.0F * var13,
                  var23,
                  var56
               );
            var78 += var20 * var52;
            var80 += var20 * var52;
         }
      }

      o0000O00OO0O0.O0000000000000();
      O00000OO000O.O00000000().O00000000(o000000000);
      O00000O0O00O.O00000000(
         o0000O00OO0O0, this, o000000000, O00000OO000O.O00000000(), O000000000OO0.getWindow().getScaledWidth(), O000000000OO0.getWindow().getScaledHeight()
      );
   }

   private void O00000000(RenderManager o0000O00OO0O0, PotionsHud.W157 o0000000000, float f, float g, float h, float i, int j) {
      if (o0000000000.O0000000000) {
         this.O00000000(o0000O00OO0O0, o0000000000.O0000000000(), f, g, h, h, h * 0.25F, 1.0F);
      } else {
         int var8 = O00000000(o0000000000.O000000000);
         if (var8 > 0) {
            o0000O00OO0O0.O000000000000(i);
            o0000O00OO0O0.O00000000(var8, f, g, h, h, 0.0F, 0.0F, 1.0F, 1.0F);
            o0000O00OO0O0.O00000000000OO();
         } else {
            float var9 = TextMeasureCache.O00000000(FontRegistry.O000000000000, "j", h).O00000000;
            o0000O00OO0O0.O00000000(FontRegistry.O000000000000, f + (h - var9) * 0.5F, g + h * 0.5F + h * 0.28F, h, "j", j);
         }
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void O00000000(RenderManager o0000O00OO0O0, String string, float f, float g, float h, float i, float j, float k) {
      ItemStack var9 = O00000OO000.O00000000(string);
      if (var9 != null && !var9.isEmpty() && !(h <= 0.0F) && !(i <= 0.0F)) {
         float var10 = Math.max(1.0F, Math.min(h, i) * k);
         float var11 = ItemRenderUtil.O0000000000(var10 / 16.0F);
         float var12 = 16.0F * var11;
         float var13 = ItemRenderUtil.O00000000(f);
         float var14 = ItemRenderUtil.O00000000(g);
         float var15 = Math.max(1.0F, ItemRenderUtil.O00000000(h));
         float var16 = Math.max(1.0F, ItemRenderUtil.O00000000(i));
         float var17 = ItemRenderUtil.O00000000(var13 + (var15 - var12) * 0.5F);
         float var18 = ItemRenderUtil.O00000000(var14 + (var16 - var12) * 0.5F);
         o0000O00OO0O0.O0000000000();
         o0000O00OO0O0.O00000000(var13, var14, var15, var16, j, j, j, j);
         boolean var21 = false /* VF: Semaphore variable */;

         try {
            var21 = true;
            ItemRenderUtil.O00000000(o0000O00OO0O0, var9, var17, var18, var11, 0, false, 0);
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
   }

   private static int O00000000(Identifier identifier) {
      if (O000000000OO0 != null && O000000000OO0.getTextureManager() != null) {
         AbstractTexture var1 = O000000000OO0.getTextureManager().getTexture(identifier);
         return var1 != null && var1.getGlTexture() instanceof GlTexture var2 ? var2.getGlId() : -1;
      } else {
         return -1;
      }
   }

   private void O0000000000OO0() {
      if (O000000000OO0.player != null) {
         O00000000O0.clear();
         O00000000O00.clear();
         O00000000O000.clear();

         for (StatusEffectInstance var2 : O000000000OO0.player.getStatusEffects()) {
            if (!Removals.O00000000(var2.getEffectType())) {
               O00000000O000.add(var2);
            }
         }

         boolean var12 = O000000000OO0.currentScreen instanceof ChatScreen;
         if (var12 && O00000000O000.isEmpty()) {
            O00000000O0.add("minecraft:fire_resistance");
            O000000000("minecraft:fire_resistance", I18n.translate("effect.minecraft.fire_resistance", new Object[0]), 1, 8000, false);
            O00000000O0.add("minecraft:strength");
            O000000000("minecraft:strength", I18n.translate("effect.minecraft.strength", new Object[0]), 3, 2380, false);
            O00000000O0.add("minecraft:poison");
            O000000000("minecraft:poison", I18n.translate("effect.minecraft.poison", new Object[0]), 2, 240, true);
         }

         if (this.O00000000O00OO.O0000000000()) {
            for (PotionsHud.W155 var3 : O00000000O0O0) {
               boolean var4 = true;
               int var5 = 0;

               for (PotionsHud.W156 var7 : var3.reqs()) {
                  StatusEffectInstance var8 = null;
                  int var9 = 0;

                  for (int var10 = O00000000O000.size(); var9 < var10; var9++) {
                     StatusEffectInstance var11 = O00000000O000.get(var9);
                     if (var11.getEffectType().getIdAsString().equals(var7.id())
                        && (var11.getAmplifier() == var7.amp() || var11.getAmplifier() == var7.amp() - 1)) {
                        var8 = var11;
                        break;
                     }
                  }

                  if (var8 == null) {
                     var4 = false;
                     break;
                  }

                  O000000000OOO[var5++] = var8;
               }

               if (var4) {
                  O00000000O0.add(var3.id());
                  int var19 = 0;

                  for (int var20 = 0; var20 < var5; var20++) {
                     StatusEffectInstance var21 = O000000000OOO[var20];
                     O00000000O00.add(var21);
                     if (var21.getDuration() > var19) {
                        var19 = var21.getDuration();
                     }

                     O000000000OOO[var20] = null;
                  }

                  O00000000(var3.id(), var3.name(), 1, var19, var3.harmful());
               }
            }
         }

         for (StatusEffectInstance var16 : O00000000O000) {
            if (!O00000000O00.contains(var16)) {
               String var18 = var16.getEffectType().getIdAsString();
               O00000000O0.add(var18);
               O00000000(var18, var16);
            }
         }

         for (PotionsHud.W157 var17 : O000000000OO00) {
            if (!O00000000O0.contains(var17.O00000000)) {
               var17.O00000000000OO.O00000000(0.0, 0.15F, O0000O00O0OO0O.O0000000000O0O, true);
            }

            var17.O00000000000OO.O00000000();
         }

         O000000000OO00.removeIf(o0000000000 -> o0000000000.O00000000000OO.O000000000000() <= 0.01F && !O00000000O0.contains(o0000000000.O00000000));
         O000000000OO00.sort(Comparator.comparingInt(PotionsHud.W157::O00000000).reversed());
      }
   }

   private static void O00000000(String string, String string2, int i, int j, boolean bl) {
      PotionsHud.W157 var5 = O00000000000(string);
      if (var5 == null) {
         var5 = new PotionsHud.W157(string);
         var5.O0000000000 = true;
         var5.O00000000000 = false;
         var5.O000000000000 = string2;
         var5.O0000000000000 = i;
         var5.O00000000000O = bl;
         var5.O000000000000O = j;
         var5.O00000000000OO.O0000000000000(0.0);
         var5.O00000000000OO.O00000000(1.0, 0.15F, O0000O00O0OO0O.O0000000000O0O, false);
         O000000000OO00.add(var5);
      } else {
         var5.O0000000000 = true;
         var5.O00000000000 = false;
         var5.O000000000000O = j;
         var5.O00000000000OO.O00000000(1.0, 0.15F, O0000O00O0OO0O.O0000000000O0O, true);
      }
   }

   private static void O000000000(String string, String string2, int i, int j, boolean bl) {
      PotionsHud.W157 var5 = O00000000000(string);
      if (var5 == null) {
         var5 = new PotionsHud.W157(string);
         var5.O00000000000OO.O0000000000000(0.0);
         var5.O00000000000OO.O00000000(1.0, 0.15F, O0000O00O0OO0O.O0000000000O0O, false);
         O000000000OO00.add(var5);
      } else {
         var5.O00000000000OO.O00000000(1.0, 0.15F, O0000O00O0OO0O.O0000000000O0O, true);
      }

      var5.O0000000000 = false;
      var5.O00000000000 = true;
      var5.O00000000000O0 = null;
      var5.O000000000000 = string2;
      var5.O0000000000000 = i;
      var5.O000000000000O = j;
      var5.O00000000000O = bl;
   }

   private static void O00000000(String string, StatusEffectInstance statusEffectInstance) {
      PotionsHud.W157 var2 = O00000000000(string);
      if (var2 == null) {
         var2 = new PotionsHud.W157(string);
         var2.O0000000000 = false;
         var2.O00000000000 = false;
         var2.O00000000000O0 = statusEffectInstance;
         var2.O00000000000OO.O0000000000000(0.0);
         var2.O00000000000OO.O00000000(1.0, 0.15F, O0000O00O0OO0O.O0000000000O0O, false);
         O000000000OO00.add(var2);
      } else {
         var2.O0000000000 = false;
         var2.O00000000000 = false;
         var2.O00000000000O0 = statusEffectInstance;
         var2.O00000000000OO.O00000000(1.0, 0.15F, O0000O00O0OO0O.O0000000000O0O, true);
      }
   }

   private static PotionsHud.W157 O00000000000(String string) {
      for (PotionsHud.W157 var2 : O000000000OO00) {
         if (var2.O00000000.equals(string)) {
            return var2;
         }
      }

      return null;
   }

   static String O000000000000(String string) {
      return string != null && !string.isEmpty()
         ? string.replaceAll("(?i)\\u0412?\\u00A7[0-9A-FK-OR]", "").replace("§", "").replace("Â", "").replaceAll("\\p{Cntrl}", "").trim()
         : "";
   }

   record W155(String id, String name, boolean harmful, List<PotionsHud.W156> reqs) {
      public W155(String string, String string2, boolean bl, Object... objects) {
         this(string, string2, bl, buildReqs(objects));
      }

      private static List<PotionsHud.W156> buildReqs(Object[] objects) {
         ArrayList var1 = new ArrayList();

         for (byte var2 = 0; var2 < objects.length; var2 += 2) {
            var1.add(new PotionsHud.W156((String)objects[var2], (Integer)objects[var2 + 1]));
         }

         return var1;
      }
   }

   record W156(String id, int amp) {
   }

   static final class W157 {
      final String O00000000;
      final Identifier O000000000;
      boolean O0000000000;
      boolean O00000000000;
      String O000000000000;
      int O0000000000000 = 1;
      int O000000000000O;
      boolean O00000000000O;
      StatusEffectInstance O00000000000O0;
      final O0000O00O0OO O00000000000OO = new O0000O00O0OO();
      private final O0000O00O0OO O0000000000O = new O0000O00O0OO();
      final O00000O0O0000 O0000000000O0 = new O00000O0O0000();
      private int O0000000000O00;
      private String O0000000000O0O;
      private String O0000000000OO;
      private int O0000000000OO0 = Integer.MIN_VALUE;
      private String O0000000000OOO;
      private int O000000000O = Integer.MIN_VALUE;
      private boolean O000000000O0;

      W157(String string) {
         this.O00000000 = string;
         int var2 = string.indexOf(58);
         String var3 = var2 > 0 ? string.substring(0, var2) : "minecraft";
         String var4 = var2 > 0 && var2 + 1 < string.length() ? string.substring(var2 + 1) : string;
         this.O000000000 = Identifier.of(var3, "textures/mob_effect/" + var4 + ".png");
      }

      public int O00000000() {
         return !this.O0000000000 && !this.O00000000000 && this.O00000000000O0 != null ? this.O00000000000O0.getDuration() : this.O000000000000O;
      }

      public boolean O000000000() {
         return !this.O0000000000 && this.O00000000000O0 != null && this.O00000000000O0.isInfinite();
      }

      public String O0000000000() {
         if (!this.O00000000000 && !this.O0000000000) {
            if (this.O0000000000O0O == null) {
               this.O0000000000O0O = PotionsHud.O000000000000(I18n.translate(this.O00000000000O0.getTranslationKey(), new Object[0]));
            }

            return this.O0000000000O0O;
         } else {
            return PotionsHud.O000000000000(this.O000000000000);
         }
      }

      public String O00000000000() {
         int var1 = !this.O00000000000 && !this.O0000000000 ? this.O00000000000O0.getAmplifier() + 1 : this.O0000000000000;
         if (var1 == this.O0000000000OO0 && this.O0000000000OO != null) {
            return this.O0000000000OO;
         } else {
            this.O0000000000OO0 = var1;
            this.O0000000000OO = var1 > 1 ? "lvl " + var1 : "";
            return this.O0000000000OO;
         }
      }

      public String O000000000000() {
         boolean var1 = !this.O0000000000 && !this.O00000000000 && this.O00000000000O0 != null && this.O00000000000O0.isInfinite();
         int var2 = !this.O0000000000 && !this.O00000000000 && this.O00000000000O0 != null ? this.O00000000000O0.getDuration() : this.O000000000000O;
         int var3 = var1 ? Integer.MAX_VALUE : Math.max(0, var2 / 20);
         if (var3 == this.O000000000O && var1 == this.O000000000O0 && this.O0000000000OOO != null) {
            return this.O0000000000OOO;
         } else {
            this.O000000000O = var3;
            this.O000000000O0 = var1;
            if (var1) {
               String var4 = PotionsHud.O000000000000(StatusEffectUtil.getDurationText(this.O00000000000O0, 1.0F, 20.0F).getString());
               this.O0000000000OOO = var4 != null && !var4.isEmpty() ? var4 : "∞";
            } else {
               this.O0000000000OOO = var3 / 60 + (var3 % 60 < 10 ? ":0" : ":") + var3 % 60;
            }

            return this.O0000000000OOO;
         }
      }

      public boolean O0000000000000() {
         if (this.O00000000000) {
            return this.O00000000000O;
         } else {
            return this.O0000000000
               ? this.O00000000000O
               : ((StatusEffect)this.O00000000000O0.getEffectType().value()).getCategory() == StatusEffectCategory.HARMFUL;
         }
      }

      public float O000000000000O() {
         this.O0000000000O.O00000000();
         int var1 = !this.O0000000000 && !this.O00000000000 && this.O00000000000O0 != null ? this.O00000000000O0.getDuration() : this.O000000000000O;
         if (var1 > this.O0000000000O00) {
            this.O0000000000O00 = var1;
         }

         float var2 = this.O0000000000O00 <= 0 ? 0.0F : Math.max(0.0F, Math.min(1.0F, (float)var1 / this.O0000000000O00));
         this.O0000000000O.O00000000(var2, 0.2F, O0000O00O0OO0O.O0000000000O0O, false);
         return this.O0000000000O.O000000000000();
      }

      public int O00000000000O() {
         return !this.O0000000000 && !this.O00000000000 && this.O00000000000O0 != null ? this.O00000000000O0.getDuration() : this.O000000000000O;
      }

      public float O00000000000O0() {
         int var1 = !this.O0000000000 && !this.O00000000000 && this.O00000000000O0 != null ? this.O00000000000O0.getDuration() : this.O000000000000O;
         if (!this.O0000000000 && !this.O00000000000 && this.O00000000000O0 != null && this.O00000000000O0.isInfinite()) {
            return 1.0F;
         } else {
            float var2 = Math.max(0.0F, var1 / 20.0F);
            if (var2 > 10.0F) {
               return 1.0F;
            } else {
               float var3 = 1.0F - var2 / 10.0F;
               float var4 = 0.8F + var3 * 4.2F;
               double var5 = System.currentTimeMillis() / 1000.0 * var4 * Math.PI * 2.0;
               return 0.68F + (float)((Math.sin(var5) + 1.0) * 0.5) * 0.32F;
            }
         }
      }
   }
}
