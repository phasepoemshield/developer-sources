package kotlinx.serialization

import kotlin.jvm.internal.StringCompanionObject
import kotlin.reflect.KClass
import kotlinx.serialization.builtins.BuiltinSerializersKt
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder
import kotlinx.serialization.descriptors.ContextAwareKt
import kotlinx.serialization.descriptors.PolymorphicKind
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptorsKt
import kotlinx.serialization.descriptors.SerialKind
import kotlinx.serialization.internal.AbstractPolymorphicSerializer

// $VF: Compiled from PolymorphicSerializer.kt
public class PolymorphicSerializer<T>(baseClass: KClass<Any>) : AbstractPolymorphicSerializer<T> {
   public open val baseClass: KClass<Any>

   public open val descriptor: SerialDescriptor
      public open get() {
         return this.descriptor$delegate.value as SerialDescriptor
      }


   private final var _annotations: List<Annotation>

   init {
      this.baseClass = baseClass
      this._annotations = CollectionsKt.emptyList()
      this.descriptor$delegate = LazyKt.lazy(
         LazyThreadSafetyMode.PUBLICATION,
               // $VF: Compiled from PolymorphicSerializer.kt
   {
            return ContextAwareKt.withContext(
               SerialDescriptorsKt.buildSerialDescriptor(
                  "kotlinx.serialization.Polymorphic",
                  PolymorphicKind.OPEN.INSTANCE,
                  arrayOfNulls(0),
                           // $VF: Compiled from PolymorphicSerializer.kt
         {
                     ClassSerialDescriptorBuilder.element$default(
                        `$this$buildSerialDescriptor`,
                        "type",
                        BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE).descriptor,
                        null,
                        false,
                        12,
                        null
                     )
                     ClassSerialDescriptorBuilder.element$default(
                        `$this$buildSerialDescriptor`,
                        "value",
                        SerialDescriptorsKt.buildSerialDescriptor$default(
                           "kotlinx.serialization.Polymorphic<${var2/* $VF was: PolymorphicSerializer.this */.baseClass.simpleName}>",
                           SerialKind.CONTEXTUAL.INSTANCE,
                           arrayOfNulls(0),
                           null,
                           8,
                           null
                        ),
                        null,
                        false,
                        12,
                        null
                     )
                     `$this$buildSerialDescriptor`.annotations = var2/* $VF was: PolymorphicSerializer.this */._annotations
                  } as (ClassSerialDescriptorBuilder?) -> Unit
               ),
               PolymorphicSerializer.this.baseClass
            )
         } as () -> T
      )
   }

   @PublishedApi
   internal constructor(baseClass: KClass<Any>, vararg classAnnotations: Any) : this(baseClass) {
      this._annotations = ArraysKt.asList(classAnnotations)
   }

   public override fun toString(): String {
      return "kotlinx.serialization.PolymorphicSerializer(baseClass: ${this.baseClass})"
   }
}
