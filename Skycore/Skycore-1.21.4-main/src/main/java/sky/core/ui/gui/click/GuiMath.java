package sky.core.ui.gui.click;

import sky.core.util.render.ScreenScale;

public final class GuiMath {
    private GuiMath() {
    }

    public static float toHudX(double mouseX) {
        return ScreenScale.toHudX(mouseX);
    }

    public static float toHudY(double mouseY) {
        return ScreenScale.toHudY(mouseY);
    }

    public static boolean isHovered(double mouseX, double mouseY, float x, float y, float width, float height) {
        float hudX = toHudX(mouseX);
        float hudY = toHudY(mouseY);
        return hudX >= x && hudX <= x + width && hudY >= y && hudY <= y + height;
    }
}
