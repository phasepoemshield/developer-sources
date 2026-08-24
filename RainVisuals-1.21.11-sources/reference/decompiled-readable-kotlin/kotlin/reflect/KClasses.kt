@file:JvmName(name = "KClasses")

package kotlin.reflect

import kotlin.internal.LowPriorityInOverloadResolution

// $VF: Compiled from KClasses.kt
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@LowPriorityInOverloadResolution
@SinceKotlin(version = "1.4")
public fun <T : Any> KClass<Any>.safeCast(value: Any?): Any? {
   val var10000: Any
   if (`$this$safeCast`.isInstance(value)) {
      var10000 = value
   } else {
      var10000 = null
   }

   return (T)var10000
}

@SinceKotlin(version = "1.4")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@LowPriorityInOverloadResolution
public fun <T : Any> KClass<Any>.cast(value: Any?): Any {
   if (!`$this$cast`.isInstance(value)) {
      throw ClassCastException("Value cannot be cast to ${`$this$cast`.qualifiedName}")
   } else {
      return (T)value
   }
}
