package fun.nexisdlc.ui.hud;

import fun.nexisdlc.client.events.impl.render.EventRender;
import fun.nexisdlc.client.utils.render.drag.DraggingManager;
import fun.nexisdlc.client.utils.render.drag.api.Dragging;
import fun.nexisdlc.ui.hud.api.HudElement;
import fun.nexisdlc.ui.hud.potions.PotionsFirst;
import fun.nexisdlc.ui.hud.potions.PotionsTwo;

public final class Potions implements HudElement {
    public static final String SETTINGS_SCOPE = "Potions";
    public static final String SETTING_ALWAYS_SHOW = "alwaysShow";
    public static final String SETTING_SHOW_EFFECT_ICON = "showEffectIcon";
    public static final String SETTING_GREEN_TEXT = "greenText";
    public static final String SETTING_VARIANT = "variant";
    public static final String VARIANT_DEFAULT = "Дефолт";
    public static final String VARIANT_NEW = "Новый";

    private final PotionsFirst first;
    private final PotionsTwo two;

    public Potions(Dragging dragging) {
        this.first = new PotionsFirst(dragging);
        this.two = new PotionsTwo(dragging);
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
