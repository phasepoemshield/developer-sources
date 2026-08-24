package kotlinx.serialization.modules

import java.util.ArrayList
import kotlin.reflect.KClass
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerializationStrategy

// $VF: Compiled from PolymorphicModuleBuilder.kt
public class PolymorphicModuleBuilder<Base> @PublishedApi  internal constructor(baseClass: KClass<Any>, baseSerializer: KSerializer<Any>? = null) {
   private final var defaultDeserializerProvider: ((String?) -> DeserializationStrategy<Any>?)?
      private set

   private final val subclasses: MutableList<Pair<KClass<out Any>, KSerializer<out Any>>>

   private final var defaultSerializerProvider: ((Any) -> SerializationStrategy<Any>?)?
      private set

   private final val baseSerializer: KSerializer<Any>?
   private final val baseClass: KClass<Any>

   @PublishedApi
   internal fun buildTo(builder: SerializersModuleBuilder) {
      if (this.baseSerializer != null) {
         SerializersModuleBuilder.registerPolymorphicSerializer$default(builder, this.baseClass, this.baseClass, this.baseSerializer, false, 8, null)
      }

      for (`element$iv` in this.subclasses) {
         val kclass: KClass = (`element$iv` as Pair).component1() as KClass
         val serializer: KSerializer = (`element$iv` as Pair).component2() as KSerializer
         val var10001: KClass = this.baseClass
         SerializersModuleBuilder.registerPolymorphicSerializer$default(builder, var10001, kclass, serializer, false, 8, null)
      }

      if (this.defaultSerializerProvider != null) {
         builder.registerDefaultPolymorphicSerializer(this.baseClass, this.defaultSerializerProvider, false)
      }

      if (this.defaultDeserializerProvider != null) {
         builder.registerDefaultPolymorphicDeserializer(this.baseClass, this.defaultDeserializerProvider, false)
      }
   }

   @Deprecated(message = "Deprecated in favor of function with more precise name: defaultDeserializer", replaceWith = @ReplaceWith(expression = "defaultDeserializer(defaultSerializerProvider)", imports = []), level = DeprecationLevel.WARNING)
   public fun default(defaultSerializerProvider: (String?) -> DeserializationStrategy<Any>?) {
      this.defaultDeserializer(defaultSerializerProvider)
   }

   public fun defaultDeserializer(defaultDeserializerProvider: (String?) -> DeserializationStrategy<Any>?) {
      if (this.defaultDeserializerProvider != null) {
         throw IllegalArgumentException(
            ("Default deserializer provider is already registered for class ${this.baseClass}: ${this.defaultDeserializerProvider}").toString()
         )
      } else {
         this.defaultDeserializerProvider = defaultDeserializerProvider
      }
   }

   public fun <T : Any> subclass(subclass: KClass<Any>, serializer: KSerializer<Any>) {
      this.subclasses.add(subclass to serializer)
   }

   init {
      super()
      this.baseClass = baseClass
      this.baseSerializer = baseSerializer
      this.subclasses = ArrayList<>()
   }
}
