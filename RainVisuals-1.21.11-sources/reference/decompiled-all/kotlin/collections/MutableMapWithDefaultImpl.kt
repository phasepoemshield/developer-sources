package kotlin.collections

import kotlin.collections.MutableMap.MutableEntry

// $VF: Compiled from MapWithDefault.kt
private class MutableMapWithDefaultImpl<K, V>(map: MutableMap<Any, Any>, default: (Any) -> Any) : MutableMapWithDefault<K, V> {
   public open val map: MutableMap<Any, Any>
   private final val default: (Any) -> Any

   public override operator fun get(key: Any): Any? {
      return this.map.get(key)
   }

   public override fun hashCode(): Int {
      return this.map.hashCode()
   }

   public override fun clear() {
      this.map.clear()
   }

   public override fun containsKey(key: Any): Boolean {
      return this.map.containsKey(key)
   }

   public override fun containsValue(value: Any): Boolean {
      return this.map.containsValue(value)
   }

   public open val entries: MutableSet<MutableEntry<Any, Any>>
      public open get() {
         return this.map.entrySet()
      }


   public override fun remove(key: Any): Any? {
      return this.map.remove(key)
   }

   public override fun isEmpty(): Boolean {
      return this.map.isEmpty()
   }

   public open val keys: MutableSet<Any>
      public open get() {
         return this.map.keySet()
      }


   init {
      this.map = map
      this.default = mapx
   }

   public open val values: MutableCollection<Any>
      public open get() {
         return this.map.values()
      }


   public override operator fun equals(other: Any?): Boolean {
      return this.map.equals(other)
   }

   public override fun toString(): String {
      return this.map.toString()
   }

   public override fun getOrImplicitDefault(key: Any): Any {
      val `$this$getOrElseNullable$iv`: java.util.Map = this.map
      val `value$iv`: Any = `$this$getOrElseNullable$iv`.get(key)
      return (V)(if (`value$iv` == null && !`$this$getOrElseNullable$iv`.containsKey(key)) this.default((K)key) else `value$iv`)
   }

   public override fun put(key: Any, value: Any): Any? {
      return this.map.put((K)key, (V)value)
   }

   public override fun putAll(from: Map<out Any, Any>) {
      this.map.putAll(from)
   }

   public open val size: Int
      public open get() {
         return this.map.size()
      }

}
