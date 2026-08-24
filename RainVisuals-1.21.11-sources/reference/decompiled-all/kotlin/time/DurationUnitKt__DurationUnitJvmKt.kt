@file:JvmMultifileClass
@file:JvmName("DurationUnitKt")

package kotlin.time

import java.util.concurrent.TimeUnit

// $VF: Compiled from DurationUnitJvm.kt
open fun DurationUnitKt__DurationUnitJvmKt() {
}

@SinceKotlin(version = "1.8")
@WasExperimental(markerClass = [ExperimentalTime::class])
public fun DurationUnit.toTimeUnit(): TimeUnit {
   return `$this$toTimeUnit`.timeUnit
}

@WasExperimental(markerClass = [ExperimentalTime::class])
@SinceKotlin(version = "1.8")
public fun TimeUnit.toDurationUnit(): DurationUnit {
   var var10000: DurationUnit
   when (DurationUnitKt__DurationUnitJvmKt.WhenMappings.$EnumSwitchMapping$0[`$this$toDurationUnit`.ordinal()]) {
      1 -> var10000 = DurationUnit.NANOSECONDS
      2 -> var10000 = DurationUnit.MICROSECONDS
      3 -> var10000 = DurationUnit.MILLISECONDS
      4 -> var10000 = DurationUnit.SECONDS
      5 -> var10000 = DurationUnit.MINUTES
      6 -> var10000 = DurationUnit.HOURS
      7 -> var10000 = DurationUnit.DAYS
      else -> throw NoWhenBranchMatchedException()
   }

   return var10000
}

@SinceKotlin(version = "1.5")
internal fun convertDurationUnit(value: Long, sourceUnit: DurationUnit, targetUnit: DurationUnit): Long {
   return targetUnit.timeUnit.convert(value, sourceUnit.timeUnit)
}

@SinceKotlin(version = "1.3")
internal fun convertDurationUnit(value: Double, sourceUnit: DurationUnit, targetUnit: DurationUnit): Double {
   val sourceInTargets: Long = targetUnit.timeUnit.convert(1L, sourceUnit.timeUnit)
   return if (sourceInTargets > 0L) value * sourceInTargets else value / sourceUnit.timeUnit.convert(1L, targetUnit.timeUnit)
}

@SinceKotlin(version = "1.5")
internal fun convertDurationUnitOverflow(value: Long, sourceUnit: DurationUnit, targetUnit: DurationUnit): Long {
   return targetUnit.timeUnit.convert(value, sourceUnit.timeUnit)
}
