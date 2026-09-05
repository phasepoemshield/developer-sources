/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package minecraft;

import com.mojang.serialization.Codec;

public final class class00763
extends Enum<class00763> {
    public static final /* enum */ class00763 field_9315 = new class00763(-3);
    public static final /* enum */ class00763 field_9313 = new class00763(-2);
    public static final /* enum */ class00763 field_9310 = new class00763(-1);
    public static final /* enum */ class00763 field_9314 = new class00763(0);
    public static final /* enum */ class00763 field_9316 = new class00763(1);
    public static final /* enum */ class00763 field_9309 = new class00763(2);
    public static final /* enum */ class00763 field_9311 = new class00763(3);
    public static final Codec<class00763> field_56697;
    private final int field_9308;
    private static final /* synthetic */ class00763[] field_9312;

    private class00763(int n2) {
        this.field_9308 = n2;
    }

    static {
        field_9312 = class00763.y();
        field_56697 = Codec.INT.xmap(class00763::N, class00763::N);
    }

    public static class00763[] values() {
        return (class00763[])field_9312.clone();
    }

    public static class00763 valueOf(String string) {
        return Enum.valueOf(class00763.class, string);
    }

    private static /* synthetic */ class00763[] y() {
        return new class00763[]{field_9315, field_9313, field_9310, field_9314, field_9316, field_9309, field_9311};
    }

    public int N() {
        return this.field_9308;
    }

    public static class00763 N(int n) {
        for (class00763 class007632 : class00763.values()) {
            if (class007632.field_9308 != n) continue;
            return class007632;
        }
        if (n < class00763.field_9315.field_9308) {
            return field_9315;
        }
        return field_9311;
    }
}

