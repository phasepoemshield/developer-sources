/*
 * Decompiled with CFR 0.152.
 */
package kotlin.time;

import java.util.Collection;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.collections.IntIterator;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.CharRange;
import kotlin.ranges.IntRange;
import kotlin.ranges.LongRange;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlin.time.DurationUnit;
import kotlin.time.DurationUnitKt;
import kotlin.time.ExperimentalTime;
import org.jetbrains.annotations.NotNull;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@Metadata(mv={1, 9, 0}, k=2, xi=48, d1={"\u0000>\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b&\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0000H\u0002\u00a2\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0000H\u0002\u00a2\u0006\u0004\b\u000b\u0010\t\u001a\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0000H\u0002\u00a2\u0006\u0004\b\r\u0010\t\u001a\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0000H\u0002\u00a2\u0006\u0004\b\u000f\u0010\t\u001a\u0017\u0010\u0010\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0002\u00a2\u0006\u0004\b\u0010\u0010\t\u001a\u0017\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000H\u0002\u00a2\u0006\u0004\b\u0011\u0010\t\u001a\u001f\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002\u00a2\u0006\u0004\b\u0016\u0010\u0017\u001a\u0017\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\b\u0018\u0010\u0019\u001a0\u0010\u001e\u001a\u00020\u0002*\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00022\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00140\u001bH\u0082\b\u00a2\u0006\u0004\b\u001e\u0010\u001f\u001a0\u0010 \u001a\u00020\u0012*\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00022\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00140\u001bH\u0082\b\u00a2\u0006\u0004\b \u0010!\u001a\u001c\u0010&\u001a\u00020\u0004*\u00020\"2\u0006\u0010#\u001a\u00020\u0004H\u0087\n\u00a2\u0006\u0004\b$\u0010%\u001a\u001c\u0010&\u001a\u00020\u0004*\u00020\u00022\u0006\u0010#\u001a\u00020\u0004H\u0087\n\u00a2\u0006\u0004\b'\u0010(\u001a\u001b\u0010+\u001a\u00020\u0004*\u00020\"2\u0006\u0010*\u001a\u00020)H\u0007\u00a2\u0006\u0004\b+\u0010,\u001a\u001b\u0010+\u001a\u00020\u0004*\u00020\u00022\u0006\u0010*\u001a\u00020)H\u0007\u00a2\u0006\u0004\b+\u0010-\u001a\u001b\u0010+\u001a\u00020\u0004*\u00020\u00002\u0006\u0010*\u001a\u00020)H\u0007\u00a2\u0006\u0004\b+\u0010.\"\u0014\u0010/\u001a\u00020\u00008\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\b/\u00100\"\u0014\u00101\u001a\u00020\u00008\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\b1\u00100\"\u0014\u00102\u001a\u00020\u00008\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b2\u00100\"\u0014\u00103\u001a\u00020\u00028\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\b3\u00104\"\u001e\u00109\u001a\u00020\u0004*\u00020\"8FX\u0087\u0004\u00a2\u0006\f\u0012\u0004\b7\u00108\u001a\u0004\b5\u00106\"\u001e\u00109\u001a\u00020\u0004*\u00020\u00028FX\u0087\u0004\u00a2\u0006\f\u0012\u0004\b7\u0010;\u001a\u0004\b5\u0010:\"\u001e\u00109\u001a\u00020\u0004*\u00020\u00008FX\u0087\u0004\u00a2\u0006\f\u0012\u0004\b7\u0010<\u001a\u0004\b5\u0010\t\"\u001e\u0010?\u001a\u00020\u0004*\u00020\"8FX\u0087\u0004\u00a2\u0006\f\u0012\u0004\b>\u00108\u001a\u0004\b=\u00106\"\u001e\u0010?\u001a\u00020\u0004*\u00020\u00028FX\u0087\u0004\u00a2\u0006\f\u0012\u0004\b>\u0010;\u001a\u0004\b=\u0010:\"\u001e\u0010?\u001a\u00020\u0004*\u00020\u00008FX\u0087\u0004\u00a2\u0006\f\u0012\u0004\b>\u0010<\u001a\u0004\b=\u0010\t\"\u001e\u0010B\u001a\u00020\u0004*\u00020\"8FX\u0087\u0004\u00a2\u0006\f\u0012\u0004\bA\u00108\u001a\u0004\b@\u00106\"\u001e\u0010B\u001a\u00020\u0004*\u00020\u00028FX\u0087\u0004\u00a2\u0006\f\u0012\u0004\bA\u0010;\u001a\u0004\b@\u0010:\"\u001e\u0010B\u001a\u00020\u0004*\u00020\u00008FX\u0087\u0004\u00a2\u0006\f\u0012\u0004\bA\u0010<\u001a\u0004\b@\u0010\t\"\u001e\u0010E\u001a\u00020\u0004*\u00020\"8FX\u0087\u0004\u00a2\u0006\f\u0012\u0004\bD\u00108\u001a\u0004\bC\u00106\"\u001e\u0010E\u001a\u00020\u0004*\u00020\u00028FX\u0087\u0004\u00a2\u0006\f\u0012\u0004\bD\u0010;\u001a\u0004\bC\u0010:\"\u001e\u0010E\u001a\u00020\u0004*\u00020\u00008FX\u0087\u0004\u00a2\u0006\f\u0012\u0004\bD\u0010<\u001a\u0004\bC\u0010\t\"\u001e\u0010H\u001a\u00020\u0004*\u00020\"8FX\u0087\u0004\u00a2\u0006\f\u0012\u0004\bG\u00108\u001a\u0004\bF\u00106\"\u001e\u0010H\u001a\u00020\u0004*\u00020\u00028FX\u0087\u0004\u00a2\u0006\f\u0012\u0004\bG\u0010;\u001a\u0004\bF\u0010:\"\u001e\u0010H\u001a\u00020\u0004*\u00020\u00008FX\u0087\u0004\u00a2\u0006\f\u0012\u0004\bG\u0010<\u001a\u0004\bF\u0010\t\"\u001e\u0010K\u001a\u00020\u0004*\u00020\"8FX\u0087\u0004\u00a2\u0006\f\u0012\u0004\bJ\u00108\u001a\u0004\bI\u00106\"\u001e\u0010K\u001a\u00020\u0004*\u00020\u00028FX\u0087\u0004\u00a2\u0006\f\u0012\u0004\bJ\u0010;\u001a\u0004\bI\u0010:\"\u001e\u0010K\u001a\u00020\u0004*\u00020\u00008FX\u0087\u0004\u00a2\u0006\f\u0012\u0004\bJ\u0010<\u001a\u0004\bI\u0010\t\"\u001e\u0010N\u001a\u00020\u0004*\u00020\"8FX\u0087\u0004\u00a2\u0006\f\u0012\u0004\bM\u00108\u001a\u0004\bL\u00106\"\u001e\u0010N\u001a\u00020\u0004*\u00020\u00028FX\u0087\u0004\u00a2\u0006\f\u0012\u0004\bM\u0010;\u001a\u0004\bL\u0010:\"\u001e\u0010N\u001a\u00020\u0004*\u00020\u00008FX\u0087\u0004\u00a2\u0006\f\u0012\u0004\bM\u0010<\u001a\u0004\bL\u0010\t\u00a8\u0006O"}, d2={"", "normalValue", "", "unitDiscriminator", "Lkotlin/time/Duration;", "durationOf", "(JI)J", "normalMillis", "durationOfMillis", "(J)J", "millis", "durationOfMillisNormalized", "normalNanos", "durationOfNanos", "nanos", "durationOfNanosNormalized", "millisToNanos", "nanosToMillis", "", "value", "", "strictIso", "parseDuration", "(Ljava/lang/String;Z)J", "parseOverLongIsoComponent", "(Ljava/lang/String;)J", "startIndex", "Lkotlin/Function1;", "", "predicate", "skipWhile", "(Ljava/lang/String;ILkotlin/jvm/functions/Function1;)I", "substringWhile", "(Ljava/lang/String;ILkotlin/jvm/functions/Function1;)Ljava/lang/String;", "", "duration", "times-kIfJnKk", "(DJ)J", "times", "times-mvk6XK0", "(IJ)J", "Lkotlin/time/DurationUnit;", "unit", "toDuration", "(DLkotlin/time/DurationUnit;)J", "(ILkotlin/time/DurationUnit;)J", "(JLkotlin/time/DurationUnit;)J", "MAX_MILLIS", "J", "MAX_NANOS", "MAX_NANOS_IN_MILLIS", "NANOS_IN_MILLIS", "I", "getDays", "(D)J", "getDays$annotations", "(D)V", "days", "(I)J", "(I)V", "(J)V", "getHours", "getHours$annotations", "hours", "getMicroseconds", "getMicroseconds$annotations", "microseconds", "getMilliseconds", "getMilliseconds$annotations", "milliseconds", "getMinutes", "getMinutes$annotations", "minutes", "getNanoseconds", "getNanoseconds$annotations", "nanoseconds", "getSeconds", "getSeconds$annotations", "seconds", "kotlin-stdlib"})
public final class DurationKt {
    public static final int NANOS_IN_MILLIS = 1000000;
    public static final long MAX_MILLIS = 0x3FFFFFFFFFFFFFFFL;
    public static final long MAX_NANOS = 4611686018426999999L;
    private static final long MAX_NANOS_IN_MILLIS = 4611686018426L;

