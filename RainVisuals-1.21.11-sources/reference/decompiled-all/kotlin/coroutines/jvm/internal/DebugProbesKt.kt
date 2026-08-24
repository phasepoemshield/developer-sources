package kotlin.coroutines.jvm.internal

import kotlin.coroutines.Continuation

// $VF: Compiled from DebugProbes.kt
@SinceKotlin(version = "1.3")
internal fun <T> probeCoroutineCreated(completion: Continuation<Any>): Continuation<Any> {
   return completion
}

@SinceKotlin(version = "1.3")
internal fun probeCoroutineResumed(frame: Continuation<*>) {
}

@SinceKotlin(version = "1.3")
internal fun probeCoroutineSuspended(frame: Continuation<*>) {
}
