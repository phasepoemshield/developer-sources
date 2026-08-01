package fun.nexisdlc.ui.hud.targethud;

import fun.nexisdlc.Nexis;
import fun.nexisdlc.client.ClientColors;
import fun.nexisdlc.client.events.impl.render.EventRender;
import fun.nexisdlc.client.utils.player.PlayerUtils;
import fun.nexisdlc.client.utils.render.drag.api.Dragging;
import fun.nexisdlc.client.utils.render.main.core.Renderer2D;
import fun.nexisdlc.client.utils.render.main.text.FontRegistry;
import fun.nexisdlc.modules.impl.render.Interface;
import fun.nexisdlc.ui.hud.api.HudElement;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Identifier;

import java.awt.*;

import static fun.nexisdlc.client.ClientColors.applyAlpha;

public class TargetHudTwo extends TargetHudBase implements HudElement {

    public TargetHudTwo(Dragging dragging) {
        super(dragging);
    }

    @Override
    protected void renderRoundHealth(Renderer2D renderer, LivingEntity target, float faceX, float faceY, float faceSize,
                                     float alphaProgress, float deltaTime, float healthPercentage) {
        int segments = 128;
        float radius = faceSize * 0.42f;
        float segmentSize = 3.1f;
        float angleStep = 360f / segments;
        float centerX = faceX + width - 40;
        float centerY = faceY + faceSize * 0.5f;

        boolean isInvisible;

        if (!Nexis.getFunctionManager().getFixHP().isState()) {
            isInvisible = false;
        } else {
            isInvisible = target.hasStatusEffect(StatusEffects.INVISIBILITY) ||
                    (target instanceof PlayerEntity && ((PlayerEntity) target).isInvisible());
        }

        float targetHealthSegments;

        if (isInvisible) {
            long cycleMs = 6000L;
            long phase = System.currentTimeMillis() % cycleMs;
            float anim;
            if (phase < cycleMs / 2) {
                anim = 1f - (phase / (cycleMs / 2f));
            } else {
                anim = (phase - cycleMs / 2f) / (cycleMs / 2f);
            }
            targetHealthSegments = anim * segments;
        } else {
            targetHealthSegments = healthPercentage * segments;
        }

        roundHealthSegmentsAnim = lerp(roundHealthSegmentsAnim, targetHealthSegments, deltaTime * 6f);

        int healthSegments = Math.max(0, Math.min(segments, Math.round(roundHealthSegmentsAnim)));

        int emptyColor = applyAlpha(ClientColors.BACKGROUND.getRGB(), alphaProgress * 0.35f);
        for (int i = 0; i < segments; i++) {
            float angle = i * angleStep - 90f;
            float radians = (float) Math.toRadians(angle);
            float posX = centerX + (float) Math.cos(radians) * radius - segmentSize * 0.5f;
            float posY = centerY + (float) Math.sin(radians) * radius - segmentSize * 0.5f;
            renderer.rect(posX, posY, segmentSize, segmentSize, Interface.getHudRounding(SETTINGS_SCOPE, segmentSize * 0.5f),
                    emptyColor);
        }

        if (!isInvisible) {
            int[] colors = resolveHealthColors(healthPercentage, alphaProgress, false);
            for (int i = 0; i < healthSegments; i++) {
                float angle = i * angleStep - 90f;
                float radians = (float) Math.toRadians(angle);
                float posX = centerX + (float) Math.cos(radians) * radius - segmentSize * 0.5f;
                float posY = centerY + (float) Math.sin(radians) * radius - segmentSize * 0.5f;
                renderer.gradient(posX, posY, segmentSize, segmentSize, Interface.getHudRounding(SETTINGS_SCOPE, segmentSize * 0.5f),
                        colors[0], colors[1], colors[0], colors[1]);
            }
        }

        String centerHealthText;

        if (isInvisible) {
            centerHealthText = "?";
            roundHealthTextAnim = -1;
        } else {
            float health = PlayerUtils.getHealthFloat(target);
            if (roundHealthTextEntityId != target.getId()) {
                roundHealthTextEntityId = target.getId();
                roundHealthTextAnim = health;
            }
            roundHealthTextAnim = lerp(roundHealthTextAnim, health, deltaTime * 8f);
            centerHealthText = String.valueOf(Math.round(Math.max(0f, roundHealthTextAnim)));
        }

        float textSize = 15f;
        var metrics = renderer.measureText(FontRegistry.SF_SEMIBOLD, centerHealthText, textSize);
        float textY = centerY - metrics.height * 0.01f + 5;
        renderer.centredText(FontRegistry.SF_SEMIBOLD, centerX, textY, textSize, centerHealthText,
                applyAlpha(ClientColors.ICON.getRGB(), alphaProgress));
    }

