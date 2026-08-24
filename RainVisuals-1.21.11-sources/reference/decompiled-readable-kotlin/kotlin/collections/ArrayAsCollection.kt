package kotlin.collections

import kotlin.jvm.internal.ArrayIteratorKt
import kotlin.jvm.internal.CollectionToArray
import kotlin.jvm.internal.markers.KMappedMarker

// $VF: Compiled from Collections.kt
private class ArrayAsCollection<T>(vararg values: Any, isVarargs: Boolean) : KMappedMarker, java.util.Collection {
   public final val values: Array<out Any>
   public final val isVarargs: Boolean

   public override fun toArray(): Array<out Any?> {
      return CollectionsKt.copyToArrayOfAny(this.values, this.isVarargs)
   }

   override fun retainAll(elements: MutableCollection<Any>): Boolean {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }

   override fun <T> toArray(array: Array<T>): Array<T> {
      CollectionToArray.toArray(this, array)
   }

   override fun removeAll(elements: MutableCollection<Any>): Boolean {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }

   public override fun containsAll(elements: Collection<Any>): Boolean {
      val `$this$all$iv`: java.lang.Iterable = elements
      var var10000: Boolean
      if ((elements as java.util.Collection).isEmpty()) {
         var10000 = true
      } else {
         val var4: java.util.Iterator = `$this$all$iv`.iterator()

         while (true) {
            if (!var4.hasNext()) {
               var10000 = true
               break
            }

            if (!this.contains(var4.next())) {
               var10000 = false
               break
            }
         }
      }

      return var10000
   }

   public open val size: Int
      public open get() {
         return this.values.length
      }


   public override fun isEmpty(): Boolean {
      return this.values.length == 0
   }

   override fun remove(element: Any): Boolean {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }

   public override operator fun contains(element: Any): Boolean {
      return ArraysKt.contains(this.values, element)
   }

   override fun addAll(elements: MutableCollection<T>): Boolean {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }

   init {
      this.values = (T[])values
      this.isVarargs = isVarargs
   }

   override fun add(element: T): Boolean {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }

   public override operator fun iterator(): Iterator<Any> {
      return ArrayIteratorKt.iterator(this.values)
   }

   override fun clear() {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }
}
