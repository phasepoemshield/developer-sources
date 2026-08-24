/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.KTypeWrapper;
import kotlinx.serialization.internal.ParametrizedCacheEntry;
import kotlinx.serialization.internal.ParametrizedSerializerCache;
import org.jetbrains.annotations.NotNull;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B5\u0012,\u0010\t\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b0\u0003\u00a2\u0006\u0004\b\n\u0010\u000bJ?\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b0\u000e2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u000f\u0010\u0010R*\u0010\u0015\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0015\u0010\u0016R:\u0010\t\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b0\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\t\u0010\u0017\u0082\u0002\u000b\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\u00a8\u0006\u0018"}, d2={"Lkotlinx/serialization/internal/ConcurrentHashMapParametrizedCache;", "T", "Lkotlinx/serialization/internal/ParametrizedSerializerCache;", "Lkotlin/Function2;", "Lkotlin/reflect/KClass;", "", "", "Lkotlin/reflect/KType;", "Lkotlinx/serialization/KSerializer;", "compute", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "key", "types", "Lkotlin/Result;", "get-gIAlu-s", "(Lkotlin/reflect/KClass;Ljava/util/List;)Ljava/lang/Object;", "get", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/lang/Class;", "Lkotlinx/serialization/internal/ParametrizedCacheEntry;", "cache", "Ljava/util/concurrent/ConcurrentHashMap;", "Lkotlin/jvm/functions/Function2;", "kotlinx-serialization-core"})
final class ConcurrentHashMapParametrizedCache<T>
implements ParametrizedSerializerCache<T> {
    @NotNull
    private final ConcurrentHashMap<Class<?>, ParametrizedCacheEntry<T>> cache;
    @NotNull
    private final Function2<KClass<Object>, List<? extends KType>, KSerializer<T>> compute;

    /*
     * WARNING - void declaration
     */
    @Override
    @NotNull
    public Object get-gIAlu-s(@NotNull KClass<Object> key, @NotNull List<? extends KType> types) {
        void $this$mapTo$iv$iv$iv;
        Object default$iv;
        void $this$getOrPut$iv;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(types, "types");
        ConcurrentMap concurrentMap = this.cache;
        Class<Object> key$iv = JvmClassMappingKt.getJavaClass(key);
        boolean $i$f$getOrPut = false;
        Object object = $this$getOrPut$iv.get(key$iv);
        if (object == null) {
            boolean bl = false;
            default$iv = new ParametrizedCacheEntry();
            boolean bl2 = false;
            object = $this$getOrPut$iv.putIfAbsent(key$iv, default$iv);
            if (object == null) {
                object = default$iv;
            }
        }
        ParametrizedCacheEntry this_$iv = (ParametrizedCacheEntry)object;
        boolean bl = false;
        Iterable $this$map$iv$iv = types;
        boolean $i$f$map = false;
        default$iv = $this$map$iv$iv;
        Collection destination$iv$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv$iv, 10));
        boolean $i$f$mapTo = false;
        for (Object item$iv$iv$iv : $this$mapTo$iv$iv$iv) {
            KType it$iv = (KType)item$iv$iv$iv;
            Collection collection = destination$iv$iv$iv;
            boolean bl3 = false;
            collection.add(new KTypeWrapper(it$iv));
        }
        List wrappedTypes$iv = (List)destination$iv$iv$iv;
        ConcurrentMap $this$getOrPut$iv$iv = ParametrizedCacheEntry.access$getSerializers$p(this_$iv);
        boolean $i$f$getOrPut2 = false;
        Object v = $this$getOrPut$iv$iv.get(wrappedTypes$iv);
        if (v == null) {
            void var11_19;
            Object object2;
            boolean bl4 = false;
            try {
                boolean bl5 = false;
                boolean bl6 = false;
                object2 = Result.constructor-impl(this.compute.invoke(key, types));
            }
            catch (Throwable throwable) {
                object2 = Result.constructor-impl(ResultKt.createFailure(throwable));
            }
            Result default$iv$iv = Result.box-impl(object2);
            boolean bl7 = false;
            v = $this$getOrPut$iv$iv.putIfAbsent(wrappedTypes$iv, var11_19);
            if (v == null) {
                v = var11_19;
            }
        }
        Intrinsics.checkNotNullExpressionValue(v, "getOrPut(...)");
        return ((Result)v).unbox-impl();
    }

    public ConcurrentHashMapParametrizedCache(@NotNull Function2<? super KClass<Object>, ? super List<? extends KType>, ? extends KSerializer<T>> compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.compute = compute;
        this.cache = new ConcurrentHashMap();
    }
}

