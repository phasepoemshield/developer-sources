package kotlin

import java.io.Serializable

// $VF: Compiled from Lazy.kt
internal class InitializedLazyImpl<T>(value: Any) : Lazy<T>, Serializable {
   public open val value: Any

   public override fun toString(): String {
      return java.lang.String.valueOf(this.value)
   }

   init {
      this.value = (T)value
   }

   public override fun isInitialized(): Boolean {
      return true
   }
}
