/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

final class class09790
extends Enum<class09790> {
    public static final /* enum */ class09790 REUSE = new class09790();
    public static final /* enum */ class09790 INSERT = new class09790();
    private static final /* synthetic */ class09790[] $VALUES;

    static {
        $VALUES = class09790.N();
    }

    public static class09790[] values() {
        return (class09790[])$VALUES.clone();
    }

    public static class09790 valueOf(String string) {
        return Enum.valueOf(class09790.class, string);
    }

    private static /* synthetic */ class09790[] N() {
        return new class09790[]{REUSE, INSERT};
    }
}

