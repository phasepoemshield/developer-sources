package fun.nexisdlc.ui.hud;

import fun.nexisdlc.client.events.impl.render.EventRender;
import fun.nexisdlc.client.utils.render.drag.DraggingManager;
import fun.nexisdlc.client.utils.render.drag.api.Dragging;
import fun.nexisdlc.ui.hud.api.HudElement;
import fun.nexisdlc.ui.hud.bounditems.BoundItemsFirst;
import fun.nexisdlc.ui.hud.bounditems.BoundItemsTwo;

public final class BoundItemsHud implements HudElement {
    public static final String SETTINGS_SCOPE = "BoundItems";
    public static final String SETTING_VARIANT = "variant";
    public static final String VARIANT_DEFAULT = "Дефолт";
    public static final String VARIANT_NEW = "Новый";

    private final BoundItemsFirst first;
    private final BoundItemsTwo two;

    public BoundItemsHud(Dragging dragging) {
        this.first = new BoundItemsFirst(dragging);
        this.two = new BoundItemsTwo(dragging);
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
