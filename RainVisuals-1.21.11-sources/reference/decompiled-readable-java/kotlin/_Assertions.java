/*
 * Decompiled with CFR 0.152.
 */
package kotlin;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c1\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0081\u0004\u00a2\u0006\f\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\u0007\u0010\u0003\u00a8\u0006\b"}, d2={"Lkotlin/_Assertions;", "", "<init>", "()V", "", "ENABLED", "Z", "getENABLED$annotations", "kotlin-stdlib"})
@PublishedApi
public final class _Assertions {
    @JvmField
    public static final boolean ENABLED;
    @NotNull
    public static final _Assertions INSTANCE;

    @PublishedApi
    public static /* synthetic */ void getENABLED$annotations() {
    }

    static {
        INSTANCE = new _Assertions();
        ENABLED = INSTANCE.getClass().desiredAssertionStatus();
    }

    private _Assertions() {
    }
}

