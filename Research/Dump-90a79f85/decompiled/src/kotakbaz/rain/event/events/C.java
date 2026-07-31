/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.event.events;

import kotakbaz.rain.event.events.e;
import kotakbaz.rain.event.events.e_0;
import kotakbaz.rain.event.types.A;
import kotakbaz.rain.event.types.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0005"}, d2={"Lkotakbaz/rain/event/events/OverlayRenderEvent;", "Lkotakbaz/rain/event/types/Event;", "<init>", "()V", "Companion", "rain-visuals"})
public final class C
extends A {
    @NotNull
    public static final e_0 a = new e(null);
    @NotNull
    private static final b<Float> A = new b();
    @NotNull
    private static final b<Integer> b = new b();
    @NotNull
    private static final b<Integer> B = new b();

    public C() {
        super();
    }

    public static final /* synthetic */ b access$getPARTIAL_TICKS$cp() {
        return A;
    }

    public static final /* synthetic */ b access$getMOUSE_X$cp() {
        return b;
    }

    public static final /* synthetic */ b access$getMOUSE_Y$cp() {
        return B;
    }
}

