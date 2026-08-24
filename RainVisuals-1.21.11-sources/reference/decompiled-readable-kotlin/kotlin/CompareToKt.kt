package kotlin

import kotlin.internal.InlineOnly

// $VF: Compiled from compareTo.kt
@SinceKotlin(version = "1.6")
@InlineOnly
public inline infix fun <T> Comparable<Any>.compareTo(other: Any): Int {
   return `$this$compareTo`.compareTo(other)
}
