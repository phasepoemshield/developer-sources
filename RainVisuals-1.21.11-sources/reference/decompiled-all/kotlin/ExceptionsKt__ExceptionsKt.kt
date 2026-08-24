@file:JvmMultifileClass
@file:JvmName("ExceptionsKt")

package kotlin

import java.io.PrintStream
import java.io.PrintWriter
import java.io.StringWriter
import kotlin.internal.HidesMembers
import kotlin.internal.InlineOnly
import kotlin.internal.PlatformImplementationsKt

// $VF: Compiled from Exceptions.kt
open fun ExceptionsKt__ExceptionsKt() {
}

public final val stackTrace: Array<StackTraceElement>
   public final get() {
      val var10000: Array<StackTraceElement> = `$this$stackTrace`.getStackTrace()
      return var10000
   }


@InlineOnly
public inline fun Throwable.printStackTrace(writer: PrintWriter) {
   `$this$printStackTrace`.printStackTrace(writer)
}

@SinceKotlin(version = "1.4")
public fun Throwable.stackTraceToString(): String {
   val sw: StringWriter = StringWriter()
   val pw: PrintWriter = PrintWriter(sw)
   `$this$stackTraceToString`.printStackTrace(pw)
   pw.flush()
   val var10000: java.lang.String = sw.toString()
   return var10000
}

@HidesMembers
@SinceKotlin(version = "1.1")
public fun Throwable.addSuppressed(exception: Throwable) {
   if (`$this$addSuppressed` != exception) {
      PlatformImplementationsKt.IMPLEMENTATIONS.addSuppressed(`$this$addSuppressed`, exception)
   }
}

@InlineOnly
public inline fun Throwable.printStackTrace(stream: PrintStream) {
   `$this$printStackTrace`.printStackTrace(stream)
}

@InlineOnly
public inline fun Throwable.printStackTrace() {
   `$this$printStackTrace`.printStackTrace()
}

@SinceKotlin(version = "1.4")
public final val suppressedExceptions: List<Throwable>
   public final get() {
      return PlatformImplementationsKt.IMPLEMENTATIONS.getSuppressed(`$this$suppressedExceptions`)
   }

