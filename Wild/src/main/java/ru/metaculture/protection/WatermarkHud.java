package ru.metaculture.protection;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ru.metaculture.profile.Profile;

@O0000000OOO0(
   O00000000 = "WaterMark",
   O000000000 = "W"
)
public final class WatermarkHud extends HudElement {
   private static final WatermarkHud O00000000 = new WatermarkHud();
   private static final O0000O00O0OO O000000000OO0 = new O0000O00O0OO();
   private static int O000000000OO00 = 0;
   private final SimpleDateFormat O000000000OO0O = new SimpleDateFormat("HH:mm");
   private final Map<String, O0000O00O0OO> O000000000OOO = new HashMap<>();
   private final List<WatermarkHud.W164> O000000000OOO0 = new ArrayList<>(4);
   private final GroupSetting O000000000OOOO = new GroupSetting(
      "Отображать", new BooleanSetting("Username", true), new BooleanSetting("UID", true), new BooleanSetting("FPS", true), new BooleanSetting("Time", true)
   );
   private float O00000000O = 0.0F;
   private float O00000000O0 = 0.0F;
   private float O00000000O00 = 0.0F;
   private float O00000000O000 = 0.0F;

   private WatermarkHud() {
      this.O00000000(this.O000000000OOOO);
      ru.metaculture.protection.O000000000O0O0.O00000000(this);
   }

   public static WatermarkHud O000000000() {
      return O00000000;
   }

   public static void O00000000(RenderManager o0000O00OO0O0) {
      O00000000.O000000000(o0000O00OO0O0);
   }

   private boolean O00000000(float f, float g, float h, float i, float j, float k) {
      return f >= h && f <= h + j && g >= i && g <= i + k;
   }

   private void O00000000(String string, String string2, String string3, String string4, List<WatermarkHud.W164> list) {
      O0000O00O0OO var6 = this.O000000000OOO.computeIfAbsent(string, stringx -> new O0000O00O0OO());
      var6.O00000000();
      var6.O00000000(this.O000000000OOOO.O000000000(string) ? 1.0 : 0.0, 0.2F, O0000O00O0OO0O.O0000000000O0O, false);
      if (var6.O000000000000() > 0.01F) {
         WatermarkHud.W164 var7 = new WatermarkHud.W164(string, string2, string3, string4);
         var7.O0000000000000 = var6.O000000000000();
         list.add(var7);
      }
   }

