package moscow.rockstar.render.inline.impl;

import moscow.rockstar.Rockstar;
import moscow.rockstar.framework.base.UIContext;
import moscow.rockstar.config.settings.BooleanSetting;
import moscow.rockstar.render.inline.InlineElement;
import moscow.rockstar.render.inline.InlineValue;
import moscow.rockstar.util.game.TextUtility;
import moscow.rockstar.util.game.server.ServerUtility;

public class WorldElement extends InlineElement {
   private final InlineValue cords = new InlineValue(this.elements, "coords");
   private final InlineValue server = new InlineValue(this.elements, "server");
   private final InlineValue tps = new InlineValue(this.elements, "TPS", "TPS");
   private final BooleanSetting shortName = new BooleanSetting(this, "hud.world.compact_server").enable();

   public WorldElement() {
      super("hud.world", "icons/hud/world.png");
   }

   @Override
   public void update(UIContext context) {
      super.update(context);
      this.cords.update(String.format("%s %s %s", Math.round(mc.player.getX()), Math.round(mc.player.getY()), Math.round(mc.player.getZ())));
      this.server.update(ServerUtility.getServerName(this.shortName.isEnabled()), ServerUtility.getIP());
      this.tps.update(TextUtility.formatNumber(Rockstar.getInstance().getTpsHandler().getTPS()).replace(",", ".").replace(".0", ""));
   }
}
