/*
 * Decompiled with CFR 0.152.
 */
package kotlin.reflect;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2={"Lkotlin/reflect/KVariance;", "", "<init>", "(Ljava/lang/String;I)V", "INVARIANT", "IN", "OUT", "kotlin-stdlib"})
@SinceKotlin(version="1.1")
public final class KVariance
extends Enum<KVariance> {
    public static final /* enum */ KVariance OUT;
    public static final /* enum */ KVariance IN;
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ KVariance[] $VALUES;
    public static final /* enum */ KVariance INVARIANT;

    @NotNull
    public static EnumEntries<KVariance> getEntries() {
        return $ENTRIES;
    }

    public static KVariance[] values() {
        return (KVariance[])$VALUES.clone();
    }

    private static final /* synthetic */ KVariance[] $values() {
        KVariance[] kVarianceArray = new KVariance[3];
        kVarianceArray[0] = INVARIANT;
        kVarianceArray[1] = IN;
        kVarianceArray[2] = OUT;
        return kVarianceArray;
    }

    static {
        INVARIANT = new KVariance();
        IN = new KVariance();
        OUT = new KVariance();
        $VALUES = KVariance.$values();
        $ENTRIES = EnumEntriesKt.enumEntries((Enum[])$VALUES);
    }

    public static KVariance valueOf(String value) {
        return Enum.valueOf(KVariance.class, value);
    }
}

