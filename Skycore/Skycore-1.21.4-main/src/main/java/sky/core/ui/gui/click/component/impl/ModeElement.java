package sky.core.ui.gui.click.component.impl;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.util.math.MatrixStack;
import org.lwjgl.glfw.GLFW;
import sky.core.util.animation.RectSlideAnimation;
import sky.core.ui.gui.click.ClickGuiTheme;
import sky.core.ui.gui.click.GuiMath;
import sky.core.ui.gui.click.component.SettingElement;
import sky.core.module.setting.ModeSetting;
import sky.core.util.render.RenderUtil;
import sky.core.util.render.font.FontManager;
import sky.core.util.render.font.FontRenderer;
import sky.core.util.ColorUtil;

public final class ModeElement extends SettingElement {
    private static final float PADDING = 8.0F;
    private static final float GAP = 2.0F;
    private static final float PILL_HEIGHT = 11.0F;
    private static final float PILL_RADIUS = 5.0F;

    private final ModeSetting setting;
    private final RectSlideAnimation indicator = new RectSlideAnimation();
    private final List<PillLayout> pills = new ArrayList<>();

    public ModeElement(ModeSetting setting) {
        this.setting = setting;
    }

    @Override
    public boolean isVisible() {
        return this.setting.isVisible();
    }

    @Override
    public float computeHeight(float width) {
        this.layoutPills(width);
        if (this.pills.isEmpty()) {
            return PILL_HEIGHT + 4.0F;
        }
        PillLayout last = this.pills.get(this.pills.size() - 1);
        return last.y + PILL_HEIGHT + 4.0F - this.y;
    }

    @Override
    public void render(RenderUtil renderer, MatrixStack matrices, double mouseX, double mouseY, float alpha) {
        ClickGuiTheme theme = ClickGuiTheme.theme;
        FontRenderer font = FontManager.getRegular(theme.getFontSetting());
        font.draw(
                this.setting.getName(),
                this.x + PADDING,
                this.y + 2.0F,
                ColorUtil.withAlpha(theme.getText(), alpha),
                matrices
        );

        this.layoutPills(this.width);

        PillLayout selected = null;
        for (PillLayout pill : this.pills) {
            renderer.drawRoundedRect(
                    pill.x,
                    pill.y,
                    pill.width,
                    PILL_HEIGHT,
                    PILL_RADIUS,
                    ColorUtil.withAlpha(theme.getModeOff(), alpha),
                    matrices
            );
            if (this.setting.is(pill.mode)) {
                selected = pill;
            }
        }

        if (selected != null) {
            this.indicator.setSelection(this.setting.get(), selected.x, selected.y, selected.width, PILL_HEIGHT);
            this.indicator.update();
            renderer.drawRoundedRect(
                    this.indicator.getX(),
                    this.indicator.getY(),
                    this.indicator.getWidth(),
                    this.indicator.getHeight(),
                    PILL_RADIUS,
                    ColorUtil.withAlpha(theme.getModeOn(), alpha),
                    matrices
            );
        }

        for (PillLayout pill : this.pills) {
            Color textColor = this.setting.is(pill.mode) ? Color.WHITE : theme.getTextDim();
            font.draw(
                    pill.mode,
                    pill.x + (pill.width - font.getWidth(pill.mode)) / 2.0F,
                    pill.y + (PILL_HEIGHT - font.getLineHeight(pill.mode)) / 2.0F,
                    ColorUtil.withAlpha(textColor, alpha),
                    matrices
            );
        }

        this.height = this.computeHeight(this.width);
    }

    @Override
    public void mouseClicked(double mouseX, double mouseY, int button) {
        if (button != GLFW.GLFW_MOUSE_BUTTON_LEFT || !this.isVisible()) {
            return;
        }

        this.layoutPills(this.width);
        for (PillLayout pill : this.pills) {
            if (GuiMath.isHovered(mouseX, mouseY, pill.x, pill.y, pill.width, PILL_HEIGHT)) {
                this.setting.set(pill.mode);
                return;
            }
        }
    }

    private void layoutPills(float width) {
        FontRenderer font = FontManager.getRegular(ClickGuiTheme.theme.getFontSetting());
        this.pills.clear();
        float offsetX = PADDING;
        float offsetY = this.y + font.getLineHeight(this.setting.getName()) + 6.0F;
        float maxRowWidth = width - PADDING * 2.0F;

        for (String mode : this.setting.getModes()) {
            float pillWidth = font.getWidth(mode) + 7.5F;
            if (offsetX + pillWidth > maxRowWidth && offsetX > PADDING) {
                offsetX = PADDING;
                offsetY += PILL_HEIGHT + GAP;
            }

            this.pills.add(new PillLayout(mode, this.x + offsetX, offsetY, pillWidth));
            offsetX += pillWidth + GAP;
        }
    }

    private record PillLayout(String mode, float x, float y, float width) {
    }
}
