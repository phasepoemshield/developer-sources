package fun.nexisdlc.ui.gui.elements;

import fun.nexisdlc.client.ClientColors;
import fun.nexisdlc.client.utils.math.MathUtil;
import fun.nexisdlc.client.utils.render.CursorHelper;
import fun.nexisdlc.client.utils.render.animations.Easings;
import fun.nexisdlc.client.utils.render.animations.impl.SimpleLinearAnimation;
import fun.nexisdlc.client.utils.render.color.ColorUtils;
import fun.nexisdlc.client.utils.render.main.core.Renderer2D;
import fun.nexisdlc.client.utils.render.main.text.FontRegistry;
import fun.nexisdlc.modules.api.settings.impl.ColorSetting;
import net.minecraft.client.MinecraftClient;
import org.lwjgl.glfw.GLFW;

import java.awt.Color;

public class CsColorPicker {
    private static final float PANEL_W = 220f;
    private static final float PAD = 12f;
    private static final float SV_SIZE = 168f;
    private static final float SLIDER_H = 12f;
    private static final float SLIDER_GAP = 10f;
    private static final float HEX_H = 26f;

    private static final int OPEN_DURATION = 200;
    private static final int CLOSE_DURATION = 250;
    private static final float SCALE_START = 0.3f;

    private static CsColorPicker active = null;

    public static CsColorPicker get() {
        return active;
    }

    public static void open(ColorSetting setting, float anchorX, float anchorY, float anchorW) {
        if (active != null && active.setting == setting && !active.closing) {
            active.close();
            return;
        }
        if (active != null) {
            active = null;
        }
        active = new CsColorPicker(setting, anchorX, anchorY, anchorW);
    }

    public static void closeIfAny() {
        if (active != null) active.close();
    }

    private final ColorSetting setting;
    private final float anchorX;
    private final float anchorY;
    private final float anchorW;
    private final SimpleLinearAnimation alphaAnim = new SimpleLinearAnimation(OPEN_DURATION);
    private final SimpleLinearAnimation scaleAnim = new SimpleLinearAnimation(OPEN_DURATION);
    private boolean closing = false;

    private boolean draggingSv = false;
    private boolean draggingHue = false;
    private boolean draggingAlpha = false;

    private boolean hexFocused = false;
    private String hexText = "";
    private int hexCursor = 0;

    private float panelX;
    private float panelY;
    private float panelH;
    private float svX;
    private float svY;
    private float hueX;
    private float hueY;
    private float hueW;
    private float alphaX;
    private float alphaY;
    private float alphaW;
    private float hexX;
    private float hexY;
    private float hexW;

    private CsColorPicker(ColorSetting setting, float anchorX, float anchorY, float anchorW) {
        this.setting = setting;
        this.anchorX = anchorX;
        this.anchorY = anchorY;
        this.anchorW = anchorW;
        alphaAnim.setEasing(Easings.EASE_OUT_CUBIC);
        scaleAnim.setEasing(Easings.EASE_OUT_BACK);
        alphaAnim.show();
        scaleAnim.show();
        syncHexFromSetting();
    }

    public void close() {
        if (closing) return;
        closing = true;
        alphaAnim.setDuration(CLOSE_DURATION);
        scaleAnim.setDuration(CLOSE_DURATION);
        alphaAnim.setEasing(Easings.EASE_IN_OUT_QUAD);
        scaleAnim.setEasing(Easings.EASE_IN_OUT_QUAD);
        alphaAnim.hide();
        scaleAnim.hide();
    }

    public boolean isClosing() {
        return closing;
    }

    public ColorSetting getSetting() {
        return setting;
    }

