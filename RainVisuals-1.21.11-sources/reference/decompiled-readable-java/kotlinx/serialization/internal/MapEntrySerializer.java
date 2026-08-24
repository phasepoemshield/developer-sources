/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.internal;

import java.util.Map;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.internal.KeyValueSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003:\u0001\u0016B#\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\u00a2\u0006\u0004\b\b\u0010\tJ+\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0001H\u0014\u00a2\u0006\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R$\u0010\n\u001a\u00028\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R$\u0010\u000b\u001a\u00028\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0014\u00a8\u0006\u0017"}, d2={"Lkotlinx/serialization/internal/MapEntrySerializer;", "K", "V", "Lkotlinx/serialization/internal/KeyValueSerializer;", "", "Lkotlinx/serialization/KSerializer;", "keySerializer", "valueSerializer", "<init>", "(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V", "key", "value", "toResult", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "getKey", "(Ljava/util/Map$Entry;)Ljava/lang/Object;", "getValue", "MapEntry", "kotlinx-serialization-core"})
@PublishedApi
public final class MapEntrySerializer<K, V>
extends KeyValueSerializer<K, V, Map.Entry<? extends K, ? extends V>> {
    @NotNull
    private final SerialDescriptor descriptor;

    @Override
    @NotNull
    protected Map.Entry<K, V> toResult(K key, V value) {
        return new MapEntry<K, V>(key, value);
    }

    @Override
    protected K getKey(@NotNull Map.Entry<? extends K, ? extends V> $this$key) {
        Intrinsics.checkNotNullParameter($this$key, "<this>");
        return $this$key.getKey();
    }

    @Override
    protected V getValue(@NotNull Map.Entry<? extends K, ? extends V> $this$value) {
        Intrinsics.checkNotNullParameter($this$value, "<this>");
        return $this$value.getValue();
    }

    @Override
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    public MapEntrySerializer(@NotNull KSerializer<K> keySerializer, @NotNull KSerializer<V> valueSerializer) {
        Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        super(keySerializer, valueSerializer, null);
        this.descriptor = SerialDescriptorsKt.buildSerialDescriptor("kotlin.collections.Map.Entry", StructureKind.MAP.INSTANCE, new SerialDescriptor[0], (Function1<? super ClassSerialDescriptorBuilder, Unit>)new Function1<ClassSerialDescriptorBuilder, Unit>(keySerializer, valueSerializer){
            final /* synthetic */ KSerializer<V> $valueSerializer;
            final /* synthetic */ KSerializer<K> $keySerializer;
            {
                this.$keySerializer = $keySerializer;
                this.$valueSerializer = $valueSerializer;
                super(1);
            }

            public final void invoke(@NotNull ClassSerialDescriptorBuilder $this$buildSerialDescriptor) {
                Intrinsics.checkNotNullParameter($this$buildSerialDescriptor, "$this$buildSerialDescriptor");
                ClassSerialDescriptorBuilder.element$default($this$buildSerialDescriptor, "key", this.$keySerializer.getDescriptor(), null, false, 12, null);
                ClassSerialDescriptorBuilder.element$default($this$buildSerialDescriptor, "value", this.$valueSerializer.getDescriptor(), null, false, 12, null);
            }
        });
    }

    @Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010&\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\b\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00028\u0002\u0012\u0006\u0010\u0005\u001a\u00028\u0003\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00028\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00028\u0003H\u00c6\u0003\u00a2\u0006\u0004\b\n\u0010\tJ0\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00002\b\b\u0002\u0010\u0004\u001a\u00028\u00022\b\b\u0002\u0010\u0005\u001a\u00028\u0003H\u00c6\u0001\u00a2\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u00d6\u0003\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u00d6\u0001\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015H\u00d6\u0001\u00a2\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00028\u00028\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00028\u00038\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001a\u0010\t\u00a8\u0006\u001b"}, d2={"Lkotlinx/serialization/internal/MapEntrySerializer$MapEntry;", "K", "V", "", "key", "value", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "component1", "()Ljava/lang/Object;", "component2", "copy", "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlinx/serialization/internal/MapEntrySerializer$MapEntry;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getKey", "getValue", "kotlinx-serialization-core"})
    private static final class MapEntry<K, V>
    implements Map.Entry<K, V>,
    KMappedMarker {
        private final K key;
        private final V value;

        public final V component2() {
            return this.value;
        }

        @Override
        public V setValue(V newValue) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @NotNull
        public String toString() {
            return "MapEntry(key=" + this.key + ", value=" + this.value + ')';
        }

        public static /* synthetic */ MapEntry copy$default(MapEntry mapEntry, Object object, Object object2, int n, Object object3) {
            if ((n & 1) != 0) {
                object = mapEntry.key;
            }
            if ((n & 2) != 0) {
                object2 = mapEntry.value;
            }
            return mapEntry.copy(object, object2);
        }

        @Override
        public V getValue() {
            return this.value;
        }

        @NotNull
        public final MapEntry<K, V> copy(K key, V value) {
            return new MapEntry<K, V>(key, value);
        }

        @Override
        public K getKey() {
            return this.key;
        }

        public MapEntry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MapEntry)) {
                return false;
            }
            MapEntry mapEntry = (MapEntry)other;
            if (!Intrinsics.areEqual(this.key, mapEntry.key)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.value, mapEntry.value)) {
                return false;
            }
            return true;
        }

        @Override
        public int hashCode() {
            int result;
            int n = this.key == null ? 0 : (result = this.key.hashCode());
            int n2 = result * 31 + (this.value == null ? 0 : this.value.hashCode());
            return n2;
        }

        public final K component1() {
            return this.key;
        }
    }
}

