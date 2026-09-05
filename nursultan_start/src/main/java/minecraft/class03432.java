/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

public final class class03432
extends Enum<class03432> {
    public static final /* enum */ class03432 field_33784 = new class03432();
    public static final /* enum */ class03432 field_33785 = new class03432();
    public static final /* enum */ class03432 field_33786 = new class03432();
    private static final /* synthetic */ class03432[] field_33787;

    public static class03432[] values() {
        return (class03432[])field_33787.clone();
    }

    public static class03432 valueOf(String string) {
        return Enum.valueOf(class03432.class, string);
    }

    private static /* synthetic */ class03432[] y() {
        return new class03432[]{field_33784, field_33785, field_33786};
    }

    public boolean N() {
        return this == field_33786;
    }

    static {
        field_33787 = class03432.y();
    }
}

