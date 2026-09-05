/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

public final class class04218
extends Enum<class04218> {
    public static final /* enum */ class04218 field_41283 = new class04218();
    public static final /* enum */ class04218 field_41284 = new class04218();
    private static final /* synthetic */ class04218[] field_41285;

    static {
        field_41285 = class04218.y();
    }

    public static class04218[] values() {
        return (class04218[])field_41285.clone();
    }

    public static class04218 valueOf(String string) {
        return Enum.valueOf(class04218.class, string);
    }

    private static /* synthetic */ class04218[] y() {
        return new class04218[]{field_41283, field_41284};
    }

    public boolean N() {
        return this == field_41284;
    }
}

