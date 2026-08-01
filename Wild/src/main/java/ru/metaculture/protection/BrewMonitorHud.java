package ru.metaculture.protection;

import java.util.List;

@O0000000OOO0(
   O00000000 = "Brew Monitor",
   O000000000 = "i"
)
public final class BrewMonitorHud extends HudElement implements MinecraftAccessor {
   private static final BrewMonitorHud O00000000 = new BrewMonitorHud();
   private static final O0000O00O0OO O000000000OO0 = new O0000O00O0OO();
   private static final int O000000000OO00 = 6;

   private BrewMonitorHud() {
      ru.metaculture.protection.O000000000O0O0.O00000000(this);
   }

   public static void O00000000(RenderManager o0000O00OO0O0) {
      O00000000.O000000000(o0000O00OO0O0);
   }

   private void O000000000(RenderManager o0000O00OO0O0) {
      if (a_.player != null && a_.world != null) {
         O000000000OO0.O00000000();
         O000000000OO0.O00000000(AutoPottBot.O000000000O ? 1.0 : 0.0, 0.2F, O0000O00O0OO0O.O0000000000O0O, false);
         float var2 = O000000000OO0.O000000000000();
         if (!(var2 <= 0.01F)) {
            List var3 = AutoPottBot.O000000000OO0;
            List var4 = AutoPottBot.O000000000OO00;
            int[] var5 = AutoPottBot.O000000000OO;
            int var6 = Math.min(var3.size(), 6);
            float var7 = 252.0F;
            float var8 = 52.0F;
            float var9 = 32.0F;
            float var10 = 15.0F;
            float var11 = var4.isEmpty() ? 0.0F : 16.0F;
            float var12 = var8 + var9 + var6 * var10 + var11 + 12.0F;
            O00000OO000O.W219 var13 = O00000OO000O.O00000000().O00000000("HUD_BrewMonitor", 12.0F, 300.0F, var7, var12);
            float var14 = var2 * this.O000000000O0.O0000000000();
            float var15 = var13.O000000000;
            float var16 = var13.O0000000000;
            float var17 = var13.O00000000000;
            float var18 = var13.O000000000000;
            this.O00000000(var15, var16, var17, var18);
            int var19 = this.O000000000000(var14);
            int var20 = this.O0000000000000(var14);
            int var21 = AutoPottBot.O000000000O ? O00000000(5954680, var14) : O00000000(8421512, var14);
            this.O00000000(o0000O00OO0O0, var15, var16, var17, var18, 12.0F, var14);
            float var22 = 12.0F;
            o0000O00OO0O0.O000000000(var15 + var22 + 4.0F, var16 + 15.0F, 4.0F, 0.0F, 360.0F, var21);
            o0000O00OO0O0.O00000000(FontRegistry.O00000000000, var15 + var22 + 14.0F, var16 + 18.0F, 21.0F, "Brew Monitor", var19);
            String var23 = AutoPottBot.O000000000O0;
            float var24 = TextMeasureCache.O00000000(FontRegistry.O00000000, var23, 14.0F).O00000000;
            o0000O00OO0O0.O00000000(FontRegistry.O00000000, var15 + var17 - var22 - var24, var16 + 17.0F, 14.0F, var23, var20);
            String var25 = "Варок "
               + AutoPottBot.O000000000O00
               + "   вар "
               + AutoPottBot.O000000000O000
               + "   своб "
               + AutoPottBot.O000000000O00O
               + "   гот "
               + AutoPottBot.O000000000O0O
               + "   зелий ≈ "
               + AutoPottBot.O000000000O0O0;
            o0000O00OO0O0.O00000000(FontRegistry.O00000000, var15 + var22, var16 + 36.0F, 13.0F, var25, O0000O000OO000.O00000000(var20, (int)(235.0F * var14)));
            float var26 = var16 + 54.0F;
            String var27 = "Вода " + var5[0] + "    Бут " + AutoPottBot.O000000000O0OO + "    Нарост " + var5[1] + "    Блэйз " + var5[2];
            String var28 = "Глоу " + var5[3] + "    Сахар " + var5[4] + "    Магма " + var5[5] + "    Редст " + var5[6];
            o0000O00OO0O0.O00000000(FontRegistry.O00000000, var15 + var22, var26, 12.5F, var27, var20);
            var26 += 14.0F;
            o0000O00OO0O0.O00000000(FontRegistry.O00000000, var15 + var22, var26, 12.5F, var28, var20);
            var26 += 18.0F;
            float var29 = 84.0F;
            float var30 = var15 + var17 - var22 - var29;

            for (int var31 = 0; var31 < var6; var31++) {
               AutoPottBot.W73 var32 = (AutoPottBot.W73)var3.get(var31);
               o0000O00OO0O0.O00000000(FontRegistry.O00000000, var15 + var22, var26 + 1.0F, 12.5F, var32.label(), var19);
               float var33 = var26 + 2.5F;
               float var34 = 4.0F;
               o0000O00OO0O0.O00000000(var30, var33, var29, var34, var34 / 2.0F, O00000000(0, var14 * 0.55F));
               float var35 = Math.max(0.0F, Math.min(1.0F, var32.progress()));
               if (var35 > 0.001F) {
                  o0000O00OO0O0.O00000000(var30, var33, var29 * var35, var34, var34 / 2.0F, O00000000(var32.color(), var14));
               }

               var26 += var10;
            }

            if (!var4.isEmpty()) {
               String var38 = "Не хватает: " + String.join(", ", var4);
               o0000O00OO0O0.O00000000(FontRegistry.O00000000, var15 + var22, var26 + 2.0F, 12.5F, var38, O00000000(16737392, var14));
            }

            O00000OO000O.O00000000().O00000000(var13);
            O00000O0O00O.O00000000(o0000O00OO0O0, this, var13, O00000OO000O.O00000000(), a_.getWindow().getScaledWidth(), a_.getWindow().getScaledHeight());
         }
      }
   }

   private static int O00000000(int i, float f) {
      int var2 = (int)(255.0F * Math.max(0.0F, Math.min(1.0F, f)));
      return O0000O000OO000.O0000000000(i >> 16 & 0xFF, i >> 8 & 0xFF, i & 0xFF, var2);
   }
}
