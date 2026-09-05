/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

public final class class01065
extends Enum<class01065> {
    public static final /* enum */ class01065 field_63850 = new class01065(false, false);
    public static final /* enum */ class01065 field_63851 = new class01065(true, false);
    public static final /* enum */ class01065 field_63852 = new class01065(true, true);
    public final boolean field_63853;
    public final boolean field_63854;
    private static final /* synthetic */ class01065[] field_63855;

    private class01065(boolean bl, boolean bl2) {
        this.field_63853 = bl;
        this.field_63854 = bl2;
    }

    public static class01065[] values() {
        return (class01065[])field_63855.clone();
    }

    public static class01065 valueOf(String string) {
        return Enum.valueOf(class01065.class, string);
    }

    private static /* synthetic */ class01065[] N() {
        return new class01065[]{field_63850, field_63851, field_63852};
    }

    public static class01065 N(boolean bl) {
        return bl ? field_63851 : field_63850;
    }

    static {
        field_63855 = class01065.N();
    }
}

