package l;

import fat.releon.teremok.impl.combat.Aura;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Arm;
import net.minecraft.util.Hand;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RotationAxis;

public class SwingAnimation extends Helper242 {
   private final Setting5 swingType = new Setting5("Тип взмаха", "Выберите тип взмаха")
      .method2381("Swipe", "Down", "Smooth", "Smooth 2", "Power", "Feast", "Feast 2", "Twist", "Helix", "Stab", "Default");
   private final Setting2 hitStrengthSetting = new Setting2("Сила взмаха", "Сила анимации взмаха").method2086(1.0F).method2078(0.5F, 3.0F);
   private final Setting2 swingSpeedSetting = new Setting2("Длительность взмаха", "Длительность анимации удара").method2086(1.0F).method2078(0.5F, 4.0F);
   private final Setting2 handSize = new Setting2("Размер руки", "Масштаб руки").method2086(1.0F).method2078(0.1F, 2.5F);
   private final Setting3 onlySwing = new Setting3("Только при взмахе", "Показывает анимацию только при взмахе").method2201(false);
   private final Setting3 onlyAura = new Setting3("Только при включенной КиллАуре", "Показывает анимацию только при включенной киллауре")
      .method2201(false);
   private float spinAngle = 0.0F;
   private float spinBackTimer = 0.0F;
   private boolean wasSwinging = false;

   public SwingAnimation() {
      super("SwingAnimation", "Swing Animation", Helper269.RENDER);
      this.setup(new Helper264[]{this.swingType, this.hitStrengthSetting, this.swingSpeedSetting, this.onlySwing, this.onlyAura, this.handSize});
   }

   @Helper104
   public void method2372(Helper434 var1) {
      if (!this.onlyAura.method2200() || Aura.getInstance().isState() && Aura.getInstance().getTarget() != null) {
         var1.method4522(this.swingSpeedSetting.method2082());
         var1.method582();
      }
   }

