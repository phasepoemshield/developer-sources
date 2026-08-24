package oxxxde

import net.minecraft.client.network.ClientPlayerEntity
import net.minecraft.client.network.ClientPlayerInteractionManager
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.item.Item
import net.minecraft.item.ItemStack
import net.minecraft.screen.ScreenHandler
import net.minecraft.screen.slot.Slot
import net.minecraft.screen.slot.SlotActionType
import org.lwjgl.glfw.GLFW
import sweetie.evaware.flora.api.Commando

// $VF: Compiled from heavy
public object ات : دِ("ItemScroller", ظن.getPLAYER(), "Быстрое перемещение предметов") {
   private final var stop: Boolean
   public final val delay: طُ = دِ.slider$default(INSTANCE, "Задержка", 40.0F, 0.0F, 200.0F, 5.0F, null, 32, null)

   @Commando
   public fun onClickSlot(event: تغ) {
      val var10000: ClientPlayerEntity = ضك.getMc().player
      if (var10000 != null) {
         val player: ClientPlayerEntity = var10000
         val var13: ClientPlayerInteractionManager = ضك.getMc().interactionManager
         if (var13 != null) {
            val interaction: ClientPlayerInteractionManager = var13
            val var14: ScreenHandler = var10000.currentScreenHandler
            val handler: ScreenHandler = var14
            if (!stop && event.getSlotActionType() === SlotActionType.THROW) {
               if (this.isShiftDown() && this.isCtrlDown()) {
                  val sourceStack: Int = (var14.slots as java.util.Collection).size()
                  val sourceItem: Int = event.slot
                  if (0 <= sourceItem && sourceItem < sourceStack) {
                     val var15: Any = var14.slots.get(event.slot)
                     val var11: ItemStack = طث.getStack(var15 as Slot)
                     if (!var11.isEmpty()) {
                        stop = true

                        try {
                           var var16: Slot = var11.getItem()
                           val var12: Item = var16
                           var slotIndex: Int = 0

                           for (var8 in (handler.slots as java.util.Collection).size()..slotIndex) {
                              var16 = (Slot)handler.slots.get(slotIndex)
                              if (طث.getStack(var16).getItem() == var12) {
                                 interaction.clickSlot(handler.syncId, slotIndex, 1, SlotActionType.THROW, player as PlayerEntity)
                              }
                           }
                        } finally {
                           stop = false
                        }
                     }
                  }
               }
            }
         }
      }
   }

   fun getDelay(): طُ {
      delay
   }

   private fun isKeyDown(keyCode: Int): Boolean {
      return GLFW.glfwGetKey(ضك.getMc().getWindow().getHandle(), keyCode) == 1
   }

   private fun isShiftDown(): Boolean {
      return this.isKeyDown(340) || this.isKeyDown(344)
   }

   public fun delayMs(): Long {
      return RangesKt.coerceAtLeast((long)delay.getValue().floatValue(), 0L)
   }

   private fun isCtrlDown(): Boolean {
      return this.isKeyDown(341) || this.isKeyDown(345)
   }
}
