@file:JvmMultifileClass
@file:JvmName("CollectionsKt")

package kotlin.collections

import java.math.BigDecimal
import java.math.BigInteger
import java.util.ArrayList
import java.util.Collections
import java.util.Comparator
import java.util.SortedSet
import java.util.TreeSet
import kotlin.internal.InlineOnly

// $VF: Compiled from _CollectionsJvm.kt
public fun <T> Iterable<Any>.toSortedSet(comparator: Comparator<in Any>): SortedSet<Any> {
   return CollectionsKt.toCollection(`$this$toSortedSet`, TreeSet(comparator)) as SortedSet<T>
}

public fun <T> MutableList<Any>.reverse() {
   Collections.reverse(`$this$reverse`)
}

@InlineOnly
@JvmName(name = "sumOfBigDecimal")
@SinceKotlin(version = "1.4")
@OverloadResolutionByLambdaReturnType
public inline fun <T> Iterable<Any>.sumOf(selector: (Any) -> BigDecimal): BigDecimal {
   var var10000: BigDecimal = BigDecimal.valueOf(0L)
   var sum: BigDecimal = var10000

   for (element in `$this$sumOf`) {
      var10000 = sum.add(selector(element) as BigDecimal)
      sum = var10000
   }

   return sum
}

public fun <R> Iterable<*>.filterIsInstance(klass: Class<Any>): List<Any> {
   return CollectionsKt.filterIsInstanceTo(`$this$filterIsInstance`, ArrayList(), klass) as MutableList<R>
}

public fun <T : Comparable<Any>> Iterable<Any>.toSortedSet(): SortedSet<Any> {
   return CollectionsKt.toCollection(`$this$toSortedSet`, TreeSet()) as SortedSet<T>
}

@OverloadResolutionByLambdaReturnType
@InlineOnly
@SinceKotlin(version = "1.4")
@JvmName(name = "sumOfBigInteger")
public inline fun <T> Iterable<Any>.sumOf(selector: (Any) -> BigInteger): BigInteger {
   var var10000: BigInteger = BigInteger.valueOf(0L)
   var sum: BigInteger = var10000

   for (element in `$this$sumOf`) {
      var10000 = sum.add(selector(element) as BigInteger)
      sum = var10000
   }

   return sum
}

public fun <C : MutableCollection<in Any>, R> Iterable<*>.filterIsInstanceTo(destination: Any, klass: Class<Any>): Any {
   for (element in `$this$filterIsInstanceTo`) {
      if (klass.isInstance(element)) {
         destination.add(element)
      }
   }

   return (C)destination
}

open fun CollectionsKt___CollectionsJvmKt() {
}
