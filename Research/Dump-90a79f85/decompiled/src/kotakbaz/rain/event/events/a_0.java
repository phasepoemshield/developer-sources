/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.event.events;

import kotlin.Metadata;

/*
 * Renamed from kotakbaz.rain.event.events.a
 */
@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r\u00a8\u0006\u000e"}, d2={"Lkotakbaz/rain/event/events/DropEvent;", "Lkotakbaz/rain/event/types/EventCancellable;", "", "selectedSlot", "", "entireStack", "<init>", "(IZ)V", "I", "getSelectedSlot", "()I", "Z", "getEntireStack", "()Z", "rain-visuals"})
public final class a_0
extends kotakbaz.rain.event.types.a_0 {
    private final int a;
    private final boolean A;

    public a_0(int n, boolean bl) {
        super();
        this.a = n;
        this.A = bl;
    }

    public final int getSelectedSlot() {
        return this.a;
    }

    public final boolean getEntireStack() {
        return this.A;
    }
}

