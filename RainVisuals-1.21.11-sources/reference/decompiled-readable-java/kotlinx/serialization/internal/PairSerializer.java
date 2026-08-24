/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.PublishedApi;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.internal.KeyValueSerializer;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003B#\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\u00a2\u0006\u0004\b\b\u0010\tJ+\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0001H\u0014\u00a2\u0006\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R$\u0010\n\u001a\u00028\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R$\u0010\u000b\u001a\u00028\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0014\u00a8\u0006\u0016"}, d2={"Lkotlinx/serialization/internal/PairSerializer;", "K", "V", "Lkotlinx/serialization/internal/KeyValueSerializer;", "Lkotlin/Pair;", "Lkotlinx/serialization/KSerializer;", "keySerializer", "valueSerializer", "<init>", "(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V", "key", "value", "toResult", "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "getKey", "(Lkotlin/Pair;)Ljava/lang/Object;", "getValue", "kotlinx-serialization-core"})
@PublishedApi
public final class PairSerializer<K, V>
extends KeyValueSerializer<K, V, Pair<? extends K, ? extends V>> {
    @NotNull
    private final SerialDescriptor descriptor;

    @Override
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    @Override
    @NotNull
    protected Pair<K, V> toResult(K key, V value) {
        return TuplesKt.to(key, value);
    }

    @Override
    protected K getKey(@NotNull Pair<? extends K, ? extends V> $this$key) {
        Intrinsics.checkNotNullParameter($this$key, "<this>");
        return $this$key.getFirst();
    }

    public PairSerializer(@NotNull KSerializer<K> keySerializer, @NotNull KSerializer<V> valueSerializer) {
        Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        super(keySerializer, valueSerializer, null);
        this.descriptor = SerialDescriptorsKt.buildClassSerialDescriptor("kotlin.Pair", new SerialDescriptor[0], (Function1<? super ClassSerialDescriptorBuilder, Unit>)new Function1<ClassSerialDescriptorBuilder, Unit>(keySerializer, valueSerializer){
            final /* synthetic */ KSerializer<K> $keySerializer;
            final /* synthetic */ KSerializer<V> $valueSerializer;
            {
                this.$keySerializer = $keySerializer;
                this.$valueSerializer = $valueSerializer;
                super(1);
            }

            public final void invoke(@NotNull ClassSerialDescriptorBuilder $this$buildClassSerialDescriptor) {
                Intrinsics.checkNotNullParameter($this$buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
                ClassSerialDescriptorBuilder.element$default($this$buildClassSerialDescriptor, "first", this.$keySerializer.getDescriptor(), null, false, 12, null);
                ClassSerialDescriptorBuilder.element$default($this$buildClassSerialDescriptor, "second", this.$valueSerializer.getDescriptor(), null, false, 12, null);
            }
        });
    }

    @Override
    protected V getValue(@NotNull Pair<? extends K, ? extends V> $this$value) {
        Intrinsics.checkNotNullParameter($this$value, "<this>");
        return $this$value.getSecond();
    }
}

