package sky.core.ui.gui.click.theme;

import java.awt.Color;
import net.minecraft.client.util.math.MatrixStack;
import org.lwjgl.glfw.GLFW;
import sky.core.Skycore;
import sky.core.ui.gui.click.ClickGuiTheme;
import sky.core.ui.gui.click.GuiMath;
import sky.core.util.render.RenderUtil;
import sky.core.util.ColorUtil;

public final class ThemeEditor {
    private static final float PANEL_GAP = 6.0F;
    private static final float PANEL_PADDING = 7.0F;
    private static final float SWATCH_SIZE = 10.0F;
    private static final float SWATCH_GAP = 5.0F;
    private static final float SELECTION_OUTLINE = 1.0F;

    public float getPanelWidth() {
        int count = Themes.getAll().size();
        if (count == 0) {
            return 0.0F;
        }
        return PANEL_PADDING * 2.0F
                + count * SWATCH_SIZE
                + (count - 1) * SWATCH_GAP
                + SELECTION_OUTLINE * 2.0F;
    }

    public float getPanelHeight() {
        return PANEL_PADDING * 2.0F + SWATCH_SIZE + SELECTION_OUTLINE * 2.0F;
    }

    public float getPanelRadius() {
        return Math.min(ClickGuiTheme.theme.getPanelRadius(), this.getPanelHeight() / 2.0F);
    }

    public float getSwatchRadius() {
        return SWATCH_SIZE * 0.38F;
    }

    public float getTotalHeight() {
        return PANEL_GAP + this.getPanelHeight();
    }

    public void render(RenderUtil renderer, MatrixStack matrices, float x, float y, float alpha) {
        ClickGuiTheme theme = ClickGuiTheme.theme;
        float width = this.getPanelWidth();
        float height = this.getPanelHeight();

        renderer.drawVerticalGradientRoundedRect(
                x,
                y,
                width,
                height,
                this.getPanelRadius(),
                ColorUtil.withAlpha(theme.getPanelTop(), alpha),
                ColorUtil.withAlpha(theme.getPanelBottom(), alpha),
                matrices
        );

        float cursorX = x + PANEL_PADDING + SELECTION_OUTLINE;
        float swatchY = y + PANEL_PADDING + SELECTION_OUTLINE;
        float swatchRadius = this.getSwatchRadius();
        Theme current = Themes.getCurrent();

        for (Theme palette : Themes.getAll()) {
            boolean selected = palette.getId().equals(current.getId());
            float outline = selected ? SELECTION_OUTLINE : 0.0F;
            float drawX = cursorX - outline;
            float drawY = swatchY - outline;
            float drawSize = SWATCH_SIZE + outline * 2.0F;

            if (selected) {
                renderer.drawRoundedRect(
                        drawX,
                        drawY,
                        drawSize,
                        drawSize,
                        swatchRadius + outline,
                        ColorUtil.withAlpha(Color.WHITE, alpha * 0.85F),
                        matrices
                );
            }

            renderer.drawRoundedRect(
                    cursorX,
                    swatchY,
                    SWATCH_SIZE,
                    SWATCH_SIZE,
                    swatchRadius,
                    ColorUtil.withAlpha(palette.getSwatchColor(), alpha),
                    matrices
            );

            cursorX += SWATCH_SIZE + SWATCH_GAP;
        }
    }

    public boolean mouseClicked(double mouseX, double mouseY, int button, float x, float y) {
        if (button != GLFW.GLFW_MOUSE_BUTTON_LEFT) {
            return false;
        }

        float cursorX = x + PANEL_PADDING + SELECTION_OUTLINE;
        float swatchY = y + PANEL_PADDING + SELECTION_OUTLINE;

        for (Theme palette : Themes.getAll()) {
            if (GuiMath.isHovered(mouseX, mouseY, cursorX, swatchY, SWATCH_SIZE, SWATCH_SIZE)) {
                Themes.apply(palette);
                Skycore.getInstance().getClientConfig().onThemeSelected(palette.getId());
                return true;
            }
            cursorX += SWATCH_SIZE + SWATCH_GAP;
        }

        return false;
    }

    public float getPanelGap() {
        return PANEL_GAP;
    }
}
