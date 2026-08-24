package oxxxde

import java.util.ArrayList
import java.util.Arrays
import java.util.Locale
import kotakbaz.rain.mixin.ItemCooldownEntryAccessor
import kotakbaz.rain.mixin.ItemCooldownManagerAccessor
import net.minecraft.client.font.TextRenderer
import net.minecraft.client.gui.DrawContext
import net.minecraft.entity.player.ItemCooldownManager
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.item.ItemStack
import net.minecraft.util.Identifier
import ru.ocz.protection.virtualmachine.annotation.RecompileFormat

// $VF: Compiled from heavy
@RecompileFormat
public object تع : دِ("Cooldowns", ظن.getPLAYER(), "Отображение кд предметов в хотбаре") {
   private fun getColor(seconds: Float): Int {
      return if (seconds <= 3.0F) -43691 else (if (seconds <= 10.0F) -22016 else -1)
   }

   fun renderHotbarCooldowns(player: DrawContext, context: PlayerEntity) {
      if (this.isEnabled()) {
         val var10000: ItemCooldownManager = player.getItemCooldownManager()
         val cooldownManager: ItemCooldownManager = var10000
         val currentTick: Int = (var10000 as ItemCooldownManagerAccessor).rain$getTick()
         val var42: java.util.Map = (var10000 as ItemCooldownManagerAccessor).rain$getEntries()
         val stack: java.util.Collection = ArrayList()

         for (width in var42.entrySet()) {
            val groupId: Identifier = width.getKey() as Identifier
            val rawEntry: Any = width.getValue()
            val var44: Pair = if ((rawEntry as? ItemCooldownEntryAccessor) == null) null else groupId to rawEntry as? ItemCooldownEntryAccessor
            if (var44 != null) {
               stack.add(var44)
            }
         }

         val activeCooldowns: java.util.Map = MapsKt.toMap(stack as java.util.List)
         val var25: Int = context.getScaledWindowWidth() / 2 - 91
         val var26: Int = context.getScaledWindowHeight() - 20

         repeat(8) { var27 ->
            val var45: ItemStack = player.getInventory().getStack(var27)
            if (!var45.isEmpty()) {
               val var46: ItemCooldownEntryAccessor = activeCooldowns.get(cooldownManager.getGroup(var45)) as ItemCooldownEntryAccessor
               if (var46 != null) {
                  val var30: Int = var46.rain$getEndTick() - currentTick
                  if (var30 > 0) {
                     val var31: Float = var30 / 20.0F
                     val var47: java.lang.String
                     if (var30 / 20.0F <= 1.0F) {
                        val var34: Locale = Locale.US
                        val var40: Array<Any> = arrayOf(var31)
                        var47 = java.lang.String.format(var34, "%.1f", Arrays.copyOf(var40, var40.length))
                     } else {
                        var47 = java.lang.String.valueOf((int)var31)
                     }

                     val var48: TextRenderer = ضك.getMc().textRenderer
                     context.drawTextWithShadow(
                        ضك.getMc().textRenderer, var47, var25 + var27 * 20 + 10 - var48.getWidth(var47) / 2, var26 + 2, this.getColor(var31)
                     )
                  }
               }
            }
         }
      }
   }
}
