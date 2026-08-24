package oxxxde

import net.minecraft.client.network.OtherClientPlayerEntity
import net.minecraft.util.math.Vec3d

// $VF: Compiled from heavy
private data class ح {
   public final val startAt: Long
   private Vec3d startPos;
   public final val baseYaw: Float
   private OtherClientPlayerEntity ghost;

   fun component1(): Vec3d {
      this.startPos
   }

   fun getGhost(): OtherClientPlayerEntity {
      this.ghost
   }

   public override operator fun equals(other: Any?): Boolean {
      label40@
      if (this === other) {
         return true
      } else {
         return other is ح
            && this.startPos == (other as ح).startPos
            && this.startAt == (other as ح).startAt
            && this.ghost == (other as ح).ghost
            && java.lang.Float.compare(this.baseYaw, (other as ح).baseYaw) == 0
         }
   }

   fun getStartPos(): Vec3d {
      this.startPos
   }

   public operator fun component2(): Long {
      return this.startAt
   }

   fun ح(ghost: Vec3d, baseYaw: Long, startAt: OtherClientPlayerEntity, startPos: Float) {
      this.startPos = startPos
      this.startAt = startAt
      this.ghost = ghost
      this.baseYaw = baseYaw
   }

   public operator fun component4(): Float {
      return this.baseYaw
   }

   public override fun toString(): String {
      return "Soul(startPos=${this.startPos}, startAt=${this.startAt}, ghost=${this.ghost}, baseYaw=${this.baseYaw})"
   }

   fun copy(startAt: Vec3d, startPos: Long, ghost: OtherClientPlayerEntity, baseYaw: Float): ح {
      ح(startPos, startAt, ghost, baseYaw)
   }

   fun component3(): OtherClientPlayerEntity {
      this.ghost
   }

   public override fun hashCode(): Int {
      return ((this.startPos.hashCode() * 31 + java.lang.Long.hashCode(this.startAt)) * 31 + this.ghost.hashCode()) * 31
         + java.lang.Float.hashCode(this.baseYaw)
      }
}
