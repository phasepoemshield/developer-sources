package kotlinx.serialization.modules

import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.TypeIntrinsics
import kotlin.reflect.KClass
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerializationStrategy
import org.jetbrains.annotations.NotNull

// $VF: Compiled from SerializersModule.kt
internal class SerialModuleImpl(class2ContextualFactory: Map<KClass<*>, ContextualProvider>,
   polyBase2Serializers: Map<KClass<*>, Map<KClass<*>, KSerializer<*>>>,
   polyBase2DefaultSerializerProvider: Map<KClass<*>, (*) -> SerializationStrategy<*>?>,
   polyBase2NamedSerializers: Map<KClass<*>, Map<String, KSerializer<*>>>,
   polyBase2DefaultDeserializerProvider: Map<KClass<*>, (String?) -> DeserializationStrategy<*>?>
) : SerializersModule() {
   private final val class2ContextualFactory: Map<KClass<*>, ContextualProvider>
   private final val polyBase2DefaultSerializerProvider: Map<KClass<*>, (*) -> SerializationStrategy<*>?>

   @JvmField
   @NotNull
   public final val polyBase2Serializers: Map<KClass<*>, Map<KClass<*>, KSerializer<*>>>

   private final val polyBase2DefaultDeserializerProvider: Map<KClass<*>, (String?) -> DeserializationStrategy<*>?>
   private final val polyBase2NamedSerializers: Map<KClass<*>, Map<String, KSerializer<*>>>

   public override fun <T : Any> getContextual(kClass: KClass<Any>, typeArgumentsSerializers: List<KSerializer<*>>): KSerializer<Any>? {
      val var10000: ContextualProvider = this.class2ContextualFactory.get(kClass)
      val var3: KSerializer = if (var10000 != null) var10000.invoke(typeArgumentsSerializers) else null
      return if (var3 is KSerializer) var3 else null
   }

   public override fun <T : Any> getPolymorphic(baseClass: KClass<in Any>, serializedClassName: String?): DeserializationStrategy<Any>? {
      val var10000: java.util.Map = this.polyBase2NamedSerializers.get(baseClass)
      val var4: KSerializer = if (var10000 != null) var10000.get(serializedClassName) as KSerializer else null
      val registered: KSerializer = if (var4 is KSerializer) var4 else null
      if ((if (var4 is KSerializer) var4 else null) != null) {
         return registered
      } else {
         val var5: Any = this.polyBase2DefaultDeserializerProvider.get(baseClass)
         val var6: Function1 = if (TypeIntrinsics.isFunctionOfArity(var5, 1)) var5 as Function1 else null
         return if (var6 != null) var6(serializedClassName) as DeserializationStrategy else null
      }
   }

   init {
      this.class2ContextualFactory = class2ContextualFactory
      this.polyBase2Serializers = polyBase2Serializers
      this.polyBase2DefaultSerializerProvider = polyBase2DefaultSerializerProvider
      this.polyBase2NamedSerializers = polyBase2NamedSerializers
      this.polyBase2DefaultDeserializerProvider = polyBase2DefaultDeserializerProvider
   }

   public override fun dumpTo(collector: SerializersModuleCollector) {
      for (`element$iv` in this.class2ContextualFactory.entrySet()) {
         val baseClass: KClass = `element$iv`.getKey() as KClass
         val provider: ContextualProvider = `element$iv`.getValue() as ContextualProvider
         if (provider is ContextualProvider.Argless) {
            val var10002: KSerializer = (provider as ContextualProvider.Argless).serializer
            collector.contextual(baseClass, var10002)
         } else if (provider is ContextualProvider.WithTypeArguments) {
            collector.contextual(baseClass, (provider as ContextualProvider.WithTypeArguments).provider)
         }
      }

      for (var29 in this.polyBase2Serializers.entrySet()) {
         val var38: KClass = var29.getKey() as KClass

         for (`element$iv` in (var29.getValue() as java.util.Map).entrySet()) {
            val actualClass: KClass = `element$iv`.getKey() as KClass
            val serializer: KSerializer = `element$iv`.getValue() as KSerializer
            collector.polymorphic(var38, actualClass, serializer)
         }
      }

      for (var30 in this.polyBase2DefaultSerializerProvider.entrySet()) {
         val var39: KClass = var30.getKey() as KClass
         val var42: Function1 = var30.getValue() as Function1
         collector.polymorphicDefaultSerializer(var39, TypeIntrinsics.beforeCheckcastToFunctionOfArity(var42, 1) as Function1)
      }

      for (var31 in this.polyBase2DefaultDeserializerProvider.entrySet()) {
         val var40: KClass = var31.getKey() as KClass
         val var43: Function1 = var31.getValue() as Function1
         collector.polymorphicDefaultDeserializer(var40, TypeIntrinsics.beforeCheckcastToFunctionOfArity(var43, 1) as Function1)
      }
   }

   public override fun <T : Any> getPolymorphic(baseClass: KClass<in Any>, value: Any): SerializationStrategy<Any>? {
      if (!baseClass.isInstance(value)) {
         return null
      } else {
         val var10000: java.util.Map = this.polyBase2Serializers.get(baseClass)
         val var4: KSerializer = if (var10000 != null) var10000.get(value.getClass()::class) as KSerializer else null
         val registered: SerializationStrategy = var4 as? SerializationStrategy
         if ((var4 as? SerializationStrategy) != null) {
            return registered
         } else {
            val var5: Any = this.polyBase2DefaultSerializerProvider.get(baseClass)
            val var6: Function1 = if (TypeIntrinsics.isFunctionOfArity(var5, 1)) var5 as Function1 else null
            return if (var6 != null) var6(value) as SerializationStrategy else null
         }
      }
   }
}
