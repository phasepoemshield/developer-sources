package kotlin.collections

import kotlin.jvm.internal.markers.KMappedMarker

// $VF: Compiled from Iterators.kt
internal class IndexingIterator<T>(iterator: Iterator<Any>) : KMappedMarker, java.util.Iterator {
   private final var index: Int
   private final val iterator: Iterator<Any>

   override fun remove() {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }

   public operator fun next(): IndexedValue<Any> {
      val var10000: IndexedValue = IndexedValue
      val var2: Int = this.index++
      if (var2 < 0) {
         CollectionsKt.throwIndexOverflow()
      }

      var10000./* $VF: Unable to resugar constructor */<init>(var2, this.iterator.next())
      return var10000
   }

   public override operator fun hasNext(): Boolean {
      return this.iterator.hasNext()
   }

   init {
      this.iterator = iterator
   }
}
