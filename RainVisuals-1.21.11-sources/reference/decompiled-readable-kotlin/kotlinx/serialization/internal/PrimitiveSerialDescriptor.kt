package kotlinx.serialization.internal

import java.lang.annotation.Annotation
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.SerialDescriptor

// $VF: Compiled from Primitives.kt
internal class PrimitiveSerialDescriptor(serialName: String, kind: PrimitiveKind) : SerialDescriptor {
   public open val serialName: String
   public open val kind: PrimitiveKind

   override fun getAnnotations(): MutableList<Annotation> {
      SerialDescriptor.DefaultImpls.getAnnotations(this)
   }

   public override fun toString(): String {
      return "PrimitiveDescriptor(${this.serialName})"
   }

   public override fun getElementIndex(name: String): Int {
      this.error()
      throw KotlinNothingValueException()
   }

   private fun error(): Nothing {
      throw IllegalStateException("Primitive descriptor does not have elements")
   }

   public override fun getElementName(index: Int): String {
      this.error()
      throw KotlinNothingValueException()
   }

   override fun isNullable(): Boolean {
      SerialDescriptor.DefaultImpls.isNullable(this)
   }

   public override fun isElementOptional(index: Int): Boolean {
      this.error()
      throw KotlinNothingValueException()
   }

   public override fun getElementAnnotations(index: Int): List<kotlin.Annotation> {
      this.error()
      throw KotlinNothingValueException()
   }

   init {
      this.serialName = serialName
      this.kind = kind
   }

   public override fun getElementDescriptor(index: Int): SerialDescriptor {
      this.error()
      throw KotlinNothingValueException()
   }

   public open val elementsCount: Int
      public open get() {
         return 0
      }


   override fun isInline(): Boolean {
      SerialDescriptor.DefaultImpls.isInline(this)
   }

   public override operator fun equals(other: Any?): Boolean {
      return this === other
         || other is PrimitiveSerialDescriptor
            && this.serialName == (other as PrimitiveSerialDescriptor).serialName
            && this.kind == (other as PrimitiveSerialDescriptor).kind
         }

   public override fun hashCode(): Int {
      return this.serialName.hashCode() + 31 * this.kind.hashCode()
   }
}
