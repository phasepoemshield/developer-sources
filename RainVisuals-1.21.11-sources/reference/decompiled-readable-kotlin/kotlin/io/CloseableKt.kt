@file:JvmName(name = "CloseableKt")

package kotlin.io

import java.io.Closeable
import kotlin.contracts.InvocationKind
import kotlin.internal.InlineOnly
import kotlin.internal.PlatformImplementationsKt
import kotlin.jvm.internal.InlineMarker

// $VF: Compiled from Closeable.kt
@InlineOnly
public inline fun <T : Closeable?, R> Any.use(block: (Any) -> Any): Any {
   contract {
      callsInPlace(block, InvocationKind.EXACTLY_ONCE)
   }

   var exception: java.lang.Throwable = null

   var e: Any
   try {
      val var12: Boolean = true
      e = block(`$this$use`)
   } catch (var10: java.lang.Throwable) {
      exception = var10
      throw var10
   } finally {
      if (var8) {
         InlineMarker.finallyStart(1)
         if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0)) {
            closeFinally(`$this$use`, exception)
         } else if (`$this$use` != null) {
            if (exception == null) {
               `$this$use`.close()
            } else {
               try {
                  `$this$use`.close()
               } catch (var9: java.lang.Throwable) {
               }
            }
         }

         InlineMarker.finallyEnd(1)
      }
   }

   InlineMarker.finallyStart(1)
   if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0)) {
      closeFinally(`$this$use`, null)
   } else if (`$this$use` != null) {
      `$this$use`.close()
   }

   InlineMarker.finallyEnd(1)
   return (R)e
   val var8: Boolean
}

@PublishedApi
@SinceKotlin(version = "1.1")
internal fun Closeable?.closeFinally(cause: Throwable?) {
   if (`$this$closeFinally` != null) {
      if (cause == null) {
         `$this$closeFinally`.close()
      } else {
         try {
            `$this$closeFinally`.close()
         } catch (var3: java.lang.Throwable) {
            kotlin.ExceptionsKt.addSuppressed(cause, var3)
         }
      }
   }
}
