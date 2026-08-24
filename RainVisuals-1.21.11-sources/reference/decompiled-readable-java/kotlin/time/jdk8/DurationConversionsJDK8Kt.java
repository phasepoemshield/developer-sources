/*
 * Decompiled with CFR 0.152.
 */
package kotlin.time.jdk8;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlin.time.ExperimentalTime;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@Metadata(mv={1, 9, 0}, k=2, xi=48, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0002\u0010\u0003\u001a\u0014\u0010\u0005\u001a\u00020\u0000*\u00020\u0001H\u0087\b\u00a2\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b\u00a1\u001e0\u0001\u00a8\u0006\u0007"}, d2={"Lkotlin/time/Duration;", "Ljava/time/Duration;", "toJavaDuration-LRDsOJo", "(J)Ljava/time/Duration;", "toJavaDuration", "toKotlinDuration", "(Ljava/time/Duration;)J", "kotlin-stdlib-jdk8"}, pn="")
@JvmName(name="DurationConversionsJDK8Kt")
public final class DurationConversionsJDK8Kt {
    /*
     * WARNING - void declaration
     */
    @SinceKotlin(version="1.6")
    @InlineOnly
    @WasExperimental(markerClass={ExperimentalTime.class})
    private static final java.time.Duration toJavaDuration-LRDsOJo(long $this$toJavaDuration_u2dLRDsOJo) {
        void nanoseconds;
        boolean bl = false;
        int n = Duration.getNanosecondsComponent-impl($this$toJavaDuration_u2dLRDsOJo);
        long seconds = Duration.getInWholeSeconds-impl($this$toJavaDuration_u2dLRDsOJo);
        boolean bl2 = false;
        java.time.Duration duration = java.time.Duration.ofSeconds(seconds, (long)nanoseconds);
        Intrinsics.checkNotNullExpressionValue(duration, "toComponents-impl(...)");
        return duration;
    }

    @InlineOnly
    @WasExperimental(markerClass={ExperimentalTime.class})
    @SinceKotlin(version="1.6")
    private static final long toKotlinDuration(java.time.Duration $this$toKotlinDuration) {
        Intrinsics.checkNotNullParameter($this$toKotlinDuration, "<this>");
        return Duration.plus-LRDsOJo(DurationKt.toDuration($this$toKotlinDuration.getSeconds(), DurationUnit.SECONDS), DurationKt.toDuration($this$toKotlinDuration.getNano(), DurationUnit.NANOSECONDS));
    }
}

