package fun.nexisdlc.ui.hud;

import fun.nexisdlc.client.events.impl.render.EventRender;
import fun.nexisdlc.client.utils.render.drag.DraggingManager;
import fun.nexisdlc.client.utils.render.drag.api.Dragging;
import fun.nexisdlc.ui.hud.api.HudElement;
import fun.nexisdlc.ui.hud.information.InformationBase;
import fun.nexisdlc.ui.hud.information.InformationFirst;
import fun.nexisdlc.ui.hud.information.InformationTwo;

public final class InformationHud implements HudElement {
    public static final String SETTINGS_SCOPE = "Information";

    private final InformationFirst first;
    private final InformationTwo two;

    public InformationHud(Dragging dragging) {
        this.first = new InformationFirst(dragging);
        this.two = new InformationTwo(dragging);
    }

    @Override
    public void render(EventRender.Screen.Hud event) {
        String variant = DraggingManager.getHudMode(SETTINGS_SCOPE, InformationBase.SETTING_VARIANT, InformationBase.VARIANT_DEFAULT);
        if (InformationBase.VARIANT_NEW.equalsIgnoreCase(variant)) {
            two.render(event);
        } else {
            first.render(event);
        }
    }
}
