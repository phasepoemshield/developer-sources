package kotakbaz.rain.module.modules.render.predicts

import kotlin.enums.EnumEntries

// $VF: Compiled from heavy
internal enum class TrajectoryImpactType {
   LIMIT,
   ENTITY,
   BLOCK;

   @JvmStatic
   fun getEntries(): EnumEntries<TrajectoryImpactType> {
      $ENTRIES
   }
}
