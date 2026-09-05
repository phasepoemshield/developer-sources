/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05033
 */
package minecraft;

import minecraft.class05033;

public final class class06637
extends Enum<class06637>
implements class05033 {
    public static final /* enum */ class06637 field_12560 = new class06637("head");
    public static final /* enum */ class06637 field_12557 = new class06637("foot");
    private final String field_12559;
    private static final /* synthetic */ class06637[] field_12558;

    private class06637(String string2) {
        this.field_12559 = string2;
    }

    public String toString() {
        return this.field_12559;
    }

    public static class06637[] values() {
        return (class06637[])field_12558.clone();
    }

    public static class06637 valueOf(String string) {
        return Enum.valueOf(class06637.class, string);
    }

    private static /* synthetic */ class06637[] N() {
        return new class06637[]{field_12560, field_12557};
    }

    public String method_15434() {
        return this.field_12559;
    }

    static {
        field_12558 = class06637.N();
    }
}

