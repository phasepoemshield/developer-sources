package oxxxde

import kotlin.enums.EnumEntries

// $VF: Compiled from heavy
internal enum class ذظ(speed: Double, gravity: Double, airDrag: Double, waterDrag: Double, inheritsShooterMovement: Boolean) {
   TRIDENT(2.5, 0.05, 0.99, 0.99, true),
   CROSSBOW_ARROW(3.15, 0.05, 0.99, 0.6, false),
   BOW_ARROW(3.0, 0.05, 0.99, 0.6, true),
   ENDER_PEARL(1.5, 0.03, 0.99, 0.8, true);

   public final val airDrag: Double
   public final val gravity: Double
   public final val waterDrag: Double
   public final val inheritsShooterMovement: Boolean
   public final val speed: Double

   init {
      this.speed = speed
      this.gravity = gravity
      this.airDrag = airDrag
      this.waterDrag = waterDrag
      this.inheritsShooterMovement = inheritsShooterMovement
   }

   @JvmStatic
   fun getEntries(): EnumEntries<ذظ> {
      $ENTRIES
   }
}
