package fun.nexisdlc.ui.hud.keybinds;

import fun.nexisdlc.client.ClientColors;
import fun.nexisdlc.client.events.impl.render.EventRender;
import fun.nexisdlc.client.utils.render.drag.DraggingManager;
import fun.nexisdlc.client.utils.render.drag.api.Dragging;
import fun.nexisdlc.client.utils.render.main.text.FontRegistry;
import fun.nexisdlc.modules.impl.render.Interface;
import fun.nexisdlc.ui.hud.api.HudElement;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.ChatScreen;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KeyBindsTwo extends KeyBindsBase implements HudElement {

    public KeyBindsTwo(Dragging dragging) {
        super(dragging);
    }

    @Override
    public void render(EventRender.Screen.Hud event) {
        float startScale = Interface.isBounceAnimation() ? 0f : 0.8f;
        float elementScale = 0.925f;

        float scaleFactor = Interface.getHudScale(SETTINGS_SCOPE);
        float x = Interface.scalePos(SETTINGS_SCOPE, dragging.getX());
        float y = Interface.scalePos(SETTINGS_SCOPE, dragging.getY());
        applyDragDelta(x, y);

        String str1 = "Бинды";
        float titleSize = 18f * elementScale;
        float itemSize = 17f * elementScale;
        float iconSize = 16.5f * elementScale;
        float bindTextSize = 13f * elementScale;
        float bindIconSize = 16f * elementScale;
        float itemHeight = 30.75f * elementScale;
        float rowSpacing = 2.5f * elementScale;
        float bodyGap = 4f * elementScale;
        float bodyTopPadding = 3f * elementScale;
        float bottomPadding = 4f * elementScale;
        float outlineSize = 1f * elementScale;

        float paddingX = 9.4f * elementScale;
        float rectHeight = 35f * elementScale;

        int rounding = Interface.getHudRoundedInt(SETTINGS_SCOPE, 10f * elementScale);
        float dt = updateAnimTime();

        boolean chatOpen = MinecraftClient.getInstance().currentScreen instanceof ChatScreen;
        List<BindEntry> allEntries = collectAllEntries();
        List<BindEntry> visible = new ArrayList<>();
        List<BindEntry> activeList = new ArrayList<>();

        float targetMaxWidth = 0f;
        for (BindEntry entry : allEntries) {
            boolean active = entry.active;
            float anim = bindAnim.getOrDefault(entry.key, 0f);
            anim = animate(anim, active ? 1f : 0f, ITEM_ANIM_DURATION_MS, dt);
            if (anim <= 0.01f && !active) {
                bindAnim.remove(entry.key);
                bindY.remove(entry.key);
                continue;
            }
            bindAnim.put(entry.key, anim);
            if (active) {
                activeList.add(entry);
            }
            if (anim > 0.01f) {
                String alias = entry.alias;
                String keyName = getKeyName(entry.bind);
                String categoryIcon = entry.categoryIcon;
                String bindIcon = "Л";
                float bindPillWidth = FontRegistry.SF_SEMIBOLD.getWidth(keyName, bindTextSize)
                        + FontRegistry.WEXSIDE_MENU_ICONS.getWidth(bindIcon, bindIconSize)
                        + (16f * elementScale);
                float rowWidth = FontRegistry.SF_SEMIBOLD.getWidth(alias, itemSize)
                        + FontRegistry.WEXSIDE_MENU_ICONS.getWidth(categoryIcon, iconSize)
                        + bindPillWidth
                        + paddingX * 2f
                        + (44f * elementScale);
                float w = Math.max(FontRegistry.SF_SEMIBOLD.getWidth(alias + " | " + keyName, itemSize) + paddingX * 2f, rowWidth);
                targetMaxWidth = Math.max(targetMaxWidth, w);
                visible.add(entry);
            }
        }
        float minHeaderWidth = FontRegistry.SF_SEMIBOLD.getWidth(str1, titleSize) + paddingX * 2f + (110f * elementScale);

        if (Float.isNaN(width) || width == 0f) {
            width = minHeaderWidth;
        }

        float targetWidth = Math.max(targetMaxWidth, minHeaderWidth);
        width = animate(width, targetWidth, ITEM_ANIM_DURATION_MS * 1.5f, dt);

        float headerWidth = width;

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
        Map<Object, Float> targetPositions = new HashMap<>();
        Map<Object, Float> rowHeights = new HashMap<>();
        for (BindEntry entry : visible) {
            float anim = Math.max(0f, Math.min(1f, bindAnim.getOrDefault(entry.key, 0f)));
            float rowHeight = Math.max(0f, (itemHeight - rowSpacing) * anim);
            targetPositions.put(entry.key, targetY);
            rowHeights.put(entry.key, rowHeight);
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

        String headerIcon = "П";
        float headerIconSize = 16f * elementScale;
        float headerIconWidth = FontRegistry.WEXSIDE_MENU_ICONS.getWidth(headerIcon, headerIconSize);
        float headerIconX = x + (12f * elementScale);
        float headerIconY = y + rectHeight * 0.5f + FontRegistry.centeredBaselineOffset(FontRegistry.WEXSIDE_MENU_ICONS, headerIcon.charAt(0), headerIconSize) + 2f;
        float separatorHeight = 15f * elementScale;
        float separatorX = headerIconX + headerIconWidth + (10f * elementScale) - 2f;
        float separatorY = y + rectHeight * 0.5f - separatorHeight * 0.5f;
        float titleX = separatorX + (10f * elementScale);
        float centerY = centeredTextY(y, rectHeight, titleSize);
        int titleColor = ClientColors.applyAlpha(ClientColors.TEXT.getRGB(), alphaProgress);
        event.getRenderer().text(FontRegistry.WEXSIDE_MENU_ICONS, headerIconX - 2, headerIconY + 1, 20, headerIcon, ClientColors.applyAlpha(ClientColors.ICON.getRGB(), alphaProgress));
        event.getRenderer().rect(separatorX, separatorY, 3f * elementScale, separatorHeight, separatorColor);
        event.getRenderer().text(FontRegistry.SF_SEMIBOLD, titleX, centerY, titleSize, str1, titleColor);

        float maxBottom = visible.isEmpty() ? y + rectHeight : bodyY + bodyHeight;
        if (!visible.isEmpty()) {
            event.getRenderer().pushRoundedClipRect(x, bodyY, headerWidth, bodyHeight, rounding, rounding, rounding, rounding);
        }
        for (BindEntry entry : visible) {
            Float anim = bindAnim.get(entry.key);
            if (anim == null || anim <= 0.01f) {
                continue;
            }
            float itemAlpha = Math.min(1f, anim);
            float fullAlpha = itemAlpha * alphaProgress;
            int itemTextAlpha = Math.round(255f * fullAlpha);
            float rowHeight = rowHeights.getOrDefault(entry.key, itemHeight * itemAlpha);
            if (rowHeight <= 0.5f) {
                continue;
            }

            float currentY = targetPositions.getOrDefault(entry.key, listStartY);
            bindY.put(entry.key, currentY);

            float textY = centeredTextY(currentY, rowHeight, itemSize);
            int textColor = ClientColors.applyAlpha(ClientColors.TEXT.getRGB(), itemTextAlpha / 255f);
            String alias = entry.alias;
            String keyName = getKeyName(entry.bind);
            String categoryIcon = entry.categoryIcon;
            String bindIcon = "Л";
            float itemProgress = itemTextAlpha / 255f;
            float categoryIconX = x + (12f * elementScale);
            float categoryIconY = currentY + rowHeight * 0.5f + FontRegistry.centeredBaselineOffset(FontRegistry.CATEGORIES, categoryIcon.charAt(0), iconSize);
            float categoryIconWidth = FontRegistry.CATEGORIES.getWidth(categoryIcon, iconSize);
            float rowSeparatorHeight = 15f * elementScale;
            float rowSeparatorX = categoryIconX + categoryIconWidth + (10f * elementScale) - 2f;
            float rowSeparatorY = currentY + rowHeight * 0.5f - rowSeparatorHeight * 0.5f + 0.8f;
            float textX = rowSeparatorX + (10f * elementScale);
            float keyWidth = FontRegistry.SF_SEMIBOLD.getWidth(keyName, bindTextSize);
            float bindIconWidth = FontRegistry.WEXSIDE_MENU_ICONS.getWidth(bindIcon, bindIconSize);
            float bindW = keyWidth + bindIconWidth + (16f * elementScale);
            float bindH = 19f * elementScale;
            float bindX = x + headerWidth - paddingX - bindW;
            float bindY = currentY + rowHeight * 0.5f - bindH * 0.5f;
            float bindIconX = bindX + (6f * elementScale);
            float bindIconY = bindY + bindH * 0.52f + FontRegistry.centeredBaselineOffset(FontRegistry.WEXSIDE_MENU_ICONS, bindIcon.charAt(0), bindIconSize);
            float keyX = bindX + (10f * elementScale) + bindIconWidth;
            float keyY = centeredTextY(bindY, bindH, bindTextSize);
            int iconColor = ClientColors.applyAlpha(ClientColors.ICON.getRGB(), itemProgress);
            int bindColor = ClientColors.applyAlpha(ClientColors.TEXT.getRGB(), itemProgress * 0.5f);
            int bindBgColor = ClientColors.applyAlpha(new Color(255, 255, 255, 15).getRGB(), itemProgress);
            int bindOutlineColor = ClientColors.applyAlpha(new Color(210, 210, 220, 255).getRGB(), itemProgress * 0.09f);
            int rowseparator = ClientColors.applyAlpha(new Color(134, 134, 139, 255).getRGB(), itemProgress);

            event.getRenderer().text(FontRegistry.CATEGORIES, categoryIconX - 2.5f, categoryIconY + 2.5f, 20, categoryIcon, iconColor);
            event.getRenderer().rect(rowSeparatorX, rowSeparatorY, 3f * elementScale, rowSeparatorHeight, rowseparator);
            event.getRenderer().text(FontRegistry.SF_SEMIBOLD, textX, textY, itemSize, alias, textColor);
            //event.getRenderer().blur(bindX, bindY, bindW, bindH, 5f * elementScale, itemProgress);
            event.getRenderer().rect(bindX, bindY, bindW, bindH, 5f * elementScale, bindBgColor);
            //event.getRenderer().rectOutline(bindX, bindY, bindW, bindH, 5f * elementScale, bindOutlineColor, 1f * elementScale);
            event.getRenderer().text(FontRegistry.WEXSIDE_MENU_ICONS, bindIconX, bindIconY, bindIconSize, bindIcon, ClientColors.applyAlpha(Color.WHITE.getRGB(), itemProgress * 0.5f));
            event.getRenderer().text(FontRegistry.SF_SEMIBOLD, keyX, keyY, bindTextSize, keyName, bindColor);

            float bottom = currentY + rowHeight;
            if (bottom > maxBottom) {
                maxBottom = bottom;
            }
        }
        if (!visible.isEmpty()) {
            event.getRenderer().popClipRect();
        }

        event.getRenderer().popScale();

        height = Math.max(rectHeight, maxBottom - y);

        dragging.setWidth(width * scaleFactor);
        dragging.setHeight(height * scaleFactor);
    }
}
