package kotakbaz.rain.module.modules.render

import net.minecraft.util.math.Vec3d

// $VF: Compiled from heavy
private data class `WorldParticlesModule$WorldParticle` {
   public final var lastRetargetAtNanos: Long
   public final var rotation: Float
   public final var size: Float
   public final val driftPhase: Double
   private Vec3d target;
   private Vec3d position;
   public final val createdAtNanos: Long
   public final var alpha: Float
   public final val baseSize: Float
   private Vec3d velocity;
   public final var angularVelocity: Float

   public operator fun component11(): Float {
      return this.size
   }

   public override operator fun equals(other: Any?): Boolean {
      label82@
      if (this === other) {
         return true
      } else {
         return other is WorldParticlesModule$WorldParticle
            && this.position == (other as WorldParticlesModule$WorldParticle).position
            && this.target == (other as WorldParticlesModule$WorldParticle).target
            && this.velocity == (other as WorldParticlesModule$WorldParticle).velocity
            && this.createdAtNanos == (other as WorldParticlesModule$WorldParticle).createdAtNanos
            && this.lastRetargetAtNanos == (other as WorldParticlesModule$WorldParticle).lastRetargetAtNanos
            && java.lang.Float.compare(this.baseSize, (other as WorldParticlesModule$WorldParticle).baseSize) == 0
            && java.lang.Double.compare(this.driftPhase, (other as WorldParticlesModule$WorldParticle).driftPhase) == 0
            && java.lang.Float.compare(this.rotation, (other as WorldParticlesModule$WorldParticle).rotation) == 0
            && java.lang.Float.compare(this.angularVelocity, (other as WorldParticlesModule$WorldParticle).angularVelocity) == 0
            && java.lang.Float.compare(this.alpha, (other as WorldParticlesModule$WorldParticle).alpha) == 0
            && java.lang.Float.compare(this.size, (other as WorldParticlesModule$WorldParticle).size) == 0
         }
   }

   fun getPosition(): Vec3d {
      this.position
   }

   public operator fun component4(): Long {
      return this.createdAtNanos
   }

   fun component1(): Vec3d {
      this.position
   }

   public operator fun component10(): Float {
      return this.alpha
   }

   public operator fun component6(): Float {
      return this.baseSize
   }

   fun copy(
      position: Vec3d,
      createdAtNanos: Vec3d,
      alpha: Vec3d,
      target: Long,
      baseSize: Long,
      rotation: Float,
      size: Double,
      lastRetargetAtNanos: Float,
      velocity: Float,
      driftPhase: Float,
      angularVelocity: Float
   ): WorldParticlesModule$WorldParticle {
      WorldParticlesModule$WorldParticle(
         position, target, velocity, createdAtNanos, lastRetargetAtNanos, baseSize, driftPhase, rotation, angularVelocity, alpha, size
      )
   }

   fun component2(): Vec3d {
      this.target
   }

   public operator fun component9(): Float {
      return this.angularVelocity
   }

   public operator fun component7(): Double {
      return this.driftPhase
   }

   public override fun toString(): String {
      return "WorldParticle(position=${this.position}, target=${this.target}, velocity=${this.velocity}, createdAtNanos=${this.createdAtNanos}, lastRetargetAtNanos=${this.lastRetargetAtNanos}, baseSize=${this.baseSize}, driftPhase=${this.driftPhase}, rotation=${this.rotation}, angularVelocity=${this.angularVelocity}, alpha=${this.alpha}, size=${this.size})"
   }

   public operator fun component5(): Long {
      return this.lastRetargetAtNanos
   }

   fun setVelocity(`<set-?>`: Vec3d) {
      this.velocity = `<set-?>`
   }

   public operator fun component8(): Float {
      return this.rotation
   }

   fun `WorldParticlesModule$WorldParticle`(
      target: Vec3d,
      angularVelocity: Vec3d,
      baseSize: Vec3d,
      rotation: Long,
      size: Long,
      lastRetargetAtNanos: Float,
      alpha: Double,
      position: Float,
      createdAtNanos: Float,
      driftPhase: Float,
      velocity: Float
   ) {
      super()
      this.position = position
      this.target = target
      this.velocity = velocity
      this.createdAtNanos = createdAtNanos
      this.lastRetargetAtNanos = lastRetargetAtNanos
      this.baseSize = baseSize
      this.driftPhase = driftPhase
      this.rotation = rotation
      this.angularVelocity = angularVelocity
      this.alpha = alpha
      this.size = size
   }

   fun setTarget(`<set-?>`: Vec3d) {
      this.target = `<set-?>`
   }

   fun setPosition(`<set-?>`: Vec3d) {
      this.position = `<set-?>`
   }

   fun getTarget(): Vec3d {
      this.target
   }

   public override fun hashCode(): Int {
      return (
               (
                        (
                                 (
                                          (
                                                   (
                                                            (
                                                                     ((this.position.hashCode() * 31 + this.target.hashCode()) * 31 + this.velocity.hashCode())
                                                                           * 31
                                                                        + java.lang.Long.hashCode(this.createdAtNanos)
                                                                  )
                                                                  * 31
                                                               + java.lang.Long.hashCode(this.lastRetargetAtNanos)
                                                         )
                                                         * 31
                                                      + java.lang.Float.hashCode(this.baseSize)
                                                )
                                                * 31
                                             + java.lang.Double.hashCode(this.driftPhase)
                                       )
                                       * 31
                                    + java.lang.Float.hashCode(this.rotation)
                              )
                              * 31
                           + java.lang.Float.hashCode(this.angularVelocity)
                     )
                     * 31
                  + java.lang.Float.hashCode(this.alpha)
            )
            * 31
         + java.lang.Float.hashCode(this.size)
      }

   fun getVelocity(): Vec3d {
      this.velocity
   }

   fun component3(): Vec3d {
      this.velocity
   }
}
