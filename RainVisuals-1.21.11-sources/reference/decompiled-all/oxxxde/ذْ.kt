package oxxxde

// $VF: Compiled from heavy
public data class ذْ(x: Float = 0.0F, y: Float = 0.0F, width: Float = 0.0F, height: Float = 0.0F) {
   public final var height: Float
   public final var x: Float
   public final var y: Float
   public final var width: Float

   public operator fun component1(): Float {
      return this.x
   }

   public fun clear() {
      this.x = 0.0F
      this.y = 0.0F
      this.width = 0.0F
      this.height = 0.0F
   }

   public operator fun component2(): Float {
      return this.y
   }

   public override fun toString(): String {
      return "Bounds(x=${this.x}, y=${this.y}, width=${this.width}, height=${this.height})"
   }

   fun ذْ() {
      this(0.0F, 0.0F, 0.0F, 0.0F, 15, null)
   }

   public fun set(x: Float, y: Float, width: Float, height: Float) {
      this.x = x
      this.y = y
      this.width = width
      this.height = height
   }

   init {
      super()
      this.x = x
      this.y = y
      this.width = width
      this.height = height
   }

   public final val centerX: Float
      public final get() {
         return this.x + this.width / 2.0F
      }


   public operator fun component4(): Float {
      return this.height
   }

   public fun copy(x: Float = this.x, y: Float = this.y, width: Float = this.width, height: Float = this.height): ذْ {
      return ذْ(x, y, width, height)
   }

   public operator fun component3(): Float {
      return this.width
   }

   public override operator fun equals(other: Any?): Boolean {
      label40@
      if (this === other) {
         return true
      } else {
         return other is ذْ
            && java.lang.Float.compare(this.x, (other as ذْ).x) == 0
            && java.lang.Float.compare(this.y, (other as ذْ).y) == 0
            && java.lang.Float.compare(this.width, (other as ذْ).width) == 0
            && java.lang.Float.compare(this.height, (other as ذْ).height) == 0
         }
   }

   public override fun hashCode(): Int {
      return ((java.lang.Float.hashCode(this.x) * 31 + java.lang.Float.hashCode(this.y)) * 31 + java.lang.Float.hashCode(this.width)) * 31
         + java.lang.Float.hashCode(this.height)
      }
}
