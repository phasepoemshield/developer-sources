/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

final class class06427
extends Enum<class06427> {
    public static final /* enum */ class06427 field_13497 = new class06427(true);
    public static final /* enum */ class06427 field_13500 = new class06427(true);
    public static final /* enum */ class06427 field_13499 = new class06427(false);
    private final boolean field_13498;
    private static final /* synthetic */ class06427[] field_13501;

    private class06427(boolean bl) {
        this.field_13498 = bl;
    }

    static {
        field_13501 = class06427.y();
    }

    public static class06427[] values() {
        return (class06427[])field_13501.clone();
    }

    public static class06427 valueOf(String string) {
        return Enum.valueOf(class06427.class, string);
    }

    private static /* synthetic */ class06427[] y() {
        return new class06427[]{field_13497, field_13500, field_13499};
    }

    public boolean N() {
        return this.field_13498;
    }
}