    public void draw(Renderer2D r, int mouseX, int mouseY, int alpha) {
        float aProgress = alphaAnim.getProgress();
        float sProgress = scaleAnim.getProgress();

        if (closing && aProgress <= 0.001f) {
            if (active == this) active = null;
            return;
        }

        float alphaF = (alpha / 255f) * aProgress;
        if (alphaF <= 0.001f) return;

        layout();

        if (!hexFocused) syncHexFromSetting();

        float currentScale = SCALE_START + (1f - SCALE_START) * sProgress;
        float cx = panelX + PANEL_W * 0.5f;
        float cy = panelY + panelH * 0.5f;
        r.pushScale(currentScale, cx, cy);

        int pickerAlpha = (int) (255 * alphaF);

        r.rect(panelX, panelY, PANEL_W, panelH, 14f,
                ColorUtils.rgba(16, 18, 26, pickerAlpha));
        r.rectOutline(panelX, panelY, PANEL_W, panelH, 14f,
                ColorUtils.rgba(255, 255, 255, (int) (32 * alphaF)), 1f);

        int hueRgb = Color.HSBtoRGB(setting.getHue(), 1f, 1f);
        int hueOpaque = (hueRgb & 0xFFFFFF) | (pickerAlpha << 24);
        int whiteOpaque = 0xFFFFFF | (pickerAlpha << 24);
        r.gradient(svX, svY, SV_SIZE, SV_SIZE, 8f,
                whiteOpaque, hueOpaque, hueOpaque, whiteOpaque);
        int blackTop = 0;
        int blackBottom = (pickerAlpha << 24);
        r.gradient(svX, svY, SV_SIZE, SV_SIZE, 8f,
                blackTop, blackTop, blackBottom, blackBottom);

        float svMarkerX = svX + setting.getSaturation() * SV_SIZE;
        float svMarkerY = svY + (1f - setting.getValue()) * SV_SIZE;
        r.circle(svMarkerX, svMarkerY, 5.5f, 0f, 1f, ColorUtils.rgba(0, 0, 0, (int) (160 * alphaF)));
        r.circle(svMarkerX, svMarkerY, 4.2f, 0f, 1f, ColorUtils.rgba(255, 255, 255, pickerAlpha));
        int curRgb = Color.HSBtoRGB(setting.getHue(), setting.getSaturation(), setting.getValue());
        r.circle(svMarkerX, svMarkerY, 2.8f, 0f, 1f, (curRgb & 0xFFFFFF) | (pickerAlpha << 24));

        drawHueBar(r, hueX, hueY, hueW, SLIDER_H, pickerAlpha);
        float huePos = hueX + setting.getHue() * hueW;
        r.rect(huePos - 2f, hueY - 3f, 4f, SLIDER_H + 6f, 2f,
                ColorUtils.rgba(0, 0, 0, (int) (160 * alphaF)));
        r.rect(huePos - 1.2f, hueY - 2f, 2.4f, SLIDER_H + 4f, 1.2f,
                ColorUtils.rgba(255, 255, 255, pickerAlpha));

        drawAlphaBar(r, alphaX, alphaY, alphaW, SLIDER_H, pickerAlpha);
        float alphaPos = alphaX + setting.getAlpha() * alphaW;
        r.rect(alphaPos - 2f, alphaY - 3f, 4f, SLIDER_H + 6f, 2f,
                ColorUtils.rgba(0, 0, 0, (int) (160 * alphaF)));
        r.rect(alphaPos - 1.2f, alphaY - 2f, 2.4f, SLIDER_H + 4f, 1.2f,
                ColorUtils.rgba(255, 255, 255, pickerAlpha));

        int hexBg = hexFocused
                ? ColorUtils.injectAlpha(ClientColors.ICON.getRGB(), (int) (50 * alphaF))
                : ColorUtils.rgba(255, 255, 255, (int) (20 * alphaF));
        int hexBorder = hexFocused
                ? ColorUtils.injectAlpha(ClientColors.ICON.getRGB(), (int) (200 * alphaF))
                : ColorUtils.rgba(255, 255, 255, (int) (32 * alphaF));
        r.rect(hexX, hexY, hexW, HEX_H, 7f, hexBg);
        r.rectOutline(hexX, hexY, hexW, HEX_H, 7f, hexBorder, 1f);
        String hexLabel = hexText.isEmpty() ? "#RRGGBB" : hexText;
        int textCol = hexText.isEmpty()
                ? ColorUtils.rgba(140, 142, 150, pickerAlpha)
                : ColorUtils.rgba(235, 237, 244, pickerAlpha);
        r.text(FontRegistry.SF_MEDIUM, hexX + 10f, centeredBaseline(hexY, HEX_H, 12.5f), 12.5f, hexLabel, textCol);

        if (hexFocused) {
            float blink = (float) ((Math.sin(System.currentTimeMillis() / 320.0) + 1.0) * 0.5);
            String left = hexText.substring(0, Math.min(hexCursor, hexText.length()));
            float cxBlink = hexX + 10f + textWidth(left, 12.5f);
            r.rect(cxBlink, hexY + 6f, 1.3f, HEX_H - 12f, 0.6f,
                    ColorUtils.injectAlpha(ClientColors.ICON.getRGB(), (int) (255 * alphaF * (0.4f + 0.6f * blink))));
        }

        float previewSize = HEX_H;
        float previewX = hexX + hexW + 8f;
        int curColor = setting.get();
        r.rect(previewX, hexY, previewSize, previewSize, 7f, scaleA(curColor, alphaF));
        r.rectOutline(previewX, hexY, previewSize, previewSize, 7f,
                ColorUtils.rgba(255, 255, 255, (int) (44 * alphaF)), 1f);

        r.popScale();

        handleHover(mouseX, mouseY);
        handleDragging(mouseX, mouseY);
    }

