package oxxxde

import net.minecraft.util.math.Vec3d

// $VF: Compiled from heavy
private data class ذط {
   public final val restitution: Double
   public final val fadeStart: Double
   public final val gravityMultiplier: Double
   public final val lifeTimeMultiplier: Float
   public final val shrinkAmount: Double
   private Vec3d velocity;
   public final val drag: Double
   public final val angularVelocity: Float
   private Vec3d direction;

   public operator fun component4(): Double {
      return this.gravityMultiplier
   }

   public operator fun component8(): Double {
      return this.restitution
   }

   fun component2(): Vec3d {
      this.velocity
   }

   fun getDirection(): Vec3d {
      this.direction
   }

   public operator fun component6(): Double {
      return this.fadeStart
   }

   fun ذط(
      fadeStart: Vec3d,
      direction: Vec3d,
      gravityMultiplier: Double,
      shrinkAmount: Double,
      angularVelocity: Float,
      velocity: Double,
      lifeTimeMultiplier: Double,
      restitution: Double,
      drag: Float
   ) {
      this.direction = direction
      this.velocity = velocity
      this.drag = drag
      this.gravityMultiplier = gravityMultiplier
      this.lifeTimeMultiplier = lifeTimeMultiplier
      this.fadeStart = fadeStart
      this.shrinkAmount = shrinkAmount
      this.restitution = restitution
      this.angularVelocity = angularVelocity
   }

   public operator fun component7(): Double {
      return this.shrinkAmount
   }

   public override fun hashCode(): Int {
      return (
               (
                        (
                                 (
                                          (
                                                   ((this.direction.hashCode() * 31 + this.velocity.hashCode()) * 31 + java.lang.Double.hashCode(this.drag))
                                                         * 31
                                                      + java.lang.Double.hashCode(this.gravityMultiplier)
                                                )
                                                * 31
                                             + java.lang.Float.hashCode(this.lifeTimeMultiplier)
                                       )
                                       * 31
                                    + java.lang.Double.hashCode(this.fadeStart)
                              )
                              * 31
                           + java.lang.Double.hashCode(this.shrinkAmount)
                     )
                     * 31
                  + java.lang.Double.hashCode(this.restitution)
            )
            * 31
         + java.lang.Float.hashCode(this.angularVelocity)
      }

   fun component1(): Vec3d {
      this.direction
   }

   public operator fun component3(): Double {
      return this.drag
   }

   public override operator fun equals(other: Any?): Boolean {
      label70@
      if (this === other) {
         return true
      } else {
         return other is ذط
            && this.direction == (other as ذط).direction
            && this.velocity == (other as ذط).velocity
            && java.lang.Double.compare(this.drag, (other as ذط).drag) == 0
            && java.lang.Double.compare(this.gravityMultiplier, (other as ذط).gravityMultiplier) == 0
            && java.lang.Float.compare(this.lifeTimeMultiplier, (other as ذط).lifeTimeMultiplier) == 0
            && java.lang.Double.compare(this.fadeStart, (other as ذط).fadeStart) == 0
            && java.lang.Double.compare(this.shrinkAmount, (other as ذط).shrinkAmount) == 0
            && java.lang.Double.compare(this.restitution, (other as ذط).restitution) == 0
            && java.lang.Float.compare(this.angularVelocity, (other as ذط).angularVelocity) == 0
         }
   }

   fun copy(
      shrinkAmount: Vec3d,
      gravityMultiplier: Vec3d,
      fadeStart: Double,
      lifeTimeMultiplier: Double,
      direction: Float,
      angularVelocity: Double,
      velocity: Double,
      drag: Double,
      restitution: Float
   ): ذط {
      ذط(direction, velocity, drag, gravityMultiplier, lifeTimeMultiplier, fadeStart, shrinkAmount, restitution, angularVelocity)
   }

   public operator fun component9(): Float {
      return this.angularVelocity
   }

   fun getVelocity(): Vec3d {
      this.velocity
   }

   public operator fun component5(): Float {
      return this.lifeTimeMultiplier
   }

   public override fun toString(): String {
      return "SpawnMotion(direction=${this.direction}, velocity=${this.velocity}, drag=${this.drag}, gravityMultiplier=${this.gravityMultiplier}, lifeTimeMultiplier=${this.lifeTimeMultiplier}, fadeStart=${this.fadeStart}, shrinkAmount=${this.shrinkAmount}, restitution=${this.restitution}, angularVelocity=${this.angularVelocity})"
   }
}
