package kotlin.collections

import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.CollectionToArray
import kotlin.jvm.internal.markers.KMappedMarker

// $VF: Compiled from AbstractCollection.kt
@SinceKotlin(version = "1.1")
public abstract class AbstractCollection<E> : KMappedMarker, java.util.Collection {
   protected override fun <T> toArray(array: Array<Any>): Array<Any> {
      return (T[])CollectionToArray.toArray(this, array)
   }

   open fun AbstractCollection() {
   }

   public abstract override operator fun iterator(): Iterator<Any> {
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

            if (!this.contains((E)var4.next())) {
               var10000 = false
               break
            }
         }
      }

      return var10000
   }

   public override operator fun contains(element: Any): Boolean {
      val `$this$any$iv`: java.lang.Iterable = this
      var var10000: Boolean
      if (this is java.util.Collection && this.isEmpty()) {
         var10000 = false
      } else {
         val var4: java.util.Iterator = `$this$any$iv`.iterator()

         while (true) {
            if (!var4.hasNext()) {
               var10000 = false
               break
            }

            if (var4.next() == element) {
               var10000 = true
               break
            }
         }
      }

      return var10000
   }

   protected override fun toArray(): Array<Any?> {
      return CollectionToArray.toArray(this)
   }

   override fun retainAll(elements: MutableCollection<Any>): Boolean {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }

   override fun removeAll(elements: MutableCollection<Any>): Boolean {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }

   override fun clear() {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }

   public override fun isEmpty(): Boolean {
      return this.size() == 0
   }

   override fun addAll(elements: MutableCollection<E>): Boolean {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }

   override fun add(element: E): Boolean {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }

   public abstract val size: Int

   public override fun toString(): String {
      return CollectionsKt.joinToString$default(this, ", ", "[", "]", 0, null,       // $VF: Compiled from AbstractCollection.kt
{ it: Any ->
         return if (it === AbstractCollection.this) "(this Collection)" else java.lang.String.valueOf(it)
      } as Function1, 24, null)
   }

   override fun remove(element: Any): Boolean {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }
}
