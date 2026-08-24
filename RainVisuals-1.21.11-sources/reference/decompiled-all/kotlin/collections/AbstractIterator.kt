package kotlin.collections

import java.util.NoSuchElementException
import kotlin.jvm.internal.markers.KMappedMarker

// $VF: Compiled from AbstractIterator.kt
public abstract class AbstractIterator<T> : KMappedMarker, java.util.Iterator {
   private final var nextValue: Any?
   private final var state: State = State.NotReady

   protected abstract fun computeNext() {
   }

   override fun remove() {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }

   public override operator fun next(): Any {
      if (!this.hasNext()) {
         throw NoSuchElementException()
      } else {
         this.state = State.NotReady
         return this.nextValue
      }
   }

   private fun tryToComputeNext(): Boolean {
      this.state = State.Failed
      this.computeNext()
      return this.state === State.Ready
   }

   protected fun setNext(value: Any) {
      this.nextValue = (T)value
      this.state = State.Ready
   }

   protected fun done() {
      this.state = State.Done
   }

   public override operator fun hasNext(): Boolean {
      if (this.state === State.Failed) {
         throw IllegalArgumentException("Failed requirement.".toString())
      } else {
         var var10000: Boolean
         when (AbstractIterator.WhenMappings.$EnumSwitchMapping$0[this.state.ordinal()]) {
            1 -> var10000 = false
            2 -> var10000 = true
            else -> var10000 = this.tryToComputeNext()
         }

         return var10000
      }
   }
}
