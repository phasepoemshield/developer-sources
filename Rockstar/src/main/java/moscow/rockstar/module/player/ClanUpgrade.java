package moscow.rockstar.module.player;

import moscow.rockstar.systems.event.EventListener;
import moscow.rockstar.systems.event.impl.player.ClientPlayerTickEvent;
import moscow.rockstar.module.api.ModuleCategory;
import moscow.rockstar.module.api.ModuleInfo;
import moscow.rockstar.module.impl.BaseModule;
import moscow.rockstar.util.time.Timer;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.util.Hand;

@ModuleInfo(name = "Clan Upgrade", category = ModuleCategory.PLAYER, desc = "Автоматическое улучшение клана")
public class ClanUpgrade extends BaseModule {
   private final Timer timer = new Timer();

   private final EventListener<ClientPlayerTickEvent> onTick = event -> {
      if (mc.player == null || mc.interactionManager == null) {
         return;
      }
      if (!this.timer.finished(400L)) {
         return;
      }
      if (!this.ensureTorch()) {
         return;
      }
      mc.interactionManager.interactItem((PlayerEntity) mc.player, Hand.MAIN_HAND);
      mc.player.swingHand(Hand.MAIN_HAND);
      this.timer.reset();
   };

   private boolean ensureTorch() {
      if (mc.player.getMainHandStack().isOf(Items.TORCH)) {
         return true;
      }
      for (int i = 0; i < 9; i++) {
         if (mc.player.getInventory().getStack(i).isOf(Items.TORCH)) {
            mc.player.getInventory().selectedSlot = i;
            return true;
         }
      }
      return false;
   }
}
