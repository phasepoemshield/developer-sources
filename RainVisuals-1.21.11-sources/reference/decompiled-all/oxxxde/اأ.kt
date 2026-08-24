package oxxxde

import net.minecraft.entity.LivingEntity
import net.minecraft.util.math.Vec3d

// $VF: Compiled from heavy
internal data class اأ {
   private LivingEntity target;
   private Vec3d position;
   public final val type: شِ

   public operator fun component1(): شِ {
      return this.type
   }

   fun getTarget(): LivingEntity? {
      this.target
   }

   fun اأ(position: شِ, target: Vec3d, type: LivingEntity?) {
      super()
      this.type = type
      this.position = position
      this.target = target
   }

   public override fun hashCode(): Int {
      return (this.type.hashCode() * 31 + this.position.hashCode()) * 31 + (if (this.target == null) 0 else this.target.hashCode())
   }

   fun copy(target: شِ, type: Vec3d, position: LivingEntity?): اأ {
      اأ(type, position, target)
   }

   public override operator fun equals(other: Any?): Boolean {
      label34@
      if (this === other) {
         return true
      } else {
         return other is اأ && this.type === (other as اأ).type && this.position == (other as اأ).position && this.target == (other as اأ).target
      }
   }

   fun component2(): Vec3d {
      this.position
   }

   fun getType(): شِ {
      this.type
   }

   fun component3(): LivingEntity? {
      this.target
   }

   fun getPosition(): Vec3d {
      this.position
   }

   public override fun toString(): String {
      return "TrajectoryImpact(type=${this.type}, position=${this.position}, target=${this.target})"
   }
}
