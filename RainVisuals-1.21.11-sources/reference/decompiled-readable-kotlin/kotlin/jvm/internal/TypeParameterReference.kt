package kotlin.jvm.internal

import kotlin.reflect.KType
import kotlin.reflect.KTypeParameter
import kotlin.reflect.KVariance

// $VF: Compiled from TypeParameterReference.kt
@SinceKotlin(version = "1.4")
public class TypeParameterReference(container: Any?, name: String, variance: KVariance, isReified: Boolean) : KTypeParameter {
   public open val isReified: Boolean
   private final val container: Any?
   private final var bounds: List<KType>?
   public open val name: String
   public open val variance: KVariance

   public open val upperBounds: List<KType>
      public open get() {
         var var10000: java.util.List = this.bounds
         if (this.bounds == null) {
            val var1: java.util.List = CollectionsKt.listOf(Reflection.nullableTypeOf(Object.class))
            this.bounds = var1
            var10000 = var1
         }

         return var10000
      }


   public override fun hashCode(): Int {
      return (if (this.container != null) this.container.hashCode() else 0) * 31 + this.name.hashCode()
   }

   public fun setUpperBounds(upperBounds: List<KType>) {
      if (this.bounds != null) {
         throw IllegalStateException(("Upper bounds of type parameter '$this' have already been initialized.").toString())
      } else {
         this.bounds = upperBounds
      }
   }

   public override operator fun equals(other: Any?): Boolean {
      return other is TypeParameterReference
         && this.container == (other as TypeParameterReference).container
         && this.name == (other as TypeParameterReference).name
      }

   init {
      this.container = container
      this.name = name
      this.variance = variance
      this.isReified = isReified
   }

   public override fun toString(): String {
      return Companion.toString(this)
   }

   // $VF: Compiled from TypeParameterReference.kt
   public companion object {
      public fun toString(typeParameter: KTypeParameter): String {
         val var2: StringBuilder = StringBuilder()
         when (TypeParameterReference.Companion.WhenMappings.$EnumSwitchMapping$0[typeParameter.variance.ordinal()]) {
            1 -> {}
            2 -> var2.append("in ")
            3 -> var2.append("out ")
            else -> {}
         }

         var2.append(typeParameter.name)
         val var10000: java.lang.String = var2.toString()
         return var10000
      }
   }
}
