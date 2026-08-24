package kotlin.internal

// $VF: Compiled from UProgressionUtil.kt
private fun differenceModulo(a: UInt, b: UInt, c: UInt): UInt {
   val ac: Int = Integer.remainderUnsigned(a, c)
   val bc: Int = Integer.remainderUnsigned(b, c)
   return if (Integer.compareUnsigned(ac, bc) >= 0)
      UInt.constructor_impl/* $VF was: constructor-impl */(ac - bc)
      else
      UInt.constructor_impl/* $VF was: constructor-impl */(UInt.constructor_impl/* $VF was: constructor-impl */(ac - bc) + c)
   }

@SinceKotlin(version = "1.3")
@PublishedApi
internal fun getProgressionLastElement(start: UInt, end: UInt, step: Int): UInt {
   val var10000: Int
   if (step > 0) {
      var10000 = if (Integer.compareUnsigned(start, end) >= 0)
         end
         else
         UInt.constructor_impl/* $VF was: constructor-impl */(
            end - differenceModulo_WZ9TVnA/* $VF was: differenceModulo-WZ9TVnA */(end, start, UInt.constructor_impl/* $VF was: constructor-impl */(step))
         )
      } else {
      if (step >= 0) {
         throw IllegalArgumentException("Step is zero.")
      }

      var10000 = if (Integer.compareUnsigned(start, end) <= 0)
         end
         else
         UInt.constructor_impl/* $VF was: constructor-impl */(
            end + differenceModulo_WZ9TVnA/* $VF was: differenceModulo-WZ9TVnA */(start, end, UInt.constructor_impl/* $VF was: constructor-impl */(-step))
         )
      }

   return var10000
}

@PublishedApi
@SinceKotlin(version = "1.3")
internal fun getProgressionLastElement(start: ULong, end: ULong, step: Long): ULong {
   val var10000: Long
   if (step > 0L) {
      var10000 = if (java.lang.Long.compareUnsigned(start, end) >= 0)
         end
         else
         ULong.constructor_impl/* $VF was: constructor-impl */(
            end - differenceModulo_sambcqE/* $VF was: differenceModulo-sambcqE */(end, start, ULong.constructor_impl/* $VF was: constructor-impl */(step))
         )
      } else {
      if (step >= 0L) {
         throw IllegalArgumentException("Step is zero.")
      }

      var10000 = if (java.lang.Long.compareUnsigned(start, end) <= 0)
         end
         else
         ULong.constructor_impl/* $VF was: constructor-impl */(
            end + differenceModulo_sambcqE/* $VF was: differenceModulo-sambcqE */(start, end, ULong.constructor_impl/* $VF was: constructor-impl */(-step))
         )
      }

   return var10000
}

private fun differenceModulo(a: ULong, b: ULong, c: ULong): ULong {
   val ac: Long = java.lang.Long.remainderUnsigned(a, c)
   val bc: Long = java.lang.Long.remainderUnsigned(b, c)
   return if (java.lang.Long.compareUnsigned(ac, bc) >= 0)
      ULong.constructor_impl/* $VF was: constructor-impl */(ac - bc)
      else
      ULong.constructor_impl/* $VF was: constructor-impl */(ULong.constructor_impl/* $VF was: constructor-impl */(ac - bc) + c)
   }
