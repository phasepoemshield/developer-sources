package kotlin.reflect

import java.lang.reflect.GenericDeclaration
import java.lang.reflect.Type
import java.lang.reflect.TypeVariable
import java.util.ArrayList

// $VF: Compiled from TypesJVM.kt
@ExperimentalStdlibApi
private class TypeVariableImpl(typeParameter: KTypeParameter) : TypeVariable<GenericDeclaration>, TypeImpl {
   private final val typeParameter: KTypeParameter

   public override fun toString(): String {
      return this.getTypeName()
   }

   public override fun getTypeName(): String {
      return this.getName()
   }

   public override fun getName(): String {
      return this.typeParameter.name
   }

   public override fun getAnnotations(): Array<Annotation> {
      return arrayOfNulls(0)
   }

   public override fun getGenericDeclaration(): GenericDeclaration {
      throw NotImplementedError(
         "An operation is not implemented: getGenericDeclaration() is not yet supported for type variables created from KType: ${this.typeParameter}"
      )
   }

   public override fun getDeclaredAnnotations(): Array<Annotation> {
      return arrayOfNulls(0)
   }

   public override operator fun equals(other: Any?): Boolean {
      return other is TypeVariable
         && this.getName() == (other as TypeVariable).getName()
         && this.getGenericDeclaration() == (other as TypeVariable).getGenericDeclaration()
      }

   public override fun hashCode(): Int {
      return this.getName().hashCode() xor this.getGenericDeclaration().hashCode()
   }

   init {
      this.typeParameter = typeParameter
   }

   public override fun getBounds(): Array<Type> {
      val `$this$toTypedArray$iv`: java.lang.Iterable = this.typeParameter.upperBounds
      val `destination$iv$iv`: java.util.Collection = ArrayList(CollectionsKt.collectionSizeOrDefault(`$this$toTypedArray$iv`, 10))

      for (`item$iv$iv` in `$this$toTypedArray$iv`) {
         `destination$iv$iv`.add(TypesJVMKt.access$computeJavaType(`item$iv$iv` as KType, true))
      }

      return (`destination$iv$iv` as java.util.List).toArray(arrayOfNulls(0))
   }

   public override fun <T : Annotation> getAnnotation(annotationClass: Class<Any>): Any? {
      return null
   }
}
