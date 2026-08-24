/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.reflect.KClass;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.PolymorphicSerializerKt;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\t\b\u0000\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\b\f\u0010\rJ)\u0010\u0011\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00102\u0006\u0010\u000b\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0017\u00a2\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0011\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00028\u0000H\u0017\u00a2\u0006\u0004\b\u0011\u0010\u0017J\u001d\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00028\u0000\u00a2\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\u00a8\u0006\u001f"}, d2={"Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;", "", "T", "Lkotlinx/serialization/KSerializer;", "<init>", "()V", "Lkotlinx/serialization/encoding/CompositeDecoder;", "compositeDecoder", "decodeSequentially", "(Lkotlinx/serialization/encoding/CompositeDecoder;)Ljava/lang/Object;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;", "", "klassName", "Lkotlinx/serialization/DeserializationStrategy;", "findPolymorphicSerializerOrNull", "(Lkotlinx/serialization/encoding/CompositeDecoder;Ljava/lang/String;)Lkotlinx/serialization/DeserializationStrategy;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlinx/serialization/SerializationStrategy;", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)Lkotlinx/serialization/SerializationStrategy;", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "Lkotlin/reflect/KClass;", "getBaseClass", "()Lkotlin/reflect/KClass;", "baseClass", "kotlinx-serialization-core"})
@InternalSerializationApi
public abstract class AbstractPolymorphicSerializer<T>
implements KSerializer<T> {
    /*
     * WARNING - void declaration
     */
    @Override
    @NotNull
    public final T deserialize(@NotNull Decoder decoder) {
        Object object;
        void $this$decodeStructure$iv;
        CompositeDecoder composite$iv;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Decoder decoder2 = decoder;
        SerialDescriptor descriptor$iv = this.getDescriptor();
        boolean $i$f$decodeStructure = false;
        CompositeDecoder $this$deserialize_u24lambda_u243 = composite$iv = $this$decodeStructure$iv.beginStructure(descriptor$iv);
        boolean bl = false;
        Ref.ObjectRef klassName = new Ref.ObjectRef();
        Object value = null;
        if ($this$deserialize_u24lambda_u243.decodeSequentially()) {
            object = this.decodeSequentially($this$deserialize_u24lambda_u243);
        } else {
            block5: while (true) {
                int index = $this$deserialize_u24lambda_u243.decodeElementIndex(this.getDescriptor());
                switch (index) {
                    case -1: {
                        break block5;
                    }
                    case 0: {
                        klassName.element = $this$deserialize_u24lambda_u243.decodeStringElement(this.getDescriptor(), index);
                        continue block5;
                    }
                    case 1: {
                        if (klassName.element == null) {
                            Object cfr_ignored_0 = klassName.element;
                            Ref.ObjectRef objectRef = klassName;
                            boolean bl2 = false;
                            Ref.ObjectRef objectRef2 = objectRef;
                            String string = "Cannot read polymorphic value before its type token";
                            throw new IllegalArgumentException(string.toString());
                        }
                        klassName.element = klassName.element;
                        DeserializationStrategy serializer2 = PolymorphicSerializerKt.findPolymorphicSerializer(this, $this$deserialize_u24lambda_u243, (String)klassName.element);
                        value = CompositeDecoder.DefaultImpls.decodeSerializableElement$default($this$deserialize_u24lambda_u243, this.getDescriptor(), index, serializer2, null, 8, null);
                        continue block5;
                    }
                    default: {
                        StringBuilder stringBuilder = new StringBuilder().append("Invalid index in polymorphic deserialization of ");
                        String string = (String)klassName.element;
                        if (string == null) {
                            string = "unknown class";
                        }
                        throw new SerializationException(stringBuilder.append(string).append("\n Expected 0, 1 or DECODE_DONE(-1), but found ").append(index).toString());
                    }
                }
                break;
            }
            Object object2 = value;
            if (object2 == null) {
                boolean bl3 = false;
                String string = "Polymorphic value has not been read for class " + (String)klassName.element;
                throw new IllegalArgumentException(string.toString());
            }
            object = object2;
            Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type T of kotlinx.serialization.internal.AbstractPolymorphicSerializer.deserialize$lambda$3");
        }
        Object result$iv = object;
        composite$iv.endStructure(descriptor$iv);
        return (T)result$iv;
    }

    @InternalSerializationApi
    @Nullable
    public SerializationStrategy<T> findPolymorphicSerializerOrNull(@NotNull Encoder encoder, @NotNull T value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        return encoder.getSerializersModule().getPolymorphic(this.getBaseClass(), value);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public final void serialize(@NotNull Encoder encoder, @NotNull T value) {
        void var5_5;
        void var7_7;
        void var10_10;
        void $this$encodeStructure$iv;
        CompositeEncoder composite$iv;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerializationStrategy<T> actualSerializer = PolymorphicSerializerKt.findPolymorphicSerializer(this, encoder, value);
        Encoder encoder2 = encoder;
        SerialDescriptor descriptor$iv = this.getDescriptor();
        boolean $i$f$encodeStructure = false;
        CompositeEncoder $this$serialize_u24lambda_u240 = composite$iv = $this$encodeStructure$iv.beginStructure(descriptor$iv);
        boolean bl = false;
        $this$serialize_u24lambda_u240.encodeStringElement(this.getDescriptor(), 0, actualSerializer.getDescriptor().getSerialName());
        SerialDescriptor serialDescriptor = this.getDescriptor();
        SerializationStrategy<T> $this$cast$iv = actualSerializer;
        boolean $i$f$cast = false;
        Intrinsics.checkNotNull(var10_10, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        $this$serialize_u24lambda_u240.encodeSerializableElement(serialDescriptor, 1, var10_10, value);
        var7_7.endStructure((SerialDescriptor)var5_5);
    }

    @NotNull
    public abstract KClass<T> getBaseClass();

    @InternalSerializationApi
    @Nullable
    public DeserializationStrategy<T> findPolymorphicSerializerOrNull(@NotNull CompositeDecoder decoder, @Nullable String klassName) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return decoder.getSerializersModule().getPolymorphic(this.getBaseClass(), klassName);
    }

    private final T decodeSequentially(CompositeDecoder compositeDecoder) {
        String klassName = compositeDecoder.decodeStringElement(this.getDescriptor(), 0);
        DeserializationStrategy serializer2 = PolymorphicSerializerKt.findPolymorphicSerializer(this, compositeDecoder, klassName);
        return (T)CompositeDecoder.DefaultImpls.decodeSerializableElement$default(compositeDecoder, this.getDescriptor(), 1, serializer2, null, 8, null);
    }
}

