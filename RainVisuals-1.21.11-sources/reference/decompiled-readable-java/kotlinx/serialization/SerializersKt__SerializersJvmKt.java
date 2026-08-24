/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.PlatformKt;
import kotlinx.serialization.internal.PrimitivesKt;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleBuildersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=5, xi=48, d1={"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\f\u001a\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u00a2\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u00a2\u0006\u0004\b\u0006\u0010\u0005\u001a+\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002*\u00020\u00072\u0006\u0010\u0001\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u000e*\u00020\u0000H\u0002\u00a2\u0006\u0004\b\u000f\u0010\u0010\u001aI\u0010\u0018\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0002\"\b\b\u0000\u0010\u0012*\u00020\u0003*\u00020\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0014\u0010\u0015\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0014H\u0002\u00a2\u0006\u0004\b\u0016\u0010\u0017\u001a\u001f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u0000\u00a2\u0006\u0004\b\u0004\u0010\u0019\u001a-\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002*\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\b\u001a\u0010\u001b\u001a!\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002*\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u0000\u00a2\u0006\u0004\b\u0006\u0010\u0019\u001a/\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002*\u00020\u00072\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\b\u001d\u0010\u001e\u00a8\u0006 "}, d2={"Ljava/lang/reflect/Type;", "type", "Lkotlinx/serialization/KSerializer;", "", "serializer", "(Ljava/lang/reflect/Type;)Lkotlinx/serialization/KSerializer;", "serializerOrNull", "Lkotlinx/serialization/modules/SerializersModule;", "Ljava/lang/reflect/GenericArrayType;", "", "failOnMissingTypeArgSerializer", "genericArraySerializer$SerializersKt__SerializersJvmKt", "(Lkotlinx/serialization/modules/SerializersModule;Ljava/lang/reflect/GenericArrayType;Z)Lkotlinx/serialization/KSerializer;", "genericArraySerializer", "Ljava/lang/Class;", "prettyClass$SerializersKt__SerializersJvmKt", "(Ljava/lang/reflect/Type;)Ljava/lang/Class;", "prettyClass", "T", "jClass", "", "typeArgumentsSerializers", "reflectiveOrContextual$SerializersKt__SerializersJvmKt", "(Lkotlinx/serialization/modules/SerializersModule;Ljava/lang/Class;Ljava/util/List;)Lkotlinx/serialization/KSerializer;", "reflectiveOrContextual", "(Lkotlinx/serialization/modules/SerializersModule;Ljava/lang/reflect/Type;)Lkotlinx/serialization/KSerializer;", "serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt", "(Lkotlinx/serialization/modules/SerializersModule;Ljava/lang/reflect/Type;Z)Lkotlinx/serialization/KSerializer;", "serializerByJavaTypeImpl", "typeSerializer$SerializersKt__SerializersJvmKt", "(Lkotlinx/serialization/modules/SerializersModule;Ljava/lang/Class;Z)Lkotlinx/serialization/KSerializer;", "typeSerializer", "kotlinx-serialization-core"}, xs="kotlinx/serialization/SerializersKt")
final class SerializersKt__SerializersJvmKt {
    /*
     * WARNING - void declaration
     */
    private static final <T> KSerializer<T> reflectiveOrContextual$SerializersKt__SerializersJvmKt(SerializersModule $this$reflectiveOrContextual, Class<T> jClass, List<? extends KSerializer<Object>> typeArgumentsSerializers) {
        Collection $this$toTypedArray$iv = typeArgumentsSerializers;
        boolean $i$f$toTypedArray = false;
        Collection thisCollection$iv = $this$toTypedArray$iv;
        KSerializer[] kSerializerArray = thisCollection$iv.toArray(new KSerializer[0]);
        KSerializer<T> kSerializer = PlatformKt.constructSerializerForGivenTypeArgs(jClass, Arrays.copyOf(kSerializerArray, kSerializerArray.length));
        if (kSerializer != null) {
            void var5_3;
            KSerializer<T> it = kSerializer;
            boolean bl = false;
            return var5_3;
        }
        KClass<T> kClass = JvmClassMappingKt.getKotlinClass(jClass);
        KSerializer<T> kSerializer2 = PrimitivesKt.builtinSerializerOrNull(kClass);
        if (kSerializer2 == null) {
            void var2_2;
            void var3_7;
            kSerializer2 = $this$reflectiveOrContextual.getContextual(var3_7, (List<? extends KSerializer<?>>)var2_2);
        }
        return kSerializer2;
    }

    @Nullable
    public static final KSerializer<Object> serializerOrNull(@NotNull Type type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return SerializersKt.serializerOrNull(SerializersModuleBuildersKt.EmptySerializersModule(), type);
    }

