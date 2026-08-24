/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.internal;

import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PrimitiveArraySerializer;
import kotlinx.serialization.internal.UIntArrayBuilder;
import org.jetbrains.annotations.NotNull;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@ExperimentalSerializationApi
@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u00c1\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u0002H\u0014\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\b\u0010\tJ/\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H\u0014\u00a2\u0006\u0004\b\u0013\u0010\u0014J*\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\rH\u0014\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001e\u001a\u00020\r*\u00020\u0002H\u0014\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010!\u001a\u00020\u0005*\u00020\u0002H\u0014\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u001f\u0010 \u0082\u0002\u000b\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\u00a8\u0006\""}, d2={"Lkotlinx/serialization/internal/UIntArraySerializer;", "Lkotlinx/serialization/KSerializer;", "Lkotlin/UIntArray;", "Lkotlinx/serialization/internal/PrimitiveArraySerializer;", "Lkotlin/UInt;", "Lkotlinx/serialization/internal/UIntArrayBuilder;", "<init>", "()V", "empty--hP7Qyg", "()[I", "empty", "Lkotlinx/serialization/encoding/CompositeDecoder;", "decoder", "", "index", "builder", "", "checkIndex", "", "readElement", "(Lkotlinx/serialization/encoding/CompositeDecoder;ILkotlinx/serialization/internal/UIntArrayBuilder;Z)V", "Lkotlinx/serialization/encoding/CompositeEncoder;", "encoder", "content", "size", "writeContent-CPlH8fI", "(Lkotlinx/serialization/encoding/CompositeEncoder;[II)V", "writeContent", "collectionSize--ajY-9A", "([I)I", "collectionSize", "toBuilder--ajY-9A", "([I)Lkotlinx/serialization/internal/UIntArrayBuilder;", "toBuilder", "kotlinx-serialization-core"})
@ExperimentalUnsignedTypes
@PublishedApi
public final class UIntArraySerializer
extends PrimitiveArraySerializer<UInt, UIntArray, UIntArrayBuilder>
implements KSerializer<UIntArray> {
    @NotNull
    public static final UIntArraySerializer INSTANCE = new UIntArraySerializer();

    @NotNull
    protected UIntArrayBuilder toBuilder--ajY-9A(@NotNull int[] $this$toBuilder_u2d_u2dajY_u2d9A) {
        Intrinsics.checkNotNullParameter($this$toBuilder_u2d_u2dajY_u2d9A, "$this$toBuilder");
        return new UIntArrayBuilder($this$toBuilder_u2d_u2dajY_u2d9A, null);
    }

    private UIntArraySerializer() {
        super(BuiltinSerializersKt.serializer(UInt.Companion));
    }

    protected void writeContent-CPlH8fI(@NotNull CompositeEncoder encoder, @NotNull int[] content, int size) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i = 0; i < size; ++i) {
            encoder.encodeInlineElement(this.getDescriptor(), i).encodeInt(UIntArray.get-pVg5ArA(content, i));
        }
    }

    protected int collectionSize--ajY-9A(@NotNull int[] $this$collectionSize_u2d_u2dajY_u2d9A) {
        Intrinsics.checkNotNullParameter($this$collectionSize_u2d_u2dajY_u2d9A, "$this$collectionSize");
        return UIntArray.getSize-impl($this$collectionSize_u2d_u2dajY_u2d9A);
    }

    @NotNull
    protected int[] empty--hP7Qyg() {
        return UIntArray.constructor-impl(0);
    }

    @Override
    protected void readElement(@NotNull CompositeDecoder decoder, int index, @NotNull UIntArrayBuilder builder, boolean checkIndex) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.append-WZ4Q5Ns$kotlinx_serialization_core(UInt.constructor-impl(decoder.decodeInlineElement(this.getDescriptor(), index).decodeInt()));
    }
}

