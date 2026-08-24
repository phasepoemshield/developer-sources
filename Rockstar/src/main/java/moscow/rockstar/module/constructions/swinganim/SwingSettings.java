package moscow.rockstar.module.constructions.swinganim;

import java.util.ArrayList;
import java.util.List;
import moscow.rockstar.config.Setting;
import moscow.rockstar.config.SettingsContainer;

public class SwingSettings implements SettingsContainer {
   protected final List<Setting> settings = new ArrayList<>();

   @Override
   public List<Setting> getSettings() {
      return this.settings;
   }
}
