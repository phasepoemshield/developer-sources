/*
 * Decompiled with CFR 0.152.
 */
package kotlin.internal;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0081\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2={"Lkotlin/internal/RequireKotlinVersionKind;", "", "<init>", "(Ljava/lang/String;I)V", "LANGUAGE_VERSION", "COMPILER_VERSION", "API_VERSION", "kotlin-stdlib"})
@SinceKotlin(version="1.2")
public final class RequireKotlinVersionKind
extends Enum<RequireKotlinVersionKind> {
    public static final /* enum */ RequireKotlinVersionKind API_VERSION;
    private static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* enum */ RequireKotlinVersionKind LANGUAGE_VERSION;
    public static final /* enum */ RequireKotlinVersionKind COMPILER_VERSION;
    private static final /* synthetic */ RequireKotlinVersionKind[] $VALUES;

    private static final /* synthetic */ RequireKotlinVersionKind[] $values() {
        RequireKotlinVersionKind[] requireKotlinVersionKindArray = new RequireKotlinVersionKind[3];
        requireKotlinVersionKindArray[0] = LANGUAGE_VERSION;
        requireKotlinVersionKindArray[1] = COMPILER_VERSION;
        requireKotlinVersionKindArray[2] = API_VERSION;
        return requireKotlinVersionKindArray;
    }

    static {
        LANGUAGE_VERSION = new RequireKotlinVersionKind();
        COMPILER_VERSION = new RequireKotlinVersionKind();
        API_VERSION = new RequireKotlinVersionKind();
        $VALUES = RequireKotlinVersionKind.$values();
        $ENTRIES = EnumEntriesKt.enumEntries((Enum[])$VALUES);
    }

    public static RequireKotlinVersionKind[] values() {
        return (RequireKotlinVersionKind[])$VALUES.clone();
    }

    @NotNull
    public static EnumEntries<RequireKotlinVersionKind> getEntries() {
        return $ENTRIES;
    }

    public static RequireKotlinVersionKind valueOf(String value) {
        return Enum.valueOf(RequireKotlinVersionKind.class, value);
    }
}

