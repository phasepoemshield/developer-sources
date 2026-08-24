@file:JvmMultifileClass
@file:JvmName("ComparisonsKt")

package kotlin.comparisons

import java.util.Comparator
import kotlin.internal.InlineOnly
import kotlin.jvm.functions.Function1

// $VF: Compiled from Comparisons.kt
public infix fun <T> Comparator<Any>.thenDescending(comparator: Comparator<in Any>): Comparator<Any> {
   return { a: Any, b: Any ->
      val previousCompare: Int = `$this_thenDescending`.compare(a, b)
      if (previousCompare != 0) previousCompare else `$comparator`.compare(b, a)
   }
}

@InlineOnly
public inline fun <T : Comparable<Any>> nullsFirst(): Comparator<Any?> {
   return ComparisonsKt.nullsFirst(ComparisonsKt.naturalOrder())
}

public fun <T : Any> nullsFirst(comparator: Comparator<in Any>): Comparator<Any?> {
   return { a: Any, b: Any ->
      if (a === b) 0 else (if (a == null) -1 else (if (b == null) 1 else `$comparator`.compare(a, b)))
   }
}

open fun ComparisonsKt__ComparisonsKt() {
}

public fun <T : Comparable<Any>> reverseOrder(): Comparator<Any> {
   val var10000: ReverseOrderComparator = ReverseOrderComparator.INSTANCE
   return var10000
}

@InlineOnly
public inline fun <T : Comparable<Any>> nullsLast(): Comparator<Any?> {
   return ComparisonsKt.nullsLast(ComparisonsKt.naturalOrder())
}

@InlineOnly
public inline fun <T> compareValuesBy(a: Any, b: Any, selector: (Any) -> Comparable<*>?): Int {
   return ComparisonsKt.compareValues(selector(a) as java.lang.Comparable, selector(b) as java.lang.Comparable)
}

@InlineOnly
public inline fun <T, K> Comparator<Any>.thenByDescending(comparator: Comparator<in Any>, crossinline selector: (Any) -> Any): Comparator<Any> {
   return    // $VF: Compiled from Comparisons.kt
{ a: Any, b: Any ->
      val previousCompare: Int = $this$thenByDescending.compare(a, b)
      val var10000: Int
      if (previousCompare != 0) {
         var10000 = previousCompare
      } else {
         val var5: Function1 = selector
         var10000 = comparator.compare(selector(b), var5(a))
      }

      return var10000
   }
}

@InlineOnly
public inline fun <T> compareByDescending(crossinline selector: (Any) -> Comparable<*>?): Comparator<Any> {
   return    // $VF: Compiled from Comparisons.kt
{ a: Any, b: Any ->
      val var3: Function1 = selector
      return ComparisonsKt.compareValues((T)(selector(b) as java.lang.Comparable), (T)(var3(a) as java.lang.Comparable))
   }
}

@InlineOnly
public inline fun <T> Comparator<Any>.thenBy(crossinline selector: (Any) -> Comparable<*>?): Comparator<Any> {
   return    // $VF: Compiled from Comparisons.kt
{ a: Any, b: Any ->
      val previousCompare: Int = $this$thenBy.compare(a, b)
      val var10000: Int
      if (previousCompare != 0) {
         var10000 = previousCompare
      } else {
         val var4: Function1 = selector
         var10000 = ComparisonsKt.compareValues((T)(selector(a) as java.lang.Comparable), (T)(var4(b) as java.lang.Comparable))
      }

      return var10000
   }
}

@InlineOnly
public inline fun <T, K> compareBy(comparator: Comparator<in Any>, crossinline selector: (Any) -> Any): Comparator<Any> {
   return    // $VF: Compiled from Comparisons.kt
{ a: Any, b: Any ->
      val var4: Function1 = selector
      return comparator.compare(selector(a), var4(b))
   }
}

@InlineOnly
public inline fun <T> Comparator<Any>.thenComparator(crossinline comparison: (Any, Any) -> Int): Comparator<Any> {
   return    // $VF: Compiled from Comparisons.kt
{ a: Any, b: Any ->
      val previousCompare: Int = $this$thenComparator.compare(a, b)
      return if (previousCompare != 0) previousCompare else (comparison(a, b) as java.lang.Number).intValue()
   }
}

@InlineOnly
public inline fun <T> compareBy(crossinline selector: (Any) -> Comparable<*>?): Comparator<Any> {
   return    // $VF: Compiled from Comparisons.kt
{ a: Any, b: Any ->
      val var3: Function1 = selector
      return ComparisonsKt.compareValues((T)(selector(a) as java.lang.Comparable), (T)(var3(b) as java.lang.Comparable))
   }
}

