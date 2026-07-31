package fun.nexisdlc.ui.hud;

import fun.nexisdlc.client.events.impl.render.EventRender;
import fun.nexisdlc.client.utils.render.drag.DraggingManager;
import fun.nexisdlc.client.utils.render.drag.api.Dragging;
import fun.nexisdlc.ui.hud.api.HudElement;
import fun.nexisdlc.ui.hud.stafflist.StaffListFirst;
import fun.nexisdlc.ui.hud.stafflist.StaffListTwo;

public final class StaffList implements HudElement {
    public static final String SETTINGS_SCOPE = "StaffList";
    public static final String SETTING_ALWAYS_SHOW = "alwaysShow";
    public static final String SETTING_VARIANT = "variant";
    public static final String VARIANT_DEFAULT = "Дефолт";
    public static final String VARIANT_NEW = "Новый";

    private final StaffListFirst first;
    private final StaffListTwo two;

    public StaffList(Dragging dragging) {
        this.first = new StaffListFirst(dragging);
        this.two = new StaffListTwo(dragging);
    }

    @Override
    public void render(EventRender.Screen.Hud event) {
        String variant = DraggingManager.getHudMode(SETTINGS_SCOPE, SETTING_VARIANT, VARIANT_DEFAULT);
        if (VARIANT_NEW.equalsIgnoreCase(variant)) {
            two.render(event);
        } else {
            first.render(event);
        }
    }
}
