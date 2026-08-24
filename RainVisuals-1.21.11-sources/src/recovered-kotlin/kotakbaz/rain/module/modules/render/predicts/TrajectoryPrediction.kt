package kotakbaz.rain.module.modules.render.predicts

import net.minecraft.class_243
import oxxxde.اأ
import oxxxde.بخ

// $VF: Compiled from heavy
internal data class TrajectoryPrediction(points: List<class_243>, impact: اأ) {
   public final val points: List<class_243>
   private TrajectoryImpact impact;

   public operator fun component1(): List<class_243> {
      return this.points
   }

   public fun copy(points: List<class_243> = ..., impact: اأ = ...): بخ {
      return TrajectoryPrediction(points, impact)
   }

   public operator fun component2(): اأ {
      return this.impact
   }

   public final val hitsTarget: Boolean
      public final get() {
         return this.impact.type === TrajectoryImpactType.ENTITY && this.impact.getTarget() != null
      }


   public override fun toString(): String {
      return "TrajectoryPrediction(points=${this.points}, impact=${this.impact})"
   }

   public override fun hashCode(): Int {
      return this.points.hashCode() * 31 + this.impact.hashCode()
   }

   public final val impact: اأ

   init {
      this.points = points
      this.impact = impact
   }

   public override operator fun equals(other: Any?): Boolean {
      label28@
      if (this === other) {
         return true
      } else {
         return other is TrajectoryPrediction && this.points == (other as TrajectoryPrediction).points && this.impact == (other as TrajectoryPrediction).impact
      }
   }
}
