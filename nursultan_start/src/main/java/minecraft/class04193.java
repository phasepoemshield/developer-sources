/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 */
package minecraft;

public final class class04193
extends Enum<class04193> {
    public static final /* enum */ class04193 field_44974 = new class04193();
    public static final /* enum */ class04193 field_44975 = new class04193();
    public static final /* enum */ class04193 field_48227 = new class04193();
    private static final int field_44976 = 1;
    private static final int field_44977 = 2;
    private static final int field_48228 = 3;
    private static final /* synthetic */ class04193[] field_44978;

    static {
        field_44978 = class04193.y();
    }

    public static class04193[] values() {
        return (class04193[])field_44978.clone();
    }

    public static class04193 valueOf(String string) {
        return Enum.valueOf(class04193.class, string);
    }

    private static /* synthetic */ class04193[] y() {
        return new class04193[]{field_44974, field_44975, field_48227};
    }

    public int N() {
        return switch (this.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> 1;
            case 1 -> 2;
            case 2 -> 3;
        };
    }

    public static class04193 N(int n) {
        return switch (n) {
            case 1 -> field_44974;
            case 2 -> field_44975;
            case 3 -> field_48227;
            default -> throw new IllegalArgumentException("Unknown connection intent: " + n);
        };
    }
}

