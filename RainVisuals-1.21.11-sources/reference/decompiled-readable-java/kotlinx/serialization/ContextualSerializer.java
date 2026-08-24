/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.ContextAwareKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.Platform_commonKt;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.modules.SerializersModule;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0017\b\u0016\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u00a2\u0006\u0004\b\u0006\u0010\u0007B7\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\u0012\u0010\u0010\n\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\t\u00a2\u0006\u0004\b\u0006\u0010\u000bJ\u0017\u0010\u000e\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\fH\u0016\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0017\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\u00020\u001a8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\b\u0010\u001fR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0005\u0010 R\u001e\u0010\n\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030!8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\n\u0010\"\u00a8\u0006#"}, d2={"Lkotlinx/serialization/ContextualSerializer;", "", "T", "Lkotlinx/serialization/KSerializer;", "Lkotlin/reflect/KClass;", "serializableClass", "<init>", "(Lkotlin/reflect/KClass;)V", "fallbackSerializer", "", "typeArgumentsSerializers", "(Lkotlin/reflect/KClass;Lkotlinx/serialization/KSerializer;[Lkotlinx/serialization/KSerializer;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "Lkotlinx/serialization/modules/SerializersModule;", "serializersModule", "serializer", "(Lkotlinx/serialization/modules/SerializersModule;)Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/KSerializer;", "Lkotlin/reflect/KClass;", "", "Ljava/util/List;", "kotlinx-serialization-core"})
@ExperimentalSerializationApi
public final class ContextualSerializer<T>
implements KSerializer<T> {
    @Nullable
    private final KSerializer<T> fallbackSerializer;
    @NotNull
    private final KClass<T> serializableClass;
    @NotNull
    private final List<KSerializer<?>> typeArgumentsSerializers;
    @NotNull
    private final SerialDescriptor descriptor;

    public ContextualSerializer(@NotNull KClass<T> serializableClass, @Nullable KSerializer<T> fallbackSerializer, @NotNull KSerializer<?>[] typeArgumentsSerializers) {
        Intrinsics.checkNotNullParameter(serializableClass, "serializableClass");
        Intrinsics.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
        this.serializableClass = serializableClass;
        this.fallbackSerializer = fallbackSerializer;
        this.typeArgumentsSerializers = ArraysKt.asList(typeArgumentsSerializers);
        this.descriptor = ContextAwareKt.withContext(SerialDescriptorsKt.buildSerialDescriptor("kotlinx.serialization.ContextualSerializer", SerialKind.CONTEXTUAL.INSTANCE, new SerialDescriptor[0], (Function1<? super ClassSerialDescriptorBuilder, Unit>)new Function1<ClassSerialDescriptorBuilder, Unit>(this){
            final /* synthetic */ ContextualSerializer<T> this$0;

            public final void invoke(@NotNull ClassSerialDescriptorBuilder $this$buildSerialDescriptor) {
                Intrinsics.checkNotNullParameter($this$buildSerialDescriptor, "$this$buildSerialDescriptor");
                Object object = ContextualSerializer.access$getFallbackSerializer$p(this.this$0);
                List<Annotation> list = object != null && (object = object.getDescriptor()) != null ? object.getAnnotations() : null;
                List<Annotation> list2 = list;
                if (list == null) {
                    list2 = CollectionsKt.emptyList();
                }
                $this$buildSerialDescriptor.setAnnotations(list2);
            }
            {
                this.this$0 = $receiver;
                super(1);
            }
        }), this.serializableClass);
    }

    private final KSerializer<T> serializer(SerializersModule serializersModule) {
        KSerializer<T> kSerializer = serializersModule.getContextual(this.serializableClass, this.typeArgumentsSerializers);
        if (kSerializer == null && (kSerializer = this.fallbackSerializer) == null) {
            Platform_commonKt.serializerNotRegistered(this.serializableClass);
            throw new KotlinNothingValueException();
        }
        return kSerializer;
    }

    public ContextualSerializer(@NotNull KClass<T> serializableClass) {
        Intrinsics.checkNotNullParameter(serializableClass, "serializableClass");
        this(serializableClass, null, PluginHelperInterfacesKt.EMPTY_SERIALIZER_ARRAY);
    }

    @Override
    public void serialize(@NotNull Encoder encoder, @NotNull T value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.encodeSerializableValue((SerializationStrategy)this.serializer(encoder.getSerializersModule()), value);
    }

    @Override
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    public static final /* synthetic */ KSerializer access$getFallbackSerializer$p(ContextualSerializer $this) {
        return $this.fallbackSerializer;
    }

    @Override
    @NotNull
    public T deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return decoder.decodeSerializableValue((DeserializationStrategy)this.serializer(decoder.getSerializersModule()));
    }
}

