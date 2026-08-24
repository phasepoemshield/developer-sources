package oxxxde

// $VF: Compiled from heavy
private class تت {
   private final var nextIndex: Int
   private final val values: FloatArray
   private final val keys: LongArray

   init {
      var var1: Int = 0
      val var2: LongArray = LongArray(4)

      while (var1 < 4) {
         var2[var1] = java.lang.Long.MIN_VALUE
         var1++
      }

      this.keys = var2
      this.values = FloatArray(4)
   }

   public fun get(key: Long): Float {
      var index: Int = 0

      for (var4 in this.keys.length..index) {
         if (this.keys[index] == key) {
            return this.values[index]
         }
      }

      return java.lang.Float.NaN
   }

   public fun put(key: Long, value: Float) {
      this.keys[this.nextIndex] = key
      this.values[this.nextIndex] = value
      this.nextIndex = (this.nextIndex + 1) % this.keys.length
   }
}
