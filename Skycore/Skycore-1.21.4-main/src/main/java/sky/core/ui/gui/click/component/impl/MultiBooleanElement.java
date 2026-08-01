package sky.core.ui.gui.click.component.impl;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.client.util.math.MatrixStack;
import org.lwjgl.glfw.GLFW;
import sky.core.module.setting.BooleanSetting;
import sky.core.module.setting.MultiBooleanSetting;
import sky.core.ui.gui.click.ClickGuiTheme;
import sky.core.ui.gui.click.GuiMath;
import sky.core.ui.gui.click.component.SettingElement;
import sky.core.util.ColorUtil;
import sky.core.util.animation.Animation;
import sky.core.util.render.RenderUtil;
import sky.core.util.render.font.FontManager;
import sky.core.util.render.font.FontRenderer;

public final class MultiBooleanElement extends SettingElement {
    private static final float PADDING = 8.0F;
    private static final float GAP = 2.0F;
    private static final float PILL_HEIGHT = 11.0F;
    private static final float PILL_RADIUS = 5.0F;

    private final MultiBooleanSetting setting;
    private final Map<BooleanSetting, Animation> toggleAnimations = new HashMap<>();
    private final List<PillLayout> pills = new ArrayList<>();

    public MultiBooleanElement(MultiBooleanSetting setting) {
        this.setting = setting;
        for (BooleanSetting option : setting.getOptions()) {
            Animation animation = new Animation();
            if (option.get()) {
                animation.fadeIn(0L);
            }
            this.toggleAnimations.put(option, animation);
        }
    }

    @Override
    public boolean isVisible() {
        return this.setting.isVisible();
    }

    @Override
    public float computeHeight(float width) {
        this.layoutPills(width);
        if (this.pills.isEmpty()) {
            return PILL_HEIGHT + 10.0F;
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

        long enabledCount = this.setting.getOptions().stream()
                .filter(BooleanSetting::isVisible)
                .filter(BooleanSetting::get)
                .count();
        long totalCount = this.setting.getOptions().stream().filter(BooleanSetting::isVisible).count();
        String countText = enabledCount + "/" + totalCount;
        font.draw(
                countText,
                this.x + this.width - PADDING - font.getWidth(countText),
                this.y + 2.0F,
                ColorUtil.withAlpha(theme.getTextDim(), alpha),
                matrices
        );

        this.layoutPills(this.width);

        for (PillLayout pill : this.pills) {
            if (!pill.option.isVisible()) {
                continue;
            }

            Animation animation = this.toggleAnimations.get(pill.option);
            if (pill.option.get()) {
                animation.fadeIn(180L);
            } else {
                animation.fadeOut(180L);
            }
            animation.update();

            float progress = animation.getAlpha();
            Color bgColor = ColorUtil.lerp(theme.getModeOff(), theme.getModeOn(), progress);
            renderer.drawRoundedRect(
                    pill.x,
                    pill.y,
                    pill.width,
                    PILL_HEIGHT,
                    PILL_RADIUS,
                    ColorUtil.withAlpha(bgColor, alpha),
                    matrices
            );

            Color textColor = progress > 0.5F ? Color.WHITE : theme.getTextDim();
            font.draw(
                    pill.label,
                    pill.x + (pill.width - font.getWidth(pill.label)) / 2.0F,
                    pill.y + (PILL_HEIGHT - font.getLineHeight(pill.label)) / 2.0F,
                    ColorUtil.withAlpha(textColor, alpha),
                    matrices
            );
        }

        this.height = this.computeHeight(this.width);
    }

    @Override
    public void mouseClicked(double mouseX, double mouseY, int button) {
        if (!this.isVisible()) {
            return;
        }

        if (button == GLFW.GLFW_MOUSE_BUTTON_RIGHT
                && GuiMath.isHovered(mouseX, mouseY, this.x, this.y, this.width, this.height)) {
            for (BooleanSetting option : this.setting.getOptions()) {
                if (option.isVisible()) {
                    option.reset();
                }
            }
            return;
        }

        if (button != GLFW.GLFW_MOUSE_BUTTON_LEFT) {
            return;
        }

        this.layoutPills(this.width);
        for (PillLayout pill : this.pills) {
            if (!pill.option.isVisible()) {
                continue;
            }
            if (GuiMath.isHovered(mouseX, mouseY, pill.x, pill.y, pill.width, PILL_HEIGHT)) {
                pill.option.set(!pill.option.get());
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

        for (BooleanSetting option : this.setting.getOptions()) {
            if (!option.isVisible()) {
                continue;
            }

            String label = option.getName();
            float pillWidth = font.getWidth(label) + 7.5F;
            if (offsetX + pillWidth > maxRowWidth && offsetX > PADDING) {
                offsetX = PADDING;
                offsetY += PILL_HEIGHT + GAP;
            }

            this.pills.add(new PillLayout(option, label, this.x + offsetX, offsetY, pillWidth));
            offsetX += pillWidth + GAP;
        }
    }

    private record PillLayout(BooleanSetting option, String label, float x, float y, float width) {
    }
}
