/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.modules;

import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.modules.SerializersModuleCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\t\b\u0004\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H'\u00a2\u0006\u0004\b\u0007\u0010\bJ/\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\f\"\b\b\u0000\u0010\t*\u00020\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0007\u00a2\u0006\u0004\b\r\u0010\u000eJC\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\f\"\b\b\u0000\u0010\t*\u00020\u00012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0012\b\u0002\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\u0010H'\u00a2\u0006\u0004\b\r\u0010\u0012J9\u0010\u0016\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0015\"\b\b\u0000\u0010\t*\u00020\u00012\u000e\u0010\u0013\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\n2\u0006\u0010\u0014\u001a\u00028\u0000H'\u00a2\u0006\u0004\b\u0016\u0010\u0017J;\u0010\u0016\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001a\"\b\b\u0000\u0010\t*\u00020\u00012\u000e\u0010\u0013\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H'\u00a2\u0006\u0004\b\u0016\u0010\u001b\u0082\u0001\u0001\u001c\u00a8\u0006\u001d"}, d2={"Lkotlinx/serialization/modules/SerializersModule;", "", "<init>", "()V", "Lkotlinx/serialization/modules/SerializersModuleCollector;", "collector", "", "dumpTo", "(Lkotlinx/serialization/modules/SerializersModuleCollector;)V", "T", "Lkotlin/reflect/KClass;", "kclass", "Lkotlinx/serialization/KSerializer;", "getContextual", "(Lkotlin/reflect/KClass;)Lkotlinx/serialization/KSerializer;", "kClass", "", "typeArgumentsSerializers", "(Lkotlin/reflect/KClass;Ljava/util/List;)Lkotlinx/serialization/KSerializer;", "baseClass", "value", "Lkotlinx/serialization/SerializationStrategy;", "getPolymorphic", "(Lkotlin/reflect/KClass;Ljava/lang/Object;)Lkotlinx/serialization/SerializationStrategy;", "", "serializedClassName", "Lkotlinx/serialization/DeserializationStrategy;", "(Lkotlin/reflect/KClass;Ljava/lang/String;)Lkotlinx/serialization/DeserializationStrategy;", "Lkotlinx/serialization/modules/SerialModuleImpl;", "kotlinx-serialization-core"})
public abstract class SerializersModule {
    @ExperimentalSerializationApi
    public abstract void dumpTo(@NotNull SerializersModuleCollector var1);

    public /* synthetic */ SerializersModule(DefaultConstructorMarker $constructor_marker) {
        this();
    }

    @ExperimentalSerializationApi
    @Nullable
    public abstract <T> DeserializationStrategy<T> getPolymorphic(@NotNull KClass<? super T> var1, @Nullable String var2);

    @ExperimentalSerializationApi
    @Nullable
    public abstract <T> SerializationStrategy<T> getPolymorphic(@NotNull KClass<? super T> var1, @NotNull T var2);

    @ExperimentalSerializationApi
    @Nullable
    public abstract <T> KSerializer<T> getContextual(@NotNull KClass<T> var1, @NotNull List<? extends KSerializer<?>> var2);

    @Deprecated(message="Deprecated in favor of overload with default parameter", replaceWith=@ReplaceWith(expression="getContextual(kclass)", imports={}), level=DeprecationLevel.HIDDEN)
    @ExperimentalSerializationApi
    public final /* synthetic */ KSerializer getContextual(KClass kclass) {
        Intrinsics.checkNotNullParameter(kclass, "kclass");
        return this.getContextual(kclass, CollectionsKt.emptyList());
    }

    public static /* synthetic */ KSerializer getContextual$default(SerializersModule serializersModule, KClass kClass, List list, int n, Object object) {
        if (object != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContextual");
        }
        if ((n & 2) != 0) {
            list = CollectionsKt.emptyList();
        }
        return serializersModule.getContextual(kClass, list);
    }

    private SerializersModule() {
    }
}

