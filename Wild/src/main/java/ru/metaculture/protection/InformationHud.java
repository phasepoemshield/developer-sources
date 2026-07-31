package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.client.network.PlayerListEntry;

@O0000000OOO0(
   O00000000 = "InformationHUD",
   O000000000 = "w"
)
public final class InformationHud extends HudElement implements MinecraftAccessor {
   private static final InformationHud O00000000 = new InformationHud();
   private static double O000000000OO0 = 0.0;
   private static final O0000O00O0OO O000000000OO00 = new O0000O00O0OO();
   private static final O0000O00O0OO O000000000OO0O = new O0000O00O0OO();
   private static final O0000O00O0OO O000000000OOO = new O0000O00O0OO();
   private static final O0000O00O0OO O000000000OOO0 = new O0000O00O0OO();
   private static boolean O000000000OOOO;
   private static final List<InformationHud.W149> O00000000O = new ArrayList<>(4);
   private final ModeSetting O00000000O0 = new ModeSetting("Вид", "Стандарт", "Стандарт", "Строка");
   private final BooleanSetting O00000000O00 = new BooleanSetting("Показывать верхушку", true);
   private final BooleanSetting O00000000O000 = new BooleanSetting("Анимация значений", true);
   private final Map<String, O00000O0O0000> O00000000O0000 = new HashMap<>();
   private final GroupSetting O00000000O000O = new GroupSetting(
      "Отображаемые данные",
      new BooleanSetting("Скорость (BPS)", true),
      new BooleanSetting("Тикрейт (TPS)", true),
      new BooleanSetting("Координаты (XYZ)", true),
      new BooleanSetting("Ping (MS)", true)
   );

   private InformationHud() {
      this.O00000000(this.O00000000O0);
      this.O00000000(this.O00000000O00);
      this.O00000000(this.O00000000O000);
      this.O00000000(this.O00000000O000O);
      ru.metaculture.protection.O000000000O0O0.O00000000(this);
   }

   public static InformationHud O000000000() {
      return O00000000;
   }

   public static void O00000000(RenderManager o0000O00OO0O0) {
      O00000000.O000000000(o0000O00OO0O0);
   }

