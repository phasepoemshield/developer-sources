/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

public final class class07302
extends Enum<class07302> {
    public static final /* enum */ class07302 field_40878 = new class07302(false);
    public static final /* enum */ class07302 field_18687 = new class07302(true);
    public static final /* enum */ class07302 field_40879 = new class07302(true);
    public static final /* enum */ class07302 field_47331 = new class07302(false);
    private final boolean field_52613;
    private static final /* synthetic */ class07302[] field_18688;

    private class07302(boolean bl) {
        this.field_52613 = bl;
    }

    static {
        field_18688 = class07302.y();
    }

    public static class07302[] values() {
        return (class07302[])field_18688.clone();
    }

    public static class07302 valueOf(String string) {
        return Enum.valueOf(class07302.class, string);
    }

    private static /* synthetic */ class07302[] y() {
        return new class07302[]{field_40878, field_18687, field_40879, field_47331};
    }

    public boolean N() {
        return this.field_52613;
    }
}

