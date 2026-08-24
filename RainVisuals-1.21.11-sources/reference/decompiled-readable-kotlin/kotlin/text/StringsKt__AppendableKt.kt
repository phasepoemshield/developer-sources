@file:JvmMultifileClass
@file:JvmName("StringsKt")

package kotlin.text

import kotlin.internal.InlineOnly

// $VF: Compiled from Appendable.kt
@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun Appendable.appendLine(value: CharSequence?): Appendable {
   var var10000: Appendable = `$this$appendLine`.append(value)
   var10000 = var10000.append('\n')
   return var10000
}

open fun StringsKt__AppendableKt() {
}

@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun Appendable.appendLine(value: Char): Appendable {
   var var10000: Appendable = `$this$appendLine`.append(value)
   var10000 = var10000.append('\n')
   return var10000
}

@SinceKotlin(version = "1.4")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
public fun <T : Appendable> Any.appendRange(value: CharSequence, startIndex: Int, endIndex: Int): Any {
   val var10000: Appendable = `$this$appendRange`.append(value, startIndex, endIndex)
   return (T)var10000
}

@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun Appendable.appendLine(): Appendable {
   val var10000: Appendable = `$this$appendLine`.append('\n')
   return var10000
}

internal fun <T> Appendable.appendElement(element: Any, transform: ((Any) -> CharSequence)?) {
   if (transform != null) {
      `$this$appendElement`.append(transform(element) as java.lang.CharSequence)
   } else if (element == null || element is java.lang.CharSequence) {
      `$this$appendElement`.append(element as java.lang.CharSequence)
   } else if (element is Character) {
      `$this$appendElement`.append(element as Character)
   } else {
      `$this$appendElement`.append(java.lang.String.valueOf(element))
   }
}

public fun <T : Appendable> Any.append(vararg value: CharSequence?): Any {
   for (item in value) {
      `$this$append`.append(item)
   }

   return (T)`$this$append`
}
