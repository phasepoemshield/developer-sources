/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05033
 */
package minecraft;

import minecraft.class05033;

public final class class06082
extends Enum<class06082>
implements class05033 {
    public static final /* enum */ class06082 field_28718 = new class06082("none", true);
    public static final /* enum */ class06082 field_28719 = new class06082("unstable", false);
    public static final /* enum */ class06082 field_28720 = new class06082("partial", true);
    public static final /* enum */ class06082 field_28721 = new class06082("full", true);
    private final String field_28722;
    private final boolean field_28723;
    private static final /* synthetic */ class06082[] field_28724;

    private class06082(String string2, boolean bl) {
        this.field_28722 = string2;
        this.field_28723 = bl;
    }

    public static class06082[] values() {
        return (class06082[])field_28724.clone();
    }

    public static class06082 valueOf(String string) {
        return Enum.valueOf(class06082.class, string);
    }

    private static /* synthetic */ class06082[] y() {
        return new class06082[]{field_28718, field_28719, field_28720, field_28721};
    }

    public boolean N() {
        return this.field_28723;
    }

    public String method_15434() {
        return this.field_28722;
    }

    static {
        field_28724 = class06082.y();
    }
}

