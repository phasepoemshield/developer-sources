/*
 * Decompiled with CFR 0.152.
 */
package kotlin;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2={"Lkotlin/NotImplementedError;", "Ljava/lang/Error;", "Lkotlin/Error;", "", "message", "<init>", "(Ljava/lang/String;)V", "kotlin-stdlib"})
public final class NotImplementedError
extends Error {
    public NotImplementedError() {
        this(null, 1, null);
    }

    public NotImplementedError(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        super(message);
    }

    public /* synthetic */ NotImplementedError(String string, int n, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 1) != 0) {
            string = "An operation is not implemented.";
        }
        this(string);
    }
}

