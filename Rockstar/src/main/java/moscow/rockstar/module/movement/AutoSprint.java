package moscow.rockstar.module.movement;

import moscow.rockstar.systems.event.EventListener;
import moscow.rockstar.systems.event.impl.player.ClientPlayerTickEvent;
import moscow.rockstar.module.api.ModuleCategory;
import moscow.rockstar.module.api.ModuleInfo;
import moscow.rockstar.module.impl.BaseModule;
@ModuleInfo(name = "Auto Sprint", category = ModuleCategory.MOVEMENT, enabledByDefault = true)
public class AutoSprint extends BaseModule {
   private final EventListener<ClientPlayerTickEvent> onUpdateEvent = event -> mc.options.sprintKey.setPressed(true);
}
