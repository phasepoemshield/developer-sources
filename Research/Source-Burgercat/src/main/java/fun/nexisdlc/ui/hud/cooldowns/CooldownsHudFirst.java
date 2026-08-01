package fun.nexisdlc.ui.hud.cooldowns;

import fun.nexisdlc.client.ClientColors;
import fun.nexisdlc.client.events.impl.render.EventRender;
import fun.nexisdlc.client.utils.render.color.ColorUtils;
import fun.nexisdlc.client.utils.render.drag.DraggingManager;
import fun.nexisdlc.client.utils.render.drag.api.Dragging;
import fun.nexisdlc.client.utils.render.main.text.FontRegistry;
import fun.nexisdlc.modules.impl.render.Interface;
import fun.nexisdlc.ui.hud.CooldownsHud;
import fun.nexisdlc.ui.hud.api.HudElement;
import net.minecraft.client.gui.screen.ChatScreen;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static fun.nexisdlc.client.utils.render.color.basic.ColorUtils.injectAlpha;
import static fun.nexisdlc.client.utils.render.color.basic.ColorUtils.quadGradient;

public class CooldownsHudFirst extends CooldownsHud implements HudElement {

    public CooldownsHudFirst(Dragging dragging) {
        super(dragging, false);
    }

    @Override
    public void render(EventRender.Screen.Hud event) {
        if (!prepare()) {
            return;
        }

        float startScale = Interface.isBounceAnimation() ? 0f : 0.8f;
        float elementScale = 0.850f;

        float scaleFactor = Interface.getHudScale(SETTINGS_SCOPE);
        float x = Interface.scalePos(SETTINGS_SCOPE, dragging.getX());
        float y = Interface.scalePos(SETTINGS_SCOPE, dragging.getY());

        String title = "Cooldowns";
        float titleSize = 20f * elementScale;
        float baseTitleSize = 18f * elementScale;
        float itemSize = 19f * elementScale;
        float iconSize = 16.5f * elementScale;
        float itemHeight = 30.75f * elementScale;
        float rowSpacing = 2.5f * elementScale;
        float bottomPadding = 4f * elementScale;

        float paddingX = 9.4f * elementScale;
        float rectHeight = 48f * elementScale;

        int rounding = Interface.getHudRoundedInt(SETTINGS_SCOPE, 11f * elementScale);
        float dt = updateAnimTime();

        boolean chatOpen = mc.currentScreen instanceof ChatScreen;
        List<CooldownEntry> allEntries = collectCooldowns();
        List<CooldownEntry> visible = new ArrayList<>();

        updateVisibility(allEntries);

        float targetMaxWidth = 0f;
        for (CooldownEntry entry : allEntries) {
            float timeAnim = 1f;
            if (timeAnim <= 0.01f) {
                continue;
            }

            String time = formatSeconds(entry.seconds());
            float rowWidth = FontRegistry.SF_SEMIBOLD.getWidth(entry.stack().getName(), itemSize)
                    + FontRegistry.SF_SEMIBOLD.getWidth(time, itemSize)
                    + FontRegistry.WEXSIDE_MENU_ICONS.getWidth("W", iconSize)
                    + paddingX * 2f
                    + (34f * elementScale);
            float w = Math.max(FontRegistry.SF_SEMIBOLD.getWidth(entry.stack().getName(), itemSize) + FontRegistry.SF_SEMIBOLD.getWidth(time, itemSize) + paddingX * 2f, rowWidth);
            targetMaxWidth = Math.max(targetMaxWidth, w);
            visible.add(entry);
        }

        float minHeaderWidth = FontRegistry.SF_BOLD.getWidth(title, baseTitleSize) + paddingX * 2f + (110f * elementScale);
        if (Float.isNaN(width) || width == 0f) {
            width = minHeaderWidth;
        }

        float targetWidth = Math.max(targetMaxWidth, minHeaderWidth);
        width = animate(width, targetWidth, 200f * 1.5f, dt);

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
        List<Float> rowHeights = new ArrayList<>();
        for (CooldownEntry entry : visible) {
            float rowHeight = Math.max(0f, itemHeight - rowSpacing);
            rowHeights.add(rowHeight);
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
        for (int i = 0; i < visible.size(); i++) {
            CooldownEntry entry = visible.get(i);
            float rowHeight = rowHeights.get(i);
            float currentY = listStartY;
            for (int j = 0; j < i; j++) {
                currentY += rowHeights.get(j);
            }

            float textY = centeredTextY(currentY, rowHeight, itemSize);
            String time = formatSeconds(entry.seconds());
            float timeWidth = FontRegistry.SF_SEMIBOLD.getWidth(time, itemSize);
            float iconX = x + paddingX;
            float iconY = currentY + (rowHeight - iconSize) * 0.5f;
            float textX = iconX + iconSize + (6f * elementScale);
            float timeX = x + width - paddingX - timeWidth;
            int textColor = ClientColors.applyAlpha(0xFFEBEBEB, alphaProgress);
            int timeColor = ClientColors.applyAlpha(0xFFEBEBEB, alphaProgress);

            event.getRenderer().text(FontRegistry.SF_SEMIBOLD, textX, textY, itemSize, entry.stack().getName(), textColor);
            event.getRenderer().text(FontRegistry.SF_SEMIBOLD, timeX, textY, itemSize, time, timeColor);
            renderVanillaItem(entry.stack(), iconX, iconY, iconSize, scaleFactor);

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
