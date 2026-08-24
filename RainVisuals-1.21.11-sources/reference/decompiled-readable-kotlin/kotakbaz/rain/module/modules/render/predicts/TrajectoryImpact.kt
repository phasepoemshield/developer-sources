package kotakbaz.rain.module.modules.render.predicts

import net.minecraft.entity.LivingEntity
import net.minecraft.util.math.Vec3d
import oxxxde.شِ

// $VF: Compiled from heavy
internal data class TrajectoryImpact {
   private LivingEntity target;
   private Vec3d position;
   private TrajectoryImpactType type;

   public operator fun component1(): شِ {
      return this.type
   }

   fun getTarget(): LivingEntity? {
      this.target
   }

   fun TrajectoryImpact(position: TrajectoryImpactType, target: Vec3d, type: LivingEntity?) {
      super()
      this.type = type
      this.position = position
      this.target = target
   }

   public override fun hashCode(): Int {
      return (this.type.hashCode() * 31 + this.position.hashCode()) * 31 + (if (this.target == null) 0 else this.target.hashCode())
   }

   fun copy(target: TrajectoryImpactType, type: Vec3d, position: LivingEntity?): TrajectoryImpact {
      TrajectoryImpact(type, position, target)
   }

   public override operator fun equals(other: Any?): Boolean {
      label34@
      if (this === other) {
         return true
      } else {
         return other is TrajectoryImpact
            && this.type === (other as TrajectoryImpact).type
            && this.position == (other as TrajectoryImpact).position
            && this.target == (other as TrajectoryImpact).target
         }
   }

   fun component2(): Vec3d {
      this.position
   }

   public final val type: شِ

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