   public void O000000000(RenderManager o0000O00OO0O0) {
      if (a_.player != null) {
         boolean var2 = false;
         boolean var3 = true;
         O000000000OO0O.O00000000();
         O000000000OO00.O00000000();
         O000000000OO0O.O00000000(var3 ? 1.0 : 0.0, 0.18F, O0000O00O0OO0O.O0000000000O0O, false);
         if (var3) {
            if (!O000000000OOOO) {
               O000000000OO00.O0000000000000(-10.0);
            }

            O000000000OO00.O00000000(0.0, 0.2F, O0000O00O0OO0O.O0000000000O0O, false);
         } else {
            if (O000000000OOOO) {
               O000000000OO00.O0000000000000(0.0);
            }

            O000000000OO00.O00000000(10.0, 0.2F, O0000O00O0OO0O.O0000000000O0O, false);
         }

         O000000000OOOO = var3;
         float var4 = O000000000OO0O.O000000000000();
         if (!(var4 <= 0.01F)) {
            float var5 = 24.0F;
            boolean var6 = this.O00000000O00.O0000000000();
            boolean var7 = HudModule.O0000000000O00();
            O00000OO0OO0O.W239 var8 = var7 ? O00000OO0OO0O.O00000000("HUD_Info") : null;
            float var9 = var7 ? var8.O00000000000O : 7.0F;
            float var10 = var6 ? (var7 ? var8.O00000000000OO : 32.0F) : 0.0F;
            float var11 = var6 ? (var7 ? var8.O00000000000O0 : 5.0F) : 0.0F;
            float var12 = 22.0F;
            float var13 = var7 ? var8.O0000000000O : 22.0F;
            float var14 = var7 ? Math.max(4.0F, var8.O00000000000O + 3.0F) : 10.0F;
            O00000000O.clear();
            if (this.O00000000O000O.O000000000("Скорость (BPS)")) {
               O00000000O.add(new InformationHud.W149("BPS", O0000000000OO0(), O0000O000OO000.O0000000000(255, 90, 90, 255)));
            }

            if (this.O00000000O000O.O000000000("Тикрейт (TPS)")) {
               O00000000O.add(new InformationHud.W149("TPS", O00000000(TpsTracker.O00000000()), O0000O000OO000.O0000000000(255, 170, 40, 255)));
            }

            if (this.O00000000O000O.O000000000("Координаты (XYZ)")) {
               O00000000O.add(new InformationHud.W149("XYZ", O0000000000OOO(), O0000O000OO000.O0000000000(100, 255, 100, 255)));
            }

            if (this.O00000000O000O.O000000000("Ping (MS)")) {
               O00000000O.add(new InformationHud.W149("PING", O000000000O(), O0000O000OO000.O0000000000(120, 190, 255, 255)));
            }

            if (this.O00000000O0.O000000000("Строка")) {
               this.O00000000(o0000O00OO0O0, O00000000O, var4);
            } else {
               String var15 = "Information";
               float var16 = TextMeasureCache.O00000000(FontRegistry.O00000000000, var15, var7 ? var8.O0000000000O0 : 26.0F).O00000000;
               float var17 = var14 * 2.0F + 30.0F;

               for (InformationHud.W149 var19 : O00000000O) {
                  float var20 = TextMeasureCache.O00000000(FontRegistry.O00000000, var19.label, var5).O00000000
                     + TextMeasureCache.O00000000(FontRegistry.O00000000, var19.value, var5).O00000000
                     + var14 * 2.0F
                     + 20.0F;
                  var17 = Math.max(var17, var20);
               }

               float var72 = O00000000O.size() * var13 + 12.0F;
               float var73 = var17 + var9 * 2.0F;
               if (var6) {
                  float var74 = var16 + var12 + var14 * 2.0F + 24.0F;
                  var73 = Math.max(var73, var74 + var9 * 2.0F);
               }

               var17 = var73 - var9 * 2.0F;
               float var75 = var9 + var72 + var9;
               if (var6) {
                  var75 = var9 + var10 + var11 + var72 + var9;
               }

               O000000000OOO.O00000000();
               O000000000OOO0.O00000000();
               O000000000OOO.O00000000(var73, 0.18F, O0000O00O0OO0O.O0000000000O0O, false);
               O000000000OOO0.O00000000(var75, 0.18F, O0000O00O0OO0O.O0000000000O0O, false);
               float var21 = O000000000OOO.O000000000000();
               float var22 = O000000000OOO0.O000000000000();
               float var23 = 10.0F;
               float var24 = 10.0F;
               O00000OO000O.W219 var25 = O00000OO000O.O00000000().O00000000("HUD_Info", var23, var24, var21, var22);
               float var26 = var25.O000000000 + O000000000OO00.O000000000000();
               float var27 = var25.O0000000000;
               float var28 = Math.max(1.0F, var25.O00000000000);
               float var29 = Math.max(1.0F, var25.O000000000000);
               boolean var30 = this.O00000000(var28, var29, var21, var22, O00000000O, var6);
               float var31 = var30 ? O000000000(var29, 38.0F, 54.0F) : O000000000(var29, Math.max(34.0F, var22 * 0.76F), Math.max(var22, var22 * 1.08F));
               var25 = O00000OO000O.O00000000().O00000000(var25, var28, var31, var21, var22);
               var26 = var25.O000000000 + O000000000OO00.O000000000000();
               var27 = var25.O0000000000;
               var28 = var25.O00000000000;
               var31 = var25.O000000000000;
               var30 = this.O00000000(var28, var31, var21, var22, O00000000O, var6);
               this.O00000000(var26, var27, var28, var31);
               float var32 = O000000000(var28 / Math.max(1.0F, var21), 0.76F, 1.28F);
               float var33 = var30 ? 1.0F : O000000000(var31 / Math.max(1.0F, var22), 0.78F, 1.08F);
               float var34 = O000000000(Math.min(var32, var33), 0.86F, 1.12F);
               float var35 = O000000000(var9 * var32, 6.0F, 10.0F);
               float var36 = O000000000(var9 * var33, 6.0F, 9.0F);
               float var37 = var6 ? O000000000(var10 * var33, 27.0F, 36.0F) : 0.0F;
               float var38 = var6 ? O000000000(var11 * var33, 4.0F, 7.0F) : 0.0F;
               float var39 = O000000000(var13 * var33, 19.0F, 26.0F);
               float var40 = O000000000(var14 * var32, 8.0F, 13.0F);
               float var41 = O000000000(var5 * var34, 21.0F, 27.0F);
               float var42 = var4 * this.O000000000O0.O0000000000();
               int var43 = (int)(255.0F * var42);
               int var44 = this.O00000000(var42);
               int var45 = this.O000000000(var42);
               int var46 = this.O0000000000(var42);
               int var47 = this.O00000000000(var42);
               int var48 = this.O000000000000(var42);
               int var49 = this.O000000000000O(var42);
               boolean var50 = this.O0000000000O();
               if (var30) {
                  this.O00000000(o0000O00OO0O0, var26, var27, var28, var31, var15, var6, O00000000O, var42, var48, var49);
                  O00000OO000O.O00000000().O00000000(var25);
                  O00000O0O00O.O00000000(
                     o0000O00OO0O0, this, var25, O00000OO000O.O00000000(), a_.getWindow().getScaledWidth(), a_.getWindow().getScaledHeight()
                  );
               } else {
                  float var51 = var7 ? var8.O00000000 : O000000000(Math.min(var28, var31) * 0.16F, 9.0F, 14.0F);
                  float var52 = var7 ? var8.O000000000 : 11.0F;
                  float var53 = var7 ? var8.O0000000000 : (var6 ? 8.0F : 11.0F);
                  float var54 = Math.max(1.0F, var28 - var35 * 2.0F);
                  this.O00000000(o0000O00OO0O0, var26, var27, var28, var31, var51, var42);
                  if (var6) {
                     if (var50 || this.O0000000000O0() || this.O0000000000O00()) {
                        this.O00000000(o0000O00OO0O0, var26 + var35, var27 + var36, var54, var37, var52, var42);
                     } else if (var7) {
                        o0000O00OO0O0.O00000000(var26 + var35, var27 + var36, var54, var37, var52, var45);
                     } else {
                        o0000O00OO0O0.O00000000(var26 + var35, var27 + var36, var54, var37, 11.0F, 11.0F, 4.0F, 4.0F, var45);
                     }

                     float var55 = O000000000(var12 * var33, 18.0F, 24.0F);
                     float var56 = var26 + var35 + var54 - O000000000(10.0F * var32, 8.0F, 12.0F) - var55;
                     float var57 = var27 + var36 + (var37 - var55) / 2.0F;
                     if (var7) {
                        float var58 = var26 + var8.O0000000000OO0.O00000000 * var32;
                        float var59 = var27 + var8.O0000000000OO0.O000000000 * var33;
                        o0000O00OO0O0.O00000000(FontRegistry.O00000000000, var58, var59, var8.O0000000000O0 * var34, var15, var48);
                        float var60 = var8.O0000000000O00 * var34;
                        float var61 = TextMeasureCache.O00000000(FontRegistry.O000000000000, "e", var60).O00000000;
                        float var62 = (var8.O0000000000OOO.O0000000000 ? var26 + var28 : var26) + var8.O0000000000OOO.O00000000 * var32;
                        float var63 = var27 + var8.O0000000000OOO.O000000000 * var33;
                        o0000O00OO0O0.O00000000(FontRegistry.O000000000000, var62, var63, var60, "e", var49);
                     } else {
                        float var86 = this.O00000000(
                           FontRegistry.O00000000000, var15, O000000000(26.0F * var34, 22.0F, 29.0F), Math.max(18.0F, var54 - var12 - 24.0F)
                        );
                        float var89 = var26 + var35 + O000000000(10.0F * var32, 8.0F, 12.0F);
                        float var91 = Math.max(1.0F, var56 - var89 - 4.0F);
                        o0000O00OO0O0.O00000000(var89, var27 + var36, var91, var37, 0.0F, 0.0F, 0.0F, 0.0F);
                        o0000O00OO0O0.O00000000(FontRegistry.O00000000000, var89, O00000000(var27 + var36, var37, var86), var86, var15, var48);
                        o0000O00OO0O0.O0000000000000();
                        float var93 = O000000000((var5 + 4.0F) * var34, 22.0F, 30.0F);
                        float var95 = TextMeasureCache.O00000000(FontRegistry.O000000000000, "e", var93).O00000000;
                        o0000O00OO0O0.O00000000(FontRegistry.O000000000000, var56 + (var55 - var95) / 2.0F, O00000000(var57, var55, var93), var93, "e", var49);
                     }
                  }

                  float var82 = var27 + var36 + var37 + var38;
                  if (!var6) {
                     var82 = var27 + var36;
                  }

                  float var84 = var26 + var35 + (var7 ? var8.O000000000O.O00000000 * var32 : 0.0F);
                  var82 += var7 ? var8.O000000000O.O000000000 * var33 : 0.0F;
                  float var85;
                  if (var7) {
                     var85 = var72 * var33;
                  } else {
                     float var87 = Math.max(1.0F, var31 - var36 * 2.0F - var37 - var38);
                     var85 = Math.min(Math.max(12.0F, O00000000O.size() * var39 + 12.0F), var87);
                  }

                  if (this.O00000000000O() || var50 || this.O0000000000O0() || this.O0000000000O00()) {
                     if (var50 || this.O0000000000O0() || this.O0000000000O00()) {
                        this.O000000000(o0000O00OO0O0, var84, var82, var54, var85, var53, var42);
                     } else if (var7) {
                        o0000O00OO0O0.O00000000(var84, var82, var54, var85, var53, var46);
                     } else {
                        o0000O00OO0O0.O00000000(var84, var82, var54, var85, var6 ? 4.0F : 11.0F, var6 ? 4.0F : 11.0F, 11.0F, 11.0F, var46);
                     }
                  }

                  o0000O00OO0O0.O00000000(var26, var27, var28, var31, var51, var51, var51, var51);
                  float var88 = var82 + Math.max(6.0F, (var85 - O00000000O.size() * var39) * 0.5F);
                  int var90 = O0000O000OO000.O00000000(this.O000000000000(1.0F), var43);

                  for (InformationHud.W149 var94 : O00000000O) {
                     if (var7) {
                        o0000O00OO0O0.O00000000(FontRegistry.O00000000, var84 + var40, var88 + var39 / 2.0F + 3.0F * var33, var41, var94.label, var90);
                        int var96 = O0000O000OO000.O000000000000(var94.valColor, var43);
                        float var98 = var84 + var54 - var40 - TextMeasureCache.O00000000(FontRegistry.O00000000, var94.value, var41).O00000000;
                        this.O00000000(
                           o0000O00OO0O0,
                           var94.label,
                           var94.value,
                           FontRegistry.O00000000,
                           var84,
                           var88,
                           var54,
                           var39,
                           var98,
                           var88 + var39 / 2.0F + 3.0F * var33,
                           var41,
                           var96
                        );
                     } else {
                        float var97 = Math.max(1.0F, var54 - var40 * 2.0F);
                        float var99 = this.O00000000(var94, var41, var97, O000000000(var41 * 0.34F, 5.0F, 8.0F));
                        float var64 = O00000000(var88, var39, var99);
                        float var65 = var26 + var35 + var40;
                        float var66 = TextMeasureCache.O00000000(FontRegistry.O00000000, var94.label, var99).O00000000;
                        float var67 = TextMeasureCache.O00000000(FontRegistry.O00000000, var94.value, var99).O00000000;
                        float var68 = var26 + var35 + var40 + var97 - var67;
                        float var69 = var65 + var66 + O000000000(var99 * 0.34F, 5.0F, 8.0F);
                        if (var68 < var69) {
                           var68 = var69;
                        }

                        o0000O00OO0O0.O00000000(var65 - 1.0F, var88, var97 + 2.0F, var39, 0.0F, 0.0F, 0.0F, 0.0F);
                        o0000O00OO0O0.O00000000(FontRegistry.O00000000, var65, var64, var99, var94.label, var90);
                        int var70 = O0000O000OO000.O000000000000(var94.valColor, var43);
                        this.O00000000(
                           o0000O00OO0O0,
                           var94.label,
                           var94.value,
                           FontRegistry.O00000000,
                           var65 - 1.0F,
                           var88,
                           var97 + 2.0F,
                           var39,
                           var68,
                           var64,
                           var99,
                           var70
                        );
                        o0000O00OO0O0.O0000000000000();
                     }

                     var88 += var39;
                  }

                  o0000O00OO0O0.O0000000000000();
                  O00000OO000O.O00000000().O00000000(var25);
                  O00000O0O00O.O00000000(
                     o0000O00OO0O0, this, var25, O00000OO000O.O00000000(), a_.getWindow().getScaledWidth(), a_.getWindow().getScaledHeight()
                  );
               }
            }
         }
      }
   }

