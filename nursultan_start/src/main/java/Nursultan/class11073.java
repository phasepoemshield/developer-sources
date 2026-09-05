/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public class class11073
extends Enum<class11073> {
    public static final /* enum */ class11073 IDLE;
    public static final /* enum */ class11073 RELEASE;
    public static final /* enum */ class11073 FLICK;
    private static final /* synthetic */ class11073[] $VALUES;

    private static /* synthetic */ class11073[] L() {
        return new class11073[]{IDLE, RELEASE, FLICK};
    }

    static {
        class11073.i();
        IDLE = new class11073();
        RELEASE = new class11073();
        FLICK = new class11073();
        $VALUES = class11073.L();
    }

    public static class11073[] values() {
        return (class11073[])$VALUES.clone();
    }

    public static class11073 valueOf(String string) {
        return Enum.valueOf(class11073.class, string);
    }

    private static void i() {
    }
}

