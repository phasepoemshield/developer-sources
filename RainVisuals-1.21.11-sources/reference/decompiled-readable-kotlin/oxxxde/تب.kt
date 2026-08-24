package oxxxde

import java.util.ArrayList
import kotakbaz.rain.event.events.KeyEvent
import kotakbaz.rain.module.Module
import kotakbaz.rain.module.modules.player.ItemSwapModule$SwapItem
import kotakbaz.rain.module.setting.ModeSetting
import kotakbaz.rain.module.setting.settings.BindSetting
import kotakbaz.rain.ui.mainmenu.RainMainMenuScreen$Link
import net.minecraft.client.network.ClientPlayerEntity
import net.minecraft.client.option.GameOptions
import net.minecraft.client.option.KeyBinding
import net.minecraft.item.ItemStack
import net.minecraft.screen.slot.SlotActionType
import ru.ocz.protection.annotation.Compile
import sweetie.evaware.flora.api.Commando

// $VF: Compiled from heavy
public object تب : Module("ItemSwap", PLAYER, "Быстрый свап предметов") {
   private final var state: ثإ
   @JvmStatic
   private ModeSetting secondItem;
   private final var nextActionAt: Long
   @JvmStatic
   private BindSetting swapKey = Module.bind$default(INSTANCE, "Кнопка", 82, null, 4, null);
   private final var wasPressed: Boolean
   private final var movementStopped: Boolean
   private final var targetHandlerSlot: Int
   private const val OFFHAND_SWAP_BUTTON: Int = 40
   private const val STEP_DELAY_MS: Long = 80L
   @JvmStatic
   private ModeSetting firstItem;

   @JvmStatic
   fun {
      var var10000: Module = INSTANCE
      var `$this$map$iv`: Array<ItemSwapModule$SwapItem> = ItemSwapModule$SwapItem.values()
      var `destination$iv$iv`: java.util.Collection = ArrayList(`$this$map$iv`.length)

      for (`item$iv$iv` in `$this$map$iv`) {
         `destination$iv$iv`.add(`item$iv$iv`.title)
      }

      firstItem = Module.mode$default(var10000, "Предмет 1", `destination$iv$iv` as java.util.List, 0, null, 8, null)
      var10000 = INSTANCE
      `$this$map$iv` = ItemSwapModule$SwapItem.values()
      `destination$iv$iv` = ArrayList(`$this$map$iv`.length)

      for (var20 in `$this$map$iv`) {
         `destination$iv$iv`.add(var20.title)
      }

      secondItem = Module.mode$default(var10000, "Предмет 2", `destination$iv$iv` as java.util.List, 1, null, 8, null)
      state = ثإ.IDLE
      targetHandlerSlot = -1
      اُ.moduleOnFuntime$default(اُ.INSTANCE, INSTANCE, null, 2, null)
   }

   private fun selectedFirstItem(): ثج {
      val var1: Array<ItemSwapModule$SwapItem> = ItemSwapModule$SwapItem.values()
      val var2: Int = firstItem.selectedIndex
      return if (0 <= var2 && var2 < var1.length) var1[var2] else ItemSwapModule$SwapItem.TALISMAN
   }

   public override fun onEnable() {
      this.resetProgress(true)
   }

   private fun stopMovement() {
      val var10000: ClientPlayerEntity = ضك.getMc().player
      if (var10000 != null) {
         val var3: GameOptions = ضك.getMc().options
         var3.forwardKey.setPressed(false)
         var3.backKey.setPressed(false)
         var3.leftKey.setPressed(false)
         var3.rightKey.setPressed(false)
         var3.jumpKey.setPressed(false)
         var3.sprintKey.setPressed(false)
         var10000.setSprinting(false)
         movementStopped = true
      }
   }

   private fun findInventorySlot(type: ثج): Int? {
      val var10000: ClientPlayerEntity = ضك.getMc().player
      if (var10000 == null) {
         return null
      } else {
         val player: ClientPlayerEntity = var10000

         repeat(35) { slot ->
            val var10001: ItemStack = player.getInventory().getStack(slot)
            if (type.matches(var10001)) {
               return slot
            }
         }

         return null
      }
   }

