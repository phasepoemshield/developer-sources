/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.internal;

import java.lang.ref.SoftReference;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\u0007\u001a\u00028\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u00a2\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0006\n\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2={"Lkotlinx/serialization/internal/MutableSoftReference;", "T", "", "<init>", "()V", "Lkotlin/Function0;", "factory", "getOrSetWithLock", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Ljava/lang/ref/SoftReference;", "reference", "Ljava/lang/ref/SoftReference;", "kotlinx-serialization-core"})
final class MutableSoftReference<T> {
    @JvmField
    @NotNull
    public volatile SoftReference<T> reference = new SoftReference<Object>(null);

    /*
     * WARNING - void declaration
     */
    public final synchronized T getOrSetWithLock(@NotNull Function0<? extends T> factory) {
        void var2_4;
        Intrinsics.checkNotNullParameter(factory, "factory");
        T t = this.reference.get();
        if (t != null) {
            void var3_2;
            T it = t;
            boolean bl = false;
            return var3_2;
        }
        T value = factory.invoke();
        this.reference = new SoftReference<T>(value);
        return var2_4;
    }
}

