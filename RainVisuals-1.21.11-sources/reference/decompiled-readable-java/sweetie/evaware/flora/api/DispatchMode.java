/*
 * Decompiled with CFR 0.152.
 */
package sweetie.evaware.flora.api;

public final class DispatchMode
extends Enum<DispatchMode> {
    public static final /* enum */ DispatchMode SYNC = new DispatchMode();
    public static final /* enum */ DispatchMode ASYNC_PARALLEL;
    private static final /* synthetic */ DispatchMode[] $VALUES;
    public static final /* enum */ DispatchMode ASYNC;

    public static DispatchMode[] values() {
        return (DispatchMode[])$VALUES.clone();
    }

    private static /* synthetic */ DispatchMode[] $values() {
        DispatchMode[] dispatchModeArray = new DispatchMode[3];
        dispatchModeArray[0] = SYNC;
        dispatchModeArray[1] = ASYNC;
        dispatchModeArray[2] = ASYNC_PARALLEL;
        return dispatchModeArray;
    }

    public static DispatchMode valueOf(String name) {
        return Enum.valueOf(DispatchMode.class, name);
    }

    static {
        ASYNC = new DispatchMode();
        ASYNC_PARALLEL = new DispatchMode();
        $VALUES = DispatchMode.$values();
    }
}

