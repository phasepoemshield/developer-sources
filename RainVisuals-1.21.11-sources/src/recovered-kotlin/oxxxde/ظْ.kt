package oxxxde

import kotakbaz.rain.config.ConfigManager

// $VF: Class flags could not be determined
// $VF: Compiled from heavy
@JvmSynthetic
internal class ظْ {
   @JvmStatic
   fun {
      val var0: IntArray = IntArray(ConfigManager.CreateResult.values().length)

      try {
         var0[ConfigManager.CreateResult.CREATED.ordinal()] = 1
      } catch (var6: NoSuchFieldError) {
      }

      try {
         var0[ConfigManager.CreateResult.ALREADY_EXISTS.ordinal()] = 2
      } catch (var5: NoSuchFieldError) {
      }

      try {
         var0[ConfigManager.CreateResult.INVALID_NAME.ordinal()] = 3
      } catch (var4: NoSuchFieldError) {
      }

      try {
         var0[ConfigManager.CreateResult.CLOUD_SOURCE.ordinal()] = 4
      } catch (var3: NoSuchFieldError) {
      }

      try {
         var0[ConfigManager.CreateResult.SAVE_FAILED.ordinal()] = 5
      } catch (var2: NoSuchFieldError) {
      }

      $EnumSwitchMapping$0 = var0
   }
}
