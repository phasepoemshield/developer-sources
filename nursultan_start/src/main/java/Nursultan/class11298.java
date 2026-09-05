/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public class class11298
extends Enum<class11298> {
    public static final /* enum */ class11298 CREATE;
    public static final /* enum */ class11298 UPDATE;
    public static final /* enum */ class11298 DELETE;
    public static final /* enum */ class11298 RENAME;
    public static final /* enum */ class11298 LOAD;
    private static final /* synthetic */ class11298[] $VALUES;

    private static /* synthetic */ class11298[] L() {
        return new class11298[]{CREATE, UPDATE, DELETE, RENAME, LOAD};
    }

    static {
        class11298.i();
        CREATE = new class11298();
        UPDATE = new class11298();
        DELETE = new class11298();
        RENAME = new class11298();
        LOAD = new class11298();
        $VALUES = class11298.L();
    }

    public static class11298[] values() {
        return (class11298[])$VALUES.clone();
    }

    public static class11298 valueOf(String string) {
        return Enum.valueOf(class11298.class, string);
    }

    private static void i() {
    }
}

