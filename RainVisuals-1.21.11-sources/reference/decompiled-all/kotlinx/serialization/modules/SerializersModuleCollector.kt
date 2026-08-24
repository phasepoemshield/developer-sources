package kotlinx.serialization.modules

import kotlin.reflect.KClass
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerializationStrategy

// $VF: Compiled from SerializersModuleCollector.kt
@ExperimentalSerializationApi
public interface SerializersModuleCollector {
   @Deprecated(message = "Deprecated in favor of function with more precise name: polymorphicDefaultDeserializer", replaceWith = @ReplaceWith(expression = "polymorphicDefaultDeserializer(baseClass, defaultDeserializerProvider)", imports = []), level = DeprecationLevel.WARNING)
   public open fun <Base : Any> polymorphicDefault(baseClass: KClass<Any>, defaultDeserializerProvider: (String?) -> DeserializationStrategy<Any>?) {
   }

   public abstract fun <Base : Any, Sub : Any> polymorphic(baseClass: KClass<Any>, actualClass: KClass<Any>, actualSerializer: KSerializer<Any>) {
   }

   public abstract fun <T : Any> contextual(kClass: KClass<Any>, provider: (List<KSerializer<*>>) -> KSerializer<*>) {
   }

   public abstract fun <Base : Any> polymorphicDefaultDeserializer(
      baseClass: KClass<Any>,
      defaultDeserializerProvider: (String?) -> DeserializationStrategy<Any>?
   ) {
   }

   public open fun <T : Any> contextual(kClass: KClass<Any>, serializer: KSerializer<Any>) {
   }

   public abstract fun <Base : Any> polymorphicDefaultSerializer(baseClass: KClass<Any>, defaultSerializerProvider: (Any) -> SerializationStrategy<Any>?) {
   }

   // $VF: Class flags could not be determined
   // $VF: Compiled from SerializersModuleCollector.kt
   internal class DefaultImpls {
      @JvmStatic
      fun <T> contextual(`$this`: SerializersModuleCollector, serializer: KClass<T>, kClass: KSerializer<T>) {
         `$this`.contextual(kClass,          // $VF: Compiled from SerializersModuleCollector.kt
{ it: List<KSerializer<*>> ->
            serializer
         } as (MutableList<KSerializer<*>>?) -> KSerializer<*>)
      }

      /** @deprecated */
      @Deprecated(message = "Deprecated in favor of function with more precise name: polymorphicDefaultDeserializer", replaceWith = @ReplaceWith(expression = "polymorphicDefaultDeserializer(baseClass, defaultDeserializerProvider)", imports = []), level = DeprecationLevel.WARNING)
      @JvmStatic
      fun <Base> polymorphicDefault(
         defaultDeserializerProvider: SerializersModuleCollector, `$this`: KClass<Base>, baseClass: (java.lang.String?) -> DeserializationStrategy<out Base>
      ) {
         `$this`.polymorphicDefaultDeserializer(baseClass, defaultDeserializerProvider)
      }
   }
}
