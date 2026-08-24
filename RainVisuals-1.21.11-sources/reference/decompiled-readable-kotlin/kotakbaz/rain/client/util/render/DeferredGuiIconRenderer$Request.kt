package kotakbaz.rain.client.util.render

import kotakbaz.rain.client.util.render.engine.controls.ClientRenderPipeline
import oxxxde.حع
import oxxxde.صؤ

// $VF: Compiled from heavy
private data class `DeferredGuiIconRenderer$Request`(x: Float, y: Float, size: Float, argb: Int, pipeline: صؤ) {
   public final val x: Float
   public final val argb: Int
   private ClientRenderPipeline pipeline;
   public final val size: Float
   public final val y: Float

   public override fun hashCode(): Int {
      return (
               ((java.lang.Float.hashCode(this.x) * 31 + java.lang.Float.hashCode(this.y)) * 31 + java.lang.Float.hashCode(this.size)) * 31
                  + Integer.hashCode(this.argb)
            )
            * 31
         + this.pipeline.hashCode()
      }

   public override fun toString(): String {
      return "Request(x=${this.x}, y=${this.y}, size=${this.size}, argb=${this.argb}, pipeline=${this.pipeline})"
   }

   public override operator fun equals(other: Any?): Boolean {
      label46@
      if (this === other) {
         return true
      } else {
         return other is DeferredGuiIconRenderer$Request
            && java.lang.Float.compare(this.x, (other as DeferredGuiIconRenderer$Request).x) == 0
            && java.lang.Float.compare(this.y, (other as DeferredGuiIconRenderer$Request).y) == 0
            && java.lang.Float.compare(this.size, (other as DeferredGuiIconRenderer$Request).size) == 0
            && this.argb == (other as DeferredGuiIconRenderer$Request).argb
            && this.pipeline === (other as DeferredGuiIconRenderer$Request).pipeline
         }
   }

   public operator fun component5(): صؤ {
      return this.pipeline
   }

   public operator fun component1(): Float {
      return this.x
   }

   init {
      this.x = x
      this.y = y
      this.size = size
      this.argb = argb
      this.pipeline = pipeline
   }

   public fun copy(x: Float = ..., y: Float = ..., size: Float = ..., argb: Int = ..., pipeline: صؤ = ...): حع {
      return DeferredGuiIconRenderer$Request(x, y, size, argb, pipeline)
   }

   public final val pipeline: صؤ

   public operator fun component3(): Float {
      return this.size
   }

   public operator fun component2(): Float {
      return this.y
   }

   public operator fun component4(): Int {
      return this.argb
   }
}
