/*
 * Decompiled with CFR 0.152.
 */
package kotlin.text;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;
import java.util.regex.Matcher;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.FlagEnum;
import kotlin.text.MatchResult;
import kotlin.text.MatcherMatchResult;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=2, xi=48, d1={"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001c\n\u0002\b\u0003\u001a4\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0014\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0082\b\u00a2\u0006\u0004\b\u0006\u0010\u0007\u001a%\u0010\r\u001a\u0004\u0018\u00010\f*\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\b\r\u0010\u000e\u001a\u001d\u0010\u000f\u001a\u0004\u0018\u00010\f*\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\u0011H\u0002\u00a2\u0006\u0004\b\u0013\u0010\u0014\u001a\u001b\u0010\u0013\u001a\u00020\u0012*\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\b\u0013\u0010\u0016\u001a\u0019\u0010\u0018\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00000\u0017H\u0002\u00a2\u0006\u0004\b\u0018\u0010\u0019\u00a8\u0006\u001a"}, d2={"Lkotlin/text/FlagEnum;", "", "T", "", "value", "", "fromInt", "(I)Ljava/util/Set;", "Ljava/util/regex/Matcher;", "from", "", "input", "Lkotlin/text/MatchResult;", "findNext", "(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)Lkotlin/text/MatchResult;", "matchEntire", "(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)Lkotlin/text/MatchResult;", "Ljava/util/regex/MatchResult;", "Lkotlin/ranges/IntRange;", "range", "(Ljava/util/regex/MatchResult;)Lkotlin/ranges/IntRange;", "groupIndex", "(Ljava/util/regex/MatchResult;I)Lkotlin/ranges/IntRange;", "", "toInt", "(Ljava/lang/Iterable;)I", "kotlin-stdlib"})
public final class RegexKt {
    public static final /* synthetic */ int access$toInt(Iterable $receiver) {
        return RegexKt.toInt($receiver);
    }

    public static final /* synthetic */ MatchResult access$findNext(Matcher $receiver, int from, CharSequence input) {
        return RegexKt.findNext($receiver, from, input);
    }

    /*
     * WARNING - void declaration
     */
    private static final int toInt(Iterable<? extends FlagEnum> $this$toInt) {
        void var4_4;
        void $this$fold$iv;
        Iterable<? extends FlagEnum> iterable = $this$toInt;
        int initial$iv = 0;
        boolean $i$f$fold = false;
        int accumulator$iv = initial$iv;
        for (Object element$iv : $this$fold$iv) {
            FlagEnum option = (FlagEnum)element$iv;
            int value = accumulator$iv;
            boolean bl = false;
            accumulator$iv = value | option.getValue();
        }
        return (int)var4_4;
    }

    private static final MatchResult findNext(Matcher $this$findNext, int from, CharSequence input) {
        return !$this$findNext.find(from) ? null : (MatchResult)new MatcherMatchResult($this$findNext, input);
    }

    private static final IntRange range(java.util.regex.MatchResult $this$range) {
        return RangesKt.until($this$range.start(), $this$range.end());
    }

    public static final /* synthetic */ MatchResult access$matchEntire(Matcher $receiver, CharSequence input) {
        return RegexKt.matchEntire($receiver, input);
    }

    public static final /* synthetic */ IntRange access$range(java.util.regex.MatchResult $receiver, int groupIndex) {
        return RegexKt.range($receiver, groupIndex);
    }

    public static final /* synthetic */ IntRange access$range(java.util.regex.MatchResult $receiver) {
        return RegexKt.range($receiver);
    }

    private static final /* synthetic */ <T extends Enum<T>> Set<T> fromInt(int value) {
        boolean $i$f$fromInt = false;
        Intrinsics.reifiedOperationMarker(4, "T");
        EnumSet<Enum> enumSet = EnumSet.allOf(Enum.class);
        EnumSet<Enum> $this$fromInt_u24lambda_u241 = enumSet;
        boolean bl = false;
        Intrinsics.checkNotNull($this$fromInt_u24lambda_u241);
        Iterable iterable = $this$fromInt_u24lambda_u241;
        Intrinsics.needClassReification();
        CollectionsKt.retainAll(iterable, (Function1)new Function1<T, Boolean>(value){
            final /* synthetic */ int $value;
            {
                this.$value = $value;
                super(1);
            }

            @NotNull
            public final Boolean invoke(T it) {
                return (this.$value & ((FlagEnum)it).getMask()) == ((FlagEnum)it).getValue();
            }
        });
        Set set = Collections.unmodifiableSet((Set)enumSet);
        Intrinsics.checkNotNullExpressionValue(set, "unmodifiableSet(...)");
        return set;
    }

    private static final MatchResult matchEntire(Matcher $this$matchEntire, CharSequence input) {
        return !$this$matchEntire.matches() ? null : (MatchResult)new MatcherMatchResult($this$matchEntire, input);
    }

    private static final IntRange range(java.util.regex.MatchResult $this$range, int groupIndex) {
        return RangesKt.until($this$range.start(groupIndex), $this$range.end(groupIndex));
    }
}

