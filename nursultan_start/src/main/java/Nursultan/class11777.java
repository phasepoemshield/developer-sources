/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public class class11777
extends Enum<class11777> {
    public static final /* enum */ class11777 BEFORE_ALL;
    public static final /* enum */ class11777 BEFORE;
    public static final /* enum */ class11777 NOW;
    public static final /* enum */ class11777 AFTER;
    public static final /* enum */ class11777 AFTER_ALL;
    public static final /* enum */ class11777 LISTENER;
    private static final /* synthetic */ class11777[] $VALUES;
    public Integer fields_0d1998a71c0803f83aaed89a64f36d2f5_0;
    public boolean fields_0d1998a71c0803f83aaed89a64f36d2f5_init;

    private static /* synthetic */ class11777[] L() {
        return new class11777[]{BEFORE_ALL, BEFORE, NOW, AFTER, AFTER_ALL, LISTENER};
    }

    private class11777(int n2) {
        this.u();
        this.fields_0d1998a71c0803f83aaed89a64f36d2f5_0 = n2;
    }

    static {
        class11777.i();
        BEFORE_ALL = new class11777(200);
        BEFORE = new class11777(100);
        NOW = new class11777(0);
        AFTER = new class11777(-100);
        AFTER_ALL = new class11777(-200);
        LISTENER = new class11777(-999);
        $VALUES = class11777.L();
    }

    public static class11777[] values() {
        return (class11777[])$VALUES.clone();
    }

    public static class11777 valueOf(String string) {
        return Enum.valueOf(class11777.class, string);
    }

    private static void i() {
    }

    private void u() {
        if (!this.fields_0d1998a71c0803f83aaed89a64f36d2f5_init) {
            this.fields_0d1998a71c0803f83aaed89a64f36d2f5_init = true;
            this.fields_0d1998a71c0803f83aaed89a64f36d2f5_0 = 0;
        }
    }

    public int N() {
        return this.fields_0d1998a71c0803f83aaed89a64f36d2f5_0;
    }
}