    public static final /* synthetic */ long access$nanosToMillis(long nanos) {
        return DurationKt.nanosToMillis(nanos);
    }

    public static final /* synthetic */ long getSeconds(long $this$seconds) {
        return DurationKt.toDuration($this$seconds, DurationUnit.SECONDS);
    }

    @DeprecatedSinceKotlin(warningSince="1.5", errorSince="1.8", hiddenSince="1.9")
    @Deprecated(message="Use 'Int.minutes' extension property from Duration.Companion instead.", replaceWith=@ReplaceWith(expression="this.minutes", imports={"kotlin.time.Duration.Companion.minutes"}))
    @ExperimentalTime
    @SinceKotlin(version="1.3")
    public static /* synthetic */ void getMinutes$annotations(int n) {
    }

    public static final /* synthetic */ long getDays(double $this$days) {
        return DurationKt.toDuration($this$days, DurationUnit.DAYS);
    }

    @WasExperimental(markerClass={ExperimentalTime.class})
    @SinceKotlin(version="1.6")
    @InlineOnly
    private static final long times-kIfJnKk(double $this$times_u2dkIfJnKk, long duration) {
        return Duration.times-UwyO8pc(duration, $this$times_u2dkIfJnKk);
    }

    public static final /* synthetic */ long getMinutes(long $this$minutes) {
        return DurationKt.toDuration($this$minutes, DurationUnit.MINUTES);
    }

