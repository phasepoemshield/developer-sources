/*
 * Decompiled with CFR 0.152.
 */
package kotlin.jvm.internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KVariance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001(B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u00a2\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0096\u0002\u00a2\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0016\u001a\u00020\u00152\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\t\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u0019R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128VX\u0096\u0004\u00a2\u0006\f\u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010'\u00a8\u0006)"}, d2={"Lkotlin/jvm/internal/TypeParameterReference;", "Lkotlin/reflect/KTypeParameter;", "", "container", "", "name", "Lkotlin/reflect/KVariance;", "variance", "", "isReified", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Lkotlin/reflect/KVariance;Z)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "Lkotlin/reflect/KType;", "upperBounds", "", "setUpperBounds", "(Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "bounds", "Ljava/util/List;", "Ljava/lang/Object;", "Z", "()Z", "Ljava/lang/String;", "getName", "getUpperBounds", "()Ljava/util/List;", "getUpperBounds$annotations", "()V", "Lkotlin/reflect/KVariance;", "getVariance", "()Lkotlin/reflect/KVariance;", "Companion", "kotlin-stdlib"})
@SinceKotlin(version="1.4")
public final class TypeParameterReference
implements KTypeParameter {
    private final boolean isReified;
    @Nullable
    private final Object container;
    @Nullable
    private volatile List<? extends KType> bounds;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private final String name;
    @NotNull
    private final KVariance variance;

    @Override
    @NotNull
    public List<KType> getUpperBounds() {
        List<KType> list = this.bounds;
        if (list == null) {
            List<KType> list2;
            List<KType> it = list2 = CollectionsKt.listOf(Reflection.nullableTypeOf(Object.class));
            boolean bl = false;
            this.bounds = it;
            list = list2;
        }
        return list;
    }

    public int hashCode() {
        Object object = this.container;
        return (object != null ? object.hashCode() : 0) * 31 + this.getName().hashCode();
    }

    public final void setUpperBounds(@NotNull List<? extends KType> upperBounds) {
        Intrinsics.checkNotNullParameter(upperBounds, "upperBounds");
        if (this.bounds != null) {
            throw new IllegalStateException(("Upper bounds of type parameter '" + this + "' have already been initialized.").toString());
        }
        this.bounds = upperBounds;
    }

    public boolean equals(@Nullable Object other) {
        return other instanceof TypeParameterReference && Intrinsics.areEqual(this.container, ((TypeParameterReference)other).container) && Intrinsics.areEqual(this.getName(), ((TypeParameterReference)other).getName());
    }

    public static /* synthetic */ void getUpperBounds$annotations() {
    }

    @Override
    public boolean isReified() {
        return this.isReified;
    }

    public TypeParameterReference(@Nullable Object container, @NotNull String name, @NotNull KVariance variance, boolean isReified) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter((Object)variance, "variance");
        this.container = container;
        this.name = name;
        this.variance = variance;
        this.isReified = isReified;
    }

    @NotNull
    public String toString() {
        return Companion.toString(this);
    }

    @Override
    @NotNull
    public KVariance getVariance() {
        return this.variance;
    }

    @Override
    @NotNull
    public String getName() {
        return this.name;
    }

    @Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2={"Lkotlin/jvm/internal/TypeParameterReference$Companion;", "", "<init>", "()V", "Lkotlin/reflect/KTypeParameter;", "typeParameter", "", "toString", "(Lkotlin/reflect/KTypeParameter;)Ljava/lang/String;", "kotlin-stdlib"})
    public static final class Companion {
        @NotNull
        public final String toString(@NotNull KTypeParameter typeParameter) {
            StringBuilder stringBuilder;
            Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
            StringBuilder $this$toString_u24lambda_u240 = stringBuilder = new StringBuilder();
            boolean bl = false;
            switch (WhenMappings.$EnumSwitchMapping$0[typeParameter.getVariance().ordinal()]) {
                case 1: {
                    break;
                }
                case 2: {
                    $this$toString_u24lambda_u240.append("in ");
                    break;
                }
                case 3: {
                    $this$toString_u24lambda_u240.append("out ");
                }
            }
            $this$toString_u24lambda_u240.append(typeParameter.getName());
            String string = stringBuilder.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }

        private Companion() {
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
    }
}

