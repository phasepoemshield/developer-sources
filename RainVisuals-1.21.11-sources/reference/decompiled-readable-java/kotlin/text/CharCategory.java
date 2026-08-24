/*
 * Decompiled with CFR 0.152.
 */
package kotlin.text;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000b\n\u0002\b(\b\u0086\u0081\u0002\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0013B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0086\u0002\u00a2\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1\u00a8\u00062"}, d2={"Lkotlin/text/CharCategory;", "", "", "value", "", "code", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "", "char", "", "contains", "(C)Z", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "I", "getValue", "()I", "Companion", "UNASSIGNED", "UPPERCASE_LETTER", "LOWERCASE_LETTER", "TITLECASE_LETTER", "MODIFIER_LETTER", "OTHER_LETTER", "NON_SPACING_MARK", "ENCLOSING_MARK", "COMBINING_SPACING_MARK", "DECIMAL_DIGIT_NUMBER", "LETTER_NUMBER", "OTHER_NUMBER", "SPACE_SEPARATOR", "LINE_SEPARATOR", "PARAGRAPH_SEPARATOR", "CONTROL", "FORMAT", "PRIVATE_USE", "SURROGATE", "DASH_PUNCTUATION", "START_PUNCTUATION", "END_PUNCTUATION", "CONNECTOR_PUNCTUATION", "OTHER_PUNCTUATION", "MATH_SYMBOL", "CURRENCY_SYMBOL", "MODIFIER_SYMBOL", "OTHER_SYMBOL", "INITIAL_QUOTE_PUNCTUATION", "FINAL_QUOTE_PUNCTUATION", "kotlin-stdlib"})
public final class CharCategory
extends Enum<CharCategory> {
    @NotNull
    public static final Companion Companion;
    public static final /* enum */ CharCategory SPACE_SEPARATOR;
    public static final /* enum */ CharCategory OTHER_PUNCTUATION;
    public static final /* enum */ CharCategory CURRENCY_SYMBOL;
    public static final /* enum */ CharCategory FORMAT;
    public static final /* enum */ CharCategory END_PUNCTUATION;
    public static final /* enum */ CharCategory START_PUNCTUATION;
    public static final /* enum */ CharCategory SURROGATE;
    public static final /* enum */ CharCategory CONNECTOR_PUNCTUATION;
    public static final /* enum */ CharCategory LETTER_NUMBER;
    @NotNull
    private final String code;
    public static final /* enum */ CharCategory MODIFIER_SYMBOL;
    public static final /* enum */ CharCategory DASH_PUNCTUATION;
    public static final /* enum */ CharCategory UNASSIGNED;
    public static final /* enum */ CharCategory INITIAL_QUOTE_PUNCTUATION;
    public static final /* enum */ CharCategory MODIFIER_LETTER;
    private static final /* synthetic */ CharCategory[] $VALUES;
    public static final /* enum */ CharCategory OTHER_LETTER;
    public static final /* enum */ CharCategory COMBINING_SPACING_MARK;
    public static final /* enum */ CharCategory OTHER_NUMBER;
    public static final /* enum */ CharCategory NON_SPACING_MARK;
    public static final /* enum */ CharCategory CONTROL;
    private final int value;
    public static final /* enum */ CharCategory ENCLOSING_MARK;
    public static final /* enum */ CharCategory UPPERCASE_LETTER;
    public static final /* enum */ CharCategory OTHER_SYMBOL;
    public static final /* enum */ CharCategory PARAGRAPH_SEPARATOR;
    public static final /* enum */ CharCategory TITLECASE_LETTER;
    public static final /* enum */ CharCategory LINE_SEPARATOR;
    public static final /* enum */ CharCategory LOWERCASE_LETTER;
    private static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* enum */ CharCategory FINAL_QUOTE_PUNCTUATION;
    public static final /* enum */ CharCategory DECIMAL_DIGIT_NUMBER;
    public static final /* enum */ CharCategory PRIVATE_USE;
    public static final /* enum */ CharCategory MATH_SYMBOL;

    public static CharCategory[] values() {
        return (CharCategory[])$VALUES.clone();
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    private CharCategory(int value, String code) {
        this.value = value;
        this.code = code;
    }

    static {
        UNASSIGNED = new CharCategory(0, "Cn");
        UPPERCASE_LETTER = new CharCategory(1, "Lu");
        LOWERCASE_LETTER = new CharCategory(2, "Ll");
        TITLECASE_LETTER = new CharCategory(3, "Lt");
        MODIFIER_LETTER = new CharCategory(4, "Lm");
        OTHER_LETTER = new CharCategory(5, "Lo");
        NON_SPACING_MARK = new CharCategory(6, "Mn");
        ENCLOSING_MARK = new CharCategory(7, "Me");
        COMBINING_SPACING_MARK = new CharCategory(8, "Mc");
        DECIMAL_DIGIT_NUMBER = new CharCategory(9, "Nd");
        LETTER_NUMBER = new CharCategory(10, "Nl");
        OTHER_NUMBER = new CharCategory(11, "No");
        SPACE_SEPARATOR = new CharCategory(12, "Zs");
        LINE_SEPARATOR = new CharCategory(13, "Zl");
        PARAGRAPH_SEPARATOR = new CharCategory(14, "Zp");
        CONTROL = new CharCategory(15, "Cc");
        FORMAT = new CharCategory(16, "Cf");
        PRIVATE_USE = new CharCategory(18, "Co");
        SURROGATE = new CharCategory(19, "Cs");
        DASH_PUNCTUATION = new CharCategory(20, "Pd");
        START_PUNCTUATION = new CharCategory(21, "Ps");
        END_PUNCTUATION = new CharCategory(22, "Pe");
        CONNECTOR_PUNCTUATION = new CharCategory(23, "Pc");
        OTHER_PUNCTUATION = new CharCategory(24, "Po");
        MATH_SYMBOL = new CharCategory(25, "Sm");
        CURRENCY_SYMBOL = new CharCategory(26, "Sc");
        MODIFIER_SYMBOL = new CharCategory(27, "Sk");
        OTHER_SYMBOL = new CharCategory(28, "So");
        INITIAL_QUOTE_PUNCTUATION = new CharCategory(29, "Pi");
        FINAL_QUOTE_PUNCTUATION = new CharCategory(30, "Pf");
        $VALUES = CharCategory.$values();
        $ENTRIES = EnumEntriesKt.enumEntries((Enum[])$VALUES);
        Companion = new Companion(null);
    }

    public final boolean contains(char c) {
        return Character.getType(c) == this.value;
    }

    public final int getValue() {
        return this.value;
    }

    public static CharCategory valueOf(String value) {
        return Enum.valueOf(CharCategory.class, value);
    }

    private static final /* synthetic */ CharCategory[] $values() {
        CharCategory[] charCategoryArray = new CharCategory[30];
        charCategoryArray[0] = UNASSIGNED;
        charCategoryArray[1] = UPPERCASE_LETTER;
        charCategoryArray[2] = LOWERCASE_LETTER;
        charCategoryArray[3] = TITLECASE_LETTER;
        charCategoryArray[4] = MODIFIER_LETTER;
        charCategoryArray[5] = OTHER_LETTER;
        charCategoryArray[6] = NON_SPACING_MARK;
        charCategoryArray[7] = ENCLOSING_MARK;
        charCategoryArray[8] = COMBINING_SPACING_MARK;
        charCategoryArray[9] = DECIMAL_DIGIT_NUMBER;
        charCategoryArray[10] = LETTER_NUMBER;
        charCategoryArray[11] = OTHER_NUMBER;
        charCategoryArray[12] = SPACE_SEPARATOR;
        charCategoryArray[13] = LINE_SEPARATOR;
        charCategoryArray[14] = PARAGRAPH_SEPARATOR;
        charCategoryArray[15] = CONTROL;
        charCategoryArray[16] = FORMAT;
        charCategoryArray[17] = PRIVATE_USE;
        charCategoryArray[18] = SURROGATE;
        charCategoryArray[19] = DASH_PUNCTUATION;
        charCategoryArray[20] = START_PUNCTUATION;
        charCategoryArray[21] = END_PUNCTUATION;
        charCategoryArray[22] = CONNECTOR_PUNCTUATION;
        charCategoryArray[23] = OTHER_PUNCTUATION;
        charCategoryArray[24] = MATH_SYMBOL;
        charCategoryArray[25] = CURRENCY_SYMBOL;
        charCategoryArray[26] = MODIFIER_SYMBOL;
        charCategoryArray[27] = OTHER_SYMBOL;
        charCategoryArray[28] = INITIAL_QUOTE_PUNCTUATION;
        charCategoryArray[29] = FINAL_QUOTE_PUNCTUATION;
        return charCategoryArray;
    }

    @NotNull
    public static EnumEntries<CharCategory> getEntries() {
        return $ENTRIES;
    }

    @Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2={"Lkotlin/text/CharCategory$Companion;", "", "<init>", "()V", "", "category", "Lkotlin/text/CharCategory;", "valueOf", "(I)Lkotlin/text/CharCategory;", "kotlin-stdlib"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final CharCategory valueOf(int category) {
            CharCategory charCategory;
            int n = category;
            if (new IntRange(0, 16).contains(n)) {
                charCategory = (CharCategory)((Object)CharCategory.getEntries().get(category));
            } else if (new IntRange(18, 30).contains(n)) {
                charCategory = (CharCategory)((Object)CharCategory.getEntries().get(category + -1));
            } else {
                throw new IllegalArgumentException("Category #" + category + " is not defined.");
            }
            return charCategory;
        }
    }
}

