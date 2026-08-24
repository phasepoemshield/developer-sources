package kotlin.jvm.internal

// $VF: Compiled from PrimitiveSpreadBuilders.kt
public class BooleanSpreadBuilder(size: Int) : PrimitiveSpreadBuilder(size) {
   private final val values: BooleanArray

   public fun add(value: Boolean) {
      val var10000: BooleanArray = this.values
      val var2: Int = this.getPosition()
      this.setPosition(var2 + 1)
      var10000[var2] = value
   }

   public fun toArray(): BooleanArray {
      return this.toArray(this.values, BooleanArray(this.size()))
   }

   protected open fun BooleanArray.getSize(): Int {
      return `$this$getSize`.length
   }

   init {
      this.values = BooleanArray(size)
   }
}
