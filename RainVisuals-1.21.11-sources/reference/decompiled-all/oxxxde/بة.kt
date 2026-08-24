package oxxxde

import net.minecraft.client.render.command.OrderedRenderCommandQueue
import net.minecraft.client.render.state.CameraRenderState
import net.minecraft.client.util.math.MatrixStack

// $VF: Compiled from EntitySubmitEvent.kt
public data class بة {
   private CameraRenderState cameraState;
   public final val partialTicks: Float
   private OrderedRenderCommandQueue collector;
   private MatrixStack matrices;

   fun بة(cameraState: MatrixStack, collector: CameraRenderState, matrices: OrderedRenderCommandQueue, partialTicks: Float) {
      this.matrices = matrices
      this.cameraState = cameraState
      this.collector = collector
      this.partialTicks = partialTicks
   }

   fun getMatrices(): MatrixStack {
      this.matrices
   }

   public override fun toString(): String {
      return "EntitySubmitEvent(matrices=${this.matrices}, cameraState=${this.cameraState}, collector=${this.collector}, partialTicks=${this.partialTicks})"
   }

   public override operator fun equals(other: Any?): Boolean {
      label40@
      if (this === other) {
         return true
      } else {
         return other is بة
            && this.matrices == (other as بة).matrices
            && this.cameraState == (other as بة).cameraState
            && this.collector == (other as بة).collector
            && java.lang.Float.compare(this.partialTicks, (other as بة).partialTicks) == 0
         }
   }

   fun component2(): CameraRenderState {
      this.cameraState
   }

   public override fun hashCode(): Int {
      return ((this.matrices.hashCode() * 31 + this.cameraState.hashCode()) * 31 + this.collector.hashCode()) * 31
         + java.lang.Float.hashCode(this.partialTicks)
      }

   fun copy(matrices: MatrixStack, collector: CameraRenderState, cameraState: OrderedRenderCommandQueue, partialTicks: Float): بة {
      بة(matrices, cameraState, collector, partialTicks)
   }

   fun component3(): OrderedRenderCommandQueue {
      this.collector
   }

   fun component1(): MatrixStack {
      this.matrices
   }

   public operator fun component4(): Float {
      return this.partialTicks
   }

   fun getCollector(): OrderedRenderCommandQueue {
      this.collector
   }

   fun getCameraState(): CameraRenderState {
      this.cameraState
   }
}
