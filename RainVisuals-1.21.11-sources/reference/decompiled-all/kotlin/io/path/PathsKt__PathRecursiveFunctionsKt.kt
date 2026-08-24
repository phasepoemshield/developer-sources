@file:JvmMultifileClass
@file:JvmName("PathsKt")

package kotlin.io.path

import java.io.Closeable
import java.nio.file.CopyOption
import java.nio.file.DirectoryStream
import java.nio.file.FileSystemException
import java.nio.file.FileVisitResult
import java.nio.file.Files
import java.nio.file.LinkOption
import java.nio.file.NoSuchFileException
import java.nio.file.Path
import java.nio.file.SecureDirectoryStream
import java.nio.file.StandardCopyOption
import java.nio.file.attribute.BasicFileAttributeView
import java.nio.file.attribute.BasicFileAttributes
import java.util.Arrays
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function3
import kotlin.jvm.internal.SpreadBuilder

// $VF: Compiled from PathRecursiveFunctions.kt
private fun SecureDirectoryStream<Path>.isDirectory(entryName: Path, vararg options: LinkOption): Boolean {
   var var5: java.lang.Boolean
   try {
      var5 = `$this$isDirectory`.getFileAttributeView(entryName, BasicFileAttributeView.class, Arrays.copyOf(options, options.length))
         .readAttributes()
         .isDirectory()
      } catch (var7: NoSuchFileException) {
      var5 = null
   }

   return var5 != null && var5
}

@ExperimentalPathApi
@SinceKotlin(version = "1.8")
public fun Path.copyToRecursively(
   target: Path,
   onError: (Path, Path, Exception) -> OnErrorResult = { <anonymous parameter 0>, <anonymous parameter 1>, exception ->
         throw exception
      } as Function3,
   followLinks: Boolean,
   overwrite: Boolean
): Path {
   return if (overwrite)
      PathsKt.copyToRecursively(`$this$copyToRecursively`, target, onError, followLinks,    // $VF: Compiled from PathRecursiveFunctions.kt
   { src: Path, dst: Path ->
         val options: Array<LinkOption> = LinkFollowing.INSTANCE.toLinkOptions(followLinks)
         val var10: Array<LinkOption> = arrayOf(LinkOption.NOFOLLOW_LINKS)
         val dstIsDirectory: Boolean = Files.isDirectory(dst, Arrays.copyOf(var10, var10.length))
         val var10001: Array<LinkOption> = Arrays.copyOf(options, options.length)
         if (!Files.isDirectory(src, Arrays.copyOf(var10001, var10001.length)) || !dstIsDirectory) {
            if (dstIsDirectory) {
               PathsKt.deleteRecursively(dst)
            }

            val var8: SpreadBuilder = SpreadBuilder(2)
            var8.addSpread(options)
            var8.add(StandardCopyOption.REPLACE_EXISTING)
            val var12: Array<CopyOption> = var8.toArray(arrayOfNulls(var8.size())) as Array<CopyOption>
         }

         return CopyActionResult.CONTINUE
      } as (CopyActionContext?, Path?, Path?) -> CopyActionResult)
      else
      PathsKt.copyToRecursively$default(`$this$copyToRecursively`, target, onError, followLinks, null, 8, null)
   }

