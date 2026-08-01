package fun.nexisdlc.ui.gui.elements;

import fun.nexisdlc.client.ClientColors;
import fun.nexisdlc.client.utils.math.MathUtil;
import fun.nexisdlc.client.utils.render.CursorHelper;
import fun.nexisdlc.client.utils.render.color.ColorUtils;
import fun.nexisdlc.client.utils.render.main.core.Renderer2D;
import fun.nexisdlc.client.utils.render.main.text.FontRegistry;
import org.lwjgl.glfw.GLFW;

import java.awt.*;

public class SearchComponent {
    public static float DEFAULT_WIDTH = 50f;
    public static float DEFAULT_HEIGHT = 40f;

    private static final float PADDING = 10f;
    private static final float TEXT_SIZE = 18f;
    private static final long BLINK_INTERVAL = 500;

    private String searchText = "";
    private boolean isFocused = false;
    private long lastBlink = System.currentTimeMillis();
    private boolean showCursor = true;

    private float x, y;
    public float width = DEFAULT_WIDTH;
    public float height = DEFAULT_HEIGHT;

    public void draw(Renderer2D render, float x, float y, float alpha) {
        this.x = x;
        this.y = y;

        if (FontRegistry.SF_MEDIUM == null)
            return;

        int testClr = fun.nexisdlc.client.utils.render.color.basic.ColorUtils.multAlpha(ClientColors.applyAlpha(ClientColors.BACKGROUND.getRGB(), 0.78f), alpha / 255);

        double mX = net.minecraft.client.MinecraftClient.getInstance().mouse.getX();
        double mY = net.minecraft.client.MinecraftClient.getInstance().mouse.getY();
        if (MathUtil.isHovered((float) mX, (float) mY, x, y, width, height)) {
            CursorHelper.setIBeam();
        }

        int textColor = new Color(255, 255, 255, (int) (MathUtil.clamp(alpha * 0.85f, 0, 255))).getRGB();
        int cursorColor = new Color(255, 255, 255, (int) (MathUtil.clamp(alpha * 0.5f, 0, 255))).getRGB();
        int placeholderColor = new Color(150, 150, 150, (int) (MathUtil.clamp(alpha * 0.5f, 0, 255))).getRGB();

        float rounding = 11;

        float alphaProgress = alpha / 255f;
        float shadowExpand = 1.5f;
        float shadowShrink = shadowExpand * 2f;
        int shadowAlpha = (int) (105 * alphaProgress);
        int blackShadow = ColorUtils.rgba(0, 0, 0, shadowAlpha);
        render.gradientShadow(x + shadowShrink, y + shadowShrink, width - shadowShrink * 2f, height - shadowShrink * 2f, rounding, 3f, shadowExpand, blackShadow, blackShadow, blackShadow, blackShadow);

        render.blur(x, y, width, height, rounding, alpha / 255f);
        render.rect(x, y, width, height, rounding, testClr);

        render.pushClipRect((int) x + (int) (PADDING / 2), (int) y, (int) (width - PADDING * 2), (int) height);

        float textY = y + (height - FontRegistry.SF_MEDIUM.getLineHeight(TEXT_SIZE)) / 2f + 17;

        if (searchText.isEmpty() && !isFocused) {
            render.text(FontRegistry.SF_MEDIUM, x + PADDING, textY, TEXT_SIZE, "Поиск", placeholderColor);
        } else {
            render.text(FontRegistry.SF_MEDIUM, x + PADDING, textY, TEXT_SIZE, searchText, textColor);
        }

        if (isFocused) {
            updateCursorBlink();
            if (showCursor) {
                float textWidth = FontRegistry.SF_MEDIUM.getWidth(searchText, TEXT_SIZE);
                float cursorX = x + PADDING + textWidth + 0.5f;
                float cursorY = y + (height - TEXT_SIZE) / 2f;
                render.rect(cursorX, cursorY, 3, TEXT_SIZE, 0f, cursorColor);
            }
        }

        render.popClipRect();
    }

    private void updateCursorBlink() {
        if (System.currentTimeMillis() - lastBlink > BLINK_INTERVAL) {
            showCursor = !showCursor;
            lastBlink = System.currentTimeMillis();
        }
    }

    public boolean mouseClicked(double mouseX, double mouseY, int button) {
        boolean newFocus = mouseX >= x && mouseX <= x + width && mouseY >= y && mouseY <= y + height;
        if (newFocus != isFocused) {
            isFocused = newFocus;
        }
        return isFocused;
    }

    public boolean charTyped(char codePoint) {
        if (!isFocused)
            return false;

        if (!Character.isISOControl(codePoint)) {
            if (searchText.length() < 20) {
                searchText += codePoint;
            }
        }

        return true;
    }

    public boolean keyPressed(int keyCode) {
        if (!isFocused)
            return false;

        if (keyCode == GLFW.GLFW_KEY_BACKSPACE) {
            if (!searchText.isEmpty()) {
                searchText = searchText.substring(0, searchText.length() - 1);
            }
            return true;
        } else if (keyCode == GLFW.GLFW_KEY_ENTER || keyCode == GLFW.GLFW_KEY_KP_ENTER) {
            isFocused = false;
            return true;
        } else if (keyCode == GLFW.GLFW_KEY_ESCAPE) {
            isFocused = false;
            return true;
        }

        return false;
    }

    public String getSearchText() {
        return searchText;
    }

    public boolean isFocused() {
        return isFocused;
    }

    public void clear() {
        searchText = "";
    }

    public void setFocused(boolean focused) {
        isFocused = focused;
    }

    public void setWidth(float w) {
        this.width = w;
    }

    public void resetSize() {
        this.width = DEFAULT_WIDTH;
        this.height = DEFAULT_HEIGHT;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }
}
