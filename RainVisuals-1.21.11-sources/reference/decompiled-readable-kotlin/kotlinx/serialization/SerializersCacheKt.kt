package kotlinx.serialization

import kotlin.reflect.KClass
import kotlin.reflect.KClassifier
import kotlin.reflect.KType
import kotlinx.serialization.internal.CachingKt
import kotlinx.serialization.internal.ParametrizedSerializerCache
import kotlinx.serialization.internal.SerializerCache
import kotlinx.serialization.modules.SerializersModuleBuildersKt
import org.jetbrains.annotations.NotNull

// $VF: Compiled from SerializersCache.kt
@NotNull
private final val PARAMETRIZED_SERIALIZERS_CACHE: ParametrizedSerializerCache<out Any> = CachingKt.createParametrizedCache({ clazz, types ->
   val var10000: java.util.List = SerializersKt.serializersForParameters(SerializersModuleBuildersKt.EmptySerializersModule(), types, true)
   SerializersKt.parametrizedSerializerOrNull(clazz, var10000,    // $VF: Compiled from SerializersCache.kt
{
      (<unrepresentable>.super.$types.get(0) as KType).classifier
   } as () -> KClassifier)
})

@NotNull
private final val PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE: ParametrizedSerializerCache<Any?> = CachingKt.createParametrizedCache({ clazz, types ->
   val var10000: java.util.List = SerializersKt.serializersForParameters(SerializersModuleBuildersKt.EmptySerializersModule(), types, true)
   val var6: KSerializer = SerializersKt.parametrizedSerializerOrNull(clazz, var10000,    // $VF: Compiled from SerializersCache.kt
{
      (<unrepresentable>.super.$types.get(0) as KType).classifier
   } as () -> KClassifier)
   if (var6 != null) {
      val var7: KSerializer = nullable
      if (var7 != null) {
         var7
      }
   }

   null
})

@NotNull
private final val SERIALIZERS_CACHE_NULLABLE: SerializerCache<Any?> = CachingKt.createCache({ it ->
   var var10000: KSerializer = SerializersKt.serializerOrNull(it)
   if (var10000 != null) {
      var10000 = nullable
      if (var10000 != null) {
         var10000
      }
   }

   null
})

@NotNull
private final val SERIALIZERS_CACHE: SerializerCache<out Any> = CachingKt.createCache({ it ->
   SerializersKt.serializerOrNull(it)
})

internal fun findParametrizedCachedSerializer(clazz: KClass<Any>, types: List<KType>, isNullable: Boolean): Result<KSerializer<Any?>?> {
   return if (!isNullable)
      PARAMETRIZED_SERIALIZERS_CACHE.get_gIAlu_s/* $VF was: get-gIAlu-s */(clazz, types)
      else
      PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE.get_gIAlu_s/* $VF was: get-gIAlu-s */(clazz, types)
   }

internal fun findCachedSerializer(clazz: KClass<Any>, isNullable: Boolean): KSerializer<Any?>? {
   var var4: KSerializer
   if (!isNullable) {
      var4 = SERIALIZERS_CACHE.get(clazz)
      var4 = var4 ?: null
   } else {
      var4 = SERIALIZERS_CACHE_NULLABLE.get(clazz)
   }

   return var4
}
