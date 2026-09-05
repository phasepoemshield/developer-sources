/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public class class11737
extends Enum<class11737> {
    public static final /* enum */ class11737 LOADING;
    public static final /* enum */ class11737 READY;
    public static final /* enum */ class11737 FAILED;
    private static final /* synthetic */ class11737[] $VALUES;

    static {
        class11737.N();
        LOADING = new class11737();
        READY = new class11737();
        FAILED = new class11737();
        $VALUES = class11737.u();
    }

    public static class11737[] values() {
        return (class11737[])$VALUES.clone();
    }

    public static class11737 valueOf(String string) {
        return Enum.valueOf(class11737.class, string);
    }

    private static /* synthetic */ class11737[] u() {
        return new class11737[]{LOADING, READY, FAILED};
    }

    private static void N() {
    }
}

