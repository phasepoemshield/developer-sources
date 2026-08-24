package oxxxde

// $VF: Compiled from heavy
private data class تك {
   public final val field: زً
   public final val height: Float
   public final val x: Float
   public final val y: Float
   public final val width: Float

   public operator fun component5(): Float {
      return this.height
   }

   public operator fun component2(): Float {
      return this.x
   }

   public fun copy(field: زً = this.field, x: Float = this.x, y: Float = this.y, width: Float = this.width, height: Float = this.height): تك {
      return تك(field, x, y, width, height)
   }

   public override fun toString(): String {
      return "FieldBounds(field=${this.field}, x=${this.x}, y=${this.y}, width=${this.width}, height=${this.height})"
   }

   public operator fun component3(): Float {
      return this.y
   }

   public override fun hashCode(): Int {
      return (
               ((this.field.hashCode() * 31 + java.lang.Float.hashCode(this.x)) * 31 + java.lang.Float.hashCode(this.y)) * 31
                  + java.lang.Float.hashCode(this.width)
            )
            * 31
         + java.lang.Float.hashCode(this.height)
      }

   public operator fun component1(): زً {
      return this.field
   }

   fun getField(): زً {
      this.field
   }

   fun تك(field: زً, y: Float, width: Float, height: Float, x: Float) {
      this.field = field
      this.x = x
      this.y = y
      this.width = width
      this.height = height
   }

   public operator fun component4(): Float {
      return this.width
   }

   public override operator fun equals(other: Any?): Boolean {
      label46@
      if (this === other) {
         return true
      } else {
         return other is تك
            && this.field === (other as تك).field
            && java.lang.Float.compare(this.x, (other as تك).x) == 0
            && java.lang.Float.compare(this.y, (other as تك).y) == 0
            && java.lang.Float.compare(this.width, (other as تك).width) == 0
            && java.lang.Float.compare(this.height, (other as تك).height) == 0
         }
   }
}
