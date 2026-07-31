package fun.nexisdlc.ui.gui.elements;

import fun.nexisdlc.ClientContainer;
import fun.nexisdlc.Nexis;
import fun.nexisdlc.client.ClientColors;
import fun.nexisdlc.client.utils.math.MathUtil;
import fun.nexisdlc.client.utils.render.CursorHelper;
import fun.nexisdlc.client.utils.render.color.ColorUtils;
import fun.nexisdlc.client.utils.render.main.core.Renderer2D;
import fun.nexisdlc.client.utils.render.main.text.FontRegistry;
import fun.nexisdlc.modules.impl.utils.ClientHide;
import org.lwjgl.glfw.GLFW;

public class SafeModeWidget {
    public static float DEFAULT_WIDTH = 230f;
    public static float DEFAULT_HEIGHT = 40f;

    private static final long TIMER_DURATION = 10000L;
    private static final float TIMER_EXTRA_PADDING = 3f;

    private long timerStartMs = -1;
    private boolean armed = false;

    private float x, y;

    public float width = DEFAULT_WIDTH;
    public float height = DEFAULT_HEIGHT;

    public void draw(Renderer2D render, float x, float y, float alpha) {
        this.x = x;
        this.y = y;

        var font = FontRegistry.SF_SEMIBOLD;
        if (font == null) return;

        long now = System.currentTimeMillis();
        boolean timerRunning = armed && timerStartMs > 0 && (now - timerStartMs) < TIMER_DURATION;

        float extraPadding = timerRunning ? TIMER_EXTRA_PADDING : 0f;
        float drawX = x - extraPadding;
        float drawWidth = width + extraPadding * 2f;

        int bgColor = ColorUtils.multAlpha(
                ClientColors.applyAlpha(ClientColors.BACKGROUND.getRGB(), 0.78f),
                alpha / 255f
        );

        double mX = net.minecraft.client.MinecraftClient.getInstance().mouse.getX();
        double mY = net.minecraft.client.MinecraftClient.getInstance().mouse.getY();

        if (MathUtil.isHovered((float) mX, (float) mY, drawX, y, drawWidth, height)) {
            CursorHelper.setHand();
        }

        float rounding = 11f;

        float alphaProgress = alpha / 255f;
        float shadowExpand = 1.5f;
        float shadowShrink = shadowExpand * 2f;
        int shadowAlpha = (int) (105 * alphaProgress);
        int blackShadow = ColorUtils.rgba(0, 0, 0, shadowAlpha);

        render.gradientShadow(
                drawX + shadowShrink,
                y + shadowShrink,
                drawWidth - shadowShrink * 2f,
                height - shadowShrink * 2f,
                rounding,
                3f,
                shadowExpand,
                blackShadow,
                blackShadow,
                blackShadow,
                blackShadow
        );

        render.blur(drawX, y, drawWidth, height, rounding, alpha / 255f);
        render.rect(drawX, y, drawWidth, height, rounding, bgColor);

        String text;
        int textColor = ColorUtils.rgba(
                255,
                255,
                255,
                (int) MathUtil.clamp(alpha * 0.95f, 0, 255)
        );

        if (timerRunning) {
            long elapsed = now - timerStartMs;
            long remaining = (TIMER_DURATION - elapsed) / 1000 + 1;
            text = "Режим безопасности (" + remaining + ")";
        } else {
            text = "  Режим безопасности  ";
        }

        float textY = y + (height - font.getLineHeight(18f)) / 2f + 17f;
        float textWidth = font.getWidth(text, 18f);
        float textX = drawX + (drawWidth - textWidth) / 2f;

        render.text(font, textX, textY, 18f, text, textColor);
    }

    public boolean mouseClicked(double mouseX, double mouseY, int button) {
        boolean timerRunning = armed
                && timerStartMs > 0
                && (System.currentTimeMillis() - timerStartMs) < TIMER_DURATION;

        float extraPadding = timerRunning ? TIMER_EXTRA_PADDING : 0f;
        float drawX = x - extraPadding;
        float drawWidth = width + extraPadding * 2f;

        boolean inside = mouseX >= drawX
                && mouseX <= drawX + drawWidth
                && mouseY >= y
                && mouseY <= y + height;

        if (!inside || button != GLFW.GLFW_MOUSE_BUTTON_LEFT) {
            return false;
        }

        if (timerRunning) {
            armed = false;
            timerStartMs = -1;
        } else if (ClientContainer.isHide()) {
            ClientHide clientHide = Nexis.getFunctionManager().getClientHide();
            if (clientHide != null) {
                clientHide.restoreHide();
            }
        } else {
            armed = true;
            timerStartMs = System.currentTimeMillis();
        }

        return true;
    }

    public void tick() {
        if (!armed || timerStartMs < 0) return;

        long now = System.currentTimeMillis();

        if ((now - timerStartMs) >= TIMER_DURATION) {
            armed = false;
            timerStartMs = -1;

            ClientHide clientHide = Nexis.getFunctionManager().getClientHide();
            if (clientHide != null) {
                clientHide.applyHide();
            }
        }
    }

    public boolean isArmed() {
        return armed
                && timerStartMs > 0
                && (System.currentTimeMillis() - timerStartMs) < TIMER_DURATION;
    }

    public void setWidth(float w) {
        this.width = w;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }
}