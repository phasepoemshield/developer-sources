/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

public final class class02111
extends Enum<class02111> {
    public static final /* enum */ class02111 field_41777 = new class02111();
    public static final /* enum */ class02111 field_41778 = new class02111();
    public static final /* enum */ class02111 field_43097 = new class02111();
    public static final /* enum */ class02111 field_41780 = new class02111();
    private static final /* synthetic */ class02111[] field_41781;

    private static /* synthetic */ class02111[] L() {
        return new class02111[]{field_41777, field_41778, field_43097, field_41780};
    }

    public static class02111[] values() {
        return (class02111[])field_41781.clone();
    }

    public static class02111 valueOf(String string) {
        return Enum.valueOf(class02111.class, string);
    }

    public boolean y() {
        return this == field_43097 || this == field_41780;
    }

    public boolean N() {
        return this == field_41778;
    }

    static {
        field_41781 = class02111.L();
    }
}

