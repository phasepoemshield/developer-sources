/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

public final class class07671
extends Enum<class07671> {
    public static final /* enum */ class07671 field_25419 = new class07671(true, true);
    public static final /* enum */ class07671 field_25420 = new class07671(false, true);
    public static final /* enum */ class07671 field_25421 = new class07671(true, false);
    public final boolean field_25422;
    public final boolean field_25423;
    private static final /* synthetic */ class07671[] field_25424;

    private class07671(boolean bl, boolean bl2) {
        this.field_25422 = bl;
        this.field_25423 = bl2;
    }

    static {
        field_25424 = class07671.N();
    }

    public static class07671[] values() {
        return (class07671[])field_25424.clone();
    }

    public static class07671 valueOf(String string) {
        return Enum.valueOf(class07671.class, string);
    }

    private static /* synthetic */ class07671[] N() {
        return new class07671[]{field_25419, field_25420, field_25421};
    }
}