public fun <T> Comparator<Any>.reversed(): Comparator<Any> {
   var var10000: Comparator
   if (`$this$reversed` is ReversedComparator) {
      var10000 = (`$this$reversed` as ReversedComparator).comparator
   } else if (`$this$reversed` == NaturalOrderComparator.INSTANCE) {
      var10000 = ReverseOrderComparator.INSTANCE
      var10000 = var10000
   } else if (`$this$reversed` == ReverseOrderComparator.INSTANCE) {
      var10000 = NaturalOrderComparator.INSTANCE
      var10000 = var10000
   } else {
      var10000 = ReversedComparator(`$this$reversed`)
   }

   return var10000
}

@InlineOnly
public inline fun <T, K> compareByDescending(comparator: Comparator<in Any>, crossinline selector: (Any) -> Any): Comparator<Any> {
   return    // $VF: Compiled from Comparisons.kt
{ a: Any, b: Any ->
      val var4: Function1 = selector
      return comparator.compare(selector(b), var4(a))
   }
}

private fun <T> compareValuesByImpl(a: Any, b: Any, selectors: Array<out (Any) -> Comparable<*>?>): Int {
   for (fn in selectors) {
      val diff: Int = ComparisonsKt.compareValues(fn(a) as java.lang.Comparable, fn(b) as java.lang.Comparable)
      if (diff != 0) {
         return diff
      }
   }

   return 0
}

public fun <T> compareBy(vararg selectors: (Any) -> Comparable<*>?): Comparator<Any> {
   if (selectors.length <= 0) {
      throw IllegalArgumentException("Failed requirement.".toString())
   } else {
      return { a: Any, b: Any ->
         compareValuesByImpl$ComparisonsKt__ComparisonsKt(a, b, `$selectors`)
      }
   }
}

public fun <T : Comparable<Any>> naturalOrder(): Comparator<Any> {
   val var10000: NaturalOrderComparator = NaturalOrderComparator.INSTANCE
   return var10000
}

@InlineOnly
public inline fun <T, K> compareValuesBy(a: Any, b: Any, comparator: Comparator<in Any>, selector: (Any) -> Any): Int {
   return comparator.compare(selector(a), selector(b))
}

@InlineOnly
public inline fun <T, K> Comparator<Any>.thenBy(comparator: Comparator<in Any>, crossinline selector: (Any) -> Any): Comparator<Any> {
   return    // $VF: Compiled from Comparisons.kt
{ a: Any, b: Any ->
      val previousCompare: Int = $this$thenBy.compare(a, b)
      val var10000: Int
      if (previousCompare != 0) {
         var10000 = previousCompare
      } else {
         val var5: Function1 = selector
         var10000 = comparator.compare(selector(a), var5(b))
      }

      return var10000
   }
}

@InlineOnly
public inline fun <T> Comparator<Any>.thenByDescending(crossinline selector: (Any) -> Comparable<*>?): Comparator<Any> {
   return    // $VF: Compiled from Comparisons.kt
{ a: Any, b: Any ->
      val previousCompare: Int = $this$thenByDescending.compare(a, b)
      val var10000: Int
      if (previousCompare != 0) {
         var10000 = previousCompare
      } else {
         val var4: Function1 = selector
         var10000 = ComparisonsKt.compareValues((T)(selector(b) as java.lang.Comparable), (T)(var4(a) as java.lang.Comparable))
      }

      return var10000
   }
}

public fun <T : Comparable<*>> compareValues(a: Any?, b: Any?): Int {
   if (a === b) {
      return 0
   } else if (a == null) {
      return -1
   } else {
      return if (b == null) 1 else a.compareTo(b)
   }
}

public fun <T> compareValuesBy(a: Any, b: Any, vararg selectors: (Any) -> Comparable<*>?): Int {
   if (selectors.length <= 0) {
      throw IllegalArgumentException("Failed requirement.".toString())
   } else {
      return compareValuesByImpl$ComparisonsKt__ComparisonsKt(a, b, selectors)
   }
}

public infix fun <T> Comparator<Any>.then(comparator: Comparator<in Any>): Comparator<Any> {
   return { a: Any, b: Any ->
      val previousCompare: Int = `$this_then`.compare(a, b)
      if (previousCompare != 0) previousCompare else `$comparator`.compare(a, b)
   }
}

public fun <T : Any> nullsLast(comparator: Comparator<in Any>): Comparator<Any?> {
   return { a: Any, b: Any ->
      if (a === b) 0 else (if (a == null) 1 else (if (b == null) -1 else `$comparator`.compare(a, b)))
   }
}
