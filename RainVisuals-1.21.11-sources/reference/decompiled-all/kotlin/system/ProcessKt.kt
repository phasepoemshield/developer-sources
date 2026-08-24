@file:JvmName(name = "ProcessKt")

package kotlin.system

import kotlin.internal.InlineOnly

// $VF: Compiled from Process.kt
@InlineOnly
public inline fun exitProcess(status: Int): Nothing {
   System.exit(status)
   throw RuntimeException("System.exit returned normally, while it was supposed to halt JVM.")
}
