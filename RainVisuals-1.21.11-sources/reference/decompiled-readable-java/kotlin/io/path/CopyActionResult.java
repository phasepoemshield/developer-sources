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

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2={"Lkotlin/io/path/CopyActionResult;", "", "<init>", "(Ljava/lang/String;I)V", "CONTINUE", "SKIP_SUBTREE", "TERMINATE", "kotlin-stdlib-jdk7"})
@ExperimentalPathApi
@SinceKotlin(version="1.8")
public final class CopyActionResult
extends Enum<CopyActionResult> {
    private static final /* synthetic */ CopyActionResult[] $VALUES;
    public static final /* enum */ CopyActionResult CONTINUE = new CopyActionResult();
    public static final /* enum */ CopyActionResult TERMINATE;
    private static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* enum */ CopyActionResult SKIP_SUBTREE;

    static {
        SKIP_SUBTREE = new CopyActionResult();
        TERMINATE = new CopyActionResult();
        $VALUES = CopyActionResult.$values();
        $ENTRIES = EnumEntriesKt.enumEntries((Enum[])$VALUES);
    }

    public static CopyActionResult valueOf(String value) {
        return Enum.valueOf(CopyActionResult.class, value);
    }

    public static CopyActionResult[] values() {
        return (CopyActionResult[])$VALUES.clone();
    }

    private static final /* synthetic */ CopyActionResult[] $values() {
        CopyActionResult[] copyActionResultArray = new CopyActionResult[3];
        copyActionResultArray[0] = CONTINUE;
        copyActionResultArray[1] = SKIP_SUBTREE;
        copyActionResultArray[2] = TERMINATE;
        return copyActionResultArray;
    }

    @NotNull
    public static EnumEntries<CopyActionResult> getEntries() {
        return $ENTRIES;
    }
}

