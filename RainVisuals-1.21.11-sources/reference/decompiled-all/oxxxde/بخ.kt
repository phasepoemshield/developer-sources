package oxxxde

import net.minecraft.class_243
import net.minecraft.util.math.Vec3d

// $VF: Compiled from heavy
internal data class بخ {
   public final val points: List<class_243>
   public final val impact: اأ

   public operator fun component1(): List<class_243> {
      return this.points
   }

   public fun copy(points: List<class_243> = this.points, impact: اأ = this.impact): بخ {
      return بخ(points, impact)
   }

   public operator fun component2(): اأ {
      return this.impact
   }

   public final val hitsTarget: Boolean
      public final get() {
         return this.impact.getType() === شِ.ENTITY && this.impact.getTarget() != null
      }


   public override fun toString(): String {
      return "TrajectoryPrediction(points=${this.points}, impact=${this.impact})"
   }

   public override fun hashCode(): Int {
      return this.points.hashCode() * 31 + this.impact.hashCode()
   }

   fun getImpact(): اأ {
      this.impact
   }

   fun بخ(points: MutableList<Vec3d>, impact: اأ) {
      this.points = points
      this.impact = impact
   }

   public override operator fun equals(other: Any?): Boolean {
      label28@
      if (this === other) {
         return true
      } else {
         return other is بخ && this.points == (other as بخ).points && this.impact == (other as بخ).impact
      }
   }
}
