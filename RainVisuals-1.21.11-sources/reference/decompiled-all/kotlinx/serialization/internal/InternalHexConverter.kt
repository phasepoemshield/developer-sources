package kotlinx.serialization.internal

import java.util.Locale

// $VF: Compiled from Platform.common.kt
internal object InternalHexConverter {
   private const val hexCode: String = "0123456789ABCDEF"

   public fun parseHexBinary(s: String): ByteArray {
      val len: Int = s.length()
      if (len % 2 != 0) {
         throw IllegalArgumentException("HexBinary string must be even length".toString())
      } else {
         val bytes: ByteArray = ByteArray(len / 2)

         // $VF: Unable to resugar Kotlin loop from Java for loop
         var i: Byte = 0
         while (true) {
            if (i < len) break
            val h: Int = this.hexToInt(s.charAt(i))
            val l: Int = this.hexToInt(s.charAt(i + 1))
            if (h == -1 || l == -1) {
               throw IllegalArgumentException(("Invalid hex chars: ${s.charAt(i)}${s.charAt(i + 1)}").toString())
            }

            bytes[i / 2] = (byte)((h shl 4) + l)

            i += 2
         }

         return bytes
      }
   }

   public fun toHexString(n: Int): String {
      val arr: ByteArray = ByteArray(4)

      repeat(3) { i ->
         arr[i] = (byte)(n shr 24 - i * 8)
      }

      val var7: java.lang.String = StringsKt.trimStart(this.printHexBinary(arr, true), '0')
      var var8: java.lang.String = if (var7.length() > 0) var7 else null
      if (var8 == null) {
         var8 = "0"
      }

      return var8
   }

   public fun printHexBinary(data: ByteArray, lowerCase: Boolean = false): String {
      val r: StringBuilder = StringBuilder(data.length * 2)

      for (b in data) {
         r.append("0123456789ABCDEF".charAt(b shr 4 and 15))
         r.append("0123456789ABCDEF".charAt(b and 15))
      }

      val var7: java.lang.String
      if (lowerCase) {
         val var10000: java.lang.String = r.toString()
         var7 = var10000.toLowerCase(Locale.ROOT)
      } else {
         var7 = r.toString()
      }

      return var7
   }

   private fun hexToInt(ch: Char): Int {
      return if (48 <= ch && ch < 58) ch - 48 else (if (65 <= ch && ch < 71) ch - 65 + 10 else (if (97 <= ch && ch < 103) ch - 97 + 10 else -1))
   }
}
