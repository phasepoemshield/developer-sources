@file:JvmMultifileClass
@file:JvmName("StringsKt")

package kotlin.text

import kotlin.internal.InlineOnly

// $VF: Compiled from RegexExtensions.kt
@InlineOnly
public inline fun String.toRegex(): Regex {
   return Regex(`$this$toRegex`)
}

open fun StringsKt__RegexExtensionsKt() {
}

@InlineOnly
public inline fun String.toRegex(options: Set<RegexOption>): Regex {
   return Regex(`$this$toRegex`, options)
}

@InlineOnly
public inline fun String.toRegex(option: RegexOption): Regex {
   return Regex(`$this$toRegex`, option)
}
