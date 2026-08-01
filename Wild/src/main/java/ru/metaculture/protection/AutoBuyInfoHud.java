package ru.metaculture.protection;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

@ModuleAccess(
   O0000000000 = {"lichoday"}
)
@O0000000OOO0(
   O00000000 = "AutoBuyInfoHUD",
   O000000000 = "W"
)
public final class AutoBuyInfoHud extends HudElement implements MinecraftAccessor {
   private static final AutoBuyInfoHud O00000000 = new AutoBuyInfoHud();
   private static final O0000O00O0OO O000000000OO0 = new O0000O00O0OO();
   private static final O0000O00O0OO O000000000OO00 = new O0000O00O0OO();
   private static final O0000O00O0OO O000000000OO0O = new O0000O00O0OO();
   private static final List<AutoBuyInfoHud.W142> O000000000OOO = new ArrayList<>(8);
   private static final SimpleDateFormat O000000000OOO0 = new SimpleDateFormat("HH:mm:ss");

   private AutoBuyInfoHud() {
      ru.metaculture.protection.O000000000O0O0.O00000000(this);
   }

   public static void O00000000(RenderManager o0000O00OO0O0) {
      O00000000.O000000000(o0000O00OO0O0);
   }

   public void O000000000(RenderManager o0000O00OO0O0) {
      if (a_.player != null && AutoBuy.O000000000O != null) {
         AutoBuy var2 = AutoBuy.O000000000O;
         O000000000OOO.clear();
         O000000000OOO.add(
            new AutoBuyInfoHud.W142(
               "Статус",
               var2.O0000000000000 ? "ON" : "OFF",
               var2.O0000000000000 ? O0000O000OO000.O0000000000(100, 255, 140, 255) : O0000O000OO000.O0000000000(255, 90, 90, 255)
            )
         );
         O000000000OOO.add(new AutoBuyInfoHud.W142("Режим", var2.O000000000O00O.O0000000000(), O0000O000OO000.O0000000000(120, 190, 255, 255)));
         O000000000OOO.add(new AutoBuyInfoHud.W142("Время", O000000000(O000000000()), O0000O000OO000.O0000000000(255, 255, 255, 255)));
         O000000000OOO.add(new AutoBuyInfoHud.W142("Сделки", String.valueOf(AutoBuy.O0000000000OO()), O0000O000OO000.O0000000000(255, 190, 80, 255)));
         O000000000OOO.add(new AutoBuyInfoHud.W142("Предметы", String.valueOf(AutoBuy.O0000000000OO0()), O0000O000OO000.O0000000000(255, 190, 80, 255)));
         O000000000OOO.add(new AutoBuyInfoHud.W142("Потрачено", O00000000(AutoBuy.O0000000000OOO()), O0000O000OO000.O0000000000(255, 120, 120, 255)));
         O000000000OOO.add(new AutoBuyInfoHud.W142("Баланс", O0000000000OO0(), O0000O000OO000.O0000000000(160, 220, 255, 255)));
         O000000000OOO.add(
            new AutoBuyInfoHud.W142(
               "Окуп",
               O0000000000OOO(),
               AutoBuy.O00000000OO > 0L ? O0000O000OO000.O0000000000(100, 255, 140, 255) : O0000O000OO000.O0000000000(180, 180, 180, 255)
            )
         );
         O000000000OO0.O00000000();
         O000000000OO0.O00000000(1.0, 0.2F, O0000O00O0OO0O.O0000000000O0O, false);
         float var3 = O000000000OO0.O000000000000();
         if (!(var3 <= 0.01F)) {
            float var4 = 22.0F;
            float var5 = 7.0F;
            float var6 = 32.0F;
            float var7 = 22.0F;
            float var8 = 5.0F;
            float var9 = 28.0F;
            String var10 = "AutoBuy";
            float var11 = 0.0F;
            float var12 = 0.0F;

            for (AutoBuyInfoHud.W142 var14 : O000000000OOO) {
               var11 = Math.max(var11, TextMeasureCache.O000000000(FontRegistry.O00000000, var14.label(), var4));
               var12 = Math.max(var12, TextMeasureCache.O000000000(FontRegistry.O00000000, var14.value(), var4));
            }

            float var55 = var11 + var12 + 20.0F + 22.0F;
            float var56 = TextMeasureCache.O000000000(FontRegistry.O00000000000, var10, var9) + 42.0F;
            float var15 = Math.max(var55, var56) + var5 * 2.0F;
            float var16 = O000000000OOO.size() * var7 + 10.0F;
            float var17 = var5 + var6 + var8 + var16 + var5;
            O000000000OO00.O00000000();
            O000000000OO0O.O00000000();
            O000000000OO00.O00000000(var15, 0.18F, O0000O00O0OO0O.O0000000000O0O, false);
            O000000000OO0O.O00000000(var17, 0.18F, O0000O00O0OO0O.O0000000000O0O, false);
            float var18 = O000000000OO00.O000000000000();
            float var19 = O000000000OO0O.O000000000000();
            float var20 = 10.0F;
            float var21 = 155.0F;
            O00000OO000O.W219 var22 = O00000OO000O.O00000000().O00000000("HUD_AutoBuyInfo", var20, var21, var18, var19);
            float var23 = var22.O000000000;
            float var24 = var22.O0000000000;
            float var25 = var22.O00000000000;
            float var26 = var22.O000000000000;
            this.O00000000(var23, var24, var25, var26);
            float var27 = var25 / Math.max(1.0F, var18);
            float var28 = var26 / Math.max(1.0F, var19);
            float var29 = Math.min(var27, var28);
            float var30 = var5 * var27;
            float var31 = var5 * var28;
            float var32 = var6 * var28;
            float var33 = var7 * var28;
            float var34 = var4 * var29;
            float var35 = var3 * this.O000000000O0.O0000000000();
            int var36 = (int)(255.0F * var35);
            int var37 = this.O00000000(var35);
            int var38 = this.O000000000(var35);
            int var39 = this.O0000000000(var35);
            int var40 = this.O00000000000(var35);
            int var41 = O0000O000OO000.O00000000(this.O000000000000(1.0F), var36);
            int var42 = O0000O000OO000.O00000000(this.O0000000000000(1.0F), var36);
            int var43 = this.O00000000000O(var35);
            boolean var44 = this.O0000000000O();
            float var45 = 14.0F;
            float var46 = var25 - var30 * 2.0F;
            this.O00000000(o0000O00OO0O0, var23, var24, var25, var26, var45, var35);
            if (var44) {
               this.O00000000(o0000O00OO0O0, var23 + var30, var24 + var31, var46, var32, 11.0F, var35);
            } else {
               o0000O00OO0O0.O00000000(var23 + var30, var24 + var31, var46, var32, 11.0F, 11.0F, 4.0F, 4.0F, var38);
            }

            o0000O00OO0O0.O00000000(
               FontRegistry.O00000000000, var23 + var30 + 10.0F * var27, var24 + var31 + var32 * 0.5F + 6.0F * var28, var9 * var29, var10, var41
            );
            float var47 = 20.0F * var29;
            float var48 = TextMeasureCache.O000000000(FontRegistry.O00000000000O, "W", var47);
            o0000O00OO0O0.O00000000(
               FontRegistry.O00000000000O, var23 + var30 + var46 - 18.0F * var27 - var48 * 0.5F, var24 + var31 + var32 * 0.5F + 5.0F * var28, var47, "W", var43
            );
            float var49 = var24 + var31 + var32 + var8 * var28;
            if (this.O00000000000O() || var44) {
               if (var44) {
                  this.O000000000(o0000O00OO0O0, var23 + var30, var49, var46, var16 * var28, 8.0F, var35);
               } else {
                  o0000O00OO0O0.O00000000(var23 + var30, var49, var46, var16 * var28, 4.0F, 4.0F, 11.0F, 11.0F, var39);
               }
            }

            o0000O00OO0O0.O00000000(var23, var24, var25, var26, var45, var45, var45, var45);
            float var50 = var49 + 5.0F * var28;

            for (AutoBuyInfoHud.W142 var52 : O000000000OOO) {
               o0000O00OO0O0.O00000000(FontRegistry.O00000000, var23 + var30 + 10.0F * var27, var50 + var33 * 0.5F + 4.0F * var28, var34, var52.label(), var42);
               int var53 = O0000O000OO000.O00000000(var52.color(), var36);
               float var54 = TextMeasureCache.O000000000(FontRegistry.O00000000, var52.value(), var34);
               o0000O00OO0O0.O00000000(
                  FontRegistry.O00000000, var23 + var25 - var30 - 10.0F * var27 - var54, var50 + var33 * 0.5F + 4.0F * var28, var34, var52.value(), var53
               );
               var50 += var33;
            }

            o0000O00OO0O0.O0000000000000();
            O00000OO000O.O00000000().O00000000(var22);
            O00000O0O00O.O00000000(o0000O00OO0O0, this, var22, O00000OO000O.O00000000(), a_.getWindow().getScaledWidth(), a_.getWindow().getScaledHeight());
         }
      }
   }