    @DeprecatedSinceKotlin(warningSince="1.5", errorSince="1.8", hiddenSince="1.9")
    @Deprecated(message="Use 'Double.hours' extension property from Duration.Companion instead.", replaceWith=@ReplaceWith(expression="this.hours", imports={"kotlin.time.Duration.Companion.hours"}))
    @SinceKotlin(version="1.3")
    @ExperimentalTime
    public static /* synthetic */ void getHours$annotations(double d) {
    }

    /*
     * Unable to fully structure code
     */
    private static final long parseDuration(String value, boolean strictIso) {
        block39: {
            block33: {
                length = value.length();
                if (length == 0) {
                    throw new IllegalArgumentException("The string is empty");
                }
                index = 0;
                result = Duration.Companion.getZERO-UwyO8pc();
                infinityString = "Infinity";
                var7_6 = value.charAt(index);
                v0 = var7_6 == '+' ? true : var7_6 == '-';
                if (v0) {
                    ++index;
                }
                hasSign = index > 0;
                if (!hasSign) ** GOTO lbl-1000
                if (StringsKt.startsWith$default((CharSequence)value, '-', false, 2, null)) {
                    v1 = true;
                } else lbl-1000:
                // 2 sources

                {
                    v1 = false;
                }
                isNegative = v1;
                if (length <= index) {
                    throw new IllegalArgumentException("No components");
                }
                if (value.charAt(index) != 'P') break block33;
                if (++index == length) {
                    throw new IllegalArgumentException();
                }
                nonDigitSymbols = "+-.";
                isTimeComponent = false;
                prevUnit = null;
                while (index < length) {
                    block38: {
                        block37: {
                            block34: {
                                block36: {
                                    block35: {
                                        if (value.charAt(index) != 'T') break block34;
                                        if (isTimeComponent) break block35;
                                        if (++index != length) break block36;
                                    }
                                    throw new IllegalArgumentException();
                                }
                                isTimeComponent = true;
                                continue;
                            }
                            $this$substringWhile$iv = value;
                            $i$f$substringWhile = false;
                            var15_26 = $this$substringWhile$iv;
                            $this$skipWhile$iv$iv = $this$substringWhile$iv;
                            $i$f$skipWhile = false;
                            for (i$iv$iv = index; i$iv$iv < $this$skipWhile$iv$iv.length(); ++i$iv$iv) {
                                it = $this$skipWhile$iv$iv.charAt(i$iv$iv);
                                $i$a$-substringWhile-DurationKt$parseDuration$component$1 = false;
                                if (new CharRange('0', '9').contains(it)) ** GOTO lbl-1000
                                if (StringsKt.contains$default((CharSequence)nonDigitSymbols, it, false, 2, null)) lbl-1000:
                                // 2 sources

                                {
                                    v2 = true;
                                } else {
                                    v2 = false;
                                }
                                if (!v2) break;
                            }
                            $this$skipWhile$iv$iv = i$iv$iv;
                            Intrinsics.checkNotNull(var15_26, "null cannot be cast to non-null type java.lang.String");
                            Intrinsics.checkNotNullExpressionValue(var15_26.substring(index, $this$skipWhile$iv$iv), "substring(...)");
                            v3 = ((CharSequence)component).length() == 0;
                            if (v3) {
                                throw new IllegalArgumentException();
                            }
                            $i$f$substringWhile = value;
                            if ((index += component.length()) < 0) break block37;
                            if (index <= StringsKt.getLastIndex($i$f$substringWhile)) break block38;
                        }
                        it = index;
                        $i$a$-getOrElse-DurationKt$parseDuration$unitChar$1 = false;
                        throw new IllegalArgumentException("Missing unit for value " + component);
                    }
                    unitChar = $i$f$substringWhile.charAt(index);
                    ++index;
                    unit = DurationUnitKt.durationUnitByIsoChar(unitChar, isTimeComponent);
                    if (prevUnit != null && prevUnit.compareTo((Enum)unit) <= 0) {
                        throw new IllegalArgumentException("Unexpected order of duration components");
                    }
                    prevUnit = unit;
                    dotIndex = StringsKt.indexOf$default((CharSequence)component, '.', 0, false, 6, null);
                    if (unit == DurationUnit.SECONDS && dotIndex > 0) {
                        $i$f$skipWhile = component;
                        i$iv$iv = 0;
                        Intrinsics.checkNotNull($i$f$skipWhile, "null cannot be cast to non-null type java.lang.String");
                        Intrinsics.checkNotNullExpressionValue($i$f$skipWhile.substring(i$iv$iv, dotIndex), "substring(...)");
                        result = Duration.plus-LRDsOJo(result, DurationKt.toDuration(DurationKt.parseOverLongIsoComponent(whole), unit));
                        v4 = component;
                        Intrinsics.checkNotNull(v4, "null cannot be cast to non-null type java.lang.String");
                        v5 = v4.substring(dotIndex);
                        Intrinsics.checkNotNullExpressionValue(v5, "substring(...)");
                        result = Duration.plus-LRDsOJo(result, DurationKt.toDuration(Double.parseDouble(v5), unit));
                        continue;
                    }
                    result = Duration.plus-LRDsOJo(result, DurationKt.toDuration(DurationKt.parseOverLongIsoComponent(component), unit));
                }
                break block39;
            }
            if (strictIso) {
                throw new IllegalArgumentException();
            }
            if (StringsKt.regionMatches(value, index, infinityString, 0, Math.max(length - index, infinityString.length()), true)) {
                result = Duration.Companion.getINFINITE-UwyO8pc();
            } else {
                prevUnit = null;
                afterFirst = false;
                allowSpaces = !hasSign;
                if (hasSign) {
                    if (value.charAt(index) == '(' && StringsKt.last(value) == ')') {
                        allowSpaces = true;
                        if (++index == --length) {
                            throw new IllegalArgumentException("No components");
                        }
                    }
                }
                while (index < length) {
                    if (afterFirst && allowSpaces) {
                        $this$skipWhile$iv = value;
                        $this$substringWhile$iv = false;
                        for ($i$f$substringWhile = index; $i$f$substringWhile < $this$skipWhile$iv.length(); ++$i$f$substringWhile) {
                            it = $this$skipWhile$iv.charAt($i$f$substringWhile);
                            $this$skipWhile$iv$iv = false;
                            v6 = it == ' ';
                            if (!v6) break;
                        }
                        index = $i$f$substringWhile;
                    }
                    afterFirst = true;
                    $this$substringWhile$iv = value;
                    $i$f$substringWhile = false;
                    it = $this$substringWhile$iv;
                    $this$skipWhile$iv$iv = $this$substringWhile$iv;
                    $i$f$skipWhile = false;
                    for (i$iv$iv = index; i$iv$iv < $this$skipWhile$iv$iv.length(); ++i$iv$iv) {
                        it = $this$skipWhile$iv$iv.charAt(i$iv$iv);
                        $i$a$-substringWhile-DurationKt$parseDuration$component$2 = false;
                        v7 = new CharRange('0', '9').contains(it) || it == '.';
                        if (!v7) break;
                    }
                    $this$skipWhile$iv$iv = i$iv$iv;
                    Intrinsics.checkNotNull($i$f$substringWhile, "null cannot be cast to non-null type java.lang.String");
                    Intrinsics.checkNotNullExpressionValue($i$f$substringWhile.substring(index, $this$skipWhile$iv$iv), "substring(...)");
                    v8 = ((CharSequence)component).length() == 0;
                    if (v8) {
                        throw new IllegalArgumentException();
                    }
                    index += component.length();
                    $this$substringWhile$iv = value;
                    $i$f$substringWhile = false;
                    $this$skipWhile$iv$iv = $this$substringWhile$iv;
                    var17_40 = $this$substringWhile$iv;
                    var18_44 = 0;
                    for (var19_46 = index; var19_46 < var17_40.length(); ++var19_46) {
                        var20_48 = var17_40.charAt(var19_46);
                        var21_49 = false;
                        if (!new CharRange('a', 'z').contains(var20_48)) break;
                    }
                    var17_41 = var19_46;
                    Intrinsics.checkNotNull($this$skipWhile$iv$iv, "null cannot be cast to non-null type java.lang.String");
                    Intrinsics.checkNotNullExpressionValue($this$skipWhile$iv$iv.substring(index, var17_41), "substring(...)");
                    index += unitName.length();
                    unit = DurationUnitKt.durationUnitByShortName(unitName);
                    if (prevUnit != null && prevUnit.compareTo((Enum)unit) <= 0) {
                        throw new IllegalArgumentException("Unexpected order of duration components");
                    }
                    prevUnit = unit;
                    dotIndex = StringsKt.indexOf$default((CharSequence)component, '.', 0, false, 6, null);
                    if (dotIndex > 0) {
                        var17_42 = component;
                        var18_44 = 0;
                        Intrinsics.checkNotNull(var17_42, "null cannot be cast to non-null type java.lang.String");
                        Intrinsics.checkNotNullExpressionValue(var17_42.substring(var18_44, dotIndex), "substring(...)");
                        var4_4 = Duration.plus-LRDsOJo(result, DurationKt.toDuration(Long.parseLong(var16_33), (DurationUnit)var14_22));
                        v9 = var12_15;
                        Intrinsics.checkNotNull(v9, "null cannot be cast to non-null type java.lang.String");
                        v10 = v9.substring((int)var15_28);
                        Intrinsics.checkNotNullExpressionValue(v10, "substring(...)");
                        var4_4 = Duration.plus-LRDsOJo(var4_4, DurationKt.toDuration(Double.parseDouble(v10), (DurationUnit)var14_22));
                        if (var3_3 >= var2_2) continue;
                        throw new IllegalArgumentException("Fractional component must be last");
                    }
                    var4_4 = Duration.plus-LRDsOJo(var4_4, DurationKt.toDuration(Long.parseLong((String)var12_15), (DurationUnit)var14_22));
                }
            }
        }
        return var8_7 != false ? Duration.unaryMinus-UwyO8pc(var4_4) : var4_4;
    }

