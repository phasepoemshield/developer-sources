/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.internal;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.CollectionSerializer;
import kotlinx.serialization.internal.LinkedHashSetClassDesc;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012*\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u00050\u0002B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u00a2\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005H\u0014\u00a2\u0006\u0004\b\n\u0010\u000bJ#\u0010\r\u001a\u00020\f*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005H\u0014\u00a2\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0011\u001a\u00020\u0010*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u00052\u0006\u0010\u000f\u001a\u00020\fH\u0014\u00a2\u0006\u0004\b\u0011\u0010\u0012J3\u0010\u0015\u001a\u00020\u0010*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u00052\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00028\u0000H\u0014\u00a2\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005*\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0014\u00a2\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005H\u0014\u00a2\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\u00020\u001b8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\u00a8\u0006 "}, d2={"Lkotlinx/serialization/internal/LinkedHashSetSerializer;", "E", "Lkotlinx/serialization/internal/CollectionSerializer;", "", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "Lkotlinx/serialization/KSerializer;", "eSerializer", "<init>", "(Lkotlinx/serialization/KSerializer;)V", "builder", "()Ljava/util/LinkedHashSet;", "", "builderSize", "(Ljava/util/LinkedHashSet;)I", "size", "", "checkCapacity", "(Ljava/util/LinkedHashSet;I)V", "index", "element", "insert", "(Ljava/util/LinkedHashSet;ILjava/lang/Object;)V", "toBuilder", "(Ljava/util/Set;)Ljava/util/LinkedHashSet;", "toResult", "(Ljava/util/LinkedHashSet;)Ljava/util/Set;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "kotlinx-serialization-core"})
@PublishedApi
public final class LinkedHashSetSerializer<E>
extends CollectionSerializer<E, Set<? extends E>, LinkedHashSet<E>> {
    @NotNull
    private final SerialDescriptor descriptor;

    @Override
    protected void checkCapacity(@NotNull LinkedHashSet<E> $this$checkCapacity, int size) {
        Intrinsics.checkNotNullParameter($this$checkCapacity, "<this>");
    }

    @Override
    @NotNull
    protected LinkedHashSet<E> builder() {
        return new LinkedHashSet();
    }

    public LinkedHashSetSerializer(@NotNull KSerializer<E> eSerializer) {
        Intrinsics.checkNotNullParameter(eSerializer, "eSerializer");
        super(eSerializer);
        this.descriptor = new LinkedHashSetClassDesc(eSerializer.getDescriptor());
    }

    @Override
    protected void insert(@NotNull LinkedHashSet<E> $this$insert, int index, E element) {
        Intrinsics.checkNotNullParameter($this$insert, "<this>");
        $this$insert.add(element);
    }

    @Override
    @NotNull
    protected LinkedHashSet<E> toBuilder(@NotNull Set<? extends E> $this$toBuilder) {
        Intrinsics.checkNotNullParameter($this$toBuilder, "<this>");
        LinkedHashSet linkedHashSet = $this$toBuilder instanceof LinkedHashSet ? (LinkedHashSet)$this$toBuilder : null;
        LinkedHashSet linkedHashSet2 = linkedHashSet;
        if (linkedHashSet == null) {
            linkedHashSet2 = new LinkedHashSet($this$toBuilder);
        }
        return linkedHashSet2;
    }

    @Override
    @NotNull
    protected Set<E> toResult(@NotNull LinkedHashSet<E> $this$toResult) {
        Intrinsics.checkNotNullParameter($this$toResult, "<this>");
        return $this$toResult;
    }

    @Override
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    @Override
    protected int builderSize(@NotNull LinkedHashSet<E> $this$builderSize) {
        Intrinsics.checkNotNullParameter($this$builderSize, "<this>");
        return $this$builderSize.size();
    }
}

