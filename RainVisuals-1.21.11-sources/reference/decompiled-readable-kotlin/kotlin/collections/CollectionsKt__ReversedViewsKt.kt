@file:JvmMultifileClass
@file:JvmName("CollectionsKt")

package kotlin.collections

// $VF: Compiled from ReversedViews.kt
private fun List<*>.reversePositionIndex(index: Int): Int {
   if (IntRange(0, `$this$reversePositionIndex`.size()).contains(index)) {
      return `$this$reversePositionIndex`.size() - index
   } else {
      throw IndexOutOfBoundsException("Position index $index must be in range [${IntRange(0, `$this$reversePositionIndex`.size())}].")
   }
}

open fun CollectionsKt__ReversedViewsKt() {
}

public fun <T> List<Any>.asReversed(): List<Any> {
   return ReversedListReadOnly(`$this$asReversed`)
}

private fun List<*>.reverseIteratorIndex(index: Int): Int {
   return CollectionsKt.getLastIndex(`$this$reverseIteratorIndex`) - index
}

private fun List<*>.reverseElementIndex(index: Int): Int {
   if (IntRange(0, CollectionsKt.getLastIndex(`$this$reverseElementIndex`)).contains(index)) {
      return CollectionsKt.getLastIndex(`$this$reverseElementIndex`) - index
   } else {
      throw IndexOutOfBoundsException("Element index $index must be in range [${IntRange(0, CollectionsKt.getLastIndex(`$this$reverseElementIndex`))}].")
   }
}

@JvmName(name = "asReversedMutable")
public fun <T> MutableList<Any>.asReversed(): MutableList<Any> {
   return ReversedList(`$this$asReversed`)
}
