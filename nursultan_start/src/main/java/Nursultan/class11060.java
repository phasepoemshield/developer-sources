/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public class class11060
extends Enum<class11060> {
    public static final /* enum */ class11060 IDLE;
    public static final /* enum */ class11060 OUT;
    public static final /* enum */ class11060 RETURN;
    private static final /* synthetic */ class11060[] $VALUES;

    static {
        class11060.y();
        IDLE = new class11060();
        OUT = new class11060();
        RETURN = new class11060();
        $VALUES = class11060.u();
    }

    public static class11060[] values() {
        return (class11060[])$VALUES.clone();
    }

    public static class11060 valueOf(String string) {
        return Enum.valueOf(class11060.class, string);
    }

    private static /* synthetic */ class11060[] u() {
        return new class11060[]{IDLE, OUT, RETURN};
    }

    private static void y() {
    }
}

