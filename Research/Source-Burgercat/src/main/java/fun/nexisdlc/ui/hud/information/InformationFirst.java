package fun.nexisdlc.ui.hud.information;

import fun.nexisdlc.client.ClientColors;
import fun.nexisdlc.client.events.impl.render.EventRender;
import fun.nexisdlc.client.utils.render.drag.api.Dragging;
import fun.nexisdlc.client.utils.render.main.text.FontRegistry;
import fun.nexisdlc.modules.impl.render.Interface;
import fun.nexisdlc.ui.hud.api.HudElement;

import java.awt.Color;

import static fun.nexisdlc.client.utils.render.color.basic.ColorUtils.injectAlpha;
import static fun.nexisdlc.client.utils.render.color.basic.ColorUtils.quadGradient;

public class InformationFirst extends InformationBase implements HudElement {

    public InformationFirst(Dragging dragging) {
        super(dragging);
    }

    @Override
    public void render(EventRender.Screen.Hud event) {
        if (mc.player == null || mc.world == null) {
            dragging.setWidth(0f);
            dragging.setHeight(0f);
            return;
        }

        String iconText = "M";
        String title = "";

        float scaleFactor = Interface.getInterfaceScale();
        float x = Interface.scalePos(dragging.getX());
        float y = Interface.scalePos(dragging.getY());

        String text = "XYZ: " + mc.player.getBlockX() + ", " + mc.player.getBlockY() + ", " + mc.player.getBlockZ();
        float titleSize = 18f;
        float textSize = 16f;
        float iconSize = 20f;
        float paddingX = 9f;
        float iconSpacing = 3f;
        float rectHeight = 29f;

        float titleWidth = FontRegistry.SF_BOLD.getWidth(title, titleSize);
        float iconWidth = FontRegistry.ICONS_ASYNC.getWidth(iconText, iconSize);
        float textWidth = FontRegistry.SF_SEMIBOLD.getWidth(text, textSize);
        float rectWidth = Math.max(128f, Math.max(titleWidth + paddingX * 2f, iconWidth + iconSpacing + textWidth + paddingX * 2f));

        int panelColor = ClientColors.BACKGROUND.getRGB();
        int[] glowWA;
        if (Interface.isDefaultOutlineColorEnabled()) {
            glowWA = Interface.getDefaultOutlineGlowColors(1f);
        } else {
            int[] glowColors = quadGradient(ClientColors.GRADIENT_START.getRGB(), ClientColors.GRADIENT_END.getRGB(), 0.5f);
            glowWA = new int[4];
            for (int i = 0; i < 4; i++) glowWA[i] = injectAlpha(glowColors[i], 150);
        }
        float glowExpand = 0.5f;
        float glowShrink = glowExpand * 2f;

        event.getRenderer().gradientShadow(x + glowShrink, y + glowShrink, rectWidth - glowShrink * 2f, rectHeight - glowShrink * 2f, 9, 3f, glowExpand, glowWA[0], glowWA[1], glowWA[2], glowWA[3]);
        event.getRenderer().blur(x, y, rectWidth, rectHeight, 9);
        event.getRenderer().rect(x, y, rectWidth, rectHeight, 9, panelColor);

        Color startColor = ClientColors.GRADIENT_START;
        Color endColor = ClientColors.GRADIENT_END;
        int textColor = ClientColors.TEXT.getRGB();
        int iconColor = ClientColors.ICON.getRGB();

        float titleX = x + paddingX;
        float titleY = y + rectHeight * 0.5f + FontRegistry.centeredBaselineOffset(FontRegistry.SF_BOLD, 'H', titleSize) - 8f;
        event.getRenderer().gradientCenteredText(FontRegistry.SF_BOLD, titleX + titleWidth * 0.5f, titleY, titleSize, title,
                ClientColors.applyAlpha(startColor.getRGB(), 1f), ClientColors.applyAlpha(endColor.getRGB(), 1f));

        float textX = x + paddingX + iconWidth + iconSpacing;
        float iconX = x + paddingX - 1f;
        float iconY = y + rectHeight * 0.5f + FontRegistry.centeredBaselineOffset(FontRegistry.ICONS_ASYNC, 'H', iconSize) + 0.5f;
        float textY = y + rectHeight * 0.5f + FontRegistry.centeredBaselineOffset(FontRegistry.SF_SEMIBOLD, 'H', textSize) + 0.25f;
        event.getRenderer().text(FontRegistry.ICONS_ASYNC, iconX, iconY, iconSize, iconText, iconColor);
        event.getRenderer().text(FontRegistry.SF_SEMIBOLD, textX, textY, textSize, text, textColor);

        width = rectWidth;
        height = rectHeight;
        dragging.setWidth(width * scaleFactor);
        dragging.setHeight(height * scaleFactor);
    }
}
