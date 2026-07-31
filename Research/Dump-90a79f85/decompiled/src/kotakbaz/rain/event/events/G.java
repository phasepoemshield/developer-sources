/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.event.events;

import kotakbaz.rain.event.events.c;
import kotakbaz.rain.event.events.c_0;
import kotakbaz.rain.event.types.A;
import kotakbaz.rain.event.types.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0005"}, d2={"Lkotakbaz/rain/event/events/KeyEvent;", "Lkotakbaz/rain/event/types/Event;", "<init>", "()V", "Companion", "rain-visuals"})
public final class G
extends A {
    @NotNull
    public static final c_0 a = new c(null);
    @NotNull
    private static final b<Integer> A = new b();
    @NotNull
    private static final b<Boolean> b = new b();
    @NotNull
    private static final b<Boolean> B = new b();

    public G() {
        super();
    }

    public static final /* synthetic */ b access$getBUTTON$cp() {
        return A;
    }

    public static final /* synthetic */ b access$getRELEASE$cp() {
        return b;
    }

    public static final /* synthetic */ b access$getMOUSE$cp() {
        return B;
    }
}

