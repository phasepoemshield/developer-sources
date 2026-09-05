/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public final class class10029
extends Enum<class10029> {
    public static final /* enum */ class10029 NORMAL = new class10029();
    public static final /* enum */ class10029 HOVER = new class10029();
    public static final /* enum */ class10029 ACTIVE = new class10029();
    private static final /* synthetic */ class10029[] $VALUES;

    static {
        $VALUES = class10029.N();
    }

    public static class10029[] values() {
        return (class10029[])$VALUES.clone();
    }

    public static class10029 valueOf(String string) {
        return Enum.valueOf(class10029.class, string);
    }

    private static /* synthetic */ class10029[] N() {
        return new class10029[]{NORMAL, HOVER, ACTIVE};
    }
}

