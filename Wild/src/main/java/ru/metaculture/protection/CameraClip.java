package ru.metaculture.protection;

import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "CameraClip",
   O000000000 = "Камера проходит сквозь блоки",
   O0000000000 = Category.Player
)
public class CameraClip extends Module {
   @EventHandler
   public void O00000000(O0000000O0000O o0000000O0000O) {
      o0000000O0000O.O000000000();
   }
}
