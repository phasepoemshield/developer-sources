package kotlin

import kotlin.coroutines.Continuation

// $VF: Compiled from DeepRecursive.kt
@SinceKotlin(version = "1.7")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
public class DeepRecursiveFunction<T, R>(block: (DeepRecursiveScope<Any, Any>, Any, Continuation<Any>) -> Any?) {
   internal final val block: (DeepRecursiveScope<Any, Any>, Any, Continuation<Any>) -> Any?

   init {
      this.block = block
   }
}
