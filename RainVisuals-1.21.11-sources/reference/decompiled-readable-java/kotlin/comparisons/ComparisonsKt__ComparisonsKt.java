/*
 * Decompiled with CFR 0.152.
 */
package kotlin.comparisons;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;
import kotlin.comparisons.NaturalOrderComparator;
import kotlin.comparisons.ReverseOrderComparator;
import kotlin.comparisons.ReversedComparator;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=5, xi=49, d1={"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aE\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005\"\u0004\b\u0000\u0010\u00002\u001a\b\u0004\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00020\u0001H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0006\u0010\u0007\u001a[\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005\"\u0004\b\u0000\u0010\u000026\u0010\t\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00020\u00010\b\"\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00020\u0001\u00a2\u0006\u0004\b\u0006\u0010\n\u001aa\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u000b2\u001a\u0010\f\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00010\u0004j\n\u0012\u0006\b\u0000\u0012\u00028\u0001`\u00052\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0006\u0010\r\u001aE\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005\"\u0004\b\u0000\u0010\u00002\u001a\b\u0004\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00020\u0001H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u000e\u0010\u0007\u001aa\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u000b2\u001a\u0010\f\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00010\u0004j\n\u0012\u0006\b\u0000\u0012\u00028\u0001`\u00052\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u000e\u0010\r\u001a/\u0010\u0012\u001a\u00020\u0011\"\f\b\u0000\u0010\u0000*\u0006\u0012\u0002\b\u00030\u00022\b\u0010\u000f\u001a\u0004\u0018\u00018\u00002\b\u0010\u0010\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0004\b\u0012\u0010\u0013\u001aC\u0010\u0014\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u00002\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00020\u0001H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0014\u0010\u0015\u001a[\u0010\u0014\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u000026\u0010\t\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00020\u00010\b\"\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00020\u0001\u00a2\u0006\u0004\b\u0014\u0010\u0016\u001a_\u0010\u0014\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u000b2\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u00002\u001a\u0010\f\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00010\u0004j\n\u0012\u0006\b\u0000\u0012\u00028\u0001`\u00052\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0014\u0010\u0017\u001aG\u0010\u0019\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u00002 \u0010\t\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00020\u00010\bH\u0002\u00a2\u0006\u0004\b\u0018\u0010\u0016\u001a-\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002\u00a2\u0006\u0004\b\u001a\u0010\u001b\u001a4\u0010\u001c\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004j\n\u0012\u0006\u0012\u0004\u0018\u00018\u0000`\u0005\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0087\b\u00a2\u0006\u0004\b\u001c\u0010\u001b\u001aG\u0010\u001c\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004j\n\u0012\u0006\u0012\u0004\u0018\u00018\u0000`\u0005\"\b\b\u0000\u0010\u0000*\u00020\u001d2\u001a\u0010\f\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u0004j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0005\u00a2\u0006\u0004\b\u001c\u0010\u001e\u001a4\u0010\u001f\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004j\n\u0012\u0006\u0012\u0004\u0018\u00018\u0000`\u0005\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0087\b\u00a2\u0006\u0004\b\u001f\u0010\u001b\u001aG\u0010\u001f\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004j\n\u0012\u0006\u0012\u0004\u0018\u00018\u0000`\u0005\"\b\b\u0000\u0010\u0000*\u00020\u001d2\u001a\u0010\f\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u0004j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0005\u00a2\u0006\u0004\b\u001f\u0010\u001e\u001a-\u0010 \u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002\u00a2\u0006\u0004\b \u0010\u001b\u001a7\u0010!\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005\"\u0004\b\u0000\u0010\u0000*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005\u00a2\u0006\u0004\b!\u0010\u001e\u001aV\u0010\"\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005\"\u0004\b\u0000\u0010\u0000*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u00052\u001a\u0010\f\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u0004j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0005H\u0086\u0004\u00a2\u0006\u0004\b\"\u0010#\u001aY\u0010$\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005\"\u0004\b\u0000\u0010\u0000*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u00052\u001a\b\u0004\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00020\u0001H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b$\u0010\r\u001au\u0010$\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u000b*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u00052\u001a\u0010\f\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00010\u0004j\n\u0012\u0006\b\u0000\u0012\u00028\u0001`\u00052\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b$\u0010%\u001aY\u0010&\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005\"\u0004\b\u0000\u0010\u0000*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u00052\u001a\b\u0004\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00020\u0001H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b&\u0010\r\u001au\u0010&\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u000b*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u00052\u001a\u0010\f\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00010\u0004j\n\u0012\u0006\b\u0000\u0012\u00028\u0001`\u00052\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b&\u0010%\u001aw\u0010+\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005\"\u0004\b\u0000\u0010\u0000*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u000528\b\u0004\u0010*\u001a2\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110'H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b+\u0010,\u001aV\u0010-\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005\"\u0004\b\u0000\u0010\u0000*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u00052\u001a\u0010\f\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u0004j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0005H\u0086\u0004\u00a2\u0006\u0004\b-\u0010#\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006."}, d2={"T", "Lkotlin/Function1;", "", "selector", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "compareBy", "(Lkotlin/jvm/functions/Function1;)Ljava/util/Comparator;", "", "selectors", "([Lkotlin/jvm/functions/Function1;)Ljava/util/Comparator;", "K", "comparator", "(Ljava/util/Comparator;Lkotlin/jvm/functions/Function1;)Ljava/util/Comparator;", "compareByDescending", "a", "b", "", "compareValues", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)I", "compareValuesBy", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)I", "(Ljava/lang/Object;Ljava/lang/Object;[Lkotlin/jvm/functions/Function1;)I", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;Lkotlin/jvm/functions/Function1;)I", "compareValuesByImpl$ComparisonsKt__ComparisonsKt", "compareValuesByImpl", "naturalOrder", "()Ljava/util/Comparator;", "nullsFirst", "", "(Ljava/util/Comparator;)Ljava/util/Comparator;", "nullsLast", "reverseOrder", "reversed", "then", "(Ljava/util/Comparator;Ljava/util/Comparator;)Ljava/util/Comparator;", "thenBy", "(Ljava/util/Comparator;Ljava/util/Comparator;Lkotlin/jvm/functions/Function1;)Ljava/util/Comparator;", "thenByDescending", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "comparison", "thenComparator", "(Ljava/util/Comparator;Lkotlin/jvm/functions/Function2;)Ljava/util/Comparator;", "thenDescending", "kotlin-stdlib"}, xs="kotlin/comparisons/ComparisonsKt")
class ComparisonsKt__ComparisonsKt {
    @NotNull
    public static final <T> Comparator<T> thenDescending(@NotNull Comparator<T> $this$thenDescending, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter($this$thenDescending, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return (arg_0, arg_1) -> ComparisonsKt__ComparisonsKt.thenDescending$lambda$2$ComparisonsKt__ComparisonsKt($this$thenDescending, comparator, arg_0, arg_1);
    }

    @InlineOnly
    private static final <T extends Comparable<? super T>> Comparator<T> nullsFirst() {
        return ComparisonsKt.nullsFirst(ComparisonsKt.naturalOrder());
    }

    @NotNull
    public static final <T> Comparator<T> nullsFirst(@NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return (arg_0, arg_1) -> ComparisonsKt__ComparisonsKt.nullsFirst$lambda$3$ComparisonsKt__ComparisonsKt(comparator, arg_0, arg_1);
    }

    private static final int nullsLast$lambda$4$ComparisonsKt__ComparisonsKt(Comparator $comparator, Object a2, Object b2) {
        Intrinsics.checkNotNullParameter($comparator, "$comparator");
        return a2 == b2 ? 0 : (a2 == null ? 1 : (b2 == null ? -1 : $comparator.compare(a2, b2)));
    }

    @NotNull
    public static final <T extends Comparable<? super T>> Comparator<T> reverseOrder() {
        ReverseOrderComparator reverseOrderComparator = ReverseOrderComparator.INSTANCE;
        Intrinsics.checkNotNull(reverseOrderComparator, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder> }");
        return reverseOrderComparator;
    }

    private static final int then$lambda$1$ComparisonsKt__ComparisonsKt(Comparator $this_then, Comparator $comparator, Object a2, Object b2) {
        Intrinsics.checkNotNullParameter($this_then, "$this_then");
        Intrinsics.checkNotNullParameter($comparator, "$comparator");
        int previousCompare = $this_then.compare(a2, b2);
        return previousCompare != 0 ? previousCompare : $comparator.compare(a2, b2);
    }

    @InlineOnly
    private static final <T extends Comparable<? super T>> Comparator<T> nullsLast() {
        return ComparisonsKt.nullsLast(ComparisonsKt.naturalOrder());
    }

    @InlineOnly
    private static final <T> int compareValuesBy(T a2, T b2, Function1<? super T, ? extends Comparable<?>> selector) {
        Intrinsics.checkNotNullParameter(selector, "selector");
        return ComparisonsKt.compareValues(selector.invoke(a2), selector.invoke(b2));
    }

    @InlineOnly
    private static final <T, K> Comparator<T> thenByDescending(Comparator<T> $this$thenByDescending, Comparator<? super K> comparator, Function1<? super T, ? extends K> selector) {
        Intrinsics.checkNotNullParameter($this$thenByDescending, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return new Comparator($this$thenByDescending, comparator, selector){
            final /* synthetic */ Comparator<T> $this_thenByDescending;
            final /* synthetic */ Comparator<? super K> $comparator;
            final /* synthetic */ Function1<T, K> $selector;
            {
                this.$this_thenByDescending = $receiver;
                this.$comparator = $comparator;
                this.$selector = $selector;
            }

            public final int compare(T a2, T b2) {
                int n;
                int previousCompare = this.$this_thenByDescending.compare(a2, b2);
                if (previousCompare != 0) {
                    n = previousCompare;
                } else {
                    Comparator<K> comparator = this.$comparator;
                    Function1<T, K> function1 = this.$selector;
                    n = comparator.compare(function1.invoke(b2), function1.invoke(a2));
                }
                return n;
            }
        };
    }

    @InlineOnly
    private static final <T> Comparator<T> compareByDescending(Function1<? super T, ? extends Comparable<?>> selector) {
        Intrinsics.checkNotNullParameter(selector, "selector");
        return new Comparator(selector){
            final /* synthetic */ Function1<T, Comparable<?>> $selector;
            {
                this.$selector = $selector;
            }

            public final int compare(T a2, T b2) {
                Function1<T, Comparable<?>> function1 = this.$selector;
                return ComparisonsKt.compareValues(function1.invoke(b2), function1.invoke(a2));
            }
        };
    }

    @InlineOnly
    private static final <T> Comparator<T> thenBy(Comparator<T> $this$thenBy, Function1<? super T, ? extends Comparable<?>> selector) {
        Intrinsics.checkNotNullParameter($this$thenBy, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return new Comparator($this$thenBy, selector){
            final /* synthetic */ Function1<T, Comparable<?>> $selector;
            final /* synthetic */ Comparator<T> $this_thenBy;
            {
                this.$this_thenBy = $receiver;
                this.$selector = $selector;
            }

            public final int compare(T a2, T b2) {
                int n;
                int previousCompare = this.$this_thenBy.compare(a2, b2);
                if (previousCompare != 0) {
                    n = previousCompare;
                } else {
                    Function1<T, Comparable<?>> function1 = this.$selector;
                    n = ComparisonsKt.compareValues(function1.invoke(a2), function1.invoke(b2));
                }
                return n;
            }
        };
    }

    private static final int thenDescending$lambda$2$ComparisonsKt__ComparisonsKt(Comparator $this_thenDescending, Comparator $comparator, Object a2, Object b2) {
        Intrinsics.checkNotNullParameter($this_thenDescending, "$this_thenDescending");
        Intrinsics.checkNotNullParameter($comparator, "$comparator");
        int previousCompare = $this_thenDescending.compare(a2, b2);
        return previousCompare != 0 ? previousCompare : $comparator.compare(b2, a2);
    }

    @InlineOnly
    private static final <T, K> Comparator<T> compareBy(Comparator<? super K> comparator, Function1<? super T, ? extends K> selector) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return new Comparator(comparator, selector){
            final /* synthetic */ Function1<T, K> $selector;
            final /* synthetic */ Comparator<? super K> $comparator;
            {
                this.$comparator = $comparator;
                this.$selector = $selector;
            }

            public final int compare(T a2, T b2) {
                Comparator<K> comparator = this.$comparator;
                Function1<T, K> function1 = this.$selector;
                return comparator.compare(function1.invoke(a2), function1.invoke(b2));
            }
        };
    }

    @InlineOnly
    private static final <T> Comparator<T> thenComparator(Comparator<T> $this$thenComparator, Function2<? super T, ? super T, Integer> comparison) {
        Intrinsics.checkNotNullParameter($this$thenComparator, "<this>");
        Intrinsics.checkNotNullParameter(comparison, "comparison");
        return new Comparator($this$thenComparator, comparison){
            final /* synthetic */ Function2<T, T, Integer> $comparison;
            final /* synthetic */ Comparator<T> $this_thenComparator;
            {
                this.$this_thenComparator = $receiver;
                this.$comparison = $comparison;
            }

            public final int compare(T a2, T b2) {
                int previousCompare = this.$this_thenComparator.compare(a2, b2);
                return previousCompare != 0 ? previousCompare : ((Number)this.$comparison.invoke(a2, b2)).intValue();
            }
        };
    }

    @InlineOnly
    private static final <T> Comparator<T> compareBy(Function1<? super T, ? extends Comparable<?>> selector) {
        Intrinsics.checkNotNullParameter(selector, "selector");
        return new Comparator(selector){
            final /* synthetic */ Function1<T, Comparable<?>> $selector;
            {
                this.$selector = $selector;
            }

            public final int compare(T a2, T b2) {
                Function1<T, Comparable<?>> function1 = this.$selector;
                return ComparisonsKt.compareValues(function1.invoke(a2), function1.invoke(b2));
            }
        };
    }

    @NotNull
    public static final <T> Comparator<T> reversed(@NotNull Comparator<T> $this$reversed) {
        Comparator comparator;
        Intrinsics.checkNotNullParameter($this$reversed, "<this>");
        Comparator<T> comparator2 = $this$reversed;
        if (comparator2 instanceof ReversedComparator) {
            comparator = ((ReversedComparator)$this$reversed).getComparator();
        } else if (Intrinsics.areEqual(comparator2, NaturalOrderComparator.INSTANCE)) {
            ReverseOrderComparator reverseOrderComparator = ReverseOrderComparator.INSTANCE;
            Intrinsics.checkNotNull(reverseOrderComparator, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed> }");
            comparator = reverseOrderComparator;
        } else if (Intrinsics.areEqual(comparator2, ReverseOrderComparator.INSTANCE)) {
            NaturalOrderComparator naturalOrderComparator = NaturalOrderComparator.INSTANCE;
            Intrinsics.checkNotNull(naturalOrderComparator, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed> }");
            comparator = naturalOrderComparator;
        } else {
            comparator = new ReversedComparator<T>($this$reversed);
        }
        return comparator;
    }

    @InlineOnly
    private static final <T, K> Comparator<T> compareByDescending(Comparator<? super K> comparator, Function1<? super T, ? extends K> selector) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return new Comparator(comparator, selector){
            final /* synthetic */ Function1<T, K> $selector;
            final /* synthetic */ Comparator<? super K> $comparator;

            public final int compare(T a2, T b2) {
                Comparator<K> comparator = this.$comparator;
                Function1<T, K> function1 = this.$selector;
                return comparator.compare(function1.invoke(b2), function1.invoke(a2));
            }
            {
                this.$comparator = $comparator;
                this.$selector = $selector;
            }
        };
    }

    private static final int nullsFirst$lambda$3$ComparisonsKt__ComparisonsKt(Comparator $comparator, Object a2, Object b2) {
        Intrinsics.checkNotNullParameter($comparator, "$comparator");
        return a2 == b2 ? 0 : (a2 == null ? -1 : (b2 == null ? 1 : $comparator.compare(a2, b2)));
    }

    /*
     * WARNING - void declaration
     */
    private static final <T> int compareValuesByImpl$ComparisonsKt__ComparisonsKt(T a2, T b2, Function1<? super T, ? extends Comparable<?>>[] selectors) {
        int n = selectors.length;
        for (int i = 0; i < n; ++i) {
            void var8_8;
            Comparable<?> v2;
            Function1<T, Comparable<?>> fn = selectors[i];
            Comparable<?> v1 = fn.invoke(a2);
            int diff = ComparisonsKt.compareValues(v1, v2 = fn.invoke(b2));
            if (diff == 0) continue;
            return (int)var8_8;
        }
        return 0;
    }

    @NotNull
    public static final <T> Comparator<T> compareBy(Function1<? super T, ? extends Comparable<?>> ... selectors) {
        Intrinsics.checkNotNullParameter(selectors, "selectors");
        boolean bl = selectors.length > 0;
        if (!bl) {
            String string = "Failed requirement.";
            throw new IllegalArgumentException(string.toString());
        }
        return (arg_0, arg_1) -> ComparisonsKt__ComparisonsKt.compareBy$lambda$0$ComparisonsKt__ComparisonsKt(selectors, arg_0, arg_1);
    }

    private static final int compareBy$lambda$0$ComparisonsKt__ComparisonsKt(Function1[] $selectors, Object a2, Object b2) {
        Intrinsics.checkNotNullParameter($selectors, "$selectors");
        return ComparisonsKt__ComparisonsKt.compareValuesByImpl$ComparisonsKt__ComparisonsKt(a2, b2, $selectors);
    }

    @NotNull
    public static final <T extends Comparable<? super T>> Comparator<T> naturalOrder() {
        NaturalOrderComparator naturalOrderComparator = NaturalOrderComparator.INSTANCE;
        Intrinsics.checkNotNull(naturalOrderComparator, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder> }");
        return naturalOrderComparator;
    }

    @InlineOnly
    private static final <T, K> int compareValuesBy(T a2, T b2, Comparator<? super K> comparator, Function1<? super T, ? extends K> selector) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return comparator.compare(selector.invoke(a2), selector.invoke(b2));
    }

