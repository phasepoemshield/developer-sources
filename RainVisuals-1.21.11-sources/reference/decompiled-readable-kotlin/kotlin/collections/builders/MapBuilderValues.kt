package kotlin.collections.builders

import kotlin.jvm.internal.markers.KMutableCollection

// $VF: Compiled from MapBuilder.kt
internal class MapBuilderValues<V> internal constructor(backing: MapBuilder<*, Any>)
   : AbstractMutableCollection<V>,
   java.util.Collection<V>,
   KMutableCollection {
   public final val backing: MapBuilder<*, Any>

   public override fun isEmpty(): Boolean {
      return this.backing.isEmpty()
   }

   init {
      this.backing = backing
   }

   public override fun retainAll(elements: Collection<Any>): Boolean {
      this.backing.checkIsMutable$kotlin_stdlib()
      return super.retainAll(elements)
   }

   public override fun removeAll(elements: Collection<Any>): Boolean {
      this.backing.checkIsMutable$kotlin_stdlib()
      return super.removeAll(elements)
   }

   public override fun add(element: Any): Boolean {
      throw UnsupportedOperationException()
   }

   public override operator fun iterator(): MutableIterator<Any> {
      return this.backing.valuesIterator$kotlin_stdlib() as MutableIterator<V>
   }

   public override fun addAll(elements: Collection<Any>): Boolean {
      throw UnsupportedOperationException()
   }

   public override fun remove(element: Any): Boolean {
      return this.backing.removeValue$kotlin_stdlib((V)element)
   }

   public override fun clear() {
      this.backing.clear()
   }

   public override operator fun contains(element: Any): Boolean {
      return this.backing.containsValue(element)
   }

   public open val size: Int
      public open get() {
         return this.backing.size()
      }

}
