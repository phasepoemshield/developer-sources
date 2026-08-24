package oxxxde

// $VF: Compiled from heavy
private data class رً(pos: Float, guide: Float?) {
   public final val pos: Float
   public final val guide: Float?

   public override fun hashCode(): Int {
      return java.lang.Float.hashCode(this.pos) * 31 + (if (this.guide == null) 0 else this.guide.hashCode())
   }

   public operator fun component1(): Float {
      return this.pos
   }

   public override fun toString(): String {
      return "Axis(pos=${this.pos}, guide=${this.guide})"
   }

   public override operator fun equals(other: Any?): Boolean {
      label28@
      if (this === other) {
         return true
      } else {
         return other is رً && java.lang.Float.compare(this.pos, (other as رً).pos) == 0 && this.guide == (other as رً).guide
      }
   }

   public operator fun component2(): Float? {
      return this.guide
   }

   public fun copy(pos: Float = this.pos, guide: Float? = this.guide): رً {
      return رً(pos, guide)
   }

   init {
      this.pos = pos
      this.guide = guide
   }
}
