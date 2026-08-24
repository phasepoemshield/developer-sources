package kotlinx.serialization.internal

import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.ConcurrentMap
import kotlin.reflect.KClass
import kotlinx.serialization.KSerializer

// $VF: Compiled from Caching.kt
private class ConcurrentHashMapCache<T>(compute: (KClass<*>) -> KSerializer<Any>?) : SerializerCache<T> {
   private final val compute: (KClass<*>) -> KSerializer<Any>?
   private final val cache: ConcurrentHashMap<Class<*>, CacheEntry<Any>>

   init {
      this.compute = compute
      this.cache = ConcurrentHashMap<>()
   }

   public override fun get(key: KClass<Any>): KSerializer<Any>? {
      val `$this$getOrPut$iv`: ConcurrentMap = this.cache
      val `key$iv`: Any = java
      var var10000: Any = `$this$getOrPut$iv`.get(`key$iv`)
      if (var10000 == null) {
         val `default$iv`: CacheEntry = CacheEntry<>(this.compute(key))
         var10000 = `$this$getOrPut$iv`.putIfAbsent(`key$iv`, `default$iv`)
         if (var10000 == null) {
            var10000 = `default$iv`
         }
      }

      return (var10000 as CacheEntry).serializer
   }
}
