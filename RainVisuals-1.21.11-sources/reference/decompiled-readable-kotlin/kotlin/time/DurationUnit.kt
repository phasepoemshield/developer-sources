package kotlin.time

import java.util.concurrent.TimeUnit
import kotlin.enums.EnumEntries

// $VF: Compiled from DurationUnitJvm.kt
@WasExperimental(markerClass = [ExperimentalTime::class])
@SinceKotlin(version = "1.6")
public enum class DurationUnit(timeUnit: TimeUnit) {
   HOURS(TimeUnit.HOURS),
   MINUTES(TimeUnit.MINUTES),
   SECONDS(TimeUnit.SECONDS),
   NANOSECONDS(TimeUnit.NANOSECONDS),
   DAYS(TimeUnit.DAYS),
   MICROSECONDS(TimeUnit.MICROSECONDS),
   MILLISECONDS(TimeUnit.MILLISECONDS);

   internal final val timeUnit: TimeUnit

   @JvmStatic
   fun getEntries(): EnumEntries<DurationUnit> {
      $ENTRIES
   }

   init {
      this.timeUnit = timeUnit
   }
}
