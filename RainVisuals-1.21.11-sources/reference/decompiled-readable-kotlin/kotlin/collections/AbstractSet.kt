package kotlin.collections

import kotlin.jvm.internal.markers.KMappedMarker

// $VF: Compiled from AbstractSet.kt
@SinceKotlin(version = "1.1")
public abstract class AbstractSet<E> : AbstractCollection<E>, KMappedMarker, java.util.Set {
   override fun iterator(): MutableIterator<E> {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }

   public override operator fun equals(other: Any?): Boolean {
      return other === this || other is java.util.Set && Companion.setEquals$kotlin_stdlib(this, other as MutableSet<*>)
   }

   public override fun hashCode(): Int {
      return Companion.unorderedHashCode$kotlin_stdlib(this)
   }

   open fun AbstractSet() {
   }

   // $VF: Compiled from AbstractSet.kt
   internal companion object {
      internal fun unorderedHashCode(c: Collection<*>): Int {
         var hashCode: Byte = 0

         for (element in c) {
            hashCode += if (element != null) element.hashCode() else 0
         }

         return hashCode
      }

      internal fun setEquals(c: Set<*>, other: Set<*>): Boolean {
         return c.size() == other.size() && c.containsAll(other)
      }
   }
}
