package ru.metaculture.protection;

import java.util.Locale;
import net.minecraft.util.math.MathHelper;

@O0000000OOO0(
   O00000000 = "Neuro Monitor",
   O000000000 = "i"
)
public final class NeuroMonitorHud extends HudElement implements MinecraftAccessor {
   private static final NeuroMonitorHud O00000000 = new NeuroMonitorHud();
   private static final O0000O00O0OO O000000000OO0 = new O0000O00O0OO();

   private NeuroMonitorHud() {
      ru.metaculture.protection.O000000000O0O0.O00000000(this);
   }

   public static void O00000000(RenderManager o0000O00OO0O0) {
      O00000000.O000000000(o0000O00OO0O0);
   }

   private void O000000000(RenderManager o0000O00OO0O0) {
      if (a_.player != null && a_.world != null) {
         O000000O0OOOOO var2 = O000000O0O0O00.O000000000OO0();
         long var3 = System.currentTimeMillis();
         boolean var5 = AttackAura.O000000000O00.O000000000("AI") || O000000O0O0O00.O000000000O0OO() || var2.training() || var3 - var2.updatedAtMs() < 4000L;
         O000000000OO0.O00000000();
         O000000000OO0.O00000000(var5 ? 1.0 : 0.0, 0.2F, O0000O00O0OO0O.O0000000000O0O, false);
         float var6 = O000000000OO0.O000000000000();
         if (!(var6 <= 0.01F)) {
            float var7 = 306.0F;
            float var8 = 170.0F;
            float var9 = 12.0F;
            float var10 = 120.0F;
            O00000OO000O.W219 var11 = O00000OO000O.O00000000().O00000000("HUD_NeuroMonitor", var9, var10, var7, var8);
            float var12 = var6 * this.O000000000O0.O0000000000();
            float var13 = var11.O000000000;
            float var14 = var11.O0000000000;
            float var15 = var11.O00000000000;
            float var16 = var11.O000000000000;
            this.O00000000(var13, var14, var15, var16);
            int var17 = this.O000000000000(var12);
            int var18 = this.O0000000000000(var12);
            int var19 = this.O00000000000O(var12);
            int var20 = O0000O000OO000.O0000000000(255, 156, 86, (int)(255.0F * var12));
            int var21 = this.O00000000(var2, var12);
            this.O00000000(o0000O00OO0O0, var13, var14, var15, var16, 12.0F, var12);
            float var22 = 12.0F;
            o0000O00OO0O0.O000000000(var13 + var22 + 4.0F, var14 + 15.0F, 4.0F, 0.0F, 360.0F, var21);
            o0000O00OO0O0.O00000000(FontRegistry.O00000000000, var13 + var22 + 14.0F, var14 + 18.0F, 21.0F, "Neuro Monitor", var17);
            String var23 = var2.text();
            float var24 = TextMeasureCache.O00000000(FontRegistry.O00000000, var23, 15.0F).O00000000;
            o0000O00OO0O0.O00000000(FontRegistry.O00000000, var13 + var15 - var22 - var24, var14 + 17.0F, 15.0F, var23, var18);
            String var25 = O000000O0O0O00.O0000000000O0O() < 0.0F ? "—" : String.format(Locale.ROOT, "%.4f", O000000O0O0O00.O0000000000O0O());
            String var26 = "Profile "
               + O000000O0O0O00.O000000000OOOO()
               + "   Pairs "
               + O000000O0O0O00.O0000000000OO()
               + "   Loss "
               + var25
               + "   Jitter "
               + String.format(Locale.ROOT, "%.2f", AttackAura.O000000000O00O.O0000000000());
            o0000O00OO0O0.O00000000(FontRegistry.O00000000, var13 + var22, var14 + 35.0F, 13.0F, var26, O0000O000OO000.O00000000(var18, (int)(215.0F * var12)));
            float var27 = var13 + var22;
            float var28 = var15 - var22 * 2.0F;
            float var29 = 44.0F;
            float var30 = var14 + 50.0F;
            o0000O00OO0O0.O00000000(FontRegistry.O00000000, var27, var30, 13.0F, "Твой стиль (датасет)", var18);
            this.O00000000(o0000O00OO0O0, var27 + var28, var30, var19, var20, var12);
            this.O00000000(
               o0000O00OO0O0,
               var27,
               var30 + 5.0F,
               var28,
               var29,
               O000000O0O0O00.O0000000000O0(),
               O000000O0O0O00.O0000000000O00(),
               -1,
               var12,
               var19,
               var20,
               "Нет записи — .ai train -> .ai learn"
            );
            float var31 = var30 + 5.0F + var29 + 12.0F;
            String var32 = O000000O0O0O00.O000000000O0OO() ? "Твой аим — запись (live)" : (O000000O0O0O00.O000000000O0() ? "Нейросеть — бой (live)" : "Live");
            o0000O00OO0O0.O00000000(FontRegistry.O00000000, var27, var31, 13.0F, var32, var18);
            this.O00000000(
               o0000O00OO0O0,
               var27,
               var31 + 5.0F,
               var28,
               var29,
               O000000O0O0O00.O00000000000O(),
               O000000O0O0O00.O00000000000O0(),
               O000000O0O0O00.O00000000000OO(),
               var12,
               var19,
               var20,
               "Ожидание..."
            );
            O00000OO000O.O00000000().O00000000(var11);
            O00000O0O00O.O00000000(o0000O00OO0O0, this, var11, O00000OO000O.O00000000(), a_.getWindow().getScaledWidth(), a_.getWindow().getScaledHeight());
         }
      }
   }

