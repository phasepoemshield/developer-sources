package oxxxde

import java.lang.Character.UnicodeScript
import java.util.function.Consumer
import kotakbaz.rain.module.Module
import kotakbaz.rain.module.setting.settings.BooleanSetting

// $VF: Compiled from heavy
public object شء : Module("ChatTranslator", PLAYER, "Переводчик отправленных и входящих сообщений") {
   @JvmStatic
   private BooleanSetting outgoingTranslation = Module.boolean$default(شء.INSTANCE, "Перевод отправки", true, null, 4, null);
   @JvmStatic
   private BooleanSetting incomingTranslation = Module.boolean$default(شء.INSTANCE, "Перевод входящих", true, null, 4, null);

   public fun getHoveredTranslation(message: String): String? {
      return if (this.isEnabled() && incomingTranslation.getValue() && this.containsNonCyrillicLetters(message))
         ثً.getCachedOrRequest(message, "auto", "ru")
         else
         ""
      }

   public fun interceptOutgoingMessage(message: String, callback: Consumer<String>): Boolean {
      if (this.isEnabled()
         && outgoingTranslation.getValue()
         && !StringsKt.startsWith$default(message, "/", false, 2, null)
         && this.containsCyrillicLetters(message)) {
         ثً.translateAsync(message, "ru", "en", { translation: java.lang.String ->
            ضك.getMc().execute({ 
               `$callback`.accept(`$translation`)
            })
         })
         return true
      } else {
         return false
      }
   }

   private fun containsCyrillicLetters(text: String): Boolean {
      val `$this$any$iv`: java.lang.CharSequence = text
      var var4: Int = 0

      var var10000: Boolean
      while (true) {
         if (var4 >= `$this$any$iv`.length()) {
            var10000 = false
            break
         }

         val it: Char = `$this$any$iv`.charAt(var4)
         if (Character.isLetter(it) && UnicodeScript.of(it) === UnicodeScript.CYRILLIC) {
            var10000 = true
            break
         }

         var4++
      }

      return var10000
   }

   private fun containsNonCyrillicLetters(text: String): Boolean {
      val `$this$any$iv`: java.lang.CharSequence = text
      var var4: Int = 0

      var var10000: Boolean
      while (true) {
         if (var4 >= `$this$any$iv`.length()) {
            var10000 = false
            break
         }

         val it: Char = `$this$any$iv`.charAt(var4)
         if (Character.isLetter(it) && UnicodeScript.of(it) != UnicodeScript.CYRILLIC) {
            var10000 = true
            break
         }

         var4++
      }

      return var10000
   }
}
