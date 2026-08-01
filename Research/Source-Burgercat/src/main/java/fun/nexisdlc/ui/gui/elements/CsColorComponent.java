package fun.nexisdlc.ui.gui.elements;

import fun.nexisdlc.client.utils.render.CursorHelper;
import fun.nexisdlc.client.utils.render.animations.Easings;
import fun.nexisdlc.client.utils.render.animations.impl.SimpleLinearAnimation;
import fun.nexisdlc.client.utils.render.color.ColorUtils;
import fun.nexisdlc.client.utils.render.main.core.Renderer2D;
import fun.nexisdlc.client.utils.render.main.text.FontRegistry;
import fun.nexisdlc.modules.api.settings.impl.ColorSetting;
import org.lwjgl.glfw.GLFW;

public final class CsColorComponent extends CsSettingComponent<ColorSetting> {
    private final SimpleLinearAnimation pressAnim = new SimpleLinearAnimation(360);
    private final SimpleLinearAnimation colorChangeAnim = new SimpleLinearAnimation(280);
    private int lastColor;
    private long lastChangeMs = 0L;
    private long pressStart = 0L;

    CsColorComponent(ColorSetting setting, float width) {
        super(setting, width, 27f);
        pressAnim.setEasing(Easings.EASE_OUT_CUBIC);
        colorChangeAnim.setEasing(Easings.EASE_OUT_CUBIC);
        lastColor = setting.get();
    }

    @Override
    public void draw(Renderer2D render, float x, float y, int mouseX, int mouseY, int alpha) {
        float rowX = x + ROW_PAD_X;
        float rowW = width - ROW_PAD_X * 2f;
        float rowH = height;
        if (hovered(mouseX, mouseY, rowX, y, rowW, rowH)) hoverAnimation.show();
        else hoverAnimation.hide();

        int color = setting.get();
        if (color != lastColor) {
            lastColor = color;
            lastChangeMs = System.currentTimeMillis();
            colorChangeAnim.setDuration(80);
            colorChangeAnim.show();
            colorChangeAnim.setDuration(280);
        }
        if (System.currentTimeMillis() - lastChangeMs > 120L) colorChangeAnim.hide();
        if (System.currentTimeMillis() - pressStart > 160L) pressAnim.hide();

        int rgb = color & 0xFFFFFF;
        String hex = String.format("#%06X", rgb);

        float chipSize = 12f;
        float chipPad = 10f;
        float hexW = textWidth(hex, chipSize);
        float chipH = 20f;
        float chipW = hexW + chipPad * 2f + 13f;
        float chipX = rowX + rowW - chipW;
        float chipY = y + (rowH - chipH) * 0.5f;

        drawAnimatedSettingText(render, rowX, centeredTextBaseline(y, rowH, 13.5f),
                chipX - rowX - 9f, 13.5f, setting.getName(), withAlpha(COLOR_NAME, alpha));

        boolean chipHov = hovered(mouseX, mouseY, chipX, chipY, chipW, chipH);
        if (chipHov) CursorHelper.setHand();

        float hoverP = hoverAnimation.getProgress();
        float pressP = pressAnim.getProgress();
        float changeP = colorChangeAnim.getProgress();
        float scaleBoost = 1f + 0.05f * hoverP - 0.06f * pressP;
        float ccx = chipX + chipW * 0.5f;
        float ccy = chipY + chipH * 0.5f;
        float cw = chipW * scaleBoost;
        float ch = chipH * scaleBoost;
        float cx = ccx - cw * 0.5f;
        float cy = ccy - ch * 0.5f;

        if (changeP > 0.05f) {
            int glow = ColorUtils.injectAlpha(color, (int) (alpha * 0.35f * changeP));
            float glowRadius = Math.max(0f, ch * 0.5f - 2f) + 3f;
            render.rect(cx - 3f, cy - 3f, cw + 6f, ch + 6f, glowRadius, glow);
        }

        float chipRadius = Math.max(0f, ch * 0.5f - 2f);
        int chipBg = ColorUtils.injectAlpha(color, Math.min(255, (int) (alpha * 0.95f)));
        render.rect(cx, cy, cw, ch, chipRadius, chipBg);
        int chipBorder = withAlpha(0xFFFFFF, (int) (alpha * (0.18f + 0.22f * hoverP)));
        render.rectOutline(cx, cy, cw, ch, chipRadius, chipBorder, 1f);

        float dotR = ch * 0.3f;
        float dotX = cx + chipPad - 1f + dotR;
        float dotY = cy + ch * 0.5f;
        render.circle(dotX, dotY, dotR + changeP * 1.5f, 0f, 1f, withAlpha(0xFFFFFF, (int) (alpha * 0.9f)));
        render.circle(dotX, dotY, dotR - 1.4f, 0f, 1f, ColorUtils.injectAlpha(color, alpha));

        float hexX = dotX + dotR + 7f;
        int textCol = textOnColor(rgb, alpha);
        render.text(FontRegistry.SF_MEDIUM, hexX, centeredTextBaseline(cy, ch, chipSize),
                chipSize, hex, textCol);
    }

    private int textOnColor(int rgb, int alpha) {
        int r = (rgb >> 16) & 0xFF;
        int g = (rgb >> 8) & 0xFF;
        int b = rgb & 0xFF;
        float lum = (0.299f * r + 0.587f * g + 0.114f * b) / 255f;
        return lum > 0.6f ? withAlpha(0x101218, alpha) : withAlpha(0xFFFFFF, alpha);
    }

    @Override
    public void mouseClicked(double mx, double my, int button, float x, float y) {
        if (button != GLFW.GLFW_MOUSE_BUTTON_LEFT) return;
        float rowX = x + ROW_PAD_X;
        float rowW = width - ROW_PAD_X * 2f;
        float rowH = height;

        int color = setting.get();
        int rgb = color & 0xFFFFFF;
        String hex = String.format("#%06X", rgb);
        float chipSize = 12f;
        float chipPad = 10f;
        float hexW = textWidth(hex, chipSize);
        float chipH = 20f;
        float chipW = hexW + chipPad * 2f + 13f;
        float chipX = rowX + rowW - chipW;
        float chipY = y + (rowH - chipH) * 0.5f;

        if (hovered(mx, my, chipX, chipY, chipW, chipH)) {
            CsColorPicker.open(setting, x, y + height + 4f, width);
            pressAnim.setDuration(160);
            pressAnim.show();
            pressAnim.setDuration(360);
            pressStart = System.currentTimeMillis();
        }
    }
}
