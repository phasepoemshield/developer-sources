/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.ClassValueCache;
import kotlinx.serialization.internal.ClassValueParametrizedCache;
import kotlinx.serialization.internal.ConcurrentHashMapCache;
import kotlinx.serialization.internal.ConcurrentHashMapParametrizedCache;
import kotlinx.serialization.internal.ParametrizedSerializerCache;
import kotlinx.serialization.internal.SerializerCache;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=2, xi=48, d1={"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a;\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\u001e\u0010\u0004\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00030\u0001H\u0000\u00a2\u0006\u0004\b\u0006\u0010\u0007\u001aI\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\u00002,\u0010\u0004\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00030\bH\u0000\u00a2\u0006\u0004\b\r\u0010\u000e\"\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0012"}, d2={"T", "Lkotlin/Function1;", "Lkotlin/reflect/KClass;", "Lkotlinx/serialization/KSerializer;", "factory", "Lkotlinx/serialization/internal/SerializerCache;", "createCache", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/serialization/internal/SerializerCache;", "Lkotlin/Function2;", "", "", "Lkotlin/reflect/KType;", "Lkotlinx/serialization/internal/ParametrizedSerializerCache;", "createParametrizedCache", "(Lkotlin/jvm/functions/Function2;)Lkotlinx/serialization/internal/ParametrizedSerializerCache;", "", "useClassValue", "Z", "kotlinx-serialization-core"})
public final class CachingKt {
    private static final boolean useClassValue;

    @NotNull
    public static final <T> SerializerCache<T> createCache(@NotNull Function1<? super KClass<?>, ? extends KSerializer<T>> factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return useClassValue ? (SerializerCache)new ClassValueCache(factory) : (SerializerCache)new ConcurrentHashMapCache(factory);
    }

    @NotNull
    public static final <T> ParametrizedSerializerCache<T> createParametrizedCache(@NotNull Function2<? super KClass<Object>, ? super List<? extends KType>, ? extends KSerializer<T>> factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return useClassValue ? (ParametrizedSerializerCache)new ClassValueParametrizedCache(factory) : (ParametrizedSerializerCache)new ConcurrentHashMapParametrizedCache(factory);
    }

    static {
        boolean bl;
        try {
            Class.forName("java.lang.ClassValue");
            bl = true;
        }
        catch (Throwable _) {
            bl = false;
        }
        useClassValue = bl;
    }
}

