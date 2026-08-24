package kotlin.reflect

// $VF: Compiled from KTypeProjection.kt
@SinceKotlin(version = "1.1")
public data class KTypeProjection(variance: KVariance?, type: KType?) {
   public final val variance: KVariance?
   public final val type: KType?

   public operator fun component2(): KType? {
      return this.type
   }

   init {
      this.variance = variance
      this.type = type
      if (this.variance == null != (this.type == null)) {
         throw IllegalArgumentException(
            (if (this.variance == null)
                  "Star projection must have no type specified."
                  else
                  "The projection variance ${this.variance} requires type to be specified.")
               .toString()
         )
      }
   }

   public operator fun component1(): KVariance? {
      return this.variance
   }

   public fun copy(variance: KVariance? = this.variance, type: KType? = this.type): KTypeProjection {
      return KTypeProjection(variance, type)
   }

   public override fun hashCode(): Int {
      return (if (this.variance == null) 0 else this.variance.hashCode()) * 31 + (if (this.type == null) 0 else this.type.hashCode())
   }

   public override fun toString(): String {
      var var10000: java.lang.String
      when (if (this.variance == null) -1 else KTypeProjection.WhenMappings.$EnumSwitchMapping$0[this.variance.ordinal()]) {
         -1 -> var10000 = "*"
         0 -> throw NoWhenBranchMatchedException()
         1 -> var10000 = java.lang.String.valueOf(this.type)
         2 -> var10000 = "in ${this.type}"
         3 -> var10000 = "out ${this.type}"
         else -> throw NoWhenBranchMatchedException()
      }

      return var10000
   }

   public override operator fun equals(other: Any?): Boolean {
      label28@
      if (this === other) {
         return true
      } else {
         return other is KTypeProjection && this.variance === (other as KTypeProjection).variance && this.type == (other as KTypeProjection).type
      }
   }

   // $VF: Compiled from KTypeProjection.kt
   public companion object {
      @PublishedApi
      internal final val star: KTypeProjection

      public final val STAR: KTypeProjection
         public final get() {
            return KTypeProjection.star
         }


      public fun invariant(type: KType): KTypeProjection {
         return KTypeProjection(KVariance.INVARIANT, type)
      }

      public fun contravariant(type: KType): KTypeProjection {
         return KTypeProjection(KVariance.IN, type)
      }

      public fun covariant(type: KType): KTypeProjection {
         return KTypeProjection(KVariance.OUT, type)
      }
   }
}
