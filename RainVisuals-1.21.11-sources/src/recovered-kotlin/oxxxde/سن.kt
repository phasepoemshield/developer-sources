package oxxxde

import java.util.regex.Pattern
import net.minecraft.text.MutableText
import net.minecraft.text.Style
import net.minecraft.text.Text
import net.minecraft.text.TextContent
import net.minecraft.text.PlainTextContent.Literal
import net.minecraft.util.Formatting

// $VF: Compiled from heavy
public object سن {
   private final val replacementValues: Array<String>
   private final val replacementTargets: Array<String>
   private final val symbolReplacements: List<Pair<String, String>> =
      CollectionsKt.listOf(
         "к”—" to "${Formatting.BLUE}MODER",
         "к”Ґ" to "${Formatting.BLUE}ST.MODER",
         "к”Ў" to "${Formatting.LIGHT_PURPLE}MODER+",
         "к”Ђ" to "${Formatting.GRAY}PLAYER",
         "к”‰" to "${Formatting.YELLOW}HELPER",
         "в—†" to "@",
         "в”ѓ" to "|",
         "к”і" to "${Formatting.AQUA}ML.ADMIN",
         "к”…" to "${Formatting.RED}Y${Formatting.WHITE}T",
         "к”‚" to "${Formatting.BLUE}D.MODER",
         "к• " to "${Formatting.YELLOW}D.HELPER",
         "к•„" to "${Formatting.RED}DRACULA",
         "к”–" to "${Formatting.AQUA}OVERLORD",
         "к•€" to "${Formatting.GREEN}COBRA",
         "к”Ё" to "${Formatting.LIGHT_PURPLE}DRAGON",
         "к”¤" to "${Formatting.RED}IMPERATOR",
         "к” " to "${Formatting.GOLD}MAGISTER",
         "к”„" to "${Formatting.BLUE}HERO",
         "к”’" to "${Formatting.GREEN}AVENGER",
         "к•’" to "${Formatting.WHITE}RABBIT",
         "к”€" to "${Formatting.YELLOW}TITAN",
         "к•Ђ" to "${Formatting.DARK_GREEN}HYDRA",
         "к”¶" to "${Formatting.GOLD}TIGER",
         "к”І" to "${Formatting.DARK_PURPLE}BULL",
         "к•–" to "${Formatting.BLACK}BUNNY",
         "к•—к•\u0098" to "${Formatting.YELLOW}SPONSOR",
         "\ud83d\udd25" to "@",
         "бґЂ" to "A",
         "К™" to "B",
         "бґ„" to "C",
         "бґ…" to "D",
         "бґ‡" to "E",
         "Т“" to "F",
         "Йў" to "G",
         "Књ" to "H",
         "ЙЄ" to "I",
         "бґЉ" to "J",
         "бґ‹" to "K",
         "Кџ" to "L",
         "бґЌ" to "M",
         "Йґ" to "N",
         "књ±" to "S",
         "бґЏ" to "O",
         "бґ\u0098" to "P",
         "З«" to "Q",
         "КЂ" to "R",
         "бґ›" to "T",
         "бґњ" to "U",
         "бґ " to "V",
         "бґЎ" to "W",
         "књ°" to "F",
         "КЏ" to "Y",
         "бґў" to "Z"
      )

   private fun containsNonAscii(value: String): Boolean {
      var index: Int = 0

      for (var3 in value.length()..index) {
         if (value.charAt(index) > 127) {
            return true
         }
      }

      return false
   }

   fun replaceSymbols(text: Text): Text {
      var out: Text = text
      val var10000: java.lang.String = text.getString()
      val raw: java.lang.String = var10000
      if (!this.containsNonAscii(var10000)) {
         text
      } else {
         var index: Int = 0

         for (var5 in replacementTargets.length..index) {
            val target: java.lang.String = replacementTargets[index]
            if (StringsKt.contains$default(raw, replacementTargets[index], false, 2, null)) {
               out = this.replace(out, target, replacementValues[index])
            }
         }

         out
      }
   }

   fun replace(input: Text, target: java.lang.String, replacement: java.lang.String): Text {
      val var10000: MutableText = Text.empty().setStyle(input.getStyle())
      this.appendReplaced(var10000, input, target, replacement)
      var10000 as Text
   }

   @JvmStatic
   fun {
      var var4: Int = 0
      var var1: Int = symbolReplacements.size()
      var var2: Array<java.lang.String> = arrayOfNulls(var1)

      while (var4 < var1) {
         var2[var4] = (symbolReplacements.get(var4) as Pair).first
         var4++
      }

      replacementTargets = var2
      var4 = 0
      var1 = symbolReplacements.size()
      var2 = arrayOfNulls(var1)

      while (var4 < var1) {
         var2[var4] = (symbolReplacements.get(var4) as Pair).second
         var4++
      }

      replacementValues = var2
   }

   fun appendReplaced(result: MutableText, target: Text, current: java.lang.String, replacement: java.lang.String) {
      val var10000: TextContent = current.getContent()
      val var10: Style = current.getStyle()
      if (var10000 is Literal) {
         result.append(
            Text.literal(Pattern.compile(Pattern.quote(target), 2).matcher((var10000 as Literal).string()).replaceAll(replacement)).setStyle(var10) as Text
         )
      }

      for (var11 in current.getSiblings()) {
         this.appendReplaced(result, var11 as Text, target, replacement)
      }
   }

   public fun replaceSymbols(string: String): String {
      var out: java.lang.String = د.INSTANCE.protectString(string)
      if (!this.containsNonAscii(out)) {
         return out
      } else {
         var index: Int = 0

         for (var4 in replacementTargets.length..index) {
            val target: java.lang.String = replacementTargets[index]
            if (StringsKt.contains$default(out, replacementTargets[index], false, 2, null)) {
               out = StringsKt.replace$default(out, target, replacementValues[index], false, 4, null)
            }
         }

         return out
      }
   }
}