   private static long O000000000() {
      return AutoBuy.O00000000O0OO <= 0L ? 0L : Math.max(0L, System.currentTimeMillis() - AutoBuy.O00000000O0OO);
   }

   private static String O0000000000OO0() {
      if (AutoBuy.O00000000O0OO0 > 0L && AutoBuy.O00000000O0OOO > 0L) {
         long var0 = AutoBuy.O000000000O();
         return O00000000(AutoBuy.O00000000O0OOO) + " (" + (var0 >= 0L ? "+" : "") + O00000000(var0) + ")";
      } else {
         return "N/A";
      }
   }

   private static String O0000000000OOO() {
      if (AutoBuy.O00000000OO > 0L && AutoBuy.O00000000O0OO > 0L) {
         return O000000000OOO0.format(new Date(AutoBuy.O00000000OO)) + " (" + O000000000(AutoBuy.O00000000OO - AutoBuy.O00000000O0OO) + ")";
      } else {
         return AutoBuy.O0000000000OOO() <= 0L ? "-" : "ожидание";
      }
   }

   private static String O00000000(long l) {
      long var2 = Math.abs(l);
      String var4 = String.format(Locale.ROOT, "%,d", var2).replace(',', ' ') + "¤";
      return l < 0L ? "-" + var4 : var4;
   }

   private static String O000000000(long l) {
      long var2 = Math.max(0L, l / 1000L);
      long var4 = var2 / 3600L;
      long var6 = var2 % 3600L / 60L;
      long var8 = var2 % 60L;
      return var4 > 0L ? String.format(Locale.ROOT, "%d:%02d:%02d", var4, var6, var8) : String.format(Locale.ROOT, "%02d:%02d", var6, var8);
   }

   record W142(String label, String value, int color) {
   }
}
