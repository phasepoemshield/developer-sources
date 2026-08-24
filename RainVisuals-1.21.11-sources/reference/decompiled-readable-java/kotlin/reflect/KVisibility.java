/*
 * Decompiled with CFR 0.152.
 */
package kotlin.reflect;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007\u00a8\u0006\b"}, d2={"Lkotlin/reflect/KVisibility;", "", "<init>", "(Ljava/lang/String;I)V", "PUBLIC", "PROTECTED", "INTERNAL", "PRIVATE", "kotlin-stdlib"})
@SinceKotlin(version="1.1")
public final class KVisibility
extends Enum<KVisibility> {
    private static final /* synthetic */ KVisibility[] $VALUES;
    public static final /* enum */ KVisibility PUBLIC = new KVisibility();
    public static final /* enum */ KVisibility PRIVATE;
    public static final /* enum */ KVisibility INTERNAL;
    public static final /* enum */ KVisibility PROTECTED;
    private static final /* synthetic */ EnumEntries $ENTRIES;

    @NotNull
    public static EnumEntries<KVisibility> getEntries() {
        return $ENTRIES;
    }

    public static KVisibility valueOf(String value) {
        return Enum.valueOf(KVisibility.class, value);
    }

    public static KVisibility[] values() {
        return (KVisibility[])$VALUES.clone();
    }

    static {
        PROTECTED = new KVisibility();
        INTERNAL = new KVisibility();
        PRIVATE = new KVisibility();
        $VALUES = KVisibility.$values();
        $ENTRIES = EnumEntriesKt.enumEntries((Enum[])$VALUES);
    }

    private static final /* synthetic */ KVisibility[] $values() {
        KVisibility[] kVisibilityArray = new KVisibility[4];
        kVisibilityArray[0] = PUBLIC;
        kVisibilityArray[1] = PROTECTED;
        kVisibilityArray[2] = INTERNAL;
        kVisibilityArray[3] = PRIVATE;
        return kVisibilityArray;
    }
}