private fun Path.deleteRecursivelyImpl(): List<Exception> {
   val collector: ExceptionsCollector = ExceptionsCollector(0, 1, null)
   var var16: Boolean = true
   val var10000: Path = `$this$deleteRecursivelyImpl`.getParent()
   if (var10000 != null) {
      val parent: Path = var10000

      var var5: DirectoryStream
      try {
         var5 = Files.newDirectoryStream(parent)
      } catch (var15: java.lang.Throwable) {
         var5 = null
      }

      if (var5 != null) {
         var5 = var5
         var _: java.lang.Throwable = null

         try {
            val stream: DirectoryStream = var5
            if (var5 is SecureDirectoryStream) {
               var16 = false
               collector.path = parent
               val var19: SecureDirectoryStream = stream as SecureDirectoryStream
               val var10001: Path = `$this$deleteRecursivelyImpl`.getFileName()
               handleEntry$PathsKt__PathRecursiveFunctionsKt(var19, var10001, collector)
            }
         } catch (var13: java.lang.Throwable) {
            _ = var13
            throw var13
         } finally {
            CloseableKt.closeFinally(var5, _)
         }
      }
   }

   if (var16) {
      insecureHandleEntry$PathsKt__PathRecursiveFunctionsKt(`$this$deleteRecursivelyImpl`, collector)
   }

   return collector.collectedExceptions
}

private fun insecureEnterDirectory(path: Path, collector: ExceptionsCollector) {
   try {
      var directoryStream: DirectoryStream
      try {
         directoryStream = Files.newDirectoryStream(path)
      } catch (var16: NoSuchFileException) {
         directoryStream = null
      }

      if (directoryStream != null) {
         val var20: Closeable = directoryStream
         var var21: java.lang.Throwable = null

         try {
            for (entry in var20 as DirectoryStream) {
               insecureHandleEntry$PathsKt__PathRecursiveFunctionsKt(entry, collector)
            }
         } catch (var17: java.lang.Throwable) {
            var21 = var17
            throw var17
         } finally {
            CloseableKt.closeFinally(var20, var21)
         }
      }
   } catch (var19: Exception) {
      collector.collect(var19)
   }
}

private fun SecureDirectoryStream<Path>.handleEntry(name: Path, collector: ExceptionsCollector) {
   collector.enterEntry(name)

   try {
      if (isDirectory$PathsKt__PathRecursiveFunctionsKt(`$this$handleEntry`, name, LinkOption.NOFOLLOW_LINKS)) {
         val var14: Int = collector.totalExceptions
         enterDirectory$PathsKt__PathRecursiveFunctionsKt(`$this$handleEntry`, name, collector)
         if (var14 == collector.totalExceptions) {
            try {
               `$this$handleEntry`.deleteDirectory(name)
            } catch (var12: NoSuchFileException) {
            }
         }
      } else {
         try {
            `$this$handleEntry`.deleteFile(name)
         } catch (var11: NoSuchFileException) {
         }
      }
   } catch (var13: Exception) {
      collector.collect(var13)
   }

   collector.exitEntry(name)
}

private inline fun <R> tryIgnoreNoSuchFileException(function: () -> Any): Any? {
   var var2: Any
   try {
      var2 = function()
   } catch (var4: NoSuchFileException) {
      var2 = null
   }

   return (R)var2
}

@ExperimentalPathApi
@SinceKotlin(version = "1.8")
public fun Path.deleteRecursively() {
   val suppressedExceptions: java.util.List = deleteRecursivelyImpl$PathsKt__PathRecursiveFunctionsKt(`$this$deleteRecursively`)
   if (!suppressedExceptions.isEmpty()) {
      val var2: FileSystemException = FileSystemException("Failed to delete one or more files. See suppressed exceptions for details.")
      val `$this$deleteRecursively_u24lambda_u242`: FileSystemException = var2

      for (`element$iv` in suppressedExceptions) {
         ExceptionsKt.addSuppressed(`$this$deleteRecursively_u24lambda_u242`, `element$iv` as Exception)
      }

      throw var2 as java.lang.Throwable
   }
}

