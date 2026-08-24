package kotakbaz.rain.ui.api

import kotlin.enums.EnumEntries

// $VF: Compiled from heavy
public enum class RenderIn {
   HUD,
   WINDOW,
   GUI;

   @JvmStatic
   fun getEntries(): EnumEntries<RenderIn> {
      $ENTRIES
   }
}
