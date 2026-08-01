package ru.metaculture.protection;

import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Arm;
import net.minecraft.util.Hand;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RotationAxis;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "Swing Animation",
   O000000000 = "Кастомизация анимации руки",
   O0000000000 = Category.Visuals
)
public class SwingAnimation extends Module {
   public static ModeSetting O000000000O = new ModeSetting("Анимация", "Smooth", "Smooth", "Swipe", "Swipe back", "SwipeD", "Down", "Spin", "Off");
   public static NumberSetting O000000000O0 = new NumberSetting("Скорость анимации", 1.0F, 0.1F, 3.0F, 0.1F, false);
   public static NumberSetting O000000000O00 = new NumberSetting("Размер анимации", 3.7F, 1.0F, 10.0F, 0.1F, false)
      .O00000000(() -> O000000000O.O000000000("Off"));
   public static NumberSetting O000000000O000 = new NumberSetting("Размер предмета справа", 1.0F, 0.2F, 2.5F, 0.05F, false);
   public static NumberSetting O000000000O00O = new NumberSetting("Размер предмета слева", 1.0F, 0.2F, 2.5F, 0.05F, false);
   public static BooleanSetting O000000000O0O = new BooleanSetting("Только Аура", false);
   public static BooleanSetting O000000000O0O0 = new BooleanSetting("Модель Руки", false);
   public static BooleanSetting O000000000O0OO = new BooleanSetting("Менять обе руки", false).O00000000(() -> !O000000000O0O0.O0000000000());
   public static NumberSetting O000000000OO = new NumberSetting("X", 0.0F, -2.0F, 2.0F, 0.01F, false)
      .O00000000(() -> !O000000000O0O0.O0000000000() || !O000000000O0OO.O0000000000());
   public static NumberSetting O000000000OO0 = new NumberSetting("Y", 0.0F, -2.0F, 2.0F, 0.01F, false)
      .O00000000(() -> !O000000000O0O0.O0000000000() || !O000000000O0OO.O0000000000());
   public static NumberSetting O000000000OO00 = new NumberSetting("Z", 0.0F, -2.0F, 2.0F, 0.01F, false)
      .O00000000(() -> !O000000000O0O0.O0000000000() || !O000000000O0OO.O0000000000());
   public static NumberSetting O000000000OO0O = new NumberSetting("X правая", 0.0F, -2.0F, 2.0F, 0.01F, false)
      .O00000000(() -> !O000000000O0O0.O0000000000() || O000000000O0OO.O0000000000());
   public static NumberSetting O000000000OOO = new NumberSetting("Y правая", 0.0F, -2.0F, 2.0F, 0.01F, false)
      .O00000000(() -> !O000000000O0O0.O0000000000() || O000000000O0OO.O0000000000());
   public static NumberSetting O000000000OOO0 = new NumberSetting("Z правая", 0.0F, -2.0F, 2.0F, 0.01F, false)
      .O00000000(() -> !O000000000O0O0.O0000000000() || O000000000O0OO.O0000000000());
   public static NumberSetting O000000000OOOO = new NumberSetting("X левая", 0.0F, -2.0F, 2.0F, 0.01F, false)
      .O00000000(() -> !O000000000O0O0.O0000000000() || O000000000O0OO.O0000000000());
   public static NumberSetting O00000000O = new NumberSetting("Y левая", 0.0F, -2.0F, 2.0F, 0.01F, false)
      .O00000000(() -> !O000000000O0O0.O0000000000() || O000000000O0OO.O0000000000());
   public static NumberSetting O00000000O0 = new NumberSetting("Z левая", 0.0F, -2.0F, 2.0F, 0.01F, false)
      .O00000000(() -> !O000000000O0O0.O0000000000() || O000000000O0OO.O0000000000());

   public SwingAnimation() {
      this.O00000000(
         new Setting[]{
            O000000000O,
            O000000000O0,
            O000000000O000,
            O000000000O00O,
            O000000000O00,
            O000000000O0O,
            O000000000O0O0,
            O000000000O0OO,
            O000000000OO,
            O000000000OO0,
            O000000000OO00,
            O000000000OO0O,
            O000000000OOO,
            O000000000OOO0,
            O000000000OOOO,
            O00000000O,
            O00000000O0
         }
      );
   }