    public static final /* synthetic */ long getMicroseconds(long $this$microseconds) {
        return DurationKt.toDuration($this$microseconds, DurationUnit.MICROSECONDS);
    }

    @Deprecated(message="Use 'Double.seconds' extension property from Duration.Companion instead.", replaceWith=@ReplaceWith(expression="this.seconds", imports={"kotlin.time.Duration.Companion.seconds"}))
    @DeprecatedSinceKotlin(warningSince="1.5", errorSince="1.8", hiddenSince="1.9")
    @ExperimentalTime
    @SinceKotlin(version="1.3")
    public static /* synthetic */ void getSeconds$annotations(double d) {
    }

    private static final long millisToNanos(long millis) {
        return millis * (long)1000000;
    }

    @Deprecated(message="Use 'Long.nanoseconds' extension property from Duration.Companion instead.", replaceWith=@ReplaceWith(expression="this.nanoseconds", imports={"kotlin.time.Duration.Companion.nanoseconds"}))
    @DeprecatedSinceKotlin(warningSince="1.5", errorSince="1.8", hiddenSince="1.9")
    @ExperimentalTime
    @SinceKotlin(version="1.3")
    public static /* synthetic */ void getNanoseconds$annotations(long l) {
    }

    public static final /* synthetic */ long getSeconds(double $this$seconds) {
        return DurationKt.toDuration($this$seconds, DurationUnit.SECONDS);
    }