   @Helper104
   public void method2373(Helper411 var1) {
      boolean var2 = var1.method4216().equals(Hand.MAIN_HAND);
      if (var2) {
         MatrixStack var3 = var1.method4215();
         float var4 = var1.method4217();
         int var5 = mc.player.getMainArm().equals(Arm.RIGHT) ? 1 : -1;
         float var6 = MathHelper.sin(var4 * var4 * (float) Math.PI);
         float var7 = MathHelper.sin(MathHelper.sqrt(var4) * (float) Math.PI);
         float var8 = (float)(Math.sin(var4 * Math.PI) * 0.5);
         float var9 = this.hitStrengthSetting.method2082();
         if (this.onlyAura.method2200() && (!Aura.getInstance().isState() || Aura.getInstance().getTarget() == null)) {
            return;
         }

         if (this.onlySwing.method2200() && mc.player.handSwingTicks == 0) {
            var3.translate(var5 * 0.56F, -0.52F, -0.72F);
         } else {
            String var10 = this.swingType.method2386().trim();
            switch (var10) {
               case "Video":
                  float var12 = MathHelper.sin(var4 * (float) Math.PI);
                  float var13 = MathHelper.sin(var4 * var4 * (float) Math.PI);
                  float var14 = MathHelper.sin((1.0F - var4) * (float) Math.PI);
                  var3.translate(var5 * (0.58F + var12 * 0.09F * var9), -0.34F + var12 * 0.02F, -0.74F + var12 * 0.03F);
                  var3.multiply(RotationAxis.POSITIVE_Y.rotationDegrees((62.0F + var13 * 7.0F * var9) * var5));
                  var3.multiply(RotationAxis.POSITIVE_Z.rotationDegrees((-10.0F - var12 * 6.0F * var9) * var5));
                  var3.multiply(RotationAxis.POSITIVE_X.rotationDegrees(-86.0F - var13 * 17.0F * var9 + var14 * 4.0F));
                  var3.translate(-var12 * 0.035F * var5 * var9, -var12 * 0.015F * var9, 0.0F);
                  break;
               case "Twist":
                  var3.translate(var5 * 0.56F, -0.36F, -0.72F);
                  var3.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(80 * var5));
                  var3.multiply(RotationAxis.POSITIVE_X.rotationDegrees(var7 * -90.0F * var9));
                  var3.multiply(RotationAxis.POSITIVE_Z.rotationDegrees((var6 - var7) * 60.0F * var5 * var9));
                  var3.multiply(RotationAxis.POSITIVE_X.rotationDegrees(-30.0F));
                  var3.translate(0.0F, -0.1F, 0.05F);
                  break;
               case "Swipe":
                  var3.translate(0.56F * var5, -0.32F, -0.72F);
                  var3.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(70 * var5));
                  var3.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(-20 * var5));
                  var3.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(var7 * var6 * -5.0F * var9));
                  var3.multiply(RotationAxis.POSITIVE_X.rotationDegrees(var7 * var6 * -120.0F * var9));
                  var3.multiply(RotationAxis.POSITIVE_X.rotationDegrees(-70.0F));
                  break;
               case "Default":
                  var3.translate(var5 * 0.56F, -0.52F - var7 * 0.5F * var9, -0.72F);
                  var3.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(45 * var5));
                  var3.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-45 * var5));
                  break;
               case "Down":
                  var3.translate(var5 * 0.56F, -0.32F, -0.72F);
                  var3.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(76 * var5));
                  var3.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(var7 * -5.0F * var9));
                  var3.multiply(RotationAxis.NEGATIVE_X.rotationDegrees(var7 * -100.0F * var9));
                  var3.multiply(RotationAxis.POSITIVE_X.rotationDegrees(var7 * -155.0F * var9));
                  var3.multiply(RotationAxis.POSITIVE_X.rotationDegrees(-100.0F));
                  break;
               case "Smooth":
                  var3.translate(var5 * 0.56F, -0.42F, -0.72F);
                  var3.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(var5 * (45.0F + var6 * -20.0F * var9)));
                  var3.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(var5 * var7 * -20.0F * var9));
                  var3.multiply(RotationAxis.POSITIVE_X.rotationDegrees(var7 * -80.0F * var9));
                  var3.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(var5 * -45.0F));
                  var3.translate(0.0, -0.1, 0.0);
                  break;
               case "Smooth 2":
                  var3.translate(var5 * 0.56F, -0.42F, -0.72F);
                  var3.multiply(RotationAxis.POSITIVE_X.rotationDegrees(var7 * -80.0F * var9));
                  var3.translate(0.0, -0.1, 0.0);
                  break;
               case "Power":
                  var3.translate(var5 * 0.56F, -0.32F, -0.72F);
                  var3.translate(-var8 * var8 * var6 * var5 * var9, 0.0F, 0.0F);
                  var3.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(61 * var5));
                  var3.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(var7 * var9));
                  var3.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(var7 * var6 * -5.0F * var9));
                  var3.multiply(RotationAxis.POSITIVE_X.rotationDegrees(var7 * var6 * -30.0F * var9));
                  var3.multiply(RotationAxis.POSITIVE_X.rotationDegrees(-60.0F));
                  var3.multiply(RotationAxis.POSITIVE_X.rotationDegrees(var8 * -60.0F * var9));
                  break;
               case "Feast":
                  var3.translate(var5 * 0.56F, -0.32F, -0.72F);
                  var3.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(30 * var5));
                  var3.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(var7 * 75.0F * var5 * var9));
                  var3.multiply(RotationAxis.POSITIVE_X.rotationDegrees(var7 * -45.0F * var9));
                  var3.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(30 * var5));
                  var3.multiply(RotationAxis.POSITIVE_X.rotationDegrees(-80.0F));
                  var3.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(35 * var5));
                  break;
               case "Feast 2":
                  var3.translate(var5 * 0.56F, -0.32F, -0.72F);
                  var3.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(40 * var5));
                  var3.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(var7 * 25.0F * var5 * var9));
                  var3.multiply(RotationAxis.POSITIVE_X.rotationDegrees(var7 * -90.0F * var9));
                  var3.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(10 * var5));
                  var3.multiply(RotationAxis.POSITIVE_X.rotationDegrees(-80.0F));
                  var3.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(35 * var5));
                  break;
               case "Helix":
                  var3.translate(var5 * 0.66F, -0.32F, -0.92F);
                  var3.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(25 * var5));
                  var3.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(var7 * 90.0F * var5 * var9));
                  var3.multiply(RotationAxis.POSITIVE_X.rotationDegrees(var7 * -15.0F * var9));
                  var3.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(50 * var5));
                  var3.multiply(RotationAxis.POSITIVE_X.rotationDegrees(-90.0F));
                  var3.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(70 * var5));
                  var3.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(2 * var5));
                  break;
               case "Stab":
                  var3.translate(var5 * 0.66F, -0.32F, -0.92F);
                  var3.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(35 * var5));
                  var3.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(var7 * 15.0F * var5 * var9));
                  var3.multiply(RotationAxis.POSITIVE_X.rotationDegrees(var7 * -55.0F * var9));
                  var3.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(50 * var5));
                  var3.multiply(RotationAxis.POSITIVE_X.rotationDegrees(-90.0F));
                  var3.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(70 * var5));
                  var3.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(2 * var5));
                  break;
               default:
                  var3.translate(var5 * 0.56F, -0.52F, -0.72F);
            }
         }

         float var15 = this.handSize.method2082();
         var3.scale(var15, var15, var15);
         var1.method582();
      }
   }
}