    @NotNull
    public static final KSerializer<Object> serializer(@NotNull Type type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return SerializersKt.serializer(SerializersModuleBuildersKt.EmptySerializersModule(), type);
    }

    private static final Class<?> prettyClass$SerializersKt__SerializersJvmKt(Type $this$prettyClass) {
        Class<?> clazz;
        Type it = $this$prettyClass;
        if (it instanceof Class) {
            clazz = (Class<?>)it;
        } else if (it instanceof ParameterizedType) {
            Type type = ((ParameterizedType)it).getRawType();
            Intrinsics.checkNotNullExpressionValue(type, "getRawType(...)");
            clazz = SerializersKt__SerializersJvmKt.prettyClass$SerializersKt__SerializersJvmKt(type);
        } else if (it instanceof WildcardType) {
            Type[] typeArray = ((WildcardType)it).getUpperBounds();
            Intrinsics.checkNotNullExpressionValue(typeArray, "getUpperBounds(...)");
            Object object = ArraysKt.first((Object[])typeArray);
            Intrinsics.checkNotNullExpressionValue(object, "first(...)");
            clazz = SerializersKt__SerializersJvmKt.prettyClass$SerializersKt__SerializersJvmKt((Type)object);
        } else if (it instanceof GenericArrayType) {
            Type type = ((GenericArrayType)it).getGenericComponentType();
            Intrinsics.checkNotNullExpressionValue(type, "getGenericComponentType(...)");
            clazz = SerializersKt__SerializersJvmKt.prettyClass$SerializersKt__SerializersJvmKt(type);
        } else {
            throw new IllegalArgumentException("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument " + it + " has type " + Reflection.getOrCreateKotlinClass(it.getClass()));
        }
        return clazz;
    }

