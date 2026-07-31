package fun.nexisdlc.ui.gui.elements;

import fun.nexisdlc.client.ClientColors;
import fun.nexisdlc.client.utils.player.PlayerUtils;
import fun.nexisdlc.client.utils.render.CursorHelper;
import fun.nexisdlc.client.utils.render.animations.Easings;
import fun.nexisdlc.client.utils.render.animations.impl.SimpleLinearAnimation;
import fun.nexisdlc.client.utils.render.main.core.Renderer2D;
import fun.nexisdlc.client.utils.render.main.text.FontRegistry;
import fun.nexisdlc.modules.api.settings.impl.BooleanSetting;
import org.lwjgl.glfw.GLFW;

public final class CsBooleanComponent extends CsSettingComponent<BooleanSetting> {
    private final SimpleLinearAnimation toggleAnim = new SimpleLinearAnimation(390);
    private final SimpleLinearAnimation textColorAnim = new SimpleLinearAnimation(490);
    private final SimpleLinearAnimation listenAnim = new SimpleLinearAnimation(200);
    private final SimpleLinearAnimation pressAnim = new SimpleLinearAnimation(490);
    public final BooleanSetting setting;
    private long lastToggleMs = 0L;

    CsBooleanComponent(BooleanSetting setting, float width) {
        super(setting, width, 28f);
        this.setting = setting;
        toggleAnim.setEasing(Easings.EASE_OUT_BACK);
        pressAnim.setEasing(Easings.EASE_OUT_CUBIC);
        textColorAnim.setEasing(Easings.EASE_OUT_CUBIC);
        if (setting.get()) {
            toggleAnim.show();
            textColorAnim.show();
        }
    }

    @Override
    public void draw(Renderer2D render, float x, float y, int mouseX, int mouseY, int alpha) {
        float rowX = x + ROW_PAD_X;
        float rowW = width - ROW_PAD_X * 2f;
        float rowH = height;
        if (hovered(mouseX, mouseY, rowX, y, rowW, rowH)) hoverAnimation.show();
        else hoverAnimation.hide();
        if (setting.get()) {
            toggleAnim.show();
            textColorAnim.show();
        } else {
            toggleAnim.hide();
            textColorAnim.hide();
        }
        boolean listening = listeningBooleanComp == this;
        if (listening) listenAnim.show();
        else listenAnim.hide();

        float p = toggleAnim.getProgress();
        float hoverP = hoverAnimation.getProgress();
        float pressP = pressAnim.getProgress();
        long sinceToggle = System.currentTimeMillis() - lastToggleMs;
        if (sinceToggle > 160L) pressAnim.hide();

        float scaleBoost = 1f + 0.08f * hoverP - 0.06f * pressP;
        float baseBoxW = 28f;
        float baseBoxH = 22f;
        float baseBoxX = rowX + rowW - baseBoxW;
        float boxW = baseBoxW * scaleBoost;
        float boxH = baseBoxH * scaleBoost;
        float boxX = baseBoxX + (baseBoxW - boxW) * 0.5f;
        float boxY = y + (rowH - boxH) * 0.5f;

        float keyAreaW = 0f;
        float keyAreaX = baseBoxX;
        boolean hasBind = setting.isBound();
        if (hasBind || listening) {
            String keyText = listening ? "..." : PlayerUtils.getBindName(setting.getBind());
            float keySize = 11.5f;
            keyAreaW = textWidth(keyText, keySize) + 13f;
            keyAreaX = boxX - keyAreaW - 9f;
            float keyH = 15.5f;
            float keyY = y + (rowH - keyH) * 0.5f;
            if (hovered(mouseX, mouseY, keyAreaX, keyY, keyAreaW, keyH)) CursorHelper.setHand();
            float listenP = listenAnim.getProgress();
            int bg = blend(withAlpha(0xFFFFFF, (int) (alpha * 0.06f)),
                    scaleAlpha(ClientColors.ICON.getRGB(), (int) (alpha * 0.32f)), listenP);
            render.rect(keyAreaX, keyY, keyAreaW, keyH, 4.5f, bg);
            int keyColor = listening ? withAlpha(0xF5F6FA, alpha) : withAlpha(0xC0C2CB, alpha);
            render.text(FontRegistry.SF_MEDIUM, keyAreaX + 6.5f,
                    centeredTextBaseline(keyY, keyH, keySize), keySize, keyText, keyColor);
        }

        float nameAvail = (hasBind || listening ? keyAreaX : baseBoxX) - rowX - 9f;
        float textColorP = textColorAnim.getProgress();
        int nameColor = blend(withAlpha(COLOR_NAME, alpha),
                scaleAlpha(ClientColors.ICON.getRGB(), alpha), textColorP);
        drawAnimatedSettingText(render, rowX, centeredTextBaseline(y, rowH, 13.5f),
                nameAvail, 13.5f, setting.getName(), nameColor);

        if (hovered(mouseX, mouseY, boxX, boxY, boxW, boxH)) CursorHelper.setHand();

        int bgOff = withAlpha(0xFFFFFF, (int) (alpha * (0.08f + 0.04f * hoverP)));
        int bgOn = scaleAlpha(ClientColors.ICON.getRGB(), (int) (alpha * 0.95f));
        int borderOff = withAlpha(0xFFFFFF, (int) (alpha * (0.18f + 0.08f * hoverP)));
        int borderOn = scaleAlpha(ClientColors.ICON.getRGB(), alpha);
        render.rect(boxX, boxY, boxW, boxH, 6f, blend(bgOff, bgOn, p));
        if (p > 0.02f) {
            drawCheckMark(render, boxX, boxY, boxW, boxH, withAlpha(0xFFFFFF, (int) (alpha * p)), p, 2f);
        }
    }

