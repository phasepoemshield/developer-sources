@file:JvmMultifileClass
@file:JvmName("CollectionsKt")

package kotlin.collections

import kotlin.internal.InlineOnly

// $VF: Compiled from Iterators.kt
open fun CollectionsKt__IteratorsKt() {
}

public fun <T> Iterator<Any>.withIndex(): Iterator<IndexedValue<Any>> {
   return IndexingIterator(`$this$withIndex`)
}

@InlineOnly
public inline operator fun <T> Iterator<Any>.iterator(): Iterator<Any> {
   return `$this$iterator`
}

public inline fun <T> Iterator<Any>.forEach(operation: (Any) -> Unit) {
   val var3: java.util.Iterator = `$this$forEach`

   while (var3.hasNext()) {
      operation(var3.next())
   }
}
