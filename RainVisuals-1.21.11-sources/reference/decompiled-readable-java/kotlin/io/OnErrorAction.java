/*
 * Decompiled with CFR 0.152.
 */
package kotlin.io;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2={"Lkotlin/io/OnErrorAction;", "", "<init>", "(Ljava/lang/String;I)V", "SKIP", "TERMINATE", "kotlin-stdlib"})
public final class OnErrorAction
extends Enum<OnErrorAction> {
    public static final /* enum */ OnErrorAction TERMINATE;
    private static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* enum */ OnErrorAction SKIP;
    private static final /* synthetic */ OnErrorAction[] $VALUES;

    @NotNull
    public static EnumEntries<OnErrorAction> getEntries() {
        return $ENTRIES;
    }

    public static OnErrorAction[] values() {
        return (OnErrorAction[])$VALUES.clone();
    }

    static {
        SKIP = new OnErrorAction();
        TERMINATE = new OnErrorAction();
        $VALUES = OnErrorAction.$values();
        $ENTRIES = EnumEntriesKt.enumEntries((Enum[])$VALUES);
    }

    public static OnErrorAction valueOf(String value) {
        return Enum.valueOf(OnErrorAction.class, value);
    }

    private static final /* synthetic */ OnErrorAction[] $values() {
        OnErrorAction[] onErrorActionArray = new OnErrorAction[2];
        onErrorActionArray[0] = SKIP;
        onErrorActionArray[1] = TERMINATE;
        return onErrorActionArray;
    }
}

