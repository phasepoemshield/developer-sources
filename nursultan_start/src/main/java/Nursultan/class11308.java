/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public class class11308
extends Enum<class11308> {
    public static final /* enum */ class11308 IDLE;
    public static final /* enum */ class11308 CREATED;
    public static final /* enum */ class11308 DELETED;
    public static final /* enum */ class11308 REFRESHED;
    public static final /* enum */ class11308 ERROR;
    private static final /* synthetic */ class11308[] $VALUES;

    private static void L() {
    }

    static {
        class11308.L();
        IDLE = new class11308();
        CREATED = new class11308();
        DELETED = new class11308();
        REFRESHED = new class11308();
        ERROR = new class11308();
        $VALUES = class11308.R();
    }

    public static class11308[] values() {
        return (class11308[])$VALUES.clone();
    }

    public static class11308 valueOf(String string) {
        return Enum.valueOf(class11308.class, string);
    }

    private static /* synthetic */ class11308[] R() {
        return new class11308[]{IDLE, CREATED, DELETED, REFRESHED, ERROR};
    }
}

