package kotlin.collections.builders

import java.io.NotSerializableException
import java.io.Serializable
import kotlin.jvm.internal.markers.KMutableSet

// $VF: Compiled from SetBuilder.kt
internal class SetBuilder<E> internal constructor(backing: MapBuilder<Any, *>) : AbstractMutableSet<E>, java.util.Set<E>, KMutableSet, Serializable {
   private final val backing: MapBuilder<Any, *>

   public override fun isEmpty(): Boolean {
      return this.backing.isEmpty()
   }

   private fun writeReplace(): Any {
      if (this.backing.isReadOnly) {
         return SerializedCollection(this, 1)
      } else {
         throw NotSerializableException("The set cannot be serialized while it is being built.")
      }
   }

   public override operator fun contains(element: Any): Boolean {
      return this.backing.containsKey(element)
   }

   public override operator fun iterator(): MutableIterator<Any> {
      return this.backing.keysIterator$kotlin_stdlib() as MutableIterator<E>
   }

   public override fun addAll(elements: Collection<Any>): Boolean {
      this.backing.checkIsMutable$kotlin_stdlib()
      return super.addAll(elements)
   }

   public constructor() : this(MapBuilder<>())
   public override fun add(element: Any): Boolean {
      return this.backing.addKey$kotlin_stdlib((E)element) >= 0
   }

   public override fun clear() {
      this.backing.clear()
   }

   public open val size: Int
      public open get() {
         return this.backing.size()
      }


   public override fun retainAll(elements: Collection<Any>): Boolean {
      this.backing.checkIsMutable$kotlin_stdlib()
      return super.retainAll(elements)
   }

   public override fun remove(element: Any): Boolean {
      return this.backing.removeKey$kotlin_stdlib((E)element) >= 0
   }

   public fun build(): Set<Any> {
      this.backing.build()
      return if (this.size() > 0) this else Empty
   }

   public constructor(initialCapacity: Int) : this(MapBuilder<>(initialCapacity))
   public override fun removeAll(elements: Collection<Any>): Boolean {
      this.backing.checkIsMutable$kotlin_stdlib()
      return super.removeAll(elements)
   }

   init {
      this.backing = backing
   }

   // $VF: Compiled from SetBuilder.kt
   private companion object {
      private final val Empty: SetBuilder<Nothing>
   }
}
