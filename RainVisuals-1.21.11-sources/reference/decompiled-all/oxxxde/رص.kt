package oxxxde

import kotlin.enums.EnumEntries

// $VF: Compiled from heavy
public enum class رص(value: Byte) {
   TEXTURE((byte)1),
   BASIC((byte)0);

   public final val value: Byte

   @JvmStatic
   fun getEntries(): EnumEntries<رص> {
      $ENTRIES
   }

   init {
      this.value = value
   }
}
