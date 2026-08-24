@file:JvmMultifileClass
@file:JvmName("GroupingKt")

package kotlin.collections

import java.util.LinkedHashMap

// $VF: Compiled from Grouping.kt
@SinceKotlin(version = "1.1")
public fun <T, K, M : MutableMap<in Any, Int>> Grouping<Any, Any>.eachCountTo(destination: Any): Any {
   val `initialValue$iv`: Int = 0
   val `$this$aggregateTo$iv$iv`: Grouping = `$this$eachCountTo`
   val var7: java.util.Iterator = `$this$eachCountTo`.sourceIterator()

   while (var7.hasNext()) {
      val `key$iv$iv`: Any = `$this$aggregateTo$iv$iv`.keyOf(var7.next())
      val `accumulator$iv$iv`: Any = destination.get(`key$iv$iv`)
      destination.put(
         `key$iv$iv`,
         ((if (`accumulator$iv$iv` == null && !destination.containsKey(`key$iv$iv`)) `initialValue$iv` else `accumulator$iv$iv`) as java.lang.Number)
               .intValue()
            + 1
      )
   }

   return (M)destination
}

@SinceKotlin(version = "1.1")
public inline fun <T, K, R> Grouping<Any, Any>.fold(initialValueSelector: (Any, Any) -> Any, operation: (Any, Any, Any) -> Any): Map<Any, Any> {
   val `$this$aggregateTo$iv$iv`: Grouping = `$this$fold`
   val `destination$iv$iv`: java.util.Map = LinkedHashMap()
   val var9: java.util.Iterator = `$this$fold`.sourceIterator()

   while (var9.hasNext()) {
      val `e$iv$iv`: Any = var9.next()
      val `key$iv$iv`: Any = `$this$aggregateTo$iv$iv`.keyOf(`e$iv$iv`)
      val `accumulator$iv$iv`: Any = `destination$iv$iv`.get(`key$iv$iv`)
      `destination$iv$iv`.put(
         `key$iv$iv`,
         operation(
            `key$iv$iv`,
            if (`accumulator$iv$iv` == null && !`destination$iv$iv`.containsKey(`key$iv$iv`))
               initialValueSelector(`key$iv$iv`, `e$iv$iv`)
               else
               `accumulator$iv$iv`,
            `e$iv$iv`
         )
      )
   }

   return `destination$iv$iv`
}

@SinceKotlin(version = "1.1")
public inline fun <T, K, R> Grouping<Any, Any>.aggregate(operation: (Any, Any?, Any, Boolean) -> Any): Map<Any, Any> {
   val `$this$aggregateTo$iv`: Grouping = `$this$aggregate`
   val `destination$iv`: java.util.Map = LinkedHashMap()
   val var6: java.util.Iterator = `$this$aggregate`.sourceIterator()

   while (var6.hasNext()) {
      val `e$iv`: Any = var6.next()
      val `key$iv`: Any = `$this$aggregateTo$iv`.keyOf(`e$iv`)
      val `accumulator$iv`: Any = `destination$iv`.get(`key$iv`)
      `destination$iv`.put(`key$iv`, operation(`key$iv`, `accumulator$iv`, `e$iv`, `accumulator$iv` == null && !`destination$iv`.containsKey(`key$iv`)))
   }

   return `destination$iv`
}

@SinceKotlin(version = "1.1")
public inline fun <T, K, R> Grouping<Any, Any>.fold(initialValue: Any, operation: (Any, Any) -> Any): Map<Any, Any> {
   val `$this$aggregateTo$iv$iv`: Grouping = `$this$fold`
   val `destination$iv$iv`: java.util.Map = LinkedHashMap()
   val var9: java.util.Iterator = `$this$fold`.sourceIterator()

   while (var9.hasNext()) {
      val `e$iv$iv`: Any = var9.next()
      val `key$iv$iv`: Any = `$this$aggregateTo$iv$iv`.keyOf(`e$iv$iv`)
      val `accumulator$iv$iv`: Any = `destination$iv$iv`.get(`key$iv$iv`)
      `destination$iv$iv`.put(
         `key$iv$iv`,
         operation(if (`accumulator$iv$iv` == null && !`destination$iv$iv`.containsKey(`key$iv$iv`)) initialValue else `accumulator$iv$iv`, `e$iv$iv`)
      )
   }

   return `destination$iv$iv`
}

