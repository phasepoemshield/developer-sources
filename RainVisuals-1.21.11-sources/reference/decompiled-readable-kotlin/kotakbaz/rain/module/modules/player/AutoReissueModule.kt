package kotakbaz.rain.module.modules.player

import java.util.Locale
import kotakbaz.rain.module.Module
import net.minecraft.client.gui.screen.Screen
import net.minecraft.client.gui.screen.ingame.HandledScreen
import net.minecraft.client.network.ClientPlayNetworkHandler
import net.minecraft.client.network.ClientPlayerEntity
import net.minecraft.client.network.ClientPlayerInteractionManager
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.item.ItemStack
import net.minecraft.screen.ScreenHandler
import net.minecraft.screen.slot.Slot
import net.minecraft.screen.slot.SlotActionType
import oxxxde.اُ
import oxxxde.بُ
import oxxxde.ثو
import oxxxde.سح
import oxxxde.صص
import oxxxde.ضك
import oxxxde.طث
import oxxxde.ق
import ru.ocz.protection.annotation.Compile
import sweetie.evaware.flora.api.Commando

// $VF: Compiled from heavy
public object AutoReissueModule : Module("AutoResale", PLAYER, "Автоматически перевыставляет предметы") {
   private final val storageKeywords: List<String> = CollectionsKt.listOf("хранилище", "storage")
   private const val STEP_DELAY_MS: Long = 1000L
   private final var nextAuctionAt: Long
   private final var state: ق = ق.WAITING_CYCLE
   private const val STEP_TIMEOUT_MS: Long = 15000L
   private const val PLAYER_INVENTORY_SLOT_COUNT: Int = 36
   private final var firstScreenSyncId: Int = -1
   private const val CLOSE_TIMEOUT_MS: Long = 2000L
   private final var stepStartedAt: Long
   private const val CYCLE_DELAY_MS: Long = 60000L

   fun getBottomRowSecondSlot(handler: ScreenHandler): Int {
      val var10000: Int = this.getContainerSlotCount(handler)
      if (var10000 != null) var10000 - 8 else null
   }

   @Compile
   fun resolveStorageSlot(handler: ScreenHandler): Int {
      val var2: Int = this.getBottomRowSecondSlot(handler)
      if (var2 != null) {
         val var3: Int = var2
         if (var3 >= 0 && var3 < (handler.slots as java.util.Collection).size()) {
            val var10000: Any = handler.slots.get(var3)
            val var5: ItemStack = طث.getStack(var10000 as Slot)
            if (!var5.isEmpty()) {
               var var10: java.lang.String = طث.getName(var5).getString()
               val var10001: Locale = Locale.ROOT
               var10 = var10.toLowerCase(var10001)
               val var6: java.lang.String = var10
               val var7: java.lang.Iterable = storageKeywords
               if (storageKeywords !is java.util.Collection || !storageKeywords.isEmpty()) {
                  for (var9 in var7) {
                     if (StringsKt.contains$default(var6, var9, false, 2, null)) {
                        var3
                     }
                  }
               }
            }
         }
      }

      null
   }