    @DeprecatedSinceKotlin(warningSince="1.5", errorSince="1.8", hiddenSince="1.9")
    @Deprecated(message="Use 'Int.days' extension property from Duration.Companion instead.", replaceWith=@ReplaceWith(expression="this.days", imports={"kotlin.time.Duration.Companion.days"}))
    @SinceKotlin(version="1.3")
    @ExperimentalTime
    public static /* synthetic */ void getDays$annotations(int n) {
    }

    public static final /* synthetic */ long getHours(int $this$hours) {
        return DurationKt.toDuration($this$hours, DurationUnit.HOURS);
    }

    public static final /* synthetic */ long access$millisToNanos(long millis) {
        return DurationKt.millisToNanos(millis);
    }

    public static final /* synthetic */ long getNanoseconds(int $this$nanoseconds) {
        return DurationKt.toDuration($this$nanoseconds, DurationUnit.NANOSECONDS);
    }

    public static final /* synthetic */ long getMinutes(double $this$minutes) {
        return DurationKt.toDuration($this$minutes, DurationUnit.MINUTES);
    }

    @WasExperimental(markerClass={ExperimentalTime.class})
    @SinceKotlin(version="1.6")
    public static final long toDuration(int $this$toDuration, @NotNull DurationUnit unit) {
        Intrinsics.checkNotNullParameter((Object)unit, "unit");
        return unit.compareTo((Enum)DurationUnit.SECONDS) <= 0 ? DurationKt.durationOfNanos(DurationUnitKt.convertDurationUnitOverflow($this$toDuration, unit, DurationUnit.NANOSECONDS)) : DurationKt.toDuration((long)$this$toDuration, unit);
    }

    @DeprecatedSinceKotlin(warningSince="1.5", errorSince="1.8", hiddenSince="1.9")
    @Deprecated(message="Use 'Long.microseconds' extension property from Duration.Companion instead.", replaceWith=@ReplaceWith(expression="this.microseconds", imports={"kotlin.time.Duration.Companion.microseconds"}))
    @SinceKotlin(version="1.3")
    @ExperimentalTime
    public static /* synthetic */ void getMicroseconds$annotations(long l) {
    }

    @InlineOnly
    @WasExperimental(markerClass={ExperimentalTime.class})
    @SinceKotlin(version="1.6")
    private static final long times-mvk6XK0(int $this$times_u2dmvk6XK0, long duration) {
        return Duration.times-UwyO8pc(duration, $this$times_u2dmvk6XK0);
    }

    public static final /* synthetic */ long getMicroseconds(double $this$microseconds) {
        return DurationKt.toDuration($this$microseconds, DurationUnit.MICROSECONDS);
    }

    /*
     * WARNING - void declaration
     */
    @SinceKotlin(version="1.6")
    @WasExperimental(markerClass={ExperimentalTime.class})
    public static final long toDuration(double $this$toDuration, @NotNull DurationUnit unit) {
        long l;
        Intrinsics.checkNotNullParameter((Object)unit, "unit");
        double valueInNs = DurationUnitKt.convertDurationUnit($this$toDuration, unit, DurationUnit.NANOSECONDS);
        boolean bl = !Double.isNaN(valueInNs);
        if (!bl) {
            boolean bl2 = false;
            String string = "Duration value cannot be NaN.";
            throw new IllegalArgumentException(string.toString());
        }
        long nanos = MathKt.roundToLong(valueInNs);
        if (new LongRange(-4611686018426999999L, 4611686018426999999L).contains(nanos)) {
            l = DurationKt.durationOfNanos(nanos);
        } else {
            void var7_7;
            long millis = MathKt.roundToLong(DurationUnitKt.convertDurationUnit($this$toDuration, unit, DurationUnit.MILLISECONDS));
            l = DurationKt.durationOfMillisNormalized((long)var7_7);
        }
        return l;
    }

