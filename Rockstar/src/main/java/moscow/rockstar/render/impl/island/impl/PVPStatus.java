package moscow.rockstar.render.impl.island.impl;

import moscow.rockstar.framework.base.CustomDrawContext;
import moscow.rockstar.config.settings.SelectSetting;
import moscow.rockstar.render.impl.island.TimerStatus;
import moscow.rockstar.util.colors.ColorRGBA;
import moscow.rockstar.util.game.server.ServerUtility;

public class PVPStatus extends TimerStatus {
   public PVPStatus(SelectSetting setting) {
      super(setting, "pvp");
   }

   @Override
   public void draw(CustomDrawContext context) {
      this.update("s", ServerUtility.ctTime, "Вы в PVP режиме", new ColorRGBA(185.0F, 28.0F, 28.0F));
      super.draw(context);
   }

   @Override
   public boolean canShow() {
      return ServerUtility.hasCT;
   }
}
