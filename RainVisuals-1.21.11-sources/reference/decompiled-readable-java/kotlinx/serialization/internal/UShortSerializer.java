/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.UShort;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.ShortCompanionObject;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.InlineClassDescriptorKt;
import org.jetbrains.annotations.NotNull;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c1\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u0007\u0010\bJ\"\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u0016\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u000b\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\u00a8\u0006\u0016"}, d2={"Lkotlinx/serialization/internal/UShortSerializer;", "Lkotlinx/serialization/KSerializer;", "Lkotlin/UShort;", "<init>", "()V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize-BwKQO78", "(Lkotlinx/serialization/encoding/Decoder;)S", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize-i8woANY", "(Lkotlinx/serialization/encoding/Encoder;S)V", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "kotlinx-serialization-core"})
@PublishedApi
public final class UShortSerializer
implements KSerializer<UShort> {
    @NotNull
    public static final UShortSerializer INSTANCE = new UShortSerializer();
    @NotNull
    private static final SerialDescriptor descriptor = InlineClassDescriptorKt.InlinePrimitiveDescriptor("kotlin.UShort", BuiltinSerializersKt.serializer(ShortCompanionObject.INSTANCE));

    public short deserialize-BwKQO78(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return UShort.constructor-impl(decoder.decodeInline(this.getDescriptor()).decodeShort());
    }

    public void serialize-i8woANY(@NotNull Encoder encoder, short value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.encodeInline(this.getDescriptor()).encodeShort(value);
    }

    private UShortSerializer() {
    }

    @Override
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }
}

