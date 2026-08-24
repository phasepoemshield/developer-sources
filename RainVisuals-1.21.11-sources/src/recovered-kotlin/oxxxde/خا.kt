package oxxxde

import java.util.ArrayList
import java.util.Arrays
import java.util.LinkedHashMap
import kotakbaz.rain.mixin.ItemCooldownEntryAccessor
import kotakbaz.rain.mixin.ItemCooldownManagerAccessor
import kotakbaz.rain.module.modules.hud.container.Data$First
import kotakbaz.rain.module.modules.hud.container.Data$Leading
import kotakbaz.rain.module.modules.hud.container.Data$Second
import kotakbaz.rain.ui.mainmenu.RainMainMenuScreen$Btn
import net.minecraft.class_2960
import net.minecraft.client.network.ClientPlayerEntity
import net.minecraft.entity.player.ItemCooldownManager
import net.minecraft.entity.player.PlayerInventory
import net.minecraft.item.ItemStack
import net.minecraft.registry.Registries
import net.minecraft.registry.entry.RegistryEntry
import net.minecraft.registry.entry.RegistryEntry.Reference
import net.minecraft.text.Text
import net.minecraft.util.Identifier
import sweetie.evaware.flora.api.Commando

// $VF: Compiled from heavy
public object خا : RainMainMenuScreen$Btn("Cooldowns", "Отображает на каких предметах кд", 200.0F, 200.0F, "l") {
   private final var cachedTick: Int = Integer.MIN_VALUE
   @JvmStatic
   private ClientPlayerEntity cachedPlayer;
   private final var cachedSignature: Long = java.lang.Long.MIN_VALUE
   private final var cooldownCount: Int
   private final val map: LinkedHashMap<صه, تِ> = LinkedHashMap()
   private final val cooldownBuffer: ArrayList<سَ> = ArrayList()

   private fun formatDuration(remainingTicks: Int): String {
      val seconds: Float = remainingTicks / 20.0F
      if (remainingTicks / 20.0F < 10.0F) {
         val var10: Array<Any> = arrayOf(seconds)
         val var12: java.lang.String = java.lang.String.format("%.1fs", Arrays.copyOf(var10, var10.length))
         return var12
      } else {
         val totalSeconds: Int = (int)Math.ceil((double)seconds)
         val minutes: Int = totalSeconds / 60
         val secs: Int = totalSeconds % 60
         val var10000: java.lang.String
         if (minutes > 0) {
            val var11: Array<Any> = arrayOf(minutes, secs)
            var10000 = java.lang.String.format("%d:%02d", Arrays.copyOf(var11, var11.length))
         } else {
            var10000 = "$totalSecondss"
         }

         return var10000
      }
   }

   fun cooldownName(groupId: ItemStack, stack: Identifier): java.lang.String {
      var var7: java.lang.String
      run label46@{
         if (stack != null) {
            val var10000: Text = طث.getName(stack)
            if (var10000 != null) {
               var7 = var10000.getString()
               if (var7 != null) {
                  var7 = StringsKt.trim(var7).toString()
                  return@label46
               }
            }
         }

         var7 = null
      }

      if (var7 == null) {
         var7 = ""
      }

      if (var7.length() > 0) {
         var7
      } else {
         var7 = groupId.getPath()
         val var4: java.lang.CharSequence = StringsKt.trim(
               StringsKt.replace$default(StringsKt.replace$default(var7, '_', ' ', false, 4, null), '/', ' ', false, 4, null)
            )
            .toString()
            if (var4.length() == 0) {
            var7 = groupId.toString()
         } else {
            var7 = var4
         }

         var7 as java.lang.String
      }
   }

   private fun cooldownSignature(cooldowns: Map<class_2960, *>): Long {
      var signature: Long = cooldowns.size()

      for (var5 in cooldowns.entrySet()) {
         val groupId: Identifier = var5.getKey() as Identifier
         val rawEntry: Any = var5.getValue()
         val var10000: ItemCooldownEntryAccessor = rawEntry as? ItemCooldownEntryAccessor
         if ((rawEntry as? ItemCooldownEntryAccessor) != null) {
            signature = ((signature * 31L + groupId.hashCode()) * 31L + var10000.rain$getStartTick()) * 31L + var10000.rain$getEndTick()
         }
      }

      return signature
   }

