/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

final class class06402
extends Enum<class06402> {
    public static final /* enum */ class06402 field_13464 = new class06402(false, false);
    public static final /* enum */ class06402 field_13462 = new class06402(true, true);
    public static final /* enum */ class06402 field_13458 = new class06402(false, true);
    public static final /* enum */ class06402 field_13465 = new class06402(true, false);
    public static final /* enum */ class06402 field_13461 = new class06402(true, true);
    final boolean field_13460;
    final boolean field_13459;
    private static final /* synthetic */ class06402[] field_13463;

    private class06402(boolean bl, boolean bl2) {
        this.field_13460 = bl;
        this.field_13459 = bl2;
    }

    static {
        field_13463 = class06402.N();
    }

    public static class06402[] values() {
        return (class06402[])field_13463.clone();
    }

    public static class06402 valueOf(String string) {
        return Enum.valueOf(class06402.class, string);
    }

    private static /* synthetic */ class06402[] N() {
        return new class06402[]{field_13464, field_13462, field_13458, field_13465, field_13461};
    }
}

