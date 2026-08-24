@file:JvmMultifileClass
@file:JvmName("PathsKt")

package kotlin.io.path

import java.io.Closeable
import java.net.URI
import java.nio.file.CopyOption
import java.nio.file.DirectoryStream
import java.nio.file.FileAlreadyExistsException
import java.nio.file.FileStore
import java.nio.file.FileVisitOption
import java.nio.file.FileVisitor
import java.nio.file.Files
import java.nio.file.LinkOption
import java.nio.file.Path
import java.nio.file.Paths
import java.nio.file.StandardCopyOption
import java.nio.file.attribute.FileAttribute
import java.nio.file.attribute.FileTime
import java.nio.file.attribute.PosixFilePermission
import java.nio.file.attribute.UserPrincipal
import java.util.Arrays
import kotlin.contracts.InvocationKind
import kotlin.internal.InlineOnly
import kotlin.internal.PlatformImplementationsKt
import kotlin.jvm.internal.InlineMarker

// $VF: Compiled from PathUtils.kt
@WasExperimental(markerClass = [ExperimentalPathApi::class])
@InlineOnly
@SinceKotlin(version = "1.5")
@Throws(java/io/IOException::class)
public inline fun Path.createDirectories(vararg attributes: FileAttribute<*>): Path {
   val var10000: Path = Files.createDirectories(`$this$createDirectories`, Arrays.copyOf(attributes, attributes.length))
   return var10000
}

@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalPathApi::class])
@InlineOnly
public inline fun Path(base: String, vararg subpaths: String): Path {
   val var10000: Path = Paths.get(base, Arrays.copyOf(subpaths, subpaths.length))
   return var10000
}

@SinceKotlin(version = "1.5")
@InlineOnly
@WasExperimental(markerClass = [ExperimentalPathApi::class])
public inline fun Path.isRegularFile(vararg options: LinkOption): Boolean {
   return Files.isRegularFile(`$this$isRegularFile`, Arrays.copyOf(options, options.length))
}

@Deprecated(
   message = "Use invariantSeparatorsPathString property instead.",
   replaceWith = @ReplaceWith(expression = "invariantSeparatorsPathString", imports = {}),
   level = DeprecationLevel.ERROR
)
@SinceKotlin(version = "1.4")
@ExperimentalPathApi
@InlineOnly
public final val invariantSeparatorsPath: String
   public final inline get() {
      return PathsKt.getInvariantSeparatorsPathString(`$this$invariantSeparatorsPath`)
   }


@InlineOnly
@WasExperimental(markerClass = [ExperimentalPathApi::class])
@SinceKotlin(version = "1.5")
@Throws(java/io/IOException::class)
public inline fun Path.createSymbolicLinkPointingTo(target: Path, vararg attributes: FileAttribute<*>): Path {
   val var10000: Path = Files.createSymbolicLink(`$this$createSymbolicLinkPointingTo`, target, Arrays.copyOf(attributes, attributes.length))
   return var10000
}

@WasExperimental(markerClass = [ExperimentalPathApi::class])
@SinceKotlin(version = "1.5")
@InlineOnly
public inline fun URI.toPath(): Path {
   val var10000: Path = Paths.get(`$this$toPath`)
   return var10000
}

@WasExperimental(markerClass = [ExperimentalPathApi::class])
@SinceKotlin(version = "1.5")
@InlineOnly
@Throws(java/io/IOException::class)
public inline fun Path.createDirectory(vararg attributes: FileAttribute<*>): Path {
   val var10000: Path = Files.createDirectory(`$this$createDirectory`, Arrays.copyOf(attributes, attributes.length))
   return var10000
}

@WasExperimental(markerClass = [ExperimentalPathApi::class])
@SinceKotlin(version = "1.5")
@InlineOnly
public inline operator fun Path.div(other: Path): Path {
   val var10000: Path = `$this$div`.resolve(other)
   return var10000
}

@WasExperimental(markerClass = [ExperimentalPathApi::class])
@SinceKotlin(version = "1.5")
@InlineOnly
@Throws(java/io/IOException::class)
public inline fun Path.isSameFileAs(other: Path): Boolean {
   return Files.isSameFile(`$this$isSameFileAs`, other)
}

