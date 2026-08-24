/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.internal;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KTypeProjection;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.CachedNames;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=2, xi=48, d1={"\u0000f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005*\u00020\u0004H\u0000\u00a2\u0006\u0004\b\u0006\u0010\u0007\u001a$\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\b*\u0006\u0012\u0002\b\u00030\tH\u0081\b\u00a2\u0006\u0004\b\n\u0010\u000b\u001a$\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\b*\u0006\u0012\u0002\b\u00030\fH\u0081\b\u00a2\u0006\u0004\b\n\u0010\r\u001a$\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\u0004\b\u0000\u0010\b*\u0006\u0012\u0002\b\u00030\u000eH\u0081\b\u00a2\u0006\u0004\b\n\u0010\u000f\u001a!\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0011*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0010H\u0000\u00a2\u0006\u0004\b\u0012\u0010\u0013\u001a=\u0010\u0019\u001a\u00020\u0018\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\u0014*\b\u0012\u0004\u0012\u00028\u00000\u00152\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0016H\u0080\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0019\u0010\u001a\u001a\u0019\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c*\u00020\u001bH\u0000\u00a2\u0006\u0004\b\u001e\u0010\u001f\u001a\u0017\u0010\u0002\u001a\u00020\u0000*\u0006\u0012\u0002\b\u00030\u001cH\u0000\u00a2\u0006\u0004\b\u0002\u0010 \u001a\u0017\u0010\"\u001a\u00020!*\u0006\u0012\u0002\b\u00030\u001cH\u0000\u00a2\u0006\u0004\b\"\u0010#\u001a\u0013\u0010%\u001a\u00020\u001b*\u00020$H\u0000\u00a2\u0006\u0004\b%\u0010&\"\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00040\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b'\u0010(\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006)"}, d2={"", "className", "notRegisteredMessage", "(Ljava/lang/String;)Ljava/lang/String;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "cachedSerialNames", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Ljava/util/Set;", "T", "Lkotlinx/serialization/DeserializationStrategy;", "cast", "(Lkotlinx/serialization/DeserializationStrategy;)Lkotlinx/serialization/DeserializationStrategy;", "Lkotlinx/serialization/KSerializer;", "(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/SerializationStrategy;", "(Lkotlinx/serialization/SerializationStrategy;)Lkotlinx/serialization/SerializationStrategy;", "", "", "compactArray", "(Ljava/util/List;)[Lkotlinx/serialization/descriptors/SerialDescriptor;", "K", "", "Lkotlin/Function1;", "selector", "", "elementsHashCodeBy", "(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function1;)I", "Lkotlin/reflect/KType;", "Lkotlin/reflect/KClass;", "", "kclass", "(Lkotlin/reflect/KType;)Lkotlin/reflect/KClass;", "(Lkotlin/reflect/KClass;)Ljava/lang/String;", "", "serializerNotRegistered", "(Lkotlin/reflect/KClass;)Ljava/lang/Void;", "Lkotlin/reflect/KTypeProjection;", "typeOrThrow", "(Lkotlin/reflect/KTypeProjection;)Lkotlin/reflect/KType;", "EMPTY_DESCRIPTOR_ARRAY", "[Lkotlinx/serialization/descriptors/SerialDescriptor;", "kotlinx-serialization-core"})
public final class Platform_commonKt {
    @NotNull
    private static final SerialDescriptor[] EMPTY_DESCRIPTOR_ARRAY = new SerialDescriptor[0];

    @NotNull
    @PublishedApi
    public static final <T> SerializationStrategy<T> cast(@NotNull SerializationStrategy<?> $this$cast) {
        SerializationStrategy<?> serializationStrategy;
        Intrinsics.checkNotNullParameter($this$cast, "<this>");
        boolean $i$f$cast = false;
        return serializationStrategy;
    }

    @NotNull
    public static final String notRegisteredMessage(@NotNull String className) {
        Intrinsics.checkNotNullParameter(className, "className");
        return "Serializer for class '" + className + "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n";
    }

    @NotNull
    public static final KType typeOrThrow(@NotNull KTypeProjection $this$typeOrThrow) {
        Intrinsics.checkNotNullParameter($this$typeOrThrow, "<this>");
        KType kType = $this$typeOrThrow.getType();
        if (kType == null) {
            boolean bl = false;
            String string = "Star projections in type arguments are not allowed, but had " + $this$typeOrThrow.getType();
            throw new IllegalArgumentException(string.toString());
        }
        return kType;
    }

