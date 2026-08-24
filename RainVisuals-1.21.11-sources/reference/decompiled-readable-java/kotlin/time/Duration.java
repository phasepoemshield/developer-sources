/*
 * Decompiled with CFR 0.152.
 */
package kotlin.time;

import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.comparisons.ComparisonsKt;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.LongRange;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlin.time.DurationJvmKt;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlin.time.DurationUnitKt;
import kotlin.time.ExperimentalTime;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b@\b\u0087@\u0018\u0000 \u00a7\u00012\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u00a7\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\n\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0000H\u0096\u0002\u00a2\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0086\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\fH\u0086\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0012\u0010\u0015J\u0018\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u0000H\u0086\u0002\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001c\u001a\u00020\u00192\b\u0010\u000b\u001a\u0004\u0018\u00010\u0018H\u00d6\u0003\u00a2\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001f\u001a\u00020\fH\u00d6\u0001\u00a2\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\"\u001a\u00020\u0019\u00a2\u0006\u0004\b \u0010!J\u000f\u0010$\u001a\u00020\u0019H\u0002\u00a2\u0006\u0004\b#\u0010!J\u000f\u0010&\u001a\u00020\u0019H\u0002\u00a2\u0006\u0004\b%\u0010!J\r\u0010(\u001a\u00020\u0019\u00a2\u0006\u0004\b'\u0010!J\r\u0010*\u001a\u00020\u0019\u00a2\u0006\u0004\b)\u0010!J\r\u0010,\u001a\u00020\u0019\u00a2\u0006\u0004\b+\u0010!J\u0018\u0010/\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0000H\u0086\u0002\u00a2\u0006\u0004\b-\u0010.J\u0018\u00101\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0000H\u0086\u0002\u00a2\u0006\u0004\b0\u0010.J\u001b\u00103\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0086\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\b2\u0010\u0013J\u001b\u00103\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\fH\u0086\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\b2\u0010\u0015J\u009d\u0001\u0010@\u001a\u00028\u0000\"\u0004\b\u0000\u001042u\u0010=\u001aq\u0012\u0013\u0012\u00110\u0002\u00a2\u0006\f\b6\u0012\b\b7\u0012\u0004\b\b(8\u0012\u0013\u0012\u00110\f\u00a2\u0006\f\b6\u0012\b\b7\u0012\u0004\b\b(9\u0012\u0013\u0012\u00110\f\u00a2\u0006\f\b6\u0012\b\b7\u0012\u0004\b\b(:\u0012\u0013\u0012\u00110\f\u00a2\u0006\f\b6\u0012\b\b7\u0012\u0004\b\b(;\u0012\u0013\u0012\u00110\f\u00a2\u0006\f\b6\u0012\b\b7\u0012\u0004\b\b(<\u0012\u0004\u0012\u00028\u000005H\u0086\b\u00f8\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u00a2\u0006\u0004\b>\u0010?J\u0088\u0001\u0010@\u001a\u00028\u0000\"\u0004\b\u0000\u001042`\u0010=\u001a\\\u0012\u0013\u0012\u00110\u0002\u00a2\u0006\f\b6\u0012\b\b7\u0012\u0004\b\b(9\u0012\u0013\u0012\u00110\f\u00a2\u0006\f\b6\u0012\b\b7\u0012\u0004\b\b(:\u0012\u0013\u0012\u00110\f\u00a2\u0006\f\b6\u0012\b\b7\u0012\u0004\b\b(;\u0012\u0013\u0012\u00110\f\u00a2\u0006\f\b6\u0012\b\b7\u0012\u0004\b\b(<\u0012\u0004\u0012\u00028\u00000AH\u0086\b\u00f8\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u00a2\u0006\u0004\b>\u0010BJs\u0010@\u001a\u00028\u0000\"\u0004\b\u0000\u001042K\u0010=\u001aG\u0012\u0013\u0012\u00110\u0002\u00a2\u0006\f\b6\u0012\b\b7\u0012\u0004\b\b(:\u0012\u0013\u0012\u00110\f\u00a2\u0006\f\b6\u0012\b\b7\u0012\u0004\b\b(;\u0012\u0013\u0012\u00110\f\u00a2\u0006\f\b6\u0012\b\b7\u0012\u0004\b\b(<\u0012\u0004\u0012\u00028\u00000CH\u0086\b\u00f8\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u00a2\u0006\u0004\b>\u0010DJ^\u0010@\u001a\u00028\u0000\"\u0004\b\u0000\u0010426\u0010=\u001a2\u0012\u0013\u0012\u00110\u0002\u00a2\u0006\f\b6\u0012\b\b7\u0012\u0004\b\b(;\u0012\u0013\u0012\u00110\f\u00a2\u0006\f\b6\u0012\b\b7\u0012\u0004\b\b(<\u0012\u0004\u0012\u00028\u00000EH\u0086\b\u00f8\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u00a2\u0006\u0004\b>\u0010FJ\u0015\u0010K\u001a\u00020\u00102\u0006\u0010H\u001a\u00020G\u00a2\u0006\u0004\bI\u0010JJ\u0015\u0010N\u001a\u00020\f2\u0006\u0010H\u001a\u00020G\u00a2\u0006\u0004\bL\u0010MJ\r\u0010R\u001a\u00020O\u00a2\u0006\u0004\bP\u0010QJ\u0015\u0010U\u001a\u00020\u00022\u0006\u0010H\u001a\u00020G\u00a2\u0006\u0004\bS\u0010TJ\u000f\u0010W\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\bV\u0010\u0005J\u000f\u0010Y\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\bX\u0010\u0005J\u000f\u0010[\u001a\u00020OH\u0016\u00a2\u0006\u0004\bZ\u0010QJ\u001f\u0010[\u001a\u00020O2\u0006\u0010H\u001a\u00020G2\b\b\u0002\u0010\\\u001a\u00020\f\u00a2\u0006\u0004\bZ\u0010]J\u001a\u0010_\u001a\u00020\u00002\u0006\u0010H\u001a\u00020GH\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\b^\u0010TJ\u0013\u0010a\u001a\u00020\u0000H\u0086\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\b`\u0010\u0005J?\u0010k\u001a\u00020h*\u00060bj\u0002`c2\u0006\u0010d\u001a\u00020\f2\u0006\u0010e\u001a\u00020\f2\u0006\u0010f\u001a\u00020\f2\u0006\u0010H\u001a\u00020O2\u0006\u0010g\u001a\u00020\u0019H\u0002\u00a2\u0006\u0004\bi\u0010jR\u0014\u0010m\u001a\u00020\u00008F\u00f8\u0001\u0000\u00a2\u0006\u0006\u001a\u0004\bl\u0010\u0005R\u001a\u0010q\u001a\u00020\f8@X\u0081\u0004\u00a2\u0006\f\u0012\u0004\bo\u0010p\u001a\u0004\bn\u0010\u001eR\u001a\u0010u\u001a\u00020\u00108FX\u0087\u0004\u00a2\u0006\f\u0012\u0004\bt\u0010p\u001a\u0004\br\u0010sR\u001a\u0010x\u001a\u00020\u00108FX\u0087\u0004\u00a2\u0006\f\u0012\u0004\bw\u0010p\u001a\u0004\bv\u0010sR\u001a\u0010{\u001a\u00020\u00108FX\u0087\u0004\u00a2\u0006\f\u0012\u0004\bz\u0010p\u001a\u0004\by\u0010sR\u001a\u0010~\u001a\u00020\u00108FX\u0087\u0004\u00a2\u0006\f\u0012\u0004\b}\u0010p\u001a\u0004\b|\u0010sR\u001c\u0010\u0081\u0001\u001a\u00020\u00108FX\u0087\u0004\u00a2\u0006\r\u0012\u0005\b\u0080\u0001\u0010p\u001a\u0004\b\u007f\u0010sR\u001d\u0010\u0084\u0001\u001a\u00020\u00108FX\u0087\u0004\u00a2\u0006\u000e\u0012\u0005\b\u0083\u0001\u0010p\u001a\u0005\b\u0082\u0001\u0010sR\u001d\u0010\u0087\u0001\u001a\u00020\u00108FX\u0087\u0004\u00a2\u0006\u000e\u0012\u0005\b\u0086\u0001\u0010p\u001a\u0005\b\u0085\u0001\u0010sR\u0013\u0010\u0089\u0001\u001a\u00020\u00028F\u00a2\u0006\u0007\u001a\u0005\b\u0088\u0001\u0010\u0005R\u0013\u0010\u008b\u0001\u001a\u00020\u00028F\u00a2\u0006\u0007\u001a\u0005\b\u008a\u0001\u0010\u0005R\u0013\u0010\u008d\u0001\u001a\u00020\u00028F\u00a2\u0006\u0007\u001a\u0005\b\u008c\u0001\u0010\u0005R\u0013\u0010\u008f\u0001\u001a\u00020\u00028F\u00a2\u0006\u0007\u001a\u0005\b\u008e\u0001\u0010\u0005R\u0013\u0010\u0091\u0001\u001a\u00020\u00028F\u00a2\u0006\u0007\u001a\u0005\b\u0090\u0001\u0010\u0005R\u0013\u0010\u0093\u0001\u001a\u00020\u00028F\u00a2\u0006\u0007\u001a\u0005\b\u0092\u0001\u0010\u0005R\u0013\u0010\u0095\u0001\u001a\u00020\u00028F\u00a2\u0006\u0007\u001a\u0005\b\u0094\u0001\u0010\u0005R\u001d\u0010\u0098\u0001\u001a\u00020\f8@X\u0081\u0004\u00a2\u0006\u000e\u0012\u0005\b\u0097\u0001\u0010p\u001a\u0005\b\u0096\u0001\u0010\u001eR\u001d\u0010\u009b\u0001\u001a\u00020\f8@X\u0081\u0004\u00a2\u0006\u000e\u0012\u0005\b\u009a\u0001\u0010p\u001a\u0005\b\u0099\u0001\u0010\u001eR\u0015\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\b\u0003\u0010\u009c\u0001R\u001d\u0010\u009f\u0001\u001a\u00020\f8@X\u0081\u0004\u00a2\u0006\u000e\u0012\u0005\b\u009e\u0001\u0010p\u001a\u0005\b\u009d\u0001\u0010\u001eR\u0017\u0010\u00a2\u0001\u001a\u00020G8BX\u0082\u0004\u00a2\u0006\b\u001a\u0006\b\u00a0\u0001\u0010\u00a1\u0001R\u0017\u0010\u00a4\u0001\u001a\u00020\f8\u00c2\u0002X\u0082\u0004\u00a2\u0006\u0007\u001a\u0005\b\u00a3\u0001\u0010\u001eR\u0016\u0010\u00a6\u0001\u001a\u00020\u00028BX\u0082\u0004\u00a2\u0006\u0007\u001a\u0005\b\u00a5\u0001\u0010\u0005\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u000b\n\u0002\b!\n\u0005\b\u009920\u0001\u00a8\u0006\u00a8\u0001"}, d2={"Lkotlin/time/Duration;", "", "", "rawValue", "constructor-impl", "(J)J", "thisMillis", "otherNanos", "addValuesMixedRanges-UwyO8pc", "(JJJ)J", "addValuesMixedRanges", "other", "", "compareTo-LRDsOJo", "(JJ)I", "compareTo", "", "scale", "div-UwyO8pc", "(JD)J", "div", "(JI)J", "div-LRDsOJo", "(JJ)D", "", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "hashCode-impl", "(J)I", "hashCode", "isFinite-impl", "(J)Z", "isFinite", "isInMillis-impl", "isInMillis", "isInNanos-impl", "isInNanos", "isInfinite-impl", "isInfinite", "isNegative-impl", "isNegative", "isPositive-impl", "isPositive", "minus-LRDsOJo", "(JJ)J", "minus", "plus-LRDsOJo", "plus", "times-UwyO8pc", "times", "T", "Lkotlin/Function5;", "Lkotlin/ParameterName;", "name", "days", "hours", "minutes", "seconds", "nanoseconds", "action", "toComponents-impl", "(JLkotlin/jvm/functions/Function5;)Ljava/lang/Object;", "toComponents", "Lkotlin/Function4;", "(JLkotlin/jvm/functions/Function4;)Ljava/lang/Object;", "Lkotlin/Function3;", "(JLkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "Lkotlin/Function2;", "(JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "Lkotlin/time/DurationUnit;", "unit", "toDouble-impl", "(JLkotlin/time/DurationUnit;)D", "toDouble", "toInt-impl", "(JLkotlin/time/DurationUnit;)I", "toInt", "", "toIsoString-impl", "(J)Ljava/lang/String;", "toIsoString", "toLong-impl", "(JLkotlin/time/DurationUnit;)J", "toLong", "toLongMilliseconds-impl", "toLongMilliseconds", "toLongNanoseconds-impl", "toLongNanoseconds", "toString-impl", "toString", "decimals", "(JLkotlin/time/DurationUnit;I)Ljava/lang/String;", "truncateTo-UwyO8pc$kotlin_stdlib", "truncateTo", "unaryMinus-UwyO8pc", "unaryMinus", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "whole", "fractional", "fractionalSize", "isoZeroes", "", "appendFractional-impl", "(JLjava/lang/StringBuilder;IIILjava/lang/String;Z)V", "appendFractional", "getAbsoluteValue-UwyO8pc", "absoluteValue", "getHoursComponent-impl", "getHoursComponent$annotations", "()V", "hoursComponent", "getInDays-impl", "(J)D", "getInDays$annotations", "inDays", "getInHours-impl", "getInHours$annotations", "inHours", "getInMicroseconds-impl", "getInMicroseconds$annotations", "inMicroseconds", "getInMilliseconds-impl", "getInMilliseconds$annotations", "inMilliseconds", "getInMinutes-impl", "getInMinutes$annotations", "inMinutes", "getInNanoseconds-impl", "getInNanoseconds$annotations", "inNanoseconds", "getInSeconds-impl", "getInSeconds$annotations", "inSeconds", "getInWholeDays-impl", "inWholeDays", "getInWholeHours-impl", "inWholeHours", "getInWholeMicroseconds-impl", "inWholeMicroseconds", "getInWholeMilliseconds-impl", "inWholeMilliseconds", "getInWholeMinutes-impl", "inWholeMinutes", "getInWholeNanoseconds-impl", "inWholeNanoseconds", "getInWholeSeconds-impl", "inWholeSeconds", "getMinutesComponent-impl", "getMinutesComponent$annotations", "minutesComponent", "getNanosecondsComponent-impl", "getNanosecondsComponent$annotations", "nanosecondsComponent", "J", "getSecondsComponent-impl", "getSecondsComponent$annotations", "secondsComponent", "getStorageUnit-impl", "(J)Lkotlin/time/DurationUnit;", "storageUnit", "getUnitDiscriminator-impl", "unitDiscriminator", "getValue-impl", "value", "Companion", "kotlin-stdlib"})
@JvmInline
@SinceKotlin(version="1.6")
@WasExperimental(markerClass={ExperimentalTime.class})
public final class Duration
implements Comparable<Duration> {
    private final long rawValue;
    private static final long INFINITE;
    @NotNull
    public static final Companion Companion;
    private static final long ZERO;
    private static final long NEG_INFINITE;

    public static final boolean isPositive-impl(long arg0) {
        return arg0 > 0L;
    }

    public static final long getAbsoluteValue-UwyO8pc(long arg0) {
        return Duration.isNegative-impl(arg0) ? Duration.unaryMinus-UwyO8pc(arg0) : arg0;
    }

    public static final /* synthetic */ double getInMilliseconds-impl(long arg0) {
        return Duration.toDouble-impl(arg0, DurationUnit.MILLISECONDS);
    }

    @DeprecatedSinceKotlin(warningSince="1.5", errorSince="1.8", hiddenSince="1.9")
    @Deprecated(message="Use inWholeHours property instead or convert toDouble(HOURS) if a double value is required.", replaceWith=@ReplaceWith(expression="toDouble(DurationUnit.HOURS)", imports={}))
    @ExperimentalTime
    public static /* synthetic */ void getInHours$annotations() {
    }

    public static final long getInWholeMicroseconds-impl(long arg0) {
        return Duration.toLong-impl(arg0, DurationUnit.MICROSECONDS);
    }

    public static final /* synthetic */ double getInDays-impl(long arg0) {
        return Duration.toDouble-impl(arg0, DurationUnit.DAYS);
    }

    private static final boolean isInNanos-impl(long arg0) {
        boolean bl = false;
        return ((int)arg0 & 1) == 0;
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public static final String toIsoString-impl(long arg0) {
        StringBuilder stringBuilder;
        block8: {
            void var9_7;
            int n;
            StringBuilder $this$toIsoString_impl_u24lambda_u249;
            block7: {
                void nanoseconds;
                stringBuilder = new StringBuilder();
                $this$toIsoString_impl_u24lambda_u249 = stringBuilder;
                boolean bl = false;
                if (Duration.isNegative-impl(arg0)) {
                    $this$toIsoString_impl_u24lambda_u249.append('-');
                }
                $this$toIsoString_impl_u24lambda_u249.append("PT");
                long arg0$iv = Duration.getAbsoluteValue-UwyO8pc(arg0);
                boolean bl2 = false;
                n = Duration.getNanosecondsComponent-impl(arg0$iv);
                int seconds = Duration.getSecondsComponent-impl(arg0$iv);
                int minutes = Duration.getMinutesComponent-impl(arg0$iv);
                long hours = Duration.getInWholeHours-impl(arg0$iv);
                boolean bl3 = false;
                long hours2 = hours;
                if (Duration.isInfinite-impl(arg0)) {
                    hours2 = 9999999999999L;
                }
                boolean hasHours = hours2 != 0L;
                boolean hasSeconds = seconds != 0 || nanoseconds != false;
                boolean hasMinutes = minutes != 0 || hasSeconds && hasHours;
                if (hasHours) {
                    $this$toIsoString_impl_u24lambda_u249.append(hours2).append('H');
                }
                if (hasMinutes) {
                    $this$toIsoString_impl_u24lambda_u249.append(minutes).append('M');
                }
                if (hasSeconds) break block7;
                if (hasHours || hasMinutes) break block8;
            }
            Duration.appendFractional-impl(arg0, $this$toIsoString_impl_u24lambda_u249, (int)var9_7, n, 9, "S", true);
        }
        String string = stringBuilder.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static final /* synthetic */ double getInMicroseconds-impl(long arg0) {
        return Duration.toDouble-impl(arg0, DurationUnit.MICROSECONDS);
    }

    public static final boolean isNegative-impl(long arg0) {
        return arg0 < 0L;
    }

    @Deprecated(message="Use inWholeMilliseconds property instead.", replaceWith=@ReplaceWith(expression="this.inWholeMilliseconds", imports={}))
    @DeprecatedSinceKotlin(warningSince="1.5", errorSince="1.8", hiddenSince="1.9")
    @ExperimentalTime
    public static final /* synthetic */ long toLongMilliseconds-impl(long arg0) {
        return Duration.getInWholeMilliseconds-impl(arg0);
    }

    @DeprecatedSinceKotlin(warningSince="1.5", errorSince="1.8", hiddenSince="1.9")
    @Deprecated(message="Use inWholeSeconds property instead or convert toDouble(SECONDS) if a double value is required.", replaceWith=@ReplaceWith(expression="toDouble(DurationUnit.SECONDS)", imports={}))
    @ExperimentalTime
    public static /* synthetic */ void getInSeconds$annotations() {
    }

    public static boolean equals-impl(long arg0, Object other) {
        if (!(other instanceof Duration)) {
            return false;
        }
        long l = ((Duration)other).unbox-impl();
        if (arg0 != l) {
            return false;
        }
        return true;
    }

    public static final <T> T toComponents-impl(long arg0, @NotNull Function2<? super Long, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        boolean bl = false;
        return action.invoke(Duration.getInWholeSeconds-impl(arg0), Duration.getNanosecondsComponent-impl(arg0));
    }

    @NotNull
    public static final String toString-impl(long arg0, @NotNull DurationUnit unit, int decimals) {
        Intrinsics.checkNotNullParameter((Object)unit, "unit");
        boolean bl = decimals >= 0;
        if (!bl) {
            boolean bl2 = false;
            String string = "decimals must be not negative, but was " + decimals;
            throw new IllegalArgumentException(string.toString());
        }
        double number = Duration.toDouble-impl(arg0, unit);
        if (Double.isInfinite(number)) {
            return String.valueOf(number);
        }
        return DurationJvmKt.formatToExactDecimals(number, RangesKt.coerceAtMost(decimals, 12)) + DurationUnitKt.shortName(unit);
    }

    @Deprecated(message="Use inWholeNanoseconds property instead.", replaceWith=@ReplaceWith(expression="this.inWholeNanoseconds", imports={}))
    @DeprecatedSinceKotlin(warningSince="1.5", errorSince="1.8", hiddenSince="1.9")
    @ExperimentalTime
    public static final /* synthetic */ long toLongNanoseconds-impl(long arg0) {
        return Duration.getInWholeNanoseconds-impl(arg0);
    }

    public static final long times-UwyO8pc(long arg0, double scale) {
        int intScale = MathKt.roundToInt(scale);
        boolean bl = (double)intScale == scale;
        if (bl) {
            return Duration.times-UwyO8pc(arg0, intScale);
        }
        DurationUnit unit = Duration.getStorageUnit-impl(arg0);
        double result = Duration.toDouble-impl(arg0, unit) * scale;
        return DurationKt.toDuration(result, unit);
    }

    public static final boolean equals-impl0(long p1, long p2) {
        return p1 == p2;
    }

    public static final /* synthetic */ double getInHours-impl(long arg0) {
        return Duration.toDouble-impl(arg0, DurationUnit.HOURS);
    }

    @DeprecatedSinceKotlin(warningSince="1.5", errorSince="1.8", hiddenSince="1.9")
    @Deprecated(message="Use inWholeDays property instead or convert toDouble(DAYS) if a double value is required.", replaceWith=@ReplaceWith(expression="toDouble(DurationUnit.DAYS)", imports={}))
    @ExperimentalTime
    public static /* synthetic */ void getInDays$annotations() {
    }

    @Deprecated(message="Use inWholeMilliseconds property instead or convert toDouble(MILLISECONDS) if a double value is required.", replaceWith=@ReplaceWith(expression="toDouble(DurationUnit.MILLISECONDS)", imports={}))
    @DeprecatedSinceKotlin(warningSince="1.5", errorSince="1.8", hiddenSince="1.9")
    @ExperimentalTime
    public static /* synthetic */ void getInMilliseconds$annotations() {
    }

    public static final long getInWholeSeconds-impl(long arg0) {
        return Duration.toLong-impl(arg0, DurationUnit.SECONDS);
    }

    public boolean equals(Object other) {
        return Duration.equals-impl(this.rawValue, other);
    }

    public static final long getInWholeDays-impl(long arg0) {
        return Duration.toLong-impl(arg0, DurationUnit.DAYS);
    }

    /*
     * Unable to fully structure code
     */
    @NotNull
    public static String toString-impl(long arg0) {
        block16: {
            block19: {
                block18: {
                    block17: {
                        block15: {
                            var2_1 = arg0;
                            if (var2_1 != 0L) break block15;
                            v0 = "0s";
                            break block16;
                        }
                        if (var2_1 != Duration.INFINITE) break block17;
                        v0 = "Infinity";
                        break block16;
                    }
                    if (var2_1 != Duration.NEG_INFINITE) break block18;
                    v0 = "-Infinity";
                    break block16;
                }
                isNegative = Duration.isNegative-impl(arg0);
                $this$toString_impl_u24lambda_u245 = var5_3 = new StringBuilder();
                $i$a$-buildString-Duration$toString$1 = false;
                if (isNegative) {
                    $this$toString_impl_u24lambda_u245.append('-');
                }
                arg0$iv = Duration.getAbsoluteValue-UwyO8pc(arg0);
                $i$f$toComponents-impl = false;
                var11_8 = Duration.getNanosecondsComponent-impl(arg0$iv);
                var12_9 = Duration.getSecondsComponent-impl(arg0$iv);
                var13_10 = Duration.getMinutesComponent-impl(arg0$iv);
                hours = Duration.getHoursComponent-impl(arg0$iv);
                days = Duration.getInWholeDays-impl(arg0$iv);
                $i$a$-toComponents-impl-Duration$toString$1$1 = false;
                hasDays = days != 0L;
                hasHours = hours != 0;
                hasMinutes = minutes != false;
                hasSeconds = seconds != false || nanoseconds != false;
                components = 0;
                if (hasDays) {
                    $this$toString_impl_u24lambda_u245.append(days).append('d');
                    ++components;
                }
                if (hasHours || hasDays && (hasMinutes || hasSeconds)) {
                    if (components++ > 0) {
                        $this$toString_impl_u24lambda_u245.append(' ');
                    }
                    $this$toString_impl_u24lambda_u245.append(hours).append('h');
                }
                if (hasMinutes || hasSeconds && (hasHours || hasDays)) {
                    if (components++ > 0) {
                        $this$toString_impl_u24lambda_u245.append(' ');
                    }
                    $this$toString_impl_u24lambda_u245.append((int)minutes).append('m');
                }
                if (!hasSeconds) break block19;
                if (components++ > 0) {
                    $this$toString_impl_u24lambda_u245.append(' ');
                }
                if (seconds != false || hasDays || hasHours) ** GOTO lbl64
                if (hasMinutes) {
lbl64:
                    // 2 sources

                    Duration.appendFractional-impl(arg0, $this$toString_impl_u24lambda_u245, (int)seconds, (int)nanoseconds, 9, "s", false);
                } else if (nanoseconds >= 1000000) {
                    Duration.appendFractional-impl(arg0, $this$toString_impl_u24lambda_u245, (int)(nanoseconds / 1000000), (int)(nanoseconds % 1000000), 6, "ms", false);
                } else if (nanoseconds >= 1000) {
                    Duration.appendFractional-impl(arg0, $this$toString_impl_u24lambda_u245, (int)(nanoseconds / 1000), (int)(nanoseconds % 1000), 3, "us", false);
                } else {
                    $this$toString_impl_u24lambda_u245.append((int)nanoseconds).append("ns");
                }
            }
            if (isNegative) {
                if (components > 1) {
                    var6_4.insert(1, '(').append(')');
                }
            }
            v1 = var5_3.toString();
            v0 = v1;
            Intrinsics.checkNotNullExpressionValue(v1, "toString(...)");
        }
        return v0;
    }

    public static final /* synthetic */ double getInNanoseconds-impl(long arg0) {
        return Duration.toDouble-impl(arg0, DurationUnit.NANOSECONDS);
    }

    @PublishedApi
    public static /* synthetic */ void getNanosecondsComponent$annotations() {
    }

    public static final int getHoursComponent-impl(long arg0) {
        return Duration.isInfinite-impl(arg0) ? 0 : (int)(Duration.getInWholeHours-impl(arg0) % (long)24);
    }

    public static final double toDouble-impl(long arg0, @NotNull DurationUnit unit) {
        Intrinsics.checkNotNullParameter((Object)unit, "unit");
        long l = arg0;
        return l == INFINITE ? Double.POSITIVE_INFINITY : (l == NEG_INFINITE ? Double.NEGATIVE_INFINITY : DurationUnitKt.convertDurationUnit((double)Duration.getValue-impl(arg0), Duration.getStorageUnit-impl(arg0), unit));
    }

    public final /* synthetic */ long unbox-impl() {
        return this.rawValue;
    }

    public static final int toInt-impl(long arg0, @NotNull DurationUnit unit) {
        Intrinsics.checkNotNullParameter((Object)unit, "unit");
        return (int)RangesKt.coerceIn(Duration.toLong-impl(arg0, unit), Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static final long div-UwyO8pc(long arg0, double scale) {
        int intScale = MathKt.roundToInt(scale);
        boolean bl = (double)intScale == scale;
        if (bl && intScale != 0) {
            return Duration.div-UwyO8pc(arg0, intScale);
        }
        DurationUnit unit = Duration.getStorageUnit-impl(arg0);
        double result = Duration.toDouble-impl(arg0, unit) / scale;
        return DurationKt.toDuration(result, unit);
    }

    @PublishedApi
    public static /* synthetic */ void getSecondsComponent$annotations() {
    }

    public int compareTo-LRDsOJo(long other) {
        return Duration.compareTo-LRDsOJo(this.rawValue, other);
    }

    public static final /* synthetic */ double getInMinutes-impl(long arg0) {
        return Duration.toDouble-impl(arg0, DurationUnit.MINUTES);
    }

    public static final long getInWholeNanoseconds-impl(long arg0) {
        long value = Duration.getValue-impl(arg0);
        return Duration.isInNanos-impl(arg0) ? value : (value > 9223372036854L ? Long.MAX_VALUE : (value < -9223372036854L ? Long.MIN_VALUE : DurationKt.access$millisToNanos(value)));
    }

    @Deprecated(message="Use inWholeMinutes property instead or convert toDouble(MINUTES) if a double value is required.", replaceWith=@ReplaceWith(expression="toDouble(DurationUnit.MINUTES)", imports={}))
    @DeprecatedSinceKotlin(warningSince="1.5", errorSince="1.8", hiddenSince="1.9")
    @ExperimentalTime
    public static /* synthetic */ void getInMinutes$annotations() {
    }

    static {
        Companion = new Companion(null);
        ZERO = Duration.constructor-impl(0L);
        INFINITE = DurationKt.access$durationOfMillis(0x3FFFFFFFFFFFFFFFL);
        NEG_INFINITE = DurationKt.access$durationOfMillis(-4611686018427387903L);
    }

    public static final boolean isInfinite-impl(long arg0) {
        return arg0 == INFINITE || arg0 == NEG_INFINITE;
    }

    @Deprecated(message="Use inWholeMicroseconds property instead or convert toDouble(MICROSECONDS) if a double value is required.", replaceWith=@ReplaceWith(expression="toDouble(DurationUnit.MICROSECONDS)", imports={}))
    @DeprecatedSinceKotlin(warningSince="1.5", errorSince="1.8", hiddenSince="1.9")
    @ExperimentalTime
    public static /* synthetic */ void getInMicroseconds$annotations() {
    }

    public static final <T> T toComponents-impl(long arg0, @NotNull Function5<? super Long, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        boolean bl = false;
        return action.invoke(Duration.getInWholeDays-impl(arg0), Duration.getHoursComponent-impl(arg0), Duration.getMinutesComponent-impl(arg0), Duration.getSecondsComponent-impl(arg0), Duration.getNanosecondsComponent-impl(arg0));
    }

    public static final long getInWholeMilliseconds-impl(long arg0) {
        return Duration.isInMillis-impl(arg0) && Duration.isFinite-impl(arg0) ? Duration.getValue-impl(arg0) : Duration.toLong-impl(arg0, DurationUnit.MILLISECONDS);
    }

    @PublishedApi
    public static /* synthetic */ void getHoursComponent$annotations() {
    }

    private static final boolean isInMillis-impl(long arg0) {
        boolean bl = false;
        return ((int)arg0 & 1) == 1;
    }

    public static final boolean isFinite-impl(long arg0) {
        return !Duration.isInfinite-impl(arg0);
    }

    private static final DurationUnit getStorageUnit-impl(long arg0) {
        return Duration.isInNanos-impl(arg0) ? DurationUnit.NANOSECONDS : DurationUnit.MILLISECONDS;
    }

    public static final long unaryMinus-UwyO8pc(long arg0) {
        boolean bl = false;
        return DurationKt.access$durationOf(-Duration.getValue-impl(arg0), (int)arg0 & 1);
    }

    public int hashCode() {
        return Duration.hashCode-impl(this.rawValue);
    }

    private static final long getValue-impl(long arg0) {
        return arg0 >> 1;
    }

    public static final long getInWholeHours-impl(long arg0) {
        return Duration.toLong-impl(arg0, DurationUnit.HOURS);
    }

    public static long constructor-impl(long rawValue) {
        long l = rawValue;
        if (DurationJvmKt.getDurationAssertionsEnabled()) {
            if (Duration.isInNanos-impl(l)) {
                if (!new LongRange(-4611686018426999999L, 4611686018426999999L).contains(Duration.getValue-impl(l))) {
                    throw new AssertionError((Object)(Duration.getValue-impl(l) + " ns is out of nanoseconds range"));
                }
            } else {
                if (!new LongRange(-4611686018427387903L, 0x3FFFFFFFFFFFFFFFL).contains(Duration.getValue-impl(l))) {
                    throw new AssertionError((Object)(Duration.getValue-impl(l) + " ms is out of milliseconds range"));
                }
                if (new LongRange(-4611686018426L, 4611686018426L).contains(Duration.getValue-impl(l))) {
                    throw new AssertionError((Object)(Duration.getValue-impl(l) + " ms is denormalized"));
                }
            }
        }
        return l;
    }

    /*
     * WARNING - void declaration
     */
    public static final long plus-LRDsOJo(long arg0, long other) {
        long l;
        block6: {
            block8: {
                block7: {
                    if (!Duration.isInfinite-impl(arg0)) break block6;
                    if (Duration.isFinite-impl(other)) break block7;
                    if ((arg0 ^ other) < 0L) break block8;
                }
                return arg0;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (Duration.isInfinite-impl(other)) {
            return other;
        }
        boolean bl = false;
        bl = false;
        if (((int)arg0 & 1) == ((int)other & 1)) {
            void var4_3;
            long result = Duration.getValue-impl(arg0) + Duration.getValue-impl(other);
            l = Duration.isInNanos-impl(arg0) ? DurationKt.access$durationOfNanosNormalized(result) : DurationKt.access$durationOfMillisNormalized((long)var4_3);
        } else {
            l = Duration.isInMillis-impl(arg0) ? Duration.addValuesMixedRanges-UwyO8pc(arg0, Duration.getValue-impl(arg0), Duration.getValue-impl(other)) : Duration.addValuesMixedRanges-UwyO8pc(arg0, Duration.getValue-impl(other), Duration.getValue-impl(arg0));
        }
        return l;
    }

    public static final /* synthetic */ double getInSeconds-impl(long arg0) {
        return Duration.toDouble-impl(arg0, DurationUnit.SECONDS);
    }

    public static final long toLong-impl(long arg0, @NotNull DurationUnit unit) {
        Intrinsics.checkNotNullParameter((Object)unit, "unit");
        long l = arg0;
        return l == INFINITE ? Long.MAX_VALUE : (l == NEG_INFINITE ? Long.MIN_VALUE : DurationUnitKt.convertDurationUnit(Duration.getValue-impl(arg0), Duration.getStorageUnit-impl(arg0), unit));
    }

    private static final int getUnitDiscriminator-impl(long arg0) {
        boolean bl = false;
        return (int)arg0 & 1;
    }

    @NotNull
    public String toString() {
        return Duration.toString-impl(this.rawValue);
    }

    public static final <T> T toComponents-impl(long arg0, @NotNull Function4<? super Long, ? super Integer, ? super Integer, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        boolean bl = false;
        return action.invoke(Duration.getInWholeHours-impl(arg0), Duration.getMinutesComponent-impl(arg0), Duration.getSecondsComponent-impl(arg0), Duration.getNanosecondsComponent-impl(arg0));
    }

    /*
     * Unable to fully structure code
     */
    private static final void appendFractional-impl(long arg0, StringBuilder $this$appendFractional, int whole, int fractional, int fractionalSize, String unit, boolean isoZeroes) {
        block5: {
            block4: {
                $this$appendFractional.append(whole);
                if (fractional == 0) break block5;
                $this$appendFractional.append('.');
                fracString = StringsKt.padStart(String.valueOf(fractional), fractionalSize, '0');
                $this$indexOfLast$iv = fracString;
                $i$f$indexOfLast = false;
                var12_10 = $this$indexOfLast$iv.length() + -1;
                if (0 <= var12_10) {
                    do {
                        index$iv = var12_10--;
                        it = $this$indexOfLast$iv.charAt(index$iv);
                        $i$a$-indexOfLast-Duration$appendFractional$nonZeroDigits$1 = false;
                        v0 = it != '0';
                        if (!v0) continue;
                        v1 = index$iv;
                        break block4;
                    } while (0 <= var12_10);
                }
                v1 = -1;
            }
            nonZeroDigits = v1 + 1;
            if (isoZeroes) ** GOTO lbl-1000
            if (nonZeroDigits < 3) {
                Intrinsics.checkNotNullExpressionValue($this$appendFractional.append(fracString, 0, nonZeroDigits), "append(...)");
            } else lbl-1000:
            // 2 sources

            {
                Intrinsics.checkNotNullExpressionValue($this$appendFractional.append(fracString, 0, (nonZeroDigits + 2) / 3 * 3), "append(...)");
            }
        }
        var2_1.append((String)var6_5);
    }

    public static final double div-LRDsOJo(long arg0, long other) {
        DurationUnit coarserUnit = (DurationUnit)((Object)ComparisonsKt.maxOf((Comparable)((Object)Duration.getStorageUnit-impl(arg0)), (Comparable)((Object)Duration.getStorageUnit-impl(other))));
        return Duration.toDouble-impl(arg0, coarserUnit) / Duration.toDouble-impl(other, coarserUnit);
    }

    public static final <T> T toComponents-impl(long arg0, @NotNull Function3<? super Long, ? super Integer, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        boolean bl = false;
        return action.invoke(Duration.getInWholeMinutes-impl(arg0), Duration.getSecondsComponent-impl(arg0), Duration.getNanosecondsComponent-impl(arg0));
    }

    @PublishedApi
    public static /* synthetic */ void getMinutesComponent$annotations() {
    }

    public static final int getSecondsComponent-impl(long arg0) {
        return Duration.isInfinite-impl(arg0) ? 0 : (int)(Duration.getInWholeSeconds-impl(arg0) % (long)60);
    }

    /*
     * WARNING - void declaration
     */
    public static final long truncateTo-UwyO8pc$kotlin_stdlib(long arg0, @NotNull DurationUnit unit) {
        void var3_2;
        Intrinsics.checkNotNullParameter((Object)unit, "unit");
        DurationUnit storageUnit = Duration.getStorageUnit-impl(arg0);
        if (unit.compareTo((Enum)storageUnit) <= 0 || Duration.isInfinite-impl(arg0)) {
            return arg0;
        }
        long scale = DurationUnitKt.convertDurationUnit(1L, unit, storageUnit);
        long result = Duration.getValue-impl(arg0) - Duration.getValue-impl(arg0) % scale;
        return DurationKt.toDuration(result, (DurationUnit)var3_2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final long times-UwyO8pc(long arg0, int scale) {
        long l;
        if (Duration.isInfinite-impl(arg0)) {
            long l2;
            if (scale == 0) {
                throw new IllegalArgumentException("Multiplying infinite duration by zero yields an undefined result.");
            }
            if (scale > 0) {
                l2 = arg0;
                return l2;
            }
            l2 = Duration.unaryMinus-UwyO8pc(arg0);
            return l2;
        }
        if (scale == 0) {
            return ZERO;
        }
        long value = Duration.getValue-impl(arg0);
        long result = value * (long)scale;
        if (Duration.isInNanos-impl(arg0)) {
            if (new LongRange(-2147483647L, Integer.MAX_VALUE).contains(value)) {
                l = DurationKt.access$durationOfNanos(result);
                return l;
            }
            if (result / (long)scale == value) {
                l = DurationKt.access$durationOfNanosNormalized(result);
                return l;
            }
            long millis = DurationKt.access$nanosToMillis(value);
            long remNanos = value - DurationKt.access$millisToNanos(millis);
            long resultMillis = millis * (long)scale;
            long totalMillis = resultMillis + DurationKt.access$nanosToMillis(remNanos * (long)scale);
            if (resultMillis / (long)scale == millis) {
                if ((totalMillis ^ resultMillis) >= 0L) {
                    l = DurationKt.access$durationOfMillis(RangesKt.coerceIn(totalMillis, new LongRange(-4611686018427387903L, 0x3FFFFFFFFFFFFFFFL)));
                    return l;
                }
            }
            if (MathKt.getSign(value) * MathKt.getSign(scale) > 0) {
                l = INFINITE;
                return l;
            }
            l = NEG_INFINITE;
            return l;
        }
        if (result / (long)scale == value) {
            l = DurationKt.access$durationOfMillis(RangesKt.coerceIn(result, new LongRange(-4611686018427387903L, 0x3FFFFFFFFFFFFFFFL)));
            return l;
        }
        if (MathKt.getSign(value) * MathKt.getSign(scale) > 0) {
            l = INFINITE;
            return l;
        }
        l = NEG_INFINITE;
        return l;
    }

    public static final long getInWholeMinutes-impl(long arg0) {
        return Duration.toLong-impl(arg0, DurationUnit.MINUTES);
    }

    private /* synthetic */ Duration(long rawValue) {
        this.rawValue = rawValue;
    }

    public static int hashCode-impl(long arg0) {
        return Long.hashCode(arg0);
    }

    public static final int getNanosecondsComponent-impl(long arg0) {
        return Duration.isInfinite-impl(arg0) ? 0 : (Duration.isInMillis-impl(arg0) ? (int)DurationKt.access$millisToNanos(Duration.getValue-impl(arg0) % (long)1000) : (int)(Duration.getValue-impl(arg0) % (long)1000000000));
    }

    public static final long minus-LRDsOJo(long arg0, long other) {
        return Duration.plus-LRDsOJo(arg0, Duration.unaryMinus-UwyO8pc(other));
    }

    @Deprecated(message="Use inWholeNanoseconds property instead or convert toDouble(NANOSECONDS) if a double value is required.", replaceWith=@ReplaceWith(expression="toDouble(DurationUnit.NANOSECONDS)", imports={}))
    @DeprecatedSinceKotlin(warningSince="1.5", errorSince="1.8", hiddenSince="1.9")
    @ExperimentalTime
    public static /* synthetic */ void getInNanoseconds$annotations() {
    }

    private static final long addValuesMixedRanges-UwyO8pc(long arg0, long thisMillis, long otherNanos) {
        long l;
        long otherMillis = DurationKt.access$nanosToMillis(otherNanos);
        long resultMillis = thisMillis + otherMillis;
        if (new LongRange(-4611686018426L, 4611686018426L).contains(resultMillis)) {
            long otherNanoRemainder = otherNanos - DurationKt.access$millisToNanos(otherMillis);
            l = DurationKt.access$durationOfNanos(DurationKt.access$millisToNanos(resultMillis) + otherNanoRemainder);
        } else {
            l = DurationKt.access$durationOfMillis(RangesKt.coerceIn(resultMillis, -4611686018427387903L, 0x3FFFFFFFFFFFFFFFL));
        }
        return l;
    }

    /*
     * WARNING - void declaration
     */
    public static int compareTo-LRDsOJo(long arg0, long other) {
        void var6_4;
        block3: {
            block2: {
                long compareBits = arg0 ^ other;
                if (compareBits < 0L) break block2;
                if (((int)compareBits & 1) != 0) break block3;
            }
            return Intrinsics.compare(arg0, other);
        }
        boolean bl = false;
        bl = false;
        int r = ((int)arg0 & 1) - ((int)other & 1);
        return Duration.isNegative-impl(arg0) ? -r : var6_4;
    }

    public static final /* synthetic */ Duration box-impl(long v) {
        return new Duration(v);
    }

    public static /* synthetic */ String toString-impl$default(long l, DurationUnit durationUnit, int n, int n2, Object object) {
        if ((n2 & 2) != 0) {
            n = 0;
        }
        return Duration.toString-impl(l, durationUnit, n);
    }

    /*
     * WARNING - void declaration
     */
    public static final long div-UwyO8pc(long arg0, int scale) {
        void var3_2;
        if (scale == 0) {
            long l;
            if (Duration.isPositive-impl(arg0)) {
                l = INFINITE;
            } else if (Duration.isNegative-impl(arg0)) {
                l = NEG_INFINITE;
            } else {
                throw new IllegalArgumentException("Dividing zero duration by zero yields an undefined result.");
            }
            return l;
        }
        if (Duration.isInNanos-impl(arg0)) {
            return DurationKt.access$durationOfNanos(Duration.getValue-impl(arg0) / (long)scale);
        }
        if (Duration.isInfinite-impl(arg0)) {
            return Duration.times-UwyO8pc(arg0, MathKt.getSign(scale));
        }
        long result = Duration.getValue-impl(arg0) / (long)scale;
        if (new LongRange(-4611686018426L, 4611686018426L).contains(result)) {
            long rem = DurationKt.access$millisToNanos(Duration.getValue-impl(arg0) - result * (long)scale) / (long)scale;
            return DurationKt.access$durationOfNanos(DurationKt.access$millisToNanos(result) + rem);
        }
        return DurationKt.access$durationOfMillis((long)var3_2);
    }

    public static final int getMinutesComponent-impl(long arg0) {
        return Duration.isInfinite-impl(arg0) ? 0 : (int)(Duration.getInWholeMinutes-impl(arg0) % (long)60);
    }

    /*
     * Illegal identifiers - consider using --renameillegalidents true
     */
    @Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b&\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0007\u00a2\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u000fH\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\b\f\u0010\u0010J\u001a\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0011H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\b\f\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0013\u0010\rJ\u001a\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u000fH\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0013\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0011H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0013\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0015\u0010\rJ\u001a\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u000fH\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0015\u0010\u0010J\u001a\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0011H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0015\u0010\u0012J\u001a\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0017\u0010\rJ\u001a\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u000fH\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0017\u0010\u0010J\u001a\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0011H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0017\u0010\u0012J\u001a\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0019\u0010\rJ\u001a\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u000fH\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0019\u0010\u0010J\u001a\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0011H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0019\u0010\u0012J\u001a\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u001b\u0010\rJ\u001a\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u000fH\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u001b\u0010\u0010J\u001a\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0011H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u001b\u0010\u0012J\u0018\u0010 \u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u001d\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\"\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u001d\u00f8\u0001\u0000\u00a2\u0006\u0004\b!\u0010\u001fJ\u001a\u0010%\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u001d\u00f8\u0001\u0000\u00a2\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u001d\u00f8\u0001\u0000\u00a2\u0006\u0004\b&\u0010$J\u001a\u0010)\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\b(\u0010\rJ\u001a\u0010)\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u000fH\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\b(\u0010\u0010J\u001a\u0010)\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0011H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\b(\u0010\u0012R\u001a\u0010*\u001a\u00020\u000b8\u0006\u00f8\u0001\u0000\u00a2\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001d\u0010.\u001a\u00020\u000b8\u0000X\u0080\u0004\u00f8\u0001\u0000\u00a2\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b/\u0010-R\u001a\u00100\u001a\u00020\u000b8\u0006\u00f8\u0001\u0000\u00a2\u0006\f\n\u0004\b0\u0010+\u001a\u0004\b1\u0010-R\"\u0010\u000e\u001a\u00020\u000b*\u00020\u00048\u00c6\u0002X\u0087\u0004\u00f8\u0001\u0000\u00a2\u0006\f\u0012\u0004\b3\u00104\u001a\u0004\b2\u0010\rR\"\u0010\u000e\u001a\u00020\u000b*\u00020\u000f8\u00c6\u0002X\u0087\u0004\u00f8\u0001\u0000\u00a2\u0006\f\u0012\u0004\b3\u00105\u001a\u0004\b2\u0010\u0010R\"\u0010\u000e\u001a\u00020\u000b*\u00020\u00118\u00c6\u0002X\u0087\u0004\u00f8\u0001\u0000\u00a2\u0006\f\u0012\u0004\b3\u00106\u001a\u0004\b2\u0010\u0012R\"\u0010\u0014\u001a\u00020\u000b*\u00020\u00048\u00c6\u0002X\u0087\u0004\u00f8\u0001\u0000\u00a2\u0006\f\u0012\u0004\b8\u00104\u001a\u0004\b7\u0010\rR\"\u0010\u0014\u001a\u00020\u000b*\u00020\u000f8\u00c6\u0002X\u0087\u0004\u00f8\u0001\u0000\u00a2\u0006\f\u0012\u0004\b8\u00105\u001a\u0004\b7\u0010\u0010R\"\u0010\u0014\u001a\u00020\u000b*\u00020\u00118\u00c6\u0002X\u0087\u0004\u00f8\u0001\u0000\u00a2\u0006\f\u0012\u0004\b8\u00106\u001a\u0004\b7\u0010\u0012R\"\u0010\u0016\u001a\u00020\u000b*\u00020\u00048\u00c6\u0002X\u0087\u0004\u00f8\u0001\u0000\u00a2\u0006\f\u0012\u0004\b:\u00104\u001a\u0004\b9\u0010\rR\"\u0010\u0016\u001a\u00020\u000b*\u00020\u000f8\u00c6\u0002X\u0087\u0004\u00f8\u0001\u0000\u00a2\u0006\f\u0012\u0004\b:\u00105\u001a\u0004\b9\u0010\u0010R\"\u0010\u0016\u001a\u00020\u000b*\u00020\u00118\u00c6\u0002X\u0087\u0004\u00f8\u0001\u0000\u00a2\u0006\f\u0012\u0004\b:\u00106\u001a\u0004\b9\u0010\u0012R\"\u0010\u0018\u001a\u00020\u000b*\u00020\u00048\u00c6\u0002X\u0087\u0004\u00f8\u0001\u0000\u00a2\u0006\f\u0012\u0004\b<\u00104\u001a\u0004\b;\u0010\rR\"\u0010\u0018\u001a\u00020\u000b*\u00020\u000f8\u00c6\u0002X\u0087\u0004\u00f8\u0001\u0000\u00a2\u0006\f\u0012\u0004\b<\u00105\u001a\u0004\b;\u0010\u0010R\"\u0010\u0018\u001a\u00020\u000b*\u00020\u00118\u00c6\u0002X\u0087\u0004\u00f8\u0001\u0000\u00a2\u0006\f\u0012\u0004\b<\u00106\u001a\u0004\b;\u0010\u0012R\"\u0010\u001a\u001a\u00020\u000b*\u00020\u00048\u00c6\u0002X\u0087\u0004\u00f8\u0001\u0000\u00a2\u0006\f\u0012\u0004\b>\u00104\u001a\u0004\b=\u0010\rR\"\u0010\u001a\u001a\u00020\u000b*\u00020\u000f8\u00c6\u0002X\u0087\u0004\u00f8\u0001\u0000\u00a2\u0006\f\u0012\u0004\b>\u00105\u001a\u0004\b=\u0010\u0010R\"\u0010\u001a\u001a\u00020\u000b*\u00020\u00118\u00c6\u0002X\u0087\u0004\u00f8\u0001\u0000\u00a2\u0006\f\u0012\u0004\b>\u00106\u001a\u0004\b=\u0010\u0012R\"\u0010\u001c\u001a\u00020\u000b*\u00020\u00048\u00c6\u0002X\u0087\u0004\u00f8\u0001\u0000\u00a2\u0006\f\u0012\u0004\b@\u00104\u001a\u0004\b?\u0010\rR\"\u0010\u001c\u001a\u00020\u000b*\u00020\u000f8\u00c6\u0002X\u0087\u0004\u00f8\u0001\u0000\u00a2\u0006\f\u0012\u0004\b@\u00105\u001a\u0004\b?\u0010\u0010R\"\u0010\u001c\u001a\u00020\u000b*\u00020\u00118\u00c6\u0002X\u0087\u0004\u00f8\u0001\u0000\u00a2\u0006\f\u0012\u0004\b@\u00106\u001a\u0004\b?\u0010\u0012R\"\u0010)\u001a\u00020\u000b*\u00020\u00048\u00c6\u0002X\u0087\u0004\u00f8\u0001\u0000\u00a2\u0006\f\u0012\u0004\bB\u00104\u001a\u0004\bA\u0010\rR\"\u0010)\u001a\u00020\u000b*\u00020\u000f8\u00c6\u0002X\u0087\u0004\u00f8\u0001\u0000\u00a2\u0006\f\u0012\u0004\bB\u00105\u001a\u0004\bA\u0010\u0010R\"\u0010)\u001a\u00020\u000b*\u00020\u00118\u00c6\u0002X\u0087\u0004\u00f8\u0001\u0000\u00a2\u0006\f\u0012\u0004\bB\u00106\u001a\u0004\bA\u0010\u0012\u0082\u0002\u0004\n\u0002\b!\u00a8\u0006C"}, d2={"Lkotlin/time/Duration$Companion;", "", "<init>", "()V", "", "value", "Lkotlin/time/DurationUnit;", "sourceUnit", "targetUnit", "convert", "(DLkotlin/time/DurationUnit;Lkotlin/time/DurationUnit;)D", "Lkotlin/time/Duration;", "days-UwyO8pc", "(D)J", "days", "", "(I)J", "", "(J)J", "hours-UwyO8pc", "hours", "microseconds-UwyO8pc", "microseconds", "milliseconds-UwyO8pc", "milliseconds", "minutes-UwyO8pc", "minutes", "nanoseconds-UwyO8pc", "nanoseconds", "", "parse-UwyO8pc", "(Ljava/lang/String;)J", "parse", "parseIsoString-UwyO8pc", "parseIsoString", "parseIsoStringOrNull-FghU774", "(Ljava/lang/String;)Lkotlin/time/Duration;", "parseIsoStringOrNull", "parseOrNull-FghU774", "parseOrNull", "seconds-UwyO8pc", "seconds", "INFINITE", "J", "getINFINITE-UwyO8pc", "()J", "NEG_INFINITE", "getNEG_INFINITE-UwyO8pc$kotlin_stdlib", "ZERO", "getZERO-UwyO8pc", "getDays-UwyO8pc", "getDays-UwyO8pc$annotations", "(D)V", "(I)V", "(J)V", "getHours-UwyO8pc", "getHours-UwyO8pc$annotations", "getMicroseconds-UwyO8pc", "getMicroseconds-UwyO8pc$annotations", "getMilliseconds-UwyO8pc", "getMilliseconds-UwyO8pc$annotations", "getMinutes-UwyO8pc", "getMinutes-UwyO8pc$annotations", "getNanoseconds-UwyO8pc", "getNanoseconds-UwyO8pc$annotations", "getSeconds-UwyO8pc", "getSeconds-UwyO8pc$annotations", "kotlin-stdlib"})
    public static final class Companion {
        private final long getSeconds-UwyO8pc(long $this$seconds) {
            return DurationKt.toDuration($this$seconds, DurationUnit.SECONDS);
        }

        @InlineOnly
        public static /* synthetic */ void getMinutes-UwyO8pc$annotations(double d) {
        }

        private final long getMinutes-UwyO8pc(int $this$minutes) {
            return DurationKt.toDuration($this$minutes, DurationUnit.MINUTES);
        }

        @InlineOnly
        public static /* synthetic */ void getDays-UwyO8pc$annotations(long l) {
        }

        @Deprecated(message="Use 'Long.seconds' extension property from Duration.Companion instead.", replaceWith=@ReplaceWith(expression="value.seconds", imports={"kotlin.time.Duration.Companion.seconds"}))
        @DeprecatedSinceKotlin(warningSince="1.6", errorSince="1.8", hiddenSince="1.9")
        @ExperimentalTime
        @SinceKotlin(version="1.5")
        public final /* synthetic */ long seconds-UwyO8pc(long value) {
            return DurationKt.toDuration(value, DurationUnit.SECONDS);
        }

        @InlineOnly
        public static /* synthetic */ void getDays-UwyO8pc$annotations(double d) {
        }

        @InlineOnly
        public static /* synthetic */ void getMinutes-UwyO8pc$annotations(long l) {
        }

        @InlineOnly
        public static /* synthetic */ void getDays-UwyO8pc$annotations(int n) {
        }

        private final long getNanoseconds-UwyO8pc(double $this$nanoseconds) {
            return DurationKt.toDuration($this$nanoseconds, DurationUnit.NANOSECONDS);
        }

        @Deprecated(message="Use 'Long.minutes' extension property from Duration.Companion instead.", replaceWith=@ReplaceWith(expression="value.minutes", imports={"kotlin.time.Duration.Companion.minutes"}))
        @DeprecatedSinceKotlin(warningSince="1.6", errorSince="1.8", hiddenSince="1.9")
        @SinceKotlin(version="1.5")
        @ExperimentalTime
        public final /* synthetic */ long minutes-UwyO8pc(long value) {
            return DurationKt.toDuration(value, DurationUnit.MINUTES);
        }

        @InlineOnly
        public static /* synthetic */ void getNanoseconds-UwyO8pc$annotations(double d) {
        }

        @Deprecated(message="Use 'Int.seconds' extension property from Duration.Companion instead.", replaceWith=@ReplaceWith(expression="value.seconds", imports={"kotlin.time.Duration.Companion.seconds"}))
        @DeprecatedSinceKotlin(warningSince="1.6", errorSince="1.8", hiddenSince="1.9")
        @SinceKotlin(version="1.5")
        @ExperimentalTime
        public final /* synthetic */ long seconds-UwyO8pc(int value) {
            return DurationKt.toDuration(value, DurationUnit.SECONDS);
        }

        private final long getMilliseconds-UwyO8pc(double $this$milliseconds) {
            return DurationKt.toDuration($this$milliseconds, DurationUnit.MILLISECONDS);
        }

        private final long getMilliseconds-UwyO8pc(long $this$milliseconds) {
            return DurationKt.toDuration($this$milliseconds, DurationUnit.MILLISECONDS);
        }

        @InlineOnly
        public static /* synthetic */ void getSeconds-UwyO8pc$annotations(double d) {
        }

        private final long getMinutes-UwyO8pc(double $this$minutes) {
            return DurationKt.toDuration($this$minutes, DurationUnit.MINUTES);
        }

        public final long getINFINITE-UwyO8pc() {
            return INFINITE;
        }

        @Deprecated(message="Use 'Double.days' extension property from Duration.Companion instead.", replaceWith=@ReplaceWith(expression="value.days", imports={"kotlin.time.Duration.Companion.days"}))
        @DeprecatedSinceKotlin(warningSince="1.6", errorSince="1.8", hiddenSince="1.9")
        @SinceKotlin(version="1.5")
        @ExperimentalTime
        public final /* synthetic */ long days-UwyO8pc(double value) {
            return DurationKt.toDuration(value, DurationUnit.DAYS);
        }

        @InlineOnly
        public static /* synthetic */ void getHours-UwyO8pc$annotations(long l) {
        }

        private final long getDays-UwyO8pc(long $this$days) {
            return DurationKt.toDuration($this$days, DurationUnit.DAYS);
        }

        @InlineOnly
        public static /* synthetic */ void getMilliseconds-UwyO8pc$annotations(double d) {
        }

        public final long parseIsoString-UwyO8pc(@NotNull String value) {
            long l;
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                l = DurationKt.access$parseDuration(value, true);
            }
            catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("Invalid ISO duration string format: '" + value + "'.", e);
            }
            return l;
        }

        @Deprecated(message="Use 'Int.nanoseconds' extension property from Duration.Companion instead.", replaceWith=@ReplaceWith(expression="value.nanoseconds", imports={"kotlin.time.Duration.Companion.nanoseconds"}))
        @DeprecatedSinceKotlin(warningSince="1.6", errorSince="1.8", hiddenSince="1.9")
        @ExperimentalTime
        @SinceKotlin(version="1.5")
        public final /* synthetic */ long nanoseconds-UwyO8pc(int value) {
            return DurationKt.toDuration(value, DurationUnit.NANOSECONDS);
        }

        @DeprecatedSinceKotlin(warningSince="1.6", errorSince="1.8", hiddenSince="1.9")
        @Deprecated(message="Use 'Double.hours' extension property from Duration.Companion instead.", replaceWith=@ReplaceWith(expression="value.hours", imports={"kotlin.time.Duration.Companion.hours"}))
        @SinceKotlin(version="1.5")
        @ExperimentalTime
        public final /* synthetic */ long hours-UwyO8pc(double value) {
            return DurationKt.toDuration(value, DurationUnit.HOURS);
        }

        @Deprecated(message="Use 'Long.hours' extension property from Duration.Companion instead.", replaceWith=@ReplaceWith(expression="value.hours", imports={"kotlin.time.Duration.Companion.hours"}))
        @DeprecatedSinceKotlin(warningSince="1.6", errorSince="1.8", hiddenSince="1.9")
        @ExperimentalTime
        @SinceKotlin(version="1.5")
        public final /* synthetic */ long hours-UwyO8pc(long value) {
            return DurationKt.toDuration(value, DurationUnit.HOURS);
        }

        private final long getNanoseconds-UwyO8pc(long $this$nanoseconds) {
            return DurationKt.toDuration($this$nanoseconds, DurationUnit.NANOSECONDS);
        }

        private final long getSeconds-UwyO8pc(int $this$seconds) {
            return DurationKt.toDuration($this$seconds, DurationUnit.SECONDS);
        }

        @Deprecated(message="Use 'Int.days' extension property from Duration.Companion instead.", replaceWith=@ReplaceWith(expression="value.days", imports={"kotlin.time.Duration.Companion.days"}))
        @DeprecatedSinceKotlin(warningSince="1.6", errorSince="1.8", hiddenSince="1.9")
        @SinceKotlin(version="1.5")
        @ExperimentalTime
        public final /* synthetic */ long days-UwyO8pc(int value) {
            return DurationKt.toDuration(value, DurationUnit.DAYS);
        }

        @InlineOnly
        public static /* synthetic */ void getNanoseconds-UwyO8pc$annotations(int n) {
        }

        @DeprecatedSinceKotlin(warningSince="1.6", errorSince="1.8", hiddenSince="1.9")
        @Deprecated(message="Use 'Long.milliseconds' extension property from Duration.Companion instead.", replaceWith=@ReplaceWith(expression="value.milliseconds", imports={"kotlin.time.Duration.Companion.milliseconds"}))
        @ExperimentalTime
        @SinceKotlin(version="1.5")
        public final /* synthetic */ long milliseconds-UwyO8pc(long value) {
            return DurationKt.toDuration(value, DurationUnit.MILLISECONDS);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }

        private final long getMilliseconds-UwyO8pc(int $this$milliseconds) {
            return DurationKt.toDuration($this$milliseconds, DurationUnit.MILLISECONDS);
        }

        public final long getZERO-UwyO8pc() {
            return ZERO;
        }

        private final long getHours-UwyO8pc(int $this$hours) {
            return DurationKt.toDuration($this$hours, DurationUnit.HOURS);
        }

        @InlineOnly
        public static /* synthetic */ void getNanoseconds-UwyO8pc$annotations(long l) {
        }

        @InlineOnly
        public static /* synthetic */ void getMicroseconds-UwyO8pc$annotations(double d) {
        }

        @InlineOnly
        public static /* synthetic */ void getHours-UwyO8pc$annotations(int n) {
        }

        @Nullable
        public final Duration parseOrNull-FghU774(@NotNull String value) {
            Duration duration;
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                duration = Duration.box-impl(DurationKt.access$parseDuration(value, false));
            }
            catch (IllegalArgumentException e) {
                duration = null;
            }
            return duration;
        }

        @InlineOnly
        public static /* synthetic */ void getMilliseconds-UwyO8pc$annotations(int n) {
        }

        private final long getNanoseconds-UwyO8pc(int $this$nanoseconds) {
            return DurationKt.toDuration($this$nanoseconds, DurationUnit.NANOSECONDS);
        }

        @InlineOnly
        public static /* synthetic */ void getSeconds-UwyO8pc$annotations(long l) {
        }

        private Companion() {
        }

        @InlineOnly
        public static /* synthetic */ void getSeconds-UwyO8pc$annotations(int n) {
        }

        private final long getSeconds-UwyO8pc(double $this$seconds) {
            return DurationKt.toDuration($this$seconds, DurationUnit.SECONDS);
        }

        @Deprecated(message="Use 'Int.microseconds' extension property from Duration.Companion instead.", replaceWith=@ReplaceWith(expression="value.microseconds", imports={"kotlin.time.Duration.Companion.microseconds"}))
        @DeprecatedSinceKotlin(warningSince="1.6", errorSince="1.8", hiddenSince="1.9")
        @ExperimentalTime
        @SinceKotlin(version="1.5")
        public final /* synthetic */ long microseconds-UwyO8pc(int value) {
            return DurationKt.toDuration(value, DurationUnit.MICROSECONDS);
        }

        @DeprecatedSinceKotlin(warningSince="1.6", errorSince="1.8", hiddenSince="1.9")
        @Deprecated(message="Use 'Double.microseconds' extension property from Duration.Companion instead.", replaceWith=@ReplaceWith(expression="value.microseconds", imports={"kotlin.time.Duration.Companion.microseconds"}))
        @SinceKotlin(version="1.5")
        @ExperimentalTime
        public final /* synthetic */ long microseconds-UwyO8pc(double value) {
            return DurationKt.toDuration(value, DurationUnit.MICROSECONDS);
        }

        @DeprecatedSinceKotlin(warningSince="1.6", errorSince="1.8", hiddenSince="1.9")
        @Deprecated(message="Use 'Long.days' extension property from Duration.Companion instead.", replaceWith=@ReplaceWith(expression="value.days", imports={"kotlin.time.Duration.Companion.days"}))
        @SinceKotlin(version="1.5")
        @ExperimentalTime
        public final /* synthetic */ long days-UwyO8pc(long value) {
            return DurationKt.toDuration(value, DurationUnit.DAYS);
        }

        @Deprecated(message="Use 'Long.nanoseconds' extension property from Duration.Companion instead.", replaceWith=@ReplaceWith(expression="value.nanoseconds", imports={"kotlin.time.Duration.Companion.nanoseconds"}))
        @DeprecatedSinceKotlin(warningSince="1.6", errorSince="1.8", hiddenSince="1.9")
        @ExperimentalTime
        @SinceKotlin(version="1.5")
        public final /* synthetic */ long nanoseconds-UwyO8pc(long value) {
            return DurationKt.toDuration(value, DurationUnit.NANOSECONDS);
        }

        @ExperimentalTime
        public final double convert(double value, @NotNull DurationUnit sourceUnit, @NotNull DurationUnit targetUnit) {
            Intrinsics.checkNotNullParameter((Object)sourceUnit, "sourceUnit");
            Intrinsics.checkNotNullParameter((Object)targetUnit, "targetUnit");
            return DurationUnitKt.convertDurationUnit(value, sourceUnit, targetUnit);
        }

        private final long getMicroseconds-UwyO8pc(long $this$microseconds) {
            return DurationKt.toDuration($this$microseconds, DurationUnit.MICROSECONDS);
        }

        private final long getDays-UwyO8pc(int $this$days) {
            return DurationKt.toDuration($this$days, DurationUnit.DAYS);
        }

        @DeprecatedSinceKotlin(warningSince="1.6", errorSince="1.8", hiddenSince="1.9")
        @Deprecated(message="Use 'Double.minutes' extension property from Duration.Companion instead.", replaceWith=@ReplaceWith(expression="value.minutes", imports={"kotlin.time.Duration.Companion.minutes"}))
        @SinceKotlin(version="1.5")
        @ExperimentalTime
        public final /* synthetic */ long minutes-UwyO8pc(double value) {
            return DurationKt.toDuration(value, DurationUnit.MINUTES);
        }

        @DeprecatedSinceKotlin(warningSince="1.6", errorSince="1.8", hiddenSince="1.9")
        @Deprecated(message="Use 'Int.milliseconds' extension property from Duration.Companion instead.", replaceWith=@ReplaceWith(expression="value.milliseconds", imports={"kotlin.time.Duration.Companion.milliseconds"}))
        @SinceKotlin(version="1.5")
        @ExperimentalTime
        public final /* synthetic */ long milliseconds-UwyO8pc(int value) {
            return DurationKt.toDuration(value, DurationUnit.MILLISECONDS);
        }

        @InlineOnly
        public static /* synthetic */ void getMicroseconds-UwyO8pc$annotations(long l) {
        }

        @InlineOnly
        public static /* synthetic */ void getMilliseconds-UwyO8pc$annotations(long l) {
        }

        private final long getHours-UwyO8pc(double $this$hours) {
            return DurationKt.toDuration($this$hours, DurationUnit.HOURS);
        }

        private final long getMinutes-UwyO8pc(long $this$minutes) {
            return DurationKt.toDuration($this$minutes, DurationUnit.MINUTES);
        }

        private final long getHours-UwyO8pc(long $this$hours) {
            return DurationKt.toDuration($this$hours, DurationUnit.HOURS);
        }

        private final long getMicroseconds-UwyO8pc(double $this$microseconds) {
            return DurationKt.toDuration($this$microseconds, DurationUnit.MICROSECONDS);
        }

        public final long parse-UwyO8pc(@NotNull String value) {
            long l;
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                l = DurationKt.access$parseDuration(value, false);
            }
            catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("Invalid duration string format: '" + value + "'.", e);
            }
            return l;
        }

        @DeprecatedSinceKotlin(warningSince="1.6", errorSince="1.8", hiddenSince="1.9")
        @Deprecated(message="Use 'Double.nanoseconds' extension property from Duration.Companion instead.", replaceWith=@ReplaceWith(expression="value.nanoseconds", imports={"kotlin.time.Duration.Companion.nanoseconds"}))
        @SinceKotlin(version="1.5")
        @ExperimentalTime
        public final /* synthetic */ long nanoseconds-UwyO8pc(double value) {
            return DurationKt.toDuration(value, DurationUnit.NANOSECONDS);
        }

        @InlineOnly
        public static /* synthetic */ void getHours-UwyO8pc$annotations(double d) {
        }

        @DeprecatedSinceKotlin(warningSince="1.6", errorSince="1.8", hiddenSince="1.9")
        @Deprecated(message="Use 'Double.seconds' extension property from Duration.Companion instead.", replaceWith=@ReplaceWith(expression="value.seconds", imports={"kotlin.time.Duration.Companion.seconds"}))
        @ExperimentalTime
        @SinceKotlin(version="1.5")
        public final /* synthetic */ long seconds-UwyO8pc(double value) {
            return DurationKt.toDuration(value, DurationUnit.SECONDS);
        }

        @Deprecated(message="Use 'Int.hours' extension property from Duration.Companion instead.", replaceWith=@ReplaceWith(expression="value.hours", imports={"kotlin.time.Duration.Companion.hours"}))
        @DeprecatedSinceKotlin(warningSince="1.6", errorSince="1.8", hiddenSince="1.9")
        @ExperimentalTime
        @SinceKotlin(version="1.5")
        public final /* synthetic */ long hours-UwyO8pc(int value) {
            return DurationKt.toDuration(value, DurationUnit.HOURS);
        }

        @Deprecated(message="Use 'Int.minutes' extension property from Duration.Companion instead.", replaceWith=@ReplaceWith(expression="value.minutes", imports={"kotlin.time.Duration.Companion.minutes"}))
        @DeprecatedSinceKotlin(warningSince="1.6", errorSince="1.8", hiddenSince="1.9")
        @SinceKotlin(version="1.5")
        @ExperimentalTime
        public final /* synthetic */ long minutes-UwyO8pc(int value) {
            return DurationKt.toDuration(value, DurationUnit.MINUTES);
        }

        public final long getNEG_INFINITE-UwyO8pc$kotlin_stdlib() {
            return NEG_INFINITE;
        }

        @InlineOnly
        public static /* synthetic */ void getMicroseconds-UwyO8pc$annotations(int n) {
        }

        @Nullable
        public final Duration parseIsoStringOrNull-FghU774(@NotNull String value) {
            Duration duration;
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                duration = Duration.box-impl(DurationKt.access$parseDuration(value, true));
            }
            catch (IllegalArgumentException e) {
                duration = null;
            }
            return duration;
        }

        private final long getDays-UwyO8pc(double $this$days) {
            return DurationKt.toDuration($this$days, DurationUnit.DAYS);
        }

        @InlineOnly
        public static /* synthetic */ void getMinutes-UwyO8pc$annotations(int n) {
        }

        private final long getMicroseconds-UwyO8pc(int $this$microseconds) {
            return DurationKt.toDuration($this$microseconds, DurationUnit.MICROSECONDS);
        }

        @Deprecated(message="Use 'Double.milliseconds' extension property from Duration.Companion instead.", replaceWith=@ReplaceWith(expression="value.milliseconds", imports={"kotlin.time.Duration.Companion.milliseconds"}))
        @DeprecatedSinceKotlin(warningSince="1.6", errorSince="1.8", hiddenSince="1.9")
        @SinceKotlin(version="1.5")
        @ExperimentalTime
        public final /* synthetic */ long milliseconds-UwyO8pc(double value) {
            return DurationKt.toDuration(value, DurationUnit.MILLISECONDS);
        }

        @DeprecatedSinceKotlin(warningSince="1.6", errorSince="1.8", hiddenSince="1.9")
        @Deprecated(message="Use 'Long.microseconds' extension property from Duration.Companion instead.", replaceWith=@ReplaceWith(expression="value.microseconds", imports={"kotlin.time.Duration.Companion.microseconds"}))
        @ExperimentalTime
        @SinceKotlin(version="1.5")
        public final /* synthetic */ long microseconds-UwyO8pc(long value) {
            return DurationKt.toDuration(value, DurationUnit.MICROSECONDS);
        }
    }
}

