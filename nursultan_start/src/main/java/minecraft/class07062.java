/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

public final class class07062
extends Enum<class07062> {
    public static final /* enum */ class07062 field_26998 = new class07062(true, false);
    public static final /* enum */ class07062 field_26999 = new class07062(true, false);
    public static final /* enum */ class07062 field_27000 = new class07062(false, true);
    public static final /* enum */ class07062 field_27001 = new class07062(false, false);
    public static final /* enum */ class07062 field_27002 = new class07062(false, false);
    private final boolean field_27003;
    private final boolean field_27004;
    private static final /* synthetic */ class07062[] field_27005;

    private static /* synthetic */ class07062[] L() {
        return new class07062[]{field_26998, field_26999, field_27000, field_27001, field_27002};
    }

    private class07062(boolean bl, boolean bl2) {
        this.field_27003 = bl;
        this.field_27004 = bl2;
    }

    static {
        field_27005 = class07062.L();
    }

    public static class07062[] values() {
        return (class07062[])field_27005.clone();
    }

    public static class07062 valueOf(String string) {
        return Enum.valueOf(class07062.class, string);
    }

    public boolean y() {
        return this.field_27004;
    }

    public boolean N() {
        return this.field_27003;
    }
}

