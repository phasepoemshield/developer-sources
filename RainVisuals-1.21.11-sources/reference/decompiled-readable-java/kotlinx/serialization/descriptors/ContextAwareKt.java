/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.ContextDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.SerialDescriptorForNullable;
import kotlinx.serialization.modules.SerialModuleImpl;
import kotlinx.serialization.modules.SerializersModule;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=2, xi=48, d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u001d\u0010\u0003\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u00a2\u0006\u0004\b\u0003\u0010\u0004\u001a!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u00a2\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\n\u001a\u00020\u0001*\u00020\u00012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\bH\u0000\u00a2\u0006\u0004\b\n\u0010\u000b\"$\u0010\u0010\u001a\b\u0012\u0002\b\u0003\u0018\u00010\b*\u00020\u00018FX\u0087\u0004\u00a2\u0006\f\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0011"}, d2={"Lkotlinx/serialization/modules/SerializersModule;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "getContextualDescriptor", "(Lkotlinx/serialization/modules/SerializersModule;Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "getPolymorphicDescriptors", "(Lkotlinx/serialization/modules/SerializersModule;Lkotlinx/serialization/descriptors/SerialDescriptor;)Ljava/util/List;", "Lkotlin/reflect/KClass;", "context", "withContext", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlin/reflect/KClass;)Lkotlinx/serialization/descriptors/SerialDescriptor;", "getCapturedKClass", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlin/reflect/KClass;", "getCapturedKClass$annotations", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "capturedKClass", "kotlinx-serialization-core"})
public final class ContextAwareKt {
    @ExperimentalSerializationApi
    @Nullable
    public static final SerialDescriptor getContextualDescriptor(@NotNull SerializersModule $this$getContextualDescriptor, @NotNull SerialDescriptor descriptor2) {
        SerialDescriptor serialDescriptor;
        Intrinsics.checkNotNullParameter($this$getContextualDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
        KClass<?> kClass = ContextAwareKt.getCapturedKClass(descriptor2);
        if (kClass != null) {
            KClass<?> klass = kClass;
            boolean bl = false;
            KSerializer kSerializer = SerializersModule.getContextual$default($this$getContextualDescriptor, klass, null, 2, null);
            serialDescriptor = kSerializer != null ? kSerializer.getDescriptor() : null;
        } else {
            serialDescriptor = null;
        }
        return serialDescriptor;
    }

    @Nullable
    public static final KClass<?> getCapturedKClass(@NotNull SerialDescriptor $this$capturedKClass) {
        Intrinsics.checkNotNullParameter($this$capturedKClass, "<this>");
        SerialDescriptor serialDescriptor = $this$capturedKClass;
        return serialDescriptor instanceof ContextDescriptor ? ((ContextDescriptor)$this$capturedKClass).kClass : (serialDescriptor instanceof SerialDescriptorForNullable ? ContextAwareKt.getCapturedKClass(((SerialDescriptorForNullable)$this$capturedKClass).getOriginal$kotlinx_serialization_core()) : null);
    }

    @ExperimentalSerializationApi
    public static /* synthetic */ void getCapturedKClass$annotations(SerialDescriptor serialDescriptor) {
    }

    /*
     * WARNING - void declaration
     */
    @ExperimentalSerializationApi
    @NotNull
    public static final List<SerialDescriptor> getPolymorphicDescriptors(@NotNull SerializersModule $this$getPolymorphicDescriptors, @NotNull SerialDescriptor descriptor2) {
        void var6_6;
        void $this$mapTo$iv$iv;
        Intrinsics.checkNotNullParameter($this$getPolymorphicDescriptors, "<this>");
        Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
        KClass<?> kClass = ContextAwareKt.getCapturedKClass(descriptor2);
        if (kClass == null) {
            return CollectionsKt.emptyList();
        }
        KClass<?> kClass2 = kClass;
        Map<KClass<?>, KSerializer<?>> map = ((SerialModuleImpl)$this$getPolymorphicDescriptors).polyBase2Serializers.get(kClass2);
        Collection collection = map != null ? map.values() : null;
        Collection collection2 = collection;
        if (collection == null) {
            collection2 = CollectionsKt.emptyList();
        }
        Iterable $this$map$iv = collection2;
        boolean $i$f$map = false;
        Iterable iterable = $this$map$iv;
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        boolean $i$f$mapTo = false;
        for (Object item$iv$iv : $this$mapTo$iv$iv) {
            void var10_10;
            KSerializer it = (KSerializer)item$iv$iv;
            Collection collection3 = destination$iv$iv;
            boolean bl = false;
            collection3.add(var10_10.getDescriptor());
        }
        return (List)var6_6;
    }

    @NotNull
    public static final SerialDescriptor withContext(@NotNull SerialDescriptor $this$withContext, @NotNull KClass<?> context) {
        Intrinsics.checkNotNullParameter($this$withContext, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        return new ContextDescriptor($this$withContext, context);
    }
}

