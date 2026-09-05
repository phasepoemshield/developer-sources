/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

public final class class07065
extends Enum<class07065> {
    public static final /* enum */ class07065 field_28630 = new class07065(false, false);
    public static final /* enum */ class07065 field_28631 = new class07065(true, false);
    public static final /* enum */ class07065 field_28632 = new class07065(false, true);
    public static final /* enum */ class07065 field_28633 = new class07065(true, true);
    final boolean field_28634;
    final boolean field_28635;
    private static final /* synthetic */ class07065[] field_28636;

    public boolean L() {
        return this.field_28634;
    }

    private class07065(boolean bl, boolean bl2) {
        this.field_28634 = bl;
        this.field_28635 = bl2;
    }

    static {
        field_28636 = class07065.u();
    }

    public static class07065[] values() {
        return (class07065[])field_28636.clone();
    }

    public static class07065 valueOf(String string) {
        return Enum.valueOf(class07065.class, string);
    }

    private static /* synthetic */ class07065[] u() {
        return new class07065[]{field_28630, field_28631, field_28632, field_28633};
    }

    public boolean y() {
        return this.field_28635;
    }

    public boolean N() {
        return this.field_28635 || this.field_28634;
    }
}

