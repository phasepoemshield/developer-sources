/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.encoding;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=2, xi=48, d1={"\u0000.\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aC\u0010\u0007\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00032\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005H\u0080\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0007\u0010\b\u001a@\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0019\b\u0004\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00028\u00000\u000b\u00a2\u0006\u0002\b\rH\u0086\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u0010"}, d2={"", "T", "Lkotlinx/serialization/encoding/Decoder;", "Lkotlinx/serialization/DeserializationStrategy;", "deserializer", "Lkotlin/Function0;", "block", "decodeIfNullable", "(Lkotlinx/serialization/encoding/Decoder;Lkotlinx/serialization/DeserializationStrategy;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlin/Function1;", "Lkotlinx/serialization/encoding/CompositeDecoder;", "Lkotlin/ExtensionFunctionType;", "decodeStructure", "(Lkotlinx/serialization/encoding/Decoder;Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "kotlinx-serialization-core"})
public final class DecodingKt {
    /*
     * Enabled aggressive block sorting
     */
    @Nullable
    public static final <T> T decodeIfNullable(@NotNull Decoder $this$decodeIfNullable, @NotNull DeserializationStrategy<? extends T> deserializer, @NotNull Function0<? extends T> block) {
        Object object;
        Intrinsics.checkNotNullParameter($this$decodeIfNullable, "<this>");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(block, "block");
        boolean $i$f$decodeIfNullable = false;
        boolean isNullabilitySupported = deserializer.getDescriptor().isNullable();
        if (!isNullabilitySupported && !$this$decodeIfNullable.decodeNotNullMark()) {
            object = $this$decodeIfNullable.decodeNull();
            return object;
        }
        object = block.invoke();
        return object;
    }

    /*
     * WARNING - void declaration
     */
    public static final <T> T decodeStructure(@NotNull Decoder $this$decodeStructure, @NotNull SerialDescriptor descriptor2, @NotNull Function1<? super CompositeDecoder, ? extends T> block) {
        void var5_5;
        Intrinsics.checkNotNullParameter($this$decodeStructure, "<this>");
        Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
        Intrinsics.checkNotNullParameter(block, "block");
        boolean $i$f$decodeStructure = false;
        CompositeDecoder composite = $this$decodeStructure.beginStructure(descriptor2);
        T result = block.invoke(composite);
        composite.endStructure(descriptor2);
        return var5_5;
    }
}

