package kotlin.reflect

import java.lang.reflect.ParameterizedType
import java.lang.reflect.Type
import java.util.Arrays

// $VF: Compiled from TypesJVM.kt
@ExperimentalStdlibApi
private class ParameterizedTypeImpl(rawType: Class<*>, ownerType: Type?, typeArguments: List<Type>) : ParameterizedType, TypeImpl {
   private final val typeArguments: Array<Type>
   private final val rawType: Class<*>
   private final val ownerType: Type?

   init {
      this.rawType = rawType
      this.ownerType = ownerType
      this.typeArguments = typeArguments.toArray(arrayOfNulls(0))
   }

   public override fun toString(): String {
      return this.getTypeName()
   }

   public override fun getTypeName(): String {
      val var1: StringBuilder = StringBuilder()
      if (this.ownerType != null) {
         var1.append(TypesJVMKt.access$typeToString(this.ownerType))
         var1.append("$")
         var1.append(this.rawType.getSimpleName())
      } else {
         var1.append(TypesJVMKt.access$typeToString(this.rawType))
      }

      if (this.typeArguments.length != 0) {
         ArraysKt.joinTo$default(this.typeArguments, var1, null, "<", ">", 0, null, <unrepresentable>.INSTANCE, 50, null)
      }

      val var10000: java.lang.String = var1.toString()
      return var10000
   }

   public override operator fun equals(other: Any?): Boolean {
      return other is ParameterizedType
         && this.rawType == (other as ParameterizedType).getRawType()
         && this.ownerType == (other as ParameterizedType).getOwnerType()
         && Arrays.equals(this.getActualTypeArguments(), (other as ParameterizedType).getActualTypeArguments())
      }

   public override fun getOwnerType(): Type? {
      return this.ownerType
   }

   public override fun getRawType(): Type {
      return this.rawType
   }

   public override fun getActualTypeArguments(): Array<Type> {
      return this.typeArguments
   }

   public override fun hashCode(): Int {
      return this.rawType.hashCode() xor (if (this.ownerType != null) this.ownerType.hashCode() else 0) xor Arrays.hashCode(this.getActualTypeArguments())
   }
}
