package kotakbaz.rain.module.modules.hud

import kotakbaz.rain.client.draggable.animation.AnimationUtil
import oxxxde.سط

// $VF: Compiled from heavy
private class `NotifyModule$ModuleStateNotification`(moduleName: String,
   enabled: Boolean,
   shownAt: Long,
   hideAt: Long,
   toggleAnimation: سط,
   previousEnabled: Boolean,
   statusTransitionStartedAt: Long = ...
) : NotifyModule$NotificationEntry(shownAt, hideAt) {
   public final var enabled: Boolean
   public final var statusTransitionStartedAt: Long
   public final val moduleName: String
   private AnimationUtil toggleAnimation;
   public final var previousEnabled: Boolean

   init {
      this.moduleName = moduleName
      this.enabled = enabled
      this.toggleAnimation = toggleAnimation
      this.previousEnabled = previousEnabled
      this.statusTransitionStartedAt = statusTransitionStartedAt
   }

   public final val toggleAnimation: سط
}
