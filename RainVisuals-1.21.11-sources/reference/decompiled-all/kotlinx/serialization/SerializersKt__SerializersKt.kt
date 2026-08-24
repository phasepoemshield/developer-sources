@file:JvmMultifileClass
@file:JvmName("SerializersKt")

package kotlinx.serialization

import java.util.ArrayList
import java.util.Arrays
import java.util.HashMap
import java.util.HashSet
import java.util.LinkedHashMap
import java.util.LinkedHashSet
import java.util.Map.Entry
import kotlin.reflect.KClass
import kotlin.reflect.KClassifier
import kotlin.reflect.KType
import kotlin.reflect.KTypeProjection
import kotlinx.serialization.builtins.BuiltinSerializersKt
import kotlinx.serialization.internal.ArrayListSerializer
import kotlinx.serialization.internal.HashMapSerializer
import kotlinx.serialization.internal.HashSetSerializer
import kotlinx.serialization.internal.LinkedHashMapSerializer
import kotlinx.serialization.internal.LinkedHashSetSerializer
import kotlinx.serialization.internal.PlatformKt
import kotlinx.serialization.internal.Platform_commonKt
import kotlinx.serialization.internal.PrimitivesKt
import kotlinx.serialization.modules.SerializersModule
import kotlinx.serialization.modules.SerializersModuleBuildersKt

// $VF: Compiled from Serializers.kt
@ExperimentalSerializationApi
public fun serializer(kClass: KClass<*>, typeArgumentsSerializers: List<KSerializer<*>>, isNullable: Boolean): KSerializer<Any?> {
   return SerializersKt.serializer(SerializersModuleBuildersKt.EmptySerializersModule(), kClass, typeArgumentsSerializers, isNullable)
}

private fun <T : Any> KSerializer<Any>.nullable(shouldBeNullable: Boolean): KSerializer<Any?> {
   if (shouldBeNullable) {
      return nullable
   } else {
      return `$this$nullable`
   }
}

public fun serializer(type: KType): KSerializer<Any?> {
   return SerializersKt.serializer(SerializersModuleBuildersKt.EmptySerializersModule(), type)
}

internal fun KClass<Any>.parametrizedSerializerOrNull(serializers: List<KSerializer<Any?>>, elementClassifierIfArray: () -> KClassifier?): KSerializer<out Any>? {
   var var10000: KSerializer = builtinParametrizedSerializer$SerializersKt__SerializersKt(
      `$this$parametrizedSerializerOrNull`, serializers, elementClassifierIfArray
   )
   if (var10000 == null) {
      var10000 = compiledParametrizedSerializer$SerializersKt__SerializersKt(`$this$parametrizedSerializerOrNull`, serializers)
   }

   return var10000
}

public fun SerializersModule.serializerOrNull(type: KType): KSerializer<Any?>? {
   return serializerByKTypeImpl$SerializersKt__SerializersKt(`$this$serializerOrNull`, type, false)
}

internal fun SerializersModule.serializersForParameters(typeArguments: List<KType>, failOnMissingTypeArgSerializer: Boolean): List<KSerializer<Any?>>? {
   val var10000: java.util.List
   if (failOnMissingTypeArgSerializer) {
      val `$this$mapTo$iv$iv`: java.lang.Iterable = typeArguments
      val `destination$iv$iv`: java.util.Collection = ArrayList(CollectionsKt.collectionSizeOrDefault(typeArguments, 10))

      for (`item$iv$iv` in `$this$mapTo$iv$iv`) {
         `destination$iv$iv`.add(SerializersKt.serializer(`$this$serializersForParameters`, `item$iv$iv` as KType))
      }

      var10000 = `destination$iv$iv` as java.util.List
   } else {
      val var16: java.lang.Iterable = typeArguments
      val var17: java.util.Collection = ArrayList(CollectionsKt.collectionSizeOrDefault(typeArguments, 10))

      for (var20 in var16) {
         val var24: KSerializer = SerializersKt.serializerOrNull(`$this$serializersForParameters`, var20 as KType)
         if (var24 == null) {
            return null
         }

         var17.add(var24)
      }

      var10000 = var17 as java.util.List
   }

   return var10000
}

