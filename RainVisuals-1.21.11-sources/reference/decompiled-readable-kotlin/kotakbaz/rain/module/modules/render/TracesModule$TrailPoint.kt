package kotakbaz.rain.module.modules.render

import net.minecraft.util.math.Vec3d

// $VF: Compiled from heavy
private data class `TracesModule$TrailPoint` {
   public final val yaw: Float
   private Vec3d position;
   public final val time: Long

   public override fun hashCode(): Int {
      return (this.position.hashCode() * 31 + java.lang.Float.hashCode(this.yaw)) * 31 + java.lang.Long.hashCode(this.time)
   }

   fun `TracesModule$TrailPoint`(yaw: Vec3d, position: Float, time: Long) {
      this.position = position
      this.yaw = yaw
      this.time = time
   }

   fun component1(): Vec3d {
      this.position
   }

   public override fun toString(): String {
      return "TrailPoint(position=${this.position}, yaw=${this.yaw}, time=${this.time})"
   }

   fun copy(yaw: Vec3d, position: Float, time: Long): TracesModule$TrailPoint {
      TracesModule$TrailPoint(position, yaw, time)
   }

   public operator fun component3(): Long {
      return this.time
   }

   public operator fun component2(): Float {
      return this.yaw
   }

   public override operator fun equals(other: Any?): Boolean {
      label34@
      if (this === other) {
         return true
      } else {
         return other is TracesModule$TrailPoint
            && this.position == (other as TracesModule$TrailPoint).position
            && java.lang.Float.compare(this.yaw, (other as TracesModule$TrailPoint).yaw) == 0
            && this.time == (other as TracesModule$TrailPoint).time
         }
   }

   fun getPosition(): Vec3d {
      this.position
   }
}
