package kotlin.time

import kotlin.contracts.InvocationKind
import kotlin.time.TimeSource.Monotonic

// $VF: Compiled from measureTime.kt
@WasExperimental(markerClass = [ExperimentalTime::class])
@SinceKotlin(version = "1.9")
public inline fun TimeSource.measureTime(block: () -> Unit): Duration {
   contract {
      callsInPlace(block, InvocationKind.EXACTLY_ONCE)
   }

   val mark: TimeMark = `$this$measureTime`.markNow()
   block()
   return mark.elapsedNow_UwyO8pc/* $VF was: elapsedNow-UwyO8pc */()
}

@WasExperimental(markerClass = [ExperimentalTime::class])
@SinceKotlin(version = "1.9")
public inline fun <T> Monotonic.measureTimedValue(block: () -> Any): TimedValue<Any> {
   contract {
      callsInPlace(block, InvocationKind.EXACTLY_ONCE)
   }

   return TimedValue(
      block(),
      TimeSource.Monotonic.ValueTimeMark.elapsedNow_UwyO8pc/* $VF was: elapsedNow-UwyO8pc */(
         `$this$measureTimedValue`.markNow_z9LOYto/* $VF was: markNow-z9LOYto */()
      ),
      null
   )
}

@SinceKotlin(version = "1.9")
@WasExperimental(markerClass = [ExperimentalTime::class])
public inline fun <T> measureTimedValue(block: () -> Any): TimedValue<Any> {
   contract {
      callsInPlace(block, InvocationKind.EXACTLY_ONCE)
   }

   return TimedValue(
      block(),
      TimeSource.Monotonic.ValueTimeMark.elapsedNow_UwyO8pc/* $VF was: elapsedNow-UwyO8pc */(
         TimeSource.Monotonic.INSTANCE.markNow_z9LOYto/* $VF was: markNow-z9LOYto */()
      ),
      null
   )
}

@SinceKotlin(version = "1.9")
@WasExperimental(markerClass = [ExperimentalTime::class])
public inline fun Monotonic.measureTime(block: () -> Unit): Duration {
   contract {
      callsInPlace(block, InvocationKind.EXACTLY_ONCE)
   }

   val mark: Long = `$this$measureTime`.markNow_z9LOYto/* $VF was: markNow-z9LOYto */()
   block()
   return TimeSource.Monotonic.ValueTimeMark.elapsedNow_UwyO8pc/* $VF was: elapsedNow-UwyO8pc */(mark)
}

@WasExperimental(markerClass = [ExperimentalTime::class])
@SinceKotlin(version = "1.9")
public inline fun measureTime(block: () -> Unit): Duration {
   contract {
      callsInPlace(block, InvocationKind.EXACTLY_ONCE)
   }

   val `mark$iv`: Long = TimeSource.Monotonic.INSTANCE.markNow_z9LOYto/* $VF was: markNow-z9LOYto */()
   block()
   return TimeSource.Monotonic.ValueTimeMark.elapsedNow_UwyO8pc/* $VF was: elapsedNow-UwyO8pc */(`mark$iv`)
}

@SinceKotlin(version = "1.9")
@WasExperimental(markerClass = [ExperimentalTime::class])
public inline fun <T> TimeSource.measureTimedValue(block: () -> Any): TimedValue<Any> {
   contract {
      callsInPlace(block, InvocationKind.EXACTLY_ONCE)
   }

   return TimedValue(block(), `$this$measureTimedValue`.markNow().elapsedNow_UwyO8pc/* $VF was: elapsedNow-UwyO8pc */(), null)
}
