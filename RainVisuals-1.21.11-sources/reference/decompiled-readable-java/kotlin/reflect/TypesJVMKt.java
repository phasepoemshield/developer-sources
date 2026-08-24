/*
 * Decompiled with CFR 0.152.
 */
package kotlin.reflect;

import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.SinceKotlin;
import kotlin.collections.CollectionsKt;
import kotlin.internal.LowPriorityInOverloadResolution;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.KTypeBase;
import kotlin.reflect.GenericArrayTypeImpl;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.KVariance;
import kotlin.reflect.ParameterizedTypeImpl;
import kotlin.reflect.TypeVariableImpl;
import kotlin.reflect.TypesJVMKt;
import kotlin.reflect.WildcardTypeImpl;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=2, xi=48, d1={"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\u001a)\u0010\u0006\u001a\u00020\u00052\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003\u00a2\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\b\n\u0010\u000b\u001a\u001d\u0010\u000f\u001a\u00020\u0005*\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0003\u00a2\u0006\u0004\b\u000f\u0010\u0010\"\u001e\u0010\u0015\u001a\u00020\u0005*\u00020\f8FX\u0087\u0004\u00a2\u0006\f\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012\"\u001e\u0010\u0015\u001a\u00020\u0005*\u00020\u00038BX\u0083\u0004\u00a2\u0006\f\u0012\u0004\b\u0013\u0010\u0017\u001a\u0004\b\u0011\u0010\u0016\u00a8\u0006\u0018"}, d2={"Ljava/lang/Class;", "jClass", "", "Lkotlin/reflect/KTypeProjection;", "arguments", "Ljava/lang/reflect/Type;", "createPossiblyInnerType", "(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Type;", "type", "", "typeToString", "(Ljava/lang/reflect/Type;)Ljava/lang/String;", "Lkotlin/reflect/KType;", "", "forceWrapper", "computeJavaType", "(Lkotlin/reflect/KType;Z)Ljava/lang/reflect/Type;", "getJavaType", "(Lkotlin/reflect/KType;)Ljava/lang/reflect/Type;", "getJavaType$annotations", "(Lkotlin/reflect/KType;)V", "javaType", "(Lkotlin/reflect/KTypeProjection;)Ljava/lang/reflect/Type;", "(Lkotlin/reflect/KTypeProjection;)V", "kotlin-stdlib"})
public final class TypesJVMKt {
    static /* synthetic */ Type computeJavaType$default(KType kType, boolean bl, int n, Object object) {
        if ((n & 1) != 0) {
            bl = false;
        }
        return TypesJVMKt.computeJavaType(kType, bl);
    }

