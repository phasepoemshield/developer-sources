@file:JvmMultifileClass
@file:JvmName("GroupingKt")

package kotlin.collections

import java.util.LinkedHashMap
import kotlin.collections.Map.Entry
import kotlin.internal.InlineOnly
import kotlin.jvm.internal.Ref
import kotlin.jvm.internal.TypeIntrinsics

// $VF: Compiled from GroupingJVM.kt
open fun GroupingKt__GroupingJVMKt() {
}

@InlineOnly
@PublishedApi
internal inline fun <K, V, R> MutableMap<Any, Any>.mapValuesInPlace(f: (Entry<Any, Any>) -> Any): MutableMap<Any, Any> {
   for (`element$iv` in `$this$mapValuesInPlace`.entrySet()) {
      val it: java.util.Map.Entry = `element$iv` as java.util.Map.Entry
      TypeIntrinsics.asMutableMapEntry(it).setValue(f(it))
   }

   return TypeIntrinsics.asMutableMap(`$this$mapValuesInPlace`)
}

@SinceKotlin(version = "1.1")
public fun <T, K> Grouping<Any, Any>.eachCount(): Map<Any, Int> {
   val `destination$iv`: java.util.Map = LinkedHashMap()
   val `$this$aggregateTo$iv$iv`: Grouping = `$this$eachCount`
   val var6: java.util.Iterator = `$this$eachCount`.sourceIterator()

   while (var6.hasNext()) {
      val `key$iv$iv`: Any = `$this$aggregateTo$iv$iv`.keyOf(var6.next())
      val `accumulator$iv$iv`: Any = `destination$iv`.get(`key$iv$iv`)
      val var21: Ref.IntRef = (if (`accumulator$iv$iv` == null && !`destination$iv`.containsKey(`key$iv$iv`)) Ref.IntRef() else `accumulator$iv$iv`) as Ref.IntRef
      var21.element++
      `destination$iv`.put(`key$iv$iv`, var21)
   }

   for (var28 in `destination$iv`.entrySet()) {
      TypeIntrinsics.asMutableMapEntry(var28).setValue((var28.getValue() as Ref.IntRef).element)
   }

   return TypeIntrinsics.asMutableMap(`destination$iv`)
}