@InlineOnly
@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalPathApi::class])
@Throws(java/io/IOException::class)
public inline fun Path.copyTo(target: Path, overwrite: Boolean = false): Path {
   val var10000: Array<CopyOption> = if (overwrite) arrayOf(StandardCopyOption.REPLACE_EXISTING) else arrayOfNulls(0)
   val var6: Path = Files.copy(`$this$copyTo`, target, Arrays.copyOf(var10000, var10000.length))
   return var6
}

@WasExperimental(markerClass = ExperimentalPathApi.class)
@SinceKotlin(version = "1.5")
public final val invariantSeparatorsPathString: String
   public final get() {
      val separator: java.lang.String = `$this$invariantSeparatorsPathString`.getFileSystem().getSeparator()
      var var2: java.lang.String
      if (!(separator == "/")) {
         var2 = `$this$invariantSeparatorsPathString`.toString()
         var2 = StringsKt.replace$default(var2, separator, "/", false, 4, null)
      } else {
         var2 = `$this$invariantSeparatorsPathString`.toString()
      }

      return var2
   }


@InlineOnly
@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalPathApi::class])
@Throws(java/io/IOException::class)
public inline fun createTempFile(prefix: String? = null, suffix: String? = null, vararg attributes: FileAttribute<*>): Path {
   val var10000: Path = Files.createTempFile(prefix, suffix, Arrays.copyOf(attributes, attributes.length))
   return var10000
}

@WasExperimental(markerClass = [ExperimentalPathApi::class])
@SinceKotlin(version = "1.5")
@InlineOnly
@Throws(java/io/IOException::class)
public inline fun Path.deleteExisting() {
   Files.delete(`$this$deleteExisting`)
}

@SinceKotlin(version = "1.5")
@InlineOnly
@WasExperimental(markerClass = [ExperimentalPathApi::class])
@Throws(java/io/IOException::class)
public inline fun Path.forEachDirectoryEntry(glob: String = "*", action: (Path) -> Unit) {
   val var3: Closeable = Files.newDirectoryStream(`$this$forEachDirectoryEntry`, glob)
   var var4: java.lang.Throwable = null

   try {
      val var19: Boolean = true
      val it: DirectoryStream = var3 as DirectoryStream

      for (`element$iv` in it) {
         action(`element$iv`)
      }
   } catch (var16: java.lang.Throwable) {
      var4 = var16
      throw var16
   } finally {
      if (var14) {
         InlineMarker.finallyStart(1)
         if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0)) {
            CloseableKt.closeFinally(var3, var4)
         } else if (var3 != null) {
            if (var4 == null) {
               var3.close()
            } else {
               try {
                  var3.close()
               } catch (var15: java.lang.Throwable) {
               }
            }
         }

         InlineMarker.finallyEnd(1)
      }
   }

   InlineMarker.finallyStart(1)
   if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0)) {
      CloseableKt.closeFinally(var3, null)
   } else if (var3 != null) {
      var3.close()
   }

   InlineMarker.finallyEnd(1)
   val var14: Boolean
}

@WasExperimental(markerClass = [ExperimentalPathApi::class])
@InlineOnly
@SinceKotlin(version = "1.5")
@Throws(java/io/IOException::class)
public inline fun Path.isHidden(): Boolean {
   return Files.isHidden(`$this$isHidden`)
}

@WasExperimental(markerClass = [ExperimentalPathApi::class])
@SinceKotlin(version = "1.5")
@InlineOnly
public inline fun Path(path: String): Path {
   val var10000: Path = Paths.get(path)
   return var10000
}

@InlineOnly
@WasExperimental(markerClass = [ExperimentalPathApi::class])
@SinceKotlin(version = "1.5")
@Throws(java/io/IOException::class)
public inline fun Path.deleteIfExists(): Boolean {
   return Files.deleteIfExists(`$this$deleteIfExists`)
}

@WasExperimental(markerClass = [ExperimentalPathApi::class])
@SinceKotlin(version = "1.5")
@InlineOnly
public inline fun Path.isExecutable(): Boolean {
   return Files.isExecutable(`$this$isExecutable`)
}

@InlineOnly
@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalPathApi::class])
public inline fun Path.isWritable(): Boolean {
   return Files.isWritable(`$this$isWritable`)
}

