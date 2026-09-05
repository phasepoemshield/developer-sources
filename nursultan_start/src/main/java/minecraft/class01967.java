/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

public final class class01967
extends Enum<class01967> {
    public static final /* enum */ class01967 field_46664 = new class01967(7);
    public static final /* enum */ class01967 field_46665 = new class01967(10);
    public final int field_46666;
    private static final /* synthetic */ class01967[] field_46667;

    private class01967(int n2) {
        this.field_46666 = n2;
    }

    static {
        field_46667 = class01967.N();
    }

    public static class01967[] values() {
        return (class01967[])field_46667.clone();
    }

    public static class01967 valueOf(String string) {
        return Enum.valueOf(class01967.class, string);
    }

    private static /* synthetic */ class01967[] N() {
        return new class01967[]{field_46664, field_46665};
    }
}

