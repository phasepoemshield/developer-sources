package kotlin

import org.jetbrains.annotations.NotNull

// $VF: Compiled from KotlinVersion.kt
@SinceKotlin(version = "1.1")
public class KotlinVersion(major: Int, minor: Int, patch: Int) : java.lang.Comparable<KotlinVersion> {
   public final val patch: Int
   public final val major: Int
   public final val minor: Int
   private final val version: Int

   public open operator fun compareTo(other: KotlinVersion): Int {
      return this.version - other.version
   }

   public fun isAtLeast(major: Int, minor: Int, patch: Int): Boolean {
      return this.major > major || this.major == major && (this.minor > minor || this.minor == minor && this.patch >= patch)
   }

   public override operator fun equals(other: Any?): Boolean {
      label29@
      if (this === other) {
         return true
      } else {
         return (other as? KotlinVersion) != null && this.version == (other as? KotlinVersion).version
      }
   }

   init {
      this.major = major
      this.minor = minor
      this.patch = patch
      this.version = this.versionOf(this.major, this.minor, this.patch)
   }

   public override fun toString(): String {
      return "${this.major}.${this.minor}.${this.patch}"
   }

   public constructor(major: Int, minor: Int) : this(major, minor, 0)
   private fun versionOf(major: Int, minor: Int, patch: Int): Int {
      if (!IntRange(0, 255).contains(major) || !IntRange(0, 255).contains(minor) || !IntRange(0, 255).contains(patch)) {
         throw IllegalArgumentException(("Version components are out of range: $major${46}$minor${46}$patch").toString())
      } else {
         return (major shl 16) + (minor shl 8) + patch
      }
   }

   public override fun hashCode(): Int {
      return this.version
   }

   public fun isAtLeast(major: Int, minor: Int): Boolean {
      return this.major > major || this.major == major && this.minor >= minor
   }

   // $VF: Compiled from KotlinVersion.kt
   public companion object {
      @JvmField
      @NotNull
      public final val CURRENT: KotlinVersion

      public const val MAX_COMPONENT_VALUE: Int = 255
   }
}
