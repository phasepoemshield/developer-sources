/*
 * Decompiled with CFR 0.152.
 */
package kotlin.text;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ResultKt;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.WasExperimental;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt;
import kotlin.text.FlagEnum;
import kotlin.text.MatchResult;
import kotlin.text.MatcherMatchResult;
import kotlin.text.Regex;
import kotlin.text.RegexKt;
import kotlin.text.RegexOption;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u000b\u0018\u0000 =2\u00060\u0001j\u0002`\u0002:\u0002=>B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0004\b\u0005\u0010\tB\u001f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\n\u00a2\u0006\u0004\b\u0005\u0010\fB\u0011\b\u0001\u0012\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\b\u0005\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u00a2\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00170\u001a2\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u00a2\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001e\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u0015H\u0007\u00a2\u0006\u0004\b\u001e\u0010\u0019J\u0017\u0010\u001f\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0086\u0004\u00a2\u0006\u0004\b!\u0010\u0014J\u001f\u0010\"\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u0015H\u0007\u00a2\u0006\u0004\b\"\u0010#J)\u0010&\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00100$\u00a2\u0006\u0004\b&\u0010'J\u001d\u0010&\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010(\u001a\u00020\u0003\u00a2\u0006\u0004\b&\u0010)J\u001d\u0010*\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010(\u001a\u00020\u0003\u00a2\u0006\u0004\b*\u0010)J%\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00030,2\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010+\u001a\u00020\u0015\u00a2\u0006\u0004\b-\u0010.J'\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a2\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010+\u001a\u00020\u0015H\u0007\u00a2\u0006\u0004\b/\u0010\u001cJ\r\u00100\u001a\u00020\r\u00a2\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\b2\u00103J\u000f\u00105\u001a\u000204H\u0002\u00a2\u0006\u0004\b5\u00106R\u001e\u00107\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u000e\u00109R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\n8F\u00a2\u0006\u0006\u001a\u0004\b:\u0010;R\u0011\u0010\u0004\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\b<\u00103\u00a8\u0006?"}, d2={"Lkotlin/text/Regex;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "pattern", "<init>", "(Ljava/lang/String;)V", "Lkotlin/text/RegexOption;", "option", "(Ljava/lang/String;Lkotlin/text/RegexOption;)V", "", "options", "(Ljava/lang/String;Ljava/util/Set;)V", "Ljava/util/regex/Pattern;", "nativePattern", "(Ljava/util/regex/Pattern;)V", "", "input", "", "containsMatchIn", "(Ljava/lang/CharSequence;)Z", "", "startIndex", "Lkotlin/text/MatchResult;", "find", "(Ljava/lang/CharSequence;I)Lkotlin/text/MatchResult;", "Lkotlin/sequences/Sequence;", "findAll", "(Ljava/lang/CharSequence;I)Lkotlin/sequences/Sequence;", "index", "matchAt", "matchEntire", "(Ljava/lang/CharSequence;)Lkotlin/text/MatchResult;", "matches", "matchesAt", "(Ljava/lang/CharSequence;I)Z", "Lkotlin/Function1;", "transform", "replace", "(Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;", "replacement", "(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;", "replaceFirst", "limit", "", "split", "(Ljava/lang/CharSequence;I)Ljava/util/List;", "splitToSequence", "toPattern", "()Ljava/util/regex/Pattern;", "toString", "()Ljava/lang/String;", "", "writeReplace", "()Ljava/lang/Object;", "_options", "Ljava/util/Set;", "Ljava/util/regex/Pattern;", "getOptions", "()Ljava/util/Set;", "getPattern", "Companion", "Serialized", "kotlin-stdlib"})
public final class Regex
implements Serializable {
    @NotNull
    private final Pattern nativePattern;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @Nullable
    private Set<? extends RegexOption> _options;

    @NotNull
    public final String replace(@NotNull CharSequence input, @NotNull String replacement) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        String string = this.nativePattern.matcher(input).replaceAll(replacement);
        Intrinsics.checkNotNullExpressionValue(string, "replaceAll(...)");
        return string;
    }

    @NotNull
    public String toString() {
        String string = this.nativePattern.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @NotNull
    public final String getPattern() {
        String string = this.nativePattern.pattern();
        Intrinsics.checkNotNullExpressionValue(string, "pattern(...)");
        return string;
    }

    @Nullable
    public final MatchResult find(@NotNull CharSequence input, int startIndex) {
        Intrinsics.checkNotNullParameter(input, "input");
        Matcher matcher = this.nativePattern.matcher(input);
        Intrinsics.checkNotNullExpressionValue(matcher, "matcher(...)");
        return RegexKt.access$findNext(matcher, startIndex, input);
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public final Set<RegexOption> getOptions() {
        Set<RegexOption> set = this._options;
        if (set == null) {
            void var2_4;
            Set set2;
            int value$iv = this.nativePattern.flags();
            boolean $i$f$fromInt = false;
            EnumSet<RegexOption> enumSet = EnumSet.allOf(RegexOption.class);
            EnumSet<RegexOption> $this$fromInt_u24lambda_u241$iv = enumSet;
            boolean bl = false;
            Intrinsics.checkNotNull($this$fromInt_u24lambda_u241$iv);
            CollectionsKt.retainAll((Iterable)$this$fromInt_u24lambda_u241$iv, (Function1)new Function1<RegexOption, Boolean>(value$iv){
                final /* synthetic */ int $value;

                /*
                 * Ignored method signature, as it can't be verified against descriptor
                 */
                @NotNull
                public final Boolean invoke(Enum it) {
                    return (this.$value & ((FlagEnum)((Object)it)).getMask()) == ((FlagEnum)((Object)it)).getValue();
                }
                {
                    this.$value = $value;
                    super(1);
                }
            });
            Set set3 = Collections.unmodifiableSet((Set)enumSet);
            Intrinsics.checkNotNullExpressionValue(set3, "unmodifiableSet(...)");
            Set it = set2 = set3;
            boolean bl2 = false;
            this._options = var2_4;
            set = set2;
        }
        return set;
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public final String replace(@NotNull CharSequence input, @NotNull Function1<? super MatchResult, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(transform, "transform");
        MatchResult matchResult = Regex.find$default(this, input, 0, 2, null);
        if (matchResult == null) {
            return ((Object)input).toString();
        }
        MatchResult match = matchResult;
        int lastStart = 0;
        int length = input.length();
        StringBuilder sb = new StringBuilder(length);
        do {
            void var7_7;
            MatchResult foundMatch = match;
            sb.append(input, lastStart, (int)foundMatch.getRange().getStart());
            sb.append(transform.invoke(foundMatch));
            lastStart = (Integer)foundMatch.getRange().getEndInclusive() + 1;
            match = var7_7.next();
            if (lastStart >= length) break;
        } while (match != null);
        if (lastStart < length) {
            sb.append(input, lastStart, length);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public Regex(@NotNull String pattern, @NotNull RegexOption option) {
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        Intrinsics.checkNotNullParameter(option, "option");
        Pattern pattern2 = Pattern.compile(pattern, Regex.Companion.ensureUnicodeCase(option.getValue()));
        Intrinsics.checkNotNullExpressionValue(pattern2, "compile(...)");
        this(pattern2);
    }

    @NotNull
    public final Pattern toPattern() {
        return this.nativePattern;
    }

    @PublishedApi
    public Regex(@NotNull Pattern nativePattern) {
        Intrinsics.checkNotNullParameter(nativePattern, "nativePattern");
        this.nativePattern = nativePattern;
    }

    public final boolean containsMatchIn(@NotNull CharSequence input) {
        Intrinsics.checkNotNullParameter(input, "input");
        return this.nativePattern.matcher(input).find();
    }

    private final Object writeReplace() {
        String string = this.nativePattern.pattern();
        Intrinsics.checkNotNullExpressionValue(string, "pattern(...)");
        return new Serialized(string, this.nativePattern.flags());
    }

    public static /* synthetic */ Sequence findAll$default(Regex regex, CharSequence charSequence, int n, int n2, Object object) {
        if ((n2 & 2) != 0) {
            n = 0;
        }
        return regex.findAll(charSequence, n);
    }

    @Nullable
    @SinceKotlin(version="1.7")
    @WasExperimental(markerClass={ExperimentalStdlibApi.class})
    public final MatchResult matchAt(@NotNull CharSequence input, int index) {
        MatcherMatchResult matcherMatchResult;
        Intrinsics.checkNotNullParameter(input, "input");
        Matcher matcher = this.nativePattern.matcher(input).useAnchoringBounds(false).useTransparentBounds(true).region(index, input.length());
        Matcher $this$matchAt_u24lambda_u241 = matcher;
        boolean bl = false;
        if ($this$matchAt_u24lambda_u241.lookingAt()) {
            Intrinsics.checkNotNull($this$matchAt_u24lambda_u241);
            matcherMatchResult = new MatcherMatchResult($this$matchAt_u24lambda_u241, input);
        } else {
            matcherMatchResult = null;
        }
        return matcherMatchResult;
    }

    public static /* synthetic */ MatchResult find$default(Regex regex, CharSequence charSequence, int n, int n2, Object object) {
        if ((n2 & 2) != 0) {
            n = 0;
        }
        return regex.find(charSequence, n);
    }

    public static final /* synthetic */ Pattern access$getNativePattern$p(Regex $this) {
        return $this.nativePattern;
    }

    public static /* synthetic */ List split$default(Regex regex, CharSequence charSequence, int n, int n2, Object object) {
        if ((n2 & 2) != 0) {
            n = 0;
        }
        return regex.split(charSequence, n);
    }

    public final boolean matches(@NotNull CharSequence input) {
        Intrinsics.checkNotNullParameter(input, "input");
        return this.nativePattern.matcher(input).matches();
    }

    @NotNull
    public final String replaceFirst(@NotNull CharSequence input, @NotNull String replacement) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        String string = this.nativePattern.matcher(input).replaceFirst(replacement);
        Intrinsics.checkNotNullExpressionValue(string, "replaceFirst(...)");
        return string;
    }

    @WasExperimental(markerClass={ExperimentalStdlibApi.class})
    @SinceKotlin(version="1.7")
    public final boolean matchesAt(@NotNull CharSequence input, int index) {
        Intrinsics.checkNotNullParameter(input, "input");
        return this.nativePattern.matcher(input).useAnchoringBounds(false).useTransparentBounds(true).region(index, input.length()).lookingAt();
    }

    @NotNull
    public final Sequence<MatchResult> findAll(@NotNull CharSequence input, int startIndex) {
        block3: {
            block2: {
                Intrinsics.checkNotNullParameter(input, "input");
                if (startIndex < 0) break block2;
                if (startIndex <= input.length()) break block3;
            }
            throw new IndexOutOfBoundsException("Start index out of bounds: " + startIndex + ", input length: " + input.length());
        }
        return SequencesKt.generateSequence((Function0)new Function0<MatchResult>(this, input, startIndex){
            final /* synthetic */ int $startIndex;
            final /* synthetic */ Regex this$0;
            final /* synthetic */ CharSequence $input;

            @Nullable
            public final MatchResult invoke() {
                return this.this$0.find(this.$input, this.$startIndex);
            }
            {
                this.this$0 = $receiver;
                this.$input = $input;
                this.$startIndex = $startIndex;
                super(0);
            }
        }, (Function1)findAll.2.INSTANCE);
    }

    @WasExperimental(markerClass={ExperimentalStdlibApi.class})
    @SinceKotlin(version="1.6")
    @NotNull
    public final Sequence<String> splitToSequence(@NotNull CharSequence input, int limit) {
        Intrinsics.checkNotNullParameter(input, "input");
        StringsKt.requireNonNegativeLimit(limit);
        return SequencesKt.sequence((Function2)new Function2<SequenceScope<? super String>, Continuation<? super Unit>, Object>(this, input, limit, null){
            int label;
            int I$0;
            Object L$1;
            private /* synthetic */ Object L$0;
            final /* synthetic */ Regex this$0;
            final /* synthetic */ CharSequence $input;
            final /* synthetic */ int $limit;

            /*
             * Unable to fully structure code
             */
            @Nullable
            public final Object invokeSuspend(@NotNull Object var1_1) {
                var6_2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0: {
                        ResultKt.throwOnFailure(var1_1);
                        $this$sequence = (SequenceScope)this.L$0;
                        matcher = Regex.access$getNativePattern$p(this.this$0).matcher(this.$input);
                        if (this.$limit != 1 && matcher.find()) break;
                        this.label = 1;
                        v0 = $this$sequence.yield(this.$input.toString(), this);
                        if (v0 == var6_2) {
                            return var6_2;
                        }
                        ** GOTO lbl16
                    }
                    case 1: {
                        ResultKt.throwOnFailure($result);
                        v0 = $result;
lbl16:
                        // 2 sources

                        return Unit.INSTANCE;
                    }
                }
                nextStart = 0;
                splitCount = 0;
                while (true) {
                    this.L$0 = $this$sequence;
                    this.L$1 = matcher;
                    this.I$0 = splitCount;
                    this.label = 2;
                    v1 = $this$sequence.yield(this.$input.subSequence(nextStart, matcher.start()).toString(), this);
                    if (v1 == var6_2) {
                        return var6_2;
                    }
                    ** GOTO lbl34
                    break;
                }
                {
                    case 2: {
                        splitCount = this.I$0;
                        matcher = (Matcher)this.L$1;
                        $this$sequence = (SequenceScope)this.L$0;
                        ResultKt.throwOnFailure($result);
                        v1 = $result;
lbl34:
                        // 2 sources

                        nextStart = matcher.end();
                        if (++splitCount != this.$limit - 1 && matcher.find()) ** continue;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 3;
                        v2 = var2_3.yield(this.$input.subSequence(nextStart, this.$input.length()).toString(), this);
                        if (v2 == var6_2) {
                            return var6_2;
                        }
                        ** GOTO lbl46
                    }
                    case 3: {
                        ResultKt.throwOnFailure($result);
                        v2 = $result;
lbl46:
                        // 2 sources

                        return Unit.INSTANCE;
                    }
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @NotNull
            public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<?> $completion) {
                Function2<SequenceScope<? super String>, Continuation<? super Unit>, Object> function2 = new /* invalid duplicate definition of identical inner class */;
                function2.L$0 = value;
                return (Continuation)((Object)function2);
            }
            {
                this.this$0 = $receiver;
                this.$input = $input;
                this.$limit = $limit;
                super(2, $completion);
            }

            @Nullable
            public final Object invoke(@NotNull SequenceScope<? super String> p1, @Nullable Continuation<? super Unit> p2) {
                return (this.create(p1, p2)).invokeSuspend(Unit.INSTANCE);
            }
        });
    }

    public static /* synthetic */ Sequence splitToSequence$default(Regex regex, CharSequence charSequence, int n, int n2, Object object) {
        if ((n2 & 2) != 0) {
            n = 0;
        }
        return regex.splitToSequence(charSequence, n);
    }

    public Regex(@NotNull String pattern) {
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        Pattern pattern2 = Pattern.compile(pattern);
        Intrinsics.checkNotNullExpressionValue(pattern2, "compile(...)");
        this(pattern2);
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public final List<String> split(@NotNull CharSequence input, int limit) {
        void var4_4;
        Matcher matcher;
        block5: {
            block4: {
                Intrinsics.checkNotNullParameter(input, "input");
                StringsKt.requireNonNegativeLimit(limit);
                matcher = this.nativePattern.matcher(input);
                if (limit == 1) break block4;
                if (matcher.find()) break block5;
            }
            return CollectionsKt.listOf(((Object)input).toString());
        }
        ArrayList<String> result = new ArrayList<String>(limit > 0 ? RangesKt.coerceAtMost(limit, 10) : 10);
        int lastStart = 0;
        int lastSplit = limit + -1;
        do {
            result.add(((Object)input.subSequence(lastStart, matcher.start())).toString());
            lastStart = matcher.end();
            if (lastSplit < 0) continue;
            if (result.size() == lastSplit) break;
        } while (matcher.find());
        result.add(((Object)input.subSequence(lastStart, input.length())).toString());
        return (List)var4_4;
    }

    @Nullable
    public final MatchResult matchEntire(@NotNull CharSequence input) {
        Intrinsics.checkNotNullParameter(input, "input");
        Matcher matcher = this.nativePattern.matcher(input);
        Intrinsics.checkNotNullExpressionValue(matcher, "matcher(...)");
        return RegexKt.access$matchEntire(matcher, input);
    }

    public Regex(@NotNull String pattern, @NotNull Set<? extends RegexOption> options) {
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        Intrinsics.checkNotNullParameter(options, "options");
        Pattern pattern2 = Pattern.compile(pattern, Regex.Companion.ensureUnicodeCase(RegexKt.access$toInt(options)));
        Intrinsics.checkNotNullExpressionValue(pattern2, "compile(...)");
        this(pattern2);
    }

    @Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b\u00a2\u0006\u0004\b\f\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b\u00a2\u0006\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0010"}, d2={"Lkotlin/text/Regex$Companion;", "", "<init>", "()V", "", "flags", "ensureUnicodeCase", "(I)I", "", "literal", "escape", "(Ljava/lang/String;)Ljava/lang/String;", "escapeReplacement", "Lkotlin/text/Regex;", "fromLiteral", "(Ljava/lang/String;)Lkotlin/text/Regex;", "kotlin-stdlib"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final String escapeReplacement(@NotNull String literal) {
            Intrinsics.checkNotNullParameter(literal, "literal");
            String string = Matcher.quoteReplacement(literal);
            Intrinsics.checkNotNullExpressionValue(string, "quoteReplacement(...)");
            return string;
        }

        /*
         * WARNING - void declaration
         */
        private final int ensureUnicodeCase(int flags) {
            void var1_1;
            return (flags & 2) != 0 ? flags | 0x40 : var1_1;
        }

        @NotNull
        public final String escape(@NotNull String literal) {
            Intrinsics.checkNotNullParameter(literal, "literal");
            String string = Pattern.quote(literal);
            Intrinsics.checkNotNullExpressionValue(string, "quote(...)");
            return string;
        }

        @NotNull
        public final Regex fromLiteral(@NotNull String literal) {
            Intrinsics.checkNotNullParameter(literal, "literal");
            return new Regex(literal, RegexOption.LITERAL);
        }
    }

    @Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\n\b\u0002\u0018\u0000 \u00122\u00060\u0001j\u0002`\u0002:\u0001\u0012B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0013"}, d2={"Lkotlin/text/Regex$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "pattern", "", "flags", "<init>", "(Ljava/lang/String;I)V", "", "readResolve", "()Ljava/lang/Object;", "I", "getFlags", "()I", "Ljava/lang/String;", "getPattern", "()Ljava/lang/String;", "Companion", "kotlin-stdlib"})
    private static final class Serialized
    implements Serializable {
        @NotNull
        private final String pattern;
        private static final long serialVersionUID = 0L;
        @NotNull
        public static final Companion Companion = new Companion(null);
        private final int flags;

        public final int getFlags() {
            return this.flags;
        }

        private final Object readResolve() {
            Pattern pattern = Pattern.compile(this.pattern, this.flags);
            Intrinsics.checkNotNullExpressionValue(pattern, "compile(...)");
            return new Regex(pattern);
        }

        public Serialized(@NotNull String pattern, int flags) {
            Intrinsics.checkNotNullParameter(pattern, "pattern");
            this.pattern = pattern;
            this.flags = flags;
        }

        @NotNull
        public final String getPattern() {
            return this.pattern;
        }

        @Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2={"Lkotlin/text/Regex$Serialized$Companion;", "", "<init>", "()V", "", "serialVersionUID", "J", "kotlin-stdlib"})
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
                this();
            }

            private Companion() {
            }
        }
    }
}

