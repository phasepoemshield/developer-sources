package fun.nexisdlc.ui.hud.information;

import fun.nexisdlc.client.utils.render.drag.api.Dragging;

public abstract class InformationBase {
    public static final String SETTINGS_SCOPE = "Information";
    public static final String SETTING_VARIANT = "variant";
    public static final String VARIANT_DEFAULT = "Дефолт";
    public static final String VARIANT_NEW = "Новый";
    public static float width;
    public static float height;
    final Dragging dragging;

    protected InformationBase(Dragging dragging) {
        this.dragging = dragging;
    }
}
