/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization;

import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.Grouping;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KClass;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003BY\b\u0011\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0014\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00060\b\u0012\u0014\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\n0\b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\b\u00a2\u0006\u0004\b\u000e\u0010\u000fBI\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0014\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00060\b\u0012\u0014\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\n0\b\u00a2\u0006\u0004\b\u000e\u0010\u0010J)\u0010\u0015\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00142\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0015\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\b\u0015\u0010\u001bR\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u001c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u001d\u0010\u001eR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R0\u0010#\u001a\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0006\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\n0\"8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b#\u0010$R\u001b\u0010*\u001a\u00020%8VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R(\u0010+\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\n0\"8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b+\u0010$\u00a8\u0006,"}, d2={"Lkotlinx/serialization/SealedClassSerializer;", "", "T", "Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;", "", "serialName", "Lkotlin/reflect/KClass;", "baseClass", "", "subclasses", "Lkotlinx/serialization/KSerializer;", "subclassSerializers", "", "classAnnotations", "<init>", "(Ljava/lang/String;Lkotlin/reflect/KClass;[Lkotlin/reflect/KClass;[Lkotlinx/serialization/KSerializer;[Ljava/lang/annotation/Annotation;)V", "(Ljava/lang/String;Lkotlin/reflect/KClass;[Lkotlin/reflect/KClass;[Lkotlinx/serialization/KSerializer;)V", "Lkotlinx/serialization/encoding/CompositeDecoder;", "decoder", "klassName", "Lkotlinx/serialization/DeserializationStrategy;", "findPolymorphicSerializerOrNull", "(Lkotlinx/serialization/encoding/CompositeDecoder;Ljava/lang/String;)Lkotlinx/serialization/DeserializationStrategy;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlinx/serialization/SerializationStrategy;", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)Lkotlinx/serialization/SerializationStrategy;", "", "_annotations", "Ljava/util/List;", "Lkotlin/reflect/KClass;", "getBaseClass", "()Lkotlin/reflect/KClass;", "", "class2Serializer", "Ljava/util/Map;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor$delegate", "Lkotlin/Lazy;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "serialName2Serializer", "kotlinx-serialization-core"})
@InternalSerializationApi
public final class SealedClassSerializer<T>
extends AbstractPolymorphicSerializer<T> {
    @NotNull
    private List<? extends Annotation> _annotations;
    @NotNull
    private final Map<String, KSerializer<? extends T>> serialName2Serializer;
    @NotNull
    private final KClass<T> baseClass;
    @NotNull
    private final Map<KClass<? extends T>, KSerializer<? extends T>> class2Serializer;
    @NotNull
    private final Lazy descriptor$delegate;

    /*
     * WARNING - void declaration
     */
    public SealedClassSerializer(@NotNull String serialName, @NotNull KClass<T> baseClass, @NotNull KClass<? extends T>[] subclasses, @NotNull KSerializer<? extends T>[] subclassSerializers) {
        void var8_9;
        void $this$mapValuesTo$iv$iv;
        Object object;
        Object object2;
        Object k;
        Object object3;
        Map $this$aggregateTo$iv$iv;
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(subclasses, "subclasses");
        Intrinsics.checkNotNullParameter(subclassSerializers, "subclassSerializers");
        this.baseClass = baseClass;
        this._annotations = CollectionsKt.emptyList();
        this.descriptor$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0)new Function0<SerialDescriptor>(serialName, this){
            final /* synthetic */ String $serialName;
            final /* synthetic */ SealedClassSerializer<T> this$0;
            {
                this.$serialName = $serialName;
                this.this$0 = $receiver;
                super(0);
            }

            @NotNull
            public final SerialDescriptor invoke() {
                return SerialDescriptorsKt.buildSerialDescriptor(this.$serialName, PolymorphicKind.SEALED.INSTANCE, new SerialDescriptor[0], (Function1<? super ClassSerialDescriptorBuilder, Unit>)new Function1<ClassSerialDescriptorBuilder, Unit>(this.this$0){
                    final /* synthetic */ SealedClassSerializer<T> this$0;
                    {
                        this.this$0 = $receiver;
                        super(1);
                    }

                    public final void invoke(@NotNull ClassSerialDescriptorBuilder $this$buildSerialDescriptor) {
                        Intrinsics.checkNotNullParameter($this$buildSerialDescriptor, "$this$buildSerialDescriptor");
                        ClassSerialDescriptorBuilder.element$default($this$buildSerialDescriptor, "type", BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE).getDescriptor(), null, false, 12, null);
                        SerialDescriptor elementDescriptor2 = SerialDescriptorsKt.buildSerialDescriptor("kotlinx.serialization.Sealed<" + this.this$0.getBaseClass().getSimpleName() + '>', SerialKind.CONTEXTUAL.INSTANCE, new SerialDescriptor[0], (Function1<? super ClassSerialDescriptorBuilder, Unit>)new Function1<ClassSerialDescriptorBuilder, Unit>(this.this$0){
                            final /* synthetic */ SealedClassSerializer<T> this$0;

                            public final void invoke(@NotNull ClassSerialDescriptorBuilder $this$buildSerialDescriptor) {
                                Intrinsics.checkNotNullParameter($this$buildSerialDescriptor, "$this$buildSerialDescriptor");
                                Map $this$forEach$iv = SealedClassSerializer.access$getSerialName2Serializer$p(this.this$0);
                                boolean $i$f$forEach = false;
                                Iterator<Map.Entry<K, V>> iterator2 = $this$forEach$iv.entrySet().iterator();
                                while (iterator2.hasNext()) {
                                    Map.Entry<K, V> element$iv;
                                    Map.Entry<K, V> entry = element$iv = iterator2.next();
                                    boolean bl = false;
                                    String name = (String)entry.getKey();
                                    KSerializer serializer2 = (KSerializer)entry.getValue();
                                    ClassSerialDescriptorBuilder.element$default($this$buildSerialDescriptor, name, serializer2.getDescriptor(), null, false, 12, null);
                                }
                            }
                            {
                                this.this$0 = $receiver;
                                super(1);
                            }
                        });
                        ClassSerialDescriptorBuilder.element$default($this$buildSerialDescriptor, "value", elementDescriptor2, null, false, 12, null);
                        $this$buildSerialDescriptor.setAnnotations(SealedClassSerializer.access$get_annotations$p(this.this$0));
                    }
                });
            }
        });
        if (subclasses.length != subclassSerializers.length) {
            throw new IllegalArgumentException("All subclasses of sealed class " + this.getBaseClass().getSimpleName() + " should be marked @Serializable");
        }
        this.class2Serializer = MapsKt.toMap((Iterable)ArraysKt.zip(subclasses, subclassSerializers));
        Iterable $this$groupingBy$iv = this.class2Serializer.entrySet();
        boolean $i$f$groupingBy = false;
        Grouping $this$aggregate$iv = new Grouping<Map.Entry<? extends KClass<? extends T>, ? extends KSerializer<? extends T>>, String>($this$groupingBy$iv){
            final /* synthetic */ Iterable $this_groupingBy;

            /*
             * Ignored method signature, as it can't be verified against descriptor
             */
            public Object keyOf(Object element) {
                Map.Entry it = (Map.Entry)element;
                boolean bl = false;
                return ((KSerializer)it.getValue()).getDescriptor().getSerialName();
            }
            {
                this.$this_groupingBy = $receiver;
            }

            @NotNull
            public Iterator<Map.Entry<? extends KClass<? extends T>, ? extends KSerializer<? extends T>>> sourceIterator() {
                return this.$this_groupingBy.iterator();
            }
        };
        SealedClassSerializer sealedClassSerializer = this;
        boolean $i$f$aggregate = false;
        Grouping grouping = $this$aggregate$iv;
        Map destination$iv$iv = new LinkedHashMap();
        boolean $i$f$aggregateTo = false;
        Iterator iterator2 = $this$aggregateTo$iv$iv.sourceIterator();
        while (iterator2.hasNext()) {
            Object e$iv$iv = iterator2.next();
            Object key$iv$iv = $this$aggregateTo$iv$iv.keyOf(e$iv$iv);
            Object accumulator$iv$iv = destination$iv$iv.get(key$iv$iv);
            if (accumulator$iv$iv != null || !destination$iv$iv.containsKey(key$iv$iv)) {
                // empty if block
            }
            object3 = (Map.Entry)e$iv$iv;
            Map.Entry accumulator = (Map.Entry)accumulator$iv$iv;
            String key = (String)key$iv$iv;
            k = key$iv$iv;
            object2 = destination$iv$iv;
            boolean bl = false;
            if (accumulator != null) {
                void element;
                throw new IllegalStateException(("Multiple sealed subclasses of '" + this.getBaseClass() + "' have the same serial name '" + key + "': '" + accumulator.getKey() + "', '" + element.getKey() + '\'').toString());
            }
            object = object3;
            object2.put(k, object);
        }
        Map $this$mapValues$iv = destination$iv$iv;
        boolean $i$f$mapValues = false;
        $this$aggregateTo$iv$iv = $this$mapValues$iv;
        destination$iv$iv = new LinkedHashMap(MapsKt.mapCapacity($this$mapValues$iv.size()));
        boolean $i$f$mapValuesTo = false;
        Iterable $this$associateByTo$iv$iv$iv = $this$mapValuesTo$iv$iv.entrySet();
        boolean $i$f$associateByTo = false;
        for (Object element$iv$iv$iv : $this$associateByTo$iv$iv$iv) {
            void var14_24;
            Map.Entry it$iv$iv = (Map.Entry)element$iv$iv$iv;
            object3 = destination$iv$iv;
            boolean bl = false;
            Map.Entry it = (Map.Entry)element$iv$iv$iv;
            k = var14_24.getKey();
            object2 = object3;
            boolean bl2 = false;
            object = (KSerializer)((Map.Entry)it.getValue()).getValue();
            object2.put(k, object);
        }
        sealedClassSerializer.serialName2Serializer = var8_9;
    }

    @Override
    @Nullable
    public DeserializationStrategy<T> findPolymorphicSerializerOrNull(@NotNull CompositeDecoder decoder, @Nullable String klassName) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        KSerializer<? extends T> kSerializer = this.serialName2Serializer.get(klassName);
        return kSerializer != null ? (DeserializationStrategy)kSerializer : super.findPolymorphicSerializerOrNull(decoder, klassName);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    @Nullable
    public SerializationStrategy<T> findPolymorphicSerializerOrNull(@NotNull Encoder encoder, @NotNull T value) {
        SerializationStrategy<T> serializationStrategy;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        KSerializer<? extends T> kSerializer = this.class2Serializer.get(Reflection.getOrCreateKotlinClass(value.getClass()));
        SerializationStrategy<T> serializationStrategy2 = kSerializer != null ? (SerializationStrategy<T>)kSerializer : super.findPolymorphicSerializerOrNull(encoder, value);
        if (serializationStrategy2 != null) {
            void var3_3;
            SerializationStrategy<T> $this$cast$iv = serializationStrategy2;
            boolean bl = false;
            serializationStrategy = var3_3;
        } else {
            serializationStrategy = null;
        }
        return serializationStrategy;
    }

    public static final /* synthetic */ Map access$getSerialName2Serializer$p(SealedClassSerializer $this) {
        return $this.serialName2Serializer;
    }

    @PublishedApi
    public SealedClassSerializer(@NotNull String serialName, @NotNull KClass<T> baseClass, @NotNull KClass<? extends T>[] subclasses, @NotNull KSerializer<? extends T>[] subclassSerializers, @NotNull Annotation[] classAnnotations) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(subclasses, "subclasses");
        Intrinsics.checkNotNullParameter(subclassSerializers, "subclassSerializers");
        Intrinsics.checkNotNullParameter(classAnnotations, "classAnnotations");
        this(serialName, baseClass, subclasses, subclassSerializers);
        this._annotations = ArraysKt.asList(classAnnotations);
    }

    @Override
    @NotNull
    public SerialDescriptor getDescriptor() {
        Lazy lazy = this.descriptor$delegate;
        return (SerialDescriptor)lazy.getValue();
    }

    @Override
    @NotNull
    public KClass<T> getBaseClass() {
        return this.baseClass;
    }

    public static final /* synthetic */ List access$get_annotations$p(SealedClassSerializer $this) {
        return $this._annotations;
    }
}

