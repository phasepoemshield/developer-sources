package fun.nexisdlc.ui.hud.potions;

import fun.nexisdlc.client.ClientColors;
import fun.nexisdlc.client.events.impl.render.EventRender;
import fun.nexisdlc.client.utils.render.color.ColorUtils;
import fun.nexisdlc.client.utils.render.drag.DraggingManager;
import fun.nexisdlc.client.utils.render.drag.api.Dragging;
import fun.nexisdlc.client.utils.render.main.text.FontRegistry;
import fun.nexisdlc.modules.impl.render.Interface;
import fun.nexisdlc.ui.hud.api.HudElement;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.registry.entry.RegistryEntry;

import java.awt.*;
import java.util.*;
import java.util.List;

import static fun.nexisdlc.client.utils.render.color.basic.ColorUtils.injectAlpha;
import static fun.nexisdlc.client.utils.render.color.basic.ColorUtils.quadGradient;

public class PotionsFirst extends PotionsBase implements HudElement {

    public PotionsFirst(Dragging dragging) {
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

        String str1 = "Active potions";
        float titleSize = 20f * elementScale;
        float baseTitleSize = 18 * elementScale;
        float itemSize = 19f * elementScale;
        float iconSize = 16.5f * elementScale;
        float itemHeight = 30.75f * elementScale;
        float rowSpacing = 2.5f * elementScale;
        float bottomPadding = 4f * elementScale;

        float paddingX = 9.4f * elementScale;
        float rectHeight = 48f * elementScale;

        int rounding = Interface.getHudRoundedInt(SETTINGS_SCOPE, 11f * elementScale);
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
            float rowWidth = FontRegistry.SF_BOLD.getWidth(leftText, itemSize)
                    + FontRegistry.SF_SEMIBOLD.getWidth(rightText, itemSize)
                    + paddingX * 2f
                    + (34f * elementScale);
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

        float minHeaderWidth = FontRegistry.SF_BOLD.getWidth(str1, baseTitleSize) + paddingX * 2f + (110f * elementScale);

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

        float listStartY = y + rectHeight - 11;
        float targetY = listStartY;
        Map<RegistryEntry<StatusEffect>, Float> targetPositions = new HashMap<>();
        Map<RegistryEntry<StatusEffect>, Float> rowHeights = new HashMap<>();
        for (RegistryEntry<StatusEffect> effect : visible) {
            float anim = Math.max(0f, Math.min(1f, effectAnim.getOrDefault(effect, 0f)));
            float rowHeight = Math.max(0f, (itemHeight - rowSpacing) * anim);
            targetPositions.put(effect, targetY);
            rowHeights.put(effect, rowHeight);
            targetY += rowHeight;
        }
        float preMaxBottom = Math.max(y + rectHeight, targetY + (visible.isEmpty() ? 0f : bottomPadding));
        float preHeight = Math.max(rectHeight, preMaxBottom - y);
        float scale = Interface.animatedScale(startScale, alphaProgress, hiding);
        float scaleCenterX = x + headerWidth * 0.5f;
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
            int glowAlpha = Math.round(alphaProgress * 128);
            glowWA = new int[4];
            for (int i = 0; i < 4; i++) glowWA[i] = injectAlpha(glowColors[i], glowAlpha);
        }
        float glowShrink = glowExpand * 2f;
        event.getRenderer().gradientShadow(
                x + glowShrink, y + glowShrink,
                headerWidth - glowShrink * 2f, containerHeight - glowShrink * 2f,
                rounding, 3f * elementScale, glowExpand,
                glowWA[0], glowWA[1], glowWA[2], glowWA[3]
        );

        event.getRenderer().blur(x, y, headerWidth, containerHeight, rounding, alphaProgress);
        event.getRenderer().rect(x, y, headerWidth, containerHeight, rounding, panelColor);

        float maxBottom = y + rectHeight;
        for (RegistryEntry<StatusEffect> effect : visible) {
            Float anim = effectAnim.get(effect);
            if (anim == null || anim <= 0.01f) {
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

            Float currentY = effectY.get(effect);
            if (currentY == null) {
                currentY = targetPositions.getOrDefault(effect, listStartY);
            }
            currentY = animate(currentY, targetPositions.getOrDefault(effect, listStartY), 25, dt);
            effectY.put(effect, currentY);

            String leftText = formatEffectName(instance);
            String rightText = formatDuration(instance.getDuration());
            float rightTextWidth = FontRegistry.SF_SEMIBOLD.getWidth(rightText, itemSize);

            float textY = centeredTextY(currentY, rowHeight, itemSize);
            int textColor = ClientColors.applyAlpha(getEffectColor(effect, DraggingManager.getHudBoolean(SETTINGS_SCOPE, SETTING_GREEN_TEXT, true)), itemTextAlpha / 255f);
            float textX = x + paddingX;
            float rightEdge = x + headerWidth - paddingX;
            float rightTextX = rightEdge - rightTextWidth;

            event.getRenderer().text(FontRegistry.SF_BOLD, textX, textY, itemSize, leftText, textColor);
            event.getRenderer().text(FontRegistry.SF_SEMIBOLD, rightTextX, textY, itemSize, rightText,
                    ClientColors.applyAlpha(0xFFEBEBEB, itemTextAlpha / 255f));

            float bottom = currentY + rowHeight;
            if (bottom > maxBottom) {
                maxBottom = bottom;
            }
        }

        event.getRenderer().rect(x, y, headerWidth, 32, rounding, rounding, 0, 0, headerColor);

        float centerX = x + headerWidth * 0.5f;
        float centerY = centeredTextY(y, rectHeight, titleSize) - (1f * elementScale) - 4;
        String headerIcon = "У";
        float headerIconWidth = FontRegistry.WEXSIDE_MENU_ICONS.getWidth(headerIcon, 16f * elementScale);
        float headerIconX = x + headerWidth - headerIconWidth - (12f * elementScale);
        float headerIconY = y + rectHeight * 0.5f + FontRegistry.centeredBaselineOffset(FontRegistry.WEXSIDE_MENU_ICONS, headerIcon.charAt(0), 16f * elementScale);

        Color animStartColor = ColorUtils.gradient(ClientColors.GRADIENT_START, ClientColors.GRADIENT_END, 4, 0);
        Color animEndColor = ColorUtils.gradient(ClientColors.GRADIENT_END, ClientColors.GRADIENT_START, 4, 90);

        event.getRenderer().gradientCenteredText(FontRegistry.SF_BOLD, centerX, centerY, titleSize, str1,
                ClientColors.applyAlpha(animStartColor.getRGB(), alphaProgress),
                ClientColors.applyAlpha(animEndColor.getRGB(), alphaProgress));

        event.getRenderer().popScale();

        height = Math.max(rectHeight, maxBottom - y);

        dragging.setWidth(width * scaleFactor);
        dragging.setHeight(height * scaleFactor);
    }
}
