/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.internal;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.AbstractCollectionSerializer;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000R\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0004B\u0017\b\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u00a2\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00028\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0004\u00a2\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0014\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00028\u0001H\u0016\u00a2\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001d\u001a\u00020\u000f*\u00028\u00022\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00028\u0000H$\u00a2\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u001f8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b \u0010!R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0006\u0010#\u0082\u0001\u0003$%&\u00a8\u0006'"}, d2={"Lkotlinx/serialization/internal/CollectionLikeSerializer;", "Element", "Collection", "Builder", "Lkotlinx/serialization/internal/AbstractCollectionSerializer;", "Lkotlinx/serialization/KSerializer;", "elementSerializer", "<init>", "(Lkotlinx/serialization/KSerializer;)V", "Lkotlinx/serialization/encoding/CompositeDecoder;", "decoder", "builder", "", "startIndex", "size", "", "readAll", "(Lkotlinx/serialization/encoding/CompositeDecoder;Ljava/lang/Object;II)V", "index", "", "checkIndex", "readElement", "(Lkotlinx/serialization/encoding/CompositeDecoder;ILjava/lang/Object;Z)V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "element", "insert", "(Ljava/lang/Object;ILjava/lang/Object;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/internal/CollectionSerializer;", "Lkotlinx/serialization/internal/PrimitiveArraySerializer;", "Lkotlinx/serialization/internal/ReferenceArraySerializer;", "kotlinx-serialization-core"})
@PublishedApi
public abstract class CollectionLikeSerializer<Element, Collection, Builder>
extends AbstractCollectionSerializer<Element, Collection, Builder> {
    @NotNull
    private final KSerializer<Element> elementSerializer;

    /*
     * WARNING - void declaration
     */
    @Override
    public void serialize(@NotNull Encoder encoder, Collection value) {
        void $this$encodeCollection$iv;
        CompositeEncoder composite$iv;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        int size = this.collectionSize(value);
        Encoder encoder2 = encoder;
        SerialDescriptor descriptor$iv = this.getDescriptor();
        boolean $i$f$encodeCollection = false;
        CompositeEncoder $this$serialize_u24lambda_u240 = composite$iv = $this$encodeCollection$iv.beginCollection(descriptor$iv, size);
        boolean bl = false;
        Iterator iterator2 = this.collectionIterator(value);
        int index = 0;
        while (index < size) {
            void var11_11;
            $this$serialize_u24lambda_u240.encodeSerializableElement(this.getDescriptor(), index, this.elementSerializer, iterator2.next());
            ++var11_11;
        }
        composite$iv.endStructure(descriptor$iv);
    }

    @Override
    @NotNull
    public abstract SerialDescriptor getDescriptor();

    @Override
    protected void readElement(@NotNull CompositeDecoder decoder, int index, Builder builder, boolean checkIndex) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        this.insert(builder, index, CompositeDecoder.DefaultImpls.decodeSerializableElement$default(decoder, this.getDescriptor(), index, this.elementSerializer, null, 8, null));
    }

    private CollectionLikeSerializer(KSerializer<Element> elementSerializer) {
        super(null);
        this.elementSerializer = elementSerializer;
    }

    protected abstract void insert(Builder var1, int var2, Element var3);

    /*
     * WARNING - void declaration
     */
    @Override
    protected final void readAll(@NotNull CompositeDecoder decoder, Builder builder, int startIndex, int size) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        if (!(size >= 0)) {
            boolean bl = false;
            String string = "Size must be known in advance when using READ_ALL";
            throw new IllegalArgumentException(string.toString());
        }
        int index = 0;
        while (index < size) {
            void var5_7;
            this.readElement(decoder, startIndex + index, builder, false);
            ++var5_7;
        }
    }

    public /* synthetic */ CollectionLikeSerializer(KSerializer elementSerializer, DefaultConstructorMarker $constructor_marker) {
        this(elementSerializer);
    }
}

