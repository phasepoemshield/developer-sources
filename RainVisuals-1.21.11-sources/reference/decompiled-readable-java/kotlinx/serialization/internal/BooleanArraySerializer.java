/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.BooleanCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanArrayBuilder;
import kotlinx.serialization.internal.PrimitiveArraySerializer;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u00c1\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0014\u00a2\u0006\u0004\b\b\u0010\tJ/\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0004H\u0014\u00a2\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\fH\u0014\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\f*\u00020\u0002H\u0014\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u0005*\u00020\u0002H\u0014\u00a2\u0006\u0004\b\u001b\u0010\u001c\u00a8\u0006\u001d"}, d2={"Lkotlinx/serialization/internal/BooleanArraySerializer;", "Lkotlinx/serialization/KSerializer;", "", "Lkotlinx/serialization/internal/PrimitiveArraySerializer;", "", "Lkotlinx/serialization/internal/BooleanArrayBuilder;", "<init>", "()V", "empty", "()[Z", "Lkotlinx/serialization/encoding/CompositeDecoder;", "decoder", "", "index", "builder", "checkIndex", "", "readElement", "(Lkotlinx/serialization/encoding/CompositeDecoder;ILkotlinx/serialization/internal/BooleanArrayBuilder;Z)V", "Lkotlinx/serialization/encoding/CompositeEncoder;", "encoder", "content", "size", "writeContent", "(Lkotlinx/serialization/encoding/CompositeEncoder;[ZI)V", "collectionSize", "([Z)I", "toBuilder", "([Z)Lkotlinx/serialization/internal/BooleanArrayBuilder;", "kotlinx-serialization-core"})
@PublishedApi
public final class BooleanArraySerializer
extends PrimitiveArraySerializer<Boolean, boolean[], BooleanArrayBuilder>
implements KSerializer<boolean[]> {
    @NotNull
    public static final BooleanArraySerializer INSTANCE = new BooleanArraySerializer();

    @Override
    @NotNull
    protected BooleanArrayBuilder toBuilder(@NotNull boolean[] $this$toBuilder) {
        Intrinsics.checkNotNullParameter($this$toBuilder, "<this>");
        return new BooleanArrayBuilder($this$toBuilder);
    }

    @Override
    protected void writeContent(@NotNull CompositeEncoder encoder, @NotNull boolean[] content, int size) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i = 0; i < size; ++i) {
            encoder.encodeBooleanElement(this.getDescriptor(), i, content[i]);
        }
    }

    @Override
    protected int collectionSize(@NotNull boolean[] $this$collectionSize) {
        Intrinsics.checkNotNullParameter($this$collectionSize, "<this>");
        return $this$collectionSize.length;
    }

    private BooleanArraySerializer() {
        super(BuiltinSerializersKt.serializer(BooleanCompanionObject.INSTANCE));
    }

    @Override
    protected void readElement(@NotNull CompositeDecoder decoder, int index, @NotNull BooleanArrayBuilder builder, boolean checkIndex) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.append$kotlinx_serialization_core(decoder.decodeBooleanElement(this.getDescriptor(), index));
    }

    @Override
    @NotNull
    protected boolean[] empty() {
        return new boolean[0];
    }
}

