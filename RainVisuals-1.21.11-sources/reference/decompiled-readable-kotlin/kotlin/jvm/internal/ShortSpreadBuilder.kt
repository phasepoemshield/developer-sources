package kotlin.jvm.internal

// $VF: Compiled from PrimitiveSpreadBuilders.kt
public class ShortSpreadBuilder(size: Int) : PrimitiveSpreadBuilder(size) {
   private final val values: ShortArray

   protected open fun ShortArray.getSize(): Int {
      return `$this$getSize`.length
   }

   public fun toArray(): ShortArray {
      return this.toArray(this.values, ShortArray(this.size()))
   }

   public fun add(value: Short) {
      val var10000: ShortArray = this.values
      val var2: Int = this.getPosition()
      this.setPosition(var2 + 1)
      var10000[var2] = value
   }

   init {
      this.values = ShortArray(size)
   }
}
