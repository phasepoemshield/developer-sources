package oxxxde

import ru.ocz.protection.annotation.Compile
import sweetie.evaware.flora.api.Commando

// $VF: Compiled from heavy
public object ذِ : دِ("HwAnarchyHelper", ظن.getPLAYER(), "Переходит на Лайт анархию HolyWorld командой /an<номер>") {
   private final val commandPattern: Regex = Regex("^/an(\\d{1,4})$", RegexOption.IGNORE_CASE)

   @Commando
   @Compile
   public fun onChatMessage(event: دش) {
      if (event.send) {
         val var2: MatchResult = commandPattern.matchEntire(StringsKt.trim(event.text).toString())
         if (var2 != null) {
            val var3: Int = StringsKt.toIntOrNull(var2.groupValues.get(1))
            if (var3 != null) {
               val var4: Int = var3
               event.setCancel(true)
               شْ.INSTANCE.request(var4)
            }
         }
      }
   }

   public override fun onDisable() {
      شْ.INSTANCE.cancel()
   }
}
