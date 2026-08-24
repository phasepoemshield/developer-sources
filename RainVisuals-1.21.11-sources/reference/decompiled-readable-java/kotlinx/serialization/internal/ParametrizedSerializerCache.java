/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import org.jetbrains.annotations.NotNull;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002JA\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t0\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u000b\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\u00a8\u0006\r"}, d2={"Lkotlinx/serialization/internal/ParametrizedSerializerCache;", "T", "", "Lkotlin/reflect/KClass;", "key", "", "Lkotlin/reflect/KType;", "types", "Lkotlin/Result;", "Lkotlinx/serialization/KSerializer;", "get-gIAlu-s", "(Lkotlin/reflect/KClass;Ljava/util/List;)Ljava/lang/Object;", "get", "kotlinx-serialization-core"})
public interface ParametrizedSerializerCache<T> {
    @NotNull
    public Object get-gIAlu-s(@NotNull KClass<Object> var1, @NotNull List<? extends KType> var2);

    /*
     * Illegal identifiers - consider using --renameillegalidents true
     */
    @Metadata(mv={1, 9, 0}, k=3, xi=48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object get-gIAlu-s$default(ParametrizedSerializerCache parametrizedSerializerCache, KClass kClass, List list, int n, Object object) {
            if (object != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: get-gIAlu-s");
            }
            if ((n & 2) != 0) {
                list = CollectionsKt.emptyList();
            }
            return parametrizedSerializerCache.get-gIAlu-s(kClass, list);
        }
    }
}

