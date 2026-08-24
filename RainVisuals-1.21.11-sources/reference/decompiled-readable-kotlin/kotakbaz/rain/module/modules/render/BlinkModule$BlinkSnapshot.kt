package kotakbaz.rain.module.modules.render

import net.minecraft.util.math.Vec3d
import oxxxde.جح

// $VF: Compiled from heavy
private data class `BlinkModule$BlinkSnapshot` {
   public final val limbSpeed: Float
   public final val gliding: Boolean
   public final val createdAt: Long
   public final val limbPos: Float
   public final val pitch: Float
   private Vec3d position;
   @JvmStatic
   public جح Companion = جح(null);
   public final val bodyYaw: Float
   public final val headYaw: Float

   public operator fun component7(): Float {
      return this.limbSpeed
   }

   fun `BlinkModule$BlinkSnapshot`(
      pitch: Long, headYaw: Vec3d, limbPos: Float, gliding: Float, createdAt: Float, position: Float, bodyYaw: Float, limbSpeed: Boolean
   ) {
      this.createdAt = createdAt
      this.position = position
      this.pitch = pitch
      this.bodyYaw = bodyYaw
      this.headYaw = headYaw
      this.limbPos = limbPos
      this.limbSpeed = limbSpeed
      this.gliding = gliding
   }

   fun copy(limbSpeed: Long, bodyYaw: Vec3d, limbPos: Float, createdAt: Float, position: Float, pitch: Float, headYaw: Float, gliding: Boolean): BlinkModule$BlinkSnapshot {
      BlinkModule$BlinkSnapshot(createdAt, position, pitch, bodyYaw, headYaw, limbPos, limbSpeed, gliding)
   }

   public override fun toString(): String {
      return "BlinkSnapshot(createdAt=${this.createdAt}, position=${this.position}, pitch=${this.pitch}, bodyYaw=${this.bodyYaw}, headYaw=${this.headYaw}, limbPos=${this.limbPos}, limbSpeed=${this.limbSpeed}, gliding=${this.gliding})"
   }

   public operator fun component8(): Boolean {
      return this.gliding
   }

   public fun alpha(lifetimeMs: Long, currentTime: Long): Float {
      val progress: Float = RangesKt.coerceIn((float)(currentTime - this.createdAt) / (float)lifetimeMs, 0.0F, 1.0F)
      return (1.0F - progress) * (1.0F - progress)
   }

   public override operator fun equals(other: Any?): Boolean {
      label64@
      if (this === other) {
         return true
      } else {
         return other is BlinkModule$BlinkSnapshot
            && this.createdAt == (other as BlinkModule$BlinkSnapshot).createdAt
            && this.position == (other as BlinkModule$BlinkSnapshot).position
            && java.lang.Float.compare(this.pitch, (other as BlinkModule$BlinkSnapshot).pitch) == 0
            && java.lang.Float.compare(this.bodyYaw, (other as BlinkModule$BlinkSnapshot).bodyYaw) == 0
            && java.lang.Float.compare(this.headYaw, (other as BlinkModule$BlinkSnapshot).headYaw) == 0
            && java.lang.Float.compare(this.limbPos, (other as BlinkModule$BlinkSnapshot).limbPos) == 0
            && java.lang.Float.compare(this.limbSpeed, (other as BlinkModule$BlinkSnapshot).limbSpeed) == 0
            && this.gliding == (other as BlinkModule$BlinkSnapshot).gliding
         }
   }

   public operator fun component6(): Float {
      return this.limbPos
   }

   public override fun hashCode(): Int {
      return (
               (
                        (
                                 (
                                          (
                                                   (java.lang.Long.hashCode(this.createdAt) * 31 + this.position.hashCode()) * 31
                                                      + java.lang.Float.hashCode(this.pitch)
                                                )
                                                * 31
                                             + java.lang.Float.hashCode(this.bodyYaw)
                                       )
                                       * 31
                                    + java.lang.Float.hashCode(this.headYaw)
                              )
                              * 31
                           + java.lang.Float.hashCode(this.limbPos)
                     )
                     * 31
                  + java.lang.Float.hashCode(this.limbSpeed)
            )
            * 31
         + java.lang.Boolean.hashCode(this.gliding)
      }

   public operator fun component1(): Long {
      return this.createdAt
   }

   fun getPosition(): Vec3d {
      this.position
   }

   public operator fun component5(): Float {
      return this.headYaw
   }

   public operator fun component3(): Float {
      return this.pitch
   }

   public operator fun component4(): Float {
      return this.bodyYaw
   }

   fun component2(): Vec3d {
      this.position
   }
}