   @Commando
   @Compile
   public fun onKey(event: تز) {
      val var2: Int = event.get(KeyEvent.Companion.BUTTON)
      if (!(event.get(KeyEvent.Companion.MOUSE) == true)) {
         val var3: Boolean = event.get(KeyEvent.Companion.RELEASE) == true
         if (var2 == swapKey.getValue().intValue()) {
            if (!var3) {
               val var4: ClientPlayerEntity = ضك.getMc().player
               if (var4 != null) {
                  if (ضك.getMc().world != null) {
                     if (ضك.getMc().interactionManager != null) {
                        if (ضك.getMc().currentScreen == null) {
                           if (state === ثإ.IDLE) {
                              if (!wasPressed) {
                                 val var10001: ItemStack = var4.getOffHandStack()
                                 val var5: ItemSwapModule$SwapItem = this.currentOffhandType(var10001)
                                 if (var5 == null) {
                                    RainMainMenuScreen$Link.INSTANCE.showMessage(this, "Нет выбранного предмета для свапа в левой руке")
                                 } else {
                                    val var6: ItemSwapModule$SwapItem = this.targetTypeFor(var5)
                                    val var7: Int = this.findInventorySlot(var6)
                                    if (var7 == null) {
                                       RainMainMenuScreen$Link.INSTANCE.showMessage(this, lamda$onKey$1_1735e1c4(var6.title))
                                    } else {
                                       val var8: Int = this.toHandlerSlot(var7)
                                       if (var8 == null) {
                                          RainMainMenuScreen$Link.INSTANCE.showMessage(this, "Не удалось определить слот предмета")
                                       } else {
                                          wasPressed = true
                                          targetHandlerSlot = var8
                                          state = ثإ.STOPPING_MOVEMENT
                                          nextActionAt = 0L
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private fun selectedSecondItem(): ثج {
      val var1: Array<ItemSwapModule$SwapItem> = ItemSwapModule$SwapItem.values()
      val var2: Int = secondItem.selectedIndex
      return if (0 <= var2 && var2 < var1.length) var1[var2] else ItemSwapModule$SwapItem.SPHERE
   }

   public override fun onDisable() {
      this.resetProgress(true)
   }

   fun currentOffhandType(stack: ItemStack): ItemSwapModule$SwapItem {
      val first: ItemSwapModule$SwapItem = this.selectedFirstItem()
      val second: ItemSwapModule$SwapItem = this.selectedSecondItem()
      if (first.matches(stack)) first else (if (second.matches(stack)) second else null)
   }

   private fun targetTypeFor(sourceType: ثج): ثج {
      val first: ItemSwapModule$SwapItem = this.selectedFirstItem()
      return if (sourceType === first) this.selectedSecondItem() else first
   }

   @Commando
   @Compile
   public fun onUpdate(event: سح) {
      val var2: ClientPlayerEntity = ضك.getMc().player
      if (var2 == null || ضك.getMc().world == null || ضك.getMc().interactionManager == null) {
         this.resetProgress(true)
      } else if (state != ثإ.IDLE) {
         val var3: Long = System.currentTimeMillis()
         if (var3 >= nextActionAt) {
            val var6: Int = ع.$EnumSwitchMapping$0[state.ordinal()]
            if (var6 == 1) {
               this.stopMovement()
               nextActionAt = var3 + 80L
               state = ثإ.WAITING_BEFORE_SWAP
            } else if (var6 == 2) {
               this.stopMovement()
               nextActionAt = var3 + 80L
               state = ثإ.SWAPPING
            } else if (var6 == 3) {
               this.stopMovement()
               if (targetHandlerSlot < 0) {
                  this.resetProgress(false)
               } else {
                  ضك.getMc().interactionManager.clickSlot(var2.playerScreenHandler.syncId, targetHandlerSlot, 40, SlotActionType.SWAP, var2)
                  var2.playerScreenHandler.sendContentUpdates()
                  nextActionAt = var3 + 80L
                  state = ثإ.FINISHING
               }
            } else if (var6 == 4) {
               this.resetProgress(false)
            } else if (var6 != 5) {
               throw NoWhenBranchMatchedException()
            }
         }
      }
   }

   private fun toHandlerSlot(inventorySlot: Int): Int? {
      return if (0 <= inventorySlot && inventorySlot < 9) 36 + inventorySlot else (if (9 <= inventorySlot && inventorySlot < 36) inventorySlot else null)
   }

   private fun resetProgress(resetPressed: Boolean) {
      state = ثإ.IDLE
      nextActionAt = 0L
      targetHandlerSlot = -1
      if (movementStopped) {
         KeyBinding.updatePressedStates()
         movementStopped = false
      }

      if (resetPressed) {
         wasPressed = false
      }
   }
}
