/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.SerialDescriptorForNullable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0003B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u0004\u0018\u00018\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002\u00a2\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00018\u0000H\u0016\u00a2\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\u00020\u00188\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0004\u0010\u001d\u00a8\u0006\u001e"}, d2={"Lkotlinx/serialization/internal/NullableSerializer;", "", "T", "Lkotlinx/serialization/KSerializer;", "serializer", "<init>", "(Lkotlinx/serialization/KSerializer;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/KSerializer;", "kotlinx-serialization-core"})
@PublishedApi
public final class NullableSerializer<T>
implements KSerializer<T> {
    @NotNull
    private final SerialDescriptor descriptor;
    @NotNull
    private final KSerializer<T> serializer;

    public NullableSerializer(@NotNull KSerializer<T> serializer2) {
        Intrinsics.checkNotNullParameter(serializer2, "serializer");
        this.serializer = serializer2;
        this.descriptor = new SerialDescriptorForNullable(this.serializer.getDescriptor());
    }

    @Override
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    @Override
    @Nullable
    public T deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return (T)(decoder.decodeNotNullMark() ? decoder.decodeSerializableValue((DeserializationStrategy)this.serializer) : decoder.decodeNull());
    }

    public boolean equals(@Nullable Object other) {
        block6: {
            block5: {
                if (this == other) {
                    return true;
                }
                if (other == null) break block5;
                if (this.getClass() == other.getClass()) break block6;
            }
            return false;
        }
        NullableSerializer cfr_ignored_0 = (NullableSerializer)other;
        if (!Intrinsics.areEqual(this.serializer, ((NullableSerializer)other).serializer)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.serializer.hashCode();
    }

    @Override
    public void serialize(@NotNull Encoder encoder, @Nullable T value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        if (value != null) {
            encoder.encodeNotNullMark();
            encoder.encodeSerializableValue((SerializationStrategy)this.serializer, value);
        } else {
            encoder.encodeNull();
        }
    }
}