@SinceKotlin(version = "1.1")
public inline fun <T, K, R, M : MutableMap<in Any, Any>> Grouping<Any, Any>.foldTo(
   destination: Any,
   initialValueSelector: (Any, Any) -> Any,
   operation: (Any, Any, Any) -> Any
): Any {
   val `$this$aggregateTo$iv`: Grouping = `$this$foldTo`
   val var7: java.util.Iterator = `$this$foldTo`.sourceIterator()

   while (var7.hasNext()) {
      val `e$iv`: Any = var7.next()
      val `key$iv`: Any = `$this$aggregateTo$iv`.keyOf(`e$iv`)
      val `accumulator$iv`: Any = destination.get(`key$iv`)
      destination.put(
         `key$iv`,
         operation(
            `key$iv`, if (`accumulator$iv` == null && !destination.containsKey(`key$iv`)) initialValueSelector(`key$iv`, `e$iv`) else `accumulator$iv`, `e$iv`
         )
      )
   }

   return (M)destination
}

@SinceKotlin(version = "1.1")
public inline fun <S, T : Any, K, M : MutableMap<in Any, Any>> Grouping<Any, Any>.reduceTo(destination: Any, operation: (Any, Any, Any) -> Any): Any {
   val `$this$aggregateTo$iv`: Grouping = `$this$reduceTo`
   val var6: java.util.Iterator = `$this$reduceTo`.sourceIterator()

   while (var6.hasNext()) {
      val `e$iv`: Any = var6.next()
      val `key$iv`: Any = `$this$aggregateTo$iv`.keyOf(`e$iv`)
      val `accumulator$iv`: Any = destination.get(`key$iv`)
      destination.put(`key$iv`, if (`accumulator$iv` == null && !destination.containsKey(`key$iv`)) `e$iv` else operation(`key$iv`, `accumulator$iv`, `e$iv`))
   }

   return (M)destination
}

open fun GroupingKt__GroupingKt() {
}

@SinceKotlin(version = "1.1")
public inline fun <T, K, R, M : MutableMap<in Any, Any>> Grouping<Any, Any>.aggregateTo(destination: Any, operation: (Any, Any?, Any, Boolean) -> Any): Any {
   val var4: java.util.Iterator = `$this$aggregateTo`.sourceIterator()

   while (var4.hasNext()) {
      val e: Any = var4.next()
      val key: Any = `$this$aggregateTo`.keyOf(e)
      val accumulator: Any = destination.get(key)
      destination.put(key, operation(key, accumulator, e, accumulator == null && !destination.containsKey(key)))
   }

   return (M)destination
}

@SinceKotlin(version = "1.1")
public inline fun <T, K, R, M : MutableMap<in Any, Any>> Grouping<Any, Any>.foldTo(destination: Any, initialValue: Any, operation: (Any, Any) -> Any): Any {
   val `$this$aggregateTo$iv`: Grouping = `$this$foldTo`
   val var7: java.util.Iterator = `$this$foldTo`.sourceIterator()

   while (var7.hasNext()) {
      val `e$iv`: Any = var7.next()
      val `key$iv`: Any = `$this$aggregateTo$iv`.keyOf(`e$iv`)
      val `accumulator$iv`: Any = destination.get(`key$iv`)
      destination.put(`key$iv`, operation(if (`accumulator$iv` == null && !destination.containsKey(`key$iv`)) initialValue else `accumulator$iv`, `e$iv`))
   }

   return (M)destination
}

@SinceKotlin(version = "1.1")
public inline fun <S, T : Any, K> Grouping<Any, Any>.reduce(operation: (Any, Any, Any) -> Any): Map<Any, Any> {
   val `$this$aggregateTo$iv$iv`: Grouping = `$this$reduce`
   val `destination$iv$iv`: java.util.Map = LinkedHashMap()
   val var8: java.util.Iterator = `$this$reduce`.sourceIterator()

   while (var8.hasNext()) {
      val `e$iv$iv`: Any = var8.next()
      val `key$iv$iv`: Any = `$this$aggregateTo$iv$iv`.keyOf(`e$iv$iv`)
      val `accumulator$iv$iv`: Any = `destination$iv$iv`.get(`key$iv$iv`)
      `destination$iv$iv`.put(
         `key$iv$iv`,
         if (`accumulator$iv$iv` == null && !`destination$iv$iv`.containsKey(`key$iv$iv`))
            `e$iv$iv`
            else
            operation(`key$iv$iv`, `accumulator$iv$iv`, `e$iv$iv`)
      )
   }

   return `destination$iv$iv`
}
