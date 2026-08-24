package kotlinx.serialization.internal

import kotlin.reflect.KClass
import kotlin.reflect.KClassifier
import kotlin.reflect.KType
import kotlin.reflect.KTypeProjection

// $VF: Compiled from Caching.kt
private class KTypeWrapper(origin: KType) : KType {
   private final val origin: KType

   public override fun toString(): String {
      return "KTypeWrapper: ${this.origin}"
   }

   public open val arguments: List<KTypeProjection>
      public open get() {
         return this.origin.arguments
      }


   public open val classifier: KClassifier?
      public open get() {
         return this.origin.classifier
      }


   public override operator fun equals(other: Any?): Boolean {
      if (other == null) {
         return false
      } else if (!(this.origin == (if ((other as? KTypeWrapper) != null) (other as? KTypeWrapper).origin else null))) {
         return false
      } else {
         val kClassifier: KClassifier = this.classifier
         if (kClassifier is KClass) {
            val otherClassifier: KClassifier = if ((other as? KType) != null) (other as? KType).classifier else null
            return otherClassifier != null && otherClassifier is KClass && java == java
         } else {
            return false
         }
      }
   }

   public open val annotations: List<Annotation>
      public open get() {
         return this.origin.getAnnotations()
      }


   init {
      this.origin = origin
   }

   public override fun hashCode(): Int {
      return this.origin.hashCode()
   }

   public open val isMarkedNullable: Boolean
      public open get() {
         return this.origin.isMarkedNullable
      }

}
