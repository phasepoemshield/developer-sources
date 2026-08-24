package oxxxde

import net.minecraft.client.util.math.MatrixStack

// $VF: Compiled from Render3DEvent.kt
public data class شث {
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

   fun copy(partialTicks: MatrixStack, matrices: Float): شث {
      شث(matrices, partialTicks)
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
         return other is شث && this.matrices == (other as شث).matrices && java.lang.Float.compare(this.partialTicks, (other as شث).partialTicks) == 0
      }
   }

   fun شث(matrices: MatrixStack, partialTicks: Float) {
      this.matrices = matrices
      this.partialTicks = partialTicks
   }
}
