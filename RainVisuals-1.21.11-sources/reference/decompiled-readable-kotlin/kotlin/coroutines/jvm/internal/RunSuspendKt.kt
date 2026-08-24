package kotlin.coroutines.jvm.internal

import kotlin.coroutines.Continuation
import kotlin.coroutines.ContinuationKt

// $VF: Compiled from RunSuspend.kt
@SinceKotlin(version = "1.3")
internal fun runSuspend(block: (Continuation<Unit>) -> Any?) {
   val run: RunSuspend = RunSuspend()
   ContinuationKt.startCoroutine(block, run)
   run.await()
}
