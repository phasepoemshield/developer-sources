package kotakbaz.rain.ui.menu

import kotakbaz.rain.client.util.animations.AnimationUtil
import oxxxde.ث
import oxxxde.ري

// $VF: Compiled from EventsCategoryComponent.kt
private data class `EventsCategoryComponent$EventFilter`(label: String,
   anarchyRanges: List<IntRange> = ...,
   active: Boolean = ...,
   scrollOffset: Float = ...,
   lastUpdateNs: Long = ...,
   selectionAnimation: ري = ...,
   hoverAnimation: ري = ...
) {
   public final val anarchyRanges: List<IntRange>
   public final var lastUpdateNs: Long
   public final var scrollOffset: Float
   private AnimationUtil selectionAnimation;
   public final var active: Boolean
   public final val label: String
   private AnimationUtil hoverAnimation;

   public operator fun component7(): ري {
      return this.hoverAnimation
   }

   public final val hoverAnimation: ري

   init {
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
      label: String = ...,
      anarchyRanges: List<IntRange> = ...,
      active: Boolean = ...,
      scrollOffset: Float = ...,
      lastUpdateNs: Long = ...,
      selectionAnimation: ري = ...,
      hoverAnimation: ري = ...
   ): ث {
      return EventsCategoryComponent$EventFilter(label, anarchyRanges, active, scrollOffset, lastUpdateNs, selectionAnimation, hoverAnimation)
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

   public final val selectionAnimation: ري

   public override operator fun equals(other: Any?): Boolean {
      label58@
      if (this === other) {
         return true
      } else {
         return other is EventsCategoryComponent$EventFilter
            && this.label == (other as EventsCategoryComponent$EventFilter).label
            && this.anarchyRanges == (other as EventsCategoryComponent$EventFilter).anarchyRanges
            && this.active == (other as EventsCategoryComponent$EventFilter).active
            && java.lang.Float.compare(this.scrollOffset, (other as EventsCategoryComponent$EventFilter).scrollOffset) == 0
            && this.lastUpdateNs == (other as EventsCategoryComponent$EventFilter).lastUpdateNs
            && this.selectionAnimation == (other as EventsCategoryComponent$EventFilter).selectionAnimation
            && this.hoverAnimation == (other as EventsCategoryComponent$EventFilter).hoverAnimation
         }
   }

   public operator fun component4(): Float {
      return this.scrollOffset
   }

   public operator fun component1(): String {
      return this.label
   }
}
