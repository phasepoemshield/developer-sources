@file:JvmMultifileClass
@file:JvmName("ComparisonsKt")

package kotlin.comparisons

import java.util.Comparator

// $VF: Compiled from _Comparisons.kt
@SinceKotlin(version = "1.1")
public fun <T> maxOf(a: Any, b: Any, comparator: Comparator<in Any>): Any {
   return (T)(if (comparator.compare(a, b) >= 0) a else b)
}

@SinceKotlin(version = "1.4")
public fun <T> maxOf(a: Any, vararg other: Any, comparator: Comparator<in Any>): Any {
   var max: Any = a

   for (e in other) {
      if (comparator.compare(max, e) < 0) {
         max = e
      }
   }

   return (T)max
}

@SinceKotlin(version = "1.4")
public fun <T> minOf(a: Any, vararg other: Any, comparator: Comparator<in Any>): Any {
   var min: Any = a

   for (e in other) {
      if (comparator.compare(min, e) > 0) {
         min = e
      }
   }

   return (T)min
}

open fun ComparisonsKt___ComparisonsKt() {
}

@SinceKotlin(version = "1.1")
public fun <T> minOf(a: Any, b: Any, comparator: Comparator<in Any>): Any {
   return (T)(if (comparator.compare(a, b) <= 0) a else b)
}

@SinceKotlin(version = "1.1")
public fun <T> minOf(a: Any, b: Any, c: Any, comparator: Comparator<in Any>): Any {
   return (T)ComparisonsKt.minOf(a, ComparisonsKt.minOf(b, c, comparator), comparator)
}

@SinceKotlin(version = "1.1")
public fun <T> maxOf(a: Any, b: Any, c: Any, comparator: Comparator<in Any>): Any {
   return (T)ComparisonsKt.maxOf(a, ComparisonsKt.maxOf(b, c, comparator), comparator)
}
