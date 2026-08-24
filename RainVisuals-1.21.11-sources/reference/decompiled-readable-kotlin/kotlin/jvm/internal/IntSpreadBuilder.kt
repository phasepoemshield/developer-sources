package kotlin.jvm.internal

// $VF: Compiled from PrimitiveSpreadBuilders.kt
public class IntSpreadBuilder(size: Int) : PrimitiveSpreadBuilder(size) {
   private final val values: IntArray

   public fun toArray(): IntArray {
      return this.toArray(this.values, IntArray(this.size()))
   }

   public fun add(value: Int) {
      val var10000: IntArray = this.values
      val var2: Int = this.getPosition()
      this.setPosition(var2 + 1)
      var10000[var2] = value
   }

   init {
      this.values = IntArray(size)
   }

   protected open fun IntArray.getSize(): Int {
      return `$this$getSize`.length
   }
}
