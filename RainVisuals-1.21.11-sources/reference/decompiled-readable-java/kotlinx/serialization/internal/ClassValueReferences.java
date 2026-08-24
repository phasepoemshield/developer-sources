/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.internal.MutableSoftReference;
import kotlinx.serialization.internal.SuppressAnimalSniffer;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u0007\u00a2\u0006\u0004\b\u0004\u0010\u0005J!\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0014\u00a2\u0006\u0004\b\b\u0010\tJ/\u0010\r\u001a\u00028\u00002\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u00062\u000e\b\u0004\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0086\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u000f"}, d2={"Lkotlinx/serialization/internal/ClassValueReferences;", "T", "Ljava/lang/ClassValue;", "Lkotlinx/serialization/internal/MutableSoftReference;", "<init>", "()V", "Ljava/lang/Class;", "type", "computeValue", "(Ljava/lang/Class;)Lkotlinx/serialization/internal/MutableSoftReference;", "key", "Lkotlin/Function0;", "factory", "getOrSet", "(Ljava/lang/Class;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "kotlinx-serialization-core"})
@SuppressAnimalSniffer
final class ClassValueReferences<T>
extends ClassValue<MutableSoftReference<T>> {
    @Override
    @NotNull
    protected MutableSoftReference<T> computeValue(@NotNull Class<?> type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new MutableSoftReference();
    }

    /*
     * WARNING - void declaration
     */
    public final T getOrSet(@NotNull Class<?> key, @NotNull Function0<? extends T> factory) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(factory, "factory");
        boolean $i$f$getOrSet = false;
        Object t = this.get(key);
        Intrinsics.checkNotNullExpressionValue(t, "get(...)");
        MutableSoftReference ref = (MutableSoftReference)t;
        Object t2 = ref.reference.get();
        if (t2 != null) {
            void var5_5;
            Object it = t2;
            boolean bl = false;
            return var5_5;
        }
        return ref.getOrSetWithLock(new Function0<T>(factory){
            final /* synthetic */ Function0<T> $factory;
            {
                this.$factory = $factory;
                super(0);
            }

            public final T invoke() {
                return this.$factory.invoke();
            }
        });
    }
}

