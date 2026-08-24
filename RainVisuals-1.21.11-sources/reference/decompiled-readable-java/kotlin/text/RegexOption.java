/*
 * Decompiled with CFR 0.152.
 */
package kotlin.text;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.FlagEnum;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u001b\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0005\u001a\u00020\u00038\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012\u00a8\u0006\u0013"}, d2={"Lkotlin/text/RegexOption;", "", "Lkotlin/text/FlagEnum;", "", "value", "mask", "<init>", "(Ljava/lang/String;III)V", "I", "getMask", "()I", "getValue", "IGNORE_CASE", "MULTILINE", "LITERAL", "UNIX_LINES", "COMMENTS", "DOT_MATCHES_ALL", "CANON_EQ", "kotlin-stdlib"})
public final class RegexOption
extends Enum<RegexOption>
implements FlagEnum {
    private final int mask;
    public static final /* enum */ RegexOption IGNORE_CASE = new RegexOption("IGNORE_CASE", 0, 2, 0, 2, null);
    private static final /* synthetic */ RegexOption[] $VALUES;
    public static final /* enum */ RegexOption MULTILINE = new RegexOption("MULTILINE", 1, 8, 0, 2, null);
    private static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* enum */ RegexOption COMMENTS;
    public static final /* enum */ RegexOption UNIX_LINES;
    public static final /* enum */ RegexOption LITERAL;
    private final int value;
    public static final /* enum */ RegexOption DOT_MATCHES_ALL;
    public static final /* enum */ RegexOption CANON_EQ;

    @Override
    public int getValue() {
        return this.value;
    }

    private static final /* synthetic */ RegexOption[] $values() {
        RegexOption[] regexOptionArray = new RegexOption[7];
        regexOptionArray[0] = IGNORE_CASE;
        regexOptionArray[1] = MULTILINE;
        regexOptionArray[2] = LITERAL;
        regexOptionArray[3] = UNIX_LINES;
        regexOptionArray[4] = COMMENTS;
        regexOptionArray[5] = DOT_MATCHES_ALL;
        regexOptionArray[6] = CANON_EQ;
        return regexOptionArray;
    }

    static {
        LITERAL = new RegexOption("LITERAL", 2, 16, 0, 2, null);
        UNIX_LINES = new RegexOption("UNIX_LINES", 3, 1, 0, 2, null);
        COMMENTS = new RegexOption("COMMENTS", 4, 4, 0, 2, null);
        DOT_MATCHES_ALL = new RegexOption("DOT_MATCHES_ALL", 5, 32, 0, 2, null);
        CANON_EQ = new RegexOption("CANON_EQ", 6, 128, 0, 2, null);
        $VALUES = RegexOption.$values();
        $ENTRIES = EnumEntriesKt.enumEntries((Enum[])$VALUES);
    }

    @Override
    public int getMask() {
        return this.mask;
    }

    public static RegexOption[] values() {
        return (RegexOption[])$VALUES.clone();
    }

    /* synthetic */ RegexOption(String string, int n, int n2, int n3, int n4, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n4 & 2) != 0) {
            n3 = n2;
        }
        this(n2, n3);
    }

    public static RegexOption valueOf(String value) {
        return Enum.valueOf(RegexOption.class, value);
    }

    @NotNull
    public static EnumEntries<RegexOption> getEntries() {
        return $ENTRIES;
    }

    private RegexOption(int value, int mask) {
        this.value = value;
        this.mask = mask;
    }
}

