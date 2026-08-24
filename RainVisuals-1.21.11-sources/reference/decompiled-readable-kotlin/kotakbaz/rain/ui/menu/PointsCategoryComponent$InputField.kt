package kotakbaz.rain.ui.menu

import kotlin.enums.EnumEntries
import oxxxde.زً
import oxxxde.طه

// $VF: Compiled from heavy
private enum class `PointsCategoryComponent$InputField` {
   Y,
   Z,
   X,
   NAME;

   @JvmStatic
   fun getEntries(): EnumEntries<PointsCategoryComponent$InputField> {
      $ENTRIES
   }

   public fun next(): زً {
      var var10000: PointsCategoryComponent$InputField
      when (طه.$EnumSwitchMapping$0[this.ordinal()]) {
         1 -> var10000 = X
         2 -> var10000 = Y
         3 -> var10000 = Z
         4 -> var10000 = NAME
         else -> throw NoWhenBranchMatchedException()
      }

      return var10000
   }
}
