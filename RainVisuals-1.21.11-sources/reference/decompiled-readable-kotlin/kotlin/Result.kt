package kotlin

import java.io.Serializable
import kotlin.internal.InlineOnly
import org.jetbrains.annotations.NotNull

// $VF: Compiled from Result.kt
@JvmInline
@SinceKotlin(version = "1.3")
public value class Result<T> : Serializable {
   @PublishedApi
   internal final val value: Any?

   override fun hashCode(): Int {
      hashCode_impl/* $VF was: hashCode-impl */(this.value)
   }

   override fun toString(): java.lang.String {
      toString_impl/* $VF was: toString-impl */(this.value)
   }

   public final val isFailure: Boolean
      public final get() {
         return arg0 is Result.Failure
      }


   @JvmStatic
   public open operator fun equals(other: Any?): Boolean {
      return other is Result && arg0 == (other as Result).unbox_impl/* $VF was: unbox-impl */()
   }

   @JvmStatic
   public open fun toString(): String {
      return if (arg0 is Result.Failure) (arg0 as Result.Failure).toString() else "Success($arg0)"
   }

   override fun equals(other: Any): Boolean {
      equals_impl/* $VF was: equals-impl */(this.value, other)
   }

   @JvmStatic
   fun `equals-impl0`(p2: Any, p1: Any): Boolean {
      p1 == p2
   }

   @JvmStatic
   public open fun hashCode(): Int {
      return if (arg0 == null) 0 else arg0.hashCode()
   }

   @InlineOnly
   @JvmStatic
   public inline fun getOrNull(): Any? {
      return (T)(if (isFailure) null else arg0)
   }

   @JvmStatic
   public fun exceptionOrNull(): Throwable? {
      return if (arg0 is Result.Failure) (arg0 as Result.Failure).exception else null
   }

   @PublishedApi
   @JvmStatic
   fun <T> `constructor-impl`(value: Any?) {
      value
   }

   public final val isSuccess: Boolean
      public final get() {
         return arg0 !is Result.Failure
      }


   // $VF: Compiled from Result.kt
   public companion object {
      @JvmName(name = "success")
      @InlineOnly
      public inline fun <T> success(value: Any): Result<Any> {
         return Result.constructor_impl/* $VF was: constructor-impl */(value)
      }

      @InlineOnly
      @JvmName(name = "failure")
      public inline fun <T> failure(exception: Throwable): Result<Any> {
         return Result.constructor_impl/* $VF was: constructor-impl */(ResultKt.createFailure(exception))
      }
   }

   // $VF: Compiled from Result.kt
   internal class Failure(exception: Throwable) : Serializable {
      @NotNull
      @JvmField
      public final val exception: Throwable

      init {
         this.exception = exception
      }

      public override operator fun equals(other: Any?): Boolean {
         return other is Result.Failure && this.exception == (other as Result.Failure).exception
      }

      public override fun hashCode(): Int {
         return this.exception.hashCode()
      }

      public override fun toString(): String {
         return "Failure(${this.exception})"
      }
   }
}
