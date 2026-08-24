/*
 * Decompiled with CFR 0.152.
 */
package kotlin.random;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.internal.PlatformImplementationsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.AbstractPlatformRandom;
import kotlin.random.KotlinRandom;
import kotlin.random.PlatformRandom;
import kotlin.random.Random;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=2, xi=48, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0010\u0010\u0001\u001a\u00020\u0000H\u0081\b\u00a2\u0006\u0004\b\u0001\u0010\u0002\u001a\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000\u00a2\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\u0000H\u0007\u00a2\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\f\u001a\u00020\u0000*\u00020\tH\u0007\u00a2\u0006\u0004\b\f\u0010\r\u00a8\u0006\u000e"}, d2={"Lkotlin/random/Random;", "defaultPlatformRandom", "()Lkotlin/random/Random;", "", "hi26", "low27", "", "doubleFromParts", "(II)D", "Ljava/util/Random;", "asJavaRandom", "(Lkotlin/random/Random;)Ljava/util/Random;", "asKotlinRandom", "(Ljava/util/Random;)Lkotlin/random/Random;", "kotlin-stdlib"})
public final class PlatformRandomKt {
    @InlineOnly
    private static final Random defaultPlatformRandom() {
        return PlatformImplementationsKt.IMPLEMENTATIONS.defaultPlatformRandom();
    }

    @NotNull
    @SinceKotlin(version="1.3")
    public static final Random asKotlinRandom(@NotNull java.util.Random $this$asKotlinRandom) {
        Intrinsics.checkNotNullParameter($this$asKotlinRandom, "<this>");
        KotlinRandom kotlinRandom = $this$asKotlinRandom instanceof KotlinRandom ? (KotlinRandom)$this$asKotlinRandom : null;
        Object object = kotlinRandom;
        if (kotlinRandom == null || (object = ((KotlinRandom)object).getImpl()) == null) {
            object = new PlatformRandom($this$asKotlinRandom);
        }
        return object;
    }

    @NotNull
    @SinceKotlin(version="1.3")
    public static final java.util.Random asJavaRandom(@NotNull Random $this$asJavaRandom) {
        Intrinsics.checkNotNullParameter($this$asJavaRandom, "<this>");
        AbstractPlatformRandom abstractPlatformRandom = $this$asJavaRandom instanceof AbstractPlatformRandom ? (AbstractPlatformRandom)$this$asJavaRandom : null;
        Object object = abstractPlatformRandom;
        if (abstractPlatformRandom == null || (object = ((AbstractPlatformRandom)object).getImpl()) == null) {
            object = new KotlinRandom($this$asJavaRandom);
        }
        return object;
    }

    public static final double doubleFromParts(int hi26, int low27) {
        return (double)(((long)hi26 << 27) + (long)low27) / 9.007199254740992E15;
    }
}

