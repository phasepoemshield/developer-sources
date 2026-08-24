package kotlinx.serialization.internal

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.descriptors.SerialKind

// $VF: Compiled from NullableSerializer.kt
internal class SerialDescriptorForNullable(original: SerialDescriptor) : SerialDescriptor, CachedNames {
   public open val serialNames: Set<String>
   public open val serialName: String
   internal final val original: SerialDescriptor

   public open val annotations: List<Annotation>
      public open get() {
         return this.original.annotations
      }


   public open val elementsCount: Int

   @ExperimentalSerializationApi
   public override fun getElementDescriptor(index: Int): SerialDescriptor {
      return this.original.getElementDescriptor(index)
   }

   @ExperimentalSerializationApi
   public override fun getElementAnnotations(index: Int): List<Annotation> {
      return this.original.getElementAnnotations(index)
   }

   public open val isNullable: Boolean
      public open get() {
         return true
      }


   public override operator fun equals(other: Any?): Boolean {
      return this === other || other is SerialDescriptorForNullable && this.original == (other as SerialDescriptorForNullable).original
   }

   @ExperimentalSerializationApi
   public override fun getElementIndex(name: String): Int {
      return this.original.getElementIndex(name)
   }

   public open val isInline: Boolean
      public open get() {
         return this.original.isInline
      }


   @ExperimentalSerializationApi
   public override fun getElementName(index: Int): String {
      return this.original.getElementName(index)
   }

   public override fun hashCode(): Int {
      return this.original.hashCode() * 31
   }

   public override fun toString(): String {
      return "${this.original}?"
   }

   public open val kind: SerialKind

   init {
      this.original = original
      this.serialName = "${this.original.serialName}?"
      this.serialNames = Platform_commonKt.cachedSerialNames(this.original)
   }

   @ExperimentalSerializationApi
   public override fun isElementOptional(index: Int): Boolean {
      return this.original.isElementOptional(index)
   }
}
