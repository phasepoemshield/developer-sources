@file:JvmMultifileClass
@file:JvmName("CharsKt")

package kotlin.text

import java.util.Locale
import kotlin.internal.InlineOnly

// $VF: Compiled from CharJVM.kt
@InlineOnly
public inline fun Char.isDigit(): Boolean {
   return Character.isDigit(`$this$isDigit`)
}

@InlineOnly
public inline fun Char.isJavaIdentifierStart(): Boolean {
   return Character.isJavaIdentifierStart(`$this$isJavaIdentifierStart`)
}

@Deprecated(message = "Use uppercaseChar() instead.", replaceWith = @ReplaceWith(expression = "uppercaseChar()", imports = []))
@DeprecatedSinceKotlin(warningSince = "1.5")
@InlineOnly
public inline fun Char.toUpperCase(): Char {
   return Character.toUpperCase(`$this$toUpperCase`)
}

@InlineOnly
public inline fun Char.isLowerCase(): Boolean {
   return Character.isLowerCase(`$this$isLowerCase`)
}

@InlineOnly
public inline fun Char.isHighSurrogate(): Boolean {
   return Character.isHighSurrogate(`$this$isHighSurrogate`)
}

@SinceKotlin(version = "1.5")
@InlineOnly
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
public inline fun Char.lowercase(): String {
   var var10000: java.lang.String = java.lang.String.valueOf(`$this$lowercase`)
   var10000 = var10000.toLowerCase(Locale.ROOT)
   return var10000
}

@InlineOnly
public inline fun Char.isTitleCase(): Boolean {
   return Character.isTitleCase(`$this$isTitleCase`)
}

@InlineOnly
public inline fun Char.isDefined(): Boolean {
   return Character.isDefined(`$this$isDefined`)
}

@InlineOnly
public inline fun Char.isLetter(): Boolean {
   return Character.isLetter(`$this$isLetter`)
}

@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
public fun Char.uppercase(locale: Locale): String {
   var var10000: java.lang.String = java.lang.String.valueOf(`$this$uppercase`)
   var10000 = var10000.toUpperCase(locale)
   return var10000
}

@InlineOnly
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@SinceKotlin(version = "1.5")
public inline fun Char.uppercaseChar(): Char {
   return Character.toUpperCase(`$this$uppercaseChar`)
}

@InlineOnly
public inline fun Char.isISOControl(): Boolean {
   return Character.isISOControl(`$this$isISOControl`)
}

public final val directionality: CharDirectionality
   public final get() {
      return CharDirectionality.Companion.valueOf(Character.getDirectionality(`$this$directionality`))
   }


@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
public fun Char.lowercase(locale: Locale): String {
   var var10000: java.lang.String = java.lang.String.valueOf(`$this$lowercase`)
   var10000 = var10000.toLowerCase(locale)
   return var10000
}

@InlineOnly
public inline fun Char.isLetterOrDigit(): Boolean {
   return Character.isLetterOrDigit(`$this$isLetterOrDigit`)
}

@InlineOnly
public inline fun Char.isIdentifierIgnorable(): Boolean {
   return Character.isIdentifierIgnorable(`$this$isIdentifierIgnorable`)
}

@InlineOnly
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@SinceKotlin(version = "1.5")
public inline fun Char.lowercaseChar(): Char {
   return Character.toLowerCase(`$this$lowercaseChar`)
}

@InlineOnly
public inline fun Char.isJavaIdentifierPart(): Boolean {
   return Character.isJavaIdentifierPart(`$this$isJavaIdentifierPart`)
}

@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
public fun Char.titlecase(locale: Locale): String {
   val localizedUppercase: java.lang.String = CharsKt.uppercase(`$this$titlecase`, locale)
   if (localizedUppercase.length() > 1) {
      var var10000: java.lang.String
      if (`$this$titlecase` == 329) {
         var10000 = localizedUppercase
      } else {
         val var3: Char = localizedUppercase.charAt(0)
         var10000 = localizedUppercase.substring(1)
         var10000 = var10000.toLowerCase(Locale.ROOT)
         var10000 = "$var3$var10000"
      }

      return var10000
   } else {
      var var10001: java.lang.String = java.lang.String.valueOf(`$this$titlecase`)
      var10001 = var10001.toUpperCase(Locale.ROOT)
      return if (!(localizedUppercase == var10001)) localizedUppercase else java.lang.String.valueOf(Character.toTitleCase(`$this$titlecase`))
   }
}

@InlineOnly
public inline fun Char.isUpperCase(): Boolean {
   return Character.isUpperCase(`$this$isUpperCase`)
}

internal fun digitOf(char: Char, radix: Int): Int {
   return Character.digit((int)char, radix)
}

@DeprecatedSinceKotlin(warningSince = "1.5")
@Deprecated(message = "Use titlecaseChar() instead.", replaceWith = @ReplaceWith(expression = "titlecaseChar()", imports = []))
@InlineOnly
public inline fun Char.toTitleCase(): Char {
   return Character.toTitleCase(`$this$toTitleCase`)
}

@Deprecated(message = "Use lowercaseChar() instead.", replaceWith = @ReplaceWith(expression = "lowercaseChar()", imports = []))
@DeprecatedSinceKotlin(warningSince = "1.5")
@InlineOnly
public inline fun Char.toLowerCase(): Char {
   return Character.toLowerCase(`$this$toLowerCase`)
}

public fun Char.isWhitespace(): Boolean {
   return Character.isWhitespace(`$this$isWhitespace`) || Character.isSpaceChar(`$this$isWhitespace`)
}

@InlineOnly
public inline fun Char.isLowSurrogate(): Boolean {
   return Character.isLowSurrogate(`$this$isLowSurrogate`)
}

open fun CharsKt__CharJVMKt() {
}

@PublishedApi
internal fun checkRadix(radix: Int): Int {
   if (!IntRange(2, 36).contains(radix)) {
      throw IllegalArgumentException("radix $radix was not in valid range ${IntRange(2, 36)}")
   } else {
      return radix
   }
}

public final val category: CharCategory
   public final get() {
      return CharCategory.Companion.valueOf(Character.getType(`$this$category`))
   }


@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@InlineOnly
public inline fun Char.titlecaseChar(): Char {
   return Character.toTitleCase(`$this$titlecaseChar`)
}

@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@InlineOnly
@SinceKotlin(version = "1.5")
public inline fun Char.uppercase(): String {
   var var10000: java.lang.String = java.lang.String.valueOf(`$this$uppercase`)
   var10000 = var10000.toUpperCase(Locale.ROOT)
   return var10000
}
