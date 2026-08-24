@file:JvmMultifileClass
@file:JvmName("ArraysKt")

package kotlin.collections

import java.nio.charset.Charset
import java.util.Arrays
import kotlin.internal.InlineOnly

// $VF: Compiled from ArraysJVM.kt
@JvmName(name = "contentDeepHashCode")
@PublishedApi
@SinceKotlin(version = "1.3")
internal fun <T> Array<out Any>?.contentDeepHashCodeImpl(): Int {
   return Arrays.deepHashCode(`$this$contentDeepHashCodeImpl`)
}

@InlineOnly
public inline fun ByteArray.toString(charset: Charset): String {
   return java.lang.String(`$this$toString`, charset)
}

open fun ArraysKt__ArraysJVMKt() {
}

internal fun <T> arrayOfNulls(reference: Array<Any>, size: Int): Array<Any> {
   val var10000: Any = java.lang.reflect.Array.newInstance(reference.getClass().getComponentType(), size)
   return (T[])(var10000 as Array<Any>)
}

@SinceKotlin(version = "1.3")
internal fun copyOfRangeToIndexCheck(toIndex: Int, size: Int) {
   if (toIndex > size) {
      throw IndexOutOfBoundsException("toIndex ($toIndex) is greater than size ($size).")
   }
}
