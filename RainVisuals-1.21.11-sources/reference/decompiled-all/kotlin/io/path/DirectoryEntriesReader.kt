package kotlin.io.path

import java.nio.file.FileVisitResult
import java.nio.file.FileVisitor
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.SimpleFileVisitor
import java.nio.file.attribute.BasicFileAttributes

// $VF: Compiled from PathTreeWalk.kt
private class DirectoryEntriesReader(followLinks: Boolean) : SimpleFileVisitor<Path> {
   private final var directoryNode: PathNode?
   private final var entries: ArrayDeque<PathNode>
   public final val followLinks: Boolean

   public open fun visitFile(file: Path, attrs: BasicFileAttributes): FileVisitResult {
      this.entries.add(PathNode(file, null, this.directoryNode))
      val var10000: FileVisitResult = super.visitFile(file, attrs)
      return var10000
   }

   init {
      this.followLinks = followLinks
      this.entries = ArrayDeque<>()
   }

   public open fun preVisitDirectory(dir: Path, attrs: BasicFileAttributes): FileVisitResult {
      this.entries.add(PathNode(dir, attrs.fileKey(), this.directoryNode))
      val var10000: FileVisitResult = super.preVisitDirectory(dir, attrs)
      return var10000
   }

   public fun readEntries(directoryNode: PathNode): List<PathNode> {
      this.directoryNode = directoryNode
      Files.walkFileTree(directoryNode.path, LinkFollowing.INSTANCE.toVisitOptions(this.followLinks), 1, this as FileVisitor<in Path>)
      this.entries.removeFirst()
      val var2: ArrayDeque = this.entries
      this.entries = ArrayDeque<>()
      return var2
   }
}
