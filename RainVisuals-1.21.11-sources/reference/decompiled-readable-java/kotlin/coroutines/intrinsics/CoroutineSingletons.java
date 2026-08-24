/*
 * Decompiled with CFR 0.152.
 */
package kotlin.coroutines.intrinsics;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0081\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2={"Lkotlin/coroutines/intrinsics/CoroutineSingletons;", "", "<init>", "(Ljava/lang/String;I)V", "COROUTINE_SUSPENDED", "UNDECIDED", "RESUMED", "kotlin-stdlib"})
@PublishedApi
@SinceKotlin(version="1.3")
public final class CoroutineSingletons
extends Enum<CoroutineSingletons> {
    public static final /* enum */ CoroutineSingletons COROUTINE_SUSPENDED = new CoroutineSingletons();
    private static final /* synthetic */ CoroutineSingletons[] $VALUES;
    public static final /* enum */ CoroutineSingletons RESUMED;
    public static final /* enum */ CoroutineSingletons UNDECIDED;
    private static final /* synthetic */ EnumEntries $ENTRIES;

    @NotNull
    public static EnumEntries<CoroutineSingletons> getEntries() {
        return $ENTRIES;
    }

    public static CoroutineSingletons valueOf(String value) {
        return Enum.valueOf(CoroutineSingletons.class, value);
    }

    private static final /* synthetic */ CoroutineSingletons[] $values() {
        CoroutineSingletons[] coroutineSingletonsArray = new CoroutineSingletons[3];
        coroutineSingletonsArray[0] = COROUTINE_SUSPENDED;
        coroutineSingletonsArray[1] = UNDECIDED;
        coroutineSingletonsArray[2] = RESUMED;
        return coroutineSingletonsArray;
    }

    public static CoroutineSingletons[] values() {
        return (CoroutineSingletons[])$VALUES.clone();
    }

    static {
        UNDECIDED = new CoroutineSingletons();
        RESUMED = new CoroutineSingletons();
        $VALUES = CoroutineSingletons.$values();
        $ENTRIES = EnumEntriesKt.enumEntries((Enum[])$VALUES);
    }
}

