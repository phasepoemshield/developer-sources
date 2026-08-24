/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.modules;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ReplaceWith;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.sequences.Sequence;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.modules.ContextualProvider;
import kotlinx.serialization.modules.SerialModuleImpl;
import kotlinx.serialization.modules.SerializerAlreadyRegisteredException;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleCollector;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\t\b\u0001\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0001\u00a2\u0006\u0004\b\u0005\u0010\u0006JX\u0010\u0013\u001a\u00020\u0012\"\b\b\u0000\u0010\b*\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2/\u0010\u0011\u001a+\u0012\u001d\u0012\u001b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\f\u00a2\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\u000bH\u0016\u00a2\u0006\u0004\b\u0013\u0010\u0014J5\u0010\u0013\u001a\u00020\u0012\"\b\b\u0000\u0010\b*\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016\u00a2\u0006\u0004\b\u0013\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0018\u0010\u0019JM\u0010\u001f\u001a\u00020\u0012\"\b\b\u0000\u0010\u001a*\u00020\u0007\"\b\b\u0001\u0010\u001b*\u00028\u00002\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00010\t2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0016\u00a2\u0006\u0004\b\u001f\u0010 JT\u0010%\u001a\u00020\u0012\"\b\b\u0000\u0010\u001a*\u00020\u00072\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\t2+\u0010$\u001a'\u0012\u0015\u0012\u0013\u0018\u00010!\u00a2\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\"\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010#0\u000bH\u0016\u00a2\u0006\u0004\b%\u0010\u0014JR\u0010)\u001a\u00020\u0012\"\b\b\u0000\u0010\u001a*\u00020\u00072\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\t2)\u0010(\u001a%\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(&\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010'0\u000bH\u0016\u00a2\u0006\u0004\b)\u0010\u0014J\\\u0010,\u001a\u00020\u0012\"\b\b\u0000\u0010\u001a*\u00020\u00072\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\t2+\u0010$\u001a'\u0012\u0015\u0012\u0013\u0018\u00010!\u00a2\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\"\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010#0\u000b2\u0006\u0010+\u001a\u00020*H\u0001\u00a2\u0006\u0004\b,\u0010-JZ\u0010.\u001a\u00020\u0012\"\b\b\u0000\u0010\u001a*\u00020\u00072\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\t2)\u0010(\u001a%\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(&\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010'0\u000b2\u0006\u0010+\u001a\u00020*H\u0001\u00a2\u0006\u0004\b.\u0010-JW\u00101\u001a\u00020\u0012\"\b\b\u0000\u0010\u001a*\u00020\u0007\"\b\b\u0001\u0010\u001b*\u00028\u00002\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\f\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00010\t2\f\u00100\u001a\b\u0012\u0004\u0012\u00028\u00010\r2\b\b\u0002\u0010+\u001a\u00020*H\u0001\u00a2\u0006\u0004\b1\u00102J9\u00105\u001a\u00020\u0012\"\b\b\u0000\u0010\b*\u00020\u00072\f\u00103\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u0011\u001a\u0002042\b\b\u0002\u0010+\u001a\u00020*H\u0001\u00a2\u0006\u0004\b5\u00106R$\u00108\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u000204078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b8\u00109RO\u0010;\u001a=\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012/\u0012-\u0012\u0015\u0012\u0013\u0018\u00010!\u00a2\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\"\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010#0\u000bj\u0006\u0012\u0002\b\u0003`:078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b;\u00109R<\u0010=\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u001c\u0012\u001a\u0012\u0002\b\u0003\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010'0\u000bj\u0006\u0012\u0002\b\u0003`<078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b=\u00109R4\u0010>\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020!\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r07078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b>\u00109R8\u0010?\u001a&\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0018\u0012\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r07078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b?\u00109\u00a8\u0006@"}, d2={"Lkotlinx/serialization/modules/SerializersModuleBuilder;", "Lkotlinx/serialization/modules/SerializersModuleCollector;", "<init>", "()V", "Lkotlinx/serialization/modules/SerializersModule;", "build", "()Lkotlinx/serialization/modules/SerializersModule;", "", "T", "Lkotlin/reflect/KClass;", "kClass", "Lkotlin/Function1;", "", "Lkotlinx/serialization/KSerializer;", "Lkotlin/ParameterName;", "name", "typeArgumentsSerializers", "provider", "", "contextual", "(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function1;)V", "serializer", "(Lkotlin/reflect/KClass;Lkotlinx/serialization/KSerializer;)V", "module", "include", "(Lkotlinx/serialization/modules/SerializersModule;)V", "Base", "Sub", "baseClass", "actualClass", "actualSerializer", "polymorphic", "(Lkotlin/reflect/KClass;Lkotlin/reflect/KClass;Lkotlinx/serialization/KSerializer;)V", "", "className", "Lkotlinx/serialization/DeserializationStrategy;", "defaultDeserializerProvider", "polymorphicDefaultDeserializer", "value", "Lkotlinx/serialization/SerializationStrategy;", "defaultSerializerProvider", "polymorphicDefaultSerializer", "", "allowOverwrite", "registerDefaultPolymorphicDeserializer", "(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function1;Z)V", "registerDefaultPolymorphicSerializer", "concreteClass", "concreteSerializer", "registerPolymorphicSerializer", "(Lkotlin/reflect/KClass;Lkotlin/reflect/KClass;Lkotlinx/serialization/KSerializer;Z)V", "forClass", "Lkotlinx/serialization/modules/ContextualProvider;", "registerSerializer", "(Lkotlin/reflect/KClass;Lkotlinx/serialization/modules/ContextualProvider;Z)V", "", "class2ContextualProvider", "Ljava/util/Map;", "Lkotlinx/serialization/modules/PolymorphicDeserializerProvider;", "polyBase2DefaultDeserializerProvider", "Lkotlinx/serialization/modules/PolymorphicSerializerProvider;", "polyBase2DefaultSerializerProvider", "polyBase2NamedSerializers", "polyBase2Serializers", "kotlinx-serialization-core"})
public final class SerializersModuleBuilder
implements SerializersModuleCollector {
    @NotNull
    private final Map<KClass<?>, Map<String, KSerializer<?>>> polyBase2NamedSerializers;
    @NotNull
    private final Map<KClass<?>, ContextualProvider> class2ContextualProvider = new HashMap();
    @NotNull
    private final Map<KClass<?>, Map<KClass<?>, KSerializer<?>>> polyBase2Serializers = new HashMap();
    @NotNull
    private final Map<KClass<?>, Function1<String, DeserializationStrategy<?>>> polyBase2DefaultDeserializerProvider;
    @NotNull
    private final Map<KClass<?>, Function1<?, SerializationStrategy<?>>> polyBase2DefaultSerializerProvider = new HashMap();

    /*
     * WARNING - void declaration
     */
    @JvmName(name="registerPolymorphicSerializer")
    public final <Base, Sub extends Base> void registerPolymorphicSerializer(@NotNull KClass<Base> baseClass, @NotNull KClass<Sub> concreteClass, @NotNull KSerializer<Sub> concreteSerializer, boolean allowOverwrite) {
        void var5_5;
        void var8_8;
        void var3_3;
        KSerializer previousByName;
        void v1;
        Sequence<Map.Entry<KClass<?>, KSerializer<?>>> sequence;
        Map<KClass<?>, KSerializer<?>> map;
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(concreteClass, "concreteClass");
        Intrinsics.checkNotNullParameter(concreteSerializer, "concreteSerializer");
        String name = concreteSerializer.getDescriptor().getSerialName();
        Map<KClass<?>, Map<KClass<?>, KSerializer<?>>> $this$getOrPut$iv = this.polyBase2Serializers;
        boolean $i$f$getOrPut = false;
        Map<KClass<?>, KSerializer<?>> value$iv = $this$getOrPut$iv.get(baseClass);
        if (value$iv == null) {
            boolean bl = false;
            HashMap answer$iv = new HashMap();
            $this$getOrPut$iv.put(baseClass, answer$iv);
            map = answer$iv;
        } else {
            map = value$iv;
        }
        Map<KClass<?>, KSerializer<?>> baseClassSerializers = map;
        KSerializer<?> previousSerializer = baseClassSerializers.get(concreteClass);
        Map<KClass<?>, Map<String, KSerializer<?>>> $this$getOrPut$iv2 = this.polyBase2NamedSerializers;
        boolean $i$f$getOrPut2 = false;
        Map<String, KSerializer<?>> value$iv2 = $this$getOrPut$iv2.get(baseClass);
        if (value$iv2 == null) {
            boolean answer$iv22 = false;
            HashMap answer$iv22 = new HashMap();
            $this$getOrPut$iv2.put(baseClass, answer$iv22);
            v1 = sequence;
        } else {
            void var11_15;
            v1 = var11_15;
        }
        Map names = (Map)v1;
        if (allowOverwrite) {
            if (previousSerializer != null) {
                names.remove(previousSerializer.getDescriptor().getSerialName());
            }
            baseClassSerializers.put(concreteClass, concreteSerializer);
            names.put(name, concreteSerializer);
            return;
        }
        if (previousSerializer != null) {
            if (!Intrinsics.areEqual(previousSerializer, concreteSerializer)) {
                throw new SerializerAlreadyRegisteredException(baseClass, concreteClass);
            }
            names.remove(previousSerializer.getDescriptor().getSerialName());
        }
        if ((previousByName = (KSerializer)names.get(name)) != null) {
            void var10_13;
            Map.Entry<KClass<?>, KSerializer<?>> entry;
            block10: {
                Map<KClass<?>, KSerializer<?>> map2 = this.polyBase2Serializers.get(baseClass);
                Intrinsics.checkNotNull(map2);
                sequence = MapsKt.asSequence(map2);
                Iterator<Map.Entry<KClass<?>, KSerializer<?>>> iterator2 = sequence.iterator();
                while (iterator2.hasNext()) {
                    Map.Entry<KClass<?>, KSerializer<?>> entry2;
                    Map.Entry<KClass<?>, KSerializer<?>> it = entry2 = iterator2.next();
                    boolean bl = false;
                    boolean bl2 = it.getValue() == previousByName;
                    if (!bl2) continue;
                    entry = entry2;
                    break block10;
                }
                entry = null;
            }
            Map.Entry conflictingClass = entry;
            throw new IllegalArgumentException("Multiple polymorphic serializers for base class '" + baseClass + "' have the same serial name '" + name + "': '" + concreteClass + "' and '" + var10_13 + '\'');
        }
        baseClassSerializers.put(concreteClass, (KSerializer<?>)var3_3);
        var8_8.put(var5_5, var3_3);
    }

    @Override
    public <Base> void polymorphicDefaultDeserializer(@NotNull KClass<Base> baseClass, @NotNull Function1<? super String, ? extends DeserializationStrategy<? extends Base>> defaultDeserializerProvider) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(defaultDeserializerProvider, "defaultDeserializerProvider");
        this.registerDefaultPolymorphicDeserializer(baseClass, defaultDeserializerProvider, false);
    }

    @NotNull
    @PublishedApi
    public final SerializersModule build() {
        return new SerialModuleImpl(this.class2ContextualProvider, this.polyBase2Serializers, this.polyBase2DefaultSerializerProvider, this.polyBase2NamedSerializers, this.polyBase2DefaultDeserializerProvider);
    }

    @JvmName(name="registerDefaultPolymorphicSerializer")
    public final <Base> void registerDefaultPolymorphicSerializer(@NotNull KClass<Base> baseClass, @NotNull Function1<? super Base, ? extends SerializationStrategy<? super Base>> defaultSerializerProvider, boolean allowOverwrite) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(defaultSerializerProvider, "defaultSerializerProvider");
        Function1<?, SerializationStrategy<?>> previous = this.polyBase2DefaultSerializerProvider.get(baseClass);
        if (previous != null) {
            if (!Intrinsics.areEqual(previous, defaultSerializerProvider)) {
                if (!allowOverwrite) {
                    throw new IllegalArgumentException("Default serializers provider for " + baseClass + " is already registered: " + previous);
                }
            }
        }
        this.polyBase2DefaultSerializerProvider.put(baseClass, defaultSerializerProvider);
    }

    @Override
    public <T> void contextual(@NotNull KClass<T> kClass, @NotNull Function1<? super List<? extends KSerializer<?>>, ? extends KSerializer<?>> provider) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(provider, "provider");
        SerializersModuleBuilder.registerSerializer$default(this, kClass, new ContextualProvider.WithTypeArguments(provider), false, 4, null);
    }

    public static /* synthetic */ void registerSerializer$default(SerializersModuleBuilder serializersModuleBuilder, KClass kClass, ContextualProvider contextualProvider, boolean bl, int n, Object object) {
        if ((n & 4) != 0) {
            bl = false;
        }
        serializersModuleBuilder.registerSerializer(kClass, contextualProvider, bl);
    }

    @Override
    @Deprecated(message="Deprecated in favor of function with more precise name: polymorphicDefaultDeserializer", replaceWith=@ReplaceWith(expression="polymorphicDefaultDeserializer(baseClass, defaultDeserializerProvider)", imports={}), level=DeprecationLevel.WARNING)
    public <Base> void polymorphicDefault(@NotNull KClass<Base> baseClass, @NotNull Function1<? super String, ? extends DeserializationStrategy<? extends Base>> defaultDeserializerProvider) {
        SerializersModuleCollector.DefaultImpls.polymorphicDefault(this, baseClass, defaultDeserializerProvider);
    }

    public static /* synthetic */ void registerPolymorphicSerializer$default(SerializersModuleBuilder serializersModuleBuilder, KClass kClass, KClass kClass2, KSerializer kSerializer, boolean bl, int n, Object object) {
        if ((n & 8) != 0) {
            bl = false;
        }
        serializersModuleBuilder.registerPolymorphicSerializer(kClass, kClass2, kSerializer, bl);
    }

    @Override
    public <Base, Sub extends Base> void polymorphic(@NotNull KClass<Base> baseClass, @NotNull KClass<Sub> actualClass, @NotNull KSerializer<Sub> actualSerializer) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(actualClass, "actualClass");
        Intrinsics.checkNotNullParameter(actualSerializer, "actualSerializer");
        SerializersModuleBuilder.registerPolymorphicSerializer$default(this, baseClass, actualClass, actualSerializer, false, 8, null);
    }

    @JvmName(name="registerSerializer")
    public final <T> void registerSerializer(@NotNull KClass<T> forClass, @NotNull ContextualProvider provider, boolean allowOverwrite) {
        ContextualProvider previous;
        Intrinsics.checkNotNullParameter(forClass, "forClass");
        Intrinsics.checkNotNullParameter(provider, "provider");
        if (!allowOverwrite && (previous = this.class2ContextualProvider.get(forClass)) != null) {
            if (!Intrinsics.areEqual(previous, provider)) {
                throw new SerializerAlreadyRegisteredException("Contextual serializer or serializer provider for " + forClass + " already registered in this module");
            }
        }
        this.class2ContextualProvider.put(forClass, provider);
    }

    @JvmName(name="registerDefaultPolymorphicDeserializer")
    public final <Base> void registerDefaultPolymorphicDeserializer(@NotNull KClass<Base> baseClass, @NotNull Function1<? super String, ? extends DeserializationStrategy<? extends Base>> defaultDeserializerProvider, boolean allowOverwrite) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(defaultDeserializerProvider, "defaultDeserializerProvider");
        Function1<String, DeserializationStrategy<?>> previous = this.polyBase2DefaultDeserializerProvider.get(baseClass);
        if (previous != null) {
            if (!Intrinsics.areEqual(previous, defaultDeserializerProvider)) {
                if (!allowOverwrite) {
                    throw new IllegalArgumentException("Default deserializers provider for " + baseClass + " is already registered: " + previous);
                }
            }
        }
        this.polyBase2DefaultDeserializerProvider.put(baseClass, defaultDeserializerProvider);
    }

    @Override
    public <Base> void polymorphicDefaultSerializer(@NotNull KClass<Base> baseClass, @NotNull Function1<? super Base, ? extends SerializationStrategy<? super Base>> defaultSerializerProvider) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(defaultSerializerProvider, "defaultSerializerProvider");
        this.registerDefaultPolymorphicSerializer(baseClass, defaultSerializerProvider, false);
    }

    public final void include(@NotNull SerializersModule module) {
        Intrinsics.checkNotNullParameter(module, "module");
        module.dumpTo(this);
    }

    @PublishedApi
    public SerializersModuleBuilder() {
        this.polyBase2NamedSerializers = new HashMap();
        this.polyBase2DefaultDeserializerProvider = new HashMap();
    }

    @Override
    public <T> void contextual(@NotNull KClass<T> kClass, @NotNull KSerializer<T> serializer2) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(serializer2, "serializer");
        SerializersModuleBuilder.registerSerializer$default(this, kClass, new ContextualProvider.Argless(serializer2), false, 4, null);
    }
}

