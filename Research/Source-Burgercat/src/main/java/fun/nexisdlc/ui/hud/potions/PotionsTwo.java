package fun.nexisdlc.ui.hud.potions;

import fun.nexisdlc.client.ClientColors;
import fun.nexisdlc.client.events.impl.render.EventRender;
import fun.nexisdlc.client.utils.math.MathUtil;
import fun.nexisdlc.client.utils.render.drag.DraggingManager;
import fun.nexisdlc.client.utils.render.drag.api.Dragging;
import fun.nexisdlc.client.utils.render.main.text.FontRegistry;
import fun.nexisdlc.modules.impl.render.Interface;
import fun.nexisdlc.ui.hud.api.HudElement;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.texture.Sprite;
import net.minecraft.client.texture.SpriteAtlasTexture;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

import java.awt.*;
import java.util.*;
import java.util.List;

public class PotionsTwo extends PotionsBase implements HudElement {

    public PotionsTwo(Dragging dragging) {
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

        String str1 = "Зелья";
        float titleSize = 17f * elementScale;
        float itemSize = 17f * elementScale;
        float timeTextSize = 13f * elementScale;
        float timeIconSize = 16f * elementScale;
        float itemHeight = 30.75f * elementScale;
        float rowSpacing = 2.5f * elementScale;
        float bodyGap = 4f * elementScale;
        float bodyTopPadding = 3f * elementScale;
        float bottomPadding = 4f * elementScale;
        float outlineSize = 1f * elementScale;

        float paddingX = 9.4f * elementScale;
        float rectHeight = 35f * elementScale;
        float effectIconSize = 16f * elementScale;

        int rounding = Interface.getHudRoundedInt(SETTINGS_SCOPE, 10f * elementScale);
        float dt = updateAnimTime();

        boolean chatOpen = MinecraftClient.getInstance().currentScreen instanceof ChatScreen;
        List<StatusEffectInstance> active = new ArrayList<>(mc.player.getStatusEffects());
        active.sort(Comparator.comparing(instance -> instance.getEffectType().getIdAsString()));

        List<RegistryEntry<StatusEffect>> visible = new ArrayList<>();
        List<RegistryEntry<StatusEffect>> activeList = new ArrayList<>();

        float targetMaxWidth = 0f;
        for (StatusEffectInstance instance : active) {
            RegistryEntry<StatusEffect> effect = instance.getEffectType();
            lastEffects.put(effect, instance);
            float anim = effectAnim.getOrDefault(effect, 0f);
            anim = animate(anim, 1f, ITEM_ANIM_DURATION_MS, dt);
            effectAnim.put(effect, anim);
            activeList.add(effect);

            String leftText = formatEffectName(instance);
            String rightText = formatDuration(instance.getDuration());
            String timeIcon = "Л";
            float timePillWidth = FontRegistry.SF_SEMIBOLD.getWidth(rightText, timeTextSize)
                    + FontRegistry.WEXSIDE_MENU_ICONS.getWidth(timeIcon, timeIconSize)
                    + (16f * elementScale);
            float rowWidth = FontRegistry.SF_SEMIBOLD.getWidth(leftText, itemSize)
                    + effectIconSize
                    + timePillWidth
                    + paddingX * 2f;
            targetMaxWidth = Math.max(targetMaxWidth, rowWidth);
            visible.add(effect);
        }

        for (RegistryEntry<StatusEffect> effect : new ArrayList<>(effectAnim.keySet())) {
            if (activeList.contains(effect)) {
                continue;
            }
            float anim = effectAnim.getOrDefault(effect, 0f);
            anim = animate(anim, 0f, ITEM_ANIM_DURATION_MS, dt);
            if (anim <= 0.01f) {
                effectAnim.remove(effect);
                effectY.remove(effect);
                lastEffects.remove(effect);
                timeTextCurrent.remove(effect);
                timeTextPrevious.remove(effect);
                timeTextStartMs.remove(effect);
                continue;
            }
            effectAnim.put(effect, anim);
            visible.add(effect);
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
        Map<RegistryEntry<StatusEffect>, Float> targetPositions = new HashMap<>();
        Map<RegistryEntry<StatusEffect>, Float> rowHeights = new HashMap<>();
        for (RegistryEntry<StatusEffect> effect : visible) {
            float anim = MathUtil.clamp(effectAnim.getOrDefault(effect, 0f), 0f, 1f);
            float rowHeight = Math.max(0f, (itemHeight - rowSpacing) * anim);
            targetPositions.put(effect, targetY);
            rowHeights.put(effect, rowHeight);
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

        String headerIcon = "У";
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
        event.getRenderer().text(FontRegistry.SF_SEMIBOLD, titleX, centerY, titleSize, str1, titleColor);

        float maxBottom = visible.isEmpty() ? y + rectHeight : bodyY + bodyHeight;
        for (RegistryEntry<StatusEffect> effect : visible) {
            float anim = effectAnim.getOrDefault(effect, 0f);
            if (anim <= 0.01f) {
                continue;
            }
            StatusEffectInstance instance = lastEffects.get(effect);
            if (instance == null) {
                continue;
            }

            float itemAlpha = Math.min(1f, anim);
            float fullAlpha = itemAlpha * alphaProgress;
            int itemTextAlpha = Math.round(255f * fullAlpha);
            float rowHeight = rowHeights.getOrDefault(effect, itemHeight * itemAlpha);
            if (rowHeight <= 0.5f) {
                continue;
            }

            float currentY = targetPositions.getOrDefault(effect, listStartY);
            effectY.put(effect, currentY);

            String leftText = formatEffectName(instance);
            String rightText = formatDuration(instance.getDuration());
            AnimatedText timeText = getAnimatedTimeText(effect, rightText, timeTextSize);
            float rightTextWidth = timeText.maxWidth;
            float itemProgress = itemTextAlpha / 255f;

            float textY = centeredTextY(currentY, rowHeight, itemSize);
            int textColor = ClientColors.applyAlpha(getEffectColor(effect, DraggingManager.getHudBoolean(SETTINGS_SCOPE, SETTING_GREEN_TEXT, true)), itemProgress);
            float iconX = x + (12f * elementScale);
            float iconY = currentY + (rowHeight - effectIconSize) * 0.5f;
            float rowSeparatorHeight = 15f * elementScale;
            float rowSeparatorX = iconX + effectIconSize + (10f * elementScale) - 2f;
            float rowSeparatorY = currentY + rowHeight * 0.5f - rowSeparatorHeight * 0.5f;
            float textX = separatorX + (5 * elementScale);
            String timeIcon = "A";
            float timeIconWidth = FontRegistry.NEXIS_HUD.getWidth(timeIcon, timeIconSize);
            float timeW = rightTextWidth + timeIconWidth + (16f * elementScale);
            float timeH = 19f * elementScale;
            float timeX = x + headerWidth - paddingX - timeW;
            float timeY = currentY + rowHeight * 0.5f - timeH * 0.5f;
            float timeIconX = timeX + (6f * elementScale);
            float timeIconY = timeY + timeH * 0.52f + FontRegistry.centeredBaselineOffset(FontRegistry.NEXIS_HUD, timeIcon.charAt(0), timeIconSize);
            float rightTextX = timeX + (10f * elementScale) + timeIconWidth;
            float rightTextY = timeY + timeH * 0.5f + FontRegistry.centeredBaselineOffset(FontRegistry.SF_SEMIBOLD, 'H', timeTextSize) + 0.5f;
            int timeBgColor = ClientColors.applyAlpha(new Color(255, 255, 255, 15).getRGB(), itemProgress);
            int rowseparator = ClientColors.applyAlpha(new Color(134, 134, 139, 255).getRGB(), itemProgress);

            Identifier effectTexture = InGameHud.getEffectTexture(effect);
            if (effectTexture != null) {
                SpriteAtlasTexture guiAtlas = mc.getAtlasManager().getAtlasTexture(Identifier.ofVanilla("gui"));
                Sprite sprite = guiAtlas.getSprite(effectTexture);
                if (sprite != null) {
                    event.getRenderer().drawTextureRegion(
                            sprite.getAtlasId(),
                            iconX - 2,
                            iconY - 2,
                            20,
                            20,
                            sprite.getMinU(),
                            sprite.getMinV(),
                            sprite.getMaxU(),
                            sprite.getMaxV(),
                            ClientColors.applyAlpha(0xFFFFFFFF, itemProgress)
                    );
                }
            }
            event.getRenderer().rect(rowSeparatorX, rowSeparatorY, 3f * elementScale, rowSeparatorHeight, rowseparator);
            event.getRenderer().text(FontRegistry.SF_SEMIBOLD, textX, textY, itemSize, leftText, textColor);
            event.getRenderer().rect(timeX, timeY, timeW, timeH, 5f * elementScale, timeBgColor);
            event.getRenderer().text(FontRegistry.NEXIS_HUD, timeIconX, timeIconY, timeIconSize, timeIcon, ClientColors.applyAlpha(Color.WHITE.getRGB(), itemProgress * 0.5f));
            renderAnimatedTime(event, rightTextX, rightTextY, timeTextSize, timeText, itemProgress * 0.5f, elementScale);

            float bottom = currentY + rowHeight;
            if (bottom > maxBottom) {
                maxBottom = bottom;
            }
        }

        event.getRenderer().popScale();

        height = Math.max(rectHeight, maxBottom - y);

        dragging.setWidth(width * scaleFactor);
        dragging.setHeight(height * scaleFactor);
    }
}
