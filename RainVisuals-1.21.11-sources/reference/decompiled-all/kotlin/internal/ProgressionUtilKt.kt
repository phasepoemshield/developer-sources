package kotlin.internal

// $VF: Compiled from progressionUtil.kt
private fun differenceModulo(a: Long, b: Long, c: Long): Long {
   return mod(mod(a, c) - mod(b, c), c)
}

private fun mod(a: Int, b: Int): Int {
   return if (a % b >= 0) a % b else a % b + b
}

@PublishedApi
internal fun getProgressionLastElement(start: Long, end: Long, step: Long): Long {
   val var10000: Long
   if (step > 0L) {
      var10000 = if (start >= end) end else end - differenceModulo(end, start, step)
   } else {
      if (step >= 0L) {
         throw IllegalArgumentException("Step is zero.")
      }

      var10000 = if (start <= end) end else end + differenceModulo(start, end, -step)
   }

   return var10000
}

private fun differenceModulo(a: Int, b: Int, c: Int): Int {
   return mod(mod(a, c) - mod(b, c), c)
}

private fun mod(a: Long, b: Long): Long {
   return if (a % b >= 0L) a % b else a % b + b
}

@PublishedApi
internal fun getProgressionLastElement(start: Int, end: Int, step: Int): Int {
   val var10000: Int
   if (step > 0) {
      var10000 = if (start >= end) end else end - differenceModulo(end, start, step)
   } else {
      if (step >= 0) {
         throw IllegalArgumentException("Step is zero.")
      }

      var10000 = if (start <= end) end else end + differenceModulo(start, end, -step)
   }

   return var10000
}
