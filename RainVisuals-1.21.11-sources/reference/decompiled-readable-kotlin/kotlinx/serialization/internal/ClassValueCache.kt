package kotlinx.serialization.internal

import kotlin.reflect.KClass
import kotlinx.serialization.KSerializer

// $VF: Compiled from Caching.kt
private class ClassValueCache<T>(compute: (KClass<*>) -> KSerializer<Any>?) : SerializerCache<T> {
   private final val classValue: ClassValueReferences<CacheEntry<Any>>
   public final val compute: (KClass<*>) -> KSerializer<Any>?

   public override fun get(key: KClass<Any>): KSerializer<Any>? {
      val var10000: Any = this.classValue.get(java)
      val var8: Any = (var10000 as MutableSoftReference).reference.get()
      return ((var8 ?: (var10000 as MutableSoftReference).getOrSetWithLock(ClassValueCache$get$$inlined$getOrSet$1(this, key))) as CacheEntry).serializer
   }

   init {
      this.compute = compute
      this.classValue = ClassValueReferences<>()
   }
}
