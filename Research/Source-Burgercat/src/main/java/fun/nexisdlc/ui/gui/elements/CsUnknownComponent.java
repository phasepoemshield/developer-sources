package fun.nexisdlc.ui.gui.elements;

import fun.nexisdlc.client.utils.render.main.core.Renderer2D;
import fun.nexisdlc.modules.api.settings.api.Setting;

public final class CsUnknownComponent extends CsSettingComponent<Setting<?>> {
    CsUnknownComponent(Setting<?> setting, float width) {
        super(setting, width, 24f);
    }

    @Override
    public void draw(Renderer2D render, float x, float y, int mouseX, int mouseY, int alpha) {
        float rowX = x + ROW_PAD_X;
        float rowW = width - ROW_PAD_X * 2f;
        drawAnimatedSettingText(render, rowX, centeredTextBaseline(y, height, 13.5f),
                rowW, 13.5f, setting.getName(), withAlpha(COLOR_VALUE, alpha));
    }

    @Override
    public void mouseClicked(double mouseX, double mouseY, int button, float x, float y) {
    }
}
