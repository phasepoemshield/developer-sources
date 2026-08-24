package kotlin.collections

import java.io.Serializable
import kotlin.jvm.internal.markers.KMappedMarker

// $VF: Compiled from Maps.kt
private object EmptyMap : Serializable, KMappedMarker, java.util.Map {
   private const val serialVersionUID: Long = 8246714829545688274L

   public open operator fun get(key: Any?): Nothing? {
      return null
   }

   override fun clear() {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }

   public open val entries: Set<kotlin.collections.Map.Entry<Any?, Nothing>>
      public open get() {
         return EmptySet.INSTANCE
      }


   public override fun toString(): String {
      return "{}"
   }

   public override operator fun equals(other: Any?): Boolean {
      return other is java.util.Map && (other as java.util.Map).isEmpty()
   }

   public override fun isEmpty(): Boolean {
      return true
   }

   public open val values: Collection<Nothing>
      public open get() {
         return EmptyList.INSTANCE
      }


   fun remove(key: Any): Void {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }

   private fun readResolve(): Any {
      return INSTANCE
   }

   public open val keys: Set<Any?>
      public open get() {
         return EmptySet.INSTANCE
      }


   public open fun containsValue(value: Nothing): Boolean {
      return false
   }

   override fun putAll(from: java.util.Map) {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }

   public override fun hashCode(): Int {
      return 0
   }

   public open val size: Int
      public open get() {
         return 0
      }


   public override fun containsKey(key: Any?): Boolean {
      return false
   }

   fun put(key: Any, value: Void): Void {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }
}
