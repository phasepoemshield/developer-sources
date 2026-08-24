/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.internal;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.CollectionLikeSerializer;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b!\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u0002*\u0004\b\u0002\u0010\u00042\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u00a2\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n*\u00028\u0001H\u0014\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\r*\u00028\u0001H\u0014\u00a2\u0006\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0010"}, d2={"Lkotlinx/serialization/internal/CollectionSerializer;", "E", "", "C", "B", "Lkotlinx/serialization/internal/CollectionLikeSerializer;", "Lkotlinx/serialization/KSerializer;", "element", "<init>", "(Lkotlinx/serialization/KSerializer;)V", "", "collectionIterator", "(Ljava/util/Collection;)Ljava/util/Iterator;", "", "collectionSize", "(Ljava/util/Collection;)I", "kotlinx-serialization-core"})
@PublishedApi
public abstract class CollectionSerializer<E, C extends Collection<? extends E>, B>
extends CollectionLikeSerializer<E, C, B> {
    public CollectionSerializer(@NotNull KSerializer<E> element) {
        Intrinsics.checkNotNullParameter(element, "element");
        super(element, null);
    }

    @Override
    @NotNull
    protected Iterator<E> collectionIterator(@NotNull C $this$collectionIterator) {
        Intrinsics.checkNotNullParameter($this$collectionIterator, "<this>");
        return $this$collectionIterator.iterator();
    }

    @Override
    protected int collectionSize(@NotNull C $this$collectionSize) {
        Intrinsics.checkNotNullParameter($this$collectionSize, "<this>");
        return $this$collectionSize.size();
    }
}

