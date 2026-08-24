package oxxxde

import java.util.ArrayList
import java.util.Locale

// $VF: Compiled from heavy
public object شا : دِ("PasHider", ظن.getPLAYER(), "Скрывает ввод пароля в чат") {
   private final val registerCommands: Set<String> = SetsKt.setOf("/reg", "/register")
   private final val supportedCommands: Set<String> = SetsKt.plus(SetsKt.setOf("/l", "/login"), registerCommands)

   public fun maskForHistory(message: String?): String? {
      return this.maskSensitive(message, true)
   }

   private fun findNextCommandStart(message: String, start: Int): Int {
      var index: Int = start

      for (var4 in message.length()..index) {
         if (message.charAt(index) == '/' && (index == 0 || CharsKt.isWhitespace(message.charAt(index + -1)))) {
            return index
         }
      }

      return -1
   }

   public fun shouldMask(): Boolean {
      return this.isEnabled()
   }

   public fun restoreOriginalIfMasked(message: String?): String? {
      return message
   }

   private fun maskSensitive(message: String?, useAsterisks: Boolean): String? {
      if (message == null) {
         return null
      } else {
         val result: StringBuilder = StringBuilder(message.length() + 16)
         var changed: Boolean = false
         var cursor: Int = 0

         while (cursor < message.length()) {
            val slashIndex: Int = this.findNextCommandStart(message, cursor)
            if (slashIndex < 0) {
               result.append(message, cursor, message.length())
               break
            }

            val commandLength: Int = this.getCommandLength(message, slashIndex)
            if (commandLength == 0) {
               result.append(message, cursor, slashIndex + 1)
               cursor = slashIndex + 1
            } else {
               val argsToMask: Int = if (this.isRegisterCommand(message, slashIndex, commandLength)) 2 else 1
               result.append(message, cursor, slashIndex + commandLength)
               var var19: Int = slashIndex + commandLength

               repeat(argsToMask) { var10 ->
                  val spacesStart: Int = var19

                  while (var19 < message.length() && CharsKt.isWhitespace(message.charAt(var19))) {
                     var19++
                  }

                  result.append(message, spacesStart, var19)
                  val start: Int = var19

                  while (var19 < message.length() && !CharsKt.isWhitespace(message.charAt(var19))) {
                     var19++
                  }

                  if (start != var19) {
                     if (useAsterisks) {
                        val var15: Int = var19 - start

                        repeat(var15) { var16 ->
                           result.append('*')
                        }
                     } else {
                        result.append("§0")
                        result.append(message, start, var19)
                        result.append("§r")
                     }

                     changed = true
                  }
               }

               cursor = var19
            }
         }

         return if (changed) result.toString() else message
      }
   }

   public fun findSensitiveRanges(message: String?): List<IntArray> {
      val ranges: ArrayList = ArrayList()
      if (message == null || message.length() == 0) {
         return ranges
      } else {
         var var14: Int = 0

         while (var14 < message.length()) {
            val slashIndex: Int = this.findNextCommandStart(message, var14)
            if (slashIndex < 0) {
               break
            }

            val commandLength: Int = this.getCommandLength(message, slashIndex)
            if (commandLength == 0) {
               var14 = slashIndex + 1
            } else {
               val argsToMask: Int = if (this.isRegisterCommand(message, slashIndex, commandLength)) 2 else 1
               var var15: Int = slashIndex + commandLength

               repeat(argsToMask) { var8 ->
                  while (var15 < message.length() && CharsKt.isWhitespace(message.charAt(var15))) {
                     var15++
                  }

                  val start: Int = var15

                  while (var15 < message.length() && !CharsKt.isWhitespace(message.charAt(var15))) {
                     var15++
                  }

                  if (start != var15) {
                     ranges.add(intArrayOf(start, var15))
                  }
               }

               var14 = var15
            }
         }

         return ranges
      }
   }

   public fun maskIfSensitive(message: String?): String? {
      return this.maskSensitive(message, false)
   }

   public fun isSensitivePrefix(message: String?): Boolean {
      if (message == null) {
         return false
      } else {
         val `$this$any$iv`: java.lang.Iterable = supportedCommands
         var var10: Boolean
         if (supportedCommands is java.util.Collection && supportedCommands.isEmpty()) {
            var10 = false
         } else {
            val var4: java.util.Iterator = `$this$any$iv`.iterator()

            while (true) {
               if (!var4.hasNext()) {
                  var10 = false
                  break
               }

               val it: java.lang.String = var4.next() as java.lang.String
               val var8: java.lang.String = StringsKt.trim(message).toString()
               val var10000: Locale = Locale.ROOT
               val var9: java.lang.String = var8.toLowerCase(var10000)
               if (StringsKt.startsWith$default(var9, "$it ", false, 2, null)) {
                  var10 = true
                  break
               }
            }
         }

         return var10
      }
   }

   private fun isRegisterCommand(message: String, start: Int, commandLength: Int): Boolean {
      val var10000: java.util.Set = registerCommands
      var var10001: java.lang.String = message.substring(start, start + commandLength)
      val var5: Locale = Locale.ROOT
      var10001 = var10001.toLowerCase(var5)
      return var10000.contains(var10001)
   }

   private fun getCommandLength(message: String, start: Int): Int {
      var end: Int = start + 1

      while (end < message.length() && Character.isLetter(message.charAt(end))) {
         end++
      }

      if (end <= start + 1) {
         return 0
      } else {
         var var10000: java.lang.String = message.substring(start, end)
         val var6: Locale = Locale.ROOT
         var10000 = var10000.toLowerCase(var6)
         return if (supportedCommands.contains(var10000)) var10000.length() else 0
      }
   }
}
