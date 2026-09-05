/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

public final class class08419
extends Enum<class08419> {
    public static final /* enum */ class08419 field_60031 = new class08419("ubo");
    public static final /* enum */ class08419 field_60032 = new class08419("utb");
    final String field_56750;
    private static final /* synthetic */ class08419[] field_56751;

    private class08419(String string2) {
        this.field_56750 = string2;
    }

    public static class08419[] values() {
        return (class08419[])field_56751.clone();
    }

    public static class08419 valueOf(String string) {
        return Enum.valueOf(class08419.class, string);
    }

    private static /* synthetic */ class08419[] N() {
        return new class08419[]{field_60031, field_60032};
    }

    static {
        field_56751 = class08419.N();
    }
}

