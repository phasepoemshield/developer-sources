package oxxxde

import net.minecraft.client.MinecraftClient
import net.minecraft.client.gui.screen.ingame.InventoryScreen
import net.minecraft.client.network.ClientPlayerEntity
import net.minecraft.component.DataComponentTypes
import net.minecraft.component.type.EquippableComponent
import net.minecraft.entity.EquipmentSlot
import net.minecraft.item.ItemStack
import net.minecraft.item.Items
import net.minecraft.screen.slot.SlotActionType
import ru.ocz.protection.annotation.Compile
import sweetie.evaware.flora.api.Commando

// $VF: Compiled from heavy
public object خث : دِ("ElytraSwap", ظن.getPLAYER(), "Свап элитры по кнопке") {
   private final var state: ضث = ضث.IDLE
   private final var nextActionAt: Long
   private final var wasPressed: Boolean
   private final val swapBind: ذُ = دِ.bind$default(خث.INSTANCE, "Кнопка", 71, null, 4, null)
   private const val CHEST_HANDLER_SLOT: Int = 6
   private final var targetHandlerSlot: Int = -1
   private final var equipingElytra: Boolean
   private final var inventoryOpenedByModule: Boolean
   private const val STEP_DELAY_MS: Long = 50L

   private fun findChestplateSlot(): Int? {
      val var10000: ClientPlayerEntity = ضك.getMc().player
      if (var10000 == null) {
         return null
      } else {
         val player: ClientPlayerEntity = var10000

         repeat(35) { slot ->
            val var5: ItemStack = player.getInventory().getStack(slot)
            val equippable: EquippableComponent = var5.get(DataComponentTypes.EQUIPPABLE) as EquippableComponent
            if ((if (equippable != null) equippable.slot() else null) === EquipmentSlot.CHEST) {
               return slot
            }
         }

         return null
      }
   }

   private fun resetProgress(closeInventory: Boolean, resetPressed: Boolean) {
      if (closeInventory && inventoryOpenedByModule && ضك.getMc().currentScreen is InventoryScreen) {
         ضك.getMc().setScreen(null)
      }

      state = ضث.IDLE
      nextActionAt = 0L
      targetHandlerSlot = -1
      equipingElytra = false
      inventoryOpenedByModule = false
      if (resetPressed) {
         wasPressed = false
      }
   }

   private fun findElytraSlot(): Int? {
      val var10000: ClientPlayerEntity = ضك.getMc().player
      if (var10000 == null) {
         return null
      } else {
         val player: ClientPlayerEntity = var10000

         repeat(35) { slot ->
            if (player.getInventory().getStack(slot).isOf(Items.ELYTRA)) {
               return slot
            }
         }

         return null
      }
   }

