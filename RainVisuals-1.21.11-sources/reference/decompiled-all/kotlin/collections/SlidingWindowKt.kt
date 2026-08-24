package kotlin.collections

import kotlin.jvm.functions.Function2

// $VF: Compiled from SlidingWindow.kt
internal fun checkWindowSizeStep(size: Int, step: Int) {
   if (size <= 0 || step <= 0) {
      throw IllegalArgumentException(
         (if (size != step) "Both size $size and step $step must be greater than zero." else "size $size must be greater than zero.").toString()
      )
   }
}

internal fun <T> windowedIterator(iterator: Iterator<Any>, size: Int, step: Int, partialWindows: Boolean, reuseBuffer: Boolean): Iterator<List<Any>> {
   return if (!iterator.hasNext()) EmptyIterator.INSTANCE else SequencesKt.iterator(   // $VF: Compiled from SlidingWindow.kt
{
      // $VF: Could not decompile lambda - root function was not found. Is this a suspend lambda?
   } as Function2)
}

internal fun <T> Sequence<Any>.windowedSequence(size: Int, step: Int, partialWindows: Boolean, reuseBuffer: Boolean): Sequence<List<Any>> {
   checkWindowSizeStep(size, step)
   return SlidingWindowKt$windowedSequence$$inlined$Sequence$1(`$this$windowedSequence`, size, step, partialWindows, reuseBuffer)
}
