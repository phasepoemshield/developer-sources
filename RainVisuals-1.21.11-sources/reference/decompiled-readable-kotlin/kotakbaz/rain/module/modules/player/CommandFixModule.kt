package kotakbaz.rain.module.modules.player

import java.util.Locale
import kotakbaz.rain.command.Command
import kotakbaz.rain.module.Module
import oxxxde.دإ
import oxxxde.دش
import ru.ocz.protection.annotation.Compile
import sweetie.evaware.flora.api.Commando

// $VF: Compiled from heavy
public object CommandFixModule : Module("CommandFix", PLAYER, "Исправляет команды на русской раскладке") {
   private const val RU_LAYOUT: String = "йцукенгшщзхъфывапролджэячсмитьбю"
   private const val EN_LAYOUT: String = "qwertyuiop[]asdfghjkl;'zxcvbnm,."

   private fun translateCommandToken(token: String): String {
      var changed: Boolean = false
      val translated: CharArray = CharArray(token.length())
      val `$this$forEachIndexed$iv`: java.lang.CharSequence = token
      var `index$iv`: Int = 0
            return if (changed) java.lang.String(translated) else token
   }

   private fun translateChar(char: Char): Char {
      var var10000: Char
      when (char) {
         1025 -> var10000 = '~'
         1105 -> var10000 = '`'
         else -> {
            val index: Int = StringsKt.indexOf$default("йцукенгшщзхъфывапролджэячсмитьбю", Character.toLowerCase(char), 0, false, 6, null)
            if (index == -1) {
               var10000 = char
            } else {
               val mapped: Char = "qwertyuiop[]asdfghjkl;'zxcvbnm,.".charAt(index)
               var10000 = if (Character.isUpperCase(char)) Character.toUpperCase(mapped) else mapped
            }
         }
      }

      return var10000
   }

   private fun shouldConvertToSlash(token: String): Boolean {
      var var10000: java.lang.String = token.substring(1)
      val var10: Locale = Locale.ROOT
      var10000 = var10000.toLowerCase(var10)
      val commandName: java.lang.String = var10000
      if (var10000.length() > 0) {
         val var9: java.lang.Iterable = دإ.INSTANCE.getCommands()
         var var12: Boolean
         if (var9 is java.util.Collection && (var9 as java.util.Collection).isEmpty()) {
            var12 = true
         } else {
            val var5: java.util.Iterator = var9.iterator()

            while (true) {
               if (!var5.hasNext()) {
                  var12 = true
                  break
               }

               if (StringsKt.equals((var5.next() as Command).name, commandName, true)) {
                  var12 = false
                  break
               }
            }
         }

         if (var12) {
            return true
         }
      }

      return false
   }

   @Commando
   @Compile
   public fun onMessage(event: دش) {
      if (event.send) {
         val var2: java.lang.String = event.text
         if (var2.length() != 0) {
            val var3: java.lang.CharSequence = var2
            val var4: Char = StringsKt.first(var2)
            if (var4 == '.' || var4 == '/') {
               val var5: Int = var3.length()
               var var6: Int = 0

               var var7: Int
               while (true) {
                  if (var6 < var5) {
                     if (!CharsKt.isWhitespace(var3.charAt(var6))) {
                        var6++
                        continue
                     }

                     var7 = var6
                     break
                  }

                  var7 = var2.length()
                  break
               }

               var var10000: java.lang.String = var2.substring(0, var7)
               val var9: java.lang.String = this.translateCommandToken(var10000)
               if (!(var9 == var10000)) {
                  val var10: java.lang.String
                  if (this.shouldConvertToSlash(var9)) {
                     var10000 = var9.substring(1)
                     var10 = lamda$onMessage$1_2e3b4394(var10000)
                  } else {
                     var10 = var9
                  }

                  var10000 = var2.substring(var7)
                  event.text = lamda$onMessage$2_70ccb3bf(var10, var10000)
               }
            }
         }
      }
   }
}
