package oxxxde

// $VF: Compiled from heavy
private class ذٌ(source: Map<Int, Map<Int, Float>>) {
   private final val values: FloatArray
   private final val keys: LongArray
   private final val mask: Int

   private fun pairKey(left: Int, right: Int): Long {
      return (long)left shl 32 or right and 4294967295L
   }

   init {
      var entries: Int = 0

      for (rightMap in source.values()) {
         entries += rightMap.size()
      }

      var var13: Byte = 2

      while (var13 < entries * 2) {
         var13 <<= 1
      }

      var var14: Int = 0
      val var5: Byte = var13
      val left: LongArray = LongArray(var13)

      while (var14 < var5) {
         left[var14] = java.lang.Long.MIN_VALUE
         var14++
      }

      this.keys = left
      this.values = FloatArray(var13)
      this.mask = var13 + -1

      for (var16 in source.entrySet()) {
         val var17: Int = (var16.getKey() as java.lang.Number).intValue()

         for (var9 in (var16.getValue() as java.util.Map).entrySet()) {
            this.put(this.pairKey(var17, (var9.getKey() as java.lang.Number).intValue()), (var9.getValue() as java.lang.Number).floatValue())
         }
      }
   }

   private fun put(key: Long, value: Float) {
      var index: Int = this.index(key)

      while (this.keys[index] != java.lang.Long.MIN_VALUE && this.keys[index] != key) {
         index = index + 1 and this.mask
      }

      this.keys[index] = key
      this.values[index] = value
   }

   public fun get(left: Int, right: Int): Float {
      val key: Long = this.pairKey(left, right)
      var index: Int = this.index(key)

      while (true) {
         val stored: Long = this.keys[index]
         if (this.keys[index] == java.lang.Long.MIN_VALUE) {
            return 0.0F
         }

         if (stored == key) {
            return this.values[index]
         }

         index = index + 1 and this.mask
      }
   }

   private fun index(key: Long): Int {
      return (int)((key xor key ushr 33) * -49064778989728563L xor (key xor key ushr 33) * -49064778989728563L ushr 33) and this.mask
   }
}
