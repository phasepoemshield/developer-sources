package kotlinx.serialization

import java.util.LinkedHashMap
import java.util.Map.Entry
import kotlin.jvm.internal.StringCompanionObject
import kotlin.reflect.KClass
import kotlinx.serialization.builtins.BuiltinSerializersKt
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder
import kotlinx.serialization.descriptors.PolymorphicKind
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptorsKt
import kotlinx.serialization.descriptors.SerialKind
import kotlinx.serialization.encoding.CompositeDecoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.internal.AbstractPolymorphicSerializer

// $VF: Compiled from SealedSerializer.kt
@InternalSerializationApi
public class SealedClassSerializer<T>(serialName: String, baseClass: KClass<Any>, vararg subclasses: Any, vararg subclassSerializers: Any)
   : AbstractPolymorphicSerializer<T> {
   private final var _annotations: List<Annotation>
   private final val serialName2Serializer: Map<String, KSerializer<out Any>>
   public open val baseClass: KClass<Any>
   private final val class2Serializer: Map<KClass<out Any>, KSerializer<out Any>>

   public open val descriptor: SerialDescriptor
      public open get() {
         return this.descriptor$delegate.value as SerialDescriptor
      }


   init {
      this.baseClass = baseClass
      this._annotations = CollectionsKt.emptyList()
      this.descriptor$delegate = LazyKt.lazy(
         LazyThreadSafetyMode.PUBLICATION,
               // $VF: Compiled from SealedSerializer.kt
   {
            return SerialDescriptorsKt.buildSerialDescriptor(
               serialName,
               PolymorphicKind.SEALED.INSTANCE,
               arrayOfNulls(0),
                        // $VF: Compiled from SealedSerializer.kt
      {
                  ClassSerialDescriptorBuilder.element$default(
                     `$this$buildSerialDescriptor`, "type", BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE).descriptor, null, false, 12, null
                  )
                  ClassSerialDescriptorBuilder.element$default(
                     `$this$buildSerialDescriptor`,
                     "value",
                     SerialDescriptorsKt.buildSerialDescriptor(
                        "kotlinx.serialization.Sealed<${var3/* $VF was: SealedClassSerializer.this */.baseClass.simpleName}>",
                        SerialKind.CONTEXTUAL.INSTANCE,
                        arrayOfNulls(0),
                                    // $VF: Compiled from SealedSerializer.kt
            {
                           for (`element$iv` in var10/* $VF was: SealedClassSerializer.this */.serialName2Serializer.entrySet()) {
                              ClassSerialDescriptorBuilder.element$default(
                                 `$this$buildSerialDescriptor`,
                                 `element$iv`.getKey() as java.lang.String,
                                 (`element$iv`.getValue() as KSerializer).descriptor,
                                 null,
                                 false,
                                 12,
                                 null
                              )
                           }
                        } as (ClassSerialDescriptorBuilder?) -> Unit
                     ),
                     null,
                     false,
                     12,
                     null
                  )
                  `$this$buildSerialDescriptor`.annotations = var3/* $VF was: SealedClassSerializer.this */._annotations
               } as (ClassSerialDescriptorBuilder?) -> Unit
            )
         } as () -> T
      )
      if (subclasses.length != subclassSerializers.length) {
         throw IllegalArgumentException("All subclasses of sealed class ${this.baseClass.simpleName} should be marked @Serializable")
      } else {
         this.class2Serializer = MapsKt.toMap(ArraysKt.zip(subclasses, subclassSerializers))
         val var23: Grouping = SealedClassSerializer$special$$inlined$groupingBy$1(this.class2Serializer.entrySet())
         val `$this$mapValuesTo$iv$iv`: Grouping = var23
         var `destination$iv$iv`: java.util.Map = LinkedHashMap()
         val `$this$associateByTo$iv$iv$iv`: java.util.Iterator = var23.sourceIterator()

         while (`$this$associateByTo$iv$iv$iv`.hasNext()) {
            val `$i$f$associateByTo`: Any = `$this$associateByTo$iv$iv$iv`.next()
            val `key$iv$iv`: Any = `$this$mapValuesTo$iv$iv`.keyOf(`$i$f$associateByTo`)
            val `element$iv$iv$iv`: Any = `destination$iv$iv`.get(`key$iv$iv`)
            if (`element$iv$iv$iv` == null && !`destination$iv$iv`.containsKey(`key$iv$iv`)) {
            }

            val element: Entry = `$i$f$associateByTo` as Entry
            val var16: Entry = `element$iv$iv$iv` as Entry
            val it: java.lang.String = `key$iv$iv` as java.lang.String
            if (var16 != null) {
               throw IllegalStateException(
                  ("Multiple sealed subclasses of '${this.baseClass}' have the same serial name '$it': '${var16.getKey()}', '${element.getKey()}'").toString()
               )
            }

            `destination$iv$iv`.put(`key$iv$iv`, element)
         }

         `destination$iv$iv` = LinkedHashMap(MapsKt.mapCapacity(`destination$iv$iv`.size()))

         for (var33 in `destination$iv$iv`.entrySet()) {
            `destination$iv$iv`.put((var33 as Entry).getKey(), ((var33 as Entry).getValue() as Entry).getValue() as KSerializer)
         }

         this.serialName2Serializer = `destination$iv$iv`
      }
   }

   public override fun findPolymorphicSerializerOrNull(decoder: CompositeDecoder, klassName: String?): DeserializationStrategy<Any>? {
      val var10000: KSerializer = this.serialName2Serializer.get(klassName)
      return if (var10000 != null) var10000 else super.findPolymorphicSerializerOrNull(decoder, klassName)
   }

   public override fun findPolymorphicSerializerOrNull(encoder: Encoder, value: Any): SerializationStrategy<Any>? {
      var var10000: KSerializer = this.class2Serializer.get(value.getClass()::class)
      var10000 = if (var10000 != null) var10000 else super.findPolymorphicSerializerOrNull(encoder, value)
      return var10000 ?: null
   }

   @PublishedApi
   internal constructor(serialName: String, baseClass: KClass<Any>, vararg subclasses: Any, vararg subclassSerializers: Any, vararg classAnnotations: Any) : this(
         serialName, baseClass, subclasses, subclassSerializers
      ) {
      this._annotations = ArraysKt.asList(classAnnotations)
   }
}