   private void O00000000(RenderManager o0000O00OO0O0, List<InformationHud.W149> list, float f) {
      float var4 = 22.0F;
      float var5 = 6.0F;
      float var6 = 15.0F;
      float var7 = 12.0F;
      float var8 = 28.0F;
      float var9 = 0.0F;

      for (int var10 = 0; var10 < list.size(); var10++) {
         InformationHud.W149 var11 = (InformationHud.W149)list.get(var10);
         var9 += TextMeasureCache.O00000000(FontRegistry.O00000000, var11.label, var4).O00000000
            + var5
            + TextMeasureCache.O00000000(FontRegistry.O00000000, var11.value, var4).O00000000;
         if (var10 < list.size() - 1) {
            var9 += var6;
         }
      }

      float var34 = var9 + var7 * 2.0F;
      O000000000OOO.O00000000();
      O000000000OOO0.O00000000();
      O000000000OOO.O00000000(var34, 0.18F, O0000O00O0OO0O.O0000000000O0O, false);
      O000000000OOO0.O00000000(var8, 0.18F, O0000O00O0OO0O.O0000000000O0O, false);
      float var35 = O000000000OOO.O000000000000();
      float var12 = O000000000OOO0.O000000000000();
      O00000OO000O.W219 var13 = O00000OO000O.O00000000().O00000000("HUD_Info_Row", 10.0F, 10.0F, var35, var12);
      float var14 = Math.max(1.0F, var13.O00000000000);
      float var15 = Math.max(1.0F, var13.O000000000000);
      var13 = O00000OO000O.O00000000().O00000000(var13, var14, var15, var35, var12);
      float var16 = var13.O000000000 + O000000000OO00.O000000000000();
      float var17 = var13.O0000000000;
      var14 = var13.O00000000000;
      var15 = var13.O000000000000;
      this.O00000000(var16, var17, var14, var15);
      float var18 = O000000000(var14 / Math.max(1.0F, var35), 0.6F, 3.5F);
      float var19 = var4 * var18;
      float var20 = var5 * var18;
      float var21 = var6 * var18;
      float var22 = var7 * var18;
      float var23 = 0.0F;

      for (int var24 = 0; var24 < list.size(); var24++) {
         InformationHud.W149 var25 = (InformationHud.W149)list.get(var24);
         var23 += TextMeasureCache.O00000000(FontRegistry.O00000000, var25.label, var19).O00000000
            + var20
            + TextMeasureCache.O00000000(FontRegistry.O00000000, var25.value, var19).O00000000;
         if (var24 < list.size() - 1) {
            var23 += var21;
         }
      }

      float var39 = f * this.O000000000O0.O0000000000();
      float var40 = O000000000(var15 * 0.32F, 8.0F, 16.0F);
      this.O00000000(o0000O00OO0O0, var16, var17, var14, var15, var40, var39);
      o0000O00OO0O0.O00000000(var16, var17, var14, var15, var40, var40, var40, var40);
      float var26 = var16 + Math.max(var22, (var14 - var23) * 0.5F);
      float var27 = O00000000(var17, var15, var19);
      int var28 = O0000O000OO000.O00000000(this.O0000000000000(1.0F), (int)(255.0F * var39));
      int var29 = (int)(255.0F * var39);

      for (InformationHud.W149 var31 : list) {
         float var32 = TextMeasureCache.O00000000(FontRegistry.O00000000, var31.label, var19).O00000000;
         float var33 = TextMeasureCache.O00000000(FontRegistry.O00000000, var31.value, var19).O00000000;
         o0000O00OO0O0.O00000000(FontRegistry.O00000000, var26, var27, var19, var31.label, var28);
         var26 += var32 + var20;
         this.O00000000(
            o0000O00OO0O0,
            var31.label,
            var31.value,
            FontRegistry.O00000000,
            var16,
            var17,
            var14,
            var15,
            var26,
            var27,
            var19,
            O0000O000OO000.O000000000000(var31.valColor, var29)
         );
         var26 += var33 + var21;
      }

      o0000O00OO0O0.O0000000000000();
      O00000OO000O.O00000000().O00000000(var13);
      O00000O0O00O.O00000000(o0000O00OO0O0, this, var13, O00000OO000O.O00000000(), a_.getWindow().getScaledWidth(), a_.getWindow().getScaledHeight());
   }

