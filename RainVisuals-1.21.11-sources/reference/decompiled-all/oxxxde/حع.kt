package oxxxde

// $VF: Compiled from heavy
private data class حع {
   public final val x: Float
   public final val argb: Int
   public final val pipeline: صؤ
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
         return other is حع
            && java.lang.Float.compare(this.x, (other as حع).x) == 0
            && java.lang.Float.compare(this.y, (other as حع).y) == 0
            && java.lang.Float.compare(this.size, (other as حع).size) == 0
            && this.argb == (other as حع).argb
            && this.pipeline === (other as حع).pipeline
         }
   }

   public operator fun component5(): صؤ {
      return this.pipeline
   }

   public operator fun component1(): Float {
      return this.x
   }

   fun حع(y: Float, x: Float, size: Float, argb: Int, pipeline: صؤ) {
      this.x = x
      this.y = y
      this.size = size
      this.argb = argb
      this.pipeline = pipeline
   }

   public fun copy(x: Float = this.x, y: Float = this.y, size: Float = this.size, argb: Int = this.argb, pipeline: صؤ = this.pipeline): حع {
      return حع(x, y, size, argb, pipeline)
   }

   fun getPipeline(): صؤ {
      this.pipeline
   }

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
