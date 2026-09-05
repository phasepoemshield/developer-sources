/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05033
 */
package minecraft;

import minecraft.class05033;

public final class class06657
extends Enum<class06657>
implements class05033 {
    public static final /* enum */ class06657 field_12475 = new class06657("floor");
    public static final /* enum */ class06657 field_12471 = new class06657("wall");
    public static final /* enum */ class06657 field_12473 = new class06657("ceiling");
    private final String field_12472;
    private static final /* synthetic */ class06657[] field_12474;

    private class06657(String string2) {
        this.field_12472 = string2;
    }

    public static class06657[] values() {
        return (class06657[])field_12474.clone();
    }

    public static class06657 valueOf(String string) {
        return Enum.valueOf(class06657.class, string);
    }

    private static /* synthetic */ class06657[] N() {
        return new class06657[]{field_12475, field_12471, field_12473};
    }

    public String method_15434() {
        return this.field_12472;
    }

    static {
        field_12474 = class06657.N();
    }
}

