@file:JvmMultifileClass
@file:JvmName("FilesKt")

package kotlin.io

import java.io.Closeable
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.IOException
import java.util.ArrayList
import kotlin.jvm.functions.Function2

// $VF: Compiled from Utils.kt
public final val invariantSeparatorsPath: String
   public final get() {
      var var1: java.lang.String
      if (File.separatorChar != '/') {
         var1 = `$this$invariantSeparatorsPath`.getPath()
         var1 = StringsKt.replace$default(var1, File.separatorChar, '/', false, 4, null)
      } else {
         var1 = `$this$invariantSeparatorsPath`.getPath()
      }

      return var1
   }


public final val nameWithoutExtension: String
   public final get() {
      val var10000: java.lang.String = `$this$nameWithoutExtension`.getName()
      return StringsKt.substringBeforeLast$default(var10000, ".", null, 2, null)
   }


public fun File.copyTo(target: File, overwrite: Boolean = false, bufferSize: Int = 8192): File {
   if (!`$this$copyTo`.exists()) {
      throw NoSuchFileException(`$this$copyTo`, null, "The source file doesn't exist.", 2, null)
   } else {
      if (target.exists()) {
         if (!overwrite) {
            throw FileAlreadyExistsException(`$this$copyTo`, target, "The destination file already exists.")
         }

         if (!target.delete()) {
            throw FileAlreadyExistsException(`$this$copyTo`, target, "Tried to overwrite the destination, but failed to delete it.")
         }
      }

      if (`$this$copyTo`.isDirectory()) {
         if (!target.mkdirs()) {
            throw FileSystemException(`$this$copyTo`, target, "Failed to create target directory.")
         }
      } else {
         val var10000: File = target.getParentFile()
         if (var10000 != null) {
            var10000.mkdirs()
         }

         val var4: Closeable = FileInputStream(`$this$copyTo`)
         var var5: java.lang.Throwable = null

         try {
            val input: FileInputStream = var4 as FileInputStream
            val var9: Closeable = FileOutputStream(target)
            var var10: java.lang.Throwable = null

            try {
               val var26: Long = ByteStreamsKt.copyTo(input, var9 as FileOutputStream, bufferSize)
            } catch (var22: java.lang.Throwable) {
               var10 = var22
               throw var22
            } finally {
               CloseableKt.closeFinally(var9, var10)
            }
         } catch (var24: java.lang.Throwable) {
            var5 = var24
            throw var24
         } finally {
            CloseableKt.closeFinally(var4, var5)
         }
      }

      return target
   }
}

public fun File.endsWith(other: String): Boolean {
   return FilesKt.endsWith(`$this$endsWith`, File(other))
}

public fun File.copyRecursively(
   target: File,
   overwrite: Boolean = false,
   onError: (File, IOException) -> OnErrorAction = { <anonymous parameter 0>, exception ->
         throw exception
      } as Function2
): Boolean {
   if (!`$this$copyRecursively`.exists()) {
      return onError(`$this$copyRecursively`, NoSuchFileException(`$this$copyRecursively`, null, "The source file doesn't exist.", 2, null))
         != OnErrorAction.TERMINATE
      } else {
      try {
         for (src in FilesKt.walkTopDown(`$this$copyRecursively`).onFail(         // $VF: Compiled from Utils.kt
{ f: File, e: IOException ->
            if (onError(f, e) === OnErrorAction.TERMINATE) {
               throw TerminateException(f)
            }
         } as (File?, IOException?) -> Unit)) {
            if (!src.exists()) {
               if (onError(src, NoSuchFileException(src, null, "The source file doesn't exist.", 2, null)) === OnErrorAction.TERMINATE) {
                  return false
               }
            } else {
               val dstFile: File = File(target, FilesKt.toRelativeString(src, `$this$copyRecursively`))
               if (dstFile.exists()
                  && (!src.isDirectory() || !dstFile.isDirectory())
                  && (!overwrite || (if (dstFile.isDirectory()) !FilesKt.deleteRecursively(dstFile) else !dstFile.delete()))) {
                  if (onError(dstFile, FileAlreadyExistsException(src, dstFile, "The destination file already exists.")) === OnErrorAction.TERMINATE) {
                     return false
                  }
                  continue
               } else if (src.isDirectory()) {
                  dstFile.mkdirs()
               } else if (FilesKt.copyTo$default(src, dstFile, overwrite, 0, 4, null).length() != src.length()
                  && onError(src, IOException("Source file wasn't copied completely, length of destination file differs.")) === OnErrorAction.TERMINATE) {
                  return false
               }
            }
         }

         return true
      } catch (var9: TerminateException) {
         return false
      }
   }
}

