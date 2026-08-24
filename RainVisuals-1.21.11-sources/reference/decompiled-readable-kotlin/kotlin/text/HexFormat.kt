package kotlin.text

import kotlin.internal.InlineOnly

// $VF: Compiled from HexFormat.kt
@SinceKotlin(version = "1.9")
@ExperimentalStdlibApi
public class HexFormat internal constructor(upperCase: Boolean, bytes: kotlin.text.HexFormat.BytesHexFormat, number: kotlin.text.HexFormat.NumberHexFormat) {
   public final val number: kotlin.text.HexFormat.NumberHexFormat
   public final val upperCase: Boolean
   public final val bytes: kotlin.text.HexFormat.BytesHexFormat

   public override fun toString(): String {
      val var1: StringBuilder = StringBuilder()
      var var10000: StringBuilder = var1.append("HexFormat(")
      var10000 = var1.append("    upperCase = ").append(this.upperCase)
      var10000 = var10000.append(",")
      var10000 = var1.append("    bytes = BytesHexFormat(")
      var10000 = var1.append("    ),")
      var10000 = var1.append("    number = NumberHexFormat(")
      var10000 = var1.append("    )")
      var1.append(")")
      val var11: java.lang.String = var1.toString()
      return var11
   }

   init {
      this.upperCase = upperCase
      this.bytes = bytes
      this.number = number
   }

   // $VF: Compiled from HexFormat.kt
   public class Builder @PublishedApi  internal constructor() {
      private final var _number: kotlin.text.HexFormat.NumberHexFormat.Builder?
      private final var _bytes: kotlin.text.HexFormat.BytesHexFormat.Builder?
      public final var upperCase: Boolean = HexFormat.Companion.Default.upperCase

      @InlineOnly
      public inline fun bytes(builderAction: (kotlin.text.HexFormat.BytesHexFormat.Builder) -> Unit) {
         builderAction(this.bytes)
      }

      public final val bytes: kotlin.text.HexFormat.BytesHexFormat.Builder
         public final get() {
            if (this._bytes == null) {
               this._bytes = HexFormat.BytesHexFormat.Builder()
            }

            val var10000: HexFormat.BytesHexFormat.Builder = this._bytes
            return var10000
         }


      @PublishedApi
      internal fun build(): HexFormat {
         var var10000: HexFormat
         var var10002: Boolean
         var var10003: HexFormat.BytesHexFormat
         run label24@{
            var10000 = HexFormat
            var10002 = this.upperCase
            if (this._bytes != null) {
               var10003 = this._bytes.build$kotlin_stdlib()
               if (var10003 != null) {
                  return@label24
               }
            }

            var10003 = HexFormat.BytesHexFormat.Companion.Default
         }

         var var10004: HexFormat.NumberHexFormat
         run label27@{
            if (this._number != null) {
               var10004 = this._number.build$kotlin_stdlib()
               if (var10004 != null) {
                  return@label27
               }
            }

            var10004 = HexFormat.NumberHexFormat.Companion.Default
         }

         var10000./* $VF: Unable to resugar constructor */<init>(var10002, var10003, var10004)
         return var10000
      }

      @InlineOnly
      public inline fun number(builderAction: (kotlin.text.HexFormat.NumberHexFormat.Builder) -> Unit) {
         builderAction(this.number)
      }

      public final val number: kotlin.text.HexFormat.NumberHexFormat.Builder
         public final get() {
            if (this._number == null) {
               this._number = HexFormat.NumberHexFormat.Builder()
            }

            val var10000: HexFormat.NumberHexFormat.Builder = this._number
            return var10000
         }

   }

