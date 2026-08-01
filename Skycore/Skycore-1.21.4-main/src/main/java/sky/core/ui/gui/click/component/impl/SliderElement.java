package sky.core.ui.gui.click.component.impl;

import java.awt.Color;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.MathHelper;
import org.lwjgl.glfw.GLFW;
import sky.core.ui.gui.click.ClickGuiTheme;
import sky.core.ui.gui.click.GuiMath;
import sky.core.ui.gui.click.component.SettingElement;
import sky.core.module.setting.SliderSetting;
import sky.core.util.ColorUtil;
import sky.core.util.animation.RectSlideAnimation;
import sky.core.util.render.RenderUtil;
import sky.core.util.render.font.FontManager;
import sky.core.util.render.font.FontRenderer;

public final class SliderElement extends SettingElement {
    private static final float ROW_HEIGHT = 30.0F;
    private static final float TRACK_HEIGHT = 5.0F;
    private static final float KNOB_SIZE = 8.0F;

    private final SliderSetting setting;
    private final RectSlideAnimation knobSlide = new RectSlideAnimation();
    private boolean dragging;

    public SliderElement(SliderSetting setting) {
        this.setting = setting;
        this.height = ROW_HEIGHT;
        this.knobSlide.setDuration(180L);
    }

    @Override
    public boolean isVisible() {
        return this.setting.isVisible();
    }

    @Override
    public void render(RenderUtil renderer, MatrixStack matrices, double mouseX, double mouseY, float alpha) {
        if (this.dragging) {
            this.updateValue(mouseX);
        }

        ClickGuiTheme theme = ClickGuiTheme.theme;
        FontRenderer font = FontManager.getRegular(theme.getFontSetting());
        String valueText = String.format("%.2f", this.setting.get()).replaceAll("\\.?0+$", "");
        font.draw(
                this.setting.getName(),
                this.x + 8.0F,
                this.y + 2.0F,
                ColorUtil.withAlpha(theme.getText(), alpha),
                matrices
        );
        font.draw(
                valueText,
                this.x + this.width - 8.0F - font.getWidth(valueText),
                this.y + 2.0F,
                ColorUtil.withAlpha(theme.getTextDim(), alpha),
                matrices
        );

        float trackX = this.x + 8.0F;
        float trackY = this.y + ROW_HEIGHT - 12.0F;
        float trackWidth = this.width - 16.0F;
        renderer.drawRoundedRect(trackX, trackY, trackWidth, TRACK_HEIGHT, 2.5F, ColorUtil.withAlpha(theme.getSliderTrack(), alpha), matrices);

        float progress = (this.setting.get() - this.setting.getMin()) / (this.setting.getMax() - this.setting.getMin());
        float knobX = trackX + (trackWidth - KNOB_SIZE) * progress;
        float knobY = trackY + (TRACK_HEIGHT - KNOB_SIZE) / 2.0F;

        this.knobSlide.setSelection(this.setting.get(), knobX, knobY, KNOB_SIZE, KNOB_SIZE);
        this.knobSlide.update();

        float animatedFillWidth = Math.max(TRACK_HEIGHT, this.knobSlide.getX() + KNOB_SIZE / 2.0F - trackX);
        renderer.drawRoundedRect(
                trackX,
                trackY,
                animatedFillWidth,
                TRACK_HEIGHT,
                2.5F,
                ColorUtil.withAlpha(theme.getSliderFill(), alpha),
                matrices
        );
        renderer.drawRoundedRect(
                this.knobSlide.getX(),
                this.knobSlide.getY(),
                this.knobSlide.getWidth(),
                this.knobSlide.getHeight(),
                KNOB_SIZE / 2.0F,
                ColorUtil.withAlpha(Color.WHITE, alpha),
                matrices
        );
    }

    @Override
    public void mouseClicked(double mouseX, double mouseY, int button) {
        if (button != GLFW.GLFW_MOUSE_BUTTON_LEFT || !this.isVisible()) {
            return;
        }
        float trackX = this.x + 8.0F;
        float trackY = this.y + ROW_HEIGHT - 14.0F;
        float trackWidth = this.width - 16.0F;
        if (GuiMath.isHovered(mouseX, mouseY, trackX, trackY, trackWidth, 14.0F)) {
            this.dragging = true;
            this.updateValue(mouseX);
        }
    }

    @Override
    public void mouseReleased(double mouseX, double mouseY, int button) {
        if (button == GLFW.GLFW_MOUSE_BUTTON_LEFT) {
            this.dragging = false;
        }
    }

    @Override
    public void mouseDragged(double mouseX, double mouseY, int button) {
        if (this.dragging && button == GLFW.GLFW_MOUSE_BUTTON_LEFT) {
            this.updateValue(mouseX);
        }
    }

    private void updateValue(double mouseX) {
        float trackX = this.x + 8.0F;
        float trackWidth = this.width - 16.0F;
        float hudX = GuiMath.toHudX(mouseX);
        float progress = MathHelper.clamp((hudX - trackX) / trackWidth, 0.0F, 1.0F);
        float value = this.setting.getMin() + (this.setting.getMax() - this.setting.getMin()) * progress;
        this.setting.setClamped(value);
    }
}
