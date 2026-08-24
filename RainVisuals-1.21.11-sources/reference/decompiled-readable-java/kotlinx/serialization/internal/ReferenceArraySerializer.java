/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.internal;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.ArrayClassDesc;
import kotlinx.serialization.internal.CollectionLikeSerializer;
import kotlinx.serialization.internal.PlatformKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\n\b\u0001\u0010\u0003*\u0004\u0018\u00018\u00002*\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u00070\u0004B#\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\n\u00a2\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u0007H\u0014\u00a2\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0011\u001a\u00020\u0010*\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u0007H\u0014\u00a2\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0015\u001a\u00020\u0014*\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u00072\u0006\u0010\u0013\u001a\u00020\u0010H\u0014\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u0017*\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0014\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\u0010*\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0014\u00a2\u0006\u0004\b\u001a\u0010\u001bJ3\u0010\u001e\u001a\u00020\u0014*\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u00072\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00028\u0001H\u0014\u00a2\u0006\u0004\b\u001e\u0010\u001fJ)\u0010 \u001a\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u0007*\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0014\u00a2\u0006\u0004\b \u0010!J)\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005*\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u0007H\u0014\u00a2\u0006\u0004\b\"\u0010#R\u001a\u0010%\u001a\u00020$8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\t\u0010)\u00a8\u0006*"}, d2={"Lkotlinx/serialization/internal/ReferenceArraySerializer;", "", "ElementKlass", "Element", "Lkotlinx/serialization/internal/CollectionLikeSerializer;", "", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Lkotlin/reflect/KClass;", "kClass", "Lkotlinx/serialization/KSerializer;", "eSerializer", "<init>", "(Lkotlin/reflect/KClass;Lkotlinx/serialization/KSerializer;)V", "builder", "()Ljava/util/ArrayList;", "", "builderSize", "(Ljava/util/ArrayList;)I", "size", "", "checkCapacity", "(Ljava/util/ArrayList;I)V", "", "collectionIterator", "([Ljava/lang/Object;)Ljava/util/Iterator;", "collectionSize", "([Ljava/lang/Object;)I", "index", "element", "insert", "(Ljava/util/ArrayList;ILjava/lang/Object;)V", "toBuilder", "([Ljava/lang/Object;)Ljava/util/ArrayList;", "toResult", "(Ljava/util/ArrayList;)[Ljava/lang/Object;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlin/reflect/KClass;", "kotlinx-serialization-core"})
@PublishedApi
public final class ReferenceArraySerializer<ElementKlass, Element extends ElementKlass>
extends CollectionLikeSerializer<Element, Element[], ArrayList<Element>> {
    @NotNull
    private final KClass<ElementKlass> kClass;
    @NotNull
    private final SerialDescriptor descriptor;

    @Override
    @NotNull
    protected Element[] toResult(@NotNull ArrayList<Element> $this$toResult) {
        Intrinsics.checkNotNullParameter($this$toResult, "<this>");
        return PlatformKt.toNativeArrayImpl($this$toResult, this.kClass);
    }

    @Override
    @NotNull
    protected ArrayList<Element> builder() {
        return new ArrayList();
    }

    @Override
    protected void insert(@NotNull ArrayList<Element> $this$insert, int index, Element element) {
        Intrinsics.checkNotNullParameter($this$insert, "<this>");
        $this$insert.add(index, element);
    }

    @Override
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    public ReferenceArraySerializer(@NotNull KClass<ElementKlass> kClass, @NotNull KSerializer<Element> eSerializer) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(eSerializer, "eSerializer");
        super(eSerializer, null);
        this.kClass = kClass;
        this.descriptor = new ArrayClassDesc(eSerializer.getDescriptor());
    }

    @Override
    protected int builderSize(@NotNull ArrayList<Element> $this$builderSize) {
        Intrinsics.checkNotNullParameter($this$builderSize, "<this>");
        return $this$builderSize.size();
    }

    @Override
    @NotNull
    protected Iterator<Element> collectionIterator(@NotNull Element[] $this$collectionIterator) {
        Intrinsics.checkNotNullParameter($this$collectionIterator, "<this>");
        return ArrayIteratorKt.iterator($this$collectionIterator);
    }

    @Override
    protected void checkCapacity(@NotNull ArrayList<Element> $this$checkCapacity, int size) {
        Intrinsics.checkNotNullParameter($this$checkCapacity, "<this>");
        $this$checkCapacity.ensureCapacity(size);
    }

    @Override
    @NotNull
    protected ArrayList<Element> toBuilder(@NotNull Element[] $this$toBuilder) {
        Intrinsics.checkNotNullParameter($this$toBuilder, "<this>");
        return new ArrayList(ArraysKt.asList($this$toBuilder));
    }

    @Override
    protected int collectionSize(@NotNull Element[] $this$collectionSize) {
        Intrinsics.checkNotNullParameter($this$collectionSize, "<this>");
        return $this$collectionSize.length;
    }
}

