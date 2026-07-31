package fun.nexisdlc.ui.hud.stafflist;

import fun.nexisdlc.client.ClientColors;
import fun.nexisdlc.client.events.impl.render.EventRender;
import fun.nexisdlc.client.utils.math.MathUtil;
import fun.nexisdlc.client.utils.render.color.basic.ColorUtils;
import fun.nexisdlc.client.utils.render.drag.DraggingManager;
import fun.nexisdlc.client.utils.render.drag.api.Dragging;
import fun.nexisdlc.client.utils.render.main.text.FontRegistry;
import fun.nexisdlc.modules.impl.render.Interface;
import fun.nexisdlc.ui.hud.StaffEntry;
import fun.nexisdlc.ui.hud.api.HudElement;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.awt.*;
import java.util.*;
import java.util.List;

public class StaffListTwo extends StaffListBase implements HudElement {

    public StaffListTwo(Dragging dragging) {
        super(dragging);
    }

    @Override
    public void render(EventRender.Screen.Hud event) {
        if (mc.player == null || mc.world == null) {
            return;
        }

        float startScale = Interface.isBounceAnimation() ? 0f : 0.8f;
        float elementScale = 0.925f;

        float scaleFactor = Interface.getHudScale(SETTINGS_SCOPE);
        float x = Interface.scalePos(SETTINGS_SCOPE, dragging.getX());
        float y = Interface.scalePos(SETTINGS_SCOPE, dragging.getY());
        applyDragDelta(x, y);

        String title = "Персонал";
        float titleSize = 17f * elementScale;
        float itemSize = 17f * elementScale;
        float statusTextSize = 13f * elementScale;
        float itemHeight = 30.75f * elementScale;
        float rowSpacing = 2.5f * elementScale;
        float bodyGap = 4f * elementScale;
        float bodyTopPadding = 3f * elementScale;
        float bottomPadding = 4f * elementScale;
        float outlineSize = 1f * elementScale;
        float paddingX = 9.4f * elementScale;
        float rectHeight = 35f * elementScale;
        float faceSize = 16f * elementScale;

        int rounding = Interface.getHudRoundedInt(SETTINGS_SCOPE, 10f * elementScale);
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
            staffAnim.put(key, anim);
            activeList.add(key);

            if (anim > 0.01f) {
                Text displayText = trimDisplayText(entry.displayText);
                String statusText = entry.online ? "SPEC" : "AFK";
                float statusWidth = FontRegistry.SF_SEMIBOLD.getWidth(statusText, statusTextSize) + (12f * elementScale);
                float rowWidth = event.getRenderer().measureText(FontRegistry.SF_SEMIBOLD, displayText, itemSize).width
                        + faceSize
                        + statusWidth
                        + paddingX * 2f
                        + (34f * elementScale);
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

        float minHeaderWidth = FontRegistry.SF_SEMIBOLD.getWidth(title, titleSize) + paddingX * 2f + (50f * elementScale);
        if (Float.isNaN(width) || width == 0f) {
            width = minHeaderWidth;
        }
        float targetWidth = Math.max(targetMaxWidth, minHeaderWidth);
        width = animate(width, targetWidth, ITEM_ANIM_DURATION_MS * 1.5f, dt);
        float headerWidth = width;

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

        float bodyY = y + rectHeight + bodyGap;
        float listStartY = bodyY + bodyTopPadding;
        float targetY = listStartY;
        float maxAnim = 0f;
        Map<String, Float> targetPositions = new HashMap<>();
        Map<String, Float> rowHeights = new HashMap<>();
        for (String key : visible) {
            float anim = MathUtil.clamp(staffAnim.getOrDefault(key, 0f), 0f, 1f);
            float rowHeight = Math.max(0f, (itemHeight - rowSpacing) * anim);
            targetPositions.put(key, targetY);
            rowHeights.put(key, rowHeight);
            targetY += rowHeight;
            if (anim > maxAnim) maxAnim = anim;
        }

        float bodyHeight = visible.isEmpty() ? 0f : Math.max(0f, ((targetY - bodyY) + bottomPadding) * maxAnim);
        float preMaxBottom = visible.isEmpty() ? y + rectHeight : bodyY + bodyHeight;
        float preHeight = Math.max(rectHeight, preMaxBottom - y);
        float scale = Interface.animatedScale(startScale, alphaProgress, hiding);
        float scaleCenterX = x + headerWidth * 0.5f;
        float scaleCenterY = y + preHeight * 0.5f;
        event.getRenderer().pushScale(scale, scale, scaleCenterX, scaleCenterY);

        int panelColor = ClientColors.applyAlpha(ClientColors.BACKGROUND.getRGB(), alphaProgress);
        int outlineColor = ClientColors.applyAlpha(new Color(45, 45, 45, 95).getRGB(), alphaProgress);
        int separatorColor = ClientColors.applyAlpha(new Color(134, 134, 139, 255).getRGB(), alphaProgress);

        event.getRenderer().blur(x, y, headerWidth, rectHeight, rounding, alphaProgress);
//        event.getRenderer().rectOutline(x - outlineSize, y - outlineSize, headerWidth + outlineSize * 2f, rectHeight + outlineSize * 2f, rounding + outlineSize, outlineColor, 1);
        event.getRenderer().rect(x, y, headerWidth, rectHeight, rounding, panelColor);

        if (!visible.isEmpty()) {
            int bodyPanelColor = ClientColors.applyAlpha(ClientColors.BACKGROUND.getRGB(), alphaProgress * maxAnim);
            int bodyOutlineColor = ClientColors.applyAlpha(new Color(45, 45, 45, 95).getRGB(), alphaProgress * maxAnim);
            event.getRenderer().blur(x, bodyY, headerWidth, bodyHeight, rounding, maxAnim);
//            event.getRenderer().rectOutline(x - outlineSize, bodyY - outlineSize, headerWidth + outlineSize * 2f, bodyHeight + outlineSize * 2f, rounding + outlineSize, bodyOutlineColor, 1);
            event.getRenderer().rect(x, bodyY, headerWidth, bodyHeight, rounding, bodyPanelColor);
        }

        String headerIcon = "p";
        float headerIconSize = 16f * elementScale;
        float headerIconWidth = FontRegistry.WEXSIDE_MENU_ICONS.getWidth(headerIcon, headerIconSize);
        float headerIconX = x + (12f * elementScale);
        float headerIconY = y + rectHeight * 0.5f + FontRegistry.centeredBaselineOffset(FontRegistry.WEXSIDE_MENU_ICONS, headerIcon.charAt(0), headerIconSize) + 1f;
        float separatorHeight = 15f * elementScale;
        float separatorX = headerIconX + headerIconWidth + (10f * elementScale) - 2f;
        float separatorY = y + rectHeight * 0.5f - separatorHeight * 0.5f;
        float titleX = separatorX + (10f * elementScale);
        float centerY = centeredTextY(y, rectHeight, titleSize);
        int titleColor = ClientColors.applyAlpha(ClientColors.TEXT.getRGB(), alphaProgress);
        event.getRenderer().text(FontRegistry.WEXSIDE_MENU_ICONS, headerIconX - 2, headerIconY + 1, 20, headerIcon, ClientColors.applyAlpha(ClientColors.ICON.getRGB(), alphaProgress));
        event.getRenderer().rect(separatorX, separatorY, 3f * elementScale, separatorHeight, separatorColor);
        event.getRenderer().text(FontRegistry.SF_SEMIBOLD, titleX, centerY, titleSize, title, titleColor);

        float maxBottom = visible.isEmpty() ? y + rectHeight : bodyY + bodyHeight;
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

            float currentY = targetPositions.getOrDefault(key, listStartY);
            staffY.put(key, currentY);

            Text displayText = trimDisplayText(entry.displayText);
            String statusText = entry.online ? "SPEC" : "AFK";
            float statusWidth = FontRegistry.SF_SEMIBOLD.getWidth(statusText, statusTextSize);
            float itemProgress = itemTextAlpha / 255f;
            float textY = centeredTextY(currentY, rowHeight, itemSize);
            int textColor = ClientColors.applyAlpha(ClientColors.TEXT.getRGB(), itemProgress);
            float faceX = x + (12f * elementScale);
            float faceY = currentY + (rowHeight - faceSize) * 0.5f;
            float rowSeparatorHeight = 15f * elementScale;
            float rowSeparatorX = faceX + faceSize + (10f * elementScale) - 2f;
            float rowSeparatorY = currentY + rowHeight * 0.5f - rowSeparatorHeight * 0.5f;
            float textX = rowSeparatorX + (10f * elementScale);
            float statusW = statusWidth + (12f * elementScale);
            float statusH = 19f * elementScale;
            float statusX = x + headerWidth - paddingX - statusW;
            float statusY = currentY + rowHeight * 0.5f - statusH * 0.5f;
            float statusTextX = statusX + (statusW - statusWidth) * 0.5f;
            float statusTextY = statusY + statusH * 0.5f + FontRegistry.centeredBaselineOffset(FontRegistry.SF_SEMIBOLD, 'H', statusTextSize) + 0.5f;
            int statusColor = entry.online ? ClientColors.ICON.getRGB() : ColorUtils.rgb(255, 110, 110);
            int statusTextColor = ClientColors.applyAlpha(statusColor, itemProgress * 0.85f);
            int statusBgColor = ClientColors.applyAlpha(new Color(255, 255, 255, 15).getRGB(), itemProgress);
            int rowseparator = ClientColors.applyAlpha(new Color(134, 134, 139, 255).getRGB(), itemProgress);

            renderStaffHead(event, entry.name, faceX, faceY, faceSize, itemProgress, 5f * elementScale);
            event.getRenderer().rect(rowSeparatorX, rowSeparatorY, 3f * elementScale, rowSeparatorHeight, rowseparator);
            event.getRenderer().text(FontRegistry.SF_SEMIBOLD, textX, textY, itemSize, displayText, textColor);
            event.getRenderer().rect(statusX, statusY, statusW, statusH, 5f * elementScale, statusBgColor);
            event.getRenderer().text(FontRegistry.SF_SEMIBOLD, statusTextX, statusTextY, statusTextSize, statusText, statusTextColor);

            maxBottom = Math.max(maxBottom, currentY + rowHeight);
        }

        event.getRenderer().popScale();

        height = Math.max(rectHeight, maxBottom - y);
        dragging.setWidth(width * scaleFactor);
        dragging.setHeight(height * scaleFactor);
    }

