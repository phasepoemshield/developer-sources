package kotlinx.serialization.internal

import kotlin.reflect.KClass
import kotlin.reflect.KType
import kotlinx.serialization.KSerializer

// $VF: Compiled from Caching.kt
private final val useClassValue: Boolean

internal fun <T> createCache(factory: (KClass<*>) -> KSerializer<Any>?): SerializerCache<Any> {
   return if (useClassValue) ClassValueCache(factory) else ConcurrentHashMapCache(factory)
}

internal fun <T> createParametrizedCache(factory: (KClass<Any>, List<KType>) -> KSerializer<Any>?): ParametrizedSerializerCache<Any> {
   return if (useClassValue) ClassValueParametrizedCache(factory) else ConcurrentHashMapParametrizedCache(factory)
}

fun {
   var var0: Boolean
   try {
      Class.forName("java.lang.ClassValue")
      var0 = true
   } catch (var2: java.lang.Throwable) {
      var0 = false
   }

   useClassValue = var0
}
