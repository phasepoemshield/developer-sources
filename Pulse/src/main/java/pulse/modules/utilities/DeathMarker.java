package pulse.modules.utilities;

import java.awt.Color;
import meteordevelopment.orbit.EventHandler;
import pulse.markers.MapMarker;
import pulse.module.ClientModule;
import pulse.module.ModuleCategory;
import pulse.module.ModuleInfo;
import pulse.settings.BooleanSetting;
import pulse.settings.ModeSetting;
import pulse.settings.StringSetting;
import pulse.events.PlayerDeathEvent;
import pulse.markers.MarkerManager;

@ModuleInfo(a = "Death Marker", b = "Автоматически ставит метку на место смерти.", c = ModuleCategory.UTILITIES)
public class DeathMarker extends ClientModule {
    private final BooleanSetting keepPrevious = new BooleanSetting("Keep Previous", false);
    private final ModeSetting color = new ModeSetting("Color", new String[]{"Red", "White", "Yellow", "Cyan"}, "Red");
    private final StringSetting label = new StringSetting("Label", "Death");

    public DeathMarker() {
        collectSettings();
    }

    @EventHandler
    public void onDeath(PlayerDeathEvent playerDeathEvent) {
        Color color;
        if (c.player == null || playerDeathEvent.player() != c.player) {
            return;
        }
        int iX = (int) playerDeathEvent.x();
        int iY = (int) playerDeathEvent.y();
        int iZ = (int) playerDeathEvent.z();
        if (!this.keepPrevious.get()) {
            MarkerManager.a().stream().filter((v0) -> {
                return v0.h();
            }).forEach(MarkerManager::b);
        }
        switch (this.color.d()) {
            case "White":
                color = new Color(255, 255, 255);
                break;
            case "Yellow":
                color = new Color(255, 220, 50);
                break;
            case "Cyan":
                color = new Color(50, 220, 255);
                break;
            default:
                color = new Color(220, 50, 50);
                break;
        }
        MarkerManager.a(new MapMarker(this.label.get().isBlank() ? "Death" : this.label.get(), iX, iY, iZ, color, MapMarker.Icon.DEATH));
    }
}
