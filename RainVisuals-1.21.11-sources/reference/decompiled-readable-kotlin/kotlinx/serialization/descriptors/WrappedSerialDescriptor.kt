package kotlinx.serialization.descriptors

import kotlinx.serialization.ExperimentalSerializationApi

// $VF: Compiled from SerialDescriptors.kt
internal class WrappedSerialDescriptor(serialName: String, original: SerialDescriptor) : SerialDescriptor {
   public open val serialName: String

   @ExperimentalSerializationApi
   public override fun getElementDescriptor(index: Int): SerialDescriptor {
      return this.$$delegate_0.getElementDescriptor(index)
   }

   @ExperimentalSerializationApi
   public override fun getElementIndex(name: String): Int {
      return this.$$delegate_0.getElementIndex(name)
   }

   init {
      this.serialName = serialName
      this.$$delegate_0 = original
   }

   @ExperimentalSerializationApi
   public override fun isElementOptional(index: Int): Boolean {
      return this.$$delegate_0.isElementOptional(index)
   }

   public open val elementsCount: Int

   public open val annotations: List<Annotation>
      public open get() {
         return this.$$delegate_0.annotations
      }


   public open val isInline: Boolean
      public open get() {
         return this.$$delegate_0.isInline
      }


   @ExperimentalSerializationApi
   public override fun getElementName(index: Int): String {
      return this.$$delegate_0.getElementName(index)
   }

   public open val isNullable: Boolean
      public open get() {
         return this.$$delegate_0.isNullable
      }


   @ExperimentalSerializationApi
   public override fun getElementAnnotations(index: Int): List<Annotation> {
      return this.$$delegate_0.getElementAnnotations(index)
   }

   public open val kind: SerialKind
}
