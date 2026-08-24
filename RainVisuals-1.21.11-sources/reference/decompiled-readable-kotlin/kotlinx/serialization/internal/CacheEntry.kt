package kotlinx.serialization.internal

import kotlinx.serialization.KSerializer
import org.jetbrains.annotations.Nullable

// $VF: Compiled from Caching.kt
private class CacheEntry<T>(serializer: KSerializer<Any>?) {
   @JvmField
   @Nullable
   public final val serializer: KSerializer<Any>?

   init {
      this.serializer = serializer
   }
}
