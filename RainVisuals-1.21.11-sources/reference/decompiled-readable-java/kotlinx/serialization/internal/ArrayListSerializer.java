/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.ArrayListClassDesc;
import kotlinx.serialization.internal.CollectionSerializer;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012*\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u00050\u0002B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u00a2\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005H\u0014\u00a2\u0006\u0004\b\n\u0010\u000bJ#\u0010\r\u001a\u00020\f*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005H\u0014\u00a2\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0011\u001a\u00020\u0010*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u00052\u0006\u0010\u000f\u001a\u00020\fH\u0014\u00a2\u0006\u0004\b\u0011\u0010\u0012J3\u0010\u0014\u001a\u00020\u0010*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u00052\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00028\u0000H\u0014\u00a2\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005*\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0014\u00a2\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005H\u0014\u00a2\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\u00020\u001a8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\u00a8\u0006\u001f"}, d2={"Lkotlinx/serialization/internal/ArrayListSerializer;", "E", "Lkotlinx/serialization/internal/CollectionSerializer;", "", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Lkotlinx/serialization/KSerializer;", "element", "<init>", "(Lkotlinx/serialization/KSerializer;)V", "builder", "()Ljava/util/ArrayList;", "", "builderSize", "(Ljava/util/ArrayList;)I", "size", "", "checkCapacity", "(Ljava/util/ArrayList;I)V", "index", "insert", "(Ljava/util/ArrayList;ILjava/lang/Object;)V", "toBuilder", "(Ljava/util/List;)Ljava/util/ArrayList;", "toResult", "(Ljava/util/ArrayList;)Ljava/util/List;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "kotlinx-serialization-core"})
@InternalSerializationApi
@PublishedApi
public final class ArrayListSerializer<E>
extends CollectionSerializer<E, List<? extends E>, ArrayList<E>> {
    @NotNull
    private final SerialDescriptor descriptor;

    @Override
    @NotNull
    protected ArrayList<E> builder() {
        return new ArrayList();
    }

    @Override
    protected void insert(@NotNull ArrayList<E> $this$insert, int index, E element) {
        Intrinsics.checkNotNullParameter($this$insert, "<this>");
        $this$insert.add(index, element);
    }

    @Override
    protected void checkCapacity(@NotNull ArrayList<E> $this$checkCapacity, int size) {
        Intrinsics.checkNotNullParameter($this$checkCapacity, "<this>");
        $this$checkCapacity.ensureCapacity(size);
    }

    public ArrayListSerializer(@NotNull KSerializer<E> element) {
        Intrinsics.checkNotNullParameter(element, "element");
        super(element);
        this.descriptor = new ArrayListClassDesc(element.getDescriptor());
    }

    @Override
    @NotNull
    protected ArrayList<E> toBuilder(@NotNull List<? extends E> $this$toBuilder) {
        Intrinsics.checkNotNullParameter($this$toBuilder, "<this>");
        ArrayList arrayList = $this$toBuilder instanceof ArrayList ? (ArrayList)$this$toBuilder : null;
        ArrayList arrayList2 = arrayList;
        if (arrayList == null) {
            arrayList2 = new ArrayList($this$toBuilder);
        }
        return arrayList2;
    }

    @Override
    @NotNull
    protected List<E> toResult(@NotNull ArrayList<E> $this$toResult) {
        Intrinsics.checkNotNullParameter($this$toResult, "<this>");
        return $this$toResult;
    }

    @Override
    protected int builderSize(@NotNull ArrayList<E> $this$builderSize) {
        Intrinsics.checkNotNullParameter($this$builderSize, "<this>");
        return $this$builderSize.size();
    }

    @Override
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.descriptor;
    }
}

