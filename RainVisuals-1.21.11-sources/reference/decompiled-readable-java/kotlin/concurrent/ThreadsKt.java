/*
 * Decompiled with CFR 0.152.
 */
package kotlin.concurrent;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=2, xi=48, d1={"\u0000:\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aQ\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\u0004\b\r\u0010\u000e\u001a5\u0010\u0013\u001a\u00028\u0000\"\b\b\u0000\u0010\u0010*\u00020\u000f*\b\u0012\u0004\u0012\u00028\u00000\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u0015"}, d2={"", "start", "isDaemon", "Ljava/lang/ClassLoader;", "contextClassLoader", "", "name", "", "priority", "Lkotlin/Function0;", "", "block", "Ljava/lang/Thread;", "thread", "(ZZLjava/lang/ClassLoader;Ljava/lang/String;ILkotlin/jvm/functions/Function0;)Ljava/lang/Thread;", "", "T", "Ljava/lang/ThreadLocal;", "default", "getOrSet", "(Ljava/lang/ThreadLocal;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "kotlin-stdlib"})
@JvmName(name="ThreadsKt")
public final class ThreadsKt {
    @NotNull
    public static final Thread thread(boolean start, boolean isDaemon, @Nullable ClassLoader contextClassLoader, @Nullable String name, int priority, @NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Thread thread2 = new Thread(block){
            final /* synthetic */ Function0<Unit> $block;

            public void run() {
                this.$block.invoke();
            }
            {
                this.$block = $block;
            }
        };
        if (isDaemon) {
            thread2.setDaemon(true);
        }
        if (priority > 0) {
            thread2.setPriority(priority);
        }
        if (name != null) {
            thread2.setName(name);
        }
        if (contextClassLoader != null) {
            thread2.setContextClassLoader(contextClassLoader);
        }
        if (start) {
            thread2.start();
        }
        return thread2;
    }

    public static /* synthetic */ Thread thread$default(boolean bl, boolean bl2, ClassLoader classLoader, String string, int n, Function0 function0, int n2, Object object) {
        if ((n2 & 1) != 0) {
            bl = true;
        }
        if ((n2 & 2) != 0) {
            bl2 = false;
        }
        if ((n2 & 4) != 0) {
            classLoader = null;
        }
        if ((n2 & 8) != 0) {
            string = null;
        }
        if ((n2 & 0x10) != 0) {
            n = -1;
        }
        return ThreadsKt.thread(bl, bl2, classLoader, string, n, function0);
    }

    @InlineOnly
    private static final <T> T getOrSet(ThreadLocal<T> $this$getOrSet, Function0<? extends T> function0) {
        T t;
        Intrinsics.checkNotNullParameter($this$getOrSet, "<this>");
        Intrinsics.checkNotNullParameter(function0, "default");
        T t2 = $this$getOrSet.get();
        if (t2 == null) {
            T t3 = function0.invoke();
            T p0 = t3;
            boolean bl = false;
            $this$getOrSet.set(p0);
            t = t3;
        } else {
            t = t2;
        }
        return t;
    }
}

