package oxxxde

import java.util.ArrayList
import kotakbaz.rain.module.Module
import kotakbaz.rain.module.setting.settings.BooleanSetting
import net.minecraft.block.ShulkerBoxBlock
import net.minecraft.client.network.ClientPlayerEntity
import net.minecraft.client.world.ClientWorld
import net.minecraft.component.DataComponentTypes
import net.minecraft.component.type.ContainerComponent
import net.minecraft.component.type.LoreComponent
import net.minecraft.entity.Entity
import net.minecraft.entity.ItemEntity
import net.minecraft.item.BlockItem
import net.minecraft.item.Item
import net.minecraft.item.ItemStack
import net.minecraft.network.packet.s2c.play.ItemPickupAnimationS2CPacket
import net.minecraft.text.MutableText
import net.minecraft.text.Text
import sweetie.evaware.flora.api.Commando

// $VF: Compiled from heavy
public object خِ : Module("PickUpLogger", PLAYER, "Показывает подобранные предметы в чате") {
   @JvmStatic
   private BooleanSetting onlyDonateItems = Module.boolean$default(خِ.INSTANCE, "Только донат предметы", false, null, 4, null);
   private const val PACKET_DEDUPLICATION_WINDOW_MS: Long = 1000L
   @JvmStatic
   private ClientPlayerEntity snapshotPlayer;
   private final var shulkerSnapshot: List<شٍ> = CollectionsKt.emptyList()
   private final val recentPacketPickups: MutableList<ظت> = ArrayList() as java.util.List
   private final val donateMarkerRegex: Regex = Regex("[★☆⭐✨❤♥❥✦✧✪✯✰❖⚡☠♛♚♔♕✵✹✺⛏⚔☯✿❂❃]|\\[\\s*<3\\s*]", RegexOption.IGNORE_CASE)

   public override fun onEnable() {
      val player: ClientPlayerEntity = ضك.getMc().player
      snapshotPlayer = player
      var var10000: java.util.List = if (player != null) this.captureShulkers(player) else null
      if (var10000 == null) {
         var10000 = CollectionsKt.emptyList()
      }

      shulkerSnapshot = var10000
      recentPacketPickups.clear()
   }

   private fun resetTracking() {
      snapshotPlayer = null
      shulkerSnapshot = CollectionsKt.emptyList()
      recentPacketPickups.clear()
   }

   @Commando
   public fun onUpdate(event: سح) {
      val var10000: ClientPlayerEntity = ضك.getMc().player
      if (var10000 == null) {
         this.resetTracking()
      } else {
         val currentSnapshot: java.util.List = this.captureShulkers(var10000)
         if (snapshotPlayer != var10000) {
            snapshotPlayer = var10000
            shulkerSnapshot = currentSnapshot
            recentPacketPickups.clear()
         } else {
            this.logShulkerContentGrowth(shulkerSnapshot, currentSnapshot)
            shulkerSnapshot = currentSnapshot
            this.discardExpiredPacketPickups()
         }
      }
   }

   private fun discardExpiredPacketPickups() {
      CollectionsKt.removeAll(recentPacketPickups, { it: ظت ->
         it.createdAt < `$cutoff`
      })
   }

   fun isShulker(stack: ItemStack): Boolean {
      val var3: Item = stack.getItem()
      (var3 as? BlockItem) != null && (var3 as? BlockItem).getBlock() is ShulkerBoxBlock
   }

   fun sendPickupMessage(amount: ItemStack, stack: Int) {
      val var10000: MutableText = Text.literal("Вы подобрали предмет ").append(stack.getName().copy() as Text).append(Text.literal(" x$amount") as Text)
      دإ.INSTANCE.sendClientMessage(var10000 as Text)
   }

   private fun logShulkerContentGrowth(previousSnapshot: List<شٍ>, currentSnapshot: List<شٍ>) {
      for (currentGroup in currentSnapshot) {
         val addedAmount: java.util.Iterator = previousSnapshot.iterator()

         var var10000: Any
         while (true) {
            if (!addedAmount.hasNext()) {
               var10000 = null
               break
            }

            val amountToLog: Any = addedAmount.next()
            if (ItemStack.areItemsAndComponentsEqual((amountToLog as شٍ).getShell(), currentGroup.getShell())) {
               var10000 = (شٍ)amountToLog
               break
            }
         }

         var10000 = var10000
         if (var10000 != null) {
            val previousGroup: شٍ = var10000
            if (var10000.containerCount == currentGroup.containerCount) {
               for (var16 in currentGroup.contents) {
                  val var23: java.util.Iterator = previousGroup.contents.iterator()

                  while (true) {
                     if (!var23.hasNext()) {
                        var25 = null
                        break
                     }

                     val `element$iv`: Any = var23.next()
                     if (ItemStack.areItemsAndComponentsEqual(`element$iv` as ItemStack, var16)) {
                        var25 = `element$iv`
                        break
                     }
                  }

                  val var19: Int = var16.getCount() - (if (var25 as ItemStack != null) (var25 as ItemStack).getCount() else 0)
                  if (var19 > 0 && (!onlyDonateItems.getValue() || this.isDonateItem(var16))) {
                     val var21: Int = this.consumeRecentPacketPickup(var16, var19)
                     if (var21 > 0) {
                        this.sendPickupMessage(var16, var21)
                     }
                  }
               }
            }
         }
      }
   }

