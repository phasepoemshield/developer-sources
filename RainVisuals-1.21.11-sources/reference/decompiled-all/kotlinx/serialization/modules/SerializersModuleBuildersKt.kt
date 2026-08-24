package kotlinx.serialization.modules

import kotlin.jvm.functions.Function1
import kotlin.reflect.KClass
import kotlinx.serialization.KSerializer

// $VF: Compiled from SerializersModuleBuilders.kt
public inline fun <Base : Any> SerializersModuleBuilder.polymorphic(
   baseClass: KClass<Any>,
   baseSerializer: KSerializer<Any>? = null,
   builderAction: (PolymorphicModuleBuilder<Any>) -> Unit = {
      } as Function1
) {
   val builder: PolymorphicModuleBuilder = PolymorphicModuleBuilder(baseClass, baseSerializer)
   builderAction(builder)
   builder.buildTo(`$this$polymorphic`)
}

public fun <T : Any> serializersModuleOf(kClass: KClass<Any>, serializer: KSerializer<Any>): SerializersModule {
   val `builder$iv`: SerializersModuleBuilder = SerializersModuleBuilder()
   `builder$iv`.contextual(kClass, serializer)
   return `builder$iv`.build()
}

public fun EmptySerializersModule(): SerializersModule {
   return EmptySerializersModule
}

public inline fun SerializersModule(builderAction: (SerializersModuleBuilder) -> Unit): SerializersModule {
   val builder: SerializersModuleBuilder = SerializersModuleBuilder()
   builderAction(builder)
   return builder.build()
}
