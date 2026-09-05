/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

final class class00150
extends Enum<class00150> {
    public static final /* enum */ class00150 field_58014 = new class00150();
    public static final /* enum */ class00150 field_58015 = new class00150();
    private static final /* synthetic */ class00150[] field_58016;

    public static class00150[] values() {
        return (class00150[])field_58016.clone();
    }

    public static class00150 valueOf(String string) {
        return Enum.valueOf(class00150.class, string);
    }

    private static /* synthetic */ class00150[] N() {
        return new class00150[]{field_58014, field_58015};
    }

    public void N(StringBuilder stringBuilder) {
        if (this == field_58015) {
            stringBuilder.append("-");
        }
    }

    static {
        field_58016 = class00150.N();
    }
}

