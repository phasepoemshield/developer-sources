/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

public final class class04993
extends Enum<class04993> {
    public static final /* enum */ class04993 field_44724 = new class04993("2");
    public static final /* enum */ class04993 field_44725 = new class04993("1");
    public static final /* enum */ class04993 field_44726 = new class04993("0");
    private final String field_44727;
    private static final /* synthetic */ class04993[] field_44728;

    private class04993(String string2) {
        this.field_44727 = string2;
    }

    static {
        field_44728 = class04993.y();
    }

    public static class04993[] values() {
        return (class04993[])field_44728.clone();
    }

    public static class04993 valueOf(String string) {
        return Enum.valueOf(class04993.class, string);
    }

    private static /* synthetic */ class04993[] y() {
        return new class04993[]{field_44724, field_44725, field_44726};
    }

    public String N() {
        return this.field_44727;
    }
}

