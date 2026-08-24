package moscow.rockstar.module.listeners;

import moscow.rockstar.Rockstar;
import moscow.rockstar.systems.event.EventListener;
import moscow.rockstar.systems.event.impl.player.ClientPlayerTickEvent;
import moscow.rockstar.module.Module;

public class ModuleTickListener implements EventListener<ClientPlayerTickEvent> {
   public void onEvent(ClientPlayerTickEvent event) {
      for (Module module : Rockstar.getInstance().getModuleManager().getModules()) {
         if (module.isEnabled()) {
            module.tick();
         }
      }
   }
}