public final val extension: String
   public final get() {
      val var10000: java.lang.String = `$this$extension`.getName()
      return StringsKt.substringAfterLast(var10000, '.', "")
   }


public fun File.resolveSibling(relative: String): File {
   return FilesKt.resolveSibling(`$this$resolveSibling`, File(relative))
}

public fun File.relativeTo(base: File): File {
   return File(FilesKt.toRelativeString(`$this$relativeTo`, base))
}

public fun File.startsWith(other: String): Boolean {
   return FilesKt.startsWith(`$this$startsWith`, File(other))
}

public fun File.resolve(relative: String): File {
   return FilesKt.resolve(`$this$resolve`, File(relative))
}

public fun File.endsWith(other: File): Boolean {
   val components: FilePathComponents = FilesKt.toComponents(`$this$endsWith`)
   val otherComponents: FilePathComponents = FilesKt.toComponents(other)
   if (otherComponents.isRooted) {
      return `$this$endsWith` == other
   } else {
      val shift: Int = components.size - otherComponents.size
      return shift >= 0 && components.segments.subList(shift, components.size).equals(otherComponents.segments)
   }
}

public fun File.startsWith(other: File): Boolean {
   val components: FilePathComponents = FilesKt.toComponents(`$this$startsWith`)
   val otherComponents: FilePathComponents = FilesKt.toComponents(other)
   return components.root == otherComponents.root
      && components.size >= otherComponents.size
      && components.segments.subList(0, otherComponents.size).equals(otherComponents.segments)
   }

public fun File.relativeToOrNull(base: File): File? {
   val var10000: java.lang.String = toRelativeStringOrNull$FilesKt__UtilsKt(`$this$relativeToOrNull`, base)
   return if (var10000 != null) File(var10000) else null
}

public fun File.deleteRecursively(): Boolean {
   val `$this$fold$iv`: Sequence = FilesKt.walkBottomUp(`$this$deleteRecursively`)
   var `accumulator$iv`: Boolean = true

   for (`element$iv` in `$this$fold$iv`) {
      `accumulator$iv` = ((`element$iv` as File).delete() || !(`element$iv` as File).exists()) && `accumulator$iv`
   }

   return `accumulator$iv`
}

private fun List<File>.normalize(): List<File> {
   val list: java.util.List = ArrayList(`$this$normalize`.size())

   for (file in `$this$normalize`) {
      val var4: java.lang.String = file.getName()
      if (!(var4 == ".")) {
         if (var4 == "..") {
            if (!list.isEmpty() && !(CollectionsKt.<File>last(list).getName() == "..")) {
               list.remove(list.size() - 1)
            } else {
               list.add(file)
            }
         } else {
            list.add(file)
         }
      }
   }

   return list
}

public fun File.toRelativeString(base: File): String {
   val var10000: java.lang.String = toRelativeStringOrNull$FilesKt__UtilsKt(`$this$toRelativeString`, base)
   if (var10000 == null) {
      throw IllegalArgumentException("this and base files have different roots: $`$this$toRelativeString` and $base.")
   } else {
      return var10000
   }
}

open fun FilesKt__UtilsKt() {
}

public fun File.resolve(relative: File): File {
   if (FilesKt.isRooted(relative)) {
      return relative
   } else {
      val var10000: java.lang.String = `$this$resolve`.toString()
      return if (var10000.length() != 0 && !StringsKt.endsWith$default(var10000, File.separatorChar, false, 2, null))
         File("$var10000${File.separatorChar}$relative")
         else
         File("$var10000$relative")
      }
}

