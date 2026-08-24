package kotakbaz.rain.client.util.render.engine.controls

import kotlin.enums.EnumEntries

// $VF: Compiled from heavy
public enum class RectType(value: Byte) {
   TEXTURE((byte)1),
   BASIC((byte)0);

   public final val value: Byte

   @JvmStatic
   fun getEntries(): EnumEntries<RectType> {
      $ENTRIES
   }

   init {
      this.value = value
   }
}
