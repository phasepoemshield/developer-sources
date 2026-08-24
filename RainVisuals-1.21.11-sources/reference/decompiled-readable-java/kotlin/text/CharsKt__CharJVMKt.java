/*
 * Decompiled with CFR 0.152.
 */
package kotlin.text;

import java.util.Locale;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.CharCategory;
import kotlin.text.CharDirectionality;
import kotlin.text.CharsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=5, xi=49, d1={"\u00008\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\b\u0002\u0010\u0003\u001a\u001f\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\b\u0006\u0010\u0007\u001a\u0014\u0010\t\u001a\u00020\b*\u00020\u0004H\u0087\b\u00a2\u0006\u0004\b\t\u0010\n\u001a\u0014\u0010\u000b\u001a\u00020\b*\u00020\u0004H\u0087\b\u00a2\u0006\u0004\b\u000b\u0010\n\u001a\u0014\u0010\f\u001a\u00020\b*\u00020\u0004H\u0087\b\u00a2\u0006\u0004\b\f\u0010\n\u001a\u0014\u0010\r\u001a\u00020\b*\u00020\u0004H\u0087\b\u00a2\u0006\u0004\b\r\u0010\n\u001a\u0014\u0010\u000e\u001a\u00020\b*\u00020\u0004H\u0087\b\u00a2\u0006\u0004\b\u000e\u0010\n\u001a\u0014\u0010\u000f\u001a\u00020\b*\u00020\u0004H\u0087\b\u00a2\u0006\u0004\b\u000f\u0010\n\u001a\u0014\u0010\u0010\u001a\u00020\b*\u00020\u0004H\u0087\b\u00a2\u0006\u0004\b\u0010\u0010\n\u001a\u0014\u0010\u0011\u001a\u00020\b*\u00020\u0004H\u0087\b\u00a2\u0006\u0004\b\u0011\u0010\n\u001a\u0014\u0010\u0012\u001a\u00020\b*\u00020\u0004H\u0087\b\u00a2\u0006\u0004\b\u0012\u0010\n\u001a\u0014\u0010\u0013\u001a\u00020\b*\u00020\u0004H\u0087\b\u00a2\u0006\u0004\b\u0013\u0010\n\u001a\u0014\u0010\u0014\u001a\u00020\b*\u00020\u0004H\u0087\b\u00a2\u0006\u0004\b\u0014\u0010\n\u001a\u0014\u0010\u0015\u001a\u00020\b*\u00020\u0004H\u0087\b\u00a2\u0006\u0004\b\u0015\u0010\n\u001a\u0014\u0010\u0016\u001a\u00020\b*\u00020\u0004H\u0087\b\u00a2\u0006\u0004\b\u0016\u0010\n\u001a\u0011\u0010\u0017\u001a\u00020\b*\u00020\u0004\u00a2\u0006\u0004\b\u0017\u0010\n\u001a\u0014\u0010\u0019\u001a\u00020\u0018*\u00020\u0004H\u0087\b\u00a2\u0006\u0004\b\u0019\u0010\u001a\u001a\u001b\u0010\u0019\u001a\u00020\u0018*\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH\u0007\u00a2\u0006\u0004\b\u0019\u0010\u001d\u001a\u0014\u0010\u001e\u001a\u00020\u0004*\u00020\u0004H\u0087\b\u00a2\u0006\u0004\b\u001e\u0010\u001f\u001a\u001b\u0010 \u001a\u00020\u0018*\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH\u0007\u00a2\u0006\u0004\b \u0010\u001d\u001a\u0014\u0010!\u001a\u00020\u0004*\u00020\u0004H\u0087\b\u00a2\u0006\u0004\b!\u0010\u001f\u001a\u0014\u0010\"\u001a\u00020\u0004*\u00020\u0004H\u0087\b\u00a2\u0006\u0004\b\"\u0010\u001f\u001a\u0014\u0010#\u001a\u00020\u0004*\u00020\u0004H\u0087\b\u00a2\u0006\u0004\b#\u0010\u001f\u001a\u0014\u0010$\u001a\u00020\u0004*\u00020\u0004H\u0087\b\u00a2\u0006\u0004\b$\u0010\u001f\u001a\u0014\u0010%\u001a\u00020\u0018*\u00020\u0004H\u0087\b\u00a2\u0006\u0004\b%\u0010\u001a\u001a\u001b\u0010%\u001a\u00020\u0018*\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH\u0007\u00a2\u0006\u0004\b%\u0010\u001d\u001a\u0014\u0010&\u001a\u00020\u0004*\u00020\u0004H\u0087\b\u00a2\u0006\u0004\b&\u0010\u001f\"\u0015\u0010*\u001a\u00020'*\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b(\u0010)\"\u0015\u0010.\u001a\u00020+*\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b,\u0010-\u00a8\u0006/"}, d2={"", "radix", "checkRadix", "(I)I", "", "char", "digitOf", "(CI)I", "", "isDefined", "(C)Z", "isDigit", "isHighSurrogate", "isISOControl", "isIdentifierIgnorable", "isJavaIdentifierPart", "isJavaIdentifierStart", "isLetter", "isLetterOrDigit", "isLowSurrogate", "isLowerCase", "isTitleCase", "isUpperCase", "isWhitespace", "", "lowercase", "(C)Ljava/lang/String;", "Ljava/util/Locale;", "locale", "(CLjava/util/Locale;)Ljava/lang/String;", "lowercaseChar", "(C)C", "titlecase", "titlecaseChar", "toLowerCase", "toTitleCase", "toUpperCase", "uppercase", "uppercaseChar", "Lkotlin/text/CharCategory;", "getCategory", "(C)Lkotlin/text/CharCategory;", "category", "Lkotlin/text/CharDirectionality;", "getDirectionality", "(C)Lkotlin/text/CharDirectionality;", "directionality", "kotlin-stdlib"}, xs="kotlin/text/CharsKt")
class CharsKt__CharJVMKt {
    @InlineOnly
    private static final boolean isDigit(char $this$isDigit) {
        return Character.isDigit($this$isDigit);
    }

