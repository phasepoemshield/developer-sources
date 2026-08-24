package kotlinx.serialization.modules

import kotlin.reflect.KClass
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerializationStrategy

// $VF: Compiled from SerializersModule.kt
public sealed class SerializersModule protected constructor() {
   @ExperimentalSerializationApi
   public abstract fun dumpTo(collector: SerializersModuleCollector) {
   }

   @ExperimentalSerializationApi
   public abstract fun <T : Any> getPolymorphic(baseClass: KClass<in Any>, serializedClassName: String?): DeserializationStrategy<Any>? {
   }

   @ExperimentalSerializationApi
   public abstract fun <T : Any> getPolymorphic(baseClass: KClass<in Any>, value: Any): SerializationStrategy<Any>? {
   }

   @ExperimentalSerializationApi
   public abstract fun <T : Any> getContextual(kClass: KClass<Any>, typeArgumentsSerializers: List<KSerializer<*>> = CollectionsKt.emptyList()): KSerializer<
         Any
      >? {
   }
}
