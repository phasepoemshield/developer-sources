package oxxxde

import java.util.Locale
import net.minecraft.client.network.ServerInfo

// $VF: Compiled from heavy
public object ضه {
   public fun hasActiveWorld(): Boolean {
      return ضك.getMc().player != null && ضك.getMc().world != null
   }

   public fun isFunTimeContext(): Boolean {
      return this.isSingleplayer() || this.isFunTime()
   }

   public fun isSingleplayer(): Boolean {
      return this.hasActiveWorld() && ضك.getMc().isInSingleplayer()
   }

   public fun isHolyWorld(): Boolean {
      return this.isCurrentServerMatching("holyworld")
   }

   public fun isHolyWorldContext(): Boolean {
      return this.isSingleplayer() || this.isHolyWorld()
   }

   public fun isCurrentServerMatching(token: String): Boolean {
      if (!this.hasActiveWorld() || ضك.getMc().isInSingleplayer()) {
         return false
      } else if (token.length() == 0) {
         return true
      } else {
         val var3: ServerInfo = ضك.getMc().getCurrentServerEntry()
         if (var3 != null && var3.address != null) {
            val var5: java.lang.String = StringsKt.trim(var3.address).toString()
            if (var5 != null) {
               val var6: java.lang.String = if (var5.length() > 0) var5 else null
               if (var6 != null) {
                  val var10000: Locale = Locale.ROOT
                  val var13: java.lang.String = var6.toLowerCase(var10000)
                  if (var13 != null) {
                     val var14: java.lang.CharSequence = var13
                     val var10001: Locale = Locale.ROOT
                     val var15: java.lang.String = token.toLowerCase(var10001)
                     return StringsKt.contains$default(var14, var15, false, 2, null)
                  }
               }
            }
         }

         return false
      }
   }

   public fun isFunTime(): Boolean {
      return this.isCurrentServerMatching("funtime")
   }
}