    public static final /* synthetic */ long getSeconds(int $this$seconds) {
        return DurationKt.toDuration($this$seconds, DurationUnit.SECONDS);
    }

    public static final /* synthetic */ long access$parseDuration(String value, boolean strictIso) {
        return DurationKt.parseDuration(value, strictIso);
    }

    public static final /* synthetic */ long getHours(double $this$hours) {
        return DurationKt.toDuration($this$hours, DurationUnit.HOURS);
    }

    @Deprecated(message="Use 'Double.days' extension property from Duration.Companion instead.", replaceWith=@ReplaceWith(expression="this.days", imports={"kotlin.time.Duration.Companion.days"}))
    @DeprecatedSinceKotlin(warningSince="1.5", errorSince="1.8", hiddenSince="1.9")
    @ExperimentalTime
    @SinceKotlin(version="1.3")
    public static /* synthetic */ void getDays$annotations(double d) {
    }

    @SinceKotlin(version="1.6")
    @WasExperimental(markerClass={ExperimentalTime.class})
    public static final long toDuration(long $this$toDuration, @NotNull DurationUnit unit) {
        Intrinsics.checkNotNullParameter((Object)unit, "unit");
        long maxNsInUnit = DurationUnitKt.convertDurationUnitOverflow(4611686018426999999L, DurationUnit.NANOSECONDS, unit);
        if (new LongRange(-maxNsInUnit, maxNsInUnit).contains($this$toDuration)) {
            return DurationKt.durationOfNanos(DurationUnitKt.convertDurationUnitOverflow($this$toDuration, unit, DurationUnit.NANOSECONDS));
        }
        long millis = DurationUnitKt.convertDurationUnit($this$toDuration, unit, DurationUnit.MILLISECONDS);
        return DurationKt.durationOfMillis(RangesKt.coerceIn(millis, -4611686018427387903L, 0x3FFFFFFFFFFFFFFFL));
    }

    @Deprecated(message="Use 'Int.milliseconds' extension property from Duration.Companion instead.", replaceWith=@ReplaceWith(expression="this.milliseconds", imports={"kotlin.time.Duration.Companion.milliseconds"}))
    @DeprecatedSinceKotlin(warningSince="1.5", errorSince="1.8", hiddenSince="1.9")
    @ExperimentalTime
    @SinceKotlin(version="1.3")
    public static /* synthetic */ void getMilliseconds$annotations(int n) {
    }

    @DeprecatedSinceKotlin(warningSince="1.5", errorSince="1.8", hiddenSince="1.9")
    @Deprecated(message="Use 'Double.milliseconds' extension property from Duration.Companion instead.", replaceWith=@ReplaceWith(expression="this.milliseconds", imports={"kotlin.time.Duration.Companion.milliseconds"}))
    @SinceKotlin(version="1.3")
    @ExperimentalTime
    public static /* synthetic */ void getMilliseconds$annotations(double d) {
    }

    private static final long nanosToMillis(long nanos) {
        return nanos / (long)1000000;
    }

    @Deprecated(message="Use 'Int.nanoseconds' extension property from Duration.Companion instead.", replaceWith=@ReplaceWith(expression="this.nanoseconds", imports={"kotlin.time.Duration.Companion.nanoseconds"}))
    @DeprecatedSinceKotlin(warningSince="1.5", errorSince="1.8", hiddenSince="1.9")
    @SinceKotlin(version="1.3")
    @ExperimentalTime
    public static /* synthetic */ void getNanoseconds$annotations(int n) {
    }

    @DeprecatedSinceKotlin(warningSince="1.5", errorSince="1.8", hiddenSince="1.9")
    @Deprecated(message="Use 'Long.hours' extension property from Duration.Companion instead.", replaceWith=@ReplaceWith(expression="this.hours", imports={"kotlin.time.Duration.Companion.hours"}))
    @ExperimentalTime
    @SinceKotlin(version="1.3")
    public static /* synthetic */ void getHours$annotations(long l) {
    }

    @Deprecated(message="Use 'Long.minutes' extension property from Duration.Companion instead.", replaceWith=@ReplaceWith(expression="this.minutes", imports={"kotlin.time.Duration.Companion.minutes"}))
    @DeprecatedSinceKotlin(warningSince="1.5", errorSince="1.8", hiddenSince="1.9")
    @SinceKotlin(version="1.3")
    @ExperimentalTime
    public static /* synthetic */ void getMinutes$annotations(long l) {
    }

    private static final long durationOfMillis(long normalMillis) {
        return Duration.constructor-impl((normalMillis << 1) + 1L);
    }

    public static final /* synthetic */ long getMinutes(int $this$minutes) {
        return DurationKt.toDuration($this$minutes, DurationUnit.MINUTES);
    }