    @ExperimentalStdlibApi
    private static final Type computeJavaType(KType $this$computeJavaType, boolean forceWrapper) {
        KClassifier classifier = $this$computeJavaType.getClassifier();
        if (classifier instanceof KTypeParameter) {
            return new TypeVariableImpl((KTypeParameter)classifier);
        }
        if (classifier instanceof KClass) {
            Class jClass = forceWrapper ? JvmClassMappingKt.getJavaObjectType((KClass)classifier) : JvmClassMappingKt.getJavaClass((KClass)classifier);
            List<KTypeProjection> arguments = $this$computeJavaType.getArguments();
            if (arguments.isEmpty()) {
                return jClass;
            }
            if (jClass.isArray()) {
                Type type;
                if (jClass.getComponentType().isPrimitive()) {
                    return jClass;
                }
                KTypeProjection kTypeProjection = CollectionsKt.singleOrNull(arguments);
                if (kTypeProjection == null) {
                    throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + $this$computeJavaType);
                }
                KTypeProjection kTypeProjection2 = kTypeProjection;
                KVariance variance = kTypeProjection2.component1();
                KType elementType = kTypeProjection2.component2();
                KVariance kVariance = variance;
                switch (kVariance == null ? -1 : WhenMappings.$EnumSwitchMapping$0[kVariance.ordinal()]) {
                    case -1: 
                    case 1: {
                        type = jClass;
                        break;
                    }
                    case 2: 
                    case 3: {
                        KType kType = elementType;
                        Intrinsics.checkNotNull(kType);
                        Type javaElementType = TypesJVMKt.computeJavaType$default(kType, false, 1, null);
                        if (javaElementType instanceof Class) {
                            type = jClass;
                            break;
                        }
                        type = new GenericArrayTypeImpl(javaElementType);
                        break;
                    }
                    default: {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return type;
            }
            return TypesJVMKt.createPossiblyInnerType(jClass, arguments);
        }
        throw new UnsupportedOperationException("Unsupported type classifier: " + $this$computeJavaType);
    }

    private static final Type getJavaType(KTypeProjection $this$javaType) {
        Type type;
        KVariance kVariance = $this$javaType.getVariance();
        if (kVariance == null) {
            return WildcardTypeImpl.Companion.getSTAR();
        }
        KVariance variance = kVariance;
        KType kType = $this$javaType.getType();
        Intrinsics.checkNotNull(kType);
        KType type2 = kType;
        switch (WhenMappings.$EnumSwitchMapping$0[variance.ordinal()]) {
            case 2: {
                type = TypesJVMKt.computeJavaType(type2, true);
                break;
            }
            case 1: {
                type = new WildcardTypeImpl(null, TypesJVMKt.computeJavaType(type2, true));
                break;
            }
            case 3: {
                type = new WildcardTypeImpl(TypesJVMKt.computeJavaType(type2, true), null);
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        return type;
    }

    public static final /* synthetic */ Type access$computeJavaType(KType $receiver, boolean forceWrapper) {
        return TypesJVMKt.computeJavaType($receiver, forceWrapper);
    }

    public static final /* synthetic */ String access$typeToString(Type type) {
        return TypesJVMKt.typeToString(type);
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public static final Type getJavaType(@NotNull KType $this$javaType) {
        Type type;
        Intrinsics.checkNotNullParameter($this$javaType, "<this>");
        if ($this$javaType instanceof KTypeBase && (type = ((KTypeBase)$this$javaType).getJavaType()) != null) {
            void var3_3;
            Type type2 = type;
            Type it = type2;
            boolean bl = false;
            return var3_3;
        }
        return TypesJVMKt.computeJavaType$default($this$javaType, false, 1, null);
    }

    private static final String typeToString(Type type) {
        String string;
        if (type instanceof Class) {
            String string2;
            if (((Class)type).isArray()) {
                Sequence<Type> unwrap2 = SequencesKt.generateSequence(type, (Function1)typeToString.unwrap.1.INSTANCE);
                string2 = ((Class)SequencesKt.last(unwrap2)).getName() + StringsKt.repeat("[]", SequencesKt.count(unwrap2));
            } else {
                string2 = ((Class)type).getName();
            }
            String string3 = string2;
            Intrinsics.checkNotNull(string3);
            string = string3;
        } else {
            string = type.toString();
        }
        return string;
    }

    @ExperimentalStdlibApi
    private static /* synthetic */ void getJavaType$annotations(KTypeProjection kTypeProjection) {
    }

    /*
     * WARNING - void declaration
     */
    @ExperimentalStdlibApi
    private static final Type createPossiblyInnerType(Class<?> jClass, List<KTypeProjection> arguments) {
        void var7_21;
        Collection<Type> collection;
        void $this$mapTo$iv$iv;
        Class<?> clazz = jClass.getDeclaringClass();
        if (clazz == null) {
            Collection<Type> collection2;
            void $this$mapTo$iv$iv2;
            void $this$map$iv;
            Iterable iterable = arguments;
            Type type = null;
            Class<?> clazz2 = jClass;
            boolean $i$f$map2 = false;
            void var6_16 = $this$map$iv;
            Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
            boolean $i$f$mapTo = false;
            for (Object item$iv$iv : $this$mapTo$iv$iv2) {
                KTypeProjection p0 = (KTypeProjection)item$iv$iv;
                collection2 = destination$iv$iv;
                boolean bl = false;
                collection2.add(TypesJVMKt.getJavaType(p0));
            }
            collection2 = (List)destination$iv$iv;
            List list = collection2;
            Type type2 = type;
            Class<?> clazz3 = clazz2;
            return new ParameterizedTypeImpl(clazz3, type2, list);
        }
        Class<?> ownerClass = clazz;
        if (Modifier.isStatic(jClass.getModifiers())) {
            Collection<Type> collection3;
            void $this$mapTo$iv$iv3;
            Iterable $this$map$iv = arguments;
            Type type = ownerClass;
            Class<?> clazz4 = jClass;
            boolean $i$f$map = false;
            Iterable $i$f$map2 = $this$map$iv;
            Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
            boolean $i$f$mapTo = false;
            for (Object item$iv$iv : $this$mapTo$iv$iv3) {
                KTypeProjection p0 = (KTypeProjection)item$iv$iv;
                collection3 = destination$iv$iv;
                boolean bl = false;
                collection3.add(TypesJVMKt.getJavaType(p0));
            }
            collection3 = (List)destination$iv$iv;
            List list = collection3;
            Type type3 = type;
            Class<?> clazz5 = clazz4;
            return new ParameterizedTypeImpl(clazz5, type3, list);
        }
        int n = jClass.getTypeParameters().length;
        Iterable $this$map$iv = arguments.subList(0, n);
        Type type = TypesJVMKt.createPossiblyInnerType(ownerClass, arguments.subList(n, arguments.size()));
        Class<?> clazz6 = jClass;
        boolean $i$f$map = false;
        Iterable destination$iv$iv = $this$map$iv;
        Collection destination$iv$iv2 = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        boolean $i$f$mapTo = false;
        for (Object item$iv$iv : $this$mapTo$iv$iv) {
            KTypeProjection kTypeProjection = (KTypeProjection)item$iv$iv;
            collection = destination$iv$iv2;
            boolean bl = false;
            collection.add(TypesJVMKt.getJavaType(kTypeProjection));
        }
        collection = (List)var7_21;
        List list = collection;
        Type type4 = type;
        Class<?> clazz7 = clazz6;
        return new ParameterizedTypeImpl(clazz7, type4, list);
    }

    @ExperimentalStdlibApi
    @SinceKotlin(version="1.4")
    @LowPriorityInOverloadResolution
    public static /* synthetic */ void getJavaType$annotations(KType kType) {
    }

    @Metadata(mv={1, 9, 0}, k=3, xi=48)
    public final class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] nArray = new int[KVariance.values().length];
            try {
                nArray[KVariance.IN.ordinal()] = 1;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                nArray[KVariance.INVARIANT.ordinal()] = 2;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                nArray[KVariance.OUT.ordinal()] = 3;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            $EnumSwitchMapping$0 = nArray;
        }
    }
}

