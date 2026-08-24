@file:JvmMultifileClass
@file:JvmName("SequencesKt")

package kotlin.sequences

import java.math.BigDecimal
import java.math.BigInteger
import java.util.Comparator
import java.util.SortedSet
import java.util.TreeSet
import kotlin.internal.InlineOnly
import kotlin.jvm.functions.Function1

// $VF: Compiled from _SequencesJvm.kt
public fun <R> Sequence<*>.filterIsInstance(klass: Class<Any>): Sequence<Any> {
   val var10000: Sequence = SequencesKt.filter(`$this$filterIsInstance`,    // $VF: Compiled from _SequencesJvm.kt
{ it: Any? ->
      return klass.isInstance(it)
   } as Function1)
   return var10000
}

public fun <T : Comparable<Any>> Sequence<Any>.toSortedSet(): SortedSet<Any> {
   return SequencesKt.toCollection(`$this$toSortedSet`, TreeSet()) as SortedSet<T>
}

public fun <C : MutableCollection<in Any>, R> Sequence<*>.filterIsInstanceTo(destination: Any, klass: Class<Any>): Any {
   for (element in `$this$filterIsInstanceTo`) {
      if (klass.isInstance(element)) {
         destination.add(element)
      }
   }

   return (C)destination
}

@OverloadResolutionByLambdaReturnType
@JvmName(name = "sumOfBigDecimal")
@InlineOnly
@SinceKotlin(version = "1.4")
public inline fun <T> Sequence<Any>.sumOf(selector: (Any) -> BigDecimal): BigDecimal {
   var var10000: BigDecimal = BigDecimal.valueOf(0L)
   var sum: BigDecimal = var10000

   for (element in `$this$sumOf`) {
      var10000 = sum.add(selector(element) as BigDecimal)
      sum = var10000
   }

   return sum
}

@SinceKotlin(version = "1.4")
@JvmName(name = "sumOfBigInteger")
@OverloadResolutionByLambdaReturnType
@InlineOnly
public inline fun <T> Sequence<Any>.sumOf(selector: (Any) -> BigInteger): BigInteger {
   var var10000: BigInteger = BigInteger.valueOf(0L)
   var sum: BigInteger = var10000

   for (element in `$this$sumOf`) {
      var10000 = sum.add(selector(element) as BigInteger)
      sum = var10000
   }

   return sum
}

public fun <T> Sequence<Any>.toSortedSet(comparator: Comparator<in Any>): SortedSet<Any> {
   return SequencesKt.toCollection(`$this$toSortedSet`, TreeSet(comparator)) as SortedSet<T>
}

open fun SequencesKt___SequencesJvmKt() {
}
