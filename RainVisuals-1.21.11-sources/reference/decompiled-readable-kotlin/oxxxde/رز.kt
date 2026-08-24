package oxxxde

import kotakbaz.rain.module.Module
import kotakbaz.rain.module.setting.ModeSetting

// $VF: Compiled from heavy
public object رز : Module("TimeChanger", RENDER, "Изменение визуального времени суток") {
   private const val MODE_NIGHT: String = "Night"
   private final val timeLabels: Map<String, String> =
      MapsKt.mapOf("Dawn" to "Рассвет", "Day" to "День", "Noon" to "Полдень", "Dusk" to "Сумерки", "Night" to "Ночь", "Midnight" to "Полночь")
      private const val MODE_DAY: String = "Day"
   private const val MODE_NOON: String = "Noon"
   private const val MODE_DAWN: String = "Dawn"
   private const val MODE_MIDNIGHT: String = "Midnight"
   private const val MODE_DUSK: String = "Dusk"
   @JvmStatic
   private ModeSetting timeMode = Module.mode$default(
      INSTANCE, "Время", CollectionsKt.listOf("Dawn", "Day", "Noon", "Dusk", "Night", "Midnight"), 1, null, 8, null
   );

   public fun modifyTime(original: Long): Long {
      if (!this.isEnabled()) {
         return original
      } else {
         val var3: java.lang.String = timeMode.getValue()
         when (var3.hashCode()) {
            -1576218896 -> {
               if (var3.equals("Midnight")) {
                  return 18000L
               }
            }
            68476 -> {
               if (var3.equals("Day")) {
                  return 1000L
               }
            }
            2122804 -> {
               if (var3.equals("Dawn")) {
                  return 23041L
               }
            }
            2141897 -> {
               if (var3.equals("Dusk")) {
                  return 12610L
               }
            }
            2433920 -> {
               if (var3.equals("Noon")) {
                  return 6000L
               }
            }
            75265016 -> {
               if (var3.equals("Night")) {
                  return 13000L
               }
            }
            else -> {}
         }

         return original
      }
   }

   private fun displayNameForTime(mode: String): String {
      var var10000: java.lang.String = timeLabels.get(mode)
      if (var10000 == null) {
         var10000 = mode
      }

      return var10000
   }
}