    @InlineOnly
    private static final boolean isJavaIdentifierStart(char $this$isJavaIdentifierStart) {
        return Character.isJavaIdentifierStart($this$isJavaIdentifierStart);
    }

    @Deprecated(message="Use uppercaseChar() instead.", replaceWith=@ReplaceWith(expression="uppercaseChar()", imports={}))
    @DeprecatedSinceKotlin(warningSince="1.5")
    @InlineOnly
    private static final char toUpperCase(char $this$toUpperCase) {
        return Character.toUpperCase($this$toUpperCase);
    }

    @InlineOnly
    private static final boolean isLowerCase(char $this$isLowerCase) {
        return Character.isLowerCase($this$isLowerCase);
    }

    @InlineOnly
    private static final boolean isHighSurrogate(char $this$isHighSurrogate) {
        return Character.isHighSurrogate($this$isHighSurrogate);
    }

    @SinceKotlin(version="1.5")
    @InlineOnly
    @WasExperimental(markerClass={ExperimentalStdlibApi.class})
    private static final String lowercase(char $this$lowercase) {
        String string = String.valueOf($this$lowercase);
        Intrinsics.checkNotNull(string, "null cannot be cast to non-null type java.lang.String");
        String string2 = string.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(string2, "toLowerCase(...)");
        return string2;
    }

    @InlineOnly
    private static final boolean isTitleCase(char $this$isTitleCase) {
        return Character.isTitleCase($this$isTitleCase);
    }

    @InlineOnly
    private static final boolean isDefined(char $this$isDefined) {
        return Character.isDefined($this$isDefined);
    }

    @InlineOnly
    private static final boolean isLetter(char $this$isLetter) {
        return Character.isLetter($this$isLetter);
    }

    @SinceKotlin(version="1.5")
    @WasExperimental(markerClass={ExperimentalStdlibApi.class})
    @NotNull
    public static final String uppercase(char $this$uppercase, @NotNull Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        String string = String.valueOf($this$uppercase);
        Intrinsics.checkNotNull(string, "null cannot be cast to non-null type java.lang.String");
        String string2 = string.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(string2, "toUpperCase(...)");
        return string2;
    }

    @InlineOnly
    @WasExperimental(markerClass={ExperimentalStdlibApi.class})
    @SinceKotlin(version="1.5")
    private static final char uppercaseChar(char $this$uppercaseChar) {
        return Character.toUpperCase($this$uppercaseChar);
    }

    @InlineOnly
    private static final boolean isISOControl(char $this$isISOControl) {
        return Character.isISOControl($this$isISOControl);
    }

    @NotNull
    public static final CharDirectionality getDirectionality(char $this$directionality) {
        return CharDirectionality.Companion.valueOf(Character.getDirectionality($this$directionality));
    }

    @NotNull
    @SinceKotlin(version="1.5")
    @WasExperimental(markerClass={ExperimentalStdlibApi.class})
    public static final String lowercase(char $this$lowercase, @NotNull Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        String string = String.valueOf($this$lowercase);
        Intrinsics.checkNotNull(string, "null cannot be cast to non-null type java.lang.String");
        String string2 = string.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(string2, "toLowerCase(...)");
        return string2;
    }

    @InlineOnly
    private static final boolean isLetterOrDigit(char $this$isLetterOrDigit) {
        return Character.isLetterOrDigit($this$isLetterOrDigit);
    }

