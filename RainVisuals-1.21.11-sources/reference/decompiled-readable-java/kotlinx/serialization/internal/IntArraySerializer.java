/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntArrayBuilder;
import kotlinx.serialization.internal.PrimitiveArraySerializer;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u00c1\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0014\u00a2\u0006\u0004\b\b\u0010\tJ/\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0014\u00a2\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0004H\u0014\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u0004*\u00020\u0002H\u0014\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u0005*\u00020\u0002H\u0014\u00a2\u0006\u0004\b\u001b\u0010\u001c\u00a8\u0006\u001d"}, d2={"Lkotlinx/serialization/internal/IntArraySerializer;", "Lkotlinx/serialization/KSerializer;", "", "Lkotlinx/serialization/internal/PrimitiveArraySerializer;", "", "Lkotlinx/serialization/internal/IntArrayBuilder;", "<init>", "()V", "empty", "()[I", "Lkotlinx/serialization/encoding/CompositeDecoder;", "decoder", "index", "builder", "", "checkIndex", "", "readElement", "(Lkotlinx/serialization/encoding/CompositeDecoder;ILkotlinx/serialization/internal/IntArrayBuilder;Z)V", "Lkotlinx/serialization/encoding/CompositeEncoder;", "encoder", "content", "size", "writeContent", "(Lkotlinx/serialization/encoding/CompositeEncoder;[II)V", "collectionSize", "([I)I", "toBuilder", "([I)Lkotlinx/serialization/internal/IntArrayBuilder;", "kotlinx-serialization-core"})
@PublishedApi
public final class IntArraySerializer
extends PrimitiveArraySerializer<Integer, int[], IntArrayBuilder>
implements KSerializer<int[]> {
    @NotNull
    public static final IntArraySerializer INSTANCE = new IntArraySerializer();

    @Override
    protected void readElement(@NotNull CompositeDecoder decoder, int index, @NotNull IntArrayBuilder builder, boolean checkIndex) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.append$kotlinx_serialization_core(decoder.decodeIntElement(this.getDescriptor(), index));
    }

    @Override
    @NotNull
    protected int[] empty() {
        return new int[0];
    }

    @Override
    @NotNull
    protected IntArrayBuilder toBuilder(@NotNull int[] $this$toBuilder) {
        Intrinsics.checkNotNullParameter($this$toBuilder, "<this>");
        return new IntArrayBuilder($this$toBuilder);
    }

    @Override
    protected void writeContent(@NotNull CompositeEncoder encoder, @NotNull int[] content, int size) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i = 0; i < size; ++i) {
            encoder.encodeIntElement(this.getDescriptor(), i, content[i]);
        }
    }

    private IntArraySerializer() {
        super(BuiltinSerializersKt.serializer(IntCompanionObject.INSTANCE));
    }

    @Override
    protected int collectionSize(@NotNull int[] $this$collectionSize) {
        Intrinsics.checkNotNullParameter($this$collectionSize, "<this>");
        return $this$collectionSize.length;
    }
}

