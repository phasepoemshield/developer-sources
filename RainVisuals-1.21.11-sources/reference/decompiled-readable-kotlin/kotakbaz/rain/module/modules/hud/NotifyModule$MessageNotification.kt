package kotakbaz.rain.module.modules.hud

import oxxxde.طإ

// $VF: Compiled from heavy
private class `NotifyModule$MessageNotification`(moduleName: String,
   icon: String,
   segments: List<طإ>,
   previousSegments: List<طإ>,
   shownAt: Long,
   hideAt: Long,
   textTransitionStartedAt: Long = 0L,
   actionLabel: String? = null,
   actionUrl: String? = null
) : NotifyModule$NotificationEntry(shownAt, hideAt) {
   public final var actionHeight: Float
   public final var actionWidth: Float
   public final var actionY: Float
   public final var previousSegments: List<طإ>
   public final val actionLabel: String?
   public final val icon: String
   public final var segments: List<طإ>
   public final val actionUrl: String?
   public final val moduleName: String
   public final var textTransitionStartedAt: Long
   public final var actionHovered: Boolean
   public final var actionX: Float

   public fun clearActionBounds() {
      this.actionX = 0.0F
      this.actionY = 0.0F
      this.actionWidth = 0.0F
      this.actionHeight = 0.0F
      this.actionHovered = false
   }

   init {
      this.moduleName = moduleName
      this.icon = icon
      this.segments = segments
      this.previousSegments = previousSegments
      this.textTransitionStartedAt = textTransitionStartedAt
      this.actionLabel = actionLabel
      this.actionUrl = actionUrl
   }
}
