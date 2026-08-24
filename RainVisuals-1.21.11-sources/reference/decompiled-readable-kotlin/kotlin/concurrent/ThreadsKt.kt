@file:JvmName(name = "ThreadsKt")

package kotlin.concurrent

import kotlin.internal.InlineOnly

// $VF: Compiled from Thread.kt
public fun thread(
   start: Boolean = true,
   isDaemon: Boolean = false,
   contextClassLoader: ClassLoader? = null,
   name: String? = null,
   priority: Int = -1,
   block: () -> Unit
): Thread {
   val thread: <unrepresentable> =    // $VF: Compiled from Thread.kt
object : Thread {
      public override fun run() {
         block()
      }
   }
   if (isDaemon) {
      thread.setDaemon(true)
   }

   if (priority > 0) {
      thread.setPriority(priority)
   }

   if (name != null) {
      thread.setName(name)
   }

   if (contextClassLoader != null) {
      thread.setContextClassLoader(contextClassLoader)
   }

   if (start) {
      thread.start()
   }

   return thread
}

@InlineOnly
public inline fun <T : Any> ThreadLocal<Any>.getOrSet(default: () -> Any): Any {
   val var2: Any = `$this$getOrSet`.get()
   val var10000: Any
   if (var2 == null) {
      val var3: Any = `$this$getOrSet1`()
      `$this$getOrSet`.set(var3)
      var10000 = var3
   } else {
      var10000 = var2
   }

   return (T)var10000
}
