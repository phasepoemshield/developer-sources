/*
 * Decompiled with CFR 0.152.
 */
package kotlin.text;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.internal.IntrinsicConstEvaluation;
import kotlin.internal.PlatformImplementationsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__AppendableKt;
import kotlin.text.StringsKt__IndentKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=5, xi=49, d1={"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u000f\u001a#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u00a2\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\t\u001a\u00020\u0006*\u00020\u0000H\u0002\u00a2\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\n\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u0000\u00a2\u0006\u0004\b\n\u0010\u000b\u001aL\u0010\u0012\u001a\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00000\f2\u0006\u0010\r\u001a\u00020\u00062\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u00022\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0002H\u0082\b\u00a2\u0006\u0004\b\u0010\u0010\u0011\u001a\u001b\u0010\u0014\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u0000\u00a2\u0006\u0004\b\u0014\u0010\u000b\u001a%\u0010\u0016\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u0000\u00a2\u0006\u0004\b\u0016\u0010\u0017\u001a\u0013\u0010\u0018\u001a\u00020\u0000*\u00020\u0000H\u0007\u00a2\u0006\u0004\b\u0018\u0010\u0019\u001a\u001d\u0010\u001a\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\b\u001a\u0010\u000b\u00a8\u0006\u001b"}, d2={"", "indent", "Lkotlin/Function1;", "getIndentFunction$StringsKt__IndentKt", "(Ljava/lang/String;)Lkotlin/jvm/functions/Function1;", "getIndentFunction", "", "indentWidth$StringsKt__IndentKt", "(Ljava/lang/String;)I", "indentWidth", "prependIndent", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "resultSizeEstimate", "indentAddFunction", "indentCutFunction", "reindent$StringsKt__IndentKt", "(Ljava/util/List;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;", "reindent", "newIndent", "replaceIndent", "marginPrefix", "replaceIndentByMargin", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "trimIndent", "(Ljava/lang/String;)Ljava/lang/String;", "trimMargin", "kotlin-stdlib"}, xs="kotlin/text/StringsKt")
class StringsKt__IndentKt
extends StringsKt__AppendableKt {
    public static /* synthetic */ String replaceIndentByMargin$default(String string, String string2, String string3, int n, Object object) {
        if ((n & 1) != 0) {
            string2 = "";
        }
        if ((n & 2) != 0) {
            string3 = "|";
        }
        return StringsKt.replaceIndentByMargin(string, string2, string3);
    }

    public static /* synthetic */ String prependIndent$default(String string, String string2, int n, Object object) {
        if ((n & 1) != 0) {
            string2 = "    ";
        }
        return StringsKt.prependIndent(string, string2);
    }

    public static /* synthetic */ String trimMargin$default(String string, String string2, int n, Object object) {
        if ((n & 1) != 0) {
            string2 = "|";
        }
        return StringsKt.trimMargin(string, string2);
    }

    /*
     * WARNING - void declaration
     */
    private static final int indentWidth$StringsKt__IndentKt(String $this$indentWidth) {
        void var2_3;
        String string;
        int n;
        int n2;
        block1: {
            CharSequence $this$indexOfFirst$iv = $this$indentWidth;
            boolean $i$f$indexOfFirst = false;
            int n3 = $this$indexOfFirst$iv.length();
            for (int index$iv = 0; index$iv < n3; ++index$iv) {
                char it = $this$indexOfFirst$iv.charAt(index$iv);
                boolean bl = false;
                boolean bl2 = !CharsKt.isWhitespace(it);
                if (!bl2) continue;
                n2 = index$iv;
                break block1;
            }
            n2 = -1;
        }
        int it = n = n2;
        boolean bl = false;
        return it == -1 ? string.length() : var2_3;
    }

    @NotNull
    @IntrinsicConstEvaluation
    public static final String trimMargin(@NotNull String $this$trimMargin, @NotNull String marginPrefix) {
        Intrinsics.checkNotNullParameter($this$trimMargin, "<this>");
        Intrinsics.checkNotNullParameter(marginPrefix, "marginPrefix");
        return StringsKt.replaceIndentByMargin($this$trimMargin, "", marginPrefix);
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public static final String replaceIndentByMargin(@NotNull String $this$replaceIndentByMargin, @NotNull String newIndent, @NotNull String marginPrefix) {
        void var12_15;
        void $this$mapIndexedNotNullTo$iv$iv$iv;
        void $this$reindent$iv;
        Intrinsics.checkNotNullParameter($this$replaceIndentByMargin, "<this>");
        Intrinsics.checkNotNullParameter(newIndent, "newIndent");
        Intrinsics.checkNotNullParameter(marginPrefix, "marginPrefix");
        boolean bl = !StringsKt.isBlank(marginPrefix);
        if (!bl) {
            boolean $i$a$-require-StringsKt__IndentKt$replaceIndentByMargin$22 = false;
            String $i$a$-require-StringsKt__IndentKt$replaceIndentByMargin$22 = "marginPrefix must be non-blank string.";
            throw new IllegalArgumentException($i$a$-require-StringsKt__IndentKt$replaceIndentByMargin$22.toString());
        }
        List<String> lines = StringsKt.lines($this$replaceIndentByMargin);
        List<String> $i$a$-require-StringsKt__IndentKt$replaceIndentByMargin$22 = lines;
        int resultSizeEstimate$iv = $this$replaceIndentByMargin.length() + newIndent.length() * lines.size();
        Function1<String, String> indentAddFunction$iv = StringsKt__IndentKt.getIndentFunction$StringsKt__IndentKt(newIndent);
        boolean $i$f$reindent = false;
        int lastIndex$iv = CollectionsKt.getLastIndex($this$reindent$iv);
        Iterable $this$mapIndexedNotNull$iv$iv = (Iterable)$this$reindent$iv;
        boolean $i$f$mapIndexedNotNull = false;
        Iterable iterable = $this$mapIndexedNotNull$iv$iv;
        Collection destination$iv$iv$iv = new ArrayList();
        boolean $i$f$mapIndexedNotNullTo = false;
        void $this$forEachIndexed$iv$iv$iv$iv = $this$mapIndexedNotNullTo$iv$iv$iv;
        boolean $i$f$forEachIndexed = false;
        int index$iv$iv$iv$iv = 0;
        for (Object item$iv$iv$iv$iv : $this$forEachIndexed$iv$iv$iv$iv) {
            String string;
            String string2;
            int n;
            if ((n = index$iv$iv$iv$iv++) < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Object element$iv$iv$iv = item$iv$iv$iv$iv;
            int index$iv$iv$iv = n;
            boolean bl2 = false;
            String value$iv = (String)element$iv$iv$iv;
            int index$iv = index$iv$iv$iv;
            boolean bl3 = false;
            if ((index$iv == 0 || index$iv == lastIndex$iv) && StringsKt.isBlank(value$iv)) {
                string2 = null;
            } else {
                String string3;
                String string4;
                int n2;
                String line;
                block12: {
                    line = value$iv;
                    boolean bl4 = false;
                    CharSequence $this$indexOfFirst$iv = line;
                    boolean $i$f$indexOfFirst = false;
                    int index$iv2 = 0;
                    int n3 = $this$indexOfFirst$iv.length();
                    while (index$iv2 < n3) {
                        void var30_33;
                        char c = $this$indexOfFirst$iv.charAt(index$iv2);
                        boolean bl5 = false;
                        boolean bl6 = !CharsKt.isWhitespace(c);
                        if (bl6) {
                            n2 = var30_33;
                            break block12;
                        }
                        ++var30_33;
                    }
                    n2 = -1;
                }
                int firstNonWhitespaceIndex = n2;
                if (firstNonWhitespaceIndex == -1) {
                    string4 = null;
                } else if (StringsKt.startsWith$default(line, marginPrefix, firstNonWhitespaceIndex, false, 4, null)) {
                    String string5 = line;
                    int n4 = firstNonWhitespaceIndex + marginPrefix.length();
                    Intrinsics.checkNotNull(string5, "null cannot be cast to non-null type java.lang.String");
                    String string6 = string5.substring(n4);
                    string4 = string6;
                    Intrinsics.checkNotNullExpressionValue(string6, "substring(...)");
                } else {
                    string4 = null;
                }
                string2 = string4;
                if (string4 == null || (string2 = indentAddFunction$iv.invoke(string3 = string2)) == null) {
                    void var23_26;
                    string2 = var23_26;
                }
            }
            if (string2 == null) continue;
            String string7 = string = string2;
            boolean bl7 = false;
            var12_15.add(string7);
        }
        String string = ((StringBuilder)CollectionsKt.joinTo$default((List)var12_15, new StringBuilder(resultSizeEstimate$iv), "\n", null, null, 0, null, null, 124, null)).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @NotNull
    @IntrinsicConstEvaluation
    public static final String trimIndent(@NotNull String $this$trimIndent) {
        Intrinsics.checkNotNullParameter($this$trimIndent, "<this>");
        return StringsKt.replaceIndent($this$trimIndent, "");
    }

    private static final Function1<String, String> getIndentFunction$StringsKt__IndentKt(String indent) {
        return ((CharSequence)indent).length() == 0 ? (Function1)getIndentFunction.1.INSTANCE : (Function1)new Function1<String, String>(indent){
            final /* synthetic */ String $indent;

            @NotNull
            public final String invoke(@NotNull String line) {
                Intrinsics.checkNotNullParameter(line, "line");
                return this.$indent + line;
            }
            {
                this.$indent = $indent;
                super(1);
            }
        };
    }

    public static /* synthetic */ String replaceIndent$default(String string, String string2, int n, Object object) {
        if ((n & 1) != 0) {
            string2 = "";
        }
        return StringsKt.replaceIndent(string, string2);
    }

    /*
     * WARNING - void declaration
     */
    private static final String reindent$StringsKt__IndentKt(List<String> $this$reindent, int resultSizeEstimate, Function1<? super String, String> indentAddFunction, Function1<? super String, String> indentCutFunction) {
        void var10_9;
        void $this$mapIndexedNotNullTo$iv$iv;
        boolean $i$f$reindent = false;
        int lastIndex = CollectionsKt.getLastIndex($this$reindent);
        Iterable $this$mapIndexedNotNull$iv = $this$reindent;
        boolean $i$f$mapIndexedNotNull = false;
        Iterable iterable = $this$mapIndexedNotNull$iv;
        Collection destination$iv$iv = new ArrayList();
        boolean $i$f$mapIndexedNotNullTo = false;
        void $this$forEachIndexed$iv$iv$iv = $this$mapIndexedNotNullTo$iv$iv;
        boolean $i$f$forEachIndexed = false;
        int index$iv$iv$iv = 0;
        for (Object item$iv$iv$iv : $this$forEachIndexed$iv$iv$iv) {
            void var26_25;
            String string;
            String string2;
            block8: {
                void var21_20;
                block9: {
                    String value;
                    block7: {
                        int n;
                        if ((n = index$iv$iv$iv++) < 0) {
                            if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
                                CollectionsKt.throwIndexOverflow();
                            } else {
                                throw new ArithmeticException("Index overflow has happened.");
                            }
                        }
                        Object element$iv$iv = item$iv$iv$iv;
                        int index$iv$iv = n;
                        boolean bl = false;
                        value = (String)element$iv$iv;
                        int index = index$iv$iv;
                        boolean bl2 = false;
                        if (index != 0 && index != lastIndex || !StringsKt.isBlank(value)) break block7;
                        string2 = null;
                        break block8;
                    }
                    string2 = indentCutFunction.invoke(value);
                    if (string2 == null) break block9;
                    String string3 = string2;
                    string2 = indentAddFunction.invoke(string3);
                    if (string2 != null) break block8;
                }
                string2 = var21_20;
            }
            if (string2 == null) continue;
            String it$iv$iv = string = string2;
            boolean bl = false;
            destination$iv$iv.add(var26_25);
        }
        String string = ((StringBuilder)CollectionsKt.joinTo$default((List)var10_9, new StringBuilder(resultSizeEstimate), "\n", null, null, 0, null, null, 124, null)).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @NotNull
    public static final String prependIndent(@NotNull String $this$prependIndent, @NotNull String indent) {
        Intrinsics.checkNotNullParameter($this$prependIndent, "<this>");
        Intrinsics.checkNotNullParameter(indent, "indent");
        return SequencesKt.joinToString$default(SequencesKt.map(StringsKt.lineSequence($this$prependIndent), (Function1)new Function1<String, String>(indent){
            final /* synthetic */ String $indent;
            {
                this.$indent = $indent;
                super(1);
            }

            @NotNull
            public final String invoke(@NotNull String it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return StringsKt.isBlank(it) ? (it.length() < this.$indent.length() ? this.$indent : it) : this.$indent + it;
            }
        }), "\n", null, null, 0, null, null, 62, null);
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public static final String replaceIndent(@NotNull String $this$replaceIndent, @NotNull String newIndent) {
        void var12_16;
        void $this$reindent$iv;
        void $this$mapTo$iv$iv;
        String p0;
        Iterable $this$filterTo$iv$iv;
        Intrinsics.checkNotNullParameter($this$replaceIndent, "<this>");
        Intrinsics.checkNotNullParameter(newIndent, "newIndent");
        List<String> lines = StringsKt.lines($this$replaceIndent);
        Iterable $this$filter$iv = lines;
        boolean $i$f$filter = false;
        Iterable iterable = $this$filter$iv;
        Collection destination$iv$iv = new ArrayList();
        boolean $i$f$filterTo = false;
        for (Object element$iv$iv : $this$filterTo$iv$iv) {
            p0 = (String)element$iv$iv;
            boolean bl = false;
            boolean bl2 = !StringsKt.isBlank(p0);
            if (!bl2) continue;
            destination$iv$iv.add(element$iv$iv);
        }
        Iterable $this$map$iv = (List)destination$iv$iv;
        boolean $i$f$map = false;
        $this$filterTo$iv$iv = $this$map$iv;
        destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        boolean $i$f$mapTo = false;
        for (Object item$iv$iv : $this$mapTo$iv$iv) {
            p0 = (String)item$iv$iv;
            Collection collection = destination$iv$iv;
            boolean bl = false;
            collection.add(StringsKt__IndentKt.indentWidth$StringsKt__IndentKt(p0));
        }
        Integer n = (Integer)CollectionsKt.minOrNull((List)destination$iv$iv);
        int minCommonIndent = n != null ? n : 0;
        List<String> list = lines;
        int resultSizeEstimate$iv = $this$replaceIndent.length() + newIndent.length() * lines.size();
        Function1<String, String> indentAddFunction$iv = StringsKt__IndentKt.getIndentFunction$StringsKt__IndentKt(newIndent);
        boolean $i$f$reindent = false;
        int lastIndex$iv = CollectionsKt.getLastIndex($this$reindent$iv);
        Iterable $this$mapIndexedNotNull$iv$iv = (Iterable)$this$reindent$iv;
        boolean $i$f$mapIndexedNotNull = false;
        Iterable $this$mapIndexedNotNullTo$iv$iv$iv = $this$mapIndexedNotNull$iv$iv;
        Collection destination$iv$iv$iv = new ArrayList();
        boolean $i$f$mapIndexedNotNullTo = false;
        Iterable $this$forEachIndexed$iv$iv$iv$iv = $this$mapIndexedNotNullTo$iv$iv$iv;
        boolean $i$f$forEachIndexed = false;
        int index$iv$iv$iv$iv = 0;
        for (Object item$iv$iv$iv$iv : $this$forEachIndexed$iv$iv$iv$iv) {
            String string;
            String string2;
            int n2;
            if ((n2 = index$iv$iv$iv$iv++) < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Object element$iv$iv$iv = item$iv$iv$iv$iv;
            int index$iv$iv$iv = n2;
            boolean bl = false;
            String value$iv = (String)element$iv$iv$iv;
            int index$iv = index$iv$iv$iv;
            boolean bl3 = false;
            if ((index$iv == 0 || index$iv == lastIndex$iv) && StringsKt.isBlank(value$iv)) {
                string2 = null;
            } else {
                String string3;
                String string4 = value$iv;
                boolean bl4 = false;
                string2 = StringsKt.drop(string4, minCommonIndent);
                if (string2 == null || (string2 = indentAddFunction$iv.invoke(string3 = string2)) == null) {
                    void var23_30;
                    string2 = var23_30;
                }
            }
            if (string2 == null) continue;
            String string5 = string = string2;
            boolean bl5 = false;
            var12_16.add(string5);
        }
        String string = ((StringBuilder)CollectionsKt.joinTo$default((List)var12_16, new StringBuilder(resultSizeEstimate$iv), "\n", null, null, 0, null, null, 124, null)).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}

