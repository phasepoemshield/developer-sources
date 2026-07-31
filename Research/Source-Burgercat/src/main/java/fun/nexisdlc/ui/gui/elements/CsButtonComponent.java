package fun.nexisdlc.ui.gui.elements;

import fun.nexisdlc.client.ClientColors;
import fun.nexisdlc.client.utils.render.CursorHelper;
import fun.nexisdlc.client.utils.render.animations.Easings;
import fun.nexisdlc.client.utils.render.animations.impl.SimpleLinearAnimation;
import fun.nexisdlc.client.utils.render.main.core.Renderer2D;
import fun.nexisdlc.client.utils.render.main.text.FontRegistry;
import fun.nexisdlc.modules.api.settings.impl.ButtonSetting;
import org.lwjgl.glfw.GLFW;

public final class CsButtonComponent extends CsSettingComponent<ButtonSetting> {
    private final SimpleLinearAnimation pressAnim = new SimpleLinearAnimation(360);
    private long rippleStart = -1L;
    private float rippleX, rippleY;
    private static final long RIPPLE_DUR = 480L;

    CsButtonComponent(ButtonSetting setting, float width) {
        super(setting, width, 29f);
        pressAnim.setEasing(Easings.EASE_OUT_CUBIC);
    }

    @Override
    public void draw(Renderer2D render, float x, float y, int mouseX, int mouseY, int alpha) {
        float rowX = x + ROW_PAD_X;
        float rowW = width - ROW_PAD_X * 2f;
        if (hovered(mouseX, mouseY, rowX, y, rowW, height)) {
            CursorHelper.setHand();
            hoverAnimation.show();
        } else {
            hoverAnimation.hide();
        }
        float hp = hoverAnimation.getProgress();
        float pp = pressAnim.getProgress();

        float scaleBoost = 1f + 0.02f * hp - 0.04f * pp;
        float cx = rowX + rowW * 0.5f;
        float cy = y + height * 0.5f;
        float dw = rowW * scaleBoost;
        float dh = height * scaleBoost;
        float dx = cx - dw * 0.5f;
        float dy = cy - dh * 0.5f;

        int bg = blend(withAlpha(0xFFFFFF, (int) (alpha * 0.10f)),
                scaleAlpha(ClientColors.ICON.getRGB(), (int) (alpha * 0.85f)), hp);
        int border = blend(withAlpha(0xFFFFFF, (int) (alpha * 0.16f)),
                scaleAlpha(ClientColors.ICON.getRGB(), (int) (alpha * 0.7f)), hp);
        if (hp > 0.05f) {
            int glow = scaleAlpha(ClientColors.ICON.getRGB(), (int) (alpha * 0.15f * hp));
            render.rect(dx - 2f, dy - 2f, dw + 4f, dh + 4f, 8f, glow);
        }
        render.rect(dx, dy, dw, dh, 7f, bg);
        render.rectOutline(dx, dy, dw, dh, 7f, border, 1f);

        if (rippleStart > 0) {
            long elapsed = System.currentTimeMillis() - rippleStart;
            if (elapsed >= RIPPLE_DUR) {
                rippleStart = -1L;
                pressAnim.hide();
            } else {
                float t = elapsed / (float) RIPPLE_DUR;
                float eased = 1f - (1f - t) * (1f - t);
                float maxR = Math.max(dw, dh) * 0.9f;
                float radius = maxR * eased;
                int rippleAlpha = (int) (alpha * 0.35f * (1f - t));
                if (rippleAlpha > 0) {
                    render.circle(rippleX, rippleY, radius, 0f, 1f,
                            withAlpha(0xFFFFFF, rippleAlpha));
                }
            }
        }

        String label = truncate(setting.getName(), 28);
        int textCol = blend(withAlpha(COLOR_NAME, alpha), withAlpha(0xFFFFFF, alpha), hp);
        render.text(FontRegistry.SF_MEDIUM, dx + (dw - textWidth(label, 13.5f)) * 0.5f,
                centeredTextBaseline(dy, dh, 13.5f), 13.5f, label, textCol);
    }

    @Override
    public void mouseClicked(double mx, double my, int button, float x, float y) {
        if (button == GLFW.GLFW_MOUSE_BUTTON_LEFT
                && hovered(mx, my, x + ROW_PAD_X, y, width - ROW_PAD_X * 2f, height)) {
            setting.press();
            rippleStart = System.currentTimeMillis();
            rippleX = (float) mx;
            rippleY = (float) my;
            pressAnim.setDuration(180);
            pressAnim.show();
            pressAnim.setDuration(360);
        }
    }
}
