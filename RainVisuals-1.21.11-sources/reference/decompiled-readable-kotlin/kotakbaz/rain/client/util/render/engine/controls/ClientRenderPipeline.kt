package kotakbaz.rain.client.util.render.engine.controls

import kotlin.enums.EnumEntries

// $VF: Compiled from heavy
public enum class ClientRenderPipeline {
   WINDOW_SPECIAL,
   WORLD,
   GUI_TEXT,
   HUD_SPECIAL,
   LOW,
   GUI_SPECIAL,
   MEDIUM,
   WINDOW_RECT,
   HUD_RECT,
   GUI_RECT,
   HIGH,
   HUD_TEXT,
   WINDOW_TEXT;

   @JvmStatic
   fun getEntries(): EnumEntries<ClientRenderPipeline> {
      $ENTRIES
   }
}