    private static final int skipWhile(String $this$skipWhile, int startIndex, Function1<? super Character, Boolean> predicate) {
        int i;
        boolean $i$f$skipWhile = false;
        for (i = startIndex; i < $this$skipWhile.length(); ++i) {
            if (!predicate.invoke(Character.valueOf($this$skipWhile.charAt(i))).booleanValue()) break;
        }
        return i;
    }

    @DeprecatedSinceKotlin(warningSince="1.5", errorSince="1.8", hiddenSince="1.9")
    @Deprecated(message="Use 'Long.milliseconds' extension property from Duration.Companion instead.", replaceWith=@ReplaceWith(expression="this.milliseconds", imports={"kotlin.time.Duration.Companion.milliseconds"}))
    @SinceKotlin(version="1.3")
    @ExperimentalTime
    public static /* synthetic */ void getMilliseconds$annotations(long l) {
    }

    @Deprecated(message="Use 'Long.seconds' extension property from Duration.Companion instead.", replaceWith=@ReplaceWith(expression="this.seconds", imports={"kotlin.time.Duration.Companion.seconds"}))
    @DeprecatedSinceKotlin(warningSince="1.5", errorSince="1.8", hiddenSince="1.9")
    @SinceKotlin(version="1.3")
    @ExperimentalTime
    public static /* synthetic */ void getSeconds$annotations(long l) {
    }

    private static final long durationOfNanosNormalized(long nanos) {
        return new LongRange(-4611686018426999999L, 4611686018426999999L).contains(nanos) ? DurationKt.durationOfNanos(nanos) : DurationKt.durationOfMillis(DurationKt.nanosToMillis(nanos));
    }

    public static final /* synthetic */ long getNanoseconds(double $this$nanoseconds) {
        return DurationKt.toDuration($this$nanoseconds, DurationUnit.NANOSECONDS);
    }

    public static final /* synthetic */ long getNanoseconds(long $this$nanoseconds) {
        return DurationKt.toDuration($this$nanoseconds, DurationUnit.NANOSECONDS);
    }

    public static final /* synthetic */ long access$durationOfMillis(long normalMillis) {
        return DurationKt.durationOfMillis(normalMillis);
    }

    public static final /* synthetic */ long getMilliseconds(double $this$milliseconds) {
        return DurationKt.toDuration($this$milliseconds, DurationUnit.MILLISECONDS);
    }

    @DeprecatedSinceKotlin(warningSince="1.5", errorSince="1.8", hiddenSince="1.9")
    @Deprecated(message="Use 'Double.microseconds' extension property from Duration.Companion instead.", replaceWith=@ReplaceWith(expression="this.microseconds", imports={"kotlin.time.Duration.Companion.microseconds"}))
    @ExperimentalTime
    @SinceKotlin(version="1.3")
    public static /* synthetic */ void getMicroseconds$annotations(double d) {
    }

    public static final /* synthetic */ long getDays(int $this$days) {
        return DurationKt.toDuration($this$days, DurationUnit.DAYS);
    }

    public static final /* synthetic */ long getMicroseconds(int $this$microseconds) {
        return DurationKt.toDuration($this$microseconds, DurationUnit.MICROSECONDS);
    }

    public static final /* synthetic */ long getDays(long $this$days) {
        return DurationKt.toDuration($this$days, DurationUnit.DAYS);
    }

    public static final /* synthetic */ long getMilliseconds(int $this$milliseconds) {
        return DurationKt.toDuration($this$milliseconds, DurationUnit.MILLISECONDS);
    }

    private static final long durationOfNanos(long normalNanos) {
        return Duration.constructor-impl(normalNanos << 1);
    }

    public static final /* synthetic */ long access$durationOfNanos(long normalNanos) {
        return DurationKt.durationOfNanos(normalNanos);
    }

    /*
     * WARNING - void declaration
     */
    private static final String substringWhile(String $this$substringWhile, int startIndex, Function1<? super Character, Boolean> predicate) {
        void var7_8;
        boolean $i$f$substringWhile = false;
        String string = $this$substringWhile;
        String $this$skipWhile$iv = $this$substringWhile;
        boolean $i$f$skipWhile = false;
        for (int i$iv = startIndex; i$iv < $this$skipWhile$iv.length(); ++i$iv) {
            if (!predicate.invoke(Character.valueOf($this$skipWhile$iv.charAt(i$iv))).booleanValue()) break;
        }
        void var5_6 = var7_8;
        Intrinsics.checkNotNull(string, "null cannot be cast to non-null type java.lang.String");
        String string2 = string.substring(startIndex, (int)var5_6);
        Intrinsics.checkNotNullExpressionValue(string2, "substring(...)");
        return string2;
    }

    private static final long durationOfMillisNormalized(long millis) {
        return new LongRange(-4611686018426L, 4611686018426L).contains(millis) ? DurationKt.durationOfNanos(DurationKt.millisToNanos(millis)) : DurationKt.durationOfMillis(RangesKt.coerceIn(millis, -4611686018427387903L, 0x3FFFFFFFFFFFFFFFL));
    }

    public static final /* synthetic */ long access$durationOfNanosNormalized(long nanos) {
        return DurationKt.durationOfNanosNormalized(nanos);
    }

