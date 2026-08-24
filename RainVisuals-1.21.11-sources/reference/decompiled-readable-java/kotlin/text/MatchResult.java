/*
 * Decompiled with CFR 0.152.
 */
package kotlin.text;

import java.util.List;
import kotlin.Metadata;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.MatchGroupCollection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001:\u0001\u0018J\u0011\u0010\u0002\u001a\u0004\u0018\u00010\u0000H&\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\t8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006\u0019"}, d2={"Lkotlin/text/MatchResult;", "", "next", "()Lkotlin/text/MatchResult;", "Lkotlin/text/MatchResult$Destructured;", "getDestructured", "()Lkotlin/text/MatchResult$Destructured;", "destructured", "", "", "getGroupValues", "()Ljava/util/List;", "groupValues", "Lkotlin/text/MatchGroupCollection;", "getGroups", "()Lkotlin/text/MatchGroupCollection;", "groups", "Lkotlin/ranges/IntRange;", "getRange", "()Lkotlin/ranges/IntRange;", "range", "getValue", "()Ljava/lang/String;", "value", "Destructured", "kotlin-stdlib"})
public interface MatchResult {
    @NotNull
    public Destructured getDestructured();

    @NotNull
    public String getValue();

    @NotNull
    public List<String> getGroupValues();

    @NotNull
    public MatchGroupCollection getGroups();

    @Nullable
    public MatchResult next();

    @NotNull
    public IntRange getRange();

    @Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0087\n\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0006H\u0087\n\u00a2\u0006\u0004\b\t\u0010\bJ\u0010\u0010\n\u001a\u00020\u0006H\u0087\n\u00a2\u0006\u0004\b\n\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0006H\u0087\n\u00a2\u0006\u0004\b\u000b\u0010\bJ\u0010\u0010\f\u001a\u00020\u0006H\u0087\n\u00a2\u0006\u0004\b\f\u0010\bJ\u0010\u0010\r\u001a\u00020\u0006H\u0087\n\u00a2\u0006\u0004\b\r\u0010\bJ\u0010\u0010\u000e\u001a\u00020\u0006H\u0087\n\u00a2\u0006\u0004\b\u000e\u0010\bJ\u0010\u0010\u000f\u001a\u00020\u0006H\u0087\n\u00a2\u0006\u0004\b\u000f\u0010\bJ\u0010\u0010\u0010\u001a\u00020\u0006H\u0087\n\u00a2\u0006\u0004\b\u0010\u0010\bJ\u0010\u0010\u0011\u001a\u00020\u0006H\u0087\n\u00a2\u0006\u0004\b\u0011\u0010\bJ\u0013\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0012\u00a2\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006\u0018"}, d2={"Lkotlin/text/MatchResult$Destructured;", "", "Lkotlin/text/MatchResult;", "match", "<init>", "(Lkotlin/text/MatchResult;)V", "", "component1", "()Ljava/lang/String;", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "", "toList", "()Ljava/util/List;", "Lkotlin/text/MatchResult;", "getMatch", "()Lkotlin/text/MatchResult;", "kotlin-stdlib"})
    public static final class Destructured {
        @NotNull
        private final MatchResult match;

        @InlineOnly
        private final String component1() {
            return this.getMatch().getGroupValues().get(1);
        }

        @InlineOnly
        private final String component2() {
            return this.getMatch().getGroupValues().get(2);
        }

        @InlineOnly
        private final String component6() {
            return this.getMatch().getGroupValues().get(6);
        }

        @InlineOnly
        private final String component10() {
            return this.getMatch().getGroupValues().get(10);
        }

        @InlineOnly
        private final String component9() {
            return this.getMatch().getGroupValues().get(9);
        }

        @NotNull
        public final List<String> toList() {
            return this.match.getGroupValues().subList(1, this.match.getGroupValues().size());
        }

        @InlineOnly
        private final String component7() {
            return this.getMatch().getGroupValues().get(7);
        }

        public Destructured(@NotNull MatchResult match) {
            Intrinsics.checkNotNullParameter(match, "match");
            this.match = match;
        }

        @InlineOnly
        private final String component3() {
            return this.getMatch().getGroupValues().get(3);
        }

        @InlineOnly
        private final String component8() {
            return this.getMatch().getGroupValues().get(8);
        }

        @InlineOnly
        private final String component4() {
            return this.getMatch().getGroupValues().get(4);
        }

        @InlineOnly
        private final String component5() {
            return this.getMatch().getGroupValues().get(5);
        }

        @NotNull
        public final MatchResult getMatch() {
            return this.match;
        }
    }

    @Metadata(mv={1, 9, 0}, k=3, xi=48)
    public static final class DefaultImpls {
        @NotNull
        public static Destructured getDestructured(@NotNull MatchResult $this) {
            return new Destructured($this);
        }
    }
}

