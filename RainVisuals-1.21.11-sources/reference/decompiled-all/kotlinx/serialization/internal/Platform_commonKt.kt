package kotlinx.serialization.internal

import java.util.HashSet
import kotlin.reflect.KClass
import kotlin.reflect.KClassifier
import kotlin.reflect.KType
import kotlin.reflect.KTypeParameter
import kotlin.reflect.KTypeProjection
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerializationException
import kotlinx.serialization.SerializationStrategy
import kotlinx.serialization.descriptors.SerialDescriptor

// $VF: Compiled from Platform.common.kt
private final val EMPTY_DESCRIPTOR_ARRAY: Array<SerialDescriptor>

@PublishedApi
internal inline fun <T> SerializationStrategy<*>.cast(): SerializationStrategy<Any> {
   return `$this$cast`
}

internal fun notRegisteredMessage(className: String): String {
   return "Serializer for class '$className' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n"
}

internal fun KTypeProjection.typeOrThrow(): KType {
   val var10000: KType = `$this$typeOrThrow`.type
   if (var10000 == null) {
      throw IllegalArgumentException(("Star projections in type arguments are not allowed, but had ${`$this$typeOrThrow`.type}").toString())
   } else {
      return var10000
   }
}

internal fun KClass<*>.notRegisteredMessage(): String {
   var var10000: java.lang.String = `$this$notRegisteredMessage`.simpleName
   if (var10000 == null) {
      var10000 = "<local class name not available>"
   }

   return notRegisteredMessage(var10000)
}

internal inline fun <T, K> Iterable<Any>.elementsHashCodeBy(selector: (Any) -> Any): Int {
   var `accumulator$iv`: Int = 1

   for (`element$iv` in `$this$elementsHashCodeBy`) {
      val var10000: Int = 31 * `accumulator$iv`
      val var10001: Any = selector(`element$iv`)
      `accumulator$iv` = var10000 + (if (var10001 != null) var10001.hashCode() else 0)
   }

   return `accumulator$iv`
}

@PublishedApi
internal inline fun <T> DeserializationStrategy<*>.cast(): DeserializationStrategy<Any> {
   return `$this$cast`
}

internal fun KType.kclass(): KClass<Any> {
   val t: KClassifier = `$this$kclass`.classifier
   if (t is KClass) {
      return t as KClass<Object>
   } else if (t is KTypeParameter) {
      throw IllegalArgumentException(
         "Captured type parameter $t from generic non-reified function. Such functionality cannot be supported because $t is erased, either specify serializer explicitly or make calling function inline with reified $t."
      )
   } else {
      throw IllegalArgumentException("Only KClass supported as classifier, got $t")
   }
}

internal fun List<SerialDescriptor>?.compactArray(): Array<SerialDescriptor> {
   val var10000: java.util.List = if (`$this$compactArray` as java.util.Collection != null && !`$this$compactArray`.isEmpty()) `$this$compactArray` else null
   if (var10000 != null) {
      val var8: Array<SerialDescriptor> = var10000.toArray(arrayOfNulls(0))
      if (var8 != null) {
         return var8
      }
   }

   return EMPTY_DESCRIPTOR_ARRAY
}

internal fun SerialDescriptor.cachedSerialNames(): Set<String> {
   if (`$this$cachedSerialNames` is CachedNames) {
      return (`$this$cachedSerialNames` as CachedNames).serialNames
   } else {
      val result: HashSet = HashSet(`$this$cachedSerialNames`.elementsCount)
      var i: Int = 0

      for (var3 in `$this$cachedSerialNames`.elementsCount..i) {
         result.add(`$this$cachedSerialNames`.getElementName(i))
      }

      return result
   }
}

@PublishedApi
internal inline fun <T> KSerializer<*>.cast(): KSerializer<Any> {
   return `$this$cast`
}

internal fun KClass<*>.serializerNotRegistered(): Nothing {
   throw SerializationException(notRegisteredMessage(`$this$serializerNotRegistered`))
}
