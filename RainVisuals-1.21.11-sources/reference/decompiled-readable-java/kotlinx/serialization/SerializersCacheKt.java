/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersCacheKt;
import kotlinx.serialization.internal.CachingKt;
import kotlinx.serialization.internal.ParametrizedSerializerCache;
import kotlinx.serialization.internal.SerializerCache;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=2, xi=48, d1={"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a/\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u00a2\u0006\u0004\b\u0006\u0010\u0007\u001aC\u0010\f\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00050\u000b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u00a2\u0006\u0004\b\f\u0010\r\"\"\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000e8\u0002X\u0083\u0004\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0011\u0010\u0012\"\"\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000e8\u0002X\u0083\u0004\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0010\u0012\u0004\b\u0014\u0010\u0012\"\"\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00158\u0002X\u0083\u0004\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u0018\u0010\u0012\"\"\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00158\u0002X\u0083\u0004\u00a2\u0006\f\n\u0004\b\u0019\u0010\u0017\u0012\u0004\b\u001a\u0010\u0012\u00a8\u0006\u001b"}, d2={"Lkotlin/reflect/KClass;", "", "clazz", "", "isNullable", "Lkotlinx/serialization/KSerializer;", "findCachedSerializer", "(Lkotlin/reflect/KClass;Z)Lkotlinx/serialization/KSerializer;", "", "Lkotlin/reflect/KType;", "types", "Lkotlin/Result;", "findParametrizedCachedSerializer", "(Lkotlin/reflect/KClass;Ljava/util/List;Z)Ljava/lang/Object;", "Lkotlinx/serialization/internal/ParametrizedSerializerCache;", "PARAMETRIZED_SERIALIZERS_CACHE", "Lkotlinx/serialization/internal/ParametrizedSerializerCache;", "getPARAMETRIZED_SERIALIZERS_CACHE$annotations", "()V", "PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE", "getPARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$annotations", "Lkotlinx/serialization/internal/SerializerCache;", "SERIALIZERS_CACHE", "Lkotlinx/serialization/internal/SerializerCache;", "getSERIALIZERS_CACHE$annotations", "SERIALIZERS_CACHE_NULLABLE", "getSERIALIZERS_CACHE_NULLABLE$annotations", "kotlinx-serialization-core"})
public final class SerializersCacheKt {
    @NotNull
    private static final ParametrizedSerializerCache<? extends Object> PARAMETRIZED_SERIALIZERS_CACHE;
    @NotNull
    private static final ParametrizedSerializerCache<Object> PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE;
    @NotNull
    private static final SerializerCache<Object> SERIALIZERS_CACHE_NULLABLE;
    @NotNull
    private static final SerializerCache<? extends Object> SERIALIZERS_CACHE;

    @NotNull
    public static final Object findParametrizedCachedSerializer(@NotNull KClass<Object> clazz, @NotNull List<? extends KType> types, boolean isNullable) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(types, "types");
        return !isNullable ? PARAMETRIZED_SERIALIZERS_CACHE.get-gIAlu-s(clazz, types) : PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE.get-gIAlu-s(clazz, types);
    }

    private static /* synthetic */ void getSERIALIZERS_CACHE$annotations() {
    }

    private static /* synthetic */ void getPARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$annotations() {
    }

    private static /* synthetic */ void getPARAMETRIZED_SERIALIZERS_CACHE$annotations() {
    }

    private static /* synthetic */ void getSERIALIZERS_CACHE_NULLABLE$annotations() {
    }

    /*
     * WARNING - void declaration
     */
    @Nullable
    public static final KSerializer<Object> findCachedSerializer(@NotNull KClass<Object> clazz, boolean isNullable) {
        KSerializer<Object> kSerializer;
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        if (!isNullable) {
            KSerializer<? extends Object> kSerializer2 = SERIALIZERS_CACHE.get(clazz);
            if (kSerializer2 != null) {
                void var2_2;
                KSerializer<? extends Object> $this$cast$iv = kSerializer2;
                boolean bl = false;
                kSerializer = var2_2;
            } else {
                kSerializer = null;
            }
        } else {
            kSerializer = SERIALIZERS_CACHE_NULLABLE.get(clazz);
        }
        return kSerializer;
    }

    static {
        SERIALIZERS_CACHE = CachingKt.createCache(SERIALIZERS_CACHE.1.INSTANCE);
        SERIALIZERS_CACHE_NULLABLE = CachingKt.createCache(SERIALIZERS_CACHE_NULLABLE.1.INSTANCE);
        PARAMETRIZED_SERIALIZERS_CACHE = CachingKt.createParametrizedCache(PARAMETRIZED_SERIALIZERS_CACHE.1.INSTANCE);
        PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE = CachingKt.createParametrizedCache(PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE.1.INSTANCE);
    }
}

