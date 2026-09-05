/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public class class11135
extends Enum<class11135> {
    public static final /* enum */ class11135 IDLE;
    public static final /* enum */ class11135 WAITING_FOR_ITEM;
    public static final /* enum */ class11135 WAITING_FOR_CLICK;
    public static final /* enum */ class11135 WAITING_FOR_CLOSE;
    private static final /* synthetic */ class11135[] $VALUES;

    static {
        class11135.i();
        IDLE = new class11135();
        WAITING_FOR_ITEM = new class11135();
        WAITING_FOR_CLICK = new class11135();
        WAITING_FOR_CLOSE = new class11135();
        $VALUES = class11135.u();
    }

    public static class11135[] values() {
        return (class11135[])$VALUES.clone();
    }

    public static class11135 valueOf(String string) {
        return Enum.valueOf(class11135.class, string);
    }

    private static void i() {
    }

    private static /* synthetic */ class11135[] u() {
        return new class11135[]{IDLE, WAITING_FOR_ITEM, WAITING_FOR_CLICK, WAITING_FOR_CLOSE};
    }
}

