/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.encoding;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ExperimentalSerializationApi
@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f\u00a2\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016\u00a2\u0006\u0004\b#\u0010$J\u001d\u0010%\u001a\u00020\"2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f\u00a2\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\b'\u0010(J\u001f\u0010)\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016\u00a2\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\fH\u0016\u00a2\u0006\u0004\b+\u0010,J\u001d\u0010-\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f\u00a2\u0006\u0004\b-\u0010.J\u000f\u00100\u001a\u00020/H\u0016\u00a2\u0006\u0004\b0\u00101J\u001d\u00102\u001a\u00020/2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f\u00a2\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\tH\u0016\u00a2\u0006\u0004\b4\u0010\u000bJ\u0011\u00106\u001a\u0004\u0018\u000105H\u0016\u00a2\u0006\u0004\b6\u00107JC\u0010=\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u00109*\u0002082\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u000e\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000:2\b\u0010<\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0004\b=\u0010>J=\u0010?\u001a\u00028\u0000\"\u0004\b\u0000\u001092\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\f\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000:2\b\u0010<\u001a\u0004\u0018\u00018\u0000H\u0016\u00a2\u0006\u0004\b?\u0010>J/\u0010@\u001a\u00028\u0000\"\u0004\b\u0000\u001092\f\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000:2\n\b\u0002\u0010<\u001a\u0004\u0018\u00018\u0000H\u0016\u00a2\u0006\u0004\b@\u0010AJ\u000f\u0010C\u001a\u00020BH\u0016\u00a2\u0006\u0004\bC\u0010DJ\u001d\u0010E\u001a\u00020B2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f\u00a2\u0006\u0004\bE\u0010FJ\u000f\u0010H\u001a\u00020GH\u0016\u00a2\u0006\u0004\bH\u0010IJ\u001d\u0010J\u001a\u00020G2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f\u00a2\u0006\u0004\bJ\u0010KJ\u000f\u0010L\u001a\u000208H\u0016\u00a2\u0006\u0004\bL\u0010MJ\u0017\u0010O\u001a\u00020N2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\bO\u0010P\u00a8\u0006Q"}, d2={"Lkotlinx/serialization/encoding/AbstractDecoder;", "Lkotlinx/serialization/encoding/Decoder;", "Lkotlinx/serialization/encoding/CompositeDecoder;", "<init>", "()V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "beginStructure", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/CompositeDecoder;", "", "decodeBoolean", "()Z", "", "index", "decodeBooleanElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", "", "decodeByte", "()B", "decodeByteElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)B", "", "decodeChar", "()C", "decodeCharElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)C", "", "decodeDouble", "()D", "decodeDoubleElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)D", "enumDescriptor", "decodeEnum", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)I", "", "decodeFloat", "()F", "decodeFloatElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)F", "decodeInline", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/Decoder;", "decodeInlineElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Lkotlinx/serialization/encoding/Decoder;", "decodeInt", "()I", "decodeIntElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)I", "", "decodeLong", "()J", "decodeLongElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)J", "decodeNotNullMark", "", "decodeNull", "()Ljava/lang/Void;", "", "T", "Lkotlinx/serialization/DeserializationStrategy;", "deserializer", "previousValue", "decodeNullableSerializableElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;", "decodeSerializableElement", "decodeSerializableValue", "(Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;", "", "decodeShort", "()S", "decodeShortElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)S", "", "decodeString", "()Ljava/lang/String;", "decodeStringElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String;", "decodeValue", "()Ljava/lang/Object;", "", "endStructure", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "kotlinx-serialization-core"})
public abstract class AbstractDecoder
implements Decoder,
CompositeDecoder {
    @Override
    @ExperimentalSerializationApi
    @Nullable
    public <T> T decodeNullableSerializableValue(@NotNull DeserializationStrategy<? extends T> deserializer) {
        return Decoder.DefaultImpls.decodeNullableSerializableValue(this, deserializer);
    }

    @Override
    public int decodeInt() {
        Object object = this.decodeValue();
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type kotlin.Int");
        return (Integer)object;
    }

    @NotNull
    public Object decodeValue() {
        throw new SerializationException(Reflection.getOrCreateKotlinClass(this.getClass()) + " can't retrieve untyped values");
    }

    @Override
    @ExperimentalSerializationApi
    public boolean decodeSequentially() {
        return CompositeDecoder.DefaultImpls.decodeSequentially(this);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    @Nullable
    public final <T> T decodeNullableSerializableElement(@NotNull SerialDescriptor descriptor2, int index, @NotNull DeserializationStrategy<? extends T> deserializer, @Nullable T previousValue) {
        Void void_;
        Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Decoder $this$decodeIfNullable$iv = this;
        boolean $i$f$decodeIfNullable = false;
        boolean isNullabilitySupported$iv = deserializer.getDescriptor().isNullable();
        if (!isNullabilitySupported$iv && !$this$decodeIfNullable$iv.decodeNotNullMark()) {
            void_ = $this$decodeIfNullable$iv.decodeNull();
            return (T)void_;
        }
        boolean bl = false;
        void_ = this.decodeSerializableValue(deserializer, previousValue);
        return (T)void_;
    }

    @Override
    public int decodeEnum(@NotNull SerialDescriptor enumDescriptor) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        Object object = this.decodeValue();
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type kotlin.Int");
        return (Integer)object;
    }

    @Override
    @NotNull
    public Decoder decodeInline(@NotNull SerialDescriptor descriptor2) {
        Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
        return this;
    }

    @Override
    public final char decodeCharElement(@NotNull SerialDescriptor descriptor2, int index) {
        Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
        return this.decodeChar();
    }

    @Override
    public void endStructure(@NotNull SerialDescriptor descriptor2) {
        Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
    }

    @Override
    public final int decodeIntElement(@NotNull SerialDescriptor descriptor2, int index) {
        Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
        return this.decodeInt();
    }

    @Override
    public char decodeChar() {
        Object object = this.decodeValue();
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type kotlin.Char");
        return ((Character)object).charValue();
    }

    @Override
    public final long decodeLongElement(@NotNull SerialDescriptor descriptor2, int index) {
        Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
        return this.decodeLong();
    }

    public static /* synthetic */ Object decodeSerializableValue$default(AbstractDecoder abstractDecoder, DeserializationStrategy deserializationStrategy, Object object, int n, Object object2) {
        if (object2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeSerializableValue");
        }
        if ((n & 2) != 0) {
            object = null;
        }
        return abstractDecoder.decodeSerializableValue(deserializationStrategy, object);
    }

    @Override
    public final double decodeDoubleElement(@NotNull SerialDescriptor descriptor2, int index) {
        Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
        return this.decodeDouble();
    }

    @Override
    public boolean decodeNotNullMark() {
        return true;
    }

    @Override
    @NotNull
    public CompositeDecoder beginStructure(@NotNull SerialDescriptor descriptor2) {
        Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
        return this;
    }

    @Override
    public float decodeFloat() {
        Object object = this.decodeValue();
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type kotlin.Float");
        return ((Float)object).floatValue();
    }

    @Override
    public int decodeCollectionSize(@NotNull SerialDescriptor descriptor2) {
        return CompositeDecoder.DefaultImpls.decodeCollectionSize(this, descriptor2);
    }

    @Override
    public <T> T decodeSerializableElement(@NotNull SerialDescriptor descriptor2, int index, @NotNull DeserializationStrategy<? extends T> deserializer, @Nullable T previousValue) {
        Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return this.decodeSerializableValue(deserializer, previousValue);
    }

    @Override
    @NotNull
    public final String decodeStringElement(@NotNull SerialDescriptor descriptor2, int index) {
        Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
        return this.decodeString();
    }

    @Override
    public short decodeShort() {
        Object object = this.decodeValue();
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type kotlin.Short");
        return (Short)object;
    }

    @Override
    public <T> T decodeSerializableValue(@NotNull DeserializationStrategy<? extends T> deserializer) {
        return Decoder.DefaultImpls.decodeSerializableValue(this, deserializer);
    }

    @Override
    public final short decodeShortElement(@NotNull SerialDescriptor descriptor2, int index) {
        Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
        return this.decodeShort();
    }

    @Override
    public long decodeLong() {
        Object object = this.decodeValue();
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type kotlin.Long");
        return (Long)object;
    }

    @Override
    public boolean decodeBoolean() {
        Object object = this.decodeValue();
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type kotlin.Boolean");
        return (Boolean)object;
    }

    public <T> T decodeSerializableValue(@NotNull DeserializationStrategy<? extends T> deserializer, @Nullable T previousValue) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return this.decodeSerializableValue(deserializer);
    }

    @Override
    @NotNull
    public String decodeString() {
        Object object = this.decodeValue();
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type kotlin.String");
        return (String)object;
    }

    @Override
    public byte decodeByte() {
        Object object = this.decodeValue();
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type kotlin.Byte");
        return (Byte)object;
    }

    @Override
    public final boolean decodeBooleanElement(@NotNull SerialDescriptor descriptor2, int index) {
        Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
        return this.decodeBoolean();
    }

    @Override
    @Nullable
    public Void decodeNull() {
        return null;
    }

    @Override
    @NotNull
    public Decoder decodeInlineElement(@NotNull SerialDescriptor descriptor2, int index) {
        Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
        return this.decodeInline(descriptor2.getElementDescriptor(index));
    }

    @Override
    public final float decodeFloatElement(@NotNull SerialDescriptor descriptor2, int index) {
        Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
        return this.decodeFloat();
    }

    @Override
    public final byte decodeByteElement(@NotNull SerialDescriptor descriptor2, int index) {
        Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
        return this.decodeByte();
    }

    @Override
    public double decodeDouble() {
        Object object = this.decodeValue();
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type kotlin.Double");
        return (Double)object;
    }
}

