@file:JvmMultifileClass
@file:JvmName("StringsKt")

package kotlin.text

import java.math.BigDecimal
import java.math.BigInteger
import java.util.SortedSet
import java.util.TreeSet
import kotlin.internal.InlineOnly

// $VF: Compiled from _StringsJvm.kt
@JvmName(name = "sumOfBigInteger")
@OverloadResolutionByLambdaReturnType
@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun CharSequence.sumOf(selector: (Char) -> BigInteger): BigInteger {
   var var10000: BigInteger = BigInteger.valueOf(0L)
   var sum: BigInteger = var10000
      return sum
}

open fun StringsKt___StringsJvmKt() {
}

public fun CharSequence.toSortedSet(): SortedSet<Char> {
   return StringsKt.toCollection(`$this$toSortedSet`, TreeSet<>())
}

@JvmName(name = "sumOfBigDecimal")
@InlineOnly
@OverloadResolutionByLambdaReturnType
@SinceKotlin(version = "1.4")
public inline fun CharSequence.sumOf(selector: (Char) -> BigDecimal): BigDecimal {
   var var10000: BigDecimal = BigDecimal.valueOf(0L)
   var sum: BigDecimal = var10000
      return sum
}

@InlineOnly
public inline fun CharSequence.elementAt(index: Int): Char {
   return `$this$elementAt`.charAt(index)
}
