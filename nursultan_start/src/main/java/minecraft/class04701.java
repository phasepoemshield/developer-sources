/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import java.util.Locale;

public final class class04701
extends Enum<class04701> {
    public static final /* enum */ class04701 field_20200 = new class04701();
    public static final /* enum */ class04701 field_20201 = new class04701();
    public static final /* enum */ class04701 field_20202 = new class04701();
    public static final /* enum */ class04701 field_20203 = new class04701();
    private static final int field_32055 = 1024;
    private static final /* synthetic */ class04701[] field_20204;

    static {
        field_20204 = class04701.N();
    }

    public static class04701[] values() {
        return (class04701[])field_20204.clone();
    }

    public static class04701 valueOf(String string) {
        return Enum.valueOf(class04701.class, string);
    }

    public static String y(long l) {
        int n = 1024;
        if (l < 1024L) {
            return l + " B";
        }
        int n2 = (int)(Math.log(l) / Math.log(1024.0));
        String string = "" + "KMGTPE".charAt(n2 - 1);
        return String.format(Locale.ROOT, "%.1f %sB", (double)l / Math.pow(1024.0, n2), string);
    }

    public static String y(long l, class04701 class047012) {
        return String.format(Locale.ROOT, "%." + (class047012 == field_20203 ? "1" : "0") + "f %s", class04701.N(l, class047012), class047012.name());
    }

    public static double N(long l, class04701 class047012) {
        if (class047012 == field_20200) {
            return l;
        }
        return (double)l / Math.pow(1024.0, class047012.ordinal());
    }

    private static /* synthetic */ class04701[] N() {
        return new class04701[]{field_20200, field_20201, field_20202, field_20203};
    }

    public static class04701 N(long l) {
        if (l < 1024L) {
            return field_20200;
        }
        try {
            int n = (int)(Math.log(l) / Math.log(1024.0));
            return class04701.valueOf(String.valueOf("KMGTPE".charAt(n - 1)) + "B");
        }
        catch (Exception exception) {
            return field_20203;
        }
    }
}

