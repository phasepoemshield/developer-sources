package oxxxde

import net.minecraft.client.gui.screen.DeathScreen
import net.minecraft.client.network.ClientPlayerEntity
import ru.ocz.protection.annotation.Compile
import sweetie.evaware.flora.api.Commando

// $VF: Compiled from heavy
public object بإ : دِ("AutoRespawn", ظن.getPLAYER(), "Автоматический респавн при смерти") {
   @JvmStatic
   fun {
      اُ.moduleOnFuntime$default(اُ.INSTANCE, INSTANCE, null, 2, null)
   }

   @Commando
   @Compile
   public fun onUpdate(event: سح) {
      val var2: ClientPlayerEntity = ضك.getMc().player
      if (var2 != null) {
         if (ضك.getMc().currentScreen is DeathScreen) {
            var2.requestRespawn()
            ضك.getMc().setScreen(null)
         }
      }
   }
}
