/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.internal;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InternalSerializationApi
@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000N\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010(\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004B\t\b\u0004\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00028\u0002H$\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00028\u00012\u0006\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000e\u001a\u00028\u00012\u0006\u0010\n\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00018\u0001H\u0007\u00a2\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0015\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00028\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H$\u00a2\u0006\u0004\b\u0015\u0010\u0016J1\u0010\u001a\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00028\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u0018H$\u00a2\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00028\u0002H\u0002\u00a2\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010!\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00028\u0001H&\u00a2\u0006\u0004\b!\u0010\"J\u0013\u0010#\u001a\u00020\u0011*\u00028\u0002H$\u00a2\u0006\u0004\b#\u0010$J\u001b\u0010%\u001a\u00020\u0014*\u00028\u00022\u0006\u0010\u0013\u001a\u00020\u0011H$\u00a2\u0006\u0004\b%\u0010&J\u0019\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000'*\u00028\u0001H$\u00a2\u0006\u0004\b(\u0010)J\u0013\u0010*\u001a\u00020\u0011*\u00028\u0001H$\u00a2\u0006\u0004\b*\u0010$J\u0013\u0010+\u001a\u00028\u0002*\u00028\u0001H$\u00a2\u0006\u0004\b+\u0010,J\u0013\u0010-\u001a\u00028\u0001*\u00028\u0002H$\u00a2\u0006\u0004\b-\u0010,\u0082\u0001\u0002./\u00a8\u00060"}, d2={"Lkotlinx/serialization/internal/AbstractCollectionSerializer;", "Element", "Collection", "Builder", "Lkotlinx/serialization/KSerializer;", "<init>", "()V", "builder", "()Ljava/lang/Object;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;", "previous", "merge", "(Lkotlinx/serialization/encoding/Decoder;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/serialization/encoding/CompositeDecoder;", "", "startIndex", "size", "", "readAll", "(Lkotlinx/serialization/encoding/CompositeDecoder;Ljava/lang/Object;II)V", "index", "", "checkIndex", "readElement", "(Lkotlinx/serialization/encoding/CompositeDecoder;ILjava/lang/Object;Z)V", "readSize", "(Lkotlinx/serialization/encoding/CompositeDecoder;Ljava/lang/Object;)I", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "builderSize", "(Ljava/lang/Object;)I", "checkCapacity", "(Ljava/lang/Object;I)V", "", "collectionIterator", "(Ljava/lang/Object;)Ljava/util/Iterator;", "collectionSize", "toBuilder", "(Ljava/lang/Object;)Ljava/lang/Object;", "toResult", "Lkotlinx/serialization/internal/CollectionLikeSerializer;", "Lkotlinx/serialization/internal/MapLikeSerializer;", "kotlinx-serialization-core"})
public abstract class AbstractCollectionSerializer<Element, Collection, Builder>
implements KSerializer<Collection> {
    public static /* synthetic */ void readElement$default(AbstractCollectionSerializer abstractCollectionSerializer, CompositeDecoder compositeDecoder, int n, Object object, boolean bl, int n2, Object object2) {
        if (object2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readElement");
        }
        if ((n2 & 8) != 0) {
            bl = true;
        }
        abstractCollectionSerializer.readElement(compositeDecoder, n, object, bl);
    }

    protected abstract Builder builder();

    protected abstract void readAll(@NotNull CompositeDecoder var1, Builder var2, int var3, int var4);

    protected abstract Builder toBuilder(Collection var1);

    protected abstract int collectionSize(Collection var1);

    private AbstractCollectionSerializer() {
    }

    protected abstract int builderSize(Builder var1);

    protected abstract void readElement(@NotNull CompositeDecoder var1, int var2, Builder var3, boolean var4);

    /*
     * WARNING - void declaration
     */
    private final int readSize(CompositeDecoder decoder, Builder builder) {
        void var3_3;
        int size = decoder.decodeCollectionSize(this.getDescriptor());
        this.checkCapacity(builder, size);
        return (int)var3_3;
    }

    @Override
    public abstract void serialize(@NotNull Encoder var1, Collection var2);

    protected abstract Collection toResult(Builder var1);

    protected abstract void checkCapacity(Builder var1, int var2);

    public /* synthetic */ AbstractCollectionSerializer(DefaultConstructorMarker $constructor_marker) {
        this();
    }

    /*
     * WARNING - void declaration
     */
    @InternalSerializationApi
    public final Collection merge(@NotNull Decoder decoder, @Nullable Collection previous) {
        void var3_3;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Collection Collection2 = previous;
        Object object = Collection2;
        if (Collection2 == null || (object = this.toBuilder(object)) == null) {
            object = this.builder();
        }
        Object builder = object;
        int startIndex = this.builderSize(builder);
        CompositeDecoder compositeDecoder = decoder.beginStructure(this.getDescriptor());
        if (compositeDecoder.decodeSequentially()) {
            this.readAll(compositeDecoder, builder, startIndex, this.readSize(compositeDecoder, builder));
        } else {
            while (true) {
                int index = compositeDecoder.decodeElementIndex(this.getDescriptor());
                if (index == -1) break;
                AbstractCollectionSerializer.readElement$default(this, compositeDecoder, startIndex + index, builder, false, 8, null);
            }
        }
        compositeDecoder.endStructure(this.getDescriptor());
        return this.toResult(var3_3);
    }

    @Override
    public Collection deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return this.merge(decoder, null);
    }

    @NotNull
    protected abstract Iterator<Element> collectionIterator(Collection var1);
}

