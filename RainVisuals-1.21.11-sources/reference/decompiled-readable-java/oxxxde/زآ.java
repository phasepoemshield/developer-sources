/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

public final class \u0632\u0622
extends Enum<\u0632\u0622> {
    public static final /* enum */ \u0632\u0622 DEFAULT = new \u0632\u0622(9728);
    public static final /* enum */ \u0632\u0622 SMOOTH = new \u0632\u0622(9729);
    private static final /* synthetic */ \u0632\u0622[] $VALUES;
    public final int id;

    public static \u0632\u0622 valueOf(String name) {
        return Enum.valueOf(\u0632\u0622.class, name);
    }

    private static /* synthetic */ \u0632\u0622[] $values() {
        \u0632\u0622[] \u0632\u0622Array = new \u0632\u0622[2];
        \u0632\u0622Array[0] = DEFAULT;
        \u0632\u0622Array[1] = SMOOTH;
        return \u0632\u0622Array;
    }

    static {
        $VALUES = \u0632\u0622.$values();
    }

    private \u0632\u0622(int id) {
        this.id = id;
    }

    public static \u0632\u0622[] values() {
        return (\u0632\u0622[])$VALUES.clone();
    }
}