fun `copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt`(
   `$target`: (CopyActionContext?, Path?, Path?) -> CopyActionResult,
   `$onError`: Path,
   `$this_copyToRecursively`: Path,
   source: (Path?, Path?, Exception?) -> OnErrorResult,
   `$copyAction`: Path,
   attributes: BasicFileAttributes
): FileVisitResult {
   var var6: FileVisitResult
   try {
      var6 = toFileVisitResult$PathsKt__PathRecursiveFunctionsKt(
         `$copyAction`(
            DefaultCopyActionContext.INSTANCE,
            source,
            copyToRecursively$destination$PathsKt__PathRecursiveFunctionsKt(`$this_copyToRecursively`, `$target`, source)
         ) as CopyActionResult
      )
   } catch (var8: Exception) {
      var6 = copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt(`$onError`, `$this_copyToRecursively`, `$target`, source, var8)
   }

   var6
}

private inline fun collectIfThrows(collector: ExceptionsCollector, function: () -> Unit) {
   try {
      function()
   } catch (var4: Exception) {
      collector.collect(var4)
   }
}

private fun SecureDirectoryStream<Path>.enterDirectory(name: Path, collector: ExceptionsCollector) {
   try {
      var var8: SecureDirectoryStream
      try {
         var8 = `$this$enterDirectory`.newDirectoryStream(name, LinkOption.NOFOLLOW_LINKS)
      } catch (var17: NoSuchFileException) {
         var8 = null
      }

      if (var8 != null) {
         val var21: Closeable = var8
         var var22: java.lang.Throwable = null

         try {
            val var23: SecureDirectoryStream = var21 as SecureDirectoryStream

            for (entry in var21 as SecureDirectoryStream) {
               val var10001: Path = entry.getFileName()
               handleEntry$PathsKt__PathRecursiveFunctionsKt(var23, var10001, collector)
            }
         } catch (var18: java.lang.Throwable) {
            var22 = var18
            throw var18
         } finally {
            CloseableKt.closeFinally(var21, var22)
         }
      }
   } catch (var20: Exception) {
      collector.collect(var20)
   }
}

