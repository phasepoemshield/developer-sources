package fun.nexisdlc.ui.hud.targethud;

import fun.nexisdlc.client.ClientColors;
import fun.nexisdlc.client.events.impl.render.EventRender;
import fun.nexisdlc.client.utils.render.drag.DraggingManager;
import fun.nexisdlc.client.utils.render.drag.api.Dragging;
import fun.nexisdlc.client.utils.render.main.core.Renderer2D;
import fun.nexisdlc.client.utils.render.main.text.FontRegistry;
import fun.nexisdlc.modules.impl.render.Interface;
import fun.nexisdlc.ui.hud.api.HudElement;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.util.Identifier;
import org.joml.Vector4f;

import java.awt.*;

import static fun.nexisdlc.client.ClientColors.applyAlpha;
import static fun.nexisdlc.client.utils.render.color.basic.ColorUtils.injectAlpha;
import static fun.nexisdlc.client.utils.render.color.basic.ColorUtils.quadGradient;

public class TargetHudFirst extends TargetHudBase implements HudElement {

    public TargetHudFirst(Dragging dragging) {
        super(dragging);
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
        float baseHealth = fun.nexisdlc.client.utils.player.PlayerUtils.getHealthFloat(lastTarget);
        float absorption = Math.max(0f, lastTarget.getAbsorptionAmount());
        float totalHealth = baseHealth + absorption;
        String hpBaseText = "HP: " + formatHealthValue(totalHealth);
        if (absorption > 0f) {
            lastAbsorptionText = " (+" + formatHealthValue(absorption) + ")";
        }
        float absorptionTarget = absorption > 0f ? 1f : 0f;
        absorptionTextAlpha = lerp(absorptionTextAlpha, absorptionTarget, deltaTime * 10f);
        baseHpYellowProgress = lerp(baseHpYellowProgress, absorptionTarget, deltaTime * 10f);
        float size = 17f;

        float rectWidth = 179 + 9.4f * 2f;
        float rectHeight = 72f;
        float rounding = Interface.getHudRounding(SETTINGS_SCOPE, 11.5f);

        float faceSize = 56f;
        float faceX = x + 8f;
        float faceRound = Interface.getHudRounding(SETTINGS_SCOPE, 9f);
        float textX = x + faceSize + 15f;

        int panelColor = applyAlpha(ClientColors.BACKGROUND.getRGB(), alphaProgress);
        int textColor = applyAlpha(ClientColors.TEXT.getRGB(), alphaProgress);
        int texColor = applyAlpha(headColor.getRGB(), alphaProgress);

        float centerX = x + rectWidth * 0.5f;
        float centerY = y + rectHeight * 0.5f;
        float faceY = Math.round(centerY - faceSize * 0.5f);
        event.getRenderer().pushScale(scale, scale, centerX, centerY);
        renderTargetItemsRow(event.getRenderer(), lastTarget, x, y, alphaProgress, false);

        float glowExpand = 0.5f;
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
                rectWidth - glowShrink * 2f, rectHeight - glowShrink * 2f,
                rounding, 3f, glowExpand,
                glowWA[0], glowWA[1], glowWA[2], glowWA[3]
        );

        event.getRenderer().blur(x, y, rectWidth, rectHeight, rounding, alphaProgress);
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
            float hatU0 = 40f / 64f;
            float hatU1 = 48f / 64f;
            float hatSize = faceSize + 4f;
            float hatX = faceX - 2f;
            float hatY = faceY - 2f;
            drawSkinRegionNearest(event.getRenderer(), skin, hatX, hatY, hatSize, hatSize,
                    hatU0, v0, hatU1, v1, texColor, faceRound + 1f);
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
        float hpY = y + 40f;
        Color whiteHpColor = new Color(255, 255, 255, 255);
        Color yellowHpColor = new Color(255, 215, 0, 255);
        Color baseHpColor = lerpColorWithAlpha(whiteHpColor, yellowHpColor, baseHpYellowProgress);
        int hpTextColor = applyAlpha(baseHpColor.getRGB(), alphaProgress);
        event.getRenderer().text(FontRegistry.SF_BOLD, textX, nameY, size, name, textColor);
        event.getRenderer().text(FontRegistry.SF_SEMIBOLD, textX, hpY, 14, hpBaseText, hpTextColor);
        if (absorptionTextAlpha > 0.01f && !lastAbsorptionText.isEmpty()) {
            float baseWidth = event.getRenderer().measureText(FontRegistry.SF_SEMIBOLD, hpBaseText, 14).width;
            int absColor = applyAlpha(yellowHpColor.getRGB(), alphaProgress * absorptionTextAlpha);
            event.getRenderer().text(FontRegistry.SF_SEMIBOLD, textX + baseWidth, hpY, 14, lastAbsorptionText, absColor);
        }
        endScissor();

