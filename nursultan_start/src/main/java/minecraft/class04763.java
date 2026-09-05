/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

public final class class04763
extends Enum<class04763> {
    public static final /* enum */ class04763 field_19334 = new class04763();
    public static final /* enum */ class04763 field_44855 = new class04763();
    public static final /* enum */ class04763 field_44856 = new class04763();
    public static final /* enum */ class04763 field_13877 = new class04763();
    private static final /* synthetic */ class04763[] field_13878;

    static {
        field_13878 = class04763.N();
    }

    public static class04763[] values() {
        return (class04763[])field_13878.clone();
    }

    public static class04763 valueOf(String string) {
        return Enum.valueOf(class04763.class, string);
    }

    private static /* synthetic */ class04763[] N() {
        return new class04763[]{field_19334, field_44855, field_44856, field_13877};
    }

    public boolean N(class04763 class047632) {
        return this.ordinal() >= class047632.ordinal();
    }
}

