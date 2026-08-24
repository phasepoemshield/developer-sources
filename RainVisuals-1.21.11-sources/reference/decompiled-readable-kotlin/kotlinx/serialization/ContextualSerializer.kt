package kotlinx.serialization

import kotlin.reflect.KClass
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder
import kotlinx.serialization.descriptors.ContextAwareKt
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptorsKt
import kotlinx.serialization.descriptors.SerialKind
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.internal.Platform_commonKt
import kotlinx.serialization.internal.PluginHelperInterfacesKt
import kotlinx.serialization.modules.SerializersModule

// $VF: Compiled from ContextualSerializer.kt
@ExperimentalSerializationApi
public class ContextualSerializer<T>(serializableClass: KClass<Any>, fallbackSerializer: KSerializer<Any>?, vararg typeArgumentsSerializers: Any) :
   KSerializer<T> {
   private final val fallbackSerializer: KSerializer<Any>?
   private final val serializableClass: KClass<Any>
   private final val typeArgumentsSerializers: List<KSerializer<*>>
   public open val descriptor: SerialDescriptor

   init {
      this.serializableClass = serializableClass
      this.fallbackSerializer = fallbackSerializer
      this.typeArgumentsSerializers = ArraysKt.asList(typeArgumentsSerializers)
      this.descriptor = ContextAwareKt.withContext(
         SerialDescriptorsKt.buildSerialDescriptor(
            "kotlinx.serialization.ContextualSerializer", SerialKind.CONTEXTUAL.INSTANCE, arrayOfNulls(0),       // $VF: Compiled from ContextualSerializer.kt
      {
               var var3: java.util.List
               run label21@{
                  val var10001: KSerializer = ContextualSerializer.this.fallbackSerializer
                  if (var10001 != null) {
                     val var2: SerialDescriptor = var10001.descriptor
                     if (var2 != null) {
                        var3 = var2.annotations
                        return@label21
                     }
                  }

                  var3 = null
               }

               if (var3 == null) {
                  var3 = CollectionsKt.emptyList()
               }

               `$this$buildSerialDescriptor`.annotations = var3
            } as (ClassSerialDescriptorBuilder?) -> Unit
         ),
         this.serializableClass
      )
   }

   private fun serializer(serializersModule: SerializersModule): KSerializer<Any> {
      var var10000: KSerializer = serializersModule.getContextual(this.serializableClass, this.typeArgumentsSerializers)
      if (var10000 == null) {
         var10000 = this.fallbackSerializer
         if (this.fallbackSerializer == null) {
            Platform_commonKt.serializerNotRegistered(this.serializableClass)
            throw KotlinNothingValueException()
         }
      }

      return var10000
   }

   public constructor(serializableClass: KClass<Any>) : this(serializableClass, null, PluginHelperInterfacesKt.EMPTY_SERIALIZER_ARRAY)
   public override fun serialize(encoder: Encoder, value: Any) {
      encoder.encodeSerializableValue(this.serializer(encoder.serializersModule), (T)value)
   }

   public override fun deserialize(decoder: Decoder): Any {
      return decoder.decodeSerializableValue(this.serializer(decoder.serializersModule))
   }
}
