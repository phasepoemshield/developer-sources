/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

public final class class05790
extends Enum<class05790> {
    public static final /* enum */ class05790 field_15873 = new class05790(1);
    public static final /* enum */ class05790 field_15870 = new class05790(-1);
    private final int field_15872;
    private static final /* synthetic */ class05790[] field_15871;

    private class05790(int n2) {
        this.field_15872 = n2;
    }

    static {
        field_15871 = class05790.y();
    }

    public static class05790[] values() {
        return (class05790[])field_15871.clone();
    }

    public static class05790 valueOf(String string) {
        return Enum.valueOf(class05790.class, string);
    }

    private static /* synthetic */ class05790[] y() {
        return new class05790[]{field_15873, field_15870};
    }

    public int N() {
        return this.field_15872;
    }
}

