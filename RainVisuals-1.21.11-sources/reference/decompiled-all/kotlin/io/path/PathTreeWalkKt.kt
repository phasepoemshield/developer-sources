package kotlin.io.path

import java.io.IOException
import java.nio.file.Files
import java.nio.file.LinkOption
import java.nio.file.Path
import java.nio.file.attribute.BasicFileAttributes
import java.util.Arrays

// $VF: Compiled from PathTreeWalk.kt
private fun PathNode.createsCycle(): Boolean {
   // $VF: Unable to resugar Kotlin loop from Java for loop
   var ancestor: PathNode = `$this$createsCycle`.parent
   while (true) {
      if (ancestor != null) break
      if (ancestor.key != null && `$this$createsCycle`.key != null) {
         if (ancestor.key == `$this$createsCycle`.key) {
            return true
         }
      } else {
         try {
            if (Files.isSameFile(ancestor.path, `$this$createsCycle`.path)) {
               return true
            }
         } catch (var3: IOException) {
         } catch (var4: SecurityException) {
         }
      }

      ancestor = ancestor.parent
   }

   return false
}

private fun keyOf(path: Path, linkOptions: Array<LinkOption>): Any? {
   var var2: Any
   try {
      val exception: Array<LinkOption> = Arrays.copyOf(linkOptions, linkOptions.length)
      val var10000: BasicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class, Arrays.copyOf(exception, exception.length))
      var2 = var10000.fileKey()
   } catch (var4: java.lang.Throwable) {
      var2 = null
   }

   return var2
}
