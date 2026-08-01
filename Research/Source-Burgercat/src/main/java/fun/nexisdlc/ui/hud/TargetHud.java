package fun.nexisdlc.ui.hud;

import fun.nexisdlc.client.events.impl.render.EventRender;
import fun.nexisdlc.client.utils.render.drag.DraggingManager;
import fun.nexisdlc.client.utils.render.drag.api.Dragging;
import fun.nexisdlc.ui.hud.api.HudElement;
import fun.nexisdlc.ui.hud.targethud.TargetHudFirst;
import fun.nexisdlc.ui.hud.targethud.TargetHudTwo;

public final class TargetHud implements HudElement {
    public static final String SETTINGS_SCOPE = "TargetHud";
    public static final String SETTING_ADAPTIVE_BAR = "adaptiveBarColor";
    public static final String SETTING_SHOW_ON_HOVER = "showOnHover";
    public static final String SETTING_MODE = "mode";
    public static final String MODE_DEFAULT = "Дефолт";
    public static final String MODE_ROUND = "Кругляш";

    private final TargetHudFirst first;
    private final TargetHudTwo two;

    public TargetHud(Dragging dragging) {
        this.first = new TargetHudFirst(dragging);
        this.two = new TargetHudTwo(dragging);
    }

    @Override
    public void render(EventRender.Screen.Hud event) {
        String mode = DraggingManager.getHudMode(SETTINGS_SCOPE, SETTING_MODE, MODE_DEFAULT);
        if (MODE_ROUND.equalsIgnoreCase(mode)) {
            two.render(event);
        } else {
            first.render(event);
        }
    }
}
