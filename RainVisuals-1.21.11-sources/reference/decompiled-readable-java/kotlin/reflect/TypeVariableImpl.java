/*
 * Decompiled with CFR 0.152.
 */
package kotlin.reflect;

import java.lang.annotation.Annotation;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.TypeImpl;
import kotlin.reflect.TypesJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002\u00a2\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0011\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u000e*\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u0013\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0013H\u0016\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\r0\u0013\u00a2\u0006\u0004\b\u0019\u0010\u0015J\u000f\u0010\u001a\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016\u00a2\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u001cH\u0016\u00a2\u0006\u0004\b\u001f\u0010\u001eJ\u000f\u0010!\u001a\u00020 H\u0016\u00a2\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u001cH\u0016\u00a2\u0006\u0004\b#\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0005\u0010$\u00a8\u0006%"}, d2={"Lkotlin/reflect/TypeVariableImpl;", "Ljava/lang/reflect/TypeVariable;", "Ljava/lang/reflect/GenericDeclaration;", "Lkotlin/reflect/TypeImpl;", "Lkotlin/reflect/KTypeParameter;", "typeParameter", "<init>", "(Lkotlin/reflect/KTypeParameter;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "T", "Ljava/lang/Class;", "annotationClass", "getAnnotation", "(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;", "", "getAnnotations", "()[Ljava/lang/annotation/Annotation;", "Ljava/lang/reflect/Type;", "getBounds", "()[Ljava/lang/reflect/Type;", "getDeclaredAnnotations", "getGenericDeclaration", "()Ljava/lang/reflect/GenericDeclaration;", "", "getName", "()Ljava/lang/String;", "getTypeName", "", "hashCode", "()I", "toString", "Lkotlin/reflect/KTypeParameter;", "kotlin-stdlib"})
@ExperimentalStdlibApi
final class TypeVariableImpl
implements TypeVariable<GenericDeclaration>,
TypeImpl {
    @NotNull
    private final KTypeParameter typeParameter;

    @NotNull
    public String toString() {
        return this.getTypeName();
    }

    @Override
    @NotNull
    public String getTypeName() {
        return this.getName();
    }

    @Override
    @NotNull
    public String getName() {
        return this.typeParameter.getName();
    }

    @Override
    @NotNull
    public final Annotation[] getAnnotations() {
        boolean $i$f$emptyArray = false;
        return new Annotation[0];
    }

    @Override
    @NotNull
    public GenericDeclaration getGenericDeclaration() {
        String string = "getGenericDeclaration() is not yet supported for type variables created from KType: " + this.typeParameter;
        throw new NotImplementedError("An operation is not implemented: " + string);
    }

    @Override
    @NotNull
    public final Annotation[] getDeclaredAnnotations() {
        boolean $i$f$emptyArray = false;
        return new Annotation[0];
    }

    public boolean equals(@Nullable Object other) {
        return other instanceof TypeVariable && Intrinsics.areEqual(this.getName(), ((TypeVariable)other).getName()) && Intrinsics.areEqual(this.getGenericDeclaration(), ((TypeVariable)other).getGenericDeclaration());
    }

    public int hashCode() {
        return this.getName().hashCode() ^ this.getGenericDeclaration().hashCode();
    }

    public TypeVariableImpl(@NotNull KTypeParameter typeParameter) {
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        this.typeParameter = typeParameter;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    @NotNull
    public Type[] getBounds() {
        void var4_4;
        void $this$mapTo$iv$iv;
        Iterable $this$map$iv = this.typeParameter.getUpperBounds();
        boolean $i$f$map = false;
        Iterable iterable = $this$map$iv;
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        boolean $i$f$mapTo = false;
        for (Object item$iv$iv : $this$mapTo$iv$iv) {
            KType it = (KType)item$iv$iv;
            Collection collection = destination$iv$iv;
            boolean bl = false;
            collection.add(TypesJVMKt.access$computeJavaType(it, true));
        }
        Collection $this$toTypedArray$iv = (List)var4_4;
        boolean $i$f$toTypedArray = false;
        Collection thisCollection$iv = $this$toTypedArray$iv;
        return thisCollection$iv.toArray(new Type[0]);
    }

    @Override
    @Nullable
    public final <T extends Annotation> T getAnnotation(@NotNull Class<T> annotationClass) {
        Intrinsics.checkNotNullParameter(annotationClass, "annotationClass");
        return null;
    }
}

