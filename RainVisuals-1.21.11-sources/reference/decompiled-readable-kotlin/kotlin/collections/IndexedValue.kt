package kotlin.collections

// $VF: Compiled from IndexedValue.kt
public data class IndexedValue<T>(index: Int, value: Any) {
   public final val index: Int
   public final val value: Any

   init {
      this.index = index
      this.value = (T)value
   }

   public override operator fun equals(other: Any?): Boolean {
      label28@
      if (this === other) {
         return true
      } else {
         return other is IndexedValue && this.index == (other as IndexedValue).index && this.value == (other as IndexedValue).value
      }
   }

   public override fun toString(): String {
      return "IndexedValue(index=${this.index}, value=${this.value})"
   }

   public operator fun component1(): Int {
      return this.index
   }

   public fun copy(index: Int = this.index, value: Any = this.value): IndexedValue<Any> {
      return IndexedValue<>(index, (T)value)
   }

   public operator fun component2(): Any {
      return this.value
   }

   public override fun hashCode(): Int {
      return Integer.hashCode(this.index) * 31 + (if (this.value == null) 0 else this.value.hashCode())
   }
}