   fun resolveCooldownStack(groupId: ClientPlayerEntity, cooldownManager: ItemCooldownManager, player: Identifier): ItemStack {
      val var10000: PlayerInventory = player.getInventory()
      val inventory: PlayerInventory = var10000
      var mainHand: Int = 0

      for (offHand in var10000.size()..mainHand) {
         val var11: ItemStack = inventory.getStack(mainHand)
         if (!var11.isEmpty() && cooldownManager.getGroup(var11) == groupId) {
            var11
         }
      }

      val var12: ItemStack = player.getMainHandStack()
      if (!var12.isEmpty() && cooldownManager.getGroup(var12) == groupId) {
         var12
      } else {
         val var13: ItemStack = player.getOffHandStack()
         label43@
         if (!var13.isEmpty() && cooldownManager.getGroup(var13) == groupId) {
            var13
         } else {
            val var14: Reference = Registries.ITEM.getEntry(groupId).orElse(null) as Reference
            if (var14 == null) null else ItemStack(var14 as RegistryEntry)
         }
      }
   }

   private fun sortCooldownBuffer() {
      var index: Int = 1

      for (var2 in cooldownCount..index) {
         // $VF: Unable to resugar Kotlin loop from Java for loop
         var current: Int = index
         while (true) {
            if (current > 0 && (cooldownBuffer.get(current + -1) as سَ).remainingTicks < (cooldownBuffer.get(current) as سَ).remainingTicks) break
            val var10000: Any = cooldownBuffer.get(current + -1)
            val previous: سَ = var10000 as سَ
            cooldownBuffer.set(current + -1, cooldownBuffer.get(current))
            cooldownBuffer.set(current, previous)

            current--
         }
      }
   }

   @Commando
   public fun onOverlayRender(event: ثآ) {
      this.renderContainer(event)
   }

   protected override fun getCurrentData(): Map<صه, تِ> {
      val var10000: ClientPlayerEntity = ضك.getMc().player
      if (var10000 == null) {
         val var21: خا = this
         if (cachedPlayer != null || !map.isEmpty()) {
            cachedPlayer = null
            cachedTick = Integer.MIN_VALUE
            cachedSignature = java.lang.Long.MIN_VALUE
            cooldownCount = 0
            map.clear()
         }

         return map
      } else {
         val player: ClientPlayerEntity = var10000
         val var35: ItemCooldownManager = var10000.getItemCooldownManager()
         val cooldownManager: ItemCooldownManager = var35
         val currentTick: Int = (var35 as ItemCooldownManagerAccessor).rain$getTick()
         val rawCooldowns: java.util.Map = (var35 as ItemCooldownManagerAccessor).rain$getEntries()
         val signature: Long = this.cooldownSignature(rawCooldowns)
         if (cachedPlayer === var10000 && cachedTick == currentTick && cachedSignature == signature) {
            return map
         } else {
            cachedPlayer = var10000
            cachedTick = currentTick
            cachedSignature = signature
            map.clear()
            cooldownCount = 0

            for (var9 in rawCooldowns.entrySet()) {
               val cooldown: Identifier = var9.getKey() as Identifier
               val leading: Any = var9.getValue()
               val var36: ItemCooldownEntryAccessor = leading as? ItemCooldownEntryAccessor
               if ((leading as? ItemCooldownEntryAccessor) != null) {
                  val remainingTicks: Int = var36.rain$getEndTick() - currentTick
                  if (remainingTicks > 0) {
                     val stack: ItemStack = this.resolveCooldownStack(player, cooldownManager, cooldown)
                     val var37: سَ
                     if (cooldownCount < cooldownBuffer.size()) {
                        var37 = cooldownBuffer.get(cooldownCount)
                     } else {
                        val var17: سَ = سَ(null, null, 0, 7, null)
                        cooldownBuffer.add(var17)
                        var37 = var17
                     }

                     var37.setStack(if (stack != null) stack.copy() else null)
                     var37.name = this.cooldownName(stack, cooldown)
                     var37.remainingTicks = remainingTicks
                     val var32: Int = cooldownCount++
                  }
               }
            }

            this.sortCooldownBuffer()
            var var23: Int = 0

            for (var24 in cooldownCount..var23) {
               var var25: سَ
               run label103@{
                  val var38: Any = cooldownBuffer.get(var23)
                  var25 = var38 as سَ
                  val var27: ItemStack = (var38 as سَ).getStack()
                  if (var27 != null) {
                     val var28: ItemStack = if (!var27.isEmpty()) var27 else null
                     if (var28 != null) {
                        var39 = Data$Leading.Item(var28)
                        return@label103
                     }
                  }

                  var39 = null
               }

               map.put(Data$First(var25.name, var39), Data$Second(this.formatDuration(var25.remainingTicks), طغ.INSTANCE.VALUE_COLOR))
            }

            return map
         }
      }
   }
}
