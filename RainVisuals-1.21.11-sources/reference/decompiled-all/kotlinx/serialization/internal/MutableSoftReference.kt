package kotlinx.serialization.internal

import java.lang.ref.SoftReference
import org.jetbrains.annotations.NotNull

// $VF: Compiled from Caching.kt
private class MutableSoftReference<T> {
   @JvmField
   @NotNull
   public final var reference: SoftReference<Any> = SoftReference(null)
      private set

   @Synchronized
   public fun getOrSetWithLock(factory: () -> Any): Any {
      val var10000: Any = this.reference.get()
      if (var10000 != null) {
         return (T)var10000
      } else {
         val value: Any = factory()
         this.reference = SoftReference<>((T)value)
         return (T)value
      }
   }
}
