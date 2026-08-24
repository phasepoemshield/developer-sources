package kotakbaz.rain.client.draggable.animation

import oxxxde.رض
import oxxxde.سط

// $VF: Compiled from heavy
public class AnimationUtil {
   public final var duration: Long
      private set

   public final var toValue: Double
      private set

   private final var value: Double
   private Easing easing = Easing.LINEAR;

   public final var fromValue: Double
      private set

   private final var start: Long

   public fun run(valueTo: Double, duration: Long, easing: رض): سط {
      return this.run(valueTo, duration, easing, false)
   }

   public fun update(): Boolean {
      val alive: Boolean = this.alive()
      if (alive) {
         this.value = this.interpolate(this.fromValue, this.toValue, this.easing.apply(this.calculatePart()))
      } else {
         this.start = 0L
         this.value = this.toValue
      }

      return alive
   }

   private fun interpolate(start: Double, end: Double, delta: Double): Double {
      return start + (end - start) * delta
   }

   public fun get(): Float {
      return (float)this.value
   }

   public fun run(valueTo: Double, duration: Long, easing: رض, safe: Boolean): سط {
      if (!this.check(safe, valueTo)) {
         this.easing = easing
         this.duration = duration
         this.start = System.currentTimeMillis()
         this.fromValue = this.value
         this.toValue = valueTo
      }

      return this
   }

   private fun check(safe: Boolean, valueTo: Double): Boolean {
      return safe && this.alive() && (valueTo == this.fromValue || valueTo == this.toValue || valueTo == this.value)
   }

   public fun snap(value: Double) {
      this.value = value
      this.fromValue = value
      this.toValue = value
   }

   private fun calculatePart(): Double {
      return if (this.duration <= 0L) 1.0 else (double)(System.currentTimeMillis() - this.start) / this.duration
   }

   public fun finished(): Boolean {
      return this.calculatePart() >= 1.0
   }

   public fun run(valueTo: Float, duration: Long, easing: رض): سط {
      return this.run((double)valueTo, duration, easing, false)
   }

   public fun alive(): Boolean {
      return !this.finished()
   }
}
