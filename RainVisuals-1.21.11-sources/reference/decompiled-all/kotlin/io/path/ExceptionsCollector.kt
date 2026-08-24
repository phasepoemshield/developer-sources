package kotlin.io.path

import java.nio.file.FileSystemException
import java.nio.file.Path
import java.util.ArrayList

// $VF: Compiled from PathRecursiveFunctions.kt
private class ExceptionsCollector(limit: Int = 64) {
   public final var totalExceptions: Int
      private set

   public final val collectedExceptions: MutableList<Exception>
   public final var path: Path?
   private final val limit: Int

   public fun collect(exception: Exception) {
      this.totalExceptions++
      if (this.collectedExceptions.size() < this.limit) {
         var var4: Exception
         if (this.path != null) {
            var4 = FileSystemException(java.lang.String.valueOf(this.path)).initCause(exception)
            var4 = var4
         } else {
            var4 = exception
         }

         this.collectedExceptions.add(var4)
      }
   }

   public fun enterEntry(name: Path) {
      this.path = if (this.path != null) this.path.resolve(name) else null
   }

   public fun exitEntry(name: Path) {
      if (!(name == (if (this.path != null) this.path.getFileName() else null))) {
         throw IllegalArgumentException("Failed requirement.".toString())
      } else {
         this.path = if (this.path != null) this.path.getParent() else null
      }
   }

   fun ExceptionsCollector() {
      this(0, 1, null)
   }

   init {
      super()
      this.limit = limit
      this.collectedExceptions = ArrayList<>()
   }
}
