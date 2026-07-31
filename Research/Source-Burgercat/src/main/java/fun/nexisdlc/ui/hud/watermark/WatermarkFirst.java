package fun.nexisdlc.ui.hud.watermark;

import fun.nexisdlc.ClientContainer;
import fun.nexisdlc.client.ClientColors;
import fun.nexisdlc.client.events.impl.render.EventRender;
import fun.nexisdlc.client.utils.render.color.ColorUtils;
import fun.nexisdlc.client.utils.render.drag.DraggingManager;
import fun.nexisdlc.client.utils.render.drag.api.Dragging;
import fun.nexisdlc.client.utils.render.main.text.FontRegistry;
import fun.nexisdlc.modules.impl.render.Interface;
import fun.nexisdlc.ui.hud.api.HudElement;

import java.awt.Color;
import java.util.List;

import static fun.nexisdlc.client.utils.render.color.basic.ColorUtils.injectAlpha;
import static fun.nexisdlc.client.utils.render.color.basic.ColorUtils.quadGradient;

public class WatermarkFirst extends WatermarkBase implements HudElement {

    public WatermarkFirst(Dragging dragging) {
        super(dragging);
    }

    @Override
    public void render(EventRender.Screen.Hud event) {
        float scaleFactor = Interface.getHudScale(SETTINGS_SCOPE);
        float x = Interface.scalePos(SETTINGS_SCOPE, dragging.getX());
        float y = Interface.scalePos(SETTINGS_SCOPE, dragging.getY());

        String user = ClientContainer.getUser() == null || ClientContainer.getUser().isEmpty() ? "unknown" : ClientContainer.getUser();
        List<WatermarkEntry> entries = buildVisibleEntries(user);
        List<WatermarkLine> lines = toLines(entries);

        String title = "nexis";
        float titleSize = 19f;
        float titlePaddingX = 9f;
        float rectHeight = 29f;
        float spacing = 2f;
        float contentPaddingLeft = 5f;
        float contentPaddingRight = 6f;
        float titleBlockWidth = Math.max(32f, FontRegistry.SF_BOLD.getWidth(title, titleSize) + titlePaddingX * 2f) - 10;

        float contentWidth = contentPaddingLeft + contentPaddingRight;
        for (int i = 0; i < lines.size(); i++) {
            WatermarkLine line = lines.get(i);
            if (i > 0) {
                contentWidth += spacing + 1f;
            }
            float iconWidth = FontRegistry.WEXSIDE_MENU_ICONS.getWidth(line.iconText, line.iconSize);
            float textWidth = FontRegistry.SF_SEMIBOLD.getWidth(line.valueText, 17f);
            contentWidth += iconWidth + spacing + textWidth;
        }

        float totalWidth = titleBlockWidth + spacing + contentWidth + 3;

        float currentX = x;
        float currentY = y;

        boolean centered = DraggingManager.getHudBoolean(SETTINGS_SCOPE, SETTING_CENTERING, false);
        if (centered) {
            float scaledW = (float) mc.getWindow().getWidth() / scaleFactor;
            currentX = (scaledW - totalWidth) * 0.5f;
            float targetY = 13f + getBossBarOffset(scaleFactor);
            animatedCenteredY = animateTowards(animatedCenteredY, targetY, 0.2f);
            currentY = animatedCenteredY;
            dragging.setX(currentX * scaleFactor);
            dragging.setY(currentY * scaleFactor);
        } else {
            animatedCenteredY = Float.NaN;
        }

        int panelColor = ClientColors.BACKGROUND.getRGB();
        float glowExpand = 0.5f;
        int[] glowWA;
        if (Interface.isDefaultOutlineColorEnabled()) {
            glowWA = Interface.getDefaultOutlineGlowColors(1f);
        } else {
            int[] glowColors = quadGradient(
                    ClientColors.GRADIENT_START.getRGB(),
                    ClientColors.GRADIENT_END.getRGB(),
                    0.5f
            );
            int glowAlpha = 150;
            glowWA = new int[4];
            for (int i = 0; i < 4; i++) glowWA[i] = injectAlpha(glowColors[i], glowAlpha);
        }
        float glowShrink = glowExpand * 2f;
        event.getRenderer().gradientShadow(
                currentX + glowShrink, currentY + glowShrink,
                totalWidth - glowShrink * 2f, rectHeight - glowShrink * 2f,
                8, 3f, glowExpand,
                glowWA[0], glowWA[1], glowWA[2], glowWA[3]
        );

        event.getRenderer().blur(currentX, currentY, totalWidth, rectHeight, 8);
        event.getRenderer().rect(currentX, currentY, totalWidth, rectHeight, 8, panelColor);

        Color animStartColor = ColorUtils.gradient(ClientColors.GRADIENT_START, ClientColors.GRADIENT_END, 4, 0);
        Color animEndColor = ColorUtils.gradient(ClientColors.GRADIENT_END, ClientColors.GRADIENT_START, 4, 90);
        float titleBaselineY = currentY + rectHeight * 0.5f + FontRegistry.centeredBaselineOffset(FontRegistry.SF_BOLD, 'H', titleSize);

        float titleTextWidth = FontRegistry.SF_BOLD.getWidth(title, titleSize);
        float titleTextX = currentX + titlePaddingX;
        event.getRenderer().gradientCenteredText(FontRegistry.SF_BOLD, titleTextX + titleTextWidth * 0.5f, titleBaselineY, titleSize, title,
                ClientColors.applyAlpha(animStartColor.getRGB(), 1f),
                ClientColors.applyAlpha(animEndColor.getRGB(), 1f));

        float baselineY = currentY + rectHeight * 0.5f + FontRegistry.centeredBaselineOffset(FontRegistry.SF_SEMIBOLD, 'H', 17f) + 1;
        float cursorX = currentX + titleBlockWidth + spacing + contentPaddingLeft;
        for (int i = 0; i < lines.size(); i++) {
            WatermarkLine line = lines.get(i);
            if (i > 0) {
                cursorX += spacing + 1f;
            }

            event.getRenderer().text(FontRegistry.WEXSIDE_MENU_ICONS, cursorX, baselineY + line.iconYOffset, line.iconSize, line.iconText, ClientColors.ICON.getRGB());
            cursorX += FontRegistry.WEXSIDE_MENU_ICONS.getWidth(line.iconText, line.iconSize) + spacing;
            event.getRenderer().text(FontRegistry.SF_SEMIBOLD, cursorX, baselineY, 17f, line.valueText, ClientColors.TEXT.getRGB());
            cursorX += FontRegistry.SF_SEMIBOLD.getWidth(line.valueText, 17f);
        }

        width = totalWidth;
        height = rectHeight;

        dragging.setWidth(width * scaleFactor);
        dragging.setHeight(height * scaleFactor);
    }
}
