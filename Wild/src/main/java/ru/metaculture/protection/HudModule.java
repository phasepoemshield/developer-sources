package ru.metaculture.protection;

import java.util.ArrayList;
import net.minecraft.client.gui.DrawContext;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "Hud",
   O000000000 = "Интерфейс клиента",
   O0000000000 = Category.Visuals
)
public class HudModule extends Module implements O000000O00000 {
   private static final HudModule.W166[] O000000000O0OO = new HudModule.W166[32];
   private static int O000000000OO;
   private static int O000000000OO0;
   private static int O000000000OO00;
   public static final GroupSetting O000000000O = new GroupSetting("Elements", O0000000000O0O());
   public static final String O000000000O0 = "Client";
   public static final String O000000000O00 = "Custom";
   public static final GroupSetting O000000000O000 = O000000000O;
   public static final ModeSetting O000000000O00O = new ModeSetting("HUD Mode", "Client", "Client", "Custom").O00000000(() -> !O00000OO0OO00O.O00000000());
   public static final ButtonSetting O000000000O0O = new ButtonSetting("HUD Constructor", 0)
      .O000000000("Open")
      .O00000000(() -> !O00000OO0OO00O.O00000000() || !O0000000000O00())
      .O00000000(HudModule::O0000000000OO);
   public static final O000000O00 O000000000O0O0 = new O000000O00("Foundry Shader", O00000OOOO00O.HUD);

   public HudModule() {
      this.O00000000(new Setting[]{O000000000O, O000000000O00O, O000000000O0O, O000000000O0O0});
   }

   private static BooleanSetting[] O0000000000O0O() {
      ArrayList var0 = new ArrayList();
      var0.add(new BooleanSetting("Watermark", true));
      var0.add(new BooleanSetting("ArrayList", true));
      var0.add(new BooleanSetting("HotKeys", true));
      var0.add(new BooleanSetting("Potions", true));
      var0.add(new BooleanSetting("Cool Downs", true));
      var0.add(new BooleanSetting("TargetHud", true));
      var0.add(new BooleanSetting("Armor", true));
      var0.add(new BooleanSetting("Inventory", true));
      var0.add(new BooleanSetting("PlayerInfo", true));
      if (ru.metaculture.protection.O000000000O0O0.O00000000(AutoBuyInfoHud.class)) {
         var0.add(new BooleanSetting("AutoBuy Info", true));
      }

      var0.add(new BooleanSetting("Notifications", true));
      if (ru.metaculture.protection.O000000000O0O0.O00000000(AiStatusHud.class)) {
         var0.add(new BooleanSetting("AI Status", true));
      }

      var0.add(new BooleanSetting("Brew Monitor", true));
      var0.add(new BooleanSetting("HotBar", false));
      var0.add(new BooleanSetting("MediaPlayer", true));
      var0.add(new BooleanSetting("Server Helper", false));
      return (BooleanSetting[])var0.toArray(BooleanSetting[]::new);
   }

   @Override
   public void O00000000() {
      super.O00000000();
      O000000O000000.O00000000().O00000000(this, this);
   }

   @Override
   public void O000000000() {
      O000000O000000.O00000000().O00000000(this);
      super.O000000000();
   }

