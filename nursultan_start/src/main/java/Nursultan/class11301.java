/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public class class11301
extends Enum<class11301> {
    public static final /* enum */ class11301 LIST;
    public static final /* enum */ class11301 PULL;
    public static final /* enum */ class11301 PUSH;
    private static final /* synthetic */ class11301[] $VALUES;

    static {
        class11301.i();
        LIST = new class11301();
        PULL = new class11301();
        PUSH = new class11301();
        $VALUES = class11301.R();
    }

    public static class11301[] values() {
        return (class11301[])$VALUES.clone();
    }

    public static class11301 valueOf(String string) {
        return Enum.valueOf(class11301.class, string);
    }

    private static void i() {
    }

    private static /* synthetic */ class11301[] R() {
        return new class11301[]{LIST, PULL, PUSH};
    }
}

