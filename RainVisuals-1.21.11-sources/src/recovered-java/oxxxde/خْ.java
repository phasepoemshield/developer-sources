/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.client.option.SimpleOption
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.entity.effect.StatusEffectInstance
 *  net.minecraft.entity.effect.StatusEffects
 *  net.minecraft.registry.entry.RegistryEntry
 */
package oxxxde;

import kotakbaz.rain.event.events.PlayerUpdateEvent;
import kotakbaz.rain.mixin.OptionInstanceAccessor;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.setting.ModeSetting;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.option.SimpleOption;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.registry.entry.RegistryEntry;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import oxxxde.\u0636\u0643;
import oxxxde.\u0637\u062b;
import oxxxde.\u0638\u0646;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007\u00a2\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u0010\u0010\u0003J\u0015\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010!\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b$\u0010%\u00a8\u0006&"}, d2={"Loxxxde/\u062e\u0652;", "Loxxxde/\u062f\u0650;", "<init>", "()V", "", "onDisable", "Loxxxde/\u0633\u062d;", "event", "onUpdate", "(Lkotakbaz/rain/event/events/PlayerUpdateEvent;)V", "", "usesNightVisionEffect", "()Z", "applyGammaMode", "restoreGammaIfNeeded", "applyEffectMode", "clearEffectIfNeeded", "Lnet/minecraft/class_1293;", "effect", "isInjectedNightVisionEffect", "(Lnet/minecraft/class_1293;)Z", "", "EFFECT_DURATION", "I", "", "FULL_BRIGHT_GAMMA", "D", "", "MODE_GAMMA", "Ljava/lang/String;", "MODE_NIGHT_VISION", "effectApplied", "Z", "previousGamma", "Ljava/lang/Double;", "Loxxxde/\u0638\u064a;", "brightnessMode", "Loxxxde/\u0638\u064a;", "rain-visuals"})
public final class \u062e\u0652
extends Module {
    @NotNull
    private static final String MODE_GAMMA = "Gamma";
    @NotNull
    private static final ModeSetting brightnessMode;
    private static final double FULL_BRIGHT_GAMMA = 16.0;
    private static boolean effectApplied;
    @NotNull
    public static final \u062e\u0652 INSTANCE;
    private static final int EFFECT_DURATION = 400;
    @NotNull
    private static final String MODE_NIGHT_VISION = "Night Vision";
    @Nullable
    private static Double previousGamma;

    @Commando
    public final void onUpdate(@NotNull PlayerUpdateEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (Intrinsics.areEqual((String)brightnessMode.getValue(), MODE_NIGHT_VISION)) {
            this.restoreGammaIfNeeded();
            this.applyEffectMode();
        } else {
            this.clearEffectIfNeeded();
            this.applyGammaMode();
        }
    }

    private static final String brightnessMode$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String string = it;
        return Intrinsics.areEqual(string, MODE_GAMMA) ? "\u0413\u0430\u043c\u043c\u0430" : (Intrinsics.areEqual(string, MODE_NIGHT_VISION) ? "\u041d\u043e\u0447\u043d\u043e\u0435 \u0437\u0440\u0435\u043d\u0438\u0435" : it);
    }

    @Override
    public void onDisable() {
        this.clearEffectIfNeeded();
        this.restoreGammaIfNeeded();
        super.onDisable();
    }

    private final void restoreGammaIfNeeded() {
        Double d = previousGamma;
        if (d == null) {
            return;
        }
        double gamma = d;
        \u0636\u0643.getMc().options.getGamma().setValue((Object)gamma);
        previousGamma = null;
    }

    private final void applyGammaMode() {
        SimpleOption simpleOption = \u0636\u0643.getMc().options.getGamma();
        Intrinsics.checkNotNullExpressionValue(simpleOption, "gamma(...)");
        SimpleOption gamma = simpleOption;
        if (previousGamma == null) {
            previousGamma = (Double)gamma.getValue();
        }
        ((OptionInstanceAccessor)gamma).rain$setValue(16.0);
    }

    private final void applyEffectMode() {
        ClientPlayerEntity clientPlayerEntity = \u0636\u0643.getMc().player;
        if (clientPlayerEntity == null) {
            return;
        }
        ClientPlayerEntity player = clientPlayerEntity;
        player.addStatusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 400, 0, false, false, false));
        effectApplied = true;
    }

    private \u062e\u0652() {
        super("Fullbright", \u0638\u0646.getRENDER(), "\u0423\u0431\u0438\u0440\u0430\u0435\u0442 \u0442\u0435\u043c\u043d\u043e\u0442\u0443");
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean isInjectedNightVisionEffect(@NotNull StatusEffectInstance effect) {
        void var2_2;
        Intrinsics.checkNotNullParameter(effect, "effect");
        if (!Intrinsics.areEqual(\u0637\u062b.getEffectType(effect), StatusEffects.NIGHT_VISION)) return false;
        if (effect.getAmplifier() != 0) return false;
        if (effect.getDuration() <= 0) return false;
        if (effect.getDuration() > 400) return false;
        if (effect.isAmbient()) return false;
        StatusEffectInstance $this$shouldShowParticles$iv = effect;
        boolean $i$f$shouldShowParticles = false;
        if ($this$shouldShowParticles$iv.shouldShowParticles()) return false;
        StatusEffectInstance $this$shouldShowIcon$iv = effect;
        boolean $i$f$shouldShowIcon = false;
        if (var2_2.shouldShowIcon()) return false;
        return true;
    }

    /*
     * WARNING - void declaration
     */
    private final void clearEffectIfNeeded() {
        LivingEntity $this$getStatusEffect$iv;
        ClientPlayerEntity player;
        block6: {
            block5: {
                player = \u0636\u0643.getMc().player;
                if (!effectApplied) break block5;
                if (player != null) break block6;
            }
            effectApplied = false;
            return;
        }
        LivingEntity livingEntity = (LivingEntity)player;
        RegistryEntry registryEntry = StatusEffects.NIGHT_VISION;
        Intrinsics.checkNotNullExpressionValue(registryEntry, "NIGHT_VISION");
        RegistryEntry effect$iv = registryEntry;
        boolean $i$f$getStatusEffect = false;
        StatusEffectInstance currentEffect = $this$getStatusEffect$iv.getStatusEffect(effect$iv);
        if (currentEffect != null) {
            if (this.isInjectedNightVisionEffect(currentEffect)) {
                void var4_3;
                $this$getStatusEffect$iv = (LivingEntity)player;
                RegistryEntry registryEntry2 = StatusEffects.NIGHT_VISION;
                Intrinsics.checkNotNullExpressionValue(registryEntry2, "NIGHT_VISION");
                effect$iv = registryEntry2;
                boolean $i$f$removeStatusEffect = false;
                livingEntity.removeStatusEffect((RegistryEntry)var4_3);
            }
        }
        effectApplied = false;
    }

    public final boolean usesNightVisionEffect() {
        return this.isEnabled() && Intrinsics.areEqual(brightnessMode.getValue(), MODE_NIGHT_VISION);
    }

    static {
        INSTANCE = new \u062e\u0652();
        String[] stringArray = new String[2];
        stringArray[0] = MODE_GAMMA;
        stringArray[1] = MODE_NIGHT_VISION;
        brightnessMode = Module.mode$default(INSTANCE, "\u0420\u0435\u0436\u0438\u043c", CollectionsKt.listOf(stringArray), 0, null, 12, null).withDisplayNameProvider(\u062e\u0652::brightnessMode$lambda$0);
    }
}

