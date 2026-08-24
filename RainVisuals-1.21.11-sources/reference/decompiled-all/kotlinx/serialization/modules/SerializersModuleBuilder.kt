package kotlinx.serialization.modules

import java.util.HashMap
import java.util.Map.Entry
import kotlin.jvm.functions.Function1
import kotlin.reflect.KClass
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerializationStrategy

// $VF: Compiled from SerializersModuleBuilders.kt
public class SerializersModuleBuilder @PublishedApi  internal constructor() : SerializersModuleCollector {
   private final val polyBase2NamedSerializers: MutableMap<KClass<*>, MutableMap<String, KSerializer<*>>>
   private final val class2ContextualProvider: MutableMap<KClass<*>, ContextualProvider> = HashMap() as java.util.Map
   private final val polyBase2Serializers: MutableMap<KClass<*>, MutableMap<KClass<*>, KSerializer<*>>> = HashMap() as java.util.Map
   private final val polyBase2DefaultDeserializerProvider: MutableMap<KClass<*>, (String?) -> DeserializationStrategy<*>?>
   private final val polyBase2DefaultSerializerProvider: MutableMap<KClass<*>, (*) -> SerializationStrategy<*>?> = HashMap() as java.util.Map

   @JvmName(name = "registerPolymorphicSerializer")
   internal fun <Base : Any, Sub : Any> registerPolymorphicSerializer(
      baseClass: KClass<Any>,
      concreteClass: KClass<Any>,
      concreteSerializer: KSerializer<Any>,
      allowOverwrite: Boolean = false
   ) {
      val name: java.lang.String = concreteSerializer.descriptor.serialName
      val previousSerializer: java.util.Map = this.polyBase2Serializers
      var previousByName: java.util.Map = this.polyBase2Serializers.get(baseClass)
      var var10000: Any
      if (previousByName == null) {
         val var21: HashMap = HashMap()
         previousSerializer.put(baseClass, var21)
         var10000 = var21
      } else {
         var10000 = previousByName
      }

      val baseClassSerializers: java.util.Map = var10000 as java.util.Map
      val var17: KSerializer = (var10000 as java.util.Map).get(concreteClass) as KSerializer
      previousByName = this.polyBase2NamedSerializers
      val `value$iv`: Any = this.polyBase2NamedSerializers.get(baseClass)
      if (`value$iv` == null) {
         val var24: HashMap = HashMap()
         previousByName.put(baseClass, var24)
         var10000 = var24
      } else {
         var10000 = `value$iv`
      }

      val var18: java.util.Map = var10000 as java.util.Map
      if (allowOverwrite) {
         if (var17 != null) {
            var18.remove(var17.descriptor.serialName)
         }

         baseClassSerializers.put(concreteClass, concreteSerializer)
         var18.put(name, concreteSerializer)
      } else {
         if (var17 != null) {
            if (!(var17 == concreteSerializer)) {
               throw SerializerAlreadyRegisteredException(baseClass, concreteClass)
            }

            var18.remove(var17.descriptor.serialName)
         }

         val var20: KSerializer = var18.get(name) as KSerializer
         if (var20 == null) {
            baseClassSerializers.put(concreteClass, concreteSerializer)
            var18.put(name, concreteSerializer)
         } else {
            var10000 = this.polyBase2Serializers.get(baseClass)
            val var13: java.util.Iterator = MapsKt.asSequence(var10000 as java.util.Map).iterator()

            while (true) {
               if (var13.hasNext()) {
                  val var14: Any = var13.next()
                  if ((var14 as Entry).getValue() != var20) {
                     continue
                  }

                  var10000 = var14
                  break
               }

               var10000 = null
               break
            }

            throw IllegalArgumentException(
               "Multiple polymorphic serializers for base class '$baseClass' have the same serial name '$name': '$concreteClass' and '${var10000 as Entry}'"
            )
         }
      }
   }

   public override fun <Base : Any> polymorphicDefaultDeserializer(
      baseClass: KClass<Any>,
      defaultDeserializerProvider: (String?) -> DeserializationStrategy<Any>?
   ) {
      this.registerDefaultPolymorphicDeserializer(baseClass, defaultDeserializerProvider, false)
   }

