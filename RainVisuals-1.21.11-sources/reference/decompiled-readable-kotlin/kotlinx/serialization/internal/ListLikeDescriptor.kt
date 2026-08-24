package kotlinx.serialization.internal

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.descriptors.SerialKind
import kotlinx.serialization.descriptors.StructureKind

// $VF: Compiled from CollectionDescriptors.kt
@ExperimentalSerializationApi
internal sealed class ListLikeDescriptor protected constructor(elementDescriptor: SerialDescriptor) : SerialDescriptor {
   public open val elementsCount: Int
   public final val elementDescriptor: SerialDescriptor

   init {
      this.elementDescriptor = elementDescriptor
      this.elementsCount = 1
   }

   public override fun getElementAnnotations(index: Int): List<Annotation> {
      if (index < 0) {
         throw IllegalArgumentException(("Illegal index $index, ${this.getSerialName()} expects only non-negative indices").toString())
      } else {
         return CollectionsKt.emptyList()
      }
   }

   public override fun getElementDescriptor(index: Int): SerialDescriptor {
      if (index < 0) {
         throw IllegalArgumentException(("Illegal index $index, ${this.getSerialName()} expects only non-negative indices").toString())
      } else {
         return this.elementDescriptor
      }
   }

   override fun isNullable(): Boolean {
      SerialDescriptor.DefaultImpls.isNullable(this)
   }

   public override fun toString(): String {
      return "${this.getSerialName()}(${this.elementDescriptor})"
   }

   public override fun isElementOptional(index: Int): Boolean {
      if (index < 0) {
         throw IllegalArgumentException(("Illegal index $index, ${this.getSerialName()} expects only non-negative indices").toString())
      } else {
         return false
      }
   }

   public override operator fun equals(other: Any?): Boolean {
      return this === other
         || other is ListLikeDescriptor
            && this.elementDescriptor == (other as ListLikeDescriptor).elementDescriptor
            && this.getSerialName() == (other as ListLikeDescriptor).getSerialName()
         }

   public override fun hashCode(): Int {
      return this.elementDescriptor.hashCode() * 31 + this.getSerialName().hashCode()
   }

   override fun isInline(): Boolean {
      SerialDescriptor.DefaultImpls.isInline(this)
   }

   public override fun getElementName(index: Int): String {
      return java.lang.String.valueOf(index)
   }

   public open val kind: SerialKind
      public open get() {
         return StructureKind.LIST.INSTANCE
      }


   public override fun getElementIndex(name: String): Int {
      val var10000: Int = StringsKt.toIntOrNull(name)
      if (var10000 != null) {
         return var10000
      } else {
         throw IllegalArgumentException("$name is not a valid list index")
      }
   }

   override fun getAnnotations(): MutableList<java.lang.annotation.Annotation> {
      SerialDescriptor.DefaultImpls.getAnnotations(this)
   }
}
