/*
 * Decompiled with CFR 0.152.
 */
package kotlin.collections;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007\u00a8\u0006\b"}, d2={"Lkotlin/collections/State;", "", "<init>", "(Ljava/lang/String;I)V", "Ready", "NotReady", "Done", "Failed", "kotlin-stdlib"})
final class State
extends Enum<State> {
    public static final /* enum */ State Done;
    private static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* enum */ State Failed;
    public static final /* enum */ State NotReady;
    private static final /* synthetic */ State[] $VALUES;
    public static final /* enum */ State Ready;

    public static State[] values() {
        return (State[])$VALUES.clone();
    }

    @NotNull
    public static EnumEntries<State> getEntries() {
        return $ENTRIES;
    }

    private static final /* synthetic */ State[] $values() {
        State[] stateArray = new State[4];
        stateArray[0] = Ready;
        stateArray[1] = NotReady;
        stateArray[2] = Done;
        stateArray[3] = Failed;
        return stateArray;
    }

    public static State valueOf(String value) {
        return Enum.valueOf(State.class, value);
    }

    static {
        Ready = new State();
        NotReady = new State();
        Done = new State();
        Failed = new State();
        $VALUES = State.$values();
        $ENTRIES = EnumEntriesKt.enumEntries((Enum[])$VALUES);
    }
}

