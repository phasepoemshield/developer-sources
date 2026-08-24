package kotlin.io.path

import java.nio.file.Path
import java.nio.file.Paths

// $VF: Compiled from PathUtils.kt
private object PathRelativizer {
   private final val parentPath: Path = Paths.get("..")
   private final val emptyPath: Path = Paths.get("")

   public fun tryRelativeTo(path: Path, base: Path): Path {
      val bn: Path = base.normalize()
      val pn: Path = path.normalize()
      val rn: Path = bn.relativize(pn)
      var r: Int = 0

      // $VF: Unable to resugar Kotlin loop from Java for loop
      val rnString: Int = Math.min(bn.getNameCount(), pn.getNameCount())
      while (true) {
         if (r < rnString && bn.getName(r) == parentPath) break
         if (!(pn.getName(r) == parentPath)) {
            throw IllegalArgumentException("Unable to compute relative path")
         }

         r++
      }

      val var10000: Path
      if (!(pn == bn) && bn == emptyPath) {
         var10000 = pn
      } else {
         val var9: java.lang.String = rn.toString()
         val var10001: java.lang.String = rn.getFileSystem().getSeparator()
         var10000 = if (StringsKt.endsWith$default(var9, var10001, false, 2, null))
            rn.getFileSystem().getPath(StringsKt.dropLast(var9, rn.getFileSystem().getSeparator().length()))
            else
            rn
         }

      return var10000
   }
}
