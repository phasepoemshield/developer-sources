package kotlin.jvm.internal

// $VF: Compiled from PrimitiveSpreadBuilders.kt
public class LongSpreadBuilder(size: Int) : PrimitiveSpreadBuilder(size) {
   private final val values: LongArray

   protected open fun LongArray.getSize(): Int {
      return `$this$getSize`.length
   }

   init {
      this.values = LongArray(size)
   }

   public fun add(value: Long) {
      val var10000: LongArray = this.values
      val var3: Int = this.getPosition()
      this.setPosition(var3 + 1)
      var10000[var3] = value
   }

   public fun toArray(): LongArray {
      return this.toArray(this.values, LongArray(this.size()))
   }
}
