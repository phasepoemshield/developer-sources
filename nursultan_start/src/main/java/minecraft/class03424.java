/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

public final class class03424
extends Enum<class03424> {
    public static final /* enum */ class03424 field_33702 = new class03424("initial");
    public static final /* enum */ class03424 field_33703 = new class03424("manual");
    public static final /* enum */ class03424 field_33704 = new class03424("unknown");
    final String field_33705;
    private static final /* synthetic */ class03424[] field_33706;

    private class03424(String string2) {
        this.field_33705 = string2;
    }

    public static class03424[] values() {
        return (class03424[])field_33706.clone();
    }

    public static class03424 valueOf(String string) {
        return Enum.valueOf(class03424.class, string);
    }

    private static /* synthetic */ class03424[] N() {
        return new class03424[]{field_33702, field_33703, field_33704};
    }

    static {
        field_33706 = class03424.N();
    }
}

