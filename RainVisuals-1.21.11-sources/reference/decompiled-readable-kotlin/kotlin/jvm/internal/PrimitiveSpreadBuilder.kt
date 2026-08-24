package kotlin.jvm.internal

// $VF: Compiled from PrimitiveSpreadBuilders.kt
public abstract class PrimitiveSpreadBuilder<T> {
   protected final var position: Int
   private final val size: Int
   private final val spreads: Array<Any?>

   protected fun toArray(values: Any, result: Any): Any {
      var dstIndex: Int = 0
      var copyValuesFrom: Int = 0
      val var5: IntIterator = IntRange(0, this.size - 1).iterator()

      while (var5.hasNext()) {
         val i: Int = var5.nextInt()
         val spreadArgument: Any = this.spreads[i]
         if (this.spreads[i] != null) {
            if (copyValuesFrom < i) {
               System.arraycopy(values, copyValuesFrom, result, dstIndex, i - copyValuesFrom)
               dstIndex += i - copyValuesFrom
            }

            val spreadSize: Int = this.getSize((T)spreadArgument)
            System.arraycopy(spreadArgument, 0, result, dstIndex, spreadSize)
            dstIndex += spreadSize
            copyValuesFrom = i + 1
         }
      }

      if (copyValuesFrom < this.size) {
         System.arraycopy(values, copyValuesFrom, result, dstIndex, this.size - copyValuesFrom)
      }

      return (T)result
   }

   open fun PrimitiveSpreadBuilder(size: Int) {
      this.size = size
      this.spreads = (T[])arrayOfNulls(this.size)
   }

   protected fun size(): Int {
      var totalLength: Byte = 0
      val var2: IntIterator = IntRange(0, this.size - 1).iterator()

      while (var2.hasNext()) {
         val i: Int = var2.nextInt()
         totalLength += if (this.spreads[i] != null) this.getSize(this.spreads[i]) else 1
      }

      return totalLength
   }

   public fun addSpread(spreadArgument: Any) {
      this.spreads[this.position++] = (T)spreadArgument
   }

   protected abstract fun Any.getSize(): Int {
   }
}
