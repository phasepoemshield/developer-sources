package kotlinx.serialization.descriptors

import java.util.ArrayList
import kotlin.reflect.KClass
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.KSerializer
import kotlinx.serialization.internal.SerialDescriptorForNullable
import kotlinx.serialization.modules.SerialModuleImpl
import kotlinx.serialization.modules.SerializersModule

// $VF: Compiled from ContextAware.kt
@ExperimentalSerializationApi
public fun SerializersModule.getContextualDescriptor(descriptor: SerialDescriptor): SerialDescriptor? {
   val var10000: KClass = capturedKClass
   val var5: SerialDescriptor
   if (var10000 != null) {
      val var4: KSerializer = SerializersModule.getContextual$default(`$this$getContextualDescriptor`, var10000, null, 2, null)
      var5 = if (var4 != null) var4.descriptor else null
   } else {
      var5 = null
   }

   return var5
}

@ExperimentalSerializationApi
public final val capturedKClass: KClass<*>?
   public final get() {
      return if (`$this$capturedKClass` is ContextDescriptor)
         (`$this$capturedKClass` as ContextDescriptor).kClass
         else
         (if (`$this$capturedKClass` is SerialDescriptorForNullable) capturedKClass else null)
      }


@ExperimentalSerializationApi
public fun SerializersModule.getPolymorphicDescriptors(descriptor: SerialDescriptor): List<SerialDescriptor> {
   val var10000: KClass = capturedKClass
   if (var10000 == null) {
      return CollectionsKt.emptyList()
   } else {
      val var13: java.util.Map = (`$this$getPolymorphicDescriptors` as SerialModuleImpl).polyBase2Serializers.get(var10000)
      var var14: java.util.Collection = if (var13 != null) var13.values() else null
      if (var14 == null) {
         var14 = CollectionsKt.emptyList()
      }

      val `$this$mapTo$iv$iv`: java.lang.Iterable = var14
      val `destination$iv$iv`: java.util.Collection = ArrayList(CollectionsKt.collectionSizeOrDefault(var14, 10))

      for (`item$iv$iv` in `$this$mapTo$iv$iv`) {
         `destination$iv$iv`.add((`item$iv$iv` as KSerializer).descriptor)
      }

      return `destination$iv$iv` as MutableList<SerialDescriptor>
   }
}

internal fun SerialDescriptor.withContext(context: KClass<*>): SerialDescriptor {
   return ContextDescriptor(`$this$withContext`, context)
}
