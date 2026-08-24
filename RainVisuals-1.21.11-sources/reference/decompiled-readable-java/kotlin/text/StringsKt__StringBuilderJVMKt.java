/*
 * Decompiled with CFR 0.152.
 */
package kotlin.text;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__RegexExtensionsKt;
import kotlin.text.SystemProperties;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=5, xi=49, d1={"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\b\u0004\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\t\u001a&\u0010\u0004\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0087\b\u00a2\u0006\u0004\b\u0004\u0010\u0005\u001a$\u0010\u0004\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0003\u001a\u00020\u0006H\u0087\b\u00a2\u0006\u0004\b\u0004\u0010\u0007\u001a$\u0010\u0004\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0003\u001a\u00020\bH\u0087\b\u00a2\u0006\u0004\b\u0004\u0010\t\u001a$\u0010\u0004\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0003\u001a\u00020\nH\u0087\b\u00a2\u0006\u0004\b\u0004\u0010\u000b\u001a$\u0010\u0004\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0003\u001a\u00020\fH\u0087\b\u00a2\u0006\u0004\b\u0004\u0010\r\u001a$\u0010\u0004\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0003\u001a\u00020\u000eH\u0087\b\u00a2\u0006\u0004\b\u0004\u0010\u000f\u001a$\u0010\u0004\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0003\u001a\u00020\u0010H\u0087\b\u00a2\u0006\u0004\b\u0004\u0010\u0011\u001a,\u0010\u0004\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u000e\u0010\u0003\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0001H\u0087\b\u00a2\u0006\u0004\b\u0004\u0010\u0012\u001a4\u0010\u0016\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0003\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\fH\u0087\b\u00a2\u0006\u0004\b\u0016\u0010\u0017\u001a4\u0010\u0016\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0003\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\fH\u0087\b\u00a2\u0006\u0004\b\u0016\u0010\u0019\u001a\u001b\u0010\u001c\u001a\u00060\u001aj\u0002`\u001b*\u00060\u001aj\u0002`\u001bH\u0007\u00a2\u0006\u0004\b\u001c\u0010\u001d\u001a$\u0010\u001c\u001a\u00060\u001aj\u0002`\u001b*\u00060\u001aj\u0002`\u001b2\u0006\u0010\u0003\u001a\u00020\u001eH\u0087\b\u00a2\u0006\u0004\b\u001c\u0010\u001f\u001a&\u0010\u001c\u001a\u00060\u001aj\u0002`\u001b*\u00060\u001aj\u0002`\u001b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0018H\u0087\b\u00a2\u0006\u0004\b\u001c\u0010 \u001a\u001b\u0010\u001c\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u0001H\u0007\u00a2\u0006\u0004\b\u001c\u0010!\u001a&\u0010\u001c\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0087\b\u00a2\u0006\u0004\b\u001c\u0010\u0005\u001a&\u0010\u001c\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\"H\u0087\b\u00a2\u0006\u0004\b\u001c\u0010#\u001a$\u0010\u001c\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0003\u001a\u00020$H\u0087\b\u00a2\u0006\u0004\b\u001c\u0010%\u001a$\u0010\u001c\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0003\u001a\u00020\u0006H\u0087\b\u00a2\u0006\u0004\b\u001c\u0010\u0007\u001a$\u0010\u001c\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0003\u001a\u00020\u001eH\u0087\b\u00a2\u0006\u0004\b\u001c\u0010&\u001a$\u0010\u001c\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0003\u001a\u00020\u0013H\u0087\b\u00a2\u0006\u0004\b\u001c\u0010'\u001a&\u0010\u001c\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0018H\u0087\b\u00a2\u0006\u0004\b\u001c\u0010(\u001a$\u0010\u001c\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0003\u001a\u00020\bH\u0087\b\u00a2\u0006\u0004\b\u001c\u0010\t\u001a$\u0010\u001c\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0003\u001a\u00020\nH\u0087\b\u00a2\u0006\u0004\b\u001c\u0010\u000b\u001a$\u0010\u001c\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0003\u001a\u00020\fH\u0087\b\u00a2\u0006\u0004\b\u001c\u0010\r\u001a$\u0010\u001c\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0003\u001a\u00020\u000eH\u0087\b\u00a2\u0006\u0004\b\u001c\u0010\u000f\u001a$\u0010\u001c\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0003\u001a\u00020\u0010H\u0087\b\u00a2\u0006\u0004\b\u001c\u0010\u0011\u001a&\u0010\u001c\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010)H\u0087\b\u00a2\u0006\u0004\b\u001c\u0010*\u001a,\u0010\u001c\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u000e\u0010\u0003\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0001H\u0087\b\u00a2\u0006\u0004\b\u001c\u0010\u0012\u001a\u001b\u0010+\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u0001H\u0007\u00a2\u0006\u0004\b+\u0010!\u001a$\u0010-\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010,\u001a\u00020\fH\u0087\b\u00a2\u0006\u0004\b-\u0010\r\u001a,\u0010.\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\fH\u0087\b\u00a2\u0006\u0004\b.\u0010/\u001a<\u00100\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010,\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\fH\u0087\b\u00a2\u0006\u0004\b0\u00101\u001a<\u00100\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010,\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\fH\u0087\b\u00a2\u0006\u0004\b0\u00102\u001a(\u00104\u001a\u000203*\u00060\u0000j\u0002`\u00012\u0006\u0010,\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u001eH\u0087\n\u00a2\u0006\u0004\b4\u00105\u001a4\u00106\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020)H\u0087\b\u00a2\u0006\u0004\b6\u00107\u001a>\u0010:\u001a\u000203*\u00060\u0000j\u0002`\u00012\u0006\u00108\u001a\u00020\u00132\b\b\u0002\u00109\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\f2\b\b\u0002\u0010\u0015\u001a\u00020\fH\u0087\b\u00a2\u0006\u0004\b:\u0010;\u00a8\u0006<"}, d2={"Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "Ljava/lang/StringBuffer;", "value", "appendLine", "(Ljava/lang/StringBuilder;Ljava/lang/StringBuffer;)Ljava/lang/StringBuilder;", "", "(Ljava/lang/StringBuilder;B)Ljava/lang/StringBuilder;", "", "(Ljava/lang/StringBuilder;D)Ljava/lang/StringBuilder;", "", "(Ljava/lang/StringBuilder;F)Ljava/lang/StringBuilder;", "", "(Ljava/lang/StringBuilder;I)Ljava/lang/StringBuilder;", "", "(Ljava/lang/StringBuilder;J)Ljava/lang/StringBuilder;", "", "(Ljava/lang/StringBuilder;S)Ljava/lang/StringBuilder;", "(Ljava/lang/StringBuilder;Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;", "", "startIndex", "endIndex", "appendRange", "(Ljava/lang/StringBuilder;[CII)Ljava/lang/StringBuilder;", "", "(Ljava/lang/StringBuilder;Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "appendln", "(Ljava/lang/Appendable;)Ljava/lang/Appendable;", "", "(Ljava/lang/Appendable;C)Ljava/lang/Appendable;", "(Ljava/lang/Appendable;Ljava/lang/CharSequence;)Ljava/lang/Appendable;", "(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;", "", "(Ljava/lang/StringBuilder;Ljava/lang/Object;)Ljava/lang/StringBuilder;", "", "(Ljava/lang/StringBuilder;Z)Ljava/lang/StringBuilder;", "(Ljava/lang/StringBuilder;C)Ljava/lang/StringBuilder;", "(Ljava/lang/StringBuilder;[C)Ljava/lang/StringBuilder;", "(Ljava/lang/StringBuilder;Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;", "", "(Ljava/lang/StringBuilder;Ljava/lang/String;)Ljava/lang/StringBuilder;", "clear", "index", "deleteAt", "deleteRange", "(Ljava/lang/StringBuilder;II)Ljava/lang/StringBuilder;", "insertRange", "(Ljava/lang/StringBuilder;I[CII)Ljava/lang/StringBuilder;", "(Ljava/lang/StringBuilder;ILjava/lang/CharSequence;II)Ljava/lang/StringBuilder;", "", "set", "(Ljava/lang/StringBuilder;IC)V", "setRange", "(Ljava/lang/StringBuilder;IILjava/lang/String;)Ljava/lang/StringBuilder;", "destination", "destinationOffset", "toCharArray", "(Ljava/lang/StringBuilder;[CIII)V", "kotlin-stdlib"}, xs="kotlin/text/StringsKt")
class StringsKt__StringBuilderJVMKt
extends StringsKt__RegexExtensionsKt {
    @Deprecated(message="Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith=@ReplaceWith(expression="appendLine(value)", imports={}), level=DeprecationLevel.WARNING)
    @InlineOnly
    private static final StringBuilder appendln(StringBuilder $this$appendln, CharSequence value) {
        Intrinsics.checkNotNullParameter($this$appendln, "<this>");
        StringBuilder stringBuilder = $this$appendln.append(value);
        Intrinsics.checkNotNullExpressionValue(stringBuilder, "append(...)");
        return StringsKt.appendln(stringBuilder);
    }

    @InlineOnly
    @SinceKotlin(version="1.4")
    private static final StringBuilder appendLine(StringBuilder $this$appendLine, short value) {
        Intrinsics.checkNotNullParameter($this$appendLine, "<this>");
        StringBuilder stringBuilder = $this$appendLine.append(value);
        Intrinsics.checkNotNullExpressionValue(stringBuilder, "append(...)");
        StringBuilder stringBuilder2 = stringBuilder.append('\n');
        Intrinsics.checkNotNullExpressionValue(stringBuilder2, "append(...)");
        return stringBuilder2;
    }

    @Deprecated(message="Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith=@ReplaceWith(expression="appendLine(value)", imports={}), level=DeprecationLevel.WARNING)
    @InlineOnly
    private static final StringBuilder appendln(StringBuilder $this$appendln, byte value) {
        Intrinsics.checkNotNullParameter($this$appendln, "<this>");
        StringBuilder stringBuilder = $this$appendln.append(value);
        Intrinsics.checkNotNullExpressionValue(stringBuilder, "append(...)");
        return StringsKt.appendln(stringBuilder);
    }

    @Deprecated(message="Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith=@ReplaceWith(expression="appendLine(value)", imports={}), level=DeprecationLevel.WARNING)
    @InlineOnly
    private static final StringBuilder appendln(StringBuilder $this$appendln, String value) {
        Intrinsics.checkNotNullParameter($this$appendln, "<this>");
        StringBuilder stringBuilder = $this$appendln.append(value);
        Intrinsics.checkNotNullExpressionValue(stringBuilder, "append(...)");
        return StringsKt.appendln(stringBuilder);
    }

    @WasExperimental(markerClass={ExperimentalStdlibApi.class})
    @InlineOnly
    @SinceKotlin(version="1.4")
    private static final StringBuilder insertRange(StringBuilder $this$insertRange, int index, char[] value, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter($this$insertRange, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        StringBuilder stringBuilder = $this$insertRange.insert(index, value, startIndex, endIndex - startIndex);
        Intrinsics.checkNotNullExpressionValue(stringBuilder, "insert(...)");
        return stringBuilder;
    }

    @Deprecated(message="Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith=@ReplaceWith(expression="appendLine(value)", imports={}), level=DeprecationLevel.WARNING)
    @InlineOnly
    private static final StringBuilder appendln(StringBuilder $this$appendln, float value) {
        Intrinsics.checkNotNullParameter($this$appendln, "<this>");
        StringBuilder stringBuilder = $this$appendln.append(value);
        Intrinsics.checkNotNullExpressionValue(stringBuilder, "append(...)");
        return StringsKt.appendln(stringBuilder);
    }

    @Deprecated(message="Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith=@ReplaceWith(expression="appendLine(value)", imports={}), level=DeprecationLevel.WARNING)
    @InlineOnly
    private static final Appendable appendln(Appendable $this$appendln, CharSequence value) {
        Intrinsics.checkNotNullParameter($this$appendln, "<this>");
        Appendable appendable = $this$appendln.append(value);
        Intrinsics.checkNotNullExpressionValue(appendable, "append(...)");
        return StringsKt.appendln(appendable);
    }

    @WasExperimental(markerClass={ExperimentalStdlibApi.class})
    @SinceKotlin(version="1.4")
    @InlineOnly
    private static final StringBuilder setRange(StringBuilder $this$setRange, int startIndex, int endIndex, String value) {
        Intrinsics.checkNotNullParameter($this$setRange, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        StringBuilder stringBuilder = $this$setRange.replace(startIndex, endIndex, value);
        Intrinsics.checkNotNullExpressionValue(stringBuilder, "replace(...)");
        return stringBuilder;
    }

    @Deprecated(message="Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith=@ReplaceWith(expression="appendLine(value)", imports={}), level=DeprecationLevel.WARNING)
    @InlineOnly
    private static final StringBuilder appendln(StringBuilder $this$appendln, boolean value) {
        Intrinsics.checkNotNullParameter($this$appendln, "<this>");
        StringBuilder stringBuilder = $this$appendln.append(value);
        Intrinsics.checkNotNullExpressionValue(stringBuilder, "append(...)");
        return StringsKt.appendln(stringBuilder);
    }

    @Deprecated(message="Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith=@ReplaceWith(expression="appendLine(value)", imports={}), level=DeprecationLevel.WARNING)
    @InlineOnly
    private static final StringBuilder appendln(StringBuilder $this$appendln, short value) {
        Intrinsics.checkNotNullParameter($this$appendln, "<this>");
        StringBuilder stringBuilder = $this$appendln.append(value);
        Intrinsics.checkNotNullExpressionValue(stringBuilder, "append(...)");
        return StringsKt.appendln(stringBuilder);
    }

    @Deprecated(message="Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith=@ReplaceWith(expression="appendLine(value)", imports={}), level=DeprecationLevel.WARNING)
    @InlineOnly
    private static final StringBuilder appendln(StringBuilder $this$appendln, long value) {
        Intrinsics.checkNotNullParameter($this$appendln, "<this>");
        StringBuilder stringBuilder = $this$appendln.append(value);
        Intrinsics.checkNotNullExpressionValue(stringBuilder, "append(...)");
        return StringsKt.appendln(stringBuilder);
    }

    @Deprecated(message="Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith=@ReplaceWith(expression="appendLine()", imports={}), level=DeprecationLevel.WARNING)
    @NotNull
    public static final StringBuilder appendln(@NotNull StringBuilder $this$appendln) {
        Intrinsics.checkNotNullParameter($this$appendln, "<this>");
        StringBuilder stringBuilder = $this$appendln.append(SystemProperties.LINE_SEPARATOR);
        Intrinsics.checkNotNullExpressionValue(stringBuilder, "append(...)");
        return stringBuilder;
    }

    @Deprecated(message="Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith=@ReplaceWith(expression="appendLine(value)", imports={}), level=DeprecationLevel.WARNING)
    @InlineOnly
    private static final StringBuilder appendln(StringBuilder $this$appendln, StringBuffer value) {
        Intrinsics.checkNotNullParameter($this$appendln, "<this>");
        StringBuilder stringBuilder = $this$appendln.append(value);
        Intrinsics.checkNotNullExpressionValue(stringBuilder, "append(...)");
        return StringsKt.appendln(stringBuilder);
    }

    @Deprecated(message="Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith=@ReplaceWith(expression="appendLine(value)", imports={}), level=DeprecationLevel.WARNING)
    @InlineOnly
    private static final StringBuilder appendln(StringBuilder $this$appendln, Object value) {
        Intrinsics.checkNotNullParameter($this$appendln, "<this>");
        StringBuilder stringBuilder = $this$appendln.append(value);
        Intrinsics.checkNotNullExpressionValue(stringBuilder, "append(...)");
        return StringsKt.appendln(stringBuilder);
    }

    @SinceKotlin(version="1.4")
    @InlineOnly
    private static final StringBuilder appendLine(StringBuilder $this$appendLine, float value) {
        Intrinsics.checkNotNullParameter($this$appendLine, "<this>");
        StringBuilder stringBuilder = $this$appendLine.append(value);
        Intrinsics.checkNotNullExpressionValue(stringBuilder, "append(...)");
        StringBuilder stringBuilder2 = stringBuilder.append('\n');
        Intrinsics.checkNotNullExpressionValue(stringBuilder2, "append(...)");
        return stringBuilder2;
    }

    @WasExperimental(markerClass={ExperimentalStdlibApi.class})
    @InlineOnly
    @SinceKotlin(version="1.4")
    private static final void toCharArray(StringBuilder $this$toCharArray, char[] destination, int destinationOffset, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter($this$toCharArray, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        $this$toCharArray.getChars(startIndex, endIndex, destination, destinationOffset);
    }

    @SinceKotlin(version="1.4")
    @InlineOnly
    @WasExperimental(markerClass={ExperimentalStdlibApi.class})
    private static final StringBuilder deleteAt(StringBuilder $this$deleteAt, int index) {
        Intrinsics.checkNotNullParameter($this$deleteAt, "<this>");
        StringBuilder stringBuilder = $this$deleteAt.deleteCharAt(index);
        Intrinsics.checkNotNullExpressionValue(stringBuilder, "deleteCharAt(...)");
        return stringBuilder;
    }

    @InlineOnly
    private static final void set(StringBuilder $this$set, int index, char value) {
        Intrinsics.checkNotNullParameter($this$set, "<this>");
        $this$set.setCharAt(index, value);
    }

    @InlineOnly
    @SinceKotlin(version="1.4")
    private static final StringBuilder appendLine(StringBuilder $this$appendLine, StringBuilder value) {
        Intrinsics.checkNotNullParameter($this$appendLine, "<this>");
        StringBuilder stringBuilder = $this$appendLine.append((CharSequence)value);
        Intrinsics.checkNotNullExpressionValue(stringBuilder, "append(...)");
        StringBuilder stringBuilder2 = stringBuilder.append('\n');
        Intrinsics.checkNotNullExpressionValue(stringBuilder2, "append(...)");
        return stringBuilder2;
    }

    @Deprecated(message="Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith=@ReplaceWith(expression="appendLine(value)", imports={}), level=DeprecationLevel.WARNING)
    @InlineOnly
    private static final StringBuilder appendln(StringBuilder $this$appendln, int value) {
        Intrinsics.checkNotNullParameter($this$appendln, "<this>");
        StringBuilder stringBuilder = $this$appendln.append(value);
        Intrinsics.checkNotNullExpressionValue(stringBuilder, "append(...)");
        return StringsKt.appendln(stringBuilder);
    }

    @SinceKotlin(version="1.4")
    @InlineOnly
    private static final StringBuilder appendLine(StringBuilder $this$appendLine, long value) {
        Intrinsics.checkNotNullParameter($this$appendLine, "<this>");
        StringBuilder stringBuilder = $this$appendLine.append(value);
        Intrinsics.checkNotNullExpressionValue(stringBuilder, "append(...)");
        StringBuilder stringBuilder2 = stringBuilder.append('\n');
        Intrinsics.checkNotNullExpressionValue(stringBuilder2, "append(...)");
        return stringBuilder2;
    }

    @SinceKotlin(version="1.4")
    @InlineOnly
    private static final StringBuilder appendLine(StringBuilder $this$appendLine, int value) {
        Intrinsics.checkNotNullParameter($this$appendLine, "<this>");
        StringBuilder stringBuilder = $this$appendLine.append(value);
        Intrinsics.checkNotNullExpressionValue(stringBuilder, "append(...)");
        StringBuilder stringBuilder2 = stringBuilder.append('\n');
        Intrinsics.checkNotNullExpressionValue(stringBuilder2, "append(...)");
        return stringBuilder2;
    }

    @SinceKotlin(version="1.3")
    @NotNull
    public static final StringBuilder clear(@NotNull StringBuilder $this$clear) {
        StringBuilder stringBuilder;
        Intrinsics.checkNotNullParameter($this$clear, "<this>");
        StringBuilder $this$clear_u24lambda_u240 = stringBuilder = $this$clear;
        boolean bl = false;
        $this$clear_u24lambda_u240.setLength(0);
        return stringBuilder;
    }

    @Deprecated(message="Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith=@ReplaceWith(expression="appendLine(value)", imports={}), level=DeprecationLevel.WARNING)
    @InlineOnly
    private static final Appendable appendln(Appendable $this$appendln, char value) {
        Intrinsics.checkNotNullParameter($this$appendln, "<this>");
        Appendable appendable = $this$appendln.append(value);
        Intrinsics.checkNotNullExpressionValue(appendable, "append(...)");
        return StringsKt.appendln(appendable);
    }

    @SinceKotlin(version="1.4")
    @InlineOnly
    private static final StringBuilder appendLine(StringBuilder $this$appendLine, StringBuffer value) {
        Intrinsics.checkNotNullParameter($this$appendLine, "<this>");
        StringBuilder stringBuilder = $this$appendLine.append(value);
        Intrinsics.checkNotNullExpressionValue(stringBuilder, "append(...)");
        StringBuilder stringBuilder2 = stringBuilder.append('\n');
        Intrinsics.checkNotNullExpressionValue(stringBuilder2, "append(...)");
        return stringBuilder2;
    }

    @InlineOnly
    @SinceKotlin(version="1.4")
    private static final StringBuilder appendLine(StringBuilder $this$appendLine, byte value) {
        Intrinsics.checkNotNullParameter($this$appendLine, "<this>");
        StringBuilder stringBuilder = $this$appendLine.append(value);
        Intrinsics.checkNotNullExpressionValue(stringBuilder, "append(...)");
        StringBuilder stringBuilder2 = stringBuilder.append('\n');
        Intrinsics.checkNotNullExpressionValue(stringBuilder2, "append(...)");
        return stringBuilder2;
    }

    @Deprecated(message="Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith=@ReplaceWith(expression="appendLine(value)", imports={}), level=DeprecationLevel.WARNING)
    @InlineOnly
    private static final StringBuilder appendln(StringBuilder $this$appendln, char[] value) {
        Intrinsics.checkNotNullParameter($this$appendln, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        StringBuilder stringBuilder = $this$appendln.append(value);
        Intrinsics.checkNotNullExpressionValue(stringBuilder, "append(...)");
        return StringsKt.appendln(stringBuilder);
    }

    @SinceKotlin(version="1.4")
    @InlineOnly
    @WasExperimental(markerClass={ExperimentalStdlibApi.class})
    private static final StringBuilder appendRange(StringBuilder $this$appendRange, char[] value, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter($this$appendRange, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        StringBuilder stringBuilder = $this$appendRange.append(value, startIndex, endIndex - startIndex);
        Intrinsics.checkNotNullExpressionValue(stringBuilder, "append(...)");
        return stringBuilder;
    }

    @Deprecated(message="Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith=@ReplaceWith(expression="appendLine(value)", imports={}), level=DeprecationLevel.WARNING)
    @InlineOnly
    private static final StringBuilder appendln(StringBuilder $this$appendln, StringBuilder value) {
        Intrinsics.checkNotNullParameter($this$appendln, "<this>");
        StringBuilder stringBuilder = $this$appendln.append((CharSequence)value);
        Intrinsics.checkNotNullExpressionValue(stringBuilder, "append(...)");
        return StringsKt.appendln(stringBuilder);
    }

    @Deprecated(message="Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith=@ReplaceWith(expression="appendLine()", imports={}), level=DeprecationLevel.WARNING)
    @NotNull
    public static final Appendable appendln(@NotNull Appendable $this$appendln) {
        Intrinsics.checkNotNullParameter($this$appendln, "<this>");
        Appendable appendable = $this$appendln.append(SystemProperties.LINE_SEPARATOR);
        Intrinsics.checkNotNullExpressionValue(appendable, "append(...)");
        return appendable;
    }

    @SinceKotlin(version="1.4")
    @WasExperimental(markerClass={ExperimentalStdlibApi.class})
    @InlineOnly
    private static final StringBuilder insertRange(StringBuilder $this$insertRange, int index, CharSequence value, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter($this$insertRange, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        StringBuilder stringBuilder = $this$insertRange.insert(index, value, startIndex, endIndex);
        Intrinsics.checkNotNullExpressionValue(stringBuilder, "insert(...)");
        return stringBuilder;
    }

    @InlineOnly
    @SinceKotlin(version="1.4")
    private static final StringBuilder appendLine(StringBuilder $this$appendLine, double value) {
        Intrinsics.checkNotNullParameter($this$appendLine, "<this>");
        StringBuilder stringBuilder = $this$appendLine.append(value);
        Intrinsics.checkNotNullExpressionValue(stringBuilder, "append(...)");
        StringBuilder stringBuilder2 = stringBuilder.append('\n');
        Intrinsics.checkNotNullExpressionValue(stringBuilder2, "append(...)");
        return stringBuilder2;
    }

    /*
     * WARNING - void declaration
     */
    static /* synthetic */ void toCharArray$default(StringBuilder $this$toCharArray_u24default, char[] destination, int destinationOffset, int startIndex, int endIndex, int n, Object object) {
        void var2_2;
        void var1_1;
        if ((n & 2) != 0) {
            destinationOffset = 0;
        }
        if ((n & 4) != 0) {
            startIndex = 0;
        }
        if ((n & 8) != 0) {
            endIndex = $this$toCharArray_u24default.length();
        }
        Intrinsics.checkNotNullParameter($this$toCharArray_u24default, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        $this$toCharArray_u24default.getChars(startIndex, endIndex, (char[])var1_1, (int)var2_2);
    }

    @WasExperimental(markerClass={ExperimentalStdlibApi.class})
    @SinceKotlin(version="1.4")
    @InlineOnly
    private static final StringBuilder appendRange(StringBuilder $this$appendRange, CharSequence value, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter($this$appendRange, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        StringBuilder stringBuilder = $this$appendRange.append(value, startIndex, endIndex);
        Intrinsics.checkNotNullExpressionValue(stringBuilder, "append(...)");
        return stringBuilder;
    }

    @Deprecated(message="Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith=@ReplaceWith(expression="appendLine(value)", imports={}), level=DeprecationLevel.WARNING)
    @InlineOnly
    private static final StringBuilder appendln(StringBuilder $this$appendln, char value) {
        Intrinsics.checkNotNullParameter($this$appendln, "<this>");
        StringBuilder stringBuilder = $this$appendln.append(value);
        Intrinsics.checkNotNullExpressionValue(stringBuilder, "append(...)");
        return StringsKt.appendln(stringBuilder);
    }

    @WasExperimental(markerClass={ExperimentalStdlibApi.class})
    @InlineOnly
    @SinceKotlin(version="1.4")
    private static final StringBuilder deleteRange(StringBuilder $this$deleteRange, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter($this$deleteRange, "<this>");
        StringBuilder stringBuilder = $this$deleteRange.delete(startIndex, endIndex);
        Intrinsics.checkNotNullExpressionValue(stringBuilder, "delete(...)");
        return stringBuilder;
    }

    @Deprecated(message="Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith=@ReplaceWith(expression="appendLine(value)", imports={}), level=DeprecationLevel.WARNING)
    @InlineOnly
    private static final StringBuilder appendln(StringBuilder $this$appendln, double value) {
        Intrinsics.checkNotNullParameter($this$appendln, "<this>");
        StringBuilder stringBuilder = $this$appendln.append(value);
        Intrinsics.checkNotNullExpressionValue(stringBuilder, "append(...)");
        return StringsKt.appendln(stringBuilder);
    }
}