   private boolean O00000000(float f, float g, float h, float i, List<InformationHud.W149> list, boolean bl) {
      float var7 = f / Math.max(1.0F, g);
      float var8 = f / Math.max(1.0F, h);
      float var9 = this.O00000000(list, bl);
      return f >= Math.max(190.0F, var9 * 0.86F) && var7 >= 2.35F && var8 >= 1.16F;
   }

   private float O00000000(List<InformationHud.W149> list, boolean bl) {
      float var3 = 22.0F;
      float var4 = bl ? TextMeasureCache.O00000000(FontRegistry.O00000000000, "Information", 22.0F).O00000000 + 36.0F : 0.0F;

      for (InformationHud.W149 var6 : list) {
         var4 += TextMeasureCache.O00000000(FontRegistry.O00000000, var6.label, var3).O00000000;
         var4 += TextMeasureCache.O00000000(FontRegistry.O00000000, var6.value, var3).O00000000;
         var4 += 26.0F;
      }

      return var4 + 28.0F;
   }

   private void O00000000(
      RenderManager o0000O00OO0O0, float f, float g, float h, float i, String string, boolean bl, List<InformationHud.W149> list, float j, int k, int l
   ) {
      float var12 = O000000000(i, 38.0F, 54.0F);
      float var13 = g + (i - var12) * 0.5F;
      float var14 = O000000000(var12 * 0.28F, 10.0F, 14.0F);
      this.O00000000(o0000O00OO0O0, f, var13, h, var12, var14, j);
      float var15 = O000000000(h * 0.033F, 13.0F, 22.0F);
      float var16 = O000000000(var12 * 0.18F, 6.0F, 9.0F);
      float var17 = f + var15;
      float var18 = var13 + var16;
      float var19 = Math.max(1.0F, h - var15 * 2.0F);
      float var20 = Math.max(1.0F, var12 - var16 * 2.0F);
      float var21 = O000000000(var20 * 0.82F, 21.0F, 30.0F);
      float var22 = O000000000(var20 * 0.78F, 21.0F, 29.0F);
      o0000O00OO0O0.O00000000(f, var13, h, var12, var14, var14, var14, var14);
      float var23 = var17;
      float var24 = var19;
      if (bl) {
         float var25 = O000000000(var22 + 1.0F, 21.0F, 30.0F);
         float var26 = TextMeasureCache.O00000000(FontRegistry.O00000000000, string, var22).O00000000;
         float var27 = TextMeasureCache.O00000000(FontRegistry.O000000000000, "e", var25).O00000000;
         boolean var28 = var19 >= 300.0F;
         float var29 = O000000000(var26 + (var28 ? var27 + 15.0F : 0.0F), 78.0F, Math.min(var19 * 0.28F, 142.0F));
         o0000O00OO0O0.O00000000(FontRegistry.O00000000000, var17, O00000000(var18, var20, var22), var22, string, k);
         if (var28) {
            o0000O00OO0O0.O00000000(FontRegistry.O000000000000, var17 + var29 - var27, O00000000(var18, var20, var25), var25, "e", l);
         }

         var23 = var17 + (var29 + O000000000(h * 0.018F, 8.0F, 16.0F));
         var24 = Math.max(1.0F, var17 + var19 - var23);
      }

      int var39 = Math.max(1, list.size());
      float var40 = O000000000(var21 * 0.42F, 7.0F, 12.0F);
      float var41 = var24 / var39;
      int var42 = O0000O000OO000.O00000000(this.O0000000000000(1.0F), (int)(255.0F * j));

      for (int var43 = 0; var43 < list.size(); var43++) {
         InformationHud.W149 var30 = (InformationHud.W149)list.get(var43);
         float var31 = var23 + var41 * var43;
         float var32 = this.O00000000(var30, var21, Math.max(20.0F, var41 - 8.0F), var40);
         float var33 = TextMeasureCache.O00000000(FontRegistry.O00000000, var30.label, var32).O00000000;
         float var34 = TextMeasureCache.O00000000(FontRegistry.O00000000, var30.value, var32).O00000000;
         float var35 = var33 + var40 + var34;
         float var36 = var31 + Math.max(3.0F, (var41 - var35) * 0.5F);
         float var37 = O00000000(var18, var20, var32);
         int var38 = O0000O000OO000.O000000000000(var30.valColor, (int)(255.0F * j));
         o0000O00OO0O0.O00000000(var31 + 1.0F, var13, Math.max(1.0F, var41 - 2.0F), var12, 0.0F, 0.0F, 0.0F, 0.0F);
         o0000O00OO0O0.O00000000(FontRegistry.O00000000, var36, var37, var32, var30.label, var42);
         this.O00000000(
            o0000O00OO0O0,
            var30.label,
            var30.value,
            FontRegistry.O00000000,
            var31 + 1.0F,
            var13,
            Math.max(1.0F, var41 - 2.0F),
            var12,
            var36 + var33 + var40,
            var37,
            var32,
            var38
         );
         o0000O00OO0O0.O0000000000000();
      }

      o0000O00OO0O0.O0000000000000();
   }

