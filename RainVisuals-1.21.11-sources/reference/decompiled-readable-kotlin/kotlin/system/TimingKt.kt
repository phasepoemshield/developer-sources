@file:JvmName(name = "TimingKt")

package kotlin.system

import kotlin.contracts.InvocationKind

// $VF: Compiled from Timing.kt
public inline fun measureTimeMillis(block: () -> Unit): Long {
   contract {
      callsInPlace(block, InvocationKind.EXACTLY_ONCE)
   }

   val start: Long = System.currentTimeMillis()
   block()
   return System.currentTimeMillis() - start
}

public inline fun measureNanoTime(block: () -> Unit): Long {
   contract {
      callsInPlace(block, InvocationKind.EXACTLY_ONCE)
   }

   val start: Long = System.nanoTime()
   block()
   return System.nanoTime() - start
}