    public static final /* synthetic */ long getHours(long $this$hours) {
        return DurationKt.toDuration($this$hours, DurationUnit.HOURS);
    }

    public static final /* synthetic */ long access$durationOfMillisNormalized(long millis) {
        return DurationKt.durationOfMillisNormalized(millis);
    }

    public static final /* synthetic */ long getMilliseconds(long $this$milliseconds) {
        return DurationKt.toDuration($this$milliseconds, DurationUnit.MILLISECONDS);
    }

    @DeprecatedSinceKotlin(warningSince="1.5", errorSince="1.8", hiddenSince="1.9")
    @Deprecated(message="Use 'Int.hours' extension property from Duration.Companion instead.", replaceWith=@ReplaceWith(expression="this.hours", imports={"kotlin.time.Duration.Companion.hours"}))
    @ExperimentalTime
    @SinceKotlin(version="1.3")
    public static /* synthetic */ void getHours$annotations(int n) {
    }

    @Deprecated(message="Use 'Double.minutes' extension property from Duration.Companion instead.", replaceWith=@ReplaceWith(expression="this.minutes", imports={"kotlin.time.Duration.Companion.minutes"}))
    @DeprecatedSinceKotlin(warningSince="1.5", errorSince="1.8", hiddenSince="1.9")
    @SinceKotlin(version="1.3")
    @ExperimentalTime
    public static /* synthetic */ void getMinutes$annotations(double d) {
    }

    @DeprecatedSinceKotlin(warningSince="1.5", errorSince="1.8", hiddenSince="1.9")
    @Deprecated(message="Use 'Int.microseconds' extension property from Duration.Companion instead.", replaceWith=@ReplaceWith(expression="this.microseconds", imports={"kotlin.time.Duration.Companion.microseconds"}))
    @SinceKotlin(version="1.3")
    @ExperimentalTime
    public static /* synthetic */ void getMicroseconds$annotations(int n) {
    }

    /*
     * Unable to fully structure code
     */
    private static final long parseOverLongIsoComponent(String value) {
        block7: {
            block6: {
                length = value.length();
                startIndex = 0;
                if (length > 0) {
                    if (StringsKt.contains$default((CharSequence)"+-", value.charAt(0), false, 2, null)) {
                        ++startIndex;
                    }
                }
                if (length - startIndex <= 16) break block7;
                $this$all$iv = new IntRange(startIndex, StringsKt.getLastIndex(value));
                $i$f$all = false;
                if (!($this$all$iv instanceof Collection)) ** GOTO lbl-1000
                if (((Collection)$this$all$iv).isEmpty()) {
                    v0 = true;
                } else lbl-1000:
                // 2 sources

                {
                    var5_5 = $this$all$iv.iterator();
                    while (var5_5.hasNext()) {
                        it = element$iv = ((IntIterator)var5_5).nextInt();
                        $i$a$-all-DurationKt$parseOverLongIsoComponent$1 = false;
                        if (new CharRange('0', '9').contains(value.charAt((int)var7_7))) continue;
                        v0 = false;
                        break block6;
                    }
                    v0 = true;
                }
            }
            if (v0) {
                return value.charAt(0) == '-' ? -9223372036854775808L : 0x7FFFFFFFFFFFFFFFL;
            }
        }
        return StringsKt.startsWith$default(value, "+", false, 2, null) ? Long.parseLong(StringsKt.drop(var0, 1)) : Long.parseLong(var0);
    }

    public static final /* synthetic */ long access$durationOf(long normalValue, int unitDiscriminator) {
        return DurationKt.durationOf(normalValue, unitDiscriminator);
    }

    @DeprecatedSinceKotlin(warningSince="1.5", errorSince="1.8", hiddenSince="1.9")
    @Deprecated(message="Use 'Double.nanoseconds' extension property from Duration.Companion instead.", replaceWith=@ReplaceWith(expression="this.nanoseconds", imports={"kotlin.time.Duration.Companion.nanoseconds"}))
    @ExperimentalTime
    @SinceKotlin(version="1.3")
    public static /* synthetic */ void getNanoseconds$annotations(double d) {
    }

    @DeprecatedSinceKotlin(warningSince="1.5", errorSince="1.8", hiddenSince="1.9")
    @Deprecated(message="Use 'Long.days' extension property from Duration.Companion instead.", replaceWith=@ReplaceWith(expression="this.days", imports={"kotlin.time.Duration.Companion.days"}))
    @SinceKotlin(version="1.3")
    @ExperimentalTime
    public static /* synthetic */ void getDays$annotations(long l) {
    }

    private static final long durationOf(long normalValue, int unitDiscriminator) {
        return Duration.constructor-impl((normalValue << 1) + (long)unitDiscriminator);
    }

    @DeprecatedSinceKotlin(warningSince="1.5", errorSince="1.8", hiddenSince="1.9")
    @Deprecated(message="Use 'Int.seconds' extension property from Duration.Companion instead.", replaceWith=@ReplaceWith(expression="this.seconds", imports={"kotlin.time.Duration.Companion.seconds"}))
    @ExperimentalTime
    @SinceKotlin(version="1.3")
    public static /* synthetic */ void getSeconds$annotations(int n) {
    }
}

