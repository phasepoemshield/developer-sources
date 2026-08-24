/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.PublishedApi;
import kotlin.Result;
import kotlin.Triple;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.SerializersCacheKt;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.SerializersKt__SerializersKt;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.HashMapSerializer;
import kotlinx.serialization.internal.HashSetSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.LinkedHashSetSerializer;
import kotlinx.serialization.internal.PlatformKt;
import kotlinx.serialization.internal.Platform_commonKt;
import kotlinx.serialization.internal.PrimitivesKt;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleBuildersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=5, xi=48, d1={"\u0000J\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\u001a\u001b\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\b\u0003\u0010\u0004\u001a'\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0001\u00a2\u0006\u0004\b\u0003\u0010\t\u001a9\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00072\u0010\u0010\u000b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\nH\u0001\u00a2\u0006\u0004\b\u0003\u0010\f\u001a\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0006\b\u0000\u0010\r\u0018\u0001H\u0086\b\u00a2\u0006\u0004\b\u000e\u0010\u000f\u001a=\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00022\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00072\u0010\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0007\u00a2\u0006\u0004\b\u000e\u0010\u0015\u001a\u001d\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00022\u0006\u0010\u0017\u001a\u00020\u0016\u00a2\u0006\u0004\b\u000e\u0010\u0018\u001a\u001f\u0010\u0019\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u00022\u0006\u0010\u0017\u001a\u00020\u0016\u00a2\u0006\u0004\b\u0019\u0010\u0018\u001aI\u0010 \u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0014\u0018\u00010\u0002*\b\u0012\u0004\u0012\u00020\u00140\u00072\u0014\u0010\u001a\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00020\u00102\u000e\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001bH\u0002\u00a2\u0006\u0004\b\u001e\u0010\u001f\u001a9\u0010#\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0014\u0018\u00010\u0002*\b\u0012\u0004\u0012\u00020\u00140\u00072\u0014\u0010\u001a\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00020\u0010H\u0002\u00a2\u0006\u0004\b!\u0010\"\u001a3\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002\"\b\b\u0000\u0010\r*\u00020\u0014*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010$\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\b%\u0010&\u001aI\u0010(\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0014\u0018\u00010\u0002*\b\u0012\u0004\u0012\u00020\u00140\u00072\u0014\u0010\u001a\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00020\u00102\u000e\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001bH\u0000\u00a2\u0006\u0004\b(\u0010\u001f\u001a)\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\r*\u00020\u0014*\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0007\u00a2\u0006\u0004\b\u000e\u0010)\u001a\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0006\b\u0000\u0010\r\u0018\u0001*\u00020\u0005H\u0086\b\u00a2\u0006\u0004\b\u000e\u0010*\u001aA\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0002*\u00020\u00052\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00072\u0010\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0007\u00a2\u0006\u0004\b\u000e\u0010+\u001a!\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0002*\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0016\u00a2\u0006\u0004\b\u000e\u0010,\u001aI\u0010/\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u0002*\u00020\u00052\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\u0014\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\b.\u0010+\u001a-\u00103\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u0002*\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u00100\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\b1\u00102\u001a+\u0010\u0019\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0002\"\b\b\u0000\u0010\r*\u00020\u0014*\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0007\u00a2\u0006\u0004\b\u0019\u0010)\u001a#\u0010\u0019\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u0002*\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0016\u00a2\u0006\u0004\b\u0019\u0010,\u001a9\u00105\u001a\u0012\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0002\u0018\u00010\u0010*\u00020\u00052\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00160\u00102\u0006\u00100\u001a\u00020\u0012H\u0000\u00a2\u0006\u0004\b5\u00106\u00a8\u00067"}, d2={"", "forClass", "Lkotlinx/serialization/KSerializer;", "noCompiledSerializer", "(Ljava/lang/String;)Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/modules/SerializersModule;", "module", "Lkotlin/reflect/KClass;", "kClass", "(Lkotlinx/serialization/modules/SerializersModule;Lkotlin/reflect/KClass;)Lkotlinx/serialization/KSerializer;", "", "argSerializers", "(Lkotlinx/serialization/modules/SerializersModule;Lkotlin/reflect/KClass;[Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", "T", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "typeArgumentsSerializers", "", "isNullable", "", "(Lkotlin/reflect/KClass;Ljava/util/List;Z)Lkotlinx/serialization/KSerializer;", "Lkotlin/reflect/KType;", "type", "(Lkotlin/reflect/KType;)Lkotlinx/serialization/KSerializer;", "serializerOrNull", "serializers", "Lkotlin/Function0;", "Lkotlin/reflect/KClassifier;", "elementClassifierIfArray", "builtinParametrizedSerializer$SerializersKt__SerializersKt", "(Lkotlin/reflect/KClass;Ljava/util/List;Lkotlin/jvm/functions/Function0;)Lkotlinx/serialization/KSerializer;", "builtinParametrizedSerializer", "compiledParametrizedSerializer$SerializersKt__SerializersKt", "(Lkotlin/reflect/KClass;Ljava/util/List;)Lkotlinx/serialization/KSerializer;", "compiledParametrizedSerializer", "shouldBeNullable", "nullable$SerializersKt__SerializersKt", "(Lkotlinx/serialization/KSerializer;Z)Lkotlinx/serialization/KSerializer;", "nullable", "parametrizedSerializerOrNull", "(Lkotlin/reflect/KClass;)Lkotlinx/serialization/KSerializer;", "(Lkotlinx/serialization/modules/SerializersModule;)Lkotlinx/serialization/KSerializer;", "(Lkotlinx/serialization/modules/SerializersModule;Lkotlin/reflect/KClass;Ljava/util/List;Z)Lkotlinx/serialization/KSerializer;", "(Lkotlinx/serialization/modules/SerializersModule;Lkotlin/reflect/KType;)Lkotlinx/serialization/KSerializer;", "rootClass", "serializerByKClassImpl$SerializersKt__SerializersKt", "serializerByKClassImpl", "failOnMissingTypeArgSerializer", "serializerByKTypeImpl$SerializersKt__SerializersKt", "(Lkotlinx/serialization/modules/SerializersModule;Lkotlin/reflect/KType;Z)Lkotlinx/serialization/KSerializer;", "serializerByKTypeImpl", "typeArguments", "serializersForParameters", "(Lkotlinx/serialization/modules/SerializersModule;Ljava/util/List;Z)Ljava/util/List;", "kotlinx-serialization-core"}, xs="kotlinx/serialization/SerializersKt")
final class SerializersKt__SerializersKt {
    @ExperimentalSerializationApi
    @NotNull
    public static final KSerializer<Object> serializer(@NotNull KClass<?> kClass, @NotNull List<? extends KSerializer<?>> typeArgumentsSerializers, boolean isNullable) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
        return SerializersKt.serializer(SerializersModuleBuildersKt.EmptySerializersModule(), kClass, typeArgumentsSerializers, isNullable);
    }

    private static final <T> KSerializer<T> nullable$SerializersKt__SerializersKt(KSerializer<T> $this$nullable, boolean shouldBeNullable) {
        if (shouldBeNullable) {
            return BuiltinSerializersKt.getNullable($this$nullable);
        }
        Intrinsics.checkNotNull($this$nullable, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.SerializersKt__SerializersKt.nullable?>");
        return $this$nullable;
    }

    @NotNull
    public static final KSerializer<Object> serializer(@NotNull KType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return SerializersKt.serializer(SerializersModuleBuildersKt.EmptySerializersModule(), type);
    }

    @Nullable
    public static final KSerializer<? extends Object> parametrizedSerializerOrNull(@NotNull KClass<Object> $this$parametrizedSerializerOrNull, @NotNull List<? extends KSerializer<Object>> serializers, @NotNull Function0<? extends KClassifier> elementClassifierIfArray) {
        Intrinsics.checkNotNullParameter($this$parametrizedSerializerOrNull, "<this>");
        Intrinsics.checkNotNullParameter(serializers, "serializers");
        Intrinsics.checkNotNullParameter(elementClassifierIfArray, "elementClassifierIfArray");
        KSerializer<? extends Object> kSerializer = SerializersKt__SerializersKt.builtinParametrizedSerializer$SerializersKt__SerializersKt($this$parametrizedSerializerOrNull, serializers, elementClassifierIfArray);
        if (kSerializer == null) {
            kSerializer = SerializersKt__SerializersKt.compiledParametrizedSerializer$SerializersKt__SerializersKt($this$parametrizedSerializerOrNull, serializers);
        }
        return kSerializer;
    }

    /*
     * WARNING - void declaration
     */
    public static final /* synthetic */ <T> KSerializer<T> serializer(SerializersModule $this$serializer) {
        void var2_2;
        Intrinsics.checkNotNullParameter($this$serializer, "<this>");
        boolean $i$f$serializer = false;
        Intrinsics.reifiedOperationMarker(6, "T");
        KSerializer<Object> $this$cast$iv = SerializersKt.serializer($this$serializer, null);
        boolean $i$f$cast = false;
        Intrinsics.checkNotNull($this$cast$iv, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return (KSerializer)var2_2;
    }

    @Nullable
    public static final KSerializer<Object> serializerOrNull(@NotNull SerializersModule $this$serializerOrNull, @NotNull KType type) {
        Intrinsics.checkNotNullParameter($this$serializerOrNull, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        return SerializersKt__SerializersKt.serializerByKTypeImpl$SerializersKt__SerializersKt($this$serializerOrNull, type, false);
    }

    /*
     * WARNING - void declaration
     */
    @Nullable
    public static final List<KSerializer<Object>> serializersForParameters(@NotNull SerializersModule $this$serializersForParameters, @NotNull List<? extends KType> typeArguments, boolean failOnMissingTypeArgSerializer) {
        List list;
        Collection collection;
        KType it;
        Iterable $this$mapTo$iv$iv;
        boolean $i$f$mapTo;
        Collection destination$iv$iv;
        boolean $i$f$map;
        Iterable $this$map$iv;
        Intrinsics.checkNotNullParameter($this$serializersForParameters, "<this>");
        Intrinsics.checkNotNullParameter(typeArguments, "typeArguments");
        if (failOnMissingTypeArgSerializer) {
            $this$map$iv = typeArguments;
            $i$f$map = false;
            Iterable iterable = $this$map$iv;
            destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
            $i$f$mapTo = false;
            for (Object item$iv$iv : $this$mapTo$iv$iv) {
                it = (KType)item$iv$iv;
                collection = destination$iv$iv;
                boolean bl = false;
                collection.add(SerializersKt.serializer($this$serializersForParameters, it));
            }
            list = (List)destination$iv$iv;
        } else {
            void var7_6;
            $this$map$iv = typeArguments;
            $i$f$map = false;
            $this$mapTo$iv$iv = $this$map$iv;
            destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
            $i$f$mapTo = false;
            for (Object item$iv$iv : $this$mapTo$iv$iv) {
                it = (KType)item$iv$iv;
                collection = destination$iv$iv;
                boolean bl = false;
                KSerializer<Object> kSerializer = SerializersKt.serializerOrNull($this$serializersForParameters, it);
                if (kSerializer == null) {
                    return null;
                }
                collection.add(kSerializer);
            }
            list = (List)var7_6;
        }
        List list2 = list;
        return list2;
    }

    /*
     * WARNING - void declaration
     */
    private static final KSerializer<Object> serializerByKTypeImpl$SerializersKt__SerializersKt(SerializersModule $this$serializerByKTypeImpl, KType type, boolean failOnMissingTypeArgSerializer) {
        KSerializer<? extends Object> kSerializer;
        KSerializer<? extends Object> contextualSerializer2;
        KSerializer<? extends Object> kSerializer2;
        KSerializer cachedSerializer;
        void $this$mapTo$iv$iv;
        KClass<Object> rootClass = Platform_commonKt.kclass(type);
        boolean isNullable = type.isMarkedNullable();
        Iterable $this$map$iv = type.getArguments();
        boolean $i$f$map = false;
        Iterable iterable = $this$map$iv;
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        boolean $i$f$mapTo = false;
        for (Object item$iv$iv : $this$mapTo$iv$iv) {
            KTypeProjection p0 = (KTypeProjection)item$iv$iv;
            Collection collection = destination$iv$iv;
            boolean bl = false;
            collection.add(Platform_commonKt.typeOrThrow(p0));
        }
        List typeArguments = (List)destination$iv$iv;
        KSerializer kSerializer3 = typeArguments.isEmpty() ? SerializersCacheKt.findCachedSerializer(rootClass, isNullable) : (cachedSerializer = (KSerializer)(Result.isFailure-impl($i$f$map = SerializersCacheKt.findParametrizedCachedSerializer(rootClass, typeArguments, isNullable)) ? null : $i$f$map));
        if (cachedSerializer != null) {
            KSerializer it = cachedSerializer;
            boolean bl = false;
            return it;
        }
        if (typeArguments.isEmpty()) {
            kSerializer2 = SerializersModule.getContextual$default($this$serializerByKTypeImpl, rootClass, null, 2, null);
        } else {
            List<KSerializer<Object>> list = SerializersKt.serializersForParameters($this$serializerByKTypeImpl, typeArguments, failOnMissingTypeArgSerializer);
            if (list == null) {
                return null;
            }
            List<KSerializer<Object>> serializers = list;
            kSerializer2 = SerializersKt.parametrizedSerializerOrNull(rootClass, serializers, (Function0<? extends KClassifier>)new Function0<KClassifier>((List<? extends KType>)typeArguments){
                final /* synthetic */ List<KType> $typeArguments;

                @Nullable
                public final KClassifier invoke() {
                    return this.$typeArguments.get(0).getClassifier();
                }
                {
                    this.$typeArguments = $typeArguments;
                    super(0);
                }
            });
            if (kSerializer2 == null) {
                kSerializer2 = $this$serializerByKTypeImpl.getContextual(rootClass, (List<? extends KSerializer<?>>)iterable);
            }
        }
        KSerializer<? extends Object> kSerializer4 = contextualSerializer2 = kSerializer2;
        if (kSerializer4 != null) {
            void var4_4;
            KSerializer<? extends Object> kSerializer5 = kSerializer4;
            boolean bl = false;
            kSerializer = SerializersKt__SerializersKt.nullable$SerializersKt__SerializersKt(kSerializer5, (boolean)var4_4);
        } else {
            kSerializer = null;
        }
        return kSerializer;
    }

    @NotNull
    public static final KSerializer<Object> serializer(@NotNull SerializersModule $this$serializer, @NotNull KType type) {
        Intrinsics.checkNotNullParameter($this$serializer, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        KSerializer<Object> kSerializer = SerializersKt__SerializersKt.serializerByKTypeImpl$SerializersKt__SerializersKt($this$serializer, type, true);
        if (kSerializer == null) {
            PlatformKt.platformSpecificSerializerNotRegistered(Platform_commonKt.kclass(type));
            throw new KotlinNothingValueException();
        }
        return kSerializer;
    }

    @InternalSerializationApi
    @Nullable
    public static final <T> KSerializer<T> serializerOrNull(@NotNull KClass<T> $this$serializerOrNull) {
        Intrinsics.checkNotNullParameter($this$serializerOrNull, "<this>");
        KSerializer<T> kSerializer = PlatformKt.compiledSerializerImpl($this$serializerOrNull);
        if (kSerializer == null) {
            kSerializer = PrimitivesKt.builtinSerializerOrNull($this$serializerOrNull);
        }
        return kSerializer;
    }

    @PublishedApi
    @NotNull
    public static final KSerializer<?> noCompiledSerializer(@NotNull SerializersModule module, @NotNull KClass<?> kClass) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        KSerializer kSerializer = SerializersModule.getContextual$default(module, kClass, null, 2, null);
        if (kSerializer == null) {
            Platform_commonKt.serializerNotRegistered(kClass);
            throw new KotlinNothingValueException();
        }
        return kSerializer;
    }

    @ExperimentalSerializationApi
    @NotNull
    public static final KSerializer<Object> serializer(@NotNull SerializersModule $this$serializer, @NotNull KClass<?> kClass, @NotNull List<? extends KSerializer<?>> typeArgumentsSerializers, boolean isNullable) {
        Intrinsics.checkNotNullParameter($this$serializer, "<this>");
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
        KSerializer<Object> kSerializer = SerializersKt__SerializersKt.serializerByKClassImpl$SerializersKt__SerializersKt($this$serializer, kClass, typeArgumentsSerializers, isNullable);
        if (kSerializer == null) {
            PlatformKt.platformSpecificSerializerNotRegistered(kClass);
            throw new KotlinNothingValueException();
        }
        return kSerializer;
    }

    private static final KSerializer<? extends Object> compiledParametrizedSerializer$SerializersKt__SerializersKt(KClass<Object> $this$compiledParametrizedSerializer, List<? extends KSerializer<Object>> serializers) {
        Collection $this$toTypedArray$iv = serializers;
        boolean $i$f$toTypedArray = false;
        Collection thisCollection$iv = $this$toTypedArray$iv;
        KSerializer[] kSerializerArray = thisCollection$iv.toArray(new KSerializer[0]);
        return PlatformKt.constructSerializerForGivenTypeArgs($this$compiledParametrizedSerializer, Arrays.copyOf(kSerializerArray, kSerializerArray.length));
    }

    @InternalSerializationApi
    @NotNull
    public static final <T> KSerializer<T> serializer(@NotNull KClass<T> $this$serializer) {
        Intrinsics.checkNotNullParameter($this$serializer, "<this>");
        KSerializer<T> kSerializer = SerializersKt.serializerOrNull($this$serializer);
        if (kSerializer == null) {
            Platform_commonKt.serializerNotRegistered($this$serializer);
            throw new KotlinNothingValueException();
        }
        return kSerializer;
    }

    /*
     * WARNING - void declaration
     */
    private static final KSerializer<Object> serializerByKClassImpl$SerializersKt__SerializersKt(SerializersModule $this$serializerByKClassImpl, KClass<Object> rootClass, List<? extends KSerializer<Object>> typeArgumentsSerializers, boolean isNullable) {
        KSerializer kSerializer;
        KSerializer serializer2;
        KSerializer kSerializer2;
        if (typeArgumentsSerializers.isEmpty()) {
            kSerializer2 = SerializersKt.serializerOrNull(rootClass);
            if (kSerializer2 == null) {
                kSerializer2 = SerializersModule.getContextual$default($this$serializerByKClassImpl, rootClass, null, 2, null);
            }
        } else {
            KSerializer<? extends Object> kSerializer3;
            try {
                KSerializer<? extends Object> kSerializer4 = SerializersKt.parametrizedSerializerOrNull(rootClass, typeArgumentsSerializers, serializerByKClassImpl.serializer.1.INSTANCE);
                if (kSerializer4 == null) {
                    kSerializer4 = $this$serializerByKClassImpl.getContextual(rootClass, typeArgumentsSerializers);
                }
                kSerializer3 = kSerializer4;
            }
            catch (IndexOutOfBoundsException e) {
                throw new SerializationException("Unable to retrieve a serializer, the number of passed type serializers differs from the actual number of generic parameters", e);
            }
            kSerializer2 = kSerializer3;
        }
        KSerializer kSerializer5 = serializer2 = kSerializer2;
        if (kSerializer5 != null) {
            void var6_6;
            KSerializer $this$cast$iv = kSerializer5;
            boolean bl = false;
            kSerializer = SerializersKt__SerializersKt.nullable$SerializersKt__SerializersKt(var6_6, isNullable);
        } else {
            kSerializer = null;
        }
        return kSerializer;
    }

    @NotNull
    @PublishedApi
    public static final KSerializer<?> noCompiledSerializer(@NotNull SerializersModule module, @NotNull KClass<?> kClass, @NotNull KSerializer<?>[] argSerializers) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(argSerializers, "argSerializers");
        KSerializer<?> kSerializer = module.getContextual(kClass, ArraysKt.asList(argSerializers));
        if (kSerializer == null) {
            Platform_commonKt.serializerNotRegistered(kClass);
            throw new KotlinNothingValueException();
        }
        return kSerializer;
    }

    /*
     * WARNING - void declaration
     */
    public static final /* synthetic */ <T> KSerializer<T> serializer() {
        void var1_1;
        boolean $i$f$serializer = false;
        Intrinsics.reifiedOperationMarker(6, "T");
        KSerializer<Object> $this$cast$iv = SerializersKt.serializer(null);
        boolean $i$f$cast = false;
        Intrinsics.checkNotNull($this$cast$iv, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return (KSerializer)var1_1;
    }

    @Nullable
    public static final KSerializer<Object> serializerOrNull(@NotNull KType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return SerializersKt.serializerOrNull(SerializersModuleBuildersKt.EmptySerializersModule(), type);
    }

    /*
     * WARNING - void declaration
     */
    private static final KSerializer<? extends Object> builtinParametrizedSerializer$SerializersKt__SerializersKt(KClass<Object> $this$builtinParametrizedSerializer, List<? extends KSerializer<Object>> serializers, Function0<? extends KClassifier> elementClassifierIfArray) {
        KSerializer<Object> kSerializer;
        KClass<Object> kClass = $this$builtinParametrizedSerializer;
        boolean bl = ((Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Collection.class)) ? true : Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(List.class))) ? true : Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(List.class))) ? true : Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(ArrayList.class));
        if (bl) {
            kSerializer = (KSerializer<Map.Entry<Object, Object>>)new ArrayListSerializer<Object>(serializers.get(0));
        } else if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(HashSet.class))) {
            kSerializer = new HashSetSerializer<Object>(serializers.get(0));
        } else {
            boolean bl2 = (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Set.class)) ? true : Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Set.class))) ? true : Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(LinkedHashSet.class));
            if (bl2) {
                kSerializer = new LinkedHashSetSerializer<Object>(serializers.get(0));
            } else if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(HashMap.class))) {
                kSerializer = new HashMapSerializer<Object, Object>(serializers.get(0), serializers.get(1));
            } else {
                boolean bl3 = (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Map.class)) ? true : Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Map.class))) ? true : Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(LinkedHashMap.class));
                if (bl3) {
                    kSerializer = new LinkedHashMapSerializer<Object, Object>(serializers.get(0), serializers.get(1));
                } else if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Map.Entry.class))) {
                    kSerializer = BuiltinSerializersKt.MapEntrySerializer(serializers.get(0), serializers.get(1));
                } else if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Pair.class))) {
                    kSerializer = BuiltinSerializersKt.PairSerializer(serializers.get(0), serializers.get(1));
                } else if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Triple.class))) {
                    kSerializer = BuiltinSerializersKt.TripleSerializer(serializers.get(0), serializers.get(1), serializers.get(2));
                } else if (PlatformKt.isReferenceArray($this$builtinParametrizedSerializer)) {
                    void var1_1;
                    void var2_2;
                    Object r = var2_2.invoke();
                    Intrinsics.checkNotNull(r, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                    kSerializer = BuiltinSerializersKt.ArraySerializer((KClass)r, (KSerializer)var1_1.get(0));
                } else {
                    kSerializer = null;
                }
            }
        }
        return kSerializer;
    }

    @NotNull
    @PublishedApi
    public static final KSerializer<?> noCompiledSerializer(@NotNull String forClass) {
        Intrinsics.checkNotNullParameter(forClass, "forClass");
        throw new SerializationException(Platform_commonKt.notRegisteredMessage(forClass));
    }
}

