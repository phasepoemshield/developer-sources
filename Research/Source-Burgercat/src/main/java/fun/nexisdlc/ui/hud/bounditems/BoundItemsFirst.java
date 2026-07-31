package fun.nexisdlc.ui.hud.bounditems;

import fun.nexisdlc.client.ClientColors;
import fun.nexisdlc.client.events.impl.render.EventRender;
import fun.nexisdlc.client.utils.render.color.ColorUtils;
import fun.nexisdlc.client.utils.render.drag.api.Dragging;
import fun.nexisdlc.client.utils.render.main.core.Renderer2D;
import fun.nexisdlc.client.utils.render.main.text.FontRegistry;
import fun.nexisdlc.modules.impl.render.Interface;
import fun.nexisdlc.ui.hud.api.HudElement;
import net.minecraft.entity.player.ItemCooldownManager;

import java.awt.*;
import java.util.List;

import static fun.nexisdlc.client.utils.render.color.basic.ColorUtils.injectAlpha;
import static fun.nexisdlc.client.utils.render.color.basic.ColorUtils.quadGradient;

public class BoundItemsFirst extends BoundItemsBase implements HudElement {

    public BoundItemsFirst(Dragging dragging) {
        super(dragging);
    }

    @Override
    public void render(EventRender.Screen.Hud event) {
        if (mc.world == null || mc.player == null) {
            dragging.setWidth(0f);
            dragging.setHeight(0f);
            return;
        }

        List<BoundEntry> entries = collectEntries();
        if (entries.isEmpty()) {
            dragging.setWidth(0f);
            dragging.setHeight(0f);
            return;
        }

        float scaleFactor = Interface.getHudScale(SETTINGS_SCOPE);
        float x = Interface.scalePos(SETTINGS_SCOPE, dragging.getX());
        float y = Interface.scalePos(SETTINGS_SCOPE, dragging.getY());

        Renderer2D renderer2D = event.getRenderer();
        float textSize = 13;

        float totalWidth = 0f;
        for (BoundEntry entry : entries) {
            String keyName = getKeyName(entry.bind());
            float keyNameWidth = FontRegistry.SF_BOLD.getWidth(keyName, textSize) + 5f;
            float blockWidth = Math.max(MIN_WIDTH, 20f + 16f + keyNameWidth);
            totalWidth += blockWidth;
        }
        if (!entries.isEmpty()) {
            totalWidth += (entries.size() - 1) * ITEM_SPACING;
        }

        float currentX = x;

        for (int i = 0; i < entries.size(); i++) {
            BoundEntry entry = entries.get(i);
            float itemY = y;

            String keyName = getKeyName(entry.bind());
            float keyNameWidth = FontRegistry.SF_BOLD.getWidth(keyName, textSize) + 5f;
            float contentWidth = 3f + 28 + 3f + 3f;
            float blockWidth = Math.max(MIN_WIDTH, contentWidth);

            float mainBlockShrink = 4f;
            float mainBlockX = currentX + mainBlockShrink * 0.5f;
            float mainBlockY = itemY;
            float mainBlockWidth = blockWidth - mainBlockShrink;
            float mainBlockHeight = MAIN_BLOCK_HEIGHT;
            float rounding = Interface.getHudRounding(10f);
            int mainBlockColor = ClientColors.BACKGROUND.getRGB();


            float glowExpand = 0.5f;
            int[] glowWA;
            if (Interface.isDefaultOutlineColorEnabled()) {
                glowWA = Interface.getDefaultOutlineGlowColors(1f);
            } else {
                int[] glowColors = quadGradient(
                        isPressed(entry.bind()) ? ColorUtils.darken(ClientColors.GRADIENT_START.getRGB(), 0.4f) : ClientColors.GRADIENT_START.getRGB(),
                        isPressed(entry.bind()) ? ColorUtils.darken(ClientColors.GRADIENT_END.getRGB(), 0.4f) : ClientColors.GRADIENT_END.getRGB(),
                        0.5f
                );
                int glowAlpha = Math.round(150f);
                glowWA = new int[4];
                for (int g = 0; g < 4; g++) glowWA[g] = injectAlpha(glowColors[g], glowAlpha);
            }
            float glowShrink = glowExpand * 2f;
            renderer2D.gradientShadow(
                    mainBlockX + glowShrink, mainBlockY + glowShrink,
                    mainBlockWidth - glowShrink * 2f, mainBlockHeight - glowShrink * 2f,
                    rounding, 3f, glowExpand,
                    glowWA[0], glowWA[1], glowWA[2], glowWA[3]
            );
            renderer2D.blur(mainBlockX, mainBlockY, mainBlockWidth, mainBlockHeight, rounding, 1f);
            renderer2D.rect(mainBlockX, mainBlockY, mainBlockWidth, mainBlockHeight, rounding, mainBlockColor);

            float iconSize = 24f;
            float iconX = currentX + (blockWidth - iconSize) / 2f;
            float iconY = itemY + (MAIN_BLOCK_HEIGHT - iconSize) / 2f - 2f;
            renderVanillaItem(renderer2D, entry.stack(), iconX, iconY, iconSize, scaleFactor);

            ItemCooldownManager cooldownManager = mc.player.getItemCooldownManager();
            float progress = cooldownManager.getCooldownProgress(entry.stack(), 0);
            if (progress > 0) {
                float cooldownWidth = blockWidth * (1.0f - progress);
                float cooldownX = currentX + (blockWidth * progress);
                float cooldownY = itemY;
                float cooldownHeight = MAIN_BLOCK_HEIGHT;
                int cooldownColor = Color.GRAY.getRGB();
                renderer2D.rect(cooldownX, cooldownY, cooldownWidth, cooldownHeight, Interface.getHudRounding(10f), cooldownColor);
            }

            float bindRectWidth = Math.min(blockWidth - 6f, keyNameWidth + 2f);
            float bindRectX = currentX + (blockWidth - bindRectWidth) / 2f;
            float bindRectY = itemY + MAIN_BLOCK_HEIGHT - 6f;
            float bindRectHeight = 18f;
            float bindRoundness = Interface.getHudRounding(5f);
            int bindBlockColor = ClientColors.ICON.getRGB();

            renderer2D.blur(bindRectX, bindRectY, bindRectWidth, bindRectHeight, bindRoundness, 1f);
            renderer2D.rect(bindRectX, bindRectY, bindRectWidth, bindRectHeight, bindRoundness, bindBlockColor);

            float bindTextX = bindRectX + (bindRectWidth - FontRegistry.SF_BOLD.getWidth(keyName, textSize)) / 2f;
            float bindTextY = bindRectY + (bindRectHeight - textSize) / 2f + 11;
            int bindTextColor = isPressed(entry.bind()) ? ColorUtils.darken(ClientColors.ICON.getRGB(), 0.4f) : ClientColors.TEXT.getRGB();

            renderer2D.text(FontRegistry.SF_BOLD, bindTextX, bindTextY, textSize, keyName, bindTextColor);

            currentX += blockWidth + ITEM_SPACING;
        }

        width = totalWidth;
        height = TOTAL_BLOCK_HEIGHT;
        dragging.setWidth(width * scaleFactor);
        dragging.setHeight(height * scaleFactor);
    }

    @Deprecated
    boolean isPressed(int key) {
        /*
        if (key <= 0 || mc.currentScreen != null || key >= 1000) return false;

        return InputUtil.isKeyPressed(mc.getWindow(), key);

         */

        return false;
    }
}
