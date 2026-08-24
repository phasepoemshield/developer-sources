/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.modules;

import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.PublishedApi;
import kotlin.ReplaceWith;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.modules.SerializersModuleBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\n\b\u0000\u0010\u0002 \u0000*\u00020\u00012\u00020\u0001B)\b\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0001\u00a2\u0006\u0004\b\f\u0010\rJ<\u0010\u0015\u001a\u00020\u000b2+\u0010\u0014\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\u000f\u00a2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00130\u000eH\u0007\u00a2\u0006\u0004\b\u0015\u0010\u0016J:\u0010\u0018\u001a\u00020\u000b2+\u0010\u0017\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\u000f\u00a2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00130\u000e\u00a2\u0006\u0004\b\u0018\u0010\u0016J3\u0010\u001a\u001a\u00020\u000b\"\b\b\u0001\u0010\u0019*\u00028\u00002\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\u00a2\u0006\u0004\b\u001a\u0010\bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\bX\u0088\u0004\u00a2\u0006\u0006\n\u0004\b\u0004\u0010\u001cR\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00058\bX\u0088\u0004\u00a2\u0006\u0006\n\u0004\b\u0006\u0010\u001dR.\u0010\u0017\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0013\u0018\u00010\u000e8\b@\bX\u0088\u000e\u00a2\u0006\u0006\n\u0004\b\u0017\u0010\u001eR,\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001f\u0018\u00010\u000e8\b@\bX\u0088\u000e\u00a2\u0006\u0006\n\u0004\b\u0014\u0010\u001eR6\u0010\"\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0003\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00050!0 8\bX\u0088\u0004\u00a2\u0006\u0006\n\u0004\b\"\u0010#\u00a8\u0006$"}, d2={"Lkotlinx/serialization/modules/PolymorphicModuleBuilder;", "", "Base", "Lkotlin/reflect/KClass;", "baseClass", "Lkotlinx/serialization/KSerializer;", "baseSerializer", "<init>", "(Lkotlin/reflect/KClass;Lkotlinx/serialization/KSerializer;)V", "Lkotlinx/serialization/modules/SerializersModuleBuilder;", "builder", "", "buildTo", "(Lkotlinx/serialization/modules/SerializersModuleBuilder;)V", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "className", "Lkotlinx/serialization/DeserializationStrategy;", "defaultSerializerProvider", "default", "(Lkotlin/jvm/functions/Function1;)V", "defaultDeserializerProvider", "defaultDeserializer", "T", "subclass", "serializer", "Lkotlin/reflect/KClass;", "Lkotlinx/serialization/KSerializer;", "Lkotlin/jvm/functions/Function1;", "Lkotlinx/serialization/SerializationStrategy;", "", "Lkotlin/Pair;", "subclasses", "Ljava/util/List;", "kotlinx-serialization-core"})
public final class PolymorphicModuleBuilder<Base> {
    @Nullable
    private Function1<? super String, ? extends DeserializationStrategy<? extends Base>> defaultDeserializerProvider;
    @NotNull
    private final List<Pair<KClass<? extends Base>, KSerializer<? extends Base>>> subclasses;
    @Nullable
    private Function1<? super Base, ? extends SerializationStrategy<? super Base>> defaultSerializerProvider;
    @Nullable
    private final KSerializer<Base> baseSerializer;
    @NotNull
    private final KClass<Base> baseClass;

    /*
     * WARNING - void declaration
     */
    @PublishedApi
    public final void buildTo(@NotNull SerializersModuleBuilder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        if (this.baseSerializer != null) {
            SerializersModuleBuilder.registerPolymorphicSerializer$default(builder, this.baseClass, this.baseClass, this.baseSerializer, false, 8, null);
        }
        Iterable $this$forEach$iv = this.subclasses;
        boolean $i$f$forEach = false;
        for (Object element$iv : $this$forEach$iv) {
            void var10_11;
            Pair pair = (Pair)element$iv;
            boolean bl = false;
            KClass kclass = (KClass)pair.component1();
            KSerializer serializer2 = (KSerializer)pair.component2();
            Intrinsics.checkNotNull(kclass, "null cannot be cast to non-null type kotlin.reflect.KClass<Base of kotlinx.serialization.modules.PolymorphicModuleBuilder.buildTo$lambda$1>");
            KSerializer $this$cast$iv = serializer2;
            boolean $i$f$cast = false;
            Intrinsics.checkNotNull($this$cast$iv, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            SerializersModuleBuilder.registerPolymorphicSerializer$default(builder, this.baseClass, kclass, (KSerializer)var10_11, false, 8, null);
        }
        Function1<? super Base, ? extends SerializationStrategy<? super Base>> defaultSerializer = this.defaultSerializerProvider;
        if (defaultSerializer != null) {
            builder.registerDefaultPolymorphicSerializer(this.baseClass, defaultSerializer, false);
        }
        Function1<? super String, ? extends DeserializationStrategy<? extends Base>> defaultDeserializer = this.defaultDeserializerProvider;
        if (defaultDeserializer != null) {
            void var3_4;
            void var1_1;
            var1_1.registerDefaultPolymorphicDeserializer(this.baseClass, var3_4, false);
        }
    }

    @Deprecated(message="Deprecated in favor of function with more precise name: defaultDeserializer", replaceWith=@ReplaceWith(expression="defaultDeserializer(defaultSerializerProvider)", imports={}), level=DeprecationLevel.WARNING)
    public final void default(@NotNull Function1<? super String, ? extends DeserializationStrategy<? extends Base>> defaultSerializerProvider) {
        Intrinsics.checkNotNullParameter(defaultSerializerProvider, "defaultSerializerProvider");
        this.defaultDeserializer(defaultSerializerProvider);
    }

    /*
     * WARNING - void declaration
     */
    public final void defaultDeserializer(@NotNull Function1<? super String, ? extends DeserializationStrategy<? extends Base>> defaultDeserializerProvider) {
        void var1_1;
        Intrinsics.checkNotNullParameter(defaultDeserializerProvider, "defaultDeserializerProvider");
        if (!(this.defaultDeserializerProvider == null)) {
            boolean bl = false;
            String string = "Default deserializer provider is already registered for class " + this.baseClass + ": " + this.defaultDeserializerProvider;
            throw new IllegalArgumentException(string.toString());
        }
        this.defaultDeserializerProvider = var1_1;
    }

    public /* synthetic */ PolymorphicModuleBuilder(KClass kClass, KSerializer kSerializer, int n, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 2) != 0) {
            kSerializer = null;
        }
        this(kClass, kSerializer);
    }

    public final <T extends Base> void subclass(@NotNull KClass<T> subclass, @NotNull KSerializer<T> serializer2) {
        Intrinsics.checkNotNullParameter(subclass, "subclass");
        Intrinsics.checkNotNullParameter(serializer2, "serializer");
        this.subclasses.add(TuplesKt.to(subclass, serializer2));
    }

    @PublishedApi
    public PolymorphicModuleBuilder(@NotNull KClass<Base> baseClass, @Nullable KSerializer<Base> baseSerializer) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        this.baseClass = baseClass;
        this.baseSerializer = baseSerializer;
        this.subclasses = new ArrayList();
    }
}

