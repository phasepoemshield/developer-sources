/*
 * Decompiled with CFR 0.152.
 */
package kotlin.reflect;

import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.internal.LowPriorityInOverloadResolution;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=2, xi=48, d1={"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a-\u0010\u0004\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\u0007\u00a2\u0006\u0004\b\u0004\u0010\u0005\u001a/\u0010\u0006\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\u0007\u00a2\u0006\u0004\b\u0006\u0010\u0005\u00a8\u0006\u0007"}, d2={"", "T", "Lkotlin/reflect/KClass;", "value", "cast", "(Lkotlin/reflect/KClass;Ljava/lang/Object;)Ljava/lang/Object;", "safeCast", "kotlin-stdlib"})
@JvmName(name="KClasses")
public final class KClasses {
    @WasExperimental(markerClass={ExperimentalStdlibApi.class})
    @LowPriorityInOverloadResolution
    @SinceKotlin(version="1.4")
    @Nullable
    public static final <T> T safeCast(@NotNull KClass<T> $this$safeCast, @Nullable Object value) {
        Object object;
        Intrinsics.checkNotNullParameter($this$safeCast, "<this>");
        if ($this$safeCast.isInstance(value)) {
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.safeCast");
            object = value;
        } else {
            object = null;
        }
        return (T)object;
    }

    /*
     * WARNING - void declaration
     */
    @SinceKotlin(version="1.4")
    @NotNull
    @WasExperimental(markerClass={ExperimentalStdlibApi.class})
    @LowPriorityInOverloadResolution
    public static final <T> T cast(@NotNull KClass<T> $this$cast, @Nullable Object value) {
        void var1_1;
        Intrinsics.checkNotNullParameter($this$cast, "<this>");
        if (!$this$cast.isInstance(value)) {
            KClass<T> $this$qualifiedOrSimpleName$iv = $this$cast;
            boolean $i$f$getQualifiedOrSimpleName = false;
            throw new ClassCastException("Value cannot be cast to " + $this$qualifiedOrSimpleName$iv.getQualifiedName());
        }
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
        return var1_1;
    }
}