    @Nullable
    public static final KSerializer<Object> serializerOrNull(@NotNull SerializersModule $this$serializerOrNull, @NotNull Type type) {
        Intrinsics.checkNotNullParameter($this$serializerOrNull, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        return SerializersKt__SerializersJvmKt.serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt($this$serializerOrNull, type, false);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private static final KSerializer<Object> serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt(SerializersModule $this$serializerByJavaTypeImpl, Type type, boolean failOnMissingTypeArgSerializer) {
        List argsSerializers;
        Collection collection;
        Class rootClass;
        KSerializer<Object> kSerializer;
        block19: {
            block18: {
                List list;
                Type it;
                int n;
                int n2;
                Type[] $this$mapTo$iv$iv;
                boolean $i$f$mapTo;
                Collection destination$iv$iv;
                boolean $i$f$map;
                Type[] $this$map$iv;
                Type type2 = type;
                if (type2 instanceof GenericArrayType) {
                    kSerializer = SerializersKt__SerializersJvmKt.genericArraySerializer$SerializersKt__SerializersJvmKt($this$serializerByJavaTypeImpl, (GenericArrayType)type, failOnMissingTypeArgSerializer);
                    return kSerializer;
                }
                if (type2 instanceof Class) {
                    kSerializer = SerializersKt__SerializersJvmKt.typeSerializer$SerializersKt__SerializersJvmKt($this$serializerByJavaTypeImpl, (Class)type, failOnMissingTypeArgSerializer);
                    return kSerializer;
                }
                if (!(type2 instanceof ParameterizedType)) {
                    if (!(type2 instanceof WildcardType)) void var1_1;
                    throw new IllegalArgumentException("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument " + var1_1 + " has type " + Reflection.getOrCreateKotlinClass(var1_1.getClass()));
                    Type[] typeArray = ((WildcardType)type).getUpperBounds();
                    Intrinsics.checkNotNullExpressionValue(typeArray, "getUpperBounds(...)");
                    Object object = ArraysKt.first((Object[])typeArray);
                    Intrinsics.checkNotNullExpressionValue(object, "first(...)");
                    kSerializer = SerializersKt__SerializersJvmKt.serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt$default($this$serializerByJavaTypeImpl, (Type)object, false, 2, null);
                    return kSerializer;
                }
                Type type3 = ((ParameterizedType)type).getRawType();
                Intrinsics.checkNotNull(type3, "null cannot be cast to non-null type java.lang.Class<*>");
                rootClass = (Class)type3;
                Type[] args2 = ((ParameterizedType)type).getActualTypeArguments();
                if (failOnMissingTypeArgSerializer) {
                    Intrinsics.checkNotNull(args2);
                    $this$map$iv = args2;
                    $i$f$map = false;
                    Type[] typeArray = $this$map$iv;
                    destination$iv$iv = new ArrayList($this$map$iv.length);
                    $i$f$mapTo = false;
                    n2 = $this$mapTo$iv$iv.length;
                    for (n = 0; n < n2; ++n) {
                        Type type4;
                        it = type4 = $this$mapTo$iv$iv[n];
                        collection = destination$iv$iv;
                        boolean bl = false;
                        Intrinsics.checkNotNull(it);
                        collection.add(SerializersKt.serializer($this$serializerByJavaTypeImpl, it));
                    }
                    list = (List)destination$iv$iv;
                } else {
                    Intrinsics.checkNotNull(args2);
                    $this$map$iv = args2;
                    $i$f$map = false;
                    $this$mapTo$iv$iv = $this$map$iv;
                    destination$iv$iv = new ArrayList($this$map$iv.length);
                    $i$f$mapTo = false;
                    n2 = $this$mapTo$iv$iv.length;
                    for (n = 0; n < n2; ++n) {
                        Type type5;
                        it = type5 = $this$mapTo$iv$iv[n];
                        collection = destination$iv$iv;
                        boolean bl = false;
                        Intrinsics.checkNotNull(it);
                        KSerializer<Object> kSerializer2 = SerializersKt.serializerOrNull($this$serializerByJavaTypeImpl, it);
                        if (kSerializer2 == null) {
                            return null;
                        }
                        collection.add(kSerializer2);
                    }
                    list = (List)destination$iv$iv;
                }
                argsSerializers = list;
                if (Set.class.isAssignableFrom(rootClass)) {
                    KSerializer kSerializer3 = BuiltinSerializersKt.SetSerializer((KSerializer)argsSerializers.get(0));
                    kSerializer = kSerializer3;
                    Intrinsics.checkNotNull(kSerializer3, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                    return kSerializer;
                }
                if (List.class.isAssignableFrom(rootClass)) break block18;
                if (!Collection.class.isAssignableFrom(rootClass)) break block19;
            }
            KSerializer kSerializer4 = BuiltinSerializersKt.ListSerializer((KSerializer)argsSerializers.get(0));
            kSerializer = kSerializer4;
            Intrinsics.checkNotNull(kSerializer4, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return kSerializer;
        }
        if (Map.class.isAssignableFrom(rootClass)) {
            KSerializer kSerializer5 = BuiltinSerializersKt.MapSerializer((KSerializer)argsSerializers.get(0), (KSerializer)argsSerializers.get(1));
            kSerializer = kSerializer5;
            Intrinsics.checkNotNull(kSerializer5, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return kSerializer;
        }
        if (Map.Entry.class.isAssignableFrom(rootClass)) {
            KSerializer kSerializer6 = BuiltinSerializersKt.MapEntrySerializer((KSerializer)argsSerializers.get(0), (KSerializer)argsSerializers.get(1));
            kSerializer = kSerializer6;
            Intrinsics.checkNotNull(kSerializer6, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return kSerializer;
        }
        if (Pair.class.isAssignableFrom(rootClass)) {
            KSerializer kSerializer7 = BuiltinSerializersKt.PairSerializer((KSerializer)argsSerializers.get(0), (KSerializer)argsSerializers.get(1));
            kSerializer = kSerializer7;
            Intrinsics.checkNotNull(kSerializer7, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return kSerializer;
        }
        if (Triple.class.isAssignableFrom(rootClass)) {
            KSerializer kSerializer8 = BuiltinSerializersKt.TripleSerializer((KSerializer)argsSerializers.get(0), (KSerializer)argsSerializers.get(1), (KSerializer)argsSerializers.get(2));
            kSerializer = kSerializer8;
            Intrinsics.checkNotNull(kSerializer8, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return kSerializer;
        }
        Iterable $this$map$iv = argsSerializers;
        boolean $i$f$map = false;
        Iterable $this$mapTo$iv$iv = $this$map$iv;
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        boolean $i$f$mapTo = false;
        Iterator iterator2 = $this$mapTo$iv$iv.iterator();
        while (true) {
            if (!iterator2.hasNext()) {
                void var4_4;
                void var11_13;
                List list = (List)var11_13;
                kSerializer = SerializersKt__SerializersJvmKt.reflectiveOrContextual$SerializersKt__SerializersJvmKt($this$serializerByJavaTypeImpl, var4_4, list);
                return kSerializer;
            }
            Object t = iterator2.next();
            KSerializer kSerializer9 = (KSerializer)t;
            collection = destination$iv$iv;
            boolean bl = false;
            Intrinsics.checkNotNull(kSerializer9, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any?>");
            collection.add(kSerializer9);
        }
    }

    /*
     * WARNING - void declaration
     */
    private static final KSerializer<Object> typeSerializer$SerializersKt__SerializersJvmKt(SerializersModule $this$typeSerializer, Class<?> type, boolean failOnMissingTypeArgSerializer) {
        KSerializer<Object> kSerializer;
        if (type.isArray() && !type.getComponentType().isPrimitive()) {
            void var5_5;
            KSerializer<Object> kSerializer2;
            Class<?> clazz = type.getComponentType();
            Intrinsics.checkNotNullExpressionValue(clazz, "getComponentType(...)");
            Class<?> eType = clazz;
            if (failOnMissingTypeArgSerializer) {
                kSerializer2 = SerializersKt.serializer($this$typeSerializer, eType);
            } else {
                kSerializer2 = SerializersKt.serializerOrNull($this$typeSerializer, eType);
                if (kSerializer2 == null) {
                    return null;
                }
            }
            KSerializer<Object> s = kSerializer2;
            KClass<?> kClass = JvmClassMappingKt.getKotlinClass(eType);
            Intrinsics.checkNotNull(kClass, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            KSerializer<Object[]> arraySerializer = BuiltinSerializersKt.ArraySerializer(kClass, s);
            Intrinsics.checkNotNull(arraySerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            kSerializer = var5_5;
        } else {
            Intrinsics.checkNotNull(type, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>");
            kSerializer = SerializersKt__SerializersJvmKt.reflectiveOrContextual$SerializersKt__SerializersJvmKt($this$typeSerializer, type, CollectionsKt.emptyList());
        }
        return kSerializer;
    }

    @NotNull
    public static final KSerializer<Object> serializer(@NotNull SerializersModule $this$serializer, @NotNull Type type) {
        Intrinsics.checkNotNullParameter($this$serializer, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        KSerializer<Object> kSerializer = SerializersKt__SerializersJvmKt.serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt($this$serializer, type, true);
        if (kSerializer == null) {
            PlatformKt.serializerNotRegistered(SerializersKt__SerializersJvmKt.prettyClass$SerializersKt__SerializersJvmKt(type));
            throw new KotlinNothingValueException();
        }
        return kSerializer;
    }

    private static final KSerializer<Object> genericArraySerializer$SerializersKt__SerializersJvmKt(SerializersModule $this$genericArraySerializer, GenericArrayType type, boolean failOnMissingTypeArgSerializer) {
        KClass kClass;
        KSerializer<Object> kSerializer;
        Type type2;
        Type it = type.getGenericComponentType();
        boolean bl = false;
        if (it instanceof WildcardType) {
            Type[] typeArray = ((WildcardType)it).getUpperBounds();
            Intrinsics.checkNotNullExpressionValue(typeArray, "getUpperBounds(...)");
            type2 = (Type)ArraysKt.first((Object[])typeArray);
        } else {
            type2 = it;
        }
        Type eType = type2;
        if (failOnMissingTypeArgSerializer) {
            Intrinsics.checkNotNull(eType);
            kSerializer = SerializersKt.serializer($this$genericArraySerializer, eType);
        } else {
            Intrinsics.checkNotNull(eType);
            kSerializer = SerializersKt.serializerOrNull($this$genericArraySerializer, eType);
            if (kSerializer == null) {
                return null;
            }
        }
        KSerializer<Object> serializer2 = kSerializer;
        Type type3 = eType;
        if (type3 instanceof ParameterizedType) {
            Type type4 = ((ParameterizedType)eType).getRawType();
            Intrinsics.checkNotNull(type4, "null cannot be cast to non-null type java.lang.Class<*>");
            kClass = JvmClassMappingKt.getKotlinClass((Class)type4);
        } else if (type3 instanceof KClass) {
            kClass = (KClass)((Object)eType);
        } else {
            throw new IllegalStateException("unsupported type in GenericArray: " + Reflection.getOrCreateKotlinClass(eType.getClass()));
        }
        KClass kClass2 = kClass;
        Intrinsics.checkNotNull(kClass2, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
        KClass kclass = kClass2;
        KSerializer<Object[]> kSerializer2 = BuiltinSerializersKt.ArraySerializer(kclass, serializer2);
        Intrinsics.checkNotNull(kSerializer2, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
        return kSerializer2;
    }

    static /* synthetic */ KSerializer serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt$default(SerializersModule serializersModule, Type type, boolean bl, int n, Object object) {
        if ((n & 2) != 0) {
            bl = true;
        }
        return SerializersKt__SerializersJvmKt.serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt(serializersModule, type, bl);
    }
}

