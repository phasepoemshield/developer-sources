/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.internal;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.LinkedHashMapClassDesc;
import kotlinx.serialization.internal.MapLikeSerializer;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000D\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\u0010&\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022B\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012 \u0012\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u00060\u0003B#\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007\u00a2\u0006\u0004\b\n\u0010\u000bJ+\u0010\f\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u0006H\u0014\u00a2\u0006\u0004\b\f\u0010\rJ/\u0010\u000f\u001a\u00020\u000e*\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u0006H\u0014\u00a2\u0006\u0004\b\u000f\u0010\u0010J7\u0010\u0013\u001a\u00020\u0012*\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u00062\u0006\u0010\u0011\u001a\u00020\u000eH\u0014\u00a2\u0006\u0004\b\u0013\u0010\u0014J1\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00160\u0015*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0014\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u000e*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0014\u00a2\u0006\u0004\b\u0019\u0010\u001aJG\u0010\u001e\u001a\u00020\u0012*\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u00062\u0006\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00028\u0001H\u0014\u00a2\u0006\u0004\b\u001e\u0010\u001fJ;\u0010 \u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u0006*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0014\u00a2\u0006\u0004\b \u0010!J;\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004*\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u0006H\u0014\u00a2\u0006\u0004\b\"\u0010#R\u001a\u0010%\u001a\u00020$8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\u00a8\u0006)"}, d2={"Lkotlinx/serialization/internal/LinkedHashMapSerializer;", "K", "V", "Lkotlinx/serialization/internal/MapLikeSerializer;", "", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "Lkotlinx/serialization/KSerializer;", "kSerializer", "vSerializer", "<init>", "(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V", "builder", "()Ljava/util/LinkedHashMap;", "", "builderSize", "(Ljava/util/LinkedHashMap;)I", "size", "", "checkCapacity", "(Ljava/util/LinkedHashMap;I)V", "", "", "collectionIterator", "(Ljava/util/Map;)Ljava/util/Iterator;", "collectionSize", "(Ljava/util/Map;)I", "index", "key", "value", "insertKeyValuePair", "(Ljava/util/LinkedHashMap;ILjava/lang/Object;Ljava/lang/Object;)V", "toBuilder", "(Ljava/util/Map;)Ljava/util/LinkedHashMap;", "toResult", "(Ljava/util/LinkedHashMap;)Ljava/util/Map;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "kotlinx-serialization-core"})
@PublishedApi
public final class LinkedHashMapSerializer<K, V>
extends MapLikeSerializer<K, V, Map<K, ? extends V>, LinkedHashMap<K, V>> {
    @NotNull
    private final SerialDescriptor descriptor;

    @Override
    @NotNull
    protected Iterator<Map.Entry<K, V>> collectionIterator(@NotNull Map<K, ? extends V> $this$collectionIterator) {
        Intrinsics.checkNotNullParameter($this$collectionIterator, "<this>");
        return $this$collectionIterator.entrySet().iterator();
    }

    @Override
    @NotNull
    protected Map<K, V> toResult(@NotNull LinkedHashMap<K, V> $this$toResult) {
        Intrinsics.checkNotNullParameter($this$toResult, "<this>");
        return $this$toResult;
    }

    @Override
    protected void checkCapacity(@NotNull LinkedHashMap<K, V> $this$checkCapacity, int size) {
        Intrinsics.checkNotNullParameter($this$checkCapacity, "<this>");
    }

    @Override
    protected int collectionSize(@NotNull Map<K, ? extends V> $this$collectionSize) {
        Intrinsics.checkNotNullParameter($this$collectionSize, "<this>");
        return $this$collectionSize.size();
    }

    @Override
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    @Override
    @NotNull
    protected LinkedHashMap<K, V> toBuilder(@NotNull Map<K, ? extends V> $this$toBuilder) {
        Intrinsics.checkNotNullParameter($this$toBuilder, "<this>");
        LinkedHashMap linkedHashMap = $this$toBuilder instanceof LinkedHashMap ? (LinkedHashMap)$this$toBuilder : null;
        LinkedHashMap linkedHashMap2 = linkedHashMap;
        if (linkedHashMap == null) {
            linkedHashMap2 = new LinkedHashMap<K, V>($this$toBuilder);
        }
        return linkedHashMap2;
    }

    @Override
    protected int builderSize(@NotNull LinkedHashMap<K, V> $this$builderSize) {
        Intrinsics.checkNotNullParameter($this$builderSize, "<this>");
        return $this$builderSize.size() * 2;
    }

    @Override
    protected void insertKeyValuePair(@NotNull LinkedHashMap<K, V> $this$insertKeyValuePair, int index, K key, V value) {
        Intrinsics.checkNotNullParameter($this$insertKeyValuePair, "<this>");
        ((Map)$this$insertKeyValuePair).put(key, value);
    }

    public LinkedHashMapSerializer(@NotNull KSerializer<K> kSerializer, @NotNull KSerializer<V> vSerializer) {
        Intrinsics.checkNotNullParameter(kSerializer, "kSerializer");
        Intrinsics.checkNotNullParameter(vSerializer, "vSerializer");
        super(kSerializer, vSerializer, null);
        this.descriptor = new LinkedHashMapClassDesc(kSerializer.getDescriptor(), vSerializer.getDescriptor());
    }

    @Override
    @NotNull
    protected LinkedHashMap<K, V> builder() {
        return new LinkedHashMap();
    }
}

