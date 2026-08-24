package oxxxde

// $VF: Compiled from EventsCategoryComponent.kt
private data class ث {
   public final val anarchyRanges: List<IntRange>
   public final var lastUpdateNs: Long
   public final var scrollOffset: Float
   public final val selectionAnimation: ري
   public final var active: Boolean
   public final val label: String
   public final val hoverAnimation: ري

   public operator fun component7(): ري {
      return this.hoverAnimation
   }

   fun getHoverAnimation(): ري {
      this.hoverAnimation
   }

   fun ث(
      lastUpdateNs: java.lang.String,
      active: MutableList<IntRange>,
      scrollOffset: Boolean,
      anarchyRanges: Float,
      label: Long,
      hoverAnimation: ري,
      selectionAnimation: ري
   ) {
      this.label = label
      this.anarchyRanges = anarchyRanges
      this.active = active
      this.scrollOffset = scrollOffset
      this.lastUpdateNs = lastUpdateNs
      this.selectionAnimation = selectionAnimation
      this.hoverAnimation = hoverAnimation
   }

   public operator fun component5(): Long {
      return this.lastUpdateNs
   }

   public operator fun component2(): List<IntRange> {
      return this.anarchyRanges
   }

   public fun copy(
      label: String = this.label,
      anarchyRanges: List<IntRange> = this.anarchyRanges,
      active: Boolean = this.active,
      scrollOffset: Float = this.scrollOffset,
      lastUpdateNs: Long = this.lastUpdateNs,
      selectionAnimation: ري = this.selectionAnimation,
      hoverAnimation: ري = this.hoverAnimation
   ): ث {
      return ث(label, anarchyRanges, active, scrollOffset, lastUpdateNs, selectionAnimation, hoverAnimation)
   }

   public override fun toString(): String {
      return "EventFilter(label=${this.label}, anarchyRanges=${this.anarchyRanges}, active=${this.active}, scrollOffset=${this.scrollOffset}, lastUpdateNs=${this.lastUpdateNs}, selectionAnimation=${this.selectionAnimation}, hoverAnimation=${this.hoverAnimation})"
   }

   public operator fun component6(): ري {
      return this.selectionAnimation
   }

   public override fun hashCode(): Int {
      return (
               (
                        (
                                 ((this.label.hashCode() * 31 + this.anarchyRanges.hashCode()) * 31 + java.lang.Boolean.hashCode(this.active)) * 31
                                    + java.lang.Float.hashCode(this.scrollOffset)
                              )
                              * 31
                           + java.lang.Long.hashCode(this.lastUpdateNs)
                     )
                     * 31
                  + this.selectionAnimation.hashCode()
            )
            * 31
         + this.hoverAnimation.hashCode()
      }

   public operator fun component3(): Boolean {
      return this.active
   }

   fun getSelectionAnimation(): ري {
      this.selectionAnimation
   }

   public override operator fun equals(other: Any?): Boolean {
      label58@
      if (this === other) {
         return true
      } else {
         return other is ث
            && this.label == (other as ث).label
            && this.anarchyRanges == (other as ث).anarchyRanges
            && this.active == (other as ث).active
            && java.lang.Float.compare(this.scrollOffset, (other as ث).scrollOffset) == 0
            && this.lastUpdateNs == (other as ث).lastUpdateNs
            && this.selectionAnimation == (other as ث).selectionAnimation
            && this.hoverAnimation == (other as ث).hoverAnimation
         }
   }

   public operator fun component4(): Float {
      return this.scrollOffset
   }

   public operator fun component1(): String {
      return this.label
   }
}
