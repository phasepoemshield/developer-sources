/*
 * Decompiled with CFR 0.152.
 */
package kotlin.text;

import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.collections.CollectionsKt;
import kotlin.internal.PlatformImplementationsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.sequences.SequencesKt;
import kotlin.text.MatchGroup;
import kotlin.text.MatchGroupCollection;
import kotlin.text.MatchNamedGroupCollection;
import kotlin.text.MatchResult;
import kotlin.text.MatcherMatchResult;
import kotlin.text.RegexKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0016\u00a2\u0006\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00178BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001c8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u000b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b \u0010!\u00a8\u0006#"}, d2={"Lkotlin/text/MatcherMatchResult;", "Lkotlin/text/MatchResult;", "Ljava/util/regex/Matcher;", "matcher", "", "input", "<init>", "(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V", "next", "()Lkotlin/text/MatchResult;", "", "", "getGroupValues", "()Ljava/util/List;", "groupValues", "groupValues_", "Ljava/util/List;", "Lkotlin/text/MatchGroupCollection;", "groups", "Lkotlin/text/MatchGroupCollection;", "getGroups", "()Lkotlin/text/MatchGroupCollection;", "Ljava/lang/CharSequence;", "Ljava/util/regex/MatchResult;", "getMatchResult", "()Ljava/util/regex/MatchResult;", "matchResult", "Ljava/util/regex/Matcher;", "Lkotlin/ranges/IntRange;", "getRange", "()Lkotlin/ranges/IntRange;", "range", "getValue", "()Ljava/lang/String;", "value", "kotlin-stdlib"})
final class MatcherMatchResult
implements MatchResult {
    @Nullable
    private List<String> groupValues_;
    @NotNull
    private final MatchGroupCollection groups;
    @NotNull
    private final Matcher matcher;
    @NotNull
    private final CharSequence input;

    @Override
    @NotNull
    public MatchGroupCollection getGroups() {
        return this.groups;
    }

    @Override
    @NotNull
    public List<String> getGroupValues() {
        if (this.groupValues_ == null) {
            this.groupValues_ = new AbstractList<String>(this){
                final /* synthetic */ MatcherMatchResult this$0;
                {
                    this.this$0 = $receiver;
                }

                public int getSize() {
                    return MatcherMatchResult.access$getMatchResult(this.this$0).groupCount() + 1;
                }

                @NotNull
                public String get(int index) {
                    String string = MatcherMatchResult.access$getMatchResult(this.this$0).group(index);
                    if (string == null) {
                        string = "";
                    }
                    return string;
                }
            };
        }
        List<String> list = this.groupValues_;
        Intrinsics.checkNotNull(list);
        return list;
    }

    @Override
    @NotNull
    public MatchResult.Destructured getDestructured() {
        return MatchResult.DefaultImpls.getDestructured(this);
    }

    @Override
    @Nullable
    public MatchResult next() {
        MatchResult matchResult;
        int nextIndex = this.getMatchResult().end() + (this.getMatchResult().end() == this.getMatchResult().start() ? 1 : 0);
        if (nextIndex <= this.input.length()) {
            Matcher matcher = this.matcher.pattern().matcher(this.input);
            Intrinsics.checkNotNullExpressionValue(matcher, "matcher(...)");
            matchResult = RegexKt.access$findNext(matcher, nextIndex, this.input);
        } else {
            matchResult = null;
        }
        return matchResult;
    }

    @Override
    @NotNull
    public IntRange getRange() {
        return RegexKt.access$range(this.getMatchResult());
    }

    public static final /* synthetic */ java.util.regex.MatchResult access$getMatchResult(MatcherMatchResult $this) {
        return $this.getMatchResult();
    }

    @Override
    @NotNull
    public String getValue() {
        String string = this.getMatchResult().group();
        Intrinsics.checkNotNullExpressionValue(string, "group(...)");
        return string;
    }

    private final java.util.regex.MatchResult getMatchResult() {
        return this.matcher;
    }

    public MatcherMatchResult(@NotNull Matcher matcher, @NotNull CharSequence input) {
        Intrinsics.checkNotNullParameter(matcher, "matcher");
        Intrinsics.checkNotNullParameter(input, "input");
        this.matcher = matcher;
        this.input = input;
        this.groups = new MatchNamedGroupCollection(this){
            final /* synthetic */ MatcherMatchResult this$0;

            public int getSize() {
                return MatcherMatchResult.access$getMatchResult(this.this$0).groupCount() + 1;
            }

            @Nullable
            public MatchGroup get(int index) {
                MatchGroup matchGroup;
                IntRange range = RegexKt.access$range(MatcherMatchResult.access$getMatchResult(this.this$0), index);
                if (range.getStart() >= 0) {
                    String string = MatcherMatchResult.access$getMatchResult(this.this$0).group(index);
                    Intrinsics.checkNotNullExpressionValue(string, "group(...)");
                    matchGroup = new MatchGroup(string, range);
                } else {
                    matchGroup = null;
                }
                return matchGroup;
            }

            @Nullable
            public MatchGroup get(@NotNull String name) {
                Intrinsics.checkNotNullParameter(name, "name");
                return PlatformImplementationsKt.IMPLEMENTATIONS.getMatchResultNamedGroup(MatcherMatchResult.access$getMatchResult(this.this$0), name);
            }
            {
                this.this$0 = $receiver;
            }

            public boolean isEmpty() {
                return false;
            }

            @NotNull
            public Iterator<MatchGroup> iterator() {
                return SequencesKt.map(CollectionsKt.asSequence(CollectionsKt.getIndices(this)), (Function1)new Function1<Integer, MatchGroup>(this){
                    final /* synthetic */ groups.1 this$0;

                    @Nullable
                    public final MatchGroup invoke(int it) {
                        return this.this$0.get(it);
                    }
                    {
                        this.this$0 = $receiver;
                        super(1);
                    }
                }).iterator();
            }
        };
    }
}

