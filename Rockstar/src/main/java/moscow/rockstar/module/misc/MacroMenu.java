package moscow.rockstar.module.misc;

import moscow.rockstar.systems.event.EventListener;
import moscow.rockstar.systems.event.impl.window.KeyPressEvent;
import moscow.rockstar.systems.event.impl.window.MouseEvent;
import moscow.rockstar.module.api.ModuleCategory;
import moscow.rockstar.module.api.ModuleInfo;
import moscow.rockstar.module.impl.BaseModule;
import moscow.rockstar.config.settings.BindSetting;

@ModuleInfo(name = "Macro Menu", category = ModuleCategory.OTHER, desc = "Меню для настройки макросов (автоматических действий по нажатию клавиш)")
public class MacroMenu extends BaseModule {
   private final BindSetting[] binds = new BindSetting[9];

   {
      for (int i = 0; i < 9; i++) {
         this.binds[i] = new BindSetting(this, "Slot " + (i + 1));
      }
   }

   private final EventListener<KeyPressEvent> onKey = event -> {
      if (event.getAction() == 1) {
         this.tryMacro(event.getKey());
      }
   };

   private final EventListener<MouseEvent> onMouse = event -> {
      if (event.getAction() == 1) {
         this.tryMacro(event.getButton());
      }
   };

   private void tryMacro(int key) {
      if (mc.player == null || mc.currentScreen != null || mc.interactionManager == null) {
         return;
      }
      for (int i = 0; i < this.binds.length; i++) {
         if (!this.binds[i].isKey(key)) {
            continue;
         }
         mc.player.getInventory().selectedSlot = i;
         mc.interactionManager.interactItem(mc.player, net.minecraft.util.Hand.MAIN_HAND);
         return;
      }
   }
}
