package fun.nexisdlc.ui.gui.elements;

import fun.nexisdlc.client.ClientColors;
import fun.nexisdlc.client.utils.render.CursorHelper;
import fun.nexisdlc.client.utils.render.animations.Easings;
import fun.nexisdlc.client.utils.render.animations.impl.SimpleLinearAnimation;
import fun.nexisdlc.client.utils.render.main.core.Renderer2D;
import fun.nexisdlc.client.utils.render.main.text.FontRegistry;
import fun.nexisdlc.modules.api.settings.impl.SliderSetting;
import net.minecraft.client.MinecraftClient;
import org.lwjgl.glfw.GLFW;

public final class CsSliderComponent extends CsSettingComponent<SliderSetting> {
    private double visualPercent;
    private boolean dragging = false;
    private final SimpleLinearAnimation knobHover = new SimpleLinearAnimation(160);
    private final SimpleLinearAnimation dragAnim = new SimpleLinearAnimation(200);
    private final SimpleLinearAnimation valueChangeAnim = new SimpleLinearAnimation(220);
    private float lastValue;
    private long lastChangeMs = 0L;

    CsSliderComponent(SliderSetting setting, float width) {
        super(setting, width, 43f);
        visualPercent = percent();
        lastValue = setting.get();
        knobHover.setEasing(Easings.EASE_OUT_CUBIC);
        dragAnim.setEasing(Easings.EASE_OUT_BACK);
        valueChangeAnim.setEasing(Easings.EASE_OUT_CUBIC);
    }

    @Override
    public void draw(Renderer2D render, float x, float y, int mouseX, int mouseY, int alpha) {
        float target = percent();
        visualPercent += (target - visualPercent) * 0.22;

        float curVal = setting.get();
        if (Math.abs(curVal - lastValue) > 1e-5f) {
            lastValue = curVal;
            lastChangeMs = System.currentTimeMillis();
            valueChangeAnim.setDuration(60);
            valueChangeAnim.show();
            valueChangeAnim.setDuration(220);
        }
        if (System.currentTimeMillis() - lastChangeMs > 80L) valueChangeAnim.hide();
        if (dragging) dragAnim.show();
        else dragAnim.hide();

        float rowX = x + ROW_PAD_X;
        float rowW = width - ROW_PAD_X * 2f;

        String value = formatValue(setting.get());
        float valueSize = 11.5f;
        float valueW = textWidth(value, valueSize);
        float nameSize = 13.5f;

        drawAnimatedSettingText(render, rowX, y + 11.5f, rowW - valueW - 8f, nameSize,
                setting.getName(), withAlpha(COLOR_NAME, alpha));
        render.text(FontRegistry.SF_MEDIUM, rowX + rowW - valueW, y + 11.5f, valueSize, value,
                scaleAlpha(ClientColors.ICON.getRGB(), alpha));

        float barX = rowX;
        float barW = rowW;
        float trackH = 4.5f;
        float barY = y + 23.5f;

        boolean barHover = hovered(mouseX, mouseY, barX, barY - 6f, barW, trackH + 12f);
        if (barHover) {
            CursorHelper.setHResize();
            knobHover.show();
        } else {
            knobHover.hide();
        }

        if (dragging) {
            long handle = MinecraftClient.getInstance().getWindow().getHandle();
            if (GLFW.glfwGetMouseButton(handle, GLFW.GLFW_MOUSE_BUTTON_LEFT) != GLFW.GLFW_PRESS) {
                dragging = false;
            } else {
                setFromMouse(mouseX, barX, barW);
            }
        }

        int trackBg = withAlpha(0xFFFFFF, (int) (alpha * 0.12f));
        render.rect(barX, barY, barW, trackH, trackH * 0.5f, trackBg);
        drawTicks(render, barX, barY, barW, trackH, alpha);
        int fill = scaleAlpha(ClientColors.ICON.getRGB(), (int) (alpha * 0.95f));
        render.rect(barX, barY, barW * (float) visualPercent, trackH, trackH * 0.5f, fill);

        float knobP = knobHover.getProgress();
        float dragP = dragAnim.getProgress();
        float pulseP = valueChangeAnim.getProgress();
        float knobR = 5f + 1.4f * knobP + 0.8f * dragP + 0.6f * pulseP;
        float knobX = barX + barW * (float) visualPercent;
        float knobY = barY + trackH * 0.5f;
        if (pulseP > 0.01f) {
            int glow = scaleAlpha(ClientColors.ICON.getRGB(), (int) (alpha * 0.4f * pulseP));
            render.circle(knobX, knobY, knobR + 4f * pulseP, 0f, 1f, glow);
        }
        render.circle(knobX, knobY, knobR + 1.5f, 0f, 1f, withAlpha(0x000000, (int) (alpha * 0.25f)));
        render.circle(knobX, knobY, knobR, 0f, 1f, withAlpha(0xF5F6FA, alpha));

        float labelY = barY + trackH + 14f;
        float labelSize = 10f;
        int labelCol = withAlpha(COLOR_VALUE, (int) (alpha * 0.85f));
        String minLabel = formatValue(setting.min);
        String midLabel = formatValue((setting.min + setting.max) * 0.5f);
        String maxLabel = formatValue(setting.max);
        render.text(FontRegistry.SF_MEDIUM, barX, labelY, labelSize, minLabel, labelCol);
        float midW = textWidth(midLabel, labelSize);
        render.text(FontRegistry.SF_MEDIUM, barX + barW * 0.5f - midW * 0.5f, labelY, labelSize, midLabel, labelCol);
        float maxW = textWidth(maxLabel, labelSize);
        render.text(FontRegistry.SF_MEDIUM, barX + barW - maxW, labelY, labelSize, maxLabel, labelCol);
    }

