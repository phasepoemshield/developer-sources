@file:JvmMultifileClass
@file:JvmName("StandardKt")

package kotlin

import kotlin.contracts.InvocationKind
import kotlin.internal.InlineOnly
import kotlin.jvm.internal.InlineMarker

// $VF: Compiled from Synchronized.kt
@InlineOnly
public inline fun <R> synchronized(lock: Any, block: () -> Any): Any {
   contract {
      callsInPlace(block, InvocationKind.EXACTLY_ONCE)
   }

   synchronized (lock) {
      val var3: Any = block()
      InlineMarker.finallyStart(1)
      InlineMarker.finallyEnd(1)
      return (R)var3
   }
}

open fun StandardKt__SynchronizedKt() {
}
