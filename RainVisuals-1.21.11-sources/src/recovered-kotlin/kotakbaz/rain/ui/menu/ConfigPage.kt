package kotakbaz.rain.ui.menu

import kotlin.enums.EnumEntries

// $VF: Compiled from heavy
private enum class ConfigPage {
   CLOUD,
   LOCAL;

   @JvmStatic
   fun getEntries(): EnumEntries<ConfigPage> {
      $ENTRIES
   }
}
