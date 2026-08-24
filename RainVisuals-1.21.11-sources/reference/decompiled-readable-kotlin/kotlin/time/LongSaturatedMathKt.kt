package kotlin.time

// $VF: Compiled from longSaturatedMath.kt
private fun infinityOfSign(value: Long): Duration {
   return if (value < 0L) Duration.Companion.NEG_INFINITE else Duration.Companion.INFINITE
}

internal fun saturatingAdd(value: Long, unit: DurationUnit, duration: Duration): Long {
   val durationInUnit: Long = Duration.toLong_impl/* $VF was: toLong-impl */(duration, unit)
   if ((value - 1L or 1L) == java.lang.Long.MAX_VALUE) {
      return checkInfiniteSumDefined_PjuGub4/* $VF was: checkInfiniteSumDefined-PjuGub4 */(value, duration, durationInUnit)
   } else if ((durationInUnit - 1L or 1L) == java.lang.Long.MAX_VALUE) {
      return saturatingAddInHalves_NuflL3o/* $VF was: saturatingAddInHalves-NuflL3o */(value, unit, duration)
   } else {
      val var11: Long = value + durationInUnit
      if (((value xor value + durationInUnit) and (durationInUnit xor value + durationInUnit)) < 0L) {
         return if (value < 0L) java.lang.Long.MIN_VALUE else java.lang.Long.MAX_VALUE
      } else {
         return var11
      }
   }
}

private fun saturatingAddInHalves(value: Long, unit: DurationUnit, duration: Duration): Long {
   val half: Long = Duration.div_UwyO8pc/* $VF was: div-UwyO8pc */(duration, 2)
   val halfInUnit: Long = Duration.toLong_impl/* $VF was: toLong-impl */(half, unit)
   return if ((halfInUnit - 1L or 1L) == java.lang.Long.MAX_VALUE)
      halfInUnit
      else
      saturatingAdd_NuflL3o/* $VF was: saturatingAdd-NuflL3o */(
         saturatingAdd_NuflL3o/* $VF was: saturatingAdd-NuflL3o */(value, unit, half), unit, Duration.minus_LRDsOJo/* $VF was: minus-LRDsOJo */(duration, half)
      )
   }

private fun checkInfiniteSumDefined(value: Long, duration: Duration, durationInUnit: Long): Long {
   if (Duration.isInfinite_impl/* $VF was: isInfinite-impl */(duration) && (value xor durationInUnit) < 0L) {
      throw IllegalArgumentException("Summing infinities of different signs")
   } else {
      return value
   }
}

internal fun saturatingOriginsDiff(origin1: Long, origin2: Long, unit: DurationUnit): Duration {
   if ((origin2 - 1L or 1L) == java.lang.Long.MAX_VALUE) {
      return if (origin1 == origin2) Duration.Companion.ZERO else Duration.unaryMinus_UwyO8pc/* $VF was: unaryMinus-UwyO8pc */(infinityOfSign(origin2))
   } else {
      return if ((origin1 - 1L or 1L) == java.lang.Long.MAX_VALUE) infinityOfSign(origin1) else saturatingFiniteDiff(origin1, origin2, unit)
   }
}

internal inline fun Long.isSaturated(): Boolean {
   return (`$this$isSaturated` - 1L or 1L) == java.lang.Long.MAX_VALUE
}

private fun saturatingFiniteDiff(value1: Long, value2: Long, unit: DurationUnit): Duration {
   val result: Long = value1 - value2
   if (((value1 - value2 xor value1) and (value1 - value2 xor value2).inv()) < 0L) {
      if (unit.compareTo(DurationUnit.MILLISECONDS) < 0) {
         val unitsInMilli: Long = DurationUnitKt.convertDurationUnit(1L, DurationUnit.MILLISECONDS, unit)
         return Duration.plus_LRDsOJo/* $VF was: plus-LRDsOJo */(
            DurationKt.toDuration(value1 / unitsInMilli - value2 / unitsInMilli, DurationUnit.MILLISECONDS),
            DurationKt.toDuration(value1 % unitsInMilli - value2 % unitsInMilli, unit)
         )
      } else {
         return Duration.unaryMinus_UwyO8pc/* $VF was: unaryMinus-UwyO8pc */(infinityOfSign(result))
      }
   } else {
      return DurationKt.toDuration(result, unit)
   }
}

internal fun saturatingDiff(valueNs: Long, origin: Long, unit: DurationUnit): Duration {
   return if ((origin - 1L or 1L) == java.lang.Long.MAX_VALUE)
      Duration.unaryMinus_UwyO8pc/* $VF was: unaryMinus-UwyO8pc */(infinityOfSign(origin))
      else
      saturatingFiniteDiff(valueNs, origin, unit)
   }
