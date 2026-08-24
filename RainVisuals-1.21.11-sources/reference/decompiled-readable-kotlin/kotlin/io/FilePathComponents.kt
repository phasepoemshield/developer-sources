package kotlin.io

import java.io.File

// $VF: Compiled from FilePathComponents.kt
internal data class FilePathComponents internal constructor(root: File, segments: List<File>) {
   public final val segments: List<File>
   public final val root: File

   public override fun toString(): String {
      return "FilePathComponents(root=${this.root}, segments=${this.segments})"
   }

   public fun subPath(beginIndex: Int, endIndex: Int): File {
      if (beginIndex >= 0 && beginIndex <= endIndex && endIndex <= this.size) {
         val var10002: java.lang.Iterable = this.segments.subList(beginIndex, endIndex)
         val var10003: java.lang.String = File.separator
         return File(CollectionsKt.joinToString$default(var10002, var10003, null, null, 0, null, null, 62, null))
      } else {
         throw IllegalArgumentException()
      }
   }

   public override operator fun equals(other: Any?): Boolean {
      label28@
      if (this === other) {
         return true
      } else {
         return other is FilePathComponents && this.root == (other as FilePathComponents).root && this.segments == (other as FilePathComponents).segments
      }
   }

   public override fun hashCode(): Int {
      return this.root.hashCode() * 31 + this.segments.hashCode()
   }

   public fun copy(root: File = this.root, segments: List<File> = this.segments): FilePathComponents {
      return FilePathComponents(root, segments)
   }

   public final val isRooted: Boolean
      public final get() {
         val var10000: java.lang.String = this.root.getPath()
         return var10000.length() > 0
      }


   public final val size: Int
      public final get() {
         return this.segments.size()
      }


   init {
      this.root = root
      this.segments = segments
   }

   public operator fun component2(): List<File> {
      return this.segments
   }

   public operator fun component1(): File {
      return this.root
   }

   public final val rootName: String
      public final get() {
         val var10000: java.lang.String = this.root.getPath()
         return var10000
      }

}
