/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.item.Items
 *  ru.ocz.protection.annotation.Compile
 */
package oxxxde;

import kotakbaz.rain.event.events.PlayerUpdateEvent;
import kotakbaz.rain.mixin.MinecraftClientAccessor;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.setting.settings.BooleanSetting;
import kotakbaz.rain.module.setting.settings.SliderSetting;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.item.Items;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u0627\u064f;
import oxxxde.\u062b\u0648;
import oxxxde.\u0636\u0643;
import oxxxde.\u0638\u0646;
import ru.ocz.protection.annotation.Compile;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2={"Loxxxde/\u0633\u0647;", "Loxxxde/\u062f\u0650;", "<init>", "()V", "Loxxxde/\u0633\u062d;", "event", "", "onUpdate", "(Lkotakbaz/rain/event/events/PlayerUpdateEvent;)V", "Loxxxde/\u0637\u064f;", "speed", "Loxxxde/\u0637\u064f;", "Loxxxde/\u062e\u0630;", "onlyWithoutPvp", "Loxxxde/\u062e\u0630;", "rain-visuals"})
public final class \u0633\u0647
extends Module {
    @NotNull
    private static final SliderSetting speed;
    @NotNull
    public static final \u0633\u0647 INSTANCE;
    @NotNull
    private static final BooleanSetting onlyWithoutPvp;

    static {
        INSTANCE = new \u0633\u0647();
        speed = Module.slider$default(INSTANCE, "\u0421\u043a\u043e\u0440\u043e\u0441\u0442\u044c", 4.0f, 1.0f, 4.0f, 1.0f, null, 32, null);
        onlyWithoutPvp = Module.boolean$default(INSTANCE, "\u0422\u043e\u043b\u044c\u043a\u043e \u0431\u0435\u0437 \u043f\u0432\u043f", false, null, 4, null);
        \u0627\u064f.moduleOnFuntime$default(\u0627\u064f.INSTANCE, INSTANCE, null, 2, null);
    }

    @Commando
    @Compile
    public final void onUpdate(@NotNull PlayerUpdateEvent playerUpdateEvent) {
        Intrinsics.checkNotNullParameter(playerUpdateEvent, "event");
        ClientPlayerEntity clientPlayerEntity = \u0636\u0643.getMc().player;
        if (clientPlayerEntity == null) {
            return;
        }
        if (\u0636\u0643.getMc().world == null) {
            return;
        }
        if (((Boolean)onlyWithoutPvp.getValue()).booleanValue() && \u062b\u0648.INSTANCE.isCombatTagged()) {
            return;
        }
        if (!clientPlayerEntity.getMainHandStack().isOf(Items.EXPERIENCE_BOTTLE) && !clientPlayerEntity.getOffHandStack().isOf(Items.EXPERIENCE_BOTTLE)) {
            return;
        }
        Object object = \u0636\u0643.getMc();
        if (!(object instanceof MinecraftClientAccessor)) {
            return;
        }
        object = (MinecraftClientAccessor)object;
        int n = RangesKt.coerceAtLeast(5 - (int)((Number)speed.getValue()).floatValue(), 0);
        if (object.rain$getItemUseCooldown() > n) {
            object.rain$setItemUseCooldown(n);
        }
    }

    private \u0633\u0647() {
        super("FastExp", \u0638\u0646.getPLAYER(), "\u0411\u044b\u0441\u0442\u0440\u044b\u0439 \u0431\u0440\u043e\u0441\u043e\u043a \u043f\u0443\u0437\u044b\u0440\u044c\u043a\u043e\u0432 \u043e\u043f\u044b\u0442\u0430>");
    }
}

