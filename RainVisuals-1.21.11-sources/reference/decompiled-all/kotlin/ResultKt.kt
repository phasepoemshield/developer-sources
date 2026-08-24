package kotlin

import kotlin.contracts.InvocationKind
import kotlin.internal.InlineOnly

// $VF: Compiled from Result.kt
@SinceKotlin(version = "1.3")
@InlineOnly
public inline fun <R, T> Result<Any>.fold(onSuccess: (Any) -> Any, onFailure: (Throwable) -> Any): Any {
   contract {
      callsInPlace(onSuccess, InvocationKind.AT_MOST_ONCE)
      callsInPlace(onFailure, InvocationKind.AT_MOST_ONCE)
   }

   val exception: java.lang.Throwable = Result.exceptionOrNull_impl/* $VF was: exceptionOrNull-impl */(`$this$fold`)
   return (R)(if (exception == null) onSuccess(`$this$fold`) else onFailure(exception))
}

@SinceKotlin(version = "1.3")
@InlineOnly
public inline fun <R, T : Any> Result<Any>.recover(transform: (Throwable) -> Any): Result<Any> {
   contract {
      callsInPlace(transform, InvocationKind.AT_MOST_ONCE)
   }

   val exception: java.lang.Throwable = Result.exceptionOrNull_impl/* $VF was: exceptionOrNull-impl */(`$this$recover`)
   return if (exception == null) `$this$recover` else Result.constructor_impl/* $VF was: constructor-impl */(transform(exception))
}

@SinceKotlin(version = "1.3")
@InlineOnly
public inline fun <T> Result<Any>.onSuccess(action: (Any) -> Unit): Result<Any> {
   contract {
      callsInPlace(action, InvocationKind.AT_MOST_ONCE)
   }

   if (isSuccess) {
      action(`$this$onSuccess`)
   }

   return `$this$onSuccess`
}

@InlineOnly
@SinceKotlin(version = "1.3")
public inline fun <R, T : Any> Result<Any>.recoverCatching(transform: (Throwable) -> Any): Result<Any> {
   val exception: java.lang.Throwable = Result.exceptionOrNull_impl/* $VF was: exceptionOrNull-impl */(`$this$recoverCatching`)
   val var10000: Any
   if (exception == null) {
      var10000 = `$this$recoverCatching`
   } else {
      var `$this$recoverCatching_u24lambda_u245`: Any
      try {
         `$this$recoverCatching_u24lambda_u245` = Result.constructor_impl/* $VF was: constructor-impl */(transform(exception))
      } catch (var6: java.lang.Throwable) {
         `$this$recoverCatching_u24lambda_u245` = Result.constructor_impl/* $VF was: constructor-impl */(createFailure(var6))
      }

      var10000 = `$this$recoverCatching_u24lambda_u245`
   }

   return var10000
}

@PublishedApi
@SinceKotlin(version = "1.3")
internal fun Result<*>.throwOnFailure() {
   if (`$this$throwOnFailure` is Result.Failure) {
      throw (`$this$throwOnFailure` as Result.Failure).exception
   }
}

@InlineOnly
@SinceKotlin(version = "1.3")
public inline fun <R, T : Any> Result<Any>.getOrDefault(defaultValue: Any): Any {
   return (R)(if (isFailure) defaultValue else `$this$getOrDefault`)
}

@SinceKotlin(version = "1.3")
@InlineOnly
public inline fun <R, T> Result<Any>.mapCatching(transform: (Any) -> Any): Result<Any> {
   val var10000: Any
   if (isSuccess) {
      val var2: Any = `$this$mapCatching`

      var `$this$mapCatching_u24lambda_u243`: Any
      try {
         `$this$mapCatching_u24lambda_u243` = Result.constructor_impl/* $VF was: constructor-impl */(transform(var2))
      } catch (var5: java.lang.Throwable) {
         `$this$mapCatching_u24lambda_u243` = Result.constructor_impl/* $VF was: constructor-impl */(createFailure(var5))
      }

      var10000 = `$this$mapCatching_u24lambda_u243`
   } else {
      var10000 = Result.constructor_impl/* $VF was: constructor-impl */(`$this$mapCatching`)
   }

   return var10000
}

@SinceKotlin(version = "1.3")
@InlineOnly
public inline fun <R> runCatching(block: () -> Any): Result<Any> {
   var var1: Any
   try {
      var1 = Result.constructor_impl/* $VF was: constructor-impl */(block())
   } catch (var3: java.lang.Throwable) {
      var1 = Result.constructor_impl/* $VF was: constructor-impl */(createFailure(var3))
   }

   return var1
}

@InlineOnly
@SinceKotlin(version = "1.3")
public inline fun <T> Result<Any>.getOrThrow(): Any {
   throwOnFailure(`$this$getOrThrow`)
   return (T)`$this$getOrThrow`
}

@SinceKotlin(version = "1.3")
@InlineOnly
public inline fun <R, T> Result<Any>.map(transform: (Any) -> Any): Result<Any> {
   contract {
      callsInPlace(transform, InvocationKind.AT_MOST_ONCE)
   }

   return if (isSuccess)
      Result.constructor_impl/* $VF was: constructor-impl */(transform(`$this$map`))
      else
      Result.constructor_impl/* $VF was: constructor-impl */(`$this$map`)
   }

@InlineOnly
@SinceKotlin(version = "1.3")
public inline fun <T, R> Any.runCatching(block: (Any) -> Any): Result<Any> {
   var var2: Any
   try {
      var2 = Result.constructor_impl/* $VF was: constructor-impl */(block(`$this$runCatching`))
   } catch (var4: java.lang.Throwable) {
      var2 = Result.constructor_impl/* $VF was: constructor-impl */(createFailure(var4))
   }

   return var2
}

@InlineOnly
@SinceKotlin(version = "1.3")
public inline fun <R, T : Any> Result<Any>.getOrElse(onFailure: (Throwable) -> Any): Any {
   contract {
      callsInPlace(onFailure, InvocationKind.AT_MOST_ONCE)
   }

   val exception: java.lang.Throwable = Result.exceptionOrNull_impl/* $VF was: exceptionOrNull-impl */(`$this$getOrElse`)
   return (R)(if (exception == null) `$this$getOrElse` else onFailure(exception))
}

@SinceKotlin(version = "1.3")
@InlineOnly
public inline fun <T> Result<Any>.onFailure(action: (Throwable) -> Unit): Result<Any> {
   contract {
      callsInPlace(action, InvocationKind.AT_MOST_ONCE)
   }

   val var10000: java.lang.Throwable = Result.exceptionOrNull_impl/* $VF was: exceptionOrNull-impl */(`$this$onFailure`)
   if (var10000 != null) {
      action(var10000)
   }

   return `$this$onFailure`
}

@SinceKotlin(version = "1.3")
@PublishedApi
internal fun createFailure(exception: Throwable): Any {
   return Result.Failure(exception)
}
