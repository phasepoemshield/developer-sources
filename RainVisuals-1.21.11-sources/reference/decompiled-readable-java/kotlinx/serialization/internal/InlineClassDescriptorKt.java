/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.InlineClassDescriptor;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=2, xi=48, d1={"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007\u00a2\u0006\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2={"T", "", "name", "Lkotlinx/serialization/KSerializer;", "primitiveSerializer", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "InlinePrimitiveDescriptor", "(Ljava/lang/String;Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/descriptors/SerialDescriptor;", "kotlinx-serialization-core"})
public final class InlineClassDescriptorKt {
    @InternalSerializationApi
    @NotNull
    public static final <T> SerialDescriptor InlinePrimitiveDescriptor(@NotNull String name, @NotNull KSerializer<T> primitiveSerializer) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(primitiveSerializer, "primitiveSerializer");
        return new InlineClassDescriptor(name, new GeneratedSerializer<T>(primitiveSerializer){
            final /* synthetic */ KSerializer<T> $primitiveSerializer;
            {
                this.$primitiveSerializer = $primitiveSerializer;
            }

            @NotNull
            public SerialDescriptor getDescriptor() {
                throw new IllegalStateException("unsupported".toString());
            }

            @NotNull
            public KSerializer<?>[] childSerializers() {
                KSerializer[] kSerializerArray = new KSerializer[1];
                kSerializerArray[0] = this.$primitiveSerializer;
                return kSerializerArray;
            }

            public void serialize(@NotNull Encoder encoder, T value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                throw new IllegalStateException("unsupported".toString());
            }

            public T deserialize(@NotNull Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                throw new IllegalStateException("unsupported".toString());
            }

            @NotNull
            public KSerializer<?>[] typeParametersSerializers() {
                return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
            }
        });
    }
}

