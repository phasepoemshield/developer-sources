/*
 * Decompiled with CFR 0.152.
 */
package kotlin.coroutines.cancellation;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;

@Metadata(mv={1, 9, 0}, k=2, xi=48, d1={"\u0000 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a(\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0087\b\u00a2\u0006\u0004\b\u0006\u0010\u0007\u001a\u001e\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0087\b\u00a2\u0006\u0004\b\u0006\u0010\b*\u001a\b\u0007\u0010\u0006\"\u00020\u00042\u00020\u0004B\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u00a8\u0006\f"}, d2={"", "message", "", "cause", "Ljava/util/concurrent/CancellationException;", "Lkotlin/coroutines/cancellation/CancellationException;", "CancellationException", "(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;", "(Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;", "Lkotlin/SinceKotlin;", "version", "1.4", "kotlin-stdlib"})
public final class CancellationExceptionKt {
    @InlineOnly
    @SinceKotlin(version="1.4")
    private static final CancellationException CancellationException(String message, Throwable cause) {
        CancellationException cancellationException = new CancellationException(message);
        CancellationException it = cancellationException;
        boolean bl = false;
        it.initCause(cause);
        return cancellationException;
    }

    @InlineOnly
    @SinceKotlin(version="1.4")
    private static final CancellationException CancellationException(Throwable cause) {
        CancellationException cancellationException;
        Throwable throwable = cause;
        CancellationException it = cancellationException = new CancellationException(throwable != null ? throwable.toString() : null);
        boolean bl = false;
        it.initCause(cause);
        return cancellationException;
    }

    @SinceKotlin(version="1.4")
    public static /* synthetic */ void CancellationException$annotations() {
    }
}

