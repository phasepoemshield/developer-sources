package sky.core.ui.gui.click.component;

import java.awt.Color;
import java.util.List;
import net.minecraft.client.util.math.MatrixStack;
import org.lwjgl.glfw.GLFW;
import sky.core.util.animation.Animation;
import sky.core.ui.gui.click.ClickGuiTheme;
import sky.core.ui.gui.click.GuiMath;
import sky.core.module.Module;
import sky.core.util.render.RenderUtil;
import sky.core.util.render.font.FontManager;
import sky.core.util.render.font.FontRenderer;
import sky.core.util.ColorUtil;

public final class ModuleCard extends GuiComponent {
    private static final float HEADER_HEIGHT = 28.0F;
    private static final float SETTING_PADDING = 4.0F;

    private final Module module;
    private final List<SettingElement> settings;
    private final Animation expandAnimation = new Animation();
    private final Animation enableAnimation = new Animation();

    private boolean expanded;
    private float layoutY;

    public ModuleCard(Module module) {
        this.module = module;
        this.settings = SettingElements.create(module.getSettings());
        if (module.isEnabled()) {
            this.enableAnimation.fadeIn(0L);
        }
    }

    public Module getModule() {
        return this.module;
    }

    public boolean isExpanded() {
        return this.expanded;
    }

    public float getLayoutY() {
        return this.layoutY;
    }

    public void setLayoutY(float layoutY) {
        this.layoutY = layoutY;
    }

    public void prepareLayout() {
        this.updateAnimations();
        this.height = this.computeTotalHeight();
    }

    @Override
    public void render(RenderUtil renderer, MatrixStack matrices, double mouseX, double mouseY, float alpha) {
        ClickGuiTheme theme = ClickGuiTheme.theme;
        this.updateAnimations();

        float enableProgress = this.enableAnimation.getAlpha();
        Color top = ColorUtil.lerp(theme.getCardTop(), theme.getCardActiveTop(), enableProgress);
        Color bottom = ColorUtil.lerp(theme.getCardBottom(), theme.getCardActiveBottom(), enableProgress);
        top = ColorUtil.withAlpha(top, alpha);
        bottom = ColorUtil.withAlpha(bottom, alpha);

        this.height = this.computeTotalHeight();
        float expandedExtra = this.height - HEADER_HEIGHT;

        renderer.drawVerticalGradientRoundedRect(this.x, this.y, this.width, this.height, theme.getCardRadius(), top, bottom, matrices);

        FontRenderer font = FontManager.getRegular(theme.getFontModule());
        float textY = this.y + (HEADER_HEIGHT - font.getLineHeight(this.module.getName())) / 2.0F;
        float textProgress = Math.max(0.35F, enableProgress) * alpha;
        font.draw(
                this.module.getName(),
                this.x + 10.0F,
                textY,
                ColorUtil.withAlpha(ColorUtil.lerp(theme.getTextDim(), theme.getText(), enableProgress), textProgress),
                matrices
        );

        if (!this.settings.isEmpty()) {
            FontRenderer iconFont = FontManager.getIcons(12);
            String icon = this.expanded ? "\u25BE" : "\u25B8";
            float iconX = this.x + this.width - 14.0F - iconFont.getWidth(icon) / 2.0F;
            float iconY = this.y + (HEADER_HEIGHT - iconFont.getLineHeight(icon)) / 2.0F;
            Color iconColor = ColorUtil.lerp(theme.getTextDim(), theme.getAccent(), enableProgress);
            iconFont.draw(icon, iconX, iconY, ColorUtil.withAlpha(iconColor, alpha), matrices);
        }

        if (expandedExtra > 0.5F) {
            float settingY = this.y + HEADER_HEIGHT + SETTING_PADDING;
            for (SettingElement element : this.settings) {
                if (!element.isVisible()) {
                    continue;
                }
                element.setX(this.x);
                element.setY(settingY);
                element.setWidth(this.width);
                element.render(renderer, matrices, mouseX, mouseY, alpha * this.expandAnimation.getAlpha());
                settingY += element.computeHeight(this.width);
            }
        }
    }

    @Override
    public void mouseClicked(double mouseX, double mouseY, int button) {
        if (GuiMath.isHovered(mouseX, mouseY, this.x, this.y, this.width, HEADER_HEIGHT)) {
            if (button == GLFW.GLFW_MOUSE_BUTTON_LEFT) {
                this.module.toggle();
                return;
            }
            if (button == GLFW.GLFW_MOUSE_BUTTON_RIGHT && !this.settings.isEmpty()) {
                this.expanded = !this.expanded;
                return;
            }
        }

        if (this.expanded && this.expandAnimation.getAlpha() > 0.5F) {
            for (SettingElement element : this.settings) {
                if (element.isVisible()) {
                    element.mouseClicked(mouseX, mouseY, button);
                }
            }
        }
    }

    @Override
    public void mouseReleased(double mouseX, double mouseY, int button) {
        if (this.expanded) {
            for (SettingElement element : this.settings) {
                if (element.isVisible()) {
                    element.mouseReleased(mouseX, mouseY, button);
                }
            }
        }
    }

    @Override
    public void mouseDragged(double mouseX, double mouseY, int button) {
        if (this.expanded) {
            for (SettingElement element : this.settings) {
                if (element.isVisible()) {
                    element.mouseDragged(mouseX, mouseY, button);
                }
            }
        }
    }

    private void updateAnimations() {
        if (this.module.isEnabled()) {
            this.enableAnimation.fadeIn(250L);
        } else {
            this.enableAnimation.fadeOut(250L);
        }
        if (this.expanded) {
            this.expandAnimation.fadeIn(200L);
        } else {
            this.expandAnimation.fadeOut(200L);
        }
        this.enableAnimation.update();
        this.expandAnimation.update();
    }

    private float computeTotalHeight() {
        float settingsHeight = this.getSettingsHeight();
        float expandedExtra = settingsHeight * this.expandAnimation.getAlpha();
        return HEADER_HEIGHT + expandedExtra;
    }

    private float getSettingsHeight() {
        float height = SETTING_PADDING;
        for (SettingElement element : this.settings) {
            if (element.isVisible()) {
                height += element.computeHeight(this.width);
            }
        }
        return height + SETTING_PADDING;
    }
}
