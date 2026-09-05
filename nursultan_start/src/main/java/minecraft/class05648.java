/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05033
 */
package minecraft;

import minecraft.class05033;

public final class class05648
extends Enum<class05648>
implements class05033 {
    public static final /* enum */ class05648 field_17098 = new class05648("floor");
    public static final /* enum */ class05648 field_17099 = new class05648("ceiling");
    public static final /* enum */ class05648 field_17100 = new class05648("single_wall");
    public static final /* enum */ class05648 field_17101 = new class05648("double_wall");
    private final String field_17102;
    private static final /* synthetic */ class05648[] field_17103;

    private class05648(String string2) {
        this.field_17102 = string2;
    }

    public static class05648[] values() {
        return (class05648[])field_17103.clone();
    }

    public static class05648 valueOf(String string) {
        return Enum.valueOf(class05648.class, string);
    }

    private static /* synthetic */ class05648[] N() {
        return new class05648[]{field_17098, field_17099, field_17100, field_17101};
    }

    public String method_15434() {
        return this.field_17102;
    }

    static {
        field_17103 = class05648.N();
    }
}

