package moscow.rockstar.module.visuals;

import lombok.Generated;
import moscow.rockstar.Rockstar;
import moscow.rockstar.module.api.ModuleCategory;
import moscow.rockstar.module.api.ModuleInfo;
import moscow.rockstar.module.impl.BaseModule;
import moscow.rockstar.module.misc.Sounds;
import moscow.rockstar.config.settings.ModeSetting;
import moscow.rockstar.ui.menu.MenuScreen;
import moscow.rockstar.ui.menu.api.MenuCloseListener;
import moscow.rockstar.util.sounds.ClientSounds;
@ModuleInfo(name = "Menu", category = ModuleCategory.VISUALS, key = 344, desc = "Настройка главного меню клиента (стиль, анимации)")
public class MenuModule extends BaseModule {
   private static final MenuCloseListener menuCloseListener = new MenuCloseListener();
   private final ModeSetting mode = new ModeSetting(this, "Режим меню");
   private final ModeSetting.Value dropdown = new ModeSetting.Value(this.mode, "Выпадающее");
   private final ModeSetting.Value modern = new ModeSetting.Value(this.mode, "Современное");

   @Override
   public void onEnable() {
      if (!(mc.currentScreen instanceof MenuScreen)) {
         MenuScreen menuScreen = Rockstar.getInstance().getMenuScreen();
         mc.setScreen(menuScreen);
         Sounds soundsModule = Rockstar.getInstance().getModuleManager().getModule(Sounds.class);
         if (soundsModule.isEnabled()) {
            ClientSounds.CLICKGUI_OPEN.play(soundsModule.getVolume().getCurrentValue());
         }

         super.onEnable();
      }
   }

   @Override
   public void onDisable() {
      if (mc.currentScreen instanceof MenuScreen) {
         mc.setScreen(null);
         Rockstar.getInstance().getMenuScreen().setClosing(true);
      }

      super.onDisable();
   }

   @Generated
   public ModeSetting.Value getModern() {
      return this.modern;
   }
}
