package oxxxde

// $VF: Compiled from EventsCategoryComponent.kt
private data class ظٌ(width: Float, startX: Float, y: Float) {
   public final val y: Float
   public final val startX: Float
   public final val width: Float

   init {
      this.width = width
      this.startX = startX
      this.y = y
   }

   public override fun hashCode(): Int {
      return (java.lang.Float.hashCode(this.width) * 31 + java.lang.Float.hashCode(this.startX)) * 31 + java.lang.Float.hashCode(this.y)
   }

   public operator fun component2(): Float {
      return this.startX
   }

   public override fun toString(): String {
      return "ButtonLayout(width=${this.width}, startX=${this.startX}, y=${this.y})"
   }

   public fun copy(width: Float = this.width, startX: Float = this.startX, y: Float = this.y): ظٌ {
      return ظٌ(width, startX, y)
   }

   public operator fun component3(): Float {
      return this.y
   }

   public operator fun component1(): Float {
      return this.width
   }

   public override operator fun equals(other: Any?): Boolean {
      label34@
      if (this === other) {
         return true
      } else {
         return other is ظٌ
            && java.lang.Float.compare(this.width, (other as ظٌ).width) == 0
            && java.lang.Float.compare(this.startX, (other as ظٌ).startX) == 0
            && java.lang.Float.compare(this.y, (other as ظٌ).y) == 0
         }
   }
}
