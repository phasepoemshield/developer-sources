package kotlinx.serialization.internal

import java.util.ArrayList
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.ConcurrentMap
import kotlin.reflect.KType
import kotlinx.serialization.KSerializer

// $VF: Compiled from Caching.kt
private class ParametrizedCacheEntry<T> {
   private final val serializers: ConcurrentHashMap<List<KTypeWrapper>, Result<KSerializer<Any>?>> = ConcurrentHashMap()

   public inline fun computeIfAbsent(types: List<KType>, producer: () -> KSerializer<Any>?): Result<KSerializer<Any>?> {
      val `$i$f$getOrPut`: java.lang.Iterable = types
      val var8: java.util.Collection = ArrayList(CollectionsKt.collectionSizeOrDefault(types, 10))

      for (`default$iv` in `$i$f$getOrPut`) {
         var8.add(KTypeWrapper(`default$iv` as KType))
      }

      val wrappedTypes: java.util.List = var8 as java.util.List
      val var16: ConcurrentMap = access$getSerializers$p(this)
      var var10000: Any = var16.get(wrappedTypes)
      if (var10000 == null) {
         var var19: Any
         try {
            var19 = Result.constructor_impl/* $VF was: constructor-impl */(producer() as KSerializer)
         } catch (var15: java.lang.Throwable) {
            var19 = Result.constructor_impl/* $VF was: constructor-impl */(ResultKt.createFailure(var15))
         }

         val var21: Result = Result.box_impl/* $VF was: box-impl */(var19)
         var10000 = var16.putIfAbsent(wrappedTypes, var21)
         if (var10000 == null) {
            var10000 = var21
         }
      }

      return (var10000 as Result).unbox_impl/* $VF was: unbox-impl */()
   }
}