   @EventHandler
   public void O00000000(O0000000O00O o0000000O00O) {
      O000000O000000.O00000000().O000000000(this, this);
      if (O0000000000.player != null && O0000000000.world != null) {
         DrawContext var2 = o0000000O00O.O00000000000O();
         RenderManager var3 = o0000000O00O.O00000000000();
         if (var3 != null) {
            O00000000(o0000000O00O.O0000000000000(), o0000000O00O.O000000000000O());
            if (O000000000O.O000000000("Notifications")) {
               NotificationsHud.O0000000000OO0();
               NotificationsHud.O00000000(var3);
            }

            if (ru.metaculture.protection.O000000000O0O0.O00000000(AiStatusHud.class) && O000000000O.O000000000("AI Status")) {
               AiStatusHud.O00000000(var3);
            }

            if (O000000000O.O000000000("Brew Monitor")) {
               BrewMonitorHud.O00000000(var3);
            }

            if (O000000000O.O000000000("Watermark")) {
               WatermarkHud.O00000000(var3);
            }

            if (O000000000O.O000000000("ArrayList")) {
               ArrayListHud.O00000000(var3);
            }

            if (O000000000O.O000000000("PlayerInfo")) {
               InformationHud.O00000000(var3);
            }

            if (ru.metaculture.protection.O000000000O0O0.O00000000(AutoBuyInfoHud.class) && O000000000O.O000000000("AutoBuy Info")) {
               AutoBuyInfoHud.O00000000(var3);
            }

            if (O000000000O.O000000000("TargetHud")) {
               TargetHud.O00000000(var3, o0000000O00O.O00000000000O());
            }

            if (O000000000O.O000000000("Potions")) {
               PotionsHud.O00000000(var3, o0000000O00O.O00000000000O());
            }

            if (O000000000O.O000000000("Cool Downs")) {
               CooldownsHud.O00000000(var3, var2);
            }

            if (O000000000O.O000000000("Armor")) {
               ArmorHud.O00000000(var3, o0000000O00O.O00000000000O());
            }

            if (O000000000O.O000000000("HotKeys")) {
               KeybindHud.O00000000(var3);
            }

            if (O000000000O.O000000000("Inventory")) {
               InventoryHud.O00000000(var3, o0000000O00O.O00000000000O());
            }

            if (O000000000O.O000000000("HotBar")) {
               HotbarHud.O00000000(var3, o0000000O00O.O00000000000O());
            }

            if (O000000000O.O000000000("MediaPlayer")) {
               MusicPlayerHud.O00000000(var3);
            }

            if (O000000000O.O000000000("Server Helper")) {
               ServerHelperHud.O00000000(var3, var2);
            }
         }
      }
   }

   @EventHandler
   public void O00000000(O0000000O000OO o0000000O000OO) {
      CooldownsHud.O00000000(o0000000O000OO);
      PotionsHud.O00000000(o0000000O000OO);
   }

   public static String O0000000000O0() {
      String var0 = O000000000O0O0.O0000000000O0();
      return var0 == null ? "" : var0;
   }

   public static boolean O0000000000O00() {
      return O00000OO0OO00O.O00000000() && "Custom".equals(O000000000O00O.O0000000000());
   }

   private static void O0000000000OO() {
      if (O0000000000 != null && O00000OO0OO00O.O00000000()) {
         O0000000000.execute(() -> O0000000000.setScreen(new HudConstructorScreen()));
      }
   }

   @Override
   public O00000OOOO00O O0000000000() {
      return O00000OOOO00O.HUD;
   }

   @Override
   public String O00000000000() {
      String var1 = O0000000000O0();
      return var1 != null && !var1.isBlank() ? var1 : null;
   }

   @Override
   public boolean O000000000000() {
      return true;
   }

   public static void O00000000(int i, int j) {
      O000000000OO0 = Math.max(1, i);
      O000000000OO00 = Math.max(1, j);
      O000000000OO = 0;
   }

   public static void O00000000(String string, float f, float g, float h, float i) {
      if (!(h <= 0.0F) && !(i <= 0.0F) && Float.isFinite(f) && Float.isFinite(g)) {
         if (O000000000OO < O000000000O0OO.length) {
            HudModule.W166 var5 = O000000000O0OO[O000000000OO];
            if (var5 == null) {
               var5 = new HudModule.W166();
               O000000000O0OO[O000000000OO] = var5;
            }

            var5.O00000000(string, f, g, h, i);
            O000000000OO++;
         }
      }
   }

   public static void O00000000(String string, RenderManager o0000O00OO0O0, float f, float g, float h, float i) {
      if (o0000O00OO0O0 == null) {
         O00000000(string, f, g, h, i);
      } else {
         float[] var6 = o0000O00OO0O0.O0000000000O().O000000000000();
         if (var6 != null && var6.length >= 6) {
            float var9 = f + h;
            float var10 = g + i;
            float var11 = var6[0] * f + var6[1] * g + var6[2];
            float var12 = var6[3] * f + var6[4] * g + var6[5];
            float var13 = var6[0] * var9 + var6[1] * g + var6[2];
            float var14 = var6[3] * var9 + var6[4] * g + var6[5];
            float var15 = var6[0] * var9 + var6[1] * var10 + var6[2];
            float var16 = var6[3] * var9 + var6[4] * var10 + var6[5];
            float var17 = var6[0] * f + var6[1] * var10 + var6[2];
            float var18 = var6[3] * f + var6[4] * var10 + var6[5];
            float var19 = Math.min(Math.min(var11, var13), Math.min(var15, var17));
            float var20 = Math.min(Math.min(var12, var14), Math.min(var16, var18));
            float var21 = Math.max(Math.max(var11, var13), Math.max(var15, var17));
            float var22 = Math.max(Math.max(var12, var14), Math.max(var16, var18));
            O00000000(string, var19, var20, var21 - var19, var22 - var20);
         } else {
            O00000000(string, f, g, h, i);
         }
      }
   }

