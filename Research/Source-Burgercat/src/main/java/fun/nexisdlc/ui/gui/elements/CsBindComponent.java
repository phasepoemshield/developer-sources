package fun.nexisdlc.ui.gui.elements;

import fun.nexisdlc.client.ClientColors;
import fun.nexisdlc.client.utils.player.PlayerUtils;
import fun.nexisdlc.client.utils.render.CursorHelper;
import fun.nexisdlc.client.utils.render.animations.Easings;
import fun.nexisdlc.client.utils.render.animations.impl.SimpleLinearAnimation;
import fun.nexisdlc.client.utils.render.main.core.Renderer2D;
import fun.nexisdlc.client.utils.render.main.text.FontRegistry;
import fun.nexisdlc.modules.api.settings.impl.BindSetting;
import org.lwjgl.glfw.GLFW;

public final class CsBindComponent extends CsSettingComponent<BindSetting> {
    private final SimpleLinearAnimation listenAnim = new SimpleLinearAnimation(200);
    private final SimpleLinearAnimation activeAnim = new SimpleLinearAnimation(220);
    private final SimpleLinearAnimation pressAnim = new SimpleLinearAnimation(320);
    private long pressStart = 0L;

    private boolean isListening() {
        return listeningBindComp == this;
    }

    CsBindComponent(BindSetting setting, float width) {
        super(setting, width, 24f);
        activeAnim.setEasing(Easings.EASE_OUT_BACK);
        pressAnim.setEasing(Easings.EASE_OUT_CUBIC);
        if (hasBind()) activeAnim.show();
    }

    private boolean hasBind() {
        Integer v = setting.get();
        return v != null && v != -1 && v != 0;
    }

    @Override
    public void draw(Renderer2D render, float x, float y, int mouseX, int mouseY, int alpha) {
        boolean listening = isListening();
        if (listening) listenAnim.show();
        else listenAnim.hide();
        boolean active = hasBind();
        if (active || listening) activeAnim.show();
        else activeAnim.hide();

        float rowX = x + ROW_PAD_X;
        float rowW = width - ROW_PAD_X * 2f;
        float rowH = height;

        String keyText = listening ? "..." : PlayerUtils.getBindName(setting.get());
        float keySize = 10.5f;
        float keyW = textWidth(keyText, keySize);
        float boxH = 18f;
        float boxW = Math.max(boxH, keyW + 13f);
        float boxX = rowX + rowW - boxW;
        float boxY = y + (rowH - boxH) * 0.5f;
        if (hovered(mouseX, mouseY, boxX, boxY, boxW, boxH)) {
            CursorHelper.setHand();
            hoverAnimation.show();
        } else {
            hoverAnimation.hide();
        }

        drawAnimatedSettingText(render, rowX, centeredTextBaseline(y, rowH, 13.5f),
                boxX - rowX - 9f, 13.5f, setting.getName(), withAlpha(COLOR_NAME, alpha));

        float p = activeAnim.getProgress();
        float hoverP = hoverAnimation.getProgress();
        float listenP = listenAnim.getProgress();
        float pressP = pressAnim.getProgress();
        if (System.currentTimeMillis() - pressStart > 160L) pressAnim.hide();

        float scaleBoost = 1f + 0.05f * hoverP - 0.06f * pressP;
        float bcx = boxX + boxW * 0.5f;
        float bcy = boxY + boxH * 0.5f;
        float bW = boxW * scaleBoost;
        float bH = boxH * scaleBoost;
        float bX = bcx - bW * 0.5f;
        float bY = bcy - bH * 0.5f;

        int bgOff = withAlpha(0xFFFFFF, (int) (alpha * (0.08f + 0.04f * hoverP)));
        int bgOn = scaleAlpha(ClientColors.ICON.getRGB(), (int) (alpha * 0.95f));
        int borderOff = withAlpha(0xFFFFFF, (int) (alpha * (0.18f + 0.08f * hoverP)));
        int borderOn = scaleAlpha(ClientColors.ICON.getRGB(), alpha);
        int bg = blend(bgOff, bgOn, p);
        int border = blend(borderOff, borderOn, p);
        if (listenP > 0.01f) {
            float pulse = (float) ((Math.sin(System.currentTimeMillis() / 220.0) + 1.0) * 0.5);
            bg = blend(bg, scaleAlpha(ClientColors.ICON.getRGB(), alpha), listenP * (0.4f + 0.3f * pulse));
            int glow = scaleAlpha(ClientColors.ICON.getRGB(), (int) (alpha * 0.3f * listenP * (0.5f + 0.5f * pulse)));
            render.rect(bX - 3f, bY - 3f, bW + 6f, bH + 6f, 7.5f, glow);
        }
        render.rect(bX, bY, bW, bH, 5.5f, bg);
        render.rectOutline(bX, bY, bW, bH, 5.5f, border, 1f);

        int keyColor = (active || listening) ? withAlpha(0xFFFFFF, alpha) : withAlpha(COLOR_SECONDARY, alpha);
        render.text(FontRegistry.SF_MEDIUM, bX + (bW - keyW) * 0.5f,
                centeredTextBaseline(bY, bH, keySize), keySize, keyText, keyColor);
    }

    @Override
    public void mouseClicked(double mx, double my, int button, float x, float y) {
        boolean listening = isListening();
        float rowX = x + ROW_PAD_X;
        float rowW = width - ROW_PAD_X * 2f;
        float rowH = height;
        String keyText = listening ? "..." : PlayerUtils.getBindName(setting.get());
        float keySize = 10.5f;
        float keyW = textWidth(keyText, keySize);
        float boxH = 18f;
        float boxW = Math.max(boxH, keyW + 13f);
        float boxX = rowX + rowW - boxW;
        float boxY = y + (rowH - boxH) * 0.5f;
        if (!hovered(mx, my, boxX, boxY, boxW, boxH)) return;
        pressAnim.setDuration(160);
        pressAnim.show();
        pressAnim.setDuration(320);
        pressStart = System.currentTimeMillis();
        if (button == GLFW.GLFW_MOUSE_BUTTON_LEFT) {
            if (listening) {
                listeningBindComp = null;
            } else {
                listeningBindComp = this;
            }
        } else if (button == GLFW.GLFW_MOUSE_BUTTON_RIGHT && listening) {
            setting.set(1000 + button);
            listeningBindComp = null;
        } else if (button == GLFW.GLFW_MOUSE_BUTTON_MIDDLE) {
            setting.set(setting.getDefaultValue());
            if (listening) listeningBindComp = null;
        }
    }

    @Override
    public void keyPressed(int key) {
        if (!isListening()) return;
        if (key == GLFW.GLFW_KEY_LEFT_SHIFT || key == GLFW.GLFW_KEY_RIGHT_SHIFT
                || key == GLFW.GLFW_KEY_LEFT_CONTROL || key == GLFW.GLFW_KEY_RIGHT_CONTROL
                || key == GLFW.GLFW_KEY_LEFT_ALT || key == GLFW.GLFW_KEY_RIGHT_ALT) return;
        setting.set(key == GLFW.GLFW_KEY_ESCAPE || key == GLFW.GLFW_KEY_DELETE || key == GLFW.GLFW_KEY_BACKSPACE ? -1 : key);
        listeningBindComp = null;
    }
}
