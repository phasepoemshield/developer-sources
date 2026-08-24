package oxxxde

// $VF: Compiled from heavy
private class رخ : ظض {
   public final var enabled: Boolean
   public final var statusTransitionStartedAt: Long
   public final val moduleName: String
   public final val toggleAnimation: سط
   public final var previousEnabled: Boolean

   fun رخ(
      shownAt: java.lang.String,
      previousEnabled: Boolean,
      hideAt: Long,
      toggleAnimation: Long,
      enabled: سط,
      statusTransitionStartedAt: Boolean,
      moduleName: Long
   ) {
      super(shownAt, hideAt, null)
      this.moduleName = moduleName
      this.enabled = enabled
      this.toggleAnimation = toggleAnimation
      this.previousEnabled = previousEnabled
      this.statusTransitionStartedAt = statusTransitionStartedAt
   }

   fun getToggleAnimation(): سط {
      this.toggleAnimation
   }
}
