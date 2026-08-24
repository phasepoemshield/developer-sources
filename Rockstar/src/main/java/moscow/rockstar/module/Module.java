package moscow.rockstar.module;

import moscow.rockstar.systems.localization.Localizator;
import moscow.rockstar.module.api.ModuleCategory;
import moscow.rockstar.module.api.ModuleInfo;
import moscow.rockstar.config.SettingsContainer;
import moscow.rockstar.util.animation.base.Animation;
import moscow.rockstar.util.interfaces.IMinecraft;
import moscow.rockstar.util.interfaces.IScaledResolution;
import moscow.rockstar.util.interfaces.Toggleable;

public interface Module extends Toggleable, IMinecraft, IScaledResolution, SettingsContainer {
   void disable();

   void enable();

   void tick();

   ModuleInfo getInfo();

   String getName();

   default String getDescription() {
      String translationKey = "modules.descriptions.%s".formatted(this.getName().toLowerCase().replace(" ", "_"));
      return Localizator.translate(translationKey);
   }

   int getKey();

   ModuleCategory getCategory();

   boolean isEnabled();

   boolean isHidden();

   Animation getKeybindsAnimation();

   void setKey(int var1);

   void setEnabled(boolean var1, boolean var2);
}
