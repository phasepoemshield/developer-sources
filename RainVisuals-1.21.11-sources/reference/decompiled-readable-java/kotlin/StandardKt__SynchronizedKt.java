/*
 * Decompiled with CFR 0.152.
 */
package kotlin;

import kotlin.Metadata;
import kotlin.StandardKt__StandardKt;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@Metadata(mv={1, 9, 0}, k=5, xi=49, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a<\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0087\b\u00f8\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001\u00a2\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u0007"}, d2={"R", "", "lock", "Lkotlin/Function0;", "block", "synchronized", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "kotlin-stdlib"}, xs="kotlin/StandardKt")
class StandardKt__SynchronizedKt
extends StandardKt__StandardKt {
    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @InlineOnly
    private static final <R> R synchronized(Object lock, Function0<? extends R> block) {
        Intrinsics.checkNotNullParameter(lock, "lock");
        Intrinsics.checkNotNullParameter(block, "block");
        Object lockLocal = lock;
        synchronized (lockLocal) {
            try {
                R r = block.invoke();
                return r;
            }
            finally {
                InlineMarker.finallyStart(1);
                // MONITOREXIT @DISABLED, blocks:[1, 3] lbl15 : MonitorExitStatement: MONITOREXIT : lockLocal
                InlineMarker.finallyEnd(1);
            }
        }
    }
}