   public static HudModule.W166 O00000000(String string, float f, float g, float h, float i, float j) {
      float var6 = O00000000(f, 0.0F, Math.max(0.0F, O000000000OO0 - h));
      float var7 = O00000000(g, 0.0F, Math.max(0.0F, O000000000OO00 - i));

      for (int var8 = 0; var8 < 6; var8++) {
         boolean var9 = false;

         for (int var10 = 0; var10 < O000000000OO; var10++) {
            HudModule.W166 var11 = O000000000O0OO[var10];
            if (var11 != null
               && !string.equals(var11.O00000000)
               && O00000000(var6, var7, h, i, var11.O000000000 - j, var11.O0000000000 - j, var11.O00000000000 + j * 2.0F, var11.O000000000000 + j * 2.0F)) {
               float var12 = var11.O0000000000 - i - j;
               float var13 = var11.O0000000000 + var11.O000000000000 + j;
               float var14 = var11.O000000000 - h - j;
               float var15 = var11.O000000000 + var11.O00000000000 + j;
               float var16 = var6;
               float var17 = var7;
               float var18 = Float.MAX_VALUE;
               float var19 = O00000000(var6, var12, f, g, h, i);
               if (var12 >= 0.0F && var19 < var18) {
                  var18 = var19;
                  var17 = var12;
                  var16 = var6;
               }

               float var20 = O00000000(var6, var13, f, g, h, i);
               if (var13 + i <= O000000000OO00 && var20 < var18) {
                  var18 = var20;
                  var17 = var13;
                  var16 = var6;
               }

               float var21 = O00000000(var14, var7, f, g, h, i);
               if (var14 >= 0.0F && var21 < var18) {
                  var18 = var21;
                  var16 = var14;
                  var17 = var7;
               }

               float var22 = O00000000(var15, var7, f, g, h, i);
               if (var15 + h <= O000000000OO0 && var22 < var18) {
                  var16 = var15;
                  var17 = var7;
               }

               var6 = O00000000(var16, 0.0F, Math.max(0.0F, O000000000OO0 - h));
               var7 = O00000000(var17, 0.0F, Math.max(0.0F, O000000000OO00 - i));
               var9 = true;
            }
         }

         if (!var9) {
            break;
         }
      }

      return new HudModule.W166(string, var6, var7, h, i);
   }

   private static float O00000000(float f, float g, float h, float i, float j, float k) {
      if (Float.isFinite(f) && Float.isFinite(g)) {
         float var6 = f - h;
         float var7 = g - i;
         float var8 = Math.abs(f + j * 0.5F - O000000000OO0 * 0.5F) * 0.012F;
         float var9 = Math.abs(g + k - O000000000OO00) * 0.004F;
         return var6 * var6 + var7 * var7 + var8 + var9;
      } else {
         return Float.MAX_VALUE;
      }
   }

   private static boolean O00000000(float f, float g, float h, float i, float j, float k, float l, float m) {
      return f < j + l && f + h > j && g < k + m && g + i > k;
   }

   private static float O00000000(float f, float g, float h) {
      return !Float.isFinite(f) ? g : Math.max(g, Math.min(h, f));
   }

   public static final class W166 {
      public String O00000000;
      public float O000000000;
      public float O0000000000;
      public float O00000000000;
      public float O000000000000;

      public W166() {
      }

      public W166(String string, float f, float g, float h, float i) {
         this.O00000000(string, f, g, h, i);
      }

      public void O00000000(String string, float f, float g, float h, float i) {
         this.O00000000 = string == null ? "" : string;
         this.O000000000 = f;
         this.O0000000000 = g;
         this.O00000000000 = h;
         this.O000000000000 = i;
      }
   }
}
