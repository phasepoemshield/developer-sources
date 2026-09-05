/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

public final class class08537
extends Enum<class08537> {
    public static final /* enum */ class08537 field_57087 = new class08537("classic", "");
    public static final /* enum */ class08537 field_57088 = new class08537("puglin", "_puglin");
    public static final /* enum */ class08537 field_57089 = new class08537("sad", "_sad");
    public static final /* enum */ class08537 field_57090 = new class08537("angry", "_angry");
    public static final /* enum */ class08537 field_57091 = new class08537("grumpy", "_grumpy");
    public static final /* enum */ class08537 field_57092 = new class08537("big", "_big");
    public static final /* enum */ class08537 field_57093 = new class08537("cute", "_cute");
    private final String field_57094;
    private final String field_57095;
    private static final /* synthetic */ class08537[] field_57096;

    private static /* synthetic */ class08537[] L() {
        return new class08537[]{field_57087, field_57088, field_57089, field_57090, field_57091, field_57092, field_57093};
    }

    private class08537(String string2, String string3) {
        this.field_57094 = string2;
        this.field_57095 = string3;
    }

    public static class08537[] values() {
        return (class08537[])field_57096.clone();
    }

    public static class08537 valueOf(String string) {
        return Enum.valueOf(class08537.class, string);
    }

    public String y() {
        return this.field_57095;
    }

    public String N() {
        return this.field_57094;
    }

    static {
        field_57096 = class08537.L();
    }
}

