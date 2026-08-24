/*
 * Decompiled with CFR 0.152.
 */
package kotlin.text;

import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__IndentKt;

@Metadata(mv={1, 9, 0}, k=5, xi=49, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0087\b\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2={"Ljava/util/regex/Pattern;", "Lkotlin/text/Regex;", "toRegex", "(Ljava/util/regex/Pattern;)Lkotlin/text/Regex;", "kotlin-stdlib"}, xs="kotlin/text/StringsKt")
class StringsKt__RegexExtensionsJVMKt
extends StringsKt__IndentKt {
    @InlineOnly
    private static final Regex toRegex(Pattern $this$toRegex) {
        Intrinsics.checkNotNullParameter($this$toRegex, "<this>");
        return new Regex($this$toRegex);
    }
}

