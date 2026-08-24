@file:JvmMultifileClass
@file:JvmName("StringsKt")

package kotlin.text

import java.math.BigDecimal
import java.math.BigInteger
import java.math.MathContext
import kotlin.internal.InlineOnly

// $VF: Compiled from StringNumberConversionsJVM.kt
@InlineOnly
public inline fun String.toInt(): Int {
   return Integer.parseInt(`$this$toInt`)
}

@InlineOnly
public inline fun String.toLong(): Long {
   return java.lang.Long.parseLong(`$this$toLong`)
}

@InlineOnly
public inline fun String.toByte(): Byte {
   return java.lang.Byte.parseByte(`$this$toByte`)
}

@SinceKotlin(version = "1.1")
@InlineOnly
public inline fun String.toByte(radix: Int): Byte {
   return java.lang.Byte.parseByte(`$this$toByte`, CharsKt.checkRadix(radix))
}

@SinceKotlin(version = "1.1")
@InlineOnly
public inline fun Short.toString(radix: Int): String {
   val var10000: java.lang.String = Integer.toString(`$this$toString`, CharsKt.checkRadix(radix))
   return var10000
}

@SinceKotlin(version = "1.2")
public fun String.toBigIntegerOrNull(): BigInteger? {
   return StringsKt.toBigIntegerOrNull(`$this$toBigIntegerOrNull`, 10)
}

@InlineOnly
public inline fun String.toFloat(): Float {
   return java.lang.Float.parseFloat(`$this$toFloat`)
}

@InlineOnly
@SinceKotlin(version = "1.1")
public inline fun String.toLong(radix: Int): Long {
   return java.lang.Long.parseLong(`$this$toLong`, CharsKt.checkRadix(radix))
}

@SinceKotlin(version = "1.2")
@InlineOnly
public inline fun String.toBigDecimal(mathContext: MathContext): BigDecimal {
   return BigDecimal(`$this$toBigDecimal`, mathContext)
}

@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun String?.toBoolean(): Boolean {
   return java.lang.Boolean.parseBoolean(`$this$toBoolean`)
}

@InlineOnly
@SinceKotlin(version = "1.1")
public inline fun Byte.toString(radix: Int): String {
   val var10000: java.lang.String = Integer.toString(`$this$toString`, CharsKt.checkRadix(radix))
   return var10000
}

@InlineOnly
@SinceKotlin(version = "1.1")
public inline fun Long.toString(radix: Int): String {
   val var10000: java.lang.String = java.lang.Long.toString(`$this$toString`, CharsKt.checkRadix(radix))
   return var10000
}

@SinceKotlin(version = "1.1")
@InlineOnly
public inline fun String.toShort(radix: Int): Short {
   return java.lang.Short.parseShort(`$this$toShort`, CharsKt.checkRadix(radix))
}

@InlineOnly
@SinceKotlin(version = "1.2")
public inline fun String.toBigInteger(radix: Int): BigInteger {
   return BigInteger(`$this$toBigInteger`, CharsKt.checkRadix(radix))
}

@SinceKotlin(version = "1.1")
public fun String.toFloatOrNull(): Float? {
   var p0: java.lang.Float
   try {
      p0 = if (ScreenFloatValueRegEx.value matches `$this$toFloatOrNull` as java.lang.CharSequence) java.lang.Float.parseFloat(`$this$toFloatOrNull`) else null
   } catch (var4: NumberFormatException) {
      p0 = null
   }

   return p0
}

@SinceKotlin(version = "1.1")
public fun String.toDoubleOrNull(): Double? {
   var p0: java.lang.Double
   try {
      p0 = if (ScreenFloatValueRegEx.value matches `$this$toDoubleOrNull` as java.lang.CharSequence)
         java.lang.Double.parseDouble(`$this$toDoubleOrNull`)
         else
         null
      } catch (var4: NumberFormatException) {
      p0 = null
   }

   return p0
}

@SinceKotlin(version = "1.2")
public fun String.toBigIntegerOrNull(radix: Int): BigInteger? {
   CharsKt.checkRadix(radix)
val length: Int = `$this$toBigIntegerOrNull`.length()
   when (length) {
      0 -> return null
      1 -> {
         if (CharsKt.digitOf(`$this$toBigIntegerOrNull`.charAt(0), radix) < 0) {
            return null
         }
      }
      else -> {
         for (index in if (`$this$toBigIntegerOrNull`.charAt(0) == '-') 1 else 0..length) {
            if (CharsKt.digitOf(`$this$toBigIntegerOrNull`.charAt(index), radix) < 0) {
               return null
            }
         }
      }
   }

   return BigInteger(`$this$toBigIntegerOrNull`, CharsKt.checkRadix(radix))
}

@InlineOnly
public inline fun String.toShort(): Short {
   return java.lang.Short.parseShort(`$this$toShort`)
}

open fun StringsKt__StringNumberConversionsJVMKt() {
}

@SinceKotlin(version = "1.2")
public fun String.toBigDecimalOrNull(mathContext: MathContext): BigDecimal? {
   var var5: BigDecimal
   try {
      var5 = if (ScreenFloatValueRegEx.value matches `$this$toBigDecimalOrNull` as java.lang.CharSequence)
         BigDecimal(`$this$toBigDecimalOrNull`, mathContext)
         else
         null
      } catch (var6: NumberFormatException) {
      var5 = null
   }

   return var5
}

@InlineOnly
@SinceKotlin(version = "1.1")
public inline fun String.toInt(radix: Int): Int {
   return Integer.parseInt(`$this$toInt`, CharsKt.checkRadix(radix))
}

@SinceKotlin(version = "1.2")
public fun String.toBigDecimalOrNull(): BigDecimal? {
   var it: BigDecimal
   try {
      it = if (ScreenFloatValueRegEx.value matches `$this$toBigDecimalOrNull` as java.lang.CharSequence) BigDecimal(`$this$toBigDecimalOrNull`) else null
   } catch (var4: NumberFormatException) {
      it = null
   }

   return it
}

@InlineOnly
@SinceKotlin(version = "1.2")
public inline fun String.toBigInteger(): BigInteger {
   return BigInteger(`$this$toBigInteger`)
}

private inline fun <T> screenFloatValue(str: String, parse: (String) -> Any): Any? {
   var var3: Any
   try {
      var3 = if (ScreenFloatValueRegEx.value matches str as java.lang.CharSequence) parse(str) else null
   } catch (var5: NumberFormatException) {
      var3 = null
   }

   return (T)var3
}

@SinceKotlin(version = "1.2")
@InlineOnly
public inline fun String.toBigDecimal(): BigDecimal {
   return BigDecimal(`$this$toBigDecimal`)
}

@SinceKotlin(version = "1.1")
@InlineOnly
public inline fun Int.toString(radix: Int): String {
   val var10000: java.lang.String = Integer.toString(`$this$toString`, CharsKt.checkRadix(radix))
   return var10000
}

@InlineOnly
public inline fun String.toDouble(): Double {
   return java.lang.Double.parseDouble(`$this$toDouble`)
}
