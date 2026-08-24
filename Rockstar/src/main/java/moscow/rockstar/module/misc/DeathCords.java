package moscow.rockstar.module.misc;

import moscow.rockstar.Rockstar;
import moscow.rockstar.systems.event.EventListener;
import moscow.rockstar.systems.event.impl.player.ClientPlayerTickEvent;
import moscow.rockstar.module.api.ModuleCategory;
import moscow.rockstar.module.api.ModuleInfo;
import moscow.rockstar.module.impl.BaseModule;
import moscow.rockstar.config.settings.BooleanSetting;
import moscow.rockstar.systems.waypoints.WayPointsManager;
import moscow.rockstar.util.game.MessageUtility;
import net.minecraft.client.gui.screen.DeathScreen;
import net.minecraft.text.Text;
@ModuleInfo(name = "Death Cords", category = ModuleCategory.OTHER, desc = "Отправляет координаты смерти в чат")
public class DeathCords extends BaseModule {
   private boolean death;
   private final BooleanSetting wayDeath = new BooleanSetting(this, "Ставить метку");
   private final EventListener<ClientPlayerTickEvent> onUpdateEvent = event -> {
      if (!(mc.currentScreen instanceof DeathScreen) || mc.player == null) {
         this.death = true;
      } else if (this.death) {
         int xCord = (int)mc.player.getX();
         int yCord = (int)mc.player.getY();
         int zCord = (int)mc.player.getZ();
         MessageUtility.info(Text.of("Координаты смерти: " + xCord + " " + yCord + " " + zCord));
         if (this.wayDeath.isEnabled()) {
            WayPointsManager wayPointsManager = Rockstar.getInstance().getWayPointsManager();
            if (wayPointsManager.contains("Death")) {
               wayPointsManager.del("Death");
            }

            wayPointsManager.add("Death", xCord, yCord, zCord);
         }

         this.death = false;
      }
   };
}
