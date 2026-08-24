package kotlinx.serialization.descriptors

import kotlinx.serialization.ExperimentalSerializationApi

// $VF: Compiled from SerialDescriptor.kt
public interface SerialDescriptor {
   @ExperimentalSerializationApi
   public abstract fun getElementName(index: Int): String {
   }

   public val kind: SerialKind

   public open val isInline: Boolean
      public open get() {
      }


   public val elementsCount: Int

   public val serialName: String

   @ExperimentalSerializationApi
   public abstract fun getElementDescriptor(index: Int): SerialDescriptor {
   }

   public open val annotations: List<Annotation>
      public open get() {
      }


   @ExperimentalSerializationApi
   public abstract fun getElementAnnotations(index: Int): List<Annotation> {
   }

   @ExperimentalSerializationApi
   public abstract fun getElementIndex(name: String): Int {
   }

   @ExperimentalSerializationApi
   public abstract fun isElementOptional(index: Int): Boolean {
   }

   public open val isNullable: Boolean
      public open get() {
      }


   // $VF: Class flags could not be determined
   // $VF: Compiled from SerialDescriptor.kt
   internal class DefaultImpls {
      @JvmStatic
      fun getAnnotations(`$this`: SerialDescriptor): MutableList<java.lang.annotation.Annotation> {
         CollectionsKt.emptyList()
      }

      @JvmStatic
      fun isInline(`$this`: SerialDescriptor): Boolean {
         false
      }

      @JvmStatic
      fun isNullable(`$this`: SerialDescriptor): Boolean {
         false
      }
   }
}
