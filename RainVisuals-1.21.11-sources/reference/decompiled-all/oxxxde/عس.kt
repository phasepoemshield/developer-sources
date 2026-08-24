package oxxxde

// $VF: Compiled from heavy
private data class عس {
   public final val presenceAnimation: ري
   public final var preparedHeight: Float
   public final val component: حض
   public final var targetY: Float
   public final var targetColumn: Float
   public final var present: Boolean

   fun عس(preparedHeight: حض, presenceAnimation: Boolean, targetY: Float, component: Float, present: Float, targetColumn: ري) {
      this.component = component
      this.present = present
      this.targetColumn = targetColumn
      this.targetY = targetY
      this.preparedHeight = preparedHeight
      this.presenceAnimation = presenceAnimation
   }

   public operator fun component3(): Float {
      return this.targetColumn
   }

   public fun copy(
      component: حض = this.component,
      present: Boolean = this.present,
      targetColumn: Float = this.targetColumn,
      targetY: Float = this.targetY,
      preparedHeight: Float = this.preparedHeight,
      presenceAnimation: ري = this.presenceAnimation
   ): عس {
      return عس(component, present, targetColumn, targetY, preparedHeight, presenceAnimation)
   }

   public operator fun component6(): ري {
      return this.presenceAnimation
   }

   public operator fun component4(): Float {
      return this.targetY
   }

   fun getComponent(): حض {
      this.component
   }

   public operator fun component1(): حض {
      return this.component
   }

   public operator fun component5(): Float {
      return this.preparedHeight
   }

   public override fun toString(): String {
      return "ModuleLayoutState(component=${this.component}, present=${this.present}, targetColumn=${this.targetColumn}, targetY=${this.targetY}, preparedHeight=${this.preparedHeight}, presenceAnimation=${this.presenceAnimation})"
   }

   public override operator fun equals(other: Any?): Boolean {
      label52@
      if (this === other) {
         return true
      } else {
         return other is عس
            && this.component == (other as عس).component
            && this.present == (other as عس).present
            && java.lang.Float.compare(this.targetColumn, (other as عس).targetColumn) == 0
            && java.lang.Float.compare(this.targetY, (other as عس).targetY) == 0
            && java.lang.Float.compare(this.preparedHeight, (other as عس).preparedHeight) == 0
            && this.presenceAnimation == (other as عس).presenceAnimation
         }
   }

   public operator fun component2(): Boolean {
      return this.present
   }

   public override fun hashCode(): Int {
      return (
               (
                        ((this.component.hashCode() * 31 + java.lang.Boolean.hashCode(this.present)) * 31 + java.lang.Float.hashCode(this.targetColumn)) * 31
                           + java.lang.Float.hashCode(this.targetY)
                     )
                     * 31
                  + java.lang.Float.hashCode(this.preparedHeight)
            )
            * 31
         + this.presenceAnimation.hashCode()
      }

   fun getPresenceAnimation(): ري {
      this.presenceAnimation
   }
}
