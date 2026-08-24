package kotlinx.serialization.modules

import kotlin.reflect.KClass
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerializationStrategy

// $VF: Compiled from SerializersModule.kt
@Deprecated(
   message = "Deprecated in the favour of 'EmptySerializersModule()'",
   replaceWith = @ReplaceWith(expression = "EmptySerializersModule()", imports = {}),
   level = DeprecationLevel.WARNING
)
public final val EmptySerializersModule: SerializersModule =
   SerialModuleImpl(MapsKt.emptyMap(), MapsKt.emptyMap(), MapsKt.emptyMap(), MapsKt.emptyMap(), MapsKt.emptyMap()) as SerializersModule

public operator fun SerializersModule.plus(other: SerializersModule): SerializersModule {
   val `builder$iv`: SerializersModuleBuilder = SerializersModuleBuilder()
   `builder$iv`.include(`$this$plus`)
   `builder$iv`.include(other)
   return `builder$iv`.build()
}

public infix fun SerializersModule.overwriteWith(other: SerializersModule): SerializersModule {
   val `builder$iv`: SerializersModuleBuilder = SerializersModuleBuilder()
   `builder$iv`.include(`$this$overwriteWith`)
   other.dumpTo(
         // $VF: Compiled from SerializersModule.kt
   object : SerializersModuleCollector {
         public override fun <T : Any> contextual(kClass: KClass<Any>, provider: (List<KSerializer<*>>) -> KSerializer<*>) {
            builder$iv.registerSerializer(kClass, ContextualProvider.WithTypeArguments(provider), true)
         }

         public override fun <T : Any> contextual(kClass: KClass<Any>, serializer: KSerializer<Any>) {
            builder$iv.registerSerializer(kClass, ContextualProvider.Argless(serializer), true)
         }

         public override fun <Base : Any, Sub : Any> polymorphic(baseClass: KClass<Any>, actualClass: KClass<Any>, actualSerializer: KSerializer<Any>) {
            builder$iv.registerPolymorphicSerializer(baseClass, actualClass, actualSerializer, true)
         }

         public override fun <Base : Any> polymorphicDefaultDeserializer(
            baseClass: KClass<Any>,
            defaultDeserializerProvider: (String?) -> DeserializationStrategy<Any>?
         ) {
            builder$iv.registerDefaultPolymorphicDeserializer(baseClass, defaultDeserializerProvider, true)
         }

         /** @deprecated */
         @Deprecated(message = "Deprecated in favor of function with more precise name: polymorphicDefaultDeserializer", replaceWith = @ReplaceWith(expression = "polymorphicDefaultDeserializer(baseClass, defaultDeserializerProvider)", imports = []), level = DeprecationLevel.WARNING)
         override fun <Base> polymorphicDefault(defaultDeserializerProvider: KClass<Base>, baseClass: (java.lang.String?) -> DeserializationStrategy<out Base>) {
            SerializersModuleCollector.DefaultImpls.polymorphicDefault(this, baseClass, defaultDeserializerProvider)
         }

         public override fun <Base : Any> polymorphicDefaultSerializer(baseClass: KClass<Any>, defaultSerializerProvider: (Any) -> SerializationStrategy<Any>?) {
            builder$iv.registerDefaultPolymorphicSerializer(baseClass, defaultSerializerProvider, true)
         }
      }
   )
   return `builder$iv`.build()
}
