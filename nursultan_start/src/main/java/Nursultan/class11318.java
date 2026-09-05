/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public class class11318
extends Enum<class11318> {
    public static final /* enum */ class11318 LIST;
    public static final /* enum */ class11318 CREATE;
    public static final /* enum */ class11318 DELETE;
    public static final /* enum */ class11318 REFRESH;
    private static final /* synthetic */ class11318[] $VALUES;

    private static void L() {
    }

    static {
        class11318.L();
        LIST = new class11318();
        CREATE = new class11318();
        DELETE = new class11318();
        REFRESH = new class11318();
        $VALUES = class11318.u();
    }

    public static class11318[] values() {
        return (class11318[])$VALUES.clone();
    }

    public static class11318 valueOf(String string) {
        return Enum.valueOf(class11318.class, string);
    }

    private static /* synthetic */ class11318[] u() {
        return new class11318[]{LIST, CREATE, DELETE, REFRESH};
    }
}

