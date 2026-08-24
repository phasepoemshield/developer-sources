package kotlinx.serialization.internal

// $VF: Compiled from Caching.kt
@SuppressAnimalSniffer
private class ClassValueReferences<T> : ClassValue<MutableSoftReference<T>> {
   protected open fun computeValue(type: Class<*>): MutableSoftReference<Any> {
      return MutableSoftReference<>()
   }

   public inline fun getOrSet(key: Class<*>, crossinline factory: () -> Any): Any {
      val var10000: Any = this.get(key)
      val var7: Any = (var10000 as MutableSoftReference).reference.get()
      return (T)(var7 ?: (var10000 as MutableSoftReference).getOrSetWithLock(      // $VF: Compiled from Caching.kt
{
         return (T)factory()
      } as () -> T))
   }
}