   fun isDonateItem(stack: ItemStack): Boolean {
      val var3: StringBuilder = StringBuilder()
      val `$this$isDonateItem_u24lambda_u240`: StringBuilder = var3
      var3.append(stack.getName().getString())
      val var10000: LoreComponent = stack.get(DataComponentTypes.LORE) as LoreComponent
      if (var10000 != null) {
         val var12: java.util.List = var10000.lines()
         if (var12 != null) {
            for (`element$iv` in var12) {
               val line: Text = `element$iv` as Text
               `$this$isDonateItem_u24lambda_u240`.append(' ')
               `$this$isDonateItem_u24lambda_u240`.append(line.getString())
            }
         }
      }

      val visibleText: java.lang.String = var3.toString()
      donateMarkerRegex.containsMatchIn(visibleText) || visibleText.codePoints().anyMatch({ codePoint: Int ->
         var var10000: Boolean
         when (Character.getType(codePoint)) {
            18, 25, 26, 27, 28 -> var10000 = true
            else -> var10000 = false
         }

         var10000
      })
   }

   fun consumeRecentPacketPickup(amount: ItemStack, stack: Int): Int {
      this.discardExpiredPacketPickups()
      var remaining: Int = amount
      val iterator: java.util.Iterator = recentPacketPickups.iterator()

      while (iterator.hasNext() && remaining > 0) {
         val pickup: ظت = iterator.next() as ظت
         if (ItemStack.areItemsAndComponentsEqual(pickup.getStack(), stack)) {
            val consumed: Int = Math.min(remaining, pickup.remainingAmount)
            remaining -= consumed
            pickup.remainingAmount = pickup.remainingAmount - consumed
            if (pickup.remainingAmount <= 0) {
               iterator.remove()
            }
         }
      }

      remaining
   }

   fun captureShulkers(player: ClientPlayerEntity): MutableList<شٍ> {
      val groups: java.util.List = ArrayList()
      var slot: Int = 0

      for (var4 in player.getInventory().size()..slot) {
         var var10000: ItemStack = player.getInventory().getStack(slot)
         if (this.isShulker(var10000)) {
            var10000 = var10000.copyWithCount(1)
            val shell: ItemStack = var10000
            var10000.remove(DataComponentTypes.CONTAINER)
            val `$i$f$forEach`: java.util.Iterator = groups.iterator()

            while (true) {
               if (`$i$f$forEach`.hasNext()) {
                  val `element$iv`: Any = `$i$f$forEach`.next()
                  if (!ItemStack.areItemsAndComponentsEqual((`element$iv` as شٍ).getShell(), shell)) {
                     continue
                  }

                  var26 = `element$iv`
                  break
               }

               var26 = null
               break
            }

            var var27: شٍ = var26 as شٍ
            if (var26 as شٍ == null) {
               val var16: شٍ = شٍ(shell, 0, null, 6, null)
               groups.add(var16)
               var27 = var16
            }

            val group: شٍ = var27
            var27.containerCount = var27.containerCount + var10000.getCount()
            val var8: ContainerComponent = var10000.get(DataComponentTypes.CONTAINER) as ContainerComponent
            if (var8 != null) {
               val var17: java.lang.Iterable = var8.iterateNonEmptyCopy()
               if (var17 != null) {
                  for (var23 in var17) {
                     group.addContent(var23 as ItemStack)
                  }
               }
            }
         }
      }

      groups
   }

   public override fun onDisable() {
      this.resetTracking()
   }

   fun handlePickup(packet: ItemPickupAnimationS2CPacket) {
      if (this.isEnabled()) {
         if (ضك.getMc().isOnThread()) {
            val var10000: ClientPlayerEntity = ضك.getMc().player
            if (var10000 != null) {
               val var8: ClientWorld = ضك.getMc().world
               if (var8 != null) {
                  if (packet.getCollectorEntityId() == var10000.getId()) {
                     val amount: Entity = var8.getEntityById(packet.getEntityId())
                     val var9: ItemEntity = amount as? ItemEntity
                     if ((amount as? ItemEntity) != null) {
                        val var10: ItemStack = var9.getStack()
                        if (!var10.isEmpty()) {
                           if (!onlyDonateItems.getValue() || this.isDonateItem(var10)) {
                              val var7: Int = RangesKt.coerceAtLeast(packet.getStackAmount(), 1)
                              this.rememberPacketPickup(var10, var7)
                              this.sendPickupMessage(var10, var7)
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   fun rememberPacketPickup(amount: ItemStack, stack: Int) {
      this.discardExpiredPacketPickups()
      val var3: java.util.Collection = recentPacketPickups
      val var10002: ItemStack = stack.copyWithCount(1)
      var3.add(ظت(var10002, amount, System.currentTimeMillis()))
   }
}