    @InlineOnly
    private static final boolean isIdentifierIgnorable(char $this$isIdentifierIgnorable) {
        return Character.isIdentifierIgnorable($this$isIdentifierIgnorable);
    }

    @InlineOnly
    @WasExperimental(markerClass={ExperimentalStdlibApi.class})
    @SinceKotlin(version="1.5")
    private static final char lowercaseChar(char $this$lowercaseChar) {
        return Character.toLowerCase($this$lowercaseChar);
    }

    @InlineOnly
    private static final boolean isJavaIdentifierPart(char $this$isJavaIdentifierPart) {
        return Character.isJavaIdentifierPart($this$isJavaIdentifierPart);
    }

    /*
     * WARNING - void declaration
     */
    @SinceKotlin(version="1.5")
    @NotNull
    @WasExperimental(markerClass={ExperimentalStdlibApi.class})
    public static final String titlecase(char $this$titlecase, @NotNull Locale locale) {
        char c;
        Intrinsics.checkNotNullParameter(locale, "locale");
        String localizedUppercase = CharsKt.uppercase($this$titlecase, locale);
        if (localizedUppercase.length() > 1) {
            String string;
            if ($this$titlecase == '\u0149') {
                string = localizedUppercase;
            } else {
                char c2 = localizedUppercase.charAt(0);
                String string2 = localizedUppercase;
                int n = 1;
                Intrinsics.checkNotNull(string2, "null cannot be cast to non-null type java.lang.String");
                String string3 = string2.substring(n);
                Intrinsics.checkNotNullExpressionValue(string3, "substring(...)");
                string2 = string3;
                Intrinsics.checkNotNull(string2, "null cannot be cast to non-null type java.lang.String");
                String string4 = string2.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(string4, "toLowerCase(...)");
                string2 = string4;
                string = c2 + string2;
            }
            return string;
        }
        String string = String.valueOf($this$titlecase);
        Intrinsics.checkNotNull(string, "null cannot be cast to non-null type java.lang.String");
        String string5 = string.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(string5, "toUpperCase(...)");
        if (!Intrinsics.areEqual(localizedUppercase, string5)) {
            void var2_2;
            return var2_2;
        }
        return String.valueOf(Character.toTitleCase(c));
    }

    @InlineOnly
    private static final boolean isUpperCase(char $this$isUpperCase) {
        return Character.isUpperCase($this$isUpperCase);
    }

    public static final int digitOf(char c, int radix) {
        return Character.digit((int)c, radix);
    }

    @DeprecatedSinceKotlin(warningSince="1.5")
    @Deprecated(message="Use titlecaseChar() instead.", replaceWith=@ReplaceWith(expression="titlecaseChar()", imports={}))
    @InlineOnly
    private static final char toTitleCase(char $this$toTitleCase) {
        return Character.toTitleCase($this$toTitleCase);
    }

    @Deprecated(message="Use lowercaseChar() instead.", replaceWith=@ReplaceWith(expression="lowercaseChar()", imports={}))
    @DeprecatedSinceKotlin(warningSince="1.5")
    @InlineOnly
    private static final char toLowerCase(char $this$toLowerCase) {
        return Character.toLowerCase($this$toLowerCase);
    }

    public static final boolean isWhitespace(char $this$isWhitespace) {
        return Character.isWhitespace($this$isWhitespace) || Character.isSpaceChar($this$isWhitespace);
    }

    @InlineOnly
    private static final boolean isLowSurrogate(char $this$isLowSurrogate) {
        return Character.isLowSurrogate($this$isLowSurrogate);
    }

    @PublishedApi
    public static final int checkRadix(int radix) {
        int n;
        if (!new IntRange(2, 36).contains(radix)) {
            throw new IllegalArgumentException("radix " + radix + " was not in valid range " + new IntRange(2, 36));
        }
        return n;
    }

    @NotNull
    public static final CharCategory getCategory(char $this$category) {
        return CharCategory.Companion.valueOf(Character.getType($this$category));
    }

    @SinceKotlin(version="1.5")
    @WasExperimental(markerClass={ExperimentalStdlibApi.class})
    @InlineOnly
    private static final char titlecaseChar(char $this$titlecaseChar) {
        return Character.toTitleCase($this$titlecaseChar);
    }

    @WasExperimental(markerClass={ExperimentalStdlibApi.class})
    @InlineOnly
    @SinceKotlin(version="1.5")
    private static final String uppercase(char $this$uppercase) {
        String string = String.valueOf($this$uppercase);
        Intrinsics.checkNotNull(string, "null cannot be cast to non-null type java.lang.String");
        String string2 = string.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(string2, "toUpperCase(...)");
        return string2;
    }
}

