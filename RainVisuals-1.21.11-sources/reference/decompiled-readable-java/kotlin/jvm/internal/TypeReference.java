/*
 * Decompiled with CFR 0.152.
 */
package kotlin.jvm.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.SinceKotlin;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.KVariance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u001b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 22\u00020\u0001:\u00012B'\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0004\b\t\u0010\nB1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\r\u001a\u00020\f\u00a2\u0006\u0004\b\t\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\fH\u0016\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u0005H\u0002\u00a2\u0006\u0004\b\u0011\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010$R \u0010\r\u001a\u00020\f8\u0000X\u0081\u0004\u00a2\u0006\u0012\n\u0004\b\r\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0018R\u0014\u0010\b\u001a\u00020\u00078VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010)R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00018\u0000X\u0081\u0004\u00a2\u0006\u0012\n\u0004\b\u000b\u0010*\u0012\u0004\b-\u0010(\u001a\u0004\b+\u0010,R\u001c\u00101\u001a\u00020\u0010*\u0006\u0012\u0002\b\u00030.8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b/\u00100\u00a8\u00063"}, d2={"Lkotlin/jvm/internal/TypeReference;", "Lkotlin/reflect/KType;", "Lkotlin/reflect/KClassifier;", "classifier", "", "Lkotlin/reflect/KTypeProjection;", "arguments", "", "isMarkedNullable", "<init>", "(Lkotlin/reflect/KClassifier;Ljava/util/List;Z)V", "platformTypeUpperBound", "", "flags", "(Lkotlin/reflect/KClassifier;Ljava/util/List;Lkotlin/reflect/KType;I)V", "convertPrimitiveToWrapper", "", "asString", "(Z)Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "(Lkotlin/reflect/KTypeProjection;)Ljava/lang/String;", "", "getAnnotations", "()Ljava/util/List;", "annotations", "Ljava/util/List;", "getArguments", "Lkotlin/reflect/KClassifier;", "getClassifier", "()Lkotlin/reflect/KClassifier;", "I", "getFlags$kotlin_stdlib", "getFlags$kotlin_stdlib$annotations", "()V", "()Z", "Lkotlin/reflect/KType;", "getPlatformTypeUpperBound$kotlin_stdlib", "()Lkotlin/reflect/KType;", "getPlatformTypeUpperBound$kotlin_stdlib$annotations", "Ljava/lang/Class;", "getArrayClassName", "(Ljava/lang/Class;)Ljava/lang/String;", "arrayClassName", "Companion", "kotlin-stdlib"})
@SinceKotlin(version="1.4")
public final class TypeReference
implements KType {
    private final int flags;
    @NotNull
    private final List<KTypeProjection> arguments;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int IS_MARKED_NULLABLE = 1;
    public static final int IS_MUTABLE_COLLECTION_TYPE = 2;
    @NotNull
    private final KClassifier classifier;
    public static final int IS_NOTHING_TYPE = 4;
    @Nullable
    private final KType platformTypeUpperBound;

    private final String asString(KTypeProjection $this$asString) {
        Object object;
        if ($this$asString.getVariance() == null) {
            return "*";
        }
        KType kType = $this$asString.getType();
        Object object2 = kType instanceof TypeReference ? (TypeReference)kType : null;
        if (object2 == null || (object2 = ((TypeReference)object2).asString(true)) == null) {
            object2 = String.valueOf($this$asString.getType());
        }
        Object typeString = object2;
        switch (WhenMappings.$EnumSwitchMapping$0[$this$asString.getVariance().ordinal()]) {
            case 1: {
                object = typeString;
                break;
            }
            case 2: {
                object = "in " + (String)typeString;
                break;
            }
            case 3: {
                object = "out " + (String)typeString;
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        return object;
    }

    @SinceKotlin(version="1.6")
    public static /* synthetic */ void getFlags$kotlin_stdlib$annotations() {
    }

    @Override
    public boolean isMarkedNullable() {
        return (this.flags & 1) != 0;
    }

    @NotNull
    public String toString() {
        return this.asString(false) + " (Kotlin reflection is not available)";
    }

    private final String getArrayClassName(Class<?> $this$arrayClassName) {
        Class<?> clazz = $this$arrayClassName;
        return Intrinsics.areEqual(clazz, boolean[].class) ? "kotlin.BooleanArray" : (Intrinsics.areEqual(clazz, char[].class) ? "kotlin.CharArray" : (Intrinsics.areEqual(clazz, byte[].class) ? "kotlin.ByteArray" : (Intrinsics.areEqual(clazz, short[].class) ? "kotlin.ShortArray" : (Intrinsics.areEqual(clazz, int[].class) ? "kotlin.IntArray" : (Intrinsics.areEqual(clazz, float[].class) ? "kotlin.FloatArray" : (Intrinsics.areEqual(clazz, long[].class) ? "kotlin.LongArray" : (Intrinsics.areEqual(clazz, double[].class) ? "kotlin.DoubleArray" : "kotlin.Array")))))));
    }

    @SinceKotlin(version="1.6")
    public static /* synthetic */ void getPlatformTypeUpperBound$kotlin_stdlib$annotations() {
    }

    /*
     * Unable to fully structure code
     */
    private final String asString(boolean convertPrimitiveToWrapper) {
        block3: {
            block5: {
                block4: {
                    block2: {
                        var4_2 = this.getClassifier();
                        v0 = var4_2 instanceof KClass ? (KClass)var4_2 : null;
                        javaClass = v0 != null ? JvmClassMappingKt.getJavaClass(v0) : null;
                        if (javaClass != null) break block2;
                        v1 = this.getClassifier().toString();
                        break block3;
                    }
                    if ((this.flags & 4) == 0) break block4;
                    v1 = "kotlin.Nothing";
                    break block3;
                }
                if (!javaClass.isArray()) break block5;
                v1 = this.getArrayClassName(javaClass);
                break block3;
            }
            if (!convertPrimitiveToWrapper) ** GOTO lbl-1000
            if (javaClass.isPrimitive()) {
                v2 = this.getClassifier();
                Intrinsics.checkNotNull(v2, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
                v1 = JvmClassMappingKt.getJavaObjectType((KClass)v2).getName();
            } else lbl-1000:
            // 2 sources

            {
                v1 = klass = javaClass.getName();
            }
        }
        args = this.getArguments().isEmpty() ? "" : CollectionsKt.joinToString$default(this.getArguments(), ", ", "<", ">", 0, null, new Function1<KTypeProjection, CharSequence>(this){
            final /* synthetic */ TypeReference this$0;
            {
                this.this$0 = $receiver;
                super(1);
            }

            @NotNull
            public final CharSequence invoke(@NotNull KTypeProjection it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return TypeReference.access$asString(this.this$0, it);
            }
        }, 24, null);
        nullable = this.isMarkedNullable() != false ? "?" : "";
        result = klass + args + nullable;
        upper = this.platformTypeUpperBound;
        return upper instanceof TypeReference ? (Intrinsics.areEqual(renderedUpper = ((TypeReference)upper).asString(true), result) ? result : (Intrinsics.areEqual(renderedUpper, result + '?') ? result + '!' : '(' + result + ".." + (String)var8_8 + ')')) : var6_6;
    }

    @Override
    @NotNull
    public List<KTypeProjection> getArguments() {
        return this.arguments;
    }

    public int hashCode() {
        return (this.getClassifier().hashCode() * 31 + ((Object)this.getArguments()).hashCode()) * 31 + Integer.hashCode(this.flags);
    }

    @Override
    @NotNull
    public List<Annotation> getAnnotations() {
        return CollectionsKt.emptyList();
    }

    @Nullable
    public final KType getPlatformTypeUpperBound$kotlin_stdlib() {
        return this.platformTypeUpperBound;
    }

    public static final /* synthetic */ String access$asString(TypeReference $this, KTypeProjection $receiver) {
        return $this.asString($receiver);
    }

    public TypeReference(@NotNull KClassifier classifier, @NotNull List<KTypeProjection> arguments, boolean isMarkedNullable) {
        Intrinsics.checkNotNullParameter(classifier, "classifier");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        this(classifier, arguments, null, isMarkedNullable ? 1 : 0);
    }

    public final int getFlags$kotlin_stdlib() {
        return this.flags;
    }

    @Override
    @NotNull
    public KClassifier getClassifier() {
        return this.classifier;
    }

    @SinceKotlin(version="1.6")
    public TypeReference(@NotNull KClassifier classifier, @NotNull List<KTypeProjection> arguments, @Nullable KType platformTypeUpperBound, int flags) {
        Intrinsics.checkNotNullParameter(classifier, "classifier");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        this.classifier = classifier;
        this.arguments = arguments;
        this.platformTypeUpperBound = platformTypeUpperBound;
        this.flags = flags;
    }

    public boolean equals(@Nullable Object other) {
        return other instanceof TypeReference && Intrinsics.areEqual(this.getClassifier(), ((TypeReference)other).getClassifier()) && Intrinsics.areEqual(this.getArguments(), ((TypeReference)other).getArguments()) && Intrinsics.areEqual(this.platformTypeUpperBound, ((TypeReference)other).platformTypeUpperBound) && this.flags == ((TypeReference)other).flags;
    }

    @Metadata(mv={1, 9, 0}, k=3, xi=48)
    public final class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] nArray = new int[KVariance.values().length];
            try {
                nArray[KVariance.INVARIANT.ordinal()] = 1;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                nArray[KVariance.IN.ordinal()] = 2;
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

    @Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\b\b\u0010\u0006\u00a8\u0006\t"}, d2={"Lkotlin/jvm/internal/TypeReference$Companion;", "", "<init>", "()V", "", "IS_MARKED_NULLABLE", "I", "IS_MUTABLE_COLLECTION_TYPE", "IS_NOTHING_TYPE", "kotlin-stdlib"})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }
    }
}

