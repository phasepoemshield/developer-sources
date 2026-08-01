package sky.core.ui.gui.click.component.impl;

import java.awt.Color;
import net.minecraft.client.util.math.MatrixStack;
import org.lwjgl.glfw.GLFW;
import sky.core.util.animation.Animation;
import sky.core.ui.gui.click.ClickGuiTheme;
import sky.core.ui.gui.click.GuiMath;
import sky.core.ui.gui.click.component.SettingElement;
import sky.core.module.setting.BooleanSetting;
import sky.core.util.render.RenderUtil;
import sky.core.util.render.font.FontManager;
import sky.core.util.render.font.FontRenderer;
import sky.core.util.ColorUtil;

public final class BooleanElement extends SettingElement {
    private static final float ROW_HEIGHT = 20.0F;
    private static final float TOGGLE_WIDTH = 24.0F;
    private static final float TOGGLE_HEIGHT = 12.0F;

    private final BooleanSetting setting;
    private final Animation toggleAnimation = new Animation();

    public BooleanElement(BooleanSetting setting) {
        this.setting = setting;
        this.height = ROW_HEIGHT;
        if (setting.get()) {
            this.toggleAnimation.fadeIn(0L);
        }
    }

    @Override
    public boolean isVisible() {
        return this.setting.isVisible();
    }

    @Override
    public void render(RenderUtil renderer, MatrixStack matrices, double mouseX, double mouseY, float alpha) {
        ClickGuiTheme theme = ClickGuiTheme.theme;
        if (this.setting.get()) {
            this.toggleAnimation.fadeIn(200L);
        } else {
            this.toggleAnimation.fadeOut(200L);
        }
        this.toggleAnimation.update();
        float progress = this.toggleAnimation.getAlpha();

        FontRenderer font = FontManager.getRegular(theme.getFontSetting());
        font.draw(
                this.setting.getName(),
                this.x + 8.0F,
                this.y + (ROW_HEIGHT - font.getLineHeight(this.setting.getName())) / 2.0F,
                ColorUtil.withAlpha(theme.getText(), alpha),
                matrices
        );

        float toggleX = this.x + this.width - TOGGLE_WIDTH - 8.0F;
        float toggleY = this.y + (ROW_HEIGHT - TOGGLE_HEIGHT) / 2.0F;
        Color trackColor = ColorUtil.lerp(theme.getToggleOff(), theme.getToggleOn(), progress);
        renderer.drawRoundedRect(
                toggleX,
                toggleY,
                TOGGLE_WIDTH,
                TOGGLE_HEIGHT,
                10,
                ColorUtil.withAlpha(trackColor, alpha),
                matrices
        );

        float knobSize = TOGGLE_HEIGHT - 4.0F;
        float knobTravel = TOGGLE_WIDTH - knobSize - 4.0F;
        float knobX = toggleX + 2.0F + knobTravel * progress;
        float knobY = toggleY + 2.0F;
        renderer.drawRoundedRect(
                knobX,
                knobY,
                knobSize,
                knobSize,
                7,
                ColorUtil.withAlpha(Color.WHITE, alpha),
                matrices
        );
    }

    @Override
    public void mouseClicked(double mouseX, double mouseY, int button) {
        if (button != GLFW.GLFW_MOUSE_BUTTON_LEFT || !this.isVisible()) {
            return;
        }
        if (GuiMath.isHovered(mouseX, mouseY, this.x, this.y, this.width, ROW_HEIGHT)) {
            this.setting.set(!this.setting.get());
        }
    }
}
