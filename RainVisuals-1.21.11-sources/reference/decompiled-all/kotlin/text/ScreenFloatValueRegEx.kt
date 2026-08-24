package kotlin.text

import org.jetbrains.annotations.NotNull

// $VF: Compiled from StringNumberConversionsJVM.kt
private object ScreenFloatValueRegEx {
   @JvmField
   @NotNull
   public final val value: Regex =
      Regex(
         "[\\x00-\\x20]*[+-]?(NaN|Infinity|((((\\p{Digit}+)(\\.)?((\\p{Digit}+)?)([eE][+-]?(\\p{Digit}+))?)|(\\.((\\p{Digit}+))([eE][+-]?(\\p{Digit}+))?)|(((0[xX](\\p{XDigit}+)(\\.)?)|(0[xX](\\p{XDigit}+)?(\\.)(\\p{XDigit}+)))[pP][+-]?(\\p{Digit}+)))[fFdD]?))[\\x00-\\x20]*"
      )

   @JvmStatic
   fun {
      val var0: ScreenFloatValueRegEx = INSTANCE
   }
}
