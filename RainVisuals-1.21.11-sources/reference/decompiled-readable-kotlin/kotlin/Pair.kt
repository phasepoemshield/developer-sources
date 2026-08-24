package kotlin

import java.io.Serializable

// $VF: Compiled from Tuples.kt
public data class Pair<A, B>(first: Any, second: Any) : Serializable {
   public final val first: Any
   public final val second: Any

   public operator fun component1(): Any {
      return this.first
   }

   init {
      this.first = (A)first
      this.second = (B)second
   }

   public fun copy(first: Any = this.first, second: Any = this.second): Pair<Any, Any> {
      return Pair<>((A)first, (B)second)
   }

   public override fun hashCode(): Int {
      return (if (this.first == null) 0 else this.first.hashCode()) * 31 + (if (this.second == null) 0 else this.second.hashCode())
   }

   public override operator fun equals(other: Any?): Boolean {
      label28@
      if (this === other) {
         return true
      } else {
         return other is Pair && this.first == (other as Pair).first && this.second == (other as Pair).second
      }
   }

   public operator fun component2(): Any {
      return this.second
   }

   public override fun toString(): String {
      return "(${this.first}, ${this.second})"
   }
}
