/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

final class class08236
extends Enum<class08236> {
    public static final /* enum */ class08236 field_53906 = new class08236(4, 2, 1);
    public static final /* enum */ class08236 field_53907 = new class08236(4, 1, 2);
    public static final /* enum */ class08236 field_53908 = new class08236(2, 4, 1);
    public static final /* enum */ class08236 field_53909 = new class08236(1, 4, 2);
    public static final /* enum */ class08236 field_53910 = new class08236(2, 1, 4);
    public static final /* enum */ class08236 field_53911 = new class08236(1, 2, 4);
    final int field_53912;
    final int field_53913;
    final int field_53914;
    private static final /* synthetic */ class08236[] field_53915;

    private class08236(int n2, int n3, int n4) {
        this.field_53912 = n2;
        this.field_53913 = n3;
        this.field_53914 = n4;
    }

    static {
        field_53915 = class08236.N();
    }

    public static class08236[] values() {
        return (class08236[])field_53915.clone();
    }

    public static class08236 valueOf(String string) {
        return Enum.valueOf(class08236.class, string);
    }

    private static /* synthetic */ class08236[] N() {
        return new class08236[]{field_53906, field_53907, field_53908, field_53909, field_53910, field_53911};
    }

    public static class08236 N(int n, int n2, int n3) {
        if (n > n2 && n > n3) {
            if (n2 > n3) {
                return field_53906;
            }
            return field_53907;
        }
        if (n2 > n && n2 > n3) {
            if (n > n3) {
                return field_53908;
            }
            return field_53909;
        }
        if (n > n2) {
            return field_53910;
        }
        return field_53911;
    }
}