        float maxHealth = lastTarget.getMaxHealth();
        float currentHealth = fun.nexisdlc.client.utils.player.PlayerUtils.getHealthFloat(lastTarget);
        float healthPercentage = Math.min(currentHealth / maxHealth, 1.0f);
        float barWidth = (x + rectWidth) - textX - 8f;

        renderDefaultHealth(event.getRenderer(), y, textX, barWidth, alphaProgress, deltaTime,
                healthPercentage);

        event.getRenderer().popScale();

        width = rectWidth;
        height = rectHeight;
        dragging.setWidth(width * scaleFactor);
        dragging.setHeight(height * scaleFactor);
    }


    protected void renderDefaultHealth(Renderer2D renderer, float y, float textX, float barWidth, float alphaProgress,
                                       float deltaTime, float healthPercentage) {
        float safeBarWidth = Math.max(1f, barWidth);
        int backgroundColor = applyAlpha(ClientColors.BACKGROUND.getRGB(), alphaProgress * 0.5f);

        float yPriv = 48.5f;

        renderer.rect(textX, y + yPriv, safeBarWidth, 15, Interface.getHudRounding(SETTINGS_SCOPE, 5f), backgroundColor);

        float targetBarWidth = safeBarWidth * healthPercentage;
        if (healthBarAnim < 0f) {
            healthBarAnim = targetBarWidth;
            lastHealthPercentage = healthPercentage;
        } else if (lastHealthPercentage >= 0f && Math.abs(healthPercentage - lastHealthPercentage) < 1e-6f) {
            healthBarAnim = targetBarWidth;
        } else {
            float diff = targetBarWidth - healthBarAnim;
            healthBarAnim += Math.signum(diff) * Math.min(Math.abs(diff), 130f * deltaTime);
            if (Math.abs(healthBarAnim - targetBarWidth) < 0.5f) {
                lastHealthPercentage = healthPercentage;
            }
        }

        int[] barColors;
        if (DraggingManager.getHudBoolean(SETTINGS_SCOPE, SETTING_ADAPTIVE_BAR, false)) {
            int r = (int) (255f * (1f - healthPercentage));
            int g = (int) (255f * healthPercentage);
            int base = new Color(r, g, 0).getRGB();
            int baseDarker = withAlpha(adjustBrightness(base, 0.5f));
            int baseLighter = withAlpha(adjustBrightness(base, 1.15f));
            barColors = quadGradient(baseDarker, baseLighter, 0.5f);
        } else {
            barColors = quadGradient(
                    withAlpha(ClientColors.GRADIENT_START.getRGB()),
                    withAlpha(ClientColors.GRADIENT_END.getRGB()),
                    0.5f
            );
        }

        int[] mainColors = new int[4];
        for (int i = 0; i < 4; i++) {
            mainColors[i] = applyAlpha(barColors[i], alphaProgress);
        }

        renderer.gradient(textX, y + yPriv, healthBarAnim, 15,
                getHealthBarRounding(targetBarWidth, safeBarWidth).x(),
                getHealthBarRounding(targetBarWidth, safeBarWidth).y(),
                getHealthBarRounding(targetBarWidth, safeBarWidth).z(),
                getHealthBarRounding(targetBarWidth, safeBarWidth).w(),
                mainColors[0], mainColors[1], mainColors[2], mainColors[3]);
    }

    Vector4f getHealthBarRounding(float targetBarWidth, float safeBarWidth) {
        Vector4f returnable = new Vector4f(0,0,0,0);

        if (targetBarWidth == safeBarWidth) {
            returnable.set(5,5,5,5);
        } else {
            returnable.set(5,0,0,5);
        }

        return returnable;
    }
}
