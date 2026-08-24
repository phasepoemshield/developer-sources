package kotakbaz.rain.module.setting.settings

import kotakbaz.rain.module.setting.Setting
import oxxxde.طُ

// $VF: Compiled from heavy
public class SliderSetting(name: String, initialValue: Float, min: Float, max: Float, step: Float = 0.0F, configKey: String = name) : Setting(
      name, RangesKt.coerceIn(initialValue, min, max), configKey
   ) {
   public final val min: Float
   public final val step: Float
   public final val max: Float

   public fun setClamped(raw: Float) {
      var clamped: Float = RangesKt.coerceIn(raw, this.min, this.max)
      if (this.step > 0.0F) {
         clamped = RangesKt.coerceIn(this.min + (float)Math.rint((double)((clamped - this.min) / this.step)) * this.step, this.min, this.max)
      }

      this.set(clamped)
   }

   public fun progress(): Float {
      val range: Float = this.max - this.min
      return if (this.max - this.min <= 0.0F) 0.0F else RangesKt.coerceIn((this.getValue().floatValue() - this.min) / range, 0.0F, 1.0F)
   }

   init {
      this.min = min
      this.max = max
      this.step = step
      if (!(this.max >= this.min)) {
         throw IllegalArgumentException("max must be >= min".toString())
      }
   }

   public open fun setVisible(condition: () -> Boolean): طُ {
      super.setVisible(condition)
      return this
   }
}
