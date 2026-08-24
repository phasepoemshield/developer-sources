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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KType;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.KTypeWrapper;
import org.jetbrains.annotations.NotNull;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007\u00a2\u0006\u0004\b\u0003\u0010\u0004JK\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t0\u000b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t0\bH\u0086\b\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\b\f\u0010\rR4\u0010\u0011\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u0005\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t0\u000b0\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0082\u0002\u0012\n\u0005\b\u009920\u0001\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\u00a8\u0006\u0013"}, d2={"Lkotlinx/serialization/internal/ParametrizedCacheEntry;", "T", "", "<init>", "()V", "", "Lkotlin/reflect/KType;", "types", "Lkotlin/Function0;", "Lkotlinx/serialization/KSerializer;", "producer", "Lkotlin/Result;", "computeIfAbsent-gIAlu-s", "(Ljava/util/List;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "computeIfAbsent", "Ljava/util/concurrent/ConcurrentHashMap;", "Lkotlinx/serialization/internal/KTypeWrapper;", "serializers", "Ljava/util/concurrent/ConcurrentHashMap;", "kotlinx-serialization-core"})
final class ParametrizedCacheEntry<T> {
    @NotNull
    private final ConcurrentHashMap<List<KTypeWrapper>, Result<KSerializer<T>>> serializers = new ConcurrentHashMap();

    /*
     * WARNING - void declaration
     */
    @NotNull
    public final Object computeIfAbsent-gIAlu-s(@NotNull List<? extends KType> types, @NotNull Function0<? extends KSerializer<T>> producer) {
        void $this$mapTo$iv$iv;
        Intrinsics.checkNotNullParameter(types, "types");
        Intrinsics.checkNotNullParameter(producer, "producer");
        boolean bl = false;
        Iterable $this$map$iv = types;
        boolean $i$f$map = false;
        Iterable iterable = $this$map$iv;
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        boolean $i$f$mapTo = false;
        for (Object item$iv$iv : $this$mapTo$iv$iv) {
            KType it = (KType)item$iv$iv;
            Collection collection = destination$iv$iv;
            boolean bl2 = false;
            collection.add(new KTypeWrapper(it));
        }
        List wrappedTypes = (List)destination$iv$iv;
        ConcurrentMap $this$getOrPut$iv = this.serializers;
        boolean $i$f$getOrPut = false;
        Object object = $this$getOrPut$iv.get(wrappedTypes);
        if (object == null) {
            Object object2;
            boolean bl3 = false;
            try {
                boolean bl4 = false;
                object2 = Result.constructor-impl(producer.invoke());
            }
            catch (Throwable throwable) {
                object2 = Result.constructor-impl(ResultKt.createFailure(throwable));
            }
            Result default$iv = Result.box-impl(object2);
            boolean bl5 = false;
            object = $this$getOrPut$iv.putIfAbsent(wrappedTypes, default$iv);
            if (object == null) {
                void var11_15;
                object = var11_15;
            }
        }
        Intrinsics.checkNotNullExpressionValue(object, "getOrPut(...)");
        return ((Result)object).unbox-impl();
    }
}

