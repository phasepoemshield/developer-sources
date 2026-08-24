package oxxxde

import java.awt.Color

// $VF: Compiled from heavy
public object ظث : دِ("ClientColor", ظن.getRENDER(), "Настройка цветов для всех модулей") {
   private final val clientColor: رت

   public fun getClientColor(): Color {
      return clientColor.getValue()
   }

   @JvmStatic
   fun {
      val var10000: دِ = INSTANCE
      val var10002: Color = Color.WHITE
      clientColor = دِ.color$default(var10000, "Цвет клиента", var10002, null, 4, null)
   }
}
