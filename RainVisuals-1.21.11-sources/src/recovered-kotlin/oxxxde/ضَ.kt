package oxxxde

import net.minecraft.text.Text

// $VF: Compiled from heavy
public object ضَ {
   private const val STAR_MARKER: String = "[★]"
   private final val heartMarkerRegex: Regex = Regex("^\\[\\s*<3\\s*]$", RegexOption.IGNORE_CASE)
   private const val MAX_BORDER_TOKEN_LENGTH: Int = 8
   private final val whitespaceRegex: Regex = Regex("[\\s\\u00A0]+")

   @JvmStatic
   fun sanitizeName(text: Text): java.lang.String {
      val var10000: java.lang.String = text.getString()
      val normalized: java.lang.String = StringsKt.trim(
            whitespaceRegex.replace(
               StringsKt.replace$default(
                  StringsKt.replace$default(
                     StringsKt.replace$default(
                        StringsKt.replace$default(StringsKt.replace$default(var10000, "[★]", " ", false, 4, null), '\u200b', ' ', false, 4, null),
                        '\u200c',
                        ' ',
                        false,
                        4,
                        null
                     ),
                     '\u200d',
                     ' ',
                     false,
                     4,
                     null
                  ),
                  '\ufeff',
                  ' ',
                  false,
                  4,
                  null
               ),
               " "
            )
         )
         .toString()
         if (normalized.length() == 0) {
         ""
      } else {
         val tokens: java.util.List = CollectionsKt.toMutableList(StringsKt.split$default(normalized, charArrayOf(' '), false, 0, 6, null))
         INSTANCE.removeMirroredBorderTokens(tokens)

         while (!tokens.isEmpty() && INSTANCE.isPureDecoration(CollectionsKt.first(tokens))) {
            tokens.remove(0)
         }

         while (!tokens.isEmpty() && INSTANCE.isPureDecoration(CollectionsKt.last(tokens))) {
            tokens.remove(CollectionsKt.getLastIndex(tokens))
         }

         StringsKt.trim(CollectionsKt.joinToString$default(tokens, " ", null, null, 0, null, null, 62, null)).toString()
      }
   }

   private fun String.codePointCount(): Int {
      return `$this$codePointCount`.codePointCount(0, `$this$codePointCount`.length())
   }

   private fun removeMirroredBorderTokens(tokens: MutableList<String>) {
      while (tokens.size() >= 3) {
         val first: java.lang.String = CollectionsKt.first(tokens)
         if (!StringsKt.equals(first, CollectionsKt.last(tokens), true)) {
            return
         }

         if (this.codePointCount(first) > 8) {
            return
         }

         tokens.remove(CollectionsKt.getLastIndex(tokens))
         tokens.remove(0)
      }
   }

   private fun isPureDecoration(token: String): Boolean {
      return token.length() == 0 || heartMarkerRegex matches token as java.lang.CharSequence || token.codePoints().noneMatch({ codePoint: Int ->
         Character.isLetterOrDigit(codePoint)
      })
   }
}
