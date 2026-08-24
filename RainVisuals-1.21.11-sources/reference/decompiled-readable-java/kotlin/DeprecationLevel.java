/*
 * Decompiled with CFR 0.152.
 */
package kotlin;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2={"Lkotlin/DeprecationLevel;", "", "<init>", "(Ljava/lang/String;I)V", "WARNING", "ERROR", "HIDDEN", "kotlin-stdlib"})
public final class DeprecationLevel
extends Enum<DeprecationLevel> {
    public static final /* enum */ DeprecationLevel ERROR;
    public static final /* enum */ DeprecationLevel HIDDEN;
    private static final /* synthetic */ DeprecationLevel[] $VALUES;
    private static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* enum */ DeprecationLevel WARNING;

    @NotNull
    public static EnumEntries<DeprecationLevel> getEntries() {
        return $ENTRIES;
    }

    private static final /* synthetic */ DeprecationLevel[] $values() {
        DeprecationLevel[] deprecationLevelArray = new DeprecationLevel[3];
        deprecationLevelArray[0] = WARNING;
        deprecationLevelArray[1] = ERROR;
        deprecationLevelArray[2] = HIDDEN;
        return deprecationLevelArray;
    }

    static {
        WARNING = new DeprecationLevel();
        ERROR = new DeprecationLevel();
        HIDDEN = new DeprecationLevel();
        $VALUES = DeprecationLevel.$values();
        $ENTRIES = EnumEntriesKt.enumEntries((Enum[])$VALUES);
    }

    public static DeprecationLevel valueOf(String value) {
        return Enum.valueOf(DeprecationLevel.class, value);
    }

    public static DeprecationLevel[] values() {
        return (DeprecationLevel[])$VALUES.clone();
    }
}

