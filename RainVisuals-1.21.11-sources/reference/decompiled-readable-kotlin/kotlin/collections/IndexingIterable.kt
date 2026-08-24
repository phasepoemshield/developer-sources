package kotlin.collections

import kotlin.jvm.internal.markers.KMappedMarker

// $VF: Compiled from Iterables.kt
internal class IndexingIterable<T>(iteratorFactory: () -> Iterator<Any>) : java.lang.Iterable<IndexedValue<? extends T>>, KMappedMarker {
   private final val iteratorFactory: () -> Iterator<Any>

   public override operator fun iterator(): Iterator<IndexedValue<Any>> {
      return IndexingIterator<>(this.iteratorFactory())
   }

   init {
      this.iteratorFactory = iteratorFactory
   }
}
