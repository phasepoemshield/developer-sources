@file:JvmMultifileClass
@file:JvmName("CharsKt")

package kotlin.text

import kotlin.internal.InlineOnly

// $VF: Compiled from Char.kt
public fun Char.isSurrogate(): Boolean {
   return CharRange('\ud800', '\udfff').contains(`$this$isSurrogate`)
}

@SinceKotlin(version = "1.5")
public fun Char.titlecase(): String {
   return _OneToManyTitlecaseMappingsKt.titlecaseImpl(`$this$titlecase`)
}

@InlineOnly
public inline operator fun Char.plus(other: String): String {
   return "$`$this$plus`$other"
}

@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@SinceKotlin(version = "1.5")
public fun Char.digitToInt(): Int {
   val var1: Int = CharsKt.digitOf(`$this$digitToInt`, 10)
   if (var1 < 0) {
      throw IllegalArgumentException("Char $`$this$digitToInt` is not a decimal digit")
   } else {
      return var1
   }
}

@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@SinceKotlin(version = "1.5")
public fun Char.digitToIntOrNull(): Int? {
   val var1: Int = CharsKt.digitOf(`$this$digitToIntOrNull`, 10)
   return if (var1.intValue() >= 0) var1 else null
}

public fun Char.equals(other: Char, ignoreCase: Boolean = false): Boolean {
   if (`$this$equals` == other) {
      return true
   } else if (!ignoreCase) {
      return false
   } else {
      val thisUpper: Char = Character.toUpperCase(`$this$equals`)
      val otherUpper: Char = Character.toUpperCase(other)
      return thisUpper == otherUpper || Character.toLowerCase(thisUpper) == Character.toLowerCase(otherUpper)
   }
}

@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
public fun Char.digitToInt(radix: Int): Int {
   val var10000: Int = CharsKt.digitToIntOrNull(`$this$digitToInt`, radix)
   if (var10000 != null) {
      return var10000
   } else {
      throw IllegalArgumentException("Char $`$this$digitToInt` is not a digit in the given radix=$radix")
   }
}

open fun CharsKt__CharKt() {
}

@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@SinceKotlin(version = "1.5")
public fun Int.digitToChar(): Char {
   if (IntRange(0, 9).contains(`$this$digitToChar`)) {
      return (char)(48 + `$this$digitToChar`)
   } else {
      throw IllegalArgumentException("Int $`$this$digitToChar` is not a decimal digit")
   }
}

@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@SinceKotlin(version = "1.5")
public fun Char.digitToIntOrNull(radix: Int): Int? {
   CharsKt.checkRadix(radix)
   val var2: Int = CharsKt.digitOf(`$this$digitToIntOrNull`, radix)
   return if (var2.intValue() >= 0) var2 else null
}

@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@SinceKotlin(version = "1.5")
public fun Int.digitToChar(radix: Int): Char {
   if (!IntRange(2, 36).contains(radix)) {
      throw IllegalArgumentException("Invalid radix: $radix. Valid radix values are in range 2..36")
   } else if (`$this$digitToChar` >= 0 && `$this$digitToChar` < radix) {
      return if (`$this$digitToChar` < 10) (char)(48 + `$this$digitToChar`) else (char)((char)(65 + `$this$digitToChar`) - '\n')
   } else {
      throw IllegalArgumentException("Digit $`$this$digitToChar` does not represent a valid digit in radix $radix")
   }
}