    @Override
    public void mouseClicked(double mx, double my, int button, float x, float y) {
        float rowX = x + ROW_PAD_X;
        float rowW = width - ROW_PAD_X * 2f;
        float rowH = height;
        boolean hasBind = setting.isBound();
        boolean listening = listeningBooleanComp == this;
        float boxW = 28f;
        float boxH = 22f;
        float boxX = rowX + rowW - boxW;
        float boxY = y + (rowH - boxH) * 0.5f;
        boolean onBox = hovered(mx, my, boxX, boxY, boxW, boxH);
        boolean onKey = false;
        if (hasBind || listening) {
            String keyText = listening ? "..." : PlayerUtils.getBindName(setting.getBind());
            float keySize = 11.5f;
            float keyAreaW = textWidth(keyText, keySize) + 13f;
            float keyAreaX = boxX - keyAreaW - 9f;
            float keyH = 15.5f;
            float keyY = y + (rowH - keyH) * 0.5f;
            onKey = hovered(mx, my, keyAreaX, keyY, keyAreaW, keyH);
        }
        boolean onRow = hovered(mx, my, rowX, y, rowW, rowH);
        if (!onBox && !onKey && !onRow) return;
        if (button == GLFW.GLFW_MOUSE_BUTTON_LEFT) {
            if (onKey) {
                if (listeningBooleanComp == this) listeningBooleanComp = null;
                return;
            }
            if (onBox || onRow) {
                if (listeningBooleanComp == this) listeningBooleanComp = null;
                else {
                    setting.set(!setting.get());
                    lastToggleMs = System.currentTimeMillis();
                    pressAnim.setDuration(200);
                    pressAnim.show();
                    pressAnim.setDuration(490);
                }
            }
        } else if (button == GLFW.GLFW_MOUSE_BUTTON_RIGHT) {
            if (listeningBooleanComp == this) listeningBooleanComp = null;
            else listeningBooleanComp = this;
        } else if (button == GLFW.GLFW_MOUSE_BUTTON_MIDDLE) {
            setting.set(setting.getDefaultValue());
            if (listeningBooleanComp == this) listeningBooleanComp = null;
        }
    }

    @Override
    public void keyPressed(int key) {
        if (listeningBooleanComp != this) return;
        if (key == GLFW.GLFW_KEY_ESCAPE || key == GLFW.GLFW_KEY_DELETE) {
            setting.setBind(-1);
        } else if (key != GLFW.GLFW_KEY_LEFT_SHIFT && key != GLFW.GLFW_KEY_RIGHT_SHIFT
                && key != GLFW.GLFW_KEY_LEFT_CONTROL && key != GLFW.GLFW_KEY_RIGHT_CONTROL
                && key != GLFW.GLFW_KEY_LEFT_ALT && key != GLFW.GLFW_KEY_RIGHT_ALT) {
            setting.setBind(key);
        }
        listeningBooleanComp = null;
    }
}
