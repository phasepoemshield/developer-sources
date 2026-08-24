/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.DoubleArrayBuilder;
import kotlinx.serialization.internal.PrimitiveArraySerializer;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0013\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u00c1\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0014\u00a2\u0006\u0004\b\b\u0010\tJ/\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0014\u00a2\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\fH\u0014\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\f*\u00020\u0002H\u0014\u00a2\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u0005*\u00020\u0002H\u0014\u00a2\u0006\u0004\b\u001c\u0010\u001d\u00a8\u0006\u001e"}, d2={"Lkotlinx/serialization/internal/DoubleArraySerializer;", "Lkotlinx/serialization/KSerializer;", "", "Lkotlinx/serialization/internal/PrimitiveArraySerializer;", "", "Lkotlinx/serialization/internal/DoubleArrayBuilder;", "<init>", "()V", "empty", "()[D", "Lkotlinx/serialization/encoding/CompositeDecoder;", "decoder", "", "index", "builder", "", "checkIndex", "", "readElement", "(Lkotlinx/serialization/encoding/CompositeDecoder;ILkotlinx/serialization/internal/DoubleArrayBuilder;Z)V", "Lkotlinx/serialization/encoding/CompositeEncoder;", "encoder", "content", "size", "writeContent", "(Lkotlinx/serialization/encoding/CompositeEncoder;[DI)V", "collectionSize", "([D)I", "toBuilder", "([D)Lkotlinx/serialization/internal/DoubleArrayBuilder;", "kotlinx-serialization-core"})
@PublishedApi
public final class DoubleArraySerializer
extends PrimitiveArraySerializer<Double, double[], DoubleArrayBuilder>
implements KSerializer<double[]> {
    @NotNull
    public static final DoubleArraySerializer INSTANCE = new DoubleArraySerializer();

    @Override
    @NotNull
    protected double[] empty() {
        return new double[0];
    }

    private DoubleArraySerializer() {
        super(BuiltinSerializersKt.serializer(DoubleCompanionObject.INSTANCE));
    }

    @Override
    protected int collectionSize(@NotNull double[] $this$collectionSize) {
        Intrinsics.checkNotNullParameter($this$collectionSize, "<this>");
        return $this$collectionSize.length;
    }

    @Override
    @NotNull
    protected DoubleArrayBuilder toBuilder(@NotNull double[] $this$toBuilder) {
        Intrinsics.checkNotNullParameter($this$toBuilder, "<this>");
        return new DoubleArrayBuilder($this$toBuilder);
    }

    @Override
    protected void writeContent(@NotNull CompositeEncoder encoder, @NotNull double[] content, int size) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i = 0; i < size; ++i) {
            encoder.encodeDoubleElement(this.getDescriptor(), i, content[i]);
        }
    }

    @Override
    protected void readElement(@NotNull CompositeDecoder decoder, int index, @NotNull DoubleArrayBuilder builder, boolean checkIndex) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.append$kotlinx_serialization_core(decoder.decodeDoubleElement(this.getDescriptor(), index));
    }
}

