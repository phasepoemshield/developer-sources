package oxxxde

import java.util.Locale
import kotakbaz.rain.module.Module
import kotakbaz.rain.module.setting.settings.BooleanSetting
import net.minecraft.text.Text
import net.minecraft.util.Formatting

// $VF: Compiled from heavy
public object رج : Module("ChatHelper", PLAYER, "Различные настройки чата") {
   @JvmStatic
   private BooleanSetting keepHistory = Module.boolean$default(رج.INSTANCE, "История чата", false, null, 4, null);
   private final var repeatCount: Int
   @JvmStatic
   private BooleanSetting antiFlood = Module.boolean$default(رج.INSTANCE, "Анти-флуд", true, null, 4, null);
   private final var lastMessageKey: String?

   @JvmStatic
   fun {
      antiFlood.onChange({ enabled: Boolean ->
         if (!enabled) {
            INSTANCE.resetAntiFlood()
         }

         Unit.INSTANCE
      })
   }

   public fun shouldKeepHistory(clearHistory: Boolean): Boolean {
      return this.isEnabled() && keepHistory.getValue() && clearHistory
   }

   private fun resetAntiFlood() {
      lastMessageKey = null
      repeatCount = 0
   }

   public fun onChatCleared() {
      this.resetAntiFlood()
   }

   fun processIncomingMessage(message: Text): Text? {
      if (this.isEnabled() && antiFlood.getValue()) {
         val var10001: java.lang.String = message.getString()
         val key: java.lang.String = this.normalize(var10001)
         if (key.length() == 0) {
            this.resetAntiFlood()
            null
         } else if (!(key == lastMessageKey)) {
            lastMessageKey = key
            repeatCount = 1
            null
         } else {
            val var3: Int = repeatCount++
            message.copy().append(Text.literal(" [x${repeatCount}]").formatted(Formatting.GRAY) as Text) as Text
         }
      } else {
         this.resetAntiFlood()
         null
      }
   }

   public override fun onEnable() {
      this.resetAntiFlood()
   }

   private fun normalize(text: String): String {
      val var5: java.lang.String = Regex("\\s+").replace(StringsKt.trim(text).toString(), " ")
      val var10000: Locale = Locale.ROOT
      val var6: java.lang.String = var5.toLowerCase(var10000)
      return var6
   }

   public override fun onDisable() {
      this.resetAntiFlood()
   }
}
