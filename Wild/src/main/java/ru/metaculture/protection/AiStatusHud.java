package ru.metaculture.protection;

import java.util.Locale;

@ModuleAccess(
   O0000000000 = {"lichoday"}
)
@O0000000OOO0(
   O00000000 = "AI Status",
   O000000000 = "i"
)
public final class AiStatusHud extends HudElement implements MinecraftAccessor {
   private static final AiStatusHud O00000000 = new AiStatusHud();
   private static final O0000O00O0OO O000000000OO0 = new O0000O00O0OO();
   private static final O0000O00O0OO O000000000OO00 = new O0000O00O0OO();
   private static final O0000O00O0OO O000000000OO0O = new O0000O00O0OO();

   private AiStatusHud() {
      ru.metaculture.protection.O000000000O0O0.O00000000(this);
   }

   public static void O00000000(RenderManager o0000O00OO0O0) {
      O00000000.O000000000(o0000O00OO0O0);
   }

   private void O000000000(RenderManager o0000O00OO0O0) {
      if (a_.player != null && a_.world != null) {
         O000000O0OOOOO var2 = O000000O0O0O00.O000000000OO0();
         boolean var3 = AttackAura.O000000000O00.O000000000("AI") || System.currentTimeMillis() - var2.updatedAtMs() < 2000L;
         O000000000OO0.O00000000();
         O000000000OO00.O00000000();
         O000000000OO0O.O00000000();
         O000000000OO0.O00000000(var3 ? 1.0 : 0.0, 0.2F, O0000O00O0OO0O.O0000000000O0O, false);
         if (!(O000000000OO0.O000000000000() <= 0.01F)) {
            String var4 = "AI Aura";
            String var5 = var2.text();
            String var6 = "Frames " + var2.queuedRecords() + "  Saved " + var2.writtenRecords();
            float var7 = 24.0F;
            float var8 = 21.0F;
            float var9 = 18.0F;
            float var10 = TextMeasureCache.O00000000(FontRegistry.O00000000000, var4, var7).O00000000;
            float var11 = TextMeasureCache.O00000000(FontRegistry.O00000000, var5, var8).O00000000;
            float var12 = TextMeasureCache.O00000000(FontRegistry.O00000000, var6, var9).O00000000;
            float var13 = Math.max(142.0F, Math.max(var10 + var11 + 48.0F, var12 + 44.0F));
            float var14 = 48.0F;
            if (O000000000OO00.O000000000000() <= 1.0F) {
               O000000000OO00.O0000000000000(var13);
            }

            O000000000OO00.O00000000(var13, 0.18F, O0000O00O0OO0O.O0000000000O0O, false);
            float var15 = O000000000OO00.O000000000000();
            float var17 = (a_.getWindow().getFramebufferWidth() - var15) * 0.5F;
            float var18 = 52.0F;
            O00000OO000O.W219 var19 = O00000OO000O.O00000000().O00000000("HUD_AIStatus", var17, var18, var15, var14);
            float var20 = O000000000OO0.O000000000000() * this.O000000000O0.O0000000000();
            float var21 = var19.O000000000;
            float var22 = var19.O0000000000;
            float var23 = var19.O00000000000;
            float var24 = var19.O000000000000;
            this.O00000000(var21, var22, var23, var24);
            float var25 = 12.0F;
            int var26 = this.O000000000(var20);
            int var27 = this.O000000000000(var20);
            int var28 = this.O0000000000000(var20);
            int var29 = this.O00000000(var2, var20);
            float var30 = this.O00000000(var2);
            this.O00000000(o0000O00OO0O0, var21, var22, var23, var24, var25, var20);
            if (!this.O0000000000O() && this.O00000000000()) {
               o0000O00OO0O0.O00000000(
                  var21 + 8.0F, var22 + var24 - 3.0F, var23 - 16.0F, 4.0F, 6.0F, 12.0F, 1.0F, O0000O000OO000.O00000000(var29, (int)(50.0F * var20))
               );
            }

            if (this.O0000000000O()) {
               this.O000000000(o0000O00OO0O0, var21 + 6.0F, var22 + 6.0F, var23 - 12.0F, var24 - 12.0F, 8.0F, var20);
            } else {
               o0000O00OO0O0.O00000000(var21 + 6.0F, var22 + 6.0F, var23 - 12.0F, var24 - 12.0F, 8.0F, var26);
            }

            o0000O00OO0O0.O00000000(
               var21 + 10.0F,
               var22 + var24 - 2.0F,
               var23 - 20.0F,
               1.0F,
               0.5F,
               O0000O000OO000.O00000000(this.O00000000000O0(1.0F), (int)(22.0F * var20)),
               O0000O000OO000.O00000000(var29, (int)(74.0F * var20))
            );
            float var31 = var21 + 20.0F;
            float var32 = var22 + var24 * 0.5F;
            o0000O00OO0O0.O000000000(
               var31, var32, 8.0F + var30 * 5.0F, 0.0F, 360.0F, O0000O000OO000.O00000000(var29, (int)(42.0F * var20 * (1.0F - var30 * 0.5F)))
            );
            o0000O00OO0O0.O000000000(var31, var32, 4.0F, 0.0F, 360.0F, var29);
            o0000O00OO0O0.O00000000(FontRegistry.O00000000000, var21 + 36.0F, var22 + 20.0F, var7, var4, var27);
            o0000O00OO0O0.O00000000(FontRegistry.O00000000, var21 + var23 - 12.0F - var11, var22 + 20.0F, var8, var5, var28);
            o0000O00OO0O0.O00000000(
               FontRegistry.O00000000, var21 + 36.0F, var22 + 38.0F, var9, var6, O0000O000OO000.O0000000000(155, 165, 180, (int)(165.0F * var20))
            );
            O00000OO000O.O00000000().O00000000(var19);
            O00000O0O00O.O00000000(o0000O00OO0O0, this, var19, O00000OO000O.O00000000(), a_.getWindow().getScaledWidth(), a_.getWindow().getScaledHeight());
         }
      }
   }

   private int O00000000(O000000O0OOOOO o000000O0OOOOO, float f) {
      String var3 = o000000O0OOOOO.text().toLowerCase(Locale.ROOT);
      if (var3.contains("failed") || var3.contains("error") || var3.contains("missing")) {
         return O0000O000OO000.O0000000000(255, 96, 112, (int)(255.0F * f));
      } else if (o000000O0OOOOO.training()) {
         return O0000O000OO000.O0000000000(255, 198, 92, (int)(255.0F * f));
      } else if (o000000O0OOOOO.loadingModel()) {
         return O0000O000OO000.O0000000000(120, 176, 255, (int)(255.0F * f));
      } else if (var3.contains("recording")) {
         return O0000O000OO000.O0000000000(92, 235, 182, (int)(255.0F * f));
      } else {
         return !var3.contains("replay") && !var3.contains("ready")
            ? O0000O000OO000.O00000000(this.O00000000000O(1.0F), (int)(255.0F * f))
            : O0000O000OO000.O0000000000(128, 226, 255, (int)(255.0F * f));
      }
   }

   private float O00000000(O000000O0OOOOO o000000O0OOOOO) {
      boolean var2 = o000000O0OOOOO.training() || o000000O0OOOOO.text().contains("recording") || o000000O0OOOOO.text().contains("replay");
      O000000000OO0O.O00000000(var2 ? 1.0 : 0.0, 0.2F, O0000O00O0OO0O.O0000000000O0O, false);
      return O000000000OO0O.O000000000000() * (0.5F + 0.5F * (float)Math.sin(System.currentTimeMillis() / 180.0));
   }
}
