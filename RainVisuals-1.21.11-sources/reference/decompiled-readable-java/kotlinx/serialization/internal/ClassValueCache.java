/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.CacheEntry;
import kotlinx.serialization.internal.ClassValueReferences;
import kotlinx.serialization.internal.MutableSoftReference;
import kotlinx.serialization.internal.SerializerCache;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B'\u0012\u001e\u0010\u0006\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00050\u0003\u00a2\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004H\u0016\u00a2\u0006\u0004\b\u000b\u0010\fR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u000f\u0010\u0010R/\u0010\u0006\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00050\u00038\u0006\u00a2\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0014"}, d2={"Lkotlinx/serialization/internal/ClassValueCache;", "T", "Lkotlinx/serialization/internal/SerializerCache;", "Lkotlin/Function1;", "Lkotlin/reflect/KClass;", "Lkotlinx/serialization/KSerializer;", "compute", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "", "key", "get", "(Lkotlin/reflect/KClass;)Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/internal/ClassValueReferences;", "Lkotlinx/serialization/internal/CacheEntry;", "classValue", "Lkotlinx/serialization/internal/ClassValueReferences;", "Lkotlin/jvm/functions/Function1;", "getCompute", "()Lkotlin/jvm/functions/Function1;", "kotlinx-serialization-core"})
final class ClassValueCache<T>
implements SerializerCache<T> {
    @NotNull
    private final ClassValueReferences<CacheEntry<T>> classValue;
    @NotNull
    private final Function1<KClass<?>, KSerializer<T>> compute;

    /*
     * WARNING - void declaration
     */
    @Override
    @Nullable
    public KSerializer<T> get(@NotNull KClass<Object> key) {
        Object t;
        void this_$iv;
        Intrinsics.checkNotNullParameter(key, "key");
        ClassValueReferences<CacheEntry<T>> classValueReferences = this.classValue;
        Class<Object> key$iv = JvmClassMappingKt.getJavaClass(key);
        boolean $i$f$getOrSet = false;
        Object t2 = this_$iv.get(key$iv);
        Intrinsics.checkNotNullExpressionValue(t2, "get(...)");
        MutableSoftReference ref$iv = (MutableSoftReference)t2;
        Object t3 = ref$iv.reference.get();
        if (t3 != null) {
            Object it$iv = t3;
            boolean bl = false;
            t = it$iv;
        } else {
            t = ref$iv.getOrSetWithLock(new Function0<T>(this, key){
                final /* synthetic */ ClassValueCache this$0;
                final /* synthetic */ KClass $key$inlined;
                {
                    this.this$0 = classValueCache;
                    this.$key$inlined = kClass;
                    super(0);
                }

                public final T invoke() {
                    boolean bl = false;
                    return (T)new CacheEntry<T>(this.this$0.getCompute().invoke(this.$key$inlined));
                }
            });
        }
        return ((CacheEntry)t).serializer;
    }

    @NotNull
    public final Function1<KClass<?>, KSerializer<T>> getCompute() {
        return this.compute;
    }

    public ClassValueCache(@NotNull Function1<? super KClass<?>, ? extends KSerializer<T>> compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.compute = compute;
        this.classValue = new ClassValueReferences();
    }
}

