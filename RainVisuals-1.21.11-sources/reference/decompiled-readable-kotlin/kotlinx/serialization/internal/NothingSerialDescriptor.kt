package kotlinx.serialization.internal

import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.descriptors.SerialKind
import kotlinx.serialization.descriptors.StructureKind

// $VF: Compiled from NothingSerialDescriptor.kt
internal object NothingSerialDescriptor : SerialDescriptor {
   public open val serialName: String = "kotlin.Nothing"
   public open val kind: SerialKind = StructureKind.OBJECT.INSTANCE as SerialKind

   override fun isInline(): Boolean {
      SerialDescriptor.DefaultImpls.isInline(this)
   }

   public override fun getElementIndex(name: String): Int {
      this.error()
      throw KotlinNothingValueException()
   }

   public override fun getElementDescriptor(index: Int): SerialDescriptor {
      this.error()
      throw KotlinNothingValueException()
   }

   public override operator fun equals(other: Any?): Boolean {
      return this === other
   }

   public override fun hashCode(): Int {
      return this.serialName.hashCode() + 31 * this.kind.hashCode()
   }

   public override fun getElementName(index: Int): String {
      this.error()
      throw KotlinNothingValueException()
   }

   public override fun getElementAnnotations(index: Int): List<Annotation> {
      this.error()
      throw KotlinNothingValueException()
   }

   public override fun toString(): String {
      return "NothingSerialDescriptor"
   }

   public override fun isElementOptional(index: Int): Boolean {
      this.error()
      throw KotlinNothingValueException()
   }

   private fun error(): Nothing {
      throw IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements")
   }

   override fun getAnnotations(): MutableList<java.lang.annotation.Annotation> {
      SerialDescriptor.DefaultImpls.getAnnotations(this)
   }

   public open val elementsCount: Int
      public open get() {
         return 0
      }


   override fun isNullable(): Boolean {
      SerialDescriptor.DefaultImpls.isNullable(this)
   }
}
