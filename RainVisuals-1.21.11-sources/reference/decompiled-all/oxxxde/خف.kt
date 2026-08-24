package oxxxde

// $VF: Compiled from heavy
public data class خف(trackX: Float, trackY: Float, trackWidth: Float, trackHeight: Float, thumbY: Float, thumbHeight: Float, canScroll: Boolean) {
   public final val thumbHeight: Float
   public final val trackY: Float
   public final val thumbY: Float
   public final val trackX: Float
   public final val trackHeight: Float
   public final val trackWidth: Float
   public final val canScroll: Boolean

   public operator fun component4(): Float {
      return this.trackHeight
   }

   public operator fun component1(): Float {
      return this.trackX
   }

   public operator fun component5(): Float {
      return this.thumbY
   }

   public operator fun component6(): Float {
      return this.thumbHeight
   }

   public override fun hashCode(): Int {
      return (
               (
                        (
                                 (
                                          (java.lang.Float.hashCode(this.trackX) * 31 + java.lang.Float.hashCode(this.trackY)) * 31
                                             + java.lang.Float.hashCode(this.trackWidth)
                                       )
                                       * 31
                                    + java.lang.Float.hashCode(this.trackHeight)
                              )
                              * 31
                           + java.lang.Float.hashCode(this.thumbY)
                     )
                     * 31
                  + java.lang.Float.hashCode(this.thumbHeight)
            )
            * 31
         + java.lang.Boolean.hashCode(this.canScroll)
      }

   public fun copy(
      trackX: Float = this.trackX,
      trackY: Float = this.trackY,
      trackWidth: Float = this.trackWidth,
      trackHeight: Float = this.trackHeight,
      thumbY: Float = this.thumbY,
      thumbHeight: Float = this.thumbHeight,
      canScroll: Boolean = this.canScroll
   ): خف {
      return خف(trackX, trackY, trackWidth, trackHeight, thumbY, thumbHeight, canScroll)
   }

   public operator fun component7(): Boolean {
      return this.canScroll
   }

   public fun contains(mouseX: Float, mouseY: Float): Boolean {
      return mouseX >= this.trackX && mouseX <= this.trackX + this.trackWidth && mouseY >= this.trackY && mouseY <= this.trackY + this.trackHeight
   }

   public operator fun component3(): Float {
      return this.trackWidth
   }

   public operator fun component2(): Float {
      return this.trackY
   }

   public fun thumbContains(mouseX: Float, mouseY: Float): Boolean {
      return mouseX >= this.trackX && mouseX <= this.trackX + this.trackWidth && mouseY >= this.thumbY && mouseY <= this.thumbY + this.thumbHeight
   }

   public override fun toString(): String {
      return "State(trackX=${this.trackX}, trackY=${this.trackY}, trackWidth=${this.trackWidth}, trackHeight=${this.trackHeight}, thumbY=${this.thumbY}, thumbHeight=${this.thumbHeight}, canScroll=${this.canScroll})"
   }

   public override operator fun equals(other: Any?): Boolean {
      label58@
      if (this === other) {
         return true
      } else {
         return other is خف
            && java.lang.Float.compare(this.trackX, (other as خف).trackX) == 0
            && java.lang.Float.compare(this.trackY, (other as خف).trackY) == 0
            && java.lang.Float.compare(this.trackWidth, (other as خف).trackWidth) == 0
            && java.lang.Float.compare(this.trackHeight, (other as خف).trackHeight) == 0
            && java.lang.Float.compare(this.thumbY, (other as خف).thumbY) == 0
            && java.lang.Float.compare(this.thumbHeight, (other as خف).thumbHeight) == 0
            && this.canScroll == (other as خف).canScroll
         }
   }

   init {
      this.trackX = trackX
      this.trackY = trackY
      this.trackWidth = trackWidth
      this.trackHeight = trackHeight
      this.thumbY = thumbY
      this.thumbHeight = thumbHeight
      this.canScroll = canScroll
   }
}
