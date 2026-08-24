/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.internal;

import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.AbstractCollectionSerializer;
import org.jetbrains.annotations.NotNull;

@InternalSerializationApi
@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000X\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u0003*\u0014\b\u0003\u0010\u0005*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042 \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006B%\b\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\b\u00a2\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00028\u00032\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0004\u00a2\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00028\u00032\u0006\u0010\u0018\u001a\u00020\u0017H\u0004\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00028\u0002H\u0016\u00a2\u0006\u0004\b\u001e\u0010\u001fJ+\u0010!\u001a\u00020\u0013*\u00028\u00032\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010 \u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00028\u0001H$\u00a2\u0006\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020#8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b$\u0010%R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0006\u00a2\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b(\u0010)R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\b8\u0006\u00a2\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b*\u0010)\u0082\u0001\u0002+,\u00a8\u0006-"}, d2={"Lkotlinx/serialization/internal/MapLikeSerializer;", "Key", "Value", "Collection", "", "Builder", "Lkotlinx/serialization/internal/AbstractCollectionSerializer;", "", "Lkotlinx/serialization/KSerializer;", "keySerializer", "valueSerializer", "<init>", "(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V", "Lkotlinx/serialization/encoding/CompositeDecoder;", "decoder", "builder", "", "startIndex", "size", "", "readAll", "(Lkotlinx/serialization/encoding/CompositeDecoder;Ljava/util/Map;II)V", "index", "", "checkIndex", "readElement", "(Lkotlinx/serialization/encoding/CompositeDecoder;ILjava/util/Map;Z)V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "key", "insertKeyValuePair", "(Ljava/util/Map;ILjava/lang/Object;Ljava/lang/Object;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/KSerializer;", "getKeySerializer", "()Lkotlinx/serialization/KSerializer;", "getValueSerializer", "Lkotlinx/serialization/internal/HashMapSerializer;", "Lkotlinx/serialization/internal/LinkedHashMapSerializer;", "kotlinx-serialization-core"})
public abstract class MapLikeSerializer<Key, Value, Collection, Builder extends Map<Key, Value>>
extends AbstractCollectionSerializer<Map.Entry<? extends Key, ? extends Value>, Collection, Builder> {
    @NotNull
    private final KSerializer<Value> valueSerializer;
    @NotNull
    private final KSerializer<Key> keySerializer;

    /*
     * WARNING - void declaration
     */
    @Override
    protected final void readElement(@NotNull CompositeDecoder decoder, int index, @NotNull Builder builder, boolean checkIndex) {
        void var7_7;
        void var5_5;
        void var3_3;
        int n;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        Object key = CompositeDecoder.DefaultImpls.decodeSerializableElement$default(decoder, this.getDescriptor(), index, this.keySerializer, null, 8, null);
        if (checkIndex) {
            int n2;
            int it = n2 = decoder.decodeElementIndex(this.getDescriptor());
            boolean bl = false;
            if (!(it == index + 1)) {
                boolean bl2 = false;
                String string = "Value must follow key in a map, index for key: " + index + ", returned index for value: " + it;
                throw new IllegalArgumentException(string.toString());
            }
            n = n2;
        } else {
            n = index + 1;
        }
        int vIndex = n;
        Object value = builder.containsKey(key) && !(this.valueSerializer.getDescriptor().getKind() instanceof PrimitiveKind) ? decoder.decodeSerializableElement(this.getDescriptor(), vIndex, (DeserializationStrategy)this.valueSerializer, MapsKt.getValue(builder, key)) : CompositeDecoder.DefaultImpls.decodeSerializableElement$default(decoder, this.getDescriptor(), vIndex, this.valueSerializer, null, 8, null);
        var3_3.put(var5_5, var7_7);
    }

    protected abstract void insertKeyValuePair(@NotNull Builder var1, int var2, Key var3, Value var4);

    @Override
    @NotNull
    public abstract SerialDescriptor getDescriptor();

    public /* synthetic */ MapLikeSerializer(KSerializer keySerializer, KSerializer valueSerializer, DefaultConstructorMarker $constructor_marker) {
        this(keySerializer, valueSerializer);
    }

    @NotNull
    public final KSerializer<Value> getValueSerializer() {
        return this.valueSerializer;
    }

    private MapLikeSerializer(KSerializer<Key> keySerializer, KSerializer<Value> valueSerializer) {
        super(null);
        this.keySerializer = keySerializer;
        this.valueSerializer = valueSerializer;
    }

    @Override
    protected final void readAll(@NotNull CompositeDecoder decoder, @NotNull Builder builder, int startIndex, int size) {
        block6: {
            int n;
            int n2;
            int index;
            block5: {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                Intrinsics.checkNotNullParameter(builder, "builder");
                if (!(size >= 0)) {
                    boolean $i$a$-require-MapLikeSerializer$readAll$22 = false;
                    String $i$a$-require-MapLikeSerializer$readAll$22 = "Size must be known in advance when using READ_ALL";
                    throw new IllegalArgumentException($i$a$-require-MapLikeSerializer$readAll$22.toString());
                }
                IntProgression intProgression = RangesKt.step(RangesKt.until(0, size * 2), 2);
                index = intProgression.getFirst();
                n2 = intProgression.getLast();
                n = intProgression.getStep();
                if (n > 0 && index <= n2) break block5;
                if (n >= 0 || n2 > index) break block6;
            }
            while (true) {
                this.readElement(decoder, startIndex + index, builder, false);
                if (index == n2) break;
                var6_7 += n;
            }
        }
    }

    @NotNull
    public final KSerializer<Key> getKeySerializer() {
        return this.keySerializer;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void serialize(@NotNull Encoder encoder, Collection value) {
        void var5_5;
        void var7_7;
        void $this$encodeCollection$iv;
        CompositeEncoder composite$iv;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        int size = this.collectionSize(value);
        Encoder encoder2 = encoder;
        SerialDescriptor descriptor$iv = this.getDescriptor();
        boolean $i$f$encodeCollection = false;
        CompositeEncoder $this$serialize_u24lambda_u244 = composite$iv = $this$encodeCollection$iv.beginCollection(descriptor$iv, size);
        boolean bl = false;
        Iterator iterator2 = this.collectionIterator(value);
        int index = 0;
        Iterator $this$forEach$iv = iterator2;
        boolean $i$f$forEach = false;
        Iterator iterator3 = $this$forEach$iv;
        while (iterator3.hasNext()) {
            void var19_19;
            Object element$iv = iterator3.next();
            Map.Entry entry = (Map.Entry)element$iv;
            boolean bl2 = false;
            Object k = entry.getKey();
            Object v = entry.getValue();
            int n = index;
            index = n + 1;
            $this$serialize_u24lambda_u244.encodeSerializableElement(this.getDescriptor(), n, (SerializationStrategy)this.getKeySerializer(), k);
            n = index;
            index = n + 1;
            $this$serialize_u24lambda_u244.encodeSerializableElement(this.getDescriptor(), n, (SerializationStrategy)this.getValueSerializer(), var19_19);
        }
        var7_7.endStructure((SerialDescriptor)var5_5);
    }
}