@WasExperimental(markerClass = [ExperimentalPathApi::class])
@SinceKotlin(version = "1.5")
@InlineOnly
@Throws(java/io/IOException::class)
public inline fun <T> Path.useDirectoryEntries(glob: String = "*", block: (Sequence<Path>) -> Any): Any {
   val var3: Closeable = Files.newDirectoryStream(`$this$useDirectoryEntries`, glob)
   var var4: java.lang.Throwable = null

   var var14: java.lang.Iterable
   try {
      val var15: Boolean = true
      var14 = var3 as DirectoryStream
      var14 = (java.lang.Iterable)block(CollectionsKt.asSequence(var14))
   } catch (var12: java.lang.Throwable) {
      var4 = var12
      throw var12
   } finally {
      if (var10) {
         InlineMarker.finallyStart(1)
         if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0)) {
            CloseableKt.closeFinally(var3, var4)
         } else if (var3 != null) {
            if (var4 == null) {
               var3.close()
            } else {
               try {
                  var3.close()
               } catch (var11: java.lang.Throwable) {
               }
            }
         }

         InlineMarker.finallyEnd(1)
      }
   }

   InlineMarker.finallyStart(1)
   if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0)) {
      CloseableKt.closeFinally(var3, null)
   } else if (var3 != null) {
      var3.close()
   }

   InlineMarker.finallyEnd(1)
   return (T)var14
   val var10: Boolean
}

@InlineOnly
@WasExperimental(markerClass = [ExperimentalPathApi::class])
@SinceKotlin(version = "1.5")
@Throws(java/io/IOException::class)
public inline fun Path.moveTo(target: Path, overwrite: Boolean = false): Path {
   val var10000: Array<CopyOption> = if (overwrite) arrayOf(StandardCopyOption.REPLACE_EXISTING) else arrayOfNulls(0)
   val var6: Path = Files.move(`$this$moveTo`, target, Arrays.copyOf(var10000, var10000.length))
   return var6
}

@SinceKotlin(version = "1.7")
@ExperimentalPathApi
public fun Path.walk(vararg options: PathWalkOption): Sequence<Path> {
   return PathTreeWalk(`$this$walk`, options)
}

@WasExperimental(markerClass = [ExperimentalPathApi::class])
@SinceKotlin(version = "1.5")
public fun Path.relativeToOrSelf(base: Path): Path {
   var var10000: Path = PathsKt.relativeToOrNull(`$this$relativeToOrSelf`, base)
   if (var10000 == null) {
      var10000 = `$this$relativeToOrSelf`
   }

   return var10000
}

@SinceKotlin(version = "1.9")
@Throws(java/io/IOException::class)
public fun Path.createParentDirectories(vararg attributes: FileAttribute<*>): Path {
   val parent: Path = `$this$createParentDirectories`.getParent()
   if (parent != null) {
      var var10001: Array<LinkOption> = arrayOfNulls(0)
      if (!Files.isDirectory(parent, Arrays.copyOf(var10001, var10001.length))) {
         try {
            val var9: Array<FileAttribute> = Arrays.copyOf(attributes, attributes.length)
         } catch (var7: FileAlreadyExistsException) {
            var10001 = arrayOfNulls(0)
            if (!Files.isDirectory(parent, Arrays.copyOf(var10001, var10001.length))) {
               throw var7
            }
         }
      }
   }

   return `$this$createParentDirectories`
}

@InlineOnly
@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalPathApi::class])
@Throws(java/io/IOException::class)
public inline fun Path.setLastModifiedTime(value: FileTime): Path {
   val var10000: Path = Files.setLastModifiedTime(`$this$setLastModifiedTime`, value)
   return var10000
}

@InlineOnly
@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalPathApi::class])
@Throws(java/io/IOException::class)
public inline fun Path.getAttribute(attribute: String, vararg options: LinkOption): Any? {
   return Files.getAttribute(`$this$getAttribute`, attribute, Arrays.copyOf(options, options.length))
}

@InlineOnly
@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalPathApi::class])
public inline fun Path.absolutePathString(): String {
   return `$this$absolutePathString`.toAbsolutePath().toString()
}

