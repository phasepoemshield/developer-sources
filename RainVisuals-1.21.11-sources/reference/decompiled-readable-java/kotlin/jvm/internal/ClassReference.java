/*
 * Decompiled with CFR 0.152.
 */
package kotlin.jvm.internal;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Function;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.SinceKotlin;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.functions.Function12;
import kotlin.jvm.functions.Function13;
import kotlin.jvm.functions.Function14;
import kotlin.jvm.functions.Function15;
import kotlin.jvm.functions.Function16;
import kotlin.jvm.functions.Function17;
import kotlin.jvm.functions.Function18;
import kotlin.jvm.functions.Function19;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function20;
import kotlin.jvm.functions.Function21;
import kotlin.jvm.functions.Function22;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.functions.Function9;
import kotlin.jvm.internal.ClassBasedDeclarationContainer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.reflect.KCallable;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KVisibility;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 T2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001TB\u0013\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0096\u0002\u00a2\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002\u00a2\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u0017\u00a2\u0006\u0004\b\u0013\u0010\u000bJ\u000f\u0010\u0015\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR \u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u001d0\u001c8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010!\u001a\u00020\t8VX\u0097\u0004\u00a2\u0006\f\u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R\u001a\u0010%\u001a\u00020\t8VX\u0097\u0004\u00a2\u0006\f\u0012\u0004\b&\u0010$\u001a\u0004\b%\u0010\"R\u001a\u0010'\u001a\u00020\t8VX\u0097\u0004\u00a2\u0006\f\u0012\u0004\b(\u0010$\u001a\u0004\b'\u0010\"R\u001a\u0010)\u001a\u00020\t8VX\u0097\u0004\u00a2\u0006\f\u0012\u0004\b*\u0010$\u001a\u0004\b)\u0010\"R\u001a\u0010+\u001a\u00020\t8VX\u0097\u0004\u00a2\u0006\f\u0012\u0004\b,\u0010$\u001a\u0004\b+\u0010\"R\u001a\u0010-\u001a\u00020\t8VX\u0097\u0004\u00a2\u0006\f\u0012\u0004\b.\u0010$\u001a\u0004\b-\u0010\"R\u001a\u0010/\u001a\u00020\t8VX\u0097\u0004\u00a2\u0006\f\u0012\u0004\b0\u0010$\u001a\u0004\b/\u0010\"R\u001a\u00101\u001a\u00020\t8VX\u0097\u0004\u00a2\u0006\f\u0012\u0004\b2\u0010$\u001a\u0004\b1\u0010\"R\u001a\u00103\u001a\u00020\t8VX\u0097\u0004\u00a2\u0006\f\u0012\u0004\b4\u0010$\u001a\u0004\b3\u0010\"R\u001e\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00048\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b6\u00107R\u001e\u0010:\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003080\u001c8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b9\u0010\u001fR\u001e\u0010<\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\u001c8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b;\u0010\u001fR\u0016\u0010?\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b=\u0010>R\u0016\u0010A\u001a\u0004\u0018\u00010\u00148VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b@\u0010\u0016R(\u0010D\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00010\u00178VX\u0097\u0004\u00a2\u0006\f\u0012\u0004\bC\u0010$\u001a\u0004\bB\u0010\u001aR\u0016\u0010F\u001a\u0004\u0018\u00010\u00148VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\bE\u0010\u0016R \u0010J\u001a\b\u0012\u0004\u0012\u00020G0\u00178VX\u0097\u0004\u00a2\u0006\f\u0012\u0004\bI\u0010$\u001a\u0004\bH\u0010\u001aR \u0010N\u001a\b\u0012\u0004\u0012\u00020K0\u00178VX\u0097\u0004\u00a2\u0006\f\u0012\u0004\bM\u0010$\u001a\u0004\bL\u0010\u001aR\u001c\u0010S\u001a\u0004\u0018\u00010O8VX\u0097\u0004\u00a2\u0006\f\u0012\u0004\bR\u0010$\u001a\u0004\bP\u0010Q\u00a8\u0006U"}, d2={"Lkotlin/jvm/internal/ClassReference;", "Lkotlin/reflect/KClass;", "", "Lkotlin/jvm/internal/ClassBasedDeclarationContainer;", "Ljava/lang/Class;", "jClass", "<init>", "(Ljava/lang/Class;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "error", "()Ljava/lang/Void;", "", "hashCode", "()I", "value", "isInstance", "", "toString", "()Ljava/lang/String;", "", "", "getAnnotations", "()Ljava/util/List;", "annotations", "", "Lkotlin/reflect/KFunction;", "getConstructors", "()Ljava/util/Collection;", "constructors", "isAbstract", "()Z", "isAbstract$annotations", "()V", "isCompanion", "isCompanion$annotations", "isData", "isData$annotations", "isFinal", "isFinal$annotations", "isFun", "isFun$annotations", "isInner", "isInner$annotations", "isOpen", "isOpen$annotations", "isSealed", "isSealed$annotations", "isValue", "isValue$annotations", "Ljava/lang/Class;", "getJClass", "()Ljava/lang/Class;", "Lkotlin/reflect/KCallable;", "getMembers", "members", "getNestedClasses", "nestedClasses", "getObjectInstance", "()Ljava/lang/Object;", "objectInstance", "getQualifiedName", "qualifiedName", "getSealedSubclasses", "getSealedSubclasses$annotations", "sealedSubclasses", "getSimpleName", "simpleName", "Lkotlin/reflect/KType;", "getSupertypes", "getSupertypes$annotations", "supertypes", "Lkotlin/reflect/KTypeParameter;", "getTypeParameters", "getTypeParameters$annotations", "typeParameters", "Lkotlin/reflect/KVisibility;", "getVisibility", "()Lkotlin/reflect/KVisibility;", "getVisibility$annotations", "visibility", "Companion", "kotlin-stdlib"})
public final class ClassReference
implements KClass<Object>,
ClassBasedDeclarationContainer {
    @NotNull
    public static final Companion Companion;
    @NotNull
    private static final HashMap<String, String> primitiveWrapperFqNames;
    @NotNull
    private static final HashMap<String, String> primitiveFqNames;
    @NotNull
    private final Class<?> jClass;
    @NotNull
    private static final HashMap<String, String> classFqNames;
    @NotNull
    private static final Map<String, String> simpleNames;
    @NotNull
    private static final Map<Class<? extends Function<?>>, Integer> FUNCTION_CLASSES;

    @Override
    public boolean isAbstract() {
        this.error();
        throw new KotlinNothingValueException();
    }

    @Override
    public int hashCode() {
        return JvmClassMappingKt.getJavaObjectType(this).hashCode();
    }

    @Override
    public boolean isOpen() {
        this.error();
        throw new KotlinNothingValueException();
    }

    @SinceKotlin(version="1.1")
    public static /* synthetic */ void getVisibility$annotations() {
    }

    @Override
    public boolean isData() {
        this.error();
        throw new KotlinNothingValueException();
    }

    @Override
    @NotNull
    public Collection<KCallable<?>> getMembers() {
        this.error();
        throw new KotlinNothingValueException();
    }

    @Override
    public boolean isValue() {
        this.error();
        throw new KotlinNothingValueException();
    }

    @Override
    @Nullable
    public KVisibility getVisibility() {
        this.error();
        throw new KotlinNothingValueException();
    }

    @Override
    @NotNull
    public List<KType> getSupertypes() {
        this.error();
        throw new KotlinNothingValueException();
    }

    @NotNull
    public String toString() {
        return this.getJClass().toString() + " (Kotlin reflection is not available)";
    }

    @Override
    public boolean isSealed() {
        this.error();
        throw new KotlinNothingValueException();
    }

    @Override
    @Nullable
    public String getQualifiedName() {
        return Companion.getClassQualifiedName(this.getJClass());
    }

    @SinceKotlin(version="1.5")
    public static /* synthetic */ void isValue$annotations() {
    }

    @SinceKotlin(version="1.1")
    public static /* synthetic */ void isOpen$annotations() {
    }

    @Override
    public boolean isCompanion() {
        this.error();
        throw new KotlinNothingValueException();
    }

    @Override
    @Nullable
    public Object getObjectInstance() {
        this.error();
        throw new KotlinNothingValueException();
    }

    @Override
    @NotNull
    public Class<?> getJClass() {
        return this.jClass;
    }

    @SinceKotlin(version="1.1")
    public static /* synthetic */ void isCompanion$annotations() {
    }

    @SinceKotlin(version="1.3")
    public static /* synthetic */ void getSealedSubclasses$annotations() {
    }

    @Override
    public boolean equals(@Nullable Object other) {
        return other instanceof ClassReference && Intrinsics.areEqual(JvmClassMappingKt.getJavaObjectType(this), JvmClassMappingKt.getJavaObjectType((KClass)other));
    }

    @SinceKotlin(version="1.1")
    public static /* synthetic */ void isData$annotations() {
    }

    @Override
    public boolean isFun() {
        this.error();
        throw new KotlinNothingValueException();
    }

    @SinceKotlin(version="1.1")
    public static /* synthetic */ void isFinal$annotations() {
    }

    @Override
    @NotNull
    public List<KTypeParameter> getTypeParameters() {
        this.error();
        throw new KotlinNothingValueException();
    }

    @SinceKotlin(version="1.1")
    public static /* synthetic */ void isSealed$annotations() {
    }

    @SinceKotlin(version="1.1")
    public static /* synthetic */ void getTypeParameters$annotations() {
    }

    @Override
    @NotNull
    public List<KClass<? extends Object>> getSealedSubclasses() {
        this.error();
        throw new KotlinNothingValueException();
    }

    /*
     * WARNING - void declaration
     */
    static {
        void var3_7;
        Map $this$mapValues$iv;
        Object object;
        void $this$mapIndexedTo$iv$iv;
        HashMap<String, String> $this$mapIndexed$iv;
        Companion = new Companion(null);
        Class[] classArray = new Class[23];
        classArray[0] = Function0.class;
        classArray[1] = Function1.class;
        classArray[2] = Function2.class;
        classArray[3] = Function3.class;
        classArray[4] = Function4.class;
        classArray[5] = Function5.class;
        classArray[6] = Function6.class;
        classArray[7] = Function7.class;
        classArray[8] = Function8.class;
        classArray[9] = Function9.class;
        classArray[10] = Function10.class;
        classArray[11] = Function11.class;
        classArray[12] = Function12.class;
        classArray[13] = Function13.class;
        classArray[14] = Function14.class;
        classArray[15] = Function15.class;
        classArray[16] = Function16.class;
        classArray[17] = Function17.class;
        classArray[18] = Function18.class;
        classArray[19] = Function19.class;
        classArray[20] = Function20.class;
        classArray[21] = Function21.class;
        classArray[22] = Function22.class;
        $this$mapIndexed$iv = CollectionsKt.listOf($this$mapIndexed$iv);
        boolean $i$f$mapIndexed = false;
        Iterable iterable = $this$mapIndexed$iv;
        Object destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$mapIndexed$iv, 10));
        boolean $i$f$mapIndexedTo = false;
        int index$iv$iv22 = 0;
        for (Object item$iv$iv : $this$mapIndexedTo$iv$iv) {
            void var10_22;
            int n;
            if ((n = index$iv$iv22++) < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Class clazz = (Class)item$iv$iv;
            int i = n;
            object = destination$iv$iv;
            boolean bl = false;
            object.add(TuplesKt.to(clazz, (int)var10_22));
        }
        FUNCTION_CLASSES = MapsKt.toMap((List)destination$iv$iv);
        HashMap<String, String> $this$primitiveFqNames_u24lambda_u241 = $this$mapIndexed$iv = new HashMap();
        boolean bl = false;
        $this$primitiveFqNames_u24lambda_u241.put("boolean", "kotlin.Boolean");
        $this$primitiveFqNames_u24lambda_u241.put("char", "kotlin.Char");
        $this$primitiveFqNames_u24lambda_u241.put("byte", "kotlin.Byte");
        $this$primitiveFqNames_u24lambda_u241.put("short", "kotlin.Short");
        $this$primitiveFqNames_u24lambda_u241.put("int", "kotlin.Int");
        $this$primitiveFqNames_u24lambda_u241.put("float", "kotlin.Float");
        $this$primitiveFqNames_u24lambda_u241.put("long", "kotlin.Long");
        $this$primitiveFqNames_u24lambda_u241.put("double", "kotlin.Double");
        primitiveFqNames = $this$mapIndexed$iv;
        HashMap<String, String> $this$primitiveWrapperFqNames_u24lambda_u242 = $this$mapIndexed$iv = new HashMap<String, String>();
        boolean bl2 = false;
        $this$primitiveWrapperFqNames_u24lambda_u242.put("java.lang.Boolean", "kotlin.Boolean");
        $this$primitiveWrapperFqNames_u24lambda_u242.put("java.lang.Character", "kotlin.Char");
        $this$primitiveWrapperFqNames_u24lambda_u242.put("java.lang.Byte", "kotlin.Byte");
        $this$primitiveWrapperFqNames_u24lambda_u242.put("java.lang.Short", "kotlin.Short");
        $this$primitiveWrapperFqNames_u24lambda_u242.put("java.lang.Integer", "kotlin.Int");
        $this$primitiveWrapperFqNames_u24lambda_u242.put("java.lang.Float", "kotlin.Float");
        $this$primitiveWrapperFqNames_u24lambda_u242.put("java.lang.Long", "kotlin.Long");
        $this$primitiveWrapperFqNames_u24lambda_u242.put("java.lang.Double", "kotlin.Double");
        primitiveWrapperFqNames = $this$mapIndexed$iv;
        HashMap<String, String> $this$classFqNames_u24lambda_u244 = $this$mapIndexed$iv = new HashMap();
        boolean bl3 = false;
        $this$classFqNames_u24lambda_u244.put("java.lang.Object", "kotlin.Any");
        $this$classFqNames_u24lambda_u244.put("java.lang.String", "kotlin.String");
        $this$classFqNames_u24lambda_u244.put("java.lang.CharSequence", "kotlin.CharSequence");
        $this$classFqNames_u24lambda_u244.put("java.lang.Throwable", "kotlin.Throwable");
        $this$classFqNames_u24lambda_u244.put("java.lang.Cloneable", "kotlin.Cloneable");
        $this$classFqNames_u24lambda_u244.put("java.lang.Number", "kotlin.Number");
        $this$classFqNames_u24lambda_u244.put("java.lang.Comparable", "kotlin.Comparable");
        $this$classFqNames_u24lambda_u244.put("java.lang.Enum", "kotlin.Enum");
        $this$classFqNames_u24lambda_u244.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        $this$classFqNames_u24lambda_u244.put("java.lang.Iterable", "kotlin.collections.Iterable");
        $this$classFqNames_u24lambda_u244.put("java.util.Iterator", "kotlin.collections.Iterator");
        $this$classFqNames_u24lambda_u244.put("java.util.Collection", "kotlin.collections.Collection");
        $this$classFqNames_u24lambda_u244.put("java.util.List", "kotlin.collections.List");
        $this$classFqNames_u24lambda_u244.put("java.util.Set", "kotlin.collections.Set");
        $this$classFqNames_u24lambda_u244.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        $this$classFqNames_u24lambda_u244.put("java.util.Map", "kotlin.collections.Map");
        $this$classFqNames_u24lambda_u244.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        $this$classFqNames_u24lambda_u244.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        $this$classFqNames_u24lambda_u244.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        $this$classFqNames_u24lambda_u244.putAll((Map)primitiveFqNames);
        $this$classFqNames_u24lambda_u244.putAll((Map)primitiveWrapperFqNames);
        Collection<String> collection = primitiveFqNames.values();
        Intrinsics.checkNotNullExpressionValue(collection, "<get-values>(...)");
        Object $this$associateTo$iv = collection;
        boolean $i$f$associateTo2 = false;
        Iterator index$iv$iv22 = $this$associateTo$iv.iterator();
        while (index$iv$iv22.hasNext()) {
            Object element$iv = index$iv$iv22.next();
            Map map = $this$classFqNames_u24lambda_u244;
            Object kotlinName = (String)element$iv;
            boolean bl4 = false;
            StringBuilder stringBuilder = new StringBuilder().append("kotlin.jvm.internal.");
            Intrinsics.checkNotNull(kotlinName);
            kotlinName = TuplesKt.to(stringBuilder.append(StringsKt.substringAfterLast$default((String)kotlinName, '.', null, 2, null)).append("CompanionObject").toString(), (String)kotlinName + ".Companion");
            map.put(((Pair)kotlinName).getFirst(), ((Pair)kotlinName).getSecond());
        }
        $this$associateTo$iv = FUNCTION_CLASSES.entrySet().iterator();
        while ($this$associateTo$iv.hasNext()) {
            Map.Entry $i$f$associateTo2 = (Map.Entry)$this$associateTo$iv.next();
            Class klass = (Class)$i$f$associateTo2.getKey();
            int arity = ((Number)$i$f$associateTo2.getValue()).intValue();
            $this$classFqNames_u24lambda_u244.put(klass.getName(), "kotlin.Function" + arity);
        }
        classFqNames = $this$mapValues$iv;
        $this$mapValues$iv = classFqNames;
        boolean $i$f$mapValues = false;
        Map $this$mapValuesTo$iv$iv = $this$mapValues$iv;
        destination$iv$iv = new LinkedHashMap(MapsKt.mapCapacity($this$mapValues$iv.size()));
        boolean $i$f$mapValuesTo = false;
        Iterable $this$associateByTo$iv$iv$iv = $this$mapValuesTo$iv$iv.entrySet();
        boolean $i$f$associateByTo = false;
        for (Object element$iv$iv$iv : $this$associateByTo$iv$iv$iv) {
            Map.Entry entry = (Map.Entry)element$iv$iv$iv;
            Object object2 = destination$iv$iv;
            boolean bl5 = false;
            Map.Entry entry2 = (Map.Entry)element$iv$iv$iv;
            Object k = entry.getKey();
            object = object2;
            boolean bl6 = false;
            String string = (String)entry2.getValue();
            String string2 = StringsKt.substringAfterLast$default(string, '.', null, 2, null);
            object.put(k, string2);
        }
        simpleNames = var3_7;
    }

    @Override
    public boolean isFinal() {
        this.error();
        throw new KotlinNothingValueException();
    }

    private final Void error() {
        throw new KotlinReflectionNotSupportedError();
    }

    @SinceKotlin(version="1.1")
    public static /* synthetic */ void getSupertypes$annotations() {
    }

    @SinceKotlin(version="1.1")
    public static /* synthetic */ void isInner$annotations() {
    }

    @Override
    @NotNull
    public Collection<KClass<?>> getNestedClasses() {
        this.error();
        throw new KotlinNothingValueException();
    }

    @Override
    @NotNull
    public List<Annotation> getAnnotations() {
        this.error();
        throw new KotlinNothingValueException();
    }

    @SinceKotlin(version="1.1")
    public static /* synthetic */ void isAbstract$annotations() {
    }

    @Override
    @SinceKotlin(version="1.1")
    public boolean isInstance(@Nullable Object value) {
        return Companion.isInstance(value, this.getJClass());
    }

    @Override
    @NotNull
    public Collection<KFunction<Object>> getConstructors() {
        this.error();
        throw new KotlinNothingValueException();
    }

    @SinceKotlin(version="1.4")
    public static /* synthetic */ void isFun$annotations() {
    }

    @Override
    public boolean isInner() {
        this.error();
        throw new KotlinNothingValueException();
    }

    @Override
    @Nullable
    public String getSimpleName() {
        return Companion.getClassSimpleName(this.getJClass());
    }

    public ClassReference(@NotNull Class<?> jClass) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        this.jClass = jClass;
    }

    @Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004\u00a2\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\t\u001a\u0004\u0018\u00010\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004\u00a2\u0006\u0004\b\t\u0010\bJ#\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u00012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004\u00a2\u0006\u0004\b\f\u0010\rR,\u0010\u0011\u001a\u001a\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000f0\u0004\u0012\u0004\u0012\u00020\u00100\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0011\u0010\u0012R0\u0010\u0015\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0013j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006`\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0015\u0010\u0016R0\u0010\u0017\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0013j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006`\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0017\u0010\u0016R0\u0010\u0018\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0013j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006`\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0018\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0019\u0010\u0012\u00a8\u0006\u001a"}, d2={"Lkotlin/jvm/internal/ClassReference$Companion;", "", "<init>", "()V", "Ljava/lang/Class;", "jClass", "", "getClassQualifiedName", "(Ljava/lang/Class;)Ljava/lang/String;", "getClassSimpleName", "value", "", "isInstance", "(Ljava/lang/Object;Ljava/lang/Class;)Z", "", "Lkotlin/Function;", "", "FUNCTION_CLASSES", "Ljava/util/Map;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "classFqNames", "Ljava/util/HashMap;", "primitiveFqNames", "primitiveWrapperFqNames", "simpleNames", "kotlin-stdlib"})
    public static final class Companion {
        /*
         * WARNING - void declaration
         */
        @Nullable
        public final String getClassSimpleName(@NotNull Class<?> jClass) {
            Object object;
            block11: {
                block12: {
                    String name;
                    block13: {
                        Method method;
                        block10: {
                            Intrinsics.checkNotNullParameter(jClass, "jClass");
                            if (!jClass.isAnonymousClass()) break block10;
                            object = null;
                            break block11;
                        }
                        if (!jClass.isLocalClass()) break block12;
                        name = jClass.getSimpleName();
                        object = jClass.getEnclosingMethod();
                        if (object == null) break block13;
                        Method method2 = method = object;
                        boolean bl = false;
                        Intrinsics.checkNotNull(name);
                        String string = StringsKt.substringAfter$default(name, method2.getName() + '$', null, 2, null);
                        object = string;
                        if (string != null) break block11;
                    }
                    Constructor<?> constructor = jClass.getEnclosingConstructor();
                    if (constructor != null) {
                        Constructor<?> constructor2;
                        Constructor<?> constructor3 = constructor2 = constructor;
                        boolean bl = false;
                        Intrinsics.checkNotNull(name);
                        object = StringsKt.substringAfter$default(name, constructor3.getName() + '$', null, 2, null);
                    } else {
                        Intrinsics.checkNotNull(name);
                        object = StringsKt.substringAfter$default(name, '$', null, 2, null);
                    }
                    break block11;
                }
                if (jClass.isArray()) {
                    String string;
                    Class<?> componentType = jClass.getComponentType();
                    if (componentType.isPrimitive()) {
                        String string2 = (String)simpleNames.get(componentType.getName());
                        string = string2 != null ? string2 + "Array" : null;
                    } else {
                        string = null;
                    }
                    object = string;
                    if (string == null) {
                        object = "Array";
                    }
                } else {
                    void var1_1;
                    object = (String)simpleNames.get(var1_1.getName());
                    if (object == null) {
                        object = var1_1.getSimpleName();
                    }
                }
            }
            return object;
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }

        /*
         * WARNING - void declaration
         */
        @Nullable
        public final String getClassQualifiedName(@NotNull Class<?> jClass) {
            String string;
            Intrinsics.checkNotNullParameter(jClass, "jClass");
            if (jClass.isAnonymousClass()) {
                string = null;
            } else if (jClass.isLocalClass()) {
                string = null;
            } else if (jClass.isArray()) {
                String string2;
                Class<?> componentType = jClass.getComponentType();
                if (componentType.isPrimitive()) {
                    String string3 = (String)classFqNames.get(componentType.getName());
                    string2 = string3 != null ? string3 + "Array" : null;
                } else {
                    string2 = null;
                }
                string = string2;
                if (string2 == null) {
                    string = "kotlin.Array";
                }
            } else {
                string = (String)classFqNames.get(jClass.getName());
                if (string == null) {
                    void var1_1;
                    string = var1_1.getCanonicalName();
                }
            }
            return string;
        }

        /*
         * WARNING - void declaration
         */
        public final boolean isInstance(@Nullable Object value, @NotNull Class<?> jClass) {
            void var1_1;
            void var2_2;
            Intrinsics.checkNotNullParameter(jClass, "jClass");
            Map map = FUNCTION_CLASSES;
            Intrinsics.checkNotNull(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
            Integer n = (Integer)map.get(jClass);
            if (n != null) {
                Integer n2 = n;
                int arity = ((Number)n2).intValue();
                boolean bl = false;
                return TypeIntrinsics.isFunctionOfArity(value, arity);
            }
            n = jClass.isPrimitive() ? JvmClassMappingKt.getJavaObjectType(JvmClassMappingKt.getKotlinClass(jClass)) : var2_2;
            return ((Class)((Object)n)).isInstance(var1_1);
        }
    }
}

