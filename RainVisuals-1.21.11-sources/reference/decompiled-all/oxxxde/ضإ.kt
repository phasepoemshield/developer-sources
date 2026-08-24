package oxxxde

// $VF: Compiled from heavy
public data class ضإ(textureId: Int, u: Float, v: Float, texW: Float, texH: Float) : دغ {
   public final val v: Float
   public final val texW: Float
   public final val u: Float
   public final val textureId: Int
   public final val texH: Float

   public override fun toString(): String {
      return "Texture(textureId=${this.textureId}, u=${this.u}, v=${this.v}, texW=${this.texW}, texH=${this.texH})"
   }

   public operator fun component2(): Float {
      return this.u
   }

   public operator fun component1(): Int {
      return this.textureId
   }

   public override fun hashCode(): Int {
      return (
               ((Integer.hashCode(this.textureId) * 31 + java.lang.Float.hashCode(this.u)) * 31 + java.lang.Float.hashCode(this.v)) * 31
                  + java.lang.Float.hashCode(this.texW)
            )
            * 31
         + java.lang.Float.hashCode(this.texH)
      }

   public operator fun component4(): Float {
      return this.texW
   }

   public override operator fun equals(other: Any?): Boolean {
      label46@
      if (this === other) {
         return true
      } else {
         return other is ضإ
            && this.textureId == (other as ضإ).textureId
            && java.lang.Float.compare(this.u, (other as ضإ).u) == 0
            && java.lang.Float.compare(this.v, (other as ضإ).v) == 0
            && java.lang.Float.compare(this.texW, (other as ضإ).texW) == 0
            && java.lang.Float.compare(this.texH, (other as ضإ).texH) == 0
         }
   }

   init {
      this.textureId = textureId
      this.u = u
      this.v = v
      this.texW = texW
      this.texH = texH
   }

   public operator fun component5(): Float {
      return this.texH
   }

   public fun copy(textureId: Int = this.textureId, u: Float = this.u, v: Float = this.v, texW: Float = this.texW, texH: Float = this.texH): ضإ {
      return ضإ(textureId, u, v, texW, texH)
   }

   public operator fun component3(): Float {
      return this.v
   }
}
