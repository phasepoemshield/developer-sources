package oxxxde

import net.minecraft.client.util.math.MatrixStack
import net.minecraft.util.Arm

// $VF: Compiled from HandSwingEvent.kt
public class رأ : سض {
   private MatrixStack matrices;
   private Arm arm;
   public final val equipProgress: Float
   public final val swingProgress: Float

   fun getMatrices(): MatrixStack {
      this.matrices
   }

   fun getArm(): Arm {
      this.arm
   }

   fun رأ(equipProgress: MatrixStack, arm: Arm, swingProgress: Float, matrices: Float) {
      this.matrices = matrices
      this.arm = arm
      this.swingProgress = swingProgress
      this.equipProgress = equipProgress
   }
}
