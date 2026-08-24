/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00060\u0001j\u0002`\u0002B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006\u00a2\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\u0012\u0010\u000e\u00a8\u0006\u0013"}, d2={"Loxxxde/\u0634\u0626;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", "code", "", "cause", "", "httpStatus", "details", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/Integer;Ljava/lang/String;)V", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "Ljava/lang/Integer;", "getHttpStatus", "()Ljava/lang/Integer;", "getDetails", "rain-visuals"})
public final class \u0634\u0626
extends RuntimeException {
    @NotNull
    private final String code;
    @Nullable
    private final Integer httpStatus;
    @Nullable
    private final String details;

    @Nullable
    public final String getDetails() {
        return this.details;
    }

    @Nullable
    public final Integer getHttpStatus() {
        return this.httpStatus;
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    public /* synthetic */ \u0634\u0626(String string, Throwable throwable, Integer n, String string2, int n2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n2 & 2) != 0) {
            throwable = null;
        }
        if ((n2 & 4) != 0) {
            n = null;
        }
        if ((n2 & 8) != 0) {
            string2 = null;
        }
        this(string, throwable, n, string2);
    }

    public \u0634\u0626(@NotNull String code, @Nullable Throwable cause, @Nullable Integer httpStatus, @Nullable String details) {
        Intrinsics.checkNotNullParameter(code, "code");
        super(code, cause);
        this.code = code;
        this.httpStatus = httpStatus;
        this.details = details;
    }
}

