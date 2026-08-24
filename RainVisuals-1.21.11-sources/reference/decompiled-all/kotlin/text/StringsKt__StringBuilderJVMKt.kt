@file:JvmMultifileClass
@file:JvmName("StringsKt")

package kotlin.text

import kotlin.internal.InlineOnly

// $VF: Compiled from StringBuilderJVM.kt
@Deprecated(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = []), level = DeprecationLevel.WARNING)
@InlineOnly
public inline fun StringBuilder.appendln(value: CharSequence?): StringBuilder {
   val var10000: StringBuilder = `$this$appendln`.append(value)
   return StringsKt.appendln(var10000)
}

@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun StringBuilder.appendLine(value: Short): StringBuilder {
   var var10000: StringBuilder = `$this$appendLine`.append(value)
   var10000 = var10000.append('\n')
   return var10000
}

@Deprecated(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = []), level = DeprecationLevel.WARNING)
@InlineOnly
public inline fun StringBuilder.appendln(value: Byte): StringBuilder {
   val var10000: StringBuilder = `$this$appendln`.append(value)
   return StringsKt.appendln(var10000)
}

@Deprecated(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = []), level = DeprecationLevel.WARNING)
@InlineOnly
public inline fun StringBuilder.appendln(value: String?): StringBuilder {
   val var10000: StringBuilder = `$this$appendln`.append(value)
   return StringsKt.appendln(var10000)
}

@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun StringBuilder.insertRange(index: Int, value: CharArray, startIndex: Int, endIndex: Int): StringBuilder {
   val var10000: StringBuilder = `$this$insertRange`.insert(index, value, startIndex, endIndex - startIndex)
   return var10000
}

@Deprecated(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = []), level = DeprecationLevel.WARNING)
@InlineOnly
public inline fun StringBuilder.appendln(value: Float): StringBuilder {
   val var10000: StringBuilder = `$this$appendln`.append(value)
   return StringsKt.appendln(var10000)
}

@Deprecated(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = []), level = DeprecationLevel.WARNING)
@InlineOnly
public inline fun Appendable.appendln(value: CharSequence?): Appendable {
   val var10000: Appendable = `$this$appendln`.append(value)
   return StringsKt.appendln(var10000)
}

@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun StringBuilder.setRange(startIndex: Int, endIndex: Int, value: String): StringBuilder {
   val var10000: StringBuilder = `$this$setRange`.replace(startIndex, endIndex, value)
   return var10000
}

@Deprecated(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = []), level = DeprecationLevel.WARNING)
@InlineOnly
public inline fun StringBuilder.appendln(value: Boolean): StringBuilder {
   val var10000: StringBuilder = `$this$appendln`.append(value)
   return StringsKt.appendln(var10000)
}

@Deprecated(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = []), level = DeprecationLevel.WARNING)
@InlineOnly
public inline fun StringBuilder.appendln(value: Short): StringBuilder {
   val var10000: StringBuilder = `$this$appendln`.append(value)
   return StringsKt.appendln(var10000)
}

@Deprecated(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = []), level = DeprecationLevel.WARNING)
@InlineOnly
public inline fun StringBuilder.appendln(value: Long): StringBuilder {
   val var10000: StringBuilder = `$this$appendln`.append(value)
   return StringsKt.appendln(var10000)
}

open fun StringsKt__StringBuilderJVMKt() {
}

@Deprecated(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine()", imports = []), level = DeprecationLevel.WARNING)
public fun StringBuilder.appendln(): StringBuilder {
   val var10000: StringBuilder = `$this$appendln`.append(SystemProperties.LINE_SEPARATOR)
   return var10000
}

@Deprecated(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = []), level = DeprecationLevel.WARNING)
@InlineOnly
public inline fun StringBuilder.appendln(value: StringBuffer?): StringBuilder {
   val var10000: StringBuilder = `$this$appendln`.append(value)
   return StringsKt.appendln(var10000)
}

@Deprecated(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = []), level = DeprecationLevel.WARNING)
@InlineOnly
public inline fun StringBuilder.appendln(value: Any?): StringBuilder {
   val var10000: StringBuilder = `$this$appendln`.append(value)
   return StringsKt.appendln(var10000)
}

@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun StringBuilder.appendLine(value: Float): StringBuilder {
   var var10000: StringBuilder = `$this$appendLine`.append(value)
   var10000 = var10000.append('\n')
   return var10000
}

@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun StringBuilder.toCharArray(
   destination: CharArray,
   destinationOffset: Int = 0,
   startIndex: Int = 0,
   endIndex: Int = `$this$toCharArray`.length()
) {
   `$this$toCharArray`.getChars(startIndex, endIndex, destination, destinationOffset)
}

