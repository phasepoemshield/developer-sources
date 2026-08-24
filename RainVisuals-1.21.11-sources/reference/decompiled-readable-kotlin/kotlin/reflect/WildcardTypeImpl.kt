package kotlin.reflect

import java.lang.reflect.Type
import java.lang.reflect.WildcardType
import java.util.Arrays

// $VF: Compiled from TypesJVM.kt
@ExperimentalStdlibApi
private class WildcardTypeImpl(upperBound: Type?, lowerBound: Type?) : TypeImpl, WildcardType {
   private final val lowerBound: Type?
   private final val upperBound: Type?

   public override operator fun equals(other: Any?): Boolean {
      return other is WildcardType
         && Arrays.equals(this.getUpperBounds(), (other as WildcardType).getUpperBounds())
         && Arrays.equals(this.getLowerBounds(), (other as WildcardType).getLowerBounds())
      }

   public override fun toString(): String {
      return this.getTypeName()
   }

   public override fun hashCode(): Int {
      return Arrays.hashCode(this.getUpperBounds()) xor Arrays.hashCode(this.getLowerBounds())
   }

   init {
      this.upperBound = upperBound
      this.lowerBound = lowerBound
   }

   public override fun getUpperBounds(): Array<Type> {
      val var1: Array<Type> = arrayOfNulls(1)
      var var10002: Type = this.upperBound
      if (this.upperBound == null) {
         var10002 = Object::class.java
      }

      var1[0] = var10002
      return var1
   }

   public override fun getTypeName(): String {
      return if (this.lowerBound != null)
         "? super ${TypesJVMKt.access$typeToString(this.lowerBound)}"
         else
         (if (this.upperBound != null && !(this.upperBound == Object::class.java)) "? extends ${TypesJVMKt.access$typeToString(this.upperBound)}" else "?")
      }

   public override fun getLowerBounds(): Array<Type> {
      return if (this.lowerBound == null) arrayOfNulls(0) else arrayOf(this.lowerBound)
   }

   // $VF: Compiled from TypesJVM.kt
   public companion object {
      public final val STAR: WildcardTypeImpl
   }
}