@ExperimentalPathApi
@SinceKotlin(version = "1.8")
public fun Path.copyToRecursively(
   target: Path,
   onError: (Path, Path, Exception) -> OnErrorResult = { <anonymous parameter 0>, <anonymous parameter 1>, exception ->
         throw exception
      } as Function3,
   followLinks: Boolean,
   copyAction: (CopyActionContext, Path, Path) -> CopyActionResult =    // $VF: Compiled from PathRecursiveFunctions.kt
   { src: Path, dst: Path ->
         return `$this$null`.copyToIgnoringExistingDirectory(src, dst, var3)
      } as Function3
): Path {
   var isSubdirectory: Array<LinkOption> = LinkFollowing.INSTANCE.toLinkOptions(followLinks)
   isSubdirectory = Arrays.copyOf(isSubdirectory, isSubdirectory.length)
   if (!Files.exists(`$this$copyToRecursively`, Arrays.copyOf(isSubdirectory, isSubdirectory.length))) {
      throw NoSuchFileException(`$this$copyToRecursively`.toString(), target.toString(), "The source file doesn't exist.")
   } else {
      var var10001: Array<LinkOption> = arrayOfNulls(0)
      if (Files.exists(`$this$copyToRecursively`, Arrays.copyOf(var10001, var10001.length))
         && (followLinks || !Files.isSymbolicLink(`$this$copyToRecursively`))) {
         var10001 = arrayOfNulls(0)
         val var9: Boolean = Files.exists(target, Arrays.copyOf(var10001, var10001.length)) && !Files.isSymbolicLink(target)
         if (!var9 || !Files.isSameFile(`$this$copyToRecursively`, target)) {
            val var12: Boolean
            if (!(`$this$copyToRecursively`.getFileSystem() == target.getFileSystem())) {
               var12 = false
            } else if (var9) {
               var12 = target.toRealPath().startsWith(`$this$copyToRecursively`.toRealPath())
            } else {
               val var10000: Path = target.getParent()
               if (var10000 == null) {
                  var12 = false
               } else {
                  var10001 = arrayOfNulls(0)
                  var12 = Files.exists(var10000, Arrays.copyOf(var10001, var10001.length))
                     && var10000.toRealPath().startsWith(`$this$copyToRecursively`.toRealPath())
                  }
            }

            if (var12) {
               throw FileSystemException(
                  `$this$copyToRecursively`.toString(), target.toString(), "Recursively copying a directory into its subdirectory is prohibited."
               )
            }
         }
      }

      PathsKt.visitFileTree$default(
         `$this$copyToRecursively`,
         0,
         followLinks,
               // $VF: Compiled from PathRecursiveFunctions.kt
   {
            // $VF: Couldn't be decompiled
            // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
            // java.lang.IllegalStateException: Anonymous class does not have Class Kotlin metadata
            //   at org.vineflower.kotlin.KotlinWriter.writeClassDefinition(KotlinWriter.java:742)
            //   at org.vineflower.kotlin.KotlinWriter.writeClass(KotlinWriter.java:309)
            //   at org.vineflower.kotlin.expr.KNewExprent.toJava(KNewExprent.java:178)
            //   at org.jetbrains.java.decompiler.modules.decompiler.exps.FunctionExprent.wrapOperandString(FunctionExprent.java:770)
            //   at org.jetbrains.java.decompiler.modules.decompiler.exps.FunctionExprent.wrapOperandString(FunctionExprent.java:736)
            //
            // Bytecode:
            // 00: aload 1
            // 01: ldc "$this$visitFileTree"
            // 03: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
            // 06: aload 1
            // 07: new kotlin/io/path/PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5$1
            // 0a: dup
            // 0b: aload 0
            // 0c: getfield kotlin/io/path/PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5.$copyAction Lkotlin/jvm/functions/Function3;
            // 0f: aload 0
            // 10: getfield kotlin/io/path/PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5.$this_copyToRecursively Ljava/nio/file/Path;
            // 13: aload 0
            // 14: getfield kotlin/io/path/PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5.$target Ljava/nio/file/Path;
            // 17: aload 0
            // 18: getfield kotlin/io/path/PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5.$onError Lkotlin/jvm/functions/Function3;
            // 1b: invokespecial kotlin/io/path/PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5$1.<init> (Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/Path;Lkotlin/jvm/functions/Function3;)V
            // 1e: checkcast kotlin/jvm/functions/Function2
            // 21: invokeinterface kotlin/io/path/FileVisitorBuilder.onPreVisitDirectory (Lkotlin/jvm/functions/Function2;)V 2
            // 26: aload 1
            // 27: new kotlin/io/path/PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5$2
            // 2a: dup
            // 2b: aload 0
            // 2c: getfield kotlin/io/path/PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5.$copyAction Lkotlin/jvm/functions/Function3;
            // 2f: aload 0
            // 30: getfield kotlin/io/path/PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5.$this_copyToRecursively Ljava/nio/file/Path;
            // 33: aload 0
            // 34: getfield kotlin/io/path/PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5.$target Ljava/nio/file/Path;
            // 37: aload 0
            // 38: getfield kotlin/io/path/PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5.$onError Lkotlin/jvm/functions/Function3;
            // 3b: invokespecial kotlin/io/path/PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5$2.<init> (Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/Path;Lkotlin/jvm/functions/Function3;)V
            // 3e: checkcast kotlin/jvm/functions/Function2
            // 41: invokeinterface kotlin/io/path/FileVisitorBuilder.onVisitFile (Lkotlin/jvm/functions/Function2;)V 2
            // 46: aload 1
            // 47: new kotlin/io/path/PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5$3
            // 4a: dup
            // 4b: aload 0
            // 4c: getfield kotlin/io/path/PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5.$onError Lkotlin/jvm/functions/Function3;
            // 4f: aload 0
            // 50: getfield kotlin/io/path/PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5.$this_copyToRecursively Ljava/nio/file/Path;
            // 53: aload 0
            // 54: getfield kotlin/io/path/PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5.$target Ljava/nio/file/Path;
            // 57: invokespecial kotlin/io/path/PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5$3.<init> (Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/Path;)V
            // 5a: checkcast kotlin/jvm/functions/Function2
            // 5d: invokeinterface kotlin/io/path/FileVisitorBuilder.onVisitFileFailed (Lkotlin/jvm/functions/Function2;)V 2
            // 62: aload 1
            // 63: new kotlin/io/path/PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5$4
            // 66: dup
            // 67: aload 0
            // 68: getfield kotlin/io/path/PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5.$onError Lkotlin/jvm/functions/Function3;
            // 6b: aload 0
            // 6c: getfield kotlin/io/path/PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5.$this_copyToRecursively Ljava/nio/file/Path;
            // 6f: aload 0
            // 70: getfield kotlin/io/path/PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5.$target Ljava/nio/file/Path;
            // 73: invokespecial kotlin/io/path/PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5$4.<init> (Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/Path;)V
            // 76: checkcast kotlin/jvm/functions/Function2
            // 79: invokeinterface kotlin/io/path/FileVisitorBuilder.onPostVisitDirectory (Lkotlin/jvm/functions/Function2;)V 2
            // 7e: return
         } as Function1,
         1,
         null
      )
      return target
   }
}

