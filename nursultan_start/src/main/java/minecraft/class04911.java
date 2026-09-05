/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

public final class class04911
extends Enum<class04911> {
    public static final /* enum */ class04911 field_15250 = new class04911("master");
    public static final /* enum */ class04911 field_15253 = new class04911("music");
    public static final /* enum */ class04911 field_15247 = new class04911("record");
    public static final /* enum */ class04911 field_15252 = new class04911("weather");
    public static final /* enum */ class04911 field_15245 = new class04911("block");
    public static final /* enum */ class04911 field_15251 = new class04911("hostile");
    public static final /* enum */ class04911 field_15254 = new class04911("neutral");
    public static final /* enum */ class04911 field_15248 = new class04911("player");
    public static final /* enum */ class04911 field_15256 = new class04911("ambient");
    public static final /* enum */ class04911 field_15246 = new class04911("voice");
    public static final /* enum */ class04911 field_61058 = new class04911("ui");
    private final String field_15249;
    private static final /* synthetic */ class04911[] field_15255;

    private class04911(String string2) {
        this.field_15249 = string2;
    }

    public static class04911[] values() {
        return (class04911[])field_15255.clone();
    }

    public static class04911 valueOf(String string) {
        return Enum.valueOf(class04911.class, string);
    }

    private static /* synthetic */ class04911[] y() {
        return new class04911[]{field_15250, field_15253, field_15247, field_15252, field_15245, field_15251, field_15254, field_15248, field_15256, field_15246, field_61058};
    }

    public String N() {
        return this.field_15249;
    }

    static {
        field_15255 = class04911.y();
    }
}

