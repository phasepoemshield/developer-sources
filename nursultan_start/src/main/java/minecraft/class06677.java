/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05033
 */
package minecraft;

import minecraft.class05033;

public final class class06677
extends Enum<class06677>
implements class05033 {
    public static final /* enum */ class06677 field_12576 = new class06677("compare");
    public static final /* enum */ class06677 field_12578 = new class06677("subtract");
    private final String field_12577;
    private static final /* synthetic */ class06677[] field_12579;

    private class06677(String string2) {
        this.field_12577 = string2;
    }

    public String toString() {
        return this.field_12577;
    }

    public static class06677[] values() {
        return (class06677[])field_12579.clone();
    }

    public static class06677 valueOf(String string) {
        return Enum.valueOf(class06677.class, string);
    }

    private static /* synthetic */ class06677[] N() {
        return new class06677[]{field_12576, field_12578};
    }

    public String method_15434() {
        return this.field_12577;
    }

    static {
        field_12579 = class06677.N();
    }
}

