/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

public final class class07666
extends Enum<class07666> {
    public static final /* enum */ class07666 field_37262 = new class07666();
    public static final /* enum */ class07666 field_37263 = new class07666();
    public static final /* enum */ class07666 field_37264 = new class07666();
    private static final /* synthetic */ class07666[] field_37265;

    private static /* synthetic */ class07666[] L() {
        return new class07666[]{field_37262, field_37263, field_37264};
    }

    static {
        field_37265 = class07666.L();
    }

    public static class07666[] values() {
        return (class07666[])field_37265.clone();
    }

    public static class07666 valueOf(String string) {
        return Enum.valueOf(class07666.class, string);
    }

    public boolean y() {
        return this == field_37263 || this == field_37264;
    }

    public boolean N() {
        return this == field_37262 || this == field_37264;
    }
}

