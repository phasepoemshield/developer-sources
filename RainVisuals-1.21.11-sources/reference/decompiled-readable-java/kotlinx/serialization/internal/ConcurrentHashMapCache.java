/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.internal;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.CacheEntry;
import kotlinx.serialization.internal.SerializerCache;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B'\u0012\u001e\u0010\u0006\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00050\u0003\u00a2\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004H\u0016\u00a2\u0006\u0004\b\u000b\u0010\fR*\u0010\u0010\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f0\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0010\u0010\u0011R,\u0010\u0006\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00050\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0006\u0010\u0012\u00a8\u0006\u0013"}, d2={"Lkotlinx/serialization/internal/ConcurrentHashMapCache;", "T", "Lkotlinx/serialization/internal/SerializerCache;", "Lkotlin/Function1;", "Lkotlin/reflect/KClass;", "Lkotlinx/serialization/KSerializer;", "compute", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "", "key", "get", "(Lkotlin/reflect/KClass;)Lkotlinx/serialization/KSerializer;", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/lang/Class;", "Lkotlinx/serialization/internal/CacheEntry;", "cache", "Ljava/util/concurrent/ConcurrentHashMap;", "Lkotlin/jvm/functions/Function1;", "kotlinx-serialization-core"})
final class ConcurrentHashMapCache<T>
implements SerializerCache<T> {
    @NotNull
    private final Function1<KClass<?>, KSerializer<T>> compute;
    @NotNull
    private final ConcurrentHashMap<Class<?>, CacheEntry<T>> cache;

    public ConcurrentHashMapCache(@NotNull Function1<? super KClass<?>, ? extends KSerializer<T>> compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.compute = compute;
        this.cache = new ConcurrentHashMap();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    @Nullable
    public KSerializer<T> get(@NotNull KClass<Object> key) {
        void $this$getOrPut$iv;
        Intrinsics.checkNotNullParameter(key, "key");
        ConcurrentMap concurrentMap = this.cache;
        Class<Object> key$iv = JvmClassMappingKt.getJavaClass(key);
        boolean $i$f$getOrPut = false;
        Object object = $this$getOrPut$iv.get(key$iv);
        if (object == null) {
            boolean bl = false;
            CacheEntry<T> default$iv = new CacheEntry<T>(this.compute.invoke(key));
            boolean bl2 = false;
            object = $this$getOrPut$iv.putIfAbsent(key$iv, default$iv);
            if (object == null) {
                void var6_6;
                object = var6_6;
            }
        }
        return ((CacheEntry)object).serializer;
    }
}

