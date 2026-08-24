/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.internal;

import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PrimitiveArraySerializer;
import kotlinx.serialization.internal.ULongArrayBuilder;
import org.jetbrains.annotations.NotNull;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@ExperimentalSerializationApi
@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u00c1\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u0002H\u0014\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\b\u0010\tJ/\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H\u0014\u00a2\u0006\u0004\b\u0013\u0010\u0014J*\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\rH\u0014\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001e\u001a\u00020\r*\u00020\u0002H\u0014\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010!\u001a\u00020\u0005*\u00020\u0002H\u0014\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u001f\u0010 \u0082\u0002\u000b\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\u00a8\u0006\""}, d2={"Lkotlinx/serialization/internal/ULongArraySerializer;", "Lkotlinx/serialization/KSerializer;", "Lkotlin/ULongArray;", "Lkotlinx/serialization/internal/PrimitiveArraySerializer;", "Lkotlin/ULong;", "Lkotlinx/serialization/internal/ULongArrayBuilder;", "<init>", "()V", "empty-Y2RjT0g", "()[J", "empty", "Lkotlinx/serialization/encoding/CompositeDecoder;", "decoder", "", "index", "builder", "", "checkIndex", "", "readElement", "(Lkotlinx/serialization/encoding/CompositeDecoder;ILkotlinx/serialization/internal/ULongArrayBuilder;Z)V", "Lkotlinx/serialization/encoding/CompositeEncoder;", "encoder", "content", "size", "writeContent-0q3Fkuo", "(Lkotlinx/serialization/encoding/CompositeEncoder;[JI)V", "writeContent", "collectionSize-QwZRm1k", "([J)I", "collectionSize", "toBuilder-QwZRm1k", "([J)Lkotlinx/serialization/internal/ULongArrayBuilder;", "toBuilder", "kotlinx-serialization-core"})
@ExperimentalUnsignedTypes
@PublishedApi
public final class ULongArraySerializer
extends PrimitiveArraySerializer<ULong, ULongArray, ULongArrayBuilder>
implements KSerializer<ULongArray> {
    @NotNull
    public static final ULongArraySerializer INSTANCE = new ULongArraySerializer();

    @NotNull
    protected long[] empty-Y2RjT0g() {
        return ULongArray.constructor-impl(0);
    }

    @NotNull
    protected ULongArrayBuilder toBuilder-QwZRm1k(@NotNull long[] $this$toBuilder_u2dQwZRm1k) {
        Intrinsics.checkNotNullParameter($this$toBuilder_u2dQwZRm1k, "$this$toBuilder");
        return new ULongArrayBuilder($this$toBuilder_u2dQwZRm1k, null);
    }

    protected int collectionSize-QwZRm1k(@NotNull long[] $this$collectionSize_u2dQwZRm1k) {
        Intrinsics.checkNotNullParameter($this$collectionSize_u2dQwZRm1k, "$this$collectionSize");
        return ULongArray.getSize-impl($this$collectionSize_u2dQwZRm1k);
    }

    private ULongArraySerializer() {
        super(BuiltinSerializersKt.serializer(ULong.Companion));
    }

    protected void writeContent-0q3Fkuo(@NotNull CompositeEncoder encoder, @NotNull long[] content, int size) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i = 0; i < size; ++i) {
            encoder.encodeInlineElement(this.getDescriptor(), i).encodeLong(ULongArray.get-s-VKNKU(content, i));
        }
    }

    @Override
    protected void readElement(@NotNull CompositeDecoder decoder, int index, @NotNull ULongArrayBuilder builder, boolean checkIndex) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.append-VKZWuLQ$kotlinx_serialization_core(ULong.constructor-impl(decoder.decodeInlineElement(this.getDescriptor(), index).decodeLong()));
    }
}

