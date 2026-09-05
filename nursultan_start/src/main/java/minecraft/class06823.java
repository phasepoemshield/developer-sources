/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

public final class class06823
extends Enum<class06823> {
    public static final /* enum */ class06823 field_21853 = new class06823("none");
    public static final /* enum */ class06823 field_21854 = new class06823("is_outline");
    public static final /* enum */ class06823 field_21855 = new class06823("affects_outline");
    private final String field_22243;
    private static final /* synthetic */ class06823[] field_21856;

    private class06823(String string2) {
        this.field_22243 = string2;
    }

    public String toString() {
        return this.field_22243;
    }

    public static class06823[] values() {
        return (class06823[])field_21856.clone();
    }

    public static class06823 valueOf(String string) {
        return Enum.valueOf(class06823.class, string);
    }

    private static /* synthetic */ class06823[] N() {
        return new class06823[]{field_21853, field_21854, field_21855};
    }

    static {
        field_21856 = class06823.N();
    }
}

