/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

final class class02297
extends Enum<class02297> {
    public static final /* enum */ class02297 field_48911 = new class02297(6);
    public static final /* enum */ class02297 field_48912 = new class02297(12);
    final int field_48913;
    private static final /* synthetic */ class02297[] field_48914;

    private class02297(int n2) {
        this.field_48913 = n2;
    }

    public static class02297[] values() {
        return (class02297[])field_48914.clone();
    }

    public static class02297 valueOf(String string) {
        return Enum.valueOf(class02297.class, string);
    }

    private static /* synthetic */ class02297[] N() {
        return new class02297[]{field_48911, field_48912};
    }

    static {
        field_48914 = class02297.N();
    }
}

