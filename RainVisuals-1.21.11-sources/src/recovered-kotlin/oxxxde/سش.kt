package oxxxde

import kotakbaz.rain.client.util.animations.AnimationUtil

// $VF: Compiled from heavy
private class سش<T>(value: Any, targetPosition: Float, present: Boolean, presenceAnimation: ري, positionAnimation: ري) {
   public final var targetPosition: Float
   private AnimationUtil presenceAnimation;
   public final var value: Any
   private AnimationUtil positionAnimation;
   public final var present: Boolean

   public final val presenceAnimation: ري

   init {
      this.value = (T)value
      this.targetPosition = targetPosition
      this.present = present
      this.presenceAnimation = presenceAnimation
      this.positionAnimation = positionAnimation
   }

   public final val positionAnimation: ري
}
