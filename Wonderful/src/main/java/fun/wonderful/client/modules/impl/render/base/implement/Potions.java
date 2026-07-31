package fun.wonderful.client.modules.impl.render.base.implement;

import fun.wonderful.Wonderful;
import fun.wonderful.api.events.implement.EventRender;
import fun.wonderful.api.utils.animation.AnimationUtils;
import fun.wonderful.api.utils.animation.Easings;
import fun.wonderful.api.utils.color.ColorUtils;
import fun.wonderful.api.utils.draggable.Draggable;
import fun.wonderful.api.utils.render.RenderUtils;
import fun.wonderful.api.utils.render.fonts.msdf.Font;
import fun.wonderful.api.utils.render.fonts.msdf.Fonts;
import fun.wonderful.api.utils.scissor.ScissorUtils;
import fun.wonderful.client.modules.impl.render.base.InterfaceProcessing;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.minecraft.client.texture.Sprite;
import net.minecraft.client.resource.language.I18n;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.registry.entry.RegistryEntry;

public class Potions
extends InterfaceProcessing {
    private static final int HUD_TEXT_COLOR = ColorUtils.rgb(227, 227, 227);
    private static final int HUD_SEPARATOR_COLOR = ColorUtils.rgba(185, 185, 185, 110);
    private static final float HUD_RADIUS = 3.0f;
    private final Map<StatusEffect, AnimationUtils> animations = new LinkedHashMap<StatusEffect, AnimationUtils>();
    private final Map<StatusEffect, PotionSnapshot> snapshots = new HashMap<StatusEffect, PotionSnapshot>();
    private final Set<StatusEffect> renderOrderSeen = new HashSet<StatusEffect>();
    private final AnimationUtils widthAnimation = new AnimationUtils(70.0f, 10.5f, Easings.QUAD_OUT);

    public Potions(Draggable draggable) {
        super(draggable);
    }

    private Font issue(int size) {
        return Fonts.getFont("sf_regular", size);
    }

    private Font icon(int size) {
        return Fonts.getFont("wonderful", size);
    }

    private AnimationUtils getAnimation(StatusEffect effect) {
        return this.animations.computeIfAbsent(effect, e2 -> new AnimationUtils(0.0f, 10.5f, Easings.QUAD_OUT));
    }

    private static String getLevelSuffix(int level) {
        return level > 1 ? " " + level : "";
    }

    private static String formatDuration(StatusEffectInstance effect) {
        return Potions.formatDuration(effect.getDuration(), effect.isInfinite());
    }

    private static String formatDuration(int duration, boolean infinite) {
        if (infinite) {
            return "inf";
        }
        int seconds = Math.max(0, duration / 20);
        int minutes = seconds / 60;
        int secs = seconds % 60;
        return (String)(minutes < 10 ? "0" + minutes : String.valueOf(minutes)) + ":" + (String)(secs < 10 ? "0" + secs : String.valueOf(secs));
    }

    private void updateSnapshot(StatusEffectInstance effect) {
        StatusEffect type = (StatusEffect)effect.getEffectType().value();
        PotionSnapshot snapshot = this.snapshots.computeIfAbsent(type, e2 -> new PotionSnapshot());
        snapshot.entry = effect.getEffectType();
        snapshot.baseName = I18n.translate((String)effect.getTranslationKey(), (Object[])new Object[0]);
        snapshot.amplifier = effect.getAmplifier() + 1;
        snapshot.duration = effect.getDuration();
        snapshot.infinite = effect.isInfinite();
    }

    private List<StatusEffect> buildRenderOrder(Collection<StatusEffectInstance> effects, Set<StatusEffect> active) {
        ArrayList<StatusEffect> order = new ArrayList<StatusEffect>();
        this.renderOrderSeen.clear();
        for (StatusEffectInstance effect : effects) {
            StatusEffect type = (StatusEffect)effect.getEffectType().value();
            if (!this.renderOrderSeen.add(type)) continue;
            order.add(type);
        }
        for (StatusEffect type : this.animations.keySet()) {
            if (active.contains(type)) continue;
            order.add(type);
        }
        return order;
    }

    private void drawEffectIcon(EventRender.Default eventRender, RegistryEntry<StatusEffect> effect, float x2, float y2, int size, int alpha) {
        Sprite sprite = mc.getStatusEffectSpriteManager().getSprite(effect);
        int color = ColorUtils.rgba(255, 255, 255, alpha);
        RenderUtils.drawSprite(eventRender.getContext().getMatrices(), sprite, x2, y2, size, color);
    }

    @Override
    public void onRender(EventRender.Default eventRender) {
        this.DefaultStyle(eventRender);
        super.onRender(eventRender);
    }

    public void DefaultStyle(EventRender.Default eventRender) {
        float x2 = this.draggable.getX();
        float y2 = this.draggable.getY();
        int colorTheme = !Wonderful.INSTANCE.themeStorage.getThemes().getTheme().getName().equals("Rainbow") ? Wonderful.INSTANCE.themeStorage.getThemes().getTheme().color[0] : ColorUtils.getThemeColor();
        float targetWidth = 70.0f;
        float targetHeight = 16.0f;
        int visibleCount = 0;
        List<StatusEffectInstance> effects = mc != null && Potions.mc.player != null ? Potions.mc.player.getStatusEffects().stream().toList() : List.<StatusEffectInstance>of();
        HashSet<StatusEffect> active = new HashSet<StatusEffect>();
        for (StatusEffectInstance class_12932 : effects) {
            StatusEffect type2 = (StatusEffect)class_12932.getEffectType().value();
            active.add(type2);
            this.getAnimation(type2).update(1.0f);
            this.updateSnapshot(class_12932);
        }
        for (Map.Entry entry2 : this.animations.entrySet()) {
            if (active.contains(entry2.getKey())) continue;
            ((AnimationUtils)entry2.getValue()).update(0.0f);
        }
        List<StatusEffect> renderOrder = this.buildRenderOrder(effects, active);
        for (StatusEffect type2 : renderOrder) {
            float timeWidth;
            AnimationUtils anim = this.getAnimation(type2);
            float animValue = anim.getValue();
            PotionSnapshot snapshot = this.snapshots.get(type2);
            if (!(animValue > 0.01f) || snapshot == null) continue;
            ++visibleCount;
            String baseName = snapshot.baseName != null ? snapshot.baseName : I18n.translate((String)type2.getTranslationKey(), (Object[])new Object[0]);
            String name = baseName + Potions.getLevelSuffix(snapshot.amplifier);
            String time = Potions.formatDuration(snapshot.duration, snapshot.infinite);
            float nameWidth = this.issue(13).getWidth(name);
            float rowWidth = nameWidth + (timeWidth = this.issue(13).getWidth(time)) + 33.0f;
            if (rowWidth > targetWidth) {
                targetWidth = rowWidth;
            }
            targetHeight += 12.0f * animValue;
        }
        if (visibleCount > 0) {
            targetHeight += 4.0f;
        }
        this.widthAnimation.update(targetWidth);
        float f2 = this.widthAnimation.getValue();
        float height = targetHeight;
        float separatorX = x2 + 0.5f;
        float separatorY = y2 + 15.35f;
        float separatorWidth = f2 - 1.0f;
        this.drawFigmaPanel(eventRender.getContext().getMatrices(), x2, y2, f2, height, colorTheme);
        this.issue(15).draw(eventRender.getContext().getMatrices(), "Potions", x2 + 5.0f, y2 + 6.0f, HUD_TEXT_COLOR);
        this.icon(13).draw(eventRender.getContext().getMatrices(), "C", x2 + f2 - 12.7f, y2 + 6.8f, colorTheme);
        if (visibleCount > 0) {
            this.drawHeaderSeparator(eventRender.getContext().getMatrices(), separatorX, separatorY, separatorWidth);
        }
        float offsetY = 19.5f;
        for (StatusEffect type3 : renderOrder) {
            AnimationUtils anim = this.getAnimation(type3);
            float animValue = anim.getValue();
            PotionSnapshot snapshot = this.snapshots.get(type3);
            if (!(animValue > 0.01f) || snapshot == null) continue;
            ScissorUtils.push();
            ScissorUtils.setFromComponentCoordinates(x2, y2, f2, height);
            int alpha = (int)(255.0f * animValue);
            int textColor = ColorUtils.setAlphaColor(HUD_TEXT_COLOR, alpha);
            int accentColor = ColorUtils.setAlphaColor(colorTheme, alpha);
            float iconSize = 7.0f;
            float iconX = x2 + 5.0f;
            float iconY = y2 + offsetY;
            if (snapshot.entry != null) {
                this.drawEffectIcon(eventRender, snapshot.entry, iconX, iconY, (int)iconSize, alpha);
            }
            String baseName = snapshot.baseName != null ? snapshot.baseName : I18n.translate((String)type3.getTranslationKey(), (Object[])new Object[0]);
            String name = baseName + Potions.getLevelSuffix(snapshot.amplifier);
            float textX = iconX + iconSize + 3.0f;
            float textY = y2 + 2.0f + offsetY;
            this.issue(13).draw(eventRender.getContext().getMatrices(), name, textX, textY, textColor);
            String time = Potions.formatDuration(snapshot.duration, snapshot.infinite);
            float timeX = x2 + f2 - this.issue(13).getWidth(time) - 5.0f;
            this.issue(13).draw(eventRender.getContext().getMatrices(), time, timeX, textY, accentColor);
            offsetY += 12.0f * animValue;
            ScissorUtils.pop();
            ScissorUtils.unset();
        }
        this.animations.entrySet().removeIf(entry -> !active.contains(entry.getKey()) && ((AnimationUtils)entry.getValue()).getValue() <= 0.01f);
        this.snapshots.keySet().removeIf(type -> !this.animations.containsKey(type));
        this.draggable.setWidth(f2);
        this.draggable.setHeight(height);
    }

    private void drawFigmaPanel(MatrixStack matrices, float x2, float y2, float width, float height, int themeColor) {
        int topColor = ColorUtils.setAlphaColor(ColorUtils.darken(themeColor, 0.15f), 255);
        int bottomColor = ColorUtils.setAlphaColor(ColorUtils.darken(themeColor, 0.05f), 255);
        RenderUtils.drawGradientRect(matrices, x2, y2, width, height, 3.0f, topColor, bottomColor);
    }

    private void drawHeaderSeparator(MatrixStack matrices, float x2, float y2, float width) {
        float snappedY = Math.round(y2);
        RenderUtils.drawRoundedRect(matrices, x2, snappedY, width, 0.6f, 0.0f, HUD_SEPARATOR_COLOR);
    }

    private static final class PotionSnapshot {
        RegistryEntry<StatusEffect> entry;
        String baseName;
        int amplifier;
        int duration;
        boolean infinite;

        private PotionSnapshot() {
        }
    }
}