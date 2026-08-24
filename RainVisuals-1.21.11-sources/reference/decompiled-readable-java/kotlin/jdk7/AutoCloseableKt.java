/*
 * Decompiled with CFR 0.152.
 */
package kotlin.jdk7;

import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=2, xi=48, d1={"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0001\u00a2\u0006\u0004\b\u0004\u0010\u0005\u001aJ\u0010\n\u001a\u00028\u0001\"\n\b\u0000\u0010\u0006*\u0004\u0018\u00010\u0000\"\u0004\b\u0001\u0010\u0007*\u00028\u00002\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\bH\u0087\b\u00f8\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u00a2\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\f"}, d2={"Ljava/lang/AutoCloseable;", "", "cause", "", "closeFinally", "(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V", "T", "R", "Lkotlin/Function1;", "block", "use", "(Ljava/lang/AutoCloseable;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "kotlin-stdlib-jdk7"}, pn="")
@JvmName(name="AutoCloseableKt")
public final class AutoCloseableKt {
    @SinceKotlin(version="1.2")
    @PublishedApi
    public static final void closeFinally(@Nullable AutoCloseable $this$closeFinally, @Nullable Throwable cause) {
        if ($this$closeFinally != null) {
            if (cause == null) {
                $this$closeFinally.close();
            } else {
                try {
                    $this$closeFinally.close();
                }
                catch (Throwable closeException) {
                    ExceptionsKt.addSuppressed(cause, closeException);
                }
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    @InlineOnly
    @SinceKotlin(version="1.2")
    private static final <T extends AutoCloseable, R> R use(T $this$use, Function1<? super T, ? extends R> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Throwable exception = null;
        try {
            void e;
            R r = block.invoke($this$use);
            return e;
        }
        catch (Throwable throwable) {
            exception = throwable;
            throw throwable;
        }
        finally {
            InlineMarker.finallyStart(1);
            AutoCloseableKt.closeFinally($this$use, exception);
            InlineMarker.finallyEnd(1);
        }
    }
}

