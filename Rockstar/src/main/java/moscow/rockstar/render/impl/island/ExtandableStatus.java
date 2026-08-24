package moscow.rockstar.render.impl.island;

import moscow.rockstar.config.settings.SelectSetting;

public class ExtandableStatus extends IslandStatus {
   public ExtandableStatus(SelectSetting setting, String name) {
      super(setting, name);
   }

   @Override
   public boolean canShow() {
      return false;
   }
}
