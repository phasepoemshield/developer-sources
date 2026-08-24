@file:JvmMultifileClass
@file:JvmName("FilesKt")

package kotlin.io

import java.io.File
import java.util.ArrayList

// $VF: Compiled from FilePathComponents.kt
internal fun File.subPath(beginIndex: Int, endIndex: Int): File {
   return FilesKt.toComponents(`$this$subPath`).subPath(beginIndex, endIndex)
}

open fun FilesKt__FilePathComponentsKt() {
}

internal final val rootName: String
   internal final get() {
      var var10000: java.lang.String = `$this$rootName`.getPath()
      val var4: java.lang.String = `$this$rootName`.getPath()
      var10000 = var10000.substring(0, getRootLength$FilesKt__FilePathComponentsKt(var4))
      return var10000
   }


internal fun File.toComponents(): FilePathComponents {
   val path: java.lang.String = `$this$toComponents`.getPath()
   val rootLength: Int = getRootLength$FilesKt__FilePathComponentsKt(path)
   var var10000: java.lang.String = path.substring(0, rootLength)
   var10000 = path.substring(rootLength)
   val var20: java.util.List
   if (var10000.length() == 0) {
      var20 = CollectionsKt.emptyList()
   } else {
      val var18: java.lang.Iterable = StringsKt.split$default(var10000, charArrayOf(File.separatorChar), false, 0, 6, null)
      val `destination$iv$iv`: java.util.Collection = ArrayList(CollectionsKt.collectionSizeOrDefault(var18, 10))

      for (`item$iv$iv` in var18) {
         `destination$iv$iv`.add(File(`item$iv$iv` as java.lang.String))
      }

      var20 = `destination$iv$iv` as java.util.List
   }

   return FilePathComponents(File(var10000), var20)
}

private fun String.getRootLength(): Int {
   var first: Int = StringsKt.indexOf$default(`$this$getRootLength`, File.separatorChar, 0, false, 4, null)
   if (first == 0) {
      if (`$this$getRootLength`.length() > 1 && `$this$getRootLength`.charAt(1) == File.separatorChar) {
         first = StringsKt.indexOf$default(`$this$getRootLength`, File.separatorChar, 2, false, 4, null)
         if (first >= 0) {
            first = StringsKt.indexOf$default(`$this$getRootLength`, File.separatorChar, first + 1, false, 4, null)
            if (first >= 0) {
               return first + 1
            }

            return `$this$getRootLength`.length()
         }
      }

      return 1
   } else if (first > 0 && `$this$getRootLength`.charAt(first + -1) == ':') {
      return first + 1
   } else {
      return if (first == -1 && StringsKt.endsWith$default(`$this$getRootLength`, (char)58, false, 2, null)) `$this$getRootLength`.length() else 0
   }
}

public final val isRooted: Boolean
   public final get() {
      val var10000: java.lang.String = `$this$isRooted`.getPath()
      return getRootLength$FilesKt__FilePathComponentsKt(var10000) > 0
   }


internal final val root: File
   internal final get() {
      return File(FilesKt.getRootName(`$this$root`))
   }