   public void O000000000(RenderManager o0000O00OO0O0) {
      if (MinecraftAccessor.a_.player != null) {
         O000000000OO0.O00000000();
         O000000000OO0.O00000000(1.0, 0.22F, O0000O00O0OO0O.O0000000000O0O, false);
         float var2 = O000000000OO0.O000000000000();
         if (!(var2 <= 0.01F)) {
            float var3 = O00000OO000O.O00000000().O000000000000O();
            float var4 = O00000OO000O.O00000000().O00000000000O();
            boolean var5 = O00000OO000O.O00000000().O00000000000OO();
            boolean var6 = O00000OO000O.O00000000().O00000000000O0();
            String var7 = O00000OO000O.O00000000().O0000000000O();
            if (this.O00000000O00 > 0.0F
               && this.O00000000(var3, var4, this.O00000000O, this.O00000000O0, this.O00000000O00, this.O00000000O000)
               && var7 == null) {
               if (var5) {
                  MinecraftAccessor.a_.keyboard.setClipboard(Profile.getUsername());
               }

               if (var6) {
                  O00000OO000O.O00000000().O000000000();
               }
            }

            int var8 = MinecraftAccessor.a_.getCurrentFps();
            O000000000OO00 = O000000000OO00 + (int)((var8 - O000000000OO00) * O0000O00OO0OO0.O0000000000000(0.2F));
            int var9 = Profile.getUid();
            boolean var10 = HudModule.O0000000000O00();
            O00000OO0OO0O.W239 var11 = var10 ? O00000OO0OO0O.O00000000("HUD_WaterMark") : null;
            float var12 = var10 ? var11.O0000000000O0 : 24.0F;
            float var13 = var10 ? var11.O0000000000O00 : 24.0F;
            float var14 = var10 ? var11.O00000000000O : 7.0F;
            float var15 = 10.0F;
            float var16 = var10 ? var11.O00000000000O0 : 5.0F;
            float var17 = var10 ? var11.O0000000000O : 32.0F;
            this.O000000000OOO0.clear();
            List var18 = this.O000000000OOO0;
            this.O00000000("Username", "r", Profile.getUsername(), "", var18);
            this.O00000000("FPS", "u", String.valueOf(O000000000OO00), "fps", var18);
            this.O00000000("Time", "y", this.O000000000OO0O.format(System.currentTimeMillis()), "", var18);
            this.O00000000("UID", "t", String.valueOf(var9), "uid", var18);
            float var19 = 32.0F;
            float var20 = var14 + var19;

            for (WatermarkHud.W164 var22 : (List<WatermarkHud.W164>)var18) {
               float var23 = TextMeasureCache.O00000000(FontRegistry.O00000000, var22.O0000000000, var12).O00000000;
               float var24 = var22.O00000000000.isEmpty() ? 0.0F : TextMeasureCache.O00000000(FontRegistry.O00000000, var22.O00000000000, var12).O00000000;
               float var25 = TextMeasureCache.O00000000(FontRegistry.O00000000000O, var22.O000000000, var13).O00000000;
               float var26 = var25 + 8.0F + var23 + var24 + var15 * 2.0F;
               var22.O000000000000 = var26 * var22.O0000000000000;
               var20 += var16 * var22.O0000000000000 + var22.O000000000000;
            }

            var20 += var14;
            float var59 = var17 + var14 * 2.0F;
            O00000OO000O.W219 var60 = O00000OO000O.O00000000().O00000000("HUD_WaterMark", 10.0F, 10.0F, var20, var59);
            float var61 = var60.O000000000;
            float var62 = var60.O0000000000;
            float var63 = var60.O00000000000;
            float var64 = var60.O000000000000;
            this.O00000000(var61, var62, var63, var64);
            float var27 = var63 / Math.max(1.0F, var20);
            float var28 = var64 / Math.max(1.0F, var59);
            float var29 = Math.min(var27, var28);
            float var30 = var14 * var27;
            float var31 = var14 * var28;
            float var32 = var16 * var27;
            float var33 = var19 * var27;
            float var34 = var17 * var28;
            float var35 = var2 * this.O000000000O0.O0000000000();
            int var36 = this.O000000000(var35);
            int var37 = this.O00000000000(var35);
            int var38 = this.O000000000000(var35);
            int var39 = this.O000000000000O(var35);
            float var40 = var10 ? var11.O00000000 : 14.0F;
            this.O00000000(o0000O00OO0O0, var61, var62, var63, var64, var40, var35);
            float var41 = var61 + var30;
            float var42 = var62 + var31;
            if (this.O0000000000O0() || this.O0000000000O00()) {
               this.O000000000(o0000O00OO0O0, var41, var42, var33, var34, 11.0F, var35);
            } else if (!this.O00000000(var41, var42, var33, var34, 11.0F, false, var35, 1)) {
               o0000O00OO0O0.O00000000(var41, var42, var33, var34, 11.0F, 4.0F, 4.0F, 11.0F, var36);
               if (this.O000000000000()) {
                  o0000O00OO0O0.O00000000(var41, var42, var33, var34, 11.0F, 4.0F, 4.0F, 11.0F, var37, Math.max(1.0F, this.O0000000000() * 0.65F));
               }
            }

            float var43 = (var10 ? var11.O0000000000O00 : 26.0F) * var29;
            float var44 = TextMeasureCache.O00000000(FontRegistry.O00000000000O, "W", var43).O00000000;
            o0000O00OO0O0.O00000000(FontRegistry.O00000000000O, var41 + (var33 - var44) / 2.0F, var42 + var34 / 2.0F + 5.5F * var28, var43, "W", var39);
            float var45 = var41 + var33;

            for (int var46 = 0; var46 < var18.size(); var46++) {
               WatermarkHud.W164 var47 = (WatermarkHud.W164)var18.get(var46);
               var45 += var32 * var47.O0000000000000;
               float var48 = var47.O000000000000 * var27;
               boolean var49 = var46 == var18.size() - 1;
               if (var47.O00000000.equals("Username")) {
                  this.O00000000O = var45;
                  this.O00000000O0 = var42;
                  this.O00000000O00 = var48;
                  this.O00000000O000 = var34;
               }

               int var50 = O0000O000OO000.O00000000(var36, (int)(O0000O000OO000.O00000000(var36) * var47.O0000000000000));
               int var51 = O0000O000OO000.O00000000(var39, (int)(O0000O000OO000.O00000000(var39) * var47.O0000000000000));
               int var52 = O0000O000OO000.O00000000(var38, (int)(O0000O000OO000.O00000000(var38) * var47.O0000000000000));
               boolean var53 = var47.O00000000.equals("Username") && var6 && var7 == null && this.O00000000(var3, var4, var45, var42, var48, var34);
               if (!this.O0000000000O0() && !this.O0000000000O00()) {
                  if (!this.O00000000(var45, var42, var48, var34, 11.0F, var53, var35 * var47.O0000000000000, var53 ? 2 : 1)) {
                     o0000O00OO0O0.O00000000(var45, var42, var48, var34, 4.0F, var49 ? 11.0F : 4.0F, var49 ? 11.0F : 4.0F, 4.0F, var50);
                  }
               } else {
                  this.O000000000(o0000O00OO0O0, var45, var42, var48, var34, 11.0F, var35 * var47.O0000000000000);
               }

               o0000O00OO0O0.O00000000(var45, var42, var48, var34, 4.0F, var49 ? 11.0F : 4.0F, var49 ? 11.0F : 4.0F, 4.0F);
               float var54 = var45 + var15 * var27;
               float var55 = var42 + var34 / 2.0F + 4.5F * var28;
               float var56 = var13 * var29;
               float var57 = var12 * var29;
               o0000O00OO0O0.O00000000(FontRegistry.O00000000000O, var54, var55 + 1.0F * var28, var56, var47.O000000000, var51);
               var54 += TextMeasureCache.O00000000(FontRegistry.O00000000000O, var47.O000000000, var56).O00000000 + 5.0F * var27;
               o0000O00OO0O0.O00000000(FontRegistry.O00000000, var54, var55, var57, var47.O0000000000, var52);
               if (!var47.O00000000000.isEmpty()) {
                  var54 += TextMeasureCache.O00000000(FontRegistry.O00000000, var47.O0000000000, var57).O00000000;
                  o0000O00OO0O0.O00000000(FontRegistry.O00000000, var54, var55, var57, var47.O00000000000, var51);
               }

               o0000O00OO0O0.O0000000000000();
               var45 += var48;
            }

            O00000OO000O.O00000000().O00000000(var60);
            O00000O0O00O.O00000000(
               o0000O00OO0O0,
               this,
               var60,
               O00000OO000O.O00000000(),
               MinecraftAccessor.a_.getWindow().getScaledWidth(),
               MinecraftAccessor.a_.getWindow().getScaledHeight()
            );
         }
      }
   }

   static class W164 {
      final String O00000000;
      final String O000000000;
      final String O0000000000;
      final String O00000000000;
      float O000000000000;
      float O0000000000000 = 1.0F;

      W164(String string, String string2, String string3, String string4) {
         this.O00000000 = string;
         this.O000000000 = string2;
         this.O0000000000 = string3;
         this.O00000000000 = string4;
      }
   }
}
