package kotlinx.serialization.internal

import java.util.ArrayList
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.ConcurrentMap
import kotlin.reflect.KClass
import kotlin.reflect.KType
import kotlinx.serialization.KSerializer

// $VF: Compiled from Caching.kt
private class ConcurrentHashMapParametrizedCache<T>(compute: (KClass<Any>, List<KType>) -> KSerializer<Any>?) : ParametrizedSerializerCache<T> {
   private final val cache: ConcurrentHashMap<Class<*>, ParametrizedCacheEntry<Any>>
   private final val compute: (KClass<Any>, List<KType>) -> KSerializer<Any>?

   public override fun get(key: KClass<Any>, types: List<KType>): Result<KSerializer<Any>?> {
      val `this_$iv`: ConcurrentMap = this.cache
      val var4: Any = java
      var var10000: Any = `this_$iv`.get(var4)
      if (var10000 == null) {
         val `$i$f$getOrPut`: ParametrizedCacheEntry = ParametrizedCacheEntry()
         var10000 = `this_$iv`.putIfAbsent(var4, `$i$f$getOrPut`)
         if (var10000 == null) {
            var10000 = `$i$f$getOrPut`
         }
      }

      val var18: ParametrizedCacheEntry = var10000 as ParametrizedCacheEntry
      val var23: java.lang.Iterable = types
      val var25: java.util.Collection = ArrayList(CollectionsKt.collectionSizeOrDefault(types, 10))

      for (`default$iv$iv` in var23) {
         var25.add(KTypeWrapper(`default$iv$iv` as KType))
      }

      val `wrappedTypes$iv`: java.util.List = var25 as java.util.List
      val var22: ConcurrentMap = ParametrizedCacheEntry.access$getSerializers$p(var18)
      var10000 = var22.get(`wrappedTypes$iv`)
      if (var10000 == null) {
         var var27: Any
         try {
            var27 = Result.constructor_impl/* $VF was: constructor-impl */(this.compute(key, types))
         } catch (var17: java.lang.Throwable) {
            var27 = Result.constructor_impl/* $VF was: constructor-impl */(ResultKt.createFailure(var17))
         }

         val var29: Result = Result.box_impl/* $VF was: box-impl */(var27)
         var10000 = var22.putIfAbsent(`wrappedTypes$iv`, var29)
         if (var10000 == null) {
            var10000 = var29
         }
      }

      return (var10000 as Result).unbox_impl/* $VF was: unbox-impl */()
   }

   init {
      this.compute = compute
      this.cache = ConcurrentHashMap<>()
   }
}
