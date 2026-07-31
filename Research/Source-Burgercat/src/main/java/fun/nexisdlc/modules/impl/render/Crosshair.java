package fun.nexisdlc.modules.impl.render;

import fun.nexisdlc.client.events.impl.render.EventRender;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.client.utils.render.animations.impl.SimpleLinearAnimation;
import fun.nexisdlc.client.utils.render.easy.RenderUtil;
import fun.nexisdlc.client.utils.render.main.core.Renderer2D;
import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import fun.nexisdlc.modules.api.settings.impl.SliderSetting;

import java.awt.*;

@FunctionAdd(name = "Crosshair", alias = "Crosshair", category = Category.Render, description = "Кастомный прицел с анимацией при ударе")
public class Crosshair extends Function {

    private final SliderSetting attackIndent = new SliderSetting("Отступ при атаке", 10f, 0f, 20f, 1f);
    private final SliderSetting baseIndent = new SliderSetting("Отступ", 0f, 0f, 5f, 0.5f);
    private final SliderSetting width = new SliderSetting("Длина", 7.5f, 2f, 10f, 0.5f);
    private final SliderSetting outlinewidth = new SliderSetting("Ширина обводки", 1, 0, 2, 0.1f);

    private final SimpleLinearAnimation targetingAnim = new SimpleLinearAnimation(250);

    private float visualIndent = 0f;

    public Crosshair() {
        addSettings(attackIndent, baseIndent, width, outlinewidth);
    }

    @EventHandler
    public void onRenderHUD(EventRender.Screen.Hud event) {
        if (mc.player == null || !mc.options.getPerspective().isFirstPerson()) return;

        var renderer = event.getRenderer();

        if (mc.crosshairTarget instanceof net.minecraft.util.hit.EntityHitResult) targetingAnim.show();
        else targetingAnim.hide();

        int mainColor = interpolateColor(Color.WHITE, Color.RED, targetingAnim.getProgress());
        int shadowColor = new Color(0, 0, 0, 255).getRGB();

        float centerX = mc.getWindow().getWidth() / 2f;
        float centerY = mc.getWindow().getHeight() / 2f;

        float cooldown = mc.player.getAttackCooldownProgress(0.5f);

        float targetIndent = baseIndent.get() + (attackIndent.get() * (1f - cooldown));
        float delta = RenderUtil.getTickDelta();

        float diff = targetIndent - visualIndent;

        if (Math.abs(diff) > 0.01f) {
            float lerpStep = diff * (0.75f * delta);

            float minStep = 0.6f * delta;

            if (Math.abs(lerpStep) < minStep) {
                visualIndent += Math.copySign(minStep, diff);

                if ((diff > 0 && visualIndent > targetIndent) || (diff < 0 && visualIndent < targetIndent)) {
                    visualIndent = targetIndent;
                }
            } else {
                visualIndent += lerpStep;
            }
        } else {
            visualIndent = targetIndent;
        }

        if (Math.abs(visualIndent - targetIndent) < 0.01f) visualIndent = targetIndent;

        float size = width.get();
        float thick = 3;

        if (outlinewidth.get() != 0) renderCrosshair(renderer, (int) centerX, (int) centerY, size, (int) thick, visualIndent, outlinewidth.get(), shadowColor);

        renderCrosshair(renderer, (int) centerX, (int) centerY, size, (int) thick, visualIndent, 0, mainColor);
    }

    private void renderCrosshair(Renderer2D renderer, float cx, float cy, float size, float thick, float indent, float pad, int color) {
        float half = thick / 2f;

        renderer.rect(cx - half - pad, cy - indent - size - pad, thick + (pad * 2), size + pad, color);
        renderer.rect(cx - half - pad, cy + indent, thick + (pad * 2), size + pad, color);
        renderer.rect(cx - indent - size - pad, cy - half - pad, size + pad, thick + (pad * 2), color);
        renderer.rect(cx + indent, cy - half - pad, size + pad, thick + (pad * 2), color);
    }

    private int interpolateColor(Color color1, Color color2, float factor) {
        int r = (int) (color1.getRed() + (color2.getRed() - color1.getRed()) * factor);
        int g = (int) (color1.getGreen() + (color2.getGreen() - color1.getGreen()) * factor);
        int b = (int) (color1.getBlue() + (color2.getBlue() - color1.getBlue()) * factor);
        return (255 << 24) | (r << 16) | (g << 8) | b;
    }
}
