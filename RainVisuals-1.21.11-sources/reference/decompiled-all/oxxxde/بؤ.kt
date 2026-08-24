package oxxxde

import java.awt.Color
import ru.ocz.protection.virtualmachine.annotation.RecompileFormat

// $VF: Compiled from heavy
@RecompileFormat
public object بؤ : دِ("CustomFog", ظن.getRENDER(), "Настройка цвета и дальности тумана") {
   public final val fogDistance: طُ = دِ.slider$default(بؤ.INSTANCE, "Дистанция", -8.0F, -8.0F, 25.0F, 1.0F, null, 32, null)
   public final val fogColor: رت
   public final val fogDensity: طُ = دِ.slider$default(بؤ.INSTANCE, "Плотность", 100.0F, 0.0F, 100.0F, 1.0F, null, 32, null)

   private final val useClientColor: خذ = دِ.boolean$default(بؤ.INSTANCE, "Цвет клиента", false, null, 4, null).setVisible({ 
      ظث.INSTANCE.isEnabled()
   })

   fun getFogDensity(): طُ {
      fogDensity
   }

   public fun resolvedFogColor(): Color {
      return if (useClientColor.getValue() && ظث.INSTANCE.isEnabled()) ظث.INSTANCE.getClientColor() else fogColor.getValue()
   }

   fun getFogDistance(): طُ {
      fogDistance
   }

   fun getFogColor(): رت {
      fogColor
   }

   @JvmStatic
   fun {
      val var10000: دِ = INSTANCE
      val var10002: Color = Color.WHITE
      fogColor = دِ.color$default(var10000, "Цвет", var10002, null, 4, null).setVisible({ 
         !useClientColor.getValue() || !ظث.INSTANCE.isEnabled()
      })
   }

   public fun useCustomFog(): Boolean {
      return this.isEnabled()
   }

   public fun fogSkyArgb(original: Int): Int {
      return if (!this.useCustomFog()) original else this.resolvedFogColor().getRGB()
   }
}
