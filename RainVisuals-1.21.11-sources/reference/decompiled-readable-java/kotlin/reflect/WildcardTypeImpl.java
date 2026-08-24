/*
 * Decompiled with CFR 0.152.
 */
package kotlin.reflect;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.TypeImpl;
import kotlin.reflect.TypesJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0003\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0001\u0019B\u001b\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\rH\u0016\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\rH\u0016\u00a2\u0006\u0004\b\u0013\u0010\u000fJ\u000f\u0010\u0015\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\b\u0017\u0010\u0012R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0004\u0010\u0018\u00a8\u0006\u001a"}, d2={"Lkotlin/reflect/WildcardTypeImpl;", "Ljava/lang/reflect/WildcardType;", "Lkotlin/reflect/TypeImpl;", "Ljava/lang/reflect/Type;", "upperBound", "lowerBound", "<init>", "(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "getLowerBounds", "()[Ljava/lang/reflect/Type;", "", "getTypeName", "()Ljava/lang/String;", "getUpperBounds", "", "hashCode", "()I", "toString", "Ljava/lang/reflect/Type;", "Companion", "kotlin-stdlib"})
@ExperimentalStdlibApi
final class WildcardTypeImpl
implements TypeImpl,
WildcardType {
    @Nullable
    private final Type lowerBound;
    @NotNull
    private static final WildcardTypeImpl STAR;
    @NotNull
    public static final Companion Companion;
    @Nullable
    private final Type upperBound;

    public boolean equals(@Nullable Object other) {
        return other instanceof WildcardType && Arrays.equals(this.getUpperBounds(), ((WildcardType)other).getUpperBounds()) && Arrays.equals(this.getLowerBounds(), ((WildcardType)other).getLowerBounds());
    }

    @NotNull
    public String toString() {
        return this.getTypeName();
    }

    public int hashCode() {
        return Arrays.hashCode(this.getUpperBounds()) ^ Arrays.hashCode(this.getLowerBounds());
    }

    public WildcardTypeImpl(@Nullable Type upperBound, @Nullable Type lowerBound) {
        this.upperBound = upperBound;
        this.lowerBound = lowerBound;
    }

    @Override
    @NotNull
    public Type[] getUpperBounds() {
        Type[] typeArray = new Type[1];
        Type type = this.upperBound;
        if (type == null) {
            type = (Type)((Object)Object.class);
        }
        typeArray[0] = type;
        return typeArray;
    }

    static {
        Companion = new Companion(null);
        STAR = new WildcardTypeImpl(null, null);
    }

    @Override
    @NotNull
    public String getTypeName() {
        return this.lowerBound != null ? "? super " + TypesJVMKt.access$typeToString(this.lowerBound) : (this.upperBound != null && !Intrinsics.areEqual(this.upperBound, Object.class) ? "? extends " + TypesJVMKt.access$typeToString(this.upperBound) : "?");
    }

    @Override
    @NotNull
    public Type[] getLowerBounds() {
        Type[] typeArray;
        if (this.lowerBound == null) {
            boolean $i$f$emptyArray = false;
            typeArray = new Type[]{};
        } else {
            Type[] typeArray2 = new Type[1];
            typeArray2[0] = this.lowerBound;
            typeArray = typeArray2;
        }
        return typeArray;
    }

    @Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2={"Lkotlin/reflect/WildcardTypeImpl$Companion;", "", "<init>", "()V", "Lkotlin/reflect/WildcardTypeImpl;", "STAR", "Lkotlin/reflect/WildcardTypeImpl;", "getSTAR", "()Lkotlin/reflect/WildcardTypeImpl;", "kotlin-stdlib"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final WildcardTypeImpl getSTAR() {
            return STAR;
        }
    }
}

