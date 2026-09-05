/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public class class11964
extends Enum<class11964> {
    public static final /* enum */ class11964 SERVER_TO_CLIENT;
    public static final /* enum */ class11964 CLIENT_TO_SERVER;
    private static final /* synthetic */ class11964[] $VALUES;

    static {
        class11964.i();
        SERVER_TO_CLIENT = new class11964();
        CLIENT_TO_SERVER = new class11964();
        $VALUES = class11964.R();
    }

    public static class11964[] values() {
        return (class11964[])$VALUES.clone();
    }

    public static class11964 valueOf(String string) {
        return Enum.valueOf(class11964.class, string);
    }

    private static void i() {
    }

    private static /* synthetic */ class11964[] R() {
        return new class11964[]{SERVER_TO_CLIENT, CLIENT_TO_SERVER};
    }
}

