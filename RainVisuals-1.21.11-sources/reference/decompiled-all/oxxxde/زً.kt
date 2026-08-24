package oxxxde

import kotlin.enums.EnumEntries

// $VF: Compiled from heavy
private enum class زً {
   Y,
   Z,
   X,
   NAME;

   @JvmStatic
   fun getEntries(): EnumEntries<زً> {
      $ENTRIES
   }

   public fun next(): زً {
      var var10000: زً
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
