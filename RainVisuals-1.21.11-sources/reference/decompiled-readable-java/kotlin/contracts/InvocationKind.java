/*
 * Decompiled with CFR 0.152.
 */
package kotlin.contracts;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.contracts.ExperimentalContracts;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.internal.ContractsDsl;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007\u00a8\u0006\b"}, d2={"Lkotlin/contracts/InvocationKind;", "", "<init>", "(Ljava/lang/String;I)V", "AT_MOST_ONCE", "AT_LEAST_ONCE", "EXACTLY_ONCE", "UNKNOWN", "kotlin-stdlib"})
@ContractsDsl
@SinceKotlin(version="1.3")
@ExperimentalContracts
public final class InvocationKind
extends Enum<InvocationKind> {
    @ContractsDsl
    public static final /* enum */ InvocationKind AT_LEAST_ONCE;
    @ContractsDsl
    public static final /* enum */ InvocationKind AT_MOST_ONCE;
    private static final /* synthetic */ InvocationKind[] $VALUES;
    @ContractsDsl
    public static final /* enum */ InvocationKind EXACTLY_ONCE;
    private static final /* synthetic */ EnumEntries $ENTRIES;
    @ContractsDsl
    public static final /* enum */ InvocationKind UNKNOWN;

    @NotNull
    public static EnumEntries<InvocationKind> getEntries() {
        return $ENTRIES;
    }

    public static InvocationKind valueOf(String value) {
        return Enum.valueOf(InvocationKind.class, value);
    }

    private static final /* synthetic */ InvocationKind[] $values() {
        InvocationKind[] invocationKindArray = new InvocationKind[4];
        invocationKindArray[0] = AT_MOST_ONCE;
        invocationKindArray[1] = AT_LEAST_ONCE;
        invocationKindArray[2] = EXACTLY_ONCE;
        invocationKindArray[3] = UNKNOWN;
        return invocationKindArray;
    }

    static {
        AT_MOST_ONCE = new InvocationKind();
        AT_LEAST_ONCE = new InvocationKind();
        EXACTLY_ONCE = new InvocationKind();
        UNKNOWN = new InvocationKind();
        $VALUES = InvocationKind.$values();
        $ENTRIES = EnumEntriesKt.enumEntries((Enum[])$VALUES);
    }

    public static InvocationKind[] values() {
        return (InvocationKind[])$VALUES.clone();
    }
}

