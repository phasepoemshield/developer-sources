package oxxxde

import kotakbaz.rain.mixin.ClientPlayerInteractionManagerInvoker
import net.minecraft.client.network.ClientPlayerEntity
import net.minecraft.client.network.ClientPlayerInteractionManager
import net.minecraft.component.DataComponentTypes
import net.minecraft.component.type.FoodComponent
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.item.ItemStack
import net.minecraft.util.Hand
import ru.ocz.protection.annotation.Compile
import ru.ocz.protection.virtualmachine.annotation.RecompileFormat
import sweetie.evaware.flora.api.Commando

// $VF: Compiled from heavy
@RecompileFormat
public object سظ : دِ("AutoEat", ظن.getPLAYER(), "Автоматически ест при голоде") {
   private final var previousUsePressed: Boolean
   private final var eatingSlot: Int = -1
   private final var isEating: Boolean
   private final var previousSlot: Int = -1

   public fun isActiveEating(): Boolean {
      return this.isEnabled() && isEating
   }

   private fun stopEating() {
      val player: ClientPlayerEntity = ضك.getMc().player
      if (isEating) {
         ضك.getMc().options.useKey.setPressed(previousUsePressed)
         if (player != null && 0 <= previousSlot && previousSlot < 9) {
            this.selectSlot(player, previousSlot)
         }
      }

      this.resetState()
   }

   fun shouldAbort(player: ClientPlayerEntity): Boolean {
      ضك.getMc().currentScreen != null || !player.isAlive() || player.isSpectator()
   }

   fun canEat(stack: ClientPlayerEntity, player: ItemStack): Boolean {
      label16@
      if (stack.isEmpty()) {
         false
      } else {
         val var10000: FoodComponent = stack.get(DataComponentTypes.FOOD) as FoodComponent
         var10000 != null && (player as PlayerEntity).canConsume(var10000.canAlwaysEat())
      }
   }

   public override fun onDisable() {
      this.stopEating()
   }

   fun shouldEat(player: ClientPlayerEntity): Boolean {
      player.getHungerManager().getFoodLevel() < 20
   }

   @Compile
   fun startEating(player: ClientPlayerEntity, slot: Int) {
      previousSlot = player.getInventory().getSelectedSlot()
      previousUsePressed = ضك.getMc().options.useKey.isPressed()
      eatingSlot = slot
      isEating = true
      this.selectSlot(player, slot)
      ضك.getMc().options.useKey.setPressed(true)
      ضك.getMc().interactionManager.interactItem(player, Hand.MAIN_HAND)
   }

   @Compile
   fun maintainEating(player: ClientPlayerEntity) {
      if (!this.shouldEat(player)) {
         if (player.isUsingItem()) {
            this.stopEating()
         }
      } else {
         var var2: Int
         run label46@{
            if (eatingSlot >= 0) {
               val var10002: ItemStack = player.getInventory().getStack(eatingSlot)
               if (this.canEat(player, var10002)) {
                  var2 = eatingSlot
                  return@label46
               }
            }

            var2 = this.findFoodSlot(player)
         }

         if (var2 == null) {
            if (player.isUsingItem()) {
               this.stopEating()
            }
         } else {
            eatingSlot = var2
            this.selectSlot(player, var2)
            ضك.getMc().options.useKey.setPressed(true)
            if (!player.isUsingItem()) {
               val var3: ClientPlayerInteractionManager = ضك.getMc().interactionManager
               if (var3 != null) {
                  var3.interactItem(player, Hand.MAIN_HAND)
               }
            }
         }
      }
   }

   private fun resetState() {
      isEating = false
      previousSlot = -1
      eatingSlot = -1
      previousUsePressed = false
   }

   fun findFoodSlot(player: ClientPlayerEntity): Int {
      val currentSlot: Int = player.getInventory().getSelectedSlot()
      var var10002: ItemStack = player.getInventory().getStack(currentSlot)
      if (this.canEat(player, var10002)) {
         currentSlot
      } else {
         repeat(8) { slot ->
            var10002 = player.getInventory().getStack(slot)
            if (this.canEat(player, var10002)) {
               slot
            }
         }

         null
      }
   }

   public override fun onEnable() {
      this.resetState()
   }

   @JvmStatic
   fun {
      اُ.moduleOnFuntime$default(اُ.INSTANCE, INSTANCE, null, 2, null)
   }

   fun selectSlot(player: ClientPlayerEntity, slot: Int) {
      if (0 <= slot && slot < 9) {
         if (player.getInventory().getSelectedSlot() != slot) {
            player.getInventory().setSelectedSlot(slot)
            val var3: ClientPlayerInteractionManager = ضك.getMc().interactionManager
            val var10000: ClientPlayerInteractionManagerInvoker = var3 as? ClientPlayerInteractionManagerInvoker
            if ((var3 as? ClientPlayerInteractionManagerInvoker) != null) {
               var10000.rain$syncSelectedSlot()
            }
         }
      }
   }

   @Commando
   @Compile
   public fun onUpdate(event: سح) {
      val var2: ClientPlayerEntity = ضك.getMc().player
      if (var2 == null) {
         this.resetState()
      } else if (ضك.getMc().world == null) {
         this.stopEating()
      } else if (ضك.getMc().interactionManager == null) {
         this.stopEating()
      } else if (this.shouldAbort(var2)) {
         this.stopEating()
      } else if (isEating) {
         this.maintainEating(var2)
      } else if (this.shouldEat(var2)) {
         if (!var2.isUsingItem()) {
            val var3: Int = this.findFoodSlot(var2)
            if (var3 != null) {
               this.startEating(var2, var3)
            }
         }
      }
   }
}