    private void drawHueBar(Renderer2D r, float x, float y, float w, float h, int alphaByte) {
        float radius = h * 0.5f;
        int segments = 32;
        float segW = w / segments;
        float overlap = 1.5f;
        for (int i = 0; i < segments; i++) {
            float t1 = i / (float) segments;
            float t2 = (i + 1) / (float) segments;
            int c1 = premul((Color.HSBtoRGB(t1, 1f, 1f) & 0xFFFFFF) | (alphaByte << 24));
            int c2 = premul((Color.HSBtoRGB(t2, 1f, 1f) & 0xFFFFFF) | (alphaByte << 24));
            float sx = x + i * segW - (i > 0 ? overlap : 0f);
            float sw = segW + (i > 0 ? overlap : 0f) + (i < segments - 1 ? overlap : 0f);
            float lr = i == 0 ? radius : 0f;
            float rr = i == segments - 1 ? radius : 0f;
            r.gradient(sx, y, sw, h, lr, rr, rr, lr, c1, c2, c2, c1);
        }
    }

    private static int premul(int argb) {
        int a = (argb >>> 24) & 0xFF;
        if (a == 255) return argb;
        if (a == 0) return 0;
        int rr = (argb >>> 16) & 0xFF;
        int gg = (argb >>> 8) & 0xFF;
        int bb = argb & 0xFF;
        rr = (rr * a + 127) / 255;
        gg = (gg * a + 127) / 255;
        bb = (bb * a + 127) / 255;
        return (a << 24) | (rr << 16) | (gg << 8) | bb;
    }