@ExperimentalPathApi
@SinceKotlin(version = "1.7")
public fun Path.visitFileTree(visitor: FileVisitor<Path>, maxDepth: Int = Integer.MAX_VALUE, followLinks: Boolean = false) {
   Files.walkFileTree(`$this$visitFileTree`, if (followLinks) SetsKt.setOf(FileVisitOption.FOLLOW_LINKS) else SetsKt.emptySet(), maxDepth, visitor)
}

@SinceKotlin(version = "1.5")
@InlineOnly
@WasExperimental(markerClass = [ExperimentalPathApi::class])
@Throws(java/io/IOException::class)
public inline fun Path.readSymbolicLink(): Path {
   val var10000: Path = Files.readSymbolicLink(`$this$readSymbolicLink`)
   return var10000
}

@InlineOnly
@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalPathApi::class])
public inline fun Path.isSymbolicLink(): Boolean {
   return Files.isSymbolicLink(`$this$isSymbolicLink`)
}

@WasExperimental(markerClass = ExperimentalPathApi.class)
@SinceKotlin(version = "1.5")
public final val nameWithoutExtension: String
   public final get() {
      val var10000: Path = `$this$nameWithoutExtension`.getFileName()
      if (var10000 != null) {
         val var1: java.lang.String = var10000.toString()
         if (var1 != null) {
            val var2: java.lang.String = StringsKt.substringBeforeLast$default(var1, ".", null, 2, null)
            if (var2 != null) {
               return var2
            }
         }
      }

      return ""
   }


@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = ExperimentalPathApi.class)
public final val name: String
   public final get() {
      val var10000: Path = `$this$name`.getFileName()
      var var1: java.lang.String = if (var10000 != null) var10000.toString() else null
      if (var1 == null) {
         var1 = ""
      }

      return var1
   }


@WasExperimental(markerClass = [ExperimentalPathApi::class])
@SinceKotlin(version = "1.5")
@InlineOnly
@Throws(java/io/IOException::class)
public inline fun Path.readAttributes(attributes: String, vararg options: LinkOption): Map<String, Any?> {
   val var10000: java.util.Map = Files.readAttributes(`$this$readAttributes`, attributes, Arrays.copyOf(options, options.length))
   return var10000
}

@SinceKotlin(version = "1.5")
@InlineOnly
@WasExperimental(markerClass = [ExperimentalPathApi::class])
@Throws(java/io/IOException::class)
public inline fun Path.getPosixFilePermissions(vararg options: LinkOption): Set<PosixFilePermission> {
   val var10000: java.util.Set = Files.getPosixFilePermissions(`$this$getPosixFilePermissions`, Arrays.copyOf(options, options.length))
   return var10000
}

@WasExperimental(markerClass = [ExperimentalPathApi::class])
@SinceKotlin(version = "1.5")
public fun Path.relativeTo(base: Path): Path {
   var var2: Path
   try {
      var2 = PathRelativizer.INSTANCE.tryRelativeTo(`$this$relativeTo`, base)
   } catch (var4: IllegalArgumentException) {
      throw IllegalArgumentException("${var4.getMessage()}\nthis path: $`$this$relativeTo`\nbase path: $base", var4)
   }

   return var2
}

@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = ExperimentalPathApi.class)
public final val extension: String
   public final get() {
      val var10000: Path = `$this$extension`.getFileName()
      if (var10000 != null) {
         val var1: java.lang.String = var10000.toString()
         if (var1 != null) {
            val var2: java.lang.String = StringsKt.substringAfterLast(var1, '.', "")
            if (var2 != null) {
               return var2
            }
         }
      }

      return ""
   }


@WasExperimental(markerClass = [ExperimentalPathApi::class])
@SinceKotlin(version = "1.5")
@InlineOnly
@Throws(java/io/IOException::class)
public inline fun Path.getOwner(vararg options: LinkOption): UserPrincipal? {
   return Files.getOwner(`$this$getOwner`, Arrays.copyOf(options, options.length))
}

@InlineOnly
@WasExperimental(markerClass = [ExperimentalPathApi::class])
@SinceKotlin(version = "1.5")
@Throws(java/io/IOException::class)
public inline fun Path.createFile(vararg attributes: FileAttribute<*>): Path {
   val var10000: Path = Files.createFile(`$this$createFile`, Arrays.copyOf(attributes, attributes.length))
   return var10000
}

