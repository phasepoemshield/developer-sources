package kotakbaz.rain.module.modules.render

import kotakbaz.rain.client.draggable.animation.AnimationUtil
import kotakbaz.rain.client.draggable.animation.Easing

// $VF: Compiled from heavy
private class `JumpCircleModule$Circle`(x: Double, y: Double, z: Double, size: Float, lifeTimeMillis: Long, spawnDurationMillis: Long, dieDurationMillis: Long) {
   private final val createdAt: Long
   private AnimationUtil sizeAnimation;
   private final var isBack: Boolean
   private final val lifeTimeMillis: Long
   public final val y: Double
   private AnimationUtil alphaAnimation;
   private final val spawnDurationMillis: Long
   public final val size: Float
   public final val z: Double
   private final val dieDurationMillis: Long
   public final val x: Double

   public fun updateAnimations() {
      this.alphaAnimation.update()
      this.sizeAnimation.update()
      val duration: Long = RangesKt.coerceAtLeast(if (this.isBack) this.dieDurationMillis else this.spawnDurationMillis, 1L)
      val target: Double = if (this.isBack) 0.0 else 1.0
      this.alphaAnimation.run(if (this.isBack) 0.0 else 1.0, duration, Easing.SINE_OUT)
      this.sizeAnimation.run(target, duration, Easing.SINE_OUT)
   }

   public fun alpha(): Float {
      return RangesKt.coerceIn(this.alphaAnimation.get(), 0.0F, 1.0F)
   }

   public fun update(): Boolean {
      this.isBack = System.currentTimeMillis() - this.createdAt >= this.spawnDurationMillis + this.lifeTimeMillis
      return this.isBack && this.alphaAnimation.get() <= 0.0F
   }

   public fun scale(): Float {
      return RangesKt.coerceIn(this.sizeAnimation.get(), 0.0F, 1.0F)
   }

   init {
      this.x = x
      this.y = y
      this.z = z
      this.size = size
      this.lifeTimeMillis = lifeTimeMillis
      this.spawnDurationMillis = spawnDurationMillis
      this.dieDurationMillis = dieDurationMillis
      this.createdAt = System.currentTimeMillis()
      this.alphaAnimation = AnimationUtil()
      this.sizeAnimation = AnimationUtil()
   }
}
