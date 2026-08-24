/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.internal;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Polymorphic;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.internal.EnumSerializer;
import kotlinx.serialization.internal.NamedCompanion;
import kotlinx.serialization.internal.Platform_commonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=2, xi=48, d1={"\u0000V\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0018\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aM\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\"\u0010\u0005\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00040\u0003\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0004H\u0002\u00a2\u0006\u0004\b\u0006\u0010\u0007\u001aQ\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\"\u0010\u0005\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00040\u0003\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0004H\u0002\u00a2\u0006\u0004\b\n\u0010\u000b\u001a\u001d\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\fH\u0000\u00a2\u0006\u0004\b\u000f\u0010\u0010\u001a!\u0010\u0013\u001a\u0004\u0018\u00010\u0000*\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\b\u0013\u0010\u0014\u001a+\u0010\u0015\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\fH\u0000\u00a2\u0006\u0004\b\u0015\u0010\u0016\u001aO\u0010\u0017\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2\"\u0010\u0005\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00040\u0003\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0004H\u0000\u00a2\u0006\u0004\b\u0017\u0010\u000b\u001aO\u0010\u0017\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\f2\"\u0010\u0005\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00040\u0003\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0004H\u0000\u00a2\u0006\u0004\b\u0017\u0010\u0018\u001a)\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\bH\u0002\u00a2\u0006\u0004\b\u0019\u0010\u001a\u001aO\u0010\u001b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2\"\u0010\u0005\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00040\u0003\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0004H\u0002\u00a2\u0006\u0004\b\u001b\u0010\u000b\u001a%\u0010\u001c\u001a\u0004\u0018\u00010\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\bH\u0002\u00a2\u0006\u0004\b\u001c\u0010\u001d\u001a+\u0010\u001e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\bH\u0002\u00a2\u0006\u0004\b\u001e\u0010\u001a\u001a(\u0010!\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010 \u001a\u00020\u001fH\u0080\b\u00a2\u0006\u0004\b!\u0010\"\u001a\u001c\u0010!\u001a\u00020\u000e*\u00020#2\u0006\u0010 \u001a\u00020\u001fH\u0080\b\u00a2\u0006\u0004\b!\u0010$\u001a+\u0010%\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\bH\u0002\u00a2\u0006\u0004\b%\u0010\u001a\u001a#\u0010&\u001a\u00020\u000e\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\bH\u0002\u00a2\u0006\u0004\b&\u0010'\u001a#\u0010(\u001a\u00020\u000e\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\bH\u0002\u00a2\u0006\u0004\b(\u0010'\u001a\u0017\u0010*\u001a\u00020)*\u0006\u0012\u0002\b\u00030\fH\u0000\u00a2\u0006\u0004\b*\u0010+\u001a\u0017\u0010,\u001a\u00020)*\u0006\u0012\u0002\b\u00030\bH\u0000\u00a2\u0006\u0004\b,\u0010-\u001aM\u00102\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\n\b\u0001\u0010.*\u0004\u0018\u00018\u0000*\u0012\u0012\u0004\u0012\u00028\u00010/j\b\u0012\u0004\u0012\u00028\u0001`02\f\u00101\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0000\u00a2\u0006\u0004\b2\u00103\u00a8\u00064"}, d2={"", "T", "companion", "", "Lkotlinx/serialization/KSerializer;", "args", "invokeSerializerOnCompanion", "(Ljava/lang/Object;[Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", "Ljava/lang/Class;", "jClass", "invokeSerializerOnDefaultCompanion", "(Ljava/lang/Class;[Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", "Lkotlin/reflect/KClass;", "rootClass", "", "isReferenceArray", "(Lkotlin/reflect/KClass;)Z", "", "companionName", "companionOrNull", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;", "compiledSerializerImpl", "(Lkotlin/reflect/KClass;)Lkotlinx/serialization/KSerializer;", "constructSerializerForGivenTypeArgs", "(Lkotlin/reflect/KClass;[Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", "createEnumSerializer", "(Ljava/lang/Class;)Lkotlinx/serialization/KSerializer;", "findInNamedCompanion", "findNamedCompanionByAnnotation", "(Ljava/lang/Class;)Ljava/lang/Object;", "findObjectSerializer", "", "index", "getChecked", "([Ljava/lang/Object;I)Ljava/lang/Object;", "", "([ZI)Z", "interfaceSerializer", "isNotAnnotated", "(Ljava/lang/Class;)Z", "isPolymorphicSerializer", "", "platformSpecificSerializerNotRegistered", "(Lkotlin/reflect/KClass;)Ljava/lang/Void;", "serializerNotRegistered", "(Ljava/lang/Class;)Ljava/lang/Void;", "E", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "eClass", "toNativeArrayImpl", "(Ljava/util/ArrayList;Lkotlin/reflect/KClass;)[Ljava/lang/Object;", "kotlinx-serialization-core"})
public final class PlatformKt {
    private static final Object companionOrNull(Class<?> $this$companionOrNull, String companionName) {
        Object object;
        try {
            Field companion = $this$companionOrNull.getDeclaredField(companionName);
            companion.setAccessible(true);
            object = companion.get(null);
        }
        catch (Throwable throwable) {
            object = null;
        }
        return object;
    }

    /*
     * WARNING - void declaration
     */
    @Nullable
    public static final <T> KSerializer<T> constructSerializerForGivenTypeArgs(@NotNull Class<T> $this$constructSerializerForGivenTypeArgs, KSerializer<Object> ... args2) {
        KSerializer<T> fromNamedCompanion;
        KSerializer<T> serializer2;
        Intrinsics.checkNotNullParameter($this$constructSerializerForGivenTypeArgs, "<this>");
        Intrinsics.checkNotNullParameter(args2, "args");
        if ($this$constructSerializerForGivenTypeArgs.isEnum() && PlatformKt.isNotAnnotated($this$constructSerializerForGivenTypeArgs)) {
            return PlatformKt.createEnumSerializer($this$constructSerializerForGivenTypeArgs);
        }
        if ($this$constructSerializerForGivenTypeArgs.isInterface()) {
            KSerializer<T> kSerializer = PlatformKt.interfaceSerializer($this$constructSerializerForGivenTypeArgs);
            if (kSerializer != null) {
                void var4_3;
                KSerializer<T> it = kSerializer;
                boolean bl = false;
                return var4_3;
            }
        }
        KSerializer<T> kSerializer = serializer2 = PlatformKt.invokeSerializerOnDefaultCompanion($this$constructSerializerForGivenTypeArgs, Arrays.copyOf(args2, args2.length));
        if (kSerializer != null) {
            return kSerializer;
        }
        KSerializer<T> kSerializer2 = PlatformKt.findObjectSerializer($this$constructSerializerForGivenTypeArgs);
        if (kSerializer2 != null) {
            void var5_5;
            KSerializer<T> it = kSerializer2;
            boolean bl = false;
            return var5_5;
        }
        KSerializer<T> kSerializer3 = fromNamedCompanion = PlatformKt.findInNamedCompanion($this$constructSerializerForGivenTypeArgs, Arrays.copyOf(args2, args2.length));
        if (kSerializer3 != null) {
            return kSerializer3;
        }
        return PlatformKt.isPolymorphicSerializer($this$constructSerializerForGivenTypeArgs) ? (KSerializer)new PolymorphicSerializer<T>(JvmClassMappingKt.getKotlinClass($this$constructSerializerForGivenTypeArgs)) : null;
    }

    /*
     * WARNING - void declaration
     */
    private static final <T> KSerializer<T> invokeSerializerOnCompanion(Object companion, KSerializer<Object> ... args2) {
        KSerializer kSerializer;
        try {
            void e;
            Class[] classArray;
            int $i$f$emptyArray2;
            boolean bl = args2.length == 0;
            if (bl) {
                $i$f$emptyArray2 = 0;
                classArray = new Class[]{};
            } else {
                $i$f$emptyArray2 = 0;
                int n = args2.length;
                Class[] classArray2 = new Class[n];
                while ($i$f$emptyArray2 < n) {
                    int n2 = $i$f$emptyArray2++;
                    classArray2[n2] = KSerializer.class;
                }
                classArray = classArray2;
            }
            Class[] types = classArray;
            Object $i$f$emptyArray2 = companion.getClass().getDeclaredMethod("serializer", Arrays.copyOf(types, types.length)).invoke(companion, (Object[])Arrays.copyOf(args2, args2.length));
            kSerializer = $i$f$emptyArray2 instanceof KSerializer ? (KSerializer)e : null;
        }
        catch (NoSuchMethodException e) {
            kSerializer = null;
        }
        catch (InvocationTargetException e) {
            Throwable throwable = e.getCause();
            if (throwable == null) {
                throw e;
            }
            Throwable cause = throwable;
            String string = cause.getMessage();
            if (string == null) {
                void var3_5;
                string = var3_5.getMessage();
            }
            throw new InvocationTargetException(cause, string);
        }
        return kSerializer;
    }

    /*
     * WARNING - void declaration
     */
    private static final <T> Object findNamedCompanionByAnnotation(Class<T> $this$findNamedCompanionByAnnotation) {
        Object v2;
        block2: {
            Class<?>[] classArray = $this$findNamedCompanionByAnnotation.getDeclaredClasses();
            Intrinsics.checkNotNullExpressionValue(classArray, "getDeclaredClasses(...)");
            Object[] $this$firstOrNull$iv = classArray;
            boolean $i$f$firstOrNull = false;
            int n = $this$firstOrNull$iv.length;
            for (int i = 0; i < n; ++i) {
                void var6_5;
                Object element$iv = $this$firstOrNull$iv[i];
                Class clazz = (Class)element$iv;
                boolean bl = false;
                boolean bl2 = clazz.getAnnotation(NamedCompanion.class) != null;
                if (!bl2) continue;
                v2 = var6_5;
                break block2;
            }
            v2 = null;
        }
        Class clazz = v2;
        if (clazz == null) {
            return null;
        }
        Class companionClass = clazz;
        String string = companionClass.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(string, "getSimpleName(...)");
        return PlatformKt.companionOrNull($this$findNamedCompanionByAnnotation, string);
    }

    private static final <T> KSerializer<T> interfaceSerializer(Class<T> $this$interfaceSerializer) {
        Serializable serializable = $this$interfaceSerializer.getAnnotation(Serializable.class);
        if (serializable == null || Intrinsics.areEqual(Reflection.getOrCreateKotlinClass(serializable.with()), Reflection.getOrCreateKotlinClass(PolymorphicSerializer.class))) {
            return new PolymorphicSerializer<T>(JvmClassMappingKt.getKotlinClass($this$interfaceSerializer));
        }
        return null;
    }

    private static final <T> KSerializer<T> invokeSerializerOnDefaultCompanion(Class<?> jClass, KSerializer<Object> ... args2) {
        Object object = PlatformKt.companionOrNull(jClass, "Companion");
        if (object == null) {
            return null;
        }
        Object companion = object;
        return PlatformKt.invokeSerializerOnCompanion(companion, Arrays.copyOf(args2, args2.length));
    }

    @NotNull
    public static final Void platformSpecificSerializerNotRegistered(@NotNull KClass<?> $this$platformSpecificSerializerNotRegistered) {
        Intrinsics.checkNotNullParameter($this$platformSpecificSerializerNotRegistered, "<this>");
        Platform_commonKt.serializerNotRegistered($this$platformSpecificSerializerNotRegistered);
        throw new KotlinNothingValueException();
    }

    @Nullable
    public static final <T> KSerializer<T> compiledSerializerImpl(@NotNull KClass<T> $this$compiledSerializerImpl) {
        Intrinsics.checkNotNullParameter($this$compiledSerializerImpl, "<this>");
        return PlatformKt.constructSerializerForGivenTypeArgs($this$compiledSerializerImpl, new KSerializer[0]);
    }

    private static final <T> boolean isNotAnnotated(Class<T> $this$isNotAnnotated) {
        return $this$isNotAnnotated.getAnnotation(Serializable.class) == null && $this$isNotAnnotated.getAnnotation(Polymorphic.class) == null;
    }

    public static final boolean getChecked(@NotNull boolean[] $this$getChecked, int index) {
        Intrinsics.checkNotNullParameter($this$getChecked, "<this>");
        boolean $i$f$getChecked = false;
        return $this$getChecked[index];
    }

    @Nullable
    public static final <T> KSerializer<T> constructSerializerForGivenTypeArgs(@NotNull KClass<T> $this$constructSerializerForGivenTypeArgs, KSerializer<Object> ... args2) {
        Intrinsics.checkNotNullParameter($this$constructSerializerForGivenTypeArgs, "<this>");
        Intrinsics.checkNotNullParameter(args2, "args");
        return PlatformKt.constructSerializerForGivenTypeArgs(JvmClassMappingKt.getJavaClass($this$constructSerializerForGivenTypeArgs), Arrays.copyOf(args2, args2.length));
    }

    @NotNull
    public static final Void serializerNotRegistered(@NotNull Class<?> $this$serializerNotRegistered) {
        Intrinsics.checkNotNullParameter($this$serializerNotRegistered, "<this>");
        throw new SerializationException(Platform_commonKt.notRegisteredMessage(JvmClassMappingKt.getKotlinClass($this$serializerNotRegistered)));
    }

    /*
     * WARNING - void declaration
     */
    private static final <T> KSerializer<T> findInNamedCompanion(Class<T> $this$findInNamedCompanion, KSerializer<Object> ... args2) {
        KSerializer<T> kSerializer;
        Object namedCompanion = PlatformKt.findNamedCompanionByAnnotation($this$findInNamedCompanion);
        if (namedCompanion != null) {
            kSerializer = PlatformKt.invokeSerializerOnCompanion(namedCompanion, Arrays.copyOf(args2, args2.length));
            if (kSerializer != null) {
                KSerializer<T> it = kSerializer;
                boolean bl = false;
                return it;
            }
        }
        try {
            Field field;
            Object object;
            block6: {
                void var7_8;
                void var8_9;
                Class<?>[] classArray = $this$findInNamedCompanion.getDeclaredClasses();
                Intrinsics.checkNotNullExpressionValue(classArray, "getDeclaredClasses(...)");
                Object[] $this$singleOrNull$iv = classArray;
                boolean $i$f$singleOrNull = false;
                Object single$iv = null;
                boolean found$iv = false;
                for (Object element$iv : $this$singleOrNull$iv) {
                    void var11_12;
                    Class it = (Class)element$iv;
                    boolean bl = false;
                    if (!Intrinsics.areEqual(it.getSimpleName(), "$serializer")) continue;
                    if (found$iv) {
                        object = null;
                        break block6;
                    }
                    single$iv = var11_12;
                    found$iv = true;
                }
                object = var8_9 == false ? null : var7_8;
            }
            Class clazz = (Class)object;
            kSerializer = clazz != null && (field = clazz.getField("INSTANCE")) != null ? field.get(null) : null;
            kSerializer = kSerializer instanceof KSerializer ? kSerializer : null;
        }
        catch (NoSuchFieldException noSuchFieldException) {
            kSerializer = null;
        }
        return kSerializer;
    }

    /*
     * Unable to fully structure code
     */
    private static final <T> KSerializer<T> findObjectSerializer(Class<T> $this$findObjectSerializer) {
        block12: {
            block11: {
                block14: {
                    block13: {
                        v0 = $this$findObjectSerializer.getCanonicalName();
                        if (v0 == null) break block13;
                        it = v0;
                        $i$a$-let-PlatformKt$findObjectSerializer$1 = false;
                        if (StringsKt.startsWith$default(it, "java.", false, 2, null)) ** GOTO lbl-1000
                        if (StringsKt.startsWith$default(it, "kotlin.", false, 2, null)) lbl-1000:
                        // 2 sources

                        {
                            v1 = true;
                        } else {
                            v1 = false;
                        }
                        v2 = !v1;
                        break block14;
                    }
                    v2 = false;
                }
                if (!v2) {
                    return null;
                }
                v3 = $this$findObjectSerializer.getDeclaredFields();
                Intrinsics.checkNotNullExpressionValue(v3, "getDeclaredFields(...)");
                $this$singleOrNull$iv = v3;
                $i$f$singleOrNull = false;
                single$iv = null;
                found$iv = false;
                var8_8 = $this$singleOrNull$iv.length;
                for (var7_6 = 0; var7_6 < var8_8; ++var7_6) {
                    element$iv = $this$singleOrNull$iv[var7_6];
                    it = (Field)element$iv;
                    $i$a$-singleOrNull-PlatformKt$findObjectSerializer$field$1 = false;
                    v4 = Intrinsics.areEqual(it.getName(), "INSTANCE") && Intrinsics.areEqual(it.getType(), $this$findObjectSerializer) && Modifier.isStatic(var10_11.getModifiers());
                    if (!v4) continue;
                    if (found$iv) {
                        v5 = null;
                        break block11;
                    }
                    single$iv = var9_9;
                    found$iv = true;
                }
                v5 = !found$iv ? null : single$iv;
            }
            v6 = v5;
            if (v6 == null) {
                return null;
            }
            field = v6;
            instance = field.get(null);
            v7 = $this$findObjectSerializer.getMethods();
            Intrinsics.checkNotNullExpressionValue(v7, "getMethods(...)");
            $this$singleOrNull$iv = v7;
            $i$f$singleOrNull = false;
            single$iv = null;
            found$iv = false;
            for (Object element$iv : $this$singleOrNull$iv) {
                it = (Method)element$iv;
                $i$a$-singleOrNull-PlatformKt$findObjectSerializer$method$1 = false;
                if (!Intrinsics.areEqual(it.getName(), "serializer")) ** GOTO lbl-1000
                v8 = it.getParameterTypes();
                Intrinsics.checkNotNullExpressionValue(v8, "getParameterTypes(...)");
                v9 = ((Object[])v8).length == 0;
                if (v9 && Intrinsics.areEqual(var12_17.getReturnType(), KSerializer.class)) {
                    v10 = true;
                } else lbl-1000:
                // 2 sources

                {
                    v10 = false;
                }
                if (!v10) continue;
                if (var8_8 != 0) {
                    v11 = null;
                    break block12;
                }
                var7_7 = var11_14;
                var8_8 = 1;
            }
            v11 = var8_8 == 0 ? null : var7_7;
        }
        v12 = (Method)v11;
        if (v12 == null) {
            return null;
        }
        var3_1 = v12;
        var4_3 = var3_1.invoke((Object)var2_16, new Object[0]);
        return var4_3 instanceof KSerializer ? (KSerializer)var4_3 : null;
    }

    private static final <T> boolean isPolymorphicSerializer(Class<T> $this$isPolymorphicSerializer) {
        if ($this$isPolymorphicSerializer.getAnnotation(Polymorphic.class) != null) {
            return true;
        }
        Serializable serializable = $this$isPolymorphicSerializer.getAnnotation(Serializable.class);
        if (serializable != null && Intrinsics.areEqual(Reflection.getOrCreateKotlinClass(serializable.with()), Reflection.getOrCreateKotlinClass(PolymorphicSerializer.class))) {
            return true;
        }
        return false;
    }

    private static final <T> KSerializer<T> createEnumSerializer(Class<T> $this$createEnumSerializer) {
        T[] constants = $this$createEnumSerializer.getEnumConstants();
        String string = $this$createEnumSerializer.getCanonicalName();
        Intrinsics.checkNotNullExpressionValue(string, "getCanonicalName(...)");
        Intrinsics.checkNotNull(constants, "null cannot be cast to non-null type kotlin.Array<out kotlin.Enum<*>>");
        return new EnumSerializer(string, (Enum[])constants);
    }

    public static final boolean isReferenceArray(@NotNull KClass<Object> rootClass) {
        Intrinsics.checkNotNullParameter(rootClass, "rootClass");
        return JvmClassMappingKt.getJavaClass(rootClass).isArray();
    }

    public static final <T> T getChecked(@NotNull T[] $this$getChecked, int index) {
        Intrinsics.checkNotNullParameter($this$getChecked, "<this>");
        boolean $i$f$getChecked = false;
        return $this$getChecked[index];
    }

    @NotNull
    public static final <T, E extends T> E[] toNativeArrayImpl(@NotNull ArrayList<E> $this$toNativeArrayImpl, @NotNull KClass<T> eClass) {
        Intrinsics.checkNotNullParameter($this$toNativeArrayImpl, "<this>");
        Intrinsics.checkNotNullParameter(eClass, "eClass");
        Object object = Array.newInstance(JvmClassMappingKt.getJavaClass(eClass), $this$toNativeArrayImpl.size());
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>");
        Object[] objectArray = $this$toNativeArrayImpl.toArray((Object[])object);
        Intrinsics.checkNotNullExpressionValue(objectArray, "toArray(...)");
        return objectArray;
    }
}