    @InlineOnly
    private static final <T, K> Comparator<T> thenBy(Comparator<T> $this$thenBy, Comparator<? super K> comparator, Function1<? super T, ? extends K> selector) {
        Intrinsics.checkNotNullParameter($this$thenBy, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return new Comparator($this$thenBy, comparator, selector){
            final /* synthetic */ Function1<T, K> $selector;
            final /* synthetic */ Comparator<? super K> $comparator;
            final /* synthetic */ Comparator<T> $this_thenBy;
            {
                this.$this_thenBy = $receiver;
                this.$comparator = $comparator;
                this.$selector = $selector;
            }

            public final int compare(T a2, T b2) {
                int n;
                int previousCompare = this.$this_thenBy.compare(a2, b2);
                if (previousCompare != 0) {
                    n = previousCompare;
                } else {
                    Comparator<K> comparator = this.$comparator;
                    Function1<T, K> function1 = this.$selector;
                    n = comparator.compare(function1.invoke(a2), function1.invoke(b2));
                }
                return n;
            }
        };
    }

    @InlineOnly
    private static final <T> Comparator<T> thenByDescending(Comparator<T> $this$thenByDescending, Function1<? super T, ? extends Comparable<?>> selector) {
        Intrinsics.checkNotNullParameter($this$thenByDescending, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return new Comparator($this$thenByDescending, selector){
            final /* synthetic */ Comparator<T> $this_thenByDescending;
            final /* synthetic */ Function1<T, Comparable<?>> $selector;
            {
                this.$this_thenByDescending = $receiver;
                this.$selector = $selector;
            }

            public final int compare(T a2, T b2) {
                int n;
                int previousCompare = this.$this_thenByDescending.compare(a2, b2);
                if (previousCompare != 0) {
                    n = previousCompare;
                } else {
                    Function1<T, Comparable<?>> function1 = this.$selector;
                    n = ComparisonsKt.compareValues(function1.invoke(b2), function1.invoke(a2));
                }
                return n;
            }
        };
    }

    public static final <T extends Comparable<?>> int compareValues(@Nullable T a2, @Nullable T b2) {
        if (a2 == b2) {
            return 0;
        }
        if (a2 == null) {
            return -1;
        }
        if (b2 == null) {
            return 1;
        }
        return a2.compareTo(b2);
    }

    /*
     * WARNING - void declaration
     */
    public static final <T> int compareValuesBy(T a2, T b2, Function1<? super T, ? extends Comparable<?>> ... selectors) {
        void var2_2;
        void var1_1;
        Intrinsics.checkNotNullParameter(selectors, "selectors");
        boolean bl = selectors.length > 0;
        if (!bl) {
            String string = "Failed requirement.";
            throw new IllegalArgumentException(string.toString());
        }
        return ComparisonsKt__ComparisonsKt.compareValuesByImpl$ComparisonsKt__ComparisonsKt(a2, var1_1, var2_2);
    }

    @NotNull
    public static final <T> Comparator<T> then(@NotNull Comparator<T> $this$then, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter($this$then, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return (arg_0, arg_1) -> ComparisonsKt__ComparisonsKt.then$lambda$1$ComparisonsKt__ComparisonsKt($this$then, comparator, arg_0, arg_1);
    }

    @NotNull
    public static final <T> Comparator<T> nullsLast(@NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return (arg_0, arg_1) -> ComparisonsKt__ComparisonsKt.nullsLast$lambda$4$ComparisonsKt__ComparisonsKt(comparator, arg_0, arg_1);
    }
}