   @Commando
   @Compile
   public fun onUpdate(event: سح) {
      var var3: Long = 0L
      var var16: MinecraftClient = ضك.getMc()
      if (var16 == null) {
         throw NullPointerException("Null pointer access [field:7]")
      } else {
         val var11: ClientPlayerEntity = var16.player
         if (var16.player == null) {
            this.resetProgress(true, true)
         } else {
            var16 = ضك.getMc()
            if (var16 == null) {
               throw NullPointerException("Null pointer access [field:32]")
            } else if (var16.world == null) {
               this.resetProgress(true, true)
            } else {
               var16 = ضك.getMc()
               if (var16 == null) {
                  throw NullPointerException("Null pointer access [field:35]")
               } else if (var16.interactionManager == null) {
                  this.resetProgress(true, true)
               } else if (state != ضث.IDLE) {
                  var3 = System.currentTimeMillis()
                  if (var3 >= nextActionAt) {
                     when (حط.$EnumSwitchMapping$0[state.ordinal()]) {
                        1 -> {
                           var16 = ضك.getMc()
                           if (var16 == null) {
                              throw NullPointerException("Null pointer access [field:79]")
                           } else {
                              if (var16.currentScreen == null) {
                                 var16 = ضك.getMc()
                                 if (var16 == null) {
                                    throw NullPointerException("Null pointer access [invoke:90]")
                                 }

                                 var16.setScreen(InventoryScreen(var11))
                                 inventoryOpenedByModule = true
                              }

                              nextActionAt = var3 + 50
                              state = ضث.PICKING_CHEST_SLOT
                              return
                           }
                        }
                        2 -> {
                           var16 = ضك.getMc()
                           if (var16 == null) {
                              throw NullPointerException("Null pointer access [field:111]")
                           } else if (var16.currentScreen !is InventoryScreen) {
                              this.resetProgress(true, false)
                              return
                           } else {
                              var16 = ضك.getMc()
                              if (var16 == null) {
                                 throw NullPointerException("Null pointer access [field:127]")
                              } else {
                                 if (var16.interactionManager != null) {
                                    if (var11.playerScreenHandler == null) {
                                       throw NullPointerException("Null pointer access [field:134]")
                                    }

                                    var16.interactionManager.clickSlot(var11.playerScreenHandler.syncId, 6, 0, SlotActionType.PICKUP, var11)
                                 }

                                 nextActionAt = var3 + 50
                                 state = ضث.PICKING_TARGET_SLOT
                                 return
                              }
                           }
                        }
                        3 -> {
                           var16 = ضك.getMc()
                           if (var16 == null) {
                              throw NullPointerException("Null pointer access [field:171]")
                           } else if (var16.currentScreen !is InventoryScreen) {
                              this.resetProgress(true, false)
                              return
                           } else if (targetHandlerSlot < 0) {
                              this.resetProgress(true, false)
                              return
                           } else {
                              var16 = ضك.getMc()
                              if (var16 == null) {
                                 throw NullPointerException("Null pointer access [field:190]")
                              } else {
                                 if (var16.interactionManager != null) {
                                    if (var11.playerScreenHandler == null) {
                                       throw NullPointerException("Null pointer access [field:197]")
                                    }

                                    var16.interactionManager.clickSlot(var11.playerScreenHandler.syncId, targetHandlerSlot, 0, SlotActionType.PICKUP, var11)
                                 }

                                 nextActionAt = var3 + 50
                                 state = ضث.PLACING_CHEST_SLOT
                                 return
                              }
                           }
                        }
                        4 -> {
                           var16 = ضك.getMc()
                           if (var16 == null) {
                              throw NullPointerException("Null pointer access [field:234]")
                           } else if (var16.currentScreen !is InventoryScreen) {
                              this.resetProgress(true, false)
                              return
                           } else {
                              var16 = ضك.getMc()
                              if (var16 == null) {
                                 throw NullPointerException("Null pointer access [field:250]")
                              } else {
                                 if (var16.interactionManager != null) {
                                    if (var11.playerScreenHandler == null) {
                                       throw NullPointerException("Null pointer access [field:257]")
                                    }

                                    var16.interactionManager.clickSlot(var11.playerScreenHandler.syncId, 6, 0, SlotActionType.PICKUP, var11)
                                 }

                                 if (var11.playerScreenHandler == null) {
                                    throw NullPointerException("Null pointer access [invoke:283]")
                                 } else {
                                    var11.playerScreenHandler.sendContentUpdates()
                                    if (سِ.INSTANCE == null) {
                                       throw NullPointerException("Null pointer access [invoke:304]")
                                    }

                                    val var32: java.lang.String
                                    if (equipingElytra) {
                                       var32 = "Элитра надета"
                                    } else {
                                       var32 = "Нагрудник одет"
                                    }

                                    سِ.INSTANCE.showMessage(this, var32)
                                    nextActionAt = var3 + 50
                                    state = ضث.CLOSING_INVENTORY
                                    return
                                 }
                              }
                           }
                        }
                        5 -> {
                           this.resetProgress(true, false)
                           return
                        }
                        else -> throw NoWhenBranchMatchedException()
                     }
                  }
               }
            }
         }
      }
   }

   public override fun onDisable() {
      this.resetProgress(true, true)
   }

   @Commando
   @Compile
   public fun onKey(event: تز) {
      val var11: Int = event.get(تز.Companion.getBUTTON())
      if (!(event.get(تز.Companion.getMOUSE()) == true)) {
         var var12: Boolean = event.get(تز.Companion.getRELEASE()) == true
         if (var11 == swapBind.getValue().intValue()) {
            if (var12) {
               wasPressed = false
            } else {
               val var15: ClientPlayerEntity = ضك.getMc().player
               if (var15 != null) {
                  if (ضك.getMc().world != null) {
                     if (ضك.getMc().interactionManager != null) {
                        if (ضك.getMc().currentScreen == null) {
                           if (state === ضث.IDLE) {
                              if (!wasPressed) {
                                 wasPressed = true
                                 val var17: ItemStack = var15.getEquippedStack(EquipmentSlot.CHEST)
                                 val var16: Int
                                 if (var17.isOf(Items.ELYTRA)) {
                                    var12 = false
                                    var16 = this.findChestplateSlot()
                                 } else {
                                    var12 = true
                                    var16 = this.findElytraSlot()
                                 }

                                 if (var16 == null) {
                                    سِ.INSTANCE.showMessage(this, if (var12) "Элитра не найдена в инвентаре" else "Нагрудник не найден в инвентаре")
                                    wasPressed = false
                                 } else {
                                    targetHandlerSlot = this.toHandlerSlot(var16)
                                    equipingElytra = var12
                                    state = ضث.OPENING_INVENTORY
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

   private fun toHandlerSlot(inventorySlot: Int): Int? {
      return if (0 <= inventorySlot && inventorySlot < 9) 36 + inventorySlot else (if (9 <= inventorySlot && inventorySlot < 36) inventorySlot else null)
   }

   public override fun onEnable() {
      this.resetProgress(false, true)
   }

   @JvmStatic
   fun {
      اُ.moduleOnFuntime$default(اُ.INSTANCE, INSTANCE, null, 2, null)
   }
}