    @NotNull
    public static final String notRegisteredMessage(@NotNull KClass<?> $this$notRegisteredMessage) {
        Intrinsics.checkNotNullParameter($this$notRegisteredMessage, "<this>");
        String string = $this$notRegisteredMessage.getSimpleName();
        if (string == null) {
            string = "<local class name not available>";
        }
        return Platform_commonKt.notRegisteredMessage(string);
    }

    /*
     * WARNING - void declaration
     */
    public static final <T, K> int elementsHashCodeBy(@NotNull Iterable<? extends T> $this$elementsHashCodeBy, @NotNull Function1<? super T, ? extends K> selector) {
        void var6_6;
        void $this$fold$iv;
        Intrinsics.checkNotNullParameter($this$elementsHashCodeBy, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        boolean $i$f$elementsHashCodeBy = false;
        Iterable<? extends T> iterable = $this$elementsHashCodeBy;
        int initial$iv = 1;
        boolean $i$f$fold = false;
        int accumulator$iv = initial$iv;
        Iterator iterator2 = $this$fold$iv.iterator();
        while (iterator2.hasNext()) {
            Object element$iv;
            Object element = element$iv = iterator2.next();
            int hash = accumulator$iv;
            boolean bl = false;
            K k = selector.invoke(element);
            accumulator$iv = 31 * hash + (k != null ? k.hashCode() : 0);
        }
        return (int)var6_6;
    }

    @NotNull
    @PublishedApi
    public static final <T> DeserializationStrategy<T> cast(@NotNull DeserializationStrategy<?> $this$cast) {
        DeserializationStrategy<?> deserializationStrategy;
        Intrinsics.checkNotNullParameter($this$cast, "<this>");
        boolean $i$f$cast = false;
        return deserializationStrategy;
    }

    @NotNull
    public static final KClass<Object> kclass(@NotNull KType $this$kclass) {
        Intrinsics.checkNotNullParameter($this$kclass, "<this>");
        KClassifier t = $this$kclass.getClassifier();
        if (!(t instanceof KClass)) {
            if (t instanceof KTypeParameter) {
                throw new IllegalArgumentException("Captured type parameter " + t + " from generic non-reified function. Such functionality cannot be supported because " + t + " is erased, either specify serializer explicitly or make calling function inline with reified " + t + '.');
            }
            throw new IllegalArgumentException("Only KClass supported as classifier, got " + t);
        }
        return (KClass)t;
    }

    @NotNull
    public static final SerialDescriptor[] compactArray(@Nullable List<? extends SerialDescriptor> $this$compactArray) {
        SerialDescriptor[] serialDescriptorArray;
        block4: {
            block3: {
                SerialDescriptor[] serialDescriptorArray2;
                SerialDescriptor[] it = serialDescriptorArray2 = $this$compactArray;
                boolean bl = false;
                Collection collection = (Collection)it;
                boolean bl2 = collection == null || collection.isEmpty();
                Object object = !bl2 ? serialDescriptorArray2 : null;
                serialDescriptorArray = object;
                if (object == null) break block3;
                Collection $this$toTypedArray$iv = (Collection)serialDescriptorArray;
                boolean $i$f$toTypedArray = false;
                Collection thisCollection$iv = $this$toTypedArray$iv;
                serialDescriptorArray = thisCollection$iv.toArray(new SerialDescriptor[0]);
                if (serialDescriptorArray != null) break block4;
            }
            serialDescriptorArray = EMPTY_DESCRIPTOR_ARRAY;
        }
        return serialDescriptorArray;
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public static final Set<String> cachedSerialNames(@NotNull SerialDescriptor $this$cachedSerialNames) {
        void var1_1;
        Intrinsics.checkNotNullParameter($this$cachedSerialNames, "<this>");
        if ($this$cachedSerialNames instanceof CachedNames) {
            return ((CachedNames)((Object)$this$cachedSerialNames)).getSerialNames();
        }
        HashSet result = new HashSet($this$cachedSerialNames.getElementsCount());
        int n = $this$cachedSerialNames.getElementsCount();
        for (int i = 0; i < n; ++i) {
            ((Collection)result).add($this$cachedSerialNames.getElementName(i));
        }
        return (Set)var1_1;
    }

    @PublishedApi
    @NotNull
    public static final <T> KSerializer<T> cast(@NotNull KSerializer<?> $this$cast) {
        KSerializer<?> kSerializer;
        Intrinsics.checkNotNullParameter($this$cast, "<this>");
        boolean $i$f$cast = false;
        return kSerializer;
    }

    @NotNull
    public static final Void serializerNotRegistered(@NotNull KClass<?> $this$serializerNotRegistered) {
        Intrinsics.checkNotNullParameter($this$serializerNotRegistered, "<this>");
        throw new SerializationException(Platform_commonKt.notRegisteredMessage($this$serializerNotRegistered));
    }
}

