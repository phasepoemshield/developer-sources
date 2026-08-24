/*
 * Decompiled with CFR 0.152.
 */
package kotlin.text;

import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=5, xi=49, d1={"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u001a7\u0010\u0006\u001a\u00028\u0000\"\f\b\u0000\u0010\u0002*\u00060\u0000j\u0002`\u0001*\u00028\u00002\u0016\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u0003\"\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\b\u0006\u0010\u0007\u001a;\u0010\f\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0002*\u00060\u0000j\u0002`\u00012\u0006\u0010\b\u001a\u00028\u00002\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\tH\u0000\u00a2\u0006\u0004\b\f\u0010\r\u001a\u001c\u0010\u000e\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u0001H\u0087\b\u00a2\u0006\u0004\b\u000e\u0010\u000f\u001a$\u0010\u000e\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0005\u001a\u00020\u0010H\u0087\b\u00a2\u0006\u0004\b\u000e\u0010\u0011\u001a&\u0010\u000e\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0087\b\u00a2\u0006\u0004\b\u000e\u0010\u0012\u001a9\u0010\u0016\u001a\u00028\u0000\"\f\b\u0000\u0010\u0002*\u00060\u0000j\u0002`\u0001*\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0007\u00a2\u0006\u0004\b\u0016\u0010\u0017\u00a8\u0006\u0018"}, d2={"Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "T", "", "", "value", "append", "(Ljava/lang/Appendable;[Ljava/lang/CharSequence;)Ljava/lang/Appendable;", "element", "Lkotlin/Function1;", "transform", "", "appendElement", "(Ljava/lang/Appendable;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "appendLine", "(Ljava/lang/Appendable;)Ljava/lang/Appendable;", "", "(Ljava/lang/Appendable;C)Ljava/lang/Appendable;", "(Ljava/lang/Appendable;Ljava/lang/CharSequence;)Ljava/lang/Appendable;", "", "startIndex", "endIndex", "appendRange", "(Ljava/lang/Appendable;Ljava/lang/CharSequence;II)Ljava/lang/Appendable;", "kotlin-stdlib"}, xs="kotlin/text/StringsKt")
class StringsKt__AppendableKt {
    @SinceKotlin(version="1.4")
    @InlineOnly
    private static final Appendable appendLine(Appendable $this$appendLine, CharSequence value) {
        Intrinsics.checkNotNullParameter($this$appendLine, "<this>");
        Appendable appendable = $this$appendLine.append(value);
        Intrinsics.checkNotNullExpressionValue(appendable, "append(...)");
        Appendable appendable2 = appendable.append('\n');
        Intrinsics.checkNotNullExpressionValue(appendable2, "append(...)");
        return appendable2;
    }

    @SinceKotlin(version="1.4")
    @InlineOnly
    private static final Appendable appendLine(Appendable $this$appendLine, char value) {
        Intrinsics.checkNotNullParameter($this$appendLine, "<this>");
        Appendable appendable = $this$appendLine.append(value);
        Intrinsics.checkNotNullExpressionValue(appendable, "append(...)");
        Appendable appendable2 = appendable.append('\n');
        Intrinsics.checkNotNullExpressionValue(appendable2, "append(...)");
        return appendable2;
    }

    @NotNull
    @SinceKotlin(version="1.4")
    @WasExperimental(markerClass={ExperimentalStdlibApi.class})
    public static final <T extends Appendable> T appendRange(@NotNull T $this$appendRange, @NotNull CharSequence value, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter($this$appendRange, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        Appendable appendable = $this$appendRange.append(value, startIndex, endIndex);
        Intrinsics.checkNotNull(appendable, "null cannot be cast to non-null type T of kotlin.text.StringsKt__AppendableKt.appendRange");
        return (T)appendable;
    }

    @SinceKotlin(version="1.4")
    @InlineOnly
    private static final Appendable appendLine(Appendable $this$appendLine) {
        Intrinsics.checkNotNullParameter($this$appendLine, "<this>");
        Appendable appendable = $this$appendLine.append('\n');
        Intrinsics.checkNotNullExpressionValue(appendable, "append(...)");
        return appendable;
    }

    public static final <T> void appendElement(@NotNull Appendable $this$appendElement, T element, @Nullable Function1<? super T, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter($this$appendElement, "<this>");
        Function1<T, CharSequence> function1 = transform;
        if (function1 != null) {
            $this$appendElement.append(function1.invoke(element));
        } else {
            T t = element;
            boolean bl = t == null ? true : t instanceof CharSequence;
            if (bl) {
                $this$appendElement.append((CharSequence)element);
            } else if (element instanceof Character) {
                $this$appendElement.append(((Character)element).charValue());
            } else {
                $this$appendElement.append(String.valueOf(element));
            }
        }
    }

    @NotNull
    public static final <T extends Appendable> T append(@NotNull T $this$append, CharSequence ... value) {
        T t;
        Intrinsics.checkNotNullParameter($this$append, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        int n = value.length;
        for (int i = 0; i < n; ++i) {
            CharSequence item = value[i];
            $this$append.append(item);
        }
        return t;
    }
}