    @Override
    public void render(EventRender.Screen.Hud event) {
        updateTarget();

        float startScale = Interface.isBounceAnimation() ? 0f : 0.8f;

        animation.setDuration(Interface.getAlphaDurationMs());
        float alphaProgress = animation.getProgress();
        boolean hiding = animation.getTarget() == 0f;
        float scale = Interface.animatedScale(startScale, alphaProgress, hiding);

        if (alphaProgress <= 0 && animation.get() == 0) {
            lastTarget = null;
            return;
        }

        if (lastTarget == null)
            return;

        long currentTime = System.nanoTime();
        float deltaTime = (currentTime - lastTime) / 1_000_000_000.0f;
        lastTime = currentTime;

        if (lastTarget != null) {
            float hurtTime = (lastTarget.hurtTime) / 7f;
            float timeSinceDamage = (currentTime - lastDamageTime) / 1_000_000_000.0f;
            Color redColor = new Color(255, 70, 70, 255);

            if (hurtTime > 1) {
                lastDamageTime = currentTime;
                damageAnimationProgress = lerp(damageAnimationProgress, 1f, deltaTime / 0.1f);
            } else if (hurtTime < 1) {
                damageAnimationProgress = lerp(damageAnimationProgress, 0.0f, deltaTime / 0.15f);
            } else if (timeSinceDamage < RED_DURATION) {
                damageAnimationProgress = 1.0f;
            }

            headColor = lerpColorWithAlpha(initialColor, redColor, damageAnimationProgress);
        }

        float scaleFactor = Interface.getHudScale(SETTINGS_SCOPE);
        float x = Interface.scalePos(SETTINGS_SCOPE, dragging.getX());
        float y = Interface.scalePos(SETTINGS_SCOPE, dragging.getY());

        String name = getDisplayName(lastTarget, 11);
        float size = 16f;

        float rectWidth = 179 + 9.4f * 2f + 25f;
        float rectHeight = 72f - 10f;
        float rounding = Interface.getHudRounding(SETTINGS_SCOPE, 11.5f);
        float outlineSize = 1f;

        float faceSize = 37f;
        float faceX = x + 8f;
        float faceRound = Interface.getHudRounding(SETTINGS_SCOPE, 12f) - 3;
        float textX = x + faceSize + 17f;

        int panelColor = applyAlpha(ClientColors.BACKGROUND.getRGB(), alphaProgress);
        int outlineColor = applyAlpha(new Color(45, 45, 45, 95).getRGB(), alphaProgress);
        int textColor = applyAlpha(ClientColors.TEXT.getRGB(), alphaProgress);
        int texColor = applyAlpha(headColor.getRGB(), alphaProgress);

        float centerX = x + rectWidth * 0.5f;
        float centerY = y + rectHeight * 0.5f;
        float faceY = Math.round(centerY - faceSize * 0.5f);
        event.getRenderer().pushScale(scale, scale, centerX, centerY);

        event.getRenderer().blur(x, y, rectWidth, rectHeight, rounding, alphaProgress);
//        event.getRenderer().rectOutline(x - outlineSize, y - outlineSize, rectWidth + outlineSize * 2f, rectHeight + outlineSize * 2f, rounding + outlineSize, outlineColor, 1);
        event.getRenderer().rect(x, y, rectWidth, rectHeight, rounding, panelColor);

        if (lastTarget instanceof AbstractClientPlayerEntity player) {
            initialColor = new Color(255, 255, 255);

            Identifier skin = player.getSkin().body().texturePath();
            float u0 = 8f / 64f;
            float v0 = 8f / 64f;
            float u1 = 16f / 64f;
            float v1 = 16f / 64f;
            drawSkinRegionNearest(event.getRenderer(), skin, faceX, faceY, faceSize, faceSize,
                    u0, v0, u1, v1, texColor, faceRound);
//            float hatU0 = 40f / 64f;
//            float hatU1 = 48f / 64f;
//            float hatSize = faceSize + 4f;
//            float hatX = faceX - 2f;
//            float hatY = faceY - 2f;
//            drawSkinRegionNearest(event.getRenderer(), skin, hatX, hatY, hatSize, hatSize,
//                    hatU0, v0, hatU1, v1, texColor, faceRound + 1f);
        } else {
            initialColor = ClientColors.BACKGROUND;

            event.getRenderer().rect(faceX, faceY, faceSize, faceSize, faceRound + 1, texColor);
        }

        float textClipX = textX;
        float textClipY = y + 18f;
        float textClipWidth = Math.max(1f, (x + rectWidth) - textX - 5f);
        float textClipHeight = 32f;

        beginScaledScissor(textClipX, textClipY, textClipWidth, textClipHeight, centerX, centerY, scale);
        float nameY = y + 25f;
        float hpY = y + 44f;
        event.getRenderer().text(FontRegistry.SF_SEMIBOLD, textX, nameY, size, name, textColor);
        endScissor();

        renderTargetItemsRow(event.getRenderer(), lastTarget, textX, y + 33f, alphaProgress, true);

        float maxHealth = lastTarget.getMaxHealth();
        float currentHealth = fun.nexisdlc.client.utils.player.PlayerUtils.getHealthFloat(lastTarget);
        float healthPercentage = Math.min(currentHealth / maxHealth, 1.0f);
        renderRoundHealth(event.getRenderer(), lastTarget, faceX + 4, faceY, faceSize, alphaProgress, deltaTime,
                healthPercentage);

        event.getRenderer().popScale();

        width = rectWidth;
        height = rectHeight;
        dragging.setWidth(width * scaleFactor);
        dragging.setHeight(height * scaleFactor);
    }
}