   @EventHandler
   public void O00000000(O0000000OO000O o0000000OO000O) {
      if (this.O0000000000000 && !O000000000O.O000000000("Off")) {
         if (O0000000000O0() && o0000000OO000O.O00000000000().equals(Hand.MAIN_HAND)) {
            String var2 = O000000000O.O0000000000();
            if (!var2.equals("Off")) {
               if (o0000000OO000O.O00000000000().equals(Hand.MAIN_HAND)) {
                  MatrixStack var3 = o0000000OO000O.O0000000000();
                  float var4 = o0000000OO000O.O000000000000();
                  int var5 = O0000000000.player.getMainArm().equals(Arm.RIGHT) ? 1 : -1;
                  float var6 = (float)Math.sin(var4 * (Math.PI / 2) * 2.0);
                  float var7 = (float)Math.sin(var4 * (Math.PI / 2) * 2.0);
                  float var8 = (float)(Math.sin(var4 * Math.PI) * 0.5);
                  float var9 = MathHelper.sin(var4 * var4 * (float) Math.PI);
                  float var10 = MathHelper.sin(MathHelper.sqrt(var4) * (float) Math.PI);
                  String var11 = O000000000O.O0000000000();
                  switch (var11) {
                     case "Swipe":
                        var3.translate(var5 * 0.67F, -0.32F, -1.0F);
                        var3.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(90 * var5));
                        var3.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(-60 * var5));
                        var3.multiply(RotationAxis.POSITIVE_X.rotationDegrees(var6 * -O000000000O00.O0000000000() * 10.0F));
                        var3.multiply(RotationAxis.POSITIVE_X.rotationDegrees(-90.0F));
                        break;
                     case "Swipe back":
                        var3.translate(var5 * 0.67F, -0.32F, -1.0F);
                        var3.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(90 * var5));
                        var3.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(-60 * var5));
                        var3.multiply(RotationAxis.POSITIVE_X.rotationDegrees(var6 * O000000000O00.O0000000000() * 10.0F));
                        var3.multiply(RotationAxis.POSITIVE_X.rotationDegrees(-90.0F));
                        break;
                     case "SwipeD":
                        var3.translate(var5 * 0.67F, -0.32F, -1.0F);
                        var3.translate(var10 * -O000000000O00.O0000000000() / 35.0F, 0.0F, var10 * -O000000000O00.O0000000000() / 35.0F);
                        var3.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(25.0F));
                        var3.multiply(RotationAxis.POSITIVE_X.rotationDegrees(var10 * -O000000000O00.O0000000000() * 5.0F));
                        var3.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(30.0F));
                        var3.multiply(RotationAxis.POSITIVE_X.rotationDegrees(-90.0F));
                        var3.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(50.0F));
                        break;
                     case "Down":
                        var3.translate(var5 * 0.67F, -0.32F, -1.0F);
                        var3.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(80 * var5));
                        var3.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(-30 * var5));
                        var3.multiply(RotationAxis.POSITIVE_X.rotationDegrees(var6 * -O000000000O00.O0000000000() * 10.0F));
                        var3.multiply(RotationAxis.POSITIVE_X.rotationDegrees(-100.0F));
                        break;
                     case "Spin":
                        var3.translate(var5 * 0.56F, -0.42F, -0.72F);
                        var3.multiply(RotationAxis.POSITIVE_X.rotationDegrees(0.0F + var4 * 360.0F));
                        var3.translate(0.0, -0.1, 0.0);
                        break;
                     case "Smooth":
                        var3.translate(var5 * 0.56F, -0.42F, -0.72F);
                        var3.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(var5 * (45.0F + var6 * -O000000000O00.O0000000000() * 3.0F)));
                        var3.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(var5 * var7 * -O000000000O00.O0000000000() * 2.0F));
                        var3.multiply(RotationAxis.POSITIVE_X.rotationDegrees(var7 * -O000000000O00.O0000000000() * 10.0F));
                        var3.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(var5 * -45.0F));
                        var3.translate(0.0, -0.1, 0.0);
                  }

                  o0000000OO000O.O000000000();
               }
            }
         }
      }
   }

   public static boolean O0000000000O0() {
      if (!O000000000O0O.O0000000000()) {
         return true;
      } else {
         AttackAura var0 = (AttackAura)WildClient.O00000000.O000000000.O000000000(AttackAura.class);
         return var0 != null && var0.O0000000000000 && AttackAura.O00000000OO0 != null;
      }
   }

   public static float O00000000(Hand hand) {
      if (hand != null && WildClient.O00000000 != null && WildClient.O00000000.O000000000 != null && O0000000000.player != null) {
         SwingAnimation var1 = WildClient.O00000000.O000000000.O00000000(SwingAnimation.class);
         if (var1 != null && var1.O0000000000000) {
            Arm var2 = hand == Hand.MAIN_HAND ? O0000000000.player.getMainArm() : (O0000000000.player.getMainArm() == Arm.RIGHT ? Arm.LEFT : Arm.RIGHT);
            return var2 == Arm.RIGHT ? O000000000O000.O0000000000() : O000000000O00O.O0000000000();
         } else {
            return 1.0F;
         }
      } else {
         return 1.0F;
      }
   }

   @EventHandler
   public void O00000000(O0000000OO00OO o0000000OO00OO) {
      boolean var2 = o0000000OO00OO.O000000000000();
      MatrixStack var3 = o0000000OO00OO.O0000000000();
      if (O000000000O0O0.O0000000000() && O000000000O0OO.O0000000000()) {
         if (var2) {
            var3.translate(O000000000OO.O0000000000(), O000000000OO0.O0000000000(), O000000000OO00.O0000000000());
         } else {
            var3.translate(-O000000000OO.O0000000000(), O000000000OO0.O0000000000(), O000000000OO00.O0000000000());
         }
      }

      if (O000000000O0O0.O0000000000() && !O000000000O0OO.O0000000000()) {
         if (var2) {
            var3.translate(O000000000OO0O.O0000000000(), O000000000OOO.O0000000000(), O000000000OOO0.O0000000000());
         } else {
            var3.translate(O000000000OOOO.O0000000000(), O00000000O.O0000000000(), O00000000O0.O0000000000());
         }
      }
   }
}
