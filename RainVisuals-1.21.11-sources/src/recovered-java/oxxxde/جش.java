/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

public final class \u062c\u0634
extends Enum<\u062c\u0634> {
    private static final /* synthetic */ \u062c\u0634[] $VALUES;
    public static final /* enum */ \u062c\u0634 REPEAT;
    public static final /* enum */ \u062c\u0634 DEFAULT;
    public final int id;

    static {
        DEFAULT = new \u062c\u0634(33071);
        REPEAT = new \u062c\u0634(10497);
        $VALUES = \u062c\u0634.$values();
    }

    public static \u062c\u0634[] values() {
        return (\u062c\u0634[])$VALUES.clone();
    }

    private \u062c\u0634(int id) {
        this.id = id;
    }

    public static \u062c\u0634 valueOf(String name) {
        return Enum.valueOf(\u062c\u0634.class, name);
    }

    private static /* synthetic */ \u062c\u0634[] $values() {
        \u062c\u0634[] \u062c\u0634Array = new \u062c\u0634[2];
        \u062c\u0634Array[0] = DEFAULT;
        \u062c\u0634Array[1] = REPEAT;
        return \u062c\u0634Array;
    }
}

