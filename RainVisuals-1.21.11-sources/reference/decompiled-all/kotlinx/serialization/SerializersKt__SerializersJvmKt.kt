@file:JvmMultifileClass
@file:JvmName("SerializersKt")

package kotlinx.serialization

import java.lang.reflect.GenericArrayType
import java.lang.reflect.ParameterizedType
import java.lang.reflect.Type
import java.lang.reflect.WildcardType
import java.util.ArrayList
import java.util.Arrays
import java.util.Map.Entry
import kotlin.reflect.KClass
import kotlinx.serialization.builtins.BuiltinSerializersKt
import kotlinx.serialization.internal.PlatformKt
import kotlinx.serialization.internal.PrimitivesKt
import kotlinx.serialization.modules.SerializersModule
import kotlinx.serialization.modules.SerializersModuleBuildersKt

// $VF: Compiled from SerializersJvm.kt
private fun <T : Any> SerializersModule.reflectiveOrContextual(jClass: Class<Any>, typeArgumentsSerializers: List<KSerializer<Any?>>): KSerializer<Any>? {
   val var4: Array<KSerializer> = typeArgumentsSerializers.toArray(arrayOfNulls(0))
   var var10000: KSerializer = PlatformKt.constructSerializerForGivenTypeArgs(jClass, Arrays.copyOf(var4, var4.length))
   if (var10000 != null) {
      return var10000
   } else {
      val kClass: KClass = kotlin
      var10000 = PrimitivesKt.builtinSerializerOrNull(kClass)
      if (var10000 == null) {
         var10000 = `$this$reflectiveOrContextual`.getContextual(kClass, typeArgumentsSerializers)
      }

      return var10000
   }
}

public fun serializerOrNull(type: Type): KSerializer<Any>? {
   return SerializersKt.serializerOrNull(SerializersModuleBuildersKt.EmptySerializersModule(), type)
}

public fun serializer(type: Type): KSerializer<Any> {
   return SerializersKt.serializer(SerializersModuleBuildersKt.EmptySerializersModule(), type)
}

private fun Type.prettyClass(): Class<*> {
   val var10000: Class
   if (`$this$prettyClass` is Class) {
      var10000 = `$this$prettyClass` as Class
   } else if (`$this$prettyClass` is ParameterizedType) {
      val var2: Type = (`$this$prettyClass` as ParameterizedType).getRawType()
      var10000 = prettyClass$SerializersKt__SerializersJvmKt(var2)
   } else if (`$this$prettyClass` is WildcardType) {
      val var3: Array<Type> = (`$this$prettyClass` as WildcardType).getUpperBounds()
      val var4: Any = ArraysKt.first(var3)
      var10000 = prettyClass$SerializersKt__SerializersJvmKt(var4 as Type)
   } else {
      if (`$this$prettyClass` !is GenericArrayType) {
         throw IllegalArgumentException(
            "type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument $`$this$prettyClass` has type ${`$this$prettyClass`.getClass()::class}"
         )
      }

      val var5: Type = (`$this$prettyClass` as GenericArrayType).getGenericComponentType()
      var10000 = prettyClass$SerializersKt__SerializersJvmKt(var5)
   }

   return var10000
}

public fun SerializersModule.serializerOrNull(type: Type): KSerializer<Any>? {
   return serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt(`$this$serializerOrNull`, type, false)
}

