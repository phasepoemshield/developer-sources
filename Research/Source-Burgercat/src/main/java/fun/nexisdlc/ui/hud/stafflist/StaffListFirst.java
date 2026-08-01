package fun.nexisdlc.ui.hud.stafflist;

import fun.nexisdlc.client.ClientColors;
import fun.nexisdlc.client.events.impl.render.EventRender;
import fun.nexisdlc.client.utils.math.MathUtil;
import fun.nexisdlc.client.utils.render.color.ColorUtils;
import fun.nexisdlc.client.utils.render.drag.DraggingManager;
import fun.nexisdlc.client.utils.render.drag.api.Dragging;
import fun.nexisdlc.client.utils.render.main.text.FontRegistry;
import fun.nexisdlc.modules.impl.render.Interface;
import fun.nexisdlc.ui.hud.StaffEntry;
import fun.nexisdlc.ui.hud.api.HudElement;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.text.Text;

import java.awt.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static fun.nexisdlc.client.utils.render.color.basic.ColorUtils.injectAlpha;
import static fun.nexisdlc.client.utils.render.color.basic.ColorUtils.quadGradient;

public class StaffListFirst extends StaffListBase implements HudElement {

    public StaffListFirst(Dragging dragging) {
        super(dragging);
    }

    @Override
    public void render(EventRender.Screen.Hud event) {
        if (mc.player == null || mc.world == null) {
            return;
        }

        float startScale = Interface.isBounceAnimation() ? 0f : 0.8f;
        float elementScale = 0.850f;

        float scaleFactor = Interface.getHudScale(SETTINGS_SCOPE);
        float x = Interface.scalePos(SETTINGS_SCOPE, dragging.getX());
        float y = Interface.scalePos(SETTINGS_SCOPE, dragging.getY());
        applyDragDelta(x, y);

        String title = "Staff list";
        float titleSize = 20f * elementScale;
        float baseTitleSize = 18f * elementScale;
        float itemSize = 19f * elementScale;
        float itemHeight = 30.75f * elementScale;
        float rowSpacing = 2.5f * elementScale;
        float bottomPadding = 4f * elementScale;
        float paddingX = 9.4f * elementScale;
        float rectHeight = 48f * elementScale;
        float statusSize = 8f * elementScale;

        int rounding = Interface.getHudRoundedInt(SETTINGS_SCOPE, 11f * elementScale);
        float dt = updateAnimTime();

        if (System.currentTimeMillis() - lastScanTime >= 1000L) {
            scanStaff();
            lastScanTime = System.currentTimeMillis();
        }

        List<String> activeList = new ArrayList<>();
        List<String> visible = new ArrayList<>();
        List<String> keys = new ArrayList<>(staffEntries.keySet());
        keys.sort(Comparator.comparing(key -> staffEntries.get(key).name, String.CASE_INSENSITIVE_ORDER));

        float targetMaxWidth = 0f;
        for (String key : keys) {
            StaffEntry entry = staffEntries.get(key);
            if (entry == null) {
                continue;
            }

            float anim = staffAnim.getOrDefault(key, 0f);
            anim = animate(anim, 1f, ITEM_ANIM_DURATION_MS, dt);
            if (anim <= 0.01f && !entry.online) {
                staffAnim.remove(key);
                staffY.remove(key);
                continue;
            }

            staffAnim.put(key, anim);
            activeList.add(key);
            if (anim > 0.01f) {
                Text displayText = trimDisplayText(entry.displayText);
                float rowWidth = event.getRenderer().measureText(FontRegistry.SF_BOLD, displayText, itemSize).width
                        + paddingX * 2f
                        + statusSize
                        + (26f * elementScale);
                targetMaxWidth = Math.max(targetMaxWidth, rowWidth);
                visible.add(key);
            }
        }

        for (String key : new ArrayList<>(staffAnim.keySet())) {
            if (activeList.contains(key)) {
                continue;
            }
            float anim = staffAnim.getOrDefault(key, 0f);
            anim = animate(anim, 0f, ITEM_ANIM_DURATION_MS, dt);
            if (anim <= 0.01f) {
                staffAnim.remove(key);
                staffY.remove(key);
                continue;
            }
            staffAnim.put(key, anim);
            visible.add(key);
        }

        float minHeaderWidth = FontRegistry.SF_BOLD.getWidth(title, baseTitleSize) + paddingX * 2f + (110f * elementScale);
        if (Float.isNaN(width) || width == 0f) {
            width = minHeaderWidth;
        }

        float targetWidth = Math.max(targetMaxWidth, minHeaderWidth);
        width = animate(width, targetWidth, ITEM_ANIM_DURATION_MS * 1.5f, dt);

        boolean chatOpen = MinecraftClient.getInstance().currentScreen instanceof ChatScreen;
        boolean shouldShow = DraggingManager.getHudBoolean(SETTINGS_SCOPE, SETTING_ALWAYS_SHOW, false) || chatOpen || !visible.isEmpty();
        animation.setDuration(Interface.getAlphaDurationMs());
        if (shouldShow) {
            animation.show();
        } else {
            animation.hide();
        }

        float alphaProgress = animation.getProgress();
        boolean hiding = animation.getTarget() == 0f;
        if (alphaProgress <= 0f && animation.get() == 0) {
            width = 0f;
            height = 0f;
            dragging.setWidth(0f);
            dragging.setHeight(0f);
            return;
        }

        float listStartY = y + rectHeight - 11f;
        float targetY = listStartY;
        Map<String, Float> targetPositions = new HashMap<>();
        Map<String, Float> rowHeights = new HashMap<>();
        for (String key : visible) {
            float anim = MathUtil.clamp(staffAnim.getOrDefault(key, 0f), 0f, 1f);
            float rowHeight = Math.max(0f, (itemHeight - rowSpacing) * anim);
            targetPositions.put(key, targetY);
            rowHeights.put(key, rowHeight);
            targetY += rowHeight;
        }

        float preMaxBottom = Math.max(y + rectHeight, targetY + (visible.isEmpty() ? 0f : bottomPadding));
        float preHeight = Math.max(rectHeight, preMaxBottom - y);
        float scale = Interface.animatedScale(startScale, alphaProgress, hiding);
        float scaleCenterX = x + width * 0.5f;
        float scaleCenterY = y + preHeight * 0.5f;
        event.getRenderer().pushScale(scale, scale, scaleCenterX, scaleCenterY);

        float containerHeight = Math.max(rectHeight, targetY - y + (visible.isEmpty() ? 0f : bottomPadding));
        int panelColor = ClientColors.applyAlpha(ClientColors.BACKGROUND.getRGB(), alphaProgress * 0.8f);
        int headerColor = ClientColors.applyAlpha(ClientColors.BACKGROUND.getRGB(), alphaProgress * 0.8f);

        float glowExpand = 0.5f * elementScale;
        int[] glowWA;
        if (Interface.isDefaultOutlineColorEnabled()) {
            glowWA = Interface.getDefaultOutlineGlowColors(alphaProgress);
        } else {
            int[] glowColors = quadGradient(
                    ClientColors.GRADIENT_START.getRGB(),
                    ClientColors.GRADIENT_END.getRGB(),
                    0.5f
            );
            int glowAlpha = Math.round(alphaProgress * 150);
            glowWA = new int[4];
            for (int i = 0; i < 4; i++) glowWA[i] = injectAlpha(glowColors[i], glowAlpha);
        }
        float glowShrink = glowExpand * 2f;
        event.getRenderer().gradientShadow(
                x + glowShrink, y + glowShrink,
                width - glowShrink * 2f, containerHeight - glowShrink * 2f,
                rounding, 3f * elementScale, glowExpand,
                glowWA[0], glowWA[1], glowWA[2], glowWA[3]
        );

        event.getRenderer().blur(x, y, width, containerHeight, rounding, alphaProgress);
        event.getRenderer().rect(x, y, width, containerHeight, rounding, panelColor);

        float maxBottom = y + rectHeight;
        for (String key : visible) {
            float anim = staffAnim.getOrDefault(key, 0f);
            if (anim <= 0.01f) {
                continue;
            }
            StaffEntry entry = staffEntries.get(key);
            if (entry == null) {
                continue;
            }

            float itemAlpha = Math.min(1f, anim);
            float fullAlpha = itemAlpha * alphaProgress;
            int itemTextAlpha = Math.round(255f * fullAlpha);
            float rowHeight = rowHeights.getOrDefault(key, itemHeight * itemAlpha);
            if (rowHeight <= 0.5f) {
                continue;
            }

            Float currentY = staffY.get(key);
            if (currentY == null) {
                currentY = targetPositions.getOrDefault(key, listStartY);
            }
            currentY = animate(currentY, targetPositions.getOrDefault(key, listStartY), 25, dt);
            staffY.put(key, currentY);

            Text displayText = trimDisplayText(entry.displayText);
            float textY = centeredTextY(currentY, rowHeight, itemSize);
            float textX = x + paddingX;
            int textColor = ClientColors.applyAlpha(0xFFEBEBEB, itemTextAlpha / 255f);
            int statusColor = entry.online ? ColorUtils.rgb(120, 255, 120) : ColorUtils.rgb(255, 110, 110);
            statusColor = ClientColors.applyAlpha(statusColor, itemTextAlpha / 255f);
            float dotX = x + width - paddingX - statusSize - 4f;
            float dotY = currentY + rowHeight * 0.5f - statusSize * 0.5f;

            event.getRenderer().text(FontRegistry.SF_BOLD, textX, textY, itemSize, displayText, textColor);
            event.getRenderer().rect(dotX, dotY, statusSize, statusSize, statusSize * 0.5f, statusColor);

            float bottom = currentY + rowHeight;
            if (bottom > maxBottom) {
                maxBottom = bottom;
            }
        }

        event.getRenderer().rect(x, y, width, 32f, rounding, rounding, 0, 0, headerColor);

        float centerX = x + width * 0.5f;
        float centerY = centeredTextY(y, rectHeight, titleSize) - (1f * elementScale) - 4f;
        Color animStartColor = ColorUtils.gradient(ClientColors.GRADIENT_START, ClientColors.GRADIENT_END, 4, 0);
        Color animEndColor = ColorUtils.gradient(ClientColors.GRADIENT_END, ClientColors.GRADIENT_START, 4, 90);

        event.getRenderer().gradientCenteredText(FontRegistry.SF_BOLD, centerX, centerY, titleSize, title,
                ClientColors.applyAlpha(animStartColor.getRGB(), alphaProgress),
                ClientColors.applyAlpha(animEndColor.getRGB(), alphaProgress));

        event.getRenderer().popScale();

        height = Math.max(rectHeight, maxBottom - y);
        dragging.setWidth(width * scaleFactor);
        dragging.setHeight(height * scaleFactor);
    }
}
