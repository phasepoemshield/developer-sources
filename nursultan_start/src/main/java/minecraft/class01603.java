/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

public final class class01603
extends Enum<class01603> {
    public static final /* enum */ class01603 field_14188 = new class01603("assets");
    public static final /* enum */ class01603 field_14190 = new class01603("data");
    private final String field_14189;
    private static final /* synthetic */ class01603[] field_14191;

    private class01603(String string2) {
        this.field_14189 = string2;
    }

    public static class01603[] values() {
        return (class01603[])field_14191.clone();
    }

    public static class01603 valueOf(String string) {
        return Enum.valueOf(class01603.class, string);
    }

    private static /* synthetic */ class01603[] y() {
        return new class01603[]{field_14188, field_14190};
    }

    public String N() {
        return this.field_14189;
    }

    static {
        field_14191 = class01603.y();
    }
}

