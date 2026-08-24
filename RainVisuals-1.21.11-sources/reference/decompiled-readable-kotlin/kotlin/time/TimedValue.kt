package kotlin.time

// $VF: Compiled from measureTime.kt
@SinceKotlin(version = "1.9")
@WasExperimental(markerClass = [ExperimentalTime::class])
public data class TimedValue<T>(value: Any, duration: Duration) : TimedValue((T)value, duration) {
   public final val value: Any
   public final val duration: Duration

   public fun copy(value: Any = ..., duration: Duration = ...): TimedValue<Any> {
      return TimedValue<>(value, duration, null)
   }

   public override operator fun equals(other: Any?): Boolean {
      label28@
      if (this === other) {
         return true
      } else {
         return other is TimedValue
            && this.value == (other as TimedValue).value
            && Duration.equals_impl0/* $VF was: equals-impl0 */(this.duration, (other as TimedValue).duration)
         }
   }

   public override fun hashCode(): Int {
      return (if (this.value == null) 0 else this.value.hashCode()) * 31 + Duration.hashCode_impl/* $VF was: hashCode-impl */(this.duration)
   }

   fun TimedValue(value: T, duration: Long) {
      this.value = (T)value
      this.duration = duration
   }

   public operator fun component2(): Duration {
      return this.duration
   }

   public operator fun component1(): Any {
      return this.value
   }

   public override fun toString(): String {
      return "TimedValue(value=${this.value}, duration=${Duration.toString_impl/* $VF was: toString-impl */(this.duration)})"
   }
}
