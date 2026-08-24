/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.encoding;

import java.util.Collection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=2, xi=48, d1={"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aB\u0010\n\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0019\b\u0004\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0002\b\bH\u0086\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\n\u0010\u000b\u001ai\u0010\n\u001a\u00020\u0007\"\u0004\b\u0000\u0010\f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r24\b\u0004\u0010\t\u001a.\u0012\u0004\u0012\u00020\u0006\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u000f\u00a2\u0006\u0002\b\bH\u0086\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\n\u0010\u0013\u001a:\u0010\u0014\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0019\b\u0004\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0002\b\bH\u0086\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0014\u0010\u0015\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u0016"}, d2={"Lkotlinx/serialization/encoding/Encoder;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "collectionSize", "Lkotlin/Function1;", "Lkotlinx/serialization/encoding/CompositeEncoder;", "", "Lkotlin/ExtensionFunctionType;", "block", "encodeCollection", "(Lkotlinx/serialization/encoding/Encoder;Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlin/jvm/functions/Function1;)V", "E", "", "collection", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "index", "(Lkotlinx/serialization/encoding/Encoder;Lkotlinx/serialization/descriptors/SerialDescriptor;Ljava/util/Collection;Lkotlin/jvm/functions/Function3;)V", "encodeStructure", "(Lkotlinx/serialization/encoding/Encoder;Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlin/jvm/functions/Function1;)V", "kotlinx-serialization-core"})
public final class EncodingKt {
    /*
     * WARNING - void declaration
     */
    public static final void encodeCollection(@NotNull Encoder $this$encodeCollection, @NotNull SerialDescriptor descriptor2, int collectionSize, @NotNull Function1<? super CompositeEncoder, Unit> block) {
        void var1_1;
        Intrinsics.checkNotNullParameter($this$encodeCollection, "<this>");
        Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
        Intrinsics.checkNotNullParameter(block, "block");
        boolean $i$f$encodeCollection = false;
        CompositeEncoder composite = $this$encodeCollection.beginCollection(descriptor2, collectionSize);
        block.invoke(composite);
        composite.endStructure((SerialDescriptor)var1_1);
    }

    public static final void encodeStructure(@NotNull Encoder $this$encodeStructure, @NotNull SerialDescriptor descriptor2, @NotNull Function1<? super CompositeEncoder, Unit> block) {
        Intrinsics.checkNotNullParameter($this$encodeStructure, "<this>");
        Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
        Intrinsics.checkNotNullParameter(block, "block");
        boolean $i$f$encodeStructure = false;
        CompositeEncoder composite = $this$encodeStructure.beginStructure(descriptor2);
        block.invoke(composite);
        composite.endStructure(descriptor2);
    }

    /*
     * WARNING - void declaration
     */
    public static final <E> void encodeCollection(@NotNull Encoder $this$encodeCollection, @NotNull SerialDescriptor descriptor2, @NotNull Collection<? extends E> collection, @NotNull Function3<? super CompositeEncoder, ? super Integer, ? super E, Unit> block) {
        void var1_1;
        void var8_8;
        void $this$encodeCollection$iv;
        CompositeEncoder composite$iv;
        Intrinsics.checkNotNullParameter($this$encodeCollection, "<this>");
        Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
        Intrinsics.checkNotNullParameter(collection, "collection");
        Intrinsics.checkNotNullParameter(block, "block");
        boolean $i$f$encodeCollection = false;
        Encoder encoder = $this$encodeCollection;
        int collectionSize$iv = collection.size();
        boolean $i$f$encodeCollection2 = false;
        CompositeEncoder $this$encodeCollection_u24lambda_u241 = composite$iv = $this$encodeCollection$iv.beginCollection(descriptor2, collectionSize$iv);
        boolean bl = false;
        Iterable $this$forEachIndexed$iv = collection;
        boolean $i$f$forEachIndexed = false;
        int index$iv = 0;
        for (Object item$iv : $this$forEachIndexed$iv) {
            void var17_17;
            int n;
            if ((n = index$iv++) < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Object e = item$iv;
            int index = n;
            boolean bl2 = false;
            block.invoke($this$encodeCollection_u24lambda_u241, index, var17_17);
        }
        var8_8.endStructure((SerialDescriptor)var1_1);
    }
}

