/*
 * Decompiled with CFR 0.152.
 */
package kotlin.io.path;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.io.path.ExperimentalPathApi;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2={"Lkotlin/io/path/OnErrorResult;", "", "<init>", "(Ljava/lang/String;I)V", "SKIP_SUBTREE", "TERMINATE", "kotlin-stdlib-jdk7"})
@SinceKotlin(version="1.8")
@ExperimentalPathApi
public final class OnErrorResult
extends Enum<OnErrorResult> {
    private static final /* synthetic */ OnErrorResult[] $VALUES;
    private static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* enum */ OnErrorResult SKIP_SUBTREE = new OnErrorResult();
    public static final /* enum */ OnErrorResult TERMINATE = new OnErrorResult();

    public static OnErrorResult valueOf(String value) {
        return Enum.valueOf(OnErrorResult.class, value);
    }

    public static OnErrorResult[] values() {
        return (OnErrorResult[])$VALUES.clone();
    }

    private static final /* synthetic */ OnErrorResult[] $values() {
        OnErrorResult[] onErrorResultArray = new OnErrorResult[2];
        onErrorResultArray[0] = SKIP_SUBTREE;
        onErrorResultArray[1] = TERMINATE;
        return onErrorResultArray;
    }

    @NotNull
    public static EnumEntries<OnErrorResult> getEntries() {
        return $ENTRIES;
    }

    static {
        $VALUES = OnErrorResult.$values();
        $ENTRIES = EnumEntriesKt.enumEntries((Enum[])$VALUES);
    }
}

