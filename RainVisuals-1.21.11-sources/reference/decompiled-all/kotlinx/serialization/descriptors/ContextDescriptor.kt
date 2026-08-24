package kotlinx.serialization.descriptors

import kotlin.reflect.KClass
import kotlinx.serialization.ExperimentalSerializationApi
import org.jetbrains.annotations.NotNull

// $VF: Compiled from ContextAware.kt
private class ContextDescriptor(original: SerialDescriptor, kClass: KClass<*>) : SerialDescriptor {
   @NotNull
   @JvmField
   public final val kClass: KClass<*>

   private final val original: SerialDescriptor
   public open val serialName: String

   public open val isNullable: Boolean
      public open get() {
         return this.original.isNullable
      }


   public override fun hashCode(): Int {
      return 31 * this.kClass.hashCode() + this.serialName.hashCode()
   }

   @ExperimentalSerializationApi
   public override fun getElementName(index: Int): String {
      return this.original.getElementName(index)
   }

   @ExperimentalSerializationApi
   public override fun getElementDescriptor(index: Int): SerialDescriptor {
      return this.original.getElementDescriptor(index)
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
   public override fun getElementAnnotations(index: Int): List<Annotation> {
      return this.original.getElementAnnotations(index)
   }

   public open val elementsCount: Int

   public open val kind: SerialKind

   public override operator fun equals(other: Any?): Boolean {
      return (other as? ContextDescriptor) != null
         && this.original == (other as? ContextDescriptor).original
         && (other as? ContextDescriptor).kClass == this.kClass
      }

   init {
      this.original = original
      this.kClass = kClass
      this.serialName = "${this.original.serialName}<${this.kClass.simpleName}>"
   }

   public override fun toString(): String {
      return "ContextDescriptor(kClass: ${this.kClass}, original: ${this.original})"
   }

   @ExperimentalSerializationApi
   public override fun isElementOptional(index: Int): Boolean {
      return this.original.isElementOptional(index)
   }

   public open val annotations: List<Annotation>
      public open get() {
         return this.original.annotations
      }

}
