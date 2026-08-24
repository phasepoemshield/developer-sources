package kotlin.collections

import java.util.NoSuchElementException
import kotlin.jvm.internal.markers.KMappedMarker

// $VF: Compiled from Collections.kt
internal object EmptyIterator : KMappedMarker, java.util.ListIterator {
   fun add(element: Void) {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }

   public override fun hasPrevious(): Boolean {
      return false
   }

   public open fun previous(): Nothing {
      throw NoSuchElementException()
   }

   override fun remove() {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }

   fun set(element: Void) {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }

   public open operator fun next(): Nothing {
      throw NoSuchElementException()
   }

   public override operator fun hasNext(): Boolean {
      return false
   }

   public override fun previousIndex(): Int {
      return -1
   }

   public override fun nextIndex(): Int {
      return 0
   }
}
