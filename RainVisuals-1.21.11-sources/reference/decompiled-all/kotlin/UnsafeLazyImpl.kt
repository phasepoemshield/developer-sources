package kotlin

import java.io.Serializable
import kotlin.jvm.functions.Function0

// $VF: Compiled from Lazy.kt
internal class UnsafeLazyImpl<T>(initializer: () -> Any) : Serializable, Lazy {
   private final var initializer: (() -> Any)?
      private set

   private final var _value: Any?

   public override fun toString(): String {
      return if (this.isInitialized()) java.lang.String.valueOf(this.value) else "Lazy value not initialized yet."
   }

   private fun writeReplace(): Any {
      return InitializedLazyImpl(this.value)
   }

   public override fun isInitialized(): Boolean {
      return this._value != UNINITIALIZED_VALUE.INSTANCE
   }

   init {
      this.initializer = initializer
      this._value = UNINITIALIZED_VALUE.INSTANCE
   }

   public open val value: Any
      public open get() {
         if (this._value === UNINITIALIZED_VALUE.INSTANCE) {
            val var10001: Function0 = this.initializer
            this._value = var10001()
            this.initializer = null
         }

         return (T)this._value
      }

}