   // $VF: Compiled from HexFormat.kt
   public class BytesHexFormat internal constructor(bytesPerLine: Int,
      bytesPerGroup: Int,
      groupSeparator: String,
      byteSeparator: String,
      bytePrefix: String,
      byteSuffix: String
   ) {
      public final val byteSuffix: String
      public final val groupSeparator: String
      public final val bytesPerGroup: Int
      public final val bytesPerLine: Int
      public final val bytePrefix: String
      public final val byteSeparator: String

      internal fun appendOptionsTo(sb: StringBuilder, indent: String): StringBuilder {
         var var10000: StringBuilder = sb.append(indent).append("bytesPerLine = ").append(this.bytesPerLine)
         var10000 = var10000.append(",")
         var10000 = sb.append(indent).append("bytesPerGroup = ").append(this.bytesPerGroup)
         var10000 = var10000.append(",")
         var10000 = sb.append(indent).append("groupSeparator = \"").append(this.groupSeparator)
         var10000 = var10000.append("\",")
         var10000 = sb.append(indent).append("byteSeparator = \"").append(this.byteSeparator)
         var10000 = var10000.append("\",")
         var10000 = sb.append(indent).append("bytePrefix = \"").append(this.bytePrefix)
         var10000 = var10000.append("\",")
         sb.append(indent).append("byteSuffix = \"").append(this.byteSuffix).append("\"")
         return sb
      }

      public override fun toString(): String {
         val var1: StringBuilder = StringBuilder()
         val var10000: StringBuilder = var1.append("BytesHexFormat(")
         var1.append(")")
         val var4: java.lang.String = var1.toString()
         return var4
      }

      init {
         this.bytesPerLine = bytesPerLine
         this.bytesPerGroup = bytesPerGroup
         this.groupSeparator = groupSeparator
         this.byteSeparator = byteSeparator
         this.bytePrefix = bytePrefix
         this.byteSuffix = byteSuffix
      }

      // $VF: Compiled from HexFormat.kt
      public class Builder internal constructor() {
         public final var byteSuffix: String
            public final set(value) {
               if (!StringsKt.contains$default(value, '\n', false, 2, null) && !StringsKt.contains$default(value, '\r', false, 2, null)) {
                  this.byteSuffix = value
               } else {
                  throw IllegalArgumentException("LF and CR characters are prohibited in byteSuffix, but was $value")
               }
            }


         public final var groupSeparator: String

         public final var bytesPerLine: Int = HexFormat.BytesHexFormat.Companion.Default.bytesPerLine
            public final set(value) {
               if (value <= 0) {
                  throw IllegalArgumentException("Non-positive values are prohibited for bytesPerLine, but was $value")
               } else {
                  this.bytesPerLine = value
               }
            }


         public final var bytePrefix: String
            public final set(value) {
               if (!StringsKt.contains$default(value, '\n', false, 2, null) && !StringsKt.contains$default(value, '\r', false, 2, null)) {
                  this.bytePrefix = value
               } else {
                  throw IllegalArgumentException("LF and CR characters are prohibited in bytePrefix, but was $value")
               }
            }


         public final var byteSeparator: String
            public final set(value) {
               if (!StringsKt.contains$default(value, '\n', false, 2, null) && !StringsKt.contains$default(value, '\r', false, 2, null)) {
                  this.byteSeparator = value
               } else {
                  throw IllegalArgumentException("LF and CR characters are prohibited in byteSeparator, but was $value")
               }
            }


         public final var bytesPerGroup: Int = HexFormat.BytesHexFormat.Companion.Default.bytesPerGroup
            public final set(value) {
               if (value <= 0) {
                  throw IllegalArgumentException("Non-positive values are prohibited for bytesPerGroup, but was $value")
               } else {
                  this.bytesPerGroup = value
               }
            }


         internal fun build(): kotlin.text.HexFormat.BytesHexFormat {
            return HexFormat.BytesHexFormat(this.bytesPerLine, this.bytesPerGroup, this.groupSeparator, this.byteSeparator, this.bytePrefix, this.byteSuffix)
         }

         init {
            this.groupSeparator = HexFormat.BytesHexFormat.Companion.Default.groupSeparator
            this.byteSeparator = HexFormat.BytesHexFormat.Companion.Default.byteSeparator
            this.bytePrefix = HexFormat.BytesHexFormat.Companion.Default.bytePrefix
            this.byteSuffix = HexFormat.BytesHexFormat.Companion.Default.byteSuffix
         }
      }

      // $VF: Compiled from HexFormat.kt
      internal companion object {
         internal final val Default: kotlin.text.HexFormat.BytesHexFormat
      }
   }

   // $VF: Compiled from HexFormat.kt
   public companion object {
      public final val Default: HexFormat
      public final val UpperCase: HexFormat
   }

   // $VF: Compiled from HexFormat.kt
   public class NumberHexFormat internal constructor(prefix: String, suffix: String, removeLeadingZeros: Boolean) {
      public final val prefix: String
      public final val suffix: String
      public final val removeLeadingZeros: Boolean

      public override fun toString(): String {
         val var1: StringBuilder = StringBuilder()
         val var10000: StringBuilder = var1.append("NumberHexFormat(")
         var1.append(")")
         val var4: java.lang.String = var1.toString()
         return var4
      }

      internal fun appendOptionsTo(sb: StringBuilder, indent: String): StringBuilder {
         var var10000: StringBuilder = sb.append(indent).append("prefix = \"").append(this.prefix)
         var10000 = var10000.append("\",")
         var10000 = sb.append(indent).append("suffix = \"").append(this.suffix)
         var10000 = var10000.append("\",")
         sb.append(indent).append("removeLeadingZeros = ").append(this.removeLeadingZeros)
         return sb
      }

      init {
         this.prefix = prefix
         this.suffix = suffix
         this.removeLeadingZeros = removeLeadingZeros
      }

      // $VF: Compiled from HexFormat.kt
      public class Builder internal constructor() {
         public final var suffix: String
            public final set(value) {
               if (!StringsKt.contains$default(value, '\n', false, 2, null) && !StringsKt.contains$default(value, '\r', false, 2, null)) {
                  this.suffix = value
               } else {
                  throw IllegalArgumentException("LF and CR characters are prohibited in suffix, but was $value")
               }
            }


         public final var prefix: String = HexFormat.NumberHexFormat.Companion.Default.prefix
            public final set(value) {
               if (!StringsKt.contains$default(value, '\n', false, 2, null) && !StringsKt.contains$default(value, '\r', false, 2, null)) {
                  this.prefix = value
               } else {
                  throw IllegalArgumentException("LF and CR characters are prohibited in prefix, but was $value")
               }
            }


         public final var removeLeadingZeros: Boolean

         init {
            this.suffix = HexFormat.NumberHexFormat.Companion.Default.suffix
            this.removeLeadingZeros = HexFormat.NumberHexFormat.Companion.Default.removeLeadingZeros
         }

         internal fun build(): kotlin.text.HexFormat.NumberHexFormat {
            return HexFormat.NumberHexFormat(this.prefix, this.suffix, this.removeLeadingZeros)
         }
      }

      // $VF: Compiled from HexFormat.kt
      internal companion object {
         internal final val Default: kotlin.text.HexFormat.NumberHexFormat
      }
   }
}
