/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.entity.effect.StatusEffectInstance
 *  net.minecraft.registry.Registries
 *  net.minecraft.text.Text
 *  net.minecraft.util.Identifier
 */
package kotakbaz.rain.module.modules.hud;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotakbaz.rain.event.events.OverlayRenderEvent;
import kotakbaz.rain.module.modules.hud.container.Data;
import kotakbaz.rain.ui.mainmenu.RainMainMenuScreen$Btn;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.registry.Registries;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u062e\u0652;
import oxxxde.\u0636\u0643;
import oxxxde.\u0637\u062b;
import oxxxde.\u0637\u063a;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0014\u00a2\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u000e\u00a2\u0006\u0004\b\u001b\u0010\u001cR \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150 8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b&\u0010%R\u0016\u0010'\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b'\u0010(\u00a8\u0006)"}, d2={"Loxxxde/\u0628\u0622;", "Loxxxde/\u0632\u0643;", "<init>", "()V", "Loxxxde/\u062b\u0622;", "event", "", "onOverlayRender", "(Lkotakbaz/rain/event/events/OverlayRenderEvent;)V", "", "Loxxxde/\u0635\u0647;", "Loxxxde/\u062a\u0650;", "getCurrentData", "()Ljava/util/Map;", "", "required", "ensureSnapshotCapacity", "(I)V", "ticks", "durationDisplayKey", "(I)I", "Lnet/minecraft/class_1293;", "effect", "Lnet/minecraft/class_2960;", "effectIconTexture", "(Lnet/minecraft/class_1293;)Lnet/minecraft/class_2960;", "", "durationText", "(I)Ljava/lang/String;", "Ljava/util/LinkedHashMap;", "map", "Ljava/util/LinkedHashMap;", "", "effectSnapshot", "[Lnet/minecraft/class_1293;", "", "amplifierSnapshot", "[I", "durationDisplaySnapshot", "effectCount", "I", "rain-visuals"})
public final class TargetHudModule
extends RainMainMenuScreen$Btn {
    @NotNull
    private static int[] amplifierSnapshot;
    private static int effectCount;
    @NotNull
    private static int[] durationDisplaySnapshot;
    @NotNull
    private static StatusEffectInstance[] effectSnapshot;
    @NotNull
    private static final LinkedHashMap<Data.First, Data.Second> map;
    @NotNull
    public static final TargetHudModule INSTANCE;

    private TargetHudModule() {
        super("Potions", "\u041e\u0442\u043e\u0431\u0440\u0430\u0436\u0430\u0435\u0442 \u0430\u043a\u0442\u0438\u0432\u043d\u044b\u0435 \u0437\u0435\u043b\u044c\u044f", 200.0f, 200.0f, "q");
    }

    private final int durationDisplayKey(int ticks) {
        return ticks == -1 ? -1 : ticks / 20;
    }

    @Commando
    public final void onOverlayRender(@NotNull OverlayRenderEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.renderContainer(event);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    @NotNull
    protected Map<Data.First, Data.Second> getCurrentData() {
        ClientPlayerEntity clientPlayerEntity = \u0636\u0643.getMc().player;
        if (clientPlayerEntity == null) {
            TargetHudModule $this$getCurrentData_u24lambda_u240 = this;
            boolean bl = false;
            if (effectCount != 0) {
                effectCount = 0;
                map.clear();
            }
            return map;
        }
        ClientPlayerEntity player = clientPlayerEntity;
        int nextCount = 0;
        boolean changed = false;
        for (StatusEffectInstance effect : \u0637\u062b.getStatusEffects((LivingEntity)player)) {
            int durationDisplayKey;
            block11: {
                block10: {
                    if (\u062e\u0652.INSTANCE.isInjectedNightVisionEffect(effect)) continue;
                    this.ensureSnapshotCapacity(nextCount + 1);
                    durationDisplayKey = this.durationDisplayKey(effect.getDuration());
                    if (effectSnapshot[nextCount] != effect) break block10;
                    if (amplifierSnapshot[nextCount] != effect.getAmplifier()) break block10;
                    if (durationDisplaySnapshot[nextCount] == durationDisplayKey) break block11;
                }
                changed = true;
            }
            TargetHudModule.effectSnapshot[nextCount] = effect;
            TargetHudModule.amplifierSnapshot[nextCount] = effect.getAmplifier();
            TargetHudModule.durationDisplaySnapshot[nextCount] = durationDisplayKey;
            ++nextCount;
        }
        if (nextCount != effectCount) {
            changed = true;
        }
        effectCount = nextCount;
        if (!changed) {
            return map;
        }
        map.clear();
        int index = 0;
        int n = effectCount;
        while (index < n) {
            void var4_3;
            if (effectSnapshot[index] != null) {
                void var9_14;
                StatusEffectInstance effect;
                String level = effect.getAmplifier() > 0 ? " " + (effect.getAmplifier() + 1) : "";
                String effectName = Text.translatable((String)\u0637\u062b.getTranslationKey(effect)).getString() + level;
                String durationText = this.durationText(effect.getDuration());
                ((Map)map).put(new Data.First(effectName, new Data.Leading.ResourceTexture(this.effectIconTexture(effect))), new Data.Second((String)var9_14, \u0637\u063a.INSTANCE.getVALUE_COLOR()));
            }
            ++var4_3;
        }
        return map;
    }

    private final Identifier effectIconTexture(StatusEffectInstance effect) {
        Identifier identifier = Registries.STATUS_EFFECT.getId(\u0637\u062b.getEffectType(effect).value());
        if (identifier == null) {
            Identifier identifier2 = Identifier.ofVanilla((String)"speed");
            identifier = identifier2;
            Intrinsics.checkNotNullExpressionValue(identifier2, "withDefaultNamespace(...)");
        }
        Identifier effectId = identifier;
        Identifier identifier3 = Identifier.of((String)effectId.getNamespace(), (String)("textures/mob_effect/" + effectId.getPath() + ".png"));
        Intrinsics.checkNotNullExpressionValue(identifier3, "fromNamespaceAndPath(...)");
        return identifier3;
    }

    private final void ensureSnapshotCapacity(int required) {
        if (required <= effectSnapshot.length) {
            return;
        }
        int newSize = Math.max(required, effectSnapshot.length * 2);
        StatusEffectInstance[] statusEffectInstanceArray = Arrays.copyOf(effectSnapshot, newSize);
        Intrinsics.checkNotNullExpressionValue(statusEffectInstanceArray, "copyOf(...)");
        effectSnapshot = statusEffectInstanceArray;
        int[] nArray = Arrays.copyOf(amplifierSnapshot, newSize);
        Intrinsics.checkNotNullExpressionValue(nArray, "copyOf(...)");
        amplifierSnapshot = nArray;
        int[] nArray2 = Arrays.copyOf(durationDisplaySnapshot, newSize);
        Intrinsics.checkNotNullExpressionValue(nArray2, "copyOf(...)");
        durationDisplaySnapshot = nArray2;
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public final String durationText(int ticks) {
        Object object;
        if (ticks == -1) {
            return "**:**";
        }
        int seconds = ticks / 20;
        int minutes = seconds / 60;
        int hours = minutes / 60;
        int normalizedMinutes = minutes % 60;
        int remainingSeconds = seconds % 60;
        if (hours > 0) {
            String string = "%d:%02d:%02d";
            Object[] objectArray = new Object[3];
            objectArray[0] = hours;
            objectArray[1] = normalizedMinutes;
            objectArray[2] = remainingSeconds;
            String string2 = String.format(string, Arrays.copyOf(objectArray, objectArray.length));
            object = string2;
            Intrinsics.checkNotNullExpressionValue(string2, "format(...)");
        } else if (minutes > 0) {
            String string = "%d:%02d";
            Object[] objectArray = new Object[2];
            objectArray[0] = minutes;
            objectArray[1] = remainingSeconds;
            String string3 = String.format(string, Arrays.copyOf(objectArray, objectArray.length));
            object = string3;
            Intrinsics.checkNotNullExpressionValue(string3, "format(...)");
        } else {
            void var2_2;
            object = (int)var2_2 + "s";
        }
        return object;
    }

    static {
        INSTANCE = new TargetHudModule();
        map = new LinkedHashMap();
        effectSnapshot = new StatusEffectInstance[8];
        amplifierSnapshot = new int[8];
        durationDisplaySnapshot = new int[8];
    }
}

