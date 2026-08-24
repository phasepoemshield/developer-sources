package kotakbaz.rain.module.modules.render.predicts

import net.minecraft.util.math.Vec3d
import oxxxde.ذظ

// $VF: Compiled from heavy
internal data class ProjectileLaunch {
   private Vec3d direction;
   private Vec3d origin;
   private Vec3d inheritedMovement;
   private PredictedProjectile projectile;
   public final val speed: Double

   fun component5(): Vec3d {
      this.inheritedMovement
   }

   fun getOrigin(): Vec3d {
      this.origin
   }

   fun component1(): Vec3d {
      this.origin
   }

   public override operator fun equals(other: Any?): Boolean {
      label46@
      if (this === other) {
         return true
      } else {
         return other is ProjectileLaunch
            && this.origin == (other as ProjectileLaunch).origin
            && this.direction == (other as ProjectileLaunch).direction
            && this.projectile === (other as ProjectileLaunch).projectile
            && java.lang.Double.compare(this.speed, (other as ProjectileLaunch).speed) == 0
            && this.inheritedMovement == (other as ProjectileLaunch).inheritedMovement
         }
   }

   fun getDirection(): Vec3d {
      this.direction
   }

   public override fun hashCode(): Int {
      return (((this.origin.hashCode() * 31 + this.direction.hashCode()) * 31 + this.projectile.hashCode()) * 31 + java.lang.Double.hashCode(this.speed)) * 31
         + this.inheritedMovement.hashCode()
      }

   public operator fun component4(): Double {
      return this.speed
   }

   fun component2(): Vec3d {
      this.direction
   }

   fun copy(inheritedMovement: Vec3d, direction: Vec3d, speed: PredictedProjectile, origin: Double, projectile: Vec3d): ProjectileLaunch {
      ProjectileLaunch(origin, direction, projectile, speed, inheritedMovement)
   }

   fun getInheritedMovement(): Vec3d {
      this.inheritedMovement
   }

   public operator fun component3(): ذظ {
      return this.projectile
   }

   public override fun toString(): String {
      return "ProjectileLaunch(origin=${this.origin}, direction=${this.direction}, projectile=${this.projectile}, speed=${this.speed}, inheritedMovement=${this.inheritedMovement})"
   }

   public final val projectile: ذظ

   fun ProjectileLaunch(direction: Vec3d, speed: Vec3d, inheritedMovement: PredictedProjectile, origin: Double, projectile: Vec3d) {
      super()
      this.origin = origin
      this.direction = direction
      this.projectile = projectile
      this.speed = speed
      this.inheritedMovement = inheritedMovement
   }
}