public fun File.relativeToOrSelf(base: File): File {
   val var10000: java.lang.String = toRelativeStringOrNull$FilesKt__UtilsKt(`$this$relativeToOrSelf`, base)
   return if (var10000 != null) File(var10000) else `$this$relativeToOrSelf`
}

@Deprecated(message = "Avoid creating temporary directories in the default temp location with this function due to too wide permissions on the newly created directory. Use kotlin.io.path.createTempDirectory instead.")
public fun createTempDir(prefix: String = "tmp", suffix: String? = null, directory: File? = null): File {
   val dir: File = File.createTempFile(prefix, suffix, directory)
   dir.delete()
   if (dir.mkdir()) {
      return dir
   } else {
      throw IOException("Unable to create temporary directory $dir.")
   }
}

public fun File.resolveSibling(relative: File): File {
   val components: FilePathComponents = FilesKt.toComponents(`$this$resolveSibling`)
   return FilesKt.resolve(FilesKt.resolve(components.root, if (components.size == 0) File("..") else components.subPath(0, components.size - 1)), relative)
}

private fun FilePathComponents.normalize(): FilePathComponents {
   return FilePathComponents(`$this$normalize`.root, normalize$FilesKt__UtilsKt(`$this$normalize`.segments))
}

private fun File.toRelativeStringOrNull(base: File): String? {
   val thisComponents: FilePathComponents = normalize$FilesKt__UtilsKt(FilesKt.toComponents(`$this$toRelativeStringOrNull`))
   val baseComponents: FilePathComponents = normalize$FilesKt__UtilsKt(FilesKt.toComponents(base))
   if (!(thisComponents.root == baseComponents.root)) {
      return null
   } else {
      val baseCount: Int = baseComponents.size
      val thisCount: Int = thisComponents.size
      var i: Int = 0
      val maxSameCount: Int = Math.min(thisCount, baseCount)

      while (i < maxSameCount && thisComponents.segments.get(i) == baseComponents.segments.get(i)) {
         i++
      }

      val sameCount: Int = i
      val res: StringBuilder = StringBuilder()
      var ix: Int = baseCount - 1
      if (i <= baseCount - 1) {
         while (true) {
            if (baseComponents.segments.get(ix).getName() == "..") {
               return null
            }

            res.append("..")
            if (ix != sameCount) {
               res.append(File.separatorChar)
            }

            if (ix == sameCount) {
               break
            }

            ix--
         }
      }

      if (sameCount < thisCount) {
         if (sameCount < baseCount) {
            res.append(File.separatorChar)
         }

         val var10000: java.lang.Iterable = CollectionsKt.drop(thisComponents.segments, sameCount)
         val var10001: Appendable = res
         val var10002: java.lang.String = File.separator
         CollectionsKt.joinTo$default(var10000, var10001, var10002, null, null, 0, null, null, 124, null)
      }

      return res.toString()
   }
}

@Deprecated(message = "Avoid creating temporary files in the default temp location with this function due to too wide permissions on the newly created file. Use kotlin.io.path.createTempFile instead or resort to java.io.File.createTempFile.")
public fun createTempFile(prefix: String = "tmp", suffix: String? = null, directory: File? = null): File {
   val var10000: File = File.createTempFile(prefix, suffix, directory)
   return var10000
}

public fun File.normalize(): File {
   val `$this$normalize_u24lambda_u245`: FilePathComponents = FilesKt.toComponents(`$this$normalize`)
   val var10000: File = `$this$normalize_u24lambda_u245`.root
   val var10001: java.lang.Iterable = normalize$FilesKt__UtilsKt(`$this$normalize_u24lambda_u245`.segments)
   val var10002: java.lang.String = File.separator
   return FilesKt.resolve(var10000, CollectionsKt.joinToString$default(var10001, var10002, null, null, 0, null, null, 62, null))
}