   private void O00000000(
      RenderManager o0000O00OO0O0,
      String string,
      String string2,
      FontObject o0000O0O00O00O,
      float f,
      float g,
      float h,
      float i,
      float j,
      float k,
      float l,
      int m
   ) {
      if (!this.O00000000O000.O0000000000()) {
         o0000O00OO0O0.O00000000(o0000O0O00O00O, j, k, l, string2, m);
      } else {
         O00000O0O0000 var13 = this.O00000000O0000.get(string);
         if (var13 == null) {
            var13 = new O00000O0O0000();
            this.O00000000O0000.put(string, var13);
         }

         var13.O00000000(string2);
         var13.O000000000(o0000O00OO0O0, o0000O0O00O00O, f, g, h, i, Math.min(i * 0.45F, 6.0F), j, k, l, m);
      }
   }

   private float O00000000(InformationHud.W149 o00000000, float f, float g, float h) {
      float var5 = f;

      for (int var6 = 0; var6 < 8; var6++) {
         float var7 = TextMeasureCache.O00000000(FontRegistry.O00000000, o00000000.label, var5).O00000000;
         float var8 = TextMeasureCache.O00000000(FontRegistry.O00000000, o00000000.value, var5).O00000000;
         float var9 = var7 + h + var8;
         if (var9 <= g || var5 <= 16.0F) {
            return var5;
         }

         var5 = Math.max(16.0F, var5 * Math.max(0.72F, g / Math.max(1.0F, var9)));
      }

      return var5;
   }

