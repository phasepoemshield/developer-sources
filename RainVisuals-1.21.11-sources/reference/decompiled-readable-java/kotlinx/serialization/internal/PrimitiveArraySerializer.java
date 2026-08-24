/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.internal;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.CollectionLikeSerializer;
import kotlinx.serialization.internal.PrimitiveArrayBuilder;
import kotlinx.serialization.internal.PrimitiveArrayDescriptor;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000Z\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010(\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b!\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u000e\b\u0002\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00010\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005B\u0017\b\u0000\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u00a2\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00028\u0002H\u0004\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00028\u00012\u0006\u0010\r\u001a\u00020\f\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00028\u0001H$\u00a2\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0018\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\n\u001a\u00028\u00022\u0006\u0010\u0016\u001a\u00020\u0015H$\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00028\u0001\u00a2\u0006\u0004\b\u001d\u0010\u001eJ'\u0010\"\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001f2\u0006\u0010 \u001a\u00028\u00012\u0006\u0010!\u001a\u00020\u0013H$\u00a2\u0006\u0004\b\"\u0010#J\u0013\u0010$\u001a\u00020\u0013*\u00028\u0002H\u0004\u00a2\u0006\u0004\b$\u0010%J\u001b\u0010&\u001a\u00020\u0017*\u00028\u00022\u0006\u0010!\u001a\u00020\u0013H\u0004\u00a2\u0006\u0004\b&\u0010'J\u0019\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(*\u00028\u0001H\u0004\u00a2\u0006\u0004\b)\u0010*J#\u0010,\u001a\u00020\u0017*\u00028\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010+\u001a\u00028\u0000H\u0004\u00a2\u0006\u0004\b,\u0010-J\u0013\u0010.\u001a\u00028\u0001*\u00028\u0002H\u0004\u00a2\u0006\u0004\b.\u0010/R\u0017\u00101\u001a\u0002008\u0006\u00a2\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104\u00a8\u00065"}, d2={"Lkotlinx/serialization/internal/PrimitiveArraySerializer;", "Element", "Array", "Lkotlinx/serialization/internal/PrimitiveArrayBuilder;", "Builder", "Lkotlinx/serialization/internal/CollectionLikeSerializer;", "Lkotlinx/serialization/KSerializer;", "primitiveSerializer", "<init>", "(Lkotlinx/serialization/KSerializer;)V", "builder", "()Lkotlinx/serialization/internal/PrimitiveArrayBuilder;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;", "empty", "()Ljava/lang/Object;", "Lkotlinx/serialization/encoding/CompositeDecoder;", "", "index", "", "checkIndex", "", "readElement", "(Lkotlinx/serialization/encoding/CompositeDecoder;ILkotlinx/serialization/internal/PrimitiveArrayBuilder;Z)V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/CompositeEncoder;", "content", "size", "writeContent", "(Lkotlinx/serialization/encoding/CompositeEncoder;Ljava/lang/Object;I)V", "builderSize", "(Lkotlinx/serialization/internal/PrimitiveArrayBuilder;)I", "checkCapacity", "(Lkotlinx/serialization/internal/PrimitiveArrayBuilder;I)V", "", "collectionIterator", "(Ljava/lang/Object;)Ljava/util/Iterator;", "element", "insert", "(Lkotlinx/serialization/internal/PrimitiveArrayBuilder;ILjava/lang/Object;)V", "toResult", "(Lkotlinx/serialization/internal/PrimitiveArrayBuilder;)Ljava/lang/Object;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "kotlinx-serialization-core"})
@PublishedApi
public abstract class PrimitiveArraySerializer<Element, Array, Builder extends PrimitiveArrayBuilder<Array>>
extends CollectionLikeSerializer<Element, Array, Builder> {
    @NotNull
    private final SerialDescriptor descriptor;

    public PrimitiveArraySerializer(@NotNull KSerializer<Element> primitiveSerializer) {
        Intrinsics.checkNotNullParameter(primitiveSerializer, "primitiveSerializer");
        super(primitiveSerializer, null);
        this.descriptor = new PrimitiveArrayDescriptor(primitiveSerializer.getDescriptor());
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public final void serialize(@NotNull Encoder encoder, Array value) {
        void $this$encodeCollection$iv;
        CompositeEncoder composite$iv;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        int size = this.collectionSize(value);
        Encoder encoder2 = encoder;
        SerialDescriptor descriptor$iv = this.descriptor;
        boolean $i$f$encodeCollection = false;
        CompositeEncoder $this$serialize_u24lambda_u240 = composite$iv = $this$encodeCollection$iv.beginCollection(descriptor$iv, size);
        boolean bl = false;
        this.writeContent($this$serialize_u24lambda_u240, value, size);
        composite$iv.endStructure(descriptor$iv);
    }

    @Override
    protected final void insert(@NotNull Builder $this$insert, int index, Element element) {
        Intrinsics.checkNotNullParameter($this$insert, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead".toString());
    }

    @Override
    protected abstract void readElement(@NotNull CompositeDecoder var1, int var2, @NotNull Builder var3, boolean var4);

    @Override
    protected final void checkCapacity(@NotNull Builder $this$checkCapacity, int size) {
        Intrinsics.checkNotNullParameter($this$checkCapacity, "<this>");
        ((PrimitiveArrayBuilder)$this$checkCapacity).ensureCapacity$kotlinx_serialization_core(size);
    }

    @Override
    protected final int builderSize(@NotNull Builder $this$builderSize) {
        Intrinsics.checkNotNullParameter($this$builderSize, "<this>");
        return ((PrimitiveArrayBuilder)$this$builderSize).getPosition$kotlinx_serialization_core();
    }

    @Override
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    @Override
    public final Array deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return this.merge(decoder, null);
    }

    @Override
    @NotNull
    protected final Iterator<Element> collectionIterator(Array $this$collectionIterator) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead".toString());
    }

    @Override
    protected final Array toResult(@NotNull Builder $this$toResult) {
        Intrinsics.checkNotNullParameter($this$toResult, "<this>");
        return ((PrimitiveArrayBuilder)$this$toResult).build$kotlinx_serialization_core();
    }

    protected abstract Array empty();

    @Override
    @NotNull
    protected final Builder builder() {
        return (Builder)((PrimitiveArrayBuilder)this.toBuilder(this.empty()));
    }

    protected abstract void writeContent(@NotNull CompositeEncoder var1, Array var2, int var3);
}

