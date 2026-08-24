package kotakbaz.rain.module.modules.hud

import kotakbaz.rain.client.draggable.animation.AnimationUtil
import oxxxde.سط

// $VF: Compiled from NotifyModule.kt
private sealed class `NotifyModule$NotificationEntry` protected constructor(shownAt: Long, hideAt: Long) {
   private AnimationUtil widthAnimation;
   public final var shownAt: Long
   public final var stackOffsetInitialized: Boolean
   private AnimationUtil stackOffsetAnimation;
   public final var hideAt: Long
   public final var widthInitialized: Boolean

   public final val widthAnimation: سط

   public final val stackOffsetAnimation: سط

   init {
      this.shownAt = shownAt
      this.hideAt = hideAt
      this.widthAnimation = AnimationUtil()
      this.stackOffsetAnimation = AnimationUtil()
   }
}
