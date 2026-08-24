package kotlin.io.path

import java.nio.file.FileVisitOption
import java.nio.file.LinkOption

// $VF: Compiled from PathTreeWalk.kt
internal object LinkFollowing {
   private final val followVisitOption: Set<FileVisitOption> = SetsKt.setOf(FileVisitOption.FOLLOW_LINKS)
   private final val nofollowLinkOption: Array<LinkOption>
   private final val followLinkOption: Array<LinkOption>
   private final val nofollowVisitOption: Set<FileVisitOption> = SetsKt.emptySet()

   public fun toVisitOptions(followLinks: Boolean): Set<FileVisitOption> {
      return if (followLinks) followVisitOption else nofollowVisitOption
   }

   public fun toLinkOptions(followLinks: Boolean): Array<LinkOption> {
      return if (followLinks) followLinkOption else nofollowLinkOption
   }
}