   @PublishedApi
   internal fun build(): SerializersModule {
      return SerialModuleImpl(
         this.class2ContextualProvider,
         this.polyBase2Serializers,
         this.polyBase2DefaultSerializerProvider,
         this.polyBase2NamedSerializers,
         this.polyBase2DefaultDeserializerProvider
      )
   }

   @JvmName(name = "registerDefaultPolymorphicSerializer")
   internal fun <Base : Any> registerDefaultPolymorphicSerializer(
      baseClass: KClass<Any>,
      defaultSerializerProvider: (Any) -> SerializationStrategy<Any>?,
      allowOverwrite: Boolean
   ) {
      val previous: Function1 = this.polyBase2DefaultSerializerProvider.get(baseClass)
      if (previous != null && !(previous == defaultSerializerProvider) && !allowOverwrite) {
         throw IllegalArgumentException("Default serializers provider for $baseClass is already registered: $previous")
      } else {
         this.polyBase2DefaultSerializerProvider.put(baseClass, defaultSerializerProvider)
      }
   }

   public override fun <T : Any> contextual(kClass: KClass<Any>, provider: (List<KSerializer<*>>) -> KSerializer<*>) {
      registerSerializer$default(this, kClass, ContextualProvider.WithTypeArguments(provider), false, 4, null)
   }

   /** @deprecated */
   @Deprecated(message = "Deprecated in favor of function with more precise name: polymorphicDefaultDeserializer", replaceWith = @ReplaceWith(expression = "polymorphicDefaultDeserializer(baseClass, defaultDeserializerProvider)", imports = []), level = DeprecationLevel.WARNING)
   override fun <Base> polymorphicDefault(defaultDeserializerProvider: KClass<Base>, baseClass: (java.lang.String?) -> DeserializationStrategy<out Base>) {
      SerializersModuleCollector.DefaultImpls.polymorphicDefault(this, baseClass, defaultDeserializerProvider)
   }

   public override fun <Base : Any, Sub : Any> polymorphic(baseClass: KClass<Any>, actualClass: KClass<Any>, actualSerializer: KSerializer<Any>) {
      registerPolymorphicSerializer$default(this, baseClass, actualClass, actualSerializer, false, 8, null)
   }

   @JvmName(name = "registerSerializer")
   internal fun <T : Any> registerSerializer(forClass: KClass<Any>, provider: ContextualProvider, allowOverwrite: Boolean = false) {
      if (!allowOverwrite) {
         val previous: ContextualProvider = this.class2ContextualProvider.get(forClass)
         if (previous != null && !(previous == provider)) {
            throw SerializerAlreadyRegisteredException("Contextual serializer or serializer provider for $forClass already registered in this module")
         }
      }

      this.class2ContextualProvider.put(forClass, provider)
   }

   @JvmName(name = "registerDefaultPolymorphicDeserializer")
   internal fun <Base : Any> registerDefaultPolymorphicDeserializer(
      baseClass: KClass<Any>,
      defaultDeserializerProvider: (String?) -> DeserializationStrategy<Any>?,
      allowOverwrite: Boolean
   ) {
      val previous: Function1 = this.polyBase2DefaultDeserializerProvider.get(baseClass)
      if (previous != null && !(previous == defaultDeserializerProvider) && !allowOverwrite) {
         throw IllegalArgumentException("Default deserializers provider for $baseClass is already registered: $previous")
      } else {
         this.polyBase2DefaultDeserializerProvider.put(baseClass, defaultDeserializerProvider)
      }
   }

   public override fun <Base : Any> polymorphicDefaultSerializer(baseClass: KClass<Any>, defaultSerializerProvider: (Any) -> SerializationStrategy<Any>?) {
      this.registerDefaultPolymorphicSerializer(baseClass, defaultSerializerProvider, false)
   }

   public fun include(module: SerializersModule) {
      module.dumpTo(this)
   }

   init {
      this.polyBase2NamedSerializers = HashMap<>()
      this.polyBase2DefaultDeserializerProvider = HashMap<>()
   }

   public override fun <T : Any> contextual(kClass: KClass<Any>, serializer: KSerializer<Any>) {
      registerSerializer$default(this, kClass, ContextualProvider.Argless(serializer), false, 4, null)
   }
}
