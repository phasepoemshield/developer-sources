@file:JvmMultifileClass
@file:JvmName("StringsKt")

package kotlin.text

import kotlin.contracts.InvocationKind
import kotlin.internal.InlineOnly

// $VF: Compiled from StringBuilder.kt
@Deprecated(message = "Use appendRange instead.", replaceWith = @ReplaceWith(expression = "this.appendRange(str, offset, offset + len)", imports = []), level = DeprecationLevel.ERROR)
@InlineOnly
public inline fun StringBuilder.append(str: CharArray, offset: Int, len: Int): StringBuilder {
   throw NotImplementedError(null, 1, null)
}

@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun StringBuilder.appendLine(): StringBuilder {
   val var10000: StringBuilder = `$this$appendLine`.append('\n')
   return var10000
}

open fun StringsKt__StringBuilderKt() {
}

@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun StringBuilder.appendLine(value: CharSequence?): StringBuilder {
   var var10000: StringBuilder = `$this$appendLine`.append(value)
   var10000 = var10000.append('\n')
   return var10000
}

@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun StringBuilder.appendLine(value: Char): StringBuilder {
   var var10000: StringBuilder = `$this$appendLine`.append(value)
   var10000 = var10000.append('\n')
   return var10000
}

@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun StringBuilder.appendLine(value: String?): StringBuilder {
   var var10000: StringBuilder = `$this$appendLine`.append(value)
   var10000 = var10000.append('\n')
   return var10000
}

@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun StringBuilder.appendLine(value: Any?): StringBuilder {
   var var10000: StringBuilder = `$this$appendLine`.append(value)
   var10000 = var10000.append('\n')
   return var10000
}

@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun StringBuilder.appendLine(value: CharArray): StringBuilder {
   var var10000: StringBuilder = `$this$appendLine`.append(value)
   var10000 = var10000.append('\n')
   return var10000
}

public fun StringBuilder.append(vararg value: Any?): StringBuilder {
   for (item in value) {
      `$this$append`.append(item)
   }

   return `$this$append`
}

public fun StringBuilder.append(vararg value: String?): StringBuilder {
   for (item in value) {
      `$this$append`.append(item)
   }

   return `$this$append`
}

@SinceKotlin(version = "1.1")
@InlineOnly
public inline fun buildString(capacity: Int, builderAction: (StringBuilder) -> Unit): String {
   contract {
      callsInPlace(builderAction, InvocationKind.EXACTLY_ONCE)
   }

   val var2: StringBuilder = StringBuilder(capacity)
   builderAction(var2)
   val var10000: java.lang.String = var2.toString()
   return var10000
}

@InlineOnly
public inline fun buildString(builderAction: (StringBuilder) -> Unit): String {
   contract {
      callsInPlace(builderAction, InvocationKind.EXACTLY_ONCE)
   }

   val var1: StringBuilder = StringBuilder()
   builderAction(var1)
   val var10000: java.lang.String = var1.toString()
   return var10000
}

@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun StringBuilder.appendLine(value: Boolean): StringBuilder {
   var var10000: StringBuilder = `$this$appendLine`.append(value)
   var10000 = var10000.append('\n')
   return var10000
}

@Deprecated(message = "Use append(value: Any?) instead", replaceWith = @ReplaceWith(expression = "append(value = obj)", imports = []), level = DeprecationLevel.WARNING)
@InlineOnly
public inline fun StringBuilder.append(obj: Any?): StringBuilder {
   val var10000: StringBuilder = `$this$append`.append(obj)
   return var10000
}
