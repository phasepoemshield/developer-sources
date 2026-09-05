/*
 * Decompiled with CFR 0.152.
 */
package com.mojang.blaze3d.vertex;

public final class VertexFormat$class_5595
extends Enum<VertexFormat$class_5595> {
    public static final /* enum */ VertexFormat$class_5595 field_27372 = new VertexFormat$class_5595(2);
    public static final /* enum */ VertexFormat$class_5595 field_27373 = new VertexFormat$class_5595(4);
    public final int field_27375;
    private static final /* synthetic */ VertexFormat$class_5595[] field_27376;

    private VertexFormat$class_5595(int n2) {
        this.field_27375 = n2;
    }

    public static VertexFormat$class_5595[] values() {
        return (VertexFormat$class_5595[])field_27376.clone();
    }

    public static VertexFormat$class_5595 valueOf(String string) {
        return Enum.valueOf(VertexFormat$class_5595.class, string);
    }

    public static VertexFormat$class_5595 method_31972(int n) {
        if ((n & 0xFFFF0000) != 0) {
            return field_27373;
        }
        return field_27372;
    }

    private static /* synthetic */ VertexFormat$class_5595[] method_36816() {
        return new VertexFormat$class_5595[]{field_27372, field_27373};
    }

    static {
        field_27376 = VertexFormat$class_5595.method_36816();
    }
}

