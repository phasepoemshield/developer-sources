/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05033
 */
package minecraft;

import minecraft.class05033;

public final class class06662
extends Enum<class06662>
implements class05033 {
    public static final /* enum */ class06662 field_12469 = new class06662("none");
    public static final /* enum */ class06662 field_12466 = new class06662("small");
    public static final /* enum */ class06662 field_12468 = new class06662("large");
    private final String field_12467;
    private static final /* synthetic */ class06662[] field_12470;

    private class06662(String string2) {
        this.field_12467 = string2;
    }

    public String toString() {
        return this.field_12467;
    }

    public static class06662[] values() {
        return (class06662[])field_12470.clone();
    }

    public static class06662 valueOf(String string) {
        return Enum.valueOf(class06662.class, string);
    }

    private static /* synthetic */ class06662[] N() {
        return new class06662[]{field_12469, field_12466, field_12468};
    }

    public String method_15434() {
        return this.field_12467;
    }

    static {
        field_12470 = class06662.N();
    }
}

