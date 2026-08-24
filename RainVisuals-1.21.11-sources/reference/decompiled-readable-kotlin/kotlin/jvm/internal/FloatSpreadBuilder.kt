package kotlin.jvm.internal

// $VF: Compiled from PrimitiveSpreadBuilders.kt
public class FloatSpreadBuilder(size: Int) : PrimitiveSpreadBuilder(size) {
   private final val values: FloatArray

   init {
      this.values = FloatArray(size)
   }

   public fun add(value: Float) {
      val var10000: FloatArray = this.values
      val var2: Int = this.getPosition()
      this.setPosition(var2 + 1)
      var10000[var2] = value
   }

   public fun toArray(): FloatArray {
      return this.toArray(this.values, FloatArray(this.size()))
   }

   protected open fun FloatArray.getSize(): Int {
      return `$this$getSize`.length
   }
}
