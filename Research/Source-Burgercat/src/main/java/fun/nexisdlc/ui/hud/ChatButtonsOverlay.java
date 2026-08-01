package fun.nexisdlc.ui.hud;

import fun.nexisdlc.ClientContainer;
import fun.nexisdlc.client.events.impl.render.EventRender;
import fun.nexisdlc.client.utils.client.IMinecraft;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.client.utils.render.animations.impl.SimpleLinearAnimation;
import fun.nexisdlc.client.utils.render.drag.DraggingManager;
import fun.nexisdlc.client.utils.render.drag.api.Dragging;
import fun.nexisdlc.client.utils.render.drag.api.GridLine;
import fun.nexisdlc.client.utils.render.main.core.Renderer2D;
import fun.nexisdlc.client.utils.render.main.text.FontRegistry;
import fun.nexisdlc.modules.impl.render.Interface;
import fun.nexisdlc.modules.impl.render.Notifications;
import net.minecraft.client.gui.screen.ChatScreen;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class ChatButtonsOverlay implements IMinecraft {
    public static final String HIDE_LABEL = "Скрыть информацию";
    public static final String RESET_LABEL = "Сбросить позиции";
    private static final String HUD_HINT_LABEL = "ПКМ → Настройки";
    private static final float TEXT_SIZE = 9;
    private static final float ROUNDING = 5f;
    private static final float OUTLINE_PAD = 8f;
    private static final long SHIMMER_CYCLE_MS = 1200L;
    private static final float SHIMMER_BAND_RATIO = 0.8f;

    private final SimpleLinearAnimation hideAnim = new SimpleLinearAnimation(180);
    private final Map<String, Float> outlineAlpha = new HashMap<>();
    private final Map<String, Float> hoverAlpha = new HashMap<>();
    private long lastHintTime = 0L;
    private String lastHintElement = null;

    @EventHandler
    public void onRender(EventRender.Screen.Gui event) {
        if (!(mc.currentScreen instanceof ChatScreen) || ClientContainer.isHide()) {
            return;
        }

        int hideX = ChatOverlayState.hideBtnX;
        int hideY = ChatOverlayState.hideBtnY;
        int hideW = ChatOverlayState.hideBtnW;
        int hideH = ChatOverlayState.hideBtnH;
        int resetX = ChatOverlayState.resetBtnX;
        int resetY = ChatOverlayState.resetBtnY;
        int resetW = ChatOverlayState.resetBtnW;
        int resetH = ChatOverlayState.resetBtnH;

        if (hideW <= 0 || hideH <= 0 || resetW <= 0 || resetH <= 0) {
            return;
        }

        float hideXf = hideX;
        float hideYf = hideY;
        float hideWf = hideW;
        float hideHf = hideH;
        float resetXf = resetX;
        float resetYf = resetY;
        float resetWf = resetW;
        float resetHf = resetH;
        float scale = (float) mc.getWindow().getScaleFactor();
        float textSize = TEXT_SIZE * scale;
        float rounding = Interface.getHudRounding(ROUNDING * scale);

        boolean hideEnabled = ChatOverlayState.hideChatInfo;
        if (hideEnabled) {
            hideAnim.show();
        } else {
            hideAnim.hide();
        }
        float p = hideAnim.getProgress();

        Renderer2D render = event.getRenderer();
        int hideBg = lerpColor(0xFF0F0F0F, 0xFF1B1B1B, p);
        int resetBg = 0xFF0F0F0F;
        int hideText = lerpColor(0xFFC8C8C8, 0xFFFFFFFF, p);

        render.rect(hideXf, hideYf, hideWf, hideHf, rounding, hideBg);
        render.rect(resetXf, resetYf, resetWf, resetHf, rounding, resetBg);

        var hideMetrics = render.measureText(FontRegistry.SF_SEMIBOLD, HIDE_LABEL, textSize);
        var resetMetrics = render.measureText(FontRegistry.SF_SEMIBOLD, RESET_LABEL, textSize);
        float hideTextX = hideXf + (hideWf - hideMetrics.width) * 0.5f;
        float hideTextY = centeredTextY(hideYf, hideHf, textSize);
        float resetTextX = resetXf + (resetWf - resetMetrics.width) * 0.5f;
        float resetTextY = centeredTextY(resetYf, resetHf, textSize);
        render.text(FontRegistry.SF_SEMIBOLD, hideTextX, hideTextY, textSize, HIDE_LABEL, hideText);
        render.text(FontRegistry.SF_SEMIBOLD, resetTextX, resetTextY, textSize, RESET_LABEL, 0xFFFFFFFF);

        if (ChatOverlayState.draggingAny) {
            float gridSize = Interface.getHudEditorGridSize();
            if (Interface.isHudEditorGridEnabled() && Float.isFinite(gridSize) && gridSize >= 2f) {
                int w = mc.getWindow().getWidth();
                int h = mc.getWindow().getHeight();
                float majorStep = gridSize * 5f;
                int minor = new Color(255, 255, 255, 18).getRGB();
                int major = new Color(255, 255, 255, 34).getRGB();
                for (float x = 0; x <= w; x += gridSize) {
                    boolean isMajor = majorStep > 0f && (Math.round(x) % Math.round(majorStep) == 0);
                    render.rect(x, 0, 1, h, 0, isMajor ? major : minor);
                }
                for (float y = 0; y <= h; y += gridSize) {
                    boolean isMajor = majorStep > 0f && (Math.round(y) % Math.round(majorStep) == 0);
                    render.rect(0, y, w, 1, 0, isMajor ? major : minor);
                }
            }

            for (GridLine line : DraggingManager.getActiveGridLines()) {
                if (line == null || !line.isActive()) {
                    continue;
                }
                int lineColor = Color.WHITE.getRGB();
                if (line.getType() == GridLine.Type.VERTICAL) {
                    render.rect(line.getPos(), 0, 1, mc.getWindow().getHeight(), 0, lineColor);
                } else {
                    render.rect(0, line.getPos(), mc.getWindow().getWidth(), 1, 0, lineColor);
                }
            }

            if (Interface.isHudEditorOutlineEnabled()) {
                float thickness = Math.max(1f, Interface.getHudEditorOutlineThickness());
                float roundingOutline = Interface.getHudRounding(7f * scale);
                String hoveredName = ChatOverlayState.hoveredElementName;
                for (Dragging dragging : DraggingManager.draggables.values()) {
                    if (dragging == null) {
                        continue;
                    }
                    String key = dragging.getName();

                    // Drag outline alpha
                    float dragAlpha = outlineAlpha.getOrDefault(key, 0f);
                    float dragTarget = dragging.isDragging() ? 1f : 0f;
                    dragAlpha += (dragTarget - dragAlpha) * 0.08f;
                    if (dragAlpha <= 0.01f && dragTarget == 0f) {
                        outlineAlpha.remove(key);
                    } else {
                        outlineAlpha.put(key, dragAlpha);
                    }

                    // Hover outline alpha
                    float hovAlpha = hoverAlpha.getOrDefault(key, 0f);
                    boolean isHovered = key.equals(hoveredName) && !dragging.isDragging();
                    float hovTarget = isHovered ? 1f : 0f;
                    hovAlpha += (hovTarget - hovAlpha) * 0.12f;
                    if (hovAlpha <= 0.01f && hovTarget == 0f) {
                        hoverAlpha.remove(key);
                    } else {
                        hoverAlpha.put(key, hovAlpha);
                    }

                    float combinedAlpha = Math.max(dragAlpha, hovAlpha);
                    if (combinedAlpha <= 0.01f) {
                        continue;
                    }

                    if (Notifications.SETTINGS_SCOPE.equals(dragging.getName())) {
                        continue;
                    }
                    if (!dragging.getModule().isState()) {
                        continue;
                    }
                    float w = dragging.getWidth();
                    float h = dragging.getHeight();
                    if (!(w > 0f) || !(h > 0f)) {
                        continue;
                    }
                    float ex = dragging.getX() - OUTLINE_PAD;
                    float ey = dragging.getY() - OUTLINE_PAD;
                    float ew = w + OUTLINE_PAD * 2f;
                    float eh = h + OUTLINE_PAD * 2f;

                    int outlineColor = ((Math.round(255f * combinedAlpha) & 0xFF) << 24) | 0xFFFFFF;
                    render.rectOutline(ex, ey, ew, eh, roundingOutline, outlineColor, thickness);

                    // Shimmer sweep animation when dragging
                    if (dragging.isDragging() && dragAlpha > 0.3f) {
                        renderShimmer(render, ex, ey, ew, eh, roundingOutline, dragAlpha);
                    }
                }
            }
        }

        if (ChatOverlayState.barVisible) {
            render.rect(ChatOverlayState.barX, ChatOverlayState.barY,
                    ChatOverlayState.barW, ChatOverlayState.barH, 0, 0xFF000000);
        }

        // Hover hint — only when hovering an element and not dragging
        String hoveredName = ChatOverlayState.hoveredElementName;
        if (hoveredName != null && !ChatOverlayState.draggingAny) {
            Dragging hovered = DraggingManager.draggables.get(hoveredName);
            if (hovered != null && hovered.getModule().isState() && hovered.getWidth() > 0 && hovered.getHeight() > 0) {
                if (!hoveredName.equals(lastHintElement)) {
                    lastHintTime = System.currentTimeMillis();
                    lastHintElement = hoveredName;
                }
                float hoverAge = Math.min(1f, (System.currentTimeMillis() - lastHintTime) / 200f);
                int hintTextColor = ((Math.round(220f * hoverAge) & 0xFF) << 24) | 0xFFFFFF;
                float hintSizeHint = 13f * scale;
                float hintW2 = render.measureText(FontRegistry.SF_SEMIBOLD, HUD_HINT_LABEL, hintSizeHint).width;
                float hx = hovered.getX() + hovered.getWidth() * 0.5f - hintW2 * 0.5f;
                float hy = hovered.getY() - 20f * scale;
                float winH = mc.getWindow().getHeight();
                if (hy < 10f) {
                    hy = hovered.getY() + hovered.getHeight() + 10f * scale;
                }
                if (hy + hintSizeHint > winH) {
                    hy = hovered.getY() - 20f * scale;
                }
                float hyText = hy + FontRegistry.centeredBaselineOffset(FontRegistry.SF_SEMIBOLD, 'P', hintSizeHint);


            }
        } else {
            lastHintElement = null;
        }

        HudSettingsOverlay.render(event);
    }

    private void renderShimmer(Renderer2D render, float x, float y, float w, float h, float rounding, float alpha) {
        float cx = x + w * 0.5f;
        float cy = y + h * 0.5f;
        float diag = (float) Math.hypot(w, h);
        long now = System.currentTimeMillis();
        float cycleProgress = (now % SHIMMER_CYCLE_MS) / (float) SHIMMER_CYCLE_MS;

        // Clip to element shape
        render.pushRoundedClipRect(x, y, w, h, rounding, rounding, rounding, rounding);

        render.pushTranslation(cx, cy);
        render.pushRotation(-45f);

        // Band moves from right-top to left-bottom (in rotated space: along X axis)
        float bandSpan = diag * 2.5f;
        float bandPos = -diag * 1.25f + cycleProgress * bandSpan;
        float bandWidth = Math.min(w, h) * SHIMMER_BAND_RATIO;

        int centerA = Math.round(110f * alpha);
        int sideA = Math.round(45f * alpha);
        int centerColor = (centerA << 24) | 0xFFFFFF;
        int sideColor = (sideA << 24) | 0xFFFFFF;

        // Bright center strip
        render.rect(bandPos - bandWidth * 0.12f, -diag, bandWidth * 0.24f, diag * 2f, 0, centerColor);
        // Fading sides
        render.rect(bandPos - bandWidth * 0.5f, -diag, bandWidth * 0.38f, diag * 2f, 0, sideColor);
        render.rect(bandPos + bandWidth * 0.12f, -diag, bandWidth * 0.38f, diag * 2f, 0, sideColor);

        render.popRotation();
        render.popTransform();
        render.popClipRect();
    }

    private static float centeredTextY(float y, float height, float size) {
        float offset = FontRegistry.centeredBaselineOffset(FontRegistry.SF_SEMIBOLD, 'H', size);
        return y + height * 0.5f + offset;
    }

    private static int lerpColor(int from, int to, float t) {
        float clamped = Math.max(0f, Math.min(1f, t));
        int a0 = (from >>> 24) & 0xFF;
        int r0 = (from >>> 16) & 0xFF;
        int g0 = (from >>> 8) & 0xFF;
        int b0 = from & 0xFF;
        int a1 = (to >>> 24) & 0xFF;
        int r1 = (to >>> 16) & 0xFF;
        int g1 = (to >>> 8) & 0xFF;
        int b1 = to & 0xFF;
        int a = Math.round(a0 + (a1 - a0) * clamped);
        int r = Math.round(r0 + (r1 - r0) * clamped);
        int g = Math.round(g0 + (g1 - g0) * clamped);
        int b = Math.round(b0 + (b1 - b0) * clamped);
        return (a << 24) | (r << 16) | (g << 8) | b;
    }
}