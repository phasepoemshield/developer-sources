/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.modules;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.modules.ContextualProvider;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u00e6\u0001\u0012\u0016\u0010\u0005\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012*\u0010\u0007\u001a&\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0018\u0012\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00020\u0002\u0012.\u0010\u000b\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u001c\u0012\u001a\u0012\u0002\b\u0003\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\t0\bj\u0006\u0012\u0002\b\u0003`\n0\u0002\u0012&\u0010\r\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00020\u0002\u0012A\u0010\u0013\u001a=\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012/\u0012-\u0012\u0015\u0012\u0013\u0018\u00010\f\u00a2\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00110\bj\u0006\u0012\u0002\b\u0003`\u00120\u0002\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016\u00a2\u0006\u0004\b\u0019\u0010\u001aJA\u0010 \u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006\"\b\b\u0000\u0010\u001c*\u00020\u001b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0010\u0010\u001f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u001eH\u0016\u00a2\u0006\u0004\b \u0010!J9\u0010$\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t\"\b\b\u0000\u0010\u001c*\u00020\u001b2\u000e\u0010\"\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00032\u0006\u0010#\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\b$\u0010%J;\u0010$\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0011\"\b\b\u0000\u0010\u001c*\u00020\u001b2\u000e\u0010\"\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00032\b\u0010&\u001a\u0004\u0018\u00010\fH\u0016\u00a2\u0006\u0004\b$\u0010'R$\u0010\u0005\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0005\u0010(RO\u0010\u0013\u001a=\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012/\u0012-\u0012\u0015\u0012\u0013\u0018\u00010\f\u00a2\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00110\bj\u0006\u0012\u0002\b\u0003`\u00120\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0013\u0010(R<\u0010\u000b\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u001c\u0012\u001a\u0012\u0002\b\u0003\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\t0\bj\u0006\u0012\u0002\b\u0003`\n0\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u000b\u0010(R4\u0010\r\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\r\u0010(R8\u0010\u0007\u001a&\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0018\u0012\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\b\u0007\u0010(\u00a8\u0006)"}, d2={"Lkotlinx/serialization/modules/SerialModuleImpl;", "Lkotlinx/serialization/modules/SerializersModule;", "", "Lkotlin/reflect/KClass;", "Lkotlinx/serialization/modules/ContextualProvider;", "class2ContextualFactory", "Lkotlinx/serialization/KSerializer;", "polyBase2Serializers", "Lkotlin/Function1;", "Lkotlinx/serialization/SerializationStrategy;", "Lkotlinx/serialization/modules/PolymorphicSerializerProvider;", "polyBase2DefaultSerializerProvider", "", "polyBase2NamedSerializers", "Lkotlin/ParameterName;", "name", "className", "Lkotlinx/serialization/DeserializationStrategy;", "Lkotlinx/serialization/modules/PolymorphicDeserializerProvider;", "polyBase2DefaultDeserializerProvider", "<init>", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "Lkotlinx/serialization/modules/SerializersModuleCollector;", "collector", "", "dumpTo", "(Lkotlinx/serialization/modules/SerializersModuleCollector;)V", "", "T", "kClass", "", "typeArgumentsSerializers", "getContextual", "(Lkotlin/reflect/KClass;Ljava/util/List;)Lkotlinx/serialization/KSerializer;", "baseClass", "value", "getPolymorphic", "(Lkotlin/reflect/KClass;Ljava/lang/Object;)Lkotlinx/serialization/SerializationStrategy;", "serializedClassName", "(Lkotlin/reflect/KClass;Ljava/lang/String;)Lkotlinx/serialization/DeserializationStrategy;", "Ljava/util/Map;", "kotlinx-serialization-core"})
public final class SerialModuleImpl
extends SerializersModule {
    @NotNull
    private final Map<KClass<?>, ContextualProvider> class2ContextualFactory;
    @NotNull
    private final Map<KClass<?>, Function1<?, SerializationStrategy<?>>> polyBase2DefaultSerializerProvider;
    @JvmField
    @NotNull
    public final Map<KClass<?>, Map<KClass<?>, KSerializer<?>>> polyBase2Serializers;
    @NotNull
    private final Map<KClass<?>, Function1<String, DeserializationStrategy<?>>> polyBase2DefaultDeserializerProvider;
    @NotNull
    private final Map<KClass<?>, Map<String, KSerializer<?>>> polyBase2NamedSerializers;

    @Override
    @Nullable
    public <T> KSerializer<T> getContextual(@NotNull KClass<T> kClass, @NotNull List<? extends KSerializer<?>> typeArgumentsSerializers) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
        ContextualProvider contextualProvider = this.class2ContextualFactory.get(kClass);
        KSerializer<?> kSerializer = contextualProvider != null ? contextualProvider.invoke(typeArgumentsSerializers) : null;
        return kSerializer instanceof KSerializer ? kSerializer : null;
    }

    @Override
    @Nullable
    public <T> DeserializationStrategy<T> getPolymorphic(@NotNull KClass<? super T> baseClass, @Nullable String serializedClassName) {
        KSerializer<?> registered;
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Map<String, KSerializer<?>> map = this.polyBase2NamedSerializers.get(baseClass);
        KSerializer<?> kSerializer = map != null ? map.get(serializedClassName) : null;
        KSerializer<?> kSerializer2 = registered = kSerializer instanceof KSerializer ? kSerializer : null;
        if (kSerializer2 != null) {
            return kSerializer2;
        }
        Function1<String, DeserializationStrategy<?>> function1 = this.polyBase2DefaultDeserializerProvider.get(baseClass);
        Function1<String, DeserializationStrategy<?>> function12 = TypeIntrinsics.isFunctionOfArity(function1, 1) ? function1 : null;
        return function12 != null ? function12.invoke(serializedClassName) : null;
    }

    public SerialModuleImpl(@NotNull Map<KClass<?>, ? extends ContextualProvider> class2ContextualFactory, @NotNull Map<KClass<?>, ? extends Map<KClass<?>, ? extends KSerializer<?>>> polyBase2Serializers, @NotNull Map<KClass<?>, ? extends Function1<?, ? extends SerializationStrategy<?>>> polyBase2DefaultSerializerProvider, @NotNull Map<KClass<?>, ? extends Map<String, ? extends KSerializer<?>>> polyBase2NamedSerializers, @NotNull Map<KClass<?>, ? extends Function1<? super String, ? extends DeserializationStrategy<?>>> polyBase2DefaultDeserializerProvider) {
        Intrinsics.checkNotNullParameter(class2ContextualFactory, "class2ContextualFactory");
        Intrinsics.checkNotNullParameter(polyBase2Serializers, "polyBase2Serializers");
        Intrinsics.checkNotNullParameter(polyBase2DefaultSerializerProvider, "polyBase2DefaultSerializerProvider");
        Intrinsics.checkNotNullParameter(polyBase2NamedSerializers, "polyBase2NamedSerializers");
        Intrinsics.checkNotNullParameter(polyBase2DefaultDeserializerProvider, "polyBase2DefaultDeserializerProvider");
        super(null);
        this.class2ContextualFactory = class2ContextualFactory;
        this.polyBase2Serializers = polyBase2Serializers;
        this.polyBase2DefaultSerializerProvider = polyBase2DefaultSerializerProvider;
        this.polyBase2NamedSerializers = polyBase2NamedSerializers;
        this.polyBase2DefaultDeserializerProvider = polyBase2DefaultDeserializerProvider;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void dumpTo(@NotNull SerializersModuleCollector collector) {
        Function1 provider;
        KClass<?> baseClass;
        Map.Entry<KClass<?>, ContextualProvider> entry;
        Map.Entry<KClass<?>, Object> element$iv;
        Intrinsics.checkNotNullParameter(collector, "collector");
        Map<KClass<?>, Object> $this$forEach$iv = this.class2ContextualFactory;
        boolean $i$f$forEach = false;
        Iterator<Map.Entry<KClass<?>, Object>> iterator2 = $this$forEach$iv.entrySet().iterator();
        while (iterator2.hasNext()) {
            entry = element$iv = iterator2.next();
            boolean bl = false;
            KClass<?> kclass = entry.getKey();
            ContextualProvider serial = entry.getValue();
            ContextualProvider contextualProvider = serial;
            if (contextualProvider instanceof ContextualProvider.Argless) {
                Intrinsics.checkNotNull(kclass, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                KSerializer<?> kSerializer = ((ContextualProvider.Argless)serial).getSerializer();
                Intrinsics.checkNotNull(kSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                collector.contextual(kclass, kSerializer);
                continue;
            }
            if (!(contextualProvider instanceof ContextualProvider.WithTypeArguments)) continue;
            collector.contextual(kclass, ((ContextualProvider.WithTypeArguments)serial).getProvider());
        }
        $this$forEach$iv = this.polyBase2Serializers;
        $i$f$forEach = false;
        iterator2 = $this$forEach$iv.entrySet().iterator();
        while (iterator2.hasNext()) {
            Map classMap;
            entry = element$iv = iterator2.next();
            boolean bl = false;
            baseClass = entry.getKey();
            Map $this$forEach$iv2 = classMap = (Map)((Object)entry.getValue());
            boolean $i$f$forEach2 = false;
            Iterator iterator3 = $this$forEach$iv2.entrySet().iterator();
            while (iterator3.hasNext()) {
                void var18_18;
                Map.Entry element$iv2;
                Map.Entry entry2 = element$iv2 = iterator3.next();
                boolean bl2 = false;
                KClass actualClass = (KClass)entry2.getKey();
                KSerializer serializer2 = (KSerializer)entry2.getValue();
                Intrinsics.checkNotNull(baseClass, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                Intrinsics.checkNotNull(actualClass, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                KSerializer $this$cast$iv = serializer2;
                boolean $i$f$cast = false;
                Intrinsics.checkNotNull(var18_18, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                collector.polymorphic(baseClass, actualClass, var18_18);
            }
        }
        $this$forEach$iv = this.polyBase2DefaultSerializerProvider;
        $i$f$forEach = false;
        iterator2 = $this$forEach$iv.entrySet().iterator();
        while (iterator2.hasNext()) {
            entry = element$iv = iterator2.next();
            boolean bl = false;
            baseClass = entry.getKey();
            provider = (Function1)((Object)entry.getValue());
            Intrinsics.checkNotNull(baseClass, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            Intrinsics.checkNotNull(provider, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = 'value')] kotlin.Any, kotlinx.serialization.SerializationStrategy<kotlin.Any>?>{ kotlinx.serialization.modules.SerializersModuleKt.PolymorphicSerializerProvider<kotlin.Any> }");
            collector.polymorphicDefaultSerializer(baseClass, (Function1)TypeIntrinsics.beforeCheckcastToFunctionOfArity(provider, 1));
        }
        $this$forEach$iv = this.polyBase2DefaultDeserializerProvider;
        $i$f$forEach = false;
        iterator2 = $this$forEach$iv.entrySet().iterator();
        while (iterator2.hasNext()) {
            void var9_9;
            entry = element$iv = iterator2.next();
            boolean bl = false;
            baseClass = entry.getKey();
            provider = (Function1)((Object)entry.getValue());
            Intrinsics.checkNotNull(baseClass, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            Intrinsics.checkNotNull(provider, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = 'className')] kotlin.String?, kotlinx.serialization.DeserializationStrategy<out kotlin.Any>?>{ kotlinx.serialization.modules.SerializersModuleKt.PolymorphicDeserializerProvider<out kotlin.Any> }");
            collector.polymorphicDefaultDeserializer(baseClass, (Function1)TypeIntrinsics.beforeCheckcastToFunctionOfArity(var9_9, 1));
        }
    }

    @Override
    @Nullable
    public <T> SerializationStrategy<T> getPolymorphic(@NotNull KClass<? super T> baseClass, @NotNull T value) {
        SerializationStrategy registered;
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(value, "value");
        if (!baseClass.isInstance(value)) {
            return null;
        }
        Map<KClass<?>, KSerializer<?>> map = this.polyBase2Serializers.get(baseClass);
        KSerializer<?> kSerializer = map != null ? map.get(Reflection.getOrCreateKotlinClass(value.getClass())) : null;
        SerializationStrategy serializationStrategy = registered = kSerializer instanceof SerializationStrategy ? (SerializationStrategy)kSerializer : null;
        if (serializationStrategy != null) {
            return serializationStrategy;
        }
        Function1<?, SerializationStrategy<?>> function1 = this.polyBase2DefaultSerializerProvider.get(baseClass);
        Function1<?, SerializationStrategy<?>> function12 = TypeIntrinsics.isFunctionOfArity(function1, 1) ? function1 : null;
        return function12 != null ? function12.invoke(value) : null;
    }
}

