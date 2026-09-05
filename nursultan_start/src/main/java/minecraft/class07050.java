/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import minecraft.class07085;

public final class class07050
extends Enum<class07050> {
    public static final /* enum */ class07050 field_5808 = new class07050();
    public static final /* enum */ class07050 field_5810 = new class07050();
    private static final /* synthetic */ class07050[] field_5809;

    static {
        field_5809 = class07050.y();
    }

    public static class07050[] values() {
        return (class07050[])field_5809.clone();
    }

    public static class07050 valueOf(String string) {
        return Enum.valueOf(class07050.class, string);
    }

    private static /* synthetic */ class07050[] y() {
        return new class07050[]{field_5808, field_5810};
    }

    public class07085 N() {
        return this == field_5808 ? class07085.field_6173 : class07085.field_6171;
    }
}

