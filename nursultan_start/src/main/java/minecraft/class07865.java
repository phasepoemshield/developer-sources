/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

public final class class07865
extends Enum<class07865> {
    public static final /* enum */ class07865 field_41574 = new class07865(0);
    public static final /* enum */ class07865 field_41575 = new class07865(1);
    final int field_41576;
    private static final /* synthetic */ class07865[] field_41577;

    private class07865(int n2) {
        this.field_41576 = n2;
    }

    public static class07865[] values() {
        return (class07865[])field_41577.clone();
    }

    public static class07865 valueOf(String string) {
        return Enum.valueOf(class07865.class, string);
    }

    private static /* synthetic */ class07865[] N() {
        return new class07865[]{field_41574, field_41575};
    }

    static {
        field_41577 = class07865.N();
    }
}

