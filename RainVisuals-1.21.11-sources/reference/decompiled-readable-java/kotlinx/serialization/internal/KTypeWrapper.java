/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0002\u00a2\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u00108VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0013R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00188VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00078VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0002\u0010\u001e\u00a8\u0006\u001f"}, d2={"Lkotlinx/serialization/internal/KTypeWrapper;", "Lkotlin/reflect/KType;", "origin", "<init>", "(Lkotlin/reflect/KType;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "", "", "getAnnotations", "()Ljava/util/List;", "annotations", "Lkotlin/reflect/KTypeProjection;", "getArguments", "arguments", "Lkotlin/reflect/KClassifier;", "getClassifier", "()Lkotlin/reflect/KClassifier;", "classifier", "isMarkedNullable", "()Z", "Lkotlin/reflect/KType;", "kotlinx-serialization-core"})
final class KTypeWrapper
implements KType {
    @NotNull
    private final KType origin;

    @NotNull
    public String toString() {
        return "KTypeWrapper: " + this.origin;
    }

    @Override
    @NotNull
    public List<KTypeProjection> getArguments() {
        return this.origin.getArguments();
    }

    @Override
    @Nullable
    public KClassifier getClassifier() {
        return this.origin.getClassifier();
    }

    /*
     * WARNING - void declaration
     */
    public boolean equals(@Nullable Object other) {
        block5: {
            void var3_3;
            KClassifier kClassifier;
            block7: {
                block6: {
                    if (other == null) {
                        return false;
                    }
                    KTypeWrapper kTypeWrapper = other instanceof KTypeWrapper ? (KTypeWrapper)other : null;
                    if (!Intrinsics.areEqual(this.origin, kTypeWrapper != null ? kTypeWrapper.origin : null)) {
                        return false;
                    }
                    kClassifier = this.getClassifier();
                    if (!(kClassifier instanceof KClass)) break block5;
                    KType kType = other instanceof KType ? (KType)other : null;
                    KClassifier otherClassifier = kType != null ? kType.getClassifier() : null;
                    if (otherClassifier == null) break block6;
                    if (otherClassifier instanceof KClass) break block7;
                }
                return false;
            }
            return Intrinsics.areEqual(JvmClassMappingKt.getJavaClass((KClass)kClassifier), JvmClassMappingKt.getJavaClass((KClass)var3_3));
        }
        return false;
    }

    @Override
    @NotNull
    public List<Annotation> getAnnotations() {
        return this.origin.getAnnotations();
    }

    public KTypeWrapper(@NotNull KType origin) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        this.origin = origin;
    }

    public int hashCode() {
        return this.origin.hashCode();
    }

    @Override
    public boolean isMarkedNullable() {
        return this.origin.isMarkedNullable();
    }
}