private fun SerializersModule.serializerByKTypeImpl(type: KType, failOnMissingTypeArgSerializer: Boolean): KSerializer<Any?>? {
   val rootClass: KClass = Platform_commonKt.kclass(type)
   val isNullable: Boolean = type.isMarkedNullable
   val cachedSerializer: java.lang.Iterable = type.arguments
   val `$this$cast$iv`: java.util.Collection = ArrayList(CollectionsKt.collectionSizeOrDefault(cachedSerializer, 10))

   for (`item$iv$iv` in cachedSerializer) {
      `$this$cast$iv`.add(Platform_commonKt.typeOrThrow(`item$iv$iv` as KTypeProjection))
   }

   val typeArguments: java.util.List = `$this$cast$iv` as java.util.List
   var var10000: KSerializer
   if ((`$this$cast$iv` as java.util.List).isEmpty()) {
      var10000 = SerializersCacheKt.findCachedSerializer(rootClass, isNullable)
   } else {
      val var17: Any = SerializersCacheKt.findParametrizedCachedSerializer(rootClass, typeArguments, isNullable)
      var10000 = (if (isFailure) null else var17) as KSerializer
   }

   if (var10000 != null) {
      return var10000
   } else {
      if (typeArguments.isEmpty()) {
         var10000 = SerializersModule.getContextual$default(`$this$serializerByKTypeImpl`, rootClass, null, 2, null)
      } else {
         val var25: java.util.List = SerializersKt.serializersForParameters(`$this$serializerByKTypeImpl`, typeArguments, failOnMissingTypeArgSerializer)
         if (var25 == null) {
            return null
         }

         var10000 = SerializersKt.parametrizedSerializerOrNull(rootClass, var25,          // $VF: Compiled from Serializers.kt
{
            return (typeArguments.get(0) as KType).classifier
         } as () -> KClassifier)
         if (var10000 == null) {
            var10000 = `$this$serializerByKTypeImpl`.getContextual(rootClass, var25)
         }
      }

      return if (var10000 != null) nullable$SerializersKt__SerializersKt(var10000, isNullable) else null
   }
}

public fun SerializersModule.serializer(type: KType): KSerializer<Any?> {
   val var10000: KSerializer = serializerByKTypeImpl$SerializersKt__SerializersKt(`$this$serializer`, type, true)
   if (var10000 == null) {
      PlatformKt.platformSpecificSerializerNotRegistered(Platform_commonKt.kclass(type))
      throw KotlinNothingValueException()
   } else {
      return var10000
   }
}

@InternalSerializationApi
public fun <T : Any> KClass<Any>.serializerOrNull(): KSerializer<Any>? {
   var var10000: KSerializer = PlatformKt.compiledSerializerImpl(`$this$serializerOrNull`)
   if (var10000 == null) {
      var10000 = PrimitivesKt.builtinSerializerOrNull(`$this$serializerOrNull`)
   }

   return var10000
}

@PublishedApi
internal fun noCompiledSerializer(module: SerializersModule, kClass: KClass<*>): KSerializer<*> {
   val var10000: KSerializer = SerializersModule.getContextual$default(module, kClass, null, 2, null)
   if (var10000 == null) {
      Platform_commonKt.serializerNotRegistered(kClass)
      throw KotlinNothingValueException()
   } else {
      return var10000
   }
}

@ExperimentalSerializationApi
public fun SerializersModule.serializer(kClass: KClass<*>, typeArgumentsSerializers: List<KSerializer<*>>, isNullable: Boolean): KSerializer<Any?> {
   val var10000: KSerializer = serializerByKClassImpl$SerializersKt__SerializersKt(`$this$serializer`, kClass, typeArgumentsSerializers, isNullable)
   if (var10000 == null) {
      PlatformKt.platformSpecificSerializerNotRegistered(kClass)
      throw KotlinNothingValueException()
   } else {
      return var10000
   }
}

private fun KClass<Any>.compiledParametrizedSerializer(serializers: List<KSerializer<Any?>>): KSerializer<out Any>? {
   val var2: Array<KSerializer> = serializers.toArray(arrayOfNulls(0))
   return PlatformKt.constructSerializerForGivenTypeArgs(`$this$compiledParametrizedSerializer`, Arrays.copyOf(var2, var2.length))
}

@InternalSerializationApi
public fun <T : Any> KClass<Any>.serializer(): KSerializer<Any> {
   val var10000: KSerializer = SerializersKt.serializerOrNull(`$this$serializer`)
   if (var10000 == null) {
      Platform_commonKt.serializerNotRegistered(`$this$serializer`)
      throw KotlinNothingValueException()
   } else {
      return var10000
   }
}

