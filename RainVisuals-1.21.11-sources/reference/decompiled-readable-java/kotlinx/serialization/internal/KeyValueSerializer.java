/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.TuplesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004B%\b\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00028\u00022\u0006\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00028\u0002H\u0016\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00028\u00022\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0001H$\u00a2\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0004X\u0084\u0004\u00a2\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0004X\u0084\u0004\u00a2\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0018\u0010\u0013\u001a\u00028\u0000*\u00028\u00028$X\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u000f\u001a\u00028\u0001*\u00028\u00028$X\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u001b\u0082\u0001\u0002\u001d\u001e\u00a8\u0006\u001f"}, d2={"Lkotlinx/serialization/internal/KeyValueSerializer;", "K", "V", "R", "Lkotlinx/serialization/KSerializer;", "keySerializer", "valueSerializer", "<init>", "(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "key", "toResult", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/serialization/KSerializer;", "getKeySerializer", "()Lkotlinx/serialization/KSerializer;", "getValueSerializer", "getKey", "(Ljava/lang/Object;)Ljava/lang/Object;", "getValue", "Lkotlinx/serialization/internal/MapEntrySerializer;", "Lkotlinx/serialization/internal/PairSerializer;", "kotlinx-serialization-core"})
@PublishedApi
public abstract class KeyValueSerializer<K, V, R>
implements KSerializer<R> {
    @NotNull
    private final KSerializer<V> valueSerializer;
    @NotNull
    private final KSerializer<K> keySerializer;

    protected abstract R toResult(K var1, V var2);

    private KeyValueSerializer(KSerializer<K> keySerializer, KSerializer<V> valueSerializer) {
        this.keySerializer = keySerializer;
        this.valueSerializer = valueSerializer;
    }

    protected abstract K getKey(R var1);

    public /* synthetic */ KeyValueSerializer(KSerializer keySerializer, KSerializer valueSerializer, DefaultConstructorMarker $constructor_marker) {
        this(keySerializer, valueSerializer);
    }

    @Override
    public void serialize(@NotNull Encoder encoder, R value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        CompositeEncoder structuredEncoder = encoder.beginStructure(this.getDescriptor());
        structuredEncoder.encodeSerializableElement(this.getDescriptor(), 0, (SerializationStrategy)this.keySerializer, this.getKey(value));
        structuredEncoder.encodeSerializableElement(this.getDescriptor(), 1, (SerializationStrategy)this.valueSerializer, this.getValue(value));
        structuredEncoder.endStructure(this.getDescriptor());
    }

    @NotNull
    protected final KSerializer<K> getKeySerializer() {
        return this.keySerializer;
    }

    protected abstract V getValue(R var1);

    @NotNull
    protected final KSerializer<V> getValueSerializer() {
        return this.valueSerializer;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public R deserialize(@NotNull Decoder decoder) {
        R r;
        Object value;
        Object key;
        void $this$decodeStructure$iv;
        CompositeDecoder composite$iv;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Decoder decoder2 = decoder;
        SerialDescriptor descriptor$iv = this.getDescriptor();
        boolean $i$f$decodeStructure = false;
        CompositeDecoder $this$deserialize_u24lambda_u240 = composite$iv = $this$decodeStructure$iv.beginStructure(descriptor$iv);
        boolean bl = false;
        if ($this$deserialize_u24lambda_u240.decodeSequentially()) {
            key = CompositeDecoder.DefaultImpls.decodeSerializableElement$default($this$deserialize_u24lambda_u240, this.getDescriptor(), 0, this.getKeySerializer(), null, 8, null);
            value = CompositeDecoder.DefaultImpls.decodeSerializableElement$default($this$deserialize_u24lambda_u240, this.getDescriptor(), 1, this.getValueSerializer(), null, 8, null);
            r = this.toResult(key, value);
        } else {
            key = TuplesKt.access$getNULL$p();
            value = TuplesKt.access$getNULL$p();
            block5: while (true) {
                int idx = $this$deserialize_u24lambda_u240.decodeElementIndex(this.getDescriptor());
                switch (idx) {
                    case -1: {
                        break block5;
                    }
                    case 0: {
                        key = CompositeDecoder.DefaultImpls.decodeSerializableElement$default($this$deserialize_u24lambda_u240, this.getDescriptor(), 0, this.getKeySerializer(), null, 8, null);
                        continue block5;
                    }
                    case 1: {
                        value = CompositeDecoder.DefaultImpls.decodeSerializableElement$default($this$deserialize_u24lambda_u240, this.getDescriptor(), 1, this.getValueSerializer(), null, 8, null);
                        continue block5;
                    }
                    default: {
                        throw new SerializationException("Invalid index: " + idx);
                    }
                }
                break;
            }
            if (key == TuplesKt.access$getNULL$p()) {
                throw new SerializationException("Element 'key' is missing");
            }
            if (value == TuplesKt.access$getNULL$p()) {
                throw new SerializationException("Element 'value' is missing");
            }
            r = this.toResult(key, value);
        }
        R result$iv = r;
        composite$iv.endStructure(descriptor$iv);
        return result$iv;
    }
}

