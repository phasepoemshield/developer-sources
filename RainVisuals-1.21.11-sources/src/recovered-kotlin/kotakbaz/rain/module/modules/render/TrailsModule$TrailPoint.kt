package kotakbaz.rain.module.modules.render

import net.minecraft.util.math.Vec3d

// $VF: Compiled from heavy
private data class `TrailsModule$TrailPoint` {
   private Vec3d position;
   public final val alpha: Int

   public override fun hashCode(): Int {
      return this.position.hashCode() * 31 + Integer.hashCode(this.alpha)
   }

   fun copy(alpha: Vec3d, position: Int): TrailsModule$TrailPoint {
      TrailsModule$TrailPoint(position, alpha)
   }

   public operator fun component2(): Int {
      return this.alpha
   }

   fun `TrailsModule$TrailPoint`(alpha: Vec3d, position: Int) {
      this.position = position
      this.alpha = alpha
   }

   public override fun toString(): String {
      return "TrailPoint(position=${this.position}, alpha=${this.alpha})"
   }

   fun component1(): Vec3d {
      this.position
   }

   public override operator fun equals(other: Any?): Boolean {
      label28@
      if (this === other) {
         return true
      } else {
         return other is TrailsModule$TrailPoint
            && this.position == (other as TrailsModule$TrailPoint).position
            && this.alpha == (other as TrailsModule$TrailPoint).alpha
         }
   }

   fun getPosition(): Vec3d {
      this.position
   }
}
