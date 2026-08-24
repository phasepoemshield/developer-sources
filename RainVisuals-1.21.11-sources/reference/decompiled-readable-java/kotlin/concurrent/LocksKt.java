/*
 * Decompiled with CFR 0.152.
 */
package kotlin.concurrent;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mv={1, 9, 0}, k=2, xi=48, d1={"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a8\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0087\b\u00f8\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u00a2\u0006\u0004\b\u0004\u0010\u0005\u001a8\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0087\b\u00f8\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u00a2\u0006\u0004\b\u0007\u0010\b\u001a8\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0087\b\u00f8\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u00a2\u0006\u0004\b\t\u0010\u0005\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\n"}, d2={"T", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "Lkotlin/Function0;", "action", "read", "(Ljava/util/concurrent/locks/ReentrantReadWriteLock;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Ljava/util/concurrent/locks/Lock;", "withLock", "(Ljava/util/concurrent/locks/Lock;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "write", "kotlin-stdlib"})
@JvmName(name="LocksKt")
public final class LocksKt {
    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @InlineOnly
    private static final <T> T read(ReentrantReadWriteLock $this$read, Function0<? extends T> action) {
        Intrinsics.checkNotNullParameter($this$read, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        ReentrantReadWriteLock.ReadLock rl = $this$read.readLock();
        rl.lock();
        try {
            T t = action.invoke();
            return t;
        }
        finally {
            InlineMarker.finallyStart(1);
            rl.unlock();
            InlineMarker.finallyEnd(1);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @InlineOnly
    private static final <T> T withLock(Lock $this$withLock, Function0<? extends T> action) {
        Intrinsics.checkNotNullParameter($this$withLock, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        $this$withLock.lock();
        try {
            T t = action.invoke();
            return t;
        }
        finally {
            InlineMarker.finallyStart(1);
            $this$withLock.unlock();
            InlineMarker.finallyEnd(1);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    @InlineOnly
    private static final <T> T write(ReentrantReadWriteLock $this$write, Function0<? extends T> action) {
        int n;
        T t;
        Intrinsics.checkNotNullParameter($this$write, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        ReentrantReadWriteLock.ReadLock rl = $this$write.readLock();
        int readCount = $this$write.getWriteHoldCount() == 0 ? $this$write.getReadHoldCount() : 0;
        int n2 = 0;
        while (n2 < readCount) {
            int it = n2++;
            boolean bl = false;
            rl.unlock();
        }
        ReentrantReadWriteLock.WriteLock wl = $this$write.writeLock();
        wl.lock();
        try {
            t = action.invoke();
        }
        catch (Throwable throwable) {
            void var4_5;
            InlineMarker.finallyStart(1);
            n = 0;
            while (n < readCount) {
                int n3 = n++;
                boolean bl = false;
                rl.lock();
            }
            var4_5.unlock();
            InlineMarker.finallyEnd(1);
            throw throwable;
        }
        InlineMarker.finallyStart(1);
        n = 0;
        while (n < readCount) {
            int it = n++;
            boolean bl = false;
            rl.lock();
        }
        wl.unlock();
        InlineMarker.finallyEnd(1);
        return t;
    }
}

