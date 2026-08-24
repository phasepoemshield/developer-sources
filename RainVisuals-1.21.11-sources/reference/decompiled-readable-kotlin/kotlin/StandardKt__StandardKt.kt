@file:JvmMultifileClass
@file:JvmName("StandardKt")

package kotlin

import kotlin.contracts.InvocationKind
import kotlin.internal.InlineOnly

// $VF: Compiled from Standard.kt
@InlineOnly
public inline fun <T> Any.apply(block: (Any) -> Unit): Any {
   contract {
      callsInPlace(block, InvocationKind.EXACTLY_ONCE)
   }

   block(`$this$apply`)
   return (T)`$this$apply`
}

@InlineOnly
public inline fun TODO(reason: String): Nothing {
   throw NotImplementedError("An operation is not implemented: $reason")
}

@InlineOnly
public inline fun <T, R> Any.let(block: (Any) -> Any): Any {
   contract {
      callsInPlace(block, InvocationKind.EXACTLY_ONCE)
   }

   return (R)block(`$this$let`)
}

open fun StandardKt__StandardKt() {
}

@InlineOnly
public inline fun repeat(times: Int, action: (Int) -> Unit) {
   contract {
      callsInPlace(action)
   }

   repeat(times) { index ->
      action(index)
   }
}

@InlineOnly
public inline fun TODO(): Nothing {
   throw NotImplementedError(null, 1, null)
}

@InlineOnly
public inline fun <T, R> with(receiver: Any, block: (Any) -> Any): Any {
   contract {
      callsInPlace(block, InvocationKind.EXACTLY_ONCE)
   }

   return (R)block(receiver)
}

@InlineOnly
public inline fun <R> run(block: () -> Any): Any {
   contract {
      callsInPlace(block, InvocationKind.EXACTLY_ONCE)
   }

   return (R)block()
}

@InlineOnly
@SinceKotlin(version = "1.1")
public inline fun <T> Any.also(block: (Any) -> Unit): Any {
   contract {
      callsInPlace(block, InvocationKind.EXACTLY_ONCE)
   }

   block(`$this$also`)
   return (T)`$this$also`
}

@InlineOnly
public inline fun <T, R> Any.run(block: (Any) -> Any): Any {
   contract {
      callsInPlace(block, InvocationKind.EXACTLY_ONCE)
   }

   return (R)block(`$this$run`)
}

@InlineOnly
@SinceKotlin(version = "1.1")
public inline fun <T> Any.takeUnless(predicate: (Any) -> Boolean): Any? {
   contract {
      callsInPlace(predicate, InvocationKind.EXACTLY_ONCE)
   }

   return (T)(if (!predicate(`$this$takeUnless`)) `$this$takeUnless` else null)
}

@InlineOnly
@SinceKotlin(version = "1.1")
public inline fun <T> Any.takeIf(predicate: (Any) -> Boolean): Any? {
   contract {
      callsInPlace(predicate, InvocationKind.EXACTLY_ONCE)
   }

   return (T)(if (predicate(`$this$takeIf`)) `$this$takeIf` else null)
}
