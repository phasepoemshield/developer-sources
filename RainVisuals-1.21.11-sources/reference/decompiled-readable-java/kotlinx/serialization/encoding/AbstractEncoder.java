/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.encoding;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.NoOpEncoder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\b\f\u0010\rJ%\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u0012\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0017H\u0016\u00a2\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u0017\u00a2\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u001cH\u0016\u00a2\u0006\u0004\b\u001d\u0010\u001eJ%\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u001c\u00a2\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\b!\u0010\"J\u001f\u0010$\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020&H\u0016\u00a2\u0006\u0004\b'\u0010(J%\u0010)\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020&\u00a2\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\b+\u0010,J\u001d\u0010-\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\b/\u00100J%\u00101\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000e\u00a2\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u00020\u000b2\u0006\u0010\n\u001a\u000203H\u0016\u00a2\u0006\u0004\b4\u00105J%\u00106\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u000203\u00a2\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\b8\u0010\u0004JA\u0010=\u001a\u00020\u000b\"\b\b\u0000\u0010:*\u0002092\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010<\u001a\b\u0012\u0004\u0012\u00028\u00000;2\b\u0010\n\u001a\u0004\u0018\u00018\u0000H\u0016\u00a2\u0006\u0004\b=\u0010>J;\u0010?\u001a\u00020\u000b\"\u0004\b\u0000\u0010:2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010<\u001a\b\u0012\u0004\u0012\u00028\u00000;2\u0006\u0010\n\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\b?\u0010>J\u0017\u0010A\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020@H\u0016\u00a2\u0006\u0004\bA\u0010BJ%\u0010C\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020@\u00a2\u0006\u0004\bC\u0010DJ\u0017\u0010F\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020EH\u0016\u00a2\u0006\u0004\bF\u0010GJ%\u0010H\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020E\u00a2\u0006\u0004\bH\u0010IJ\u0017\u0010J\u001a\u00020\u000b2\u0006\u0010\n\u001a\u000209H\u0016\u00a2\u0006\u0004\bJ\u0010KJ\u0017\u0010L\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\bL\u0010M\u00a8\u0006N"}, d2={"Lkotlinx/serialization/encoding/AbstractEncoder;", "Lkotlinx/serialization/encoding/Encoder;", "Lkotlinx/serialization/encoding/CompositeEncoder;", "<init>", "()V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "beginStructure", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/CompositeEncoder;", "", "value", "", "encodeBoolean", "(Z)V", "", "index", "encodeBooleanElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V", "", "encodeByte", "(B)V", "encodeByteElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;IB)V", "", "encodeChar", "(C)V", "encodeCharElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;IC)V", "", "encodeDouble", "(D)V", "encodeDoubleElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ID)V", "encodeElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", "enumDescriptor", "encodeEnum", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)V", "", "encodeFloat", "(F)V", "encodeFloatElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;IF)V", "encodeInline", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/Encoder;", "encodeInlineElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Lkotlinx/serialization/encoding/Encoder;", "encodeInt", "(I)V", "encodeIntElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;II)V", "", "encodeLong", "(J)V", "encodeLongElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;IJ)V", "encodeNull", "", "T", "Lkotlinx/serialization/SerializationStrategy;", "serializer", "encodeNullableSerializableElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V", "encodeSerializableElement", "", "encodeShort", "(S)V", "encodeShortElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;IS)V", "", "encodeString", "(Ljava/lang/String;)V", "encodeStringElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V", "encodeValue", "(Ljava/lang/Object;)V", "endStructure", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "kotlinx-serialization-core"})
@ExperimentalSerializationApi
public abstract class AbstractEncoder
implements Encoder,
CompositeEncoder {
    @Override
    public void encodeFloat(float value) {
        this.encodeValue(Float.valueOf(value));
    }

    @Override
    public <T> void encodeSerializableValue(@NotNull SerializationStrategy<? super T> serializer2, T value) {
        Encoder.DefaultImpls.encodeSerializableValue(this, serializer2, value);
    }

    @Override
    public <T> void encodeSerializableElement(@NotNull SerialDescriptor descriptor2, int index, @NotNull SerializationStrategy<? super T> serializer2, T value) {
        Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
        Intrinsics.checkNotNullParameter(serializer2, "serializer");
        if (this.encodeElement(descriptor2, index)) {
            this.encodeSerializableValue(serializer2, value);
        }
    }

    @Override
    public final void encodeBooleanElement(@NotNull SerialDescriptor descriptor2, int index, boolean value) {
        Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
        if (this.encodeElement(descriptor2, index)) {
            this.encodeBoolean(value);
        }
    }

    @Override
    public <T> void encodeNullableSerializableElement(@NotNull SerialDescriptor descriptor2, int index, @NotNull SerializationStrategy<? super T> serializer2, @Nullable T value) {
        Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
        Intrinsics.checkNotNullParameter(serializer2, "serializer");
        if (this.encodeElement(descriptor2, index)) {
            this.encodeNullableSerializableValue(serializer2, value);
        }
    }

    @Override
    @NotNull
    public Encoder encodeInline(@NotNull SerialDescriptor descriptor2) {
        Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
        return this;
    }

    @Override
    public void encodeEnum(@NotNull SerialDescriptor enumDescriptor, int index) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        this.encodeValue(index);
    }

    @Override
    public final void encodeByteElement(@NotNull SerialDescriptor descriptor2, int index, byte value) {
        Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
        if (this.encodeElement(descriptor2, index)) {
            this.encodeByte(value);
        }
    }

    @Override
    public void encodeNull() {
        throw new SerializationException("'null' is not supported by default");
    }

    public void encodeValue(@NotNull Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        throw new SerializationException("Non-serializable " + Reflection.getOrCreateKotlinClass(value.getClass()) + " is not supported by " + Reflection.getOrCreateKotlinClass(this.getClass()) + " encoder");
    }

    @Override
    public void encodeLong(long value) {
        this.encodeValue(value);
    }

    @Override
    public void encodeBoolean(boolean value) {
        this.encodeValue(value);
    }

    @Override
    public final void encodeIntElement(@NotNull SerialDescriptor descriptor2, int index, int value) {
        Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
        if (this.encodeElement(descriptor2, index)) {
            this.encodeInt(value);
        }
    }

    @Override
    public final void encodeStringElement(@NotNull SerialDescriptor descriptor2, int index, @NotNull String value) {
        Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.encodeElement(descriptor2, index)) {
            this.encodeString(value);
        }
    }

    @Override
    public final void encodeDoubleElement(@NotNull SerialDescriptor descriptor2, int index, double value) {
        Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
        if (this.encodeElement(descriptor2, index)) {
            this.encodeDouble(value);
        }
    }

    public boolean encodeElement(@NotNull SerialDescriptor descriptor2, int index) {
        Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
        return true;
    }

    @Override
    @NotNull
    public CompositeEncoder beginCollection(@NotNull SerialDescriptor descriptor2, int collectionSize) {
        return Encoder.DefaultImpls.beginCollection(this, descriptor2, collectionSize);
    }

    @Override
    @ExperimentalSerializationApi
    public <T> void encodeNullableSerializableValue(@NotNull SerializationStrategy<? super T> serializer2, @Nullable T value) {
        Encoder.DefaultImpls.encodeNullableSerializableValue(this, serializer2, value);
    }

    @Override
    public final void encodeShortElement(@NotNull SerialDescriptor descriptor2, int index, short value) {
        Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
        if (this.encodeElement(descriptor2, index)) {
            this.encodeShort(value);
        }
    }

    @Override
    @ExperimentalSerializationApi
    public void encodeNotNullMark() {
        Encoder.DefaultImpls.encodeNotNullMark(this);
    }

    @Override
    public void encodeDouble(double value) {
        this.encodeValue(value);
    }

    @Override
    public void encodeByte(byte value) {
        this.encodeValue(value);
    }

    @Override
    public final void encodeLongElement(@NotNull SerialDescriptor descriptor2, int index, long value) {
        Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
        if (this.encodeElement(descriptor2, index)) {
            this.encodeLong(value);
        }
    }

    @Override
    @NotNull
    public CompositeEncoder beginStructure(@NotNull SerialDescriptor descriptor2) {
        Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
        return this;
    }

    @Override
    public void encodeShort(short value) {
        this.encodeValue(value);
    }

    @Override
    @NotNull
    public final Encoder encodeInlineElement(@NotNull SerialDescriptor descriptor2, int index) {
        Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
        return this.encodeElement(descriptor2, index) ? this.encodeInline(descriptor2.getElementDescriptor(index)) : (Encoder)NoOpEncoder.INSTANCE;
    }

    @Override
    @ExperimentalSerializationApi
    public boolean shouldEncodeElementDefault(@NotNull SerialDescriptor descriptor2, int index) {
        return CompositeEncoder.DefaultImpls.shouldEncodeElementDefault(this, descriptor2, index);
    }

    @Override
    public final void encodeCharElement(@NotNull SerialDescriptor descriptor2, int index, char value) {
        Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
        if (this.encodeElement(descriptor2, index)) {
            this.encodeChar(value);
        }
    }

    @Override
    public void encodeChar(char value) {
        this.encodeValue(Character.valueOf(value));
    }

    @Override
    public void endStructure(@NotNull SerialDescriptor descriptor2) {
        Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
    }

    @Override
    public final void encodeFloatElement(@NotNull SerialDescriptor descriptor2, int index, float value) {
        Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
        if (this.encodeElement(descriptor2, index)) {
            this.encodeFloat(value);
        }
    }

    @Override
    public void encodeString(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.encodeValue(value);
    }

    @Override
    public void encodeInt(int value) {
        this.encodeValue(value);
    }
}

