@file:JvmName(name = "DurationConversionsJDK8Kt")

package kotlin.time.jdk8

import kotlin.internal.InlineOnly
import kotlin.time.Duration
import kotlin.time.DurationKt
import kotlin.time.DurationUnit
import kotlin.time.ExperimentalTime

// $VF: Compiled from DurationConversions.kt
@SinceKotlin(version = "1.6")
@InlineOnly
@WasExperimental(markerClass = [ExperimentalTime::class])
public inline fun Duration.toJavaDuration(): java.time.Duration {
   val var10000: java.time.Duration = java.time.Duration.ofSeconds(inWholeSeconds, (long)nanosecondsComponent)
   return var10000
}

@InlineOnly
@WasExperimental(markerClass = [ExperimentalTime::class])
@SinceKotlin(version = "1.6")
public inline fun java.time.Duration.toKotlinDuration(): Duration {
   return Duration.plus_LRDsOJo/* $VF was: plus-LRDsOJo */(
      DurationKt.toDuration(`$this$toKotlinDuration`.getSeconds(), DurationUnit.SECONDS),
      DurationKt.toDuration(`$this$toKotlinDuration`.getNano(), DurationUnit.NANOSECONDS)
   )
}