    private void drawTicks(Renderer2D render, float barX, float barY, float barW, float trackH, int alpha) {
        if (setting.increment <= 0f) return;
        float range = setting.max - setting.min;
        if (range <= 0f) return;
        int count = (int) Math.round(range / setting.increment);
        if (count <= 0 || count > 60) return;
        int tickCol = withAlpha(0xFFFFFF, (int) (alpha * 0.18f));
        for (int i = 1; i < count; i++) {
            float t = i / (float) count;
            float tx = barX + barW * t;
            render.rect(tx - 0.5f, barY + 1f, 1f, trackH - 2f, 0f, tickCol);
        }
    }

    private String formatValue(float v) {
        if (setting.increment >= 1f) return String.valueOf((int) v);
        return String.format(java.util.Locale.US, "%.2f", v);
    }

    @Override
    public void mouseClicked(double mx, double my, int button, float x, float y) {
        float rowX = x + ROW_PAD_X;
        float rowW = width - ROW_PAD_X * 2f;
        if (!hovered(mx, my, rowX, y, rowW, height)) return;
        if (button == GLFW.GLFW_MOUSE_BUTTON_LEFT) {
            float trackH = 4.5f;
            float barX = rowX;
            float barW = rowW;
            float barY = y + 23.5f;
            if (hovered(mx, my, barX, barY - 6f, barW, trackH + 12f)) {
                dragging = true;
                setFromMouse(mx, barX, barW);
            }
        } else if (button == GLFW.GLFW_MOUSE_BUTTON_MIDDLE) {
            setting.set(setting.getDefaultValue());
        }
    }

    private float percent() {
        return Math.max(0f, Math.min(1f, (setting.get() - setting.min) / (setting.max - setting.min)));
    }

    private void setFromMouse(double mx, float barX, float barW) {
        float p = Math.max(0f, Math.min(1f, (float) ((mx - barX) / barW)));
        float value = setting.min + (setting.max - setting.min) * p;
        if (setting.increment > 0f) value = Math.round(value / setting.increment) * setting.increment;
        setting.set(value);
    }
}
