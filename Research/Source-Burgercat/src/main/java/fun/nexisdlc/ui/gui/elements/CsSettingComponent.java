package fun.nexisdlc.ui.gui.elements;

import fun.nexisdlc.client.utils.render.animations.Easings;
import fun.nexisdlc.client.utils.render.animations.impl.SimpleLinearAnimation;
import fun.nexisdlc.client.utils.render.color.ColorUtils;
import fun.nexisdlc.client.utils.render.main.core.Renderer2D;
import fun.nexisdlc.client.utils.render.main.text.FontRegistry;
import fun.nexisdlc.modules.api.settings.api.Setting;
import fun.nexisdlc.modules.api.settings.impl.*;

public abstract class CsSettingComponent<T extends Setting<?>> {
    protected final T setting;
    protected float width;
    protected float height;
    protected final SimpleLinearAnimation hoverAnimation = new SimpleLinearAnimation(150);
    protected final SimpleLinearAnimation visibilityAnim = new SimpleLinearAnimation(300);
    protected boolean lastVisible = true;
    protected boolean visibilityInit = false;
    public static boolean suppressVisibilityAnim = false;
    private static int suppressFramesRemaining = 0;

    public static void requestSuppressVisibility(int frames) {
        suppressFramesRemaining = Math.max(suppressFramesRemaining, frames);
        suppressVisibilityAnim = true;
    }

    public static void tickSuppressVisibility() {
        if (suppressFramesRemaining > 0) {
            suppressFramesRemaining--;
            if (suppressFramesRemaining == 0) suppressVisibilityAnim = false;
        }
    }
    private float textOffsetX = 0f;

    private static final float VISIBILITY_SCALE_START = 0.3f;

    public static CsBooleanComponent listeningBooleanComp = null;
    public static CsBindComponent listeningBindComp = null;

    protected static final long MARQUEE_PAUSE_MS = 3000L;
    protected static final float MARQUEE_SPEED_PX_PER_SEC = 28f;
    protected static final float MARQUEE_GAP = 24f;
    protected static final float MARQUEE_SIDE_PADDING = 2f;
    protected static final float MARQUEE_VALUE_GAP = 16f;
    protected static final float ROW_PAD_X = 6f;

    public static final int COLOR_NAME = 0xFFCED0D5;
    public static final int COLOR_VALUE = 0xFF969AA6;
    public static final int COLOR_SECONDARY = 0xFFC8CAD2;

    protected CsSettingComponent(T setting, float width, float height) {
        this.setting = setting;
        this.width = width;
        this.height = height;
    }

