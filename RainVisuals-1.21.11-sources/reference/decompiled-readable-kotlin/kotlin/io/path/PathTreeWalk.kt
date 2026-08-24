package kotlin.io.path

import java.nio.file.FileSystemLoopException
import java.nio.file.Files
import java.nio.file.LinkOption
import java.nio.file.Path
import java.util.Arrays
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.InlineMarker

// $VF: Compiled from PathTreeWalk.kt
@ExperimentalPathApi
internal class PathTreeWalk(start: Path, vararg options: Any) : Sequence<Path> {
   private final val start: Path
   private final val options: Array<out PathWalkOption>

   public override operator fun iterator(): Iterator<Path> {
      return if (this.isBFS) this.bfsIterator() else this.dfsIterator()
   }

   init {
      this.start = start
      this.options = options
   }

   private final val includeDirectories: Boolean
      private final get() {
         return ArraysKt.contains(this.options, PathWalkOption.INCLUDE_DIRECTORIES)
      }


   private suspend inline fun SequenceScope<Path>.yieldIfNeeded(node: PathNode, entriesReader: DirectoryEntriesReader, entriesAction: (List<PathNode>) -> Unit) {
      val path: Path = node.path
      var var9: Array<LinkOption> = access$getLinkOptions(this)
      var9 = Arrays.copyOf(var9, var9.length)
      if (Files.isDirectory(path, Arrays.copyOf(var9, var9.length))) {
         if (PathTreeWalkKt.access$createsCycle(node)) {
            throw FileSystemLoopException(path.toString())
         }

         if (access$getIncludeDirectories(this)) {
            InlineMarker.mark(0)
            `$this$yieldIfNeeded`.yield(path, `$completion`)
            InlineMarker.mark(1)
         }

         var9 = access$getLinkOptions(this)
         var9 = Arrays.copyOf(var9, var9.length)
         if (Files.isDirectory(path, Arrays.copyOf(var9, var9.length))) {
            entriesAction(entriesReader.readEntries(node))
         }
      } else {
         var9 = arrayOf(LinkOption.NOFOLLOW_LINKS)
         if (Files.exists(path, Arrays.copyOf(var9, var9.length))) {
            InlineMarker.mark(0)
            `$this$yieldIfNeeded`.yield(path, `$completion`)
            InlineMarker.mark(1)
            return Unit.INSTANCE
         }
      }

      return Unit.INSTANCE
   }

   private final val isBFS: Boolean
      private final get() {
         return ArraysKt.contains(this.options, PathWalkOption.BREADTH_FIRST)
      }


   private final val followLinks: Boolean
      private final get() {
         return ArraysKt.contains(this.options, PathWalkOption.FOLLOW_LINKS)
      }


   private final val linkOptions: Array<LinkOption>
      private final get() {
         return LinkFollowing.INSTANCE.toLinkOptions(this.followLinks)
      }


   private fun dfsIterator(): Iterator<Path> {
      return SequencesKt.iterator(      // $VF: Compiled from PathTreeWalk.kt
{
         // $VF: Could not decompile lambda - root function was not found. Is this a suspend lambda?
      } as (SequenceScope<in Path>?, Continuation<in Unit>?) -> Any)
   }

   private fun bfsIterator(): Iterator<Path> {
      return SequencesKt.iterator(      // $VF: Compiled from PathTreeWalk.kt
{
         // $VF: Could not decompile lambda - root function was not found. Is this a suspend lambda?
      } as (SequenceScope<in Path>?, Continuation<in Unit>?) -> Any)
   }
}