private fun SerializersModule.serializerByJavaTypeImpl(type: Type, failOnMissingTypeArgSerializer: Boolean = ...): KSerializer<Any>? {
   var var10000: KSerializer
   if (type is GenericArrayType) {
      var10000 = genericArraySerializer$SerializersKt__SerializersJvmKt(
         `$this$serializerByJavaTypeImpl`, type as GenericArrayType, failOnMissingTypeArgSerializer
      )
   } else if (type is Class) {
      var10000 = typeSerializer$SerializersKt__SerializersJvmKt(`$this$serializerByJavaTypeImpl`, type as Class<*>, failOnMissingTypeArgSerializer)
   } else if (type is ParameterizedType) {
      val var40: Type = (type as ParameterizedType).getRawType()
      val rootClass: Class = var40 as Class
      val args: Array<Type> = (type as ParameterizedType).getActualTypeArguments()
      val var42: java.util.List
      if (failOnMissingTypeArgSerializer) {
         val var24: java.util.Collection = ArrayList(args.length)

         for (var32 in args) {
            var24.add(SerializersKt.serializer(`$this$serializerByJavaTypeImpl`, var32))
         }

         var42 = var24 as java.util.List
      } else {
         val `$this$mapTo$iv$iv`: java.util.Collection = ArrayList(args.length)

         for (`item$iv$iv` in args) {
            var10000 = SerializersKt.serializerOrNull(`$this$serializerByJavaTypeImpl`, `item$iv$iv`)
            if (var10000 == null) {
               return null
            }

            `$this$mapTo$iv$iv`.add(var10000)
         }

         var42 = `$this$mapTo$iv$iv` as java.util.List
      }

      if (java.util.Set.class.isAssignableFrom(rootClass)) {
         var10000 = BuiltinSerializersKt.SetSerializer(var42.get(0) as KSerializer)
      } else if (java.util.List.class.isAssignableFrom(rootClass) || java.util.Collection.class.isAssignableFrom(rootClass)) {
         var10000 = BuiltinSerializersKt.ListSerializer(var42.get(0) as KSerializer)
      } else if (java.util.Map.class.isAssignableFrom(rootClass)) {
         var10000 = BuiltinSerializersKt.MapSerializer(var42.get(0) as KSerializer, var42.get(1) as KSerializer)
      } else if (Entry.class.isAssignableFrom(rootClass)) {
         var10000 = BuiltinSerializersKt.MapEntrySerializer(var42.get(0) as KSerializer, var42.get(1) as KSerializer)
      } else if (Pair.class.isAssignableFrom(rootClass)) {
         var10000 = BuiltinSerializersKt.PairSerializer(var42.get(0) as KSerializer, var42.get(1) as KSerializer)
      } else if (Triple.class.isAssignableFrom(rootClass)) {
         var10000 = BuiltinSerializersKt.TripleSerializer(var42.get(0) as KSerializer, var42.get(1) as KSerializer, var42.get(2) as KSerializer)
      } else {
         val var25: java.lang.Iterable = var42
         val var27: java.util.Collection = ArrayList(CollectionsKt.collectionSizeOrDefault(var42, 10))

         for (var33 in var25) {
            val var35: KSerializer = var33 as KSerializer
            var27.add(var35)
         }

         var10000 = reflectiveOrContextual$SerializersKt__SerializersJvmKt(
            `$this$serializerByJavaTypeImpl`, rootClass, var27 as MutableList<KSerializer<Object>>
         )
      }
   } else {
      if (type !is WildcardType) {
         throw IllegalArgumentException(
            "type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument $type has type ${type.getClass()::class}"
         )
      }

      var var10001: Type = (type as WildcardType).getUpperBounds()
      var10001 = ArraysKt.first(var10001 as Array<Any>)
      var10000 = serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt$default(`$this$serializerByJavaTypeImpl`, var10001, false, 2, null)
   }

   return var10000
}

private fun SerializersModule.typeSerializer(type: Class<*>, failOnMissingTypeArgSerializer: Boolean): KSerializer<Any>? {
   var var10000: KSerializer
   if (type.isArray() && !type.getComponentType().isPrimitive()) {
      val var6: Class = type.getComponentType()
      if (failOnMissingTypeArgSerializer) {
         var10000 = SerializersKt.serializer(`$this$typeSerializer`, var6)
      } else {
         var10000 = SerializersKt.serializerOrNull(`$this$typeSerializer`, var6)
         if (var10000 == null) {
            return null
         }
      }

      val var8: KClass = kotlin
      val arraySerializer: KSerializer = BuiltinSerializersKt.ArraySerializer(var8, var10000)
      var10000 = arraySerializer
   } else {
      var10000 = reflectiveOrContextual$SerializersKt__SerializersJvmKt(`$this$typeSerializer`, type, CollectionsKt.emptyList())
   }

   return var10000
}

public fun SerializersModule.serializer(type: Type): KSerializer<Any> {
   val var10000: KSerializer = serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt(`$this$serializer`, type, true)
   if (var10000 == null) {
      PlatformKt.serializerNotRegistered(prettyClass$SerializersKt__SerializersJvmKt(type))
      throw KotlinNothingValueException()
   } else {
      return var10000
   }
}

private fun SerializersModule.genericArraySerializer(type: GenericArrayType, failOnMissingTypeArgSerializer: Boolean): KSerializer<Any>? {
   val kclass: Type = type.getGenericComponentType()
   var var10: Type
   if (kclass is WildcardType) {
      val var10000: Array<Type> = (kclass as WildcardType).getUpperBounds()
      var10 = ArraysKt.first(var10000)
   } else {
      var10 = kclass
   }

   val var11: KSerializer
   if (failOnMissingTypeArgSerializer) {
      var11 = SerializersKt.serializer(`$this$genericArraySerializer`, var10)
   } else {
      var11 = SerializersKt.serializerOrNull(`$this$genericArraySerializer`, var10)
      if (var11 == null) {
         return null
      }
   }

   val var13: KClass
   if (var10 is ParameterizedType) {
      var10 = (var10 as ParameterizedType).getRawType()
      var13 = kotlin
   } else {
      if (var10 !is KClass) {
         throw IllegalStateException("unsupported type in GenericArray: ${var10.getClass()::class}")
      }

      var13 = var10 as KClass
   }

   val var14: KSerializer = BuiltinSerializersKt.ArraySerializer(var13, var11)
   return var14
}
