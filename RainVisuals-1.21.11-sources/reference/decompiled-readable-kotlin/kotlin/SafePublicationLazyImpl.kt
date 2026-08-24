package kotlin

import java.io.Serializable
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater

// $VF: Compiled from LazyJVM.kt
private class SafePublicationLazyImpl<T>(initializer: () -> Any) : Serializable, Lazy {
   private final var _value: Any?

   private final var initializer: (() -> Any)?
      private set

   private final val final: Any

   public open val value: Any
      public open get() {
         if (this._value != UNINITIALIZED_VALUE.INSTANCE) {
            return (T)this._value
         } else {
            if (this.initializer != null) {
               val newValue: Any = this.initializer()
               if (valueUpdater.compareAndSet(this, UNINITIALIZED_VALUE.INSTANCE, newValue)) {
                  this.initializer = null
                  return (T)newValue
               }
            }

            return (T)this._value
         }
      }


   private fun writeReplace(): Any {
      return InitializedLazyImpl(this.value)
   }

   public override fun toString(): String {
      return if (this.isInitialized()) java.lang.String.valueOf(this.value) else "Lazy value not initialized yet."
   }

   public override fun isInitialized(): Boolean {
      return this._value != UNINITIALIZED_VALUE.INSTANCE
   }

   init {
      this.initializer = initializer
      this._value = UNINITIALIZED_VALUE.INSTANCE
      this.final = UNINITIALIZED_VALUE.INSTANCE
   }

   // $VF: Compiled from LazyJVM.kt
   public companion object {
      private final val valueUpdater: AtomicReferenceFieldUpdater<SafePublicationLazyImpl<*>, Any>
   }
}
