package oxxxde

import kotakbaz.rain.module.Module
import kotakbaz.rain.module.setting.ModeSetting
import kotakbaz.rain.module.setting.settings.SliderSetting
import net.minecraft.client.network.ClientPlayerEntity
import net.minecraft.client.util.math.MatrixStack
import net.minecraft.util.Arm
import net.minecraft.util.math.MathHelper
import net.minecraft.util.math.RotationAxis
import org.joml.Quaternionfc
import sweetie.evaware.flora.api.Commando

// $VF: Compiled from heavy
public object ثِ : Module("SwingAnimation", RENDER, "Изменение анимации удара") {
   private const val MODE_4: Int = 3
   @JvmStatic
   private ModeSetting modeSetting = Module.mode$default(ثِ.INSTANCE, "Анимация", CollectionsKt.listOf("1", "2", "3", "4", "5"), 0, null, 12, null);
   private const val MODE_5: Int = 4
   @JvmStatic
   private SliderSetting strength = Module.slider$default(INSTANCE, "Сила", 20.0F, 20.0F, 75.0F, 0.1F, null, 32, null).setVisible({ 
      modeSetting.selectedIndex != 0 && modeSetting.selectedIndex != 4
   });
   private const val MODE_2: Int = 1
   private const val MODE_3: Int = 2
   private const val MODE_1: Int = 0

   @Commando
   public fun onHandSwing(event: رأ) {
      val var10000: ClientPlayerEntity = ضك.getMc().player
      if (var10000 != null) {
         val var9: Arm = var10000.getMainArm()
         if (var9 != null) {
            if (event.getArm() != var9) {
               return
            }

            val matrices: MatrixStack = event.getMatrices()
val swingProgress: Float = event.swingProgress
val g: Float = (float)Math.sin((double)MathHelper.sqrt(swingProgress) * Math.PI)
val anim: Float = (float)Math.sin((double)swingProgress * (Math.PI / 2) * 2.0)
val side: Float = if (var9 === Arm.LEFT) -1.0F else 1.0F
this.applyEquipOffset(matrices, var9)
            when (modeSetting.selectedIndex) {
               0 -> {
                  matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(side * (45.0F + anim * -20.0F)) as Quaternionfc)
                  matrices.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(side * g * -20.0F) as Quaternionfc)
                  matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(g * -80.0F) as Quaternionfc)
                  matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(side * -45.0F) as Quaternionfc)
               }
               1 -> {
                  matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(50.0F) as Quaternionfc)
                  matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(side * -60.0F) as Quaternionfc)
                  matrices.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(side * (110.0F + strength.getValue().floatValue() * g)) as Quaternionfc)
               }
               2 -> {
                  matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(50.0F) as Quaternionfc)
                  matrices.multiply(
                     RotationAxis.POSITIVE_Y.rotationDegrees(side * (-30.0F * (1.0F - g) - 30.0F + (strength.getValue().floatValue() - 20.0F) * g)) as Quaternionfc
                  )
                  matrices.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(side * 110.0F) as Quaternionfc)
               }
               3 -> {
                  matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(side * 90.0F) as Quaternionfc)
                  matrices.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(side * -30.0F) as Quaternionfc)
                  matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(-90.0F - strength.getValue().floatValue() * anim + 10.0F) as Quaternionfc)
               }
               4 -> matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(swingProgress * -360.0F) as Quaternionfc)
               else -> {}
            }

            event.setCancel(true)
            return
         }
      }
   }

   fun applyEquipOffset(matrices: MatrixStack, arm: Arm) {
      matrices.translate((if (arm === Arm.RIGHT) 1.0 else -1.0) * 0.56, -0.52, -0.72)
   }
}
