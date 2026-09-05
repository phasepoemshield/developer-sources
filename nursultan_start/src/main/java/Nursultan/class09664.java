/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public final class class09664
extends Enum<class09664> {
    public static final /* enum */ class09664 NORMAL = new class09664(0);
    public static final /* enum */ class09664 INVERTED = new class09664(1);
    public static final /* enum */ class09664 INVENTORY_POSITION_AWARE = new class09664(2);
    public static final /* enum */ class09664 INVENTORY_POSITION_AWARE_INVERTED = new class09664(3);
    private final int id;
    private static final /* synthetic */ class09664[] $VALUES;

    public boolean L() {
        return this == INVENTORY_POSITION_AWARE || this == INVENTORY_POSITION_AWARE_INVERTED;
    }

    private class09664(int n2) {
        this.id = n2;
    }

    static {
        $VALUES = class09664.u();
    }

    public static class09664[] values() {
        return (class09664[])$VALUES.clone();
    }

    public static class09664 valueOf(String string) {
        return Enum.valueOf(class09664.class, string);
    }

    private static /* synthetic */ class09664[] u() {
        return new class09664[]{NORMAL, INVERTED, INVENTORY_POSITION_AWARE, INVENTORY_POSITION_AWARE_INVERTED};
    }

    public boolean y() {
        return this == INVERTED || this == INVENTORY_POSITION_AWARE_INVERTED;
    }

    public static class09664 N(int n) {
        if (n == class09664.NORMAL.id) {
            return NORMAL;
        }
        if (n == class09664.INVERTED.id) {
            return INVERTED;
        }
        if (n == class09664.INVENTORY_POSITION_AWARE.id) {
            return INVENTORY_POSITION_AWARE;
        }
        return INVENTORY_POSITION_AWARE_INVERTED;
    }

    public int N() {
        return this.id;
    }
}

