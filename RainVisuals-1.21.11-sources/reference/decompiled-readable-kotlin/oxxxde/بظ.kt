package oxxxde

import kotakbaz.rain.config.ConfigManager
import kotakbaz.rain.ui.menu.ConfigPage

// $VF: Class flags could not be determined
// $VF: Compiled from heavy
@JvmSynthetic
internal class بظ {
   @JvmStatic
   fun {
      var var0: IntArray = IntArray(ConfigPage.values().length)

      try {
         var0[ConfigPage.LOCAL.ordinal()] = 1
      } catch (var9: NoSuchFieldError) {
      }

      try {
         var0[ConfigPage.CLOUD.ordinal()] = 2
      } catch (var8: NoSuchFieldError) {
      }

      $EnumSwitchMapping$0 = var0
      var0 = IntArray(ConfigManager.RenameResult.values().length)

      try {
         var0[ConfigManager.RenameResult.RENAMED.ordinal()] = 1
      } catch (var7: NoSuchFieldError) {
      }

      try {
         var0[ConfigManager.RenameResult.UNCHANGED.ordinal()] = 2
      } catch (var6: NoSuchFieldError) {
      }

      try {
         var0[ConfigManager.RenameResult.NOT_FOUND.ordinal()] = 3
      } catch (var5: NoSuchFieldError) {
      }

      try {
         var0[ConfigManager.RenameResult.ALREADY_EXISTS.ordinal()] = 4
      } catch (var4: NoSuchFieldError) {
      }

      try {
         var0[ConfigManager.RenameResult.INVALID_NAME.ordinal()] = 5
      } catch (var3: NoSuchFieldError) {
      }

      try {
         var0[ConfigManager.RenameResult.SAVE_FAILED.ordinal()] = 6
      } catch (var2: NoSuchFieldError) {
      }

      $EnumSwitchMapping$1 = var0
   }
}
