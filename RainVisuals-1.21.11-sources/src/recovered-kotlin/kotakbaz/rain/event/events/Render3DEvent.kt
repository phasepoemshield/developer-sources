package kotakbaz.rain.event.events

import net.minecraft.client.util.math.MatrixStack

// $VF: Compiled from Render3DEvent.kt
public data class Render3DEvent {
   public final val partialTicks: Float
   private MatrixStack matrices;

   public override fun hashCode(): Int {
      return this.matrices.hashCode() * 31 + java.lang.Float.hashCode(this.partialTicks)
   }

   public operator fun component2(): Float {
      return this.partialTicks
   }

   public override fun toString(): String {
      return "Render3DEvent(matrices=${this.matrices}, partialTicks=${this.partialTicks})"
   }

   fun copy(partialTicks: MatrixStack, matrices: Float): Render3DEvent {
      Render3DEvent(matrices, partialTicks)
   }

   fun component1(): MatrixStack {
      this.matrices
   }

   fun getMatrices(): MatrixStack {
      this.matrices
   }

   public override operator fun equals(other: Any?): Boolean {
      label28@
      if (this === other) {
         return true
      } else {
         return other is Render3DEvent
            && this.matrices == (other as Render3DEvent).matrices
            && java.lang.Float.compare(this.partialTicks, (other as Render3DEvent).partialTicks) == 0
         }
   }

   fun Render3DEvent(matrices: MatrixStack, partialTicks: Float) {
      this.matrices = matrices
      this.partialTicks = partialTicks
   }
}