private fun SerializersModule.serializerByKClassImpl(rootClass: KClass<Any>, typeArgumentsSerializers: List<KSerializer<Any?>>, isNullable: Boolean): KSerializer<
      Any?
   >? {
   var var10000: KSerializer
   if (typeArgumentsSerializers.isEmpty()) {
      var10000 = SerializersKt.serializerOrNull(rootClass)
      if (var10000 == null) {
         var10000 = SerializersModule.getContextual$default(`$this$serializerByKClassImpl`, rootClass, null, 2, null)
      }
   } else {
      var var5: KSerializer
      try {
         var10000 = SerializersKt.parametrizedSerializerOrNull(rootClass, typeArgumentsSerializers, {
            throw SerializationException("It is not possible to retrieve an array serializer using KClass alone, use KType instead or ArraySerializer factory")
         })
         if (var10000 == null) {
            var10000 = `$this$serializerByKClassImpl`.getContextual(rootClass, typeArgumentsSerializers)
         }

         var5 = var10000
      } catch (var8: IndexOutOfBoundsException) {
         throw SerializationException(
            "Unable to retrieve a serializer, the number of passed type serializers differs from the actual number of generic parameters", var8
         )
      }

      var10000 = var5
   }

   return if (var10000 != null) nullable$SerializersKt__SerializersKt(var10000, isNullable) else null
}

@PublishedApi
internal fun noCompiledSerializer(module: SerializersModule, kClass: KClass<*>, argSerializers: Array<KSerializer<*>>): KSerializer<*> {
   val var10000: KSerializer = module.getContextual(kClass, ArraysKt.asList(argSerializers))
   if (var10000 == null) {
      Platform_commonKt.serializerNotRegistered(kClass)
      throw KotlinNothingValueException()
   } else {
      return var10000
   }
}

public fun serializerOrNull(type: KType): KSerializer<Any?>? {
   return SerializersKt.serializerOrNull(SerializersModuleBuildersKt.EmptySerializersModule(), type)
}

private fun KClass<Any>.builtinParametrizedSerializer(serializers: List<KSerializer<Any?>>, elementClassifierIfArray: () -> KClassifier?): KSerializer<out Any>? {
   val var10000: KSerializer
   if (`$this$builtinParametrizedSerializer` == java.util.Collection::class
      || `$this$builtinParametrizedSerializer` == java.util.List::class
      || `$this$builtinParametrizedSerializer` == java.util.List::class
      || `$this$builtinParametrizedSerializer` == ArrayList::class) {
      var10000 = ArrayListSerializer(serializers.get(0) as KSerializer)
   } else if (`$this$builtinParametrizedSerializer` == HashSet::class) {
      var10000 = HashSetSerializer(serializers.get(0) as KSerializer)
   } else if (`$this$builtinParametrizedSerializer` == java.util.Set::class
      || `$this$builtinParametrizedSerializer` == java.util.Set::class
      || `$this$builtinParametrizedSerializer` == LinkedHashSet::class) {
      var10000 = LinkedHashSetSerializer(serializers.get(0) as KSerializer)
   } else if (`$this$builtinParametrizedSerializer` == HashMap::class) {
      var10000 = HashMapSerializer(serializers.get(0) as KSerializer, serializers.get(1) as KSerializer)
   } else if (`$this$builtinParametrizedSerializer` == java.util.Map::class
      || `$this$builtinParametrizedSerializer` == java.util.Map::class
      || `$this$builtinParametrizedSerializer` == LinkedHashMap::class) {
      var10000 = LinkedHashMapSerializer(serializers.get(0) as KSerializer, serializers.get(1) as KSerializer)
   } else if (`$this$builtinParametrizedSerializer` == Entry::class) {
      var10000 = BuiltinSerializersKt.MapEntrySerializer(serializers.get(0) as KSerializer, serializers.get(1) as KSerializer)
   } else if (`$this$builtinParametrizedSerializer` == Pair::class) {
      var10000 = BuiltinSerializersKt.PairSerializer(serializers.get(0) as KSerializer, serializers.get(1) as KSerializer)
   } else if (`$this$builtinParametrizedSerializer` == Triple::class) {
      var10000 = BuiltinSerializersKt.TripleSerializer(serializers.get(0) as KSerializer, serializers.get(1) as KSerializer, serializers.get(2) as KSerializer)
   } else if (PlatformKt.isReferenceArray(`$this$builtinParametrizedSerializer`)) {
      val var4: Any = elementClassifierIfArray()
      var10000 = BuiltinSerializersKt.ArraySerializer(var4 as KClass, serializers.get(0) as KSerializer)
   } else {
      var10000 = null
   }

   return var10000
}

@PublishedApi
internal fun noCompiledSerializer(forClass: String): KSerializer<*> {
   throw SerializationException(Platform_commonKt.notRegisteredMessage(forClass))
}
