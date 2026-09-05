/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05033
 */
package minecraft;

import minecraft.class05033;

public final class class06008
extends Enum<class06008>
implements class05033 {
    public static final /* enum */ class06008 field_22178 = new class06008("none");
    public static final /* enum */ class06008 field_22179 = new class06008("low");
    public static final /* enum */ class06008 field_22180 = new class06008("tall");
    private final String field_22181;
    private static final /* synthetic */ class06008[] field_22182;

    private class06008(String string2) {
        this.field_22181 = string2;
    }

    public String toString() {
        return this.method_15434();
    }

    public static class06008[] values() {
        return (class06008[])field_22182.clone();
    }

    public static class06008 valueOf(String string) {
        return Enum.valueOf(class06008.class, string);
    }

    private static /* synthetic */ class06008[] N() {
        return new class06008[]{field_22178, field_22179, field_22180};
    }

    public String method_15434() {
        return this.field_22181;
    }

    static {
        field_22182 = class06008.N();
    }
}