@WasExperimental(markerClass = [ExperimentalPathApi::class])
@SinceKotlin(version = "1.5")
@InlineOnly
public inline fun Path.isDirectory(vararg options: LinkOption): Boolean {
   return Files.isDirectory(`$this$isDirectory`, Arrays.copyOf(options, options.length))
}

@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalPathApi::class])
@Throws(java/io/IOException::class)
public fun createTempDirectory(directory: Path?, prefix: String? = null, vararg attributes: FileAttribute<*>): Path {
   val var10000: Path
   if (directory != null) {
      var10000 = Files.createTempDirectory(directory, prefix, Arrays.copyOf(attributes, attributes.length))
   } else {
      var10000 = Files.createTempDirectory(prefix, Arrays.copyOf(attributes, attributes.length))
   }

   return var10000
}

@InlineOnly
@WasExperimental(markerClass = [ExperimentalPathApi::class])
@SinceKotlin(version = "1.5")
@Throws(java/io/IOException::class)
public inline fun Path.setOwner(value: UserPrincipal): Path {
   val var10000: Path = Files.setOwner(`$this$setOwner`, value)
   return var10000
}

@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalPathApi::class])
public fun Path.relativeToOrNull(base: Path): Path? {
   var var2: Path
   try {
      var2 = PathRelativizer.INSTANCE.tryRelativeTo(`$this$relativeToOrNull`, base)
   } catch (var4: IllegalArgumentException) {
      var2 = null
   }

   return var2
}

@InlineOnly
@WasExperimental(markerClass = [ExperimentalPathApi::class])
@SinceKotlin(version = "1.5")
@Throws(java/io/IOException::class)
public inline fun Path.moveTo(target: Path, vararg options: CopyOption): Path {
   val var10000: Path = Files.move(`$this$moveTo`, target, Arrays.copyOf(options, options.length))
   return var10000
}

@WasExperimental(markerClass = [ExperimentalPathApi::class])
@InlineOnly
@SinceKotlin(version = "1.5")
public inline fun Path.absolute(): Path {
   val var10000: Path = `$this$absolute`.toAbsolutePath()
   return var10000
}

@PublishedApi
internal fun fileAttributeViewNotAvailable(path: Path, attributeViewClass: Class<*>): Nothing {
   throw UnsupportedOperationException("The desired attribute view type $attributeViewClass is not available for the file $path.")
}

@WasExperimental(markerClass = [ExperimentalPathApi::class])
@SinceKotlin(version = "1.5")
@InlineOnly
@Throws(java/io/IOException::class)
public inline fun Path.fileSize(): Long {
   return Files.size(`$this$fileSize`)
}

@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalPathApi::class])
@InlineOnly
@Throws(java/io/IOException::class)
public inline fun Path.setAttribute(attribute: String, value: Any?, vararg options: LinkOption): Path {
   val var10000: Path = Files.setAttribute(`$this$setAttribute`, attribute, value, Arrays.copyOf(options, options.length))
   return var10000
}

@InlineOnly
@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalPathApi::class])
public inline fun Path.isReadable(): Boolean {
   return Files.isReadable(`$this$isReadable`)
}

@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalPathApi::class])
@Throws(java/io/IOException::class)
public fun createTempFile(directory: Path?, prefix: String? = null, suffix: String? = null, vararg attributes: FileAttribute<*>): Path {
   val var10000: Path
   if (directory != null) {
      var10000 = Files.createTempFile(directory, prefix, suffix, Arrays.copyOf(attributes, attributes.length))
   } else {
      var10000 = Files.createTempFile(prefix, suffix, Arrays.copyOf(attributes, attributes.length))
   }

   return var10000
}

@InlineOnly
@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalPathApi::class])
public inline fun Path.notExists(vararg options: LinkOption): Boolean {
   return Files.notExists(`$this$notExists`, Arrays.copyOf(options, options.length))
}

@SinceKotlin(version = "1.5")
@InlineOnly
@WasExperimental(markerClass = [ExperimentalPathApi::class])
@Throws(java/io/IOException::class)
public inline fun Path.fileStore(): FileStore {
   val var10000: FileStore = Files.getFileStore(`$this$fileStore`)
   return var10000
}

