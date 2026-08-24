/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.event.events;

import kotakbaz.rain.event.types.Event;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u062e\u0642;
import oxxxde.\u0630\u0624;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0005"}, d2={"Loxxxde/\u062a\u0632;", "Loxxxde/\u0630\u0624;", "<init>", "()V", "Companion", "rain-visuals"})
public final class KeyEvent
extends \u0630\u0624 {
    @NotNull
    private static final Event.Key<Boolean> MOUSE;
    @NotNull
    private static final Event.Key<Integer> BUTTON;
    @NotNull
    public static final \u062e\u0642 Companion;
    @NotNull
    private static final Event.Key<Boolean> RELEASE;

    static {
        Companion = new \u062e\u0642(null);
        BUTTON = new Event.Key();
        RELEASE = new Event.Key();
        MOUSE = new Event.Key();
    }

    public static final /* synthetic */ Event.Key access$getMOUSE$cp() {
        return MOUSE;
    }

    public static final /* synthetic */ Event.Key access$getRELEASE$cp() {
        return RELEASE;
    }

    public static final /* synthetic */ Event.Key access$getBUTTON$cp() {
        return BUTTON;
    }
}

