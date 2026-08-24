package kotlin.io

import java.io.File
import java.io.IOException
import java.util.ArrayDeque
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function2

// $VF: Compiled from FileTreeWalk.kt
public class FileTreeWalk private constructor(start: File,
      direction: FileWalkDirection = FileWalkDirection.TOP_DOWN,
      onEnter: ((File) -> Boolean)?,
      onLeave: ((File) -> Unit)?,
      onFail: ((File, IOException) -> Unit)?,
      maxDepth: Int = Integer.MAX_VALUE
   ) :
   Sequence<File> {
   private final val maxDepth: Int
   private final val direction: FileWalkDirection
   private final val start: File
   private final val onEnter: ((File) -> Boolean)?
   private final val onFail: ((File, IOException) -> Unit)?
   private final val onLeave: ((File) -> Unit)?

   init {
      this.start = start
      this.direction = direction
      this.onEnter = onEnter
      this.onLeave = onLeave
      this.onFail = onFail
      this.maxDepth = maxDepth
   }

   public fun onFail(function: (File, IOException) -> Unit): FileTreeWalk {
      return FileTreeWalk(this.start, this.direction, this.onEnter, this.onLeave, function, this.maxDepth)
   }

   public fun maxDepth(depth: Int): FileTreeWalk {
      if (depth <= 0) {
         throw IllegalArgumentException("depth must be positive, but was $depth.")
      } else {
         return FileTreeWalk(this.start, this.direction, this.onEnter, this.onLeave, this.onFail, depth)
      }
   }

   public fun onEnter(function: (File) -> Boolean): FileTreeWalk {
      return FileTreeWalk(this.start, this.direction, function, this.onLeave, this.onFail, this.maxDepth)
   }

   public override operator fun iterator(): Iterator<File> {
      return FileTreeWalk.FileTreeWalkIterator()
   }

   internal constructor(start: File, direction: FileWalkDirection = FileWalkDirection.TOP_DOWN) : this(start, direction, null, null, null, 0, 32, null)
   public fun onLeave(function: (File) -> Unit): FileTreeWalk {
      return FileTreeWalk(this.start, this.direction, this.onEnter, function, this.onFail, this.maxDepth)
   }

   // $VF: Compiled from FileTreeWalk.kt
   private abstract class DirectoryState : FileTreeWalk.WalkState {
      open fun DirectoryState(rootDir: File) {
         super(rootDir)
         if (_Assertions.ENABLED && _Assertions.ENABLED && !rootDir.isDirectory()) {
            throw AssertionError("rootDir must be verified to be directory beforehand.")
         }
      }
   }

   // $VF: Compiled from FileTreeWalk.kt
   private inner class FileTreeWalkIterator : AbstractIterator<File> {
      private final val state: ArrayDeque<kotlin.io.FileTreeWalk.WalkState> = ArrayDeque()

      private tailrec fun gotoNext(): File? {
         while (true) {
            val var10000: FileTreeWalk.WalkState = this.state.peek()
            if (var10000 == null) {
               return null
            }

            val file: File = var10000.step()
            if (file == null) {
               this.state.pop()
               this = this
            } else {
               if (file == var10000.root || !file.isDirectory() || this.state.size() >= FileTreeWalk.this.maxDepth) {
                  return file
               }

               this.state.push(this.directoryState(file))
               this = this
            }
         }
      }

      private fun directoryState(root: File): kotlin.io.FileTreeWalk.DirectoryState {
         var var10000: FileTreeWalk.DirectoryState
         when (FileTreeWalk.FileTreeWalkIterator.WhenMappings.$EnumSwitchMapping$0[FileTreeWalk.this.direction.ordinal()]) {
            1 -> var10000 = FileTreeWalk.FileTreeWalkIterator.TopDownDirectoryState(root)
            2 -> var10000 = FileTreeWalk.FileTreeWalkIterator.BottomUpDirectoryState(root)
            else -> throw NoWhenBranchMatchedException()
         }

         return var10000
      }

      protected override fun computeNext() {
         val nextFile: File = this.gotoNext()
         if (nextFile != null) {
            this.setNext(nextFile)
         } else {
            this.done()
         }
      }

      // $VF: Compiled from FileTreeWalk.kt
      private inner class BottomUpDirectoryState(rootDir: File) : FileTreeWalk.DirectoryState(rootDir) {
         private final var failed: Boolean
         private final var fileIndex: Int
         private final var fileList: Array<File>?
         private final var rootVisited: Boolean

         public override fun step(): File? {
            if (!this.failed && this.fileList == null) {
               val var10000: Function1 = FileTreeWalk.this.onEnter
               if (var10000 != null && !var10000(this.getRoot()) as java.lang.Boolean) {
                  return null
               }

               this.fileList = this.getRoot().listFiles()
               if (this.fileList == null) {
                  val var2: Function2 = FileTreeWalk.this.onFail
                  if (var2 != null) {
                     var2(this.getRoot(), AccessDeniedException(this.getRoot(), null, "Cannot list files in a directory", 2, null))
                  }

                  this.failed = true
               }
            }

            if (this.fileList != null) {
               val var3: Int = this.fileIndex
               val var10001: Array<File> = this.fileList
               if (var3 < var10001.length) {
                  val var5: Array<File> = this.fileList
                  return var5[this.fileIndex++]
               }
            }

            if (!this.rootVisited) {
               this.rootVisited = true
               return this.getRoot()
            } else {
               val var4: Function1 = FileTreeWalk.this.onLeave
               if (var4 != null) {
                  var4(this.getRoot())
               }

               return null
            }
         }
      }

      // $VF: Compiled from FileTreeWalk.kt
      private inner class SingleFileState(rootFile: File) : FileTreeWalk.WalkState(rootFile) {
         private final var visited: Boolean

         public override fun step(): File? {
            if (this.visited) {
               return null
            } else {
               this.visited = true
               return this.getRoot()
            }
         }
      }

      // $VF: Compiled from FileTreeWalk.kt
      private inner class TopDownDirectoryState(rootDir: File) : FileTreeWalk.DirectoryState(rootDir) {
         private final var rootVisited: Boolean
         private final var fileList: Array<File>?
         private final var fileIndex: Int

         public override fun step(): File? {
            if (!this.rootVisited) {
               val var7: Function1 = FileTreeWalk.this.onEnter
               if (var7 != null && !var7(this.getRoot()) as java.lang.Boolean) {
                  return null
               } else {
                  this.rootVisited = true
                  return this.getRoot()
               }
            } else {
               if (this.fileList != null) {
                  val var10000: Int = this.fileIndex
                  val var10001: Array<File> = this.fileList
                  if (var10000 >= var10001.length) {
                     val var6: Function1 = FileTreeWalk.this.onLeave
                     if (var6 != null) {
                        var6(this.getRoot())
                     }

                     return null
                  }
               }

               label75@
               if (this.fileList == null) {
                  this.fileList = this.getRoot().listFiles()
                  if (this.fileList == null) {
                     val var2: Function2 = FileTreeWalk.this.onFail
                     if (var2 != null) {
                        var2(this.getRoot(), AccessDeniedException(this.getRoot(), null, "Cannot list files in a directory", 2, null))
                     }
                  }

                  if (this.fileList != null) {
                     val var3: Array<File> = this.fileList
                     if (var3.length != 0) {
                        break@label75
                     }
                  }

                  val var4: Function1 = FileTreeWalk.this.onLeave
                  if (var4 != null) {
                     var4(this.getRoot())
                  }

                  return null
               }

               val var5: Array<File> = this.fileList
               return var5[this.fileIndex++]
            }
         }
      }
   }

   // $VF: Compiled from FileTreeWalk.kt
   private abstract class WalkState {
      public final val root: File

      open fun WalkState(root: File) {
         this.root = root
      }

      public abstract fun step(): File? {
      }
   }
}
