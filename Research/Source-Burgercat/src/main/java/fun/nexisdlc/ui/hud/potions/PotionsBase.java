package fun.nexisdlc.ui.hud.potions;

import fun.nexisdlc.client.utils.client.IMinecraft;
import fun.nexisdlc.client.utils.math.MathUtil;
import fun.nexisdlc.client.utils.render.animations.impl.SimpleLinearAnimation;
import fun.nexisdlc.client.utils.render.color.basic.ColorUtils;
import fun.nexisdlc.client.utils.render.drag.api.Dragging;
import fun.nexisdlc.client.utils.render.main.text.FontRegistry;
import fun.nexisdlc.modules.impl.render.Interface;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.client.texture.Sprite;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class PotionsBase implements IMinecraft {
    public static final String SETTINGS_SCOPE = "Potions";
    public static final String SETTING_ALWAYS_SHOW = "alwaysShow";
    public static final String SETTING_SHOW_EFFECT_ICON = "showEffectIcon";
    public static final String SETTING_GREEN_TEXT = "greenText";
    public static final String SETTING_VARIANT = "variant";
    public static final String VARIANT_DEFAULT = "Дефолт";
    public static final String VARIANT_NEW = "Новый";
    public static float width;
    public static float height;
    final Dragging dragging;

    final Map<RegistryEntry<StatusEffect>, Float> effectAnim = new HashMap<>();
    final Map<RegistryEntry<StatusEffect>, Float> effectY = new HashMap<>();
    final Map<RegistryEntry<StatusEffect>, StatusEffectInstance> lastEffects = new HashMap<>();
    final Map<RegistryEntry<StatusEffect>, String> timeTextCurrent = new HashMap<>();
    final Map<RegistryEntry<StatusEffect>, String> timeTextPrevious = new HashMap<>();
    final Map<RegistryEntry<StatusEffect>, Long> timeTextStartMs = new HashMap<>();
    long lastAnimTime = System.currentTimeMillis();
    final SimpleLinearAnimation animation = new SimpleLinearAnimation();
    static final float ITEM_ANIM_DURATION_MS = 200f;
    static final int TIME_SWAP_DURATION_MS = 120;
    float lastDragX = Float.NaN;
    float lastDragY = Float.NaN;

    protected PotionsBase(Dragging dragging) {
        this.dragging = dragging;
    }

    protected static String formatEffectLine(StatusEffectInstance instance) {
        String name = instance.getEffectType().value().getName().getString();
        String time = formatDuration(instance.getDuration());
        int level = Math.max(0, instance.getAmplifier()) + 1;
        String levelText = level > 1 ? (" " + level) : "";
        return name + levelText + " | " + time;
    }

    protected static String formatEffectName(StatusEffectInstance instance) {
        String name = instance.getEffectType().value().getName().getString();
        int level = Math.max(0, instance.getAmplifier()) + 1;
        String levelText = level > 1 ? (" " + level) : "";
        return name + levelText;
    }

    protected static String formatDuration(int ticks) {
        int totalSeconds = Math.max(0, ticks / 20);
        int minutes = totalSeconds / 60;
        int seconds = totalSeconds % 60;
        return String.format("%d:%02d", minutes, seconds);
    }

    protected AnimatedText getAnimatedTimeText(RegistryEntry<StatusEffect> effect, String text, float size) {
        String current = timeTextCurrent.get(effect);
        String previous = timeTextPrevious.get(effect);
        long startTimeMs = timeTextStartMs.getOrDefault(effect, 0L);

        if (current == null) {
            current = text;
            previous = null;
            startTimeMs = 0L;
        } else if (!current.equals(text)) {
            previous = current;
            current = text;
            startTimeMs = System.currentTimeMillis();
        }

        float progress = 1f;
        if (previous != null) {
            long elapsed = System.currentTimeMillis() - startTimeMs;
            if (elapsed >= TIME_SWAP_DURATION_MS) {
                previous = null;
                progress = 1f;
            } else {
                progress = Math.max(0f, Math.min(1f, elapsed / (float) TIME_SWAP_DURATION_MS));
            }
        }

        timeTextCurrent.put(effect, current);
        if (previous == null) {
            timeTextPrevious.remove(effect);
            timeTextStartMs.remove(effect);
        } else {
            timeTextPrevious.put(effect, previous);
            timeTextStartMs.put(effect, startTimeMs);
        }

        float currentWidth = current == null ? 0f : FontRegistry.SF_SEMIBOLD.getWidth(current, size);
        float previousWidth = previous == null ? 0f : FontRegistry.SF_SEMIBOLD.getWidth(previous, size);
        float maxWidth = Math.max(currentWidth, previousWidth);
        return new AnimatedText(current == null ? "" : current, previous, progress, maxWidth);
    }

    protected static void renderAnimatedTime(fun.nexisdlc.client.events.impl.render.EventRender.Screen.Hud event, float x, float y, float size,
                                             AnimatedText timeText, float fullAlpha, float elementScale) {
        int baseColor = 0xFFEBEBEB;
        event.getRenderer().text(FontRegistry.SF_SEMIBOLD, x, y, size, timeText.current, fun.nexisdlc.client.ClientColors.applyAlpha(baseColor, fullAlpha));
    }

    protected static int getEffectColor(RegistryEntry<StatusEffect> effect, boolean greenText) {
        if (greenText && (effect == StatusEffects.STRENGTH
                || effect == StatusEffects.SPEED
                || effect == StatusEffects.REGENERATION
                || effect == StatusEffects.INVISIBILITY)) {
            return ColorUtils.rgb(0, 255, 0);
        }

        if (effect.value().getCategory() == StatusEffectCategory.HARMFUL || effect == StatusEffects.GLOWING) {
            return ColorUtils.rgb(255, 0, 0);
        }
        return ColorUtils.rgb(255, 255, 255);
    }

    protected static List<PreviewPotionItem> getPreviewPotionItems() {
        long phase = System.currentTimeMillis() / 4000L;
        PreviewPotionItem[] pool = {
                new PreviewPotionItem("Скорость 2", "1:24", ColorUtils.rgb(0, 255, 0)),
                new PreviewPotionItem("Сила", "0:48", ColorUtils.rgb(0, 255, 0)),
                new PreviewPotionItem("Невидимость", "2:13", ColorUtils.rgb(0, 255, 0)),
                new PreviewPotionItem("Слабость", "0:37", ColorUtils.rgb(255, 0, 0)),
                new PreviewPotionItem("Отравление", "0:19", ColorUtils.rgb(255, 0, 0)),
                new PreviewPotionItem("Ночное зрение", "3:02", ColorUtils.rgb(255, 255, 255))
        };
        List<PreviewPotionItem> items = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            items.add(pool[(int) ((phase + i) % pool.length)]);
        }
        return items;
    }

    protected float updateAnimTime() {
        long now = System.currentTimeMillis();
        float dt = (now - lastAnimTime) / 1000f;
        lastAnimTime = now;
        if (!Float.isFinite(dt) || dt < 0f) {
            return 0f;
        }
        return Math.min(dt, 0.05f);
    }

    protected static float centeredTextY(float y, float height, float size) {
        if (FontRegistry.SF_SEMIBOLD == null) {
            return y + height * 0.5f;
        }
        float offset = FontRegistry.centeredBaselineOffset(FontRegistry.SF_SEMIBOLD, 'H', size);
        return y + height * 0.5f + offset + 0.5f;
    }

    protected static float animate(float value, float target, float durationMs, float dt) {
        if (durationMs <= 0f) {
            return target;
        }
        float duration = Math.max(1e-6f, durationMs / 1000f);
        float k = (float) (-Math.log(0.05f) / duration);
        float t = 1f - (float) Math.exp(-k * Math.max(0f, dt));
        return value + (target - value) * MathUtil.clamp(t, 0f, 1f);
    }

    protected void applyDragDelta(float x, float y) {
        if (Float.isFinite(lastDragY)) {
            float dy = y - lastDragY;
            if (Math.abs(dy) > 0.001f) {
                for (Map.Entry<RegistryEntry<StatusEffect>, Float> entry : effectY.entrySet()) {
                    entry.setValue(entry.getValue() + dy);
                }
            }
        }
        lastDragX = x;
        lastDragY = y;
    }

    protected static final class PreviewPotionItem {
        private final String name;
        private final String time;
        private final int color;

        private PreviewPotionItem(String name, String time, int color) {
            this.name = name;
            this.time = time;
            this.color = color;
        }
    }

    protected static final class AnimatedText {
        final String current;
        final String previous;
        final float progress;
        final float maxWidth;

        private AnimatedText(String current, String previous, float progress, float maxWidth) {
            this.current = current;
            this.previous = previous;
            this.progress = progress;
            this.maxWidth = maxWidth;
        }
    }
}
