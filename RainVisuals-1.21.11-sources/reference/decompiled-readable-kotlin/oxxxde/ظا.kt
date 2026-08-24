package oxxxde

import kotakbaz.rain.module.Module
import net.minecraft.client.input.Input
import net.minecraft.client.network.ClientPlayerEntity
import sweetie.evaware.flora.api.Commando

// $VF: Compiled from heavy
public object ظا : Module("AutoSprint", PLAYER, "Автоматический спринт при ходьбе") {
   fun shouldSprint(player: ClientPlayerEntity): Boolean {
      if (player.isSneaking() || player.isUsingItem()) {
         false
      } else if (player.isTouchingWater() || player.isInLava()) {
         false
      } else if (!player.hasVehicle() && !player.isGliding()) {
         val var10000: Input = player.input
         var10000.hasForwardMovement() && player.getHungerManager().getFoodLevel() > 6
      } else {
         false
      }
   }

   @Commando
   public fun onUpdate(event: سح) {
      val var10000: ClientPlayerEntity = ضك.getMc().player
      if (var10000 != null) {
         if (this.shouldSprint(var10000)) {
            var10000.setSprinting(true)
         }
      }
   }
}
