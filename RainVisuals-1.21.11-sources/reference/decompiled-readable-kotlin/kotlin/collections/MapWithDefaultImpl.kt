package kotlin.collections

// $VF: Compiled from MapWithDefault.kt
private class MapWithDefaultImpl<K, V>(map: Map<Any, Any>, default: (Any) -> Any) : MapWithDefault<K, V> {
   public open val map: Map<Any, Any>
   private final val default: (Any) -> Any

   override fun remove(key: Any): V {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }

   override fun putAll(from: MutableMap<K, V>) {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }

   public open val keys: Set<Any>
      public open get() {
         return this.map.keySet()
      }


   public override fun toString(): String {
      return this.map.toString()
   }

   override fun put(value: K, key: V): V {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }

   public override fun isEmpty(): Boolean {
      return this.map.isEmpty()
   }

   public open val entries: Set<kotlin.collections.Map.Entry<Any, Any>>
      public open get() {
         return this.map.entrySet()
      }


   override fun clear() {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }

   public override operator fun equals(other: Any?): Boolean {
      return this.map.equals(other)
   }

   public override operator fun get(key: Any): Any? {
      return this.map.get(key)
   }

   public open val values: Collection<Any>
      public open get() {
         return this.map.values()
      }


   public override fun containsKey(key: Any): Boolean {
      return this.map.containsKey(key)
   }

   init {
      this.map = map
      this.default = mapx
   }

   public override fun getOrImplicitDefault(key: Any): Any {
      val `$this$getOrElseNullable$iv`: java.util.Map = this.map
      val `value$iv`: Any = `$this$getOrElseNullable$iv`.get(key)
      return (V)(if (`value$iv` == null && !`$this$getOrElseNullable$iv`.containsKey(key)) this.default((K)key) else `value$iv`)
   }

   public override fun hashCode(): Int {
      return this.map.hashCode()
   }

   public override fun containsValue(value: Any): Boolean {
      return this.map.containsValue(value)
   }

   public open val size: Int
      public open get() {
         return this.map.size()
      }

}
