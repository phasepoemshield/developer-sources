package kotlin.io

import java.io.File

// $VF: Compiled from Exceptions.kt
private fun constructMessage(file: File, other: File?, reason: String?): String {
   val sb: StringBuilder = StringBuilder(file.toString())
   if (other != null) {
      sb.append(" -> $other")
   }

   if (reason != null) {
      sb.append(": $reason")
   }

   val var10000: java.lang.String = sb.toString()
   return var10000
}
