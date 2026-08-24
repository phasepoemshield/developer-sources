package oxxxde

import java.util.Locale
import kotakbaz.rain.mixin.BossBarHudAccessor
import kotakbaz.rain.module.Module
import kotakbaz.rain.module.setting.settings.BooleanSetting
import net.minecraft.client.gui.hud.BossBarHud
import net.minecraft.client.gui.hud.ClientBossBar
import net.minecraft.client.network.ClientPlayerEntity
import net.minecraft.client.world.ClientWorld
import net.minecraft.text.Text
import ru.ocz.protection.annotation.Compile
import sweetie.evaware.flora.api.Commando

// $VF: Compiled from heavy
public object ثو : Module("PvpSafe", PLAYER, "Блокирует случайный выход при пвп") {
   private final val blockedCommandRegex: Regex = Regex("^/hub(?:\\s|$)", RegexOption.IGNORE_CASE)
   @JvmStatic
   private BooleanSetting blockButton = Module.boolean$default(ثو.INSTANCE, "Блокировать кнопку", true, null, 4, null);
   @JvmStatic
   private BooleanSetting blockCommands = Module.boolean$default(ثو.INSTANCE, "Блокировать /hub", true, null, 4, null);
   private final val combatKeywords: List<String> =
      CollectionsKt.listOf(
         "pvp", "пвп", "combat", "combat mode", "in combat", "combat tag", "combatlog", "combat cooldown", "duel", "дуэл", "режим боя", "в бою"
      )

   public fun isCombatTagged(): Boolean {
      val var10000: ClientPlayerEntity = ضك.getMc().player
      if (var10000 == null) {
         return false
      } else {
         val var21: ClientWorld = ضك.getMc().world
         if (var21 == null) {
            return false
         } else if (!var10000.isRemoved() && var10000.isAlive() && var21 == var10000.getEntityWorld()) {
            val var22: BossBarHud = ضك.getMc().inGameHud.getBossBarHud()
            val bossBars: java.util.Collection = (var22 as BossBarHudAccessor).rain$getBossBars().values()
            if (bossBars.isEmpty()) {
               return false
            } else {
               val `$this$any$iv`: java.lang.Iterable = bossBars
               var var27: Boolean
               if (bossBars is java.util.Collection && (bossBars as java.util.Collection).isEmpty()) {
                  var27 = false
               } else {
                  val var6: java.util.Iterator = `$this$any$iv`.iterator()

                  while (true) {
                     if (!var6.hasNext()) {
                        var27 = false
                        break
                     }

                     val var23: java.lang.String = (var6.next() as ClientBossBar).getName().getString()
                     val var24: Locale = Locale.ROOT
                     val var25: java.lang.String = var23.toLowerCase(var24)
                     val normalized: java.lang.String = Regex("\\s+").replace(StringsKt.replace$default(var25, 'ё', 'е', false, 4, null), " ")
                     val var18: java.lang.Iterable = combatKeywords
                     var var26: Boolean
                     if (combatKeywords is java.util.Collection && combatKeywords.isEmpty()) {
                        var26 = false
                     } else {
                        val var20: java.util.Iterator = var18.iterator()

                        while (true) {
                           if (!var20.hasNext()) {
                              var26 = false
                              break
                           }

                           if (StringsKt.contains$default(normalized, var20.next() as java.lang.CharSequence, false, 2, null)) {
                              var26 = true
                              break
                           }
                        }
                     }

                     if (var26) {
                        var27 = true
                        break
                     }
                  }
               }

               return var27
            }
         } else {
            return false
         }
      }
   }

   @Commando
   @Compile
   public fun onMessage(event: دش) {
      if (event.send) {
         if (this.isEnabled()) {
            if (blockCommands.getValue()) {
               if (this.isCombatTagged()) {
                  if (blockedCommandRegex.containsMatchIn(StringsKt.trim(event.text).toString())) {
                     event.setCancel(true)
                     ضك.getMc().inGameHud.setOverlayMessage(Text.literal("PvpSafe: /hub заблокирован во время режима пвп"), false)
                  }
               }
            }
         }
      }
   }

   public fun shouldBlockDisconnectButton(): Boolean {
      return this.isEnabled() && blockButton.getValue() && this.isCombatTagged()
   }
}