   private void O00000000(RenderManager o0000O00OO0O0, float f, float g, int i, int j, float h) {
      float var7 = 12.0F;
      String var8 = "Pitch";
      String var9 = "Yaw";
      float var10 = TextMeasureCache.O00000000(FontRegistry.O00000000, var8, var7).O00000000;
      float var11 = TextMeasureCache.O00000000(FontRegistry.O00000000, var9, var7).O00000000;
      float var12 = f - var10;
      o0000O00OO0O0.O00000000(FontRegistry.O00000000, var12, g, var7, var8, O0000O000OO000.O00000000(j, (int)(255.0F * h)));
      float var13 = var12 - 10.0F - var11;
      o0000O00OO0O0.O00000000(FontRegistry.O00000000, var13, g, var7, var9, O0000O000OO000.O00000000(i, (int)(255.0F * h)));
   }

   private void O00000000(RenderManager o0000O00OO0O0, float f, float g, float h, float i, float[] fs, float[] gs, int j, float k, int l, int m, String string) {
      o0000O00OO0O0.O00000000(f, g, h, i, 6.0F, O0000O000OO000.O0000000000(8, 10, 16, (int)(150.0F * k)));
      if (this.O000000000000()) {
         o0000O00OO0O0.O00000000(f, g, h, i, 6.0F, this.O00000000000(k), 1.0F);
      }

      float var13 = g + i * 0.5F;
      o0000O00OO0O0.O00000000(f + 3.0F, var13 - 0.5F, h - 6.0F, 1.0F, O0000O000OO000.O00000000(l, (int)(40.0F * k)));
      if (fs != null && gs != null && fs.length != 0) {
         int var27 = Math.min(fs.length, gs.length);
         float var15 = 6.0F;

         for (int var16 = 0; var16 < var27; var16++) {
            float var17 = Math.abs(fs[var16]);
            if (var17 > var15) {
               var15 = var17;
            }

            float var18 = Math.abs(gs[var16]);
            if (var18 > var15) {
               var15 = var18;
            }
         }

         if (var15 > 35.0F) {
            var15 = 35.0F;
         }

         float var28 = i * 0.5F - 3.0F;
         float var29 = var28 / var15;
         float var30 = h / var27;
         float var19 = Math.max(1.0F, var30 * 0.9F);
         int var20 = O0000O000OO000.O00000000(l, (int)(225.0F * k));
         int var21 = O0000O000OO000.O00000000(m, (int)(150.0F * k));

         for (int var22 = 0; var22 < var27; var22++) {
            int var23 = j < 0 ? var22 : (j + var22) % var27;
            float var24 = f + var22 * var30;
            float var25 = MathHelper.clamp(gs[var23] * var29, -var28, var28);
            if (var25 >= 0.0F) {
               o0000O00OO0O0.O00000000(var24, var13 - var25, var19, var25, var21);
            } else {
               o0000O00OO0O0.O00000000(var24, var13, var19, -var25, var21);
            }

            float var26 = MathHelper.clamp(fs[var23] * var29, -var28, var28);
            if (var26 >= 0.0F) {
               o0000O00OO0O0.O00000000(var24, var13 - var26, var19, var26, var20);
            } else {
               o0000O00OO0O0.O00000000(var24, var13, var19, -var26, var20);
            }
         }
      } else {
         float var14 = TextMeasureCache.O00000000(FontRegistry.O00000000, string, 12.0F).O00000000;
         o0000O00OO0O0.O00000000(
            FontRegistry.O00000000, f + (h - var14) * 0.5F, var13 + 4.0F, 12.0F, string, O0000O000OO000.O0000000000(150, 156, 170, (int)(185.0F * k))
         );
      }
   }

   private int O00000000(O000000O0OOOOO o000000O0OOOOO, float f) {
      String var3 = o000000O0OOOOO.text().toLowerCase(Locale.ROOT);
      if (var3.contains("failed") || var3.contains("error") || var3.contains("missing") || var3.contains("устар")) {
         return O0000O000OO000.O0000000000(255, 96, 112, (int)(255.0F * f));
      } else if (o000000O0OOOOO.training()) {
         return O0000O000OO000.O0000000000(255, 198, 92, (int)(255.0F * f));
      } else if (var3.contains("recording") || var3.contains("запис")) {
         return O0000O000OO000.O0000000000(92, 235, 182, (int)(255.0F * f));
      } else {
         return !var3.contains("brain") && !var3.contains("ready") && !var3.contains("replay")
            ? this.O00000000000O(f)
            : O0000O000OO000.O0000000000(128, 226, 255, (int)(255.0F * f));
      }
   }
}
