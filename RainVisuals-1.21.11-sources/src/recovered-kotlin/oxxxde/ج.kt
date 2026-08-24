package oxxxde

import kotakbaz.rain.module.Module
import kotakbaz.rain.module.setting.ModeSetting
import kotakbaz.rain.module.setting.settings.SliderSetting
import net.minecraft.client.network.ClientPlayerEntity
import net.minecraft.text.Text

// $VF: Compiled from heavy
public object ج : Module("PingInChat", PLAYER, "Звук при пинге ника в чате") {
   private final val soundLabels: Map<String, String> =
      MapsKt.mapOf("Exp" to "Experience", "Bow" to "Bow", "Cat" to "Cat", "Villager" to "Villager", "Vk" to "VK")
      private const val SOUND_CAT: Int = 2
   private const val SOUND_VILLAGER: Int = 3
   private const val SOUND_BOW: Int = 1
   @JvmStatic
   private SliderSetting volume = Module.slider$default(ج.INSTANCE, "Громкость", 1.0F, 0.1F, 1.0F, 0.1F, null, 32, null);
   private const val SOUND_EXP: Int = 0
   @JvmStatic
   private ModeSetting soundMode = Module.mode$default(ج.INSTANCE, "Звук", CollectionsKt.listOf("Опыт", "Лук", "Кошка", "Житель", "Вк"), 0, null, 12, null);
   private const val SOUND_VK: Int = 4

   private fun displayNameForSound(mode: String): String {
      var var10000: java.lang.String = soundLabels.get(mode)
      if (var10000 == null) {
         var10000 = mode
      }

      return var10000
   }
}
