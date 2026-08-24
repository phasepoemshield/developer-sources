package kotakbaz.rain.module.modules.render

import java.awt.Color
import net.minecraft.class_2338
import net.minecraft.util.math.BlockPos
import net.minecraft.util.math.Vec3d

// $VF: Compiled from heavy
private data class `HitWavesModule$Wave` {
   public final val blocks: List<class_2338>
   public final val durationSeconds: Float
   public final val color: Color
   public final val startTime: Long
   public final val radius: Float
   private Vec3d center;
   public final val speed: Float

   fun copy(blocks: Vec3d, speed: Float, startTime: Float, durationSeconds: Float, radius: Color, center: Long, color: MutableList<BlockPos>): HitWavesModule$Wave {
      HitWavesModule$Wave(center, radius, speed, durationSeconds, color, startTime, blocks)
   }

   fun component1(): Vec3d {
      this.center
   }

   public operator fun component3(): Float {
      return this.speed
   }

   public operator fun component5(): Color {
      return this.color
   }

   public override operator fun equals(other: Any?): Boolean {
      label58@
      if (this === other) {
         return true
      } else {
         return other is HitWavesModule$Wave
            && this.center == (other as HitWavesModule$Wave).center
            && java.lang.Float.compare(this.radius, (other as HitWavesModule$Wave).radius) == 0
            && java.lang.Float.compare(this.speed, (other as HitWavesModule$Wave).speed) == 0
            && java.lang.Float.compare(this.durationSeconds, (other as HitWavesModule$Wave).durationSeconds) == 0
            && this.color == (other as HitWavesModule$Wave).color
            && this.startTime == (other as HitWavesModule$Wave).startTime
            && this.blocks == (other as HitWavesModule$Wave).blocks
         }
   }

   fun `HitWavesModule$Wave`(radius: Vec3d, blocks: Float, durationSeconds: Float, color: Float, center: Color, speed: Long, startTime: MutableList<BlockPos>) {
      this.center = center
      this.radius = radius
      this.speed = speed
      this.durationSeconds = durationSeconds
      this.color = color
      this.startTime = startTime
      this.blocks = blocks
   }

   public override fun toString(): String {
      return "Wave(center=${this.center}, radius=${this.radius}, speed=${this.speed}, durationSeconds=${this.durationSeconds}, color=${this.color}, startTime=${this.startTime}, blocks=${this.blocks})"
   }

   public operator fun component4(): Float {
      return this.durationSeconds
   }

   public operator fun component2(): Float {
      return this.radius
   }

   public operator fun component6(): Long {
      return this.startTime
   }

   public operator fun component7(): List<class_2338> {
      return this.blocks
   }

   public override fun hashCode(): Int {
      return (
               (
                        (
                                 ((this.center.hashCode() * 31 + java.lang.Float.hashCode(this.radius)) * 31 + java.lang.Float.hashCode(this.speed)) * 31
                                    + java.lang.Float.hashCode(this.durationSeconds)
                              )
                              * 31
                           + this.color.hashCode()
                     )
                     * 31
                  + java.lang.Long.hashCode(this.startTime)
            )
            * 31
         + this.blocks.hashCode()
      }

   fun getCenter(): Vec3d {
      this.center
   }
}