   private float O00000000(FontObject o0000O0O00O00O, String string, float f, float g) {
      float var5 = f;

      for (int var6 = 0; var6 < 8; var6++) {
         float var7 = TextMeasureCache.O00000000(o0000O0O00O00O, string, var5).O00000000;
         if (var7 <= g || var5 <= 16.0F) {
            return var5;
         }

         var5 = Math.max(16.0F, var5 * Math.max(0.72F, g / Math.max(1.0F, var7)));
      }

      return var5;
   }

   private static float O00000000(float f, float g, float h) {
      return f + g * 0.5F + h * 0.18F;
   }

   private static float O000000000(float f, float g, float h) {
      return Math.max(g, Math.min(h, f));
   }

   private static String O0000000000OO0() {
      double var0 = 0.0;
      if (a_.player != null) {
         double var2 = a_.player.getX() - a_.player.lastX;
         double var4 = a_.player.getZ() - a_.player.lastZ;
         var0 = Math.sqrt(var2 * var2 + var4 * var4) * 20.0;
      }

      O000000000OO0 = O000000000OO0 + (var0 - O000000000OO0) * 0.1;
      return O000000000(O000000000OO0);
   }

   private static String O0000000000OOO() {
      if (a_.player != null) {
         int var0 = (int)a_.player.getX();
         int var1 = (int)a_.player.getY();
         int var2 = (int)a_.player.getZ();
         return var0 + " " + var1 + " " + var2;
      } else {
         return "0 0 0";
      }
   }

   private static String O000000000O() {
      if (a_.player != null && a_.getNetworkHandler() != null) {
         PlayerListEntry var0 = a_.getNetworkHandler().getPlayerListEntry(a_.player.getUuid());
         return var0 == null ? "0 ms" : var0.getLatency() + " ms";
      } else {
         return "0 ms";
      }
   }

   private static String O00000000(double d) {
      int var2 = (int)Math.round(d * 10.0);
      int var3 = var2 / 10;
      int var4 = Math.abs(var2 % 10);
      return var3 + "." + var4;
   }

   private static String O000000000(double d) {
      int var2 = (int)Math.round(d * 100.0);
      int var3 = var2 / 100;
      int var4 = Math.abs(var2 % 100);
      return var3 + (var4 < 10 ? ".0" : ".") + var4;
   }

   record W149(String label, String value, int valColor) {
   }
}