fun `copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt`(
   `$this_copyToRecursively`: (Path?, Path?, Exception?) -> OnErrorResult, `$onError`: Path, exception: Path, `$target`: Path, source: Exception
): FileVisitResult {
   toFileVisitResult$PathsKt__PathRecursiveFunctionsKt(
      `$onError`(source, copyToRecursively$destination$PathsKt__PathRecursiveFunctionsKt(`$this_copyToRecursively`, `$target`, source), exception) as OnErrorResult
   )
}

@ExperimentalPathApi
private fun CopyActionResult.toFileVisitResult(): FileVisitResult {
   var var10000: FileVisitResult
   when (PathsKt__PathRecursiveFunctionsKt.WhenMappings.$EnumSwitchMapping$0[`$this$toFileVisitResult`.ordinal()]) {
      1 -> var10000 = FileVisitResult.CONTINUE
      2 -> var10000 = FileVisitResult.TERMINATE
      3 -> var10000 = FileVisitResult.SKIP_SUBTREE
      else -> throw NoWhenBranchMatchedException()
   }

   return var10000
}

fun `copyToRecursively$destination$PathsKt__PathRecursiveFunctionsKt`(`$this_copyToRecursively`: Path, `$target`: Path, source: Path): Path {
   val var10000: Path = `$target`.resolve(PathsKt.relativeTo(source, `$this_copyToRecursively`).toString())
   var10000
}

open fun PathsKt__PathRecursiveFunctionsKt() {
}

private fun insecureHandleEntry(entry: Path, collector: ExceptionsCollector) {
   try {
      val var9: Array<LinkOption> = arrayOf(LinkOption.NOFOLLOW_LINKS)
      if (Files.isDirectory(entry, Arrays.copyOf(var9, var9.length))) {
         val var8: Int = collector.totalExceptions
         insecureEnterDirectory$PathsKt__PathRecursiveFunctionsKt(entry, collector)
         if (var8 == collector.totalExceptions) {
            Files.deleteIfExists(entry)
         }
      } else {
         Files.deleteIfExists(entry)
      }
   } catch (var7: Exception) {
      collector.collect(var7)
   }
}

@ExperimentalPathApi
private fun OnErrorResult.toFileVisitResult(): FileVisitResult {
   var var10000: FileVisitResult
   when (PathsKt__PathRecursiveFunctionsKt.WhenMappings.$EnumSwitchMapping$1[`$this$toFileVisitResult`.ordinal()]) {
      1 -> var10000 = FileVisitResult.TERMINATE
      2 -> var10000 = FileVisitResult.SKIP_SUBTREE
      else -> throw NoWhenBranchMatchedException()
   }

   return var10000
}
