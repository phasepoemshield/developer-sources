/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import kotakbaz.rain.client.listener.Listener;
import kotakbaz.rain.client.liteapi.HolyWorldFeatureControl;
import kotakbaz.rain.event.events.PlayerUpdateEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u062e\u064b;
import oxxxde.\u0631\u0638;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007\u00a2\u0006\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2={"Loxxxde/\u0639\u062b;", "Loxxxde/\u062a\u0645;", "<init>", "()V", "", "init", "Loxxxde/\u0633\u062d;", "event", "onUpdate", "(Lkotakbaz/rain/event/events/PlayerUpdateEvent;)V", "rain-visuals"})
public final class \u0639\u062b
extends Listener {
    @NotNull
    public static final \u0639\u062b INSTANCE = new \u0639\u062b();

    @Override
    public void init() {
        \u0631\u0638.INSTANCE.register(this);
        \u062e\u064b.INSTANCE.syncAvailabilityStates();
    }

    private \u0639\u062b() {
    }

    @Commando
    public final void onUpdate(@NotNull PlayerUpdateEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        HolyWorldFeatureControl.INSTANCE.tick();
        \u062e\u064b.INSTANCE.syncAvailabilityStates();
    }
}

