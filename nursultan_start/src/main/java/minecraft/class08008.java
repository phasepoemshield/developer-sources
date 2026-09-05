/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package minecraft;

import com.mojang.serialization.Codec;

public final class class08008
extends Enum<class08008> {
    public static final /* enum */ class08008 field_7592 = new class08008();
    public static final /* enum */ class08008 field_7593 = new class08008();
    public static final /* enum */ class08008 field_7594 = new class08008();
    public static final Codec<class08008> field_56665;
    private static final /* synthetic */ class08008[] field_7591;

    static {
        field_7591 = class08008.N();
        field_56665 = Codec.BYTE.xmap(class08008::N, class080082 -> (byte)class080082.ordinal());
    }

    public static class08008[] values() {
        return (class08008[])field_7591.clone();
    }

    public static class08008 valueOf(String string) {
        return Enum.valueOf(class08008.class, string);
    }

    public static class08008 N(int n) {
        if (n < 0 || n > class08008.values().length) {
            n = 0;
        }
        return class08008.values()[n];
    }

    private static /* synthetic */ class08008[] N() {
        return new class08008[]{field_7592, field_7593, field_7594};
    }
}

