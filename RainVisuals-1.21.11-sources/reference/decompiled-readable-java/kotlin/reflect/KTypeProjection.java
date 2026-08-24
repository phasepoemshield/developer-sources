/*
 * Decompiled with CFR 0.152.
 */
package kotlin.reflect;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KType;
import kotlin.reflect.KVariance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001\u00a2\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u00d6\u0001\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016\u00a2\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\t\u00a8\u0006\u001d"}, d2={"Lkotlin/reflect/KTypeProjection;", "", "Lkotlin/reflect/KVariance;", "variance", "Lkotlin/reflect/KType;", "type", "<init>", "(Lkotlin/reflect/KVariance;Lkotlin/reflect/KType;)V", "component1", "()Lkotlin/reflect/KVariance;", "component2", "()Lkotlin/reflect/KType;", "copy", "(Lkotlin/reflect/KVariance;Lkotlin/reflect/KType;)Lkotlin/reflect/KTypeProjection;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lkotlin/reflect/KType;", "getType", "Lkotlin/reflect/KVariance;", "getVariance", "Companion", "kotlin-stdlib"})
@SinceKotlin(version="1.1")
public final class KTypeProjection {
    @Nullable
    private final KVariance variance;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @Nullable
    private final KType type;
    @NotNull
    @JvmField
    public static final KTypeProjection star = new KTypeProjection(null, null);

    @Nullable
    public final KType getType() {
        return this.type;
    }

    @Nullable
    public final KType component2() {
        return this.type;
    }

    public KTypeProjection(@Nullable KVariance variance, @Nullable KType type) {
        this.variance = variance;
        this.type = type;
        boolean bl = this.variance == null == (this.type == null);
        if (!bl) {
            boolean bl2 = false;
            String string = this.variance == null ? "Star projection must have no type specified." : "The projection variance " + (Object)((Object)this.variance) + " requires type to be specified.";
            throw new IllegalArgumentException(string.toString());
        }
    }

    @Nullable
    public final KVariance component1() {
        return this.variance;
    }

    @JvmStatic
    @NotNull
    public static final KTypeProjection contravariant(@NotNull KType type) {
        return Companion.contravariant(type);
    }

    @NotNull
    public final KTypeProjection copy(@Nullable KVariance variance, @Nullable KType type) {
        return new KTypeProjection(variance, type);
    }

    @JvmStatic
    @NotNull
    public static final KTypeProjection covariant(@NotNull KType type) {
        return Companion.covariant(type);
    }

    public int hashCode() {
        int result;
        int n = this.variance == null ? 0 : (result = this.variance.hashCode());
        int n2 = result * 31 + (this.type == null ? 0 : this.type.hashCode());
        return n2;
    }

    @JvmStatic
    @NotNull
    public static final KTypeProjection invariant(@NotNull KType type) {
        return Companion.invariant(type);
    }

    public static /* synthetic */ KTypeProjection copy$default(KTypeProjection kTypeProjection, KVariance kVariance, KType kType, int n, Object object) {
        if ((n & 1) != 0) {
            kVariance = kTypeProjection.variance;
        }
        if ((n & 2) != 0) {
            kType = kTypeProjection.type;
        }
        return kTypeProjection.copy(kVariance, kType);
    }

    @NotNull
    public String toString() {
        String string;
        KVariance kVariance = this.variance;
        switch (kVariance == null ? -1 : WhenMappings.$EnumSwitchMapping$0[kVariance.ordinal()]) {
            case -1: {
                string = "*";
                break;
            }
            case 1: {
                string = String.valueOf(this.type);
                break;
            }
            case 2: {
                string = "in " + this.type;
                break;
            }
            case 3: {
                string = "out " + this.type;
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        return string;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KTypeProjection)) {
            return false;
        }
        KTypeProjection kTypeProjection = (KTypeProjection)other;
        if (this.variance != kTypeProjection.variance) {
            return false;
        }
        if (!Intrinsics.areEqual(this.type, kTypeProjection.type)) {
            return false;
        }
        return true;
    }

    @Nullable
    public final KVariance getVariance() {
        return this.variance;
    }

    @Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\b\n\u0010\bR\u0011\u0010\r\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\u00020\u00068\u0000X\u0081\u0004\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\u0010\u0010\u0003\u00a8\u0006\u0011"}, d2={"Lkotlin/reflect/KTypeProjection$Companion;", "", "<init>", "()V", "Lkotlin/reflect/KType;", "type", "Lkotlin/reflect/KTypeProjection;", "contravariant", "(Lkotlin/reflect/KType;)Lkotlin/reflect/KTypeProjection;", "covariant", "invariant", "getSTAR", "()Lkotlin/reflect/KTypeProjection;", "STAR", "star", "Lkotlin/reflect/KTypeProjection;", "getStar$annotations", "kotlin-stdlib"})
    public static final class Companion {
        @NotNull
        public final KTypeProjection getSTAR() {
            return star;
        }

        @JvmStatic
        @NotNull
        public final KTypeProjection invariant(@NotNull KType type) {
            Intrinsics.checkNotNullParameter(type, "type");
            return new KTypeProjection(KVariance.INVARIANT, type);
        }

        @JvmStatic
        @NotNull
        public final KTypeProjection contravariant(@NotNull KType type) {
            Intrinsics.checkNotNullParameter(type, "type");
            return new KTypeProjection(KVariance.IN, type);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final KTypeProjection covariant(@NotNull KType type) {
            Intrinsics.checkNotNullParameter(type, "type");
            return new KTypeProjection(KVariance.OUT, type);
        }

        @PublishedApi
        public static /* synthetic */ void getStar$annotations() {
        }
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

