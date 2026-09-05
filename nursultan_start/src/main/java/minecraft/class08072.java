/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

public final class class08072
extends Enum<class08072> {
    public static final /* enum */ class08072 field_12754 = new class08072(4259712);
    public static final /* enum */ class08072 field_12756 = new class08072(0xFF3030);
    public static final /* enum */ class08072 field_12753 = new class08072(2138367);
    private final int field_12755;
    private static final /* synthetic */ class08072[] field_12752;

    private class08072(int n2) {
        this.field_12755 = n2;
    }

    static {
        field_12752 = class08072.y();
    }

    public static class08072[] values() {
        return (class08072[])field_12752.clone();
    }

    public static class08072 valueOf(String string) {
        return Enum.valueOf(class08072.class, string);
    }

    private static /* synthetic */ class08072[] y() {
        return new class08072[]{field_12754, field_12756, field_12753};
    }

    public int N() {
        return this.field_12755;
    }
}