@WasExperimental(markerClass = [ExperimentalPathApi::class])
@InlineOnly
@SinceKotlin(version = "1.5")
public inline operator fun Path.div(other: String): Path {
   val var10000: Path = `$this$div`.resolve(other)
   return var10000
}

@InlineOnly
@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalPathApi::class])
@Throws(java/io/IOException::class)
public inline fun Path.createLinkPointingTo(target: Path): Path {
   val var10000: Path = Files.createLink(`$this$createLinkPointingTo`, target)
   return var10000
}

@InlineOnly
@WasExperimental(markerClass = [ExperimentalPathApi::class])
@SinceKotlin(version = "1.5")
@Throws(java/io/IOException::class)
public inline fun Path.getLastModifiedTime(vararg options: LinkOption): FileTime {
   val var10000: FileTime = Files.getLastModifiedTime(`$this$getLastModifiedTime`, Arrays.copyOf(options, options.length))
   return var10000
}

@ExperimentalPathApi
@SinceKotlin(version = "1.7")
public fun Path.visitFileTree(maxDepth: Int = Integer.MAX_VALUE, followLinks: Boolean = false, builderAction: (FileVisitorBuilder) -> Unit) {
   contract {
      callsInPlace(builderAction, InvocationKind.EXACTLY_ONCE)
   }

   PathsKt.visitFileTree(`$this$visitFileTree`, PathsKt.fileVisitor(builderAction), maxDepth, followLinks)
}

@InlineOnly
@WasExperimental(markerClass = [ExperimentalPathApi::class])
@SinceKotlin(version = "1.5")
public inline fun Path.exists(vararg options: LinkOption): Boolean {
   return Files.exists(`$this$exists`, Arrays.copyOf(options, options.length))
}

@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalPathApi::class])
@Throws(java/io/IOException::class)
public fun Path.listDirectoryEntries(glob: String = "*"): List<Path> {
   val var2: Closeable = Files.newDirectoryStream(`$this$listDirectoryEntries`, glob)
   var var3: java.lang.Throwable = null

   try {
      val it: DirectoryStream = var2 as DirectoryStream
      return CollectionsKt.toList(it)
   } catch (var8: java.lang.Throwable) {
      var3 = var8
      throw var8
   } finally {
      CloseableKt.closeFinally(var2, var3)
   }
}

@SinceKotlin(version = "1.7")
@ExperimentalPathApi
public fun fileVisitor(builderAction: (FileVisitorBuilder) -> Unit): FileVisitor<Path> {
   contract {
      callsInPlace(builderAction, InvocationKind.EXACTLY_ONCE)
   }

   val var1: FileVisitorBuilderImpl = FileVisitorBuilderImpl()
   builderAction(var1)
   return var1.build()
}

@WasExperimental(markerClass = ExperimentalPathApi.class)
@SinceKotlin(version = "1.5")
@InlineOnly
public final val pathString: String
   public final inline get() {
      return `$this$pathString`.toString()
   }


@WasExperimental(markerClass = [ExperimentalPathApi::class])
@SinceKotlin(version = "1.5")
@InlineOnly
@Throws(java/io/IOException::class)
public inline fun createTempDirectory(prefix: String? = null, vararg attributes: FileAttribute<*>): Path {
   val var10000: Path = Files.createTempDirectory(prefix, Arrays.copyOf(attributes, attributes.length))
   return var10000
}

@WasExperimental(markerClass = [ExperimentalPathApi::class])
@InlineOnly
@SinceKotlin(version = "1.5")
@Throws(java/io/IOException::class)
public inline fun Path.copyTo(target: Path, vararg options: CopyOption): Path {
   val var10000: Path = Files.copy(`$this$copyTo`, target, Arrays.copyOf(options, options.length))
   return var10000
}

@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalPathApi::class])
@InlineOnly
@Throws(java/io/IOException::class)
public inline fun Path.setPosixFilePermissions(value: Set<PosixFilePermission>): Path {
   val var10000: Path = Files.setPosixFilePermissions(`$this$setPosixFilePermissions`, value)
   return var10000
}

open fun PathsKt__PathUtilsKt() {
}