    private void renderStaffHead(EventRender.Screen.Hud event, String name, float x, float y, float size, float alpha, float rounding) {
        Identifier skin = getStaffSkin(name);
        if (skin == null) {
            event.getRenderer().rect(x, y, size, size, rounding, ClientColors.applyAlpha(ClientColors.BACKGROUND.getRGB(), alpha));
            return;
        }

        int color = ClientColors.applyAlpha(Color.WHITE.getRGB(), alpha);
        float u0 = 8f / 64f;
        float v0 = 8f / 64f;
        float u1 = 16f / 64f;
        float v1 = 16f / 64f;
        event.getRenderer().drawTextureRegionRounded(skin, x, y, size, size, u0, v0, u1, v1, color, rounding);

        float hatU0 = 40f / 64f;
        float hatU1 = 48f / 64f;
        event.getRenderer().drawTextureRegionRounded(skin, x, y, size, size, hatU0, v0, hatU1, v1, color, rounding);
    }

    private Identifier getStaffSkin(String name) {
        if (name == null || mc.getNetworkHandler() == null) {
            return null;
        }
        for (PlayerListEntry entry : mc.getNetworkHandler().getPlayerList()) {
            if (entry == null || entry.getProfile() == null || entry.getProfile().name() == null) {
                continue;
            }
            if (entry.getProfile().name().equalsIgnoreCase(name) && entry.getSkinTextures() != null
                    && entry.getSkinTextures().body().texturePath() != null) {
                return entry.getSkinTextures().body().texturePath();
            }
        }
        return null;
    }
}
