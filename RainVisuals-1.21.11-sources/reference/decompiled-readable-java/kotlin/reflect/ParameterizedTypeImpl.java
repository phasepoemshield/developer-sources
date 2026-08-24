/*
 * Decompiled with CFR 0.152.
 */
package kotlin.reflect;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.ParameterizedTypeImpl;
import kotlin.reflect.TypeImpl;
import kotlin.reflect.TypesJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B+\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u00a2\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010H\u0016\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0005H\u0016\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016\u00a2\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0016H\u0016\u00a2\u0006\u0004\b\u001c\u0010\u0018R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0006\u0010\u001dR\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0004\u0010\u001eR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\b\u0010\u001f\u00a8\u0006 "}, d2={"Lkotlin/reflect/ParameterizedTypeImpl;", "Ljava/lang/reflect/ParameterizedType;", "Lkotlin/reflect/TypeImpl;", "Ljava/lang/Class;", "rawType", "Ljava/lang/reflect/Type;", "ownerType", "", "typeArguments", "<init>", "(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/List;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "getActualTypeArguments", "()[Ljava/lang/reflect/Type;", "getOwnerType", "()Ljava/lang/reflect/Type;", "getRawType", "", "getTypeName", "()Ljava/lang/String;", "", "hashCode", "()I", "toString", "Ljava/lang/reflect/Type;", "Ljava/lang/Class;", "[Ljava/lang/reflect/Type;", "kotlin-stdlib"})
@ExperimentalStdlibApi
final class ParameterizedTypeImpl
implements ParameterizedType,
TypeImpl {
    @NotNull
    private final Type[] typeArguments;
    @NotNull
    private final Class<?> rawType;
    @Nullable
    private final Type ownerType;

    public ParameterizedTypeImpl(@NotNull Class<?> rawType, @Nullable Type ownerType, @NotNull List<? extends Type> typeArguments) {
        Intrinsics.checkNotNullParameter(rawType, "rawType");
        Intrinsics.checkNotNullParameter(typeArguments, "typeArguments");
        this.rawType = rawType;
        this.ownerType = ownerType;
        Collection $this$toTypedArray$iv = typeArguments;
        boolean $i$f$toTypedArray = false;
        Collection thisCollection$iv = $this$toTypedArray$iv;
        this.typeArguments = thisCollection$iv.toArray(new Type[0]);
    }

    @NotNull
    public String toString() {
        return this.getTypeName();
    }

    @Override
    @NotNull
    public String getTypeName() {
        StringBuilder stringBuilder;
        StringBuilder $this$getTypeName_u24lambda_u240 = stringBuilder = new StringBuilder();
        boolean bl = false;
        if (this.ownerType != null) {
            $this$getTypeName_u24lambda_u240.append(TypesJVMKt.access$typeToString(this.ownerType));
            $this$getTypeName_u24lambda_u240.append("$");
            $this$getTypeName_u24lambda_u240.append(this.rawType.getSimpleName());
        } else {
            $this$getTypeName_u24lambda_u240.append(TypesJVMKt.access$typeToString(this.rawType));
        }
        boolean bl2 = this.typeArguments.length == 0;
        boolean bl3 = !bl2;
        if (bl3) {
            ArraysKt.joinTo$default(this.typeArguments, (Appendable)$this$getTypeName_u24lambda_u240, null, (CharSequence)"<", (CharSequence)">", 0, null, (Function1)getTypeName.1.1.INSTANCE, 50, null);
        }
        String string = stringBuilder.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public boolean equals(@Nullable Object other) {
        return other instanceof ParameterizedType && Intrinsics.areEqual(this.rawType, ((ParameterizedType)other).getRawType()) && Intrinsics.areEqual(this.ownerType, ((ParameterizedType)other).getOwnerType()) && Arrays.equals(this.getActualTypeArguments(), ((ParameterizedType)other).getActualTypeArguments());
    }

    @Override
    @Nullable
    public Type getOwnerType() {
        return this.ownerType;
    }

    @Override
    @NotNull
    public Type getRawType() {
        return this.rawType;
    }

    @Override
    @NotNull
    public Type[] getActualTypeArguments() {
        return this.typeArguments;
    }

    public int hashCode() {
        Type type = this.ownerType;
        return this.rawType.hashCode() ^ (type != null ? type.hashCode() : 0) ^ Arrays.hashCode(this.getActualTypeArguments());
    }
}

