/*
 * Decompiled with CFR 0.152.
 */
package com.mojang.blaze3d.vertex;

public final class VertexFormat$class_5596
extends Enum<VertexFormat$class_5596> {
    public static final /* enum */ VertexFormat$class_5596 field_27377 = new VertexFormat$class_5596(2, 2, false);
    public static final /* enum */ VertexFormat$class_5596 field_29344 = new VertexFormat$class_5596(2, 2, false);
    public static final /* enum */ VertexFormat$class_5596 field_29345 = new VertexFormat$class_5596(2, 1, true);
    public static final /* enum */ VertexFormat$class_5596 field_63316 = new VertexFormat$class_5596(1, 1, false);
    public static final /* enum */ VertexFormat$class_5596 field_27379 = new VertexFormat$class_5596(3, 3, false);
    public static final /* enum */ VertexFormat$class_5596 field_27380 = new VertexFormat$class_5596(3, 1, true);
    public static final /* enum */ VertexFormat$class_5596 field_27381 = new VertexFormat$class_5596(3, 1, true);
    public static final /* enum */ VertexFormat$class_5596 field_27382 = new VertexFormat$class_5596(4, 4, false);
    public final int field_27384;
    public final int field_27385;
    public final boolean field_38878;
    private static final /* synthetic */ VertexFormat$class_5596[] field_27386;

    private VertexFormat$class_5596(int n2, int n3, boolean bl) {
        this.field_27384 = n2;
        this.field_27385 = n3;
        this.field_38878 = bl;
    }

    public static VertexFormat$class_5596[] values() {
        return (VertexFormat$class_5596[])field_27386.clone();
    }

    public static VertexFormat$class_5596 valueOf(String string) {
        return Enum.valueOf(VertexFormat$class_5596.class, string);
    }

    public int method_31973(int n) {
        return switch (this.ordinal()) {
            case 1, 2, 3, 4, 5, 6 -> n;
            case 0, 7 -> n / 4 * 6;
            default -> 0;
        };
    }

    private static /* synthetic */ VertexFormat$class_5596[] method_36817() {
        return new VertexFormat$class_5596[]{field_27377, field_29344, field_29345, field_63316, field_27379, field_27380, field_27381, field_27382};
    }

    static {
        field_27386 = VertexFormat$class_5596.method_36817();
    }
}

