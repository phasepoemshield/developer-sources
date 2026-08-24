package kotakbaz.rain.ui.menu

import kotakbaz.rain.client.util.animations.AnimationUtil
import oxxxde.حض
import oxxxde.ري
import oxxxde.عس

// $VF: Compiled from heavy
private data class `CategoryComponent$ModuleLayoutState`(component: حض,
   present: Boolean = ...,
   targetColumn: Float = ...,
   targetY: Float = ...,
   preparedHeight: Float = ...,
   presenceAnimation: ري = ...
) {
   private AnimationUtil presenceAnimation;
   public final var preparedHeight: Float
   private ModuleComponent component;
   public final var targetY: Float
   public final var targetColumn: Float
   public final var present: Boolean

   init {
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
      component: حض = ...,
      present: Boolean = ...,
      targetColumn: Float = ...,
      targetY: Float = ...,
      preparedHeight: Float = ...,
      presenceAnimation: ري = ...
   ): عس {
      return CategoryComponent$ModuleLayoutState(component, present, targetColumn, targetY, preparedHeight, presenceAnimation)
   }

   public operator fun component6(): ري {
      return this.presenceAnimation
   }

   public operator fun component4(): Float {
      return this.targetY
   }

   public final val component: حض

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
         return other is CategoryComponent$ModuleLayoutState
            && this.component == (other as CategoryComponent$ModuleLayoutState).component
            && this.present == (other as CategoryComponent$ModuleLayoutState).present
            && java.lang.Float.compare(this.targetColumn, (other as CategoryComponent$ModuleLayoutState).targetColumn) == 0
            && java.lang.Float.compare(this.targetY, (other as CategoryComponent$ModuleLayoutState).targetY) == 0
            && java.lang.Float.compare(this.preparedHeight, (other as CategoryComponent$ModuleLayoutState).preparedHeight) == 0
            && this.presenceAnimation == (other as CategoryComponent$ModuleLayoutState).presenceAnimation
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

   public final val presenceAnimation: ري
}
