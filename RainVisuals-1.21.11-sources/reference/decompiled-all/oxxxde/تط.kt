package oxxxde

// $VF: Compiled from heavy
private class تط(x: Double, y: Double, z: Double, size: Float, lifeTimeMillis: Long, spawnDurationMillis: Long, dieDurationMillis: Long) {
   private final val createdAt: Long
   private final val sizeAnimation: سط
   private final var isBack: Boolean
   private final val lifeTimeMillis: Long
   public final val y: Double
   private final val alphaAnimation: سط
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
      this.alphaAnimation.run(if (this.isBack) 0.0 else 1.0, duration, رض.SINE_OUT)
      this.sizeAnimation.run(target, duration, رض.SINE_OUT)
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
      this.alphaAnimation = سط()
      this.sizeAnimation = سط()
   }
}