    private void drawAlphaBar(Renderer2D r, float x, float y, float w, float h, int alphaByte) {
        float radius = h * 0.5f;
        r.pushClipRect((int) Math.floor(x), (int) Math.floor(y),
                (int) Math.ceil(w) + 1, (int) Math.ceil(h) + 1);
        r.rect(x, y, w, h, radius, ColorUtils.rgba(190, 192, 200, alphaByte));
        float cell = 4f;
        int cols = (int) Math.ceil(w / cell);
        int rows = (int) Math.ceil(h / cell);
        int darkCol = ColorUtils.rgba(130, 132, 140, alphaByte);
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                if (((i + j) & 1) != 0) continue;
                float xx = x + i * cell;
                float yy = y + j * cell;
                float cw = Math.min(cell, w - i * cell);
                float ch = Math.min(cell, h - j * cell);
                r.rect(xx, yy, cw, ch, 0f, darkCol);
            }
        }
        r.popClipRect();

        int solid = Color.HSBtoRGB(setting.getHue(), setting.getSaturation(), setting.getValue()) & 0xFFFFFF;
        int segments = 32;
        float segW = w / segments;
        float overlap = 1.5f;
        for (int i = 0; i < segments; i++) {
            float t1 = i / (float) segments;
            float t2 = (i + 1) / (float) segments;
            int a1 = (int) (alphaByte * t1);
            int a2 = (int) (alphaByte * t2);
            int c1 = premul(solid | (a1 << 24));
            int c2 = premul(solid | (a2 << 24));
            float sx = x + i * segW - (i > 0 ? overlap : 0f);
            float sw = segW + (i > 0 ? overlap : 0f) + (i < segments - 1 ? overlap : 0f);
            float lr = i == 0 ? radius : 0f;
            float rr = i == segments - 1 ? radius : 0f;
            r.gradient(sx, y, sw, h, lr, rr, rr, lr, c1, c2, c2, c1);
        }
    }

    private void handleHover(int mx, int my) {
        if (MathUtil.isHovered(mx, my, svX, svY, SV_SIZE, SV_SIZE)
                || MathUtil.isHovered(mx, my, hueX, hueY, hueW, SLIDER_H)
                || MathUtil.isHovered(mx, my, alphaX, alphaY, alphaW, SLIDER_H)) {
            CursorHelper.setHand();
        } else if (MathUtil.isHovered(mx, my, hexX, hexY, hexW, HEX_H)) {
            CursorHelper.setIBeam();
        }
    }

    private void handleDragging(int mx, int my) {
        long handle = MinecraftClient.getInstance().getWindow().getHandle();
        boolean leftDown = GLFW.glfwGetMouseButton(handle, GLFW.GLFW_MOUSE_BUTTON_LEFT) == GLFW.GLFW_PRESS;
        if (!leftDown) {
            draggingSv = draggingHue = draggingAlpha = false;
            return;
        }
        if (draggingSv) {
            setting.setSaturation(MathUtil.clamp((mx - svX) / SV_SIZE, 0f, 1f));
            setting.setValue(1f - MathUtil.clamp((my - svY) / SV_SIZE, 0f, 1f));
        } else if (draggingHue) {
            setting.setHue(MathUtil.clamp((mx - hueX) / hueW, 0f, 1f));
        } else if (draggingAlpha) {
            setting.setAlpha(MathUtil.clamp((mx - alphaX) / alphaW, 0f, 1f));
        }
    }

    public boolean mouseClicked(double mx, double my, int button) {
        layout();
        if (button == GLFW.GLFW_MOUSE_BUTTON_LEFT) {
            if (MathUtil.isHovered(mx, my, svX, svY, SV_SIZE, SV_SIZE)) {
                draggingSv = true;
                hexFocused = false;
                setting.setSaturation(MathUtil.clamp((float) ((mx - svX) / SV_SIZE), 0f, 1f));
                setting.setValue(1f - MathUtil.clamp((float) ((my - svY) / SV_SIZE), 0f, 1f));
                return true;
            }
            if (MathUtil.isHovered(mx, my, hueX, hueY - 3f, hueW, SLIDER_H + 6f)) {
                draggingHue = true;
                hexFocused = false;
                setting.setHue(MathUtil.clamp((float) ((mx - hueX) / hueW), 0f, 1f));
                return true;
            }
            if (MathUtil.isHovered(mx, my, alphaX, alphaY - 3f, alphaW, SLIDER_H + 6f)) {
                draggingAlpha = true;
                hexFocused = false;
                setting.setAlpha(MathUtil.clamp((float) ((mx - alphaX) / alphaW), 0f, 1f));
                return true;
            }
            if (MathUtil.isHovered(mx, my, hexX, hexY, hexW, HEX_H)) {
                hexFocused = true;
                syncHexFromSetting();
                hexCursor = hexText.length();
                return true;
            }
        }
        if (MathUtil.isHovered(mx, my, panelX, panelY, PANEL_W, panelH)) {
            return true;
        }
        close();
        return false;
    }

    public void keyPressed(int key) {
        if (!hexFocused) {
            if (key == GLFW.GLFW_KEY_ESCAPE) close();
            return;
        }
        switch (key) {
            case GLFW.GLFW_KEY_LEFT -> hexCursor = Math.max(0, hexCursor - 1);
            case GLFW.GLFW_KEY_RIGHT -> hexCursor = Math.min(hexText.length(), hexCursor + 1);
            case GLFW.GLFW_KEY_HOME -> hexCursor = 0;
            case GLFW.GLFW_KEY_END -> hexCursor = hexText.length();
            case GLFW.GLFW_KEY_BACKSPACE -> {
                if (hexCursor > 0 && !hexText.isEmpty()) {
                    hexText = hexText.substring(0, hexCursor - 1) + hexText.substring(hexCursor);
                    hexCursor--;
                }
            }
            case GLFW.GLFW_KEY_DELETE -> {
                if (hexCursor < hexText.length()) {
                    hexText = hexText.substring(0, hexCursor) + hexText.substring(hexCursor + 1);
                }
            }
            case GLFW.GLFW_KEY_ENTER, GLFW.GLFW_KEY_KP_ENTER -> {
                applyHex();
                hexFocused = false;
            }
            case GLFW.GLFW_KEY_ESCAPE -> hexFocused = false;
            default -> {
            }
        }
    }

    public void charTyped(char c) {
        if (!hexFocused) return;
        if (!isHexChar(c)) return;
        if (hexText.length() >= 9) return;
        hexText = hexText.substring(0, hexCursor) + c + hexText.substring(hexCursor);
        hexCursor++;
    }

    private static boolean isHexChar(char c) {
        return c == '#' || Character.isDigit(c)
                || (c >= 'a' && c <= 'f') || (c >= 'A' && c <= 'F');
    }

    private void layout() {
        panelH = PAD * 2f + SV_SIZE + SLIDER_GAP + SLIDER_H + 8f + SLIDER_H + SLIDER_GAP + HEX_H;
        panelX = anchorX + anchorW - PANEL_W;
        if (panelX < anchorX) panelX = anchorX;
        panelY = anchorY;

        svX = panelX + PAD;
        svY = panelY + PAD;

        hueX = svX;
        hueY = svY + SV_SIZE + SLIDER_GAP;
        hueW = SV_SIZE;

        alphaX = svX;
        alphaY = hueY + SLIDER_H + 8f;
        alphaW = SV_SIZE;

        hexY = alphaY + SLIDER_H + SLIDER_GAP;
        hexX = svX;
        hexW = SV_SIZE - HEX_H - 8f;
    }

    public float getPanelX() { return panelX; }
    public float getPanelY() { return panelY; }
    public float getPanelW() { return PANEL_W; }
    public float getPanelH() { return panelH; }

    private void syncHexFromSetting() {
        int argb = setting.get();
        int rgb = argb & 0xFFFFFF;
        hexText = String.format("#%06X", rgb);
        hexCursor = Math.min(hexCursor, hexText.length());
    }

    private void applyHex() {
        String t = hexText.trim();
        if (t.startsWith("#")) t = t.substring(1);
        if (t.length() != 6 && t.length() != 8) {
            syncHexFromSetting();
            return;
        }
        try {
            long v = Long.parseLong(t, 16);
            int rgb = (int) (v & 0xFFFFFFL);
            if (t.length() == 6) {
                int aByte = (setting.get() >>> 24) & 0xFF;
                setting.set((aByte << 24) | (rgb & 0xFFFFFF));
            } else {
                setting.set((int) v);
            }
            setting.updateHSB();
            syncHexFromSetting();
        } catch (NumberFormatException ignored) {
            syncHexFromSetting();
        }
    }

    private static int scaleA(int argb, float alphaF) {
        int baseA = (argb >>> 24) & 0xFF;
        int finalA = Math.max(0, Math.min(255, (int) (baseA * alphaF)));
        return (finalA << 24) | (argb & 0xFFFFFF);
    }

    private static float centeredBaseline(float y, float h, float textSize) {
        return y + h * 0.5f + textSize * 0.36f;
    }

    private static float textWidth(String text, float size) {
        return text == null || text.isEmpty() ? 0f : FontRegistry.SF_MEDIUM.getWidth(text, size);
    }
}