@SinceKotlin(version = "1.4")
@InlineOnly
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
public inline fun StringBuilder.deleteAt(index: Int): StringBuilder {
   val var10000: StringBuilder = `$this$deleteAt`.deleteCharAt(index)
   return var10000
}

@InlineOnly
public inline operator fun StringBuilder.set(index: Int, value: Char) {
   `$this$set`.setCharAt(index, value)
}

@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun StringBuilder.appendLine(value: StringBuilder?): StringBuilder {
   var var10000: StringBuilder = `$this$appendLine`.append(value)
   var10000 = var10000.append('\n')
   return var10000
}

@Deprecated(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = []), level = DeprecationLevel.WARNING)
@InlineOnly
public inline fun StringBuilder.appendln(value: Int): StringBuilder {
   val var10000: StringBuilder = `$this$appendln`.append(value)
   return StringsKt.appendln(var10000)
}

@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun StringBuilder.appendLine(value: Long): StringBuilder {
   var var10000: StringBuilder = `$this$appendLine`.append(value)
   var10000 = var10000.append('\n')
   return var10000
}

@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun StringBuilder.appendLine(value: Int): StringBuilder {
   var var10000: StringBuilder = `$this$appendLine`.append(value)
   var10000 = var10000.append('\n')
   return var10000
}

@SinceKotlin(version = "1.3")
public fun StringBuilder.clear(): StringBuilder {
   `$this$clear`.setLength(0)
   return `$this$clear`
}

@Deprecated(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = []), level = DeprecationLevel.WARNING)
@InlineOnly
public inline fun Appendable.appendln(value: Char): Appendable {
   val var10000: Appendable = `$this$appendln`.append(value)
   return StringsKt.appendln(var10000)
}

@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun StringBuilder.appendLine(value: StringBuffer?): StringBuilder {
   var var10000: StringBuilder = `$this$appendLine`.append(value)
   var10000 = var10000.append('\n')
   return var10000
}

@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun StringBuilder.appendLine(value: Byte): StringBuilder {
   var var10000: StringBuilder = `$this$appendLine`.append(value)
   var10000 = var10000.append('\n')
   return var10000
}

@Deprecated(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = []), level = DeprecationLevel.WARNING)
@InlineOnly
public inline fun StringBuilder.appendln(value: CharArray): StringBuilder {
   val var10000: StringBuilder = `$this$appendln`.append(value)
   return StringsKt.appendln(var10000)
}

@SinceKotlin(version = "1.4")
@InlineOnly
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
public inline fun StringBuilder.appendRange(value: CharArray, startIndex: Int, endIndex: Int): StringBuilder {
   val var10000: StringBuilder = `$this$appendRange`.append(value, startIndex, endIndex - startIndex)
   return var10000
}

@Deprecated(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = []), level = DeprecationLevel.WARNING)
@InlineOnly
public inline fun StringBuilder.appendln(value: StringBuilder?): StringBuilder {
   val var10000: StringBuilder = `$this$appendln`.append(value)
   return StringsKt.appendln(var10000)
}

@Deprecated(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine()", imports = []), level = DeprecationLevel.WARNING)
public fun Appendable.appendln(): Appendable {
   val var10000: Appendable = `$this$appendln`.append(SystemProperties.LINE_SEPARATOR)
   return var10000
}

@SinceKotlin(version = "1.4")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@InlineOnly
public inline fun StringBuilder.insertRange(index: Int, value: CharSequence, startIndex: Int, endIndex: Int): StringBuilder {
   val var10000: StringBuilder = `$this$insertRange`.insert(index, value, startIndex, endIndex)
   return var10000
}

@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun StringBuilder.appendLine(value: Double): StringBuilder {
   var var10000: StringBuilder = `$this$appendLine`.append(value)
   var10000 = var10000.append('\n')
   return var10000
}

@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun StringBuilder.appendRange(value: CharSequence, startIndex: Int, endIndex: Int): StringBuilder {
   val var10000: StringBuilder = `$this$appendRange`.append(value, startIndex, endIndex)
   return var10000
}

@Deprecated(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = []), level = DeprecationLevel.WARNING)
@InlineOnly
public inline fun StringBuilder.appendln(value: Char): StringBuilder {
   val var10000: StringBuilder = `$this$appendln`.append(value)
   return StringsKt.appendln(var10000)
}

@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun StringBuilder.deleteRange(startIndex: Int, endIndex: Int): StringBuilder {
   val var10000: StringBuilder = `$this$deleteRange`.delete(startIndex, endIndex)
   return var10000
}

@Deprecated(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = []), level = DeprecationLevel.WARNING)
@InlineOnly
public inline fun StringBuilder.appendln(value: Double): StringBuilder {
   val var10000: StringBuilder = `$this$appendln`.append(value)
   return StringsKt.appendln(var10000)
}
