package moscow.rockstar.module.misc;

import moscow.rockstar.systems.event.EventListener;
import moscow.rockstar.systems.event.impl.game.AttackEvent;
import moscow.rockstar.systems.event.impl.player.ClientPlayerTickEvent;
import moscow.rockstar.systems.event.impl.render.HudRenderEvent;
import moscow.rockstar.module.api.ModuleCategory;
import moscow.rockstar.module.api.ModuleInfo;
import moscow.rockstar.module.impl.BaseModule;
import net.minecraft.entity.LivingEntity;

@ModuleInfo(name = "Player", category = ModuleCategory.OTHER, desc = "Информация о игроке и управление им")
public class PlayerModule extends BaseModule {
   private LivingEntity lastTarget;

   private final EventListener<AttackEvent> onAttack = event -> {
      if (event.getEntity() instanceof LivingEntity living) {
         this.lastTarget = living;
      }
   };

   private final EventListener<ClientPlayerTickEvent> onTick = event -> {
      if (this.lastTarget != null && !this.lastTarget.isAlive()) {
         this.lastTarget = null;
      }
   };

   private final EventListener<HudRenderEvent> onHud = event -> {
      if (this.lastTarget == null || mc.textRenderer == null) {
         return;
      }
      event.getContext().drawText(mc.textRenderer, this.lastTarget.getName().getString(), 4, 52, 0xFFFFFF, true);
   };
}