   @Commando
   public fun onUpdate(event: سح) {
      val var10000: ClientPlayerEntity = ضك.getMc().player
      if (var10000 != null) {
         if (ضك.getMc().world != null) {
            val var11: ClientPlayNetworkHandler = ضك.getMc().getNetworkHandler()
            if (var11 != null) {
               val var12: ClientPlayerInteractionManager = ضك.getMc().interactionManager
               if (var12 != null) {
                  val now: Long = System.currentTimeMillis()
                  if (!var10000.isAlive() || var10000.isSpectator()) {
                     this.resetCycle(now)
                  } else if (ثو.INSTANCE.isCombatTagged()) {
                     if (state != ق.WAITING_CYCLE) {
                        this.abortActiveCycle(now)
                     }
                  } else {
                     when (بُ.$EnumSwitchMapping$0[state.ordinal()]) {
                        1 -> {
                           if (now < nextAuctionAt) {
                              return
                           }

                           if (this.hasOpenGui()) {
                              return
                           }

                           var11.sendChatCommand("ah")
                           state = ق.WAITING_STORAGE_SCREEN
                           stepStartedAt = now
                           firstScreenSyncId = -1
                           break
                        }
                        2 -> {
                           if (now - stepStartedAt > 15000L) {
                              this.resetCycle(now)
                              return
                           }

                           if (ضك.getMc().currentScreen !is HandledScreen) {
                              return
                           }

                           if (var10000.currentScreenHandler == null) {
                              return
                           }

                           val var9: ScreenHandler = var10000.currentScreenHandler
                           if (firstScreenSyncId == -1) {
                              firstScreenSyncId = var10000.currentScreenHandler.syncId
                           }

                           if (now - stepStartedAt < 1000L) {
                              return
                           }

                           val var15: Int = this.resolveStorageSlot(var10000.currentScreenHandler)
                           if (var15 == null) {
                              return
                           }

                           var12.clickSlot(var9.syncId, var15, 0, SlotActionType.PICKUP, var10000 as PlayerEntity)
                           state = ق.WAITING_CONFIRM_SCREEN
                           stepStartedAt = now
                           break
                        }
                        3 -> {
                           if (now - stepStartedAt > 15000L) {
                              this.resetCycle(now)
                              return
                           }

                           if (ضك.getMc().currentScreen !is HandledScreen) {
                              return
                           }

                           if (var10000.currentScreenHandler == null) {
                              return
                           }

                           val handler: ScreenHandler = var10000.currentScreenHandler
                           if (var10000.currentScreenHandler.syncId == firstScreenSyncId) {
                              return
                           }

                           if (now - stepStartedAt < 1000L) {
                              return
                           }

                           val var14: Int = this.resolveConfirmSlot(var10000.currentScreenHandler)
                           if (var14 == null) {
                              return
                           }

                           var12.clickSlot(handler.syncId, var14, 0, SlotActionType.PICKUP, var10000 as PlayerEntity)
                           state = ق.WAITING_CLOSE
                           stepStartedAt = now
                           break
                        }
                        4 -> {
                           if (ضك.getMc().currentScreen is HandledScreen) {
                              val var13: Screen = ضك.getMc().currentScreen
                              if (var13 != null) {
                                 var13.close()
                              }

                              var10000.closeHandledScreen()
                              ضك.getMc().setScreen(null)
                           }

                           if (now - stepStartedAt > 2000L) {
                              this.resetCycle(now)
                           }
                           break
                        }
                        else -> throw NoWhenBranchMatchedException()
                     }
                  }
               }
            }
         }
      }
   }

   @JvmStatic
   fun {
      اُ.moduleOnFuntime$default(اُ.INSTANCE, INSTANCE, null, 2, null)
   }

   private fun resetCycle(now: Long) {
      state = ق.WAITING_CYCLE
      nextAuctionAt = now + 60000L
      stepStartedAt = 0L
      firstScreenSyncId = -1
   }

   fun getBottomRowPenultimateSlot(handler: ScreenHandler): Int {
      val var10000: Int = this.getContainerSlotCount(handler)
      if (var10000 != null) var10000 + -2 else null
   }

   public override fun onDisable() {
      this.resetCycle(System.currentTimeMillis())
   }

   fun getContainerSlotCount(handler: ScreenHandler): Int {
      val containerSlots: Int = handler.slots.size() - 36
      if (containerSlots > 0 && containerSlots % 9 == 0) containerSlots else null
   }

   private fun hasOpenGui(): Boolean {
      return صص.INSTANCE.customScreen != null || ضك.getMc().currentScreen != null
   }

   private fun abortActiveCycle(now: Long) {
      state = ق.WAITING_CYCLE
      nextAuctionAt = now
      stepStartedAt = 0L
      firstScreenSyncId = -1
   }

   public override fun onEnable() {
      state = ق.WAITING_CYCLE
      nextAuctionAt = 0L
      stepStartedAt = 0L
      firstScreenSyncId = -1
   }

   fun resolveConfirmSlot(handler: ScreenHandler): Int {
      val var10000: Int = this.getBottomRowPenultimateSlot(handler)
      if (var10000 != null) {
         val slotIndex: Int = var10000
         if (0 > slotIndex || slotIndex >= (handler.slots as java.util.Collection).size()) {
            null
         } else {
            val var3: Any = handler.slots.get(slotIndex)
            if (طث.getStack(var3 as Slot).isEmpty()) null else slotIndex
         }
      } else {
         null
      }
   }
}
