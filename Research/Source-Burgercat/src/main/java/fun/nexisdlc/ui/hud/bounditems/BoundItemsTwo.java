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
import net.minecraft.util.math.MathHelper;

import java.awt.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BoundItemsTwo extends BoundItemsBase implements HudElement {
    private final Map<String, Float> cooldownAlpha = new HashMap<>();

    public BoundItemsTwo(Dragging dragging) {
        super(dragging);
    }

    @Override
    public void render(EventRender.Screen.Hud event) {
        if (mc.world == null || mc.player == null) {
            cooldownAlpha.clear();
            dragging.setWidth(0f);
            dragging.setHeight(0f);
            return;
        }

        List<BoundEntry> entries = collectEntries();
        if (entries.isEmpty()) {
            cooldownAlpha.clear();
            dragging.setWidth(0f);
            dragging.setHeight(0f);
            return;
        }

        float scaleFactor = Interface.getHudScale(SETTINGS_SCOPE);
        float x = Interface.scalePos(SETTINGS_SCOPE, dragging.getX());
        float y = Interface.scalePos(SETTINGS_SCOPE, dragging.getY());

        Renderer2D renderer2D = event.getRenderer();

        float totalWidth = 0f;
        for (BoundEntry entry : entries) {
            String keyName = getKeyName(entry.bind());
            float keyNameWidth = FontRegistry.SF_MEDIUM.getWidth(keyName, 16) + 5f;
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
            float keyNameWidth = FontRegistry.SF_MEDIUM.getWidth(keyName, 16) + 5f;
            float contentWidth = 3f + 50 + 3f + 3f - 14f;
            float blockWidth = Math.max(MIN_WIDTH, contentWidth);

            float mainBlockShrink = 4f;
            float mainBlockX = currentX + mainBlockShrink * 0.5f;
            float mainBlockY = itemY;
            float mainBlockWidth = blockWidth - mainBlockShrink;
            float mainBlockHeight = MAIN_BLOCK_HEIGHT;
            float rounding = Interface.getHudRounding(10f);
            int mainBlockColor = ClientColors.BACKGROUND.getRGB();

            renderer2D.blur(mainBlockX, mainBlockY, mainBlockWidth, mainBlockHeight, rounding, 1f);
            renderer2D.rect(mainBlockX, mainBlockY, mainBlockWidth, mainBlockHeight, rounding, mainBlockColor);

            float iconSize = 24f;
            float iconX = currentX + (blockWidth - iconSize) / 2f;
            float iconY = itemY + (MAIN_BLOCK_HEIGHT - iconSize) / 2f;
            ItemCooldownManager cooldownManager = mc.player.getItemCooldownManager();
            float progress = cooldownManager.getCooldownProgress(entry.stack(), 0);
            String cooldownKey = entry.stack().getItem().toString() + ":" + entry.bind();
            float cooldownTextAlpha = cooldownAlpha.getOrDefault(cooldownKey, 0f);
            cooldownTextAlpha = MathHelper.lerp(0.18f, cooldownTextAlpha, progress);
            if (cooldownTextAlpha < 0.01f) {
                cooldownTextAlpha = 0f;
            }
            cooldownAlpha.put(cooldownKey, cooldownTextAlpha);

            float itemAlpha = 1f - cooldownTextAlpha;
            if (progress <= 0f) {
                renderVanillaItem(renderer2D, entry.stack(), iconX, iconY, iconSize, scaleFactor, itemAlpha);
            }

            float bindRectWidth = Math.min(blockWidth - 6f, keyNameWidth + 2f);
            float bindRectX = currentX + (blockWidth - bindRectWidth) / 2f;
            float bindRectY = itemY + MAIN_BLOCK_HEIGHT + 4f;
            float bindRectHeight = BIND_BLOCK_HEIGHT - 4f;
            float bindRoundness = Interface.getHudRounding(5f);
            int bindBlockColor = ClientColors.ICON.getRGB();

            if (cooldownTextAlpha > 0f) {
                float cooldownTextSize = 20f;
                float cooldownX = currentX + (blockWidth - FontRegistry.NEXIS_HUD.getWidth("A", cooldownTextSize)) / 2f;
                float cooldownY = itemY + (MAIN_BLOCK_HEIGHT + cooldownTextSize) / 2f;
                renderer2D.text(FontRegistry.NEXIS_HUD, cooldownX, cooldownY, cooldownTextSize, "A", ColorUtils.multAlpha(Color.WHITE.getRGB(), cooldownTextAlpha));
            }


            renderer2D.blur(bindRectX, bindRectY, bindRectWidth, bindRectHeight, bindRoundness, 1f);
            renderer2D.rect(bindRectX, bindRectY, bindRectWidth, bindRectHeight, bindRoundness, bindBlockColor);

            float bindTextSize = 12f;
            float bindTextX = bindRectX + (bindRectWidth - FontRegistry.SF_MEDIUM.getWidth(keyName, bindTextSize)) / 2f;
            float bindTextY = bindRectY + bindRectHeight * 0.5f + FontRegistry.centeredBaselineOffset(FontRegistry.SF_MEDIUM, 'H', bindTextSize);
            int bindTextColor = ClientColors.TEXT.getRGB();
            renderer2D.text(FontRegistry.SF_MEDIUM, bindTextX, bindTextY, bindTextSize, keyName, bindTextColor);

            currentX += blockWidth + ITEM_SPACING;
        }

        width = totalWidth;
        height = TOTAL_BLOCK_HEIGHT;
        dragging.setWidth(width * scaleFactor);
        dragging.setHeight(height * scaleFactor);
    }
}
