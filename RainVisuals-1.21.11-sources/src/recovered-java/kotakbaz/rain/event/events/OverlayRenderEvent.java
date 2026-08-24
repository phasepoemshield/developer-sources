/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.event.events;

import kotakbaz.rain.event.types.Event;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u062d\u062b;
import oxxxde.\u0630\u0624;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0005"}, d2={"Loxxxde/\u062b\u0622;", "Loxxxde/\u0630\u0624;", "<init>", "()V", "Companion", "rain-visuals"})
public final class OverlayRenderEvent
extends \u0630\u0624 {
    @NotNull
    public static final \u062d\u062b Companion = new \u062d\u062b(null);
    @NotNull
    private static final Event.Key<Integer> MOUSE_Y;
    @NotNull
    private static final Event.Key<Float> PARTIAL_TICKS;
    @NotNull
    private static final Event.Key<Integer> MOUSE_X;

    static {
        PARTIAL_TICKS = new Event.Key();
        MOUSE_X = new Event.Key();
        MOUSE_Y = new Event.Key();
    }

    public static final /* synthetic */ Event.Key access$getMOUSE_X$cp() {
        return MOUSE_X;
    }

    public static final /* synthetic */ Event.Key access$getPARTIAL_TICKS$cp() {
        return PARTIAL_TICKS;
    }

    public static final /* synthetic */ Event.Key access$getMOUSE_Y$cp() {
        return MOUSE_Y;
    }
}

