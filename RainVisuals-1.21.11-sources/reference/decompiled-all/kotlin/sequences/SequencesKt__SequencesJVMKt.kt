@file:JvmMultifileClass
@file:JvmName("SequencesKt")

package kotlin.sequences

import java.util.Enumeration
import kotlin.internal.InlineOnly

// $VF: Compiled from SequencesJVM.kt
open fun SequencesKt__SequencesJVMKt() {
}

@InlineOnly
public inline fun <T> Enumeration<Any>.asSequence(): Sequence<Any> {
   return SequencesKt.asSequence(CollectionsKt.iterator(`$this$asSequence`))
}