    public static CsSettingComponent<?> create(Setting<?> setting, float width) {
        if (setting instanceof BooleanSetting s) return new CsBooleanComponent(s, width);
        if (setting instanceof SliderSetting s) return new CsSliderComponent(s, width);
        if (setting instanceof ModeSetting s) return new CsModeComponent(s, width);
        if (setting instanceof ModeListSetting s) return new CsModeListComponent(s, width);
        if (setting instanceof BindSetting s) return new CsBindComponent(s, width);
        if (setting instanceof ButtonSetting s) return new CsButtonComponent(s, width);
        if (setting instanceof StringSetting s) return new CsStringComponent(s, width);
        if (setting instanceof ColorSetting s) return new CsColorComponent(s, width);
        return new CsUnknownComponent(setting, width);
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public float getVisibilityProgress() {
        boolean vis = setting != null && setting.isVisible();
        if (!visibilityInit) {
            visibilityInit = true;
            lastVisible = vis;
            visibilityAnim.setEasing(Easings.EASE_OUT_BACK);
            visibilityAnim.setImmediate(vis);
        }
        if (vis != lastVisible) {
            lastVisible = vis;
            if (suppressVisibilityAnim) {
                visibilityAnim.setImmediate(vis);
            } else {
                if (vis) {
                    visibilityAnim.setEasing(Easings.EASE_OUT_BACK);
                    visibilityAnim.show();
                } else {
                    visibilityAnim.setEasing(Easings.EASE_IN_OUT_QUAD);
                    visibilityAnim.hide();
                }
            }
        }
        return visibilityAnim.getProgress();
    }

    public float getAnimatedHeight() {
        return height * getVisibilityProgress();
    }

    public boolean shouldRender() {
        return getVisibilityProgress() > 0.001f;
    }

    protected float applyVisibilityTransform(Renderer2D render, float x, float y, int alpha) {
        float p = getVisibilityProgress();
        float scale = VISIBILITY_SCALE_START + (1f - VISIBILITY_SCALE_START) * p;
        float cx = x + width * 0.5f;
        float cy = y + height * 0.5f;
        render.pushScale(scale, cx, cy);
        return p;
    }

    protected void popVisibilityTransform(Renderer2D render) {
        render.popScale();
    }

    protected int scaleAlphaByVisibility(int alpha) {
        return (int) (alpha * getVisibilityProgress());
    }

    public abstract void draw(Renderer2D render, float x, float y, int mouseX, int mouseY, int alpha);

    public abstract void mouseClicked(double mouseX, double mouseY, int button, float x, float y);

    public void drawOverlay(Renderer2D render, float x, float y, int mouseX, int mouseY, int alpha) {
    }

    public boolean mouseClickedOverlay(double mouseX, double mouseY, int button, float x, float y) {
        return false;
    }

    public void keyPressed(int key) {
    }

    public void charTyped(char c) {
    }

    public boolean mouseScrolled(double mouseX, double mouseY, float x, float y) {
        return false;
    }

    protected boolean hovered(double mx, double my, float x, float y, float w, float h) {
        return mx >= x && mx <= x + w && my >= y && my <= y + h;
    }

    protected float textWidth(String text, float size) {
        return text == null || text.isEmpty() ? 0f : FontRegistry.SF_MEDIUM.getWidth(text, size);
    }

    protected float centeredTextBaseline(float y, float boxHeight, float textSize) {
        return y + boxHeight * 0.5f + textSize * 0.36f;
    }

    protected void drawAnimatedSettingText(Renderer2D render, float textX, float baselineY, float availableWidth,
                                           float textSize, String text, int color) {
        float innerWidth = availableWidth - MARQUEE_SIDE_PADDING * 2f;
        if (text == null || text.isEmpty() || innerWidth <= 0f) return;

        float fullWidth = textWidth(text, textSize);
        textOffsetX = fullWidth <= innerWidth ? 0f : -getMarqueeOffset(fullWidth - innerWidth);

        float drawX = textX + MARQUEE_SIDE_PADDING;
        float clipY = baselineY - textSize - 4f;
        float clipH = textSize * 2f;
        render.pushClipRect((int) Math.floor(drawX), (int) Math.floor(clipY),
                (int) Math.ceil(innerWidth), (int) Math.ceil(clipH));
        render.text(FontRegistry.SF_MEDIUM, drawX + textOffsetX, baselineY, textSize, text, color);
        if (fullWidth > innerWidth && textOffsetX < -0.5f) {
            render.text(FontRegistry.SF_MEDIUM, drawX + textOffsetX + fullWidth + MARQUEE_GAP + MARQUEE_SIDE_PADDING,
                    baselineY, textSize, text, color);
        }
        render.popClipRect();
    }

    protected float getMarqueeOffset(float overflow) {
        float travel = overflow + MARQUEE_GAP;
        long animationMs = Math.max(1L, (long) ((travel / MARQUEE_SPEED_PX_PER_SEC) * 1000f));
        long cycle = MARQUEE_PAUSE_MS + animationMs + MARQUEE_PAUSE_MS + animationMs;
        long time = System.currentTimeMillis() % cycle;
        if (time < MARQUEE_PAUSE_MS) return 0f;
        time -= MARQUEE_PAUSE_MS;
        if (time < animationMs) return easeInOut(time / (float) animationMs) * travel;
        time -= animationMs;
        if (time < MARQUEE_PAUSE_MS) return travel;
        time -= MARQUEE_PAUSE_MS;
        return (1f - easeInOut(time / (float) animationMs)) * travel;
    }

    protected float easeInOut(float value) {
        float v = Math.max(0f, Math.min(1f, value));
        return v * v * (3f - 2f * v);
    }

    protected int rgba(int r, int g, int b, int a) {
        return ColorUtils.rgba(r, g, b, Math.max(0, Math.min(255, a)));
    }

    public int withAlpha(int argb, int a) {
        int r = (argb >> 16) & 0xFF;
        int g = (argb >> 8) & 0xFF;
        int b = argb & 0xFF;
        return rgba(r, g, b, a);
    }

    public int scaleAlpha(int argb, int alpha) {
        int baseA = (argb >>> 24) & 0xFF;
        int finalA = (int) (baseA * (alpha / 255f));
        return withAlpha(argb, finalA);
    }

    protected int blend(int from, int to, float progress) {
        return ColorUtils.interpolate(from, to, Math.max(0f, Math.min(1f, progress)));
    }

    protected String truncate(String text, int max) {
        if (text == null) return "";
        return text.length() <= max ? text : text.substring(0, max) + "...";
    }

    protected void drawCheckMark(Renderer2D render, float bx, float by, float size, int color, float scale) {
        drawCheckMark(render, bx, by, size, color, scale, 1f);
    }

    protected void drawCheckMark(Renderer2D render, float bx, float by, float size, int color, float scale, float sizeMul) {
        drawCheckMark(render, bx, by, size, size, color, scale, sizeMul);
    }

    protected void drawCheckMark(Renderer2D render, float bx, float by, float bw, float bh, int color, float scale, float sizeMul) {
        float s = 0.6f + 0.4f * Math.max(0f, Math.min(1f, scale));
        float base = Math.min(bw, bh);
        float arm1 = 1.7f * s * sizeMul;
        float arm2 = 3.8f * s * sizeMul;
        float thick = Math.max(0.7f, base * 0.045f * sizeMul);

        float leftDX = arm1 * 0.85f;
        float leftDY = arm1 * 0.85f;
        float rightDX = arm2 * 0.78f;
        float rightDY = arm2 * 0.95f;

        float pStartX = -leftDX;
        float pStartY = -leftDY;
        float pEndX = rightDX;
        float pEndY = -rightDY;
        float pMidX = 0f;
        float pMidY = 0f;

        float minX = Math.min(Math.min(pStartX, pMidX), pEndX);
        float maxX = Math.max(Math.max(pStartX, pMidX), pEndX);
        float minY = Math.min(Math.min(pStartY, pMidY), pEndY);
        float maxY = Math.max(Math.max(pStartY, pMidY), pEndY);

        float pivotX = bx + bw * 0.5f - (minX + maxX) * 0.5f;
        float pivotY = by + bh * 0.5f - (minY + maxY) * 0.5f;

        int steps = (int) Math.max(10, 14 * sizeMul);
        for (int i = 0; i < steps; i++) {
            float t = i / (float) (steps - 1);
            float lx = pivotX + pStartX + (pMidX - pStartX) * t;
            float ly = pivotY + pStartY + (pMidY - pStartY) * t;
            render.rect(lx - thick * 0.5f, ly - thick * 0.5f, thick, thick, 0f, color);
        }
        for (int i = 0; i < steps; i++) {
            float t = i / (float) (steps - 1);
            float rx = pivotX + pMidX + (pEndX - pMidX) * t;
            float ry = pivotY + pMidY + (pEndY - pMidY) * t;
            render.rect(rx - thick * 0.5f, ry - thick * 0.5f, thick, thick, 0f, color);
        }
    }

    protected record Chip(float x, float y, float w, float h) {
    }
}
