package kotlinx.serialization.internal

import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.descriptors.SerialKind
import kotlinx.serialization.descriptors.StructureKind

// $VF: Compiled from CollectionDescriptors.kt
internal sealed class MapLikeDescriptor protected constructor(serialName: String, keyDescriptor: SerialDescriptor, valueDescriptor: SerialDescriptor) :
   SerialDescriptor {
   public open val elementsCount: Int
   public open val serialName: String
   public final val keyDescriptor: SerialDescriptor
   public final val valueDescriptor: SerialDescriptor

   override fun isInline(): Boolean {
      SerialDescriptor.DefaultImpls.isInline(this)
   }

   public override fun getElementName(index: Int): String {
      return java.lang.String.valueOf(index)
   }

   public override fun getElementAnnotations(index: Int): List<Annotation> {
      if (index < 0) {
         throw IllegalArgumentException(("Illegal index $index, ${this.serialName} expects only non-negative indices").toString())
      } else {
         return CollectionsKt.emptyList()
      }
   }

   public override fun getElementIndex(name: String): Int {
      val var10000: Int = StringsKt.toIntOrNull(name)
      if (var10000 != null) {
         return var10000
      } else {
         throw IllegalArgumentException("$name is not a valid map index")
      }
   }

   public override fun isElementOptional(index: Int): Boolean {
      if (index < 0) {
         throw IllegalArgumentException(("Illegal index $index, ${this.serialName} expects only non-negative indices").toString())
      } else {
         return false
      }
   }

   public override fun hashCode(): Int {
      return 31 * (31 * this.serialName.hashCode() + this.keyDescriptor.hashCode()) + this.valueDescriptor.hashCode()
   }

   public override fun toString(): String {
      return "${this.serialName}(${this.keyDescriptor}, ${this.valueDescriptor})"
   }

   public override fun getElementDescriptor(index: Int): SerialDescriptor {
      if (index < 0) {
         throw IllegalArgumentException(("Illegal index $index, ${this.serialName} expects only non-negative indices").toString())
      } else {
         var var10000: SerialDescriptor
         when (index % 2) {
            0 -> var10000 = this.keyDescriptor
            1 -> var10000 = this.valueDescriptor
            else -> throw IllegalStateException("Unreached".toString())
         }

         return var10000
      }
   }

   public open val kind: SerialKind
      public open get() {
         return StructureKind.MAP.INSTANCE
      }


   init {
      this.serialName = serialName
      this.keyDescriptor = keyDescriptor
      this.valueDescriptor = valueDescriptor
      this.elementsCount = 2
   }

   override fun isNullable(): Boolean {
      SerialDescriptor.DefaultImpls.isNullable(this)
   }

   override fun getAnnotations(): MutableList<java.lang.annotation.Annotation> {
      SerialDescriptor.DefaultImpls.getAnnotations(this)
   }

   public override operator fun equals(other: Any?): Boolean {
      return this === other
         || other is MapLikeDescriptor
            && this.serialName == (other as MapLikeDescriptor).serialName
            && this.keyDescriptor == (other as MapLikeDescriptor).keyDescriptor
            && this.valueDescriptor == (other as MapLikeDescriptor).valueDescriptor
         }
}
