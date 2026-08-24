@file:JvmMultifileClass
@file:JvmName("PreconditionsKt")

package kotlin

import kotlin.internal.InlineOnly

// $VF: Compiled from Preconditions.kt
@InlineOnly
public inline fun require(value: Boolean) {
   contract {
      returns() implies (value)
   }

   if (!value) {
      throw IllegalArgumentException("Failed requirement.".toString())
   }
}

@InlineOnly
public inline fun check(value: Boolean) {
   contract {
      returns() implies (value)
   }

   if (!value) {
      throw IllegalStateException("Check failed.".toString())
   }
}

@InlineOnly
public inline fun error(message: Any): Nothing {
   throw IllegalStateException(message.toString())
}

@InlineOnly
public inline fun check(value: Boolean, lazyMessage: () -> Any) {
   contract {
      returns() implies (value)
   }

   if (!value) {
      throw IllegalStateException(lazyMessage().toString())
   }
}

@InlineOnly
public inline fun <T : Any> checkNotNull(value: Any?, lazyMessage: () -> Any): Any {
   contract {
      returns() implies (value != null)
   }

   if (value == null) {
      throw IllegalStateException(lazyMessage().toString())
   } else {
      return (T)value
   }
}

@InlineOnly
public inline fun <T : Any> checkNotNull(value: Any?): Any {
   contract {
      returns() implies (value != null)
   }

   if (value == null) {
      throw IllegalStateException("Required value was null.".toString())
   } else {
      return (T)value
   }
}

open fun PreconditionsKt__PreconditionsKt() {
}

@InlineOnly
public inline fun require(value: Boolean, lazyMessage: () -> Any) {
   contract {
      returns() implies (value)
   }

   if (!value) {
      throw IllegalArgumentException(lazyMessage().toString())
   }
}

@InlineOnly
public inline fun <T : Any> requireNotNull(value: Any?): Any {
   contract {
      returns() implies (value != null)
   }

   if (value == null) {
      throw IllegalArgumentException("Required value was null.".toString())
   } else {
      return (T)value
   }
}

@InlineOnly
public inline fun <T : Any> requireNotNull(value: Any?, lazyMessage: () -> Any): Any {
   contract {
      returns() implies (value != null)
   }

   if (value == null) {
      throw IllegalArgumentException(lazyMessage().toString())
   } else {
      return (T)value
   }
}
