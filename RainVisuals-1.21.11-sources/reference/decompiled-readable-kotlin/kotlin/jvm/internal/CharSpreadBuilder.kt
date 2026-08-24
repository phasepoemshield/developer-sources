package kotlin.jvm.internal

// $VF: Compiled from PrimitiveSpreadBuilders.kt
public class CharSpreadBuilder(size: Int) : PrimitiveSpreadBuilder(size) {
   private final val values: CharArray

   protected open fun CharArray.getSize(): Int {
      return `$this$getSize`.length
   }

   init {
      this.values = CharArray(size)
   }

   public fun add(value: Char) {
      val var10000: CharArray = this.values
      val var2: Int = this.getPosition()
      this.setPosition(var2 + 1)
      var10000[var2] = value
   }

   public fun toArray(): CharArray {
      return this.toArray(this.values, CharArray(this.size()))
   }
}
