package kotlin.random

// $VF: Compiled from URandom.kt
@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
public fun Random.nextUInt(range: UIntRange): UInt {
   if (range.isEmpty()) {
      throw IllegalArgumentException("Cannot get random in empty range: $range")
   } else {
      return if (Integer.compareUnsigned(range.getLast_pVg5ArA/* $VF was: getLast-pVg5ArA */(), -1) < 0)
         nextUInt_a8DCA5k/* $VF was: nextUInt-a8DCA5k */(
            `$this$nextUInt`,
            range.getFirst_pVg5ArA/* $VF was: getFirst-pVg5ArA */(),
            UInt.constructor_impl/* $VF was: constructor-impl */(range.getLast_pVg5ArA/* $VF was: getLast-pVg5ArA */() + 1)
         )
         else
         (
            if (Integer.compareUnsigned(range.getFirst_pVg5ArA/* $VF was: getFirst-pVg5ArA */(), 0) > 0)
               UInt.constructor_impl/* $VF was: constructor-impl */(
                  nextUInt_a8DCA5k/* $VF was: nextUInt-a8DCA5k */(
                        `$this$nextUInt`,
                        UInt.constructor_impl/* $VF was: constructor-impl */(range.getFirst_pVg5ArA/* $VF was: getFirst-pVg5ArA */() - 1),
                        range.getLast_pVg5ArA/* $VF was: getLast-pVg5ArA */()
                     )
                     + 1
               )
               else
               nextUInt(`$this$nextUInt`)
         )
      }
}

@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
public fun Random.nextULong(range: ULongRange): ULong {
   if (range.isEmpty()) {
      throw IllegalArgumentException("Cannot get random in empty range: $range")
   } else {
      return if (java.lang.Long.compareUnsigned(range.getLast_s_VKNKU/* $VF was: getLast-s-VKNKU */(), -1L) < 0)
         nextULong_jmpaW_c/* $VF was: nextULong-jmpaW-c */(
            `$this$nextULong`,
            range.getFirst_s_VKNKU/* $VF was: getFirst-s-VKNKU */(),
            ULong.constructor_impl/* $VF was: constructor-impl */(
               range.getLast_s_VKNKU/* $VF was: getLast-s-VKNKU */() + ULong.constructor_impl/* $VF was: constructor-impl */((long)1 and 4294967295L)
            )
         )
         else
         (
            if (java.lang.Long.compareUnsigned(range.getFirst_s_VKNKU/* $VF was: getFirst-s-VKNKU */(), 0L) > 0)
               ULong.constructor_impl/* $VF was: constructor-impl */(
                  nextULong_jmpaW_c/* $VF was: nextULong-jmpaW-c */(
                        `$this$nextULong`,
                        ULong.constructor_impl/* $VF was: constructor-impl */(
                           range.getFirst_s_VKNKU/* $VF was: getFirst-s-VKNKU */()
                              - ULong.constructor_impl/* $VF was: constructor-impl */((long)1 and 4294967295L)
                        ),
                        range.getLast_s_VKNKU/* $VF was: getLast-s-VKNKU */()
                     )
                     + ULong.constructor_impl/* $VF was: constructor-impl */((long)1 and 4294967295L)
               )
               else
               nextULong(`$this$nextULong`)
         )
      }
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public fun Random.nextUBytes(size: Int): UByteArray {
   return UByteArray.constructor_impl/* $VF was: constructor-impl */(`$this$nextUBytes`.nextBytes(size))
}

@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
public fun Random.nextULong(): ULong {
   return ULong.constructor_impl/* $VF was: constructor-impl */(`$this$nextULong`.nextLong())
}

@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
public fun Random.nextULong(until: ULong): ULong {
   return nextULong_jmpaW_c/* $VF was: nextULong-jmpaW-c */(`$this$nextULong_u2dV1Xi4fY`, 0L, until)
}

@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public fun Random.nextUBytes(array: UByteArray, fromIndex: Int = ..., toIndex: Int = ...): UByteArray {
   `$this$nextUBytes_u2dWvrt4B4`.nextBytes(array, fromIndex, toIndex)
   return array
}

internal fun checkULongRangeBounds(from: ULong, until: ULong) {
   if (java.lang.Long.compareUnsigned(until, from) <= 0) {
      throw IllegalArgumentException(
         RandomKt.boundsErrorMessage(ULong.box_impl/* $VF was: box-impl */(from), ULong.box_impl/* $VF was: box-impl */(until)).toString()
      )
   }
}

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public fun Random.nextUBytes(array: UByteArray): UByteArray {
   `$this$nextUBytes_u2dEVgfTAA`.nextBytes(array)
   return array
}

internal fun checkUIntRangeBounds(from: UInt, until: UInt) {
   if (Integer.compareUnsigned(until, from) <= 0) {
      throw IllegalArgumentException(
         RandomKt.boundsErrorMessage(UInt.box_impl/* $VF was: box-impl */(from), UInt.box_impl/* $VF was: box-impl */(until)).toString()
      )
   }
}

@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@SinceKotlin(version = "1.5")
public fun Random.nextUInt(): UInt {
   return UInt.constructor_impl/* $VF was: constructor-impl */(`$this$nextUInt`.nextInt())
}

@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
public fun Random.nextUInt(until: UInt): UInt {
   return nextUInt_a8DCA5k/* $VF was: nextUInt-a8DCA5k */(`$this$nextUInt_u2dqCasIEU`, 0, until)
}

@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@SinceKotlin(version = "1.5")
public fun Random.nextULong(from: ULong, until: ULong): ULong {
   checkULongRangeBounds_eb3DHEI/* $VF was: checkULongRangeBounds-eb3DHEI */(from, until)
   return ULong.constructor_impl/* $VF was: constructor-impl */(
      `$this$nextULong_u2djmpaW_u2dc`.nextLong(from xor java.lang.Long.MIN_VALUE, until xor java.lang.Long.MIN_VALUE) xor java.lang.Long.MIN_VALUE
   )
}

@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
public fun Random.nextUInt(from: UInt, until: UInt): UInt {
   checkUIntRangeBounds_J1ME1BU/* $VF was: checkUIntRangeBounds-J1ME1BU */(from, until)
   return UInt.constructor_impl/* $VF was: constructor-impl */(
      `$this$nextUInt_u2da8DCA5k`.nextInt(from xor Integer.MIN_VALUE, until xor Integer.MIN_VALUE) xor Integer.MIN_VALUE
   )
}
