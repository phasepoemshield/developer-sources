@file:JvmMultifileClass
@file:JvmName("SequencesKt")

package kotlin.sequences

import kotlin.coroutines.Continuation
import kotlin.coroutines.intrinsics.IntrinsicsKt

// $VF: Compiled from SequenceBuilder.kt
private const val State_ManyReady: Int = 2
private const val State_Failed: Int = 5
private const val State_Done: Int = 4
private const val State_Ready: Int = 3
private const val State_ManyNotReady: Int = 1
private const val State_NotReady: Int = 0

@SinceKotlin(version = "1.3")
public fun <T> iterator(block: (SequenceScope<Any>, Continuation<Unit>) -> Any?): Iterator<Any> {
   val iterator: SequenceBuilderIterator = SequenceBuilderIterator()
   iterator.nextStep = IntrinsicsKt.createCoroutineUnintercepted(block, iterator, iterator)
   return iterator
}

open fun SequencesKt__SequenceBuilderKt() {
}

@SinceKotlin(version = "1.3")
public fun <T> sequence(block: (SequenceScope<Any>, Continuation<Unit>) -> Any?): Sequence<Any> {
   return SequencesKt__SequenceBuilderKt$sequence$$inlined$Sequence$1(block)
}
