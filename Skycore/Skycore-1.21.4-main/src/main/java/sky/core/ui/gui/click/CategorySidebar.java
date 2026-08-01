package sky.core.ui.gui.click;

import java.awt.Color;
import net.minecraft.client.util.math.MatrixStack;
import org.lwjgl.glfw.GLFW;
import sky.core.util.animation.RectSlideAnimation;
import sky.core.module.Category;
import sky.core.util.render.RenderUtil;
import sky.core.util.ColorUtil;

public final class CategorySidebar {
    private static final float SLOT_SIZE = 24.0F;
    private static final float SLOT_GAP = 4.0F;
    private static final float PANEL_PADDING = 10.0F;
    private Category selectedCategory = Category.VISUALS;
    private final RectSlideAnimation indicator = new RectSlideAnimation();

    public Category getSelectedCategory() {
        return this.selectedCategory;
    }

    public void render(RenderUtil renderer, MatrixStack matrices, float x, float y, float width, float height, float alpha) {
        ClickGuiTheme theme = ClickGuiTheme.theme;

        renderer.drawVerticalGradientRoundedRect(
                x,
                y,
                width,
                height,
                theme.getPanelRadius(),
                theme.getPanelTop(),
                theme.getPanelBottom(),
                matrices
        );

        float cursorY = y + PANEL_PADDING;
        float slotX = x + (width - SLOT_SIZE) / 2.0F;
        float selectedY = cursorY;

        for (Category category : Category.values()) {
            if (category == this.selectedCategory) {
                selectedY = cursorY;
                break;
            }
            cursorY += SLOT_SIZE + SLOT_GAP;
        }

        this.indicator.setSelection(this.selectedCategory, slotX, selectedY, SLOT_SIZE, SLOT_SIZE);
        this.indicator.update();
        renderer.drawRoundedRect(
                this.indicator.getX(),
                this.indicator.getY(),
                this.indicator.getWidth(),
                this.indicator.getHeight(),
                8.0F,
                ColorUtil.withAlpha(theme.getAccent(), alpha),
                matrices
        );

        cursorY = y + PANEL_PADDING;
        for (Category category : Category.values()) {
            float iconCenterX = slotX + SLOT_SIZE / 2.0F;
            float iconCenterY = cursorY + SLOT_SIZE / 2.0F;
            renderer.drawTextureNative(
                    category.getTexture(),
                    iconCenterX,
                    iconCenterY,
                    ColorUtil.withAlpha(Color.WHITE, alpha),
                    matrices
            );
            cursorY += SLOT_SIZE + SLOT_GAP;
        }
    }

    public boolean mouseClicked(double mouseX, double mouseY, int button, float x, float y, float width, float height) {
        if (button != GLFW.GLFW_MOUSE_BUTTON_LEFT) {
            return false;
        }

        float cursorY = y + PANEL_PADDING;
        float slotX = x + (width - SLOT_SIZE) / 2.0F;

        for (Category category : Category.values()) {
            if (GuiMath.isHovered(mouseX, mouseY, slotX, cursorY, SLOT_SIZE, SLOT_SIZE)) {
                this.selectedCategory = category;
                return true;
            }
            cursorY += SLOT_SIZE + SLOT_GAP;
        }
        return false;
    }
}
