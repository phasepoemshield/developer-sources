package kotlin.collections

import java.util.Map.Entry
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.markers.KMappedMarker

// $VF: Compiled from AbstractMap.kt
@SinceKotlin(version = "1.1")
public abstract class AbstractMap<K, V> : KMappedMarker, java.util.Map {
   private final var _keys: Set<Any>?

   private final var _values: Collection<Any>?
      private set

   public open val size: Int
      public open get() {
         return this.entrySet().size()
      }


   public override fun isEmpty(): Boolean {
      return this.size() == 0
   }

   public override operator fun equals(other: Any?): Boolean {
      if (other === this) {
         return true
      } else if (other !is java.util.Map) {
         return false
      } else if (this.size() != (other as java.util.Map).size()) {
         return false
      } else {
         val `$this$all$iv`: java.lang.Iterable = (other as java.util.Map).entrySet()
         var var10000: Boolean
         if (`$this$all$iv` is java.util.Collection && (`$this$all$iv` as java.util.Collection).isEmpty()) {
            var10000 = true
         } else {
            val var4: java.util.Iterator = `$this$all$iv`.iterator()

            while (true) {
               if (!var4.hasNext()) {
                  var10000 = true
                  break
               }

               if (!this.containsEntry$kotlin_stdlib(var4.next() as MutableMap.MutableEntry<*, *>)) {
                  var10000 = false
                  break
               }
            }
         }

         return var10000
      }
   }

   public open val values: Collection<Any>
      public open get() {
         if (this._values == null) {
            this._values =             // $VF: Compiled from AbstractMap.kt
object : AbstractCollection<Any> {
               public override operator fun iterator(): Iterator<Any> {
                  val entryIterator: java.util.Iterator = AbstractMap.this.entrySet().iterator()
                  return                   // $VF: Compiled from AbstractMap.kt
object : Iterator<Any> {
                     public override operator fun hasNext(): Boolean {
                        return entryIterator.hasNext()
                     }

                     public override operator fun next(): Any {
                        return (V)(entryIterator.next() as Entry).getValue()
                     }

                     override fun remove() {
                        throw UnsupportedOperationException("Operation is not supported for read-only collection")
                     }
                  }
               }

               public open val size: Int
                  public open get() {
                     return AbstractMap.this.size()
                  }


               public override operator fun contains(element: Any): Boolean {
                  return AbstractMap.this.containsValue(element)
               }
            }
         }

         val var10000: java.util.Collection = this._values
         return var10000
      }


   public open val keys: Set<Any>
      public open get() {
         if (this._keys == null) {
            this._keys =             // $VF: Compiled from AbstractMap.kt
object : AbstractSet<Any> {
               public override operator fun contains(element: Any): Boolean {
                  return AbstractMap.this.containsKey(element)
               }

               public open val size: Int
                  public open get() {
                     return AbstractMap.this.size()
                  }


               public override operator fun iterator(): Iterator<Any> {
                  val entryIterator: java.util.Iterator = AbstractMap.this.entrySet().iterator()
                  return                   // $VF: Compiled from AbstractMap.kt
object : Iterator<Any> {
                     public override operator fun next(): Any {
                        return (K)(entryIterator.next() as Entry).getKey()
                     }

                     override fun remove() {
                        throw UnsupportedOperationException("Operation is not supported for read-only collection")
                     }

                     public override operator fun hasNext(): Boolean {
                        return entryIterator.hasNext()
                     }
                  }
               }
            }
         }

         val var10000: java.util.Set = this._keys
         return var10000
      }


   open fun AbstractMap() {
   }

   override fun put(value: K, key: V): V {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }

   public override fun hashCode(): Int {
      return this.entrySet().hashCode()
   }

   override fun remove(key: Any): V {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }

   public override fun containsValue(value: Any): Boolean {
      val `$this$any$iv`: java.lang.Iterable = this.entrySet()
      var var10000: Boolean
      if (`$this$any$iv` is java.util.Collection && (`$this$any$iv` as java.util.Collection).isEmpty()) {
         var10000 = false
      } else {
         val var4: java.util.Iterator = `$this$any$iv`.iterator()

         while (true) {
            if (!var4.hasNext()) {
               var10000 = false
               break
            }

            if ((var4.next() as Entry).getValue() == value) {
               var10000 = true
               break
            }
         }
      }

      return var10000
   }

   private fun toString(entry: kotlin.collections.Map.Entry<Any, Any>): String {
      return "${this.toString(entry.getKey())}=${this.toString(entry.getValue())}"
   }

   override fun clear() {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }

   override fun putAll(from: MutableMap<K, V>) {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }

   public override operator fun get(key: Any): Any? {
      val var10000: Entry = this.implFindEntry((K)key)
      return (V)(if (var10000 != null) var10000.getValue() else null)
   }

   internal fun containsEntry(entry: kotlin.collections.Map.Entry<*, *>?): Boolean {
      if (entry == null) {
         return false
      } else {
         val key: Any = entry.getKey()
         val value: Any = entry.getValue()
         var var10000: java.util.Map = this
         val ourValue: Any = var10000.get(key)
         if (!(value == ourValue)) {
            return false
         } else {
            if (ourValue == null) {
               var10000 = this
               if (!var10000.containsKey(key)) {
                  return false
               }
            }

            return true
         }
      }
   }

   public override fun toString(): String {
      return CollectionsKt.joinToString$default(this.entrySet(), ", ", "{", "}", 0, null,       // $VF: Compiled from AbstractMap.kt
{ it: kotlin.collections.Map.Entry<Any, Any> ->
         return AbstractMap.this.toString(it)
      } as Function1, 24, null)
   }

   private fun implFindEntry(key: Any): kotlin.collections.Map.Entry<Any, Any>? {
      val var4: java.util.Iterator = this.entrySet().iterator()

      var var10000: Any
      while (true) {
         if (var4.hasNext()) {
            val `element$iv`: Any = var4.next()
            if (!((`element$iv` as Entry).getKey() == key)) {
               continue
            }

            var10000 = `element$iv`
            break
         }

         var10000 = null
         break
      }

      return var10000 as MutableMap.MutableEntry<K, V>
   }

   abstract fun getEntries(): java.util.Set

   public override fun containsKey(key: Any): Boolean {
      return this.implFindEntry((K)key) != null
   }

   private fun toString(o: Any?): String {
      return if (o === this) "(this Map)" else java.lang.String.valueOf(o)
   }

   // $VF: Compiled from AbstractMap.kt
   internal companion object {
      internal fun entryEquals(e: kotlin.collections.Map.Entry<*, *>, other: Any?): Boolean {
         return other is Entry && e.getKey() == (other as Entry).getKey() && e.getValue() == (other as Entry).getValue()
      }

      internal fun entryToString(e: kotlin.collections.Map.Entry<*, *>): String {
         return "${e.getKey()}=${e.getValue()}"
      }

      internal fun entryHashCode(e: kotlin.collections.Map.Entry<*, *>): Int {
         var var10000: Int = (int)e.getKey()
         var10000 = if (var10000 != null) var10000.hashCode() else 0
         val var10001: Any = e.getValue()
         return var10000 xor (if (var10001 != null) var10001.hashCode() else 0)
      }
   }
}
