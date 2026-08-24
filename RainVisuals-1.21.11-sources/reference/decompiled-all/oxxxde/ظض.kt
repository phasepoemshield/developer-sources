package oxxxde

// $VF: Compiled from NotifyModule.kt
private sealed class ظض protected constructor(shownAt: Long, hideAt: Long) {
   public final val widthAnimation: سط
   public final var shownAt: Long
   public final var stackOffsetInitialized: Boolean
   public final val stackOffsetAnimation: سط
   public final var hideAt: Long
   public final var widthInitialized: Boolean

   fun getWidthAnimation(): سط {
      this.widthAnimation
   }

   fun getStackOffsetAnimation(): سط {
      this.stackOffsetAnimation
   }

   init {
      this.shownAt = shownAt
      this.hideAt = hideAt
      this.widthAnimation = سط()
      this.stackOffsetAnimation = سط()
   }
}
